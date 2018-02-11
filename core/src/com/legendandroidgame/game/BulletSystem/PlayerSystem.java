package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.*;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

    /**
     * Created by Patrick on 9/4/2017.
     */
    public class PlayerSystem extends EntitySystem implements EntityListener {

        private Entity player;
        private CharacterComponent characterComponent;
        public PlayerComponent playerComponent;
        private ModelComponent modelComponent;
        private final Vector3 tmp = new Vector3();
        private final OrthographicCamera camera;
        private final Vector2 mover;
        private float transX, transY, transZ, rotateX, rotateY, rotateZ, angle;
        private Controller controller;
        private ActualGameButtons actualGameButtons;
        public AnimationComponent playerAnimation;
        private float cameraX, cameraY, cameraZ;
        private float posX, posY, posZ, moverX, moverY;
        private String current = gameData.getString("current");
        private boolean paused;
        private Vector3 expected;


    public PlayerSystem(OrthographicCamera camera, Controller controller,
                        ActualGameButtons actualGameButtons, float posX, float posZ, Vector2 mover) {
        this.camera = camera;
        this.controller = controller;
        this.actualGameButtons = actualGameButtons;
        this.posX = posX;
        posY = 10;
        this.posZ = posZ;
        this.mover = mover;
        this.moverX = mover.x;
        this.moverY = mover.y;
        cameraX = camera.position.x;
        cameraY = camera.position.y;
        cameraZ = camera.position.z;
        rotateX = 0;
        rotateY = -45;
        rotateZ = 0;
        angle = 90;
        expected = new Vector3();
    }
    @Override
    public void addedToEngine(Engine engine) {
        engine.addEntityListener(Family.all(PlayerComponent.class).get(), this);
    }
    @Override
    public void update(float delta) {
        if (player == null) return;

        if(gameData.getString("isPaused").equals("true")){
            paused = true;
//            playerAnimation.animate("Armature|Stand",1,1);
        }
        else if(gameData.getString("isPaused").equals("false")){
            paused = false;
//            playerAnimation.animate("Armature|Stand",1,1);

        }

        updateMovement(delta);
    }
    private void updateMovement(float delta) {

        tmp.set(0, 0, 0);
        characterComponent.characterDirection.set(  0, 0, 0).rot(modelComponent.instance.transform).nor();
        characterComponent.walkDirection.set(0, 0, 0);

        if(!paused){

            if (Gdx.input.isKeyPressed(Input.Keys.W) || controller.isUpPressed() || Gdx.input.isKeyPressed(Input.Keys.UP)){
                rotateX = 0;
                rotateY = 45;
                rotateZ = 0;
                angle = 90;
                if(Gdx.input.isKeyPressed(Input.Keys.SPACE) || actualGameButtons.isRunPressed()){
                    characterComponent.walkDirection.x = 10;
                }
                else {
                    characterComponent.walkDirection.x = 0.5f;
                }
                playerAnimation.animate("Armature|Walk",-1,1);
            }

            else if (Gdx.input.isKeyPressed(Input.Keys.S) || controller.isDownPressed() || Gdx.input.isKeyPressed(Input.Keys.DOWN)){
                rotateX = 0;
                rotateY = -45;
                rotateZ = 0;
                angle = 90;
                if(Gdx.input.isKeyPressed(Input.Keys.SPACE) || actualGameButtons.isRunPressed()){
                    characterComponent.walkDirection.x = -10;
                }
                else {
                    characterComponent.walkDirection.x = -0.5f;
                }
                playerAnimation.animate("Armature|Walk",-1,1);

            }

            else if (Gdx.input.isKeyPressed(Input.Keys.A) || controller.isLeftPressed() || Gdx.input.isKeyPressed(Input.Keys.LEFT)){
                rotateX = 0;
                rotateY = 90;
                rotateZ = 0;
                angle = 180;
                if(Gdx.input.isKeyPressed(Input.Keys.SPACE) || actualGameButtons.isRunPressed()){
                    characterComponent.walkDirection.z = -10;

                }
                else {
                    characterComponent.walkDirection.z = -0.5f;
                }
                playerAnimation.animate("Armature|Walk",-1,1);

            }

            else if (Gdx.input.isKeyPressed(Input.Keys.D) || controller.isRightPressed() || Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
                rotateX = 0;
                rotateY = 0;
                rotateZ = 0;
                angle = 0;
                if(Gdx.input.isKeyPressed(Input.Keys.SPACE) || actualGameButtons.isRunPressed()){
                    characterComponent.walkDirection.z = 10;

                }
                else {
                    characterComponent.walkDirection.z = 0.5f;
                }
                playerAnimation.animate("Armature|Walk",-1,1);

            }

            else {
                if(!Gdx.input.isTouched()){
                    playerAnimation.animate("Armature|ArmatureAction",-1,1);
                }
            }
        }
        else {
            if(gameData.getString(current + " isHaranConvoInsDone").equals("done")){
                if(transZ < -48){
                    rotateX = 0;
                    rotateY = 0;
                    rotateZ = 0;
                    angle = 0;
                    characterComponent.walkDirection.z = 0.5f;
                    playerAnimation.animate("Armature|Walk",-1,1);
                }
                else if(transX > 5){
                    rotateX = 0;
                    rotateY = -45;
                    rotateZ = 0;
                    angle = 90;
                    characterComponent.walkDirection.x = -0.5f;
                    playerAnimation.animate("Armature|Walk",-1,1);
                }
                else if(transZ < 55){
                    rotateX = 0;
                    rotateY = 0;
                    rotateZ = 0;
                    angle = 0;
                    characterComponent.walkDirection.z = 0.5f;
                    playerAnimation.animate("Armature|Walk",-1,1);
                }
                else {
                    playerAnimation.animate("Armature|ArmatureAction",-1,1);
                }
            }
        }


        characterComponent.walkDirection.add(tmp);
        characterComponent.walkDirection.scl(10f * delta);
        characterComponent.characterController.setWalkDirection(characterComponent.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        characterComponent.ghostObject.getWorldTransform(ghost);
        ghost.getTranslation(translation);
        transX = translation.x;
        transY = translation.y;
        transZ = translation.z;

        modelComponent.instance.transform.set(new Vector3(transX,transY,transZ), new Quaternion( new Vector3(rotateX, rotateY, rotateZ), angle));
        modelComponent.instance.calculateTransforms();
//        if(paused){
//
//        }
        camera.position.x = cameraX - (posX - transX);
        camera.position.y = cameraY - (posY - transY) ;
        camera.position.z =  cameraZ - (posZ - transZ) ;

        mover.x = moverX - ( (posZ - transZ));
        mover.y = moverY - ( (posX - transX));

        if (Gdx.input.isKeyJustPressed(Input.Keys.M)){
            System.out.println("this is from playerSystem" + mover);
        }

        if(Gdx.input.justTouched()){
//            System.out.println(cameraX + " " + cameraZ);
//            System.out.println(transX + " " + transZ);
//            System.out.println(posX + " " + posZ);
        }

//        if(Gdx.input.isKeyPressed(Input.Keys.W)){
//            expected.x += characterComponent.walkDirection.x;
//        }
//        else {
//            expected.x = transX;
//        }
//
//        if (Gdx.input.isKeyJustPressed(Input.Keys.K)){
//            System.out.println(expected.x + " | " + transX);
//        }
        camera.update();
//        gameCam.update();/

//        Ray cameraPick = camera.getPickRay(Gdx.input.getX(),Gdx.input.getY());
//        float cameraXRes = camera.position.x - cameraPick.origin.x;
//        float cameraZRes = camera.position.z - cameraPick.origin.z;

        if(Gdx.input.justTouched()){
//            System.out.println("this is the pick position X: " + cameraXRes);
//            System.out.println("this is the pick position Z: " + cameraZRes);
//            System.out.println("this is the Translation X : " + (transX - cameraXRes));
//            System.out.println("this is the Translation Z : " + (transZ - cameraZRes));

        }
    }

    @Override
    public void entityAdded(Entity entity) {
        player = entity;
        playerComponent = entity.getComponent(PlayerComponent.class);
        characterComponent = entity.getComponent(CharacterComponent.class);
        modelComponent = entity.getComponent(ModelComponent.class);
        //
    }

    @Override
    public void entityRemoved(Entity entity) {
    }
}
