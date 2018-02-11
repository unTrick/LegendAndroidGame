package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.*;
import com.badlogic.ashley.utils.ImmutableArray;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.legendandroidgame.game.BulletComponent.*;
import com.legendandroidgame.game.BulletTools.CharacterEntityFactory;
import com.legendandroidgame.game.BulletTools.ObjectEntityFactory;

import java.util.Random;

/**
 * Created by Patrick on 10/3/2017.
 */
public class SaraiSystem extends EntitySystem implements EntityListener {

    private ImmutableArray<Entity> entities;
    private Entity player;
    private Quaternion quat = new Quaternion();
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity sarai;

    public AnimationComponent playerAnimation;

    ComponentMapper<SaraiCharacterComponent> cm = ComponentMapper.getFor(SaraiCharacterComponent.class);

    public SaraiSystem(BulletSystem bulletSystem) {

        this.bulletSystem = bulletSystem;
        sarai = new Entity();

    }
    @Override
    public void addedToEngine(Engine e) {
        entities = e.getEntitiesFor(Family.all(SaraiComponent.class, SaraiCharacterComponent.class).get());
        e.addEntityListener(Family.one(PlayerComponent.class).get(), this);
        this.engine = e;
    }
    public void update(float delta) {
//        if (entities.size() < 1) {
//            Random random = new Random();
//            engine.addEntity(CharacterEntityFactory.createSaraiCharacter(bulletSystem,
//                            random.nextInt(40) - 20, 10, random.nextInt(40) - 20));
//        }
        for (Entity e : entities) {
            ModelComponent mod = e.getComponent(ModelComponent.class);
            ModelComponent playerModel = player.getComponent(ModelComponent.class);
            Vector3 playerPosition = new Vector3();
            Vector3 saraiPosition = new Vector3();
            playerPosition = playerModel.instance.transform.getTranslation(playerPosition);
            saraiPosition = mod.instance.transform.getTranslation(saraiPosition);
            float dX = playerPosition.x - saraiPosition.x;
            float dZ = playerPosition.z - saraiPosition.z;

            float dXS = 0 - saraiPosition.x;
            float dZS = 0 - saraiPosition.z;

            float theta;
            Quaternion rot;

            /*
            if(sarai.getComponent(SaraiComponent.class).state.equals(SaraiComponent.STATE.WALKING)){
                theta  = (float) (Math.atan2(dX, dZ));

            }
            else if(sarai.getComponent(SaraiComponent.class).state.equals(SaraiComponent.STATE.IDLE)){
                theta = (float) (Math.atan2(dXS, dZS));

            }
            else {
                theta = 0;
            }
            //Calculate the transforms

            if(sarai.getComponent(SaraiComponent.class).state.equals(SaraiComponent.STATE.WALKING)){
                rot = quat.setFromAxis(0, 1, 0, (float) Math.toDegrees(theta) + sara90);

            }
            else if(sarai.getComponent(SaraiComponent.class).state.equals(SaraiComponent.STATE.IDLE)){
                rot = quat.setFromAxis(0, 1, 0, (float) Math.toDegrees(theta));

            }
            else {
                rot = new Quaternion();
            }


            cm.get(e).characterDirection.set(-1, 0, 0).rot(mod.instance.transform);
            cm.get(e).walkDirection.set(0, 0, 0);
            if(sarai.getComponent(SaraiComponent.class).state.equals(SaraiComponent.STATE.WALKING)){
                cm.get(e).walkDirection.add(cm.get(e).characterDirection);

            }
            else if(sarai.getComponent(SaraiComponent.class).state.equals(SaraiComponent.STATE.IDLE)){
                cm.get(e).walkDirection.add(0);
            }
            cm.get(e).walkDirection.scl(3f * delta);
            cm.get(e).characterController.setWalkDirection(cm.get(e).walkDirection);
            */

            if((playerPosition.x - saraiPosition.x) <= 10 && (playerPosition.x - saraiPosition.x) >= -10
                    && (playerPosition.z - saraiPosition.z) <= 10 && (playerPosition.z - saraiPosition.z) >= -10){

                theta = (float) (Math.atan2(dXS, dZS));
                rot = quat.setFromAxis(0, 1, 0, (float) Math.toDegrees(theta));
                cm.get(e).characterDirection.set(-1, 0, 0).rot(mod.instance.transform);
                cm.get(e).walkDirection.set(0, 0, 0);
                cm.get(e).walkDirection.add(0);
                cm.get(e).walkDirection.scl(3f * delta);
                cm.get(e).characterController.setWalkDirection(cm.get(e).walkDirection);

//                System.out.println("true");
                playerAnimation.animate("Armature|ArmatureAction",-1,1);

            }
            else {

                theta = (float) (Math.atan2(dXS, dZS));
                rot = quat.setFromAxis(0, 1, 0, (float) Math.toDegrees(theta));
                cm.get(e).characterDirection.set(-1, 0, 0).rot(mod.instance.transform);
                cm.get(e).walkDirection.set(0, 0, 0);
                cm.get(e).walkDirection.add(0);
                cm.get(e).walkDirection.scl(3f * delta);
                cm.get(e).characterController.setWalkDirection(cm.get(e).walkDirection);

//                System.out.println("true");
                playerAnimation.animate("Armature|ArmatureAction",-1,1);

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
            cm.get(e).ghostObject.getWorldTransform(ghost);
            ghost.getTranslation(translation);

//            mod.instance.transform.setToTranslation(translation.x - translation.x, translation.y, translation.z- translation.z);

            mod.instance.transform.set(translation.x, translation.y, translation.z, rot.x, rot.y, rot.z, rot.w);



            if(Gdx.input.isKeyJustPressed(Input.Keys.Z)){
                System.out.println("this is x: " + (playerPosition.x - saraiPosition.x));
                System.out.println("this is z: " + (playerPosition.z - saraiPosition.z));
            }

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
