package com.legendandroidgame.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Slider;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.legendandroidgame.game.LegendAndroidGame;

import static com.legendandroidgame.game.LegendAndroidGame.gameView;

/**
 * Created by Patrick on 5/2/2017.
 */
public class MenuSetting extends GameState {

    private Texture  bg,musicIcon, musicBG, musicknob, back;
    private Stage stage;
    private Slider musicSlider, voiceSlider, sound;
    long id = LegendAndroidGame.clickSound.play(1.0f);

    public MenuSetting(final GameStateManager gsm){
        super(gsm);

        if(Gdx.graphics.getWidth() > 1800 ){
            bg = new Texture("1080/background/settingsMenu.png");
            musicIcon = new Texture("1080/skin/Volume Icon.png");
            musicBG = new Texture("1080/skin/Volume Bar.png");
            musicknob = new Texture("1080/skin/Circle.png");
            back = new Texture("1080/button/Backbtn.png");
        }
        else {
            bg = new Texture("720/background/settingsMenu.png");
            musicIcon = new Texture("720/skin/Volume Icon.png");
            musicBG = new Texture("720/skin/Volume Bar.png");
            musicknob = new Texture("720/skin/Circle.png");
            back = new Texture("720/button/Backbtn.png");
        }


        stage = new Stage(gameView);
        Gdx.input.setInputProcessor(stage);

        Image background = new Image(bg);
        Image MusicIcon1 = new Image(musicIcon);
        Image MusicIcon2 = new Image(musicIcon);
        Image MusicIcon3 = new Image(musicIcon);

        Drawable musicBGDraw = new TextureRegionDrawable(new TextureRegion(musicBG));
        Drawable musicKnobDraw = new TextureRegionDrawable(new TextureRegion(musicknob));
        Drawable backDraw = new TextureRegionDrawable(new TextureRegion(back));

        ImageButton backBtn = new ImageButton(backDraw);

        musicSlider = new Slider(1,20,2,false, new Slider.SliderStyle(musicBGDraw, musicKnobDraw));
        voiceSlider = new Slider(1,20,2,false, new Slider.SliderStyle(musicBGDraw, musicKnobDraw));
        sound = new Slider(1,20,2,false, new Slider.SliderStyle(musicBGDraw, musicKnobDraw));

        musicSlider.setSize(musicBG.getWidth(), musicBG.getHeight());
        voiceSlider.setSize(musicBG.getWidth(), musicBG.getHeight());
        sound.setSize(musicBG.getWidth(), musicBG.getHeight());


        MusicIcon1.setPosition(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2.07f);
        MusicIcon2.setPosition(Gdx.graphics.getWidth() / 2 , Gdx.graphics.getHeight() / 2.55f);
        MusicIcon3.setPosition(Gdx.graphics.getWidth() / 2 , Gdx.graphics.getHeight() / 3.5f);

        musicSlider.setPosition(Gdx.graphics.getWidth() / 2 + musicIcon.getWidth(), Gdx.graphics.getHeight() / 1.98f);
        voiceSlider.setPosition(Gdx.graphics.getWidth() / 2 + musicIcon.getWidth(), Gdx.graphics.getHeight() / 2.4f);
        sound.setPosition(Gdx.graphics.getWidth() / 2 + musicIcon.getWidth(), Gdx.graphics.getHeight() / 3.2f);
        backBtn.setPosition(Gdx.graphics.getWidth() - back.getWidth(),  back.getHeight() / 2);


        musicSlider.setValue(LegendAndroidGame.backgroundMusic.getVolume() * 20f);
        voiceSlider.setValue(LegendAndroidGame.genesisChOne.getVolume() * 20f);

        // change the clicksound to yes or no

        musicSlider.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (musicSlider.getValue() == 1){
                    LegendAndroidGame.backgroundMusic.setVolume(0);
                    LegendAndroidGame.storyMusic.setVolume(0);
                    LegendAndroidGame.storyMusic.setVolume(0);
                }
                else if  (musicSlider.getValue() == 2){
                    LegendAndroidGame.backgroundMusic.setVolume(0.1f);
                    LegendAndroidGame.storyMusic.setVolume(0.1f);
                    LegendAndroidGame.storyMusic.setVolume(0.1f);

                }
                else if (musicSlider.getValue() == 4){
                    LegendAndroidGame.backgroundMusic.setVolume(0.2f);
                    LegendAndroidGame.storyMusic.setVolume(0.2f);
                    LegendAndroidGame.storyMusic.setVolume(0.2f);

                }
                else if (musicSlider.getValue() == 6){
                    LegendAndroidGame.backgroundMusic.setVolume(0.3f);
                    LegendAndroidGame.storyMusic.setVolume(0.3f);
                    LegendAndroidGame.storyMusic.setVolume(0.3f);

                }
                else if (musicSlider.getValue() == 8){
                    LegendAndroidGame.backgroundMusic.setVolume(0.4f);
                    LegendAndroidGame.storyMusic.setVolume(0.4f);
                    LegendAndroidGame.storyMusic.setVolume(0.4f);
                }
                else if (musicSlider.getValue() == 10){
                    LegendAndroidGame.backgroundMusic.setVolume(0.5f);
                    LegendAndroidGame.storyMusic.setVolume(0.5f);
                    LegendAndroidGame.storyMusic.setVolume(0.5f);
                }
                else if (musicSlider.getValue() == 12){
                    LegendAndroidGame.backgroundMusic.setVolume(0.6f);
                    LegendAndroidGame.storyMusic.setVolume(0.6f);
                    LegendAndroidGame.storyMusic.setVolume(0.6f);

                }
                else if (musicSlider.getValue() == 14){
                    LegendAndroidGame.backgroundMusic.setVolume(0.7f);
                    LegendAndroidGame.storyMusic.setVolume(0.7f);
                    LegendAndroidGame.storyMusic.setVolume(0.7f);


                }
                else if (musicSlider.getValue() == 16) {
                    LegendAndroidGame.backgroundMusic.setVolume(0.8f);
                    LegendAndroidGame.storyMusic.setVolume(0.8f);
                    LegendAndroidGame.storyMusic.setVolume(0.8f);

                }
                else if (musicSlider.getValue() == 18) {
                    LegendAndroidGame.backgroundMusic.setVolume(0.9f);
                    LegendAndroidGame.storyMusic.setVolume(0.9f);
                    LegendAndroidGame.storyMusic.setVolume(0.9f);


                }
                else if (musicSlider.getValue() == 20) {
                    LegendAndroidGame.backgroundMusic.setVolume(1);
                    LegendAndroidGame.storyMusic.setVolume(1);
                    LegendAndroidGame.storyMusic.setVolume(1);

                }
            }
        });

        voiceSlider.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (voiceSlider.getValue() == 1){
                    LegendAndroidGame.genesisChOne.setVolume(0);
                    LegendAndroidGame.genesisChTwo.setVolume(0);
                    LegendAndroidGame.genesisChThree.setVolume(0);
                    LegendAndroidGame.genesisChFour.setVolume(0);
                    LegendAndroidGame.genesisChFive.setVolume(0);
                    LegendAndroidGame.genesisChSix.setVolume(0);
                    LegendAndroidGame.genesisChSeven.setVolume(0);
                    LegendAndroidGame.genesisChEight.setVolume(0);
                    LegendAndroidGame.genesisChNine.setVolume(0);
                    LegendAndroidGame.genesisChTen.setVolume(0);
                    LegendAndroidGame.genesisChEleven.setVolume(0);
                    LegendAndroidGame.genesisChTwelve.setVolume(0);
                    LegendAndroidGame.genesisChThirteen.setVolume(0);
                    LegendAndroidGame.genesisChFourteen.setVolume(0);
                    LegendAndroidGame.genesisChFifteen.setVolume(0);
                    LegendAndroidGame.genesisChSixteen.setVolume(0);
                    LegendAndroidGame.genesisChSeventeen.setVolume(0);
                    LegendAndroidGame.genesisChEighteen.setVolume(0);
                    LegendAndroidGame.genesisChNineteen.setVolume(0);
                    LegendAndroidGame.genesisChTwenty.setVolume(0);

                    LegendAndroidGame.genesisChTwentyOne.setVolume(0);
                    LegendAndroidGame.genesisChTwentyTwo.setVolume(0);
                    LegendAndroidGame.genesisChTwentyThree.setVolume(0);
                    LegendAndroidGame.genesisChTwentyFour.setVolume(0);
                    LegendAndroidGame.genesisChTwentyFive.setVolume(0);
                    LegendAndroidGame.genesisChTwentySix.setVolume(0);
                    LegendAndroidGame.genesisChTwentySeven.setVolume(0);
                    LegendAndroidGame.genesisChTwentyEight.setVolume(0);
                    LegendAndroidGame.genesisChTwentyNine.setVolume(0);
                    LegendAndroidGame.genesisChThirtyOne.setVolume(0);
                    LegendAndroidGame.genesisChThirtyTwo.setVolume(0);
                    LegendAndroidGame.genesisChThirtyThree.setVolume(0);
                    LegendAndroidGame.genesisChThirtyFour.setVolume(0);
                    LegendAndroidGame.genesisChThirtyFive.setVolume(0);
                    LegendAndroidGame.genesisChThirtySix.setVolume(0);
                    LegendAndroidGame.genesisChThirtySeven.setVolume(0);
                    LegendAndroidGame.genesisChThirtyEight.setVolume(0);
                    LegendAndroidGame.genesisChThirtyNine.setVolume(0);
                    LegendAndroidGame.genesisChForty.setVolume(0);

                    LegendAndroidGame.genesisChFortyOne.setVolume(0);
                    LegendAndroidGame.genesisChFortyTwo.setVolume(0);
                    LegendAndroidGame.genesisChFortyThree.setVolume(0);
                    LegendAndroidGame.genesisChFortyFour.setVolume(0);
                    LegendAndroidGame.genesisChFortyFive.setVolume(0);
                    LegendAndroidGame.genesisChFortySix.setVolume(0);
                    LegendAndroidGame.genesisChFortySeven.setVolume(0);
                    LegendAndroidGame.genesisChFortyEight.setVolume(0);
                    LegendAndroidGame.genesisChFortyNine.setVolume(0);
                    LegendAndroidGame.genesisChFifty.setVolume(0);

                    LegendAndroidGame.exodusChOne.setVolume(0);
                    LegendAndroidGame.exodusChTwo.setVolume(0);
                    LegendAndroidGame.exodusChThree.setVolume(0);
                    LegendAndroidGame.exodusChFour.setVolume(0);
                    LegendAndroidGame.exodusChFive.setVolume(0);
                    LegendAndroidGame.exodusChSix.setVolume(0);
                    LegendAndroidGame.exodusChSeven.setVolume(0);
                    LegendAndroidGame.exodusChEight.setVolume(0);
                    LegendAndroidGame.exodusChNine.setVolume(0);
                    LegendAndroidGame.exodusChTen.setVolume(0);

                    LegendAndroidGame.exodusChEleven.setVolume(0);
                    LegendAndroidGame.exodusChTwelve.setVolume(0);
                    LegendAndroidGame.exodusChThirteen.setVolume(0);
                    LegendAndroidGame.exodusChFourteen.setVolume(0);
                    LegendAndroidGame.exodusChFifteen.setVolume(0);
                    LegendAndroidGame.exodusChSixteen.setVolume(0);
                    LegendAndroidGame.exodusChSeventeen.setVolume(0);
                    LegendAndroidGame.exodusChEighteen.setVolume(0);
                    LegendAndroidGame.exodusChNineteen.setVolume(0);
                    LegendAndroidGame.exodusChTwenty.setVolume(0);

                    LegendAndroidGame.exodusChTwentyOne.setVolume(0);
                    LegendAndroidGame.exodusChTwentyTwo.setVolume(0);
                    LegendAndroidGame.exodusChTwentyThree.setVolume(0);
                    LegendAndroidGame.exodusChTwentyFour.setVolume(0);
                    LegendAndroidGame.exodusChTwentyFive.setVolume(0);
                    LegendAndroidGame.exodusChTwentySix.setVolume(0);
                    LegendAndroidGame.exodusChTwentySeven.setVolume(0);
                    LegendAndroidGame.exodusChTwentyEight.setVolume(0);
                    LegendAndroidGame.exodusChTwentyNine.setVolume(0);
                    LegendAndroidGame.exodusChThirty.setVolume(0);

                    LegendAndroidGame.exodusChThirtyOne.setVolume(0);
                    LegendAndroidGame.exodusChThirtyTwo.setVolume(0);
                    LegendAndroidGame.exodusChThirtyThree.setVolume(0);
                    LegendAndroidGame.exodusChThirtyFour.setVolume(0);
                    LegendAndroidGame.exodusChThirtyFive.setVolume(0);
                    LegendAndroidGame.exodusChThirtySix.setVolume(0);
                    LegendAndroidGame.exodusChThirtySeven.setVolume(0);
                    LegendAndroidGame.exodusChThirtyEight.setVolume(0);
                    LegendAndroidGame.exodusChThirtyNine.setVolume(0);
                    LegendAndroidGame.exodusChForty.setVolume(0);

                    LegendAndroidGame.leviticusChOne.setVolume(0);
                    LegendAndroidGame.leviticusChTwo.setVolume(0);
                    LegendAndroidGame.leviticusChThree.setVolume(0);
                    LegendAndroidGame.leviticusChFour.setVolume(0);
                    LegendAndroidGame.leviticusChFive.setVolume(0);
                    LegendAndroidGame.leviticusChSix.setVolume(0);
                    LegendAndroidGame.leviticusChSeven.setVolume(0);
                    LegendAndroidGame.leviticusChEight.setVolume(0);
                    LegendAndroidGame.leviticusChNine.setVolume(0);
                    LegendAndroidGame.leviticusChTen.setVolume(0);

                    LegendAndroidGame.leviticusChEleven.setVolume(0);
                    LegendAndroidGame.leviticusChTwelve.setVolume(0);
                    LegendAndroidGame.leviticusChThirteen.setVolume(0);
                    LegendAndroidGame.leviticusChFourteen.setVolume(0);
                    LegendAndroidGame.leviticusChFifteen.setVolume(0);
                    LegendAndroidGame.leviticusChSixteen.setVolume(0);
                    LegendAndroidGame.leviticusChSeventeen.setVolume(0);
                    LegendAndroidGame.leviticusChEighteen.setVolume(0);
                    LegendAndroidGame.leviticusChNineteen.setVolume(0);
                    LegendAndroidGame.leviticusChTwenty.setVolume(0);

                    LegendAndroidGame.leviticusChTwentyOne.setVolume(0);
                    LegendAndroidGame.leviticusChTwentyTwo.setVolume(0);
                    LegendAndroidGame.leviticusChTwentyThree.setVolume(0);
                    LegendAndroidGame.leviticusChTwentyFour.setVolume(0);
                    LegendAndroidGame.leviticusChTwentyFive.setVolume(0);
                    LegendAndroidGame.leviticusChTwentySix.setVolume(0);
                    LegendAndroidGame.leviticusChTwentySeven.setVolume(0);

                    LegendAndroidGame.numbersChOne.setVolume(0);
                    LegendAndroidGame.numbersChTwo.setVolume(0);
                    LegendAndroidGame.numbersChThree.setVolume(0);
                    LegendAndroidGame.numbersChFour.setVolume(0);
                    LegendAndroidGame.numbersChFive.setVolume(0);
                    LegendAndroidGame.numbersChSix.setVolume(0);
                    LegendAndroidGame.numbersChSeven.setVolume(0);
                    LegendAndroidGame.numbersChEight.setVolume(0);
                    LegendAndroidGame.numbersChNine.setVolume(0);
                    LegendAndroidGame.numbersChTen.setVolume(0);

                    LegendAndroidGame.numbersChEleven.setVolume(0);
                    LegendAndroidGame.numbersChTwelve.setVolume(0);
                    LegendAndroidGame.numbersChThirteen.setVolume(0);
                    LegendAndroidGame.numbersChFourteen.setVolume(0);
                    LegendAndroidGame.numbersChFifteen.setVolume(0);
                    LegendAndroidGame.numbersChSixteen.setVolume(0);
                    LegendAndroidGame.numbersChSeventeen.setVolume(0);
                    LegendAndroidGame.numbersChEighteen.setVolume(0);
                    LegendAndroidGame.numbersChNineteen.setVolume(0);
                    LegendAndroidGame.numbersChTwenty.setVolume(0);

                    LegendAndroidGame.numbersChTwentyOne.setVolume(0);
                    LegendAndroidGame.numbersChTwentyTwo.setVolume(0);
                    LegendAndroidGame.numbersChTwentyThree.setVolume(0);
                    LegendAndroidGame.numbersChTwentyFour.setVolume(0);
                    LegendAndroidGame.numbersChTwentyFive.setVolume(0);
                    LegendAndroidGame.numbersChTwentySix.setVolume(0);
                    LegendAndroidGame.numbersChTwentySeven.setVolume(0);
                    LegendAndroidGame.numbersChTwentyEight.setVolume(0);
                    LegendAndroidGame.numbersChTwentyNine.setVolume(0);
                    LegendAndroidGame.numbersChThirty.setVolume(0);

                    LegendAndroidGame.numbersChThirtyOne.setVolume(0);
                    LegendAndroidGame.numbersChThirtyTwo.setVolume(0);
                    LegendAndroidGame.numbersChThirtyThree.setVolume(0);
                    LegendAndroidGame.numbersChThirtyFour.setVolume(0);
                    LegendAndroidGame.numbersChThirtyFive.setVolume(0);
                    LegendAndroidGame.numbersChThirtySix.setVolume(0);

                    LegendAndroidGame.deuteronomyChOne.setVolume(0);
                    LegendAndroidGame.deuteronomyChTwo.setVolume(0);
                    LegendAndroidGame.deuteronomyChThree.setVolume(0);
                    LegendAndroidGame.deuteronomyChFour.setVolume(0);
                    LegendAndroidGame.deuteronomyChFive.setVolume(0);
                    LegendAndroidGame.deuteronomyChSix.setVolume(0);
                    LegendAndroidGame.deuteronomyChSeven.setVolume(0);
                    LegendAndroidGame.deuteronomyChEight.setVolume(0);
                    LegendAndroidGame.deuteronomyChNine.setVolume(0);
                    LegendAndroidGame.deuteronomyChTen.setVolume(0);

                    LegendAndroidGame.deuteronomyChEleven.setVolume(0);
                    LegendAndroidGame.deuteronomyChTwelve.setVolume(0);
                    LegendAndroidGame.deuteronomyChThirteen.setVolume(0);
                    LegendAndroidGame.deuteronomyChFourteen.setVolume(0);
                    LegendAndroidGame.deuteronomyChFifteen.setVolume(0);
                    LegendAndroidGame.deuteronomyChSixteen.setVolume(0);
                    LegendAndroidGame.deuteronomyChSeventeen.setVolume(0);
                    LegendAndroidGame.deuteronomyChEighteen.setVolume(0);
                    LegendAndroidGame.deuteronomyChNineteen.setVolume(0);
                    LegendAndroidGame.deuteronomyChTwenty.setVolume(0);

                    LegendAndroidGame.deuteronomyChTwentyOne.setVolume(0);
                    LegendAndroidGame.deuteronomyChTwentyTwo.setVolume(0);
                    LegendAndroidGame.deuteronomyChTwentyThree.setVolume(0);
                    LegendAndroidGame.deuteronomyChTwentyFour.setVolume(0);
                    LegendAndroidGame.deuteronomyChTwentyFive.setVolume(0);
                    LegendAndroidGame.deuteronomyChTwentySix.setVolume(0);
                    LegendAndroidGame.deuteronomyChTwentySeven.setVolume(0);
                    LegendAndroidGame.deuteronomyChTwentyEight.setVolume(0);
                    LegendAndroidGame.deuteronomyChTwentyNine.setVolume(0);
                    LegendAndroidGame.deuteronomyChThirty.setVolume(0);

                    LegendAndroidGame.deuteronomyChThirtyOne.setVolume(0);
                    LegendAndroidGame.deuteronomyChThirtyTwo.setVolume(0);
                    LegendAndroidGame.deuteronomyChThirtyThree.setVolume(0);
                    LegendAndroidGame.deuteronomyChThirtyFour.setVolume(0);

                    LegendAndroidGame.joshuaChOne.setVolume(0);
                    LegendAndroidGame.joshuaChTwo.setVolume(0);
                    LegendAndroidGame.joshuaChThree.setVolume(0);
                    LegendAndroidGame.joshuaChFour.setVolume(0);
                    LegendAndroidGame.joshuaChFive.setVolume(0);
                    LegendAndroidGame.joshuaChSix.setVolume(0);
                    LegendAndroidGame.joshuaChSeven.setVolume(0);
                    LegendAndroidGame.joshuaChEight.setVolume(0);
                    LegendAndroidGame.joshuaChNine.setVolume(0);
                    LegendAndroidGame.joshuaChTen.setVolume(0);

                    LegendAndroidGame.joshuaChEleven.setVolume(0);
                    LegendAndroidGame.joshuaChTwelve.setVolume(0);
                    LegendAndroidGame.joshuaChThirteen.setVolume(0);
                    LegendAndroidGame.joshuaChFourteen.setVolume(0);
                    LegendAndroidGame.joshuaChFifteen.setVolume(0);
                    LegendAndroidGame.joshuaChSixteen.setVolume(0);
                    LegendAndroidGame.joshuaChSeventeen.setVolume(0);
                    LegendAndroidGame.joshuaChEighteen.setVolume(0);
                    LegendAndroidGame.joshuaChNineteen.setVolume(0);
                    LegendAndroidGame.joshuaChTwenty.setVolume(0);

                    LegendAndroidGame.joshuaChTwentyOne.setVolume(0);
                    LegendAndroidGame.joshuaChTwentyTwo.setVolume(0);
                    LegendAndroidGame.joshuaChTwentyThree.setVolume(0);
                    LegendAndroidGame.joshuaChTwentyFour.setVolume(0);



                }
                else if  (voiceSlider.getValue() == 2){

                    LegendAndroidGame.genesisChOne.setVolume(0.1f);
                    LegendAndroidGame.genesisChTwo.setVolume(0.1f);
                    LegendAndroidGame.genesisChThree.setVolume(0.1f);
                    LegendAndroidGame.genesisChFour.setVolume(0.1f);
                    LegendAndroidGame.genesisChFive.setVolume(0.1f);
                    LegendAndroidGame.genesisChSix.setVolume(0.1f);
                    LegendAndroidGame.genesisChSeven.setVolume(0.1f);
                    LegendAndroidGame.genesisChEight.setVolume(0.1f);
                    LegendAndroidGame.genesisChNine.setVolume(0.1f);
                    LegendAndroidGame.genesisChTen.setVolume(0.1f);
                    LegendAndroidGame.genesisChEleven.setVolume(0.1f);
                    LegendAndroidGame.genesisChTwelve.setVolume(0.1f);
                    LegendAndroidGame.genesisChThirteen.setVolume(0.1f);
                    LegendAndroidGame.genesisChFourteen.setVolume(0.1f);
                    LegendAndroidGame.genesisChFifteen.setVolume(0.1f);
                    LegendAndroidGame.genesisChSixteen.setVolume(0.1f);
                    LegendAndroidGame.genesisChSeventeen.setVolume(0.1f);
                    LegendAndroidGame.genesisChEighteen.setVolume(0.1f);
                    LegendAndroidGame.genesisChNineteen.setVolume(0.1f);
                    LegendAndroidGame.genesisChTwenty.setVolume(0.1f);

                    LegendAndroidGame.genesisChTwentyOne.setVolume(0.1f);
                    LegendAndroidGame.genesisChTwentyTwo.setVolume(0.1f);
                    LegendAndroidGame.genesisChTwentyThree.setVolume(0.1f);
                    LegendAndroidGame.genesisChTwentyFour.setVolume(0.1f);
                    LegendAndroidGame.genesisChTwentyFive.setVolume(0.1f);
                    LegendAndroidGame.genesisChTwentySix.setVolume(0.1f);
                    LegendAndroidGame.genesisChTwentySeven.setVolume(0.1f);
                    LegendAndroidGame.genesisChTwentyEight.setVolume(0.1f);
                    LegendAndroidGame.genesisChTwentyNine.setVolume(0.1f);
                    LegendAndroidGame.genesisChThirtyOne.setVolume(0.1f);
                    LegendAndroidGame.genesisChThirtyTwo.setVolume(0.1f);
                    LegendAndroidGame.genesisChThirtyThree.setVolume(0.1f);
                    LegendAndroidGame.genesisChThirtyFour.setVolume(0.1f);
                    LegendAndroidGame.genesisChThirtyFive.setVolume(0.1f);
                    LegendAndroidGame.genesisChThirtySix.setVolume(0.1f);
                    LegendAndroidGame.genesisChThirtySeven.setVolume(0.1f);
                    LegendAndroidGame.genesisChThirtyEight.setVolume(0.1f);
                    LegendAndroidGame.genesisChThirtyNine.setVolume(0.1f);
                    LegendAndroidGame.genesisChForty.setVolume(0.1f);

                    LegendAndroidGame.genesisChFortyOne.setVolume(0.1f);
                    LegendAndroidGame.genesisChFortyTwo.setVolume(0.1f);
                    LegendAndroidGame.genesisChFortyThree.setVolume(0.1f);
                    LegendAndroidGame.genesisChFortyFour.setVolume(0.1f);
                    LegendAndroidGame.genesisChFortyFive.setVolume(0.1f);
                    LegendAndroidGame.genesisChFortySix.setVolume(0.1f);
                    LegendAndroidGame.genesisChFortySeven.setVolume(0.1f);
                    LegendAndroidGame.genesisChFortyEight.setVolume(0.1f);
                    LegendAndroidGame.genesisChFortyNine.setVolume(0.1f);
                    LegendAndroidGame.genesisChFifty.setVolume(0.1f);

                    LegendAndroidGame.exodusChOne.setVolume(0.1f);
                    LegendAndroidGame.exodusChTwo.setVolume(0.1f);
                    LegendAndroidGame.exodusChThree.setVolume(0.1f);
                    LegendAndroidGame.exodusChFour.setVolume(0.1f);
                    LegendAndroidGame.exodusChFour.setVolume(0.1f);
                    LegendAndroidGame.exodusChFive.setVolume(0.1f);
                    LegendAndroidGame.exodusChSix.setVolume(0.1f);
                    LegendAndroidGame.exodusChSeven.setVolume(0.1f);
                    LegendAndroidGame.exodusChEight.setVolume(0.1f);
                    LegendAndroidGame.exodusChNine.setVolume(0.1f);
                    LegendAndroidGame.exodusChTen.setVolume(0.1f);

                    LegendAndroidGame.exodusChEleven.setVolume(0.1f);
                    LegendAndroidGame.exodusChTwelve.setVolume(0.1f);
                    LegendAndroidGame.exodusChThirteen.setVolume(0.1f);
                    LegendAndroidGame.exodusChFourteen.setVolume(0.1f);
                    LegendAndroidGame.exodusChFifteen.setVolume(0.1f);
                    LegendAndroidGame.exodusChSixteen.setVolume(0.1f);
                    LegendAndroidGame.exodusChSeventeen.setVolume(0.1f);
                    LegendAndroidGame.exodusChEighteen.setVolume(0.1f);
                    LegendAndroidGame.exodusChNineteen.setVolume(0.1f);
                    LegendAndroidGame.exodusChTwenty.setVolume(0.1f);

                    LegendAndroidGame.exodusChTwentyOne.setVolume(0.1f);
                    LegendAndroidGame.exodusChTwentyTwo.setVolume(0.1f);
                    LegendAndroidGame.exodusChTwentyThree.setVolume(0.1f);
                    LegendAndroidGame.exodusChTwentyFour.setVolume(0.1f);
                    LegendAndroidGame.exodusChTwentyFive.setVolume(0.1f);
                    LegendAndroidGame.exodusChTwentySix.setVolume(0.1f);
                    LegendAndroidGame.exodusChTwentySeven.setVolume(0.1f);
                    LegendAndroidGame.exodusChTwentyEight.setVolume(0.1f);
                    LegendAndroidGame.exodusChTwentyNine.setVolume(0.1f);
                    LegendAndroidGame.exodusChThirty.setVolume(0.1f);

                    LegendAndroidGame.exodusChThirtyOne.setVolume(0.1f);
                    LegendAndroidGame.exodusChThirtyTwo.setVolume(0.1f);
                    LegendAndroidGame.exodusChThirtyThree.setVolume(0.1f);
                    LegendAndroidGame.exodusChThirtyFour.setVolume(0.1f);
                    LegendAndroidGame.exodusChThirtyFive.setVolume(0.1f);
                    LegendAndroidGame.exodusChThirtySix.setVolume(0.1f);
                    LegendAndroidGame.exodusChThirtySeven.setVolume(0.1f);
                    LegendAndroidGame.exodusChThirtyEight.setVolume(0.1f);
                    LegendAndroidGame.exodusChThirtyNine.setVolume(0.1f);
                    LegendAndroidGame.exodusChForty.setVolume(0.1f);

                    LegendAndroidGame.leviticusChOne.setVolume(0.1f);
                    LegendAndroidGame.leviticusChTwo.setVolume(0.1f);
                    LegendAndroidGame.leviticusChThree.setVolume(0.1f);
                    LegendAndroidGame.leviticusChFour.setVolume(0.1f);
                    LegendAndroidGame.leviticusChFive.setVolume(0.1f);
                    LegendAndroidGame.leviticusChSix.setVolume(0.1f);
                    LegendAndroidGame.leviticusChSeven.setVolume(0.1f);
                    LegendAndroidGame.leviticusChEight.setVolume(0.1f);
                    LegendAndroidGame.leviticusChNine.setVolume(0.1f);
                    LegendAndroidGame.leviticusChTen.setVolume(0.1f);

                    LegendAndroidGame.leviticusChEleven.setVolume(0.1f);
                    LegendAndroidGame.leviticusChTwelve.setVolume(0.1f);
                    LegendAndroidGame.leviticusChThirteen.setVolume(0.1f);
                    LegendAndroidGame.leviticusChFourteen.setVolume(0.1f);
                    LegendAndroidGame.leviticusChFifteen.setVolume(0.1f);
                    LegendAndroidGame.leviticusChSixteen.setVolume(0.1f);
                    LegendAndroidGame.leviticusChSeventeen.setVolume(0.1f);
                    LegendAndroidGame.leviticusChEighteen.setVolume(0.1f);
                    LegendAndroidGame.leviticusChNineteen.setVolume(0.1f);
                    LegendAndroidGame.leviticusChTwenty.setVolume(0.1f);

                    LegendAndroidGame.leviticusChTwentyOne.setVolume(0.1f);
                    LegendAndroidGame.leviticusChTwentyTwo.setVolume(0.1f);
                    LegendAndroidGame.leviticusChTwentyThree.setVolume(0.1f);
                    LegendAndroidGame.leviticusChTwentyFour.setVolume(0.1f);
                    LegendAndroidGame.leviticusChTwentyFive.setVolume(0.1f);
                    LegendAndroidGame.leviticusChTwentySix.setVolume(0.1f);
                    LegendAndroidGame.leviticusChTwentySeven.setVolume(0.1f);

                    LegendAndroidGame.numbersChOne.setVolume(0.1f);
                    LegendAndroidGame.numbersChTwo.setVolume(0.1f);
                    LegendAndroidGame.numbersChThree.setVolume(0.1f);
                    LegendAndroidGame.numbersChFour.setVolume(0.1f);
                    LegendAndroidGame.numbersChFive.setVolume(0.1f);
                    LegendAndroidGame.numbersChSix.setVolume(0.1f);
                    LegendAndroidGame.numbersChSeven.setVolume(0.1f);
                    LegendAndroidGame.numbersChEight.setVolume(0.1f);
                    LegendAndroidGame.numbersChNine.setVolume(0.1f);
                    LegendAndroidGame.numbersChTen.setVolume(0.1f);

                    LegendAndroidGame.numbersChEleven.setVolume(0.1f);
                    LegendAndroidGame.numbersChTwelve.setVolume(0.1f);
                    LegendAndroidGame.numbersChThirteen.setVolume(0.1f);
                    LegendAndroidGame.numbersChFourteen.setVolume(0.1f);
                    LegendAndroidGame.numbersChFifteen.setVolume(0.1f);
                    LegendAndroidGame.numbersChSixteen.setVolume(0.1f);
                    LegendAndroidGame.numbersChSeventeen.setVolume(0.1f);
                    LegendAndroidGame.numbersChEighteen.setVolume(0.1f);
                    LegendAndroidGame.numbersChNineteen.setVolume(0.1f);
                    LegendAndroidGame.numbersChTwenty.setVolume(0.1f);

                    LegendAndroidGame.numbersChTwentyOne.setVolume(0.1f);
                    LegendAndroidGame.numbersChTwentyTwo.setVolume(0.1f);
                    LegendAndroidGame.numbersChTwentyThree.setVolume(0.1f);
                    LegendAndroidGame.numbersChTwentyFour.setVolume(0.1f);
                    LegendAndroidGame.numbersChTwentyFive.setVolume(0.1f);
                    LegendAndroidGame.numbersChTwentySix.setVolume(0.1f);
                    LegendAndroidGame.numbersChTwentySeven.setVolume(0.1f);
                    LegendAndroidGame.numbersChTwentyEight.setVolume(0.1f);
                    LegendAndroidGame.numbersChTwentyNine.setVolume(0.1f);
                    LegendAndroidGame.numbersChThirty.setVolume(0.1f);

                    LegendAndroidGame.numbersChThirtyOne.setVolume(0.1f);
                    LegendAndroidGame.numbersChThirtyTwo.setVolume(0.1f);
                    LegendAndroidGame.numbersChThirtyThree.setVolume(0.1f);
                    LegendAndroidGame.numbersChThirtyFour.setVolume(0.1f);
                    LegendAndroidGame.numbersChThirtyFive.setVolume(0.1f);
                    LegendAndroidGame.numbersChThirtySix.setVolume(0.1f);


                    LegendAndroidGame.deuteronomyChOne.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTwo.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChThree.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChFour.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChFive.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChSix.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChSeven.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChEight.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChNine.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTen.setVolume(0.1f);

                    LegendAndroidGame.deuteronomyChEleven.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTwelve.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChThirteen.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChFourteen.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChFifteen.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChSixteen.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChSeventeen.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChEighteen.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChNineteen.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTwenty.setVolume(0.1f);

                    LegendAndroidGame.deuteronomyChTwentyOne.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTwentyTwo.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTwentyThree.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTwentyFour.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTwentyFive.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTwentySix.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTwentySeven.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTwentyEight.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChTwentyNine.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChThirty.setVolume(0.1f);

                    LegendAndroidGame.deuteronomyChThirtyOne.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChThirtyTwo.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChThirtyThree.setVolume(0.1f);
                    LegendAndroidGame.deuteronomyChThirtyFour.setVolume(0.1f);

                    LegendAndroidGame.joshuaChOne.setVolume(0.1f);
                    LegendAndroidGame.joshuaChTwo.setVolume(0.1f);
                    LegendAndroidGame.joshuaChThree.setVolume(0.1f);
                    LegendAndroidGame.joshuaChFour.setVolume(0.1f);
                    LegendAndroidGame.joshuaChFive.setVolume(0.1f);
                    LegendAndroidGame.joshuaChSix.setVolume(0.1f);
                    LegendAndroidGame.joshuaChSeven.setVolume(0.1f);
                    LegendAndroidGame.joshuaChEight.setVolume(0.1f);
                    LegendAndroidGame.joshuaChNine.setVolume(0.1f);
                    LegendAndroidGame.joshuaChTen.setVolume(0.1f);

                    LegendAndroidGame.joshuaChEleven.setVolume(0.1f);
                    LegendAndroidGame.joshuaChTwelve.setVolume(0.1f);
                    LegendAndroidGame.joshuaChThirteen.setVolume(0.1f);
                    LegendAndroidGame.joshuaChFourteen.setVolume(0.1f);
                    LegendAndroidGame.joshuaChFifteen.setVolume(0.1f);
                    LegendAndroidGame.joshuaChSixteen.setVolume(0.1f);
                    LegendAndroidGame.joshuaChSeventeen.setVolume(0.1f);
                    LegendAndroidGame.joshuaChEighteen.setVolume(0.1f);
                    LegendAndroidGame.joshuaChNineteen.setVolume(0.1f);
                    LegendAndroidGame.joshuaChTwenty.setVolume(0.1f);

                    LegendAndroidGame.joshuaChTwentyOne.setVolume(0.1f);
                    LegendAndroidGame.joshuaChTwentyTwo.setVolume(0.1f);
                    LegendAndroidGame.joshuaChTwentyThree.setVolume(0.1f);
                    LegendAndroidGame.joshuaChTwentyFour.setVolume(0.1f);

                }
                else if (voiceSlider.getValue() == 4){

                    LegendAndroidGame.genesisChOne.setVolume(2);
                    LegendAndroidGame.genesisChTwo.setVolume(0.2f);
                    LegendAndroidGame.genesisChThree.setVolume(0.2f);
                    LegendAndroidGame.genesisChFour.setVolume(0.2f);
                    LegendAndroidGame.genesisChFive.setVolume(0.2f);
                    LegendAndroidGame.genesisChSix.setVolume(0.2f);
                    LegendAndroidGame.genesisChSeven.setVolume(0.2f);
                    LegendAndroidGame.genesisChEight.setVolume(0.2f);
                    LegendAndroidGame.genesisChNine.setVolume(0.2f);
                    LegendAndroidGame.genesisChTen.setVolume(0.2f);
                    LegendAndroidGame.genesisChEleven.setVolume(0.2f);
                    LegendAndroidGame.genesisChTwelve.setVolume(0.2f);
                    LegendAndroidGame.genesisChThirteen.setVolume(0.2f);
                    LegendAndroidGame.genesisChFourteen.setVolume(0.2f);
                    LegendAndroidGame.genesisChFifteen.setVolume(0.2f);
                    LegendAndroidGame.genesisChSixteen.setVolume(0.2f);
                    LegendAndroidGame.genesisChSeventeen.setVolume(0.2f);
                    LegendAndroidGame.genesisChEighteen.setVolume(0.2f);
                    LegendAndroidGame.genesisChNineteen.setVolume(0.2f);
                    LegendAndroidGame.genesisChTwenty.setVolume(0.2f);

                    LegendAndroidGame.genesisChTwentyOne.setVolume(0.2f);
                    LegendAndroidGame.genesisChTwentyTwo.setVolume(0.2f);
                    LegendAndroidGame.genesisChTwentyThree.setVolume(0.2f);
                    LegendAndroidGame.genesisChTwentyFour.setVolume(0.2f);
                    LegendAndroidGame.genesisChTwentyFive.setVolume(0.2f);
                    LegendAndroidGame.genesisChTwentySix.setVolume(0.2f);
                    LegendAndroidGame.genesisChTwentySeven.setVolume(0.2f);
                    LegendAndroidGame.genesisChTwentyEight.setVolume(0.2f);
                    LegendAndroidGame.genesisChTwentyNine.setVolume(0.2f);
                    LegendAndroidGame.genesisChThirtyOne.setVolume(0.2f);
                    LegendAndroidGame.genesisChThirtyTwo.setVolume(0.2f);
                    LegendAndroidGame.genesisChThirtyThree.setVolume(0.2f);
                    LegendAndroidGame.genesisChThirtyFour.setVolume(0.2f);
                    LegendAndroidGame.genesisChThirtyFive.setVolume(0.2f);
                    LegendAndroidGame.genesisChThirtySix.setVolume(0.2f);
                    LegendAndroidGame.genesisChThirtySeven.setVolume(0.2f);
                    LegendAndroidGame.genesisChThirtyEight.setVolume(0.2f);
                    LegendAndroidGame.genesisChThirtyNine.setVolume(0.2f);
                    LegendAndroidGame.genesisChForty.setVolume(0.2f);

                    LegendAndroidGame.genesisChFortyOne.setVolume(0.2f);
                    LegendAndroidGame.genesisChFortyTwo.setVolume(0.2f);
                    LegendAndroidGame.genesisChFortyThree.setVolume(0.2f);
                    LegendAndroidGame.genesisChFortyFour.setVolume(0.2f);
                    LegendAndroidGame.genesisChFortyFive.setVolume(0.2f);
                    LegendAndroidGame.genesisChFortySix.setVolume(0.2f);
                    LegendAndroidGame.genesisChFortySeven.setVolume(0.2f);
                    LegendAndroidGame.genesisChFortyEight.setVolume(0.2f);
                    LegendAndroidGame.genesisChFortyNine.setVolume(0.2f);
                    LegendAndroidGame.genesisChFifty.setVolume(0.2f);

                    LegendAndroidGame.exodusChOne.setVolume(0.2f);
                    LegendAndroidGame.exodusChTwo.setVolume(0.2f);
                    LegendAndroidGame.exodusChThree.setVolume(0.2f);
                    LegendAndroidGame.exodusChFour.setVolume(0.2f);
                    LegendAndroidGame.exodusChFive.setVolume(0.2f);
                    LegendAndroidGame.exodusChSix.setVolume(0.2f);
                    LegendAndroidGame.exodusChSeven.setVolume(0.2f);
                    LegendAndroidGame.exodusChEight.setVolume(0.2f);
                    LegendAndroidGame.exodusChNine.setVolume(0.2f);
                    LegendAndroidGame.exodusChTen.setVolume(0.2f);

                    LegendAndroidGame.exodusChEleven.setVolume(0.2f);
                    LegendAndroidGame.exodusChTwelve.setVolume(0.2f);
                    LegendAndroidGame.exodusChThirteen.setVolume(0.2f);
                    LegendAndroidGame.exodusChFourteen.setVolume(0.2f);
                    LegendAndroidGame.exodusChFifteen.setVolume(0.2f);
                    LegendAndroidGame.exodusChSixteen.setVolume(0.2f);
                    LegendAndroidGame.exodusChSeventeen.setVolume(0.2f);
                    LegendAndroidGame.exodusChEighteen.setVolume(0.2f);
                    LegendAndroidGame.exodusChNineteen.setVolume(0.2f);
                    LegendAndroidGame.exodusChTwenty.setVolume(0.2f);

                    LegendAndroidGame.exodusChTwentyOne.setVolume(0.2f);
                    LegendAndroidGame.exodusChTwentyTwo.setVolume(0.2f);
                    LegendAndroidGame.exodusChTwentyThree.setVolume(0.2f);
                    LegendAndroidGame.exodusChTwentyFour.setVolume(0.2f);
                    LegendAndroidGame.exodusChTwentyFive.setVolume(0.2f);
                    LegendAndroidGame.exodusChTwentySix.setVolume(0.2f);
                    LegendAndroidGame.exodusChTwentySeven.setVolume(0.2f);
                    LegendAndroidGame.exodusChTwentyEight.setVolume(0.2f);
                    LegendAndroidGame.exodusChTwentyNine.setVolume(0.2f);
                    LegendAndroidGame.exodusChThirty.setVolume(0.2f);

                    LegendAndroidGame.exodusChThirtyOne.setVolume(0.2f);
                    LegendAndroidGame.exodusChThirtyTwo.setVolume(0.2f);
                    LegendAndroidGame.exodusChThirtyThree.setVolume(0.2f);
                    LegendAndroidGame.exodusChThirtyFour.setVolume(0.2f);
                    LegendAndroidGame.exodusChThirtyFive.setVolume(0.2f);
                    LegendAndroidGame.exodusChThirtySix.setVolume(0.2f);
                    LegendAndroidGame.exodusChThirtySeven.setVolume(0.2f);
                    LegendAndroidGame.exodusChThirtyEight.setVolume(0.2f);
                    LegendAndroidGame.exodusChThirtyNine.setVolume(0.2f);
                    LegendAndroidGame.exodusChForty.setVolume(0.2f);

                    LegendAndroidGame.leviticusChOne.setVolume(0.2f);
                    LegendAndroidGame.leviticusChTwo.setVolume(0.2f);
                    LegendAndroidGame.leviticusChThree.setVolume(0.2f);
                    LegendAndroidGame.leviticusChFour.setVolume(0.2f);
                    LegendAndroidGame.leviticusChFive.setVolume(0.2f);
                    LegendAndroidGame.leviticusChSix.setVolume(0.2f);
                    LegendAndroidGame.leviticusChSeven.setVolume(0.2f);
                    LegendAndroidGame.leviticusChEight.setVolume(0.2f);
                    LegendAndroidGame.leviticusChNine.setVolume(0.2f);
                    LegendAndroidGame.leviticusChTen.setVolume(0.2f);

                    LegendAndroidGame.leviticusChEleven.setVolume(0.2f);
                    LegendAndroidGame.leviticusChTwelve.setVolume(0.2f);
                    LegendAndroidGame.leviticusChThirteen.setVolume(0.2f);
                    LegendAndroidGame.leviticusChFourteen.setVolume(0.2f);
                    LegendAndroidGame.leviticusChFifteen.setVolume(0.2f);
                    LegendAndroidGame.leviticusChSixteen.setVolume(0.2f);
                    LegendAndroidGame.leviticusChSeventeen.setVolume(0.2f);
                    LegendAndroidGame.leviticusChEighteen.setVolume(0.2f);
                    LegendAndroidGame.leviticusChNineteen.setVolume(0.2f);
                    LegendAndroidGame.leviticusChTwenty.setVolume(0.2f);

                    LegendAndroidGame.leviticusChTwentyOne.setVolume(0.2f);
                    LegendAndroidGame.leviticusChTwentyTwo.setVolume(0.2f);
                    LegendAndroidGame.leviticusChTwentyThree.setVolume(0.2f);
                    LegendAndroidGame.leviticusChTwentyFour.setVolume(0.2f);
                    LegendAndroidGame.leviticusChTwentyFive.setVolume(0.2f);
                    LegendAndroidGame.leviticusChTwentySix.setVolume(0.2f);
                    LegendAndroidGame.leviticusChTwentySeven.setVolume(0.2f);

                    LegendAndroidGame.numbersChOne.setVolume(0.2f);
                    LegendAndroidGame.numbersChTwo.setVolume(0.2f);
                    LegendAndroidGame.numbersChThree.setVolume(0.2f);
                    LegendAndroidGame.numbersChFour.setVolume(0.2f);
                    LegendAndroidGame.numbersChFive.setVolume(0.2f);
                    LegendAndroidGame.numbersChSix.setVolume(0.2f);
                    LegendAndroidGame.numbersChSeven.setVolume(0.2f);
                    LegendAndroidGame.numbersChEight.setVolume(0.2f);
                    LegendAndroidGame.numbersChNine.setVolume(0.2f);
                    LegendAndroidGame.numbersChTen.setVolume(0.2f);

                    LegendAndroidGame.numbersChEleven.setVolume(0.2f);
                    LegendAndroidGame.numbersChTwelve.setVolume(0.2f);
                    LegendAndroidGame.numbersChThirteen.setVolume(0.2f);
                    LegendAndroidGame.numbersChFourteen.setVolume(0.2f);
                    LegendAndroidGame.numbersChFifteen.setVolume(0.2f);
                    LegendAndroidGame.numbersChSixteen.setVolume(0.2f);
                    LegendAndroidGame.numbersChSeventeen.setVolume(0.2f);
                    LegendAndroidGame.numbersChEighteen.setVolume(0.2f);
                    LegendAndroidGame.numbersChNineteen.setVolume(0.2f);
                    LegendAndroidGame.numbersChTwenty.setVolume(0.2f);

                    LegendAndroidGame.numbersChTwentyOne.setVolume(0.2f);
                    LegendAndroidGame.numbersChTwentyTwo.setVolume(0.2f);
                    LegendAndroidGame.numbersChTwentyThree.setVolume(0.2f);
                    LegendAndroidGame.numbersChTwentyFour.setVolume(0.2f);
                    LegendAndroidGame.numbersChTwentyFive.setVolume(0.2f);
                    LegendAndroidGame.numbersChTwentySix.setVolume(0.2f);
                    LegendAndroidGame.numbersChTwentySeven.setVolume(0.2f);
                    LegendAndroidGame.numbersChTwentyEight.setVolume(0.2f);
                    LegendAndroidGame.numbersChTwentyNine.setVolume(0.2f);
                    LegendAndroidGame.numbersChThirty.setVolume(0.2f);

                    LegendAndroidGame.numbersChThirtyOne.setVolume(0.2f);
                    LegendAndroidGame.numbersChThirtyTwo.setVolume(0.2f);
                    LegendAndroidGame.numbersChThirtyThree.setVolume(0.2f);
                    LegendAndroidGame.numbersChThirtyFour.setVolume(0.2f);
                    LegendAndroidGame.numbersChThirtyFive.setVolume(0.2f);
                    LegendAndroidGame.numbersChThirtySix.setVolume(0.2f);

                    LegendAndroidGame.deuteronomyChOne.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTwo.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChThree.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChFour.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChFive.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChSix.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChSeven.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChEight.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChNine.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTen.setVolume(0.2f);

                    LegendAndroidGame.deuteronomyChEleven.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTwelve.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChThirteen.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChFourteen.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChFifteen.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChSixteen.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChSeventeen.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChEighteen.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChNineteen.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTwenty.setVolume(0.2f);

                    LegendAndroidGame.deuteronomyChTwentyOne.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTwentyTwo.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTwentyThree.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTwentyFour.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTwentyFive.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTwentySix.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTwentySeven.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTwentyEight.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChTwentyNine.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChThirty.setVolume(0.2f);

                    LegendAndroidGame.deuteronomyChThirtyOne.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChThirtyTwo.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChThirtyThree.setVolume(0.2f);
                    LegendAndroidGame.deuteronomyChThirtyFour.setVolume(0.2f);

                    LegendAndroidGame.joshuaChOne.setVolume(0.2f);
                    LegendAndroidGame.joshuaChTwo.setVolume(0.2f);
                    LegendAndroidGame.joshuaChThree.setVolume(0.2f);
                    LegendAndroidGame.joshuaChFour.setVolume(0.2f);
                    LegendAndroidGame.joshuaChFive.setVolume(0.2f);
                    LegendAndroidGame.joshuaChSix.setVolume(0.2f);
                    LegendAndroidGame.joshuaChSeven.setVolume(0.2f);
                    LegendAndroidGame.joshuaChEight.setVolume(0.2f);
                    LegendAndroidGame.joshuaChNine.setVolume(0.2f);
                    LegendAndroidGame.joshuaChTen.setVolume(0.2f);

                    LegendAndroidGame.joshuaChEleven.setVolume(0.2f);
                    LegendAndroidGame.joshuaChTwelve.setVolume(0.2f);
                    LegendAndroidGame.joshuaChThirteen.setVolume(0.2f);
                    LegendAndroidGame.joshuaChFourteen.setVolume(0.2f);
                    LegendAndroidGame.joshuaChFifteen.setVolume(0.2f);
                    LegendAndroidGame.joshuaChSixteen.setVolume(0.2f);
                    LegendAndroidGame.joshuaChSeventeen.setVolume(0.2f);
                    LegendAndroidGame.joshuaChEighteen.setVolume(0.2f);
                    LegendAndroidGame.joshuaChNineteen.setVolume(0.2f);
                    LegendAndroidGame.joshuaChTwenty.setVolume(0.2f);

                    LegendAndroidGame.joshuaChTwentyOne.setVolume(0.2f);
                    LegendAndroidGame.joshuaChTwentyTwo.setVolume(0.2f);
                    LegendAndroidGame.joshuaChTwentyThree.setVolume(0.2f);
                    LegendAndroidGame.joshuaChTwentyFour.setVolume(0.2f);

                }
                else if (voiceSlider.getValue() == 6){

                    LegendAndroidGame.genesisChOne.setVolume(0.3f);
                    LegendAndroidGame.genesisChTwo.setVolume(0.3f);
                    LegendAndroidGame.genesisChThree.setVolume(0.3f);
                    LegendAndroidGame.genesisChFour.setVolume(0.3f);
                    LegendAndroidGame.genesisChFive.setVolume(0.3f);
                    LegendAndroidGame.genesisChSix.setVolume(0.3f);
                    LegendAndroidGame.genesisChSeven.setVolume(0.3f);
                    LegendAndroidGame.genesisChEight.setVolume(0.3f);
                    LegendAndroidGame.genesisChNine.setVolume(0.3f);
                    LegendAndroidGame.genesisChTen.setVolume(0.3f);
                    LegendAndroidGame.genesisChEleven.setVolume(0.3f);
                    LegendAndroidGame.genesisChTwelve.setVolume(0.3f);
                    LegendAndroidGame.genesisChThirteen.setVolume(0.3f);
                    LegendAndroidGame.genesisChFourteen.setVolume(0.3f);
                    LegendAndroidGame.genesisChFifteen.setVolume(0.3f);
                    LegendAndroidGame.genesisChSixteen.setVolume(0.3f);
                    LegendAndroidGame.genesisChSeventeen.setVolume(0.3f);
                    LegendAndroidGame.genesisChEighteen.setVolume(0.3f);
                    LegendAndroidGame.genesisChNineteen.setVolume(0.3f);
                    LegendAndroidGame.genesisChTwenty.setVolume(0.3f);

                    LegendAndroidGame.genesisChTwentyOne.setVolume(0.3f);
                    LegendAndroidGame.genesisChTwentyTwo.setVolume(0.3f);
                    LegendAndroidGame.genesisChTwentyThree.setVolume(0.3f);
                    LegendAndroidGame.genesisChTwentyFour.setVolume(0.3f);
                    LegendAndroidGame.genesisChTwentyFive.setVolume(0.3f);
                    LegendAndroidGame.genesisChTwentySix.setVolume(0.3f);
                    LegendAndroidGame.genesisChTwentySeven.setVolume(0.3f);
                    LegendAndroidGame.genesisChTwentyEight.setVolume(0.3f);
                    LegendAndroidGame.genesisChTwentyNine.setVolume(0.3f);
                    LegendAndroidGame.genesisChThirtyOne.setVolume(0.3f);
                    LegendAndroidGame.genesisChThirtyTwo.setVolume(0.3f);
                    LegendAndroidGame.genesisChThirtyThree.setVolume(0.3f);
                    LegendAndroidGame.genesisChThirtyFour.setVolume(0.3f);
                    LegendAndroidGame.genesisChThirtyFive.setVolume(0.3f);
                    LegendAndroidGame.genesisChThirtySix.setVolume(0.3f);
                    LegendAndroidGame.genesisChThirtySeven.setVolume(0.3f);
                    LegendAndroidGame.genesisChThirtyEight.setVolume(0.3f);
                    LegendAndroidGame.genesisChThirtyNine.setVolume(0.3f);
                    LegendAndroidGame.genesisChForty.setVolume(0.3f);

                    LegendAndroidGame.genesisChFortyOne.setVolume(0.3f);
                    LegendAndroidGame.genesisChFortyTwo.setVolume(0.3f);
                    LegendAndroidGame.genesisChFortyThree.setVolume(0.3f);
                    LegendAndroidGame.genesisChFortyFour.setVolume(0.3f);
                    LegendAndroidGame.genesisChFortyFive.setVolume(0.3f);
                    LegendAndroidGame.genesisChFortySix.setVolume(0.3f);
                    LegendAndroidGame.genesisChFortySeven.setVolume(0.3f);
                    LegendAndroidGame.genesisChFortyEight.setVolume(0.3f);
                    LegendAndroidGame.genesisChFortyNine.setVolume(0.3f);
                    LegendAndroidGame.genesisChFifty.setVolume(0.3f);

                    LegendAndroidGame.exodusChOne.setVolume(0.3f);
                    LegendAndroidGame.exodusChTwo.setVolume(0.3f);
                    LegendAndroidGame.exodusChThree.setVolume(0.3f);
                    LegendAndroidGame.exodusChFour.setVolume(0.3f);
                    LegendAndroidGame.exodusChFive.setVolume(0.3f);
                    LegendAndroidGame.exodusChSix.setVolume(0.3f);
                    LegendAndroidGame.exodusChSeven.setVolume(0.3f);
                    LegendAndroidGame.exodusChEight.setVolume(0.3f);
                    LegendAndroidGame.exodusChNine.setVolume(0.3f);
                    LegendAndroidGame.exodusChTen.setVolume(0.3f);

                    LegendAndroidGame.exodusChEleven.setVolume(0.3f);
                    LegendAndroidGame.exodusChTwelve.setVolume(0.3f);
                    LegendAndroidGame.exodusChThirteen.setVolume(0.3f);
                    LegendAndroidGame.exodusChFourteen.setVolume(0.3f);
                    LegendAndroidGame.exodusChFifteen.setVolume(0.3f);
                    LegendAndroidGame.exodusChSixteen.setVolume(0.3f);
                    LegendAndroidGame.exodusChSeventeen.setVolume(0.3f);
                    LegendAndroidGame.exodusChEighteen.setVolume(0.3f);
                    LegendAndroidGame.exodusChNineteen.setVolume(0.3f);
                    LegendAndroidGame.exodusChTwenty.setVolume(0.3f);

                    LegendAndroidGame.exodusChTwentyOne.setVolume(0.3f);
                    LegendAndroidGame.exodusChTwentyTwo.setVolume(0.3f);
                    LegendAndroidGame.exodusChTwentyThree.setVolume(0.3f);
                    LegendAndroidGame.exodusChTwentyFour.setVolume(0.3f);
                    LegendAndroidGame.exodusChTwentyFive.setVolume(0.3f);
                    LegendAndroidGame.exodusChTwentySix.setVolume(0.3f);
                    LegendAndroidGame.exodusChTwentySeven.setVolume(0.3f);
                    LegendAndroidGame.exodusChTwentyEight.setVolume(0.3f);
                    LegendAndroidGame.exodusChTwentyNine.setVolume(0.3f);
                    LegendAndroidGame.exodusChThirty.setVolume(0.3f);

                    LegendAndroidGame.exodusChThirtyOne.setVolume(0.3f);
                    LegendAndroidGame.exodusChThirtyTwo.setVolume(0.3f);
                    LegendAndroidGame.exodusChThirtyThree.setVolume(0.3f);
                    LegendAndroidGame.exodusChThirtyFour.setVolume(0.3f);
                    LegendAndroidGame.exodusChThirtyFive.setVolume(0.3f);
                    LegendAndroidGame.exodusChThirtySix.setVolume(0.3f);
                    LegendAndroidGame.exodusChThirtySeven.setVolume(0.3f);
                    LegendAndroidGame.exodusChThirtyEight.setVolume(0.3f);
                    LegendAndroidGame.exodusChThirtyNine.setVolume(0.3f);
                    LegendAndroidGame.exodusChForty.setVolume(0.3f);

                    LegendAndroidGame.leviticusChOne.setVolume(0.3f);
                    LegendAndroidGame.leviticusChTwo.setVolume(0.3f);
                    LegendAndroidGame.leviticusChThree.setVolume(0.3f);
                    LegendAndroidGame.leviticusChFour.setVolume(0.3f);
                    LegendAndroidGame.leviticusChFive.setVolume(0.3f);
                    LegendAndroidGame.leviticusChSix.setVolume(0.3f);
                    LegendAndroidGame.leviticusChSeven.setVolume(0.3f);
                    LegendAndroidGame.leviticusChEight.setVolume(0.3f);
                    LegendAndroidGame.leviticusChNine.setVolume(0.3f);
                    LegendAndroidGame.leviticusChTen.setVolume(0.3f);

                    LegendAndroidGame.leviticusChEleven.setVolume(0.3f);
                    LegendAndroidGame.leviticusChTwelve.setVolume(0.3f);
                    LegendAndroidGame.leviticusChThirteen.setVolume(0.3f);
                    LegendAndroidGame.leviticusChFourteen.setVolume(0.3f);
                    LegendAndroidGame.leviticusChFifteen.setVolume(0.3f);
                    LegendAndroidGame.leviticusChSixteen.setVolume(0.3f);
                    LegendAndroidGame.leviticusChSeventeen.setVolume(0.3f);
                    LegendAndroidGame.leviticusChEighteen.setVolume(0.3f);
                    LegendAndroidGame.leviticusChNineteen.setVolume(0.3f);
                    LegendAndroidGame.leviticusChTwenty.setVolume(0.3f);

                    LegendAndroidGame.leviticusChTwentyOne.setVolume(0.3f);
                    LegendAndroidGame.leviticusChTwentyTwo.setVolume(0.3f);
                    LegendAndroidGame.leviticusChTwentyThree.setVolume(0.3f);
                    LegendAndroidGame.leviticusChTwentyFour.setVolume(0.3f);
                    LegendAndroidGame.leviticusChTwentyFive.setVolume(0.3f);
                    LegendAndroidGame.leviticusChTwentySix.setVolume(0.3f);
                    LegendAndroidGame.leviticusChTwentySeven.setVolume(0.3f);

                    LegendAndroidGame.numbersChOne.setVolume(0.3f);
                    LegendAndroidGame.numbersChTwo.setVolume(0.3f);
                    LegendAndroidGame.numbersChThree.setVolume(0.3f);
                    LegendAndroidGame.numbersChFour.setVolume(0.3f);
                    LegendAndroidGame.numbersChFive.setVolume(0.3f);
                    LegendAndroidGame.numbersChSix.setVolume(0.3f);
                    LegendAndroidGame.numbersChSeven.setVolume(0.3f);
                    LegendAndroidGame.numbersChEight.setVolume(0.3f);
                    LegendAndroidGame.numbersChNine.setVolume(0.3f);
                    LegendAndroidGame.numbersChTen.setVolume(0.3f);

                    LegendAndroidGame.numbersChEleven.setVolume(0.3f);
                    LegendAndroidGame.numbersChTwelve.setVolume(0.3f);
                    LegendAndroidGame.numbersChThirteen.setVolume(0.3f);
                    LegendAndroidGame.numbersChFourteen.setVolume(0.3f);
                    LegendAndroidGame.numbersChFifteen.setVolume(0.3f);
                    LegendAndroidGame.numbersChSixteen.setVolume(0.3f);
                    LegendAndroidGame.numbersChSeventeen.setVolume(0.3f);
                    LegendAndroidGame.numbersChEighteen.setVolume(0.3f);
                    LegendAndroidGame.numbersChNineteen.setVolume(0.3f);
                    LegendAndroidGame.numbersChTwenty.setVolume(0.3f);

                    LegendAndroidGame.numbersChTwentyOne.setVolume(0.3f);
                    LegendAndroidGame.numbersChTwentyTwo.setVolume(0.3f);
                    LegendAndroidGame.numbersChTwentyThree.setVolume(0.3f);
                    LegendAndroidGame.numbersChTwentyFour.setVolume(0.3f);
                    LegendAndroidGame.numbersChTwentyFive.setVolume(0.3f);
                    LegendAndroidGame.numbersChTwentySix.setVolume(0.3f);
                    LegendAndroidGame.numbersChTwentySeven.setVolume(0.3f);
                    LegendAndroidGame.numbersChTwentyEight.setVolume(0.3f);
                    LegendAndroidGame.numbersChTwentyNine.setVolume(0.3f);
                    LegendAndroidGame.numbersChThirty.setVolume(0.3f);

                    LegendAndroidGame.numbersChThirtyOne.setVolume(0.3f);
                    LegendAndroidGame.numbersChThirtyTwo.setVolume(0.3f);
                    LegendAndroidGame.numbersChThirtyThree.setVolume(0.3f);
                    LegendAndroidGame.numbersChThirtyFour.setVolume(0.3f);
                    LegendAndroidGame.numbersChThirtyFive.setVolume(0.3f);
                    LegendAndroidGame.numbersChThirtySix.setVolume(0.3f);

                    LegendAndroidGame.deuteronomyChOne.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTwo.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChThree.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChFour.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChFive.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChSix.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChSeven.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChEight.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChNine.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTen.setVolume(0.3f);

                    LegendAndroidGame.deuteronomyChEleven.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTwelve.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChThirteen.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChFourteen.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChFifteen.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChSixteen.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChSeventeen.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChEighteen.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChNineteen.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTwenty.setVolume(0.3f);

                    LegendAndroidGame.deuteronomyChTwentyOne.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTwentyTwo.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTwentyThree.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTwentyFour.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTwentyFive.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTwentySix.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTwentySeven.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTwentyEight.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChTwentyNine.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChThirty.setVolume(0.3f);

                    LegendAndroidGame.deuteronomyChThirtyOne.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChThirtyTwo.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChThirtyThree.setVolume(0.3f);
                    LegendAndroidGame.deuteronomyChThirtyFour.setVolume(0.3f);

                    LegendAndroidGame.joshuaChOne.setVolume(0.3f);
                    LegendAndroidGame.joshuaChTwo.setVolume(0.3f);
                    LegendAndroidGame.joshuaChThree.setVolume(0.3f);
                    LegendAndroidGame.joshuaChFour.setVolume(0.3f);
                    LegendAndroidGame.joshuaChFive.setVolume(0.3f);
                    LegendAndroidGame.joshuaChSix.setVolume(0.3f);
                    LegendAndroidGame.joshuaChSeven.setVolume(0.3f);
                    LegendAndroidGame.joshuaChEight.setVolume(0.3f);
                    LegendAndroidGame.joshuaChNine.setVolume(0.3f);
                    LegendAndroidGame.joshuaChTen.setVolume(0.3f);

                    LegendAndroidGame.joshuaChEleven.setVolume(0.3f);
                    LegendAndroidGame.joshuaChTwelve.setVolume(0.3f);
                    LegendAndroidGame.joshuaChThirteen.setVolume(0.3f);
                    LegendAndroidGame.joshuaChFourteen.setVolume(0.3f);
                    LegendAndroidGame.joshuaChFifteen.setVolume(0.3f);
                    LegendAndroidGame.joshuaChSixteen.setVolume(0.3f);
                    LegendAndroidGame.joshuaChSeventeen.setVolume(0.3f);
                    LegendAndroidGame.joshuaChEighteen.setVolume(0.3f);
                    LegendAndroidGame.joshuaChNineteen.setVolume(0.3f);
                    LegendAndroidGame.joshuaChTwenty.setVolume(0.3f);

                    LegendAndroidGame.joshuaChTwentyOne.setVolume(0.3f);
                    LegendAndroidGame.joshuaChTwentyTwo.setVolume(0.3f);
                    LegendAndroidGame.joshuaChTwentyThree.setVolume(0.3f);
                    LegendAndroidGame.joshuaChTwentyFour.setVolume(0.3f);

                }
                else if (voiceSlider.getValue() == 8){

                    LegendAndroidGame.genesisChOne.setVolume(0.4f);
                    LegendAndroidGame.genesisChTwo.setVolume(0.4f);
                    LegendAndroidGame.genesisChThree.setVolume(0.4f);
                    LegendAndroidGame.genesisChFour.setVolume(0.4f);
                    LegendAndroidGame.genesisChFive.setVolume(0.4f);
                    LegendAndroidGame.genesisChSix.setVolume(0.4f);
                    LegendAndroidGame.genesisChSeven.setVolume(0.4f);
                    LegendAndroidGame.genesisChEight.setVolume(0.4f);
                    LegendAndroidGame.genesisChNine.setVolume(0.4f);
                    LegendAndroidGame.genesisChTen.setVolume(0.4f);
                    LegendAndroidGame.genesisChEleven.setVolume(0.4f);
                    LegendAndroidGame.genesisChTwelve.setVolume(0.4f);
                    LegendAndroidGame.genesisChThirteen.setVolume(0.4f);
                    LegendAndroidGame.genesisChFourteen.setVolume(0.4f);
                    LegendAndroidGame.genesisChFifteen.setVolume(0.4f);
                    LegendAndroidGame.genesisChSixteen.setVolume(0.4f);
                    LegendAndroidGame.genesisChSeventeen.setVolume(0.4f);
                    LegendAndroidGame.genesisChEighteen.setVolume(0.4f);
                    LegendAndroidGame.genesisChNineteen.setVolume(0.4f);
                    LegendAndroidGame.genesisChTwenty.setVolume(0.4f);

                    LegendAndroidGame.genesisChTwentyOne.setVolume(0.4f);
                    LegendAndroidGame.genesisChTwentyTwo.setVolume(0.4f);
                    LegendAndroidGame.genesisChTwentyThree.setVolume(0.4f);
                    LegendAndroidGame.genesisChTwentyFour.setVolume(0.4f);
                    LegendAndroidGame.genesisChTwentyFive.setVolume(0.4f);
                    LegendAndroidGame.genesisChTwentySix.setVolume(0.4f);
                    LegendAndroidGame.genesisChTwentySeven.setVolume(0.4f);
                    LegendAndroidGame.genesisChTwentyEight.setVolume(0.4f);
                    LegendAndroidGame.genesisChTwentyNine.setVolume(0.4f);
                    LegendAndroidGame.genesisChThirtyOne.setVolume(0.4f);
                    LegendAndroidGame.genesisChThirtyTwo.setVolume(0.4f);
                    LegendAndroidGame.genesisChThirtyThree.setVolume(0.4f);
                    LegendAndroidGame.genesisChThirtyFour.setVolume(0.4f);
                    LegendAndroidGame.genesisChThirtyFive.setVolume(0.4f);
                    LegendAndroidGame.genesisChThirtySix.setVolume(0.4f);
                    LegendAndroidGame.genesisChThirtySeven.setVolume(0.4f);
                    LegendAndroidGame.genesisChThirtyEight.setVolume(0.4f);
                    LegendAndroidGame.genesisChThirtyNine.setVolume(0.4f);
                    LegendAndroidGame.genesisChForty.setVolume(0.4f);

                    LegendAndroidGame.genesisChFortyOne.setVolume(0.4f);
                    LegendAndroidGame.genesisChFortyTwo.setVolume(0.4f);
                    LegendAndroidGame.genesisChFortyThree.setVolume(0.4f);
                    LegendAndroidGame.genesisChFortyFour.setVolume(0.4f);
                    LegendAndroidGame.genesisChFortyFive.setVolume(0.4f);
                    LegendAndroidGame.genesisChFortySix.setVolume(0.4f);
                    LegendAndroidGame.genesisChFortySeven.setVolume(0.4f);
                    LegendAndroidGame.genesisChFortyEight.setVolume(0.4f);
                    LegendAndroidGame.genesisChFortyNine.setVolume(0.4f);
                    LegendAndroidGame.genesisChFifty.setVolume(0.4f);

                    LegendAndroidGame.exodusChOne.setVolume(0.4f);
                    LegendAndroidGame.exodusChTwo.setVolume(0.4f);
                    LegendAndroidGame.exodusChThree.setVolume(0.4f);
                    LegendAndroidGame.exodusChFour.setVolume(0.4f);
                    LegendAndroidGame.exodusChFive.setVolume(0.4f);
                    LegendAndroidGame.exodusChSix.setVolume(0.4f);
                    LegendAndroidGame.exodusChSeven.setVolume(0.4f);
                    LegendAndroidGame.exodusChEight.setVolume(0.4f);
                    LegendAndroidGame.exodusChNine.setVolume(0.4f);
                    LegendAndroidGame.exodusChTen.setVolume(0.4f);

                    LegendAndroidGame.exodusChEleven.setVolume(0.4f);
                    LegendAndroidGame.exodusChTwelve.setVolume(0.4f);
                    LegendAndroidGame.exodusChThirteen.setVolume(0.4f);
                    LegendAndroidGame.exodusChFourteen.setVolume(0.4f);
                    LegendAndroidGame.exodusChFifteen.setVolume(0.4f);
                    LegendAndroidGame.exodusChSixteen.setVolume(0.4f);
                    LegendAndroidGame.exodusChSeventeen.setVolume(0.4f);
                    LegendAndroidGame.exodusChEighteen.setVolume(0.4f);
                    LegendAndroidGame.exodusChNineteen.setVolume(0.4f);
                    LegendAndroidGame.exodusChTwenty.setVolume(0.4f);

                    LegendAndroidGame.exodusChTwentyOne.setVolume(0.4f);
                    LegendAndroidGame.exodusChTwentyTwo.setVolume(0.4f);
                    LegendAndroidGame.exodusChTwentyThree.setVolume(0.4f);
                    LegendAndroidGame.exodusChTwentyFour.setVolume(0.4f);
                    LegendAndroidGame.exodusChTwentyFive.setVolume(0.4f);
                    LegendAndroidGame.exodusChTwentySix.setVolume(0.4f);
                    LegendAndroidGame.exodusChTwentySeven.setVolume(0.4f);
                    LegendAndroidGame.exodusChTwentyEight.setVolume(0.4f);
                    LegendAndroidGame.exodusChTwentyNine.setVolume(0.4f);
                    LegendAndroidGame.exodusChThirty.setVolume(0.4f);

                    LegendAndroidGame.exodusChThirtyOne.setVolume(0.4f);
                    LegendAndroidGame.exodusChThirtyTwo.setVolume(0.4f);
                    LegendAndroidGame.exodusChThirtyThree.setVolume(0.4f);
                    LegendAndroidGame.exodusChThirtyFour.setVolume(0.4f);
                    LegendAndroidGame.exodusChThirtyFive.setVolume(0.4f);
                    LegendAndroidGame.exodusChThirtySix.setVolume(0.4f);
                    LegendAndroidGame.exodusChThirtySeven.setVolume(0.4f);
                    LegendAndroidGame.exodusChThirtyEight.setVolume(0.4f);
                    LegendAndroidGame.exodusChThirtyNine.setVolume(0.4f);
                    LegendAndroidGame.exodusChForty.setVolume(0.4f);

                    LegendAndroidGame.leviticusChOne.setVolume(0.4f);
                    LegendAndroidGame.leviticusChTwo.setVolume(0.4f);
                    LegendAndroidGame.leviticusChThree.setVolume(0.4f);
                    LegendAndroidGame.leviticusChFour.setVolume(0.4f);
                    LegendAndroidGame.leviticusChFive.setVolume(0.4f);
                    LegendAndroidGame.leviticusChSix.setVolume(0.4f);
                    LegendAndroidGame.leviticusChSeven.setVolume(0.4f);
                    LegendAndroidGame.leviticusChEight.setVolume(0.4f);
                    LegendAndroidGame.leviticusChNine.setVolume(0.4f);
                    LegendAndroidGame.leviticusChTen.setVolume(0.4f);

                    LegendAndroidGame.leviticusChEleven.setVolume(0.4f);
                    LegendAndroidGame.leviticusChTwelve.setVolume(0.4f);
                    LegendAndroidGame.leviticusChThirteen.setVolume(0.4f);
                    LegendAndroidGame.leviticusChFourteen.setVolume(0.4f);
                    LegendAndroidGame.leviticusChFifteen.setVolume(0.4f);
                    LegendAndroidGame.leviticusChSixteen.setVolume(0.4f);
                    LegendAndroidGame.leviticusChSeventeen.setVolume(0.4f);
                    LegendAndroidGame.leviticusChEighteen.setVolume(0.4f);
                    LegendAndroidGame.leviticusChNineteen.setVolume(0.4f);
                    LegendAndroidGame.leviticusChTwenty.setVolume(0.4f);

                    LegendAndroidGame.leviticusChTwentyOne.setVolume(0.4f);
                    LegendAndroidGame.leviticusChTwentyTwo.setVolume(0.4f);
                    LegendAndroidGame.leviticusChTwentyThree.setVolume(0.4f);
                    LegendAndroidGame.leviticusChTwentyFour.setVolume(0.4f);
                    LegendAndroidGame.leviticusChTwentyFive.setVolume(0.4f);
                    LegendAndroidGame.leviticusChTwentySix.setVolume(0.4f);
                    LegendAndroidGame.leviticusChTwentySeven.setVolume(0.4f);

                    LegendAndroidGame.numbersChOne.setVolume(0.4f);
                    LegendAndroidGame.numbersChTwo.setVolume(0.4f);
                    LegendAndroidGame.numbersChThree.setVolume(0.4f);
                    LegendAndroidGame.numbersChFour.setVolume(0.4f);
                    LegendAndroidGame.numbersChFive.setVolume(0.4f);
                    LegendAndroidGame.numbersChSix.setVolume(0.4f);
                    LegendAndroidGame.numbersChSeven.setVolume(0.4f);
                    LegendAndroidGame.numbersChEight.setVolume(0.4f);
                    LegendAndroidGame.numbersChNine.setVolume(0.4f);
                    LegendAndroidGame.numbersChTen.setVolume(0.4f);

                    LegendAndroidGame.numbersChEleven.setVolume(0.4f);
                    LegendAndroidGame.numbersChTwelve.setVolume(0.4f);
                    LegendAndroidGame.numbersChThirteen.setVolume(0.4f);
                    LegendAndroidGame.numbersChFourteen.setVolume(0.4f);
                    LegendAndroidGame.numbersChFifteen.setVolume(0.4f);
                    LegendAndroidGame.numbersChSixteen.setVolume(0.4f);
                    LegendAndroidGame.numbersChSeventeen.setVolume(0.4f);
                    LegendAndroidGame.numbersChEighteen.setVolume(0.4f);
                    LegendAndroidGame.numbersChNineteen.setVolume(0.4f);
                    LegendAndroidGame.numbersChTwenty.setVolume(0.4f);

                    LegendAndroidGame.numbersChTwentyOne.setVolume(0.4f);
                    LegendAndroidGame.numbersChTwentyTwo.setVolume(0.4f);
                    LegendAndroidGame.numbersChTwentyThree.setVolume(0.4f);
                    LegendAndroidGame.numbersChTwentyFour.setVolume(0.4f);
                    LegendAndroidGame.numbersChTwentyFive.setVolume(0.4f);
                    LegendAndroidGame.numbersChTwentySix.setVolume(0.4f);
                    LegendAndroidGame.numbersChTwentySeven.setVolume(0.4f);
                    LegendAndroidGame.numbersChTwentyEight.setVolume(0.4f);
                    LegendAndroidGame.numbersChTwentyNine.setVolume(0.4f);
                    LegendAndroidGame.numbersChThirty.setVolume(0.4f);

                    LegendAndroidGame.numbersChThirtyOne.setVolume(0.4f);
                    LegendAndroidGame.numbersChThirtyTwo.setVolume(0.4f);
                    LegendAndroidGame.numbersChThirtyThree.setVolume(0.4f);
                    LegendAndroidGame.numbersChThirtyFour.setVolume(0.4f);
                    LegendAndroidGame.numbersChThirtyFive.setVolume(0.4f);
                    LegendAndroidGame.numbersChThirtySix.setVolume(0.4f);

                    LegendAndroidGame.deuteronomyChOne.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTwo.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChThree.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChFour.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChFive.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChSix.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChSeven.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChEight.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChNine.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTen.setVolume(0.4f);

                    LegendAndroidGame.deuteronomyChEleven.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTwelve.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChThirteen.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChFourteen.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChFifteen.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChSixteen.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChSeventeen.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChEighteen.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChNineteen.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTwenty.setVolume(0.4f);

                    LegendAndroidGame.deuteronomyChTwentyOne.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTwentyTwo.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTwentyThree.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTwentyFour.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTwentyFive.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTwentySix.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTwentySeven.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTwentyEight.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChTwentyNine.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChThirty.setVolume(0.4f);

                    LegendAndroidGame.deuteronomyChThirtyOne.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChThirtyTwo.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChThirtyThree.setVolume(0.4f);
                    LegendAndroidGame.deuteronomyChThirtyFour.setVolume(0.4f);

                    LegendAndroidGame.joshuaChOne.setVolume(0.4f);
                    LegendAndroidGame.joshuaChTwo.setVolume(0.4f);
                    LegendAndroidGame.joshuaChThree.setVolume(0.4f);
                    LegendAndroidGame.joshuaChFour.setVolume(0.4f);
                    LegendAndroidGame.joshuaChFive.setVolume(0.4f);
                    LegendAndroidGame.joshuaChSix.setVolume(0.4f);
                    LegendAndroidGame.joshuaChSeven.setVolume(0.4f);
                    LegendAndroidGame.joshuaChEight.setVolume(0.4f);
                    LegendAndroidGame.joshuaChNine.setVolume(0.4f);
                    LegendAndroidGame.joshuaChTen.setVolume(0.4f);

                    LegendAndroidGame.joshuaChEleven.setVolume(0.4f);
                    LegendAndroidGame.joshuaChTwelve.setVolume(0.4f);
                    LegendAndroidGame.joshuaChThirteen.setVolume(0.4f);
                    LegendAndroidGame.joshuaChFourteen.setVolume(0.4f);
                    LegendAndroidGame.joshuaChFifteen.setVolume(0.4f);
                    LegendAndroidGame.joshuaChSixteen.setVolume(0.4f);
                    LegendAndroidGame.joshuaChSeventeen.setVolume(0.4f);
                    LegendAndroidGame.joshuaChEighteen.setVolume(0.4f);
                    LegendAndroidGame.joshuaChNineteen.setVolume(0.4f);
                    LegendAndroidGame.joshuaChTwenty.setVolume(0.4f);

                    LegendAndroidGame.joshuaChTwentyOne.setVolume(0.4f);
                    LegendAndroidGame.joshuaChTwentyTwo.setVolume(0.4f);
                    LegendAndroidGame.joshuaChTwentyThree.setVolume(0.4f);
                    LegendAndroidGame.joshuaChTwentyFour.setVolume(0.4f);
                }
                else if (voiceSlider.getValue() == 10){
                    LegendAndroidGame.joshuaChOne.setVolume(0.5f);

                    LegendAndroidGame.genesisChOne.setVolume(0.5f);
                    LegendAndroidGame.genesisChTwo.setVolume(0.5f);
                    LegendAndroidGame.genesisChThree.setVolume(0.5f);
                    LegendAndroidGame.genesisChFour.setVolume(0.5f);
                    LegendAndroidGame.genesisChFive.setVolume(0.5f);
                    LegendAndroidGame.genesisChSix.setVolume(0.5f);
                    LegendAndroidGame.genesisChSeven.setVolume(0.5f);
                    LegendAndroidGame.genesisChEight.setVolume(0.5f);
                    LegendAndroidGame.genesisChNine.setVolume(0.5f);
                    LegendAndroidGame.genesisChTen.setVolume(0.5f);
                    LegendAndroidGame.genesisChEleven.setVolume(0.5f);
                    LegendAndroidGame.genesisChTwelve.setVolume(0.5f);
                    LegendAndroidGame.genesisChThirteen.setVolume(0.5f);
                    LegendAndroidGame.genesisChFourteen.setVolume(0.5f);
                    LegendAndroidGame.genesisChFifteen.setVolume(0.5f);
                    LegendAndroidGame.genesisChSixteen.setVolume(0.5f);
                    LegendAndroidGame.genesisChSeventeen.setVolume(0.5f);
                    LegendAndroidGame.genesisChEighteen.setVolume(0.5f);
                    LegendAndroidGame.genesisChNineteen.setVolume(0.5f);
                    LegendAndroidGame.genesisChTwenty.setVolume(0.5f);

                    LegendAndroidGame.genesisChTwentyOne.setVolume(0.5f);
                    LegendAndroidGame.genesisChTwentyTwo.setVolume(0.5f);
                    LegendAndroidGame.genesisChTwentyThree.setVolume(0.5f);
                    LegendAndroidGame.genesisChTwentyFour.setVolume(0.5f);
                    LegendAndroidGame.genesisChTwentyFive.setVolume(0.5f);
                    LegendAndroidGame.genesisChTwentySix.setVolume(0.5f);
                    LegendAndroidGame.genesisChTwentySeven.setVolume(0.5f);
                    LegendAndroidGame.genesisChTwentyEight.setVolume(0.5f);
                    LegendAndroidGame.genesisChTwentyNine.setVolume(0.5f);
                    LegendAndroidGame.genesisChThirtyOne.setVolume(0.5f);
                    LegendAndroidGame.genesisChThirtyTwo.setVolume(0.5f);
                    LegendAndroidGame.genesisChThirtyThree.setVolume(0.5f);
                    LegendAndroidGame.genesisChThirtyFour.setVolume(0.5f);
                    LegendAndroidGame.genesisChThirtyFive.setVolume(0.5f);
                    LegendAndroidGame.genesisChThirtySix.setVolume(0.5f);
                    LegendAndroidGame.genesisChThirtySeven.setVolume(0.5f);
                    LegendAndroidGame.genesisChThirtyEight.setVolume(0.5f);
                    LegendAndroidGame.genesisChThirtyNine.setVolume(0.5f);
                    LegendAndroidGame.genesisChForty.setVolume(0.5f);

                    LegendAndroidGame.genesisChFortyOne.setVolume(0.5f);
                    LegendAndroidGame.genesisChFortyTwo.setVolume(0.5f);
                    LegendAndroidGame.genesisChFortyThree.setVolume(0.5f);
                    LegendAndroidGame.genesisChFortyFour.setVolume(0.5f);
                    LegendAndroidGame.genesisChFortyFive.setVolume(0.5f);
                    LegendAndroidGame.genesisChFortySix.setVolume(0.5f);
                    LegendAndroidGame.genesisChFortySeven.setVolume(0.5f);
                    LegendAndroidGame.genesisChFortyEight.setVolume(0.5f);
                    LegendAndroidGame.genesisChFortyNine.setVolume(0.5f);
                    LegendAndroidGame.genesisChFifty.setVolume(0.5f);

                    LegendAndroidGame.exodusChOne.setVolume(0.5f);
                    LegendAndroidGame.exodusChTwo.setVolume(0.5f);
                    LegendAndroidGame.exodusChThree.setVolume(0.5f);
                    LegendAndroidGame.exodusChFour.setVolume(0.5f);
                    LegendAndroidGame.exodusChFive.setVolume(0.5f);
                    LegendAndroidGame.exodusChSix.setVolume(0.5f);
                    LegendAndroidGame.exodusChSeven.setVolume(0.5f);
                    LegendAndroidGame.exodusChEight.setVolume(0.5f);
                    LegendAndroidGame.exodusChNine.setVolume(0.5f);
                    LegendAndroidGame.exodusChTen.setVolume(0.5f);

                    LegendAndroidGame.exodusChEleven.setVolume(0.5f);
                    LegendAndroidGame.exodusChTwelve.setVolume(0.5f);
                    LegendAndroidGame.exodusChThirteen.setVolume(0.5f);
                    LegendAndroidGame.exodusChFourteen.setVolume(0.5f);
                    LegendAndroidGame.exodusChFifteen.setVolume(0.5f);
                    LegendAndroidGame.exodusChSixteen.setVolume(0.5f);
                    LegendAndroidGame.exodusChSeventeen.setVolume(0.5f);
                    LegendAndroidGame.exodusChEighteen.setVolume(0.5f);
                    LegendAndroidGame.exodusChNineteen.setVolume(0.5f);
                    LegendAndroidGame.exodusChTwenty.setVolume(0.5f);

                    LegendAndroidGame.exodusChTwentyOne.setVolume(0.5f);
                    LegendAndroidGame.exodusChTwentyTwo.setVolume(0.5f);
                    LegendAndroidGame.exodusChTwentyThree.setVolume(0.5f);
                    LegendAndroidGame.exodusChTwentyFour.setVolume(0.5f);
                    LegendAndroidGame.exodusChTwentyFive.setVolume(0.5f);
                    LegendAndroidGame.exodusChTwentySix.setVolume(0.5f);
                    LegendAndroidGame.exodusChTwentySeven.setVolume(0.5f);
                    LegendAndroidGame.exodusChTwentyEight.setVolume(0.5f);
                    LegendAndroidGame.exodusChTwentyNine.setVolume(0.5f);
                    LegendAndroidGame.exodusChThirty.setVolume(0.5f);

                    LegendAndroidGame.exodusChThirtyOne.setVolume(0.5f);
                    LegendAndroidGame.exodusChThirtyTwo.setVolume(0.5f);
                    LegendAndroidGame.exodusChThirtyThree.setVolume(0.5f);
                    LegendAndroidGame.exodusChThirtyFour.setVolume(0.5f);
                    LegendAndroidGame.exodusChThirtyFive.setVolume(0.5f);
                    LegendAndroidGame.exodusChThirtySix.setVolume(0.5f);
                    LegendAndroidGame.exodusChThirtySeven.setVolume(0.5f);
                    LegendAndroidGame.exodusChThirtyEight.setVolume(0.5f);
                    LegendAndroidGame.exodusChThirtyNine.setVolume(0.5f);
                    LegendAndroidGame.exodusChForty.setVolume(0.5f);

                    LegendAndroidGame.leviticusChOne.setVolume(0.5f);
                    LegendAndroidGame.leviticusChTwo.setVolume(0.5f);
                    LegendAndroidGame.leviticusChThree.setVolume(0.5f);
                    LegendAndroidGame.leviticusChFour.setVolume(0.5f);
                    LegendAndroidGame.leviticusChFive.setVolume(0.5f);
                    LegendAndroidGame.leviticusChSix.setVolume(0.5f);
                    LegendAndroidGame.leviticusChSeven.setVolume(0.5f);
                    LegendAndroidGame.leviticusChEight.setVolume(0.5f);
                    LegendAndroidGame.leviticusChNine.setVolume(0.5f);
                    LegendAndroidGame.leviticusChTen.setVolume(0.5f);

                    LegendAndroidGame.leviticusChEleven.setVolume(0.5f);
                    LegendAndroidGame.leviticusChTwelve.setVolume(0.5f);
                    LegendAndroidGame.leviticusChThirteen.setVolume(0.5f);
                    LegendAndroidGame.leviticusChFourteen.setVolume(0.5f);
                    LegendAndroidGame.leviticusChFifteen.setVolume(0.5f);
                    LegendAndroidGame.leviticusChSixteen.setVolume(0.5f);
                    LegendAndroidGame.leviticusChSeventeen.setVolume(0.5f);
                    LegendAndroidGame.leviticusChEighteen.setVolume(0.5f);
                    LegendAndroidGame.leviticusChNineteen.setVolume(0.5f);
                    LegendAndroidGame.leviticusChTwenty.setVolume(0.5f);

                    LegendAndroidGame.leviticusChTwentyOne.setVolume(0.5f);
                    LegendAndroidGame.leviticusChTwentyTwo.setVolume(0.5f);
                    LegendAndroidGame.leviticusChTwentyThree.setVolume(0.5f);
                    LegendAndroidGame.leviticusChTwentyFour.setVolume(0.5f);
                    LegendAndroidGame.leviticusChTwentyFive.setVolume(0.5f);
                    LegendAndroidGame.leviticusChTwentySix.setVolume(0.5f);
                    LegendAndroidGame.leviticusChTwentySeven.setVolume(0.5f);

                    LegendAndroidGame.numbersChOne.setVolume(0.5f);
                    LegendAndroidGame.numbersChTwo.setVolume(0.5f);
                    LegendAndroidGame.numbersChThree.setVolume(0.5f);
                    LegendAndroidGame.numbersChFour.setVolume(0.5f);
                    LegendAndroidGame.numbersChFive.setVolume(0.5f);
                    LegendAndroidGame.numbersChSix.setVolume(0.5f);
                    LegendAndroidGame.numbersChSeven.setVolume(0.5f);
                    LegendAndroidGame.numbersChEight.setVolume(0.5f);
                    LegendAndroidGame.numbersChNine.setVolume(0.5f);
                    LegendAndroidGame.numbersChTen.setVolume(0.5f);

                    LegendAndroidGame.numbersChEleven.setVolume(0.5f);
                    LegendAndroidGame.numbersChTwelve.setVolume(0.5f);
                    LegendAndroidGame.numbersChThirteen.setVolume(0.5f);
                    LegendAndroidGame.numbersChFourteen.setVolume(0.5f);
                    LegendAndroidGame.numbersChFifteen.setVolume(0.5f);
                    LegendAndroidGame.numbersChSixteen.setVolume(0.5f);
                    LegendAndroidGame.numbersChSeventeen.setVolume(0.5f);
                    LegendAndroidGame.numbersChEighteen.setVolume(0.5f);
                    LegendAndroidGame.numbersChNineteen.setVolume(0.5f);
                    LegendAndroidGame.numbersChTwenty.setVolume(0.5f);

                    LegendAndroidGame.numbersChTwentyOne.setVolume(0.5f);
                    LegendAndroidGame.numbersChTwentyTwo.setVolume(0.5f);
                    LegendAndroidGame.numbersChTwentyThree.setVolume(0.5f);
                    LegendAndroidGame.numbersChTwentyFour.setVolume(0.5f);
                    LegendAndroidGame.numbersChTwentyFive.setVolume(0.5f);
                    LegendAndroidGame.numbersChTwentySix.setVolume(0.5f);
                    LegendAndroidGame.numbersChTwentySeven.setVolume(0.5f);
                    LegendAndroidGame.numbersChTwentyEight.setVolume(0.5f);
                    LegendAndroidGame.numbersChTwentyNine.setVolume(0.5f);
                    LegendAndroidGame.numbersChThirty.setVolume(0.5f);

                    LegendAndroidGame.numbersChThirtyOne.setVolume(0.5f);
                    LegendAndroidGame.numbersChThirtyTwo.setVolume(0.5f);
                    LegendAndroidGame.numbersChThirtyThree.setVolume(0.5f);
                    LegendAndroidGame.numbersChThirtyFour.setVolume(0.5f);
                    LegendAndroidGame.numbersChThirtyFive.setVolume(0.5f);
                    LegendAndroidGame.numbersChThirtySix.setVolume(0.5f);

                    LegendAndroidGame.deuteronomyChOne.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTwo.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChThree.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChFour.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChFive.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChSix.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChSeven.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChEight.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChNine.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTen.setVolume(0.5f);

                    LegendAndroidGame.deuteronomyChEleven.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTwelve.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChThirteen.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChFourteen.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChFifteen.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChSixteen.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChSeventeen.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChEighteen.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChNineteen.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTwenty.setVolume(0.5f);

                    LegendAndroidGame.deuteronomyChTwentyOne.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTwentyTwo.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTwentyThree.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTwentyFour.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTwentyFive.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTwentySix.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTwentySeven.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTwentyEight.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChTwentyNine.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChThirty.setVolume(0.5f);

                    LegendAndroidGame.deuteronomyChThirtyOne.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChThirtyTwo.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChThirtyThree.setVolume(0.5f);
                    LegendAndroidGame.deuteronomyChThirtyFour.setVolume(0.5f);

                    LegendAndroidGame.joshuaChOne.setVolume(0.5f);
                    LegendAndroidGame.joshuaChTwo.setVolume(0.5f);
                    LegendAndroidGame.joshuaChThree.setVolume(0.5f);
                    LegendAndroidGame.joshuaChFour.setVolume(0.5f);
                    LegendAndroidGame.joshuaChFive.setVolume(0.5f);
                    LegendAndroidGame.joshuaChSix.setVolume(0.5f);
                    LegendAndroidGame.joshuaChSeven.setVolume(0.5f);
                    LegendAndroidGame.joshuaChEight.setVolume(0.5f);
                    LegendAndroidGame.joshuaChNine.setVolume(0.5f);
                    LegendAndroidGame.joshuaChTen.setVolume(0.5f);

                    LegendAndroidGame.joshuaChEleven.setVolume(0.5f);
                    LegendAndroidGame.joshuaChTwelve.setVolume(0.5f);
                    LegendAndroidGame.joshuaChThirteen.setVolume(0.5f);
                    LegendAndroidGame.joshuaChFourteen.setVolume(0.5f);
                    LegendAndroidGame.joshuaChFifteen.setVolume(0.5f);
                    LegendAndroidGame.joshuaChSixteen.setVolume(0.5f);
                    LegendAndroidGame.joshuaChSeventeen.setVolume(0.5f);
                    LegendAndroidGame.joshuaChEighteen.setVolume(0.5f);
                    LegendAndroidGame.joshuaChNineteen.setVolume(0.5f);
                    LegendAndroidGame.joshuaChTwenty.setVolume(0.5f);

                    LegendAndroidGame.joshuaChTwentyOne.setVolume(0.5f);
                    LegendAndroidGame.joshuaChTwentyTwo.setVolume(0.5f);
                    LegendAndroidGame.joshuaChTwentyThree.setVolume(0.5f);
                    LegendAndroidGame.joshuaChTwentyFour.setVolume(0.5f);

                }
                else if (voiceSlider.getValue() == 12){

                    LegendAndroidGame.genesisChOne.setVolume(0.6f);
                    LegendAndroidGame.genesisChTwo.setVolume(0.6f);
                    LegendAndroidGame.genesisChThree.setVolume(0.6f);
                    LegendAndroidGame.genesisChFour.setVolume(0.6f);
                    LegendAndroidGame.genesisChFive.setVolume(0.6f);
                    LegendAndroidGame.genesisChSix.setVolume(0.6f);
                    LegendAndroidGame.genesisChSeven.setVolume(0.6f);
                    LegendAndroidGame.genesisChEight.setVolume(0.6f);
                    LegendAndroidGame.genesisChNine.setVolume(0.6f);
                    LegendAndroidGame.genesisChTen.setVolume(0.6f);
                    LegendAndroidGame.genesisChEleven.setVolume(0.6f);
                    LegendAndroidGame.genesisChTwelve.setVolume(0.6f);
                    LegendAndroidGame.genesisChThirteen.setVolume(0.6f);
                    LegendAndroidGame.genesisChFourteen.setVolume(0.6f);
                    LegendAndroidGame.genesisChFifteen.setVolume(0.6f);
                    LegendAndroidGame.genesisChSixteen.setVolume(0.6f);
                    LegendAndroidGame.genesisChSeventeen.setVolume(0.6f);
                    LegendAndroidGame.genesisChEighteen.setVolume(0.6f);
                    LegendAndroidGame.genesisChNineteen.setVolume(0.6f);
                    LegendAndroidGame.genesisChTwenty.setVolume(0.6f);

                    LegendAndroidGame.genesisChTwentyOne.setVolume(0.6f);
                    LegendAndroidGame.genesisChTwentyTwo.setVolume(0.6f);
                    LegendAndroidGame.genesisChTwentyThree.setVolume(0.6f);
                    LegendAndroidGame.genesisChTwentyFour.setVolume(0.6f);
                    LegendAndroidGame.genesisChTwentyFive.setVolume(0.6f);
                    LegendAndroidGame.genesisChTwentySix.setVolume(0.6f);
                    LegendAndroidGame.genesisChTwentySeven.setVolume(0.6f);
                    LegendAndroidGame.genesisChTwentyEight.setVolume(0.6f);
                    LegendAndroidGame.genesisChTwentyNine.setVolume(0.6f);
                    LegendAndroidGame.genesisChThirtyOne.setVolume(0.6f);
                    LegendAndroidGame.genesisChThirtyTwo.setVolume(0.6f);
                    LegendAndroidGame.genesisChThirtyThree.setVolume(0.6f);
                    LegendAndroidGame.genesisChThirtyFour.setVolume(0.6f);
                    LegendAndroidGame.genesisChThirtyFive.setVolume(0.6f);
                    LegendAndroidGame.genesisChThirtySix.setVolume(0.6f);
                    LegendAndroidGame.genesisChThirtySeven.setVolume(0.6f);
                    LegendAndroidGame.genesisChThirtyEight.setVolume(0.6f);
                    LegendAndroidGame.genesisChThirtyNine.setVolume(0.6f);
                    LegendAndroidGame.genesisChForty.setVolume(0.6f);

                    LegendAndroidGame.genesisChFortyOne.setVolume(0.6f);
                    LegendAndroidGame.genesisChFortyTwo.setVolume(0.6f);
                    LegendAndroidGame.genesisChFortyThree.setVolume(0.6f);
                    LegendAndroidGame.genesisChFortyFour.setVolume(0.6f);
                    LegendAndroidGame.genesisChFortyFive.setVolume(0.6f);
                    LegendAndroidGame.genesisChFortySix.setVolume(0.6f);
                    LegendAndroidGame.genesisChFortySeven.setVolume(0.6f);
                    LegendAndroidGame.genesisChFortyEight.setVolume(0.6f);
                    LegendAndroidGame.genesisChFortyNine.setVolume(0.6f);
                    LegendAndroidGame.genesisChFifty.setVolume(0.6f);

                    LegendAndroidGame.exodusChOne.setVolume(0.6f);
                    LegendAndroidGame.exodusChTwo.setVolume(0.6f);
                    LegendAndroidGame.exodusChThree.setVolume(0.6f);
                    LegendAndroidGame.exodusChFour.setVolume(0.6f);
                    LegendAndroidGame.exodusChFive.setVolume(0.6f);
                    LegendAndroidGame.exodusChSix.setVolume(0.6f);
                    LegendAndroidGame.exodusChSeven.setVolume(0.6f);
                    LegendAndroidGame.exodusChEight.setVolume(0.6f);
                    LegendAndroidGame.exodusChNine.setVolume(0.6f);
                    LegendAndroidGame.exodusChTen.setVolume(0.6f);

                    LegendAndroidGame.exodusChEleven.setVolume(0.6f);
                    LegendAndroidGame.exodusChTwelve.setVolume(0.6f);
                    LegendAndroidGame.exodusChThirteen.setVolume(0.6f);
                    LegendAndroidGame.exodusChFourteen.setVolume(0.6f);
                    LegendAndroidGame.exodusChFifteen.setVolume(0.6f);
                    LegendAndroidGame.exodusChSixteen.setVolume(0.6f);
                    LegendAndroidGame.exodusChSeventeen.setVolume(0.6f);
                    LegendAndroidGame.exodusChEighteen.setVolume(0.6f);
                    LegendAndroidGame.exodusChNineteen.setVolume(0.6f);
                    LegendAndroidGame.exodusChTwenty.setVolume(0.6f);

                    LegendAndroidGame.exodusChTwentyOne.setVolume(0.6f);
                    LegendAndroidGame.exodusChTwentyTwo.setVolume(0.6f);
                    LegendAndroidGame.exodusChTwentyThree.setVolume(0.6f);
                    LegendAndroidGame.exodusChTwentyFour.setVolume(0.6f);
                    LegendAndroidGame.exodusChTwentyFive.setVolume(0.6f);
                    LegendAndroidGame.exodusChTwentySix.setVolume(0.6f);
                    LegendAndroidGame.exodusChTwentySeven.setVolume(0.6f);
                    LegendAndroidGame.exodusChTwentyEight.setVolume(0.6f);
                    LegendAndroidGame.exodusChTwentyNine.setVolume(0.6f);
                    LegendAndroidGame.exodusChThirty.setVolume(0.6f);

                    LegendAndroidGame.exodusChThirtyOne.setVolume(0.6f);
                    LegendAndroidGame.exodusChThirtyTwo.setVolume(0.6f);
                    LegendAndroidGame.exodusChThirtyThree.setVolume(0.6f);
                    LegendAndroidGame.exodusChThirtyFour.setVolume(0.6f);
                    LegendAndroidGame.exodusChThirtyFive.setVolume(0.6f);
                    LegendAndroidGame.exodusChThirtySix.setVolume(0.6f);
                    LegendAndroidGame.exodusChThirtySeven.setVolume(0.6f);
                    LegendAndroidGame.exodusChThirtyEight.setVolume(0.6f);
                    LegendAndroidGame.exodusChThirtyNine.setVolume(0.6f);
                    LegendAndroidGame.exodusChForty.setVolume(0.6f);

                    LegendAndroidGame.leviticusChOne.setVolume(0.6f);
                    LegendAndroidGame.leviticusChTwo.setVolume(0.6f);
                    LegendAndroidGame.leviticusChThree.setVolume(0.6f);
                    LegendAndroidGame.leviticusChFour.setVolume(0.6f);
                    LegendAndroidGame.leviticusChFive.setVolume(0.6f);
                    LegendAndroidGame.leviticusChSix.setVolume(0.6f);
                    LegendAndroidGame.leviticusChSeven.setVolume(0.6f);
                    LegendAndroidGame.leviticusChEight.setVolume(0.6f);
                    LegendAndroidGame.leviticusChNine.setVolume(0.6f);
                    LegendAndroidGame.leviticusChTen.setVolume(0.6f);

                    LegendAndroidGame.leviticusChEleven.setVolume(0.6f);
                    LegendAndroidGame.leviticusChTwelve.setVolume(0.6f);
                    LegendAndroidGame.leviticusChThirteen.setVolume(0.6f);
                    LegendAndroidGame.leviticusChFourteen.setVolume(0.6f);
                    LegendAndroidGame.leviticusChFifteen.setVolume(0.6f);
                    LegendAndroidGame.leviticusChSixteen.setVolume(0.6f);
                    LegendAndroidGame.leviticusChSeventeen.setVolume(0.6f);
                    LegendAndroidGame.leviticusChEighteen.setVolume(0.6f);
                    LegendAndroidGame.leviticusChNineteen.setVolume(0.6f);
                    LegendAndroidGame.leviticusChTwenty.setVolume(0.6f);

                    LegendAndroidGame.leviticusChTwentyOne.setVolume(0.6f);
                    LegendAndroidGame.leviticusChTwentyTwo.setVolume(0.6f);
                    LegendAndroidGame.leviticusChTwentyThree.setVolume(0.6f);
                    LegendAndroidGame.leviticusChTwentyFour.setVolume(0.6f);
                    LegendAndroidGame.leviticusChTwentyFive.setVolume(0.6f);
                    LegendAndroidGame.leviticusChTwentySix.setVolume(0.6f);
                    LegendAndroidGame.leviticusChTwentySeven.setVolume(0.6f);

                    LegendAndroidGame.numbersChOne.setVolume(0.6f);
                    LegendAndroidGame.numbersChTwo.setVolume(0.6f);
                    LegendAndroidGame.numbersChThree.setVolume(0.6f);
                    LegendAndroidGame.numbersChFour.setVolume(0.6f);
                    LegendAndroidGame.numbersChFive.setVolume(0.6f);
                    LegendAndroidGame.numbersChSix.setVolume(0.6f);
                    LegendAndroidGame.numbersChSeven.setVolume(0.6f);
                    LegendAndroidGame.numbersChEight.setVolume(0.6f);
                    LegendAndroidGame.numbersChNine.setVolume(0.6f);
                    LegendAndroidGame.numbersChTen.setVolume(0.6f);

                    LegendAndroidGame.numbersChEleven.setVolume(0.6f);
                    LegendAndroidGame.numbersChTwelve.setVolume(0.6f);
                    LegendAndroidGame.numbersChThirteen.setVolume(0.6f);
                    LegendAndroidGame.numbersChFourteen.setVolume(0.6f);
                    LegendAndroidGame.numbersChFifteen.setVolume(0.6f);
                    LegendAndroidGame.numbersChSixteen.setVolume(0.6f);
                    LegendAndroidGame.numbersChSeventeen.setVolume(0.6f);
                    LegendAndroidGame.numbersChEighteen.setVolume(0.6f);
                    LegendAndroidGame.numbersChNineteen.setVolume(0.6f);
                    LegendAndroidGame.numbersChTwenty.setVolume(0.6f);

                    LegendAndroidGame.numbersChTwentyOne.setVolume(0.6f);
                    LegendAndroidGame.numbersChTwentyTwo.setVolume(0.6f);
                    LegendAndroidGame.numbersChTwentyThree.setVolume(0.6f);
                    LegendAndroidGame.numbersChTwentyFour.setVolume(0.6f);
                    LegendAndroidGame.numbersChTwentyFive.setVolume(0.6f);
                    LegendAndroidGame.numbersChTwentySix.setVolume(0.6f);
                    LegendAndroidGame.numbersChTwentySeven.setVolume(0.6f);
                    LegendAndroidGame.numbersChTwentyEight.setVolume(0.6f);
                    LegendAndroidGame.numbersChTwentyNine.setVolume(0.6f);
                    LegendAndroidGame.numbersChThirty.setVolume(0.6f);

                    LegendAndroidGame.numbersChThirtyOne.setVolume(0.6f);
                    LegendAndroidGame.numbersChThirtyTwo.setVolume(0.6f);
                    LegendAndroidGame.numbersChThirtyThree.setVolume(0.6f);
                    LegendAndroidGame.numbersChThirtyFour.setVolume(0.6f);
                    LegendAndroidGame.numbersChThirtyFive.setVolume(0.6f);
                    LegendAndroidGame.numbersChThirtySix.setVolume(0.6f);

                    LegendAndroidGame.deuteronomyChOne.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTwo.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChThree.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChFour.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChFive.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChSix.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChSeven.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChEight.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChNine.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTen.setVolume(0.6f);

                    LegendAndroidGame.deuteronomyChEleven.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTwelve.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChThirteen.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChFourteen.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChFifteen.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChSixteen.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChSeventeen.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChEighteen.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChNineteen.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTwenty.setVolume(0.6f);

                    LegendAndroidGame.deuteronomyChTwentyOne.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTwentyTwo.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTwentyThree.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTwentyFour.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTwentyFive.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTwentySix.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTwentySeven.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTwentyEight.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChTwentyNine.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChThirty.setVolume(0.6f);

                    LegendAndroidGame.deuteronomyChThirtyOne.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChThirtyTwo.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChThirtyThree.setVolume(0.6f);
                    LegendAndroidGame.deuteronomyChThirtyFour.setVolume(0.6f);

                    LegendAndroidGame.joshuaChOne.setVolume(0.6f);
                    LegendAndroidGame.joshuaChTwo.setVolume(0.6f);
                    LegendAndroidGame.joshuaChThree.setVolume(0.6f);
                    LegendAndroidGame.joshuaChFour.setVolume(0.6f);
                    LegendAndroidGame.joshuaChFive.setVolume(0.6f);
                    LegendAndroidGame.joshuaChSix.setVolume(0.6f);
                    LegendAndroidGame.joshuaChSeven.setVolume(0.6f);
                    LegendAndroidGame.joshuaChEight.setVolume(0.6f);
                    LegendAndroidGame.joshuaChNine.setVolume(0.6f);
                    LegendAndroidGame.joshuaChTen.setVolume(0.6f);

                    LegendAndroidGame.joshuaChEleven.setVolume(0.6f);
                    LegendAndroidGame.joshuaChTwelve.setVolume(0.6f);
                    LegendAndroidGame.joshuaChThirteen.setVolume(0.6f);
                    LegendAndroidGame.joshuaChFourteen.setVolume(0.6f);
                    LegendAndroidGame.joshuaChFifteen.setVolume(0.6f);
                    LegendAndroidGame.joshuaChSixteen.setVolume(0.6f);
                    LegendAndroidGame.joshuaChSeventeen.setVolume(0.6f);
                    LegendAndroidGame.joshuaChEighteen.setVolume(0.6f);
                    LegendAndroidGame.joshuaChNineteen.setVolume(0.6f);
                    LegendAndroidGame.joshuaChTwenty.setVolume(0.6f);

                    LegendAndroidGame.joshuaChTwentyOne.setVolume(0.6f);
                    LegendAndroidGame.joshuaChTwentyTwo.setVolume(0.6f);
                    LegendAndroidGame.joshuaChTwentyThree.setVolume(0.6f);
                    LegendAndroidGame.joshuaChTwentyFour.setVolume(0.6f);

                }
                //Ito pa.... Ano gagawin???
                else if (voiceSlider.getValue() == 14){

                    LegendAndroidGame.genesisChOne.setVolume(0.7f);
                    LegendAndroidGame.genesisChTwo.setVolume(0.7f);
                    LegendAndroidGame.genesisChThree.setVolume(0.7f);
                    LegendAndroidGame.genesisChFour.setVolume(0.7f);
                    LegendAndroidGame.genesisChFive.setVolume(0.7f);
                    LegendAndroidGame.genesisChSix.setVolume(0.7f);
                    LegendAndroidGame.genesisChSeven.setVolume(0.7f);
                    LegendAndroidGame.genesisChEight.setVolume(0.7f);
                    LegendAndroidGame.genesisChNine.setVolume(0.7f);
                    LegendAndroidGame.genesisChTen.setVolume(0.7f);
                    LegendAndroidGame.genesisChEleven.setVolume(0.7f);
                    LegendAndroidGame.genesisChTwelve.setVolume(0.7f);
                    LegendAndroidGame.genesisChThirteen.setVolume(0.7f);
                    LegendAndroidGame.genesisChFourteen.setVolume(0.7f);
                    LegendAndroidGame.genesisChFifteen.setVolume(0.7f);
                    LegendAndroidGame.genesisChSixteen.setVolume(0.7f);
                    LegendAndroidGame.genesisChSeventeen.setVolume(0.7f);
                    LegendAndroidGame.genesisChEighteen.setVolume(0.7f);
                    LegendAndroidGame.genesisChNineteen.setVolume(0.7f);
                    LegendAndroidGame.genesisChTwenty.setVolume(0.7f);

                    LegendAndroidGame.genesisChTwentyOne.setVolume(0.7f);
                    LegendAndroidGame.genesisChTwentyTwo.setVolume(0.7f);
                    LegendAndroidGame.genesisChTwentyThree.setVolume(0.7f);
                    LegendAndroidGame.genesisChTwentyFour.setVolume(0.7f);
                    LegendAndroidGame.genesisChTwentyFive.setVolume(0.7f);
                    LegendAndroidGame.genesisChTwentySix.setVolume(0.7f);
                    LegendAndroidGame.genesisChTwentySeven.setVolume(0.7f);
                    LegendAndroidGame.genesisChTwentyEight.setVolume(0.7f);
                    LegendAndroidGame.genesisChTwentyNine.setVolume(0.7f);
                    LegendAndroidGame.genesisChThirtyOne.setVolume(0.7f);
                    LegendAndroidGame.genesisChThirtyTwo.setVolume(0.7f);
                    LegendAndroidGame.genesisChThirtyThree.setVolume(0.7f);
                    LegendAndroidGame.genesisChThirtyFour.setVolume(0.7f);
                    LegendAndroidGame.genesisChThirtyFive.setVolume(0.7f);
                    LegendAndroidGame.genesisChThirtySix.setVolume(0.7f);
                    LegendAndroidGame.genesisChThirtySeven.setVolume(0.7f);
                    LegendAndroidGame.genesisChThirtyEight.setVolume(0.7f);
                    LegendAndroidGame.genesisChThirtyNine.setVolume(0.7f);
                    LegendAndroidGame.genesisChForty.setVolume(0.7f);

                    LegendAndroidGame.genesisChFortyOne.setVolume(0.7f);
                    LegendAndroidGame.genesisChFortyTwo.setVolume(0.7f);
                    LegendAndroidGame.genesisChFortyThree.setVolume(0.7f);
                    LegendAndroidGame.genesisChFortyFour.setVolume(0.7f);
                    LegendAndroidGame.genesisChFortyFive.setVolume(0.7f);
                    LegendAndroidGame.genesisChFortySix.setVolume(0.7f);
                    LegendAndroidGame.genesisChFortySeven.setVolume(0.7f);
                    LegendAndroidGame.genesisChFortyEight.setVolume(0.7f);
                    LegendAndroidGame.genesisChFortyNine.setVolume(0.7f);
                    LegendAndroidGame.genesisChFifty.setVolume(0.7f);

                    LegendAndroidGame.exodusChOne.setVolume(0.7f);
                    LegendAndroidGame.exodusChTwo.setVolume(0.7f);
                    LegendAndroidGame.exodusChThree.setVolume(0.7f);
                    LegendAndroidGame.exodusChFour.setVolume(0.7f);
                    LegendAndroidGame.exodusChFive.setVolume(0.7f);
                    LegendAndroidGame.exodusChSix.setVolume(0.7f);
                    LegendAndroidGame.exodusChSeven.setVolume(0.7f);
                    LegendAndroidGame.exodusChEight.setVolume(0.7f);
                    LegendAndroidGame.exodusChNine.setVolume(0.7f);
                    LegendAndroidGame.exodusChTen.setVolume(0.7f);

                    LegendAndroidGame.exodusChEleven.setVolume(0.7f);
                    LegendAndroidGame.exodusChTwelve.setVolume(0.7f);
                    LegendAndroidGame.exodusChThirteen.setVolume(0.7f);
                    LegendAndroidGame.exodusChFourteen.setVolume(0.7f);
                    LegendAndroidGame.exodusChFifteen.setVolume(0.7f);
                    LegendAndroidGame.exodusChSixteen.setVolume(0.7f);
                    LegendAndroidGame.exodusChSeventeen.setVolume(0.7f);
                    LegendAndroidGame.exodusChEighteen.setVolume(0.7f);
                    LegendAndroidGame.exodusChNineteen.setVolume(0.7f);
                    LegendAndroidGame.exodusChTwenty.setVolume(0.7f);

                    LegendAndroidGame.exodusChTwentyOne.setVolume(0.7f);
                    LegendAndroidGame.exodusChTwentyTwo.setVolume(0.7f);
                    LegendAndroidGame.exodusChTwentyThree.setVolume(0.7f);
                    LegendAndroidGame.exodusChTwentyFour.setVolume(0.7f);
                    LegendAndroidGame.exodusChTwentyFive.setVolume(0.7f);
                    LegendAndroidGame.exodusChTwentySix.setVolume(0.7f);
                    LegendAndroidGame.exodusChTwentySeven.setVolume(0.7f);
                    LegendAndroidGame.exodusChTwentyEight.setVolume(0.7f);
                    LegendAndroidGame.exodusChTwentyNine.setVolume(0.7f);
                    LegendAndroidGame.exodusChThirty.setVolume(0.7f);

                    LegendAndroidGame.exodusChThirtyOne.setVolume(0.7f);
                    LegendAndroidGame.exodusChThirtyTwo.setVolume(0.7f);
                    LegendAndroidGame.exodusChThirtyThree.setVolume(0.7f);
                    LegendAndroidGame.exodusChThirtyFour.setVolume(0.7f);
                    LegendAndroidGame.exodusChThirtyFive.setVolume(0.7f);
                    LegendAndroidGame.exodusChThirtySix.setVolume(0.7f);
                    LegendAndroidGame.exodusChThirtySeven.setVolume(0.7f);
                    LegendAndroidGame.exodusChThirtyEight.setVolume(0.7f);
                    LegendAndroidGame.exodusChThirtyNine.setVolume(0.7f);
                    LegendAndroidGame.exodusChForty.setVolume(0.7f);

                    LegendAndroidGame.leviticusChOne.setVolume(0.7f);
                    LegendAndroidGame.leviticusChTwo.setVolume(0.7f);
                    LegendAndroidGame.leviticusChThree.setVolume(0.7f);
                    LegendAndroidGame.leviticusChFour.setVolume(0.7f);
                    LegendAndroidGame.leviticusChFive.setVolume(0.7f);
                    LegendAndroidGame.leviticusChSix.setVolume(0.7f);
                    LegendAndroidGame.leviticusChSeven.setVolume(0.7f);
                    LegendAndroidGame.leviticusChEight.setVolume(0.7f);
                    LegendAndroidGame.leviticusChNine.setVolume(0.7f);
                    LegendAndroidGame.leviticusChTen.setVolume(0.7f);

                    LegendAndroidGame.leviticusChEleven.setVolume(0.7f);
                    LegendAndroidGame.leviticusChTwelve.setVolume(0.7f);
                    LegendAndroidGame.leviticusChThirteen.setVolume(0.7f);
                    LegendAndroidGame.leviticusChFourteen.setVolume(0.7f);
                    LegendAndroidGame.leviticusChFifteen.setVolume(0.7f);
                    LegendAndroidGame.leviticusChSixteen.setVolume(0.7f);
                    LegendAndroidGame.leviticusChSeventeen.setVolume(0.7f);
                    LegendAndroidGame.leviticusChEighteen.setVolume(0.7f);
                    LegendAndroidGame.leviticusChNineteen.setVolume(0.7f);
                    LegendAndroidGame.leviticusChTwenty.setVolume(0.7f);

                    LegendAndroidGame.leviticusChTwentyOne.setVolume(0.7f);
                    LegendAndroidGame.leviticusChTwentyTwo.setVolume(0.7f);
                    LegendAndroidGame.leviticusChTwentyThree.setVolume(0.7f);
                    LegendAndroidGame.leviticusChTwentyFour.setVolume(0.7f);
                    LegendAndroidGame.leviticusChTwentyFive.setVolume(0.7f);
                    LegendAndroidGame.leviticusChTwentySix.setVolume(0.7f);
                    LegendAndroidGame.leviticusChTwentySeven.setVolume(0.7f);

                    LegendAndroidGame.numbersChOne.setVolume(0.7f);
                    LegendAndroidGame.numbersChTwo.setVolume(0.7f);
                    LegendAndroidGame.numbersChThree.setVolume(0.7f);
                    LegendAndroidGame.numbersChFour.setVolume(0.7f);
                    LegendAndroidGame.numbersChFive.setVolume(0.7f);
                    LegendAndroidGame.numbersChSix.setVolume(0.7f);
                    LegendAndroidGame.numbersChSeven.setVolume(0.7f);
                    LegendAndroidGame.numbersChEight.setVolume(0.7f);
                    LegendAndroidGame.numbersChNine.setVolume(0.7f);
                    LegendAndroidGame.numbersChTen.setVolume(0.7f);

                    LegendAndroidGame.numbersChEleven.setVolume(0.7f);
                    LegendAndroidGame.numbersChTwelve.setVolume(0.7f);
                    LegendAndroidGame.numbersChThirteen.setVolume(0.7f);
                    LegendAndroidGame.numbersChFourteen.setVolume(0.7f);
                    LegendAndroidGame.numbersChFifteen.setVolume(0.7f);
                    LegendAndroidGame.numbersChSixteen.setVolume(0.7f);
                    LegendAndroidGame.numbersChSeventeen.setVolume(0.7f);
                    LegendAndroidGame.numbersChEighteen.setVolume(0.7f);
                    LegendAndroidGame.numbersChNineteen.setVolume(0.7f);
                    LegendAndroidGame.numbersChTwenty.setVolume(0.7f);

                    LegendAndroidGame.numbersChTwentyOne.setVolume(0.7f);
                    LegendAndroidGame.numbersChTwentyTwo.setVolume(0.7f);
                    LegendAndroidGame.numbersChTwentyThree.setVolume(0.7f);
                    LegendAndroidGame.numbersChTwentyFour.setVolume(0.7f);
                    LegendAndroidGame.numbersChTwentyFive.setVolume(0.7f);
                    LegendAndroidGame.numbersChTwentySix.setVolume(0.7f);
                    LegendAndroidGame.numbersChTwentySeven.setVolume(0.7f);
                    LegendAndroidGame.numbersChTwentyEight.setVolume(0.7f);
                    LegendAndroidGame.numbersChTwentyNine.setVolume(0.7f);
                    LegendAndroidGame.numbersChThirty.setVolume(0.7f);

                    LegendAndroidGame.numbersChThirtyOne.setVolume(0.7f);
                    LegendAndroidGame.numbersChThirtyTwo.setVolume(0.7f);
                    LegendAndroidGame.numbersChThirtyThree.setVolume(0.7f);
                    LegendAndroidGame.numbersChThirtyFour.setVolume(0.7f);
                    LegendAndroidGame.numbersChThirtyFive.setVolume(0.7f);
                    LegendAndroidGame.numbersChThirtySix.setVolume(0.7f);

                    LegendAndroidGame.deuteronomyChOne.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTwo.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChThree.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChFour.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChFive.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChSix.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChSeven.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChEight.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChNine.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTen.setVolume(0.7f);

                    LegendAndroidGame.deuteronomyChEleven.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTwelve.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChThirteen.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChFourteen.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChFifteen.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChSixteen.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChSeventeen.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChEighteen.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChNineteen.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTwenty.setVolume(0.7f);

                    LegendAndroidGame.deuteronomyChTwentyOne.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTwentyTwo.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTwentyThree.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTwentyFour.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTwentyFive.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTwentySix.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTwentySeven.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTwentyEight.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChTwentyNine.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChThirty.setVolume(0.7f);

                    LegendAndroidGame.deuteronomyChThirtyOne.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChThirtyTwo.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChThirtyThree.setVolume(0.7f);
                    LegendAndroidGame.deuteronomyChThirtyFour.setVolume(0.7f);

                    LegendAndroidGame.joshuaChOne.setVolume(0.7f);
                    LegendAndroidGame.joshuaChTwo.setVolume(0.7f);
                    LegendAndroidGame.joshuaChThree.setVolume(0.7f);
                    LegendAndroidGame.joshuaChFour.setVolume(0.7f);
                    LegendAndroidGame.joshuaChFive.setVolume(0.7f);
                    LegendAndroidGame.joshuaChSix.setVolume(0.7f);
                    LegendAndroidGame.joshuaChSeven.setVolume(0.7f);
                    LegendAndroidGame.joshuaChEight.setVolume(0.7f);
                    LegendAndroidGame.joshuaChNine.setVolume(0.7f);
                    LegendAndroidGame.joshuaChTen.setVolume(0.7f);

                    LegendAndroidGame.joshuaChEleven.setVolume(0.7f);
                    LegendAndroidGame.joshuaChTwelve.setVolume(0.7f);
                    LegendAndroidGame.joshuaChThirteen.setVolume(0.7f);
                    LegendAndroidGame.joshuaChFourteen.setVolume(0.7f);
                    LegendAndroidGame.joshuaChFifteen.setVolume(0.7f);
                    LegendAndroidGame.joshuaChSixteen.setVolume(0.7f);
                    LegendAndroidGame.joshuaChSeventeen.setVolume(0.7f);
                    LegendAndroidGame.joshuaChEighteen.setVolume(0.7f);
                    LegendAndroidGame.joshuaChNineteen.setVolume(0.7f);
                    LegendAndroidGame.joshuaChTwenty.setVolume(0.7f);

                    LegendAndroidGame.joshuaChTwentyOne.setVolume(0.7f);
                    LegendAndroidGame.joshuaChTwentyTwo.setVolume(0.7f);
                    LegendAndroidGame.joshuaChTwentyThree.setVolume(0.7f);
                    LegendAndroidGame.joshuaChTwentyFour.setVolume(0.7f);


                }
                else if (voiceSlider.getValue() == 16) {

                    LegendAndroidGame.genesisChOne.setVolume(0.8f);
                    LegendAndroidGame.genesisChTwo.setVolume(0.8f);
                    LegendAndroidGame.genesisChThree.setVolume(0.8f);
                    LegendAndroidGame.genesisChFour.setVolume(0.8f);
                    LegendAndroidGame.genesisChFive.setVolume(0.8f);
                    LegendAndroidGame.genesisChSix.setVolume(0.8f);
                    LegendAndroidGame.genesisChSeven.setVolume(0.8f);
                    LegendAndroidGame.genesisChEight.setVolume(0.8f);
                    LegendAndroidGame.genesisChNine.setVolume(0.8f);
                    LegendAndroidGame.genesisChTen.setVolume(0.8f);
                    LegendAndroidGame.genesisChEleven.setVolume(0.8f);
                    LegendAndroidGame.genesisChTwelve.setVolume(0.8f);
                    LegendAndroidGame.genesisChThirteen.setVolume(0.8f);
                    LegendAndroidGame.genesisChFourteen.setVolume(0.8f);
                    LegendAndroidGame.genesisChFifteen.setVolume(0.8f);
                    LegendAndroidGame.genesisChSixteen.setVolume(0.8f);
                    LegendAndroidGame.genesisChSeventeen.setVolume(0.8f);
                    LegendAndroidGame.genesisChEighteen.setVolume(0.8f);
                    LegendAndroidGame.genesisChNineteen.setVolume(0.8f);
                    LegendAndroidGame.genesisChTwenty.setVolume(0.8f);

                    LegendAndroidGame.genesisChTwentyOne.setVolume(0.8f);
                    LegendAndroidGame.genesisChTwentyTwo.setVolume(0.8f);
                    LegendAndroidGame.genesisChTwentyThree.setVolume(0.8f);
                    LegendAndroidGame.genesisChTwentyFour.setVolume(0.8f);
                    LegendAndroidGame.genesisChTwentyFive.setVolume(0.8f);
                    LegendAndroidGame.genesisChTwentySix.setVolume(0.8f);
                    LegendAndroidGame.genesisChTwentySeven.setVolume(0.8f);
                    LegendAndroidGame.genesisChTwentyEight.setVolume(0.8f);
                    LegendAndroidGame.genesisChTwentyNine.setVolume(0.8f);
                    LegendAndroidGame.genesisChThirtyOne.setVolume(0.8f);
                    LegendAndroidGame.genesisChThirtyTwo.setVolume(0.8f);
                    LegendAndroidGame.genesisChThirtyThree.setVolume(0.8f);
                    LegendAndroidGame.genesisChThirtyFour.setVolume(0.8f);
                    LegendAndroidGame.genesisChThirtyFive.setVolume(0.8f);
                    LegendAndroidGame.genesisChThirtySix.setVolume(0.8f);
                    LegendAndroidGame.genesisChThirtySeven.setVolume(0.8f);
                    LegendAndroidGame.genesisChThirtyEight.setVolume(0.8f);
                    LegendAndroidGame.genesisChThirtyNine.setVolume(0.8f);
                    LegendAndroidGame.genesisChForty.setVolume(0.8f);

                    LegendAndroidGame.genesisChFortyOne.setVolume(0.8f);
                    LegendAndroidGame.genesisChFortyTwo.setVolume(0.8f);
                    LegendAndroidGame.genesisChFortyThree.setVolume(0.8f);
                    LegendAndroidGame.genesisChFortyFour.setVolume(0.8f);
                    LegendAndroidGame.genesisChFortyFive.setVolume(0.8f);
                    LegendAndroidGame.genesisChFortySix.setVolume(0.8f);
                    LegendAndroidGame.genesisChFortySeven.setVolume(0.8f);
                    LegendAndroidGame.genesisChFortyEight.setVolume(0.8f);
                    LegendAndroidGame.genesisChFortyNine.setVolume(0.8f);
                    LegendAndroidGame.genesisChFifty.setVolume(0.8f);

                    LegendAndroidGame.exodusChOne.setVolume(0.8f);
                    LegendAndroidGame.exodusChTwo.setVolume(0.8f);
                    LegendAndroidGame.exodusChThree.setVolume(0.8f);
                    LegendAndroidGame.exodusChFour.setVolume(0.8f);
                    LegendAndroidGame.exodusChFive.setVolume(0.8f);
                    LegendAndroidGame.exodusChSix.setVolume(0.8f);
                    LegendAndroidGame.exodusChSeven.setVolume(0.8f);
                    LegendAndroidGame.exodusChEight.setVolume(0.8f);
                    LegendAndroidGame.exodusChNine.setVolume(0.8f);
                    LegendAndroidGame.exodusChTen.setVolume(0.8f);

                    LegendAndroidGame.exodusChEleven.setVolume(0.8f);
                    LegendAndroidGame.exodusChTwelve.setVolume(0.8f);
                    LegendAndroidGame.exodusChThirteen.setVolume(0.8f);
                    LegendAndroidGame.exodusChFourteen.setVolume(0.8f);
                    LegendAndroidGame.exodusChFifteen.setVolume(0.8f);
                    LegendAndroidGame.exodusChSixteen.setVolume(0.8f);
                    LegendAndroidGame.exodusChSeventeen.setVolume(0.8f);
                    LegendAndroidGame.exodusChEighteen.setVolume(0.8f);
                    LegendAndroidGame.exodusChNineteen.setVolume(0.8f);
                    LegendAndroidGame.exodusChTwenty.setVolume(0.8f);

                    LegendAndroidGame.exodusChTwentyOne.setVolume(0.8f);
                    LegendAndroidGame.exodusChTwentyTwo.setVolume(0.8f);
                    LegendAndroidGame.exodusChTwentyThree.setVolume(0.8f);
                    LegendAndroidGame.exodusChTwentyFour.setVolume(0.8f);
                    LegendAndroidGame.exodusChTwentyFive.setVolume(0.8f);
                    LegendAndroidGame.exodusChTwentySix.setVolume(0.8f);
                    LegendAndroidGame.exodusChTwentySeven.setVolume(0.8f);
                    LegendAndroidGame.exodusChTwentyEight.setVolume(0.8f);
                    LegendAndroidGame.exodusChTwentyNine.setVolume(0.8f);
                    LegendAndroidGame.exodusChThirty.setVolume(0.8f);

                    LegendAndroidGame.exodusChThirtyOne.setVolume(0.8f);
                    LegendAndroidGame.exodusChThirtyTwo.setVolume(0.8f);
                    LegendAndroidGame.exodusChThirtyThree.setVolume(0.8f);
                    LegendAndroidGame.exodusChThirtyFour.setVolume(0.8f);
                    LegendAndroidGame.exodusChThirtyFive.setVolume(0.8f);
                    LegendAndroidGame.exodusChThirtySix.setVolume(0.8f);
                    LegendAndroidGame.exodusChThirtySeven.setVolume(0.8f);
                    LegendAndroidGame.exodusChThirtyEight.setVolume(0.8f);
                    LegendAndroidGame.exodusChThirtyNine.setVolume(0.8f);
                    LegendAndroidGame.exodusChForty.setVolume(0.8f);

                    LegendAndroidGame.leviticusChOne.setVolume(0.8f);
                    LegendAndroidGame.leviticusChTwo.setVolume(0.8f);
                    LegendAndroidGame.leviticusChThree.setVolume(0.8f);
                    LegendAndroidGame.leviticusChFour.setVolume(0.8f);
                    LegendAndroidGame.leviticusChFive.setVolume(0.8f);
                    LegendAndroidGame.leviticusChSix.setVolume(0.8f);
                    LegendAndroidGame.leviticusChSeven.setVolume(0.8f);
                    LegendAndroidGame.leviticusChEight.setVolume(0.8f);
                    LegendAndroidGame.leviticusChNine.setVolume(0.8f);
                    LegendAndroidGame.leviticusChTen.setVolume(0.8f);

                    LegendAndroidGame.leviticusChEleven.setVolume(0.8f);
                    LegendAndroidGame.leviticusChTwelve.setVolume(0.8f);
                    LegendAndroidGame.leviticusChThirteen.setVolume(0.8f);
                    LegendAndroidGame.leviticusChFourteen.setVolume(0.8f);
                    LegendAndroidGame.leviticusChFifteen.setVolume(0.8f);
                    LegendAndroidGame.leviticusChSixteen.setVolume(0.8f);
                    LegendAndroidGame.leviticusChSeventeen.setVolume(0.8f);
                    LegendAndroidGame.leviticusChEighteen.setVolume(0.8f);
                    LegendAndroidGame.leviticusChNineteen.setVolume(0.8f);
                    LegendAndroidGame.leviticusChTwenty.setVolume(0.8f);

                    LegendAndroidGame.leviticusChTwentyOne.setVolume(0.8f);
                    LegendAndroidGame.leviticusChTwentyTwo.setVolume(0.8f);
                    LegendAndroidGame.leviticusChTwentyThree.setVolume(0.8f);
                    LegendAndroidGame.leviticusChTwentyFour.setVolume(0.8f);
                    LegendAndroidGame.leviticusChTwentyFive.setVolume(0.8f);
                    LegendAndroidGame.leviticusChTwentySix.setVolume(0.8f);
                    LegendAndroidGame.leviticusChTwentySeven.setVolume(0.8f);

                    LegendAndroidGame.numbersChOne.setVolume(0.8f);
                    LegendAndroidGame.numbersChTwo.setVolume(0.8f);
                    LegendAndroidGame.numbersChThree.setVolume(0.8f);
                    LegendAndroidGame.numbersChFour.setVolume(0.8f);
                    LegendAndroidGame.numbersChFive.setVolume(0.8f);
                    LegendAndroidGame.numbersChSix.setVolume(0.8f);
                    LegendAndroidGame.numbersChSeven.setVolume(0.8f);
                    LegendAndroidGame.numbersChEight.setVolume(0.8f);
                    LegendAndroidGame.numbersChNine.setVolume(0.8f);
                    LegendAndroidGame.numbersChTen.setVolume(0.8f);

                    LegendAndroidGame.numbersChEleven.setVolume(0.8f);
                    LegendAndroidGame.numbersChTwelve.setVolume(0.8f);
                    LegendAndroidGame.numbersChThirteen.setVolume(0.8f);
                    LegendAndroidGame.numbersChFourteen.setVolume(0.8f);
                    LegendAndroidGame.numbersChFifteen.setVolume(0.8f);
                    LegendAndroidGame.numbersChSixteen.setVolume(0.8f);
                    LegendAndroidGame.numbersChSeventeen.setVolume(0.8f);
                    LegendAndroidGame.numbersChEighteen.setVolume(0.8f);
                    LegendAndroidGame.numbersChNineteen.setVolume(0.8f);
                    LegendAndroidGame.numbersChTwenty.setVolume(0.8f);

                    LegendAndroidGame.numbersChTwentyOne.setVolume(0.8f);
                    LegendAndroidGame.numbersChTwentyTwo.setVolume(0.8f);
                    LegendAndroidGame.numbersChTwentyThree.setVolume(0.8f);
                    LegendAndroidGame.numbersChTwentyFour.setVolume(0.8f);
                    LegendAndroidGame.numbersChTwentyFive.setVolume(0.8f);
                    LegendAndroidGame.numbersChTwentySix.setVolume(0.8f);
                    LegendAndroidGame.numbersChTwentySeven.setVolume(0.8f);
                    LegendAndroidGame.numbersChTwentyEight.setVolume(0.8f);
                    LegendAndroidGame.numbersChTwentyNine.setVolume(0.8f);
                    LegendAndroidGame.numbersChThirty.setVolume(0.8f);

                    LegendAndroidGame.numbersChThirtyOne.setVolume(0.8f);
                    LegendAndroidGame.numbersChThirtyTwo.setVolume(0.8f);
                    LegendAndroidGame.numbersChThirtyThree.setVolume(0.8f);
                    LegendAndroidGame.numbersChThirtyFour.setVolume(0.8f);
                    LegendAndroidGame.numbersChThirtyFive.setVolume(0.8f);
                    LegendAndroidGame.numbersChThirtySix.setVolume(0.8f);

                    LegendAndroidGame.deuteronomyChOne.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTwo.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChThree.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChFour.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChFive.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChSix.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChSeven.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChEight.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChNine.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTen.setVolume(0.8f);

                    LegendAndroidGame.deuteronomyChEleven.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTwelve.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChThirteen.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChFourteen.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChFifteen.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChSixteen.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChSeventeen.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChEighteen.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChNineteen.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTwenty.setVolume(0.8f);

                    LegendAndroidGame.deuteronomyChTwentyOne.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTwentyTwo.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTwentyThree.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTwentyFour.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTwentyFive.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTwentySix.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTwentySeven.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTwentyEight.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChTwentyNine.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChThirty.setVolume(0.8f);

                    LegendAndroidGame.deuteronomyChThirtyOne.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChThirtyTwo.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChThirtyThree.setVolume(0.8f);
                    LegendAndroidGame.deuteronomyChThirtyFour.setVolume(0.8f);

                    LegendAndroidGame.joshuaChOne.setVolume(0.8f);
                    LegendAndroidGame.joshuaChTwo.setVolume(0.8f);
                    LegendAndroidGame.joshuaChThree.setVolume(0.8f);
                    LegendAndroidGame.joshuaChFour.setVolume(0.8f);
                    LegendAndroidGame.joshuaChFive.setVolume(0.8f);
                    LegendAndroidGame.joshuaChSix.setVolume(0.8f);
                    LegendAndroidGame.joshuaChSeven.setVolume(0.8f);
                    LegendAndroidGame.joshuaChEight.setVolume(0.8f);
                    LegendAndroidGame.joshuaChNine.setVolume(0.8f);
                    LegendAndroidGame.joshuaChTen.setVolume(0.8f);

                    LegendAndroidGame.joshuaChEleven.setVolume(0.8f);
                    LegendAndroidGame.joshuaChTwelve.setVolume(0.8f);
                    LegendAndroidGame.joshuaChThirteen.setVolume(0.8f);
                    LegendAndroidGame.joshuaChFourteen.setVolume(0.8f);
                    LegendAndroidGame.joshuaChFifteen.setVolume(0.8f);
                    LegendAndroidGame.joshuaChSixteen.setVolume(0.8f);
                    LegendAndroidGame.joshuaChSeventeen.setVolume(0.8f);
                    LegendAndroidGame.joshuaChEighteen.setVolume(0.8f);
                    LegendAndroidGame.joshuaChNineteen.setVolume(0.8f);
                    LegendAndroidGame.joshuaChTwenty.setVolume(0.8f);

                    LegendAndroidGame.joshuaChTwentyOne.setVolume(0.8f);
                    LegendAndroidGame.joshuaChTwentyTwo.setVolume(0.8f);
                    LegendAndroidGame.joshuaChTwentyThree.setVolume(0.8f);
                    LegendAndroidGame.joshuaChTwentyFour.setVolume(0.8f);


                }
                else if (voiceSlider.getValue() == 18) {

                    LegendAndroidGame.genesisChOne.setVolume(0.9f);
                    LegendAndroidGame.genesisChTwo.setVolume(0.9f);
                    LegendAndroidGame.genesisChThree.setVolume(0.9f);
                    LegendAndroidGame.genesisChFour.setVolume(0.9f);
                    LegendAndroidGame.genesisChFive.setVolume(0.9f);
                    LegendAndroidGame.genesisChSix.setVolume(0.9f);
                    LegendAndroidGame.genesisChSeven.setVolume(0.9f);
                    LegendAndroidGame.genesisChEight.setVolume(0.9f);
                    LegendAndroidGame.genesisChNine.setVolume(0.9f);
                    LegendAndroidGame.genesisChTen.setVolume(0.9f);
                    LegendAndroidGame.genesisChEleven.setVolume(0.9f);
                    LegendAndroidGame.genesisChTwelve.setVolume(0.9f);
                    LegendAndroidGame.genesisChThirteen.setVolume(0.9f);
                    LegendAndroidGame.genesisChFourteen.setVolume(0.9f);
                    LegendAndroidGame.genesisChFifteen.setVolume(0.9f);
                    LegendAndroidGame.genesisChSixteen.setVolume(0.9f);
                    LegendAndroidGame.genesisChSeventeen.setVolume(0.9f);
                    LegendAndroidGame.genesisChEighteen.setVolume(0.9f);
                    LegendAndroidGame.genesisChNineteen.setVolume(0.9f);
                    LegendAndroidGame.genesisChTwenty.setVolume(0.9f);

                    LegendAndroidGame.genesisChTwentyOne.setVolume(0.9f);
                    LegendAndroidGame.genesisChTwentyTwo.setVolume(0.9f);
                    LegendAndroidGame.genesisChTwentyThree.setVolume(0.9f);
                    LegendAndroidGame.genesisChTwentyFour.setVolume(0.9f);
                    LegendAndroidGame.genesisChTwentyFive.setVolume(0.9f);
                    LegendAndroidGame.genesisChTwentySix.setVolume(0.9f);
                    LegendAndroidGame.genesisChTwentySeven.setVolume(0.9f);
                    LegendAndroidGame.genesisChTwentyEight.setVolume(0.9f);
                    LegendAndroidGame.genesisChTwentyNine.setVolume(0.9f);
                    LegendAndroidGame.genesisChThirtyOne.setVolume(0.9f);
                    LegendAndroidGame.genesisChThirtyTwo.setVolume(0.9f);
                    LegendAndroidGame.genesisChThirtyThree.setVolume(0.9f);
                    LegendAndroidGame.genesisChThirtyFour.setVolume(0.9f);
                    LegendAndroidGame.genesisChThirtyFive.setVolume(0.9f);
                    LegendAndroidGame.genesisChThirtySix.setVolume(0.9f);
                    LegendAndroidGame.genesisChThirtySeven.setVolume(0.9f);
                    LegendAndroidGame.genesisChThirtyEight.setVolume(0.9f);
                    LegendAndroidGame.genesisChThirtyNine.setVolume(0.9f);
                    LegendAndroidGame.genesisChForty.setVolume(0.9f);

                    LegendAndroidGame.genesisChFortyOne.setVolume(0.9f);
                    LegendAndroidGame.genesisChFortyTwo.setVolume(0.9f);
                    LegendAndroidGame.genesisChFortyThree.setVolume(0.9f);
                    LegendAndroidGame.genesisChFortyFour.setVolume(0.9f);
                    LegendAndroidGame.genesisChFortyFive.setVolume(0.9f);
                    LegendAndroidGame.genesisChFortySix.setVolume(0.9f);
                    LegendAndroidGame.genesisChFortySeven.setVolume(0.9f);
                    LegendAndroidGame.genesisChFortyEight.setVolume(0.9f);
                    LegendAndroidGame.genesisChFortyNine.setVolume(0.9f);
                    LegendAndroidGame.genesisChFifty.setVolume(0.9f);

                    LegendAndroidGame.exodusChOne.setVolume(0.9f);
                    LegendAndroidGame.exodusChTwo.setVolume(0.9f);
                    LegendAndroidGame.exodusChThree.setVolume(0.9f);
                    LegendAndroidGame.exodusChFour.setVolume(0.9f);
                    LegendAndroidGame.exodusChFive.setVolume(0.9f);
                    LegendAndroidGame.exodusChSix.setVolume(0.9f);
                    LegendAndroidGame.exodusChSeven.setVolume(0.9f);
                    LegendAndroidGame.exodusChEight.setVolume(0.9f);
                    LegendAndroidGame.exodusChNine.setVolume(0.9f);
                    LegendAndroidGame.exodusChTen.setVolume(0.9f);

                    LegendAndroidGame.exodusChEleven.setVolume(0.9f);
                    LegendAndroidGame.exodusChTwelve.setVolume(0.9f);
                    LegendAndroidGame.exodusChThirteen.setVolume(0.9f);
                    LegendAndroidGame.exodusChFourteen.setVolume(0.9f);
                    LegendAndroidGame.exodusChFifteen.setVolume(0.9f);
                    LegendAndroidGame.exodusChSixteen.setVolume(0.9f);
                    LegendAndroidGame.exodusChSeventeen.setVolume(0.9f);
                    LegendAndroidGame.exodusChEighteen.setVolume(0.9f);
                    LegendAndroidGame.exodusChNineteen.setVolume(0.9f);
                    LegendAndroidGame.exodusChTwenty.setVolume(0.9f);

                    LegendAndroidGame.exodusChTwentyOne.setVolume(0.9f);
                    LegendAndroidGame.exodusChTwentyTwo.setVolume(0.9f);
                    LegendAndroidGame.exodusChTwentyThree.setVolume(0.9f);
                    LegendAndroidGame.exodusChTwentyFour.setVolume(0.9f);
                    LegendAndroidGame.exodusChTwentyFive.setVolume(0.9f);
                    LegendAndroidGame.exodusChTwentySix.setVolume(0.9f);
                    LegendAndroidGame.exodusChTwentySeven.setVolume(0.9f);
                    LegendAndroidGame.exodusChTwentyEight.setVolume(0.9f);
                    LegendAndroidGame.exodusChTwentyNine.setVolume(0.9f);
                    LegendAndroidGame.exodusChThirty.setVolume(0.9f);

                    LegendAndroidGame.exodusChThirtyOne.setVolume(0.9f);
                    LegendAndroidGame.exodusChThirtyTwo.setVolume(0.9f);
                    LegendAndroidGame.exodusChThirtyThree.setVolume(0.9f);
                    LegendAndroidGame.exodusChThirtyFour.setVolume(0.9f);
                    LegendAndroidGame.exodusChThirtyFive.setVolume(0.9f);
                    LegendAndroidGame.exodusChThirtySix.setVolume(0.9f);
                    LegendAndroidGame.exodusChThirtySeven.setVolume(0.9f);
                    LegendAndroidGame.exodusChThirtyEight.setVolume(0.9f);
                    LegendAndroidGame.exodusChThirtyNine.setVolume(0.9f);
                    LegendAndroidGame.exodusChForty.setVolume(0.9f);

                    LegendAndroidGame.leviticusChOne.setVolume(0.9f);
                    LegendAndroidGame.leviticusChTwo.setVolume(0.9f);
                    LegendAndroidGame.leviticusChThree.setVolume(0.9f);
                    LegendAndroidGame.leviticusChFour.setVolume(0.9f);
                    LegendAndroidGame.leviticusChFive.setVolume(0.9f);
                    LegendAndroidGame.leviticusChSix.setVolume(0.9f);
                    LegendAndroidGame.leviticusChSeven.setVolume(0.9f);
                    LegendAndroidGame.leviticusChEight.setVolume(0.9f);
                    LegendAndroidGame.leviticusChNine.setVolume(0.9f);
                    LegendAndroidGame.leviticusChTen.setVolume(0.9f);

                    LegendAndroidGame.leviticusChEleven.setVolume(0.9f);
                    LegendAndroidGame.leviticusChTwelve.setVolume(0.9f);
                    LegendAndroidGame.leviticusChThirteen.setVolume(0.9f);
                    LegendAndroidGame.leviticusChFourteen.setVolume(0.9f);
                    LegendAndroidGame.leviticusChFifteen.setVolume(0.9f);
                    LegendAndroidGame.leviticusChSixteen.setVolume(0.9f);
                    LegendAndroidGame.leviticusChSeventeen.setVolume(0.9f);
                    LegendAndroidGame.leviticusChEighteen.setVolume(0.9f);
                    LegendAndroidGame.leviticusChNineteen.setVolume(0.9f);
                    LegendAndroidGame.leviticusChTwenty.setVolume(0.9f);

                    LegendAndroidGame.leviticusChTwentyOne.setVolume(0.9f);
                    LegendAndroidGame.leviticusChTwentyTwo.setVolume(0.9f);
                    LegendAndroidGame.leviticusChTwentyThree.setVolume(0.9f);
                    LegendAndroidGame.leviticusChTwentyFour.setVolume(0.9f);
                    LegendAndroidGame.leviticusChTwentyFive.setVolume(0.9f);
                    LegendAndroidGame.leviticusChTwentySix.setVolume(0.9f);
                    LegendAndroidGame.leviticusChTwentySeven.setVolume(0.9f);

                    LegendAndroidGame.numbersChOne.setVolume(0.9f);
                    LegendAndroidGame.numbersChTwo.setVolume(0.9f);
                    LegendAndroidGame.numbersChThree.setVolume(0.9f);
                    LegendAndroidGame.numbersChFour.setVolume(0.9f);
                    LegendAndroidGame.numbersChFive.setVolume(0.9f);
                    LegendAndroidGame.numbersChSix.setVolume(0.9f);
                    LegendAndroidGame.numbersChSeven.setVolume(0.9f);
                    LegendAndroidGame.numbersChEight.setVolume(0.9f);
                    LegendAndroidGame.numbersChNine.setVolume(0.9f);
                    LegendAndroidGame.numbersChTen.setVolume(0.9f);

                    LegendAndroidGame.numbersChEleven.setVolume(0.9f);
                    LegendAndroidGame.numbersChTwelve.setVolume(0.9f);
                    LegendAndroidGame.numbersChThirteen.setVolume(0.9f);
                    LegendAndroidGame.numbersChFourteen.setVolume(0.9f);
                    LegendAndroidGame.numbersChFifteen.setVolume(0.9f);
                    LegendAndroidGame.numbersChSixteen.setVolume(0.9f);
                    LegendAndroidGame.numbersChSeventeen.setVolume(0.9f);
                    LegendAndroidGame.numbersChEighteen.setVolume(0.9f);
                    LegendAndroidGame.numbersChNineteen.setVolume(0.9f);
                    LegendAndroidGame.numbersChTwenty.setVolume(0.9f);

                    LegendAndroidGame.numbersChTwentyOne.setVolume(0.9f);
                    LegendAndroidGame.numbersChTwentyTwo.setVolume(0.9f);
                    LegendAndroidGame.numbersChTwentyThree.setVolume(0.9f);
                    LegendAndroidGame.numbersChTwentyFour.setVolume(0.9f);
                    LegendAndroidGame.numbersChTwentyFive.setVolume(0.9f);
                    LegendAndroidGame.numbersChTwentySix.setVolume(0.9f);
                    LegendAndroidGame.numbersChTwentySeven.setVolume(0.9f);
                    LegendAndroidGame.numbersChTwentyEight.setVolume(0.9f);
                    LegendAndroidGame.numbersChTwentyNine.setVolume(0.9f);
                    LegendAndroidGame.numbersChThirty.setVolume(0.9f);

                    LegendAndroidGame.numbersChThirtyOne.setVolume(0.9f);
                    LegendAndroidGame.numbersChThirtyTwo.setVolume(0.9f);
                    LegendAndroidGame.numbersChThirtyThree.setVolume(0.9f);
                    LegendAndroidGame.numbersChThirtyFour.setVolume(0.9f);
                    LegendAndroidGame.numbersChThirtyFive.setVolume(0.9f);
                    LegendAndroidGame.numbersChThirtySix.setVolume(0.9f);

                    LegendAndroidGame.deuteronomyChOne.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTwo.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChThree.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChFour.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChFive.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChSix.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChSeven.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChEight.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChNine.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTen.setVolume(0.9f);

                    LegendAndroidGame.deuteronomyChEleven.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTwelve.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChThirteen.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChFourteen.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChFifteen.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChSixteen.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChSeventeen.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChEighteen.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChNineteen.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTwenty.setVolume(0.9f);

                    LegendAndroidGame.deuteronomyChTwentyOne.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTwentyTwo.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTwentyThree.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTwentyFour.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTwentyFive.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTwentySix.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTwentySeven.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTwentyEight.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChTwentyNine.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChThirty.setVolume(0.9f);

                    LegendAndroidGame.deuteronomyChThirtyOne.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChThirtyTwo.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChThirtyThree.setVolume(0.9f);
                    LegendAndroidGame.deuteronomyChThirtyFour.setVolume(0.9f);

                    LegendAndroidGame.joshuaChOne.setVolume(0.9f);
                    LegendAndroidGame.joshuaChTwo.setVolume(0.9f);
                    LegendAndroidGame.joshuaChThree.setVolume(0.9f);
                    LegendAndroidGame.joshuaChFour.setVolume(0.9f);
                    LegendAndroidGame.joshuaChFive.setVolume(0.9f);
                    LegendAndroidGame.joshuaChSix.setVolume(0.9f);
                    LegendAndroidGame.joshuaChSeven.setVolume(0.9f);
                    LegendAndroidGame.joshuaChEight.setVolume(0.9f);
                    LegendAndroidGame.joshuaChNine.setVolume(0.9f);
                    LegendAndroidGame.joshuaChTen.setVolume(0.9f);

                    LegendAndroidGame.joshuaChEleven.setVolume(0.9f);
                    LegendAndroidGame.joshuaChTwelve.setVolume(0.9f);
                    LegendAndroidGame.joshuaChThirteen.setVolume(0.9f);
                    LegendAndroidGame.joshuaChFourteen.setVolume(0.9f);
                    LegendAndroidGame.joshuaChFifteen.setVolume(0.9f);
                    LegendAndroidGame.joshuaChSixteen.setVolume(0.9f);
                    LegendAndroidGame.joshuaChSeventeen.setVolume(0.9f);
                    LegendAndroidGame.joshuaChEighteen.setVolume(0.9f);
                    LegendAndroidGame.joshuaChNineteen.setVolume(0.9f);
                    LegendAndroidGame.joshuaChTwenty.setVolume(0.9f);

                    LegendAndroidGame.joshuaChTwentyOne.setVolume(0.9f);
                    LegendAndroidGame.joshuaChTwentyTwo.setVolume(0.9f);
                    LegendAndroidGame.joshuaChTwentyThree.setVolume(0.9f);
                    LegendAndroidGame.joshuaChTwentyFour.setVolume(0.9f);



                }
                else if (voiceSlider.getValue() == 20) {

                    LegendAndroidGame.genesisChOne.setVolume(1);
                    LegendAndroidGame.genesisChTwo.setVolume(1);
                    LegendAndroidGame.genesisChThree.setVolume(1);
                    LegendAndroidGame.genesisChFour.setVolume(1);
                    LegendAndroidGame.genesisChFive.setVolume(1);
                    LegendAndroidGame.genesisChSix.setVolume(1);
                    LegendAndroidGame.genesisChSeven.setVolume(1);
                    LegendAndroidGame.genesisChEight.setVolume(1);
                    LegendAndroidGame.genesisChNine.setVolume(1);
                    LegendAndroidGame.genesisChTen.setVolume(1);
                    LegendAndroidGame.genesisChEleven.setVolume(1);
                    LegendAndroidGame.genesisChTwelve.setVolume(1);
                    LegendAndroidGame.genesisChThirteen.setVolume(1);
                    LegendAndroidGame.genesisChFourteen.setVolume(1);
                    LegendAndroidGame.genesisChFifteen.setVolume(1);
                    LegendAndroidGame.genesisChSixteen.setVolume(1);
                    LegendAndroidGame.genesisChSeventeen.setVolume(1);
                    LegendAndroidGame.genesisChEighteen.setVolume(1);
                    LegendAndroidGame.genesisChNineteen.setVolume(1);
                    LegendAndroidGame.genesisChTwenty.setVolume(1);

                    LegendAndroidGame.genesisChTwentyOne.setVolume(1);
                    LegendAndroidGame.genesisChTwentyTwo.setVolume(1);
                    LegendAndroidGame.genesisChTwentyThree.setVolume(1);
                    LegendAndroidGame.genesisChTwentyFour.setVolume(1);
                    LegendAndroidGame.genesisChTwentyFive.setVolume(1);
                    LegendAndroidGame.genesisChTwentySix.setVolume(1);
                    LegendAndroidGame.genesisChTwentySeven.setVolume(1);
                    LegendAndroidGame.genesisChTwentyEight.setVolume(1);
                    LegendAndroidGame.genesisChTwentyNine.setVolume(1);
                    LegendAndroidGame.genesisChThirtyOne.setVolume(1);
                    LegendAndroidGame.genesisChThirtyTwo.setVolume(1);
                    LegendAndroidGame.genesisChThirtyThree.setVolume(1);
                    LegendAndroidGame.genesisChThirtyFour.setVolume(1);
                    LegendAndroidGame.genesisChThirtyFive.setVolume(1);
                    LegendAndroidGame.genesisChThirtySix.setVolume(1);
                    LegendAndroidGame.genesisChThirtySeven.setVolume(1);
                    LegendAndroidGame.genesisChThirtyEight.setVolume(1);
                    LegendAndroidGame.genesisChThirtyNine.setVolume(1);
                    LegendAndroidGame.genesisChForty.setVolume(1);

                    LegendAndroidGame.genesisChFortyOne.setVolume(1);
                    LegendAndroidGame.genesisChFortyTwo.setVolume(1);
                    LegendAndroidGame.genesisChFortyThree.setVolume(1);
                    LegendAndroidGame.genesisChFortyFour.setVolume(1);
                    LegendAndroidGame.genesisChFortyFive.setVolume(1);
                    LegendAndroidGame.genesisChFortySix.setVolume(1);
                    LegendAndroidGame.genesisChFortySeven.setVolume(1);
                    LegendAndroidGame.genesisChFortyEight.setVolume(1);
                    LegendAndroidGame.genesisChFortyNine.setVolume(1);
                    LegendAndroidGame.genesisChFifty.setVolume(1);

                    LegendAndroidGame.exodusChOne.setVolume(1);
                    LegendAndroidGame.exodusChTwo.setVolume(1);
                    LegendAndroidGame.exodusChThree.setVolume(1);
                    LegendAndroidGame.exodusChFour.setVolume(1);
                    LegendAndroidGame.exodusChFive.setVolume(1);
                    LegendAndroidGame.exodusChSix.setVolume(1);
                    LegendAndroidGame.exodusChSeven.setVolume(1);
                    LegendAndroidGame.exodusChEight.setVolume(1);
                    LegendAndroidGame.exodusChNine.setVolume(1);
                    LegendAndroidGame.exodusChTen.setVolume(1);

                    LegendAndroidGame.exodusChEleven.setVolume(1);
                    LegendAndroidGame.exodusChTwelve.setVolume(1);
                    LegendAndroidGame.exodusChThirteen.setVolume(1);
                    LegendAndroidGame.exodusChFourteen.setVolume(1);
                    LegendAndroidGame.exodusChFifteen.setVolume(1);
                    LegendAndroidGame.exodusChSixteen.setVolume(1);
                    LegendAndroidGame.exodusChSeventeen.setVolume(1);
                    LegendAndroidGame.exodusChEighteen.setVolume(1);
                    LegendAndroidGame.exodusChNineteen.setVolume(1);
                    LegendAndroidGame.exodusChTwenty.setVolume(1);

                    LegendAndroidGame.exodusChTwentyOne.setVolume(1);
                    LegendAndroidGame.exodusChTwentyTwo.setVolume(1);
                    LegendAndroidGame.exodusChTwentyThree.setVolume(1);
                    LegendAndroidGame.exodusChTwentyFour.setVolume(1);
                    LegendAndroidGame.exodusChTwentyFive.setVolume(1);
                    LegendAndroidGame.exodusChTwentySix.setVolume(1);
                    LegendAndroidGame.exodusChTwentySeven.setVolume(1);
                    LegendAndroidGame.exodusChTwentyEight.setVolume(1);
                    LegendAndroidGame.exodusChTwentyNine.setVolume(1);
                    LegendAndroidGame.exodusChThirty.setVolume(1);

                    LegendAndroidGame.exodusChThirtyOne.setVolume(1);
                    LegendAndroidGame.exodusChThirtyTwo.setVolume(1);
                    LegendAndroidGame.exodusChThirtyThree.setVolume(1);
                    LegendAndroidGame.exodusChThirtyFour.setVolume(1);
                    LegendAndroidGame.exodusChThirtyFive.setVolume(1);
                    LegendAndroidGame.exodusChThirtySix.setVolume(1);
                    LegendAndroidGame.exodusChThirtySeven.setVolume(1);
                    LegendAndroidGame.exodusChThirtyEight.setVolume(1);
                    LegendAndroidGame.exodusChThirtyNine.setVolume(1);
                    LegendAndroidGame.exodusChForty.setVolume(1);

                    LegendAndroidGame.leviticusChOne.setVolume(1);
                    LegendAndroidGame.leviticusChTwo.setVolume(1);
                    LegendAndroidGame.leviticusChThree.setVolume(1);
                    LegendAndroidGame.leviticusChFour.setVolume(1);
                    LegendAndroidGame.leviticusChFive.setVolume(1);
                    LegendAndroidGame.leviticusChSix.setVolume(1);
                    LegendAndroidGame.leviticusChSeven.setVolume(1);
                    LegendAndroidGame.leviticusChEight.setVolume(1);
                    LegendAndroidGame.leviticusChNine.setVolume(1);
                    LegendAndroidGame.leviticusChTen.setVolume(1);

                    LegendAndroidGame.leviticusChEleven.setVolume(1);
                    LegendAndroidGame.leviticusChTwelve.setVolume(1);
                    LegendAndroidGame.leviticusChThirteen.setVolume(1);
                    LegendAndroidGame.leviticusChFourteen.setVolume(1);
                    LegendAndroidGame.leviticusChFifteen.setVolume(1);
                    LegendAndroidGame.leviticusChSixteen.setVolume(1);
                    LegendAndroidGame.leviticusChSeventeen.setVolume(1);
                    LegendAndroidGame.leviticusChEighteen.setVolume(1);
                    LegendAndroidGame.leviticusChNineteen.setVolume(1);
                    LegendAndroidGame.leviticusChTwenty.setVolume(1);

                    LegendAndroidGame.leviticusChTwentyOne.setVolume(1);
                    LegendAndroidGame.leviticusChTwentyTwo.setVolume(1);
                    LegendAndroidGame.leviticusChTwentyThree.setVolume(1);
                    LegendAndroidGame.leviticusChTwentyFour.setVolume(1);
                    LegendAndroidGame.leviticusChTwentyFive.setVolume(1);
                    LegendAndroidGame.leviticusChTwentySix.setVolume(1);
                    LegendAndroidGame.leviticusChTwentySeven.setVolume(1);

                    LegendAndroidGame.numbersChOne.setVolume(1);
                    LegendAndroidGame.numbersChTwo.setVolume(1);
                    LegendAndroidGame.numbersChThree.setVolume(1);
                    LegendAndroidGame.numbersChFour.setVolume(1);
                    LegendAndroidGame.numbersChFive.setVolume(1);
                    LegendAndroidGame.numbersChSix.setVolume(1);
                    LegendAndroidGame.numbersChSeven.setVolume(1);
                    LegendAndroidGame.numbersChEight.setVolume(1);
                    LegendAndroidGame.numbersChNine.setVolume(1);
                    LegendAndroidGame.numbersChTen.setVolume(1);

                    LegendAndroidGame.numbersChEleven.setVolume(1);
                    LegendAndroidGame.numbersChTwelve.setVolume(1);
                    LegendAndroidGame.numbersChThirteen.setVolume(1);
                    LegendAndroidGame.numbersChFourteen.setVolume(1);
                    LegendAndroidGame.numbersChFifteen.setVolume(1);
                    LegendAndroidGame.numbersChSixteen.setVolume(1);
                    LegendAndroidGame.numbersChSeventeen.setVolume(1);
                    LegendAndroidGame.numbersChEighteen.setVolume(1);
                    LegendAndroidGame.numbersChNineteen.setVolume(1);
                    LegendAndroidGame.numbersChTwenty.setVolume(1);

                    LegendAndroidGame.numbersChTwentyOne.setVolume(1);
                    LegendAndroidGame.numbersChTwentyTwo.setVolume(1);
                    LegendAndroidGame.numbersChTwentyThree.setVolume(1);
                    LegendAndroidGame.numbersChTwentyFour.setVolume(1);
                    LegendAndroidGame.numbersChTwentyFive.setVolume(1);
                    LegendAndroidGame.numbersChTwentySix.setVolume(1);
                    LegendAndroidGame.numbersChTwentySeven.setVolume(1);
                    LegendAndroidGame.numbersChTwentyEight.setVolume(1);
                    LegendAndroidGame.numbersChTwentyNine.setVolume(1);
                    LegendAndroidGame.numbersChThirty.setVolume(1);

                    LegendAndroidGame.numbersChThirtyOne.setVolume(1);
                    LegendAndroidGame.numbersChThirtyTwo.setVolume(1);
                    LegendAndroidGame.numbersChThirtyThree.setVolume(1);
                    LegendAndroidGame.numbersChThirtyFour.setVolume(1);
                    LegendAndroidGame.numbersChThirtyFive.setVolume(1);
                    LegendAndroidGame.numbersChThirtySix.setVolume(1);

                    LegendAndroidGame.deuteronomyChOne.setVolume(1);
                    LegendAndroidGame.deuteronomyChTwo.setVolume(1);
                    LegendAndroidGame.deuteronomyChThree.setVolume(1);
                    LegendAndroidGame.deuteronomyChFour.setVolume(1);
                    LegendAndroidGame.deuteronomyChFive.setVolume(1);
                    LegendAndroidGame.deuteronomyChSix.setVolume(1);
                    LegendAndroidGame.deuteronomyChSeven.setVolume(1);
                    LegendAndroidGame.deuteronomyChEight.setVolume(1);
                    LegendAndroidGame.deuteronomyChNine.setVolume(1);
                    LegendAndroidGame.deuteronomyChTen.setVolume(1);

                    LegendAndroidGame.deuteronomyChEleven.setVolume(1);
                    LegendAndroidGame.deuteronomyChTwelve.setVolume(1);
                    LegendAndroidGame.deuteronomyChThirteen.setVolume(1);
                    LegendAndroidGame.deuteronomyChFourteen.setVolume(1);
                    LegendAndroidGame.deuteronomyChFifteen.setVolume(1);
                    LegendAndroidGame.deuteronomyChSixteen.setVolume(1);
                    LegendAndroidGame.deuteronomyChSeventeen.setVolume(1);
                    LegendAndroidGame.deuteronomyChEighteen.setVolume(1);
                    LegendAndroidGame.deuteronomyChNineteen.setVolume(1);
                    LegendAndroidGame.deuteronomyChTwenty.setVolume(1);

                    LegendAndroidGame.deuteronomyChTwentyOne.setVolume(1);
                    LegendAndroidGame.deuteronomyChTwentyTwo.setVolume(1);
                    LegendAndroidGame.deuteronomyChTwentyThree.setVolume(1);
                    LegendAndroidGame.deuteronomyChTwentyFour.setVolume(1);
                    LegendAndroidGame.deuteronomyChTwentyFive.setVolume(1);
                    LegendAndroidGame.deuteronomyChTwentySix.setVolume(1);
                    LegendAndroidGame.deuteronomyChTwentySeven.setVolume(1);
                    LegendAndroidGame.deuteronomyChTwentyEight.setVolume(1);
                    LegendAndroidGame.deuteronomyChTwentyNine.setVolume(1);
                    LegendAndroidGame.deuteronomyChThirty.setVolume(1);

                    LegendAndroidGame.deuteronomyChThirtyOne.setVolume(1);
                    LegendAndroidGame.deuteronomyChThirtyTwo.setVolume(1);
                    LegendAndroidGame.deuteronomyChThirtyThree.setVolume(1);
                    LegendAndroidGame.deuteronomyChThirtyFour.setVolume(1);

                    LegendAndroidGame.joshuaChOne.setVolume(1);
                    LegendAndroidGame.joshuaChTwo.setVolume(1);
                    LegendAndroidGame.joshuaChThree.setVolume(1);
                    LegendAndroidGame.joshuaChFour.setVolume(1);
                    LegendAndroidGame.joshuaChFive.setVolume(1);
                    LegendAndroidGame.joshuaChSix.setVolume(1);
                    LegendAndroidGame.joshuaChSeven.setVolume(1);
                    LegendAndroidGame.joshuaChEight.setVolume(1);
                    LegendAndroidGame.joshuaChNine.setVolume(1);
                    LegendAndroidGame.joshuaChTen.setVolume(1);

                    LegendAndroidGame.joshuaChEleven.setVolume(1);
                    LegendAndroidGame.joshuaChTwelve.setVolume(1);
                    LegendAndroidGame.joshuaChThirteen.setVolume(1);
                    LegendAndroidGame.joshuaChFourteen.setVolume(1);
                    LegendAndroidGame.joshuaChFifteen.setVolume(1);
                    LegendAndroidGame.joshuaChSixteen.setVolume(1);
                    LegendAndroidGame.joshuaChSeventeen.setVolume(1);
                    LegendAndroidGame.joshuaChEighteen.setVolume(1);
                    LegendAndroidGame.joshuaChNineteen.setVolume(1);
                    LegendAndroidGame.joshuaChTwenty.setVolume(1);

                    LegendAndroidGame.joshuaChTwentyOne.setVolume(1);
                    LegendAndroidGame.joshuaChTwentyTwo.setVolume(1);
                    LegendAndroidGame.joshuaChTwentyThree.setVolume(1);
                    LegendAndroidGame.joshuaChTwentyFour.setVolume(1);

                }


            }
        });


        backBtn.addListener(new ClickListener(){
            @Override
            public void touchUp(InputEvent e, float x, float y, int point, int button){
                gsm.set(new GameMenu(gsm));
                dispose();
            }
        });

        stage.addActor(background);
        stage.addActor(backBtn);
        stage.addActor(musicSlider);
        stage.addActor(voiceSlider);
        stage.addActor(sound);
        stage.addActor(MusicIcon1);
        stage.addActor(MusicIcon2);
        stage.addActor(MusicIcon3);
    }


    @Override
    protected void handleInput() {

        if (Gdx.input.isKeyJustPressed(Input.Keys.P)){
//            LegendAndroidGame.joshuaChEight.play();
        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){
            LegendAndroidGame.clickSound.play(1);
        }
    }

    @Override
    public void update(float dt) {
        handleInput();

    }

    @Override
    public void render(SpriteBatch sb) {

        stage.act();
        stage.draw();
    }

    @Override
    public void dispose() {
        bg.dispose();
        musicIcon.dispose();
        musicBG.dispose();
        musicknob.dispose();
        back.dispose();
    }

    @Override
    public void resize(int width, int height) {

    }
}

