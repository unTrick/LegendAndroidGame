package com.legendandroidgame.game.Buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * Created by Patrick on 5/2/2017.
 */
public class ActualGameButtons {

    private Texture menu, talk, run, drink, inventory, mission, map, grab;
    public ImageButton btnMenu, btnTalk, btnRun, btnDrink, btnInventory, btnMission, btnMap, btnGrab;
    private Stage stage;
    public Drawable drawMenu, drawTalk, drawRun, drawDrink, drawInventory, drawMission, drawMap, drawGrab;
    private boolean runPressed;

    public ActualGameButtons(Stage stage){

        this.stage = stage;

        if(Gdx.graphics.getWidth() > 1800){
            menu = new Texture("1080/button/close.png");
            talk = new Texture("1080/button/talkbtn.png");
            run = new Texture("1080/button/runbtn.png");
            drink = new Texture("1080/button/drinkbtn.png");
            inventory = new Texture("1080/button/inventorybtn.png");
            mission = new Texture("1080/button/questbtn.png");
            map = new Texture("1080/button/mapbtn.png");
            grab  = new Texture("1080/button/grabbtn.png");
        }
        else {
            menu = new Texture("720/button/close.png");
            talk = new Texture("720/button/talkbtn.png");
            run = new Texture("720/button/runbtn.png");
            drink = new Texture("720/button/drinkbtn.png");
            inventory = new Texture("720/button/inventorybtn.png");
            mission = new Texture("720/button/questbtn.png");
            map = new Texture("720/button/mapbtn.png");
            grab  = new Texture("720/button/grabbtn.png");
        }


        drawMenu = new TextureRegionDrawable(new TextureRegion(menu));
        btnMenu = new ImageButton(drawMenu);
        btnMenu.setPosition(stage.getWidth() - menu.getWidth() * 1.5f, stage.getHeight() - menu.getHeight()* 1.5f);

        drawTalk = new TextureRegionDrawable(new TextureRegion(talk));
        btnTalk = new ImageButton(drawTalk);

        drawRun = new TextureRegionDrawable(new TextureRegion(run));
        btnRun = new ImageButton(drawRun);

        drawDrink = new TextureRegionDrawable(new TextureRegion(drink));
        btnDrink = new ImageButton(drawDrink);

        drawInventory = new TextureRegionDrawable(new TextureRegion(inventory));
        btnInventory = new ImageButton(drawInventory);

        drawMission = new TextureRegionDrawable(new TextureRegion(mission));
        btnMission = new ImageButton(drawMission);

        drawMap = new TextureRegionDrawable(new TextureRegion(map));
        btnMap = new ImageButton(drawMap);

        drawGrab = new TextureRegionDrawable(new TextureRegion(grab));
        btnGrab = new ImageButton(drawGrab);

        Table table = new Table();
        table.right();
        table.bottom().padBottom(50);
        table.setFillParent(true);
//        table.setFillParent(false);

        table.add().width(100).height(100).pad(20,0,0,20);
        table.add(btnMission).width(mission.getWidth()).height(mission.getHeight()).pad(20,0,0,20);
        table.row();
        table.add().width(100).height(100).pad(20,0,0,20);
        table.add(btnMap).width(map.getWidth()).height(map.getHeight()).pad(20,0,0,20);
        table.row();

        switch(Gdx.app.getType()) {
            case Android:
                table.add(btnGrab).width(grab.getWidth()).height(grab.getHeight()).pad(20,0,0,20);
                table.add(btnTalk).width(talk.getWidth()).height(talk.getHeight()).pad(20,0,0,20);
                table.row();
                table.add(btnRun).width(run.getWidth()).height(run.getHeight()).pad(20,0,0,20);
                table.add(btnDrink).width(drink.getWidth()).height(drink.getHeight()).pad(20,0,0,20);
                break;
            case Desktop:
                table.add().width(grab.getWidth()).height(grab.getHeight()).pad(20,0,0,20);
                table.add(btnTalk).width(talk.getWidth()).height(talk.getHeight()).pad(20,0,0,20);
                table.row();
                table.add(btnGrab).width(grab.getWidth()).height(grab.getHeight()).pad(20,0,0,20);
                table.add(btnDrink).width(drink.getWidth()).height(drink.getHeight()).pad(20,0,0,20);
                break;
        }
        stage.addActor(table);

        btnRun.addListener(new InputListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                runPressed = true;
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
               runPressed = false;
            }
        });

    }

    public void update(){


    }

    public void dispose(){
        menu.dispose();
        talk.dispose();
        run.dispose();
        drink.dispose();
        inventory.dispose();
        mission.dispose();
        map.dispose();
    }

    public Stage getStage() {
        return stage;
    }

    public ImageButton getBtnTalk() {
        return btnTalk;
    }

    public ImageButton getBtnRun() {
        return btnRun;
    }

    public boolean isRunPressed() {
        return runPressed;
    }

    public ImageButton getBtnInventory() {
        return btnInventory;
    }

    public ImageButton getBtnMenu() {
        return btnMenu;
    }

    public ImageButton getBtnMission() {
        return btnMission;
    }

    public ImageButton getBtnDrink() {
        return btnDrink;
    }

}
