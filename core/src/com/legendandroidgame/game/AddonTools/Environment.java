package com.legendandroidgame.game.AddonTools;

import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;

/**
 * Created by Patrick on 11/14/2017.
 */
public class Environment {

    public com.badlogic.gdx.graphics.g3d.Environment environment;


    public Environment(){
        //        shadowLight = new DirectionalShadowLight(1024 * 5, 1024 * 5,200f, 200f, 1f, 300f);
        environment = new com.badlogic.gdx.graphics.g3d.Environment();
//        environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.5f, 0.5f, 0.5f, 1f));
////        environment.add(new SpotLight().setColor(Color.WHITE));
////        environment.add(new SpotLight().setDirection(new Vector3(-1f, -0.8f, -0.2f)));
//        shadowLight.set(0.5f, 0.5f, 0.5f, 0, -0.1f, 0);
//        environment.add(shadowLight);
//        environment.shadowMap = shadowLight;
//        environment.add(new DirectionalLight().set(0.8f, 0.8f, 0.8f, -1f, -0.1f, -0.2f));


//        Vector3 sun = new Vector3(-6, 14, 6);

        environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.4f, 0.4f, 0.4f, 1.f));
//        environment.set(new ColorAttribute(ColorAttribute.Fog, .3f, .55f, 1, 1));
        environment.add(new DirectionalLight().set(.3f, .3f, .3f, -2f, 0.6f, .8f));
        environment.add(new DirectionalLight().set(1f, 1f, 1f, .2f, -0.6f, -.8f));
//        environment.add(new PointLight().set(1, 1, 1, sun, 200));
    }

    public void dispose(){
        environment.clear();
    }
}
