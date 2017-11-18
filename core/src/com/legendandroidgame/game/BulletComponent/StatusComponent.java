package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;

/**
 * Created by Patrick on 9/22/2017.
 */
public class StatusComponent implements Component {
    public boolean alive;
    public StatusComponent(){
        alive = true;
    }

}
