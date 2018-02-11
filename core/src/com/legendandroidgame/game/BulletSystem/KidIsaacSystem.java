package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.*;
import com.badlogic.ashley.utils.ImmutableArray;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Timer;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;

import java.util.Random;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 2/9/2018.
 */
public class KidIsaacSystem extends EntitySystem implements EntityListener{

    private ImmutableArray<Entity> entities;
    private Entity kidIsaac;
    private Entity player;
    private Engine engine;
    private KidIsaacCharacterComponent kidIsaacCharacterComponent;
    private ModelComponent modelComponent;
    private final Vector3 tmp = new Vector3();
    private float transX, transY, transZ, rotateX, rotateY, rotateZ, angle;
    private Quaternion quat = new Quaternion();
    public AnimationComponent playerAnimation;
    private String current = gameData.getString("current");
    private BulletSystem bulletSystem;
    private boolean up = false, down = false, left = false, right = false;

    private Vector3 playerPosition = new Vector3();
    private Vector3 kidPosition = new Vector3();

    ComponentMapper<KidIsaacCharacterComponent> cm = ComponentMapper.getFor(KidIsaacCharacterComponent.class);

    private boolean timerIsOn = false;

    public KidIsaacSystem(BulletSystem bulletSystem) {
        this.bulletSystem = bulletSystem;
        kidIsaac = CharacterEntityFactory.createKidIsaac(bulletSystem,39, 10, -73);
        playerAnimation = new AnimationComponent(CharacterEntityFactory.kidIsaacComponent.instance);
        modelComponent = CharacterEntityFactory.kidIsaacComponent;
        kidIsaacCharacterComponent = kidIsaac.getComponent(KidIsaacCharacterComponent.class);
    }

    @Override
    public void addedToEngine(Engine engine) {
        engine.addEntityListener(Family.all(KidIsaacCharacterComponent.class, CharacterComponent.class).get(), this);
        entities = engine.getEntitiesFor(Family.all( KidIsaacComponent.class ,KidIsaacCharacterComponent.class).get());
        engine.addEntityListener(Family.one(PlayerComponent.class).get(), this);
        this.engine = engine;
    }
    @Override
    public void update(float delta) {

        if(entities.size() < 1){
            engine.addEntity(kidIsaac);
        }
        updateMovement(delta);
        playerAnimation.update(delta);

        decideToWalk(delta);
    }
    private void updateMovement(float delta) {

        ModelComponent playerModel = player.getComponent(ModelComponent.class);
        playerPosition = playerModel.instance.transform.getTranslation(playerPosition);

        tmp.set(0, 0, 0);
        kidIsaacCharacterComponent.characterDirection.set(  0, 0, 0).rot(modelComponent.instance.transform).nor();
        kidIsaacCharacterComponent.walkDirection.set(0, 0, 0);

        if (kidIsaac.getComponent(KidIsaacComponent.class).state.equals(KidIsaacComponent.STATE.IDLE)){
            if (!timerIsOn){
                timerIsOn = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        Random rand = new Random();
                        int randomNumber = rand.nextInt(40) - 20;
//                        System.out.println(randomNumber);
                        if(randomNumber >= 1 && randomNumber <= 49){
                            playerAnimation.animate("Armature|ArmatureAction",-1,1);
                        }
                        else {
                            playerAnimation.animate("Armature|Bow.003",1,1);
                        }
                        timerIsOn = false;
                    }
                }, 2);
            }
        }
        if(kidIsaac.getComponent(KidIsaacComponent.class).state.equals(KidIsaacComponent.STATE.WALKING)){
            playerAnimation.animate("Armature|Walk",-1,1);
        }

        if(up){ // up
            rotateX = 0;
            rotateY = 45;
            rotateZ = 0;
            angle = 90;
            kidIsaac.add(new KidIsaacComponent(KidIsaacComponent.STATE.WALKING));
            kidIsaacCharacterComponent.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
        }
        else if (down){ // down
            rotateX = 0;
            rotateY = -45;
            rotateZ = 0;
            angle = 90;
            kidIsaac.add(new KidIsaacComponent(KidIsaacComponent.STATE.WALKING));
            kidIsaacCharacterComponent.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
        }
        else if(left) {// left
            rotateX = 0;
            rotateY = 90;
            rotateZ = 0;
            angle = 180;
            kidIsaac.add(new KidIsaacComponent(KidIsaacComponent.STATE.WALKING));
            kidIsaacCharacterComponent.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
        }
        else if(right) { // right
            rotateX = 0;
            rotateY = 0;
            rotateZ = 0;
            angle = 0;
            kidIsaac.add(new KidIsaacComponent(KidIsaacComponent.STATE.WALKING));
            kidIsaacCharacterComponent.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
        }
        else {
            kidIsaac.add(new KidIsaacComponent(KidIsaacComponent.STATE.IDLE));
        }


//        System.out.println(transZ);


        kidIsaacCharacterComponent.walkDirection.add(tmp);
        kidIsaacCharacterComponent.walkDirection.scl(10f * delta);
        kidIsaacCharacterComponent.characterController.setWalkDirection(kidIsaacCharacterComponent.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        kidIsaacCharacterComponent.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX = translation.x;
        transY = translation.y;
        transZ = translation.z;


        modelComponent.instance.transform.set(new Vector3(transX,transY,transZ), new Quaternion( new Vector3(rotateX, rotateY, rotateZ), angle));

        modelComponent.instance.calculateTransforms();

        kidPosition = modelComponent.instance.transform.getTranslation(new Vector3());

        if(Gdx.input.isKeyJustPressed(Input.Keys.T)){
            System.out.println(playerPosition);
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.Y)){
            System.out.println(kidPosition);
        }

    }

    private void decideToWalk(float delta){

//        System.out.println(kidPosition.x - playerPosition.x);

        if(gameData.getString(current + " doneTalkToIsaac").equals("done")){}

        if((playerPosition.x - kidPosition.x) <= 10 && (playerPosition.x - kidPosition.x) >= -10
                && (playerPosition.z - kidPosition.z) <= 10 && (playerPosition.z - kidPosition.z) >= -10){
            down = false;
            up = false;
            left = false;
            right = false;
        }
        else {
            if((kidPosition.x - playerPosition.x) > 1){
                down = true;
                up = false;
            }
            else if ((kidPosition.x - playerPosition.x) < 0){
                up = true;
                down = false;
            }
            else {
                up = false;
                down = false;
            }
            if ((kidPosition.z - playerPosition.z) > 1){
                left = true;
                right = false;
            }
            else if((kidPosition.z - playerPosition.z) < 0){
                right = true;
                left = false;
            }
            else {
                left = false;
                right = false;
            }
        }

    }

    @Override
    public void entityAdded(Entity entity) {
        player = entity;
    }

    @Override
    public void entityRemoved(Entity entity) {
    }

    public void dispose(){
        bulletSystem.collisionWorld.removeCollisionObject(kidIsaac.getComponent(KidIsaacCharacterComponent.class).ghostObject);
        kidIsaac.getComponent(KidIsaacCharacterComponent.class).ghostObject.dispose();
        kidIsaac.getComponent(KidIsaacCharacterComponent.class).ghostShape.dispose();
    }
}
