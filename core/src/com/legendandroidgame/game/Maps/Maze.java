package com.legendandroidgame.game.Maps;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.CutScenes.ExodusTwo;
import com.legendandroidgame.game.GameWorlds.MazeWorld;
import com.legendandroidgame.game.GameWorlds.PharaohsHouseWorld;
import com.legendandroidgame.game.HUD.HUD;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.PopupBox.Conversation;
import com.legendandroidgame.game.PopupBox.InsideGameMenu;
import com.legendandroidgame.game.PopupBox.MissionQuest;
import com.legendandroidgame.game.PopupBox.Warning;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;
import com.legendandroidgame.game.States.Sleep;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 2/19/2018.
 */
public class Maze extends GameState {
    private Stage stage;
    private MazeWorld mazeWorld;
    private float delta;
    private HUD hud;
    private ActualGameButtons actualGameButtons;
    private Controller controller;
    private InsideGameMenu insideGameMenu;
    //    private Inventory inventory;
    private MissionQuest missionQuest;
    private Conversation conversation;
    private Warning warning;
    public String current = gameData.getString("current");
    private int convoId = gameData.getInteger(current + " convoId");

    public Maze(GameStateManager gsm) {
        super(gsm);

        gameData.putInteger(current + " currentLocation", 15);
        gameData.flush();

        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        insideGameMenu = new InsideGameMenu(stage);
//        inventory = new Inventory(stage);
        missionQuest = new MissionQuest(stage);
        warning = new Warning(stage);
        mazeWorld = new MazeWorld(controller, actualGameButtons);
        conversation = new Conversation(stage);


//        Gdx.input.setInputProcessor(new InputMultiplexer(stage, abrahamHouseWorld.cameraInputController));
        Gdx.input.setInputProcessor(stage);

        stage.addActor(actualGameButtons.getBtnMenu());
        buttonControls();
    }

    private void buttonControls(){
        actualGameButtons.getBtnMenu().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                insideGameMenu.open();
//                inventory.close();
                missionQuest.close();
                return false;
            }
        });

//        actualGameButtons.getBtnInventory().addListener(new ClickListener(){
//
//            @Override
//            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
//                inventory.inventory();
//                missionQuest.close();
//                insideGameMenu.close();
//                return false;
//            }
//        });

//        inventory.getBtnclose().addListener(new ClickListener(){
//
//            @Override
//            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
//                inventory.close();
//                return false;
//            }
//        });

// TODO Mission Buttons

        actualGameButtons.getBtnMission().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){

                missionQuest.closeMission();
                missionQuest.quest();
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

        // Mission Buttons End...

        // addition TODO


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
    }

    @Override
    protected void handleInput() {

        if(mazeWorld.goOutside){
            warning.isHouse = true;
            if(warning.yesBtn.isPressed()) {
                gameData.putInteger(current + " from", 13);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 5));
                dispose();
            }
        }
        else {
            warning.isHouse = false;
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
        stage.act(dt);
        hud.getMapName().setText("Pharaoh's Mansion");
        hud.updated(dt);
//        inventory.update();
        missionQuest.update();
        conversation.update();
        warning.update();
//        System.out.println(Gdx.graphics.getFramesPerSecond());
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        mazeWorld.render(delta);
        stage.draw();
    }

    @Override
    public void dispose() {
        stage.dispose();
        mazeWorld.dispose();
        hud.dispose();
        actualGameButtons.dispose();
        controller.dispose();
        insideGameMenu.dispose();
        conversation.dispose();
        warning.dispose();
    }

    @Override
    public void resize(int width, int height) {
//        abrahamHouseWorld.resize(width, height);
    }
}
