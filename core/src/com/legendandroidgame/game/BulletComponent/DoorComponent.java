package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.physics.bullet.collision.btBoxShape;
import com.badlogic.gdx.physics.bullet.collision.btPairCachingGhostObject;

/**
 * Created by Patrick on 9/14/2017.
 */
public class DoorComponent implements Component {

    public btBoxShape doorShape;
    public btPairCachingGhostObject doorObject;

}
