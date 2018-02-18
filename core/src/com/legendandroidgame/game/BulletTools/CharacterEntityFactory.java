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

import static com.legendandroidgame.game.LegendAndroidGame.gameData;


/**
 * Created by Patrick on 9/27/2017.
 */
public class CharacterEntityFactory {

    public static Model playerModel;
    public static Model lotModel;
    public static Model saraiModel;
    public static Model pharoahModel;
    public static Model aaronModel;
    public static Model peopleOfEdomModel;
    public static Model numbersGuyModel;
    public static Model instructorModel;
    public static Model israelitesModel1;
    public static Model israelitesModel2;
    public static Model israelitesModel3;
    public static Model israelitesModel4;
    public static Model israelitesModel5;
    public static Model israelitesModel6;
    public static Model israelitesModel7;
    public static Model israelitesModel8;
    public static Model israelitesModel9;
    public static Model israelitesModel10;
    public static Model kidIsaac;

    private static BoundingBox playerBounds;

    public static ModelComponent playerComponent;
    public static ModelComponent lotComponent;
    public static ModelComponent saraiComponent;
    public static ModelComponent pharaohComponent;
    public static ModelComponent aaronComponent;
    public static ModelComponent peopleOfEdomComponent;
    public static ModelComponent numbersGuyComponent;
    public static ModelComponent instructorComponent;
    public static ModelComponent kidIsaacComponent;

    public static ModelComponent israelitesComponent1;
    public static ModelComponent israelitesComponent2;
    public static ModelComponent israelitesComponent3;
    public static ModelComponent israelitesComponent4;
    public static ModelComponent israelitesComponent5;
    public static ModelComponent israelitesComponent6;
    public static ModelComponent israelitesComponent7;
    public static ModelComponent israelitesComponent8;
    public static ModelComponent israelitesComponent9;
    public static ModelComponent israelitesComponent10;

    public static ModelData character;

