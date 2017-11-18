package com.legendandroidgame.game.BulletSystem;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.utils.ImmutableArray;
import com.legendandroidgame.game.BulletComponent.StatusComponent;

import java.util.Iterator;

/**
 * Created by Patrick on 9/4/2017.
 */
public class StatusSystem extends EntitySystem {
    private ImmutableArray<Entity> entities;
//    private BethelWorld gameWorld;

    public StatusSystem() {
//        this.gameWorld = gameWorld;
    }

    @Override
    public void addedToEngine(Engine engine) {
        entities = engine.getEntitiesFor(Family.all(StatusComponent.class).get());
    }

    @Override
    public void update(float deltaTime) {
        Iterator iterator = entities.iterator();
        while(iterator.hasNext()){
            Entity entity = (Entity) iterator.next();
            if(!entity.getComponent(StatusComponent.class).alive){
//                gameWorld.remove(entity); TODO NEED TO UPDATE or CHANGE
//                System.out.println("not alive");
            }
            else if(entity.getComponent(StatusComponent.class).alive){
//                System.out.println("alive");

            }
        }
    }
}
