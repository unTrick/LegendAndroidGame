package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 5/2/2017.
 */
public class Conversation {

    private Stage stage;
    private Texture nextTex;
    public ImageButton nextBtn;
    private Texture haran1Tex, haran2Tex, haran3Tex, exoOneTex, exoTwoTex, exoMoses1Tex, exoMoses2Tex,  pharaoh1Tex, pharaoh2Tex,
            levMoses1Tex, numbersGuyTex, numbersOneTex,  joshuaLast1, joshuaLast2, diaBack, wellIns1Tex, wellIns2Tex, wellAbraham1Tex,
            wellAbraham2Tex;
    public Image haran1, haran2, haran3, exoOne, exoTwo, exoMoses1, exoMoses2, pharaoh1, pharaoh2, levMoses1, numbersGuy,
    numbersOne, joshuaLast1Img, joshuaLast2Img, wellIns1Img, wellIns2Img, wellAbraham1Img, wellAbraham2Img;
    String current = gameData.getString("current");
    public boolean exoOneConvo = true;
    public boolean pharaohConvo = true;
    public boolean haranConvo = true;
    public boolean aaronConvoLev = true;
    public boolean talkToNumbersGuy = true;
    public boolean joshuaLastMsg1 = true;
    public boolean joshuaLastMsg2 = true;
    public boolean haranInsConvo1 = true;
    public boolean haranInsConvo2 = true;

