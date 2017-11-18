package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * Created by Patrick on 10/3/2017.
 */
public class Trivia {

    private Stage stage;
    private Texture genTriv1, closeTex, levTriv1, numbTriv1;
    private ImageButton closeBtn;
    private Image genTriv1Img, levTriv1Img, numbTriv1Img;
    public int trivNumber;

    public Trivia(Stage stage) {
        this.stage = stage;

        if(Gdx.graphics.getWidth() > 1800){
            genTriv1 = new Texture("1080/trivia/GenesisTriviaOne.png");
            closeTex = new Texture("1080/button/close.png");
            levTriv1 = new Texture("1080/trivia/Leviticus - Trivia 11.png");
            numbTriv1 = new Texture("1080/trivia/Numbers - Trivia 12.png");

        }
        else{
            genTriv1 = new Texture("720/trivia/GenesisTriviaOne.png");
            closeTex = new Texture("720/button/close.png");
            levTriv1 = new Texture("720/trivia/Leviticus - Trivia 11.png");
            numbTriv1 = new Texture("720/trivia/Numbers - Trivia 12.png");

        }

        genTriv1Img = new Image(genTriv1);
        levTriv1Img = new Image(levTriv1);
        numbTriv1Img = new Image(numbTriv1);


        Drawable closeDraw = new TextureRegionDrawable(new TextureRegion(closeTex));
        closeBtn = new ImageButton(closeDraw);

        genTriv1Img.setPosition(Gdx.graphics.getWidth() / 2 - genTriv1.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - genTriv1.getHeight() * 2);

        levTriv1Img.setPosition(Gdx.graphics.getWidth() / 2 - levTriv1.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - levTriv1.getHeight() * 2);

        numbTriv1Img.setPosition(Gdx.graphics.getWidth() / 2 - numbTriv1.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - numbTriv1.getHeight() * 2);

        closeBtn.setPosition(Gdx.graphics.getWidth() / 2 + genTriv1.getWidth() / 2 - closeTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - genTriv1.getHeight() * 2);
    }

    public void openTriv(){
        switch (trivNumber){
            case 1: stage.addActor(genTriv1Img);
                    stage.addActor(closeBtn);
                break;
            case 2: stage.addActor(levTriv1Img);
                    stage.addActor(closeBtn);
                break;
            case 3: stage.addActor(numbTriv1Img);
                    stage.addActor(closeBtn);
                break;
        }
    }

    public void close(){
        genTriv1Img.remove();
        levTriv1Img.remove();
        closeBtn.remove();
        numbTriv1Img.remove();
    }

    public void dispose(){
        stage.dispose();
    }

    public ImageButton getCloseBtn() {
        return closeBtn;
    }
}
