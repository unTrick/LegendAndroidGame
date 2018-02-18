package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/23/2017.
 */
public class Congrats {

    private Stage stage;
    private Texture closeTex, completedTex;
    //    private Texture missionFailedTxt;
    private ImageButton closeBtn;
    private Image completedImg;
    String current = gameData.getString("current");

    public Congrats(Stage stage){
        this.stage = stage;

        switch (Gdx.app.getType()){
            case Android:
                if(Gdx.graphics.getWidth() > 900){
                    closeTex = new Texture("1080/button/closeBtn.png");
                    completedTex = new Texture("1080/popup/Mission Completed.png");
                }
                else{
                    closeTex = new Texture("720/button/closeBtn.png");
                    completedTex = new Texture("720/popup/Mission Completed.png");
                }
                break;
            case Desktop:
                if(Gdx.graphics.getWidth() > 1800){
                    closeTex = new Texture("1080/button/closeBtn.png");
                    completedTex = new Texture("1080/popup/Mission Completed.png");
                }
                else{
                    closeTex = new Texture("720/button/closeBtn.png");
                    completedTex = new Texture("720/popup/Mission Completed.png");
                }
                break;
        }

        completedImg = new Image(completedTex);
        completedImg.setPosition(Gdx.graphics.getWidth() / 2 - completedTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - completedTex.getHeight() / 2);

        // Buttons
        Drawable closeDraw = new TextureRegionDrawable(new TextureRegion(closeTex));

        closeBtn = new ImageButton(closeDraw);
        closeBtn.setPosition((Gdx.graphics.getWidth() / 2 + completedTex.getWidth() / 2) - closeTex.getWidth(),
                (Gdx.graphics.getHeight() / 2 + completedTex.getHeight() / 2) - closeTex.getHeight() / 2);

    }

    public void popup(){
        stage.addActor(completedImg);
        stage.addActor(closeBtn);
    }

    public void closePopup(){
        completedImg.remove();
        closeBtn.remove();
    }

    public void dispose(){
        closeTex.dispose();
        completedTex.dispose();
    }

    public ImageButton getCloseBtn() {
        return closeBtn;
    }
}
