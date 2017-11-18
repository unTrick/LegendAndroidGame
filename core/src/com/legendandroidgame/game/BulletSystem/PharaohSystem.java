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

import java.util.Random;

/**
 * Created by Patrick on 10/21/2017.
 */
public class PharaohSystem extends EntitySystem implements EntityListener {

    private ImmutableArray<Entity> entities;
    private Entity player;
    private Quaternion quat = new Quaternion();
    private Engine engine;
    private BulletSystem bulletSystem;
    private Entity pharaoh;

    public Boolean canTalk = false;

    public AnimationComponent playerAnimation;

    ComponentMapper<PharaohCharacterComponent> cm = ComponentMapper.getFor(PharaohCharacterComponent.class);

    public PharaohSystem(BulletSystem bulletSystem) {

        this.bulletSystem = bulletSystem;
        pharaoh = CharacterEntityFactory.createPharaohCharacter(bulletSystem, 30,10,-91);

    }
    @Override
    public void addedToEngine(Engine e) {
        entities = e.getEntitiesFor(Family.all(PharaohComponent.class, PharaohCharacterComponent.class).get());
        e.addEntityListener(Family.one(PlayerComponent.class).get(), this);
        this.engine = e;
    }
    public void update(float delta) {
        if (entities.size() < 1) {
            Random random = new Random();
            engine.addEntity(CharacterEntityFactory.createPharaohCharacter(bulletSystem,
                    random.nextInt(40) - 20, 10, random.nextInt(40) - 20));
        }
        for (Entity e : entities) {
            ModelComponent mod = e.getComponent(ModelComponent.class);
            ModelComponent playerModel = player.getComponent(ModelComponent.class);
            Vector3 playerPosition = new Vector3();
            Vector3 pharaoPosistion = new Vector3();
            playerPosition = playerModel.instance.transform.getTranslation(playerPosition);
            pharaoPosistion = mod.instance.transform.getTranslation(pharaoPosistion);
            float dX = playerPosition.x - pharaoPosistion.x;
            float dZ = playerPosition.z - pharaoPosistion.z;

            float dXS = 0 - pharaoPosistion.x;
            float dZS = 0 - pharaoPosistion.z;

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

            if((playerPosition.x - pharaoPosistion.x) <= 10 && (playerPosition.x - pharaoPosistion.x) >= -10
                    && (playerPosition.z - pharaoPosistion.z) <= 10 && (playerPosition.z - pharaoPosistion.z) >= -10){
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

//                System.out.println("true");
//            playerAnimation.animate("Armature|Stand",-1,1);


            // Walk
            Matrix4 ghost = new Matrix4();
            Vector3 translation = new Vector3();
            cm.get(e).ghostObject.getWorldTransform(ghost);
            ghost.getTranslation(translation);

//            mod.instance.transform.setToTranslation(translation.x - translation.x, translation.y, translation.z- translation.z);

            mod.instance.transform.set(new Vector3(translation.x,translation.y,translation.z),
                    new Quaternion( new Vector3(0, -45, 0), 90));



            if(Gdx.input.isKeyJustPressed(Input.Keys.Z)){
                System.out.println("this is x: " + (playerPosition.x - pharaoPosistion.x));
                System.out.println("this is z: " + (playerPosition.z - pharaoPosistion.z));
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
