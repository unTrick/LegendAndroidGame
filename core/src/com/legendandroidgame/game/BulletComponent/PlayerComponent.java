package com.legendandroidgame.game.BulletComponent;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 9/4/2017.
 */
public class PlayerComponent implements Component {
    //    public float energy;
//    public float oxygen;
    public float health;
    public static int score;
    public int energy;
    public String current = gameData.getString("current");

    public PlayerComponent() {
        energy = 1000;
//        oxygen = 100;
        health = gameData.getFloat(current + " health");
        score = 0;


    }

}
