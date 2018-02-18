package com.legendandroidgame.game.Mission;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 7/17/2017.
 */
public class MissionContent {

    public String missionName;
    public String missionPhrase;
    public String missionRequirements;
    private String findRam;
    private String talkToPharaoh;
    private String findStaff;
    private String findKnife;
    private String largeStone;

    private String gold, silver, bronze, scarletYarn, twinedLinen, oil, spices, incense, onyxStone, stone,
            goatHair, acaciaWood;

    private String isComplete1, isComplete2, isComplete3, isComplete4, isComplete5, isComplete6, isComplete7, isComplete8;
    private boolean isComplete01 = false, isComplete02 = false, isComplete03 = false;

    private int missionCount = 0;
    private String user = gameData.getString("current");
    public int id = gameData.getInteger(user + " missionId");
    private int missionTime = 0;


    public MissionContent() {
        content(id);
    }

    private void content(int id){

        findRam = gameData.getString(user + " bringRam");
        talkToPharaoh = gameData.getString(user + " talkToPharaoh");
        findStaff = gameData.getString(user + " findStaff");
        findKnife = gameData.getString(user + " findKnife");
        missionCount = gameData.getInteger(user + " missionCount");
        missionTime = gameData.getInteger(user + " questTime");
        largeStone = gameData.getString(user + " largeStone");

        gold = gameData.getString(user + " gold");
        silver = gameData.getString(user + " silver");
        bronze = gameData.getString(user + " bronze");
        scarletYarn = gameData.getString(user + " scarletYarn");
        twinedLinen = gameData.getString(user + " twinedLinen");
        oil = gameData.getString(user + " oil");
        spices = gameData.getString(user + " spices");
        incense = gameData.getString(user + " incense");
        onyxStone = gameData.getString(user + " onyxStone");
        stone = gameData.getString(user + " stone");
        goatHair = gameData.getString(user + " goatHair");
        acaciaWood = gameData.getString(user + " acaciaWood");

        switch (id){
            case 0: missionName = "No active Mission";
                missionRequirements = "You don't have an active mission.";
                break;
            case 1: missionName = "Build an Altar";
                missionRequirements = "Red Stones: \t" + missionCount + "/4" + "\n";
                break;
            case 2: missionName = "Burnt Offering" ;
                missionRequirements = "Woods: \t" + missionCount + "/5" + "\n" +
                "knife: \t" + findKnife;
                break;
            case 3: missionName = "Burnt Offering 2" ;
                missionRequirements = "Ram: \t" + findRam;
                break;
            case 4: missionName = "Talk to Pharoah" ;
                missionRequirements = "Talk: \t" + talkToPharaoh;
                break;
            case 5: missionName = "Split the Sea" ;
                missionRequirements = "Staff: \t" + findStaff;
                break;
            case 6: missionName = "Build a Tabernacle" ;
                missionRequirements = "Gold: \t" + gold + "\n" +
                        "Silver: \t" + silver + "\n" +
                        "Bronze: \t" + bronze + "\n" +
                        "Scarlet Yarn: \t" + scarletYarn + "\n" +
                        "Twined Linen: \t" + twinedLinen + "\n" +
                        "Oil: \t" + oil + "\n" +
                        "Spices: \t" + spices + "\n" +
                        "Incense: \t" + incense + "\n" +
                        "Onyx Stone: \t" + onyxStone + "\n" +
                        "Stone: \t" + stone + "\n" +
                        "Goat's Hair: \t" + goatHair + "\n" +
                        "Acacia Wood: \t" + acaciaWood + "\n";
                break;
            case 7: missionName = "Twelve Tribes" ;
                missionRequirements = "Memorial Stones: \t" + missionCount + "/12";
                break;
            case 8: missionName = "The Terebinth" ;
                missionRequirements = "Large Stone: \t" + largeStone;
                break;
        }
    }

    public void update(){
        if(Gdx.input.isKeyJustPressed(Input.Keys.J)){
            System.out.println(getMissionPhrase());
            System.out.println(getMissionName());
        }

        id = gameData.getInteger(user + " missionId");
        content(id);
        if(Gdx.input.isKeyJustPressed(Input.Keys.V)){
            System.out.println(id);
        }
    }


    public String getMissionName() {
        return missionName;
    }

    public String getMissionPhrase() {
        return missionPhrase;
    }

    public String getMissionRequirements() {
        return missionRequirements;
    }

    public boolean isComplete01() {
        return isComplete01;
    }

    public boolean isComplete02() {
        return isComplete02;
    }

    public boolean isComplete03() {
        return isComplete03;
    }
}
