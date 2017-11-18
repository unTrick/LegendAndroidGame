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
    private String talkToSarai;
    private String talkToLot;
    private String talkToPharaoh;
    private String talkToAaron;
    private String talkToAaronLev;
    private String findJarOfWater;
    private String findCoat;
    private String findSash;
    private String findCap;
    private String findStaff;
    private String findWoodenPole;
    private String findPlaster;
    private String findLargeStone;
    private String findLandOfEdom;
    private String isComplete1, isComplete2, isComplete3, isComplete4, isComplete5;
    private boolean isComplete01 = false, isComplete02 = false, isComplete03 = false;

    private int missionCount = 0;
    private String user = gameData.getString("current");
    public int id = gameData.getInteger(user + " missionId");
    private int missionTime = 0;


    public MissionContent() {
        content();
    }

    private void content(){

        talkToSarai = gameData.getString(user + " talkToSarai");
        talkToLot = gameData.getString(user + " talkToSarai");
        talkToPharaoh = gameData.getString(user + " talkToAaron");
        talkToAaron = gameData.getString(user + " talkToSarai");
        talkToAaronLev = gameData.getString(user + " talkToAaronLev");
        findJarOfWater = gameData.getString(user + " findJarOfWater");
        findCoat = gameData.getString(user + " findCoat");
        findSash = gameData.getString(user + " findSash");
        findCap = gameData.getString(user + " findCap");
        findStaff = gameData.getString(user + " findStaff");
        findWoodenPole = gameData.getString(user + " findWoodenPole");
        findPlaster = gameData.getString(user + " findPlaster");
        findLargeStone = gameData.getString(user + " findLargeStone");
        findLandOfEdom = gameData.getString(user + " findLandOfEdom");
        missionCount = gameData.getInteger(user + " missionCount");
        missionTime = gameData.getInteger(user + " questTime");

        switch (id){
            case 0: missionName = "\nNo active Mission\n";
                missionPhrase = "You don't have an active mission.";
                break;
            case 1: missionName = "Build an Altar\n\n";
                missionPhrase = "Got to the Land of Bethel and \n" +
                        "build an altar";
                if(talkToSarai.equals("Done")){
                    isComplete1 = "Done";
                }
                else {
                    isComplete1 = "Not Done";
                }

                if(talkToLot.equals("Done")){
                    isComplete2 = "Done";
                }
                else {
                    isComplete2 = "Not Done";
                }

                missionRequirements =
//                        "Talk to Sarai: " + isComplete1 + "\n" + "Talk to Lot: " + isComplete2 +  "\n" +
                "Number of Stones: \t" + missionCount + "/4" + "\n";
                break;
        }


    }

    /*

            case 2: missionName = "\nTalk to Pharaoh\n";
                missionPhrase = "the cry of the people of Israel has come to me, \n" +
                        " and I have also seen the oppression with which \n" +
                        "the Egyptians oppress them. Come, I will send you to \n" +
                        " Pharaoh that you may bring my people, \n" +
                        " the children of Israel, out of Egypt.";
                if(talkToAaron.equals("Done")){
                    isComplete1 = "Done";
                }
                else {
                    isComplete1 = "Not Done";
                }
                if(talkToPharaoh.equals("Done")){
                    isComplete2 = "Done";
                }
                else {
                    isComplete2 = "Not Done";
                }
                missionRequirements =
//                        "Talk to Aaron: " + isComplete1 + "\n" + "Talk to Pharaoh: " + isComplete2;
                "Talk to Pharaoh: \t" + isComplete2;

                break;
            case 3: missionName = "\nWashed Up! \n";
                missionPhrase = "Take Aaron and his sons with him, \n" +
                        "washed them with water and clothed them\n" +
                        " with coats and tied sashes around their\n" +
                        " waists and bound caps on them.";
                if(findJarOfWater.equals("Done")){
                    isComplete1 = "Done";
                }
                else {
                    isComplete1 = "Not Done";
                }

                if(findCoat.equals("Done")){
                    isComplete2 = "Done";
                }
                else {
                    isComplete2 = "Not Done";
                }
                if(findSash.equals("Done")){
                    isComplete3 = "Done";
                }
                else {
                    isComplete3 = "Not Done";
                }
                if(findCap.equals("Done")){
                    isComplete4 = "Done";
                }
                else {
                    isComplete4 = "Not Done";
                }

                if(talkToAaronLev.equals("Done")){
                    isComplete5 = "Done";
                }
                else {
                    isComplete5 = "Not Done";

                }

                missionRequirements =
//                        "Talk to Aaron: " + isComplete5 + "\n" +
//                         "Jar of Water: " + isComplete1 + "\n"
//                                 + "Coat: " + isComplete2 + "\n"
//                                 + "Sash: " + isComplete3 + "\n"
//                                 + "Cap: " + isComplete4;
                        "Talk to Aaron: \t" + isComplete5 + "\n" +
                                "Jar of Water: \t" + isComplete1 + "\n"
                                + "Coat: \t" + isComplete2 + "\n"
                                + "Sash: \t" + isComplete3;
                break;
            case 4: missionName = "\nGo Find the Land of Edom\n";
                missionPhrase = "Go to the Land of Edom \n \n" +
                        "The Land of Edom can be found \n" +
                        "in the east ";
                if(findLandOfEdom.equals("Done")){
                    isComplete1 = "Done";
                }
                else {
                    isComplete1 = "Not Done";

                }
                missionRequirements =
                        "Finding the Land of Edom : \t" + isComplete1;
                break;
            case 5: missionName = "Make a Fiery Serpent \n\n";
                missionPhrase = "Go Take your Staff and your\n" +
                        "wooden pole at your house then\n" +
                        "go back to the Land of Edom";
                if(findStaff.equals("Done")){
                    isComplete1 = "Done";
                }
                else {
                    isComplete1 = "Not Done";
                }

                if(findWoodenPole.equals("Done")){
                    isComplete2 = "Done";
                }
                else {
                    isComplete2 = "Not Done";
                }
                missionRequirements =
                        "Find Staff: \t" + isComplete1 + "\n"
                                + "Find Wooden Pole: \t" + isComplete2 + "\n";
                break;
            case 6: missionName = "\nFind large stones\n and plaster";
                missionPhrase = "Find large stones and plaster \n" +
                        "and set up large stones \n" +
                        "and plaster them with plaster in Jordan";
                if(findPlaster.equals("Done")){
                    isComplete1 = "Done";
                }
                else {
                    isComplete1 = "Not Done";
                }
                missionRequirements =
                        "Find Large Stones: \t" + missionCount + "/2" + "\n"
                                + "Find Plasters: \t" + isComplete1;
                break;
            case 7: missionName = "\nFind and Took \n a Large Stone";
                missionPhrase = "Find and took a large stone and set \n" +
                        " it up there under the terebinth that \n" +
                        "was by the sanctuary of the LORD";
                if(findLargeStone.equals("Done")){
                    isComplete1 = "Done";
                }
                else {
                    isComplete1 = "Not Done";
                }
                missionRequirements =
                        "Large Stone: \t" + isComplete1 ;

          */

    public void update(){
        if(Gdx.input.isKeyJustPressed(Input.Keys.J)){
            System.out.println(getMissionPhrase());
            System.out.println(getMissionName());
        }

        id = gameData.getInteger(user + " missionId");
        content();
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