    public Conversation(Stage stage) {
        this.stage = stage;

        if(Gdx.graphics.getWidth() > 1800){
            nextTex = new Texture("1080/convo/Arrow Right.png");
            diaBack = new Texture("1080/convo/Genesis Convo 1 Part 1.png");
            haran1Tex = new Texture("1080/convo/Genesis Convo 1 Part 1.png");
            haran2Tex = new Texture("1080/convo/Genesis Convo 1 Part 2.png");
            haran3Tex = new Texture("1080/convo/Genesis Convo 1 Part 3.png");
            exoOneTex = new Texture("1080/convo/ExodusGod1.png");
            exoTwoTex = new Texture("1080/convo/ExodusGod2.png");
            exoMoses1Tex = new Texture("1080/convo/ExodusMoses1.png");
            exoMoses2Tex = new Texture("1080/convo/ExodusMoses2.png");
            pharaoh1Tex = new Texture("1080/convo/ExodusPharaoh1.png");
            pharaoh2Tex = new Texture("1080/convo/ExodusPharaoh2.png");
            levMoses1Tex = new Texture("1080/convo/LeviticusConvo1.png");
            numbersGuyTex = new Texture("1080/convo/NumbersGuy.png");
            numbersOneTex = new Texture("1080/convo/GodNumbers.png");
            joshuaLast1 = new Texture("1080/convo/JoshuaLast1.png");
            joshuaLast2 = new Texture("1080/convo/JoshuaLast2.png");
        }
        else {
            nextTex = new Texture("720/convo/Arrow Right.png");
            diaBack = new Texture("720/convo/Abraham_Convo2.png");
            haran1Tex = new Texture("720/convo/Genesis Convo 1 Part 1.png");
            haran2Tex = new Texture("720/convo/Genesis Convo 1 Part 2.png");
            haran3Tex = new Texture("720/convo/Genesis Convo 1 Part 3.png");
            exoOneTex = new Texture("720/convo/ExodusGod1.png");
            exoTwoTex = new Texture("720/convo/ExodusGod2.png");
            exoMoses1Tex = new Texture("720/convo/ExodusMoses1.png");
            exoMoses2Tex = new Texture("720/convo/ExodusMoses2.png");
            pharaoh1Tex = new Texture("720/convo/ExodusPharaoh1.png");
            pharaoh2Tex = new Texture("720/convo/ExodusPharaoh2.png");
            levMoses1Tex = new Texture("720/convo/LeviticusConvo1.png");
            numbersGuyTex = new Texture("720/convo/NumbersGuy.png");
            numbersOneTex = new Texture("720/convo/GodNumbers.png");
            joshuaLast1 = new Texture("720/convo/JoshuaLast1.png");
            joshuaLast2 = new Texture("720/convo/JoshuaLast2.png");
            wellIns1Tex = new Texture("720/convo/Man_Convo1.png");
            wellIns2Tex = new Texture("720/convo/Man_Convo2.png");
            wellAbraham1Tex = new Texture("720/convo/Abraham_Convo1.png");
            wellAbraham2Tex = new Texture("720/convo/Abraham_Convo2.png");
        }

        haran1 = new Image(haran1Tex);
        haran1.setPosition(Gdx.graphics.getWidth() / 2 - haran1Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - haran1Tex.getHeight() * 2);

        haran2 = new Image(haran2Tex);
        haran2.setPosition(Gdx.graphics.getWidth() / 2 - haran2Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - haran2Tex.getHeight() * 2);

        haran3 = new Image(haran3Tex);
        haran3.setPosition(Gdx.graphics.getWidth() / 2 - haran3Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - haran3Tex.getHeight() * 2);

        exoOne = new Image(exoOneTex);
        exoOne.setPosition(Gdx.graphics.getWidth() / 2 - exoOneTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - exoOneTex.getHeight() * 2);

        exoTwo = new Image(exoTwoTex);
        exoTwo.setPosition(Gdx.graphics.getWidth() / 2 - exoTwoTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - exoTwoTex.getHeight() * 2);

        exoMoses1 = new Image(exoMoses1Tex);
        exoMoses1.setPosition(Gdx.graphics.getWidth() / 2 - exoMoses1Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - exoMoses1Tex.getHeight() * 2);

        exoMoses2 = new Image(exoMoses2Tex);
        exoMoses2.setPosition(Gdx.graphics.getWidth() / 2 - exoMoses2Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - exoMoses2Tex.getHeight() * 2);

        pharaoh1 = new Image(pharaoh1Tex);
        pharaoh1.setPosition(Gdx.graphics.getWidth() / 2 - pharaoh1Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - pharaoh1Tex.getHeight() * 2);

        pharaoh2 = new Image(pharaoh2Tex);
        pharaoh2.setPosition(Gdx.graphics.getWidth() / 2 - pharaoh2Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - pharaoh2Tex.getHeight() * 2);

        levMoses1 = new Image(levMoses1Tex);
        levMoses1.setPosition(Gdx.graphics.getWidth() / 2 - levMoses1Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - levMoses1Tex.getHeight() * 2);

        numbersGuy = new Image(numbersGuyTex);
        numbersGuy.setPosition(Gdx.graphics.getWidth() / 2 - numbersGuyTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - numbersGuyTex.getHeight() * 2);

        numbersOne = new Image(numbersOneTex);
        numbersOne.setPosition(Gdx.graphics.getWidth() / 2 - numbersOneTex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - numbersOneTex.getHeight() * 2);

        joshuaLast1Img = new Image(joshuaLast1);
        joshuaLast1Img.setPosition(Gdx.graphics.getWidth() / 2 - joshuaLast1.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - joshuaLast1.getHeight() * 2);

        joshuaLast2Img = new Image(joshuaLast2);
        joshuaLast2Img.setPosition(Gdx.graphics.getWidth() / 2 - joshuaLast2.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - joshuaLast2.getHeight() * 2);

        wellIns1Img = new Image(wellIns1Tex);
        wellIns1Img.setPosition(Gdx.graphics.getWidth() / 2 - wellIns1Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - wellIns1Tex.getHeight() * 1.3f);

        wellIns2Img = new Image(wellIns2Tex);
        wellIns2Img.setPosition(Gdx.graphics.getWidth() / 2 - wellIns2Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - wellIns2Tex.getHeight() * 1.3f);

        wellAbraham1Img = new Image(wellAbraham1Tex);
        wellAbraham1Img.setPosition(Gdx.graphics.getWidth() / 2 - wellAbraham1Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - wellAbraham1Tex.getHeight() * 1.3f);

        wellAbraham2Img = new Image(wellAbraham2Tex);
        wellAbraham2Img.setPosition(Gdx.graphics.getWidth() / 2 - wellAbraham2Tex.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - wellAbraham2Tex.getHeight() * 1.3f);

        Drawable nextDraw = new TextureRegionDrawable(new TextureRegion(nextTex));
        nextBtn = new ImageButton(nextDraw);
            nextBtn.setPosition(Gdx.graphics.getWidth() / 2 + diaBack.getWidth() / 2 - nextTex.getWidth(),
                Gdx.graphics.getHeight() / 2 - diaBack.getHeight() * 1.2f );

    }


