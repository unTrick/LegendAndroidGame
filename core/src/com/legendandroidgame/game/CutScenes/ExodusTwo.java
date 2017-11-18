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
public class ExodusTwo extends GameState{

    private Stage stage;
    private Texture one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen;
    private Image oneImg, twoImg, threeImg, fourImg, fiveImg, sixImg, sevenImg, eightImg, nineImg, tenImg, elevenImg,
    twelveImg, thirteenImg, fourteenImg;
    private CutSceneButtons cutSceneButtons;

    private String current = gameData.getString("current");

    private int counter = 1;

    public ExodusTwo(final GameStateManager gsm) {
        super(gsm);



        one = new Texture("1080/cutscene/ExodusTwo/1.jpg");
        two = new Texture("1080/cutscene/ExodusTwo/2.jpg");
        three = new Texture("1080/cutscene/ExodusTwo/3.jpg");
        four = new Texture("1080/cutscene/ExodusTwo/4.jpg");
        five = new Texture("1080/cutscene/ExodusTwo/5.jpg");
        six = new Texture("1080/cutscene/ExodusTwo/6.jpg");
        seven = new Texture("1080/cutscene/ExodusTwo/7.jpg");
        eight = new Texture("1080/cutscene/ExodusTwo/8.jpg");
        nine = new Texture("1080/cutscene/ExodusTwo/9.jpg");
        ten = new Texture("1080/cutscene/ExodusTwo/10.jpg");
        eleven = new Texture("1080/cutscene/ExodusTwo/11.jpg");
        twelve = new Texture("1080/cutscene/ExodusTwo/12.jpg");
        thirteen = new Texture("1080/cutscene/ExodusTwo/13.jpg");
        fourteen = new Texture("1080/cutscene/ExodusTwo/14.jpg");

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
        eightImg = new Image(eight);
        nineImg = new Image(nine);
        tenImg = new Image(ten);
        elevenImg = new Image(eleven);
        twelveImg = new Image(twelve);
        thirteenImg = new Image(thirteen);
        fourteenImg = new Image(fourteen);


        oneImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        twoImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        threeImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        fourImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        fiveImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sixImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sevenImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        eightImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        nineImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        tenImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        elevenImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        twelveImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        thirteenImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        fourteenImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());


        cutSceneButtons.continueBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                if (counter >= 14){
                    gameData.putInteger(current + " missionId", 3);
                    gameData.putInteger(current + " from", 22);
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
                gameData.putInteger(current + " missionId", 3);
                gameData.putInteger(current + " from", 22);
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
            case 8:remove();
                stage.addActor(eightImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 9: remove();
                cutSceneButtons.skipBtn.remove();
                stage.addActor(nineImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 10: remove();
                stage.addActor(tenImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 11: remove();
                stage.addActor(elevenImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 12: remove();
                stage.addActor(twelveImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 13: remove();
                stage.addActor(thirteenImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 14: remove();
                stage.addActor(fourteenImg);
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
        eightImg.remove();
        nineImg.remove();
        tenImg.remove();
        elevenImg.remove();
        twelveImg.remove();
        thirteenImg.remove();
        fourteenImg.remove();

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
