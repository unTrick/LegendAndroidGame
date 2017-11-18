package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.physics.bullet.collision.btCapsuleShape;
import com.badlogic.gdx.physics.bullet.collision.btPairCachingGhostObject;

/**
 * Created by Patrick on 10/22/2017.
 */
public class PlasterComponent implements Component {
    public btCapsuleShape plasterShape;
    public btPairCachingGhostObject plasterObject;
}
