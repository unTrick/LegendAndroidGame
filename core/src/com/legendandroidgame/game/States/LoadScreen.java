package com.legendandroidgame.game.States;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Timer;
import com.legendandroidgame.game.CutScenes.*;
import com.legendandroidgame.game.Houses.HouseOfAbraham;
import com.legendandroidgame.game.Houses.MosesHouse;
import com.legendandroidgame.game.Houses.PharaohsHouse;
import com.legendandroidgame.game.Maps.*;

import static com.legendandroidgame.game.LegendAndroidGame.gameView;

/**
 * Created by Patrick on 7/17/2017.
 */
public class LoadScreen extends GameState {

    private Stage stage;
    private Image loadScreen;
    private Texture load;
    int locationId;

    private boolean timerIsOn = false;

    public LoadScreen(GameStateManager gsm, int placeId) {
        super(gsm);
        this.locationId = placeId;

        stage = new Stage(gameView);

        if(Gdx.graphics.getWidth() > 1800){
            load = new Texture("1080/background/LoadScreen.png");
        }
        else {
            load = new Texture("720/background/LoadScreen.png");
        }

        loadScreen = new Image(load);
        stage.addActor(loadScreen);
    }

    @Override
    protected void handleInput() {
        if (!timerIsOn){
            timerIsOn = true;

            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {

                    switch (locationId) {
                        case 0: gsm.set(new GameMenu(gsm));
                            dispose();
                            break;
                        case 1: gsm.set(new HouseOfAbraham(gsm));
                            dispose();
                            break;
                        case 2: gsm.set(new Haran(gsm));
                            dispose();
                            break;
                        case 3: gsm.set(new Bethel(gsm));
                            dispose();
                            break;
                        case 4: gsm.set(new EgyptEast(gsm));
                            dispose();
                            break;
                        case 5: gsm.set(new EgyptNorth(gsm));
                            dispose();
                            break;
                        case 6: gsm.set(new EgyptSouth(gsm));
                            dispose();
                            break;
                        case 7: gsm.set(new EgyptWest(gsm));
                            dispose();
                            break;
                        case 8: gsm.set(new LandOfMoriah(gsm));
                            dispose();
                            break;
                        case 9: gsm.set(new Jordan(gsm));
                            dispose();
                            break;
                        case 10: // cave
                            break;
                        case 11: gsm.set(new Shechem(gsm));
                            dispose();
                            break;

                        case 12: gsm.set(new MosesHouse(gsm));
                            dispose();
                            break;
                        case 13: gsm.set(new PharaohsHouse(gsm));
                            dispose();
                            break;
                        case 14: gsm.set(new Sinai(gsm));
                            dispose();
                            break; // emergency add

                        case 20: gsm.set(new GenesisIntroCS(gsm));
                            dispose();
                            break;
                        case 21: gsm.set(new ExodusOne(gsm));
                            dispose();
                            break;
                        case 22: gsm.set(new ExodusTwo(gsm));
                            dispose();
                            break;
                        case 23: gsm.set(new NumbersOne(gsm));
                            dispose();
                            break;
                        case 24: gsm.set(new GenSceneOne(gsm));
                            dispose();
                            break;
                        case 25: gsm.set(new DeuTwo(gsm));
                            dispose();
                            break;
                        case 26: gsm.set(new JoshuaLast(gsm));
                            dispose();
                            break;
                        case 27: gsm.set(new Ending(gsm));
                            dispose();
                            break;
                    }


                }
            }, 0.1f);
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
        load.dispose();
        stage.dispose();
    }

    @Override
    public void resize(int width, int height) {

    }
}
