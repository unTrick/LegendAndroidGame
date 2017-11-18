package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;

/**
 * Created by Patrick on 10/3/2017.
 */
public class SaraiComponent implements Component {
    public enum STATE {
        IDLE,
        WALKING
    }
    public STATE state = STATE.IDLE;
    public SaraiComponent(STATE state){
        this.state = state;
    }
}