    public static Entity createCharacter(BulletSystem bulletSystem, float x, float y, float z) {
        String current = gameData.getString("current");
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        if (gameData.getInteger(current + " missionId") >= 7){
            character = modelLoader.loadModelData(Gdx.files.internal("blender/joshua.g3dj"));
        }
        else if(gameData.getInteger(current + " missionId") >= 4){
            character = modelLoader.loadModelData(Gdx.files.internal("blender/moses.g3dj"));
        }
        else {
            character = modelLoader.loadModelData(Gdx.files.internal("blender/abraham.g3dj"));
        }

        if (playerModel == null) {
            playerModel = new Model(character, new
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
        characterComponent.ghostShape = new btCapsuleShapeZ(playerBounds.getHeight() / 8,playerBounds.getHeight() / 1f);
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
        characterComponent.ghostShape = new btCapsuleShapeZ(playerBounds.getHeight() / 8,playerBounds.getHeight() / 1f);
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
        lotCharacterComponent.ghostShape = new btCapsuleShapeZ(lotBounds.getHeight() / 8,lotBounds.getHeight() / 1f);
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
        pharaohCharacterComponent.ghostShape = new btCapsuleShapeZ(saraiBounds.getHeight() / 8,saraiBounds.getHeight() / 1f);
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
        saraiCharacterComponent.ghostShape = new btCapsuleShapeZ(saraiBounds.getHeight() / 8,saraiBounds.getHeight() / 1f);
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
        aaronCharacterComponent.ghostShape = new btCapsuleShapeZ(aaronBounds.getHeight() / 8,aaronBounds.getHeight() / 1f);
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
        peopleOfEdomChararacterComponent.ghostShape = new btCapsuleShapeZ(peopleOfEdomBounds.getHeight() / 8,peopleOfEdomBounds.getHeight() / 1f);
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
        numbersGuyCharacterComponent.ghostShape = new btCapsuleShapeZ(numbersGuyBounds.getHeight() / 8,numbersGuyBounds.getHeight() / 1f);
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
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/newman.g3dj"));
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
        instructorCharacterComponent.ghostShape = new btCapsuleShapeZ(instructorBounds.getHeight() / 8,instructorBounds.getHeight() / 1f);
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

    public static Entity createIsraelites1(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/newman.g3dj"));
        if (israelitesModel1 == null) {
            israelitesModel1 = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            israelitesModel1.calculateTransforms();
        }

        BoundingBox israelitesBounds = new BoundingBox();
        israelitesModel1.calculateBoundingBox(israelitesBounds);

        Entity entity = new Entity();
        israelitesComponent1 = new ModelComponent(israelitesModel1, x, y, z);
        entity.add(israelitesComponent1);
        IsraelitesCharacterComponent israelitesCharacterComponent = new IsraelitesCharacterComponent();
        israelitesCharacterComponent.israelitestObject = new btPairCachingGhostObject();
        israelitesCharacterComponent.israelitestObject.setWorldTransform(israelitesComponent1.instance.transform);
        israelitesCharacterComponent.israelitesShape = new btCapsuleShapeZ(israelitesBounds.getHeight() / 8,israelitesBounds.getHeight() / 1f);
        israelitesCharacterComponent.israelitestObject.setCollisionShape(israelitesCharacterComponent.israelitesShape);
        israelitesCharacterComponent.israelitestObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        israelitesCharacterComponent.characterController = new btKinematicCharacterController(israelitesCharacterComponent.israelitestObject, israelitesCharacterComponent.israelitesShape, 0.35f);
        israelitesCharacterComponent.israelitestObject.userData = entity;
        entity.add(israelitesCharacterComponent);
        israelitesCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(IsraelitesCharacterComponent.class).israelitestObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(IsraelitesCharacterComponent.class).characterController);
        entity.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createIsraelites2(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/newwoman.g3dj"));
        if (israelitesModel2 == null) {
            israelitesModel2 = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            israelitesModel2.calculateTransforms();
        }

        BoundingBox israelitesBounds = new BoundingBox();
        israelitesModel2.calculateBoundingBox(israelitesBounds);

        Entity entity = new Entity();
        israelitesComponent2 = new ModelComponent(israelitesModel2, x, y, z);
        entity.add(israelitesComponent2);
        IsraelitesCharacterComponent israelitesCharacterComponent = new IsraelitesCharacterComponent();
        israelitesCharacterComponent.israelitestObject = new btPairCachingGhostObject();
        israelitesCharacterComponent.israelitestObject.setWorldTransform(israelitesComponent2.instance.transform);
        israelitesCharacterComponent.israelitesShape = new btCapsuleShapeZ(israelitesBounds.getHeight() / 8,israelitesBounds.getHeight() / 1f);
        israelitesCharacterComponent.israelitestObject.setCollisionShape(israelitesCharacterComponent.israelitesShape);
        israelitesCharacterComponent.israelitestObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        israelitesCharacterComponent.characterController = new btKinematicCharacterController(israelitesCharacterComponent.israelitestObject, israelitesCharacterComponent.israelitesShape, 0.35f);
        israelitesCharacterComponent.israelitestObject.userData = entity;
        entity.add(israelitesCharacterComponent);
        israelitesCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(IsraelitesCharacterComponent.class).israelitestObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(IsraelitesCharacterComponent.class).characterController);
        entity.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createIsraelites3(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/newman.g3dj"));
        if (israelitesModel3 == null) {
            israelitesModel3 = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            israelitesModel3.calculateTransforms();
        }

        BoundingBox israelitesBounds = new BoundingBox();
        israelitesModel3.calculateBoundingBox(israelitesBounds);

        Entity entity = new Entity();
        israelitesComponent3 = new ModelComponent(israelitesModel3, x, y, z);
        entity.add(israelitesComponent3);
        IsraelitesCharacterComponent israelitesCharacterComponent = new IsraelitesCharacterComponent();
        israelitesCharacterComponent.israelitestObject = new btPairCachingGhostObject();
        israelitesCharacterComponent.israelitestObject.setWorldTransform(israelitesComponent3.instance.transform);
        israelitesCharacterComponent.israelitesShape = new btCapsuleShapeZ(israelitesBounds.getHeight() / 8,israelitesBounds.getHeight() / 1f);
        israelitesCharacterComponent.israelitestObject.setCollisionShape(israelitesCharacterComponent.israelitesShape);
        israelitesCharacterComponent.israelitestObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        israelitesCharacterComponent.characterController = new btKinematicCharacterController(israelitesCharacterComponent.israelitestObject, israelitesCharacterComponent.israelitesShape, 0.35f);
        israelitesCharacterComponent.israelitestObject.userData = entity;
        entity.add(israelitesCharacterComponent);
        israelitesCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(IsraelitesCharacterComponent.class).israelitestObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(IsraelitesCharacterComponent.class).characterController);
        entity.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createIsraelites4(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/newwoman.g3dj"));
        if (israelitesModel4 == null) {
            israelitesModel4 = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            israelitesModel4.calculateTransforms();
        }

        BoundingBox israelitesBounds = new BoundingBox();
        israelitesModel4.calculateBoundingBox(israelitesBounds);

        Entity entity = new Entity();
        israelitesComponent4 = new ModelComponent(israelitesModel4, x, y, z);
        entity.add(israelitesComponent4);
        IsraelitesCharacterComponent israelitesCharacterComponent = new IsraelitesCharacterComponent();
        israelitesCharacterComponent.israelitestObject = new btPairCachingGhostObject();
        israelitesCharacterComponent.israelitestObject.setWorldTransform(israelitesComponent4.instance.transform);
        israelitesCharacterComponent.israelitesShape = new btCapsuleShapeZ(israelitesBounds.getHeight() / 8,israelitesBounds.getHeight() / 1f);
        israelitesCharacterComponent.israelitestObject.setCollisionShape(israelitesCharacterComponent.israelitesShape);
        israelitesCharacterComponent.israelitestObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        israelitesCharacterComponent.characterController = new btKinematicCharacterController(israelitesCharacterComponent.israelitestObject, israelitesCharacterComponent.israelitesShape, 0.35f);
        israelitesCharacterComponent.israelitestObject.userData = entity;
        entity.add(israelitesCharacterComponent);
        israelitesCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(IsraelitesCharacterComponent.class).israelitestObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(IsraelitesCharacterComponent.class).characterController);
        entity.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createIsraelites5(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/newman.g3dj"));
        if (israelitesModel5 == null) {
            israelitesModel5 = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            israelitesModel5.calculateTransforms();
        }

        BoundingBox israelitesBounds = new BoundingBox();
        israelitesModel5.calculateBoundingBox(israelitesBounds);

        Entity entity = new Entity();
        israelitesComponent5 = new ModelComponent(israelitesModel5, x, y, z);
        entity.add(israelitesComponent5);
        IsraelitesCharacterComponent israelitesCharacterComponent = new IsraelitesCharacterComponent();
        israelitesCharacterComponent.israelitestObject = new btPairCachingGhostObject();
        israelitesCharacterComponent.israelitestObject.setWorldTransform(israelitesComponent5.instance.transform);
        israelitesCharacterComponent.israelitesShape = new btCapsuleShapeZ(israelitesBounds.getHeight() / 8,israelitesBounds.getHeight() / 1f);
        israelitesCharacterComponent.israelitestObject.setCollisionShape(israelitesCharacterComponent.israelitesShape);
        israelitesCharacterComponent.israelitestObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        israelitesCharacterComponent.characterController = new btKinematicCharacterController(israelitesCharacterComponent.israelitestObject, israelitesCharacterComponent.israelitesShape, 0.35f);
        israelitesCharacterComponent.israelitestObject.userData = entity;
        entity.add(israelitesCharacterComponent);
        israelitesCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(IsraelitesCharacterComponent.class).israelitestObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(IsraelitesCharacterComponent.class).characterController);
        entity.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createIsraelites6(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/newman.g3dj"));
        if (israelitesModel6 == null) {
            israelitesModel6 = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            israelitesModel6.calculateTransforms();
        }

        BoundingBox israelitesBounds = new BoundingBox();
        israelitesModel6.calculateBoundingBox(israelitesBounds);

        Entity entity = new Entity();
        israelitesComponent6 = new ModelComponent(israelitesModel6, x, y, z);
        entity.add(israelitesComponent6);
        IsraelitesCharacterComponent israelitesCharacterComponent = new IsraelitesCharacterComponent();
        israelitesCharacterComponent.israelitestObject = new btPairCachingGhostObject();
        israelitesCharacterComponent.israelitestObject.setWorldTransform(israelitesComponent6.instance.transform);
        israelitesCharacterComponent.israelitesShape = new btCapsuleShapeZ(israelitesBounds.getHeight() / 8,israelitesBounds.getHeight() / 1f);
        israelitesCharacterComponent.israelitestObject.setCollisionShape(israelitesCharacterComponent.israelitesShape);
        israelitesCharacterComponent.israelitestObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        israelitesCharacterComponent.characterController = new btKinematicCharacterController(israelitesCharacterComponent.israelitestObject, israelitesCharacterComponent.israelitesShape, 0.35f);
        israelitesCharacterComponent.israelitestObject.userData = entity;
        entity.add(israelitesCharacterComponent);
        israelitesCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(IsraelitesCharacterComponent.class).israelitestObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(IsraelitesCharacterComponent.class).characterController);
        entity.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createIsraelites7(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/newwoman.g3dj"));
        if (israelitesModel7 == null) {
            israelitesModel7 = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            israelitesModel7.calculateTransforms();
        }

        BoundingBox israelitesBounds = new BoundingBox();
        israelitesModel7.calculateBoundingBox(israelitesBounds);

        Entity entity = new Entity();
        israelitesComponent7 = new ModelComponent(israelitesModel7, x, y, z);
        entity.add(israelitesComponent7);
        IsraelitesCharacterComponent israelitesCharacterComponent = new IsraelitesCharacterComponent();
        israelitesCharacterComponent.israelitestObject = new btPairCachingGhostObject();
        israelitesCharacterComponent.israelitestObject.setWorldTransform(israelitesComponent7.instance.transform);
        israelitesCharacterComponent.israelitesShape = new btCapsuleShapeZ(israelitesBounds.getHeight() / 8,israelitesBounds.getHeight() / 1f);
        israelitesCharacterComponent.israelitestObject.setCollisionShape(israelitesCharacterComponent.israelitesShape);
        israelitesCharacterComponent.israelitestObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        israelitesCharacterComponent.characterController = new btKinematicCharacterController(israelitesCharacterComponent.israelitestObject, israelitesCharacterComponent.israelitesShape, 0.35f);
        israelitesCharacterComponent.israelitestObject.userData = entity;
        entity.add(israelitesCharacterComponent);
        israelitesCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(IsraelitesCharacterComponent.class).israelitestObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(IsraelitesCharacterComponent.class).characterController);
        entity.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createIsraelites8(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/newwoman.g3dj"));
        if (israelitesModel8 == null) {
            israelitesModel8 = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            israelitesModel8.calculateTransforms();
        }

        BoundingBox israelitesBounds = new BoundingBox();
        israelitesModel8.calculateBoundingBox(israelitesBounds);

        Entity entity = new Entity();
        israelitesComponent8 = new ModelComponent(israelitesModel8, x, y, z);
        entity.add(israelitesComponent8);
        IsraelitesCharacterComponent israelitesCharacterComponent = new IsraelitesCharacterComponent();
        israelitesCharacterComponent.israelitestObject = new btPairCachingGhostObject();
        israelitesCharacterComponent.israelitestObject.setWorldTransform(israelitesComponent8.instance.transform);
        israelitesCharacterComponent.israelitesShape = new btCapsuleShapeZ(israelitesBounds.getHeight() / 8,israelitesBounds.getHeight() / 1f);
        israelitesCharacterComponent.israelitestObject.setCollisionShape(israelitesCharacterComponent.israelitesShape);
        israelitesCharacterComponent.israelitestObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        israelitesCharacterComponent.characterController = new btKinematicCharacterController(israelitesCharacterComponent.israelitestObject, israelitesCharacterComponent.israelitesShape, 0.35f);
        israelitesCharacterComponent.israelitestObject.userData = entity;
        entity.add(israelitesCharacterComponent);
        israelitesCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(IsraelitesCharacterComponent.class).israelitestObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(IsraelitesCharacterComponent.class).characterController);
        entity.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createIsraelites9(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/newman.g3dj"));
        if (israelitesModel9 == null) {
            israelitesModel9 = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            israelitesModel9.calculateTransforms();
        }

        BoundingBox israelitesBounds = new BoundingBox();
        israelitesModel9.calculateBoundingBox(israelitesBounds);

        Entity entity = new Entity();
        israelitesComponent9 = new ModelComponent(israelitesModel9, x, y, z);
        entity.add(israelitesComponent9);
        IsraelitesCharacterComponent israelitesCharacterComponent = new IsraelitesCharacterComponent();
        israelitesCharacterComponent.israelitestObject = new btPairCachingGhostObject();
        israelitesCharacterComponent.israelitestObject.setWorldTransform(israelitesComponent9.instance.transform);
        israelitesCharacterComponent.israelitesShape = new btCapsuleShapeZ(israelitesBounds.getHeight() / 8,israelitesBounds.getHeight() / 1f);
        israelitesCharacterComponent.israelitestObject.setCollisionShape(israelitesCharacterComponent.israelitesShape);
        israelitesCharacterComponent.israelitestObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        israelitesCharacterComponent.characterController = new btKinematicCharacterController(israelitesCharacterComponent.israelitestObject, israelitesCharacterComponent.israelitesShape, 0.35f);
        israelitesCharacterComponent.israelitestObject.userData = entity;
        entity.add(israelitesCharacterComponent);
        israelitesCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(IsraelitesCharacterComponent.class).israelitestObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(IsraelitesCharacterComponent.class).characterController);
        entity.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createIsraelites10(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/newwoman.g3dj"));
        if (israelitesModel10 == null) {
            israelitesModel10 = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            israelitesModel10.calculateTransforms();
        }

        BoundingBox israelitesBounds = new BoundingBox();
        israelitesModel10.calculateBoundingBox(israelitesBounds);

        Entity entity = new Entity();
        israelitesComponent10 = new ModelComponent(israelitesModel10, x, y, z);
        entity.add(israelitesComponent10);
        IsraelitesCharacterComponent israelitesCharacterComponent = new IsraelitesCharacterComponent();
        israelitesCharacterComponent.israelitestObject = new btPairCachingGhostObject();
        israelitesCharacterComponent.israelitestObject.setWorldTransform(israelitesComponent10.instance.transform);
        israelitesCharacterComponent.israelitesShape = new btCapsuleShapeZ(israelitesBounds.getHeight() / 8,israelitesBounds.getHeight() / 1f);
        israelitesCharacterComponent.israelitestObject.setCollisionShape(israelitesCharacterComponent.israelitesShape);
        israelitesCharacterComponent.israelitestObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        israelitesCharacterComponent.characterController = new btKinematicCharacterController(israelitesCharacterComponent.israelitestObject, israelitesCharacterComponent.israelitesShape, 0.35f);
        israelitesCharacterComponent.israelitestObject.userData = entity;
        entity.add(israelitesCharacterComponent);
        israelitesCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(IsraelitesCharacterComponent.class).israelitestObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(IsraelitesCharacterComponent.class).characterController);
        entity.add(new IsraelitesComponent(IsraelitesComponent.STATE.IDLE));
        return entity;
    }

    public static Entity createKidIsaac(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/child.g3dj"));
        if (kidIsaac == null) {
            kidIsaac = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            kidIsaac.calculateTransforms();
        }

        BoundingBox kidBounds = new BoundingBox();
        kidIsaac.calculateBoundingBox(kidBounds);

        Entity entity = new Entity();
        kidIsaacComponent = new ModelComponent(kidIsaac, x, y, z);
        entity.add(kidIsaacComponent);
        KidIsaacCharacterComponent kidIsaacCharacterComponent = new KidIsaacCharacterComponent();
        kidIsaacCharacterComponent.ghostObject = new btPairCachingGhostObject();
        kidIsaacCharacterComponent.ghostObject.setWorldTransform(kidIsaacComponent.instance.transform);
        kidIsaacCharacterComponent.ghostShape = new btCapsuleShapeZ(kidBounds.getHeight() / 8,kidBounds.getHeight() / 1f);
        kidIsaacCharacterComponent.ghostObject.setCollisionShape(kidIsaacCharacterComponent.ghostShape);
        kidIsaacCharacterComponent.ghostObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        kidIsaacCharacterComponent.characterController = new btKinematicCharacterController(kidIsaacCharacterComponent.ghostObject, kidIsaacCharacterComponent.ghostShape, 0.35f);
        kidIsaacCharacterComponent.ghostObject.userData = entity;
        entity.add(kidIsaacCharacterComponent);
        kidIsaacCharacterComponent.characterController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(KidIsaacCharacterComponent.class).ghostObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(KidIsaacCharacterComponent.class).characterController);
        entity.add(new KidIsaacComponent(KidIsaacComponent.STATE.IDLE));
        return entity;
    }

}
