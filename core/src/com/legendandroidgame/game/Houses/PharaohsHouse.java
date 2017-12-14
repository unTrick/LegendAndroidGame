package com.legendandroidgame.game.Houses;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.GameWorlds.MosesHouseWorld;
import com.legendandroidgame.game.GameWorlds.PharaohsHouseWorld;
import com.legendandroidgame.game.HUD.HUD;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.PopupBox.Conversation;
import com.legendandroidgame.game.PopupBox.InsideGameMenu;
import com.legendandroidgame.game.PopupBox.Inventory;
import com.legendandroidgame.game.PopupBox.MissionQuest;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;
import com.legendandroidgame.game.States.Sleep;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/23/2017.
 */
public class PharaohsHouse extends GameState{
    private Stage stage;
    private PharaohsHouseWorld pharaohsHouseWorld;
    private float delta;
    private HUD hud;
    private ActualGameButtons actualGameButtons;
    private Controller controller;
    private InsideGameMenu insideGameMenu;
    private Inventory inventory;
    private MissionQuest missionQuest;
    private Conversation conversation;
    public String current = gameData.getString("current");
    private int convoId = gameData.getInteger(current + " convoId");

    public PharaohsHouse(GameStateManager gsm) {
        super(gsm);

        gameData.putInteger(current + " currentLocation", 13);
        gameData.flush();

        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        insideGameMenu = new InsideGameMenu(stage);
        inventory = new Inventory(stage);
        missionQuest = new MissionQuest(stage);
        pharaohsHouseWorld = new PharaohsHouseWorld(controller, actualGameButtons);
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
                inventory.close();
                missionQuest.close();
                return false;
            }
        });

        actualGameButtons.getBtnInventory().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                inventory.inventory();
                missionQuest.close();
                insideGameMenu.close();
                return false;
            }
        });

        inventory.getBtnclose().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                inventory.close();
                return false;
            }
        });


        actualGameButtons.getBtnMission().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){

                missionQuest.closeMission(); // addition TODO
                missionQuest.quest();
                inventory.close();
                insideGameMenu.close();
                return false;
            }

        });

        actualGameButtons.getBtnTalk().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                if(pharaohsHouseWorld.canTalkToPharaoh){
                    conversation.pharaohConvo = true;
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

                return false;
            }
        });

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

        conversation.nextBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                convoId += 1;
                gameData.putInteger(current + " convoId", convoId);
                gameData.flush();

                return false;
            }

        });
    }

    @Override
    protected void handleInput() {

        if(pharaohsHouseWorld.goOutside){
            gameData.putInteger(current + " from", 13);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 5));
            dispose();
        }

        if(hud.health == 0){
            gsm.set(new Sleep(gsm));
            dispose();
        }

        if(pharaohsHouseWorld.canTalkToPharaoh){
            System.out.println("can talk");
        }

        if (gameData.getInteger(current + " convoId") > 9) {
            conversation.pharaohConvo = false;
        }

        if(gameData.getInteger(current + " convoId") >9 && gameData.getInteger(current + " missionId") == 2){
            if(!conversation.pharaohConvo){
                gsm.set(new LoadScreen(gsm, 22));
            }
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
        delta = dt;
        stage.act(dt);
        hud.getMapName().setText("Pharaoh's Mansion");
        hud.updated(dt);
        inventory.update();
        missionQuest.update();
        conversation.update();

//        System.out.println(Gdx.graphics.getFramesPerSecond());
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        pharaohsHouseWorld.render(delta);
        stage.draw();
    }

    @Override
    public void dispose() {
        stage.dispose();
        pharaohsHouseWorld.dispose();
        hud.dispose();
        actualGameButtons.dispose();
        controller.dispose();
        insideGameMenu.dispose();
        conversation.dispose();
    }

    @Override
    public void resize(int width, int height) {
//        abrahamHouseWorld.resize(width, height);
    }
}
