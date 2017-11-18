package com.legendandroidgame.game.States;

import  com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Timer;
import com.legendandroidgame.game.LegendAndroidGame;

import static com.legendandroidgame.game.LegendAndroidGame.gameView;

/**
 * Created by Patrick on 5/2/2017.
 */
public class SplashScreen extends GameState {

    private Texture splashBackground;
    private boolean timerIsOn = false;
    private Stage stage;
    private Image bg;

    public SplashScreen(GameStateManager gsm) {
        super(gsm);
        stage = new Stage(gameView);

        if(Gdx.graphics.getWidth() > 1800 ){
            splashBackground = new Texture("1080/background/DevocatLogo.png");
        }
        else {
            splashBackground = new Texture("720/background/DevocatLogo.png");
        }


        LegendAndroidGame.splashSound.play();

        bg = new Image(splashBackground);
        bg.setPosition(Gdx.graphics.getWidth() / 2 - splashBackground.getWidth() / 2, Gdx.graphics.getHeight() / 2 - splashBackground.getHeight() / 2);
        stage.addActor(bg);
    }

    @Override
    public void handleInput() {

        if (!timerIsOn){
            timerIsOn = true;

            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    LegendAndroidGame.backgroundMusic.play();
                    stage.addAction(Actions.fadeOut(1));
                    gsm.set(new GameMenu(gsm));
                    dispose();
                }
            }, 3);
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        stage.draw();
    }

    @Override
    public void dispose() {
        splashBackground.dispose();
        LegendAndroidGame.splashSound.dispose();

    }

    @Override
    public void resize(int width, int height) {

    }
}
