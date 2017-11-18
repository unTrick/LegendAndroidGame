package com.legendandroidgame.game.BulletTools;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.ModelLoader;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader;
import com.badlogic.gdx.graphics.g3d.model.data.ModelData;
import com.badlogic.gdx.graphics.g3d.utils.TextureProvider;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.btKinematicCharacterController;
import com.badlogic.gdx.utils.JsonReader;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletSystem.BulletSystem;


/**
 * Created by Patrick on 9/27/2017.
 */
public class CharacterEntityFactory {

    private static Model playerModel;
    private static Model lotModel;
    private static Model saraiModel;
    private static Model pharoahModel;
    private static Model aaronModel;
    private static Model peopleOfEdomModel;
    private static Model numbersGuyModel;
    private static Model instructorModel;

    private static BoundingBox playerBounds;

    public static ModelComponent playerComponent;
    public static ModelComponent lotComponent;
    public static ModelComponent saraiComponent;
    public static ModelComponent pharaohComponent;
    public static ModelComponent aaronComponent;
    public static ModelComponent peopleOfEdomComponent;
    public static ModelComponent numbersGuyComponent;
    public static ModelComponent instructorComponent;


    public static Entity createCharacter(BulletSystem bulletSystem, float x, float y, float z) {

        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData;
        modelData  = modelLoader.loadModelData(Gdx.files.internal("blender/abraham.g3dj"));

        if (playerModel == null) {
            playerModel = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            playerModel.calculateTransforms();
        }

        playerBounds = new BoundingBox();
        playerModel.calculateBoundingBox(playerBounds);
        Entity entity = new Entity();
        playerComponent = new ModelComponent(playerModel, x, y, z);
        entity.add(playerComponent);
        CharacterComponent characterComponent = new CharacterComponent();
        characterComponent.ghostObject = new btPairCachingGhostObject();
        characterComponent.ghostObject.setWorldTransform(playerComponent.instance.transform);
        characterComponent.ghostShape = new btCapsuleShapeZ(playerBounds.getHeight() / 8,playerBounds.getHeight() / 1.4f);
        characterComponent.ghostObject.setCollisionShape(characterComponent.ghostShape);
        characterComponent.ghostObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        characterComponent.characterController = new btKinematicCharacterController(characterComponent.ghostObject, characterComponent.ghostShape, 0.35f);
        characterComponent.ghostObject.userData = entity;
        entity.add(characterComponent);
        characterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(CharacterComponent.class).ghostObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(CharacterComponent.class).characterController);
        entity.add(new PlayerComponent());
        return entity;
    }

    public static Entity createMoses(BulletSystem bulletSystem, float x, float y, float z) {

        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData;
        modelData = modelLoader.loadModelData(Gdx.files.internal("blender/moses.g3dj"));

        if (playerModel == null) {
            playerModel = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            playerModel.calculateTransforms();
        }

        playerBounds = new BoundingBox();
        playerModel.calculateBoundingBox(playerBounds);
        Entity entity = new Entity();
        playerComponent = new ModelComponent(playerModel, x, y, z);
        entity.add(playerComponent);
        CharacterComponent characterComponent = new CharacterComponent();
        characterComponent.ghostObject = new btPairCachingGhostObject();
        characterComponent.ghostObject.setWorldTransform(playerComponent.instance.transform);
        characterComponent.ghostShape = new btCapsuleShapeZ(playerBounds.getHeight() / 8,playerBounds.getHeight() / 1.4f);
        characterComponent.ghostObject.setCollisionShape(characterComponent.ghostShape);
        characterComponent.ghostObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        characterComponent.characterController = new btKinematicCharacterController(characterComponent.ghostObject, characterComponent.ghostShape, 0.35f);
        characterComponent.ghostObject.userData = entity;
        entity.add(characterComponent);
        characterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(CharacterComponent.class).ghostObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(CharacterComponent.class).characterController);
        entity.add(new PlayerComponent());
        return entity;
    }

    public static Entity createLotCharacter(BulletSystem bulletSystem, float x, float y, float z) {

        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/man.g3dj"));
        if (lotModel == null) {
            lotModel = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            lotModel.calculateTransforms();
        }

        BoundingBox lotBounds = new BoundingBox();
        lotModel.calculateBoundingBox(lotBounds);
        Entity entity = new Entity();
        lotComponent = new ModelComponent(lotModel, x, y, z);
        entity.add(lotComponent);
        LotCharacterComponent lotCharacterComponent = new LotCharacterComponent();
        lotCharacterComponent.ghostObject = new btPairCachingGhostObject();
        lotCharacterComponent.ghostObject.setWorldTransform(lotComponent.instance.transform);
        lotCharacterComponent.ghostShape = new btCapsuleShapeZ(lotBounds.getHeight() / 4,lotBounds.getHeight() / 1.4f);
        lotCharacterComponent.ghostObject.setCollisionShape(lotCharacterComponent.ghostShape);
        lotCharacterComponent.ghostObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        lotCharacterComponent.characterController = new btKinematicCharacterController(lotCharacterComponent.ghostObject, lotCharacterComponent.ghostShape, 0.35f);
        lotCharacterComponent.ghostObject.userData = entity;
        entity.add(lotCharacterComponent);
        lotCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(LotCharacterComponent.class).ghostObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(LotCharacterComponent.class).characterController);
        entity.add(new LotComponent(LotComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createPharaohCharacter(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/pharaoh.g3dj"));
        if (pharoahModel == null) {
            pharoahModel = new Model(modelData, new
                    TextureProvider.FileTextureProvider());

            pharoahModel.calculateTransforms();
        }

        BoundingBox saraiBounds = new BoundingBox();
        pharoahModel.calculateBoundingBox(saraiBounds);

        Entity entity = new Entity();
        pharaohComponent = new ModelComponent(pharoahModel, x, y, z);
//        pharaohComponent.instance.transform.setToRotation(0,90,0,180);
        entity.add(pharaohComponent);
        PharaohCharacterComponent pharaohCharacterComponent = new PharaohCharacterComponent();
        pharaohCharacterComponent.ghostObject = new btPairCachingGhostObject();
        pharaohCharacterComponent.ghostObject.setWorldTransform(pharaohComponent.instance.transform);
        pharaohCharacterComponent.ghostShape = new btCapsuleShapeZ(saraiBounds.getHeight() / 4,saraiBounds.getHeight() / 1.4f);
        pharaohCharacterComponent.ghostObject.setCollisionShape(pharaohCharacterComponent.ghostShape);
        pharaohCharacterComponent.ghostObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        pharaohCharacterComponent.characterController = new btKinematicCharacterController(pharaohCharacterComponent.ghostObject, pharaohCharacterComponent.ghostShape, 0.35f);
        pharaohCharacterComponent.ghostObject.userData = entity;
        entity.add(pharaohCharacterComponent);
        pharaohCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(PharaohCharacterComponent.class).ghostObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(PharaohCharacterComponent.class).characterController);
        entity.add(new PharaohComponent(PharaohComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createSaraiCharacter(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/woman.g3dj"));
        if (saraiModel == null) {
            saraiModel = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            saraiModel.calculateTransforms();
        }

        BoundingBox saraiBounds = new BoundingBox();
        saraiModel.calculateBoundingBox(saraiBounds);

        Entity entity = new Entity();
        saraiComponent = new ModelComponent(saraiModel, x, y, z);
        entity.add(saraiComponent);
        SaraiCharacterComponent saraiCharacterComponent = new SaraiCharacterComponent();
        saraiCharacterComponent.ghostObject = new btPairCachingGhostObject();
        saraiCharacterComponent.ghostObject.setWorldTransform(saraiComponent.instance.transform);
        saraiCharacterComponent.ghostShape = new btCapsuleShapeZ(saraiBounds.getHeight() / 4,saraiBounds.getHeight() / 1.4f);
        saraiCharacterComponent.ghostObject.setCollisionShape(saraiCharacterComponent.ghostShape);
        saraiCharacterComponent.ghostObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        saraiCharacterComponent.characterController = new btKinematicCharacterController(saraiCharacterComponent.ghostObject, saraiCharacterComponent.ghostShape, 0.35f);
        saraiCharacterComponent.ghostObject.userData = entity;
        entity.add(saraiCharacterComponent);
        saraiCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(SaraiCharacterComponent.class).ghostObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(SaraiCharacterComponent.class).characterController);
        entity.add(new SaraiComponent(SaraiComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createAaronCharacter(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/man.g3dj"));
        if (aaronModel == null) {
            aaronModel = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            aaronModel.calculateTransforms();
        }

        BoundingBox aaronBounds = new BoundingBox();
        aaronModel.calculateBoundingBox(aaronBounds);

        Entity entity = new Entity();
        aaronComponent = new ModelComponent(aaronModel, x, y, z);
        entity.add(aaronComponent);
        AaronCharacterComponent aaronCharacterComponent = new AaronCharacterComponent();
        aaronCharacterComponent.ghostObject = new btPairCachingGhostObject();
        aaronCharacterComponent.ghostObject.setWorldTransform(aaronComponent.instance.transform);
        aaronCharacterComponent.ghostShape = new btCapsuleShapeZ(aaronBounds.getHeight() / 4,aaronBounds.getHeight() / 1.4f);
        aaronCharacterComponent.ghostObject.setCollisionShape(aaronCharacterComponent.ghostShape);
        aaronCharacterComponent.ghostObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        aaronCharacterComponent.characterController = new btKinematicCharacterController(aaronCharacterComponent.ghostObject, aaronCharacterComponent.ghostShape, 0.35f);
        aaronCharacterComponent.ghostObject.userData = entity;
        entity.add(aaronCharacterComponent);
        aaronCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(AaronCharacterComponent.class).ghostObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(AaronCharacterComponent.class).characterController);
        entity.add(new AaronComponent(AaronComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createPeopleOfEdom(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/man.g3dj"));
        if (peopleOfEdomModel == null) {
            peopleOfEdomModel = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            peopleOfEdomModel.calculateTransforms();
        }

        BoundingBox peopleOfEdomBounds = new BoundingBox();
        peopleOfEdomModel.calculateBoundingBox(peopleOfEdomBounds);

        Entity entity = new Entity();
        peopleOfEdomComponent = new ModelComponent(peopleOfEdomModel, x, y, z);
        entity.add(peopleOfEdomComponent);
        PeopleOfEdomChararacterComponent peopleOfEdomChararacterComponent = new PeopleOfEdomChararacterComponent();
        peopleOfEdomChararacterComponent.ghostObject = new btPairCachingGhostObject();
        peopleOfEdomChararacterComponent.ghostObject.setWorldTransform(peopleOfEdomComponent.instance.transform);
        peopleOfEdomChararacterComponent.ghostShape = new btCapsuleShapeZ(peopleOfEdomBounds.getHeight() / 4,peopleOfEdomBounds.getHeight() / 1.4f);
        peopleOfEdomChararacterComponent.ghostObject.setCollisionShape(peopleOfEdomChararacterComponent.ghostShape);
        peopleOfEdomChararacterComponent.ghostObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        peopleOfEdomChararacterComponent.characterController = new btKinematicCharacterController(peopleOfEdomChararacterComponent.ghostObject, peopleOfEdomChararacterComponent.ghostShape, 0.35f);
        peopleOfEdomChararacterComponent.ghostObject.userData = entity;
        entity.add(peopleOfEdomChararacterComponent);
        peopleOfEdomChararacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(PeopleOfEdomChararacterComponent.class).ghostObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(PeopleOfEdomChararacterComponent.class).characterController);
        entity.add(new AaronComponent(AaronComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createNumbersGuy(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/man.g3dj"));
        if (numbersGuyModel == null) {
            numbersGuyModel = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            numbersGuyModel.calculateTransforms();
        }

        BoundingBox numbersGuyBounds = new BoundingBox();
        numbersGuyModel.calculateBoundingBox(numbersGuyBounds);

        Entity entity = new Entity();
        numbersGuyComponent = new ModelComponent(numbersGuyModel, x, y, z);
        entity.add(numbersGuyComponent);
        NumbersGuyCharacterComponent numbersGuyCharacterComponent = new NumbersGuyCharacterComponent();
        numbersGuyCharacterComponent.ghostObject = new btPairCachingGhostObject();
        numbersGuyCharacterComponent.ghostObject.setWorldTransform(numbersGuyComponent.instance.transform);
        numbersGuyCharacterComponent.ghostShape = new btCapsuleShapeZ(numbersGuyBounds.getHeight() / 4,numbersGuyBounds.getHeight() / 1.4f);
        numbersGuyCharacterComponent.ghostObject.setCollisionShape(numbersGuyCharacterComponent.ghostShape);
        numbersGuyCharacterComponent.ghostObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        numbersGuyCharacterComponent.characterController = new btKinematicCharacterController(numbersGuyCharacterComponent.ghostObject, numbersGuyCharacterComponent.ghostShape, 0.35f);
        numbersGuyCharacterComponent.ghostObject.userData = entity;
        entity.add(numbersGuyCharacterComponent);
        numbersGuyCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(NumbersGuyCharacterComponent.class).ghostObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(NumbersGuyCharacterComponent.class).characterController);
        entity.add(new NumbersGuyComponent(NumbersGuyComponent.STATE.IDLE));
        return entity;
    }


    public static Entity createInstructor(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/resize_support2.g3dj"));
        if (instructorModel == null) {
            instructorModel = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            instructorModel.calculateTransforms();
        }

        BoundingBox instructorBounds = new BoundingBox();
        instructorModel.calculateBoundingBox(instructorBounds);

        Entity entity = new Entity();
        instructorComponent = new ModelComponent(instructorModel, x, y, z);
        entity.add(instructorComponent);
        InstructorCharacterComponent instructorCharacterComponent = new InstructorCharacterComponent();
        instructorCharacterComponent.ghostObject = new btPairCachingGhostObject();
        instructorCharacterComponent.ghostObject.setWorldTransform(instructorComponent.instance.transform);
        instructorCharacterComponent.ghostShape = new btCapsuleShapeZ(instructorBounds.getHeight() / 4,instructorBounds.getHeight() / 1.4f);
        instructorCharacterComponent.ghostObject.setCollisionShape(instructorCharacterComponent.ghostShape);
        instructorCharacterComponent.ghostObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        instructorCharacterComponent.characterController = new btKinematicCharacterController(instructorCharacterComponent.ghostObject, instructorCharacterComponent.ghostShape, 0.35f);
        instructorCharacterComponent.ghostObject.userData = entity;
        entity.add(instructorCharacterComponent);
        instructorCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(InstructorCharacterComponent.class).ghostObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(InstructorCharacterComponent.class).characterController);
        entity.add(new InstructorComponent(InstructorComponent.STATE.IDLE));
        return entity;
    }
}
