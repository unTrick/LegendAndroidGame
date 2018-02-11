package com.legendandroidgame.game.Maps;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.GameWorlds.LandOfEdomWorld;
import com.legendandroidgame.game.HUD.HUD;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.PopupBox.*;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;
import com.legendandroidgame.game.States.Sleep;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 9/18/2017.
 */
public class LandOfEdom extends GameState {

    private Stage stage;
    private LandOfEdomWorld landOfEdomWorld;
    private float delta;
    private HUD hud;
    private ActualGameButtons actualGameButtons;
    private Maps maps;
    private Controller controller;
    private InsideGameMenu insideGameMenu;
    private MissionQuest missionQuest;
    private Conversation conversation;
    private Trivia trivia;
    String current = gameData.getString("current");
    private int convoId = gameData.getInteger(current + " convoId");


    public LandOfEdom(GameStateManager gsm) {
        super(gsm);

        gameData.putInteger(current + " currentLocation", 8);
        gameData.flush();

        if(gameData.getInteger(current + " missionId") == 4){
            gameData.putInteger(current + " missionId", 0);
            gameData.flush();
        }

        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        landOfEdomWorld = new LandOfEdomWorld(controller, actualGameButtons);
        insideGameMenu = new InsideGameMenu(stage);
        missionQuest = new MissionQuest(stage);
        conversation = new Conversation(stage);
        trivia = new Trivia(stage);
        maps = new Maps(stage);

        Gdx.input.setInputProcessor(stage);
//        Gdx.input.setCursorCatched(true);

        if(gameData.getInteger(current + " from") == 23){
            trivia.trivNumber = 3;
            trivia.openTriv();
        }


        stage.addActor(actualGameButtons.getBtnMenu());
        buttonControls();
    }

    private void buttonControls(){
        actualGameButtons.getBtnMenu().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                insideGameMenu.open();
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

                convoId += 1;
                gameData.putInteger(current + " convoId", convoId);
                gameData.flush();

                return false;
            }

        });

        trivia.getCloseBtn().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                trivia.close();

                return false;
            }

        });
    }

    @Override
    protected void handleInput() {

        if(hud.health == 0){
            gsm.set(new Sleep(gsm));
            dispose();
        }

        if(landOfEdomWorld.goToJordan){
            gameData.putInteger(current + " from", 8);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 9));
            dispose();
        }
        if(landOfEdomWorld.goToEast){
            gameData.putInteger(current + " from", 8);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 4));
            dispose();
        }


        if(gameData.getInteger(current + " missionId") == 5 &&
                gameData.getString(current + " findStaff").equals("Done") &&
                gameData.getString(current + " findWoodenPole").equals("Done")){
            gsm.set(new LoadScreen(gsm, 23));
            dispose();
        }


    }

    @Override
    public void update(float dt) {
        delta = dt;
//        gameCam.update();
        stage.act(dt);
        hud.getMapName().setText("Land Of Edom");
        hud.updated(dt);
        conversation.update();
        missionQuest.update();

        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        landOfEdomWorld.render(delta);
        stage.draw();
//        controller.render();
    }

    @Override
    public void dispose() {

        landOfEdomWorld.dispose();
        hud.dispose();
        conversation.dispose();
        actualGameButtons.dispose();
        controller.dispose();
        insideGameMenu.dispose();
        maps.dispose();
        stage.dispose();
    }

    @Override
    public void resize(int width, int height) {
        landOfEdomWorld.resize(width, height);
    }

}
