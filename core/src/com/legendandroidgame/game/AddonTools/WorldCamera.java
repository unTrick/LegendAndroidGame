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
//    public Vector3 lookAt = new Vector3(956,657,899);
    public Vector3 lookAt = new Vector3(956,657,899);
    private int clickCount = 0;

    public WorldCamera(){

        worldCam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        worldCam.setToOrtho(false,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        worldCam.position.set(0f,1500f,0f);
        worldCam.lookAt(lookAt.x,lookAt.y,lookAt.z);
//        worldCam.lookAt(0,0,0);
        worldCam.near = 1f;
        worldCam.far = 2850f;

        if(clickCount == 0){
            worldCam.zoom = 0.06f;
        }


        worldCam.update();

    }

    public void update(){

        System.out.println(lookAt);
//        worldCam.update();
        if(Gdx.input.isKeyJustPressed(Input.Keys.C)){

            if(clickCount == 3){
                clickCount = 0;
            }
            else {
                clickCount += 1;
            }
        }

//        System.out.println(worldCam.position);

        if(Gdx.input.isKeyPressed(Input.Keys.X)){
//            worldCam.position.y += 100;
            lookAt.x += 10;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.Z)){
//            worldCam.position.y -= 100;
            lookAt.x -= 10;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.B)){
//            worldCam.position.y += 100;
            lookAt.z += 10;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.H)){
//            worldCam.position.y -= 100;
            lookAt.z -= 10;
        }

//        worldCam.lookAt(lookAt);

        switch (clickCount){
            case 0: worldCam.zoom = 0.06f;
                break;
            case 1: worldCam.zoom = 0.2f;
                break;
            case 2: worldCam.zoom = .5f;
                break;
            case 3: worldCam.zoom = 0.03f;
                break;
        }


    }
}
