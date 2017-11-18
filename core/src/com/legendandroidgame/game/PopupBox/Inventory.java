package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;


/**
 * Created by Patrick on 5/2/2017.
 */
public class Inventory {

    private Stage stage;

    private Texture inventoryBG, closeIcon, breadTex, knifeTex, rocksTex, capTex, coatTex
            , incenseTex, largeStoneTex, onyxStoneTex, woodenCaneTex, woodenPoleTex, tabletOfStoneTex
            , soilTex, speciesTex, bronzeSerpentTex, fineTwinedLinenTex;
    private ImageButton btnclose;

    private Table inventoryTable;

    String current = gameData.getString("current");
    private ImageButton bread, rock, knife, cap, coat, incense, largeStone, onyxStone
            , woodenCane, woodenPole, tabletOfStone, soil, species, bronzeSerpent, fineTwinedLinen;

    int firstSlot = gameData.getInteger(current + " slotOne");
    int secondSlot = gameData.getInteger(current + " slotTwo");
    int thirdSlot = gameData.getInteger(current + " slotThree");
    int fourthSlot = gameData.getInteger(current + " slotFour");
    int fifthSlot = gameData.getInteger(current + " slotFive");
    int sixthSlot = gameData.getInteger(current + " slotSix");
    int seventhSlot = gameData.getInteger(current + " slotSeven");
    int eighthSlot = gameData.getInteger(current + " slotEight");
    int ninthSlot = gameData.getInteger(current + " slotNine");
    int tenthSlot = gameData.getInteger(current + " slotTen");
    int eleventhSlot = gameData.getInteger(current + " slotEleven");
    int twelvethSlot = gameData.getInteger(current + " slotTwelve");
    int thirteenthSlot = gameData.getInteger(current + " slotThirteen");
    int fourteenthSlot = gameData.getInteger(current + " slotFourteen");
    int fifteenthSlot = gameData.getInteger(current + " slotFifteen");

    private ImageButton firstImageBtn;
    private ImageButton secondImageBtn;
    private ImageButton thirdImageBtn;
    private ImageButton fourthImageBtn ;
    private ImageButton fifthImageBtn ;
    private ImageButton sixthImageBtn;
    private ImageButton seventhImageBtn;
    private ImageButton eighthImageBtn;
    private ImageButton ninthImageBtn ;
    private ImageButton tenthImageBtn;
    private ImageButton eleventhImageBtn;
    private ImageButton twelvethImageBtn;
    private ImageButton thirteenImageBtn;
    private ImageButton fourteenImageBtn;
    private ImageButton fifteenImageBtn;


