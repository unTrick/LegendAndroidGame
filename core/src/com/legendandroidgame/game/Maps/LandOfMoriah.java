package com.legendandroidgame.game.Maps;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.Buttons.ActualGameButtons;
import com.legendandroidgame.game.Buttons.Controller;
import com.legendandroidgame.game.CutScenes.ExodusOne;
import com.legendandroidgame.game.GameWorlds.LandOfMoriahWorld;
import com.legendandroidgame.game.HUD.HUD;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.PopupBox.*;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;
import com.legendandroidgame.game.States.Sleep;

import static com.legendandroidgame.game.LegendAndroidGame.gameCam;
import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 1/17/2018.
 */
public class LandOfMoriah extends GameState {

    private Stage stage;
    private LandOfMoriahWorld landOfMoriahWorld;
    private float delta;
    private HUD hud;
    private ActualGameButtons actualGameButtons;
    private Controller controller;
    private InsideGameMenu insideGameMenu;
    private Maps maps;
    private MissionQuest missionQuest;
    private Conversation conversation;
    private Warning warning;
    private Congrats congrats;
    String current = gameData.getString("current");

    /*
    public String pos, direction, fieldOfView, frustum, invProkectionView, view;
    private Label posLbl, directionLbl, frustumLbl, invProkectionViewLbl, viewLbl;
    private BitmapFont font;
    private FileHandle fontFile;
    private Table tableCam;
    */

    // for center

    Texture centerTex;

    // for center

