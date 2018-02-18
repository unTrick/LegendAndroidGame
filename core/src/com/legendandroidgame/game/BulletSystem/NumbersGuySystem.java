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

/**
 * Created by Patrick on 10/22/2017.
 */
public class NumbersGuySystem extends EntitySystem implements EntityListener {

    private ImmutableArray<Entity> entities;
    private Entity player, numbersGuyEntity;
    private Engine engine;
    private BulletSystem bulletSystem;
    public AnimationComponent playerAnimation;
    public ModelComponent modelComponent;
    private NumbersGuyCharacterComponent numbersGuyCharacterComponent;

    private Random rand = new Random();
    private int randomNumber = 0;

    private final Vector3 tmp = new Vector3();
    private float transX, transY, transZ, rotateX, rotateY, rotateZ, angle, expectX, expectZ;
    public Vector3 expectedDistance;
    private boolean timerIsOn = false, left = false ,right = false,up = false,down = false, startWalking = false, skip = false;

    public NumbersGuySystem(BulletSystem bulletSystem) {
        this.bulletSystem = bulletSystem;

        numbersGuyEntity = CharacterEntityFactory.createNumbersGuy(bulletSystem, 5, 10, 10);
        modelComponent = CharacterEntityFactory.numbersGuyComponent;
        numbersGuyCharacterComponent = numbersGuyEntity.getComponent(NumbersGuyCharacterComponent.class);
        playerAnimation = new AnimationComponent(modelComponent.instance);

        expectedDistance = new Vector3();
    }
    @Override
    public void addedToEngine(Engine e) {
        entities = e.getEntitiesFor(Family.all(NumbersGuyComponent.class, NumbersGuyCharacterComponent.class).get());
        e.addEntityListener(Family.one(PlayerComponent.class).get(), this);
        this.engine = e;
    }
    public void update(float delta) {
        if (entities.size() < 1){
            engine.addEntity(numbersGuyEntity);
        }

        tmp.set(0, 0, 0);
        numbersGuyCharacterComponent.characterDirection.set(  0, 0, 0).rot(modelComponent.instance.transform).nor();
        numbersGuyCharacterComponent.walkDirection.set(0, 0, 0);

        if (!timerIsOn){
            timerIsOn = true;
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(40) - 20;
//                    System.out.println(randomNumber);
                    if(randomNumber >= 1){
                        numbersGuyEntity.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.WALKING));
                    }
                    else {
                        numbersGuyEntity.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
                        skip = false;
                    }
                    timerIsOn = false;
                }
            }, 3);
        }

        if(numbersGuyEntity.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            rotateX = 0;
            rotateY = -45;
            rotateZ = 0;
            angle = 90;
            playerAnimation.animate("Armature|ArmatureAction",-1,1);
        }
        if(numbersGuyEntity.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            playerAnimation.animate("Armature|Walk",-1,1);

            if (!startWalking){
                startWalking = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        randomNumber = rand.nextInt(100);
                        startWalking = false;
                    }
                }, 5);
            }
//                        System.out.println(randomNumber);
            if(!skip) {
                if (randomNumber > 50 && randomNumber <= 75) { // up
                    up = true;
                } else if (randomNumber > 75) { // down
                    down = true;
                } else if (randomNumber >= 25 && randomNumber <= 50) {// left
                    left = true;
                } else { // right
                    right = true;
                }
            }

            if(up){ // up
                rotateX = 0;
                rotateY = 45;
                rotateZ = 0;
                angle = 90;
                numbersGuyCharacterComponent.walkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
            }
            else if (down){ // down
                rotateX = 0;
                rotateY = -45;
                rotateZ = 0;
                angle = 90;
                numbersGuyCharacterComponent.walkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;

//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
            }
            else if(left) {// left
                rotateX = 0;
                rotateY = 90;
                rotateZ = 0;
                angle = 180;
                numbersGuyCharacterComponent.walkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
            else if(right) { // right
                rotateX = 0;
                rotateY = 0;
                rotateZ = 0;
                angle = 0;
                numbersGuyCharacterComponent.walkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
            }
        }

//        System.out.println(transZ);


        numbersGuyCharacterComponent.walkDirection.add(tmp);
        numbersGuyCharacterComponent.walkDirection.scl(10f * delta);
        numbersGuyCharacterComponent.characterController.setWalkDirection(numbersGuyCharacterComponent.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        numbersGuyCharacterComponent.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX = translation.x;
        transY = translation.y;
        transZ = translation.z;

        modelComponent.instance.transform.set(new Vector3(transX,transY,transZ), new Quaternion( new Vector3(rotateX, rotateY, rotateZ), angle));

        modelComponent.instance.calculateTransforms();

        if(numbersGuyEntity.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.IDLE)){
            expectedDistance.x = transX;
            expectedDistance.z = transZ;
            expectX = expectedDistance.x;
            expectZ = expectedDistance.z;
        }
        else if (numbersGuyEntity.getComponent(NumbersGuyComponent.class).state.equals(NumbersGuyComponent.STATE.WALKING)){
            expectedDistance.z += numbersGuyCharacterComponent.walkDirection.z;
            expectedDistance.x += numbersGuyCharacterComponent.walkDirection.x;

            expectZ = transZ + numbersGuyCharacterComponent.walkDirection.z;
            expectX = transX + numbersGuyCharacterComponent.walkDirection.x;
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.I)){
            System.out.println("original location: "  + expectX + " | " + expectZ);
            System.out.println("expected location: " + expectedDistance.x + " | " + expectedDistance.z);
            System.out.println("applied: " + numbersGuyCharacterComponent.walkDirection.x + " | " + numbersGuyCharacterComponent.walkDirection.z);
        }


        if(right){
            if(Math.round(expectZ) != Math.round(expectedDistance.z)){
                expectedDistance.z = expectZ;
                skip = true;
                left = true;
                right = false;
            }
        }
        if(left){
            if(Math.round(expectZ) != Math.round(expectedDistance.z)){
                expectedDistance.x = expectX;
                skip = true;
                up = true;
                left = false;
            }
        }
        if (up){
            if(Math.round(expectX) != Math.round(expectedDistance.x)){
                expectedDistance.x = expectX;
                skip = true;
                down = true;
                up = false;
            }
        }
        if(down){
            if(Math.round(expectX) != Math.round(expectedDistance.x)){
                expectedDistance.z = expectZ;
                skip = true;
                right = true;
                down = false;
            }
        }

//        System.out.println(skip);


        playerAnimation.update(delta);
        System.out.println(randomNumber);

    }
    @Override
    public void entityAdded(Entity entity) {
        player = entity;
    }
    @Override
    public void entityRemoved(Entity entity) {
    }

    public void dispose(){
        bulletSystem.collisionWorld.removeCollisionObject(numbersGuyEntity.getComponent(NumbersGuyCharacterComponent.class).ghostObject);
        numbersGuyEntity.getComponent(NumbersGuyCharacterComponent.class).ghostObject.dispose();
        numbersGuyEntity.getComponent(NumbersGuyCharacterComponent.class).ghostShape.dispose();
    }
}
