package com.legendandroidgame.game.BulletTools;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.ModelLoader;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader;
import com.badlogic.gdx.graphics.g3d.model.Node;
import com.badlogic.gdx.graphics.g3d.model.data.ModelData;
import com.badlogic.gdx.graphics.g3d.utils.TextureProvider;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.btRigidBody;
import com.badlogic.gdx.utils.JsonReader;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletSystem.BulletSystem;

/**
 * Created by Patrick on 9/27/2017.
 */
public class ObjectEntityFactory {

    public static ModelComponent altarModelComponent;
    public static ModelComponent portalComponentLeft;
    public static ModelComponent portalComponentRight;
    public static ModelComponent portalComponentTop;
    public static ModelComponent portalComponentBottom;
    public static ModelComponent fireComponent;
    public static ModelComponent houseDoorComponent;
    public static ModelComponent woodenPoleComponent;
    public static ModelComponent flintKnifeComponent;
//    public static ModelComponent ramComponent;

    public static ModelComponent tilesComponent;
    public static ModelComponent arrowPointerComponent;

    public static Entity loadFirstRedStone(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox stoneBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Red_stone.g3dj"));
        Model stoneModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        stoneModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(stoneModel, x, y, z);
        entity.add(modelComponent);
        stoneModel.calculateBoundingBox(stoneBounds);
        FirstRedStone firstRedStone = new FirstRedStone();
        firstRedStone.stoneObject = new btPairCachingGhostObject();
        firstRedStone.stoneObject.setWorldTransform(modelComponent.instance.transform);
        firstRedStone.stoneShape = new btCapsuleShape(stoneBounds.getWidth(), stoneBounds.getHeight());
        firstRedStone.stoneObject.setCollisionShape(firstRedStone.stoneShape);
        firstRedStone.stoneObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        firstRedStone.stoneObject.userData = entity;
        entity.add(firstRedStone);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(FirstRedStone.class).stoneObject,
                        (short)
                                btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                        (short)
                                (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        entity.add(new StatusComponent());
        return entity;
    }

    public static Entity loadSecondRedStone(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox stoneBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Red_stone.g3dj"));
        Model stoneModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        stoneModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(stoneModel, x, y, z);
        entity.add(modelComponent);
        stoneModel.calculateBoundingBox(stoneBounds);
        SecondRedStone secondRedStone = new SecondRedStone();
        secondRedStone.stoneObject = new btPairCachingGhostObject();
        secondRedStone.stoneObject.setWorldTransform(modelComponent.instance.transform);
        secondRedStone.stoneShape = new btCapsuleShape(stoneBounds.getWidth(), stoneBounds.getHeight());
        secondRedStone.stoneObject.setCollisionShape(secondRedStone.stoneShape);
        secondRedStone.stoneObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        secondRedStone.stoneObject.userData = entity;
        entity.add(secondRedStone);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(SecondRedStone.class).stoneObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        entity.add(new StatusComponent());
        return entity;
    }

    public static Entity loadThirdRedStone(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox stoneBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Red_stone.g3dj"));
        Model stoneModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        stoneModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(stoneModel, x, y, z);
        entity.add(modelComponent);
        stoneModel.calculateBoundingBox(stoneBounds);
        ThirdRedStone thirdRedStone = new ThirdRedStone();
        thirdRedStone.stoneObject = new btPairCachingGhostObject();
        thirdRedStone.stoneObject.setWorldTransform(modelComponent.instance.transform);
        thirdRedStone.stoneShape = new btCapsuleShape(stoneBounds.getWidth(), stoneBounds.getHeight());
        thirdRedStone.stoneObject.setCollisionShape(thirdRedStone.stoneShape);
        thirdRedStone.stoneObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        thirdRedStone.stoneObject.userData = entity;
        entity.add(thirdRedStone);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(ThirdRedStone.class).stoneObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        entity.add(new StatusComponent());
        return entity;
    }

    public static Entity loadFourthRedStone(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox stoneBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Red_Stone.g3dj"));
        Model stoneModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        stoneModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(stoneModel, x, y, z);
        entity.add(modelComponent);
        stoneModel.calculateBoundingBox(stoneBounds);
        FourthRedStone fourthRedStone = new FourthRedStone();
        fourthRedStone.stoneObject = new btPairCachingGhostObject();
        fourthRedStone.stoneObject.setWorldTransform(modelComponent.instance.transform);
        fourthRedStone.stoneShape = new btCapsuleShape(stoneBounds.getWidth(), stoneBounds.getHeight());
        fourthRedStone.stoneObject.setCollisionShape(fourthRedStone.stoneShape);
        fourthRedStone.stoneObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        fourthRedStone.stoneObject.userData = entity;
        entity.add(fourthRedStone);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(FourthRedStone.class).stoneObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        entity.add(new StatusComponent());
        return entity;
    }


    public static Entity loadDoor(BulletSystem bulletSystem, float x, float y, float z){
        BoundingBox doorBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/door.g3dj"));
        Model doorModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        doorModel.calculateTransforms();
        ModelComponent altarModelComponent = new ModelComponent(doorModel, x,y,z);
        entity.add(altarModelComponent);
        doorModel.calculateBoundingBox(doorBounds);
        DoorComponent doorComponent = new DoorComponent();
        doorComponent.doorObject = new btPairCachingGhostObject();
        doorComponent.doorObject.setWorldTransform(altarModelComponent.instance.transform);
        doorComponent.doorShape = new btBoxShape(new Vector3(doorBounds.getWidth() / 2, doorBounds.getHeight() / 2, doorBounds.getDepth()));
        doorComponent.doorObject.setCollisionShape(doorComponent.doorShape);
        doorComponent.doorObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        doorComponent.doorObject.userData = entity;
        entity.add(doorComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(DoorComponent.class).doorObject,
                        (short)
                                btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                        (short)
                                (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        entity.add(new StatusComponent());
        return entity;
    }

    public static Entity loadHouseDoor(BulletSystem bulletSystem, float x, float y, float z){
        BoundingBox doorBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/HouseDoor.g3dj"));
        Model houseDoorModel = new Model(modelData, new TextureProvider.FileTextureProvider());

        houseDoorModel.calculateTransforms();
        houseDoorComponent = new ModelComponent(houseDoorModel, x,y,z);
//        altarModelComponent.instance.transform.setToRotation(0,0,0,180);
        entity.add(houseDoorComponent);
        houseDoorModel.calculateBoundingBox(doorBounds);
        DoorComponent doorComponent = new DoorComponent();
        doorComponent.doorObject = new btPairCachingGhostObject();
        doorComponent.doorObject.setWorldTransform(houseDoorComponent.instance.transform);
        doorComponent.doorShape = new btBoxShape(new Vector3(doorBounds.getWidth() / 2, doorBounds.getHeight() / 2, doorBounds.getDepth()));
        doorComponent.doorObject.setCollisionShape(doorComponent.doorShape);
        doorComponent.doorObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        doorComponent.doorObject.userData = entity;
        entity.add(doorComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(DoorComponent.class).doorObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        entity.add(new StatusComponent());
        return entity;
    }


    public static Entity loadAltar(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox altarBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/altar.g3dj"));
        Model altarModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        altarModel.calculateTransforms();
        altarModelComponent = new ModelComponent(altarModel, x, y, z);
        entity.add(altarModelComponent);
        altarModel.calculateBoundingBox(altarBounds);
        AltarComponent altarComponent = new AltarComponent();
        altarComponent.altarObject = new btPairCachingGhostObject();
        altarComponent.altarObject.setWorldTransform(altarModelComponent.instance.transform);
        altarComponent.altarShape = new btCapsuleShape(altarBounds.getWidth() / 2, altarBounds.getHeight() / 2);
        altarComponent.altarObject.setCollisionShape(altarComponent.altarShape);
        altarComponent.altarObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        altarComponent.altarObject.userData = entity;
        entity.add(altarComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(AltarComponent.class).altarObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }

    public static Entity loadJarOfWater(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox jarOfWaterBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/jar.g3dj"));
        Model jarOfWaterModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        jarOfWaterModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(jarOfWaterModel, x, y, z);
        entity.add(modelComponent);
        jarOfWaterModel.calculateBoundingBox(jarOfWaterBounds);
        JarOfWaterComponent jarOfWaterComponent = new JarOfWaterComponent();
        jarOfWaterComponent.jarOfWaterObject = new btPairCachingGhostObject();
        jarOfWaterComponent.jarOfWaterObject.setWorldTransform(modelComponent.instance.transform);
        jarOfWaterComponent.jarOfWaterShape = new btCapsuleShape(jarOfWaterBounds.getWidth() / 2, jarOfWaterBounds.getHeight() / 2);
        jarOfWaterComponent.jarOfWaterObject.setCollisionShape(jarOfWaterComponent.jarOfWaterShape);
        jarOfWaterComponent.jarOfWaterObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        jarOfWaterComponent.jarOfWaterObject.userData = entity;
        entity.add(jarOfWaterComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(JarOfWaterComponent.class).jarOfWaterObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }

    public static Entity loadCap(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox capBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/cap.g3dj"));
        Model capModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        capModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(capModel, x, y, z);
        entity.add(modelComponent);
        capModel.calculateBoundingBox(capBounds);
        CapComponent capComponent = new CapComponent();
        capComponent.capObject = new btPairCachingGhostObject();
        capComponent.capObject.setWorldTransform(modelComponent.instance.transform);
        capComponent.capShape = new btCapsuleShape(capBounds.getWidth() / 2, capBounds.getHeight() / 2);
        capComponent.capObject.setCollisionShape(capComponent.capShape);
        capComponent.capObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        capComponent.capObject.userData = entity;
        entity.add(capComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(CapComponent.class).capObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }

    public static Entity loadSash(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox sashBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/sash.g3dj"));
        Model sashModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        sashModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(sashModel, x, y, z);
        entity.add(modelComponent);
        sashModel.calculateBoundingBox(sashBounds);
        SashComponent sashComponent = new SashComponent();
        sashComponent.sashObject = new btPairCachingGhostObject();
        sashComponent.sashObject.setWorldTransform(modelComponent.instance.transform);
        sashComponent.sashShape = new btCapsuleShape(sashBounds.getWidth() / 2, sashBounds.getHeight() / 2);
        sashComponent.sashObject.setCollisionShape(sashComponent.sashShape);
        sashComponent.sashObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        sashComponent.sashObject.userData = entity;
        entity.add(sashComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(SashComponent.class).sashObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }

    public static Entity loadCoat(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox coatBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/coat.g3dj"));
        Model coatModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        coatModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(coatModel, x, y, z);
        entity.add(modelComponent);
        coatModel.calculateBoundingBox(coatBounds);
        CoatComponent coatComponent = new CoatComponent();
        coatComponent.coatObject = new btPairCachingGhostObject();
        coatComponent.coatObject.setWorldTransform(modelComponent.instance.transform);
        coatComponent.coatShape = new btCapsuleShape(coatBounds.getWidth() / 2, coatBounds.getHeight() / 2);
        coatComponent.coatObject.setCollisionShape(coatComponent.coatShape);
        coatComponent.coatObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        coatComponent.coatObject.userData = entity;
        entity.add(coatComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(CoatComponent.class).coatObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }

    public static Entity loadStaff(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox itemBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/staff.g3dj"));
        Model itemModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        itemModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(itemModel, x, y, z);
        entity.add(modelComponent);
        itemModel.calculateBoundingBox(itemBounds);
        StaffComponent staffComponent = new StaffComponent();
        staffComponent.staffObject = new btPairCachingGhostObject();
        staffComponent.staffObject.setWorldTransform(modelComponent.instance.transform);
        staffComponent.staffShape = new btCapsuleShape(itemBounds.getWidth() / 2, itemBounds.getHeight() / 2);
        staffComponent.staffObject.setCollisionShape(staffComponent.staffShape);
        staffComponent.staffObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        staffComponent.staffObject.userData = entity;
        entity.add(staffComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(StaffComponent.class).staffObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }


    public static Entity loadLargeStonesOne(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox stoneBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/medium_stone.g3dj"));
        Model stoneModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        stoneModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(stoneModel, x, y, z);
        entity.add(modelComponent);
        stoneModel.calculateBoundingBox(stoneBounds);
        LargeStonesOneComponent stone = new LargeStonesOneComponent();
        stone.stoneObject = new btPairCachingGhostObject();
        stone.stoneObject.setWorldTransform(modelComponent.instance.transform);
        stone.stoneShape = new btCapsuleShape(stoneBounds.getWidth(), stoneBounds.getHeight());
        stone.stoneObject.setCollisionShape(stone.stoneShape);
        stone.stoneObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        stone.stoneObject.userData = entity;
        entity.add(stone);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(LargeStonesOneComponent.class).stoneObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }

    public static Entity loadLargeStonesTwo(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox stoneBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/medium_stone.g3dj"));
        Model stoneModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        stoneModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(stoneModel, x, y, z);
        entity.add(modelComponent);
        stoneModel.calculateBoundingBox(stoneBounds);
        LargeStonesTwoComponent stone = new LargeStonesTwoComponent();
        stone.stoneObject = new btPairCachingGhostObject();
        stone.stoneObject.setWorldTransform(modelComponent.instance.transform);
        stone.stoneShape = new btCapsuleShape(stoneBounds.getWidth(), stoneBounds.getHeight());
        stone.stoneObject.setCollisionShape(stone.stoneShape);
        stone.stoneObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        stone.stoneObject.userData = entity;
        entity.add(stone);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(LargeStonesTwoComponent.class).stoneObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }

    public static Entity loadPlaster(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox plasterBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/jar_plaster.g3dj"));
        Model stoneModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        stoneModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(stoneModel, x, y, z);
        entity.add(modelComponent);
        stoneModel.calculateBoundingBox(plasterBounds);
        PlasterComponent stone = new PlasterComponent();
        stone.plasterObject = new btPairCachingGhostObject();
        stone.plasterObject.setWorldTransform(modelComponent.instance.transform);
        stone.plasterShape = new btCapsuleShape(plasterBounds.getWidth(), plasterBounds.getHeight());
        stone.plasterObject.setCollisionShape(stone.plasterShape);
        stone.plasterObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        stone.plasterObject.userData = entity;
        entity.add(stone);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(PlasterComponent.class).plasterObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }

    public static Entity loadLargeStone(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox stoneBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/Large_Stone.g3dj"));
        Model stoneModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        stoneModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(stoneModel, x, y, z);
        entity.add(modelComponent);
        stoneModel.calculateBoundingBox(stoneBounds);
        LargeStoneComponent stone = new LargeStoneComponent();
        stone.stoneObject = new btPairCachingGhostObject();
        stone.stoneObject.setWorldTransform(modelComponent.instance.transform);
        stone.stoneShape = new btCapsuleShape(stoneBounds.getWidth(), stoneBounds.getHeight());
        stone.stoneObject.setCollisionShape(stone.stoneShape);
        stone.stoneObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        stone.stoneObject.userData = entity;
        entity.add(stone);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(LargeStoneComponent.class).stoneObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }

    public static Entity loadCampFire(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox fireBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/fireeeee.g3dj"));
        Model fireModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        fireModel.calculateTransforms();
        fireComponent = new ModelComponent(fireModel, x, y, z);
        entity.add(fireComponent);
        fireModel.calculateBoundingBox(fireBounds);
        CampFireComponent campFireComponent = new CampFireComponent();
        campFireComponent.fireObject = new btPairCachingGhostObject();
        campFireComponent.fireObject.setWorldTransform(fireComponent.instance.transform);
        campFireComponent.fireShape = new btCapsuleShape(fireBounds.getWidth() / 2, fireBounds.getHeight() / 2);
        campFireComponent.fireObject.setCollisionShape(campFireComponent.fireShape);
        campFireComponent.fireObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        campFireComponent.fireObject.userData = entity;
        entity.add(campFireComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(CampFireComponent.class).fireObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));

        return entity;
    }

    public static Entity loadWell(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox wellBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/well.g3dj"));
        Model wellModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        wellModel.calculateTransforms();
        ModelComponent modelComponent = new ModelComponent(wellModel, x, y, z);
        entity.add(modelComponent);
        wellModel.calculateBoundingBox(wellBounds);
        WellComponent wellComponent = new WellComponent();
        wellComponent.wellObject = new btPairCachingGhostObject();
        wellComponent.wellObject.setWorldTransform(modelComponent.instance.transform);
        wellComponent.wellShape = new btCapsuleShape(wellBounds.getWidth() / 2, wellBounds.getHeight() / 2);
        wellComponent.wellObject.setCollisionShape(wellComponent.wellShape);
        wellComponent.wellObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        wellComponent.wellObject.userData = entity;
        entity.add(wellComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(WellComponent.class).wellObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));

        return entity;
    }

    public static Entity loadArrow(float x, float y, float z){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/arrow.g3dj"));
        Model arrowModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        arrowModel.calculateTransforms();
        arrowPointerComponent = new ModelComponent(arrowModel, x, y, z);
        entity.add(arrowPointerComponent);
        ArrowComponent arrowComponent = new ArrowComponent();
        arrowComponent.arrowObjet = new btPairCachingGhostObject();
        arrowComponent.arrowObjet.setWorldTransform(arrowPointerComponent.instance.transform);
        arrowComponent.arrowObjet.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        arrowComponent.arrowObjet.userData = entity;
        entity.add(arrowComponent);

        return entity;
    }

    public static Entity loadPortalLeft(float x, float y, float z){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/cave_entrance.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);

        model.calculateTransforms();

        portalComponentLeft = new ModelComponent(model, x,y,z);
        entity.add(portalComponentLeft);


        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(portalComponentLeft.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;
    }

    public static Entity loadPortalRight(float x, float y, float z){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/cave_entrance.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), 180);

        model.calculateTransforms();

        portalComponentRight = new ModelComponent(model, x,y,z);
        entity.add(portalComponentRight);


        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(portalComponentRight.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;
    }

    public static Entity loadPortalTop(float x, float y, float z){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/cave_entrance.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), -90);

        model.calculateTransforms();

        portalComponentTop = new ModelComponent(model, x,y,z);
        entity.add(portalComponentTop);


        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(portalComponentTop.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;
    }

    public static Entity loadPortalBottom(float x, float y, float z){

        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/cave_entrance.g3dj"));
        Model model = new Model(modelData, new TextureProvider.FileTextureProvider());
        for (Node node : model.nodes) node.rotation.set(new Vector3(0,90,0), -90);

        model.calculateTransforms();

        portalComponentBottom = new ModelComponent(model, x,y,z);
        entity.add(portalComponentBottom);


        BulletComponent bulletComponent = new BulletComponent();
        btCollisionShape shape = Bullet.obtainStaticNodeShape( model.nodes);
        bulletComponent.bodyInfo = new btRigidBody.btRigidBodyConstructionInfo(0, null, shape, Vector3.Zero);

        bulletComponent.body = new btRigidBody(bulletComponent.bodyInfo);
        bulletComponent.body.userData = entity;
        bulletComponent.motionState = new MotionState(portalComponentBottom.instance.transform);
        ((btRigidBody) bulletComponent.body).setMotionState(bulletComponent.motionState);
        entity.add(bulletComponent);
        return entity;
    }


    public static Entity loadWoodenPole(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox woodBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/woodenpole.g3dj"));
        Model woodModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        woodModel.calculateTransforms();
        woodenPoleComponent = new ModelComponent(woodModel, x, y, z);
        entity.add(woodenPoleComponent);
        woodModel.calculateBoundingBox(woodBounds);

        WoodenPoleComponent woodComponent = new WoodenPoleComponent();
        woodComponent.woodenPoleObject = new btPairCachingGhostObject();
        woodComponent.woodenPoleObject.setWorldTransform(woodenPoleComponent.instance.transform);
        woodComponent.woodenPoleShape = new btCapsuleShape(woodBounds.getWidth() / 2, woodBounds.getHeight() / 2);
        woodComponent.woodenPoleObject.setCollisionShape(woodComponent.woodenPoleShape);
        woodComponent.woodenPoleObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        woodComponent.woodenPoleObject.userData = entity;
        entity.add(woodComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(WoodenPoleComponent.class).woodenPoleObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }

    public static Entity loadFlintKnife(BulletSystem bulletSystem, float x, float y, float z){

        BoundingBox knifeBounds = new BoundingBox();
        Entity entity = new Entity();
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/flint_knives.g3dj"));
        Model knifeModel = new Model(modelData, new TextureProvider.FileTextureProvider());
        knifeModel.calculateTransforms();
        flintKnifeComponent = new ModelComponent(knifeModel, x, y, z);
        entity.add(flintKnifeComponent);
        knifeModel.calculateBoundingBox(knifeBounds);

        ObjectComponents knifeComponent = new ObjectComponents();
        knifeComponent.flintKnifeObject = new btPairCachingGhostObject();
        knifeComponent.flintKnifeObject.setWorldTransform(flintKnifeComponent.instance.transform);
        knifeComponent.flintKnifeShape = new btCapsuleShape(knifeBounds.getWidth() / 2, knifeBounds.getHeight() / 2);
        knifeComponent.flintKnifeObject.setCollisionShape(knifeComponent.flintKnifeShape);
        knifeComponent.flintKnifeObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        knifeComponent.flintKnifeObject.userData = entity;
        entity.add(knifeComponent);
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(ObjectComponents.class).flintKnifeObject,
                (short)
                        btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short)
                        (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        return entity;
    }

}
