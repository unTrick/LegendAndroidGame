package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.physics.bullet.collision.btCapsuleShape;
import com.badlogic.gdx.physics.bullet.collision.btPairCachingGhostObject;

/**
 * Created by Patrick on 11/5/2017.
 */
public class WellComponent implements Component {
    public btCapsuleShape wellShape;
    public btPairCachingGhostObject wellObject;
}
