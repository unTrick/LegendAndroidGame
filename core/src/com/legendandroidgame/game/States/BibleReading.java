package com.legendandroidgame.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.legendandroidgame.game.BibleBooks.BiblePicker;
import com.legendandroidgame.game.BibleBooks.BookOfGenesis;

import static com.legendandroidgame.game.LegendAndroidGame.*;
import static com.legendandroidgame.game.LegendAndroidGame.genesisChThree;

/**
 * Created by Patrick on 7/27/2017.
 */
public class BibleReading extends GameState {

    private OrthographicCamera camera;
    private Stage stage;
    private Texture genBtnTex, exoBtnTex, levBtnTex, numBtnTex, deuBtnTex, josBtnTex, nextTex, prevTex, play, downArrows, upArrows, bibleFrameTex, tableBackgroundTex, backgroundTex, backTex, homeTex;
    private ImageButton genBtn, exoBtn, levBtn, numBtn, deuBtn, josBtn, nextBtn, prevBtn, playBtn, arrowsDown, arrowsUp, backBtn, homeBtn, nextChBtn, prevChBtn;
    private Image background;
    private FileHandle fileHandle;
    private BitmapFont font;

    private BiblePicker biblePicker;

    boolean upPressed, downPressed;

    int chapter = gameData.getInteger("biblechapter");
    int chapters, bibleverse;