    public Inventory(Stage stage){

        this.stage = stage;

        FileHandle fontFile = Gdx.files.internal("font/Candarab.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 20;
        BitmapFont font = generator.generateFont(parameter);

        if(Gdx.graphics.getWidth() > 1800){
            inventoryBG = new Texture("1080/popup/inventoryBox.png");
            closeIcon = new Texture("1080/button/close.png");
            breadTex = new Texture("1080/pupup/bread.png");
            rocksTex = new Texture("1080/popup/rocks.PNG");
            knifeTex = new Texture("1080/popup/knife.PNG");
            capTex = new Texture("1080/popup/cap.PNG");
            coatTex = new Texture("1080/popup/coat.PNG");
            incenseTex = new Texture("1080/popup/incense.PNG");
            largeStoneTex = new Texture("1080/popup/largestone.PNG");
            onyxStoneTex = new Texture("1080/popup/onyxstone.PNG");
            woodenCaneTex = new Texture("1080/popup/woodencane1.PNG");
            woodenPoleTex = new Texture("1080/popup/woodenpole.PNG");
            tabletOfStoneTex = new Texture("1080/popup/tabletofstone.PNG");
            soilTex = new Texture("1080/popup/soil.PNG");
            speciesTex = new Texture("1080/popup/species.PNG");
            bronzeSerpentTex = new Texture("1080/popup/bronze serpent.PNG");
            fineTwinedLinenTex = new Texture("1080/popup/fine twined linen.PNG");
        }

        else {
            inventoryBG = new Texture("720/popup/inventoryBox.png");
            closeIcon = new Texture("720/button/close.png");
            breadTex = new Texture("720/popup/bread.png");
            rocksTex = new Texture("720/popup/rocks.PNG");
            knifeTex = new Texture("720/popup/knife.PNG");
            capTex = new Texture("720/popup/cap.PNG");
            coatTex = new Texture("720/popup/coat.PNG");
            incenseTex = new Texture("720/popup/incense.PNG");
            largeStoneTex = new Texture("720/popup/largestone.PNG");
            onyxStoneTex = new Texture("720/popup/onyxstone.PNG");
            woodenCaneTex = new Texture("720/popup/woodencane1.PNG");
            woodenPoleTex = new Texture("720/popup/woodenpole.PNG");
            tabletOfStoneTex = new Texture("720/popup/tabletofstone.PNG");
            soilTex = new Texture("720/popup/soil.PNG");
            speciesTex = new Texture("720/popup/species.PNG");
            bronzeSerpentTex = new Texture("720/popup/bronze serpent.PNG");
            fineTwinedLinenTex = new Texture("720/popup/fine twined linen.PNG");
        }

        Drawable tableDraw = new TextureRegionDrawable(new TextureRegion(inventoryBG));

        inventoryTable = new Table();
        inventoryTable.setBackground(tableDraw);
        inventoryTable.setSize(inventoryBG.getWidth(), inventoryBG.getHeight());
        inventoryTable.setPosition(stage.getWidth() / 2 - inventoryBG.getWidth() / 2, stage.getHeight() / 2 - inventoryBG.getHeight() / 2);


        Drawable closeDraw = new TextureRegionDrawable(new TextureRegion(closeIcon));
        btnclose = new ImageButton(closeDraw);

        Drawable breadDraw = new TextureRegionDrawable(new TextureRegion(breadTex));
        bread = new ImageButton(breadDraw);

        Drawable rockDraw = new TextureRegionDrawable(new TextureRegion(rocksTex));
        rock = new ImageButton(rockDraw);

        Drawable knifeDraw = new TextureRegionDrawable(new TextureRegion(knifeTex));
        knife = new ImageButton(knifeDraw);

        Drawable capDraw = new TextureRegionDrawable(new TextureRegion(capTex));
        cap = new ImageButton(capDraw);

        Drawable coatDraw = new TextureRegionDrawable(new TextureRegion(coatTex));
        coat = new ImageButton(coatDraw);

        Drawable incenseDraw = new TextureRegionDrawable(new TextureRegion(incenseTex));
        incense = new ImageButton(incenseDraw);

        Drawable largeStoneDraw = new TextureRegionDrawable(new TextureRegion(largeStoneTex));
        largeStone = new ImageButton(largeStoneDraw);

        Drawable onyxStoneDraw = new TextureRegionDrawable(new TextureRegion(onyxStoneTex));
        onyxStone = new ImageButton(onyxStoneDraw);

        Drawable woodenCaneDraw = new TextureRegionDrawable(new TextureRegion(woodenCaneTex));
        woodenCane = new ImageButton(woodenCaneDraw);

        Drawable woodenPoleDraw = new TextureRegionDrawable(new TextureRegion(woodenPoleTex));
        woodenPole = new ImageButton(woodenPoleDraw);

        Drawable tabletOfStoneDraw = new TextureRegionDrawable(new TextureRegion(tabletOfStoneTex));
        tabletOfStone = new ImageButton(tabletOfStoneDraw);

        Drawable soilDraw = new TextureRegionDrawable(new TextureRegion(soilTex));
        soil = new ImageButton(soilDraw);

        Drawable speciesDraw = new TextureRegionDrawable(new TextureRegion(speciesTex));
        species = new ImageButton(speciesDraw);

        Drawable bronzeSerpentDraw = new TextureRegionDrawable(new TextureRegion(bronzeSerpentTex));
        bronzeSerpent = new ImageButton(bronzeSerpentDraw);

        Drawable fineTwinedLinenDraw = new TextureRegionDrawable(new TextureRegion(fineTwinedLinenTex));
        fineTwinedLinen = new ImageButton(fineTwinedLinenDraw);

        inventoryTable.add(firstSlot(firstSlot)).size(65).pad(15);
        inventoryTable.add(secondSlot(secondSlot)).size(65).pad(15);
        inventoryTable.add(thirdSlot(thirdSlot)).size(65).pad(15);
        inventoryTable.add(fourthSlot(fourthSlot)).size(65).pad(15);
        inventoryTable.add(fifthSlot(fifthSlot)).size(65).pad(15);
        inventoryTable.row();
        inventoryTable.add(sixthSlot(sixthSlot)).size(65).pad(15);
        inventoryTable.add(seventhSLot(seventhSlot)).size(65).pad(15);
        inventoryTable.add(eighthSlot(eighthSlot)).size(65).pad(15);
        inventoryTable.add(ninthSlot(ninthSlot)).size(65).pad(15);
        inventoryTable.add(tenthSlot(tenthSlot)).size(65).pad(15);
        inventoryTable.row();
        inventoryTable.add(eleventhSlot(eleventhSlot)).size(65).pad(15);
        inventoryTable.add(twelvethSlot(twelvethSlot)).size(65).pad(15);
        inventoryTable.add(thirteenthSlot(thirteenthSlot)).size(65).pad(15);
        inventoryTable.add(fourteenSlot(fourteenthSlot)).size(65).pad(15);
        inventoryTable.add(fifteenImageBtn).size(65).pad(15);

        btnclose.setPosition(inventoryTable.getX() + inventoryBG.getWidth() - closeIcon.getWidth() / 2, inventoryTable.getY() + inventoryBG.getHeight() - closeIcon.getHeight() / 2);
    }

    // Images that will occupy the slots

    private ImageButton firstSlot(int slotNumber){

        switch (slotNumber){
            case 1: firstImageBtn = bread;
                break;
            case 2: firstImageBtn = rock;
                break;
            case 3: firstImageBtn = knife;
                break;
            case 4: firstImageBtn = cap;
                break;
            case 5: firstImageBtn = coat;
                break;
            case 6: firstImageBtn = incense;
                break;
            case 7: firstImageBtn = largeStone;
                break;
            case 8: firstImageBtn = onyxStone;
                break;
            case 9: firstImageBtn = woodenCane;
                break;
            case 10: firstImageBtn = woodenPole;
                break;
            case 11: firstImageBtn = tabletOfStone;
                break;
            case 12: firstImageBtn = soil;
                break;
            case 13: firstImageBtn = species;
                break;
            case 14: firstImageBtn = bronzeSerpent;
                break;
            case 15: firstImageBtn = fineTwinedLinen;
                break;
        }

        return firstImageBtn;
    }

    private ImageButton secondSlot(int slotNumber){

        switch (slotNumber){
            case 1: secondImageBtn = bread;
                break;
            case 2: secondImageBtn = rock;
                break;
            case 3: secondImageBtn = knife;
                break;
            case 4: secondImageBtn = cap;
                break;
            case 5: secondImageBtn = coat;
                break;
            case 6: secondImageBtn = incense;
                break;
            case 7: secondImageBtn = largeStone;
                break;
            case 8: secondImageBtn = onyxStone;
                break;
            case 9: secondImageBtn = woodenCane;
                break;
            case 10: secondImageBtn = woodenPole;
                break;
            case 11: secondImageBtn = tabletOfStone;
                break;
            case 12: secondImageBtn = soil;
                break;
            case 13: secondImageBtn = species;
                break;
            case 14: secondImageBtn = bronzeSerpent;
                break;
            case 15: secondImageBtn = fineTwinedLinen;
                break;
        }

        return secondImageBtn;
    }

    private ImageButton thirdSlot(int slotNumber){

        switch (slotNumber){
            case 1: thirdImageBtn = bread;
                break;
            case 2: thirdImageBtn = rock;
                break;
            case 3: thirdImageBtn = knife;
                break;
            case 4: thirdImageBtn = cap;
                break;
            case 5: thirdImageBtn = coat;
                break;
            case 6: thirdImageBtn = incense;
                break;
            case 7: thirdImageBtn = largeStone;
                break;
            case 8: thirdImageBtn = onyxStone;
                break;
            case 9: thirdImageBtn = woodenCane;
                break;
            case 10: thirdImageBtn = woodenPole;
                break;
            case 11: thirdImageBtn = tabletOfStone;
                break;
            case 12: thirdImageBtn = soil;
                break;
            case 13: thirdImageBtn = species;
                break;
            case 14: thirdImageBtn = bronzeSerpent;
                break;
            case 15: thirdImageBtn = fineTwinedLinen;
                break;
        }

        return thirdImageBtn;
    }

    private ImageButton fourthSlot(int slotNumber){

        switch (slotNumber){
            case 1: fourthImageBtn = bread;
                break;
            case 2: fourthImageBtn = rock;
                break;
            case 3: fourthImageBtn = knife;
                break;
            case 4: fourthImageBtn = cap;
                break;
            case 5: fourthImageBtn = coat;
                break;
            case 6: fourthImageBtn = incense;
                break;
            case 7: fourthImageBtn = largeStone;
                break;
            case 8: fourthImageBtn = onyxStone;
                break;
            case 9: fourthImageBtn = woodenCane;
                break;
            case 10: fourthImageBtn = woodenPole;
                break;
            case 11: fourthImageBtn = tabletOfStone;
                break;
            case 12: fourthImageBtn = soil;
                break;
            case 13: fourthImageBtn = species;
                break;
            case 14: fourthImageBtn = bronzeSerpent;
                break;
            case 15: fourthImageBtn = fineTwinedLinen;
                break;
        }

        return fourthImageBtn;
    }

    private ImageButton fifthSlot(int slotNumber){

        switch (slotNumber){
            case 1: fifthImageBtn = bread;
                break;
            case 2: fifthImageBtn = rock;
                break;
            case 3: fifthImageBtn = knife;
                break;
            case 4: fifthImageBtn = cap;
                break;
            case 5: fifthImageBtn = coat;
                break;
            case 6: fifthImageBtn = incense;
                break;
            case 7: fifthImageBtn = largeStone;
                break;
            case 8: fifthImageBtn = onyxStone;
                break;
            case 9: fifthImageBtn = woodenCane;
                break;
            case 10: fifthImageBtn = woodenPole;
                break;
            case 11: fifthImageBtn = tabletOfStone;
                break;
            case 12: fifthImageBtn = soil;
                break;
            case 13: fifthImageBtn = species;
                break;
            case 14: fifthImageBtn = bronzeSerpent;
                break;
            case 15: fifthImageBtn = fineTwinedLinen;
                break;
        }

        return fifthImageBtn;
    }

    private ImageButton sixthSlot(int slotNumber){

        switch (slotNumber){
            case 1: sixthImageBtn = bread;
                break;
            case 2: sixthImageBtn = rock;
                break;
            case 3: sixthImageBtn = knife;
                break;
            case 4: sixthImageBtn = cap;
                break;
            case 5: sixthImageBtn = coat;
                break;
            case 6: sixthImageBtn = incense;
                break;
            case 7: sixthImageBtn = largeStone;
                break;
            case 8: sixthImageBtn = onyxStone;
                break;
            case 9: sixthImageBtn = woodenCane;
                break;
            case 10: sixthImageBtn = woodenPole;
                break;
            case 11: sixthImageBtn = tabletOfStone;
                break;
            case 12: sixthImageBtn = soil;
                break;
            case 13: sixthImageBtn = species;
                break;
            case 14: sixthImageBtn = bronzeSerpent;
                break;
            case 15: sixthImageBtn = fineTwinedLinen;
                break;
        }

        return sixthImageBtn;
    }

    private ImageButton seventhSLot(int slotNumber){

        switch (slotNumber){
            case 1: seventhImageBtn = bread;
                break;
            case 2: seventhImageBtn = rock;
                break;
            case 3: seventhImageBtn = knife;
                break;
            case 4: seventhImageBtn = cap;
                break;
            case 5: seventhImageBtn = coat;
                break;
            case 6: seventhImageBtn = incense;
                break;
            case 7: seventhImageBtn = largeStone;
                break;
            case 8: seventhImageBtn = onyxStone;
                break;
            case 9: seventhImageBtn = woodenCane;
                break;
            case 10: seventhImageBtn = woodenPole;
                break;
            case 11: seventhImageBtn = tabletOfStone;
                break;
            case 12: seventhImageBtn = soil;
                break;
            case 13: seventhImageBtn = species;
                break;
            case 14: seventhImageBtn = bronzeSerpent;
                break;
            case 15: seventhImageBtn = fineTwinedLinen;
                break;
        }

        return seventhImageBtn;
    }

    private ImageButton eighthSlot(int slotNumber){

        switch (slotNumber){
            case 1: eighthImageBtn = bread;
                break;
            case 2: eighthImageBtn = rock;
                break;
            case 3: eighthImageBtn = knife;
                break;
            case 4: eighthImageBtn = cap;
                break;
            case 5: eighthImageBtn = coat;
                break;
            case 6: eighthImageBtn = incense;
                break;
            case 7: eighthImageBtn = largeStone;
                break;
            case 8: eighthImageBtn = onyxStone;
                break;
            case 9: eighthImageBtn = woodenCane;
                break;
            case 10: eighthImageBtn = woodenPole;
                break;
            case 11: eighthImageBtn = tabletOfStone;
                break;
            case 12: eighthImageBtn = soil;
                break;
            case 13: eighthImageBtn = species;
                break;
            case 14: eighthImageBtn = bronzeSerpent;
                break;
            case 15: eighthImageBtn = fineTwinedLinen;
                break;
        }

        return eighthImageBtn;
    }

    private ImageButton ninthSlot(int slotNumber){

        switch (slotNumber){
            case 1: ninthImageBtn = bread;
                break;
            case 2: ninthImageBtn = rock;
                break;
            case 3: ninthImageBtn = knife;
                break;
            case 4: ninthImageBtn = cap;
                break;
            case 5: ninthImageBtn = coat;
                break;
            case 6: ninthImageBtn = incense;
                break;
            case 7: ninthImageBtn = largeStone;
                break;
            case 8: ninthImageBtn = onyxStone;
                break;
            case 9: ninthImageBtn = woodenCane;
                break;
            case 10: ninthImageBtn = woodenPole;
                break;
            case 11: ninthImageBtn = tabletOfStone;
                break;
            case 12: ninthImageBtn = soil;
                break;
            case 13: ninthImageBtn = species;
                break;
            case 14: ninthImageBtn = bronzeSerpent;
                break;
            case 15: ninthImageBtn = fineTwinedLinen;
                break;
        }

        return ninthImageBtn;
    }

    private ImageButton tenthSlot(int slotNumber){

        switch (slotNumber){
            case 1: tenthImageBtn = bread;
                break;
            case 2: tenthImageBtn = rock;
                break;
            case 3: tenthImageBtn = knife;
                break;
            case 4: tenthImageBtn = cap;
                break;
            case 5: tenthImageBtn = coat;
                break;
            case 6: tenthImageBtn = incense;
                break;
            case 7: tenthImageBtn = largeStone;
                break;
            case 8: tenthImageBtn = onyxStone;
                break;
            case 9: tenthImageBtn = woodenCane;
                break;
            case 10: tenthImageBtn = woodenPole;
                break;
            case 11: tenthImageBtn = tabletOfStone;
                break;
            case 12: tenthImageBtn = soil;
                break;
            case 13: tenthImageBtn = species;
                break;
            case 14: tenthImageBtn = bronzeSerpent;
                break;
            case 15: tenthImageBtn = fineTwinedLinen;
                break;
        }

        return tenthImageBtn;
    }

    private ImageButton eleventhSlot(int slotNumber){

        switch (slotNumber){
            case 1: eleventhImageBtn = bread;
                break;
            case 2: eleventhImageBtn = rock;
                break;
            case 3: eleventhImageBtn = knife;
                break;
            case 4: eleventhImageBtn = cap;
                break;
            case 5: eleventhImageBtn = coat;
                break;
            case 6: eleventhImageBtn = incense;
                break;
            case 7: eleventhImageBtn = largeStone;
                break;
            case 8: eleventhImageBtn = onyxStone;
                break;
            case 9: eleventhImageBtn = woodenCane;
                break;
            case 10: eleventhImageBtn = woodenPole;
                break;
            case 11: eleventhImageBtn = tabletOfStone;
                break;
            case 12: eleventhImageBtn = soil;
                break;
            case 13: eleventhImageBtn = species;
                break;
            case 14: eleventhImageBtn = bronzeSerpent;
                break;
            case 15: eleventhImageBtn = fineTwinedLinen;
                break;
        }

        return eleventhImageBtn;    }

    private ImageButton twelvethSlot(int slotNumber){

        switch (slotNumber){
            case 1: twelvethImageBtn = bread;
                break;
            case 2: twelvethImageBtn = rock;
                break;
            case 3: twelvethImageBtn = knife;
                break;
            case 4: twelvethImageBtn = cap;
                break;
            case 5: twelvethImageBtn = coat;
                break;
            case 6: twelvethImageBtn = incense;
                break;
            case 7: twelvethImageBtn = largeStone;
                break;
            case 8: twelvethImageBtn = onyxStone;
                break;
            case 9: twelvethImageBtn = woodenCane;
                break;
            case 10: twelvethImageBtn = woodenPole;
                break;
            case 11: twelvethImageBtn = tabletOfStone;
                break;
            case 12: twelvethImageBtn = soil;
                break;
            case 13: twelvethImageBtn = species;
                break;
            case 14: twelvethImageBtn = bronzeSerpent;
                break;
            case 15: twelvethImageBtn = fineTwinedLinen;
                break;
        }

        return twelvethImageBtn;
    }

    private ImageButton thirteenthSlot(int slotNumber){

        switch (slotNumber){
            case 1: thirteenImageBtn = bread;
                break;
            case 2: thirteenImageBtn = rock;
                break;
            case 3: thirteenImageBtn = knife;
                break;
            case 4: thirteenImageBtn = cap;
                break;
            case 5: thirteenImageBtn = coat;
                break;
            case 6: thirteenImageBtn = incense;
                break;
            case 7: thirteenImageBtn = largeStone;
                break;
            case 8: thirteenImageBtn = onyxStone;
                break;
            case 9: thirteenImageBtn = woodenCane;
                break;
            case 10: thirteenImageBtn = woodenPole;
                break;
            case 11: thirteenImageBtn = tabletOfStone;
                break;
            case 12: thirteenImageBtn = soil;
                break;
            case 13: thirteenImageBtn = species;
                break;
            case 14: thirteenImageBtn = bronzeSerpent;
                break;
            case 15: thirteenImageBtn = fineTwinedLinen;
                break;
        }

        return thirteenImageBtn;
    }

    private ImageButton fourteenSlot(int slotNumber){

        switch (slotNumber){
            case 1: fourteenImageBtn = bread;
                break;
            case 2: fourteenImageBtn = rock;
                break;
            case 3: fourteenImageBtn = knife;
                break;
            case 4: fourteenImageBtn = cap;
                break;
            case 5: fourteenImageBtn = coat;
                break;
            case 6: fourteenImageBtn = incense;
                break;
            case 7: fourteenImageBtn = largeStone;
                break;
            case 8: fourteenImageBtn = onyxStone;
                break;
            case 9: fourteenImageBtn = woodenCane;
                break;
            case 10: fourteenImageBtn = woodenPole;
                break;
            case 11: fourteenImageBtn = tabletOfStone;
                break;
            case 12: fourteenImageBtn = soil;
                break;
            case 13: fourteenImageBtn = species;
                break;
            case 14: fourteenImageBtn = bronzeSerpent;
                break;
            case 15: fourteenImageBtn = fineTwinedLinen;
                break;
        }

        return fourteenImageBtn;
    }

    private ImageButton fifteenthSlot(int slotNumber){

        switch (slotNumber){
            case 1: fifteenImageBtn = bread;
                break;
            case 2: fifteenImageBtn = rock;
                break;
            case 3: fifteenImageBtn = knife;
                break;
            case 4: fifteenImageBtn = cap;
                break;
            case 5: fifteenImageBtn = coat;
                break;
            case 6: fifteenImageBtn = incense;
                break;
            case 7: fifteenImageBtn = largeStone;
                break;
            case 8: fifteenImageBtn = onyxStone;
                break;
            case 9: fifteenImageBtn = woodenCane;
                break;
            case 10: fifteenImageBtn = woodenPole;
                break;
            case 11: fifteenImageBtn = tabletOfStone;
                break;
            case 12: fifteenImageBtn = soil;
                break;
            case 13: fifteenImageBtn = species;
                break;
            case 14: fifteenImageBtn = bronzeSerpent;
                break;
            case 15: fifteenImageBtn = fineTwinedLinen;
                break;
        }

        return fifteenImageBtn;
    }

    // end...


    // items count

    private int breadCount(){
        return gameData.getInteger(current + " bread");
    }

    private int rocksCount(){
        return gameData.getInteger(current + " rocks");
    }

    private int knifeCount(){
        return gameData.getInteger(current + " knife");
    }

    private int capCount(){
        return gameData.getInteger(current + " cap");
    }

    private int coatCount(){
        return gameData.getInteger(current + " coat");
    }

    private int incenseCount(){
        return gameData.getInteger(current + " incense");
    }

    private int largeStoneCount(){
        return gameData.getInteger(current + " largeStone");
    }

    private int onyxStoneCount(){
        return gameData.getInteger(current + " onyxStone");
    }

    private int woodenCaneCount(){
        return gameData.getInteger(current + " woodenCane");
    }

    private int woodenPoleCount(){
        return gameData.getInteger(current + " woodenPole");
    }

    private int tabletOfStoneCount(){
        return gameData.getInteger(current + " tabletOfStone");
    }

    private int soilCount(){
        return gameData.getInteger(current + " soil");
    }

    private int speciesCount(){
        return gameData.getInteger(current + " species");
    }

    private int bronzeSerpentCount(){
        return gameData.getInteger(current + " bronzeSerpent");
    }

    private int fineTwinedLinenCount(){
        return gameData.getInteger(current + " fineTwinedLinen");
    }

    // end....


    public void inventory(){
            stage.addActor(inventoryTable);
            stage.addActor(btnclose);
    }

    public void close(){
            inventoryTable.remove();
            btnclose.remove();
    }

    public void update(){

        if(Gdx.input.isKeyJustPressed(Input.Keys.Z)){
            gameData.putInteger(current + " slotFifteen", 1);
            gameData.flush();
            System.out.println(fifteenthSlot);
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.V)){
            gameData.putInteger(current + " slotFifteen", 4);
            gameData.flush();
            System.out.println(fifteenthSlot);
        }

        fifthSlot(fifteenthSlot);

    }

    public void render(){
    }

    public ImageButton getBtnclose() {
        return btnclose;
    }
}

