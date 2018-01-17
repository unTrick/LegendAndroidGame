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
    private Entity ram;

    public AnimationComponent ramAnimation;


    ComponentMapper<AnimalsComponent> cm = ComponentMapper.getFor(AnimalsComponent.class);

    public AnimalSystem(BulletSystem bulletSystem) {

        this.bulletSystem = bulletSystem;
        ram = AnimalsEntityFactory.createRamAnimal(bulletSystem, -39.39078f,5.544506f,10.239446f);



    }
    @Override
    public void addedToEngine(Engine e) {
        entities = e.getEntitiesFor(Family.all(AnimalComponent.class, AnimalsComponent.class).get());
        e.addEntityListener(Family.one(PlayerComponent.class).get(), this);
        this.engine = e;
    }
    public void update(float delta) {
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

            float theta = 0;
            Quaternion rot = new Quaternion();
            if((playerPosition.x - ramPosition.x) <= 10 && (playerPosition.x - ramPosition.x) >= -10
                    && (playerPosition.z - ramPosition.z) <= 10 && (playerPosition.z - ramPosition.z) >= -10){

            }
            else {

            }

            theta = (float) (Math.atan2(dXS, dZS));
            rot = quat.setFromAxis(0, 1, 0, (float) Math.toDegrees(theta));
            cm.get(e).ramDirection.set(-1, 0, 0).rot(mod.instance.transform);
            cm.get(e).ramWalkDirection.set(0, 0, 0);
            cm.get(e).ramWalkDirection.add(0);
            cm.get(e).ramWalkDirection.scl(3f * delta);
            cm.get(e).ramController.setWalkDirection(cm.get(e).ramWalkDirection);

            // Walk
            Matrix4 ghost = new Matrix4();
            Vector3 translation = new Vector3();
            cm.get(e).ramObject.getWorldTransform(ghost);
            ghost.getTranslation(translation);
            mod.instance.transform.setToTranslation(translation.x - translation.x, translation.y, translation.z- translation.z);

            mod.instance.transform.set(new Vector3(translation.x,translation.y,translation.z),
                    new Quaternion( new Vector3(0, -45, 0), 90));
        }



    }
    @Override
    public void entityAdded(Entity entity) {
        player = entity;
    }
    @Override
    public void entityRemoved(Entity entity) {
    }

}
