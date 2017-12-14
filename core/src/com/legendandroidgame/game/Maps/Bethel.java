package com.legendandroidgame.game.Maps;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.profiling.GL20Profiler;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Timer;
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
    String current = gameData.getString("current");

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


        actualGameButtons.getBtnMission().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){

                missionQuest.closeMission();
                missionQuest.quest();
                maps.close();
                insideGameMenu.close();
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

                if(gameData.getInteger(current + " missionCount") == 4){
                    missionQuest.closeMission();
                    bethelWorld.goLight = true;
                    trivia.trivNumber = 1;
                    trivia.openTriv();
                }
                else {
                    System.out.println("not finish");
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

        trivia.getCloseBtn().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                trivia.close();

                gameData.putInteger(current + " missionCount", 0);
                gameData.putInteger(current + " missionId", 2);
                gsm.set(new LoadScreen(gsm, 21));
                dispose();
                return false;
            }

        });
    }

    @Override
    protected void handleInput() {
        if(bethelWorld.gotoEgypt){
            if(gameData.getInteger(current + " missionId") == 7 ||
                    gameData.getInteger(current + "missionId") == 0){
                gameData.putInteger(current + " from", 3);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 11));
                dispose();
            }
            else {
                gameData.putInteger(current + " from", 3);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 5));
                dispose();
            }

        }
        if(bethelWorld.gotoHaran){
            gameData.putInteger(current + " from", 3);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 2));
            dispose();
        }

        if(bethelWorld.goToJordan){
            gameData.putInteger(current + " from", 3);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 9));
            dispose();
        }

//
//        if(Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){
//            dispose();
//        }

        if(hud.health == 0){
//            gsm.set(new Sleep(gsm));
//            dispose();
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

        if(bethelWorld.stone1){
            hud.grab = true;
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
        maps.update();
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
    }

    @Override
    public void resize(int width, int height) {
        bethelWorld.resize(width, height);
    }
}
