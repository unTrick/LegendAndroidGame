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
public class GenesisIntroCS extends GameState {

    private Stage stage;
    private Texture one, two, three, four, five, six, seven, eight, nine, ten,
            eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen,
            twenty, twentyOne;
    private Image oneImg, twoImg, threeImg, fourImg, fiveImg, sixImg, sevenImg, eightImg, nineImg, tenImg,
            elevenImg, twelveImg, thirteenImg, fourteenImg, fifteenImg, sixteenImg, seventeenImg, eighteenImg, nineteenImg,
            twentyImg, twentyOneImg;
    private CutSceneButtons cutSceneButtons;

    private int counter = 1;

    public GenesisIntroCS(final GameStateManager gsm) {
        super(gsm);


//        if(Gdx.graphics.getWidth() > 1800){
//            one = new Texture("1080/cutscene/GenIntro/1.jpg");
//            two = new Texture("1080/cutscene/GenIntro/2.jpg");
//            three = new Texture("1080/cutscene/GenIntro/3.jpg");
//            four = new Texture("1080/cutscene/GenIntro/4.jpg");
//            five = new Texture("1080/cutscene/GenIntro/5.jpg");
//            six = new Texture("1080/cutscene/GenIntro/6.jpg");
//            seven = new Texture("1080/cutscene/GenIntro/7.jpg");
//            eight = new Texture("1080/cutscene/GenIntro/8.jpg");
//            nine = new Texture("1080/cutscene/GenIntro/9.jpg");
//            ten  = new Texture("1080/cutscene/GenIntro/10.jpg");
//            eleven = new Texture("1080/cutscene/GenIntro/11.jpg");
//            twelve = new Texture("1080/cutscene/GenIntro/12.jpg");
//            thirteen = new Texture("1080/cutscene/GenIntro/13.jpg");
//            fourteen = new Texture("1080/cutscene/GenIntro/14.jpg");
//            fifteen = new Texture("1080/cutscene/GenIntro/15.jpg");
//            sixteen = new Texture("1080/cutscene/GenIntro/16.jpg");
//            seventeen = new Texture("1080/cutscene/GenIntro/17.jpg");
//            eighteen = new Texture("1080/cutscene/GenIntro/18.jpg");
//            nineteen = new Texture("1080/cutscene/GenIntro/19.jpg");
//            twenty = new Texture("1080/cutscene/GenIntro/20.jpg");
//            twentyOne = new Texture("1080/cutscene/GenIntro/21.jpg");
//
//        }
//        else {
//            one = new Texture("720/cutscene/GenIntro/1.jpg");
//            two = new Texture("720/cutscene/GenIntro/2.jpg");
//            three = new Texture("720/cutscene/GenIntro/3.jpg");
//            four = new Texture("720/cutscene/GenIntro/4.jpg");
//            five = new Texture("720/cutscene/GenIntro/5.jpg");
//            six = new Texture("720/cutscene/GenIntro/6.jpg");
//            seven = new Texture("720/cutscene/GenIntro/7.jpg");
//            eight = new Texture("720/cutscene/GenIntro/8.jpg");
//            nine = new Texture("720/cutscene/GenIntro/9.jpg");
//            ten  = new Texture("720/cutscene/GenIntro/10.jpg");
//            eleven = new Texture("720/cutscene/GenIntro/11.jpg");
//            twelve = new Texture("720/cutscene/GenIntro/12.jpg");
//            thirteen = new Texture("720/cutscene/GenIntro/13.jpg");
//            fourteen = new Texture("720/cutscene/GenIntro/14.jpg");
//            fifteen = new Texture("720/cutscene/GenIntro/15.jpg");
//            sixteen = new Texture("720/cutscene/GenIntro/16.jpg");
//            seventeen = new Texture("720/cutscene/GenIntro/17.jpg");
//            eighteen = new Texture("720/cutscene/GenIntro/18.jpg");
//            nineteen = new Texture("720/cutscene/GenIntro/19.jpg");
//            twenty = new Texture("720/cutscene/GenIntro/20.jpg");
//            twentyOne = new Texture("720/cutscene/GenIntro/21.jpg");
//        }

        one = new Texture("720/cutscene/GenIntro/1.jpg");
        two = new Texture("720/cutscene/GenIntro/2.jpg");
        three = new Texture("720/cutscene/GenIntro/3.jpg");
        four = new Texture("720/cutscene/GenIntro/4.jpg");
        five = new Texture("720/cutscene/GenIntro/5.jpg");
        six = new Texture("720/cutscene/GenIntro/6.jpg");
        seven = new Texture("720/cutscene/GenIntro/7.jpg");
        eight = new Texture("720/cutscene/GenIntro/8.jpg");
        nine = new Texture("720/cutscene/GenIntro/9.jpg");
        ten  = new Texture("720/cutscene/GenIntro/10.jpg");
        eleven = new Texture("720/cutscene/GenIntro/11.jpg");
        twelve = new Texture("720/cutscene/GenIntro/12.jpg");
        thirteen = new Texture("720/cutscene/GenIntro/13.jpg");
        fourteen = new Texture("720/cutscene/GenIntro/14.jpg");
        fifteen = new Texture("720/cutscene/GenIntro/15.jpg");
        sixteen = new Texture("720/cutscene/GenIntro/16.jpg");
        seventeen = new Texture("720/cutscene/GenIntro/17.jpg");
        eighteen = new Texture("720/cutscene/GenIntro/18.jpg");
        nineteen = new Texture("720/cutscene/GenIntro/19.jpg");
        twenty = new Texture("720/cutscene/GenIntro/20.jpg");
        twentyOne = new Texture("720/cutscene/GenIntro/21.jpg");


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
        fifteenImg = new Image(fifteen);
        sixteenImg = new Image(sixteen);
        seventeenImg = new Image(seventeen);
        eighteenImg = new Image(eighteen);
        nineteenImg= new Image(nineteen);
        twentyImg = new Image(twenty);
        twentyOneImg = new Image(twentyOne);

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
        fifteenImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sixteenImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        seventeenImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        eighteenImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        nineteenImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        twentyImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        twentyOneImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        cutSceneButtons.continueBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                if (counter >= 21){
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

                gsm.set(new LoadScreen(gsm,1));
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
            case 8: remove();
                stage.addActor(eightImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 9: remove();
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
            case 15: remove();
                stage.addActor(fifteenImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 16: remove();
                stage.addActor(sixteenImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 17: remove();
                stage.addActor(seventeenImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 18: remove();
                stage.addActor(eighteenImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 19: remove();
                stage.addActor(nineteenImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 20: remove();
                stage.addActor(twentyImg);
                stage.addActor(cutSceneButtons.continueBtn);
                break;
            case 21: remove();
                stage.addActor(twentyOneImg);
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
        fifteenImg.remove();
        sixteenImg.remove();
        seventeenImg.remove();
        eighteenImg.remove();
        nineteenImg.remove();
        twentyImg.remove();
        twentyOneImg.remove();


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
