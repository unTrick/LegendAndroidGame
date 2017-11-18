package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;

/**
 * Created by Patrick on 10/22/2017.
 */

public class NumbersGuyComponent implements Component {
    public enum STATE {
        IDLE,
        WALKING
    }
    public STATE state = STATE.IDLE;
    public NumbersGuyComponent(STATE state){
        this.state = state;
    }
}
