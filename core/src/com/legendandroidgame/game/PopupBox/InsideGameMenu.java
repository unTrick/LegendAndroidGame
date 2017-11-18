package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import static com.legendandroidgame.game.LegendAndroidGame.gameView;

/**
 * Created by Patrick on 5/2/2017.
 */
public class InsideGameMenu {
    private Stage stage;
    private Table table;
    private ImageButton home, save, load, exit, resume;
    private Texture tableBG, resumeDown, resumeUp, saveDown, saveUp, loadDown, loadUp, homeDown, homeUp, exitDown, exitUp;


    public InsideGameMenu(Stage stage){

        this.stage = stage;

        if(Gdx.graphics.getWidth() > 1800){
            tableBG = new Texture("1080/popup/Save C - BG.png");
            resumeDown = new Texture("1080/skin/resumeDown.png");
            resumeUp = new Texture("1080/skin/ResumeUp.png");
            saveDown = new Texture("1080/skin/saveDown.png");
            saveUp = new Texture("1080/skin/SaveUp.png");
            loadDown = new Texture("1080/skin/loadDown.png");
            loadUp = new Texture("1080/skin/LoadUp.png");
            homeDown = new Texture("1080/skin/homeDown.png");
            homeUp = new Texture("1080/skin/homeUp.png");
            exitDown = new Texture("1080/skin/exitgameDown.png");
            exitUp = new Texture("1080/skin/Exit GameUp.png");
        }
        else {
            tableBG = new Texture("720/popup/Save C - BG.png");
            resumeDown = new Texture("720/skin/resumeDown.png");
            resumeUp = new Texture("720/skin/ResumeUp.png");
            saveDown = new Texture("720/skin/saveDown.png");
            saveUp = new Texture("720/skin/SaveUp.png");
            loadDown = new Texture("720/skin/loadDown.png");
            loadUp = new Texture("720/skin/LoadUp.png");
            homeDown = new Texture("720/skin/homeDown.png");
            homeUp = new Texture("720/skin/homeUp.png");
            exitDown = new Texture("720/skin/exitgameDown.png");
            exitUp = new Texture("720/skin/Exit GameUp.png");
        }
        table = new Table();
        table.background(new TextureRegionDrawable(new TextureRegion(tableBG)));
        table.setSize(tableBG.getWidth(), tableBG.getHeight());
        table.setPosition((stage.getWidth() / 2) - (table.getWidth() / 2), (stage.getHeight() / 2) - (table.getHeight() / 2));

        Drawable resumeDownDraw = new TextureRegionDrawable(new TextureRegion(resumeDown));
        Drawable resumeUpDraw = new TextureRegionDrawable(new TextureRegion(resumeUp));
        Drawable loadDownDraw = new TextureRegionDrawable(new TextureRegion(loadDown));
        Drawable loadUpDraw = new TextureRegionDrawable(new TextureRegion(loadUp));
        Drawable saveDownDraw = new TextureRegionDrawable(new TextureRegion(saveDown));
        Drawable saveUpDraw = new TextureRegionDrawable(new TextureRegion(saveUp));
        Drawable homeDownDraw = new TextureRegionDrawable(new TextureRegion(homeDown));
        Drawable homeUpDraw = new TextureRegionDrawable(new TextureRegion(homeUp));
        Drawable exitDownDraw = new TextureRegionDrawable(new TextureRegion(exitDown));
        Drawable exitUpDraw = new TextureRegionDrawable(new TextureRegion(exitUp));

        resume = new ImageButton(new ImageButton.ImageButtonStyle(new Button.ButtonStyle(resumeUpDraw, resumeDownDraw, resumeUpDraw)));
        save = new ImageButton(new ImageButton.ImageButtonStyle(new Button.ButtonStyle(loadUpDraw,loadDownDraw,loadUpDraw)));
        load = new ImageButton(new ImageButton.ImageButtonStyle(new Button.ButtonStyle(saveUpDraw,saveDownDraw,saveUpDraw)));
        home = new ImageButton(new ImageButton.ImageButtonStyle(new Button.ButtonStyle(homeUpDraw,homeDownDraw,homeUpDraw)));
        exit = new ImageButton(new ImageButton.ImageButtonStyle(new Button.ButtonStyle(exitUpDraw,exitDownDraw,exitUpDraw)));

        table.add(resume).expandX().padBottom(10);
        table.row();
        table.add(save).expandX().padBottom(10);
        table.row();
        table.add(load).expandX().padBottom(10);
        table.row();
        table.add(home).expandX().padBottom(10);
        table.row();
        table.add(exit).expandX().padBottom(10);


    }


    public void open(){
        stage.addActor(table);
    }

    public void close(){
        table.remove();
    }

    public void dispose(){
        tableBG.dispose();
        resumeDown.dispose();
        resumeUp.dispose();
        saveDown.dispose();
        saveUp.dispose();
        loadDown.dispose();
        loadUp.dispose();
        homeDown.dispose();
        homeUp.dispose();
        exitDown.dispose();
        exitUp.dispose();
    }

    public Stage getStage() {
        return stage;
    }

    public ImageButton getResume() {
        return resume;
    }

    public ImageButton getHome() {
        return home;
    }

    public ImageButton getSave() {
        return save;
    }

    public ImageButton getLoad() {
        return load;
    }

    public ImageButton getExit() {
        return exit;
    }
}

