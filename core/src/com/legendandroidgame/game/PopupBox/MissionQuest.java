package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 5/2/2017.
 */
public class MissionQuest {

    private Stage stage;
    private Texture closeTex, okayTxt;
//    private Texture missionFailedTxt;
    private ImageButton closeBtn, okayBtn;
    private TextureAtlas missionAtlas;
    private TextureRegion panelRegion, overviewRegion, previewRegion;
    private Image missionPanelImg, missionOverviewImg, missionPreviewImg, missionFailedImg;
    String current = gameData.getString("current");
    public int clickCount = 0;

    public MissionQuest(Stage stage) {

        this.stage = stage;

        if(Gdx.graphics.getWidth() > 1800){ // HDPI
            closeTex = new Texture("1080/button/closeBtn.png");
            okayTxt = new Texture("720/button/Ok Button.png");
            missionAtlas = new TextureAtlas("720/Texturepack/Mission_Tools.pack");

        }
        else { // MDPI
            closeTex = new Texture("720/button/closeBtn.png");
            okayTxt = new Texture("720/button/Ok Button.png");
            missionAtlas = new TextureAtlas("720/Texturepack/Mission_Tools.pack");
        }


        // Mission Panel

        panelRegion = missionAtlas.findRegion("Mission fakePanel 1");
        missionPanelImg = new Image(panelRegion);
        missionPanelImg.setPosition(Gdx.graphics.getWidth() / 2 - panelRegion.getRegionWidth() / 2,
                Gdx.graphics.getHeight() / 2 - panelRegion.getRegionHeight() / 2);

        // Mission Preview
        previewRegion = missionAtlas.findRegion("Mission1 fake");
        missionPreviewImg = new Image(previewRegion);
        missionPreviewImg.setPosition(Gdx.graphics.getWidth() / 2 - previewRegion.getRegionWidth() / 2,
                Gdx.graphics.getHeight() / 2 - previewRegion.getRegionHeight() / 2);



        // Mission Overview
        overviewRegion = missionAtlas.findRegion("Mission Overviewfake");
        missionOverviewImg = new Image(overviewRegion);
        missionOverviewImg.setPosition(Gdx.graphics.getWidth() / 2 - overviewRegion.getRegionWidth() / 2,
                Gdx.graphics.getHeight() / 2 - overviewRegion.getRegionHeight() / 2);


        // Buttons
        Drawable closeDraw = new TextureRegionDrawable(new TextureRegion(closeTex));
        Drawable okayDraw = new TextureRegionDrawable(new TextureRegion(okayTxt));

        closeBtn = new ImageButton(closeDraw);
        okayBtn = new ImageButton(okayDraw);

        closeBtn.setPosition((Gdx.graphics.getWidth() / 2 + panelRegion.getRegionWidth() / 2) - closeTex.getWidth() / 2,
                (Gdx.graphics.getHeight() / 2 + panelRegion.getRegionHeight() / 2) - closeTex.getHeight() / 2);
        okayBtn.setPosition(Gdx.graphics.getWidth() / 2 - okayTxt.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 -( panelRegion.getRegionHeight() / 2 + okayTxt.getHeight()));

    }

    public void quest(){ // conversation
        stage.addActor(missionPanelImg);
        stage.addActor(closeBtn);
        stage.addActor(okayBtn);
        closeBtn.setPosition((Gdx.graphics.getWidth() / 2 + panelRegion.getRegionWidth() / 2) - closeTex.getWidth() / 2,
                (Gdx.graphics.getHeight() / 2 + panelRegion.getRegionHeight() / 2) - closeTex.getHeight() / 2);
    }

    public void closeMission(){ // closeConversation
        missionPreviewImg.remove();
        missionOverviewImg.remove();
        okayBtn.remove();
        closeBtn.remove();
    }

    public void close(){ // wag isama
        missionPanelImg.remove();
        missionPreviewImg.remove();
        missionOverviewImg.remove();
        okayBtn.remove();
        closeBtn.remove();
    }

    public void missionPreview(){ // wag isama
        okayBtn.remove();
        closeBtn.remove();
        missionPanelImg.remove();
        stage.addActor(missionPreviewImg);
        stage.addActor(closeBtn);
        stage.addActor(okayBtn);
        closeBtn.setPosition((Gdx.graphics.getWidth() / 2 + previewRegion.getRegionWidth() / 2) - closeTex.getWidth() / 2,
                (Gdx.graphics.getHeight() / 2 + previewRegion.getRegionHeight() / 2) - closeTex.getHeight() / 2);
    }

