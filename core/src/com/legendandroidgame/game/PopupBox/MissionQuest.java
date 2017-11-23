package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.legendandroidgame.game.Mission.MissionContent;

/**
 * Created by Patrick on 5/2/2017.
 */
public class MissionQuest {

    private Stage stage;
    private Texture missionBox, missionSet, missionFin, missionStart, closeTex, missionOpenTex, cancelTex, finishTex, okayTxt;
    private Texture missionOverViewTxt1, missionPanelTxt1, missionPrevTxt1  , missionFailedTxt;
    private Image missionSetImg, missionState, missionOpen;
    private ImageButton closeBtn, closeMisson, finishMission, cancelMission, missionBoxImg, okayBtn;
    private Label missionLabel, missionPhrase, missionRequirements;
    private MissionContent missionContent;
    private BitmapFont font;
    private Boolean close;
    public Image missionOverViewImg, missionPanelImg, missionPrevImg, missionFailedImg;

    public MissionQuest(Stage stage) {

        this.stage = stage;

        close = true;

        missionContent = new MissionContent();

        FileHandle fontFile = Gdx.files.internal("font/Candarab.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 20;
        font = generator.generateFont(parameter);

        if(Gdx.graphics.getWidth() > 1800){
            missionBox = new Texture("1080/skin/missionTag.png");
            missionSet = new Texture("1080/popup/missionSet.png");
            missionFin = new Texture("1080/popup/missionCheck.png");
            missionStart = new Texture("1080/popup/missionWarning.png");
            closeTex = new Texture("1080/button/closeBtn.png");
            cancelTex = new Texture("1080/button/cancelMission.png");
            finishTex = new Texture("1080/button/FinishMission.png");
            missionOpenTex = new Texture("1080/popup/missionInfo.png");
        }
        else {
            missionBox = new Texture("720/skin/missionTag.png");
            missionSet = new Texture("720/popup/missionSet.png");
            missionFin = new Texture("720/popup/missionCheck.png");
            missionStart = new Texture("720/popup/missionWarning.png");
            closeTex = new Texture("720/button/closeBtn.png");
            cancelTex = new Texture("720/button/cancelMission.png");
            finishTex = new Texture("720/button/FinishMission.png");
            missionOpenTex = new Texture("720/popup/missionInfo.png");

            missionFailedTxt = new Texture("720/popup/Mission Failed Prompt.png");
            missionOverViewTxt1 = new Texture("720/popup/Mission Overview 1.png");
            missionPanelTxt1 = new Texture("720/popup/Mission Panel 1.png");
            missionPrevTxt1 = new Texture("720/popup/Mission1 Preview.png");

            okayTxt = new Texture("720/button/Ok Button.png");
        }

        missionBoxImg = new ImageButton(new TextureRegionDrawable(new TextureRegion(missionBox)));
        missionSetImg = new Image(missionSet);
        missionOpen = new Image(missionOpenTex);
        cancelMission = new ImageButton(new TextureRegionDrawable(new TextureRegion(cancelTex)));
        finishMission = new ImageButton(new TextureRegionDrawable(new TextureRegion(finishTex)));
        closeMisson = new ImageButton(new TextureRegionDrawable(new TextureRegion(closeTex)));
        missionLabel = new Label( missionContent.missionName, new Label.LabelStyle(font, Color.WHITE));
        missionPhrase = new Label(missionContent.missionPhrase, new Label.LabelStyle(font, Color.WHITE));
        missionRequirements = new Label(missionContent.missionRequirements, new Label.LabelStyle(font, Color.WHITE));
        missionState = new Image(missionStart);

        missionFailedImg = new Image(missionFailedTxt);

        missionPanelImg = new Image(missionPanelTxt1);
        missionOverViewImg = new Image(missionOverViewTxt1);
        missionPrevImg = new Image(missionPrevTxt1);

        missionBoxImg.setSize(missionBox.getWidth(), missionBox.getHeight());

        missionSetImg.setPosition(Gdx.graphics.getWidth() / 2 - missionSet.getWidth() / 2, Gdx.graphics.getHeight() / 2 - missionSet.getHeight() / 2);
        missionBoxImg.setPosition(Gdx.graphics.getWidth() / 2 - missionBox.getWidth() / 2, (Gdx.graphics.getHeight() / 2 - missionBox.getHeight() / 2) + missionSet.getHeight() / 6);
        missionLabel.setPosition((Gdx.graphics.getWidth() / 2 - missionBox.getWidth() / 2 ) + 25, (Gdx.graphics.getHeight() / 2 - missionBox.getHeight() / 2) + missionSet.getHeight() / 5);
        missionState.setPosition(Gdx.graphics.getWidth() / 2 + missionStart.getWidth(), (Gdx.graphics.getHeight() / 2 - missionBox.getHeight() / 2) + missionSet.getHeight() / 5);
        missionOpen.setPosition(Gdx.graphics.getWidth() / 2 - missionOpenTex.getWidth() / 2, Gdx.graphics.getHeight() / 2 - missionOpenTex.getHeight() / 2);
        cancelMission.setPosition(Gdx.graphics.getWidth() / 2 + cancelTex.getWidth() * 0.3f, Gdx.graphics.getHeight() / 2 - missionOpenTex.getHeight() / 2 + cancelTex.getHeight() / 2);
        finishMission.setPosition(Gdx.graphics.getWidth() / 2 + finishTex.getWidth() * 1.3f, Gdx.graphics.getHeight() / 2 - missionOpenTex.getHeight() / 2 + finishTex.getHeight() / 2);
        closeMisson.setPosition(Gdx.graphics.getWidth() / 2 + missionOpenTex.getWidth() / 2 - closeTex.getWidth() / 2, Gdx.graphics.getHeight() / 2 + missionOpenTex.getHeight() / 2 - closeTex.getHeight() / 2);


        missionFailedImg.setPosition(Gdx.graphics.getWidth() / 2 - missionFailedTxt.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - missionFailedTxt.getHeight() / 2);
        missionPanelImg.setPosition(Gdx.graphics.getWidth() / 2 - missionPanelTxt1.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - missionPanelTxt1.getHeight() / 2);
        missionOverViewImg.setPosition(Gdx.graphics.getWidth() / 2 - missionOverViewTxt1.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - missionOverViewTxt1.getHeight() / 2);
        missionPrevImg.setPosition(Gdx.graphics.getWidth() / 2 - missionPrevTxt1.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - missionPrevTxt1.getHeight() / 2);

        Drawable closeDraw = new TextureRegionDrawable(new TextureRegion(closeTex));
        closeBtn = new ImageButton(closeDraw);
        closeBtn.setPosition((Gdx.graphics.getWidth() / 2 - closeTex.getWidth() / 2) + missionSet.getWidth() / 2, (Gdx.graphics.getHeight() / 2 - closeTex.getHeight() / 2 )  + missionSet.getHeight() / 2);

        Drawable okayDraw = new TextureRegionDrawable(new TextureRegion(okayTxt));
        okayBtn = new ImageButton(okayDraw);
        okayBtn.setPosition((Gdx.graphics.getWidth() / 2 + missionPanelTxt1.getWidth() / 2 ) - okayTxt.getWidth(),
                (Gdx.graphics.getHeight() / 2 - missionPanelTxt1.getHeight() / 2) - okayTxt.getHeight());

    }

    public void mission(){
        missionBoxImg.remove();
        missionLabel.remove();
        missionState.remove();

        stage.addActor(missionOpen);
        stage.addActor(cancelMission);
        stage.addActor(finishMission);
        stage.addActor(closeMisson);

        stage.addActor(missionBoxImg);
        stage.addActor(closeBtn);
        stage.addActor(missionLabel);
        stage.addActor(missionPhrase);
        stage.addActor(missionRequirements);
        stage.addActor(missionState);

        missionSetImg.remove();
        closeBtn.remove();
        missionBoxImg.setPosition(Gdx.graphics.getWidth() / 2 - missionOpen.getWidth() / 2 + missionFin.getWidth() / 3, (Gdx.graphics.getHeight() / 2 + missionBox.getHeight() / 3) + missionSet.getHeight() / 6);
        missionLabel.setPosition(Gdx.graphics.getWidth() / 2 - missionOpen.getWidth() / 2 + missionFin.getWidth() / 3 + 25, (Gdx.graphics.getHeight() / 2 + missionBox.getHeight() / 3) + missionSet.getHeight() / 5);
        missionRequirements.setPosition(Gdx.graphics.getWidth() / 2, (Gdx.graphics.getHeight() /2) - (missionRequirements.getHeight() / 2)  - (finishMission.getHeight()));
        missionState.setPosition(Gdx.graphics.getWidth() / 2 - missionOpen.getWidth() / 2 - missionFin.getWidth() + missionBox.getWidth(), (Gdx.graphics.getHeight() / 2 + missionBox.getHeight() / 3) + missionSet.getHeight() / 5);
        close = false;
    }

    public void closeMission(){
        missionOpen.remove();
        cancelMission.remove();
        finishMission.remove();
        closeMisson.remove();
        missionBoxImg.remove();
        missionLabel.remove();
        missionPhrase.remove();
        missionRequirements.remove();
        missionState.remove();
        okayBtn.remove();
        missionPanelImg.remove();
        close = true;
    }

    public void quest(){
        stage.addActor(missionPanelImg);
        stage.addActor(okayBtn);
        stage.addActor(closeBtn);
        close = false;
    }

    public void close(){
        closeBtn.remove();
        okayBtn.remove();
        missionPanelImg.remove();
        missionBoxImg.remove();
        missionSetImg.remove();
        missionLabel.remove();
        missionPhrase.remove();
        missionRequirements.remove();
        missionState.remove();
        close = true;
    }
    public void update(){


        missionContent.update();
        missionLabel.setText(missionContent.missionName);
        missionPhrase.setText(missionContent.missionPhrase);
        missionRequirements.setText(missionContent.missionRequirements);
        missionPhrase.setPosition(Gdx.graphics.getWidth() / 2, (Gdx.graphics.getHeight() / 2) + (missionOpenTex.getHeight() / 2) - (missionPhrase.getPrefHeight()) - (finishTex.getHeight() / 2));
    }

    public Stage getStage() {
        return stage;
    }

    public ImageButton getCloseBtn() {
        return closeBtn;
    }

    public ImageButton getCloseMisson() {
        return closeMisson;
    }

    public ImageButton getFinishMission() {
        return finishMission;
    }

    public ImageButton getCancelMission() {
        return cancelMission;
    }

    public ImageButton getMissionBoxImg() {
        return missionBoxImg;
    }

    public Label getMissionLabel() {
        return missionLabel;
    }

    public Label getMissionPhrase() {
        return missionPhrase;
    }

    public ImageButton getOkayBtn() {
        return okayBtn;
    }
}
