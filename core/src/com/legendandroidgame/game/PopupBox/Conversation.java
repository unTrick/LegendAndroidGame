package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
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
    private Texture nextTxt;
    public ImageButton nextBtn;
    private TextureAtlas conversationAtlas;
    private TextureRegion convoRegion;
    private Image convoImg;
    String current = gameData.getString("current");
    public int clickCount = 0;

    public Conversation(Stage stage) {

        this.stage = stage;

        switch(Gdx.app.getType()) {
            case Android:
                if(Gdx.graphics.getWidth() > 900){ // HDPI
                    nextTxt = new Texture("1080/button/next.png");
                    conversationAtlas = new TextureAtlas("1080/Texturepack/Convo-HDPI.pack");
                }
                else { // MDPI
                    nextTxt = new Texture("720/button/next.png");
                    conversationAtlas = new TextureAtlas("720/Texturepack/Convo-MDPI.pack");
                }
                break;
            case Desktop:
                if(Gdx.graphics.getWidth() > 1800){ // HDPI
                    nextTxt = new Texture("1080/button/next.png");
                    conversationAtlas = new TextureAtlas("1080/Texturepack/Convo-HDPI.pack");
                }
                else { // MDPI
                    nextTxt = new Texture("720/button/next.png");
                    conversationAtlas = new TextureAtlas("720/Texturepack/Convo-MDPI.pack");
                }
                break;
        }



        // Mission Panel

        convoRegion = conversationAtlas.findRegion("First_Part 1");
        convoImg = new Image(convoRegion);
        convoImg.setPosition(Gdx.graphics.getWidth() / 2 - convoRegion.getRegionWidth() / 2,
                Gdx.graphics.getHeight() / 2 - convoRegion.getRegionHeight() * 2);

        // Buttons
        Drawable nextDraw = new TextureRegionDrawable(new TextureRegion(nextTxt));

        nextBtn = new ImageButton(nextDraw);

        nextBtn.setPosition((Gdx.graphics.getWidth() / 2 + convoRegion.getRegionWidth() / 2) - nextTxt.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - convoRegion.getRegionHeight() * 2);

    }

    public void conversation(){ 
        stage.addActor(convoImg);
        stage.addActor(nextBtn);
    }

    public void closeConversation(){ 
        convoImg.remove();
        nextBtn.remove();
    }


    public void update(){


        if(gameData.getInteger(current + " convoId") == 1){ //
            convoRegion.setRegion(conversationAtlas.findRegion("First_Part 1"));
        }
        else if(gameData.getInteger(current + " convoId") == 2){
            convoRegion.setRegion(conversationAtlas.findRegion("First_Part 2"));
        }
        else if(gameData.getInteger(current + " convoId") == 3){
            convoRegion.setRegion(conversationAtlas.findRegion("First_Part 3"));
        }
        else if(gameData.getInteger(current + " convoId") == 4){
            convoRegion.setRegion(conversationAtlas.findRegion("Second_Part 1"));
        }        
         else if(gameData.getInteger(current + " convoId") == 5){
            convoRegion.setRegion(conversationAtlas.findRegion("Second_Part 2"));
        }       
         else if(gameData.getInteger(current + " convoId") == 6){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_Part1")); 
        }
         else if(gameData.getInteger(current + " convoId") == 7){
            convoRegion.setRegion(conversationAtlas.findRegion("Isaac"));
        }
         else if(gameData.getInteger(current + " convoId") == 8){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_Part2"));
        }
         else if(gameData.getInteger(current + " convoId") == 9){
            convoRegion.setRegion(conversationAtlas.findRegion("Third_Part 1"));
        }
         else if(gameData.getInteger(current + " convoId") == 10){
            convoRegion.setRegion(conversationAtlas.findRegion("Third_Part 2"));
        }
        else if(gameData.getInteger(current + " convoId") == 11){
            convoRegion.setRegion(conversationAtlas.findRegion("Fourth_Part 1"));
        }
        else if(gameData.getInteger(current + " convoId") == 12){
            convoRegion.setRegion(conversationAtlas.findRegion("Fourth_Part 2"));
        }
        else if(gameData.getInteger(current + " convoId") == 13){
            convoRegion.setRegion(conversationAtlas.findRegion("Fifth"));
        }
        else if(gameData.getInteger(current + " convoId") == 14){
            convoRegion.setRegion(conversationAtlas.findRegion("Sixth"));
        }
        else if(gameData.getInteger(current + " convoId") == 15){
            convoRegion.setRegion(conversationAtlas.findRegion("Seventh_Part 1"));
        }
        else if(gameData.getInteger(current + " convoId") == 16){
            convoRegion.setRegion(conversationAtlas.findRegion("Seventh_Part 2"));
        }
        else if(gameData.getInteger(current + " convoId") == 17){
            convoRegion.setRegion(conversationAtlas.findRegion("Seventh_Part 3"));
        }
        else if(gameData.getInteger(current + " convoId") == 18){
            convoRegion.setRegion(conversationAtlas.findRegion("Eighth"));
        }
        else if(gameData.getInteger(current + " convoId") == 19){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_Convo20")); 
        }
        else if(gameData.getInteger(current + " convoId") == 20){
            convoRegion.setRegion(conversationAtlas.findRegion("Israelites_Convo_21_Part1"));
        }
        else if(gameData.getInteger(current + " convoId") == 21){
            convoRegion.setRegion(conversationAtlas.findRegion("Israelites_Convo_21_Part2"));
        }
        else if(gameData.getInteger(current + " convoId") == 22){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_Convo_22_Part1")); 
        }
        else if(gameData.getInteger(current + " convoId") == 23){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_Convo_22_Part2"));
        }
        else if(gameData.getInteger(current + " convoId") == 24){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_Convo_22_Part3"));
        }
        else if(gameData.getInteger(current + " convoId") == 25){
            convoRegion.setRegion(conversationAtlas.findRegion("Israelites_Convo23")); 
        }
        else if(gameData.getInteger(current + " convoId") == 26){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_Convo24")); 
        }
        else if(gameData.getInteger(current + " convoId") == 27){
            convoRegion.setRegion(conversationAtlas.findRegion("Israelites_Convo25")); 
        }
        else if(gameData.getInteger(current + " convoId") == 28){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_Convo26")); 
        }
        else if(gameData.getInteger(current + " convoId") == 29){
            convoRegion.setRegion(conversationAtlas.findRegion("Israelites_Convo27")); 
        }

        //modified convo

        else if(gameData.getInteger(current + " convoId") == 30){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham Intro"));
        }
        else if(gameData.getInteger(current + " convoId") == 31){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_SearchBethel"));
        }
        else if(gameData.getInteger(current + " convoId") == 32){
            convoRegion.setRegion(conversationAtlas.findRegion("OtherCharacter_Convo1"));
        }
        else if(gameData.getInteger(current + " convoId") == 33){
            convoRegion.setRegion(conversationAtlas.findRegion("OtherCharacter_Convo_Decline1"));
        }
        else if(gameData.getInteger(current + " convoId") == 34){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_Wondering"));
        }
        else if(gameData.getInteger(current + " convoId") == 35){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_SearchStone"));
        }
        else if(gameData.getInteger(current + " convoId") == 36){
            convoRegion.setRegion(conversationAtlas.findRegion("OtherCharacter_Convo_Decline2"));
        }
        else if(gameData.getInteger(current + " convoId") == 37){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_Thankyou"));
        }
        else if(gameData.getInteger(current + " convoId") == 38){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_SearchMoriah"));
        }
        else if(gameData.getInteger(current + " convoId") == 39){
            convoRegion.setRegion(conversationAtlas.findRegion("OtherCharacter_Convo2"));
        }
        else if(gameData.getInteger(current + " convoId") == 40){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_Wondering1"));
        }
        else if(gameData.getInteger(current + " convoId") == 41){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_SearchWood"));
        }
        else if(gameData.getInteger(current + " convoId") == 42){
            convoRegion.setRegion(conversationAtlas.findRegion("OtherCharacter_Convo_Decline3"));
        }
        else if(gameData.getInteger(current + " convoId") == 43){
            convoRegion.setRegion(conversationAtlas.findRegion("OtherCharacter_Convo_Decline4"));
        }
        else if(gameData.getInteger(current + " convoId") == 44){
            convoRegion.setRegion(conversationAtlas.findRegion("OtherCharacter_Convo_Decline5"));
        }
        else if(gameData.getInteger(current + " convoId") == 45){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_WonderingRam"));
        }
        else if(gameData.getInteger(current + " convoId") == 46){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_SearchRam"));
        }
        else if(gameData.getInteger(current + " convoId") == 47){
            convoRegion.setRegion(conversationAtlas.findRegion("Moses Intro"));
        }
        else if(gameData.getInteger(current + " convoId") == 48){
            convoRegion.setRegion(conversationAtlas.findRegion("Moses_SearchEgypt"));
        }
        else if(gameData.getInteger(current + " convoId") == 49){
            convoRegion.setRegion(conversationAtlas.findRegion("OtherCharacter_Convo3"));
        }
        else if(gameData.getInteger(current + " convoId") == 50){
            convoRegion.setRegion(conversationAtlas.findRegion("Moses_Part1")); 
        }
        else if(gameData.getInteger(current + " convoId") == 51){
            convoRegion.setRegion(conversationAtlas.findRegion("Pharaoh_Part1")); 
        }
        else if(gameData.getInteger(current + " convoId") == 52){
            convoRegion.setRegion(conversationAtlas.findRegion("Moses_Part2")); 
        }
        else if(gameData.getInteger(current + " convoId") == 53){
            convoRegion.setRegion(conversationAtlas.findRegion("Pharaoh_Part2"));
        }
        else if(gameData.getInteger(current + " convoId") == 54){
            convoRegion.setRegion(conversationAtlas.findRegion("Moses_WonderingStaff"));
        }
        else if(gameData.getInteger(current + " convoId") == 55){
            convoRegion.setRegion(conversationAtlas.findRegion("Moses_SearchStaff"));
        }
        else if(gameData.getInteger(current + " convoId") == 56){
            convoRegion.setRegion(conversationAtlas.findRegion("Moses_Thankyou"));
        }
        else if(gameData.getInteger(current + " convoId") == 57){
            convoRegion.setRegion(conversationAtlas.findRegion("Moses_SearchSinai"));
        }
        else if(gameData.getInteger(current + " convoId") == 58){
            convoRegion.setRegion(conversationAtlas.findRegion("OtherCharacter_Convo4"));
        }
        else if(gameData.getInteger(current + " convoId") == 59){
            convoRegion.setRegion(conversationAtlas.findRegion("Moses_WonderingMaterials"));
        }
        else if(gameData.getInteger(current + " convoId") == 60){
            convoRegion.setRegion(conversationAtlas.findRegion("Moses_SearchMaterials"));
        }
        else if(gameData.getInteger(current + " convoId") == 61){
            convoRegion.setRegion(conversationAtlas.findRegion("Moses_Thankyou1"));
        }
        else if(gameData.getInteger(current + " convoId") == 62){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua Intro"));
        }
        else if(gameData.getInteger(current + " convoId") == 63){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_SearchJordan"));
        }
        else if(gameData.getInteger(current + " convoId") == 64){
            convoRegion.setRegion(conversationAtlas.findRegion("OtherCharacter_Convo5"));
        }
        else if(gameData.getInteger(current + " convoId") == 65){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_SearchStones"));
        }
        else if(gameData.getInteger(current + " convoId") == 66){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_Thankyou"));
        }
        else if(gameData.getInteger(current + " convoId") == 67){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_SearchShechem"));
        }
        else if(gameData.getInteger(current + " convoId") == 68){
            convoRegion.setRegion(conversationAtlas.findRegion("OtherCharacter_Convo6"));
        }
        else if(gameData.getInteger(current + " convoId") == 69){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_WonderingStone"));
        }
        else if(gameData.getInteger(current + " convoId") == 70){
            convoRegion.setRegion(conversationAtlas.findRegion("Joshua_SearchLargeStones"));
        }

        // well
        else if (gameData.getInteger(current + " convoId") == 71){
            convoRegion.setRegion(conversationAtlas.findRegion("Man_Convo1"));
        }
        else if (gameData.getInteger(current + " convoId") == 72){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_Convo1"));
        }
        else if (gameData.getInteger(current + " convoId") == 73){
            convoRegion.setRegion(conversationAtlas.findRegion("Man_Convo2"));
        }
        else if (gameData.getInteger(current + " convoId") == 74){
            convoRegion.setRegion(conversationAtlas.findRegion("Abraham_Convo2"));
        }
        else if (gameData.getInteger(current + " convoId") == 75){
            convoRegion.setRegion(conversationAtlas.findRegion("Man_Convo3"));
        }

    }

    public void dispose(){
        nextTxt.dispose();
        conversationAtlas.dispose();
    }

    public Stage getStage() {
        return stage;
    }


    public ImageButton getNextBtn() {
        return nextBtn;
    }
}
