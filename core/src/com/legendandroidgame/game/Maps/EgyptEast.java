package com.legendandroidgame.game.Maps;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.GameWorlds.EgyptEastWorld;
import com.legendandroidgame.game.HUD.HUD;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.PopupBox.*;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;
import com.legendandroidgame.game.States.Sleep;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 7/14/2017.
 */
public class EgyptEast extends GameState {

    private Stage stage;
    private EgyptEastWorld egyptEastWorld;
    private float delta;
    private HUD hud;
    private ActualGameButtons actualGameButtons;
    private Controller controller;
    private InsideGameMenu insideGameMenu;
    private Maps maps;
    private MissionQuest missionQuest;
    private Warning warning;
    private Conversation conversation;
    private Congrats congrats;
    String current = gameData.getString("current");

    public EgyptEast(GameStateManager gsm) {
        super(gsm);


        gameData.putInteger(current + " currentLocation", 4);
        gameData.flush();

        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        egyptEastWorld = new EgyptEastWorld(controller, actualGameButtons);
        insideGameMenu = new InsideGameMenu(stage);
        maps = new Maps(stage);
        missionQuest = new MissionQuest(stage);
        conversation = new Conversation(stage);
        warning = new Warning(stage);
        congrats = new Congrats(stage);

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
                if(egyptEastWorld.israelitesNPC01){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(egyptEastWorld.israelitesNPC02){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(egyptEastWorld.israelitesNPC03){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(egyptEastWorld.israelitesNPC04){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(egyptEastWorld.israelitesNPC05){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(egyptEastWorld.israelitesNPC06){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(egyptEastWorld.israelitesNPC07){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(egyptEastWorld.israelitesNPC08){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(egyptEastWorld.israelitesNPC09){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(egyptEastWorld.israelitesNPC10){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.conversation();
                }


                return false;
            }


        });

        // new click

        conversation.nextBtn.addListener(new ClickListener(){


            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                conversation.clickCount += 1;

                if(conversation.clickCount >=1 ){
                    conversation.clickCount = 0;
                    conversation.closeConversation();
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

        congrats.getCloseBtn().addListener(new ClickListener(){


            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                congrats.closePopup();

                if(!gameData.getString(current + " mission5").equals("Done")){
                    gameData.putString(current + " mission5", "Done");
                    gameData.putInteger(current + " missionId", 6);
                    gameData.flush();
                }

                return false;

            }
        });
    }


    @Override
    protected void handleInput() {

        if(egyptEastWorld.goToNorth){
            warning.isNorthEgypt = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 4);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 5));
                dispose();
            }
        }
        else if(egyptEastWorld.goToSouth){
            warning.isSouthEgypt = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 4);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 6));
                dispose();
            }
        }
        else if(egyptEastWorld.goToWest){
            warning.isWestEgypt = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 4);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 7));
                dispose();
            }
        }
        else if(egyptEastWorld.goToEdom){
            warning.isEdom = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 4);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 8));
                dispose();
            }
        }
        else {
            warning.isEdom = false;
            warning.isWestEgypt = false;
            warning.isSouthEgypt = false;
            warning.isNorthEgypt = false;
        }

        if(gameData.getInteger(current + " missionId") == 5
                && gameData.getString(current + " splitTheSea").equals("Done")
                && !gameData.getString(current + " mission5").equals("Done")){
            congrats.popup();
        }

        if(hud.health == 0){
            gsm.set(new Sleep(gsm));
            dispose();
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
        delta = dt;
//        gameCam.update();
        stage.act(dt);
        hud.getMapName().setText("Eastern Egypt");
        hud.updated(dt);
        missionQuest.update();
        warning.update();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        egyptEastWorld.render(delta);
        stage.draw();
//        controller.render();
    }

    @Override
    public void dispose() {

        egyptEastWorld.dispose();
        hud.dispose();
        actualGameButtons.dispose();
        controller.dispose();
        insideGameMenu.dispose();
        maps.dispose();
        stage.dispose();
        warning.dispose();
        congrats.dispose();
    }

    @Override
    public void resize(int width, int height) {
        egyptEastWorld.resize(width, height);
    }
}
