package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;

/**
 * Created by Patrick on 1/21/2018.
 */
public class IsraelitesComponent implements Component{
    public enum STATE {
        IDLE,
        WALKING
    }
    public IsraelitesComponent.STATE state = IsraelitesComponent.STATE.IDLE;
    public IsraelitesComponent(IsraelitesComponent.STATE state){
        this.state = state;
    }
}
