package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
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
    private Texture missionFin, missionStart, closeTex, cancelTex, finishTex, okayTxt;
    private Texture missionOverViewTxt1, missionPanelTxt1, missionPrevTxt1  , missionFailedTxt;
    private Image  missionState ;
    private ImageButton closeBtn, closeMisson, finishMission, cancelMission, okayBtn;
    private BitmapFont font;
    private Boolean close;
    public Image missionOverViewImg, missionPanelImg, missionPrevImg, missionFailedImg;
    private TextureAtlas missionAtlas;
    private TextureRegion missionRegion;
    private Image missionImage;

    public MissionQuest(Stage stage) {

        this.stage = stage;

        close = true;


        FileHandle fontFile = Gdx.files.internal("font/Candarab.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 20;
        font = generator.generateFont(parameter);

        if(Gdx.graphics.getWidth() > 1800){
            missionFin = new Texture("1080/popup/missionCheck.png");
            missionStart = new Texture("1080/popup/missionWarning.png");
            closeTex = new Texture("1080/button/closeBtn.png");
            cancelTex = new Texture("1080/button/cancelMission.png");
            finishTex = new Texture("1080/button/FinishMission.png");
        }
        else {
            missionFin = new Texture("720/popup/missionCheck.png");
            missionStart = new Texture("720/popup/missionWarning.png");
            closeTex = new Texture("720/button/closeBtn.png");
            cancelTex = new Texture("720/button/cancelMission.png");
            finishTex = new Texture("720/button/FinishMission.png");

            okayTxt = new Texture("720/button/Ok Button.png");

            missionAtlas = new TextureAtlas("720/Texturepack/Mission_tools.pack");

        }

        missionRegion = missionAtlas.findRegion("Mission Panel 1");
        missionImage = new Image(missionRegion);
        missionImage.setPosition(Gdx.graphics.getWidth() / 2 - missionRegion.getRegionWidth() / 2,
                Gdx.graphics.getHeight() / 2 - missionRegion.getRegionHeight() / 2);



        cancelMission = new ImageButton(new TextureRegionDrawable(new TextureRegion(cancelTex)));
        finishMission = new ImageButton(new TextureRegionDrawable(new TextureRegion(finishTex)));
        closeMisson = new ImageButton(new TextureRegionDrawable(new TextureRegion(closeTex)));
        missionState = new Image(missionStart);





        Drawable closeDraw = new TextureRegionDrawable(new TextureRegion(closeTex));
        closeBtn = new ImageButton(closeDraw);

        Drawable okayDraw = new TextureRegionDrawable(new TextureRegion(okayTxt));
        okayBtn = new ImageButton(okayDraw);

    }

    public void mission(){

        stage.addActor(cancelMission);
        stage.addActor(finishMission);
        stage.addActor(closeMisson);

        stage.addActor(closeBtn);

        closeBtn.remove();
        close = false;
    }

    public void closeMission(){
        okayBtn.remove();
        close = true;
    }

    public void quest(){
        stage.addActor(okayBtn);
        stage.addActor(closeBtn);
        stage.addActor(missionImage);
        close = false;
    }

    public void close(){
        closeBtn.remove();
        okayBtn.remove();
        close = true;
    }
    public void update(){

//        if(Gdx.input.isKeyJustPressed(Input.Keys.M)){
//            missionRegion.setRegion(missionAtlas.findRegion("Mission Panel 2"));
//        }



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


    public ImageButton getOkayBtn() {
        return okayBtn;
    }
}
