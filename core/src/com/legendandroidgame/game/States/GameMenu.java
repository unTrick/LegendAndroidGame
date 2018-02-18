package com.legendandroidgame.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Timer;
import com.legendandroidgame.game.LegendAndroidGame;
import com.legendandroidgame.game.Maps.DeveloperMap;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;
import static com.legendandroidgame.game.LegendAndroidGame.gameView;

/**
 * Created by Patrick on 5/2/2017.
 */
public class GameMenu extends GameState{

    private Texture background, start, setting, help, book, exit, usericon, logout;

    private Stage stage;
    private Image bg;
    private ImageButton btnAccount;

    private FileHandle fontFile;
    private Label currentUser;

    public GameMenu(final GameStateManager gsm) {
        super(gsm);

        fontFile = Gdx.files.internal("font/Candarab.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 30;
        BitmapFont font = generator.generateFont(parameter);

        if(Gdx.graphics.getWidth() > 1800 ){
            background = new Texture("1080/background/gamemenubg.png");
            start = new Texture("1080/button/Start.png");
            setting = new Texture("1080/button/Settings.png");
            help = new Texture("1080/button/Help.png");
            book = new Texture("1080/button/E-Bible.png");
            exit = new Texture("1080/button/closeBtn.png");
            usericon = new Texture("1080/button/User Icon.png");
            logout = new Texture("720/button/Logout Icon.png");
        }
        else {
            background = new Texture("720/background/gamemenubg.png");
            start = new Texture("720/button/Start.png");
            setting = new Texture("720/button/Settings.png");
            help = new Texture("720/button/Help.png");
            book = new Texture("720/button/E-Bible.png");
            exit = new Texture("720/button/closeBtn.png");
            usericon = new Texture("720/button/User Icon.png");
            logout = new Texture("720/button/Logout Icon.png");
        }

        stage = new Stage(gameView);
        new Timer().stop();

        Gdx.input.setInputProcessor(stage);

        bg = new Image(background);
        bg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        stage.addActor(bg);



        Drawable drawStart = new TextureRegionDrawable(new TextureRegion(start));
        ImageButton btnStart = new ImageButton(drawStart);
        btnStart.setPosition((stage.getWidth() / 2) - ((start.getWidth() / 2) + (stage.getWidth() / 5)), (stage.getHeight() / 4) - (start.getHeight() / 2));
        stage.addActor(btnStart);

        btnStart.addListener(new ClickListener(){
           @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){

               if(gameData.getString("current").equals("NONE") || gameData.getString("current").isEmpty()){
                   gsm.set(new UserLogin(gsm));
                   dispose();
               }
               else {
                   LegendAndroidGame.clickSound.play();
                   String user = gameData.getString("current");
                   int id = gameData.getInteger(user + " currentLocation");
                   gsm.set(new LoadScreen(gsm, id));
                   dispose();
               }

               return true;
           }
        });


        Drawable drawSetting = new TextureRegionDrawable(new TextureRegion(setting));
        ImageButton btnSetting = new ImageButton(drawSetting);
        btnSetting.setPosition((stage.getWidth() / 2) - (setting.getWidth() / 2) + (stage.getWidth() / 14),(stage.getHeight() / 4) - (setting.getHeight() / 2) );
        stage.addActor(btnSetting);

        btnSetting.addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent e, float x, float y, int point, int button){
                LegendAndroidGame.clickSound.play();
                gsm.set(new MenuSetting(gsm));
                dispose();
            }
        });


        Drawable drawHelp = new TextureRegionDrawable(new TextureRegion(help));
        ImageButton btnHelp = new ImageButton(drawHelp);
        btnHelp.setPosition((stage.getWidth() / 2) - ((help.getWidth() / 2) - (stage.getWidth() / 5)), (stage.getHeight() / 4) - (help.getHeight() / 2));
        stage.addActor(btnHelp);

        btnHelp.addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent e, float x, float y, int point, int button){
                LegendAndroidGame.clickSound.play();
                gsm.set(new GameHelp(gsm));
                dispose();
            }
        });


        Drawable drawBook = new TextureRegionDrawable(new TextureRegion(book));
        ImageButton btnBook = new ImageButton(drawBook);
        btnBook.setPosition((stage.getWidth() / 2) - (book.getWidth() / 2), (stage.getHeight() / 12));
        stage.addActor(btnBook);

        btnBook.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent e, float x, float y){
                LegendAndroidGame.clickSound.play();
                gsm.set(new BibleBook(gsm));
                dispose();

            }
        });

        Drawable accountIcon = new TextureRegionDrawable(new TextureRegion(usericon));
        btnAccount = new ImageButton(accountIcon);

        Drawable logoutDraw = new TextureRegionDrawable(new TextureRegion(logout));
        ImageButton logoutbtn = new ImageButton(logoutDraw);

        Drawable drawExit = new TextureRegionDrawable(new TextureRegion(exit));
        ImageButton btnExit = new ImageButton(drawExit);

        /* button position   */

        btnAccount.setPosition(stage.getWidth() - usericon.getWidth() * 2.7f, stage.getHeight() - usericon.getHeight() * 1.5f);

        btnExit.setPosition(stage.getWidth() - (exit.getWidth() * 1.5f), stage.getHeight() - (exit.getHeight() * 1.5f));

        btnStart.setPosition((Gdx.graphics.getWidth() / 2) - (btnStart.getWidth() / 2) - (Gdx.graphics.getWidth() / 3.7f),(Gdx.graphics.getHeight() / 2) - (btnStart.getHeight() / 2) - (Gdx.graphics.getHeight() / 4.9f) );

        btnBook.setPosition((Gdx.graphics.getWidth() / 2) - (btnBook.getWidth() / 2) - (Gdx.graphics.getWidth() / 3.7f),(Gdx.graphics.getHeight() / 2) - (btnBook.getHeight() / 2) - (Gdx.graphics.getHeight() / 3.1f));

        btnSetting.setPosition((Gdx.graphics.getWidth() / 2) - (btnSetting.getWidth() / 2) + (Gdx.graphics.getWidth() / 3.1f),(Gdx.graphics.getHeight() / 2) - (btnSetting.getHeight() / 1.2f));

        btnHelp.setPosition((Gdx.graphics.getWidth() / 2) - (btnHelp.getWidth() / 2) + (Gdx.graphics.getWidth() / 3f),(Gdx.graphics.getHeight() / 2) - (btnHelp.getHeight() / 2) - (Gdx.graphics.getHeight() / 5f));

        logoutbtn.setPosition(btnExit.getX(), btnExit.getY() - (logout.getHeight() * 1.5f));

        /* button position end */

        if(gameData.getString("current").equals("NONE")){
            stage.addActor(btnAccount);
            btnAccount.addListener(new ClickListener(){
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    gsm.set(new UserLogin(gsm));
                    dispose();
                    return true;
                }
            });
        }
        else if (gameData.getString("current").isEmpty()){
            stage.addActor(btnAccount);
            btnAccount.addListener(new ClickListener(){

                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    gsm.set(new UserLogin(gsm));
                    dispose();
                    return true;
                }
            });
        }
        else {
            String current = gameData.getString("current").toUpperCase();
            currentUser = new Label(current, new Label.LabelStyle(font, Color.WHITE));
            currentUser.setPosition(stage.getWidth() - (currentUser.getWidth() + (exit.getWidth() * 1.8f )), (stage.getHeight() - (exit.getHeight() * 1.3f)));
            stage.addActor(currentUser);
            stage.addActor(logoutbtn);

            logoutbtn.addListener(new ClickListener(){

                @Override
                public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){
                    gsm.set(new UserLogin(gsm));
                    dispose();

                    gameData.putString("current", "NONE");
                    gameData.flush();
                    return false;
                }

            });
        }


        stage.addActor(btnExit);

        btnExit.addListener(new ClickListener(){
           @Override
            public void touchUp(InputEvent e, float x, float y, int point, int button){

               gameData.putString("current", "NONE");
               gameData.flush();

               Gdx.app.exit();
               dispose();
           }
        });
    }

    @Override
    protected void handleInput() {

        if(Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){

            if(gameData.getString("current").equals("NONE")){
                gsm.set(new UserLogin(gsm));
                dispose();
            }
            else {
                LegendAndroidGame.clickSound.play();
                String user = gameData.getString("current");
                int id = gameData.getInteger(user + " currentLocation");
                gsm.set(new LoadScreen(gsm, id));
                dispose();
            }
        }

        if(Gdx.input.isKeyJustPressed(Input.Keys.D)){
            gsm.set(new DeveloperMap(gsm));
            dispose();
        }

    }

    @Override
    public void update(float dt) {

        handleInput();
        //backgroundMusic.play();
//        System.out.println(Gdx.graphics.getFramesPerSecond());

    }


    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        gameView.update(width, height);
    }


    @Override
    public void dispose() {
        background.dispose();
        stage.dispose();
        start.dispose();
        setting.dispose();
        help.dispose();
        book.dispose();
        exit.dispose();
    }

}

