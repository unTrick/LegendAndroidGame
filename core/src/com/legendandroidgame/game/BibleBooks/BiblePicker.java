package com.legendandroidgame.game.BibleBooks;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.legendandroidgame.game.States.BibleReading;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 7/27/2017.
 */
public class BiblePicker {

    private BibleStacks bibleStacks;

    public BiblePicker() {

        bibleStacks = new BibleStacks(getBibleName(), getBibleChapter(), getBibleVerse());

    }

    public String getBibleName(){

        return gameData.getString("biblename");
    }

    public int getBibleChapter(){

        return gameData.getInteger("biblechapter");
    }

    public int getBibleVerse(){

        return gameData.getInteger("bibleverse");
    }

    public void play(){
        bibleStacks.play(getBibleName(), getBibleChapter());
    }

    public void update(){
        bibleStacks.timePicker(getBibleName(), getBibleChapter(), getBibleVerse());
    }

    public void render(){
        bibleStacks.render();
    }

    public void dispose(){
        bibleStacks.dispose();
    }
}
