package com.legendandroidgame.game.Buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;


/**
 * Created by Patrick on 5/2/2017.
 */
public class Controller {

    private Texture up, down, left, right;
    private Stage stage;
    private ImageButton btnGo, btnUp, btnDown, btnLeft, btnRight;
    private OrthographicCamera camera;
    private Vector2 upPos, downPos, rightPos, leftPos;

    boolean upPressed, downPressed, leftPressed, rightPressed;

    public Controller(Stage stage){

        this.stage = stage;

        camera = new OrthographicCamera();
        camera.setToOrtho(false,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        camera.position.set(0f, 0f, 1f);

        if (Gdx.graphics.getWidth() > 1800){
            up = new Texture("1080/button/upbtn.png");
            down = new Texture("1080/button/downbtn.png");
            left = new Texture("1080/button/leftbtn.png");
            right = new Texture("1080/button/rightbtn.png");
        }
        else {
            up = new Texture("720/button/upbtn.png");
            down = new Texture("720/button/downbtn.png");
            left = new Texture("720/button/leftbtn.png");
            right = new Texture("720/button/rightbtn.png");
        }

        Drawable upDraw = new TextureRegionDrawable(new TextureRegion(up));
        btnUp = new ImageButton(upDraw);


        Drawable downDraw = new TextureRegionDrawable(new TextureRegion(down));
        btnDown = new ImageButton(downDraw);

        Drawable leftDraw = new TextureRegionDrawable(new TextureRegion(left));
        btnLeft = new ImageButton(leftDraw);

        Drawable rightDraw = new TextureRegionDrawable(new TextureRegion(right));
        btnRight = new ImageButton(rightDraw);

        upPos = new Vector2(stage.getWidth() / 8, stage.getHeight() / 4);
        downPos = new Vector2(stage.getWidth() / 8, stage.getHeight() / 4 - (btnDown.getHeight() + (btnDown.getHeight() / 2)));
        rightPos = new Vector2(stage.getWidth() / 3 - ((btnRight.getWidth() * 1.85f) - (btnRight.getWidth() / 4)), stage.getHeight() / 6 - (btnRight.getHeight() / 6));
        leftPos = new Vector2(stage.getWidth() / 18, stage.getHeight() / 6 - (btnLeft.getHeight() / 6));

        btnDown.setPosition(downPos.x, downPos.y);
        btnUp.setPosition(upPos.x, upPos.y);
        btnLeft.setPosition(leftPos.x, leftPos.y);
        btnRight.setPosition(rightPos.x, rightPos.y);


        btnUp.addListener(new InputListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                upPressed = true;
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                upPressed = false;
            }
        });

        btnDown.addListener(new InputListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                downPressed = true;
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                downPressed = false;
            }
        });

        btnLeft.addListener(new InputListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                leftPressed = true;
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                leftPressed = false;
            }
        });

        btnRight.addListener(new InputListener(){

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                rightPressed = true;
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                rightPressed = false;
            }
        });

        switch (Gdx.app.getType()){
            case Android:
                stage.addActor(btnUp);
                stage.addActor(btnDown);
                stage.addActor(btnLeft);
                stage.addActor(btnRight);
                break;
            case Desktop:
                break;
        }
    }

    public void dispose(){
        up.dispose();
        down.dispose();
        left.dispose();
        right.dispose();
    }

    public ImageButton getBtnGo() {
        return btnGo;
    }

    public ImageButton getBtnUp() {
        return btnUp;
    }

    public ImageButton getBtnDown() {
        return btnDown;
    }

    public ImageButton getBtnLeft() {
        return btnLeft;
    }

    public ImageButton getBtnRight() {
        return btnRight;
    }

    public OrthographicCamera getCamera() {
        return camera;
    }

    public Stage getStageC() {
        return stage;
    }


    public boolean isUpPressed() {
        return upPressed;
    }

    public boolean isDownPressed() {
        return downPressed;
    }

    public boolean isLeftPressed() {
        return leftPressed;
    }

    public boolean isRightPressed() {
        return rightPressed;
    }
}

