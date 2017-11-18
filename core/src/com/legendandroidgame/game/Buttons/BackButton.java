package com.legendandroidgame.game.Buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * Created by Patrick on 5/2/2017.
 */
public class BackButton {

    private Stage stage;
    private ImageButton btnBack;
    private Texture close;

    private Table table;


    public BackButton(){

        stage = new Stage();

        if(Gdx.graphics.getWidth() > 1800){
            close = new Texture("1080/button/close.png");
        }
        else{
            close = new Texture("720/button/close.png");
        }

        Drawable backDraw = new TextureRegionDrawable(new TextureRegion(close));
        btnBack = new ImageButton(backDraw);

        table = new Table();
        table.setFillParent(true);
        table.top().right();

        table.add(btnBack).width(100).padRight(100).padTop(20);
    }

    public Stage getStage() {
        return stage;
    }

    public ImageButton getBtnBack() {
        return btnBack;
    }

    public Table getTable() {
        return table;
    }
}
