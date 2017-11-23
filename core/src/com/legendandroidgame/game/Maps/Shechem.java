package com.legendandroidgame.game.Maps;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.GameWorlds.ShechemWorld;
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
public class Shechem extends GameState{

    private Stage stage;
    private ShechemWorld shechemWorld;
    private float delta;
    private HUD hud;
    private ActualGameButtons actualGameButtons;
    private Controller controller;
    private InsideGameMenu insideGameMenu;
    private Maps maps;
    private MissionQuest missionQuest;
    private Conversation conversation;
    private Trivia trivia;
    String current = gameData.getString("current");
    private int convoId = gameData.getInteger(current + " convoId");
    private int convoCount = 1;


    public Shechem(GameStateManager gsm) {
        super(gsm);

        gameData.putInteger(current + " currentLocation", 11);
        gameData.flush();


        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        shechemWorld = new ShechemWorld(controller, actualGameButtons);
        insideGameMenu = new InsideGameMenu(stage);
        missionQuest = new MissionQuest(stage);
        conversation = new Conversation(stage);
        trivia = new Trivia(stage);
        maps = new Maps(stage);



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

                if(shechemWorld.nearTree){
                    missionQuest.closeMission();
                    conversation.joshuaLastMsg1 = true;
                }
                System.out.println(conversation.joshuaLastMsg1);
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
                convoCount += 1;
                gameData.putInteger(current + " convoId", convoId);
                gameData.flush();

                conversation.joshuaLastMsg1 = false;
                gameData.putString(current + " joshuaLast", "Done");
                gameData.flush();
                if(convoCount == 2){
                    conversation.joshuaLastMsg2 = true;
                }
                if(convoCount == 3){
                    gsm.set(new LoadScreen(gsm, 26));
                    dispose();
                }

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

        if(shechemWorld.goJordan){
            gameData.putInteger(current + " from", 11);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 9));
            dispose();
        }

        if(shechemWorld.goToBethel){
            gameData.putInteger(current + " from", 11);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 3));
            dispose();
        }

        if(shechemWorld.goToHaran){
            gameData.putInteger(current + " from", 11);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 2));
            dispose();
        }


    }

    @Override
    public void update(float dt) {
        delta = dt;
//        gameCam.update();
        stage.act(dt);
        hud.getMapName().setText("Shechem");
        hud.updated(dt);
        conversation.update();
        missionQuest.update();

        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        shechemWorld.render(delta);
        stage.draw();
//        controller.render();
    }

    @Override
    public void dispose() {
        shechemWorld.dispose();
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
        shechemWorld.resize(width, height);
    }

}
