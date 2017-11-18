package com.legendandroidgame.game.Buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * Created by Patrick on 10/3/2017.
 */
public class CutSceneButtons {

    private Stage stage;
    private Texture skipTex, continueTex;
    public ImageButton skipBtn, continueBtn;

    public CutSceneButtons(Stage stage) {
        this.stage = stage;

        if(Gdx.graphics.getWidth() > 1800){
            skipTex = new Texture("1080/button/Skip.png");
            continueTex = new Texture("1080/button/Continue.png");
        }
        else {
            skipTex = new Texture("720/button/Skip.png");
            continueTex = new Texture("720/button/Continue.png");
        }


        Drawable contDraw = new TextureRegionDrawable(new TextureRegion(continueTex));
        Drawable skipDraw = new TextureRegionDrawable(new TextureRegion(skipTex));

        continueBtn = new ImageButton(contDraw);
        skipBtn = new ImageButton(skipDraw);

        continueBtn.setPosition((Gdx.graphics.getWidth() - continueTex.getWidth() ) - continueTex.getWidth() / 8,
                Gdx.graphics.getHeight() - ( continueTex.getHeight() * 1.5f));
        skipBtn.setPosition(skipTex.getWidth() / 8, Gdx.graphics.getHeight() - (skipTex.getHeight() * 1.5f));

    }

    public void dispose(){
        skipTex.dispose();
        continueTex.dispose();
    }
}
