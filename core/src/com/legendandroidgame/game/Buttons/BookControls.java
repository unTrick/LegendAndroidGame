package com.legendandroidgame.game.Buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * Created by Patrick on 5/2/2017.
 */
public class BookControls {
private Stage stage;
    private TextButton back, btnGen, btnExo, btnLev, btnNum, btnDeu;
    private ImageButton btnNext, btnPrev;
    BitmapFont font;


    public BookControls(){

        stage = new Stage();

        FileHandle fontFile = Gdx.files.internal("font/Candarab.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);
        FreeTypeFontGenerator.FreeTypeFontParameter contentParameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        contentParameter.size = 20;
        font = generator.generateFont(contentParameter);

        Drawable down = new TextureRegionDrawable(new TextureRegion(new Texture("skin/downDrawable.png")));
        Drawable up = new TextureRegionDrawable(new TextureRegion(new Texture("skin/upDrawable.png")));
        Drawable checked = new TextureRegionDrawable(new TextureRegion(new Texture("skin/checkedDraw.png")));

        btnGen = new TextButton(" Genesis ", new TextButton.TextButtonStyle(up,down,checked,font));
        btnExo = new TextButton(" Exodus ", new TextButton.TextButtonStyle(up,down,checked,font));
        btnLev = new TextButton(" Leviticus ", new TextButton.TextButtonStyle(up,down,checked,font));
        btnNum = new TextButton(" Numbers ", new TextButton.TextButtonStyle(up,down,checked,font));
        btnDeu = new TextButton(" Deuteronomy ", new TextButton.TextButtonStyle(up,down,checked,font));
        back = new TextButton(" Home ", new TextButton.TextButtonStyle(up,down,checked,font));

        Drawable nextDraw = new TextureRegionDrawable(new TextureRegion(new Texture("button/nextPg.png")));
        btnNext = new ImageButton(nextDraw);

        Drawable prevDraw = new TextureRegionDrawable(new TextureRegion(new Texture("button/pregPg.png")));
        btnPrev = new ImageButton(prevDraw);

    }

    public Stage getStage() {
        return stage;
    }


    public ImageButton getBtnPrev() {
        return btnPrev;
    }

    public ImageButton getBtnNext() {
        return btnNext;
    }

    public TextButton getBack() {
        return back;
    }

    public TextButton getBtnGen() {
        return btnGen;
    }

    public TextButton getBtnExo() {
        return btnExo;
    }

    public TextButton getBtnLev() {
        return btnLev;
    }

    public TextButton getBtnNum() {
        return btnNum;
    }

    public TextButton getBtnDeu() {
        return btnDeu;
    }
}
