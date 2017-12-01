package com.legendandroidgame.game.PopupBox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;


/**
 * Created by Patrick on 5/2/2017.
 */
public class Warning {

    private Stage stage;
    public Texture bethelTxr, haranTxr, houseTxr, noTxr, yesTxr;
    public Image bethelImg, haranImg, houseImg;
    public ImageButton noBtn, yesBtn;
    public boolean isBethel = false, isHaran = false, isHouse = false;

    public Warning(Stage stage){
        this.stage = stage;

        if(Gdx.graphics.getWidth() > 1800){

        }
        else {
            bethelTxr = new Texture("720/popup/Bethel_Prompt.png");
            haranTxr = new Texture("720/popup/Haran_Prompt.png");
            houseTxr = new Texture("720/popup/InsideHouse_Prompt.png");
            noTxr = new Texture("720/button/No Button.png");
            yesTxr = new Texture("720/button/Yes Button.png");
        }

        bethelImg = new Image(bethelTxr);
        bethelImg.setPosition(Gdx.graphics.getWidth() / 2 - bethelTxr.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - bethelTxr.getHeight() / 2);

        haranImg = new Image(haranTxr);
        haranImg.setPosition(Gdx.graphics.getWidth() / 2 - haranTxr.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - haranTxr.getHeight() / 2);

        houseImg = new Image(houseTxr);
        houseImg.setPosition(Gdx.graphics.getWidth() / 2 - houseTxr.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - houseTxr.getHeight() / 2);

        Drawable yesDraw = new TextureRegionDrawable(new TextureRegion(yesTxr));
        Drawable noDraw = new TextureRegionDrawable(new TextureRegion(noTxr));

        yesBtn = new ImageButton(yesDraw);
        noBtn = new ImageButton(noDraw);

        yesBtn.setPosition(Gdx.graphics.getWidth() / 2 - yesTxr.getWidth() / 2,
                Gdx.graphics.getHeight() / 2 - yesTxr.getHeight());
        noBtn.setPosition(Gdx.graphics.getWidth() / 2 + noTxr.getWidth(),
                Gdx.graphics.getHeight() / 2 - noTxr.getHeight());

    }

    public void close(){
        bethelImg.remove();
        haranImg.remove();
        houseImg.remove();

        yesBtn.remove();
//        noBtn.remove();
    }

    public void update(){

        if (isBethel) {
            stage.addActor(bethelImg);
            stage.addActor(yesBtn);
        }
        else if (isHaran) {
            stage.addActor(haranImg);
            stage.addActor(yesBtn);
        }
        else if (isHouse) {
            stage.addActor(houseImg);
            stage.addActor(yesBtn);
        }
        else {
            close();
        }

    }

    public void dispose(){

        bethelTxr.dispose();
        haranTxr.dispose();
        houseTxr.dispose();
        yesTxr.dispose();
        noTxr.dispose();

    }

}
