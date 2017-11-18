package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;

/**
 * Created by Patrick on 10/21/2017.
 */
public class PharaohComponent implements Component {
    public enum STATE {
        IDLE,
        WALKING
    }
    public PharaohComponent.STATE state = STATE.IDLE;
    public PharaohComponent(STATE state){
        this.state = state;
    }
}
