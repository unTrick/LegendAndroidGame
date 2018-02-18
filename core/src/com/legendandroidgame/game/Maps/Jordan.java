package com.legendandroidgame.game.Maps;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.BulletTools.ObjectEntityFactory;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.GameWorlds.HaranWorld;
import com.legendandroidgame.game.GameWorlds.JordanWorld;
import com.legendandroidgame.game.HUD.HUD;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.PopupBox.*;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;
import com.legendandroidgame.game.States.Sleep;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/22/2017.
 */
public class Jordan extends GameState {
    private Stage stage;
    private JordanWorld jordanWorld;
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
    int convoId = gameData.getInteger(current + " convoId");


    public Jordan(GameStateManager gsm) {
        super(gsm);

        gameData.putInteger(current + " currentLocation", 9);
        gameData.flush();

        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        jordanWorld = new JordanWorld(controller, actualGameButtons);
        insideGameMenu = new InsideGameMenu(stage);
        maps = new Maps(stage);
        missionQuest = new MissionQuest(stage);
        conversation = new Conversation(stage);
        warning = new Warning(stage);

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
                if(jordanWorld.jordanNPC01 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 65);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(jordanWorld.jordanNPC02 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 65);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(jordanWorld.jordanNPC03 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 65);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(jordanWorld.jordanNPC04 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 65);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(jordanWorld.jordanNPC05 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 65);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(jordanWorld.jordanNPC06 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 65);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(jordanWorld.jordanNPC07 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 65);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(jordanWorld.jordanNPC08 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 65);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(jordanWorld.jordanNPC09 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 65);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(jordanWorld.jordanNPC10 && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 65);
                    gameData.flush();
                    conversation.conversation();
                }

//MISSION 8
                //NPC01
                if(jordanWorld.jordanNPC01 && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 67);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(jordanWorld.jordanNPC02 && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 67);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(jordanWorld.jordanNPC03 && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 67);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(jordanWorld.jordanNPC04 && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 67);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(jordanWorld.jordanNPC05 && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 67);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(jordanWorld.jordanNPC06 && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 67);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(jordanWorld.jordanNPC07 && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 67);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(jordanWorld.jordanNPC08 && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 67);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(jordanWorld.jordanNPC09 && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 67);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(jordanWorld.jordanNPC10 && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 67);
                    gameData.flush();
                    conversation.conversation();
                }


                return false;
            }


        });


        conversation.nextBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

//                conversation.clickCount += 1;
//
//                if(conversation.clickCount >=1 ){
//                    conversation.clickCount = 0;
//                    conversation.closeConversation();
//                }

                conversation.clickCount += 1;




                if(gameData.getInteger(current + " convoId") == 65
                        && gameData.getInteger(current + " missionId") == 7){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }

//MISSION 8

                if(jordanWorld.jordanNPC04
                        && gameData.getInteger(current + " convoId") == 67
                        && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 68);
                    gameData.flush();
                    conversation.clickCount = 0;
                }
                else if(jordanWorld.jordanNPC04
                        && gameData.getInteger(current + " convoId") == 68
                        && gameData.getInteger(current + " missionId") == 8){
                    gameData.putInteger(current + " convoId", 37);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }
                else if(gameData.getInteger(current + " convoId") == 68
                        && gameData.getInteger(current + " missionId") == 8){
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

        conversation.nextBtn.addListener(new ClickListener(){

        });


    }

    @Override
    protected void handleInput() {

        if(jordanWorld.goToMoriah){
            warning.isMoriah = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 9);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 8));
                dispose();
            }
        }
        else if(jordanWorld.goToSinai){
            warning.isSinai = true;
            if(warning.yesBtn.isPressed()){
                gameData.putInteger(current + " from", 9);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 14));
                dispose();
            }
        }
        else {
            warning.isMoriah = false;
            warning.isSinai = false;
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
        hud.getMapName().setText("Jordan");
        hud.updated(dt);
        conversation.update();
        missionQuest.update();
        maps.update(dt);
        warning.update();
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        jordanWorld.render(delta);
        stage.draw();
//        controller.render();
    }

    @Override
    public void dispose() {

        jordanWorld.dispose();
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
        jordanWorld.resize(width, height);
    }
}
