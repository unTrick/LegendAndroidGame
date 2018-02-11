package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;

/**
 * Created by Patrick on 2/9/2018.
 */
public class KidIsaacComponent implements Component {
    public enum STATE {
        IDLE,
        WALKING
    }
    public KidIsaacComponent.STATE state = KidIsaacComponent.STATE.IDLE;
    public KidIsaacComponent(KidIsaacComponent.STATE state){
        this.state = state;
    }
}
