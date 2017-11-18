package com.legendandroidgame.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.legendandroidgame.game.LegendAndroidGame;

/**
 * Created by Patrick on 5/2/2017.
 */
public class GameHelp extends GameState {

    private Stage stage;
    private Image background;
    private Texture aboutDev, characterProf;
    private Texture backTxr;
    private Texture nextTex, prevTex;
    private ImageButton backBtn, nextBtn, prevBtn;
    private Texture howToPlay, moveAround, payAttention, findAndCollect, converse;
    private Image hp1, hp2, hp3, hp4, hp5;
    private int HPlay = 1;


    public GameHelp(final GameStateManager gsm){
        super(gsm);

        if(Gdx.graphics.getWidth() > 1800 ){
            background = new Image(new Texture("720/background/howtoplayMenu.png"));
            backTxr = new Texture("1080/button/Backbtn.png");
           //Dagdag pa...
            aboutDev = new Texture("1080/button/About Button.png");
            characterProf = new Texture("1080/button/Character Profile Button.png");
            howToPlay = new Texture("1080/background/1_Hdpi.png");
            moveAround = new Texture("1080/background/2_Hdpi.png");
            payAttention = new Texture("1080/background/3_Hdpi.png");
            findAndCollect = new Texture("1080/background/4_Hdpi.png");
            converse = new Texture("1080/background/5_Hdpi.png");
            nextTex = new Texture("1080/button/Arrow Right.png");
            prevTex = new Texture("1080/button/Arrow Left.png");
        }
        else {
            background = new Image(new Texture("720/background/howtoplayMenu.png"));
            backTxr = new Texture("720/button/Backbtn.png");
            //Dagdag pa..
            aboutDev = new Texture("720/button/About Button.png");
            characterProf = new Texture("720/button/Character Profile Button.png");
            howToPlay = new Texture("720/background/1_Mdpi.png");
            moveAround = new Texture("720/background/2_Mdpi.png");
            payAttention = new Texture("720/background/3_Mdpi.png");
            findAndCollect = new Texture("720/background/4_Mdpi.png");
            converse = new Texture("720/background/5_Mdpi.png");
            nextTex = new Texture("720/button/Arrow Right.png");
            prevTex = new Texture("720/button/Arrow Left.png");

        }

        hp1 = new Image(howToPlay);
        hp2 = new Image (moveAround);
        hp3 = new Image (payAttention);
        hp4 = new Image(findAndCollect);
        hp5 = new Image (converse);



        stage = new Stage(LegendAndroidGame.gameView);
        Gdx.input.setInputProcessor(stage);


        Drawable aboutDevDraw = new TextureRegionDrawable(new TextureRegion(aboutDev));
        final Drawable characterDraw = new TextureRegionDrawable(new TextureRegion(characterProf));
        //Dagdag pa....
        Drawable backDraw = new TextureRegionDrawable(new TextureRegion(backTxr));
        Drawable nextDraw = new TextureRegionDrawable(new TextureRegion(nextTex));
        Drawable prevDraw = new TextureRegionDrawable(new TextureRegion(prevTex));


        final ImageButton aboutDev = new ImageButton(aboutDevDraw);
        final ImageButton characterProf = new ImageButton(characterDraw);

        //Dagdag...
        backBtn = new ImageButton(backDraw);
        nextBtn = new ImageButton(nextDraw);
        prevBtn = new ImageButton(prevDraw);

        //Dagdag
        backBtn.setPosition(Gdx.graphics.getWidth() - backTxr.getWidth(),  backTxr.getHeight() / 2);
        nextBtn.setPosition(Gdx.graphics.getWidth() / 1.33f - nextBtn.getWidth() / 2,  nextBtn.getHeight() / 0.28f );
        prevBtn.setPosition(Gdx.graphics.getWidth() / 4 - prevBtn.getWidth() / 2, prevBtn.getHeight() / 0.28f );

        aboutDev.setPosition(Gdx.graphics.getWidth() / 2.80f - aboutDev.getWidth() / 3,  aboutDev.getHeight() / 2);
        characterProf.setPosition(Gdx.graphics.getWidth() / 2.1f  + characterProf.getWidth() / 5,  characterProf.getHeight() / 2);


        //Dagdag
        backBtn.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent e, float x, float y){

                gsm.set(new GameMenu(gsm));
                dispose();
            }

        });

        aboutDev.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent e, float x, float y){

                gsm.set(new DevAbout(gsm));
                dispose();
            }

        });

        characterProf.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent e, float x, float y){

                gsm.set(new CharacterProfile(gsm));
                dispose();
            }

        });

        prevBtn.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent e, float x, float y){

                        if(HPlay == 1){

                            HPlay -= 2;
                        }
                        else {

                            HPlay -= 1;
                        }
                        nextBtn.remove();
                        backBtn.remove();
                        prevBtn.remove();
                        aboutDev.remove();
                        characterProf.remove();

                        System.out.println(HPlay);

                        switch (HPlay)
                        {
                            case -1:
                                hp2.remove();
                                hp3.remove();
                                hp4.remove();
                                hp5.remove();
                                stage.addActor(hp1);
                                stage.addActor(backBtn);
                                stage.addActor(nextBtn);
                                stage.addActor(prevBtn);
                                stage.addActor(aboutDev);
                                stage.addActor(characterProf);
                                break;
                            case 1:
                                hp2.remove();
                                hp3.remove();
                                hp4.remove();
                                hp5.remove();
                                stage.addActor(hp1);
                                stage.addActor(backBtn);
                                stage.addActor(nextBtn);
                                stage.addActor(prevBtn);
                                stage.addActor(aboutDev);
                                stage.addActor(characterProf);
                                break;
                            case 2:
                                hp1.remove();
                                hp3.remove();
                                hp4.remove();
                                hp5.remove();
                                stage.addActor(hp2);
                                stage.addActor(backBtn);
                                stage.addActor(nextBtn);
                                stage.addActor(prevBtn);
                                stage.addActor(aboutDev);
                                stage.addActor(characterProf);
                                break;
                            case 3:
                                hp1.remove();
                                hp2.remove();
                                hp4.remove();
                                hp5.remove();
                                stage.addActor(hp3);
                                stage.addActor(backBtn);
                                stage.addActor(nextBtn);
                                stage.addActor(prevBtn);
                                stage.addActor(aboutDev);
                                stage.addActor(characterProf);
                                break;
                            case 4:
                                hp1.remove();
                                hp2.remove();
                                hp3.remove();
                                hp5.remove();
                                stage.addActor(hp4);
                                stage.addActor(backBtn);
                                stage.addActor(nextBtn);
                                stage.addActor(prevBtn);
                                stage.addActor(aboutDev);
                                stage.addActor(characterProf);
                                break;
                            case 5:
                                hp1.remove();
                                hp2.remove();
                                hp3.remove();
                                hp4.remove();
                                stage.addActor(hp5);
                                stage.addActor(backBtn);
                                stage.addActor(nextBtn);
                                stage.addActor(prevBtn);
                                stage.addActor(aboutDev);
                                stage.addActor(characterProf);
                                break;
                        }
                    }

                });

        nextBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                HPlay += 1;



                System.out.println(HPlay);

                nextBtn.remove();
                backBtn.remove();
                prevBtn.remove();
                aboutDev.remove();
                characterProf.remove();
                switch (HPlay)
                {
                    case 1:
                        hp2.remove();
                        hp3.remove();
                        hp4.remove();
                        hp5.remove();
                        stage.addActor(hp1);
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        stage.addActor(aboutDev);
                        stage.addActor(characterProf);
                        break;
                    case 2:
                        hp1.remove();
                        hp3.remove();
                        hp4.remove();
                        hp5.remove();
                        stage.addActor(hp2);
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        stage.addActor(aboutDev);
                        stage.addActor(characterProf);
                        break;
                    case 3:
                        hp1.remove();
                        hp2.remove();
                        hp4.remove();
                        hp5.remove();
                        stage.addActor(hp3);
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        stage.addActor(aboutDev);
                        stage.addActor(characterProf);
                        break;
                    case 4:
                        hp1.remove();
                        hp2.remove();
                        hp3.remove();
                        hp5.remove();
                        stage.addActor(hp4);
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        stage.addActor(aboutDev);
                        stage.addActor(characterProf);

                        break;
                    case 5:
                        hp1.remove();
                        hp2.remove();
                        hp3.remove();
                        hp4.remove();
                        stage.addActor(hp5);
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        stage.addActor(aboutDev);
                        stage.addActor(characterProf);
                        break;
                }

                return false;

            }

        });



        //Dagdag
        stage.addActor(background);
        stage.addActor(hp1);
        stage.addActor(nextBtn);
        stage.addActor(prevBtn);
        stage.addActor(aboutDev);
        stage.addActor(characterProf);
        stage.addActor(backBtn);

    }

            @Override
            protected void handleInput() {

            }

            @Override
            public void update(float dt) {
                if (HPlay > 4){
                    HPlay = 0;
                }
                if(HPlay < 0){
                    HPlay = 4;
                }
            }

            @Override
            public void render(SpriteBatch sb) {
                stage.draw();
                stage.act();
            }

            @Override
            public void dispose() {
                stage.dispose();
                backTxr.dispose();
                //Dagdag
                howToPlay.dispose();
                moveAround.dispose();
                payAttention.dispose();
                findAndCollect.dispose();
                converse.dispose();

            }

            @Override
            public void resize(int width, int height) {

            }
        }