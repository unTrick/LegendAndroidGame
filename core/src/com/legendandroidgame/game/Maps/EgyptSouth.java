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

    private int convoId = gameData.getInteger(current + " convoId");

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


        actualGameButtons.getBtnMission().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){

                missionQuest.quest();
                maps.close();
                insideGameMenu.close();
                return false;
            }

        });

        actualGameButtons.getBtnGrab().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){

                return true;
            }

        });

        actualGameButtons.getBtnTalk().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                if(egyptSouthWorld.canTalkToAaron){
                    conversation.aaronConvoLev = true;
                }

                return false;
            }


        });

        missionQuest.getCloseBtn().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                missionQuest.close();
                return false;
            }

        });

        missionQuest.getMissionBoxImg().addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                missionQuest.mission();
                return false;
            }
        });

        missionQuest.getCloseMisson().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                missionQuest.closeMission();

                return false;
            }

        });


        missionQuest.getCancelMission().addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                missionQuest.closeMission();

                return false;
            }
        });

        missionQuest.getFinishMission().addListener(new ClickListener(){


            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                if(gameData.getString(current + " talkToAaronLev").equals("Done") &&
                        gameData.getString(current + " findJarOfWater").equals("Done") &&
                        gameData.getString(current + " findSash").equals("Done") &&
                        gameData.getString(current + " findCoat").equals("Done")){

                    missionQuest.closeMission();
                    trivia.trivNumber = 2;
                    trivia.openTriv();
                }

                return false;
            }

        });


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

                convoId += 1;
                gameData.putInteger(current + " convoId", convoId);
                gameData.flush();

                if(gameData.getInteger(current + " convoId") > 5){
                    conversation.exoOneConvo = false;
                }

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

    }


    @Override
    protected void handleInput() {

        if(egyptSouthWorld.goToNorth){
            gameData.putInteger(current + " from", 6);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 5));
            dispose();
        }
        if(egyptSouthWorld.goToEast){
            gameData.putInteger(current + " from", 6);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 4));
            dispose();
        }
        if(egyptSouthWorld.goToWest){
            gameData.putInteger(current + " from", 6);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 7));
            dispose();
        }
        if(egyptSouthWorld.goInside){
            gameData.putInteger(current + " from", 6);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 12));
            dispose();
        }

        if (gameData.getInteger(current + " convoId") > 5) {
            conversation.exoOneConvo = false;
        }

        if(gameData.getInteger(current + " convoId") > 10){
            conversation.aaronConvoLev = false;
        }

        if(hud.health == 0){
            gsm.set(new Sleep(gsm));
            dispose();
        }

        conversation.exoOneConvo = true;
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
    }

    @Override
    public void resize(int width, int height) {
        egyptSouthWorld.resize(width, height);
    }
}
