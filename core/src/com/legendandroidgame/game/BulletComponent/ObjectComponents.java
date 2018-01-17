package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.physics.bullet.collision.btCapsuleShape;
import com.badlogic.gdx.physics.bullet.collision.btPairCachingGhostObject;

/**
 * Created by Patrick on 1/17/2018.
 */
public class ObjectComponents implements Component {
    public btCapsuleShape flintKnifeShape;

    public btPairCachingGhostObject flintKnifeObject;
}
