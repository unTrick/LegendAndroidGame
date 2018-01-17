package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;

/**
 * Created by Patrick on 1/17/2018.
 */
public class AnimalComponent  implements Component {

    public enum STATE {
        IDLE,
        WALKING
    }

    public AnimalComponent.STATE state = AnimalComponent.STATE.IDLE;
    public AnimalComponent(AnimalComponent.STATE state){
        this.state = state;
    }
}
