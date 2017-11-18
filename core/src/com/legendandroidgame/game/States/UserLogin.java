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
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;
import static com.legendandroidgame.game.LegendAndroidGame.gameView;

/**
 * Created by Rosalie on 23/08/2017.
 */
public class UserLogin extends GameState {

    private Stage stage;
    private Texture backgroundTexture, activeBGTexture, notActiveBGTexture, cursorTexture, textfieldTexture, login, register, back, selection, delete;
    private Image background;
    private ImageButton loginBtn, registerBtn, backBtn, deleteBtn;
    private TextField passwordTF;
    private String password;
    private FileHandle fileHandle;
    private TextButton firstUserBtn, secondUserBtn,thirdUserBtn, fourthUserBtn, fifthUserBtn, sixthUserBtn;
    String firstUserStr, secondUserStr, thirdUserStr, fourthUserStr, fifthUserStr, sixthUserStr;
    String user;
    String userCompare;

    protected UserLogin(final GameStateManager gsm) {
        super(gsm);

        fileHandle = Gdx.files.internal("font/Candarab.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fileHandle);
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 30;
        BitmapFont font = generator.generateFont(parameter);

        if(Gdx.graphics.getWidth() > 1800){
            backgroundTexture = new Texture("1080/background/UserLogin.png");
            activeBGTexture = new Texture("1080/skin/Active Button.png");
            notActiveBGTexture = new Texture("1080/skin/Not Active.png");
            cursorTexture = new Texture("1080/skin/cursor.png");
            selection = new Texture("1080/skin/cursor.png");
            textfieldTexture = new Texture("1080/skin/textfield.png");
            login = new Texture("1080/button/Login Button.png");
            register = new Texture("1080/button/Register Button.png");
            back = new Texture("1080/button/Backbtn.png");
            delete = new Texture("1080/button/Delete Button.png");
        }
        else {
            backgroundTexture = new Texture("720/background/UserLogin.png");
            activeBGTexture = new Texture("720/skin/Active Button.png");
            notActiveBGTexture = new Texture("720/skin/Not Active.png");
            cursorTexture = new Texture("720/skin/cursor.png");
            selection = new Texture("720/skin/cursor.png");
            textfieldTexture = new Texture("720/skin/textfield.png");
            login = new Texture("720/button/Login Button.png");
            register = new Texture("720/button/Register Button.png");
            back = new Texture("720/button/Backbtn.png");
            delete = new Texture("720/button/Delete Button.png");
        }

        stage = new Stage(gameView);

        background = new Image(backgroundTexture);
        background.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        Gdx.input.setInputProcessor(stage);

        Drawable textfield = new TextureRegionDrawable(new TextureRegion(textfieldTexture));
        Drawable cursor = new TextureRegionDrawable(new TextureRegion(cursorTexture, 3, textfieldTexture.getHeight()));
        Drawable textfieldSelection = new TextureRegionDrawable(new TextureRegion(selection, textfieldTexture.getWidth(), 5));

        //Drawable backroidTF = new TextureRegionDrawable(new TextureRegion(backgroundTexture));

        Drawable onclick = new TextureRegionDrawable(new TextureRegion(activeBGTexture));
        Drawable notClick = new TextureRegionDrawable(new TextureRegion(notActiveBGTexture));

        passwordTF = new TextField("", new TextField.TextFieldStyle(font, Color.WHITE, cursor, textfieldSelection, textfield));
        passwordTF.setSize(textfieldTexture.getWidth(), textfieldTexture.getHeight());
        passwordTF.setPasswordMode(true);
        passwordTF.setPasswordCharacter('*');

        Drawable loginDraw = new TextureRegionDrawable(new TextureRegion(login));
        loginBtn = new ImageButton(loginDraw);

        Drawable regDraw = new TextureRegionDrawable(new TextureRegion(register));
        registerBtn = new ImageButton(regDraw);

        Drawable backDraw = new TextureRegionDrawable(new TextureRegion(back));
        backBtn = new ImageButton(backDraw);

        Drawable deleteDraw = new TextureRegionDrawable(new TextureRegion(delete));
        deleteBtn = new ImageButton(deleteDraw);

        background.setPosition(Gdx.graphics.getWidth() / 2 - backgroundTexture.getWidth() / 2, Gdx.graphics.getHeight() / 2, backgroundTexture.getHeight() / 2);
        passwordTF.setPosition(Gdx.graphics.getWidth() / 2 - passwordTF.getWidth() / 2, Gdx.graphics.getHeight() / 3 - passwordTF.getHeight() / 1.6f);;
        backBtn.setPosition(Gdx.graphics.getWidth() - back.getWidth(),  back.getHeight() / 3.50f);

        loginBtn.setPosition(Gdx.graphics.getWidth() / 2 - (login.getWidth() * 2), Gdx.graphics.getHeight() / 8 + login.getHeight() / 2);
        registerBtn.setPosition(Gdx.graphics.getWidth() / 2 - register.getWidth() / 2, Gdx.graphics.getHeight() / 8 + register.getHeight() / 2);
        deleteBtn.setPosition(Gdx.graphics.getWidth() / 2 + (delete.getWidth()), Gdx.graphics.getHeight() / 8 + login.getHeight() / 2);

        if (gameData.getString("firstuser").isEmpty()){
            firstUserStr = "NONE";
        }
        else {
            firstUserStr = gameData.getString("firstuser");
        }

        if (gameData.getString("seconduser").isEmpty()){
            secondUserStr = "NONE";
        }
        else {
            secondUserStr = gameData.getString("seconduser");
        }

        if (gameData.getString("thirduser").isEmpty()){
            thirdUserStr = "NONE";
        }
        else {
            thirdUserStr = gameData.getString("thirduser");
        }

        if (gameData.getString("fourthuser").isEmpty()){
            fourthUserStr = "NONE";
        }
        else {
            fourthUserStr = gameData.getString("fourthuser");
        }

        if (gameData.getString("fifthuser").isEmpty()){
            fifthUserStr = "NONE";
        }
        else {
            fifthUserStr = gameData.getString("fifthuser");
        }

        if (gameData.getString("sixuser").isEmpty()){
            sixthUserStr = "NONE";
        }
        else {
            sixthUserStr = gameData.getString("sixuser");
        }


        firstUserBtn = new TextButton(firstUserStr, new TextButton.TextButtonStyle(notClick, onclick, onclick, font));
        secondUserBtn = new TextButton(secondUserStr, new TextButton.TextButtonStyle(notClick, onclick, onclick, font));
        thirdUserBtn = new TextButton(thirdUserStr, new TextButton.TextButtonStyle(notClick, onclick, onclick, font));
        fourthUserBtn = new TextButton(fourthUserStr, new TextButton.TextButtonStyle(notClick, onclick, onclick, font));
        fifthUserBtn = new TextButton(fifthUserStr, new TextButton.TextButtonStyle(notClick, onclick, onclick, font));
        sixthUserBtn = new TextButton(sixthUserStr, new TextButton.TextButtonStyle(notClick, onclick, onclick, font));

        firstUserBtn.setPosition(Gdx.graphics.getWidth() / 4 - notActiveBGTexture.getWidth() /3, Gdx.graphics.getHeight() / 1.95f + notActiveBGTexture.getHeight() / 0.9f);
        secondUserBtn.setPosition(Gdx.graphics.getWidth() / 2.94f + notActiveBGTexture.getWidth() /2.90f, Gdx.graphics.getHeight() / 1.95f + notActiveBGTexture.getHeight() / 0.9f);
        thirdUserBtn.setPosition(Gdx.graphics.getWidth() / 1.8f + notActiveBGTexture.getWidth() /2.80f, Gdx.graphics.getHeight() / 1.95f + notActiveBGTexture.getHeight() / 0.9f);
        fourthUserBtn.setPosition(Gdx.graphics.getWidth() / 4 - notActiveBGTexture.getWidth() /3, Gdx.graphics.getHeight() / 2.16f + notActiveBGTexture.getHeight() / 9);
        fifthUserBtn.setPosition(Gdx.graphics.getWidth() / 2.94f + notActiveBGTexture.getWidth() /2.90f, Gdx.graphics.getHeight() /2.16f + notActiveBGTexture.getHeight() / 9);
        sixthUserBtn.setPosition(Gdx.graphics.getWidth() / 1.8f + notActiveBGTexture.getWidth() /2.80f, Gdx.graphics.getHeight() / 2.16f + notActiveBGTexture.getHeight() / 9);
//change
//        userCompare = firstUserStr;


        firstUserBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                userCompare = firstUserStr;
                secondUserBtn.setChecked(false);
                thirdUserBtn.setChecked(false);
                fourthUserBtn.setChecked(false);
                fifthUserBtn.setChecked(false);
                sixthUserBtn.setChecked(false);

                return false;
            }

        });

        secondUserBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                userCompare = secondUserStr;
                firstUserBtn.setChecked(false);
                thirdUserBtn.setChecked(false);
                fourthUserBtn.setChecked(false);
                fifthUserBtn.setChecked(false);
                sixthUserBtn.setChecked(false);

                return false;
            }

        });

        thirdUserBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                userCompare = thirdUserStr;
                secondUserBtn.setChecked(false);
                firstUserBtn.setChecked(false);
                fourthUserBtn.setChecked(false);
                fifthUserBtn.setChecked(false);
                sixthUserBtn.setChecked(false);

                return false;
            }

        });

        fourthUserBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                userCompare = fourthUserStr;
                secondUserBtn.setChecked(false);
                thirdUserBtn.setChecked(false);
                firstUserBtn.setChecked(false);
                fifthUserBtn.setChecked(false);
                sixthUserBtn.setChecked(false);

                return false;
            }

        });

        fifthUserBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                userCompare = fifthUserStr;
                secondUserBtn.setChecked(false);
                thirdUserBtn.setChecked(false);
                fourthUserBtn.setChecked(false);
                firstUserBtn.setChecked(false);
                sixthUserBtn.setChecked(false);

                return false;
            }

        });

        sixthUserBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

            userCompare = sixthUserStr;
            firstUserBtn.setChecked(false);
            secondUserBtn.setChecked(false);
            thirdUserBtn.setChecked(false);
            fourthUserBtn.setChecked(false);
            fifthUserBtn.setChecked(false);

                return false;
            }

        });

        loginBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                if(gameData.getString("firstuser").equals(userCompare)){
                    if(gameData.getString(firstUserStr + " password").equals(passwordTF.getText())){
                        gameData.putString("current", firstUserStr);
                        gameData.flush();
                        gsm.set(new GameMenu(gsm));
                        dispose();
                    }
                    else {
                        System.out.print("error! wrong password");
                    }
                }
                else if(gameData.getString("seconduser").equals(userCompare)){
                    if(gameData.getString(secondUserStr + " password").equals(passwordTF.getText())){
                        gameData.putString("current", secondUserStr);
                        gameData.flush();
                        gsm.set(new GameMenu(gsm));
                        dispose();
                    }
                    else {
                        System.out.println("error! wrong password");
                    }
                }
                else if(gameData.getString("thirduser").equals(userCompare)){
                    if(gameData.getString(thirdUserStr + " password").equals(passwordTF.getText())){
                        gameData.putString("current", thirdUserStr);
                        gameData.flush();
                        gsm.set(new GameMenu(gsm));
                        dispose();
                    }
                    else {
                        System.out.println("error! wrong password");
                    }
                }
                else if(gameData.getString("fourthuser").equals(userCompare)){
                    if(gameData.getString(fourthUserStr + " password").equals(passwordTF.getText())){
                        gameData.putString("current", fourthUserStr);
                        gameData.flush();
                        gsm.set(new GameMenu(gsm));
                        dispose();
                    }
                    else {
                        System.out.println("error! wrong password");
                    }
                }
                else if(gameData.getString("fifthuser").equals(userCompare)){
                    if(gameData.getString(fifthUserStr + " password").equals(passwordTF.getText())){
                        gameData.putString("current", fifthUserStr);
                        gameData.flush();
                        gsm.set(new GameMenu(gsm));
                    }
                    else {
                        System.out.println("error! wrong password");
                    }
                }
                else if(gameData.getString("sixuser").equals(userCompare)){
                    if(gameData.getString(sixthUserStr + " password").equals(passwordTF.getText())){
                        gameData.putString("current", sixthUserStr);
                        gameData.flush();
                        gsm.set(new GameMenu(gsm));
                        dispose();
                    }
                    else {
                        System.out.println("error! wrong password");
                    }
                }
                else {
                    System.out.println("error");
                    System.out.println(userCompare);
                }

                return false;
            }
        });

        /*registerBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent e, float x, float y, int pointer, int button){

                    gsm.set(new Register(gsm));

                dispose();
                return false;
            }
        });*/

        deleteBtn.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {



                return false;
            }
        });

        registerBtn.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                gsm.set(new Register(gsm));
                dispose();
                return true;
            }
        });

        backBtn.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                gsm.set(new GameMenu(gsm));
                dispose();
                return true;
            }

        });



        stage.addActor(background);
        stage.addActor(loginBtn);
        stage.addActor(deleteBtn);
        stage.addActor(registerBtn);
        stage.addActor(backBtn);
        stage.addActor(passwordTF);
        stage.addActor(firstUserBtn);
        stage.addActor(secondUserBtn);
        stage.addActor(thirdUserBtn);
        stage.addActor(fourthUserBtn);
        stage.addActor(fifthUserBtn);
        stage.addActor(sixthUserBtn);

    }

    @Override
    protected void handleInput() {
        if(Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){

        }
    }

    @Override
    public void update(float dt) {
        handleInput();
        /*
        if(firstUserBtn.isChecked()){

            secondUserBtn.setChecked(false);
            thirdUserBtn.setChecked(false);
            fourthUserBtn.setChecked(false);
            fifthUserBtn.setChecked(false);
            sixthUserBtn.setChecked(false);

        }
        else if (secondUserBtn.isChecked()){

            firstUserBtn.setChecked(false);
            thirdUserBtn.setChecked(false);
            fourthUserBtn.setChecked(false);
            fifthUserBtn.setChecked(false);
            sixthUserBtn.setChecked(false);

        }
        else if (thirdUserBtn.isChecked()){

            firstUserBtn.setChecked(false);
            secondUserBtn.setChecked(false);
            fourthUserBtn.setChecked(false);
            fifthUserBtn.setChecked(false);
            sixthUserBtn.setChecked(false);

        }
        else if (fourthUserBtn.isChecked()){

            firstUserBtn.setChecked(false);
            secondUserBtn.setChecked(false);
            thirdUserBtn.setChecked(false);
            fifthUserBtn.setChecked(false);
            sixthUserBtn.setChecked(false);

        }
        else if (fifthUserBtn.isChecked()){

            firstUserBtn.setChecked(false);
            secondUserBtn.setChecked(false);
            thirdUserBtn.setChecked(false);
            fourthUserBtn.setChecked(false);
            sixthUserBtn.setChecked(false);

        }
        else if (sixthUserBtn.isChecked()){

            firstUserBtn.setChecked(false);
            secondUserBtn.setChecked(false);
            thirdUserBtn.setChecked(false);
            fourthUserBtn.setChecked(false);
            fifthUserBtn.setChecked(false);

        }
        */
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
        backgroundTexture.dispose();
        back.dispose();
        textfieldTexture.dispose();
        cursorTexture.dispose();
        activeBGTexture.dispose();
        notActiveBGTexture.dispose();
        login.dispose();
        register.dispose();
        delete.dispose();
    }

    @Override
    public void resize(int width, int height) {

    }
}