    public void missionOverview(){
        missionPanelImg.remove();
        missionPreviewImg.remove();
        okayBtn.remove();
        closeBtn.remove();
        stage.addActor(missionOverviewImg);
        stage.addActor(closeBtn);
        closeBtn.setPosition((Gdx.graphics.getWidth() / 2 + overviewRegion.getRegionWidth() / 2) - closeTex.getWidth() / 2,
                (Gdx.graphics.getHeight() / 2 + overviewRegion.getRegionHeight() / 2) - closeTex.getHeight());
    }

    public void update(){

        if(Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)){
            close();
            clickCount = 0;
        }


        if(gameData.getInteger(current + " missionId") == 1){ // convoId
            panelRegion.setRegion(missionAtlas.findRegion("Mission Panel 1"));
            previewRegion.setRegion(missionAtlas.findRegion("Mission1 Preview"));
            overviewRegion.setRegion(missionAtlas.findRegion("Mission Overview 1"));
            // convoRegion.setRegion(conversationAtlas.findRegion("First_Part 1"));
        }
        else if(gameData.getInteger(current + " missionId") == 2){
            panelRegion.setRegion(missionAtlas.findRegion("Mission Panel 2"));
            previewRegion.setRegion(missionAtlas.findRegion("Mission2 Preview"));
            overviewRegion.setRegion(missionAtlas.findRegion("Mission Overview 2"));
        }
        else if(gameData.getInteger(current + " missionId") == 3){
            panelRegion.setRegion(missionAtlas.findRegion("Mission Panel 3"));
            previewRegion.setRegion(missionAtlas.findRegion("Mission3 Preview"));
            overviewRegion.setRegion(missionAtlas.findRegion("Mission Overview 3"));
        }
        else if(gameData.getInteger(current + " missionId") == 4){
            panelRegion.setRegion(missionAtlas.findRegion("Mission Panel 4"));
            previewRegion.setRegion(missionAtlas.findRegion("Mission4 Preview"));
            overviewRegion.setRegion(missionAtlas.findRegion("Mission Overview 4"));
        }
        else if(gameData.getInteger(current + " missionId") == 5){
            panelRegion.setRegion(missionAtlas.findRegion("Mission Panel 5"));
            previewRegion.setRegion(missionAtlas.findRegion("Mission5 Preview"));
            overviewRegion.setRegion(missionAtlas.findRegion("Mission Overview 5"));
        }
        else if(gameData.getInteger(current + " missionId") == 6){
            panelRegion.setRegion(missionAtlas.findRegion("Mission Panel 6"));
            if(clickCount == 1){
                previewRegion.setRegion(missionAtlas.findRegion("Mission6_Part1 Preview"));
            }
            else if (clickCount == 2){ // thank you
                previewRegion.setRegion(missionAtlas.findRegion("Mission6_Part2 Preview"));
            }
            else if (clickCount == 3){ // do you know the wae
                previewRegion.setRegion(missionAtlas.findRegion("Mission6_Part3 Preview"));
            }
            overviewRegion.setRegion(missionAtlas.findRegion("Mission Overview 6"));
        }
        else if(gameData.getInteger(current + " missionId") == 7){ // moses
            panelRegion.setRegion(missionAtlas.findRegion("Mission Panel 7"));
            previewRegion.setRegion(missionAtlas.findRegion("Mission7 Preview"));
            overviewRegion.setRegion(missionAtlas.findRegion("Mission Overview 7"));
        }
        else if(gameData.getInteger(current + " missionId") == 8){ // abran
            panelRegion.setRegion(missionAtlas.findRegion("Mission Panel 8"));
            previewRegion.setRegion(missionAtlas.findRegion("Mission8 Preview"));
        }

    }

    public void dispose(){
        missionAtlas.dispose();
        closeTex.dispose();
        okayTxt.dispose();
    }

    public Stage getStage() {
        return stage;
    }

    public ImageButton getCloseBtn() {
        return closeBtn;
    }


    public ImageButton getOkayBtn() {
        return okayBtn;
    }
}
