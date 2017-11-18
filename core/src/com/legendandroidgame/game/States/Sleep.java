package com.legendandroidgame.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Timer;
import com.legendandroidgame.game.Houses.HouseOfAbraham;
import com.legendandroidgame.game.Houses.MosesHouse;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/19/2017.
 */
public class Sleep extends GameState {

    String current = gameData.getString("current");
    Stage stage;
    Texture sleepTex;
    Image sleepImg;



    boolean timerIsOn = false;

    public Sleep(GameStateManager gsm) {
        super(gsm);

        if(Gdx.graphics.getWidth() > 1800){
            sleepTex = new Texture("1080/background/Sleep.png");
        }
        else {
            sleepTex = new Texture("720/background/Sleep.png");
        }

        stage = new Stage();

        sleepImg = new Image(sleepTex);

        stage.addActor(sleepImg);

    }

    @Override
    protected void handleInput() {

        if (!timerIsOn){
            timerIsOn = true;

            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {

                    if(gameData.getInteger(current + " missionId") >= 2 ){
                        gsm.set(new MosesHouse(gsm));
                        dispose();
                    }
                    else {
                        gsm.set(new HouseOfAbraham(gsm));
                        dispose();
                    }


                }
            }, 0.5f);
        }
    }

    @Override
    public void update(float dt) {
        gameData.putInteger(current + " hourTimer", 6);
        gameData.putInteger(current + " minuteTimer", 0);
        gameData.putInteger(current + " health", 960);
        gameData.flush();
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        stage.draw();
    }

    @Override
    public void dispose() {
        sleepImg.clear();
        sleepTex.dispose();
        stage.dispose();
    }

    @Override
    public void resize(int width, int height) {

    }
}
