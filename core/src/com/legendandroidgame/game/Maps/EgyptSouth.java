package com.legendandroidgame.game.Maps;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.GameWorlds.EgyptEastWorld;
import com.legendandroidgame.game.GameWorlds.EgyptSouthWorld;
import com.legendandroidgame.game.HUD.HUD;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.Mission.MissionContent;
import com.legendandroidgame.game.PopupBox.*;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;
import com.legendandroidgame.game.States.Sleep;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/20/2017.
 */
public class EgyptSouth extends GameState{


    private Stage stage;
    private EgyptSouthWorld egyptSouthWorld;
    private float delta;
    private HUD hud;
    private ActualGameButtons actualGameButtons;
    private Controller controller;
    private InsideGameMenu insideGameMenu;
    private Maps maps;
    private MissionQuest missionQuest;
    private Conversation conversation;
    private MissionContent missionContent;
    String current = gameData.getString("current");
    private Trivia trivia;
    private Warning warning;
    private Congrats congrats;


    private int convoId = gameData.getInteger(current + " convoId");

    // for center

    Texture centerTex;

    // for center


    public EgyptSouth(GameStateManager gsm) {
        super(gsm);


        gameData.putInteger(current + " currentLocation", 6);
        gameData.flush();

        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        egyptSouthWorld = new EgyptSouthWorld(controller, actualGameButtons);
        insideGameMenu = new InsideGameMenu(stage);
        maps = new Maps(stage);
        missionQuest = new MissionQuest(stage);
        missionContent = new MissionContent();
        conversation = new Conversation(stage);
        trivia = new Trivia(stage);
        warning = new Warning(stage);
        congrats = new Congrats(stage);

        // for center

        centerTex = new Texture("720/map/abrahamIndicator.png");
        Image center = new Image(centerTex);
        center.setPosition(stage.getWidth() / 2 - centerTex.getWidth() / 2, stage.getHeight() / 2 - centerTex.getHeight() / 2);
//        stage.addActor(center);

        // for center

        Gdx.input.setInputProcessor(stage);
//        Gdx.input.setCursorCatched(true);

        stage.addActor(actualGameButtons.getBtnMenu());
        buttonControls();
    }


