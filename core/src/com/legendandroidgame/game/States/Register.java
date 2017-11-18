package com.legendandroidgame.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import static com.legendandroidgame.game.LegendAndroidGame.gameData;
import static com.legendandroidgame.game.LegendAndroidGame.gameView;

/**
 * Created by Patrick on 7/21/2017.
 */
public class Register extends GameState {


    private Stage stage;

    private ImageButton btnRegister, btnBack, btnOkPass, btnOkReg;
    private Texture background, back, textbox, cursor, selection, register, passwordNotMatch, registeredSucc, okBtn;
    private Image backgroundImg, passNotMatch, registered;

    private TextField user, pass, repass;

    private FileHandle fontFile;


    protected Register(final GameStateManager gsm) {
        super(gsm);

        fontFile = Gdx.files.internal("font/Candarab.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 30;
        BitmapFont font = generator.generateFont(parameter);

        if(Gdx.graphics.getWidth() > 1800 ){
            background = new Texture("1080/background/register.png");
            back = new Texture("1080/button/Backbtn.png");
            textbox = new Texture("1080/skin/textfield.png");
            cursor = new Texture("1080/skin/cursor.png");
            selection = new Texture("1080/skin/cursor.png");
            register = new Texture("1080/button/Register Button.png");
            passwordNotMatch = new Texture("1080/popup/passnotmatch.png");
            registeredSucc = new Texture("1080/popup/registered successfully.png");
            okBtn = new Texture("1080/button/Ok Button.png");
        }
        else {
            background = new Texture("720/background/register.png");
            back = new Texture("720/button/Backbtn.png");
            textbox = new Texture("720/skin/textfield.png");
            cursor = new Texture("720/skin/cursor.png");
            selection = new Texture("720/skin/cursor.png");
            register = new Texture("720/button/Register Button.png");
            passwordNotMatch = new Texture("720/popup/passnotmatch.png");
            registeredSucc = new Texture("720/popup/registered successfully.png");
            okBtn = new Texture("720/button/Ok Button.png");
        }

        stage = new Stage(gameView);

        backgroundImg = new Image(background);
        passNotMatch = new Image(passwordNotMatch);
        registered = new Image(registeredSucc);
        backgroundImg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        passNotMatch.setPosition(Gdx.graphics.getWidth() / 2 - passwordNotMatch.getWidth() / 2, Gdx.graphics.getHeight() / 2 - passwordNotMatch.getHeight() / 2);
        registered.setPosition(Gdx.graphics.getWidth() / 2 - registeredSucc.getWidth() / 2, Gdx.graphics.getHeight() / 2 - registeredSucc.getHeight() / 2);


        Gdx.input.setInputProcessor(stage);

        Drawable TextFieldtb = new TextureRegionDrawable(new TextureRegion(textbox));
        Drawable TextFieldCursor = new TextureRegionDrawable(new TextureRegion(cursor, 3, textbox.getHeight()));
        Drawable TextFieldSelection = new TextureRegionDrawable(new TextureRegion(selection, textbox.getWidth(), 5));

        user = new TextField("", new TextField.TextFieldStyle(font, Color.WHITE,TextFieldCursor, TextFieldSelection,TextFieldtb));
        pass = new TextField("", new TextField.TextFieldStyle(font, Color.WHITE,TextFieldCursor, TextFieldSelection,TextFieldtb));
        repass = new TextField("", new TextField.TextFieldStyle(font, Color.WHITE, TextFieldCursor, TextFieldSelection, TextFieldtb));
        user.setMaxLength(15);
        user.setSize(textbox.getWidth(), textbox.getHeight());
        pass.setSize(textbox.getWidth(), textbox.getHeight());
        repass.setSize(textbox.getWidth(), textbox.getHeight());
        pass.setPasswordMode(true);
        pass.setPasswordCharacter('*');
        repass.setPasswordMode(true);
        repass.setPasswordCharacter('*');

        Drawable regDraw = new TextureRegionDrawable(new TextureRegion(register));
        Drawable backDraw = new TextureRegionDrawable(new TextureRegion(back));
        Drawable okRegDraw = new TextureRegionDrawable(new TextureRegion(okBtn));
        Drawable okPassDraw = new TextureRegionDrawable(new TextureRegion(okBtn));
        btnRegister = new ImageButton(regDraw);
        btnBack = new ImageButton(backDraw);
        btnOkReg = new ImageButton(okRegDraw);
        btnOkPass = new ImageButton(okPassDraw);

        btnBack.setPosition(Gdx.graphics.getWidth() - back.getWidth(),  back.getHeight() / 2);
        user.setPosition(Gdx.graphics.getWidth() / 2 - user.getWidth() / 2, Gdx.graphics.getHeight() / 2 - user.getHeight() / 8);
        pass.setPosition(Gdx.graphics.getWidth() / 2 - pass.getWidth() / 2, Gdx.graphics.getHeight() / 4 + pass.getHeight() / 1.5f);
        repass.setPosition(Gdx.graphics.getWidth() / 2 - repass.getWidth() / 2, Gdx.graphics.getHeight() / 4 - repass.getHeight());
        btnRegister.setPosition(Gdx.graphics.getWidth() / 2 - register.getWidth() / 2, Gdx.graphics.getHeight() / 14);
        btnOkReg.setPosition(Gdx.graphics.getWidth() / 2 + okBtn.getWidth() / 3, Gdx.graphics.getHeight() / 2 - okBtn.getHeight());
        btnOkPass.setPosition(Gdx.graphics.getWidth() / 2 + okBtn.getWidth() / 3, Gdx.graphics.getHeight() / 2 - okBtn.getHeight());

        stage.addActor(backgroundImg);
        stage.addActor(user);
        stage.addActor(pass);
        stage.addActor(repass);
        stage.addActor(btnRegister);
        stage.addActor(btnBack);

        btnRegister.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                if(!pass.getText().equals(repass.getText())){
                    stage.addActor(passNotMatch);
                    stage.addActor(btnOkPass);

                    btnOkPass.addListener(new ClickListener(){

                        @Override
                        public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                            passNotMatch.remove();
                            btnOkPass.remove();

                            return true;
                        }

                    });
                }
                else {
                    if (gameData.contains(user.getText() + " username")){

                        System.out.println("username already exist");
                    }
                    else {
                        stage.addActor(registered);
                        stage.addActor(btnOkReg);

                        btnOkReg.addListener(new ClickListener() {

                            @Override
                            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                                if (gameData.getString("firstuser").isEmpty()){
                                    gameData.putString("firstuser", user.getText());
                                }
                                else if (gameData.getString("seconduser").isEmpty()){
                                    gameData.putString("seconduser", user.getText());
                                }
                                else if (gameData.getString("thirduser").isEmpty()){
                                    gameData.putString("thirduser", user.getText());
                                }
                                else if (gameData.getString("fourthuser").isEmpty()){
                                    gameData.putString("fourthuser", user.getText());
                                }
                                else if (gameData.getString("fifthuser").isEmpty()){
                                    gameData.putString("fifthuser", user.getText());
                                }
                                else if (gameData.getString("sixuser").isEmpty()){
                                    gameData.putString("sixuser", user.getText());
                                }
                                else {
                                    System.out.println("error!");
                                }

                                gameData.putString(user.getText() + " password", pass.getText());
                                gameData.putInteger(user.getText() + " missionId", 0);
                                gameData.putInteger(user.getText() + " convoId", 1);
                                gameData.putInteger(user.getText() + " currentLocation", 20);
                                gameData.putInteger(user.getText() + " minuteTimer", 0);
                                gameData.putInteger(user.getText() + " hourTimer", 6);
                                gameData.putInteger(user.getText() + " health", 960);
                                gameData.flush();

                                gsm.set(new UserLogin(gsm));
                                dispose();
                                return true;
                            }

                        });
                    }
                }

                return true;
            }
        });


        btnBack.addListener(new ClickListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                gsm.set(new UserLogin(gsm));
                dispose();
                return true;
            }

        });
    }

    @Override
    protected void handleInput() {

        if(Gdx.input.justTouched()){
//            System.out.println(pass.getText() + " this is pass");
//            System.out.println(repass.getText() + " this is repass");
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        stage.draw();
        stage.act();
    }

    @Override
    public void dispose() {
        stage.dispose();
        background.dispose();
        back.dispose();
        textbox.dispose();
        cursor.dispose();
        selection.dispose();
        register.dispose();
        passwordNotMatch.dispose();
        registeredSucc.dispose();
        okBtn.dispose();
    }

    @Override
    public void resize(int width, int height) {

    }
}
