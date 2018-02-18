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
 * Created by Patrick on 10/21/2017.
 */
public class ExodusOne extends GameState {

    private Stage stage;
    private Texture one, two, three, four, five, six, seven;
    private Image oneImg, twoImg, threeImg, fourImg, fiveImg, sixImg, sevenImg;
    private CutSceneButtons cutSceneButtons;

    private String current = gameData.getString("current");

    private int counter = 1;

    public ExodusOne(final GameStateManager gsm) {
        super(gsm);



        one = new Texture("1080/cutscene/ExodusOne/1.jpg");
        two = new Texture("1080/cutscene/ExodusOne/2.jpg");
        three = new Texture("1080/cutscene/ExodusOne/3.jpg");
        four = new Texture("1080/cutscene/ExodusOne/4.jpg");
        five = new Texture("1080/cutscene/ExodusOne/5.jpg");
        six = new Texture("1080/cutscene/ExodusOne/6.jpg");
        seven = new Texture("1080/cutscene/ExodusOne/7.jpg");

        stage = new Stage(LegendAndroidGame.gameView);
        cutSceneButtons = new CutSceneButtons(stage);
        Gdx.input.setInputProcessor(stage);

        oneImg = new Image(one);
        twoImg = new Image(two);
        threeImg = new Image(three);
        fourImg = new Image(four);
        fiveImg = new Image(five);
        sixImg = new Image(six);
        sevenImg = new Image(seven);

        oneImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        twoImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        threeImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        fourImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        fiveImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sixImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sevenImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());


        cutSceneButtons.continueBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                if (counter >= 7){
                    gameData.putInteger(current + " from", 21);
                    gameData.putInteger(current + " missionId", 4);
                    gameData.flush();
                    gsm.set(new LoadScreen(gsm,6));
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

                gameData.putInteger(current + " from", 21);
                gameData.putInteger(current + " missionId", 4);
                gameData.flush();
                gsm.set(new LoadScreen(gsm,6));
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
            case 4: remove();
                stage.addActor(fourImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 5: remove();
                stage.addActor(fiveImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 6: remove();
                stage.addActor(sixImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 7: remove();
                stage.addActor(sevenImg);
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
        fourImg.remove();
        fiveImg.remove();
        sixImg.remove();
        sevenImg.remove();


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
