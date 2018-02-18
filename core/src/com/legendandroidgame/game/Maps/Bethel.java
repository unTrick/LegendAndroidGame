package com.legendandroidgame.game.Maps;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.GameWorlds.BethelWorld;
import com.legendandroidgame.game.HUD.HUD;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.PopupBox.*;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;
import com.legendandroidgame.game.States.Sleep;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 7/19/2017.
 */
public class Bethel extends GameState {

    private Stage stage;
    private BethelWorld bethelWorld;
    private float delta;
    private HUD hud;
    private ActualGameButtons actualGameButtons;
    private Controller controller;
    private InsideGameMenu insideGameMenu;
    private Maps maps;
    private MissionQuest missionQuest;
    private Trivia trivia;
    private Warning warning;
    String current = gameData.getString("current");

    private Conversation conversation;
    public Boolean startTrivia = false;
    private boolean timerIsOn = false;


    public Bethel(GameStateManager gsm) {
        super(gsm);

        gameData.putInteger(current + " currentLocation", 3);
        gameData.flush();

        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        bethelWorld = new BethelWorld(controller, actualGameButtons);
        insideGameMenu = new InsideGameMenu(stage);
        maps = new Maps(stage);
        missionQuest = new MissionQuest(stage);
        trivia = new Trivia(stage);
        warning = new Warning(stage);
        conversation = new Conversation(stage);

        Gdx.input.setInputProcessor(stage);
//        Gdx.input.setInputProcessor(new InputMultiplexer(stage, bethelWorld.cameraInputController));
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
                if(bethelWorld.bethelNPC01 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 35);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(bethelWorld.bethelNPC02 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 35);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(bethelWorld.bethelNPC03 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 35);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(bethelWorld.bethelNPC04 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 35);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(bethelWorld.bethelNPC05 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 35);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(bethelWorld.bethelNPC06 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 35);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(bethelWorld.bethelNPC07 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 35);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(bethelWorld.bethelNPC08 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 35);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(bethelWorld.bethelNPC09 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 35);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(bethelWorld.bethelNPC10 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 35);
                    gameData.flush();
                    conversation.conversation();
                }


 //MISSION TWO

                //NPC01
                if(bethelWorld.bethelNPC01 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(bethelWorld.bethelNPC02 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(bethelWorld.bethelNPC03 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(bethelWorld.bethelNPC04 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(bethelWorld.bethelNPC05 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(bethelWorld.bethelNPC06 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(bethelWorld.bethelNPC07 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(bethelWorld.bethelNPC08 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(bethelWorld.bethelNPC09 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(bethelWorld.bethelNPC10 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
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



                if(gameData.getInteger(current + " convoId") == 35
                        && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 36);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }


//MISSION TWO

                if(bethelWorld.bethelNPC10
                        && gameData.getInteger(current + " convoId") == 38
                        && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 39);
                    gameData.flush();
                    conversation.clickCount = 0;
                }
                else if(bethelWorld.bethelNPC10
                        && gameData.getInteger(current + " convoId") == 39
                        && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 37);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }
                else if(gameData.getInteger(current + " convoId") == 38
                        && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 33);
                    gameData.flush();
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

        trivia.getCloseBtn().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                trivia.close();

                gameData.putInteger(current + " missionCount", 0);
                gameData.putInteger(current + " missionId", 2);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 24));
                dispose();
                return false;
            }

        });



        actualGameButtons.btnGrab.addListener(new InputListener(){


            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                if(bethelWorld.stone1 || bethelWorld.stone2 || bethelWorld.stone3 || bethelWorld.stone4) {
                    switch (gameData.getInteger(current + " missionCount")) {
                        case 0:
                            gameData.putInteger(current + " missionCount", 1);
                            gameData.flush();
                            break;
                        case 1:
                            gameData.putInteger(current + " missionCount", 2);
                            gameData.flush();
                            break;
                        case 2:
                            gameData.putInteger(current + " missionCount", 3);
                            gameData.flush();
                            break;
                        case 3:
                            gameData.putInteger(current + " missionCount", 4);
                            gameData.flush();
                            break;
                    }
                }
                return true;
            }

        });
    }

    @Override
    protected void handleInput() {


        if(bethelWorld.gotoEgypt){
            if (gameData.getInteger(current + " missionId") >= 7 ||
                    gameData.getInteger(current + " missionId") == 0){
                warning.isShechem = true;
            }
            else {
                warning.isNorthEgypt = true;
            }
            if(warning.yesBtn.isPressed()) {
                // goto Shechem if on Last Mission
                if (gameData.getInteger(current + " missionId") >= 7 ||
                        gameData.getInteger(current + " missionId") == 0) {
                    gameData.putInteger(current + " from", 3);
                    gameData.flush();
                    gsm.set(new LoadScreen(gsm, 11));
                    dispose();
                }

                // goto North Egypt if not
                else {
                    gameData.putInteger(current + " from", 3);
                    gameData.flush();
                    gsm.set(new LoadScreen(gsm, 5));
                    dispose();
                }
            }

        }
        else if(bethelWorld.gotoHaran){
            warning.isHaran = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 3);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 2));
                dispose();
            }
        }

        else if(bethelWorld.goToMoriah){
            warning.isMoriah = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 3);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 8));
                dispose();
            }
        }
        else {
            warning.isNorthEgypt = false;
            warning.isShechem = false;
            warning.isHaran = false;
            warning.isMoriah = false;
        }

//
//        if(Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){
//            dispose();
//        }

        if(hud.health == 0){
            gsm.set(new Sleep(gsm));
            dispose();
        }

        if(bethelWorld.isMissionFinish){
            if(gameData.getInteger( current + " missionCount") == 4){
                missionQuest.closeMission();
                bethelWorld.goLight = true;
                trivia.trivNumber = 1;
                trivia.openTriv();
            }
            else {
                System.out.println("not finish");
            }
        }

        if(bethelWorld.isStone1Click || bethelWorld.isStone2Click || bethelWorld.isStone3Click || bethelWorld.isStone4Click){
            hud.grab = true;
        }
        else {
            hud.grab = false;
        }

        if(hud.questTime <= 0){
            if(gameData.getInteger(current + " missionId") == 1) {
                gsm.set(new LoadScreen(gsm, 2));
                gameData.putInteger(current + " questTime", 300);
                gameData.flush();
                dispose();
            }
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
        delta = dt;
//        gameCam.update();
        hud.getMapName().setText("Bethel");
        hud.updated(dt);
        actualGameButtons.update();
        missionQuest.update();
        maps.update(dt);
        warning.update();
//        System.out.println(Gdx.graphics.getFramesPerSecond());
//        System.out.println(Gdx);
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        bethelWorld.render(delta);
        stage.draw();
//        controller.render();
    }

    @Override
    public void dispose() {

        hud.dispose();
        actualGameButtons.dispose();
        controller.dispose();
        insideGameMenu.dispose();
        bethelWorld.dispose();
        maps.dispose();
        stage.dispose();
        warning.dispose();

    }

    @Override
    public void resize(int width, int height) {
        bethelWorld.resize(width, height);
    }
}
