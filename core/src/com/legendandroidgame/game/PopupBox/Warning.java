package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * Created by Patrick on 5/2/2017.
 */
public class Warning {

    private Stage stage;
    private Texture noTxr, yesTxr;
    private Image promptImg;
    public ImageButton noBtn, yesBtn;
    private TextureRegion promptRegion;
    private TextureAtlas promptAtlas;
    public boolean isBethel = false, isEastEgypt = false, isEdom = false, isHaran = false, isHouse = false,
            isJordan = false, isMoriah = false, isNorthEgypt = false, isShechem = false, isSinai = false, isSouthEgypt = false,
    isWestEgypt = false;

    public Warning(Stage stage){
        this.stage = stage;

        if(Gdx.graphics.getWidth() > 1800){
            noTxr = new Texture("720/button/No Button.png");
            yesTxr = new Texture("720/button/Yes Button.png");
            promptAtlas = new TextureAtlas("720/Texturepack/Portal_Prompts.pack");
        }
        else {

            noTxr = new Texture("720/button/No Button.png");
            yesTxr = new Texture("720/button/Yes Button.png");
            promptAtlas = new TextureAtlas("720/Texturepack/Portal_Prompts.pack");
        }

        promptRegion = new TextureRegion(promptAtlas.findRegion("InsideHouse_Prompt"));
        promptImg = new Image(promptRegion);
        promptImg.setPosition(Gdx.graphics.getWidth() / 2 - promptImg.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - promptImg.getHeight() / 2);

        Drawable yesDraw = new TextureRegionDrawable(new TextureRegion(yesTxr));
        Drawable noDraw = new TextureRegionDrawable(new TextureRegion(noTxr));

        yesBtn = new ImageButton(yesDraw);
        noBtn = new ImageButton(noDraw);

        yesBtn.setPosition(Gdx.graphics.getWidth() / 2 - yesTxr.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - yesTxr.getHeight());
        noBtn.setPosition(Gdx.graphics.getWidth() / 2 + noTxr.getWidth(),
                Gdx.graphics.getHeight() / 2 - noTxr.getHeight());

    }

    public void close(){

        promptImg.remove();
        yesBtn.remove();
//        noBtn.remove();
    }

    public void update(){

        if (isBethel) {
            promptRegion.setRegion(promptAtlas.findRegion("Bethel_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else if (isEastEgypt) {
            promptRegion.setRegion(promptAtlas.findRegion("EastEgypt_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else if (isEdom) {
            promptRegion.setRegion(promptAtlas.findRegion("Edom_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else if (isHaran) {
            promptRegion.setRegion(promptAtlas.findRegion("Haran_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else if (isHouse) {
            promptRegion.setRegion(promptAtlas.findRegion("InsideHouse_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else if (isJordan) {
            promptRegion.setRegion(promptAtlas.findRegion("Jordan_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else if (isMoriah) {
            promptRegion.setRegion(promptAtlas.findRegion("Moriah_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else if (isNorthEgypt) {
            promptRegion.setRegion(promptAtlas.findRegion("NorthEgypt_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else if (isShechem) {
            promptRegion.setRegion(promptAtlas.findRegion("Shechem_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else if (isSinai) {
            promptRegion.setRegion(promptAtlas.findRegion("Sinai_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else if (isSouthEgypt) {
            promptRegion.setRegion(promptAtlas.findRegion("SouthEgypt_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else if (isWestEgypt) {
            promptRegion.setRegion(promptAtlas.findRegion("WestEgypt_Prompt"));
            stage.addActor(promptImg);
            stage.addActor(yesBtn);
        }
        else {
            close();
        }



    }

    public void dispose(){

        promptAtlas.dispose();
        yesTxr.dispose();
        noTxr.dispose();

    }

}
