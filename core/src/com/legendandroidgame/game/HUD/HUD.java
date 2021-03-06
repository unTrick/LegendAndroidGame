package com.legendandroidgame.game.HUD;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Timer;
import com.legendandroidgame.game.Mission.MissionContent;


import java.util.Arrays;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 5/2/2017.
 */
public class HUD {

    public Stage stage;
    private Integer minuteTimer;
    private Integer hourTimer;
    private float timeCountMinute;

    private String colon = " : ";

    public float health; // 0 = dead, 100 = full
    public int questTime;
    public float currentQuestTime;
    private float bar = 3 / 2, timeLimitBar = 3 / 2;
    private String missionAquired;


    private Label lblTimer;
    private Label mapLocate;
    private Label lblName;
    private Label lblCurTime;
    private Label questOnScreenReq, questOnScreenName;
    private Label mapName;
    private Image healthBarImg, questTimerImg;
    private BitmapFont font, missionFont, missionAccomplishedFont;
    private FileHandle fontFile;
    private MissionContent missionContent;
    private Label missionAccomplished;
    private Table table;
    Table questTable;
    private TextureAtlas colorBars;
    private TextureRegion healthBar, timeBar;

    String current = gameData.getString("current");
    private boolean timerIsOn = true;

    public boolean grab = false, fpsOn = false;



//    fps
    private Label fps;
    Integer FPS = Gdx.graphics.getFramesPerSecond();
//    Integer MIN = Gdx.graphics.getFramesPerSecond();
//    Integer MAX = Gdx.graphics.getFramesPerSecond();
//    fps

    // dev tools

    public Label locationOfSampleCharacter;
    public Vector3 curLocation, expectedLocation;
    // dev tools


