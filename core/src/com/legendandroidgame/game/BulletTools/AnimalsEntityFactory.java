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
import com.badlogic.gdx.physics.bullet.collision.btBroadphaseProxy;
import com.badlogic.gdx.physics.bullet.collision.btCapsuleShapeZ;
import com.badlogic.gdx.physics.bullet.collision.btCollisionObject;
import com.badlogic.gdx.physics.bullet.collision.btPairCachingGhostObject;
import com.badlogic.gdx.physics.bullet.dynamics.btKinematicCharacterController;
import com.badlogic.gdx.utils.JsonReader;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletSystem.BulletSystem;

/**
 * Created by Patrick on 1/17/2018.
 */
public class AnimalsEntityFactory {

    public static ModelComponent ramComponent;

    private static Model ramModel;

    public static Entity createRamAnimal(BulletSystem bulletSystem, float x, float y, float z) {
        ModelLoader<?> modelLoader = new G3dModelLoader(new JsonReader());
        ModelData modelData = modelLoader.loadModelData(Gdx.files.internal("blender/ram_keme.g3dj"));
        if (ramModel == null) {
            ramModel = new Model(modelData, new
                    TextureProvider.FileTextureProvider());
            ramModel.calculateTransforms();
        }

        BoundingBox ramBounds = new BoundingBox();
        ramModel.calculateBoundingBox(ramBounds);

        Entity entity = new Entity();
        ramComponent = new ModelComponent(ramModel, x, y, z);
        entity.add(ramComponent);

        AnimalsComponent ramAnimalComponent = new AnimalsComponent();
        ramAnimalComponent.ramObject = new btPairCachingGhostObject();
        ramAnimalComponent.ramObject.setWorldTransform(ramComponent.instance.transform);
        ramAnimalComponent.ramShape = new btCapsuleShapeZ(ramBounds.getHeight() / 4,ramBounds.getHeight() / 1.4f);
        ramAnimalComponent.ramObject.setCollisionShape(ramAnimalComponent.ramShape);
        ramAnimalComponent.ramObject.setCollisionFlags(btCollisionObject.CollisionFlags.CF_CHARACTER_OBJECT);
        ramAnimalComponent.ramController = new btKinematicCharacterController(ramAnimalComponent.ramObject, ramAnimalComponent.ramShape, 0.35f);
        ramAnimalComponent.ramObject.userData = entity;
        entity.add(ramAnimalComponent);
        ramAnimalComponent.ramController.setGravity(new Vector3(0,-30,0));
        bulletSystem.collisionWorld.addCollisionObject(entity.getComponent(AnimalsComponent.class).ramObject,
                (short) btBroadphaseProxy.CollisionFilterGroups.CharacterFilter,
                (short) (btBroadphaseProxy.CollisionFilterGroups.AllFilter));
        bulletSystem.collisionWorld.addAction(entity.getComponent(AnimalsComponent.class).ramController);
        entity.add(new AnimalComponent(AnimalComponent.STATE.IDLE));
        return entity;
    }
}
