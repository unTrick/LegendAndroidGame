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
import com.legendandroidgame.game.GameWorlds.SinaiWorld;
import com.legendandroidgame.game.HUD.HUD;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.PopupBox.*;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;
import com.legendandroidgame.game.States.Sleep;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 1/17/2018.
 */
public class Sinai extends GameState {

    private Stage stage;
    private SinaiWorld sinaiWorld;
    private float delta;
    private HUD hud;
    private ActualGameButtons actualGameButtons;
    private Controller controller;
    private InsideGameMenu insideGameMenu;
    private Maps maps;
    private MissionQuest missionQuest;
    private Conversation conversation;
    private Warning warning;
    String current = gameData.getString("current");

    // for center

    Texture centerTex;

    // for center

    public Sinai(GameStateManager gsm) {
        super(gsm);

        gameData.putInteger(current + " currentLocation", 14);
        gameData.flush();

        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        sinaiWorld = new SinaiWorld(controller, actualGameButtons);
        insideGameMenu = new InsideGameMenu(stage);
        maps = new Maps(stage);
        missionQuest = new MissionQuest(stage);
        conversation = new Conversation(stage);
        warning = new Warning(stage);


        // for center

        centerTex = new Texture("720/map/abrahamIndicator.png");
        Image center = new Image(centerTex);
        center.setPosition(stage.getWidth() / 2 - centerTex.getWidth() / 2, stage.getHeight() / 2 - centerTex.getHeight() / 2);
//        stage.addActor(center);

        // for center

//        Gdx.input.setInputProcessor(new InputMultiplexer(stage, haranWorld.cameraInputController));

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


 //MISSION SIX
                //NPC01
                if(sinaiWorld.SinaiNPC01 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 60);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(sinaiWorld.SinaiNPC02 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 60);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(sinaiWorld.SinaiNPC03 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 60);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(sinaiWorld.SinaiNPC04 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 60);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(sinaiWorld.SinaiNPC05 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 60);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(sinaiWorld.SinaiNPC06 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 60);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(sinaiWorld.SinaiNPC07 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 60);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(sinaiWorld.SinaiNPC08 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 60);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(sinaiWorld.SinaiNPC09 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 60);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(sinaiWorld.SinaiNPC10 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 60);
                    gameData.flush();
                    conversation.conversation();
                }


//MISSION SEVEN
                //NPC01
                if(sinaiWorld.SinaiNPC01 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 63);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(sinaiWorld.SinaiNPC02 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 63);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(sinaiWorld.SinaiNPC03 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 63);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(sinaiWorld.SinaiNPC04 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 63);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(sinaiWorld.SinaiNPC05 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 63);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(sinaiWorld.SinaiNPC06 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 63);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(sinaiWorld.SinaiNPC07 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 63);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(sinaiWorld.SinaiNPC08 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 63);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(sinaiWorld.SinaiNPC09 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 63);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(sinaiWorld.SinaiNPC10 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 63);
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


                if(gameData.getInteger(current + " convoId") == 60
                        && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 36);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }

 //MISSION SEVEN

                if(sinaiWorld.SinaiNPC08
                        && gameData.getInteger(current + " convoId") == 63
                        && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 64);
                    gameData.flush();
                    conversation.clickCount = 0;
                }
                else if(sinaiWorld.SinaiNPC08
                        && gameData.getInteger(current + " convoId") == 64
                        && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 37);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }
                else if(gameData.getInteger(current + " convoId") == 63
                        && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 36);
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

        conversation.nextBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){


                return false;
            }

        });


    }

    @Override
    protected void handleInput() {

        if(sinaiWorld.gotoBethel){
            warning.isBethel = true;
            if(warning.yesBtn.isPressed()){
                gameData.putInteger(current + " from", 14);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 3));
                dispose();
            }
        }
        else if(sinaiWorld.goToEastEgypt){
            warning.isEastEgypt = true;
            if(warning.yesBtn.isPressed()){
                gameData.putInteger(current + " from", 14);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 4));
                dispose();
            }
        }
        else if(sinaiWorld.goToJordan){
            warning.isJordan = true;
            if(warning.yesBtn.isPressed()){
                gameData.putInteger(current + " from", 14);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 9));
                dispose();
            }
        }
        else {
            warning.isBethel = false;
            warning.isJordan = false;
            warning.isEastEgypt = false;
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
        hud.getMapName().setText("Sinai");
        hud.updated(dt);
        actualGameButtons.update();
        conversation.update();
        missionQuest.update();
        maps.update(dt);
        warning.update();

    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        sinaiWorld.render(delta);
        stage.draw();
//        controller.render();
    }

    @Override
    public void dispose() {

        sinaiWorld.dispose();
        hud.dispose();
        conversation.dispose();
        actualGameButtons.dispose();
        controller.dispose();
        insideGameMenu.dispose();
        maps.dispose();
        stage.dispose();
        warning.dispose();
    }

    @Override
    public void resize(int width, int height) {
        sinaiWorld.resize(width, height);
    }
}
