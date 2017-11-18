package com.legendandroidgame.game.States;

import com.badlogic.gdx.Gdx;
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

import static com.legendandroidgame.game.LegendAndroidGame.gameView;

/**
 * Created by Patrick on 7/10/2017.
 */
public class DevAbout extends GameState {

    private Stage stage;
    private Texture backTxr;
    private Image background;

    public DevAbout(final GameStateManager gsm) {
        super(gsm);

        //Dagdag paaaaaa....
        if(Gdx.graphics.getWidth() > 1800 ){
            background = new Image(new Texture("1080/background/aboutMenu.png"));
            backTxr = new Texture("1080/button/Backbtn.png");
        }
        else {
            background = new Image(new Texture("720/background/aboutMenu.png"));
            backTxr = new Texture("720/button/Backbtn.png");
        }

        stage = new Stage(gameView);
        Gdx.input.setInputProcessor(stage);

        Drawable backDraw = new TextureRegionDrawable(new TextureRegion(backTxr));
        ImageButton backBtn = new ImageButton(backDraw);

        backBtn.setPosition(Gdx.graphics.getWidth() - backTxr.getWidth(),  backTxr.getHeight() / 2);


        backBtn.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent e, float x, float y){

                gsm.set(new GameHelp(gsm));
                dispose();
            }
        });

        stage.addActor(background);
        stage.addActor(backBtn);

    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

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
    }

    @Override
    public void resize(int width, int height) {

    }
}