    public LandOfMoriah(GameStateManager gsm) {
        super(gsm);

        gameData.putInteger(current + " currentLocation", 8);
        gameData.flush();

        stage = new Stage(LegendAndroidGame.gameView);
        hud = new HUD(stage);
        actualGameButtons = new ActualGameButtons(stage);
        controller = new Controller(stage);
        landOfMoriahWorld = new LandOfMoriahWorld(controller, actualGameButtons);
        insideGameMenu = new InsideGameMenu(stage);
        maps = new Maps(stage);
        missionQuest = new MissionQuest(stage);
        conversation = new Conversation(stage);
        warning = new Warning(stage);
        congrats = new Congrats(stage);

//        Gdx.input.setInputProcessor(new InputMultiplexer(stage, haranWorld.cameraInputController));

        Gdx.input.setInputProcessor(stage);
//        Gdx.input.setCursorCatched(true);

        stage.addActor(actualGameButtons.getBtnMenu());
        buttonControls();


        // for center

        centerTex = new Texture("720/map/abrahamIndicator.png");
        Image center = new Image(centerTex);
        center.setPosition(stage.getWidth() / 2 - centerTex.getWidth() / 2, stage.getHeight() / 2 - centerTex.getHeight() / 2);
//        stage.addActor(center);

        // for center

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

        actualGameButtons.btnGrab.addListener(new InputListener(){


            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                if(landOfMoriahWorld.woodItem1 || landOfMoriahWorld.woodItem2 || landOfMoriahWorld.woodItem3 ||
                        landOfMoriahWorld.woodItem4 || landOfMoriahWorld.woodItem5) {
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
                        case 4:
                            gameData.putInteger(current + " missionCount", 5);
                            gameData.flush();
                            break;
                    }
                }

                if(landOfMoriahWorld.woodItem1){
                    landOfMoriahWorld.wood1Click = true;
                }
                if (landOfMoriahWorld.woodItem2){
                    landOfMoriahWorld.wood2Click = true;
                }
                if (landOfMoriahWorld.woodItem3){
                    landOfMoriahWorld.wood3Click = true;
                }
                if (landOfMoriahWorld.woodItem4){
                    landOfMoriahWorld.wood4Click = true;
                }
                if (landOfMoriahWorld.woodItem5){
                    landOfMoriahWorld.wood5Click = true;
                }

                if(landOfMoriahWorld.knifeItem){
                    if(!gameData.getString(current + " findKnife").equals("Done")){
                        landOfMoriahWorld.knifeClick = true;
                        gameData.putString(current + " findKnife", "Done");
                        gameData.flush();
                    }
                }

                if(landOfMoriahWorld.ramReady){
                    landOfMoriahWorld.ramPickUp = true;
                }

                return true;
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

//MISSIONA TWO
                //NPC01
                if(landOfMoriahWorld.moriahNPC01 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 41);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(landOfMoriahWorld.moriahNPC02 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 41);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(landOfMoriahWorld.moriahNPC03 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 41);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(landOfMoriahWorld.moriahNPC04 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 41);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(landOfMoriahWorld.moriahNPC05 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 41);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(landOfMoriahWorld.moriahNPC06 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 41);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(landOfMoriahWorld.moriahNPC07 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 41);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(landOfMoriahWorld.moriahNPC08 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 41);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(landOfMoriahWorld.moriahNPC09 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 41);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(landOfMoriahWorld.moriahNPC10 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 41);
                    gameData.flush();
                    conversation.conversation();
                }


//MISSION THREE
                //NPC01
                if(landOfMoriahWorld.moriahNPC01 && gameData.getInteger(current + " missionId") == 3){
                    gameData.putInteger(current + " convoId", 45);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(landOfMoriahWorld.moriahNPC02 && gameData.getInteger(current + " missionId") == 3){
                    gameData.putInteger(current + " convoId", 45);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(landOfMoriahWorld.moriahNPC03 && gameData.getInteger(current + " missionId") == 3){
                    gameData.putInteger(current + " convoId", 45);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(landOfMoriahWorld.moriahNPC04 && gameData.getInteger(current + " missionId") == 3){
                    gameData.putInteger(current + " convoId", 45);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(landOfMoriahWorld.moriahNPC05 && gameData.getInteger(current + " missionId") == 3){
                    gameData.putInteger(current + " convoId", 45);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(landOfMoriahWorld.moriahNPC06 && gameData.getInteger(current + " missionId") == 3){
                    gameData.putInteger(current + " convoId", 45);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(landOfMoriahWorld.moriahNPC07 && gameData.getInteger(current + " missionId") == 3){
                    gameData.putInteger(current + " convoId", 45);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(landOfMoriahWorld.moriahNPC08 && gameData.getInteger(current + " missionId") == 3){
                    gameData.putInteger(current + " convoId", 45);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(landOfMoriahWorld.moriahNPC09 && gameData.getInteger(current + " missionId") == 3){
                    gameData.putInteger(current + " convoId", 45);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(landOfMoriahWorld.moriahNPC10 && gameData.getInteger(current + " missionId") == 3){
                    gameData.putInteger(current + " convoId", 45);
                    gameData.flush();
                    conversation.conversation();
                }

 //MISSION SIX

                //NPC01
                if(landOfMoriahWorld.moriahNPC01 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 57);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(landOfMoriahWorld.moriahNPC02 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 57);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(landOfMoriahWorld.moriahNPC03 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 57);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(landOfMoriahWorld.moriahNPC04 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 57);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(landOfMoriahWorld.moriahNPC05 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 57);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(landOfMoriahWorld.moriahNPC06 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 57);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(landOfMoriahWorld.moriahNPC07 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 57);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(landOfMoriahWorld.moriahNPC08 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 57);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(landOfMoriahWorld.moriahNPC09 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 57);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(landOfMoriahWorld.moriahNPC10 && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 57);
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
//MISSION TWO

                if(gameData.getInteger(current + " convoId") == 41
                        && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 44);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }
//MISSION THREE
                if(gameData.getInteger(current + " convoId") == 45
                        && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 43);
                    gameData.flush();
                    conversation.clickCount = 0;
                }
//MISSION SIX
                if(landOfMoriahWorld.moriahNPC02
                        && gameData.getInteger(current + " convoId") == 57
                        && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 58);
                    gameData.flush();
                    conversation.clickCount = 0;
                }
                else if(landOfMoriahWorld.moriahNPC02
                        && gameData.getInteger(current + " convoId") == 58
                        && gameData.getInteger(current + " missionId") == 6){
                    gameData.putInteger(current + " convoId", 37);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }
                else if(gameData.getInteger(current + " convoId") == 58
                        && gameData.getInteger(current + " missionId") == 6){
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

        //Congrats

        congrats.getCloseBtn().addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                congrats.closePopup();
                //dapat hindi pa dito natatapos ang lahat

                gsm.set(new ExodusOne(gsm));
                dispose();
                gameData.putString(current + " mission3", "Done");
                gameData.flush();

                return false;
            }
        });

    }

    @Override
    protected void handleInput() {

        if(gameData.getString(current + " bringRam").equals("Done")
                && !gameData.getString(current + " mission3").equals("Done")){
            congrats.popup();
        }

        if(hud.health == 0){
            gsm.set(new Sleep(gsm));
            dispose();
        }

        if (landOfMoriahWorld.goToHaran){
            warning.isHaran = true;
            if(warning.yesBtn.isPressed()){
                gameData.putInteger(current + " from", 8);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 2));
                dispose();
            }
        }
        else if (landOfMoriahWorld.gotoBethel) {
            warning.isBethel = true;
            if(warning.yesBtn.isPressed()){
                gameData.putInteger(current + " from", 8);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 3));
                dispose();
            }
        }

        else if (landOfMoriahWorld.goToJordan){
            warning.isJordan = true;
            if(warning.yesBtn.isPressed()){
                gameData.putInteger(current + " from", 8);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 9));
                dispose();
            }
        }
        else {
            warning.isHaran = false;
            warning.isBethel = false;
            warning.isJordan = false;
        }

        if(landOfMoriahWorld.wood1Click || landOfMoriahWorld.wood2Click || landOfMoriahWorld.wood3Click ||
                landOfMoriahWorld.wood4Click || landOfMoriahWorld.wood5Click || landOfMoriahWorld.knifeClick){
            hud.grab = true;
        }
        else {
            hud.grab = false;
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
        delta = dt;
//        gameCam.update();
        hud.getMapName().setText("Land Of Moriah");
        hud.updated(dt);
        actualGameButtons.update();
        conversation.update();
        missionQuest.update();
        maps.update(dt);
        warning.update();

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
        landOfMoriahWorld.render(delta);
        stage.draw();
//        controller.render();
    }

    @Override
    public void dispose() {

        landOfMoriahWorld.dispose();
        hud.dispose();
        conversation.dispose();
        actualGameButtons.dispose();
        controller.dispose();
        insideGameMenu.dispose();
        maps.dispose();
        stage.dispose();
        warning.dispose();
        congrats.dispose();
    }

    @Override
    public void resize(int width, int height) {
        landOfMoriahWorld.resize(width, height);
    }
}
