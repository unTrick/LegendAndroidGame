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
 * Created by Patrick on 10/21/2017.
 */
public class AaronSystem extends EntitySystem implements EntityListener {

    private ImmutableArray<Entity> entities;
    private Entity player;
    private Quaternion quat = new Quaternion();
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity lot;

    public Boolean canTalk = false;


    public AnimationComponent playerAnimation;


    ComponentMapper<AaronCharacterComponent> cm = ComponentMapper.getFor(AaronCharacterComponent.class);

    public AaronSystem(BulletSystem bulletSystem) {

        this.bulletSystem = bulletSystem;
        lot = CharacterEntityFactory.createLotCharacter(bulletSystem, -37,10,-10);



    }
    @Override
    public void addedToEngine(Engine e) {
        entities = e.getEntitiesFor(Family.all(AaronComponent.class, AaronCharacterComponent.class).get());
        e.addEntityListener(Family.one(PlayerComponent.class).get(), this);
        this.engine = e;
    }
    public void update(float delta) {
        if (entities.size() < 1) {
            Random random = new Random();
            engine.addEntity(CharacterEntityFactory.createAaronCharacter(bulletSystem,
                    random.nextInt(40) - 20, 10, random.nextInt(40) - 20));
        }
        for (Entity e : entities) {
            ModelComponent mod = e.getComponent(ModelComponent.class);
            ModelComponent playerModel = player.getComponent(ModelComponent.class);
            Vector3 playerPosition = new Vector3();
            Vector3 aaronPosition = new Vector3();
            playerPosition = playerModel.instance.transform.getTranslation(playerPosition);
            aaronPosition = mod.instance.transform.getTranslation(aaronPosition);
            float dX = playerPosition.x - aaronPosition.x;
            float dZ = playerPosition.z - aaronPosition.z;
            float dXS = 0 - aaronPosition.x;
            float dZS = 0 - aaronPosition.z;

            float theta = 0;
            Quaternion rot = new Quaternion();
            if((playerPosition.x - aaronPosition.x) <= 10 && (playerPosition.x - aaronPosition.x) >= -10
                    && (playerPosition.z - aaronPosition.z) <= 10 && (playerPosition.z - aaronPosition.z) >= -10){
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
