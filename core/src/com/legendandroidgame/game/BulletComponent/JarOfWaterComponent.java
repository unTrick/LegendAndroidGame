package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.physics.bullet.collision.btCapsuleShape;
import com.badlogic.gdx.physics.bullet.collision.btPairCachingGhostObject;

/**
 * Created by Patrick on 10/21/2017.
 */
public class JarOfWaterComponent implements Component{
    public btCapsuleShape jarOfWaterShape;
    public btPairCachingGhostObject jarOfWaterObject;
}
