package com.legendandroidgame.game.Inventory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 7/25/2017.
 */
public class Storage {

    String current = gameData.getString("current");
    private OrthographicCamera blenderCamera;
    private Vector3 position = new Vector3();
    private ImageButton bread, stone, knife;

    public Storage() {


    }



    public void update(float dt){
    }

    public void render(){

    }

    public void add(){

    }

    public void dispose(){

    }
}
