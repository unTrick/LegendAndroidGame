package com.legendandroidgame.game.Maps;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
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
import com.legendandroidgame.game.States.Sleep;

import static com.legendandroidgame.game.LegendAndroidGame.gameCam;
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
    private Warning warning;
    String current = gameData.getString("current");

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
        warning = new Warning(stage);

//        Gdx.input.setInputProcessor(new InputMultiplexer(stage, haranWorld.cameraInputController));

        Gdx.input.setInputProcessor(stage);
//        Gdx.input.setCursorCatched(true);

        stage.addActor(actualGameButtons.getBtnMenu());
        buttonControls();

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

        actualGameButtons.btnTalk.addListener(new ClickListener(){
           @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){
               if (haranWorld.wellInstructorBounds){
                   if (gameData.getString(current + " isWellInstructDone").equals("done")){
                       gameData.putInteger(current + " convoId", 73);
                       gameData.flush();
                       conversation.conversation();
                   }
                   else if (conversation.clickCount >= 2){
                       conversation.conversation();
                   }
                   else {
                       gameData.putInteger(current + " convoId", 71);
                       gameData.flush();
                       conversation.conversation();
                   }
               }


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
                if(haranWorld.haranNPC01 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 31);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(haranWorld.haranNPC02 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 31);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(haranWorld.haranNPC03 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 31);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(haranWorld.haranNPC04 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 31);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(haranWorld.haranNPC05 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 31);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(haranWorld.haranNPC06 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 31);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(haranWorld.haranNPC07 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 31);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(haranWorld.haranNPC08 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 31);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(haranWorld.haranNPC09 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 31);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(haranWorld.haranNPC10 && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 31);
                    gameData.flush();
                    conversation.conversation();
                }


                //MISSION TWO

                //NPC01
                if(haranWorld.haranNPC01 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC02
                if(haranWorld.haranNPC02 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC03
                if(haranWorld.haranNPC03 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC04
                if(haranWorld.haranNPC04 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC05
                if(haranWorld.haranNPC05 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC06
                if(haranWorld.haranNPC06 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC07
                if(haranWorld.haranNPC07 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC08
                if(haranWorld.haranNPC08 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC09
                if(haranWorld.haranNPC09 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
                    gameData.flush();
                    conversation.conversation();
                }

                //NPC10
                if(haranWorld.haranNPC10 && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 38);
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



                if(haranWorld.haranNPC04
                        && gameData.getInteger(current + " convoId") == 31
                        && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 32);
                    gameData.flush();
                    conversation.clickCount = 0;
                }
                else if(haranWorld.haranNPC01
                        && gameData.getInteger(current + " convoId") == 32
                        && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 37);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }
                else if(gameData.getInteger(current + " convoId") == 31
                        && gameData.getInteger(current + " missionId") == 1){
                    gameData.putInteger(current + " convoId", 33);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }

                //MISSION TWO
                if(haranWorld.haranNPC01
                        && gameData.getInteger(current + " convoId") == 38
                        && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 39);
                    gameData.flush();
                    conversation.clickCount = 0;
                }
                else if(haranWorld.haranNPC01
                        && gameData.getInteger(current + " convoId") == 39
                        && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 37);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }
                else if(gameData.getInteger(current + " convoId") == 38
                        && gameData.getInteger(current + " missionId") == 2){
                    gameData.putInteger(current + " convoId", 33);
                    gameData.flush();
                    conversation.clickCount = 0;
                    conversation.closeConversation();
                }



                if (gameData.getInteger(current + " convoId") == 71){
                    gameData.putInteger(current + " convoId", 72);
                    gameData.flush();
                }
                else if(gameData.getInteger(current + " convoId") == 72){
                    gameData.putInteger(current + " convoId", 73);
                    gameData.putString(current + " isHaranConvoInsDone", "done");
                    gameData.flush();
                    conversation.closeConversation();
                }

                else if(gameData.getInteger(current + " convoId") == 73){
                    gameData.putInteger(current + " convoId", 74);
                    gameData.flush();
                }
                else if(gameData.getInteger(current + " convoId") == 74){
                    gameData.putInteger(current + " convoId", 75);
                    gameData.putString(current + " isWellInstructDone", "done");
                    gameData.flush();

                }
                else if (gameData.getInteger(current + " convoId") == 75){
                    conversation.closeConversation();
                }


                if(gameData.getInteger(current + " convoId") == 1){
                    gameData.putString(current + " firstTalktoGod", "done");
                    gameData.putInteger(current + " convoId", 2);
                    gameData.flush();
                }
                else if (gameData.getInteger(current + " convoId") == 2){
                    gameData.putInteger(current + " convoId", 3);
                    gameData.flush();
                }
                else if (gameData.getInteger(current + " convoId") == 3){
                    conversation.closeConversation();
                    missionQuest.missionOverview();
                    hud.questTime = 300;
                    hud.currentQuestTime = 600;
                    gameData.putInteger(current + " currentQuestTime", 600);
                    gameData.putInteger(current + " questTime", 300);
                    gameData.putInteger(current + " missionId", 1);
                    gameData.flush();
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



    }

    @Override
    protected void handleInput() {

        // Map point mover

        maps.pos.x = haranWorld.mover.x;
        maps.pos.y = haranWorld.mover.y;

        if (Gdx.input.isKeyJustPressed(Input.Keys.M)){
            System.out.println("this is from haran" + haranWorld.mover.x + "\t" + haranWorld.mover.y);
            System.out.println("this is from haran" + maps.pos.x + "\t" + maps.pos.y);
        }

        // Map point mover

        if(haranWorld.gotoBethel){
            warning.isBethel = true;
            if(warning.yesBtn.isPressed()){
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
        }

        else if(haranWorld.gotoAbrahamsHouse){
            warning.isHouse = true;
            if(warning.yesBtn.isPressed()){
                gameData.putInteger(current + " from", 2);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 1));
                dispose();
            }
        }

        else if(haranWorld.goToMoriah){
            warning.isMoriah = true;
            if(warning.yesBtn.isPressed()){
                gameData.putInteger(current + " from", 2);
                gameData.flush();
                gsm.set(new LoadScreen(gsm, 8));
                dispose();
            }
        }

        else {
            warning.isBethel = false;
            warning.isHouse = false;
            warning.isMoriah = false;
        }

        if(hud.health == 0){
            gsm.set(new Sleep(gsm));
            dispose();
        }

        if(hud.questTime <= 0){
            if(gameData.getInteger(current + " missionId") == 1) {
                gsm.set(new LoadScreen(gsm, 2));
                hud.questTime = 300;
                gameData.putInteger(current + " questTime", 300);
                gameData.flush();
                dispose();
            }
        }

        if(actualGameButtons.getBtnDrink().isPressed()){
            if(Gdx.input.justTouched()){
                if(haranWorld.isWellTouch){
                    hud.health += 100;
                    if (hud.health > 960){
                        hud.health = 960;
                    }
                }
            }
        }



        if(gameData.getString(current + " isWellInstructDone").equals("done")){
            if (!gameData.getString(current + " firstTalktoGod").equals("done")){
                gameData.putInteger(current + " convoId", 1);
                gameData.flush();
                conversation.conversation();
            }
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
        warning.dispose();
    }

    @Override
    public void resize(int width, int height) {
        haranWorld.resize(width, height);
    }
}