    public void update(){

        /*
        if(haranInsConvo1){
            if (gameData.getInteger(current + " convoId") == 1){
                stage.addActor(wellIns1Img);
                stage.addActor(nextBtn);
            }
            else if(gameData.getInteger(current + " convoId") == 2){
                wellIns1Img.remove();
                nextBtn.remove();
                stage.addActor(wellAbraham1Img);
                stage.addActor(nextBtn);
            }
        }
        else if(haranInsConvo2){
            if (gameData.getInteger(current + " convoId") == 1){
                stage.addActor(wellIns2Img);
                stage.addActor(nextBtn);
            }
            else if(gameData.getInteger(current + " convoId") == 2){
                wellIns2Img.remove();
                nextBtn.remove();
                stage.addActor(wellAbraham2Img);
                stage.addActor(nextBtn);
            }
        }
        else {
            wellAbraham2Img.remove();
            wellAbraham1Img.remove();
            nextBtn.remove();
        }

        if (haranConvo){
            if(gameData.getInteger(current + " convoId") == 1){
                stage.addActor(haran1);
                stage.addActor(nextBtn);
            }
            else if(gameData.getInteger(current + " convoId") == 2){
                haran1.remove();
                nextBtn.remove();
                stage.addActor(haran2);
                stage.addActor(nextBtn);
            }
            else if(gameData.getInteger(current + " convoId") == 3){
                haran1.remove();
                haran2.remove();
                nextBtn.remove();
                stage.addActor(haran3);
                stage.addActor(nextBtn);
            }
            // TODO
            if (gameData.getString(current + " isHaranConvoDone").equals("done")){
                haran1.remove();
                haran2.remove();
                haran3.remove();
                nextBtn.remove();
            }
        }

        // TODO the list of codes below are full of sheete!

        if(gameData.getInteger(current + " convoId") >= 6){
            if (exoOneConvo){
                if(gameData.getInteger(current + " convoId") == 4){
                    stage.addActor(exoOne);
                    stage.addActor(nextBtn);
                }
                else if(gameData.getInteger(current + " convoId") == 5){
                    exoOne.remove();
                    nextBtn.remove();
                    stage.addActor(exoTwo);
                    stage.addActor(nextBtn);
                }
            }
            else {
                exoTwo.remove();
                nextBtn.remove();
            }
        }


        if(pharaohConvo){
            if(gameData.getInteger(current + " convoId") == 6){
                stage.addActor(exoMoses1);
                stage.addActor(nextBtn);
            }
            else if(gameData.getInteger(current + " convoId") == 7){
                exoMoses1.remove();
                nextBtn.remove();
                stage.addActor(pharaoh1);
                stage.addActor(nextBtn);
            }
            if(gameData.getInteger(current + " convoId") == 8){
                pharaoh1.remove();
                nextBtn.remove();
                stage.addActor(exoMoses2);
                stage.addActor(nextBtn);
            }
            else if(gameData.getInteger(current + " convoId") == 9){
                exoMoses2.remove();
                nextBtn.remove();
                stage.addActor(pharaoh2);
                stage.addActor(nextBtn);
            }
        }
        else {
            if(gameData.getInteger(current + " convoId") >= 9){
                pharaoh2.remove();
                nextBtn.remove();
            }

        }

        if(aaronConvoLev){
            if(gameData.getInteger(current + " convoId") == 10){
                stage.addActor(levMoses1);
                stage.addActor(nextBtn);
            }
        }
        else {
            if(gameData.getString(current + " talkToAaronLev").equals("Done")){
//                TODO nothing happens here
            }
            else {
                if(gameData.getInteger(current + " convoId") == 11){
                    levMoses1.remove();
                    nextBtn.remove();
                    gameData.putString(current + " talkToAaronLev", "Done");
                }
            }
        }

        if(talkToNumbersGuy){
            if(gameData.getInteger(current + " convoId") == 11){
                stage.addActor(numbersGuy);
                stage.addActor(nextBtn);
            }
        }
        else {
                if(gameData.getInteger(current + " convoId") == 12){
                    numbersGuy.remove();
                    nextBtn.remove();
                }
        }

        if(gameData.getInteger(current + " convoId") == 12){
            stage.addActor(numbersOne);
            stage.addActor(nextBtn);
        }
        if (gameData.getInteger(current + " convoId") == 13 && gameData.getInteger(current + " missionId") == 0){
            numbersOne.remove();
            nextBtn.remove();
        }

        if(gameData.getInteger(current + " missionId") == 7){
            if(joshuaLastMsg1){
                stage.addActor(joshuaLast1Img);
                stage.addActor(nextBtn);
            }
            else {
                joshuaLast1Img.remove();
                nextBtn.remove();
            }
        }


        if(gameData.getString(current + " joshuaLast").equals("Done")){
            if(joshuaLastMsg2){
                stage.addActor(joshuaLast2Img);
                stage.addActor(nextBtn);
            }
            else {
                joshuaLast2Img.remove();
                nextBtn.remove();
            }
        }

*/

    }

    public void dispose(){

        nextTex.dispose();
        haran1Tex.dispose();
        haran2Tex.dispose();
        haran3Tex.dispose();

    }
}
