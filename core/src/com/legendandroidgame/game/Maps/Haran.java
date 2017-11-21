package com.legendandroidgame.game.Maps;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.GameWorlds.HaranWorld;
import com.legendandroidgame.game.HUD.HUD;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.PopupBox.*;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 5/2/2017.
 */
public class Haran extends GameState {
    private Stage stage;
    private HaranWorld haranWorld;
    private float delta;
    private HUD hud;
    private ActualGameButtons actualGameButtons;
    private Controller controller;
    private InsideGameMenu insideGameMenu;
    private Maps maps;
    private MissionQuest missionQuest;
    private Conversation conversation;
    String current = gameData.getString("current");
    private int convoIdMission = gameData.getInteger(current + " convoId");
    private int convoIdInstructor = gameData.getInteger(current + " convoId");
    private int convoIdPeople = gameData.getInteger(current + " convoId");


    /*
    public String pos, direction, fieldOfView, frustum, invProkectionView, view;
    private Label posLbl, directionLbl, frustumLbl, invProkectionViewLbl, viewLbl;
    private BitmapFont font;
    private FileHandle fontFile;
    private Table tableCam;
    */

    public Haran(GameStateManager gsm) {
        super(gsm);

        gameData.putInteger(current + " currentLocation", 2);
        gameData.flush();

        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        haranWorld = new HaranWorld(controller, actualGameButtons);
        insideGameMenu = new InsideGameMenu(stage);
        maps = new Maps(stage);
        missionQuest = new MissionQuest(stage);
        conversation = new Conversation(stage);

//        Gdx.input.setInputProcessor(new InputMultiplexer(stage, haranWorld.cameraInputController));

        Gdx.input.setInputProcessor(stage);
//        Gdx.input.setCursorCatched(true);

        stage.addActor(actualGameButtons.getBtnMenu());
        buttonControls();

        if(conversation.haranConvo){
            gameData.putString("isPaused", "true");
            gameData.flush();
        }
        if (conversation.haranInsConvo1){
            gameData.getString("isPaused", "true");
            gameData.flush();
        }
        if (conversation.haranInsConvo2){
            gameData.getString("isPaused", "true");
            gameData.flush();
        }

        /*
        pos = "Camera Position: \t " + haranWorld.worldCamera.worldCam.position.toString();
        direction = "Camera direction: \t " + haranWorld.worldCamera.worldCam.direction.toString();
        frustum = "Camera frustum: \t " + haranWorld.worldCamera.worldCam.getPickRay(Gdx.input.getX(), Gdx.input.getY());
        invProkectionView = "Camera invprojectionview: \t " + haranWorld.worldCamera.worldCam.invProjectionView.toString();
        view = "Camera view: \t"  + haranWorld.worldCamera.worldCam.view.toString();


        fontFile = Gdx.files.internal("font/Candarab.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 15;
        font = generator.generateFont(parameter);


        tableCam = new Table();
        tableCam.left();
        tableCam.setFillParent(true);
        tableCam.setY(Gdx.graphics.getHeight() / 5);
        tableCam.setX(Gdx.graphics.getWidth() / 16);


        posLbl = new Label(pos, new Label.LabelStyle(font, Color.WHITE));
        directionLbl = new Label(direction, new Label.LabelStyle(font, Color.WHITE));
        frustumLbl = new Label(frustum, new Label.LabelStyle(font, Color.WHITE));
        invProkectionViewLbl = new Label(invProkectionView, new Label.LabelStyle(font, Color.WHITE));
        viewLbl = new Label(view, new Label.LabelStyle(font, Color.WHITE));

        tableCam.add(posLbl).left();
        tableCam.row();
        tableCam.add(directionLbl).left();
        tableCam.row();
        tableCam.add(frustumLbl).left();
        tableCam.row();
        tableCam.add(invProkectionViewLbl).left();
        tableCam.row();
        tableCam.add(viewLbl).left();

        stage.addActor(tableCam);

        */
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

        actualGameButtons.getBtnGrab().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){

                return true;
            }

        });

        missionQuest.getCloseBtn().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                missionQuest.close();
                missionQuest.getMissionLabel().remove();
                missionQuest.getMissionPhrase().remove();
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
                missionQuest.getMissionLabel().remove();
                missionQuest.getMissionPhrase().remove();

                return false;
            }
        });

        missionQuest.getMissionLabel().addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                missionQuest.mission();
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

        conversation.getNextBtn().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                if (conversation.haranConvo){
                    convoIdMission += 1;
                    if (convoIdMission <= 3){
                        gameData.putInteger(current + " convoId", convoIdMission);
                        gameData.flush();
                    }
                    else {
                        conversation.getNextBtn().remove();
                    }
                }
                if (conversation.haranInsConvo1){
                    convoIdInstructor += 1;
                    gameData.putInteger(current + " convoId", convoIdInstructor);
                    gameData.flush();
                }
                if (conversation.haranInsConvo2){
                    convoIdInstructor += 1;
                    gameData.putInteger(current + " convoId", convoIdInstructor);
                    gameData.flush();
                }

