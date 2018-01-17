package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.collision.btCapsuleShape;
import com.badlogic.gdx.physics.bullet.collision.btPairCachingGhostObject;
import com.badlogic.gdx.physics.bullet.dynamics.btKinematicCharacterController;

/**
 * Created by Patrick on 1/17/2018.
 */
public class AnimalsComponent implements Component{

    public btCapsuleShape ramShape;
    public btPairCachingGhostObject ramObject;
    public btKinematicCharacterController ramController;

    public Vector3 ramDirection = new Vector3();
    public Vector3 ramWalkDirection = new Vector3();
}
