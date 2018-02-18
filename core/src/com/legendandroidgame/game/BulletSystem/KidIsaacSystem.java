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
    public Entity kidIsaac;
    private Entity player;
    private Engine engine;
    private KidIsaacCharacterComponent kidIsaacCharacterComponent;
    private ModelComponent modelComponent;
    private final Vector3 tmp = new Vector3();
    private float transX, transY, transZ, rotateX, rotateY, rotateZ, angle, expectX, expectZ;
    public AnimationComponent playerAnimation;
    private String current = gameData.getString("current");
    private BulletSystem bulletSystem;
    private boolean up = false, down = false, left = false, right = false;

    private Vector3 playerPosition = new Vector3();
    private Vector3 kidPosition = new Vector3();
    public Vector3 expectedDistance;

//    ComponentMapper<KidIsaacCharacterComponent> cm = ComponentMapper.getFor(KidIsaacCharacterComponent.class);

    private boolean timerIsOn = false;
    private int animationtime = 0;

    public KidIsaacSystem(BulletSystem bulletSystem) {
        this.bulletSystem = bulletSystem;

        if(gameData.getInteger(current + " currentLocation") == 2){
            if(gameData.getInteger(current + " from") == 1){
                kidIsaac = CharacterEntityFactory.createKidIsaac(bulletSystem,39, 10, -73);
            }
            if(gameData.getInteger(current + " from") == 3){
                kidIsaac = CharacterEntityFactory.createKidIsaac(bulletSystem,30,7,-113);
            }
            if(gameData.getInteger(current + " from") == 8){
                kidIsaac = CharacterEntityFactory.createKidIsaac(bulletSystem,-84,7,68);
            }
        }
        if(gameData.getInteger(current + " currentLocation") == 3){
            if(gameData.getInteger(current + " from") == 2){
                kidIsaac = CharacterEntityFactory.createKidIsaac(bulletSystem,116,6,27);
            }
            if(gameData.getInteger(current + " from") == 8){
                kidIsaac = CharacterEntityFactory.createKidIsaac(bulletSystem,90,6,102);
            }
            if(gameData.getInteger(current + " from") == 5){
                kidIsaac = CharacterEntityFactory.createKidIsaac(bulletSystem,90,6,102);
            }
        }
        if(gameData.getInteger(current + " currentLocation") == 8){
            if(gameData.getString(current + " bringIsaac").equals("Done")){
                kidIsaac = CharacterEntityFactory.createKidIsaac(bulletSystem,143,7,-74);
            }
            else {
                if(gameData.getInteger(current + " from") == 2){
                    kidIsaac = CharacterEntityFactory.createKidIsaac(bulletSystem,177,7,16);
                }
                if(gameData.getInteger(current + " from") == 3){
                    kidIsaac = CharacterEntityFactory.createKidIsaac(bulletSystem,98,7,-169);
                }
            }
        }

        expectedDistance = new Vector3();
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
                if(!gameData.getString(current + " bringIsaac").equals("Done")
                        && gameData.getInteger(current + " missionId") == 2){
                    engine.addEntity(kidIsaac);
                }
                else if(gameData.getInteger(current + " currentLocation") == 8) {
                    engine.addEntity(kidIsaac);
                }
        }
        updateMovement(delta);
        decideToWalk(delta);
        playerAnimation.update(delta);

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
                        animationtime = 2;
                    }
                }, animationtime);
            }
        }
        if(kidIsaac.getComponent(KidIsaacComponent.class).state.equals(KidIsaacComponent.STATE.WALKING)){
            playerAnimation.animate("Armature|Walk",-1,1);
            animationtime = 0;
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

        if(kidIsaac.getComponent(KidIsaacComponent.class).state.equals(KidIsaacComponent.STATE.IDLE)){
            expectedDistance.x = transX;
            expectedDistance.z = transZ;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (kidIsaac.getComponent(KidIsaacComponent.class).state.equals(KidIsaacComponent.STATE.WALKING)){
            expectedDistance.z += kidIsaacCharacterComponent.walkDirection.z;
            expectedDistance.x += kidIsaacCharacterComponent.walkDirection.x;
        }

        expectZ = transZ + kidIsaacCharacterComponent.walkDirection.z;
        expectX = transX + kidIsaacCharacterComponent.walkDirection.x;

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

        if(gameData.getString(current + " bringIsaac").equals("Done")) {
            rotateX = 0;
            rotateY = -45;
            rotateZ = 0;
            angle = 90;
            down = false;
            up = false;
            left = false;
            right = false;
        }
        else {
            if ((playerPosition.x - kidPosition.x) <= 5 && (playerPosition.x - kidPosition.x) >= -5
                    && (playerPosition.z - kidPosition.z) <= 5 && (playerPosition.z - kidPosition.z) >= -5) {
                down = false;
                up = false;
                left = false;
                right = false;
            }
            else {

                float leftdistance =  (playerPosition.z - kidPosition.z);
                float rightdistance = (kidPosition.z - playerPosition.z);
                float downdistance =  (playerPosition.x - kidPosition.x);
                float updistance =  (kidPosition.x - playerPosition.x);

                if (leftdistance > 1) {
                    right = true;

                    left = false;
                    down = false;
                    up = false;
                }
                else if (rightdistance > 1) {
                    left = true;

                    right = false;
                    down = false;
                    up = false;
                }
                else if (updistance > 1) {
                    down = true;

                    up = false;
                    left = false;
                    right = false;
                }
                else if (downdistance > 1) {
                    up = true;

                    left = false;
                    right = false;
                    down = false;
                }
                else {
                    left = false;
                    right = false;
                    down = false;
                    up = false;
                }

                /*
                if(Gdx.input.isKeyJustPressed(Input.Keys.LEFT)){
                    System.out.println(leftdistance);
                }
                if(Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)){
                    System.out.println(rightdistance);
                }
                if(Gdx.input.isKeyJustPressed(Input.Keys.UP)){
                    System.out.println(updistance);
                }
                if(Gdx.input.isKeyJustPressed(Input.Keys.DOWN)){
                    System.out.println(downdistance);
                }

                */
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
