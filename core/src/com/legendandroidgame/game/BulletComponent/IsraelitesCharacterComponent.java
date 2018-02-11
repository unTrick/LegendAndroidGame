package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.collision.btCapsuleShape;
import com.badlogic.gdx.physics.bullet.collision.btPairCachingGhostObject;
import com.badlogic.gdx.physics.bullet.dynamics.btKinematicCharacterController;

/**
 * Created by Patrick on 1/21/2018.
 */
public class IsraelitesCharacterComponent implements Component {
    public btCapsuleShape israelitesShape;
    public btPairCachingGhostObject israelitestObject;
    public btKinematicCharacterController characterController;

    public Vector3 characterDirection = new Vector3();
    public Vector3 walkDirection = new Vector3();
}
