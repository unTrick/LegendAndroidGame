package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/23/2017.
 */
public class Maps {

    private Stage stage;
    private Texture haranTex, bethelTex, shechemTex, edomTex, jordanTex, eWestTex, eNorthTex, eSouthTex, eEastTex, closeTex;
    private Texture abrahamHeadText;
    private Image haranImg, bethelImg, shechemImg, edomImg, jordanImg, eWestImg, eNorthImg, eSouthImg, eEastImg;
    private Image abrahamHeadImg;
    private ImageButton closeBtn;
    private String current = gameData.getString("current");
    public Vector2 pos = new Vector2();

    public Maps(Stage stage){
        this.stage = stage;

        if(Gdx.graphics.getWidth() > 1800){
            closeTex = new Texture("1080/button/close.png");
            haranTex = new Texture("1080/map/Haran.png");
            bethelTex = new Texture("1080/map/Bethel.png");
            shechemTex = new Texture("1080/map/shechem.png");
            edomTex = new Texture("1080/map/Edom.png");
            jordanTex = new Texture("1080/map/Jordan.png");
            eWestTex = new Texture("1080/map/E_west.PNG");
            eNorthTex = new Texture("1080/map/E_north.PNG");
            eSouthTex = new Texture("1080/map/E_south.PNG");
            eEastTex = new Texture("1080/map/E_east.PNG");
            abrahamHeadText = new Texture("1080/map/abrahamIndicator.png");
        }
        else {
            closeTex = new Texture("720/button/close.png");
            haranTex = new Texture("720/map/Haran.png");
            bethelTex = new Texture("720/map/Bethel.png");
            shechemTex = new Texture("720/map/shechem.png");
            edomTex = new Texture("720/map/Edom.png");
            jordanTex = new Texture("720/map/Jordan.png");
            eWestTex = new Texture("720/map/E_west.PNG");
            eNorthTex = new Texture("720/map/E_north.PNG");
            eSouthTex = new Texture("720/map/E_south.PNG");
            eEastTex = new Texture("720/map/E_east.PNG");
            abrahamHeadText = new Texture("720/map/abrahamIndicator.png");
        }

        haranImg = new Image(haranTex);
        bethelImg = new Image(bethelTex);
        shechemImg = new Image(shechemTex);
        edomImg = new Image(edomTex);
        jordanImg = new Image(jordanTex);
        eWestImg = new Image(eWestTex);
        eNorthImg = new Image(eNorthTex);
        eSouthImg = new Image(eSouthTex);
        eEastImg = new Image(eEastTex);
        abrahamHeadImg = new Image(abrahamHeadText);

        haranImg.setPosition(Gdx.graphics.getWidth() / 2 - haranTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - haranTex.getHeight() / 2);
        bethelImg.setPosition(Gdx.graphics.getWidth() / 2 - bethelTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - bethelTex.getHeight() / 2);
        shechemImg.setPosition(Gdx.graphics.getWidth() / 2 - eWestTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - shechemTex.getHeight() / 2);
        edomImg.setPosition(Gdx.graphics.getWidth() / 2 - edomTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - edomTex.getHeight() / 2);
        jordanImg.setPosition(Gdx.graphics.getWidth() / 2 - jordanTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - jordanTex.getHeight() / 2);
        eWestImg.setPosition(Gdx.graphics.getWidth() / 2 - eWestTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - eWestTex.getHeight() / 2);
        eNorthImg.setPosition(Gdx.graphics.getWidth() / 2 - eNorthTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - eNorthTex.getHeight() / 2);
        eSouthImg.setPosition(Gdx.graphics.getWidth() / 2 - eSouthTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - eSouthTex.getHeight() / 2);
        eEastImg.setPosition(Gdx.graphics.getWidth() / 2 - eEastTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - eEastTex.getHeight() / 2);
//        bethelImg.setRotation(90);
        Drawable closeDraw = new TextureRegionDrawable(new TextureRegion(closeTex));
        closeBtn = new ImageButton(closeDraw);

        closeBtn.setPosition((Gdx.graphics.getWidth() / 2 + eWestTex.getWidth() / 2 ) - closeTex.getWidth() / 2,
                (Gdx.graphics.getHeight() / 2 + eWestTex.getHeight() / 2) - closeTex.getHeight() / 2);
    }

    public void close (){
        haranImg.remove();
        bethelImg.remove();
        shechemImg.remove();
        edomImg.remove();
        jordanImg.remove();
        eWestImg.remove();
        eNorthImg.remove();
        eSouthImg.remove();
        eEastImg.remove();
        closeBtn.remove();
        abrahamHeadImg.remove();
    }

    public void open(){
        if(gameData.getInteger(current + " currentLocation") == 2){
            stage.addActor(haranImg);
            stage.addActor(closeBtn);
        }

        else if(gameData.getInteger(current + " currentLocation") == 3){
            stage.addActor(bethelImg);
            stage.addActor(closeBtn);
        }

        else if(gameData.getInteger(current + " currentLocation") == 11){

            stage.addActor(shechemImg);
            stage.addActor(closeBtn);

        }

        else if(gameData.getInteger(current + " currentLocation") == 8){

            stage.addActor(edomImg);
            stage.addActor(closeBtn);

        }

        else if(gameData.getInteger(current + " currentLocation") == 9){

            stage.addActor(jordanImg);
            stage.addActor(closeBtn);
        }

        else if(gameData.getInteger(current + " currentLocation") == 7){

            stage.addActor(eWestImg);
            stage.addActor(closeBtn);
        }

        else if(gameData.getInteger(current + " currentLocation") == 5){


            stage.addActor(eNorthImg);
            stage.addActor(closeBtn);
        }

        else if(gameData.getInteger(current + " currentLocation") == 6){

            stage.addActor(eSouthImg);
            stage.addActor(closeBtn);
        }

        else if(gameData.getInteger(current + " currentLocation") == 4){

            stage.addActor(eEastImg);
            stage.addActor(closeBtn);
        }
        stage.addActor(abrahamHeadImg);
    }

    public void update(float delta){
//        if(Gdx.input.isKeyJustPressed(Input.Keys.M)){
////            System.out.println(haranTex.getHeight());
//        }

//        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
//            pos.y += .5;
//        }
//        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
//            pos.x += .5;
//        }
//        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
//            pos.y -= .5;
//        }
//        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
//            pos.x -= .5;
//        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.M)){
            System.out.println("this is from maps" + pos.x + "\t" + pos.y);
        }

        abrahamHeadImg.setPosition(pos.x,pos.y);
//        if(Gdx.input.justTouched()){
//            System.out.println(Gdx.input.getX());
//            System.out.println(Gdx.input.getY());
//        }
    }

    public void dispose(){
        haranTex.dispose();
        bethelTex.dispose();
        edomTex.dispose();
        shechemTex.dispose();
        jordanTex.dispose();
        eEastTex.dispose();
        eWestTex.dispose();
        eSouthTex.dispose();
        eNorthTex.dispose();
        closeTex.dispose();
    }

    public ImageButton getCloseBtn() {
        return closeBtn;
    }
}
