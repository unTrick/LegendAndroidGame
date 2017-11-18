package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.physics.bullet.collision.btCapsuleShape;
import com.badlogic.gdx.physics.bullet.collision.btPairCachingGhostObject;

/**
 * Created by Patrick on 9/29/2017.
 */
public class SecondRedStone implements Component {
    public btCapsuleShape stoneShape;
    public btPairCachingGhostObject stoneObject;
}