//                convoIdPeople += 1;
                if (conversation.haranInsConvo1){
                    if(convoIdInstructor == 3){
                        convoIdInstructor = 1;
                        gameData.putString(current + " isHaranConvoInsDone", "done");
                        gameData.putInteger(current + " convoId", 1);
                        gameData.flush();
                    }
                }

                if(conversation.haranInsConvo2){
                    if(convoIdInstructor == 3){
                        convoIdInstructor = 1;
                        gameData.putString(current + " isHaranConvoInsDone2", "done");
                        gameData.putString(current + " isWellInstructDone", "done");
                        gameData.putInteger(current + " convoId", 1);
                        gameData.flush();
                    }
                }

                if(convoIdMission == 3){
                    gameData.putString(current + " isHaranConvoDone", "done");
                    gameData.putInteger(current + " missionId", 1);
                    gameData.putInteger(current + " questTime", 120);
                    gameData.putInteger(current + " convoId", 1);
                    gameData.putString("isPaused", "false");
                    gameData.flush();
                }

                return false;
            }

        });


    }

    @Override
    protected void handleInput() {
        if(haranWorld.gotoBethel){
            if(gameData.getInteger(current + " missionId") == 7 ||
                    gameData.getInteger(current + " missionId") == 0){
                gameData.putInteger(current + " from", 2);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 11));
                dispose();
            }
            else {
                gameData.putInteger(current + " from", 2);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 3));
                dispose();
            }

        }


        if(haranWorld.gotoAbrahamsHouse){
            gameData.putInteger(current + " from", 2);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 1));
            dispose();
        }

        if(haranWorld.goToJordan){
            gameData.putInteger(current + " from", 2);
            gameData.flush();
            gsm.set(new LoadScreen(gsm, 9));
            dispose();
        }

        if(hud.health == 0){
//            gsm.set(new Sleep(gsm));
//            dispose();
        }

        if(!gameData.getString(current + " isWellInstructDone").equals("done")){
            conversation.haranConvo = false;
        }

        if(gameData.getString(current + " isHaranConvoDone").equals("done")){
            conversation.haranConvo = false;
        }

        if(gameData.getString(current + " isHaranConvoInsDone").equals("done")){
            conversation.haranInsConvo1 = false;
        }

        if (!gameData.getString(current + " isInsWalkDone").equals("done")){
            conversation.haranInsConvo2 = false;
        }
        if (gameData.getString(current + " isInsWalkDone").equals("done")){
            conversation.haranInsConvo2 = true;
        }

        if(gameData.getString(current + " isHaranConvoInsDone2").equals("done")){
            conversation.haranInsConvo2 = false;
            conversation.haranConvo = true;
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
        delta = dt;
//        gameCam.update();
        hud.getMapName().setText("Haran");
        hud.updated(dt);
        actualGameButtons.update();
        conversation.update();
        missionQuest.update();
        maps.update();

        /*
        pos = "Camera Position: \t " + haranWorld.worldCamera.worldCam.position.toString();
        direction = "Camera direction: \t " + haranWorld.worldCamera.worldCam.direction.toString();
        frustum = "Camera frustum: \t " + haranWorld.worldCamera.worldCam.getPickRay(Gdx.input.getX(), Gdx.input.getY());
        invProkectionView = "Camera invprojectionview: \t " + haranWorld.worldCamera.lookAt;
        view = "Camera view: \t " + haranWorld.worldCamera.worldCam.view.toString();

        posLbl.setText(pos);
        directionLbl.setText(direction);
        frustumLbl.setText(frustum);
        invProkectionViewLbl.setText(invProkectionView);
        viewLbl.setText(view);
        */
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        haranWorld.render(delta);
        stage.draw();
//        controller.render();
    }

    @Override
    public void dispose() {

        haranWorld.dispose();
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
        haranWorld.resize(width, height);
    }
}