    public HUD(Stage stage){


        this.stage = stage;

        colorBars = new TextureAtlas("720/Texturepack/ColorBar.pack");
        health = gameData.getFloat(current + " health");

        if(health > 560){
            healthBar = colorBars.findRegion("full");
        }
        else if(health > 300 && health <= 560){
            healthBar = colorBars.findRegion("orange");
        }
        else {
            healthBar = colorBars.findRegion("red");
        }
        timeBar = colorBars.findRegion("blue");


        missionContent = new MissionContent();

        minuteTimer = gameData.getInteger(current + " minuteTimer");
        hourTimer = gameData.getInteger(current + " hourTimer");
        questTime = gameData.getInteger(current + " questTime");
        currentQuestTime = gameData.getInteger(current + " currentQuestTime");
        timeCountMinute = 0;
        missionAquired = "Item Acquired";

        fontFile = Gdx.files.internal("font/Candarab.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 30;
        font = generator.generateFont(parameter);

        FreeTypeFontGenerator.FreeTypeFontParameter parameterMission = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameterMission.size = 20;
        missionFont = generator.generateFont(parameterMission);

        FreeTypeFontGenerator.FreeTypeFontParameter parameterAccomplished = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameterAccomplished.size = 40;
        missionAccomplishedFont = generator.generateFont(parameterAccomplished);

        table = new Table();
        table.top();
        table.setFillParent(true);

//        if(health <= 288){
//            blank = new Texture("1080/skin/red.png");
//        }
//        if(health <= 576){
//            blank = new Texture("1080/skin/orange.png");
//        }
//        if(health > 576){
//        }


        healthBarImg = new Image(healthBar);
        healthBarImg.setScale(0.5f, bar / 2);

        questTimerImg = new Image(timeBar);
        questTimerImg.setScale(0.5f, timeLimitBar / 2);

        lblTimer = new Label("TIME", new Label.LabelStyle(font, Color.WHITE ));
        mapLocate = new Label("World Location", new Label.LabelStyle(font, Color.WHITE ));
        mapName = new Label("mapName", new Label.LabelStyle(font, Color.WHITE));
        lblName = new Label(current.toUpperCase(), new Label.LabelStyle(font, Color.WHITE ));
        lblCurTime = new Label(String.format("%02d", hourTimer) + colon + String.format("%02d", minuteTimer), new Label.LabelStyle(font, Color.WHITE));


//        fps
//        fps = new Label("FPS: " + FPS + "\n" + "MIN FPS: " + MIN + "\n" + "MAX FPS: " + MAX
//                , new Label.LabelStyle(font, Color.WHITE));
        fps = new Label("FPS: " + FPS , new Label.LabelStyle(font, Color.WHITE));
        fps.setPosition(0, Gdx.graphics.getHeight() / 2);
//        fps

//        dev tools

        curLocation = new Vector3();
        expectedLocation = new Vector3();

        locationOfSampleCharacter = new Label("", new Label.LabelStyle(font, Color.WHITE));
        locationOfSampleCharacter.setPosition(0, Gdx.graphics.getHeight() / 4);

//        dev tools

//        lblName.setFontScale(2);
//        lblTimer.setFontScale(2);
//        lblCurTime.setFontScale(2);


        table.add(lblName).expandX().pad(10, -400, 0, 0);
        table.add(mapLocate).expandX().padTop(10).padLeft(-200);
        table.add(lblTimer).expandX().padTop(10).width(150);
        table.row();
        table.add(healthBarImg).expandX().pad(-30, -80, 0, 0);
        table.add(mapName).expandX().padTop(10).padLeft(-200);
        table.add(lblCurTime).expandX().padTop(10).width(150);
        table.row();
        table.add(questTimerImg).expandX().pad(-30, -80, 0, 0);


        questTable = new Table();
        questTable.left();
        questTable.setFillParent(true);
//        questTable.setPosition(20, 500);

        questOnScreenName = new Label(missionContent.missionName, new Label.LabelStyle(missionFont, Color.WHITE));
        questOnScreenReq = new Label(missionContent.missionRequirements, new Label.LabelStyle(missionFont, Color.RED));

        questTable.add(questOnScreenName).left();
        questTable.row();
        questTable.add(questOnScreenReq).left();

        missionAccomplished = new Label(missionAquired, new Label.LabelStyle(missionAccomplishedFont, Color.GREEN));
        missionAccomplished.setPosition(Gdx.graphics.getWidth() / 2 - missionAccomplished.getWidth() / 2,
                Gdx.graphics.getHeight() - Gdx.graphics.getHeight() / 4 - missionAccomplished.getHeight() / 2);


        stage.addActor(table);
        stage.addActor(questTable);
        stage.addActor(missionAccomplished);
        missionAccomplished.setVisible(false);

        // fps
        stage.addActor(fps);
        stage.addActor(locationOfSampleCharacter);
        // fps

    }


    public void updated(float dt){
        timeCountMinute += dt;

        if ((Gdx.input.isKeyPressed(Input.Keys.W) || Gdx.input.isKeyPressed(Input.Keys.S) ||
                Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.A))
                && Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            if (health > 0) {
//                health -= 0.2f;
            }
            if(health <= 0){
                health = 0;
            }
        }

        if(timeCountMinute >= 1){
            minuteTimer++;
            timeCountMinute = 0;

            if(minuteTimer > 59){
                hourTimer++;
            }

            if(minuteTimer == 60){
                minuteTimer = 0;
            }

            if (health > 0){
//                health -= 1;
            }
            if(health <= 0){
                health = 0;
            }

            if(questTime > 0){
                questTime -= 1;
            }

            if (questTime == 0){
                questTime = 0;
            }
        }

        if(hourTimer == 24){
            hourTimer = 0;
        }

        if(health > 560){
            healthBar.setRegion(colorBars.findRegion("green"));
//            System.out.println(healthBar);
        }
        else if(health <= 560 && health > 300){
            healthBar.setRegion(colorBars.findRegion("orange"));
//            System.out.println("orange");
        }
        else if (health < 300){
//            System.out.println("red");
            healthBar.setRegion(colorBars.findRegion("red"));
        }

//        System.out.println(health);

        missionContent.update();
        lblCurTime.setText(String.format("%02d", hourTimer) + colon + String.format("%02d", minuteTimer));
        questOnScreenName.setText(missionContent.missionName);
        questOnScreenReq.setText(missionContent.missionRequirements);
        healthBarImg.setScale(health / 1920f, bar / 2);
        questTimerImg.setScale(questTime / currentQuestTime, timeLimitBar / 2);
        questTable.setY(Gdx.graphics.getHeight() / 4 - questTable.getPrefHeight() / 2);
        questTable.setX(Gdx.graphics.getWidth() / 16);
        if(gameData.getInteger(current + " missionId") == 1
                && gameData.getInteger(current + " missionCount") == 4){
            questOnScreenReq.setStyle(new Label.LabelStyle(missionFont, Color.GREEN));

        }
        else if(gameData.getInteger(current + " missionId") == 2
                && gameData.getInteger(current + " missionCount") == 5
                && gameData.getString(current + " findKnife").equals("Done")){
//                questOnScreenReq.setColor(Color.GREEN);
            questOnScreenReq.setStyle(new Label.LabelStyle(missionFont, Color.GREEN));
        }
        else if (gameData.getInteger(current + " missionId") == 3
                && gameData.getString(current + " bringRam").equals("Done")){
            questOnScreenReq.setStyle(new Label.LabelStyle(missionFont, Color.GREEN));
        }
        else if (gameData.getInteger(current + " missionId") == 4
                && gameData.getString(current + " talkToPharaoh").equals("Done")){
            questOnScreenReq.setStyle(new Label.LabelStyle(missionFont, Color.GREEN));
        }
        else if (gameData.getInteger(current + " missionId") == 5
                && gameData.getString(current + " findStaff").equals("Done")){
            questOnScreenReq.setStyle(new Label.LabelStyle(missionFont, Color.GREEN));
        }
        else if (gameData.getInteger(current + " missionId") == 6
                && gameData.getString(current + " silver").equals("Done")
                && gameData.getString(current + " bronze").equals("Done")
                && gameData.getString(current + " scarletYarn").equals("Done")
                && gameData.getString(current + " twinedLinen").equals("Done")
                && gameData.getString(current + " oil").equals("Done")
                && gameData.getString(current + " spices").equals("Done")
                && gameData.getString(current + " incense").equals("Done")
                && gameData.getString(current + " onyxStone").equals("Done")
                && gameData.getString(current + " stone").equals("Done")
                && gameData.getString(current + " goatHair").equals("Done")
                && gameData.getString(current + " acaciaWood").equals("Done")){
            questOnScreenReq.setStyle(new Label.LabelStyle(missionFont, Color.GREEN));
        }
        else if (gameData.getInteger(current + " missionId") == 7
                && gameData.getInteger(current + " missionCount") == 12){
            questOnScreenReq.setStyle(new Label.LabelStyle(missionFont, Color.GREEN));
        }
        else if (gameData.getInteger(current + " missionId") == 8
                && gameData.getString(current + " largeStone").equals("Done")){
            questOnScreenReq.setStyle(new Label.LabelStyle(missionFont, Color.GREEN));
        }
        else {
            questOnScreenReq.setStyle(new Label.LabelStyle(missionFont, Color.RED));
        }


        //fps

        if(fpsOn){
            if(Gdx.input.isKeyJustPressed(Input.Keys.F)){
                fpsOn = false;
            }
        }
        else{
            if(Gdx.input.isKeyJustPressed(Input.Keys.F)){
                fpsOn = true;
            }
        }
        FPS = Gdx.graphics.getFramesPerSecond();

//        int minFPS[];
//        minFPS = new int[100];
//
//        for (int x = 0; x < minFPS.length; x++){
//            int miniFPS[] = FPS[x];
//            if(miniFPS[x] < miniFPS[x]){
//                MIN = miniFPS[x];
//            }
//            if(miniFPS[x] > miniFPS[x]){
//                MAX = miniFPS[x];
//            }
//        }

        if (fpsOn){
            fps.setText("FPS: " + FPS + "\n" +
            "Quest Table: " + questTable.getMinHeight() + "\n" +
                    "Quest Table: " + questTable.getMaxHeight() + "\n" +
                    "Quest Table: " + questTable.getPrefHeight() + "\n");
            locationOfSampleCharacter.setText("curLocationX: " + curLocation.x + " \n" +
            "expected LocationX: " + expectedLocation.x + "\n" +
                    "curLocationZ: " + curLocation.z + " \n" +
                            "expected LocationZ: " + expectedLocation.z );
        }
        else {
            fps.setText("");
            locationOfSampleCharacter.setText("");
        }
        //fps

//        System.out.println("GDX Version: " + com.badlogic.gdx.Version.VERSION);

        //
//        healthColor();

//        System.out.print(missionContent.missionName);

        // TODO change color
        if(missionContent.isComplete01()){
            questOnScreenName.setColor(Color.GREEN);
            questOnScreenReq.setColor(Color.GREEN);
        }
        //

        if(grab){
            timerIsOn = false;
            missionAccomplished.addAction(Actions.sequence(Actions.fadeIn(2f), Actions.show()));
            missionAccomplished.setVisible(true);
        }
        if (!timerIsOn){
                timerIsOn = true;

                Timer.schedule(new Timer.Task() {
                    @Override
                    public void run() {
                        missionAccomplished.addAction(Actions.sequence(Actions.fadeOut(2f), Actions.hide()));
                        missionAccomplished.setVisible(false);

                    }
                }, 2);
        }


        if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_1)){
            gameData.putInteger(current + " missionId", 1);
            gameData.flush();
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_2)){
            gameData.putInteger(current + " missionId", 2);
            gameData.flush();
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_3)){
            gameData.putInteger(current + " missionId", 3);
            gameData.flush();
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_4)){
            gameData.putInteger(current + " missionId", 4);
            gameData.flush();
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_5)){
            gameData.putInteger(current + " missionId", 5);
            gameData.flush();
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_6)){
            gameData.putInteger(current + " missionId", 6);
            gameData.flush();
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_7)){
            gameData.putInteger(current + " missionId", 7);
            gameData.flush();
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_8)){
            gameData.putInteger(current + " missionId", 8);
            gameData.flush();
        }


        // fps
//        System.out.println(Gdx.graphics.getFramesPerSecond());
//        System.out.println(fpsLogger);
        // fps

    }

    public void dispose(){
        colorBars.dispose();
        lblCurTime.remove();
        lblTimer.remove();
        mapLocate.remove();
        lblName.remove();
        lblCurTime.remove();
        mapName.remove();
        font.dispose();


        // inputting the data
        if(gameData.getInteger(current + " hourTimer") != hourTimer &&
                gameData.getInteger(current + " minuteTimer") != minuteTimer &&
                gameData.getFloat(current + " health") != health &&
                gameData.getInteger(current + " questTime") != questTime){

            gameData.putInteger(current + " hourTimer", hourTimer);
            gameData.putInteger(current + " minuteTimer", minuteTimer);
            gameData.putFloat(current + " health", health);
            gameData.putInteger(current + " questTime", questTime);
            gameData.flush();
        }
        // end....
    }

    public Label getMapName() {
        return mapName;
    }

    public Integer getMinuteTimer() {
        return minuteTimer;
    }

    public Integer getHourTimer() {
        return hourTimer;
    }

    public float getHealth() {
        return health;
    }
}
