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

import static com.legendandroidgame.game.LegendAndroidGame.gameData;

/**
 * Created by Patrick on 5/2/2017.
 */
public class BibleBook extends GameState {

    private Stage stage;
    private Image background;
    private Texture backTxr, gen, exo, levi, numb, deu, josh;

    public BibleBook(final GameStateManager gsm){
        super(gsm);

        if(Gdx.graphics.getWidth() > 1800 ){
            background = new Image(new Texture("1080/background/eBibleMenu.png"));
            backTxr = new Texture("1080/button/Backbtn.png");
            gen = new Texture("1080/book/Genesisbookbtn.png");
            exo = new Texture("1080/book/Exodusbookbtn.png");
            levi = new Texture("1080/book/Leviticusbookbtn.png");
            numb = new Texture("1080/book/Numbersbookbtn.png");
            deu = new Texture("1080/book/Deuteronomybookbtn.png");
            josh = new Texture("1080/book/Joshuabookbtn.png");
        }
        else {
            background = new Image(new Texture("720/background/eBibleMenu.png"));
            backTxr = new Texture("720/button/Backbtn.png");
            gen = new Texture("720/book/Genesisbookbtn.png");
            exo = new Texture("720/book/Exodusbookbtn.png");
            levi = new Texture("720/book/Leviticusbookbtn.png");
            numb = new Texture("720/book/Numbersbookbtn.png");
            deu = new Texture("720/book/Deuteronomybookbtn.png");
            josh = new Texture("720/book/Joshuabookbtn.png");
        }

        stage = new Stage(LegendAndroidGame.gameView);
        Gdx.input.setInputProcessor(stage);

        Drawable backDraw = new TextureRegionDrawable(new TextureRegion(backTxr));
        Drawable genDraw = new TextureRegionDrawable(new TextureRegion(gen));
        Drawable exoDraw = new TextureRegionDrawable(new TextureRegion(exo));
        Drawable leviDraw = new TextureRegionDrawable(new TextureRegion(levi));
        Drawable numbDraw = new TextureRegionDrawable(new TextureRegion(numb));
        Drawable deuDraw = new TextureRegionDrawable(new TextureRegion(deu));
        Drawable joshDraw = new TextureRegionDrawable(new TextureRegion(josh));

        ImageButton btnBack = new ImageButton(backDraw);
        ImageButton btnGen = new ImageButton(genDraw);
        ImageButton btnExo = new ImageButton(exoDraw);
        ImageButton btnLevi = new ImageButton(leviDraw);
        ImageButton btnNumb = new ImageButton(numbDraw);
        ImageButton btnDeu = new ImageButton(deuDraw);
        ImageButton btnJosh = new ImageButton(joshDraw);

        btnBack.setPosition(Gdx.graphics.getWidth() - backTxr.getWidth(),  backTxr.getHeight() / 2);
        btnGen.setPosition(stage.getWidth() / 2 - gen.getWidth() - gen.getWidth() / 8, stage.getHeight() / 2 + gen.getHeight() / 4);
        btnExo.setPosition(stage.getWidth() / 2 - exo.getWidth() - exo.getWidth() / 8, stage.getHeight() / 4 + exo.getHeight() / 1.6f);
        btnLevi.setPosition(stage.getWidth() / 2 - levi.getWidth() - levi.getWidth() / 8, stage.getHeight() / 6 );

        btnNumb.setPosition(stage.getWidth() / 2 + numb.getWidth() / 8, stage.getHeight() / 2 + numb.getHeight() / 4);
        btnDeu.setPosition(stage.getWidth() / 2 + deu.getWidth() / 8, stage.getHeight() / 4 + deu.getHeight() / 1.6f);
        btnJosh.setPosition(stage.getWidth() / 2 + josh.getWidth() / 8, stage.getHeight() / 6 );

        btnBack.addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent e, float x, float y, int point, int button){
                gsm.set(new GameMenu(gsm));
                dispose();
            }
        });

        btnGen.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent e, float x, float y, int point, int button){

                gameData.putString("biblename", "genesis");
                gameData.putInteger("biblechapter",1);
                gameData.putInteger("bibleverse", 1);
                gameData.flush();
                gsm.set(new BibleReading(gsm));
                dispose();
                return false;
            }
        });

        btnExo.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent e, float x, float y, int point, int button){
                gameData.putString("biblename", "exodus");
                gameData.putInteger("biblechapter",1);
                gameData.putInteger("bibleverse", 1);
                gameData.flush();
                gsm.set(new BibleReading(gsm));
                dispose();
                return false;
            }
        });

        btnLevi.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent e, float x, float y, int point, int button){
                gameData.putString("biblename", "leviticus");
                gameData.putInteger("biblechapter",1);
                gameData.putInteger("bibleverse", 1);
                gameData.flush();
                gsm.set(new BibleReading(gsm));
                dispose();
                return false;
            }
        });

        btnNumb.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent e, float x, float y, int point, int button){
                gameData.putString("biblename", "numbers");
                gameData.putInteger("biblechapter",1);
                gameData.putInteger("bibleverse", 1);
                gameData.flush();
                gsm.set(new BibleReading(gsm));
                dispose();
                return false;
            }
        });

        btnDeu.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent e, float x, float y, int point, int button){
                gameData.putString("biblename", "deuteronomy");
                gameData.putInteger("biblechapter",1);
                gameData.putInteger("bibleverse", 1);
                gameData.flush();
                gsm.set(new BibleReading(gsm));
                dispose();
                return false;
            }
        });

        btnJosh.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent e, float x, float y, int point, int button){
                gameData.putString("biblename", "joshua");
                gameData.putInteger("biblechapter",1);
                gameData.putInteger("bibleverse", 1);
                gameData.flush();
                gsm.set(new BibleReading(gsm));
                dispose();
                return false;
            }
        });

        stage.addActor(background);
        stage.addActor(btnBack);
        stage.addActor(btnDeu);
        stage.addActor(btnExo);
        stage.addActor(btnGen);
        stage.addActor(btnLevi);
        stage.addActor(btnNumb);
        stage.addActor(btnJosh);



    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.draw();
        stage.act();
    }

    @Override
    public void dispose() {
        stage.dispose();
        deu.dispose();
        gen.dispose();
        josh.dispose();
        numb.dispose();
        levi.dispose();
        exo.dispose();
        backTxr.dispose();
    }

    @Override
    public void resize(int width, int height) {

    }
}
