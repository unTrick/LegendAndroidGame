package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.*;
import com.badlogic.ashley.utils.ImmutableArray;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Timer;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;

import java.util.Random;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;


/**
 * Created by Patrick on 11/9/2017.
 */
public class InstructorCharSystem extends EntitySystem implements EntityListener {

    public Entity instructor;
    private ImmutableArray<Entity> entities;
    private Engine engine;
    private InstructorCharacterComponent characterComponent;
    private ModelComponent modelComponent;
    private final Vector3 tmp = new Vector3();
    private float transX, transY, transZ, rotateX, rotateY, rotateZ, angle;
    public AnimationComponent playerAnimation;
    private String current = gameData.getString("current");
    private BulletSystem bulletSystem;

    private boolean timerIsOn = false;

    public InstructorCharSystem(BulletSystem bulletSystem) {
        this.bulletSystem = bulletSystem;
        if(gameData.getString(current + " isWellInstructDone").equals("done")){
            instructor = CharacterEntityFactory.createInstructor(bulletSystem,0.5f,6,62);
        }
        else {
            instructor = CharacterEntityFactory.createInstructor(bulletSystem,39, 10, -73);

        }
        playerAnimation = new AnimationComponent(CharacterEntityFactory.instructorComponent.instance);
        modelComponent = CharacterEntityFactory.instructorComponent;
        characterComponent = instructor.getComponent(InstructorCharacterComponent.class);

    }

    @Override
    public void addedToEngine(Engine engine) {
//        engine.addEntityListener(Family.all(InstructorCharacterComponent.class).get(), this);
        entities = engine.getEntitiesFor(Family.all( InstructorComponent.class ,InstructorCharacterComponent.class).get());
        this.engine = engine;
    }
    @Override
    public void update(float delta) {

        if(entities.size() < 1){
            engine.addEntity(instructor);
        }

        updateMovement(delta);

        playerAnimation.update(delta);
    }
    private void updateMovement(float delta) {


        tmp.set(0, 0, 0);
        characterComponent.characterDirection.set(  0, 0, 0).rot(modelComponent.instance.transform).nor();
        characterComponent.walkDirection.set(0, 0, 0);

        if(!gameData.getString(current + " isWellInstructDone").equals("done")){
            if (!gameData.getString(current + " isHaranConvoInsDone").equals("done")){
                instructor.add(new InstructorComponent(InstructorComponent.STATE.IDLE));
                rotateX = 0;
                rotateY = 45;
                rotateZ = 0;
                angle = 90;
            }
            else {
                instructor.add(new InstructorComponent(InstructorComponent.STATE.INSTRUCTTHEWELL));
            }
        }
        else {
            rotateX = 0;
            rotateY = 90;
            rotateZ = 0;
            angle = 180;
            instructor.add(new InstructorComponent(InstructorComponent.STATE.IDLE));
        }


        if(instructor.getComponent(InstructorComponent.class).state.equals(InstructorComponent.STATE.INSTRUCTTHEWELL)){
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
                gameData.putString(current + " isInsWalkDone", "done");
                gameData.flush();
            }
        }

        if (instructor.getComponent(InstructorComponent.class).state.equals(InstructorComponent.STATE.IDLE)){
            if (!timerIsOn){
                timerIsOn = true;
                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        Random rand = new Random();
                        int randomNumber = rand.nextInt(100) - 35;
//                        System.out.println(randomNumber);
                        if(randomNumber >= 1 && randomNumber <= 49){
                            playerAnimation.animate("Armature|ArmatureAction",-1,1);
                        }
                        else if (randomNumber >= 50){
                            playerAnimation.animate("Armature|Bow",1,1);
                        }
                        else {
                            playerAnimation.animate("Armature|Stand",-1,1);
                        }
                        timerIsOn = false;
                    }
                }, 2);
            }
        }


//        System.out.println(transZ);


        characterComponent.walkDirection.add(tmp);
        characterComponent.walkDirection.scl(10f * delta);
        characterComponent.characterController.setWalkDirection(characterComponent.walkDirection);
        Matrix4 ghost = new Matrix4();
        Vector3 translation = new Vector3();
        characterComponent.ghostObject.getWorldTransform(ghost);   //TODO export this
        ghost.getTranslation(translation);
        transX = translation.x;
        transY = translation.y;
        transZ = translation.z;


        modelComponent.instance.transform.set(new Vector3(transX,transY,transZ), new Quaternion( new Vector3(rotateX, rotateY, rotateZ), angle));

        modelComponent.instance.calculateTransforms();
    }

    @Override
    public void entityAdded(Entity entity) {
    }

    @Override
    public void entityRemoved(Entity entity) {
    }

    public void dispose(){
        bulletSystem.collisionWorld.removeCollisionObject(instructor.getComponent(InstructorCharacterComponent.class).ghostObject);
        instructor.getComponent(InstructorCharacterComponent.class).ghostObject.dispose();
        instructor.getComponent(InstructorCharacterComponent.class).ghostShape.dispose();
    }
}

