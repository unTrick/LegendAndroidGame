package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;

/**
 * Created by Patrick on 10/21/2017.
 */
public class AaronComponent implements Component {
    public enum STATE {
        IDLE,
        WALKING
    }
    public AaronComponent.STATE state = STATE.IDLE;
    public AaronComponent(STATE state){
        this.state = state;
    }
}
