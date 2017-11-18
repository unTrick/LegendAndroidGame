package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.*;
import com.badlogic.ashley.utils.ImmutableArray;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;

import java.util.Random;

/**
 * Created by Patrick on 10/22/2017.
 */
public class NumbersGuySystem extends EntitySystem implements EntityListener {

    private ImmutableArray<Entity> entities;
    private Entity player;
    private Quaternion quat = new Quaternion();
    private Engine engine;
    private BulletSystem bulletSystem;

    public Boolean canTalk = false;


    public AnimationComponent playerAnimation;


    ComponentMapper<NumbersGuyCharacterComponent> cm = ComponentMapper.getFor(NumbersGuyCharacterComponent.class);

    public NumbersGuySystem(BulletSystem bulletSystem) {

        this.bulletSystem = bulletSystem;



    }
    @Override
    public void addedToEngine(Engine e) {
        entities = e.getEntitiesFor(Family.all(NumbersGuyComponent.class, NumbersGuyCharacterComponent.class).get());
        e.addEntityListener(Family.one(PlayerComponent.class).get(), this);
        this.engine = e;
    }
    public void update(float delta) {
        if (entities.size() < 1) {
            Random random = new Random();
            engine.addEntity(CharacterEntityFactory.createNumbersGuy(bulletSystem,
                    random.nextInt(40) - 20, 10, random.nextInt(40) - 20));
        }
        for (Entity e : entities) {
            ModelComponent mod = e.getComponent(ModelComponent.class);
            ModelComponent playerModel = player.getComponent(ModelComponent.class);
            Vector3 playerPosition = new Vector3();
            Vector3 numbersGuyPosition = new Vector3();
            playerPosition = playerModel.instance.transform.getTranslation(playerPosition);
            numbersGuyPosition = mod.instance.transform.getTranslation(numbersGuyPosition);
            float dX = playerPosition.x - numbersGuyPosition.x;
            float dZ = playerPosition.z - numbersGuyPosition.z;
            float dXS = 0 - numbersGuyPosition.x;
            float dZS = 0 - numbersGuyPosition.z;

            float theta = 0;
            Quaternion rot;
            if((playerPosition.x - numbersGuyPosition.x) <= 10 && (playerPosition.x - numbersGuyPosition.x) >= -10
                    && (playerPosition.z - numbersGuyPosition.z) <= 10 && (playerPosition.z - numbersGuyPosition.z) >= -10){
                canTalk = true;
            }
            else {
                canTalk = false;
            }

            theta = (float) (Math.atan2(dXS, dZS));
            rot = quat.setFromAxis(0, 1, 0, (float) Math.toDegrees(theta));
            cm.get(e).characterDirection.set(-1, 0, 0).rot(mod.instance.transform);
            cm.get(e).walkDirection.set(0, 0, 0);
            cm.get(e).walkDirection.add(0);
            cm.get(e).walkDirection.scl(3f * delta);
            cm.get(e).characterController.setWalkDirection(cm.get(e).walkDirection);

            // Walk
            Matrix4 ghost = new Matrix4();
            Vector3 translation = new Vector3();
            cm.get(e).ghostObject.getWorldTransform(ghost);
            ghost.getTranslation(translation);
            mod.instance.transform.setToTranslation(translation.x - translation.x, translation.y, translation.z - translation.z);

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
