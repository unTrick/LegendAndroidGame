package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.btConstraintSolver;
import com.badlogic.gdx.physics.bullet.dynamics.btDiscreteDynamicsWorld;
import com.badlogic.gdx.physics.bullet.dynamics.btRigidBody;
import com.badlogic.gdx.physics.bullet.dynamics.btSequentialImpulseConstraintSolver;
import com.legendandroidgame.game.BulletComponent.*;

/**
 * Created by Patrick on 9/4/2017.
 */
public class BulletSystem extends EntitySystem implements EntityListener {
    private final btCollisionConfiguration collisionConfiguration;
    private final btCollisionDispatcher dispatcher;
    private final btBroadphaseInterface broadphase;
    private final btConstraintSolver solver;
    public final btDiscreteDynamicsWorld collisionWorld;
    private btGhostPairCallback ghostPairCallback;

    @Override
    public void addedToEngine(Engine engine) {
        engine.addEntityListener(Family.all(BulletComponent.class).get(), this);
    }

    public BulletSystem() {

        collisionConfiguration = new btDefaultCollisionConfiguration();
        dispatcher = new btCollisionDispatcher(collisionConfiguration);
        broadphase = new btAxisSweep3(new Vector3(-1000, -1000, -1000), new Vector3(1000, 1000, 1000));
        solver = new btSequentialImpulseConstraintSolver();
        collisionWorld = new btDiscreteDynamicsWorld(dispatcher, broadphase, solver, collisionConfiguration);
        ghostPairCallback = new btGhostPairCallback();
        broadphase.getOverlappingPairCache().setInternalGhostPairCallback(ghostPairCallback);
        this.collisionWorld.setGravity(new Vector3(0, -0.5f, 0));
    }

    @Override
    public void update(float deltaTime) {
        collisionWorld.stepSimulation(0.75f);
    }

    public void dispose() {
        collisionWorld.dispose();
        if (solver != null) solver.dispose();
        if (broadphase != null) broadphase.dispose();
        if (dispatcher != null) dispatcher.dispose();
        if (collisionConfiguration != null) collisionConfiguration.dispose();
        ghostPairCallback.dispose();
    }

    @Override
    public void entityAdded(Entity entity) {
        BulletComponent bulletComponent = entity.getComponent(BulletComponent.class);
        if (bulletComponent.body != null) {
            collisionWorld.addRigidBody((btRigidBody) bulletComponent.body);
        }
    }

    public void removeBody(Entity entity) {
        BulletComponent comp = entity.getComponent(BulletComponent.class);
        if (comp != null) collisionWorld.removeCollisionObject(comp.body);
        CharacterComponent character = entity.getComponent(CharacterComponent.class);
        LotCharacterComponent lotComponent = entity.getComponent(LotCharacterComponent.class);
        SaraiCharacterComponent saraiComponent = entity.getComponent(SaraiCharacterComponent.class);
        FirstRedStone firstRedStone = entity.getComponent(FirstRedStone.class);
        SecondRedStone secondRedStone = entity.getComponent(SecondRedStone.class);
        ThirdRedStone thirdRedStone = entity.getComponent(ThirdRedStone.class);
        FourthRedStone fourthRedStone = entity.getComponent(FourthRedStone.class);
        DoorComponent doorComponent = entity.getComponent(DoorComponent.class);
        PharaohCharacterComponent pharaohCharacterComponent = entity.getComponent(PharaohCharacterComponent.class);
        AaronCharacterComponent aaronCharacterComponent = entity.getComponent(AaronCharacterComponent.class);
        JarOfWaterComponent jarOfWaterComponent = entity.getComponent(JarOfWaterComponent.class);
        CapComponent capComponent = entity.getComponent(CapComponent.class);
        CoatComponent coatComponent = entity.getComponent(CoatComponent.class);
        SashComponent sashComponent = entity.getComponent(SashComponent.class);
        NumbersGuyCharacterComponent numbersGuyCharacterComponent = entity.getComponent(NumbersGuyCharacterComponent.class);
        PeopleOfEdomChararacterComponent peopleOfEdomChararacterComponent = entity.getComponent(PeopleOfEdomChararacterComponent.class);
        CampFireComponent campFireComponent = entity.getComponent(CampFireComponent.class);
        InstructorCharacterComponent instructorCharacterComponent = entity.getComponent(InstructorCharacterComponent.class);
        WoodenPoleComponent woodenPoleComponent = entity.getComponent(WoodenPoleComponent.class);
        ObjectComponents objectComponents = entity.getComponent(ObjectComponents.class);

        if (character != null) {
            collisionWorld.removeAction(character.characterController);
            collisionWorld.removeCollisionObject(character.ghostObject);

        }

        if (lotComponent != null){
            collisionWorld.removeAction(lotComponent.characterController);
            collisionWorld.removeCollisionObject(lotComponent.ghostObject);
        }

        if (saraiComponent != null){
            collisionWorld.removeAction(saraiComponent.characterController);
            collisionWorld.removeCollisionObject(saraiComponent.ghostObject);
        }

        if(firstRedStone != null){
            collisionWorld.removeCollisionObject(firstRedStone.stoneObject);
        }

        if(secondRedStone != null){
            collisionWorld.removeCollisionObject(secondRedStone.stoneObject);
        }


        if(thirdRedStone != null){
            collisionWorld.removeCollisionObject(thirdRedStone.stoneObject);
        }


        if(fourthRedStone != null){
            collisionWorld.removeCollisionObject(fourthRedStone.stoneObject);
        }


        if (doorComponent != null){
            collisionWorld.removeCollisionObject(doorComponent.doorObject);
        }

        if(pharaohCharacterComponent != null){
            collisionWorld.removeCollisionObject(pharaohCharacterComponent.ghostObject);
        }

        if(aaronCharacterComponent != null){
            collisionWorld.removeCollisionObject(aaronCharacterComponent.ghostObject);
        }

        if(jarOfWaterComponent != null){
            collisionWorld.removeCollisionObject(jarOfWaterComponent.jarOfWaterObject);
        }

        if(capComponent != null){
            collisionWorld.removeCollisionObject(capComponent.capObject);
        }

        if(sashComponent != null){
            collisionWorld.removeCollisionObject(sashComponent.sashObject);
        }

        if(coatComponent != null){
            collisionWorld.removeCollisionObject(coatComponent.coatObject);
        }

        if(peopleOfEdomChararacterComponent != null){
            collisionWorld.removeCollisionObject(peopleOfEdomChararacterComponent.ghostObject);
        }

        if(numbersGuyCharacterComponent != null){
            collisionWorld.removeCollisionObject(numbersGuyCharacterComponent.ghostObject);
        }

        if(campFireComponent != null){
            collisionWorld.removeCollisionObject(campFireComponent.fireObject);
        }

        if(instructorCharacterComponent != null){
            collisionWorld.removeCollisionObject(instructorCharacterComponent.ghostObject);
        }

        if(woodenPoleComponent != null){
            collisionWorld.removeCollisionObject(woodenPoleComponent.woodenPoleObject);
        }

        if(objectComponents != null){
            collisionWorld.removeCollisionObject(objectComponents.flintKnifeObject);
        }

    }

    @Override
    public void entityRemoved(Entity entity) {
    }

}