    private void buttonControls(){
        actualGameButtons.getBtnMenu().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                insideGameMenu.open();
                maps.close();
                missionQuest.close();
                return false;
            }
        });

        actualGameButtons.btnMap.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){
                insideGameMenu.close();
                missionQuest.close();
                maps.open();

                return false;
            }

        });

        maps.getCloseBtn().addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                maps.close();

                return false;
            }

        });

        actualGameButtons.getBtnTalk().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                //NPC01
                if(egyptSouthWorld.israelitesNPC01 && gameData.getInteger(current + " missionId") == 5){
                    gameData.putInteger(current + " convoId", 54);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(egyptSouthWorld.israelitesNPC02 && gameData.getInteger(current + " missionId") == 5){
                    gameData.putInteger(current + " convoId", 54);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(egyptSouthWorld.israelitesNPC03 && gameData.getInteger(current + " missionId") == 5){
                    gameData.putInteger(current + " convoId", 54);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(egyptSouthWorld.israelitesNPC04 && gameData.getInteger(current + " missionId") == 5){
                    gameData.putInteger(current + " convoId", 54);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(egyptSouthWorld.israelitesNPC05 && gameData.getInteger(current + " missionId") == 5){
                    gameData.putInteger(current + " convoId", 54);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(egyptSouthWorld.israelitesNPC06 && gameData.getInteger(current + " missionId") == 5){
                    gameData.putInteger(current + " convoId", 54);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(egyptSouthWorld.israelitesNPC07 && gameData.getInteger(current + " missionId") == 5){
                    gameData.putInteger(current + " convoId", 54);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(egyptSouthWorld.israelitesNPC08 && gameData.getInteger(current + " missionId") == 5){
                    gameData.putInteger(current + " convoId", 54);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(egyptSouthWorld.israelitesNPC09 && gameData.getInteger(current + " missionId") == 5){
                    gameData.putInteger(current + " convoId", 54);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(egyptSouthWorld.israelitesNPC10 && gameData.getInteger(current + " missionId") == 5){
                    gameData.putInteger(current + " convoId", 54);
                    gameData.flush();
                    conversation.conversation();
                }


                return false;
            }


        });


        conversation.nextBtn.addListener(new ClickListener(){


            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                conversation.clickCount += 1;

                if(gameData.getInteger(current + " convoId") == 54
                        && gameData.getInteger(current + " missionId") == 5){
                    gameData.putInteger(current + " convoId", 44);
                    gameData.flush();
                    conversation.clickCount = 0;
                }

                return false;
            }
        });



// TODO Mission Buttons

        actualGameButtons.getBtnMission().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){

                missionQuest.closeMission();
                missionQuest.quest();
                maps.close();
                insideGameMenu.close();
                missionQuest.quest();
                return false;
            }

        });

        missionQuest.getCloseBtn().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){

                missionQuest.closeMission();
                missionQuest.close();
                missionQuest.clickCount = 0;

                if(!gameData.getString(current + " overView4Closed").equals("Close")){
                    gameData.putString(current + " overView4Closed", "Close");
                    gameData.flush();
                }

                return false;
            }

        });

        missionQuest.getOkayBtn().addListener( new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){

                missionQuest.missionPreview();
                missionQuest.clickCount += 1;
                if(gameData.getInteger(current + " missionId") == 6){
                    if(missionQuest.clickCount > 3){
                        missionQuest.close();
                        missionQuest.clickCount = 0;
                    }
                }
                else{
                    if(missionQuest.clickCount > 1){
                        missionQuest.close();
                        missionQuest.clickCount = 0;
                    }
                }
                return false;
            }

        });

        // Mission Buttons End...

        insideGameMenu.getResume().addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                insideGameMenu.close();

                insideGameMenu.getResume().setChecked(false);
                insideGameMenu.getSave().setChecked(false);
                insideGameMenu.getLoad().setChecked(false);
                insideGameMenu.getHome().setChecked(false);
                insideGameMenu.getExit().setChecked(false);

                return true;
            }
        });

        insideGameMenu.getSave().addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){


                insideGameMenu.getResume().setChecked(false);
                insideGameMenu.getSave().setChecked(false);
                insideGameMenu.getLoad().setChecked(false);
                insideGameMenu.getHome().setChecked(false);
                insideGameMenu.getExit().setChecked(false);

                return true;
            }
        });

        insideGameMenu.getLoad().addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){


                insideGameMenu.getResume().setChecked(false);
                insideGameMenu.getSave().setChecked(false);
                insideGameMenu.getLoad().setChecked(false);
                insideGameMenu.getHome().setChecked(false);
                insideGameMenu.getExit().setChecked(false);

                return true;
            }
        });
        insideGameMenu.getHome().addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){

                gsm.set(new LoadScreen(gsm, 0));
                dispose();

            }
        });
        insideGameMenu.getExit().addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button){

                gameData.putString("current", "NONE");
                gameData.flush();

                Gdx.app.exit();

            }
        });

        conversation.nextBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){


                return false;
            }

        });

        trivia.getCloseBtn().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                trivia.close();
                gameData.putInteger(current + " missionId", 4);
                gameData.flush();
                return false;
            }

        });

        congrats.getCloseBtn().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                if(gameData.getInteger(current + " missionId") == 4){
                    gameData.putString(current + " mission4", "Done");
                    gameData.putInteger(current + " missionId", 5);
                    gameData.flush();
                    congrats.closePopup();
                }

                return false;
            }
        });



    }


    @Override
    protected void handleInput() {

        if(gameData.getString(current + " talkToPharaoh").equals("Done")
                && !gameData.getString(current + " mission4").equals("Done")){
            congrats.popup();
        }

        if(gameData.getInteger(current + " missionId") == 4
                && !gameData.getString(current + " talkToPharaoh").equals("Done")
                && !gameData.getString(current + " overView4Closed").equals("Close")){
            missionQuest.missionOverview();
        }

        if(egyptSouthWorld.goToNorth){
            warning.isNorthEgypt = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 6);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 5));
                dispose();
            }
        }
        else if(egyptSouthWorld.goToEast){
            warning.isEastEgypt = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 6);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 4));
                dispose();
            }
        }
        else if(egyptSouthWorld.goToWest){
            warning.isWestEgypt = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 6);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 7));
                dispose();
            }
        }
        else if(egyptSouthWorld.goInside){
            warning.isHouse = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 6);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 12));
                dispose();
            }
        }
        else {
            warning.isHouse = false;
            warning.isWestEgypt = false;
            warning.isEastEgypt = false;
            warning.isNorthEgypt = false;
        }


        if(hud.health == 0){
            gsm.set(new Sleep(gsm));
            dispose();
        }

    }

    @Override
    public void update(float dt) {

        delta = dt;
//        gameCam.update();
        stage.act(dt);
        hud.getMapName().setText("Southern Egypt");
        hud.updated(dt);
        conversation.update();
        handleInput();
        missionContent.update();
        missionQuest.update();
        warning.update();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        egyptSouthWorld.render(delta);
        stage.draw();
//        controller.render();
    }

    @Override
    public void dispose() {

        egyptSouthWorld.dispose();
        hud.dispose();
        actualGameButtons.dispose();
        controller.dispose();
        insideGameMenu.dispose();
        conversation.dispose();
        maps.dispose();
        stage.dispose();
        warning.dispose();
        congrats.dispose();
    }

    @Override
    public void resize(int width, int height) {
        egyptSouthWorld.resize(width, height);
    }
}
