package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.*;
import com.badlogic.ashley.utils.ImmutableArray;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletTools.AnimalsEntityFactory;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 1/17/2018.
 */
public class AnimalSystem extends EntitySystem implements EntityListener {

    private ImmutableArray<Entity> entities;
    private Entity player;
//    private Quaternion quat = new Quaternion();
    private Engine engine;
    private AnimalsComponent animalsComponent;
    private ModelComponent modelComponent;
    private BulletSystem bulletSystem;
    public Entity ram;
    private String current = gameData.getString("current");
    public boolean pickup;

    private AnimationComponent ramAnimation;
    private final Vector3 tmp = new Vector3();
    private float transX, transY, transZ, rotateX, rotateY, rotateZ, angle;
    private boolean up = false, down = false, left = false, right = false;
    public Vector3 expectedDistance;

    private Vector3 playerPosition = new Vector3();
    private Vector3 ramPosition = new Vector3();


//    ComponentMapper<AnimalsComponent> cm = ComponentMapper.getFor(AnimalsComponent.class);

    public AnimalSystem(BulletSystem bulletSystem) {

        this.bulletSystem = bulletSystem;
        if(gameData.getString(current + " bringRam").equals("Done")){
            ram = AnimalsEntityFactory.createRamAnimal(bulletSystem, 132.8386f,7,-78.0811f);
        }
        else {
            ram = AnimalsEntityFactory.createRamAnimal(bulletSystem, -56.49538f,4.6279187f,-4.847444f);
        }

        expectedDistance = new Vector3();
        ramAnimation = new AnimationComponent(AnimalsEntityFactory.ramComponent.instance);
        modelComponent = AnimalsEntityFactory.ramComponent;
        animalsComponent = ram.getComponent(AnimalsComponent.class);
    }
    @Override
    public void addedToEngine(Engine e) {
        e.addEntityListener(Family.all(AnimalsComponent.class, CharacterComponent.class).get(), this);
        entities = e.getEntitiesFor(Family.all(AnimalComponent.class, AnimalsComponent.class).get());
        e.addEntityListener(Family.one(PlayerComponent.class).get(), this);
        this.engine = e;
    }
    public void update(float delta) {
        if (entities.size() < 1){
            if(gameData.getInteger(current + " currentLocation") == 8
                    && !gameData.getString(current + " mission3").equals("Done")) {
                engine.addEntity(ram);
            }
        }

        updateMovement(delta);
        decideToWalk(delta);
        ramAnimation.update(delta);
    }

    private void updateMovement(float dt){

        ModelComponent playerModel = player.getComponent(ModelComponent.class);
        playerPosition = playerModel.instance.transform.getTranslation(playerPosition);

        tmp.set(0, 0, 0);
        animalsComponent.ramDirection.set(  0, 0, 0).rot(modelComponent.instance.transform).nor();
        animalsComponent.ramWalkDirection.set(0, 0, 0);

        if(up){ // up
            rotateX = 0;
            rotateY = 45;
            rotateZ = 0;
            angle = 90;
            ram.add(new AnimalComponent(AnimalComponent.STATE.WALKING));
            animalsComponent.ramWalkDirection.x = 0.5f;
//                expectedDistance.x = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                        "expected: " + expectedDistance.x);
        }
        else if (down){ // down
            rotateX = 0;
            rotateY = -45;
            rotateZ = 0;
            angle = 90;
            ram.add(new AnimalComponent(AnimalComponent.STATE.WALKING));
            animalsComponent.ramWalkDirection.x = -0.5f;
//                expectedDistance.x = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.x + "\n" +
//                "expected: " + expectedDistance.x);
        }
        else if(left) {// left
            rotateX = 0;
            rotateY = 90;
            rotateZ = 0;
            angle = 180;
            ram.add(new AnimalComponent(AnimalComponent.STATE.WALKING));
            animalsComponent.ramWalkDirection.z = -0.5f;
//                expectedDistance.z = -0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
        }
        else if(right) { // right
            rotateX = 0;
            rotateY = 0;
            rotateZ = 0;
            angle = 0;
            ram.add(new AnimalComponent(AnimalComponent.STATE.WALKING));
            animalsComponent.ramWalkDirection.z = 0.5f;
//                expectedDistance.z = 0.5f;
//                System.out.println("walkDirection: " + numbersGuyCharacterComponent.walkDirection.z + "\n" +
//                        "expected: " + expectedDistance.z);
        }
        else {
            ram.add(new AnimalComponent(AnimalComponent.STATE.IDLE));
        }


//        System.out.println(transZ);


        animalsComponent.ramWalkDirection.add(tmp);
        animalsComponent.ramWalkDirection.scl(10f * dt);
        animalsComponent.ramController.setWalkDirection(animalsComponent.ramWalkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        animalsComponent.ramObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX = translation.x;
        transY = translation.y;
        transZ = translation.z;


        modelComponent.instance.transform.set(new Vector3(transX,transY,transZ), new Quaternion( new Vector3(rotateX, rotateY, rotateZ), angle));

        modelComponent.instance.calculateTransforms();

        if(ram.getComponent(AnimalComponent.class).state.equals(AnimalComponent.STATE.IDLE)){
            expectedDistance.x = transX;
            expectedDistance.z = transZ;
//            expectX = expectedDistance.x;
//            expectZ = expectedDistance.z;
        }
        else if (ram.getComponent(AnimalComponent.class).state.equals(AnimalComponent.STATE.WALKING)){
            expectedDistance.z += animalsComponent.ramWalkDirection.z;
            expectedDistance.x += animalsComponent.ramWalkDirection.x;
        }

//        expectZ = transZ + kidIsaacCharacterComponent.walkDirection.z;
//        expectX = transX + kidIsaacCharacterComponent.walkDirection.x;

        ramPosition = modelComponent.instance.transform.getTranslation(new Vector3());

        if(Gdx.input.isKeyJustPressed(Input.Keys.T)){
            System.out.println(playerPosition);
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.Y)){
            System.out.println(ramPosition);
        }

    }

    private void decideToWalk(float dt){

        if(gameData.getString(current + " bringRam").equals("Done")
                || !pickup) {
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
            if ((playerPosition.x - ramPosition.x) <= 5 && (playerPosition.x - ramPosition.x) >= -5
                    && (playerPosition.z - ramPosition.z) <= 5 && (playerPosition.z - ramPosition.z) >= -5) {
                down = false;
                up = false;
                left = false;
                right = false;
            }
            else {

                float leftdistance =  (playerPosition.z - ramPosition.z);
                float rightdistance = (ramPosition.z - playerPosition.z);
                float downdistance =  (playerPosition.x - ramPosition.x);
                float updistance =  (ramPosition.x - playerPosition.x);

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
        bulletSystem.collisionWorld.removeAction(ram.getComponent(AnimalsComponent.class).ramController);
        bulletSystem.collisionWorld.removeCollisionObject(ram.getComponent(AnimalsComponent.class).ramObject);
        ram.getComponent(AnimalsComponent.class).ramObject.dispose();
        ram.getComponent(AnimalsComponent.class).ramShape.dispose();
    }

}
