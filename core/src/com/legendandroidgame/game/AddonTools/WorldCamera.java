package com.legendandroidgame.game.AddonTools;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;


/**
 * Created by Patrick on 11/14/2017.
 */
public class WorldCamera {

    public OrthographicCamera worldCam;
    public Vector3 lookAt = new Vector3(956,657,899);

    public WorldCamera(){

        worldCam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        worldCam.setToOrtho(false,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        worldCam.position.set(0f,1500f,0f);
        worldCam.lookAt(lookAt.x,lookAt.y,lookAt.z);
//        worldCam.lookAt(0,0,0);
        worldCam.near = 1f;
        worldCam.far = 2850f;

        worldCam.zoom = 0.03f;

        worldCam.update();

    }

    public void update(){
    }
}