    protected BibleReading(final GameStateManager gsm) {
        super(gsm);

        fileHandle = Gdx.files.internal("font/Poppins-Medium.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fileHandle);
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 30;
        font = generator.generateFont(parameter);

        backgroundMusic.stop();

        if(Gdx.graphics.getWidth() > 1800){
            genBtnTex = new Texture("1080/skin/genesisSelect.png");
            exoBtnTex = new Texture("1080/skin/exodusSelect.png");
            levBtnTex = new Texture("1080/skin/leviticusSelect.png");
            numBtnTex = new Texture("1080/skin/numbersSelect.png");
            deuBtnTex = new Texture("1080/skin/deuteronomySelect.png");
            josBtnTex = new Texture("1080/skin/joshuaSelect.png");
            nextTex = new Texture("1080/button/Arrow Right.png");
            prevTex = new Texture("1080/button/Arrow Left.png");
            play = new Texture("1080/skin/Play Icon.png");
            downArrows = new Texture("1080/button/downMoveArrows.png");
            upArrows = new Texture("1080/button/upMoveArrows.png");
            bibleFrameTex = new Texture("1080/skin/EbibleFrame.png");
            tableBackgroundTex = new Texture("1080/skin/Content Box.png");
            backgroundTex = new Texture("1080/background/bibleBookTexture.png");
            homeTex = new Texture("1080/button/Home Icon.png");
            backTex = new Texture("1080/button/Backbtn.png");
        }
        else {
            genBtnTex = new Texture("720/skin/genesisSelect.png");
            exoBtnTex = new Texture("720/skin/exodusSelect.png");
            levBtnTex = new Texture("720/skin/leviticusSelect.png");
            numBtnTex = new Texture("720/skin/numbersSelect.png");
            deuBtnTex = new Texture("720/skin/deuteronomySelect.png");
            josBtnTex = new Texture("720/skin/joshuaSelect.png");
            nextTex = new Texture("720/button/Arrow Right.png");
            prevTex = new Texture("720/button/Arrow Left.png");
            play = new Texture("720/skin/Play Icon.png");
            downArrows = new Texture("720/button/downMoveArrows.png");
            upArrows = new Texture("720/button/upMoveArrows.png");
            bibleFrameTex = new Texture("720/skin/EbibleFrame.png");
            tableBackgroundTex = new Texture("720/skin/Content Box.png");
            backgroundTex = new Texture("720/background/bibleBookTexture.png");
            homeTex = new Texture("720/button/Home Icon.png");
            backTex = new Texture("720/button/Backbtn.png");
        }

        camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        stage = new Stage();

        Gdx.input.setInputProcessor(stage);

        biblePicker = new BiblePicker();

        background = new Image(bibleFrameTex);

        genBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(genBtnTex)));
        exoBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(exoBtnTex)));
        levBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(levBtnTex)));
        numBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(numBtnTex)));
        deuBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(deuBtnTex)));
        josBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(josBtnTex)));
        nextBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(nextTex)));
        prevBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(prevTex)));
        playBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(play)));
        arrowsDown = new ImageButton(new TextureRegionDrawable(new TextureRegion(downArrows)));
        arrowsUp =  new ImageButton(new TextureRegionDrawable(new TextureRegion(upArrows)));
        homeBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(homeTex)));
        backBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(backTex)));
        nextChBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(nextTex)));
        prevChBtn = new ImageButton(new TextureRegionDrawable(new TextureRegion(prevTex)));

        nextChBtn.setSize(nextTex.getWidth() / 2, nextTex.getHeight() / 2);
        prevChBtn.setSize(prevTex.getWidth() / 2, prevTex.getHeight() / 2);

        genBtn.setPosition(Gdx.graphics.getWidth() / 2 - genBtnTex.getWidth() * 1.85f, Gdx.graphics.getHeight() - genBtnTex.getHeight() * 2);
        exoBtn.setPosition(Gdx.graphics.getWidth() / 2 - exoBtnTex.getWidth() * 1.85f, Gdx.graphics.getHeight() - exoBtnTex.getHeight() * 2);
        levBtn.setPosition(Gdx.graphics.getWidth() / 2 - levBtnTex.getWidth() * 1.85f, Gdx.graphics.getHeight() - levBtnTex.getHeight() * 2);
        numBtn.setPosition(Gdx.graphics.getWidth() / 2 - numBtnTex.getWidth() * 1.85f, Gdx.graphics.getHeight() - numBtnTex.getHeight() * 2);
        deuBtn.setPosition(Gdx.graphics.getWidth() / 2 - deuBtnTex.getWidth() * 1.85f, Gdx.graphics.getHeight() - deuBtnTex.getHeight() * 2);
        josBtn.setPosition(Gdx.graphics.getWidth() / 2 - josBtnTex.getWidth() * 1.85f, Gdx.graphics.getHeight() - josBtnTex.getHeight() * 2);
        prevBtn.setPosition(Gdx.graphics.getWidth() / 2 - prevTex.getWidth() * 5.65f - prevTex.getWidth() / 2, Gdx.graphics.getHeight() / 8 - prevTex.getHeight() / 8);
        nextBtn.setPosition(Gdx.graphics.getWidth() / 1.1f - nextTex.getWidth() / 1.40f, Gdx.graphics.getHeight() / 8 - nextTex.getHeight() / 8);
        //prevBtn.setPosition(prevTex.getWidth(), prevTex.getHeight());
        playBtn.setPosition((Gdx.graphics.getWidth() / 2) + (Gdx.graphics.getWidth() / 3), Gdx.graphics.getHeight() - genBtnTex.getHeight() * 2 );
        arrowsDown.setPosition(Gdx.graphics.getWidth() / 2 - downArrows.getWidth() / 2, (Gdx.graphics.getHeight() / 2 - tableBackgroundTex.getHeight() / 2) - downArrows.getHeight() / 2);
        arrowsUp.setPosition(Gdx.graphics.getWidth() / 2 - upArrows.getWidth() / 2, (Gdx.graphics.getHeight() / 2 + tableBackgroundTex.getHeight() / 2) - upArrows.getHeight() / 2);
        homeBtn.setPosition(Gdx.graphics.getWidth() - homeBtn.getWidth(), Gdx.graphics.getHeight() - homeBtn.getHeight());
        backBtn.setPosition(Gdx.graphics.getWidth() - backTex.getWidth(),  backTex.getHeight() / 3);
        nextChBtn.setPosition(Gdx.graphics.getWidth() / 2 - genBtnTex.getWidth() * 1.85f + genBtnTex.getWidth(), Gdx.graphics.getHeight() - genBtnTex.getHeight()  * 1.7f);
        prevChBtn.setPosition(Gdx.graphics.getWidth() / 2 - genBtnTex.getWidth() * 1.85f - prevTex.getWidth() / 2, Gdx.graphics.getHeight() - genBtnTex.getHeight() * 1.7f);

        stage.addActor(background);

        if(gameData.getString("biblename").equals("genesis")){
            stage.addActor(genBtn);
        }
        if(gameData.getString("biblename").equals("exodus")){
            stage.addActor(exoBtn);
        }
        if(gameData.getString("biblename").equals("leviticus")){
            stage.addActor(levBtn);
        }
        if(gameData.getString("biblename").equals("numbers")){
            stage.addActor(numBtn);
        }
        if(gameData.getString("biblename").equals("deuteronomy")){
            stage.addActor(deuBtn);
        }
        if(gameData.getString("biblename").equals("joshua")){
            stage.addActor(josBtn);
        }

        stage.addActor(nextBtn);
        stage.addActor(prevBtn);
        stage.addActor(playBtn);
        stage.addActor(arrowsDown);
        stage.addActor(arrowsUp);
        stage.addActor(homeBtn);
        stage.addActor(backBtn);
        stage.addActor(nextChBtn);
        stage.addActor(prevChBtn);

        playBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                biblePicker.play();

                return true;
            }

        });

        arrowsUp.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                upPressed = true;

                return true;
            }

            @Override
            public void touchUp(InputEvent e, float x, float y, int pointer, int button){

                upPressed = false;
            }

        });

        arrowsDown.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                downPressed = true;

                return true;
            }

            @Override
            public void touchUp(InputEvent e, float x, float y, int pointer, int button){

                downPressed = false;
            }

        });


