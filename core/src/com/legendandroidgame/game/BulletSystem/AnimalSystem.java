package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.*;
import com.badlogic.ashley.utils.ImmutableArray;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletTools.AnimalsEntityFactory;

/**
 * Created by Patrick on 1/17/2018.
 */
public class AnimalSystem extends EntitySystem implements EntityListener {

    private ImmutableArray<Entity> entities;
    private Entity player;
    private Quaternion quat = new Quaternion();
    private Engine engine;
    private BulletSystem bulletSystem;
    public Entity ram;

    private AnimationComponent ramAnimation;


    ComponentMapper<AnimalsComponent> cm = ComponentMapper.getFor(AnimalsComponent.class);

    public AnimalSystem(BulletSystem bulletSystem) {

        this.bulletSystem = bulletSystem;
        ram = AnimalsEntityFactory.createRamAnimal(bulletSystem, -56.49538f,4.6279187f,-4.847444f);
        ramAnimation = new AnimationComponent(AnimalsEntityFactory.ramComponent.instance);

    }
    @Override
    public void addedToEngine(Engine e) {
        entities = e.getEntitiesFor(Family.all(AnimalComponent.class, AnimalsComponent.class).get());
        e.addEntityListener(Family.one(PlayerComponent.class).get(), this);
        this.engine = e;
    }
    public void update(float delta) {
        if (entities.size() < 1){
            engine.addEntity(ram);
        }

        for (Entity e : entities) {
            ModelComponent mod = e.getComponent(ModelComponent.class);
            ModelComponent playerModel = player.getComponent(ModelComponent.class);
            Vector3 playerPosition = new Vector3();
            Vector3 ramPosition = new Vector3();
            playerPosition = playerModel.instance.transform.getTranslation(playerPosition);
            ramPosition = mod.instance.transform.getTranslation(ramPosition);
            float dX = playerPosition.x - ramPosition.x;
            float dZ = playerPosition.z - ramPosition.z;

            float dXS = 0 - ramPosition.x;
            float dZS = 0 - ramPosition.z;

            float theta;
            Quaternion rot;

            if((playerPosition.x - ramPosition.x) <= 10 && (playerPosition.x - ramPosition.x) >= -10
                    && (playerPosition.z - ramPosition.z) <= 10 && (playerPosition.z - ramPosition.z) >= -10){

                theta = (float) (Math.atan2(dX, dZ));
                rot = quat.setFromAxis(0, 1, 0, (float) Math.toDegrees(theta));
                cm.get(e).ramDirection.set(-1, 0, 0).rot(mod.instance.transform);
                cm.get(e).ramWalkDirection.set(0, 0, 0);
                cm.get(e).ramWalkDirection.add(0);
                cm.get(e).ramWalkDirection.scl(3f * delta);
                cm.get(e).ramController.setWalkDirection(cm.get(e).ramWalkDirection);

//                System.out.println("true");
//                playerAnimation.animate("Armature|Stand",-1,1);
//                ramAnimation.animate("Armature.001|ArmatureAction.001",1,1);


            }
            else {

                Vector3 lakad = cm.get(e).ramDirection;

                theta = (float) (Math.atan2(dX, dZ));
//                rot = quat.setFromAxis(0, 1, 0, (float) Math.toDegrees(theta) + 90);
                rot = quat.setFromAxis(0, 1, 0, (float) Math.toDegrees(theta));
                cm.get(e).ramDirection.set(-1, 0, 0).rot(mod.instance.transform);
                cm.get(e).ramWalkDirection.set(0, 0, 0);
                cm.get(e).ramWalkDirection.add(0);
                cm.get(e).ramWalkDirection.scl(3f * delta);
                cm.get(e).ramController.setWalkDirection(cm.get(e).ramWalkDirection);

//                System.out.println(mod.instance.transform);
                ramAnimation.animate("Armature.001|Walk.001",-1,1);

                /*
                theta  = (float) (Math.atan2(dX, dZ));
                rot = quat.setFromAxis(0, 1, 0, (float) Math.toDegrees(theta) + 90);
                cm.get(e).characterDirection.set(-1, 0, 0).rot(mod.instance.transform);
                cm.get(e).walkDirection.set(0, 0, 0);
                cm.get(e).walkDirection.add(cm.get(e).characterDirection);
                cm.get(e).walkDirection.scl(3f * delta);
                cm.get(e).characterController.setWalkDirection(cm.get(e).walkDirection);
                playerAnimation.animate("Armature|Walk",-1,1);*/
            }

            // Walk
            Matrix4 ghost = new Matrix4();
            Vector3 translation = new Vector3();
            cm.get(e).ramObject.getWorldTransform(ghost);
            ghost.getTranslation(translation);

//            mod.instance.transform.setToTranslation(translation.x - translation.x, translation.y, translation.z- translation.z);

            mod.instance.transform.set(translation.x, translation.y, translation.z, rot.x, rot.y, rot.z, rot.w);

            ramAnimation.update(delta);

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
