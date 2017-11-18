package com.legendandroidgame.game.CutScenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.legendandroidgame.game.Buttons.CutSceneButtons;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.States.GameState;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.LoadScreen;

/**
 * Created by Patrick on 10/3/2017.
 */
public class GenSceneOne extends GameState{

    private Stage stage;
    private Image oneImg, twoImg, threeImg;
    private Texture one, two, three;
    private CutSceneButtons cutSceneButtons;

    private int counter = 1;

    public GenSceneOne(final GameStateManager gsm) {
        super(gsm);

        if(Gdx.graphics.getWidth() > 1800){
            one = new Texture("1080/cutscene/1.jpg");
            two = new Texture("1080/cutscene/2.jpg");
            three = new Texture("1080/cutscene/3.jpg");


        }
        else {
            one = new Texture("720/cutscene/1.jpg");
            two = new Texture("720/cutscene/2.jpg");
            three = new Texture("720/cutscene/3.jpg");


        }

        stage = new Stage(LegendAndroidGame.gameView);
        cutSceneButtons = new CutSceneButtons(stage);
        Gdx.input.setInputProcessor(stage);

        oneImg = new Image(one);
        twoImg = new Image(two);
        threeImg = new Image(three);

        stage.addActor(oneImg);
        stage.addActor(twoImg);
        stage.addActor(threeImg);

        oneImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        twoImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        threeImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        cutSceneButtons.continueBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                if (counter >= 3){
                    gsm.set(new LoadScreen(gsm,1));
                    dispose();
                }
                else {
                    counter += 1;
                }

                return false;
            }

        });


        cutSceneButtons.skipBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                gsm.set(new LoadScreen(gsm,3));
                dispose();

                return false;
            }

        });
    }

    @Override
    protected void handleInput() {
        switch (counter){
            case 1:
                stage.addActor(oneImg);
                stage.addActor(cutSceneButtons.continueBtn);
                stage.addActor(cutSceneButtons.skipBtn);
                break;
            case 2: remove();
                cutSceneButtons.skipBtn.remove();
                stage.addActor(twoImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 3: remove();
                stage.addActor(threeImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    public void remove(){
        oneImg.remove();
        twoImg.remove();
        threeImg.remove();

        cutSceneButtons.continueBtn.remove();
    }

    @Override
    public void render(SpriteBatch sb) {
        stage.draw();
    }

    @Override
    public void dispose() {
        stage.dispose();
        cutSceneButtons.dispose();
    }

    @Override
    public void resize(int width, int height) {

    }
}