//changed mula dito =========
// edit play button pic

        nextBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                if(gameData.getString("biblename").equals("genesis")){
                    if (chapter > 50){
                        chapter = 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter += 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }

                else if(gameData.getString("biblename").equals("exodus")){
                    if (chapter > 40){
                        chapter = 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter += 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }

                else if(gameData.getString("biblename").equals("leviticus")){
                    if (chapter > 27){
                        chapter = 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter += 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }

                else if(gameData.getString("biblename").equals("numbers")){
                    if (chapter > 36){
                        chapter = 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter += 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }

                else if(gameData.getString("biblename").equals("deuteronomy")){
                    if (chapter > 34){
                        chapter = 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter += 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }

                else if(gameData.getString("biblename").equals("joshua")){
                    if (chapter > 24){
                        chapter = 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter += 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }

                return false;
            }

        });

        prevBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                if(gameData.getString("biblename").equals("genesis")){
                    if (chapter < 1){
                        chapter = 50;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter -= 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }

                else if(gameData.getString("biblename").equals("exodus")){
                    if (chapter < 1){
                        chapter = 40;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter -= 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }

                else if(gameData.getString("biblename").equals("leviticus")){
                    if (chapter < 1){
                        chapter = 27;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter -= 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }

                else if(gameData.getString("biblename").equals("numbers")){
                    if (chapter < 1){
                        chapter = 36;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter -= 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }

                else if(gameData.getString("biblename").equals("deuteronomy")){
                    if (chapter < 1){
                        chapter = 34;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter -= 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }

                else if(gameData.getString("biblename").equals("joshua")){
                    if (chapter < 1){
                        chapter = 24;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                    else {
                        chapter -= 1;
                        gameData.putInteger("biblechapter", chapter);
                        gameData.flush();
                    }
                }



                return false;
            }

        });


        nextChBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int point, int button){

                if(gameData.getString("biblename").equals("genesis")){
                    gameData.putString("biblename", "exodus");
                    gameData.flush();
                    stage.addActor(exoBtn);
                    genBtn.remove();
                    levBtn.remove();
                    numBtn.remove();
                    deuBtn.remove();
                    josBtn.remove();
                }
                else if (gameData.getString("biblename").equals("exodus")){
                    gameData.putString("biblename", "leviticus");
                    gameData.flush();
                    stage.addActor(levBtn);
                    genBtn.remove();
                    exoBtn.remove();
                    numBtn.remove();
                    deuBtn.remove();
                    josBtn.remove();
                }
                else if (gameData.getString("biblename").equals("leviticus")){
                    gameData.putString("biblename", "numbers");
                    gameData.flush();
                    stage.addActor(numBtn);
                    genBtn.remove();
                    exoBtn.remove();
                    levBtn.remove();
                    deuBtn.remove();
                    josBtn.remove();
                }
                else if (gameData.getString("biblename").equals("numbers")){
                    gameData.putString("biblename", "deuteronomy");
                    gameData.flush();
                    stage.addActor(deuBtn);
                    genBtn.remove();
                    exoBtn.remove();
                    levBtn.remove();
                    numBtn.remove();
                    josBtn.remove();
                }
                else if (gameData.getString("biblename").equals("deuteronomy")){
                    gameData.putString("biblename", "joshua");
                    gameData.flush();
                    stage.addActor(josBtn);
                    genBtn.remove();
                    exoBtn.remove();
                    levBtn.remove();
                    numBtn.remove();
                    deuBtn.remove();
                }
                else if (gameData.getString("biblename").equals("joshua")){
                    gameData.putString("biblename", "genesis");
                    gameData.flush();
                    stage.addActor(genBtn);
                    exoBtn.remove();
                    levBtn.remove();
                    numBtn.remove();
                    deuBtn.remove();
                    josBtn.remove();
                }


                return false;
            }

        });

        prevChBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int point, int button){

                if(gameData.getString("biblename").equals("exodus")){
                    gameData.putString("biblename", "genesis");
                    gameData.flush();
                    stage.addActor(genBtn);
                    exoBtn.remove();
                    levBtn.remove();
                    numBtn.remove();
                    deuBtn.remove();
                    josBtn.remove();
                }
                else if (gameData.getString("biblename").equals("genesis")){
                    gameData.putString("biblename", "joshua");
                    gameData.flush();
                    stage.addActor(josBtn);
                    genBtn.remove();
                    exoBtn.remove();
                    levBtn.remove();
                    numBtn.remove();
                    deuBtn.remove();
                }
                else if (gameData.getString("biblename").equals("joshua")){
                    gameData.putString("biblename", "deuteronomy");
                    gameData.flush();
                    stage.addActor(deuBtn);
                    genBtn.remove();
                    exoBtn.remove();
                    levBtn.remove();
                    numBtn.remove();
                    josBtn.remove();
                }
                else if (gameData.getString("biblename").equals("deuteronomy")){
                    gameData.putString("biblename", "numbers");
                    stage.addActor(numBtn);
                    gameData.flush();
                    genBtn.remove();
                    exoBtn.remove();
                    levBtn.remove();
                    deuBtn.remove();
                    josBtn.remove();
                }
                else if (gameData.getString("biblename").equals("numbers")){
                    gameData.putString("biblename", "leviticus");
                    gameData.flush();
                    stage.addActor(levBtn);
                    genBtn.remove();
                    exoBtn.remove();
                    numBtn.remove();
                    deuBtn.remove();
                    josBtn.remove();
                }
                else if (gameData.getString("biblename").equals("leviticus")){
                    gameData.putString("biblename", "exodus");
                    gameData.flush();
                    stage.addActor(exoBtn);
                    genBtn.remove();
                    levBtn.remove();
                    numBtn.remove();
                    deuBtn.remove();
                    josBtn.remove();
                }

                return false;
            }

        });

