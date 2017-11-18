package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;

/**
 * Created by Patrick on 11/9/2017.
 */
public class InstructorComponent implements Component {

    public enum STATE {
        IDLE,
        INSTRUCTTHEWELL
    }
    public InstructorComponent.STATE state = STATE.IDLE;

    public InstructorComponent(STATE state){
        this.state = state;
    }

}
