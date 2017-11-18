package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.utils.AnimationController;

/**
 * Created by Patrick on 9/12/2017.
 */
public class AnimationComponent implements Component {

    private AnimationController animationController;

    public AnimationComponent(ModelInstance instance) {
        animationController = new AnimationController(instance);
//        animationController.allowSameAnimation = true;
    }
    public void animate(final String id, final int loops, final int speed) {
        animationController.setAnimation(id, loops, speed, new AnimationController.AnimationListener() {
            @Override
            public void onEnd(AnimationController.AnimationDesc animation) {

            }

            @Override
            public void onLoop(AnimationController.AnimationDesc animation) {

            }
        });
    }
    public void update(float delta) {
        if(animationController != null){
            animationController.update(delta);
        }
    }

}