// ======= hanggang dito

        backBtn.addListener(new ClickListener(){

            @Override
            public void touchUp(InputEvent e, float x, float y, int pointer, int button){
                gsm.set(new BibleBook(gsm));
            }
        });

        homeBtn.addListener(new ClickListener(){

            @Override
            public void touchUp(InputEvent e, float x, float y, int pointer, int button){
                gsm.set(new GameMenu(gsm));
            }

        });


    }

    @Override
    protected void handleInput() {

        // start of arrow up and down

        if(upPressed){

        }
        else if(downPressed){

        }


        // end of arrow up and down

        if(Gdx.input.isKeyJustPressed(Input.Keys.Q)){

            chapter -= 1;

            gameData.putInteger("biblechapter", chapter);
            gameData.flush();
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.W)){
            chapter += 1;
            gameData.putInteger("biblechapter", chapter);
            gameData.flush();
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.E)){
            genesisChOne.pause();
            genesisChTwo.pause();
            gameData.putInteger("biblechapter", 3);
            gameData.flush();
        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_1)){
            gameData.putInteger("bibleverse", 1);
            gameData.flush();
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_2)){
            gameData.putInteger("bibleverse", 2);
            gameData.flush();
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_3)){
            gameData.putInteger("bibleverse", 3);
            gameData.flush();
        }

        
    }



    @Override
    public void update(float dt) {
        handleInput();
        biblePicker.update();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(backgroundTex, 0, 0);
        sb.end();
        biblePicker.render();
        stage.draw();

    }

    @Override
    public void dispose() {
        stage.dispose();
        genBtnTex.dispose();
        exoBtnTex.dispose();
        levBtnTex.dispose();
        numBtnTex.dispose();
        deuBtnTex.dispose();
        josBtnTex.dispose();
        nextTex.dispose();
        prevTex.dispose();
        play.dispose();
        downArrows.dispose();
        upArrows.dispose();
        bibleFrameTex.dispose();
        tableBackgroundTex.dispose();
        backgroundTex.dispose();
        backTex.dispose();
        homeTex.dispose();
        font.dispose();
        biblePicker.dispose();
    }

    @Override
    public void resize(int width, int height) {

    }
}
