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

import static com.legendandroidgame.game.LegendAndroidGame.gameView;

/**
 * Created by Patrick on 5/2/2017.
 */
public class CharacterProfile extends GameState{

    private Stage stage;
    private Texture backTxr;
    private Texture nextTex, prevTex;
    private ImageButton backBtn, nextBtn, prevBtn;
    private Texture abrahamProfileTex, isaacProfileTex, jacobProfileTex, joshuaProfileTex, mosesProfileTex;
    private Image abraham, isaac, jacob, joshua, moses;
    private int characters = 1;


    protected CharacterProfile(final GameStateManager gsm) {

        super(gsm);

        //Dagdag
        if (Gdx.graphics.getWidth() > 1800) {
            backTxr = new Texture("1080/button/Backbtn.png");
            abrahamProfileTex = new Texture("1080/background/Abraham-Hdpi.png");
            isaacProfileTex = new Texture("1080/background/Isaac-Hdpi.png");
            jacobProfileTex = new Texture("1080/background/Jacob-Hdpi.png");
            joshuaProfileTex = new Texture("1080/background/Joshua-Hdpi.png");
            mosesProfileTex = new Texture("1080/background/Moses-Hdpi.png");
            nextTex = new Texture("1080/button/Arrow Right.png");
            prevTex  = new Texture("1080/button/Arrow Left.png");
        }
        else {
            backTxr = new Texture("720/button/Backbtn.png");
            abrahamProfileTex = new Texture("720/background/Abraham-Mdpi.png");
            isaacProfileTex = new Texture("720/background/Isaac-Mdpi.png");
            jacobProfileTex = new Texture("720/background/Jacob-Mdpi.png");
            joshuaProfileTex = new Texture("720/background/Joshua-Mdpi.png");
            mosesProfileTex = new Texture("720/background/Moses-Mdpi.png");
            nextTex = new Texture("720/button/Arrow Right.png");
            prevTex = new Texture("720/button/Arrow Left.png");
        }

        abraham = new Image(abrahamProfileTex);
        isaac = new Image (isaacProfileTex);
        jacob = new Image (jacobProfileTex);
        joshua = new Image(joshuaProfileTex);
        moses = new Image (mosesProfileTex);


        //Dagdag
        stage = new Stage(LegendAndroidGame.gameView);
        Gdx.input.setInputProcessor(stage);

        //Dagdag.....
        Drawable backDraw = new TextureRegionDrawable(new TextureRegion(backTxr));
        Drawable nextDraw = new TextureRegionDrawable(new TextureRegion(nextTex));
        Drawable prevDraw = new TextureRegionDrawable(new TextureRegion(prevTex));



        backBtn = new ImageButton(backDraw);
        nextBtn = new ImageButton(nextDraw);
        prevBtn = new ImageButton(prevDraw);



        backBtn.setPosition(Gdx.graphics.getWidth() - backTxr.getWidth(),  backTxr.getHeight() / 2);
        nextBtn.setPosition(Gdx.graphics.getWidth() / 1.30f - nextBtn.getWidth() / 2,  nextBtn.getHeight() / 0.30f );
        prevBtn.setPosition(Gdx.graphics.getWidth() / 4.3f - prevBtn.getWidth() / 2, prevBtn.getHeight() / 0.30f );


        //Dagdag
        backBtn.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent e, float x, float y){
                gsm.set(new GameHelp(gsm));
                dispose();
            }

        });

        prevBtn.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent e, float x, float y){

                if(characters == 1){

                    characters -= 2;
                }
                else {

                    characters -= 1;
                }
                nextBtn.remove();
                backBtn.remove();
                prevBtn.remove();

                System.out.println(characters);

                switch (characters)
                {
                    case -1: stage.addActor(moses);
                        abraham.remove();
                        isaac.remove();
                        jacob.remove();
                        joshua.remove();
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        break;
                    case 1: stage.addActor(abraham);
                        isaac.remove();
                        jacob.remove();
                        joshua.remove();
                        moses.remove();
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        break;
                    case 2: stage.addActor(isaac);
                        abraham.remove();
                        jacob.remove();
                        joshua.remove();
                        moses.remove();
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        break;
                    case 3: stage.addActor(jacob);
                        abraham.remove();
                        isaac.remove();
                        joshua.remove();
                        moses.remove();
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        break;
                    case 4: stage.addActor(joshua);
                        abraham.remove();
                        isaac.remove();
                        jacob.remove();
                        moses.remove();
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);

                        break;
                    case 5: stage.addActor(moses);
                        abraham.remove();
                        isaac.remove();
                        jacob.remove();
                        joshua.remove();
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        break;
                }
            }

        });

        nextBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){


                characters += 1;



                    System.out.println(characters);

                nextBtn.remove();
                backBtn.remove();
                prevBtn.remove();
                switch (characters)
                {
                    case 1: stage.addActor(abraham);
                        isaac.remove();
                        jacob.remove();
                        joshua.remove();
                        moses.remove();
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        break;
                    case 2: stage.addActor(isaac);
                        abraham.remove();
                        jacob.remove();
                        joshua.remove();
                        moses.remove();
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        break;
                    case 3: stage.addActor(jacob);
                        abraham.remove();
                        isaac.remove();
                        joshua.remove();
                        moses.remove();
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        break;
                    case 4: stage.addActor(joshua);
                        abraham.remove();
                        isaac.remove();
                        jacob.remove();
                        moses.remove();
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);

                        break;
                    case 5: stage.addActor(moses);
                        abraham.remove();
                        isaac.remove();
                        jacob.remove();
                        joshua.remove();
                        stage.addActor(backBtn);
                        stage.addActor(nextBtn);
                        stage.addActor(prevBtn);
                        break;
                }

                return false;

            }

        });


        //Dagdag
        stage.addActor(abraham);
        stage.addActor(backBtn);
        stage.addActor(nextBtn);
        stage.addActor(prevBtn);
    }

    @Override
    protected void handleInput() {
        abrahamProfileTex.dispose();
        isaacProfileTex.dispose();
        jacobProfileTex.dispose();
        joshuaProfileTex.dispose();
        mosesProfileTex.dispose();
    }

    @Override
    public void update(float dt) {
        if (characters > 4){
            characters = 0;
        }
        if(characters < 0){
            characters = 4;
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
        abrahamProfileTex.dispose();

    }

    @Override
    public void resize(int width, int height) {

    }
}