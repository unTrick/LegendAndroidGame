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

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 10/22/2017.
 */
public class DeuTwo extends GameState{
    private Stage stage;
    private Texture one, two, three;
    private Image oneImg, twoImg, threeImg;
    private CutSceneButtons cutSceneButtons;

    private String current = gameData.getString("current");

    private int counter = 1;

    public DeuTwo(final GameStateManager gsm) {
        super(gsm);



        one = new Texture("1080/cutscene/DeuTwo/1.jpg");
        two = new Texture("1080/cutscene/DeuTwo/2.jpg");
        three = new Texture("1080/cutscene/DeuTwo/3.jpg");

        stage = new Stage(LegendAndroidGame.gameView);
        cutSceneButtons = new CutSceneButtons(stage);
        Gdx.input.setInputProcessor(stage);

        oneImg = new Image(one);
        twoImg = new Image(two);
        threeImg = new Image(three);


        oneImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        twoImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        threeImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());



        cutSceneButtons.continueBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                if (counter >= 3){
                    gameData.putInteger(current + " missionId", 7);
                    gameData.putInteger(current + " from", 25);
                    gameData.flush();
                    gsm.set(new LoadScreen(gsm,11));
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
                gameData.putInteger(current + " missionId", 7);
                gameData.putInteger(current + " from", 25);
                gsm.set(new LoadScreen(gsm,11));
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
