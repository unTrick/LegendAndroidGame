package com.legendandroidgame.game.BibleBooks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Container;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ScissorStack;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.legendandroidgame.game.Buttons.SimpleDirectionGestureDetector;
import com.legendandroidgame.game.LegendAndroidGame;

/**
 * Created by Patrick on 5/2/2017.
 */
public class BookOfLeviticus {
    
    private Stage stage;
    private OrthographicCamera camera;

    BitmapFont contentFont;

    private Label txtFirstContent, txtSecondContent, txtThirdContent, txtFourthContent, txtFifthContent, txtSixthContent, txtSeventhContent, txtEightContent;
    private Label lblFirstTitle, lblSecondTitle, lblThirdTitle, lblFourthTitle, lblFifthTitle, lblSixthTitle, lblSeventhTitle, lblEightTitle;

    private Texture tableBG;

    private Table table1, table2, table3, table4, table5, table6, table7, table8, table9, table10, table11, table12,
            table13, table14, table15, table16, table17, table18, table19, table20, table21, table22, table23,
            table24, table25, table26, table27;


    public BookOfLeviticus() {

        // loading of image
        if(Gdx.graphics.getWidth() > 1800){
            tableBG = new Texture("1080/skin/Content Box.png");
        }
        else{
            tableBG = new Texture("720/skin/Content Box.png");
        }

        
        camera = new OrthographicCamera();
        camera.setToOrtho(false, LegendAndroidGame.WIDTH, LegendAndroidGame.HEIGHT);
        stage = new Stage(new ScreenViewport(camera));

        FileHandle fontFile = Gdx.files.internal("font/Fluent_SitkaSmall.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);

        FreeTypeFontGenerator.FreeTypeFontParameter contentParameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        contentParameter.size = 18;
        contentFont = generator.generateFont(contentParameter);


        chapterOneOFLeviticus();
        chapterTwoOFLeviticus();
        chapterThreeOFLeviticus();
        chapterFourOFLeviticus();
        chapterFiveOFLeviticus();
        chapterSixOFLeviticus();
        chapterSevenOFLeviticus();
        chapterEightOFLeviticus();
        chapterNineOFLeviticus();
        chapterTenOFLeviticus();
        chapterElevenOFLeviticus();
        chapterTwelveOFLeviticus();
        chapterThirteenOFLeviticus();
        chapterFourteenOFLeviticus();
        chapterFifteenOFLeviticus();
        chapterSixteenOFLeviticus();
        chapterSeventeenOFLeviticus();
        chapterEighteenOFLeviticus();
        chapterNineteenOFLeviticus();
        chapterTwentyOFLeviticus();
        chapterTwentyOneOFLeviticus();
        chapterTwentyTwoOFLeviticus();
        chapterTwentyThreeOFLeviticus();
        chapterTwentyFourOFLeviticus();
        chapterTwentyFiveOFLeviticus();
        chapterTwentySixOFLeviticus();
        chapterTwentySevenOFLeviticus();


    }

    public void chapterOneOFLeviticus() {

        table1 = new Table();
        table1.setWidth(tableBG.getWidth());
        table1.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table1.setFillParent(true);
        table1.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws for Burnt Offerings";

        String firstContent = "1 The LORD called Moses and spoke to him from the tent of meeting, saying, \n" +
                "2 “Speak to the people of Israel and say to them, When any one of you brings an offering to the LORD, \n" +
                "you shall bring your offering of livestock from the herd or from the flock.\n" +
                "3 “If his offering is a burnt offering from the herd, he shall offer a male without blemish. \n" +
                "He shall bring it to the entrance of the tent of meeting, that he may be accepted before the LORD. \n" +
                "4 He shall lay his hand on the head of the burnt offering, and it shall be accepted for him to make atonement for him. \n" +
                "5 Then he shall kill the bull before the LORD, and Aaron's sons the priests shall bring the blood and throw the blood \n" +
                "against the sides of the altar that is at the entrance of the tent of meeting. \n" +
                "6 Then he shall flay the burnt offering and cut it into pieces,\n" +
                "7 and the sons of Aaron the priest shall put fire on the altar and arrange wood on the fire. \n" +
                "8 And Aaron's sons the priests shall arrange the pieces, the head, and the fat, on the wood that is on the fire on the altar; \n" +
                "9 but its entrails and its legs he shall wash with water. And the priest shall burn all of it on the altar, as ja burnt offering, \n" +
                "a food offering1 with a pleasing aroma to the LORD.\n" +
                "10 “If his gift for a burnt offering is from the flock, from the sheep or goats, he shall bring a male without blemish, \n" +
                "11 land he shall kill it on the north side of the altar before the LORD, and Aaron's sons the priests shall throw its blood against the sides \n" +
                "of the altar. \n" +
                "12 And he shall cut it into pieces, with its head and its fat, and the priest shall arrange them on the wood that is on the fire on the altar, \n" +
                "13 but the entrails and the legs he shall wash with water. And the priest shall offer all of it and burn it on the altar; \n" +
                "it is ja burnt offering, a food offering with a pleasing aroma to the LORD.\n" +
                "14 “If his offering to the LORD is a burnt offering of birds, then he shall bring his offering of turtledoves or pigeons. \n" +
                "15 And the priest shall bring it to the altar and wring off its head and burn it on the altar. \n" +
                "Its blood shall be drained out on the side of the altar. \n" +
                "16 He shall remove its crop with its content and cast it beside the altar on the east side, in the place for ashes. \n" +
                "17 He shall tear it open by its wings, but shall not sever it completely. And the priest shall burn it on the altar, \n" +
                "on the wood that is on the fire. It is a burnt offering, a food offering with a pleasing aroma to the LORD.\n";
  

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table1.add(lblFirstTitle).pad(10,50,0,0).left();
        table1.row();

        //content of the chapter
        table1.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table1);

    }


    public void chapterTwoOFLeviticus() {

        table2 = new Table();
        table2.setWidth(tableBG.getWidth());
        table2.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table2.setFillParent(true);
        table2.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws for Grain Offerings";

        String firstContent =  "1  “When anyone brings a grain offering as an offering to the LORD, his offering shall be of fine flour. \n" +
                "He shall pour oil on it and put frankincense on it \n" +
                "2 and bring it to Aaron's sons the priests. And he shall take from it a handful of the fine flour and oil, with all of its frankincense, \n" +
                "and the priest shall burn this as its memorial portion on the altar, a food offering with a pleasing aroma to the LORD. \n" +
                "3 But the rest of the grain offering shall be for Aaron and his sons; uit is a most holy part of the LORD's food offerings.\n" +
                "4 “When you bring a grain offering baked in the oven as an offering, \n" +
                "it shall be unleavened loaves of fine flour mixed with oil or unleavened wafers smeared with oil.\n" +
                "5 And if your offering is a grain offering baked on a griddle, it shall be of fine flour unleavened, mixed with oil. \n" +
                "6 You shall break it in pieces and pour oil on it; it is a grain offering. \n" +
                "7 And if your offering is a grain offering cooked in a pan, it shall be made of fine flour with oil. \n" +
                "8 And you shall bring the grain offering that is made of these things to the LORD, and when it is presented to the priest, \n" +
                "he shall bring it to the altar. \n" +
                "9 And the priest shall take from the grain offering its memorial portion and burn this on the altar, \n" +
                "a food offering with a pleasing aroma to the LORD. \n" +
                "10 But the rest of the grain offering shall be for Aaron and his sons; \n" +
                "it is a most holy part of the LORD's food offerings.\n" +
                "11 “No grain offering that you bring to the LORD shall be made with leaven, \n" +
                "for you shall burn no leaven nor any honey as a food offering to the LORD. \n" +
                "12 As an offering of first fruits you may bring them to the LORD, but they shall not be offered on the altar for a pleasing aroma.\n" +
                "13 You shall season all your grain offerings with salt. You shall not let the salt of the covenant with your God be missing from \n" +
                "your grain offering; with all your offerings you shall offer salt.\n" +
                "14 “If you offer a grain offering of first fruits to the LORD, you shall offer for the grain offering of your first fruits fresh fears,\n" +
                " roasted with fire, crushed new grain. \n" +
                "15 And you shall put oil on it and lay frankincense on it; it is a grain offering. \n" +
                "16 And the priest shall burn as its memorial portion some of the crushed grain and some of the oil with all of its frankincense; \n" +
                "it is a food offering to the LORD.\n";

        
        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table2.add(lblFirstTitle).pad(10,50,0,0).left();
        table2.row();

        //content of the chapter
        table2.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table2);


    }


    public void chapterThreeOFLeviticus() {

        table3 = new Table();
        table3.setWidth(tableBG.getWidth());
        table3.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table3.setFillParent(true);
        table3.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws for Peace Offerings";

        String firstContent =  "1 “If his offering is a sacrifice of peace offering, if he offers an animal from the herd, male or female, \n" +
                "he shall offer it without blemish before the LORD. \n" +
                "2 And he shall lay his hand on the head of his offering and kill it at the entrance of the tent of meeting, \n" +
                "and Aaron's sons the priests shall throw the blood against the sides of the altar. \n" +
                "3 And from the sacrifice of the peace offering, as a food offering to the LORD, he shall offer the fat covering the entrails \n" +
                "and all the fat that is on the entrails,\n" +
                "4 and the two kidneys with the fat that is on them at the loins, and the long lobe of the liver that he shall remove with the kidneys. \n" +
                "5 Then Aaron's sons shall burn it on the altar on top of the burnt offering, which is on the wood on the fire; \n" +
                "it is a food offering with a pleasing aroma to the LORD.\n" +
                "6 “If his offering for a sacrifice of peace offering to the LORD is an animal from the flock, male or female, he shall offer it without blemish.\n" +
                "7 If he offers a lamb for his offering, then he shall offer it before theLORD, \n" +
                "8 lay his hand on the head of his offering, and kill it in front of the tent of meeting; and Aaron's sons shall \n" +
                "throw its blood against the sides of the altar. \n" +
                "9 Then from the sacrifice of the peace offering he shall offer as a food offering to the LORD its fat; he shall remove the whole fat tail, \n" +
                "cut off close to the backbone, and the fat that covers the entrails and all the fat that is on the entrails \n" +
                "10 and the two kidneys with the fat that is on them at the loins and the long lobe of the liver that he shall remove with the kidneys. \n" +
                "11 And the priest shall burn it on the altar as a food offering to the LORD.\n" +
                "12 “If his offering is a goat, then he shall offer it before the LORD\n" +
                "13 and lay his hand on its head and kill it in front of the tent of meeting, and the sons of Aaron shall \n" +
                "throw its blood against the sides of the altar.\n" +
                "14 Then he shall offer from it, as his offering for a food offering to the LORD, the fat covering the entrails \n" +
                "and all the fat that is on the entrails\n" +
                "15 and the two kidneys with the fat that is on them at the loins and the long lobe of the liver that he shall remove with the kidneys. \n" +
                "16 And the priest shall burn them on the altar as a food offering with a pleasing aroma. All fat is the LORD's. \n" +
                "17 It shall be a statute forever throughout your generations, in all your dwelling places, that you eat neither fat nor blood.”\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table3.add(lblFirstTitle).pad(10,50,0,0).left();
        table3.row();

        //content of the chapter
        table3.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table3);

    }


    public void chapterFourOFLeviticus() {

        table4 = new Table();
        table4.setWidth(tableBG.getWidth());
        table4.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table4.setFillParent(true);
        table4.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws for Sin Offerings";

        String firstContent =  "1 And the LORD spoke to Moses, saying, \n" +
                "2 “Speak to the people of Israel, saying, If anyone sins unintentionally in any of the LORD's commandments about things not to be done, \n" +
                "and does any one of them,\n" +
                "3 if it is the anointed priest who sins, thus bringing guilt on the people, \n" +
                "then he shall offer for the sin that he has committed a bull from the herd without blemish to the LORD for a sin offering.\n" +
                "4 He shall bring the bull to the entrance of the tent of meeting before the LORD \n" +
                "and lay his hand on the head of the bull and kill the bull before the LORD. \n" +
                "5 And the anointed priest shall take some of the blood of the bull and bring it into the tent of meeting, \n" +
                "6 and the priest shall dip his finger in the blood and sprinkle part of the blood seven times \n" +
                "before the LORD in front of the veil of the sanctuary. \n" +
                "7 And the priest shall put some of the blood on the horns of the altar of fragrant incense before the LORD that is in the tent of meeting, \n" +
                "and ball the rest of the blood of the bull he shall pour out at the base of the altar of burnt offering \n" +
                "that is at the entrance of the tent of meeting. \n" +
                "8 And all the fat of the bull of the sin offering he shall remove from it, the fat that covers the entrails \n" +
                "and all the fat that is on the entrails \n" +
                "9 and the two kidneys with the fat that is on them at the loins and the long lobe of the liver that he shall remove with the kidneys\n" +
                "10 (just as these are taken from the ox of the sacrifice of the peace offerings); \n" +
                "and the priest shall burn them on the altar of burnt offering.\n" +
                "11 But the skin of the bull and all its flesh, with its head, its legs, its entrails, and its dung—\n" +
                "12 all the rest of the bull—he shall carry outside the camp to a clean place, to the ash heap, \n" +
                "and shall burn it up on a fire of wood. On the ash heap it shall be burned up.\n" +
                "13 “If the whole congregation of Israel sins and the thing is hidden from the eyes of the assembly, \n" +
                "and they do any one of the things that by the LORD's commandments ought not to be done, and they realize their guilt,\n" +
                "14 when the sin which they have committed becomes known, the assembly shall offer a bull from the herd for a sin offering \n" +
                "and bring it in front of the tent of meeting. \n" +
                "15 And the elders of the congregation shall lay their hands on the head of the bull before the LORD, and the bull shall be killed before the LORD. \n" +
                "16 Then the anointed priest shall bring some of the blood of the bull into the tent of meeting,\n" +
                "17 and the priest shall dip his finger in the blood and sprinkle it seven times before the LORD in front of the veil. \n" +
                "18 And he shall put some of the blood on the horns of the altar that is in the tent of meeting before the LORD,\n" +
                " and the rest of the blood he shall pour out at the base of the altar of burnt offering that is at the entrance of the tent of meeting. \n" +
                "19 And all its fat he shall take from it and burn on the altar. \n" +
                "20 Thus shall he do with the bull. As he did with the bull of the sin offering, so shall he do with this. \n" +
                "And the priest shall make atonement for them, and they shall be forgiven. \n" +
                "21 And he shall carry the bull outside the camp and burn it up as he burned the first bull; it is the sin offering for the assembly.\n" +
                "22 “When a leader sins, doing unintentionally any one of all the things that by the commandments of the LORD his God ought not to be done, \n" +
                "and realizes his guilt, \n" +
                "23 or the sin which he has committed is made known to him, he shall bring as his offering a goat, a male without blemish, \n" +
                "24 and shall lay his hand on the head of the goat and kill it in the place where they kill the burnt offering before the LORD; it is a sin offering. \n" +
                "25 Then the priest shall take some of the blood of the sin offering with his finger and\n" +
                " put it on the horns of the altar of burnt offering and pour out the rest of its blood at the base of the altar of burnt offering. \n" +
                "26 And all its fat he shall burn on the altar, like the fat of the sacrifice of peace offerings. \n" +
                "So the priest shall make atonement for him for his sin, and he shall be forgiven.\n" +
                "27 “If anyone of the common people sins unintentionally in doing any one of the things that by the LORD's commandments ought not to be done, \n" +
                "and realizes his guilt, \n" +
                "28 or the sin which he has committed is made known to him, he shall bring for his offering a goat, a female without blemish, \n" +
                "for his sin which he has committed. 29 And he shall lay his hand on the head of the sin offering \n" +
                "and kill the sin offering in the place of burnt offering. \n" +
                "30 And the priest shall take some of its blood with his finger and put it on the horns of the altar of burnt offering \n" +
                "and pour out all the rest of its blood at the base of the altar. \n" +
                "31 And all its fat he shall remove, as the fat is removed from the peace offerings, and the priest shall burn it \n" +
                "on the altar for a pleasing aroma to the LORD. And the priest shall make atonement for him, and he shall be forgiven.\n" +
                "32 “If he brings a lamb as his offering for a sin offering, he shall bring a female without blemish \n" +
                "33 and lay his hand on the head of the sin offering and kill it for a sin offering in the place where they kill the burnt offering. \n" +
                "34 Then the priest shall take some of the blood of the sin offering with his finger and put it on the horns \n" +
                "of the altar of burnt offering and pour out all the rest of its blood at the base of the altar.\n" +
                "35 And all its fat he shall remove as the fat of the lamb is removed from the sacrifice of peace offerings, \n" +
                "and the priest shall burn it on the altar, on top of the LORD's food offerings. \n" +
                "And the priest shall make atonement for him for the sin which he has committed, and he shall be forgiven.\n";

      

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table4.add(lblFirstTitle).pad(10,50,0,0).left();
        table4.row();

        //content of the chapter
        table4.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table4);

    }


    public void chapterFiveOFLeviticus() {

        table5 = new Table();
        table5.setWidth(tableBG.getWidth());
        table5.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table5.setFillParent(true);
        table5.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent =  "1 “If anyone sins in that he hears a public adjuration to testify, and though he is a witness, \n" +
                "whether he has seen or come to know the matter, yet does not speak, he shall bear his iniquity; \n" +
                "2 or if anyone touches an unclean thing, whether a carcass of an unclean wild animal or a carcass of unclean livestock or a carcass of \n" +
                "unclean swarming things, and it is hidden from him and he has become unclean, and he realizes his guilt; \n" +
                "3 or if he touches human uncleanness, of whatever sort the uncleanness may be with which one becomes unclean, \n" +
                "and it is hidden from him, when he comes to know it, and realizes his guilt; \n" +
                "4 or if anyone utters with his lips a rash oath to do evil or to do good, any sort of rash oath that people swear, \n" +
                "and it is hidden from him, when he comes to know it, and he realizes his guilt in any of these;\n" +
                "5 when he realizes his guilt in any of these and confesses the sin he has committed, \n" +
                "6 he shall bring to the LORD as his compensation1 for the sin that he has committed, \n" +
                "a female from the flock, a lamb or a goat, for a sin offering. And the priest shall make atonement for him for his sin.\n" +
                "7 “But if he cannot afford a lamb, then he shall bring to the LORD as his compensation \n" +
                "for the sin that he has committed two turtledoves or two pigeons,2 one for a sin offering and the other for a burnt offering.\n" +
                "8 He shall bring them to the priest, who shall offer first the one for the sin offering. \n" +
                "He shall wring its head from its neck but shall not sever it completely, \n" +
                "9 and he shall sprinkle some of the blood of the sin offering on the side of the altar, \n" +
                "while the rest of the blood shall be drained out at the base of the altar; it is a sin offering. \n" +
                "10 Then he shall offer the second for a burnt offering according to the rule. \n" +
                "And the priest shall make atonement for him for the sin that he has committed, and he shall be forgiven.\n" +
                "11 “But if he cannot afford two turtledoves or two pigeons, then he shall bring as his offering for the sin that he has committed \n" +
                "a tenth of an ephah3 of fine flour for a sin offering. He shall put no oil on it and shall put no frankincense on it, for it is a sin offering. \n" +
                "12 And he shall bring it to the priest, and the priest shall take a handful of it as its memorial portion and burn this on the altar, \n" +
                "on the LORD's food offerings; it is a sin offering. \n" +
                "13 Thus the priest shall make atonement for him for the sin which he has committed in any one of these things, and he shall be forgiven. \n" +
                "And the remainder4 shall be for the priest, as in the grain offering.”\n";


        String chapterSecondTitle = "Laws for Guilt Offerings";

        String secondContent =  "14 The LORD spoke to Moses, saying, \n" +
                "15 “If anyone commits a breach of faith and sins unintentionally in any of the holy things of the LORD, \n" +
                "he shall bring to the LORD as his compensation, a ram without blemish out of the flock, valued in silver shekels, \n" +
                "according to the shekel of the sanctuary, for a guilt offering. \n" +
                "16 He shall also make restitution for what he has done amiss in the holy thing and shall add a fifth to it and give it to the priest. \n" +
                "And the priest shall make atonement for him with the ram of the guilt offering, and he shall be forgiven.\n" +
                "17 “If anyone sins, doing any of the things that by the LORD's commandments ought not to be done, \n" +
                "though he did not know it, then realizes his guilt, he shall bear his iniquity. \n" +
                "18 He shall bring to the priest a ram without blemish out of the flock, or its equivalent, for a guilt offering,\n" +
                " and the priest shall make atonement for him for the mistake that he made unintentionally, and he shall be forgiven. \n" +
                "19 It is a guilt offering; he has indeed incurred guilt before the LORD.”\n";
        

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table5.add(lblFirstTitle).pad(10,50,0,0).left();
        table5.row();

        //content of the chapter
        table5.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table5.row();

        //title of the second content
        table5.add(lblSecondTitle).pad(10,50,0,0).left();
        table5.row();

        //content of the second title
        table5.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table5);


    }

    public void chapterSixOFLeviticus() {

        table6 = new Table();
        table6.setWidth(tableBG.getWidth());
        table6.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table6.setFillParent(true);
        table6.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent =  "1 The LORD spoke to Moses, saying, \n" +
                "2 “If anyone sins and commits a breach of faith against the LORD by deceiving his neighbor in a matter of deposit or security, \n" +
                "or through robbery, or if he has oppressed his neighbor \n" +
                "3 or has found something lost and lied about it, swearing falsely—in any of all the things that people do and sin thereby—\n" +
                "4 if he has sinned and has realized his guilt and will restore what he took by robbery or what he got by oppression \n" +
                "or the deposit that was committed to him or the lost thing that he found \n" +
                "5 or anything about which he has sworn falsely, he shall restore it in full and shall add a fifth to it, \n" +
                "and give it to him to whom it belongs on the day he realizes his guilt.\n" +
                "6 And he shall bring to the priest as his compensation to the LORD a ram without blemish out of the flock, \n" +
                "or its equivalent, for a guilt offering. \n" +
                "7 And the priest shall make atonement for him before the LORD, and he shall be forgiven for any of the things \n" +
                "that one may do and thereby become guilty.”\n";

        String chapterSecondTitle = "The Priests and the Offerings";

        String secondContent = "8 The LORD spoke to Moses, saying, \n" +
                "9 “Command Aaron and his sons, saying, This is the law of the burnt offering. \n" +
                "The burnt offering shall be on the hearth on the altar all night until the morning, and the fire of the altar shall be kept burning on it. \n" +
                "10 And the priest shall put on his linen garment and put his linen undergarment on his body, \n" +
                "and he shall take up the ashes to which the fire has reduced the burnt offering on the altar and put them beside the altar. \n" +
                "11 Then he shall take off his garments and put on other garments and carry the ashes outside the camp to a clean place. \n" +
                "12 The fire on the altar shall be kept burning on it; it shall not go out. The priest shall burn wood on it every morning, \n" +
                "and he shall arrange the burnt offering on it and shall burn on it the fat of the peace offerings. \n" +
                "13 Fire shall be kept burning on the altar continually; it shall not go out.\n" +
                "14 “And this is the law of the grain offering. The sons of Aaron shall offer it before the LORD in front of the altar. \n" +
                "15 And one shall take from it a handful of the fine flour of the grain offering and its oil and all the frankincense \n" +
                "that is on the grain offering and burn this as its memorial portion on the altar, a pleasing aroma to the LORD. \n" +
                "16 And the rest of it Aaron and his sons shall eat. It shall be eaten unleavened in a holy place. In the court of the tent of meeting \n" +
                "they shall eat it. \n" +
                "17 It shall not be baked with leaven. I have given it as their portion of my food offerings. It is a thing most holy, \n" +
                "like the sin offering and the guilt offering. \n" +
                "18 Every male among the children of Aaron may eat of it, as decreed forever throughout your generations, \n" +
                "from the LORD's food offerings. Whatever touches them shall become holy.”\n" +
                "19 The LORD spoke to Moses, saying, \n" +
                "20 “This is the offering that Aaron and his sons shall offer to the LORD on the day when he is anointed: \n" +
                "a tenth of an ephah of fine flour as a regular grain offering, half of it in the morning and half in the evening. \n" +
                "21 It shall be made with oil on a griddle. You shall bring it well mixed, in baked pieces like a grain offering, \n" +
                "and offer it for a pleasing aroma to the LORD. \n" +
                "22 The priest from among Aaron's sons, who is anointed to succeed him, shall offer it to the LORD as decreed forever. \n" +
                "The whole of it shall be burned.\n" +
                "23 Every grain offering of a priest shall be wholly burned. It shall not be eaten.”\n" +
                "24 The LORD spoke to Moses, saying, \n" +
                "25 “Speak to Aaron and his sons, saying, This is the law of the sin offering. \n" +
                "In the place where the burnt offering is killed shall the sin offering be killed before the LORD; it is most holy. \n" +
                "26 The priest who offers it for sin shall eat it. In a holy place it shall be eaten, in the court of the tent of meeting. \n" +
                "27 Whatever touches its flesh shall be holy, and when any of its blood is splashed on a garment, \n" +
                "you shall wash that on which it was splashed in a holy place.\n" +
                "28 And the earthenware vessel in which it is boiled shall be broken. But if it is boiled in a bronze vessel, \n" +
                "that shall be scoured and rinsed in water. \n" +
                "29 Every male among the priests may eat of it; it is most holy.\n" +
                "30 But no sin offering shall be eaten from which any blood is brought into the tent of meeting to make atonement in the Holy Place; \n" +
                "it shall be burned up with fire.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table6.add(lblFirstTitle).pad(10,50,0,0).left();
        table6.row();

        //content of the chapter
        table6.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table6.row();

        //title of the second content
        table6.add(lblSecondTitle).pad(10,50,0,0).left();
        table6.row();

        //content of the second title
        table6.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table6);


    }


    public void chapterSevenOFLeviticus() {

        table7 = new Table();
        table7.setWidth(tableBG.getWidth());
        table7.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table7.setFillParent(true);
        table7.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
        
        String chapterFirstTitle = " ";

        String firstContent =  "1  “This is the law of the guilt offering. It is most holy. \n" +
                "2 In the place where they kill the burnt offering they shall kill the guilt offering, \n" +
                "and its blood shall be thrown against the sides of the altar.\n" +
                "3 And all its fat shall be offered, the fat tail, the fat that covers the entrails, \n" +
                "4 the two kidneys with the fat that is on them at the loins, and the long lobe of the liver that he shall remove with the kidneys. \n" +
                "5 The priest shall burn them on the altar as a food offering to the LORD; it is a guilt offering.\n" +
                "6 Every male among the priests may eat of it. It shall be eaten in a holy place. It is most holy. \n" +
                "7 The guilt offering is just like the sin offering; there is one law for them. The priest who makes atonement with it shall have it. \n" +
                "8 And the priest who offers any man's burnt offering shall have for himself the skin of the burnt offering that he has offered.\n" +
                "9 And every grain offering baked tin the oven and all that is prepared on a pan or a griddle shall belong to the priest who offers it. \n" +
                "10 And every grain offering, mixed with oil or dry, shall be shared equally among all the sons of Aaron.\n" +
                "11 “And this is the law of the sacrifice of peace offerings that one may offer to the LORD. \n" +
                "12 If he offers it for a thanksgiving, then he shall offer with the thanksgiving sacrifice unleavened loaves mixed with oil, \n" +
                "unleavened wafers smeared with oil, and loaves of fine flour well mixed with oil. \n" +
                "13 With the sacrifice of his peace offerings for thanksgiving he shall bring his offering with loaves of leavened bread. \n" +
                "14 And from it he shall offer one loaf from each offering, as a gift to the LORD. \n" +
                "It shall belong to the priest who throws the blood of the peace offerings. \n" +
                "15 And the flesh of the sacrifice of his peace offerings for thanksgiving shall be eaten on the day of his offering. \n" +
                "He shall not leave any of it until the morning. \n" +
                "16 But if the sacrifice of his offering is a vow offering or a freewill offering, \n" +
                "it shall be eaten on the day that he offers his sacrifice, and on the next day what remains of it shall be eaten. \n" +
                "17 But what remains of the flesh of the sacrifice on the third day shall be burned up with fire. \n" +
                "18 If any of the flesh of the sacrifice of his peace offering is eaten on the third day, he who offers it shall not be accepted, \n" +
                "neither shall it be credited to him. It is tainted, and he who eats of it shall bear his iniquity.\n" +
                "19 “Flesh that touches any unclean thing shall not be eaten. It shall be burned up with fire. All who are clean may eat flesh, \n" +
                "20 but the person who eats of the flesh of the sacrifice of the LORD's peace offerings while an uncleanness is on him, \n" +
                "that person shall be cut off from his people.\n" +
                "21 And if anyone touches an unclean thing, whether human uncleanness or an unclean beast or any unclean detestable creature, \n" +
                "and then eats some flesh from the sacrifice of the LORD's peace offerings, that person shall be cut off from his people.”\n" +
                "22 The LORD spoke to Moses, saying, \n" +
                "23 “Speak to the people of Israel, saying, You shall eat no fat, of ox or sheep or goat. \n" +
                "24 The fat of an animal that dies of itself and the fat of one that is torn by beasts may be put to any other use, but on no account shall you eat it. \n" +
                "25 For every person who eats of the fat of an animal of which a food offering may be made to the LORD shall be cut off from his people. \n" +
                "26 Moreover, you shall eat no blood whatever, whether of fowl or of animal, in any of your dwelling places. \n" +
                "27 Whoever eats any blood, that person shall be cut off from his people.”\n" +
                "28 The LORD spoke to Moses, saying,\n" +
                "29 “Speak to the people of Israel, saying, Whoever offers the sacrifice of his peace offerings to the LORD shall bring his offering \n" +
                "to the LORD from the sacrifice of his peace offerings. \n" +
                "30 His own hands shall bring the LORD's food offerings. He shall bring the fat with the breast, that the breast \n" +
                "may be waved as a wave offering before the LORD. \n" +
                "31 The priest shall burn the fat on the altar, but the breast shall be for Aaron and his sons.\n" +
                "32 And the right thigh you shall give to the priest as a contribution from the sacrifice of your peace offerings. \n" +
                "33 Whoever among the sons of Aaron offers the blood of the peace offerings and the fat shall have the right thigh for a portion. \n" +
                "34 For the breast that is waved and the thigh that is contributed I have taken from the people of Israel, \n" +
                "out of the sacrifices of their peace offerings, and have given them to Aaron the priest and to his sons, as a perpetual due from the people of Israel. \n" +
                "35 This is the portion of Aaron and of his sons from the LORD's food offerings, from the day they were presented to serve as priests of the LORD.\n" +
                "36 The LORD commanded this to be given them by the people of Israel, from the day that he anointed them. \n" +
                "It is a perpetual due throughout their generations.”\n" +
                "37 This is the law of the burnt offering, of the grain offering, of the sin offering, of the guilt offering, of the ordination offering, \n" +
                "and of the peace offering, \n" +
                "38 which the LORD commanded Moses on Mount Sinai, on the day that he commanded the people of Israel to bring their offerings to the LORD, \n" +
                "in the wilderness of Sinai.\n";
   

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table7.add(lblFirstTitle).pad(10,50,0,0).left();
        table7.row();

        //content of the chapter
        table7.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table7);


    }


    public void chapterEightOFLeviticus() {

        table8 = new Table();
        table8.setWidth(tableBG.getWidth());
        table8.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table8.setFillParent(true);
        table8.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Consecration of Aaron and His Sons";

        String firstContent =  "1 The LORD spoke to Moses, saying, \n" +
                "2 “Take Aaron and his sons with him, and the garments and the anointing oil and the bull of the sin offering \n" +
                "and the two rams and the basket of unleavened bread.\n" +
                "3 And assemble all the congregation at the entrance of the tent of meeting.”\n" +
                "4 And Moses did as the LORD commanded him, and the congregation was assembled at the entrance of the tent of meeting.\n" +
                "5 And Moses said to the congregation,“This is the thing that the LORD has commanded to be done.”\n" +
                "6 And Moses brought Aaron and his sons and washed them with water. \n" +
                "7 And he put the coat on him and tied the sash around his waist and clothed him with the robe a\n" +
                "nd put the ephod on him and tied the skillfully woven band of the ephod around him, binding it to him with the band. \n" +
                "8 And he placed the breastpiece on him, and in the breastpiece he put the Urim and the Thummim.\n" +
                "9 And he set the turban on his head, and con the turban, in front, he set the golden plate, the holy crown, as the LORD commanded Moses.\n" +
                "10 Then Moses took the anointing oil and anointed the tabernacle and all that was in it, and consecrated them. \n" +
                "11 And he sprinkled some of it on the altar seven times, and anointed the altar and all its utensils and the basin and its stand, \n" +
                "o consecrate them. \n" +
                "12 And he poured some of the anointing oil on Aaron's head and anointed him to consecrate him.\n" +
                "13 And Moses brought Aaron's sons and clothed them with coats and tied sashes around their waists and bound caps on them, \n" +
                "as the LORD commanded Moses.\n" +
                "14 Then he brought the bull of the sin offering, and Aaron and his sons laid their hands on the head of the bull of the sin offering. \n" +
                "15 And he killed it, and Moses took the blood, and with his finger put it on the horns of the altar \n" +
                "around it and purified the altar and poured out the blood at the base of the altar and consecrated it to make atonement for it.\n" +
                "16 And he took all the fat that was on the entrails and the long lobe of the liver and the two kidneys with their fat,\n" +
                " and Moses burned them on the altar. \n" +
                "17 But the bull and its skin and its flesh and its dung he burned up with fire outside the camp, as the LORD commanded Moses.\n" +
                "18 Then he presented the ram of the burnt offering, and Aaron and his sons laid their hands on the head of the ram. \n" +
                "19 And he killed it, and Moses threw the blood against the sides of the altar. \n" +
                "20 He cut the ram into pieces, and Moses burned the head and the pieces and the fat.\n" +
                "21 He washed the entrails and the legs with water, and Moses burned the whole ram on the altar. \n" +
                "It was a burnt offering with a pleasing aroma, a food offering for the LORD, as the LORD commanded Moses.\n" +
                "22 Then he presented the other ram, the ram of ordination, and Aaron and his sons laid their hands on the head of the ram. \n" +
                "23 And he killed it, and Moses took some of its blood and put it on the lobe of Aaron's right ear and on the thumb of his right hand \n" +
                "and on the big toe of his right foot. \n" +
                "24 Then he presented Aaron's sons, and Moses put some of the blood on the lobes of their right ears and \n" +
                "on the thumbs of their right hands and on the big toes of their right feet. And Moses threw the blood against the sides of the altar. \n" +
                "25 Then he took the fat and the fat tail and all the fat that was on the entrails and the long lobe of the liver and the two kidneys \n" +
                "with their fat and the right thigh, \n" +
                "26 and out of the basket of unleavened bread that was before the LORD he took one unleavened loaf and one loaf of bread with oil \n" +
                "and one wafer and placed them on the pieces of fat and on the right thigh. \n" +
                "27 And he put all these in the hands of Aaron and in the hands of his sons and waved them as a wave offering before the LORD. \n" +
                "28 Then Moses took them from their hands and burned them on the altar with the burnt offering. \n" +
                "This was an ordination offering with a pleasing aroma, a food offering to the LORD.\n" +
                "29 And Moses took the breast and waved it for a wave offering before the LORD. It was Moses' \n" +
                "portion of the ram of ordination, as the LORD commanded Moses.\n" +
                "30 Then Moses took some of the anointing oil and of the blood that was on the altar and sprinkled it on Aaron and his garments, \n" +
                "and also on his sons and his sons' garments. So he consecrated Aaron and his garments, and his sons and his sons' garments with him.\n" +
                "31 And Moses said to Aaron and his sons, “Boil the flesh at the entrance of the tent of meeting, and there eat it and the bread \n" +
                "that is in the basket of ordination offerings, as I commanded, saying, ‘Aaron and his sons shall eat it.’ \n" +
                "32 And what remains of the flesh and the bread you shall burn up with fire. \n" +
                "33 And you shall not go outside the entrance of the tent of meeting for seven days, until the days of your ordination are completed, \n" +
                "for it will take seven days to ordain you.\n" +
                "34 As has been done today, the LORD has commanded to be done to make atonement for you.\n" +
                "35 At the entrance of the tent of meeting you shall remain day and night for seven days, performing what the LORD has charged, \n" +
                "so that you do not die, for so I have been commanded.” \n" +
                "36 And Aaron and his sons did all the things that the LORD commanded by Moses.\n";
  

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table8.add(lblFirstTitle).pad(10,50,0,0).left();
        table8.row();

        //content of the chapter
        table8.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table8);

    }

    public void chapterNineOFLeviticus() {

        table9 = new Table();
        table9.setWidth(tableBG.getWidth());
        table9.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table9.setFillParent(true);
        table9.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The LORD Accepts Aaron's Offering";

        String firstContent =  "1 On the eighth day Moses called Aaron and his sons and the elders of Israel, \n" +
                "2 and he said to Aaron, “Take for yourself a bull calf for a sin offering and ta ram for a burnt offering, \n" +
                "both without blemish, and offer them before the LORD.\n" +
                "3 And say to the people of Israel, ‘Take a male goat for a sin offering, and a calf and a lamb, both a year old without blemish, \n" +
                "for a burnt offering, \n" +
                "4 and an ox and a ram for peace offerings, to sacrifice before the LORD, and a grain offering mixed with oil, \n" +
                "for today the LORD will appear to you.’”\n" +
                "5 And they brought what Moses commanded in front of the tent of meeting, and all the congregation drew near and stood before the LORD. \n" +
                "6 And Moses said, “This is the thing that the LORD commanded you to do, that the glory of the LORD may appear to you.” \n" +
                "7 Then Moses said to Aaron, “Draw near to the altar and offer your sin offering and your burnt offering and make atonement \n" +
                "for yourself and for the people, and bring the offering of the people and make atonement for them, as the LORD has commanded.”\n" +
                "8 So Aaron drew near to the altar and killed the calf of the sin offering, which was for himself. \n" +
                "9 And the sons of Aaron presented the blood to him, and he dipped his finger in the blood and \n" +
                "put it on the horns of the altar and poured out the blood at the base of the altar.\n" +
                "10 But the fat and the kidneys and the long lobe of the liver from the sin offering he burned on the altar, as the LORD commanded Moses.\n" +
                "11 The flesh and the skin he burned up with fire outside the camp.\n" +
                "12 Then he killed the burnt offering, and Aaron's sons handed him the blood, and he threw it against the sides of the altar. \n" +
                "13 And they handed the burnt offering to him, piece by piece, and the head, and he burned them on the altar. \n" +
                "14 And he washed the entrails and the legs and burned them with the burnt offering on the altar.\n" +
                "15 Then he presented the people's offering and took the goat of the sin offering that was for the people and \n" +
                "killed it and offered it as a sin offering, like the first one. \n" +
                "16 And he presented the burnt offering and offered it according to the rule.\n" +
                "17 And he presented the grain offering, took a handful of it, and burned it on the altar, besides the burnt offering of the morning.\n" +
                "18 Then he killed the ox and the ram, the sacrifice of peace offerings for the people. And Aaron's sons handed him the blood, \n" +
                "and he threw it against the sides of the altar. \n" +
                "19 But the fat pieces of the ox and of the ram, the fat tail and that which covers the entrails and the kidneys and the long lobe of the liver—\n" +
                "20 they put the fat pieces on the breasts, and he burned the fat pieces on the altar, \n" +
                "21 but the breasts and the right thigh Aaron waved for a wave offering before the LORD, as Moses commanded.\n" +
                "22 Then Aaron lifted up his hands toward the people and blessed them, and he came down from offering \n" +
                "he sin offering and the burnt offering and the peace offerings.\n" +
                "23 And Moses and Aaron went into the tent of meeting, and when they came out they blessed the people, \n" +
                "and the glory of the LORD appeared to all the people. \n" +
                "24 And fire came out from before the LORD and consumed the burnt offering and the pieces of fat on the altar, \n" +
                "and when all the people saw it, they shouted and fell on their faces.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table9.add(lblFirstTitle).pad(10,50,0,0).left();
        table9.row();

        //content of the chapter
        table9.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table9);


    }


    public void chapterTenOFLeviticus() {

        table10 = new Table();
        table10.setWidth(tableBG.getWidth());
        table10.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table10.setFillParent(true);
        table10.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Death of Nadab and Abihu";

        String firstContent =  "1 Now Nadab and Abihu, the sons of Aaron, each took his censer and put fire in it and laid incense on it \n" +
                "and offered aunauthorized fire before the LORD, which he had not commanded them. \n" +
                "2 And fire came out from before the LORD and consumed them, and they died before the LORD. \n" +
                "3 Then Moses said to Aaron, “This is what the LORD has said: ‘Among those who are near me I will be sanctified, a\n" +
                "nd before all the people I will be glorified.’” And Aaron held his peace.\n" +
                "4 And Moses called Mishael and Elzaphan, the sons of Uzziel the uncle of Aaron, and said to them, “Come near; \n" +
                "carry your brothers away from the front of the sanctuary and out of the camp.” \n" +
                "5 So they came near and carried them in their coats out of the camp, as Moses had said.\n" +
                "6 And Moses said to Aaron and to Eleazar and Ithamar his sons, “Do not let the hair of your heads hang loose, \n" +
                "and do not tear your clothes, lest you die, and wrath come upon all the congregation; but let your brothers, the whole house of Israel, \n" +
                "bewail the burning that the LORD has kindled. \n" +
                "7 And do not go outside the entrance of the tent of meeting, lest you die, jfor the anointing oil of the LORD is upon you.” \n" +
                "And they did according to the word of Moses.\n" +
                "8 And the LORD spoke to Aaron, saying, \n" +
                "9 “Drink no wine or strong drink, you or your sons with you, when you go into the tent of meeting, lest you die. \n" +
                "It shall be a statute forever throughout your generations.\n" +
                "10 You are to distinguish between the holy and the common, and between the unclean and the clean, \n" +
                "11 and you are to teach the people of Israel all the statutes that the LORD has spoken to them by Moses.”\n" +
                "12 Moses spoke to Aaron and to Eleazar and Ithamar, his surviving sons: “Take the grain offering that is left of the LORD's food offerings, \n" +
                "and eat it unleavened beside the altar, for it is most holy. \n" +
                "13 You shall eat it in a holy place, because it is your due and your sons' due, from the LORD's food offerings, for so I am commanded. \n" +
                "14 But the breast that is waved and the thigh that is contributed you shall eat in a clean place, you and your sons and your daughters with you, \n" +
                "for they are given as your due and your sons' due from the sacrifices of the peace offerings of the people of Israel. \n" +
                "15 The thigh that is contributed and the breast that is waved they shall bring with the food offerings \n" +
                "of the fat pieces to wave for a wave offering before the LORD, and it shall be yours and your sons' with you as a due forever, \n" +
                "as the LORD has commanded.”\n" +
                "16 Now Moses diligently inquired about the goat of the sin offering, and behold, it was burned up! \n" +
                "And he was angry with Eleazar and Ithamar, the surviving sons of Aaron, saying, \n" +
                "17 “Why have you not eaten the sin offering in the place of the sanctuary, since oit is a thing most holy \n" +
                "and has been given to you that you may bear the iniquity of the congregation, to make atonement for them before the LORD?\n" +
                "18 Behold, its blood was not brought into the inner part of the sanctuary. You certainly ought to have eaten it in the sanctuary, \n" +
                "vas I commanded.” \n" +
                "19 And Aaron said to Moses, “Behold, today they have offered their sin offering and their burnt offering before the LORD, \n" +
                "and yet such things as these have happened to me! If I had eaten the sin offering today, would the LORD have approved?” \n" +
                "20 And when Moses heard that, he approved.\n";
   

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);


        //title of the chapter
        table10.add(lblFirstTitle).pad(10,50,0,0).left();
        table10.row();

        //content of the chapter
        table10.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table10);


    }


    public void chapterElevenOFLeviticus() {

        table11 = new Table();
        table11.setWidth(tableBG.getWidth());
        table11.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table11.setFillParent(true);
        table11.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
        
        String chapterFirstTitle = "Clean and Unclean Animals";

        String firstContent =  "1 And the LORD spoke to Moses and Aaron, saying to them,\n" +
                "2 “Speak to the people of Israel, saying, These are the living things that you may eat among all the animals that are on the earth.\n" +
                "3 Whatever parts the hoof and is cloven-footed and chews the cud, among the animals, you may eat. \n" +
                "4 Nevertheless, among those that chew the cud or part the hoof, you shall not eat these: The camel, \n" +
                "because it chews the cud but does not part the hoof, is unclean to you. \n" +
                "5 And the rock badger, because it chews the cud but does not part the hoof, is unclean to you. \n" +
                "6 And the hare, because it chews the cud but does not part the hoof, is unclean to you.\n" +
                "7 And the pig, because it parts the hoof and is cloven-footed but does not chew the cud, is unclean to you. \n" +
                "8 You shall not eat any of their flesh, and you shall not touch their carcasses; they are unclean to you.\n" +
                "9 “These you may eat, of all that are in the waters. Everything in the waters that has fins and scales, \n" +
                "whether in the seas or in the rivers, you may eat. \n" +
                "10 But anything in the seas or the rivers that does not have fins and scales, of the swarming creatures in the waters and of the living creatures \n" +
                "that are in the waters, is detestable to you. \n" +
                "11 You shall regard them as detestable; you shall not eat any of their flesh, and you shall detest their carcasses. \n" +
                "12 Everything in the waters that does not have fins and scales is detestable to you.\n" +
                "13 “And these you shall detest among the birds;1 they shall not be eaten; they are detestable: the eagle, \n" +
                "the bearded vulture, the black vulture, \n" +
                "14 the kite, the falcon of any kind, \n" +
                "15 every raven of any kind,\n" +
                "16 the ostrich, the nighthawk, the sea gull, the hawk of any kind, \n" +
                "17 the little owl, the cormorant, the short-eared owl, \n" +
                "18 the barn owl, the tawny owl, the carrion vulture, \n" +
                "19 the stork, the heron of any kind, the hoopoe, and the bat.\n" +
                "20 “All winged insects that go on all fours are detestable to you. \n" +
                "21 Yet among the winged insects that go on all fours you may eat those that have jointed legs above their feet, \n" +
                "with which to hop on the ground. \n" +
                "22 Of them you may eat: the locust of any kind, the bald locust of any kind, the cricket of any kind, and the grasshopper of any kind.\n" +
                "23 But all other winged insects that have four feet are detestable to you.\n" +
                "24 “And by these you shall become unclean. Whoever touches their carcass shall be unclean until the evening, \n" +
                "25 and whoever carries any part of their carcass shall wash his clothes and be unclean until the evening. \n" +
                "26 Every animal that parts the hoof but is not cloven-footed or does not chew the cud is unclean to you. \n" +
                "Everyone who touches them shall be unclean. \n" +
                "27 And all that walk on their paws, among the animals that go on all fours, are unclean to you. \n" +
                "Whoever touches their carcass shall be unclean until the evening, \n" +
                "28 and he who carries their carcass shall wash his clothes and be unclean until the evening; they are unclean to you.\n" +
                "29 “And these are unclean to you among the swarming things that swarm on the ground: the mole rat, the mouse, the great lizard of any kind, \n" +
                "30 the gecko, the monitor lizard, the lizard, the sand lizard, and the chameleon. \n" +
                "31 These are unclean to you among all that swarm. Whoever touches them when they are dead shall be unclean until the evening.\n" +
                "32 And anything on which any of them falls when they are dead shall be unclean, \n" +
                "whether it is an article of wood or a garment or a skin or a sack, any article that is used for any purpose. It must be put into water, \n" +
                "and it shall be unclean until the evening; then it shall be clean. \n" +
                "33 And if any of them falls into any earthenware vessel, all that is in it shall be unclean, and you shall break it. \n" +
                "34 Any food in it that could be eaten, on which water comes, shall be unclean. And all drink \n" +
                "that could be drunk from every such vessel shall be unclean. \n" +
                "35 And everything on which any part of their carcass falls shall be unclean. Whether oven or stove, \n" +
                "it shall be broken in pieces. They are unclean and shall remain unclean for you. \n" +
                "36 Nevertheless, a spring or a cistern holding water shall be clean, but whoever touches a carcass in them shall be unclean. \n" +
                "37 And if any part of their carcass falls upon any seed grain that is to be sown, it is clean, \n" +
                "38 but if water is put on the seed and any part of their carcass falls on it, it is unclean to you.\n" +
                "39 “And if any animal which you may eat dies, whoever touches its carcass shall be unclean until the evening, \n" +
                "40 and whoever eats of its carcass shall wash his clothes and be unclean until the evening.\n" +
                " And whoever carries the carcass shall wash his clothes and be unclean until the evening.\n" +
                "41 “Every swarming thing that swarms on the ground is detestable; it shall not be eaten. \n" +
                "42 Whatever goes on its belly, and whatever goes on all fours, or whatever has many feet, any swarming thing that swarms on the ground, \n" +
                "you shall not eat, for they are detestable. \n" +
                "43 You shall not make yourselves detestable with any swarming thing that swarms, and you shall not defile yourselves with them, \n" +
                "and become unclean through them. \n" +
                "44 For I am the LORD your God. Consecrate yourselves therefore, and be holy, for I am holy. \n" +
                "You shall not defile yourselves with any swarming thing that crawls on the ground. \n" +
                "45 For I am the LORD who brought you up out of the land of Egypt to be your God. You shall therefore be holy, for I am holy.”\n" +
                "46 This is the law about beast and bird and every living creature that moves through the waters and every creature that swarms on the ground, \n" +
                "47 to make a distinction between the unclean and the clean and between the living creature that may be eaten \n" +
                "and the living creature that may not be eaten.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table11.add(lblFirstTitle).pad(10,50,0,0).left();
        table11.row();

        //content of the chapter
        table11.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table11);


    }


    public void chapterTwelveOFLeviticus() {

        table12 = new Table();
        table12.setWidth(tableBG.getWidth());
        table12.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table12.setFillParent(true);
        table12.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Purification After Childbirth";

        String firstContent =  "1 The LORD spoke to Moses, saying, \n" +
                "2 “Speak to the people of Israel, saying, If a woman conceives and bears a male child, then she shall be unclean seven days. \n" +
                "As at the time of her menstruation, she shall be unclean. \n" +
                "3 And on the eighth day the flesh of his foreskin shall be circumcised. \n" +
                "4 Then she shall continue for thirty-three days in the blood of her purifying. \n" +
                "She shall not touch anything holy, nor come into the sanctuary, until the days of her purifying are completed. \n" +
                "5 But if she bears a female child, then she shall be unclean two weeks, as in her menstruation. \n" +
                "And she shall continue in the blood of her purifying for sixty-six days.\n" +
                "6 “And when the days of her purifying are completed, whether for a son or for a daughter, \n" +
                "she shall bring to the priest at the entrance of the tent of meeting a lamb a year old for a burnt offering, and a pigeon or a turtledove for a sin offering, \n" +
                "7 and he shall offer it before the LORD and make atonement for her. Then she shall be clean from the flow of her blood. \n" +
                "This is the law for her who bears a child, either male or female.\n" +
                "8 And if she cannot afford a lamb, then she shall take two turtledoves or two pigeons, \n" +
                "one for a burnt offering and the other for a sin offering. And the priest shall make atonement for her, and she shall be clean.”\n";
 

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table12.add(lblFirstTitle).pad(10,50,0,0).left();
        table12.row();

        //content of the chapter
        table12.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table12);


    }


    public void chapterThirteenOFLeviticus() {

        table13 = new Table();
        table13.setWidth(tableBG.getWidth());
        table13.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table13.setFillParent(true);
        table13.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws About Leprosy";

        String firstContent =  "1 The LORD spoke to Moses and Aaron, saying, \n" +
                "2 “When a person has on the skin of his body a swelling or an eruption or a spot, \n" +
                "and it turns into a case of leprous disease on the skin of his body, then he shall be brought to Aaron the priest or to one of his sons the priests,\n" +
                "3 and the priest shall examine the diseased area on the skin of his body. \n" +
                "And if the hair in the diseased area has turned white and the disease appears to be deeper than the skin of his body, \n" +
                "it is a case of leprous disease. When the priest has examined him, he shall pronounce him unclean. \n" +
                "4 But if the spot is white in the skin of his body and appears no deeper than the skin, \n" +
                "and the hair in it has not turned white, the priest shall shut up the diseased person for seven days. \n" +
                "5 And the priest shall examine him on the seventh day, and if in his eyes the disease is checked and the disease has not spread in the skin, \n" +
                "then the priest shall shut him up for another seven days. \n" +
                "6 And the priest shall examine him again on the seventh day, and if the diseased area has faded and the disease has not spread in the skin, \n" +
                "then the priest shall pronounce him clean; it is only an eruption. And he shall wash his clothes and be clean. \n" +
                "7 But if the eruption spreads in the skin, after he has shown himself to the priest for his cleansing, he shall appear again before the priest. \n" +
                "8 And the priest shall look, and if the eruption has spread in the skin, then the priest shall pronounce him unclean; it is a leprous disease.\n" +
                "9 “When a man is afflicted with a leprous disease, he shall be brought to the priest, \n" +
                "10 and the priest shall look. And if there is a white swelling in the skin that has turned the hair white, \n" +
                "and there is raw flesh in the swelling, \n" +
                "11 it is a chronic leprous disease in the skin of his body, and the priest shall pronounce him unclean. \n" +
                "He shall not shut him up, for he is unclean. \n" +
                "12 And if the leprous disease breaks out in the skin, so that the leprous disease covers all the skin of the diseased person from head to foot, \n" +
                "so far as the priest can see,\n" +
                "13 then the priest shall look, and if the leprous disease has covered all his body, he shall pronounce him clean of the disease; \n" +
                "it has all turned white, and he is clean. \n" +
                "14 But when raw flesh appears on him, he shall be unclean. \n" +
                "15 And the priest shall examine the raw flesh and pronounce him unclean. Raw flesh is unclean, for it is a leprous disease. \n" +
                "16 But if the raw flesh recovers and turns white again, then he shall come to the priest, \n" +
                "17 and the priest shall examine him, and if the disease has turned white, then the priest shall pronounce the diseased person clean; he is clean.\n" +
                "18 “If there is in the skin of one's body a boil and it heals, \n" +
                "19 and in the place of the boil there comes a white swelling or a reddish-white spot, then it shall be shown to the priest. \n" +
                "20 And the priest shall look, and if it appears deeper than the skin and its hair has turned white, then the priest shall pronounce him unclean. \n" +
                "It is a case of leprous disease that has broken out in the boil. \n" +
                "21 But if the priest examines it and there is no white hair in it and it is not deeper than the skin, but has faded, \n" +
                "then the priest shall shut him up seven days. \n" +
                "22 And if it spreads in the skin, then the priest shall pronounce him unclean; it is a disease. \n" +
                "23 But if the spot remains in one place and does not spread, it is the scar of the boil, and the priest shall pronounce him clean.\n" +
                "24 “Or, when the body has a burn on its skin and the raw flesh of the burn becomes a spot, reddish-white or white, \n" +
                "25 the priest shall examine it, and if the hair in the spot has turned white and it appears deeper than the skin, then it is a leprous disease. \n" +
                "It has broken out in the burn, and the priest shall pronounce him unclean; it is a case of leprous disease.\n" +
                "26 But if the priest examines it and there is no white hair in the spot and it is no deeper than the skin, \n" +
                "but has faded, the priest shall shut him up seven days, \n" +
                "27 and the priest shall examine him the seventh day. If it is spreading in the skin, then the priest shall pronounce him unclean; \n" +
                "it is a case of leprous disease. \n" +
                "28 But if the spot remains kin one place and does not spread in the skin, but has faded, it is a swelling from the burn, \n" +
                "and the priest shall pronounce him clean, for it is the scar of the burn.\n" +
                "29 “When a man or woman has a disease on the head or the beard,\n" +
                "30 the priest shall examine the disease. And if it appears deeper than the skin, and the hair in it is yellow and thin, \n" +
                "then the priest shall pronounce him unclean. It is an itch, a leprous disease of the head or the beard.\n" +
                "31 And if the priest examines the itching disease and it appears no deeper than the skin and there is no black hair in it, \n" +
                "then the priest shall shut up the person with the itching disease for seven days, \n" +
                "32 and on the seventh day the priest shall examine the disease. If the itch has not spread, and there is in it no yellow hair, \n" +
                "and the itch appears to be no deeper than the skin, \n" +
                "33 then he shall shave himself, but the itch he shall not shave; and the priest shall shut up the person with the itching disease \n" +
                "for another seven days. \n" +
                "34 And on the seventh day the priest shall examine the itch, and if the itch has not spread in the skin and it appears \n" +
                "to be no deeper than the skin, then the priest shall pronounce him clean. And he shall wash his clothes and be clean. \n" +
                "35 But if the itch spreads in the skin after his cleansing, \n" +
                "36 then the priest shall examine him, and if the itch has spread in the skin, the priest need not seek for the yellow hair; he is unclean. \n" +
                "37 But if in his eyes the itch is unchanged and black hair has grown in it, the itch is healed and he is clean, \n" +
                "and the priest shall pronounce him clean.\n" +
                "38 “When a man or a woman has spots on the skin of the body, white spots, \n" +
                "39 the priest shall look, and if the spots on the skin of the body are of a dull white, it is leukoderma that has broken out in the skin; he is clean.\n" +
                "40 “If a man's hair falls out from his head, he is bald; he is clean.\n" +
                "41 And if a man's hair falls out from his forehead, he has baldness of the forehead; he is clean. \n" +
                "42 But if there is on the bald head or the bald forehead a reddish-white diseased area, \n" +
                "it is a leprous disease breaking out on his bald head or his bald forehead.\n" +
                "43 Then the priest shall examine him, and if the diseased swelling is reddish-white on his bald head or on his bald forehead, \n" +
                "like the appearance of leprous disease in the skin of the body, \n" +
                "44 he is a leprous man, he is unclean. The priest must pronounce him unclean; his disease is on his head.\n" +
                "45 “The leprous person who has the disease shall wear torn clothes and let the hair of his head hang loose, \n" +
                "and he shall cover his upper lip2 and cry out, ‘Unclean, unclean.’ \n" +
                "46 He shall remain unclean as long as he has the disease. He is unclean. He shall live alone. \n" +
                "His dwelling shall be outside the camp.\n" +
                "47 “When there is a case of leprous disease in a garment, whether a woolen or a linen garment, \n" +
                "48 in warp or woof of linen or wool, or in a skin or in anything made of skin, \n" +
                "49 if the disease is greenish or reddish in the garment, or in the skin or in the warp or the woof or in any article made of skin, \n" +
                "it is a case of leprous disease, and it shall be shown to the priest. \n" +
                "50 And the priest shall examine the disease and shut up that which has the disease for seven days. \n" +
                "51 Then he shall examine the disease on the seventh day. If the disease has spread in the garment, \n" +
                "in the warp or the woof, or in the skin, whatever be the use of the skin, the disease is a persistent leprous disease; it is unclean. \n" +
                "52 And he shall burn the garment, or the warp or the woof, the wool or the linen, or any article made of skin that is diseased, \n" +
                "for it is a persistent leprous disease. It shall be burned in the fire.\n" +
                "53 “And if the priest examines, and if the disease has not spread in the garment, in the warp or the woof or in any article made of skin,\n" +
                "54 then the priest shall command that they wash the thing in which is the disease, and he shall shut it up for another seven days. \n" +
                "55 And the priest shall examine the diseased thing after it has been washed. And if the appearance of the diseased area has not changed, \n" +
                "though the disease has not spread, it is unclean. You shall burn it in the fire, whether the rot is on the back or on the front.\n" +
                "56 “But if the priest examines, and if the diseased area has faded after it has been washed, \n" +
                "he shall tear it out of the garment or the skin or the warp or the woof. \n" +
                "57 Then if it appears again in the garment, in the warp or the woof, or in any article made of skin, it is spreading. \n" +
                "You shall burn with fire whatever has the disease. \n" +
                "58 But the garment, or the warp or the woof, or any article made of skin from which the disease departs when you have washed it, \n" +
                "shall then be washed a second time, and be clean.”\n" +
                "59 This is the law for a case of leprous disease in a garment of wool or linen, either in the warp or the woof, \n" +
                "or in any article made of skin, to determine whether it is clean or unclean.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table13.add(lblFirstTitle).pad(10,50,0,0).left();
        table13.row();

        //content of the chapter
        table13.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table13);


    }


    public void chapterFourteenOFLeviticus() {

        table14 = new Table();
        table14.setWidth(tableBG.getWidth());
        table14.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table14.setFillParent(true);
        table14.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws for Cleansing Lepers";

        String firstContent =  "1 The LORD spoke to Moses, saying,\n" +
                "2 “This shall be the law of the leprous person for the day of his cleansing. He shall be brought to the priest, \n" +
                "3 and the priest shall go out of the camp, and the priest shall look. Then, if the case of leprous disease is healed in the leprous person, \n" +
                "4 the priest shall command them to take for him who is to be cleansed two live clean birds and cedar wood and scarlet yarn and hyssop.\n" +
                " 5 And the priest shall command them to kill one of the birds in an earthenware vessel over fresh water. \n" +
                "6 He shall take the live bird with the cedar wood and the scarlet yarn and the hyssop, \n" +
                "and dip them and the live bird in the blood of the bird that was killed over the fresh water. \n" +
                "7 And he shall sprinkle it seven times on him who is to be cleansed of the leprous disease. \n" +
                "Then he shall pronounce him clean and shall let the living bird go into the open field. \n" +
                "8 And he who is to be cleansed shall wash his clothes and shave off all his hair and bathe himself in water, \n" +
                "and he shall be clean. And after that he may come into the camp, but live outside his tent seven days. \n" +
                "9 And don the seventh day he shall shave off all his hair from his head, his beard, and his eyebrows. \n" +
                "He shall shave off all his hair, and then he shall wash his clothes and bathe his body in water, and he shall be clean.\n" +
                "10 “And on the eighth day he shall take two male lambs without blemish, and one ewe lamb a year old without blemish, \n" +
                "and a grain offering of three tenths of an ephah3 of fine flour mixed with oil, and one log4 of oil. \n" +
                "11 And the priest who cleanses him shall set the man who is to be cleansed and these things before the LORD, \n" +
                "at the entrance of the tent of meeting. \n" +
                "12 And the priest shall take one of the male lambs and offer it for a guilt offering, along with the log of oil, and wave them \n" +
                "for a wave offering before the LORD. \n" +
                "13 And he shall kill the lamb in the place where they kill the sin offering and the burnt offering, in the place of the sanctuary. \n" +
                "For the guilt offering, like the sin offering, belongs to the priest; kit is most holy. \n" +
                "14 The priest shall take some of the blood of the guilt offering, and the priest shall put it lon the lobe of the right ear of him \n" +
                "who is to be cleansed and on the thumb of his right hand and on the big toe of his right foot. \n" +
                "15 Then the priest shall take some of the log of oil and pour it into the palm of his own left hand \n" +
                "16 and dip his right finger in the oil that is in his left hand and sprinkle some oil with his finger seven times before the LORD. \n" +
                "17 And some of the oil that remains in his hand the priest shall put on the lobe of the right ear of him \n" +
                "who is to be cleansed and on the thumb of his right hand and on the big toe of his right foot, on top of the blood of the guilt offering. \n" +
                "18 And the rest of the oil that is in the priest's hand he shall put on the head of him who is to be cleansed. \n" +
                "Then the priest shall make atonement for him before the LORD. \n" +
                "19 The priest shall offer the sin offering, to make atonement for him who is to be cleansed from his uncleanness.\n" +
                " And afterward he shall kill the burnt offering. \n" +
                "20 And the priest shall offer the burnt offering and the fgrain offering on the altar. Thus the priest shall make atonement for him, \n" +
                "and he shall be clean.\n" +
                "21 “But if he is poor and cannot afford so much, then he shall take one male lamb for a guilt offering to be waved, to make atonement for him,\n" +
                " and a tenth of an ephah of fine flour mixed with oil for a grain offering, and a log of oil;\n" +
                "22 also two turtledoves or two pigeons, whichever he can afford. The one shall be a sin offering and the other a burnt offering.\n" +
                "23 And on the eighth day he shall bring them for his cleansing to the priest, to the entrance of the tent of meeting, before the LORD. \n" +
                "24 And the priest shall take the lamb of the guilt offering and the log of oil, and the priest shall wave them for a wave offering before the LORD. \n" +
                "25 And he shall kill the lamb of the guilt offering. And the priest shall take some of the blood of the guilt offering and \n" +
                " put it on the lobe of the right ear of him who is to be cleansed, and on the thumb of his right hand and on the big toe of his right foot. \n" +
                "26 And the priest shall pour some of the oil into the palm of his own left hand, \n" +
                "27 and shall sprinkle with his right finger some of the oil that is in his left hand seven times before the LORD. \n" +
                "28 And the priest shall put some of the oil that is in his hand on the lobe of the right ear of him who is to be cleansed \n" +
                "and on the thumb of his right hand and on the big toe of his right foot, in the place where the blood of the guilt offering was put. \n" +
                "29 And the rest of the oil that is in the priest's hand he shall put on the head of him who is to be cleansed, \n" +
                "to make atonement for him before the LORD. \n" +
                "30 And he shall offer, of the turtledoves or pigeons, whichever he can afford, \n" +
                "31 one for a sin offering and the other for a burnt offering, along with a grain offering. And the priest shall make atonement \n" +
                "before the LORD for him who is being cleansed. \n" +
                "32 This is the law for him in whom is a case of leprous disease, who cannot afford the offerings for his cleansing.”\n";

        String chapterSecondTitle = "Laws for Cleansing Houses";

        String secondContent = "33 The LORD spoke to Moses and Aaron, saying, \n" +
                "34 “When you come into the land of Canaan, which I give you for a possession, and I put a case of leprous disease in a \n" +
                "house in the land of your possession,\n" +
                " 35 then he who owns the house shall come and tell the priest, ‘There seems to me to be some case of disease in my house.’ \n" +
                "36 Then the priest shall command that they empty the house before the priest goes to examine the disease, lest all that is \n" +
                "in the house be declared unclean. And afterward the priest shall go in to see the house. \n" +
                "37 And he shall examine the disease. And if the disease is in the walls of the house with greenish or reddish spots, \n" +
                "and if it appears to be deeper than the surface, \n" +
                "38 then the priest shall go out of the house to the door of the house and shut up the house seven days. \n" +
                "39 And the priest shall come again on the seventh day, and look. If the disease has spread in the walls of the house, \n" +
                "40 then the priest shall command that they take out the stones in which is the disease and throw them into an unclean place outside the city. \n" +
                "41 And he shall have the inside of the house scraped all around, and the plaster that they scrape off \n" +
                "they shall pour out in an unclean place outside the city. \n" +
                "42 Then they shall take other stones and put them in the place of those stones, and he shall take other plaster a\n" +
                "nd plaster the house.\n" +
                "43 “If the disease breaks out again in the house, after he has taken out the stones and scraped the house and plastered it, \n" +
                "44 then the priest shall go and look. And if the disease has spread in the house, it is a persistent leprous disease in the house; \n" +
                "it is unclean. \n" +
                "45 And he shall break down the house, its stones and timber and all the plaster of the house, and he shall carry \n" +
                "them out of the city to an unclean place.\n" +
                "46 Moreover, whoever enters the house while it is shut up shall be unclean until the evening, \n" +
                "47 and whoever sleeps in the house shall wash his clothes, and whoever eats in the house shall wash his clothes.\n" +
                "48 “But if the priest comes and looks, and if the disease has not spread in the house after the house was plastered, \n" +
                "then the priest shall pronounce the house clean, for the disease is healed. \n" +
                "49 And for the cleansing of the house he shall take two small birds, with cedar wood and scarlet yarn and hyssop, \n" +
                "50 and shall kill one of the birds in an earthenware vessel over fresh water \n" +
                "51 and shall take the cedar wood and the hyssop and the scarlet yarn, along with the live bird, and dip them in the blood of the bird \n" +
                "that was killed and in the fresh water and sprinkle the house seven times. \n" +
                "52 Thus he shall cleanse the house with the blood of the bird and with the fresh water and with the live bird and\n" +
                " with the cedar wood and hyssop and scarlet yarn. \n" +
                "53 And he shall let the live bird go out of the city into the open country. So he shall make atonement for the house, and it shall be clean.”\n" +
                "54 This is the law for any case of leprous disease: for an itch,\n" +
                "55 for leprous disease in a garment or in a house, \n" +
                "56 and for a swelling or an eruption or a spot, \n" +
                "57 to show when it is unclean and when it is clean. This is the law for leprous disease.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table14.add(lblFirstTitle).pad(10,50,0,0).left();
        table14.row();

        //content of the chapter
        table14.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table14.row();

        //title of the second content
        table14.add(lblSecondTitle).pad(10,50,0,0).left();
        table14.row();

        //content of the second title
        table14.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table14);

    }


    public void chapterFifteenOFLeviticus() {

        table15 = new Table();
        table15.setWidth(tableBG.getWidth());
        table15.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table15.setFillParent(true);
        table15.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws About Bodily Discharges";

        String firstContent =  "1 The LORD spoke to Moses and Aaron, saying, \n" +
                "2 “Speak to the people of Israel and say to them, When any man has a discharge from his body, his discharge is unclean. \n" +
                "3 And this is the law of his uncleanness for a discharge: whether his body runs with his discharge, \n" +
                "or his body is blocked up by his discharge, it is his uncleanness. \n" +
                "4 Every bed on which the one with the discharge lies shall be unclean, and everything on which he sits shall be unclean. \n" +
                "5 And anyone who touches his bed shall wash his clothes and bathe himself in water and be unclean until the evening. \n" +
                "6 And whoever sits on anything on which the one with the discharge has sat shall wash his clothes and bathe himself \n" +
                "in water and be unclean until the evening. \n" +
                "7 And whoever touches the body of the one with the discharge shall wash his clothes and bathe himself in water \n" +
                "and be unclean until the evening. \n" +
                "8 And if the one with the discharge spits on someone who is clean, then he shall wash his clothes and bathe himself in water \n" +
                "and be unclean until the evening. \n" +
                "9 And any saddle on which the one with the discharge rides shall be unclean. \n" +
                "10 And whoever touches anything that was under him shall be unclean until the evening. And whoever carries \n" +
                "such things shall wash his clothes and bathe himself in water and be unclean until the evening. \n" +
                "11 Anyone whom the one with the discharge touches without having rinsed his hands in water shall wash his clothes \n" +
                "and bathe himself in water and be unclean until the evening. \n" +
                "12 And an earthenware vessel that the one with the discharge touches shall be broken, and every vessel of wood shall be rinsed in water.\n" +
                "13 “And when the one with a discharge is cleansed of his discharge, then lhe shall count for himself seven days for his cleansing, \n" +
                "and wash his clothes. And he shall bathe his body in fresh water and shall be clean.\n" +
                "14 And on the eighth day he shall take two turtledoves or two pigeons and come before the LORD to the entrance of the tent of meeting \n" +
                "and give them to the priest. \n" +
                "15 And the priest shall use them, none for a sin offering and the other for a burnt offering. And the priest shall make atonement \n" +
                "for him before the LORD for his discharge.\n" +
                "16 “If a man has an emission of semen, he shall bathe his whole body in water and be unclean until the evening. \n" +
                "17 And every garment and every skin on which the semen comes shall be washed with water and be unclean until the evening. \n" +
                "18 If a man lies with a woman and has an emission of semen, both of them shall bathe themselves in water and be unclean until the evening.\n" +
                "19 “When a woman has a discharge, and the discharge in her body is blood, she shall be in her menstrual impurity for seven days, \n" +
                "and whoever touches her shall be unclean until the evening. \n" +
                "20 And everything on which she lies during her menstrual impurity shall be unclean. Everything also on which she sits shall be unclean. \n" +
                "21 And whoever touches her bed shall wash his clothes and bathe himself in water and be unclean until the evening.\n" +
                "22 And whoever touches anything on which she sits shall wash his clothes and bathe himself in water and be unclean until the evening. \n" +
                "23 Whether it is the bed or anything on which she sits, when he touches it he shall be unclean until the evening. \n" +
                "24 And if any man lies with her and her menstrual impurity comes upon him, he shall be unclean seven days, \n" +
                "and every bed on which he lies shall be unclean.\n" +
                "25 “If a woman has a discharge of blood for many days, not at the time of her menstrual impurity, \n" +
                "or if she has a discharge beyond the time of her impurity, all the days of the discharge she shall continue in uncleanness. \n" +
                "As in the days of her impurity, she shall be unclean.\n" +
                "26 Every bed on which she lies, all the days of her discharge, shall be to her as the bed of her impurity. \n" +
                "And everything on which she sits shall be unclean, as in the uncleanness of her menstrual impurity. \n" +
                "27 And whoever touches these things shall be unclean, and shall wash his clothes and bathe himself in water and be unclean until the evening.\n" +
                "28 But if she is cleansed of her discharge, she shall count for herself seven days, and after that she shall be clean.\n" +
                "29 And on the eighth day she shall take two turtledoves or two pigeons and bring them to the priest, to the entrance of the tent of meeting. \n" +
                "30 And the priest shall use one for a sin offering and the other for a burnt offering. \n" +
                "And the priest shall make atonement for her before the LORD for her unclean discharge.\n" +
                "31 “Thus you shall keep the people of Israel separate from their uncleanness, lest they die in their uncleanness \n" +
                "by defiling my tabernacle that is in their midst.”\n" +
                "32 This is the law for him who has a discharge and for him who has an emission of semen, becoming unclean thereby; \n" +
                "33 also for her who is unwell with her menstrual impurity, that is, for anyone, male or female, who has a discharge,\n" +
                " and for the man who lies with a woman who is unclean.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table15.add(lblFirstTitle).pad(10,50,0,0).left();
        table15.row();

        //content of the chapter
        table15.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table15);


    }


    public void chapterSixteenOFLeviticus() {

        table16 = new Table();
        table16.setWidth(tableBG.getWidth());
        table16.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table16.setFillParent(true);
        table16.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Day of Atonement";

        String firstContent =  "1 The LORD spoke to Moses after the death of the two sons of Aaron, when they drew near before the LORD and died, \n" +
                "2 and the LORD said to Moses, “Tell Aaron your brother not to come at any time into the Holy Place inside the veil, \n" +
                "before the mercy seat that is on the ark, so that he may not die. For I will appear in the cloud over the mercy seat. \n" +
                "3 But in this way Aaron shall come into the Holy Place: with a bull from the herd for a sin offering and a ram for a burnt offering.\n" +
                "4 He shall put on the holy linen coat and shall have the linen undergarment on his body, and he shall tie the linen sash around his waist, \n" +
                "and wear the linen turban; these are the holy garments. He shall bathe his body in water and then put them on.\n" +
                "5 And he shall take from the congregation of the people of Israel two male goats for a sin offering, and one ram for a burnt offering.\n" +
                "6 “Aaron shall offer the bull as a sin offering for himself and shall make atonement for himself and for his house. \n" +
                "7 Then he shall take the two goats and set them before the LORD at the entrance of the tent of meeting. \n" +
                "8 And Aaron shall cast lots over the two goats, one lot for the LORD and the other lot for Azazel.\n" +
                "9 And Aaron shall present the goat on which the lot fell for the LORD and use it as a sin offering, \n" +
                "10 but the goat on which the lot fell for Azazel shall be presented alive before the LORD to make atonement over it, \n" +
                "that it may be sent away into the wilderness to Azazel.\n" +
                "11 “Aaron shall present the bull as a sin offering for himself, and shall make atonement for himself and for his house. \n" +
                "He shall kill the bull as a sin offering for himself. \n" +
                "12 And he shall take a censer full of coals of fire from the altar before the LORD, and two handfuls of sweet incense beaten small, \n" +
                "and he shall bring it inside the veil \n" +
                "13 and put the incense on the fire before the LORD, that the cloud of the incense may cover the mercy seat that is over the testimony, \n" +
                "so that he does not die.\n" +
                "14 And he shall take some of the blood of the bull and sprinkle it with his finger on the front of the mercy seat on the east side, \n" +
                "and in front of the mercy seat he shall sprinkle some of the blood with his finger seven times.\n" +
                "15 “Then he shall kill the goat of the sin offering that is for the people and bring its blood inside the veil and do with its blood \n" +
                "as he did with the blood of the bull, sprinkling it over the mercy seat and in front of the mercy seat. \n" +
                "16 Thus he shall make atonement for the Holy Place, because of the uncleannesses of the people of Israel and because of their transgressions,\n" +
                " all their sins. And so he shall do for the tent of meeting, which dwells with them in the midst of their uncleannesses. \n" +
                "17 No one may be in the tent of meeting from the time he enters to make atonement in the Holy Place until he comes out and has made atonement \n" +
                "for himself and for his house and for all the assembly of Israel. \n" +
                "18 Then he shall go out to the altar that is before the LORD and make atonement for it, and shall take some of the blood of the bull \n" +
                "and some of the blood of the goat, and put it on the horns of the altar all around. \n" +
                "19 And he shall sprinkle some of the blood on it with his finger seven times, and cleanse it and consecrate it from the uncleannesses \n" +
                "of the people of Israel.\n" +
                "20 “And when he has made an end of atoning for the Holy Place and the tent of meeting and the altar, he shall present the live goat. \n" +
                "21 And Aaron shall lay both his hands on the head of the live goat, and confess over it all the iniquities of the people of Israel, \n" +
                "and all their transgressions, all their sins. And he shall put them on the head of the goat and send it away into the wilderness \n" +
                "by the hand of a man who is in readiness. \n" +
                "22 The goat shall bear all their iniquities on itself to a remote area, and he shall let the goat go free in the wilderness.\n" +
                "23 “Then Aaron shall come into the tent of meeting and shall take off the linen garments that he put on when he went into the Holy Place \n" +
                "and shall leave them there. \n" +
                "24 And he shall bathe his body in water in a holy place and put on his garments and come out and coffer his burnt offering and the burnt offering \n" +
                "of the people and make atonement for himself and for the people.\n" +
                "25 And the fat of the sin offering he shall burn on the altar. \n" +
                "26 And he who lets the goat go to Azazel shall wash his clothes and bathe his body in water, and afterward he may come into the camp. \n" +
                "27 And the bull for the sin offering and the goat for the sin offering, whose blood was brought in to make atonement in the Holy Place, \n" +
                "shall be carried outside the camp. Their skin and their flesh and their dung shall be burned up with fire.\n" +
                "28 And he who burns them shall wash his clothes and bathe his body in water, and afterward he may come into the camp.\n" +
                "29 “And it shall be a statute to you forever that in the seventh month, on the tenth day of the month, you shall afflict yourselves2 \n" +
                "and shall do no work, either the native or the stranger who sojourns among you. \n" +
                "30 For on this day shall atonement be made for you to cleanse you. You shall be clean before the LORD from all your sins. \n" +
                "31 It is a Sabbath of solemn rest to you, and you shall afflict yourselves; it is a statute forever. \n" +
                "32 And the priest who is anointed and consecrated as priest in his father's place shall make atonement, wearing the holy linen garments. \n" +
                "33 He shall make atonement for the holy sanctuary, and he shall make atonement for the tent of meeting and for the altar, \n" +
                "and he shall make atonement for the priests and for all the people of the assembly.\n" +
                "34 And this shall be a statute forever for you, that atonement may be made for the people of Israel once in the year because of all their sins.” \n" +
                "And Aaron3 did as the LORD commanded Moses.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table16.add(lblFirstTitle).pad(10,50,0,0).left();
        table16.row();

        //content of the chapter
        table16.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table16);


    }


    public void chapterSeventeenOFLeviticus() {

        table17 = new Table();
        table17.setWidth(tableBG.getWidth());
        table17.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table17.setFillParent(true);
        table17.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Place of Sacrifice";

        String firstContent =  "1 And the LORD spoke to Moses, saying, \n" +
                "2 “Speak to Aaron and his sons and to all the people of Israel and say to them, This is the thing that the LORD has commanded. \n" +
                "3 If any one of the house of Israel kills an ox or a lamb or a goat in the camp, or kills it outside the camp,\n" +
                "4 and does not bring it to the entrance of the tent of meeting to offer it as a gift to the LORD in front of the tabernacle of the LORD, \n" +
                "bloodguilt shall be imputed to that man. He has shed blood, and that man shall be cut off from among his people.\n" +
                "5 This is to the end that the people of Israel may bring their sacrifices that they sacrifice in the open field, \n" +
                "that they may bring them to the LORD, \n" +
                "to the priest at the entrance of the tent of meeting, and sacrifice them as sacrifices of peace offerings to the LORD. \n" +
                "6 And the priest shall throw the blood on the altar of the LORD at the entrance of the tent of meeting \n" +
                "and burn the fat for a pleasing aroma to the LORD. \n" +
                "7 So they shall no more sacrifice their sacrifices to goat demons, after whom they whore. \n" +
                "This shall be a statute forever for them throughout their generations.\n" +
                "8 “And you shall say to them, Any one of the house of Israel, or of the strangers who sojourn among them, \n" +
                "who offers a burnt offering or sacrifice \n" +
                "9 and does not bring it to the entrance of the tent of meeting to offer it to the LORD, that man shall be cut off from his people.\n";

        String chapterSecondTitle = "Laws Against Eating Blood";

        String secondContent = "10 “If any one of the house of Israel or of the strangers who sojourn among them eats any blood, \n" +
                "I will set my face against that person who eats blood and will cut him off from among his people. \n" +
                "11 For the life of the flesh is in the blood, and I have given it for you on the altar gto make atonement for your souls, \n" +
                "for it is the blood that makes atonement by the life. \n" +
                "12 Therefore I have said to the people of Israel, No person among you shall eat blood, neither shall any stranger who sojourns among you eat blood.\n" +
                "13 “Any one also of the people of Israel, or of the strangers who sojourn among them, who takes in hunting any beast \n" +
                "or bird that may be eaten shall pour out its blood and cover it with earth. \n" +
                "14 For the life of every creature is its blood: its blood is its life. Therefore I have said to the people of Israel, \n" +
                "You shall not eat the blood of any creature, for the life of every creature is its blood. Whoever eats it shall be cut off.\n" +
                "15 And every person who eats what dies of itself or what is torn by beasts, whether he is a native or a sojourner, \n" +
                "shall wash his clothes and bathe himself in water and be unclean until the evening; then he shall be clean. \n" +
                "16 But if he does not wash them or bathe his flesh, he shall bear his iniquity.”\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table17.add(lblFirstTitle).pad(10,50,0,0).left();
        table17.row();

        //content of the chapter
        table17.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table17.row();

        //title of the second content
        table17.add(lblSecondTitle).pad(10,50,0,0).left();
        table17.row();

        //content of the second title
        table17.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table17);


    }


    public void chapterEighteenOFLeviticus() {

        table18 = new Table();
        table18.setWidth(tableBG.getWidth());
        table18.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table18.setFillParent(true);
        table18.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
        
        String chapterFirstTitle = "Unlawful Sexual Relations";

        String firstContent = "1 And the LORD spoke to Moses, saying, \n" +
                "2 “Speak to the people of Israel and say to them, I am the LORD your God. \n" +
                "3 You shall not do as they do in the land of Egypt, where you lived, and you shall not do as they do in the land of Canaan, \n" +
                "to which I am bringing you. You shall not walk in their statutes. \n" +
                "4 You shall follow my rules and keep my statutes and walk in them. I am the LORD your God.\n" +
                "5 You shall therefore keep my statutes and my rules; if a person does them, he shall live by them: I am the LORD.\n" +
                "6 “None of you shall approach any one of his close relatives to uncover nakedness. I am the LORD. \n" +
                "7 You shall not uncover the nakedness of your father, which is the nakedness of your mother; she is your mother,\n" +
                " you shall not uncover her nakedness. \n" +
                "8 You shall not uncover the nakedness of your father's wife; it is your father's nakedness. \n" +
                "9 You shall not uncover the nakedness of your sister, your father's daughter or your mother's daughter, \n" +
                "whether brought up in the family or in another home. \n" +
                "10 You shall not uncover the nakedness of your son's daughter or of your daughter's daughter, for their nakedness is your own nakedness. \n" +
                "11 You shall not uncover the nakedness of your father's wife's daughter, brought up in your father's family, since she is your sister. \n" +
                "12 You shall not uncover the nakedness of your father's sister; she is your father's relative. \n" +
                "13 You shall not uncover the nakedness of your mother's sister, for she is your mother's relative.\n" +
                "14 You shall not uncover the nakedness of your father's brother, that is, you shall not approach his wife; she is your aunt. \n" +
                "15 You shall not uncover the nakedness of your daughter-in-law; she is your son's wife, you shall not uncover her nakedness. \n" +
                "16 You shall not uncover the nakedness of your brother's wife; it is your brother's nakedness. \n" +
                "17 You shall not uncover the nakedness of a woman and of her daughter, \n" +
                "and you shall not take her son's daughter or her daughter's daughter to uncover her nakedness; they are relatives; it is depravity. \n" +
                "18 And you shall not take a woman as a rival wife to her sister, uncovering her nakedness while her sister is still alive.\n" +
                "19 “You shall not approach a woman to uncover her nakedness while she is in her menstrual uncleanness. \n" +
                "20 And you shall not lie sexually with your neighbor's wife and so make yourself unclean with her. \n" +
                "21 You shall not give any of your children to offer them to Molech, and so profane the name of your God: I am the LORD. \n" +
                "22 You shall not lie with a male as with a woman; it is an abomination. \n" +
                "23 And you shall not lie with any animal and so make yourself unclean with it, neither shall \n" +
                "any woman give herself to an animal to lie with it: it is perversion.\n" +
                "24 “Do not make yourselves unclean by any of these things, for by all these the nations I am driving out before you have become unclean,\n" +
                "25 and the land became unclean, so that I punished its iniquity, and the land vomited out its inhabitants. \n" +
                "26 But  you shall keep my statutes and my rules and do none of these abominations, either the native or the stranger who sojourns among you \n" +
                "27 (for the people of the land, who were before you, did all of these abominations, so that the land became unclean), \n" +
                "28 lest the land vomit you out when you make it unclean, as it vomited out the nation that was before you. \n" +
                "29 For everyone who does any of these abominations, the persons who do them shall be cut off from among their people. \n" +
                "30 So keep my charge never to practice any of these abominable customs that were practiced before you, and never to make yourselves \n" +
                "unclean by them: I am the LORD your God.”\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table18.add(lblFirstTitle).pad(10,50,0,0).left();
        table18.row();

        //content of the chapter
        table18.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table18);


    }


    public void chapterNineteenOFLeviticus() {

        table19 = new Table();
        table19.setWidth(tableBG.getWidth());
        table19.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table19.setFillParent(true);
        table19.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The LORD Is Holy";

        String firstContent = "1 And the LORD spoke to Moses, saying, \n" +
                "2 “Speak to all the congregation of the people of Israel and say to them, You shall be holy, for I the LORD your God am holy. \n" +
                "3 Every one of you shall revere his mother and his father, and you shall keep my Sabbaths: I am the LORD your God. \n" +
                "4 Do not turn to idols or make for yourselves any gods of cast metal: I am the LORD your God.\n" +
                "5 “When you offer a sacrifice of peace offerings to the LORD, you shall offer it so that you may be accepted. \n" +
                "6 It shall be eaten the same day you offer it or on the day after, and anything left over until the third day shall be burned up with fire. \n" +
                "7 If it is eaten at all on the third day, it is tainted; it will not be accepted, \n" +
                "8 and everyone who eats it shall bear his iniquity, because he has profaned what is holy to the LORD, and that person shall be cut off from his people.\n";


        String chapterSecondTitle = "Love Your Neighbor as Yourself";

        String secondContent = "9 “When you reap the harvest of your land, you shall not reap your field right up to its edge, \n" +
                "neither shall you gather the gleanings after your harvest. \n" +
                "10 And you shall not strip your vineyard bare, neither shall you gather the fallen grapes of your vineyard. \n" +
                "You shall leave them for the poor and for the sojourner: I am the LORD your God.\n" +
                "11 “You shall not steal; you shall not deal falsely; you shall not lie to one another. \n" +
                "12 You shall not swear by my name falsely, and so profane the name of your God: I am the LORD.\n" +
                "13 “You shall not oppress your neighbor or rob him. The wages of a hired worker shall not remain with you all night until the morning.\n" +
                "14 You shall not curse the deaf or put a stumbling block before the blind, but you shall fear your God: I am the LORD.\n" +
                "15 “You shall do no injustice in court. You shall not be partial to the poor or defer to the great, \n" +
                "but in righteousness shall you judge your neighbor. \n" +
                "16 You shall not go around as a slanderer among your people, and you shall not stand up against the life of your neighbor: I am the LORD.\n" +
                "17 “You shall not hate your brother in your heart, but you shall reason frankly with your neighbor, lest you incur sin because of him.\n" +
                "18 You shall not take vengeance or bear a grudge against the sons of your own people, but you shall love your neighbor as yourself: I am the LORD.\n";

        String chapterThirdTitle = "You Shall Keep My Statutes";

        String thirdContent = "19 “You shall keep my statutes. You shall not let your cattle breed with a different kind. \n" +
                "You shall not sow your field with two kinds of seed, nor shall you wear a garment of cloth made of two kinds of material.\n" +
                "20 “If a man lies sexually with a woman who is a slave, assigned to another man and not yet ransomed or given her freedom, \n" +
                "a distinction shall be made. They shall not be put to death, because she was not free;\n" +
                "21 but he shall bring his compensation to the LORD, to the entrance of the tent of meeting, a ram for a guilt offering. \n" +
                "22 And the priest shall make atonement for him with the ram of the guilt offering before the LORD for his sin that he has committed, \n" +
                "and he shall be forgiven for the sin that he has committed.\n" +
                "23 “When you come into the land and plant any kind of tree for food, then you shall regard its fruit as forbidden. \n" +
                "Three years it shall be forbidden to you; it must not be eaten. \n" +
                "24 And in the fourth year all its fruit shall be holy, an offering of praise to the LORD. \n" +
                "25 But in the fifth year you may eat of its fruit, to increase its yield for you: I am the LORD your God.\n" +
                "26 “You shall not eat any flesh with the blood in it. You shall not interpret omens or tell fortunes. \n" +
                "27 You shall not round off the hair on your temples or mar the edges of your beard. \n" +
                "28 You shall not make any cuts on your body for the dead or tattoo yourselves: I am the LORD.\n" +
                "29 “Do not profane your daughter by making her a prostitute, lest the land fall into prostitution and the land become full of depravity.\n" +
                "30 You shall keep my Sabbaths and reverence my sanctuary: I am the LORD.\n" +
                "31 “Do not turn to mediums or necromancers; do not seek them out, and so make yourselves unclean by them: I am the LORD your God.\n" +
                "32 “You shall stand up before the gray head and honor the face of an old man, and you shall hfear your God: I am the LORD.\n" +
                "33 “When a stranger sojourns with you in your land, you shall not do him wrong. \n" +
                "34 You shall treat the stranger who sojourns with you as the native among you, and you shall love him as yourself, \n" +
                "for you were strangers in the land of Egypt: I am the LORD your God.\n" +
                "35 “You shall do no wrong in judgment, in measures of length or weight or quantity. \n" +
                "36 You shall have just balances, just weights, a just ephah, and a just hin:3 I am the LORD your God, who brought you out of the land of Egypt. \n" +
                "37 And you shall observe all my statutes and all my rules, and do them: I am the LORD.”\n";
 

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblThirdTitle = new Label(chapterThirdTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);


        //title of the chapter
        table19.add(lblFirstTitle).pad(10,50,0,0).left();
        table19.row();

        //content of the chapter
        table19.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table19.row();

        //title of the second content
        table19.add(lblSecondTitle).pad(10,50,0,0).left();
        table19.row();

        //content of the second title
        table19.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table19.row();

        //title of the third content
        table19.add(lblThirdTitle).pad(10,50,0,0).left();
        table19.row();

        //content of the third title
        table19.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table19);


    }


    public void chapterTwentyOFLeviticus() {

        table20 = new Table();
        table20.setWidth(tableBG.getWidth());
        table20.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table20.setFillParent(true);
        table20.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Punishment for Child Sacrifice";

        String firstContent = "1 The LORD spoke to Moses, saying, \n" +
                "2 “Say to the people of Israel, Any one of the people of Israel or of the strangers who sojourn in Israel \n" +
                "who gives any of his children to Molech shall surely be put to death. The people of the land shall stone him with stones. \n" +
                "3 I myself will set my face against that man and will cut him off from among his people, \n" +
                "because he has given one of his children to Molech, to make my sanctuary unclean and to profane my holy name. \n" +
                "4 And if the people of the land do at all close their eyes to that man when he gives one of his children to Molech, and do not put him to death, \n" +
                "5 then I will set my face against that man and against his clan and will cut them off from among their people, \n" +
                "him and all who follow him in whoring after Molech.\n" +
                "6 “If a person turns to mediums and necromancers, whoring after them, I will set my face against that person and \n" +
                "will cut him off from among his people. \n" +
                "7 Consecrate yourselves, therefore, and be holy, for I am the LORD your God. \n" +
                "8 Keep my statutes and do them; I am the LORD who sanctifies you. \n" +
                "9 For anyone who curses his father or his mother shall surely be put to death; he has cursed his father or his mother; his blood is upon him.\n";


        String chapterSecondTitle = "Punishments for Sexual Immorality";

        String secondContent = "10 “If a man commits adultery with the wife of1 his neighbor, both the adulterer and the adulteress shall surely be put to death. \n" +
                "11 If a man lies with his father's wife, he has uncovered his father's nakedness; both of them shall surely be put to death; their blood is upon them. \n" +
                "12 If a man lies with his daughter-in-law, both of them shall surely be put to death; they have committed perversion; their blood is upon them. \n" +
                "13 If a man lies with a male as with a woman, both of them have committed an abomination; they shall surely be put to death; their blood is upon them. \n" +
                "14 If a man takes a woman and her mother also, it is depravity; he and they shall be burned with fire, that there may be no depravity among you. \n" +
                "15 If a man lies with an animal, he shall surely be put to death, and you shall kill the animal. \n" +
                "16 If a woman approaches any animal and lies with it, you shall kill the woman and the animal; they shall surely be put to death; \n" +
                "their blood is upon them.\n" +
                "17 “If a man takes his sister, a daughter of his father or a daughter of his mother, and sees her nakedness, and she sees his nakedness, \n" +
                "it is a disgrace, and they shall be cut off in the sight of the children of their people. He has uncovered his sister's nakedness, \n" +
                "and he shall bear his iniquity. \n" +
                "18 If a man lies with a woman during her menstrual period and uncovers her nakedness, he has made naked her fountain, \n" +
                "and she has uncovered the fountain of her blood. Both of them shall be cut off from among their people. \n" +
                "19 You shall not uncover the nakedness of your mother's sister or of your father's sister, for that is to make naked one's relative; \n" +
                "they shall bear their iniquity. \n" +
                "20 If a man lies with his uncle's wife, he has uncovered his uncle's nakedness; they shall bear their sin; they shall die childless. \n" +
                "21 If a man takes his brother's wife, it is impurity.2 He has uncovered his brother's nakedness; they shall be childless.\n";

        String chapterThirdTitle = "You Shall Be Holy";

        String thirdContent = "22 “You shall therefore keep all my statutes and all my rules and do them, \n" +
                "that the land where I am bringing you to live may not vomit you out. \n" +
                "23 And you shall not walk in the customs of the nation that I am driving out before you, for they did all these things, \n" +
                "and therefore I detested them. \n" +
                "24 But I have said to you, ‘You shall inherit their land, and I will give it to you to possess, a land flowing with milk and honey.’ \n" +
                "I am the LORD your God, who has separated you from the peoples.\n" +
                "25 You shall therefore separate the clean beast from the unclean, and the unclean bird from the clean. \n" +
                "You shall not make yourselves detestable by beast or by bird or by anything with which the ground crawls, \n" +
                "which I have set apart for you to hold unclean. \n" +
                "26 You shall be holy to me, for I the LORD am holy and have separated you from the peoples, that you should be mine.\n" +
                "27 “A man or a woman who is a medium or a necromancer shall surely be put to death. \n" +
                "They shall be stoned with stones; their blood shall be upon them.”\n";
 

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblThirdTitle = new Label(chapterThirdTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);

        //title of the chapter
        table20.add(lblFirstTitle).pad(10,50,0,0).left();
        table20.row();

        //content of the chapter
        table20.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table20.row();

        //title of the second content
        table20.add(lblSecondTitle).pad(10,50,0,0).left();
        table20.row();

        //content of the second title
        table20.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table20.row();

        //title of the third content
        table20.add(lblThirdTitle).pad(10,50,0,0).left();
        table20.row();

        //content of the third title
        table20.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table20);


    }


    public void chapterTwentyOneOFLeviticus() {

        table21 = new Table();
        table21.setWidth(tableBG.getWidth());
        table21.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table21.setFillParent(true);
        table21.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Holiness and the Priests";

        String firstContent = "1 And the LORD said to Moses, “Speak to the priests, the sons of Aaron, and say to them, \n" +
                "No one shall make himself unclean for the dead among his people, \n" +
                "2 except for his closest relatives, his mother, his father, his son, his daughter, his brother, \n" +
                "3 or his virgin sister (who is near to him because she has had no husband; for her he may make himself unclean). \n" +
                "4 He shall not make himself unclean as a husband among his people and so profane himself. \n" +
                "5 They shall not make bald patches on their heads, nor shave off the edges of their beards, nor make any cuts on their body.\n" +
                "6 They shall be holy to their God and not profane the name of their God. For they offer the LORD's food offerings, \n" +
                "the bread of their God; therefore they shall be holy. \n" +
                "7 They shall not marry a prostitute or a woman who has been defiled, neither shall they marry a woman divorced from her husband, \n" +
                "for the priest is holy to his God. \n" +
                "8 You shall sanctify him, for he offers the bread of your God. He shall be holy to you, for I, the LORD, who sanctify you,  am holy.\n" +
                "9 And the daughter of any priest, if she profanes herself by whoring, profanes her father; she shall be burned with fire.\n" +
                "10 “The priest who is chief among his brothers, on whose head the anointing oil is poured and who has been consecrated to wear the garments, \n" +
                "shall not let the hair of his head hang loose nor tear his clothes. \n" +
                "11 He shall not go in to any dead bodies nor make himself unclean, even for his father or for his mother. \n" +
                "12 He shall not go out of the sanctuary, lest he profane the sanctuary of his God, for the consecration of the anointing oil of his God is on him: \n" +
                "I am the LORD.\n" +
                "13 And he shall take a wife in her virginity.\n" +
                "14 A widow, or a divorced woman, or a woman who has been defiled, or a prostitute, these he shall not marry. \n" +
                "But he shall take as his wife a virgin of his own people,\n" +
                "15 that he may not profane his offspring among his people, for I am the LORD who sanctifies him.”\n" +
                "16 And the LORD spoke to Moses, saying, \n" +
                "17 “Speak to Aaron, saying, None of your offspring throughout their generations who has a blemish may approach to offer the bread of his God. \n" +
                "18 For no one who has a blemish shall draw near, a man blind or lame, or one who has a mutilated face or a limb too long, \n" +
                "19 or a man who has an injured foot or an injured hand, \n" +
                "20 or a hunchback or a dwarf or a man with a defect in his sight or an itching disease or scabs or crushed testicles. \n" +
                "21 No man of the offspring of Aaron the priest who has a blemish shall come near to offer the LORD's food offerings; since he has a blemish, \n" +
                "he shall not come near to offer the bread of his God. \n" +
                "22 He may eat the bread of his God, both of the most holy and of the holy things, \n" +
                "23 but he shall not go through the veil or approach the altar, because he has a blemish, that he may not profane my sanctuaries, \n" +
                "for I am the LORD who sanctifies them.” \n" +
                "24 So Moses spoke to Aaron and to his sons and to all the people of Israel.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table21.add(lblFirstTitle).pad(10,50,0,0).left();
        table21.row();

        //content of the chapter
        table21.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table21);


    }


    public void chapterTwentyTwoOFLeviticus() {

        table22 = new Table();
        table22.setWidth(tableBG.getWidth());
        table22.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table22.setFillParent(true);
        table22.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 And the LORD spoke to Moses, saying, \n" +
                "2 “Speak to Aaron and his sons so that they abstain from the holy things of the people of Israel, \n" +
                "which they dedicate to me, so that they do not profane my holy name: I am the LORD. \n" +
                "3 Say to them, ‘If any one of all your offspring throughout your generations approaches \n" +
                "the holy things that the people of Israel dedicate to the LORD, while he has an uncleanness, \n" +
                "that person shall be cut off from my presence: I am the LORD. \n" +
                "4 None of the offspring of Aaron who has a leprous disease or a discharge may eat of the holy things until he is clean. \n" +
                "Whoever touches anything that is unclean through contact with the dead or a man who has had an emission of semen, \n" +
                "5 and whoever touches a swarming thing by which he may be made unclean or a person from whom he may take uncleanness, \n" +
                "whatever his uncleanness may be - the person who touches such a thing shall be unclean until the evening \n" +
                "and shall not eat of the holy things unless he has bathed his body in water.\n" +
                "7 When the sun goes down he shall be clean, and afterward he may eat of the holy things, because they are his food. \n" +
                "8 He shall not eat what dies of itself or is torn by beasts, and so make himself unclean by it: I am the LORD.’\n" +
                "9 They shall therefore keep my charge, lest they bear sin for it and die thereby when they profane it: I am the LORD who sanctifies them.\n" +
                "10 “A lay person shall not eat of a holy thing; no foreign guest of the priest or hired worker shall eat of a holy thing, \n" +
                "11 but if a priest buys a slave1 as his property for money, the slave2 may eat of it, and anyone born in his house may eat of his food. \n" +
                "12 If a priest's daughter marries a layman, she shall not eat of the contribution of the holy things. \n" +
                "13 But if a priest's daughter is widowed or divorced and has no child and returns to her father's house, as in her youth, \n" +
                "she may eat of her father's food; yet no lay person shall eat of it. \n" +
                "14 And if anyone eats of a holy thing unintentionally, he shall add the fifth of its value to it and give the holy thing to the priest. \n" +
                "15 They shall not profane the holy things of the people of Israel, which they contribute to the LORD, \n" +
                "16 and so cause them to bear iniquity and guilt, by eating their holy things: for I am the LORD who sanctifies them.”\n";


        String chapterSecondTitle = "Acceptable Offerings";

        String secondContent = "17 And the LORD spoke to Moses, saying, \n" +
                "18 “Speak to Aaron and his sons and all the people of Israel and say to them, When any one of the house of Israel \n" +
                "or of the sojourners in Israel presents a burnt offering as his offering, for any of their vows or freewill offerings that they offer to the LORD, \n" +
                "19 if it is to be accepted for you it shall be a male without blemish, of the bulls or the sheep or the goats. \n" +
                "20 You shall not offer anything that has a blemish, for it will not be acceptable for you. 21 And when anyone \n" +
                "offers a sacrifice of peace offerings to the LORD to fulfill a vow or as a freewill offering from the herd or from the flock,\n" +
                "to be accepted it must be perfect; there shall be no blemish in it. \n" +
                "22 Animals blind or disabled or mutilated or having a discharge or an itch or scabs you shall not offer to the LORD or give them to the LORD \n" +
                "as a food offering on the altar. \n" +
                "23 You may present a bull or a lamb that has a part too long or too short for a freewill offering, but for a vow offering it cannot be accepted. \n" +
                "24 Any animal that has its testicles bruised or crushed or torn or cut you shall not offer to the LORD; you shall not do it within your land, \n" +
                "25 neither shall you offer as the bread of your God any such animals gotten from a foreigner. Since there is a blemish in them, \n" +
                "because of their mutilation, they will not be accepted for you.”\n" +
                "26 And the LORD spoke to Moses, saying, \n" +
                "27 “When an ox or sheep or goat is born, it shall remain seven days with its mother, and from the eighth day on it \n" +
                "shall be acceptable as a food offering to the LORD. \n" +
                "28 But you shall not kill an ox or a sheep and her young in one day. \n" +
                "29 And when you sacrifice a sacrifice of thanksgiving to the LORD, you shall sacrifice it so that you may be accepted. \n" +
                "30 It shall be eaten on the same day; you shall leave none of it until morning: I am the LORD.\n" +
                "31 “So you shall keep my commandments and do them: I am the LORD. \n" +
                "32 And you shall not profane my holy name, that I may be sanctified among the people of Israel. I am the LORD who sanctifies you, \n" +
                "33 who brought you out of the land of Egypt to be your God: I am the LORD.”\n";
  

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table22.add(lblFirstTitle).pad(10,50,0,0).left();
        table22.row();

        //content of the chapter
        table22.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table22.row();

        //title of the second content
        table22.add(lblSecondTitle).pad(10,50,0,0).left();
        table22.row();

        //content of the second title
        table22.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table22);


    }


    public void chapterTwentyThreeOFLeviticus() {

        table23 = new Table();
        table23.setWidth(tableBG.getWidth());
        table23.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table23.setFillParent(true);
        table23.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Feasts of the LORD";

        String firstContent = "1 The LORD spoke to Moses, saying, \n" +
                "2 “Speak to the people of Israel and say to them, These are the appointed feasts of the LORD that you shall proclaim as holy convocations; \n" +
                "they are my appointed feasts.\n";


        String chapterSecondTitle = "The Sabbath";

        String secondContent = "3 “Six days shall work be done, but on the seventh day is a Sabbath of solemn rest, a holy convocation. \n" +
                "You shall do no work. It is a Sabbath to the LORD in all your dwelling places.";


        String chapterThirdTitle = "The Passover";

        String thirdContent = "4 “These are the appointed feasts of the LORD, the holy convocations, which you shall proclaim at the time appointed for them.\n" +
                "5 In the first month, on the fourteenth day of the month at twilight,1 is the LORD's Passover. \n" +
                "6 And on the fifteenth day of the same month is the Feast of Unleavened Bread to the LORD; for seven days you shall eat unleavened bread. \n" +
                "7 On the first day you shall have a holy convocation; you shall not do any ordinary work. \n" +
                "8 But you shall present a food offering to the LORD for seven days. On the seventh day is a holy convocation; you shall not do any ordinary work.”\n";


        String chapterFourthTitle = "The Feast of Firstfruits";

        String fourthContent = "9 And the LORD spoke to Moses, saying, \n" +
                "10 “Speak to the people of Israel and say to them, When you come into the land that I give you and reap its harvest, \n" +
                "you shall bring the sheaf of the firstfruits of your harvest to the priest, \n" +
                "11 and he shall wave the sheaf before the LORD, so that you may be accepted. On the day after the Sabbath the priest shall wave it. \n" +
                "12 And on the day when you wave the sheaf, you shall offer a male lamb a year old without blemish as a burnt offering to the LORD.\n" +
                "13 And the grain offering with it shall be two tenths of an ephah of fine flour mixed with oil, a food offering to the LORD with a pleasing aroma, \n" +
                "and the drink offering with it shall be of wine, a fourth of a hin.\n" +
                "14 And you shall eat neither bread nor grain parched or fresh until this same day, until you have brought the offering of your God: \n" +
                "it is a statute forever throughout your generations in all your dwellings.\n";


        String chapterFifthTitle = "The Feast of Weeks";

        String fifthContent = "15 “You shall count seven full weeks from the day after the Sabbath, from the day that you brought the sheaf of the wave offering. \n" +
                "16 You shall count fifty days to the day after the seventh Sabbath. Then you shall present a grain offering of new grain to the LORD. \n" +
                "17 You shall bring from your dwelling places two loaves of bread to be waved, made of two tenths of an ephah. They shall be of fine flour, \n" +
                "and they shall be baked with leaven, as firstfruits to the LORD. \n" +
                "18 And you shall present with the bread seven lambs a year old without blemish, and one bull from the herd and two rams. \n" +
                "They shall be a burnt offering to the LORD, with their grain offering and their drink offerings, a food offering with a pleasing aroma to the LORD. \n" +
                "19 And you shall offer one male goat for a sin offering, and two male lambs a year old as a sacrifice of peace offerings. \n" +
                "20 And the priest shall wave them with the bread of the firstfruits as a wave offering before the LORD, with the two lambs. \n" +
                "They shall be holy to the LORD for the priest. \n" +
                "21 And you shall make a proclamation on the same day. You shall hold a holy convocation. You shall not do any ordinary work. \n" +
                "It is a statute forever in all your dwelling places throughout your generations.\n" +
                "22 “And when you reap the harvest of your land, you shall not reap your field right up to its edge, \n" +
                "nor shall you gather the gleanings after your harvest. You shall leave them for the poor and for the sojourner: I am the LORD your God.”\n";


        String chapterSixthTitle = "The Feast of Trumpets";

        String sixthContent = "23 And the LORD spoke to Moses, saying, \n" +
                "24 “Speak to the people of Israel, saying, In the seventh month, on the first day of the month, you shall observe a day of solemn rest, \n" +
                "a memorial proclaimed with blast of trumpets, a holy convocation. \n" +
                "25 You shall not do any ordinary work, and you shall present a food offering to the LORD.”\n";


        String chapterSeventhTitle = "The Day of Atonement";

        String seventhContent = "26 And the LORD spoke to Moses, saying, \n" +
                "27 “Now on the tenth day of this seventh month is the Day of Atonement. It shall be for you a time of holy convocation, \n" +
                "and you shall afflict yourselves4 and present a food offering to the LORD. \n" +
                "28 And you shall not do any work on that very day, for it is a Day of Atonement, to make atonement for you before the LORD your God. \n" +
                "29 For whoever is not afflicted on that very day shall be cut off from his people. \n" +
                "30 And whoever does any work on that very day, that person I will destroy from among his people. \n" +
                "31 You shall not do any work. It is a statute forever throughout your generations in all your dwelling places. \n" +
                "32 It shall be to you a Sabbath of solemn rest, and you shall afflict yourselves. On the ninth day of the month beginning at evening, \n" +
                "from evening to evening shall you keep your Sabbath.”\n";

        String chapterEightTitle = "The Feast of Booths";

        String eightContent = "33 And the LORD spoke to Moses, saying, \n" +
                "34 “Speak to the people of Israel, saying, On the fifteenth day of this seventh month and for seven days is the Feast of Booths to the LORD. \n" +
                "35 On the first day shall be a holy convocation; you shall not do any ordinary work. \n" +
                "36 For seven days you shall present food offerings to the LORD. On the eighth day you shall hold a holy convocation \n" +
                "and present a food offering to the LORD. It is a solemn assembly; you shall not do any ordinary work.\n" +
                "37 “These are the appointed feasts of the LORD, which you shall proclaim as times of holy convocation, for presenting to the LORD food offerings,\n" +
                " burnt offerings and grain offerings, sacrifices and drink offerings, each on its proper day, \n" +
                "38  besides the LORD's Sabbaths and besides your gifts and besides all your vow offerings and besides all your freewill offerings, \n" +
                "which you give to the LORD.\n" +
                "39 “On the fifteenth day of the seventh month, when you have gathered in the produce of the land, you shall celebrate \n" +
                "the feast of the LORD seven days. On the first day shall be a solemn rest, and on the eighth day shall be a solemn rest. \n" +
                "40 And you shall take on the first day the fruit of splendid trees, branches of palm trees and boughs of leafy trees and willows of the brook, \n" +
                "and you shall rejoice before the LORD your God seven days. \n" +
                "41 You shall celebrate it as a feast to the LORD for seven days in the year. It is a statute forever throughout your generations; \n" +
                "you shall celebrate it in the seventh month. \n" +
                "42 You shall dwell in booths for seven days. All native Israelites shall dwell in booths,\n" +
                "43 that your generations may know that I made the people of Israel dwell in booths when I brought them out of the land of Egypt: \n" +
                "I am the LORD your God.”\n" +
                "44 Thus Moses declared to the people of Israel the appointed feasts of the LORD. \n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblThirdTitle = new Label(chapterThirdTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblFourthTitle = new Label(chapterFourthTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblFifthTitle = new Label(chapterFifthTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSixthTitle = new Label(chapterSixthTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSeventhTitle = new Label(chapterSeventhTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblEightTitle = new Label(chapterEightTitle, new Label.LabelStyle(contentFont, Color.WHITE));


        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);

        txtFourthContent = new Label(fourthContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFourthContent.setWrap(true);

        txtFifthContent = new Label(fifthContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFifthContent.setWrap(true);

        txtSixthContent = new Label(sixthContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSixthContent.setWrap(true);

        txtSeventhContent = new Label(seventhContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSeventhContent.setWrap(true);

        txtEightContent = new Label(eightContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtEightContent.setWrap(true);


        //title of the chapter
        table23.add(lblFirstTitle).pad(10,50,0,0).left();
        table23.row();

        //content of the chapter
        table23.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table23.row();

        //title of the second content
        table23.add(lblSecondTitle).pad(10,50,0,0).left();
        table23.row();

        //content of the second title
        table23.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table23.row();

        //title of the third content
        table23.add(lblThirdTitle).pad(10,50,0,0).left();
        table23.row();

        //content of the third title
        table23.add(txtThirdContent).pad(10,70,0,0).left().width(900);
        table23.row();

        //title of the fourth content
        table23.add(lblFourthTitle).pad(10,50,0,0).left();
        table23.row();

        //content of the fourth title
        table23.add(txtFourthContent).pad(10,70,0,0).left().width(900);
        table23.row();

        //title of the fifth content
        table23.add(lblFifthTitle).pad(10,50,0,0).left();
        table23.row();

        //content of the fifth title
        table23.add(txtFifthContent).pad(10,70,0,0).left().width(900);
        table23.row();

        //title of the sixth content
        table23.add(lblSixthTitle).pad(10,50,0,0).left();
        table23.row();

        //content of the sixth title
        table23.add(txtSixthContent).pad(10,70,0,0).left().width(900);
        table23.row();

        //title of the seventh content
        table23.add(lblSeventhTitle).pad(10,50,0,0).left();
        table23.row();

        //content of the seventh title
        table23.add(txtSeventhContent).pad(10,70,0,0).left().width(900);
        table23.row();

        //title of the eight content
        table23.add(lblEightTitle).pad(10,50,0,0).left();
        table23.row();

        //content of the eight title
        table23.add(txtEightContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table23);


    }


    public void chapterTwentyFourOFLeviticus() {

        table24 = new Table();
        table24.setWidth(tableBG.getWidth());
        table24.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table24.setFillParent(true);
        table24.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Lamps";

        String firstContent = "1 The LORD spoke to Moses, saying, \n" +
                "2 “Command the people of Israel to bring you pure oil from beaten olives for the lamp, that a light may be kept burning regularly. \n" +
                "3 Outside the veil of the testimony, in the tent of meeting, Aaron shall arrange it from evening to morning before the LORD regularly. \n" +
                "It shall be a statute forever throughout your generations. \n" +
                "4 He shall arrange the lamps on the lampstand of pure gold1 before the LORD regularly.\n";


        String chapterSecondTitle = "Bread for the Tabernacle";

        String secondContent = "5 “You shall take fine flour and bake twelve loaves from it; two tenths of an ephah2 shall be in each loaf. \n" +
                "6 And you shall set them in two piles, six in a pile, on the table of pure gold3 before the LORD.\n" +
                "7 And you shall put pure frankincense on each pile, that it may go with the bread as a memorial portion as a food offering to the LORD. \n" +
                "8 Every Sabbath day Aaron shall arrange it before the LORD regularly; it is from the people of Israel as a covenant forever. \n" +
                "9 And it shall be for Aaron and his sons, and they shall eat it in a holy place, since it is for him a most holy portion out of the LORD's \n" +
                "food offerings, a perpetual due.”\n";


        String chapterThirdTitle = "Punishment for Blasphemy";

        String thirdContent = "10 Now an Israelite woman's son, whose father was an Egyptian, went out among the people of Israel. \n" +
                "And the Israelite woman's son and a man of Israel fought in the camp, \n" +
                "11 and the Israelite woman's son blasphemed the Name, and cursed. Then they brought him to Moses. His mother's name was Shelomith, \n" +
                "the daughter of Dibri, of the tribe of Dan. \n" +
                "12 And they put him in custody, till the will of the LORD should be clear to them.\n" +
                "13 Then the LORD spoke to Moses, saying, \n" +
                "14 “Bring out of the camp the one who cursed, and let all who heard him olay their hands on his head, and let all the congregation stone him. \n" +
                "15 And speak to the people of Israel, saying, Whoever curses his God shall pbear his sin. \n" +
                "16 Whoever blasphemes the name of the LORD shall surely be put to death. All the congregation shall stone him. The sojourner as well as the native, \n" +
                "when he blasphemes the Name, shall be put to death.\n";

        String chapterFourthTitle = "An Eye for an Eye";

        String fourthContent = "17  “Whoever takes a human life shall surely be put to death.\n" +
                "18 Whoever takes an animal's life shall make it good, life for life. \n" +
                "19 If anyone injures his neighbor, tas he has done it shall be done to him,\n" +
                "20 fracture for fracture, eye for eye, tooth for tooth; whatever injury he has given a person shall be given to him. \n" +
                "21 Whoever kills an animal shall make it good, rand whoever kills a person shall be put to death.\n" +
                "22 You shall have the same rule for the sojourner and for the native, for I am the LORD your God.” \n" +
                "23 So Moses spoke to the people of Israel, and they brought out of the camp the one who had cursed and stoned him with stones. \n" +
                "Thus the people of Israel did as the LORD commanded Moses.\n";
   

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblThirdTitle = new Label(chapterThirdTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblFourthTitle = new Label(chapterFourthTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);

        txtFourthContent = new Label(fourthContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFourthContent.setWrap(true);


        //title of the chapter
        table24.add(lblFirstTitle).pad(10,50,0,0).left();
        table24.row();

        //content of the chapter
        table24.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table24.row();

        //title of the second content
        table24.add(lblSecondTitle).pad(10,50,0,0).left();
        table24.row();

        //content of the second title
        table24.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table24.row();

        //title of the third content
        table24.add(lblThirdTitle).pad(10,50,0,0).left();
        table24.row();

        //content of the third title
        table24.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        //title of the fourth content
        table24.add(lblFourthTitle).pad(10,50,0,0).left();
        table24.row();

        //content of the fourtn title
        table24.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table24);

    }


    public void chapterTwentyFiveOFLeviticus() {

        table25 = new Table();
        table25.setWidth(tableBG.getWidth());
        table25.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table25.setFillParent(true);
        table25.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Sabbath Year";

        String firstContent = "1 The LORD spoke to Moses on Mount Sinai, saying, \n" +
                "2 “Speak to the people of Israel and say to them, When you come into the land that I give you, the land shall keep a Sabbath to the LORD. \n" +
                "3 For six years you shall sow your field, and for six years you shall prune your vineyard and gather in its fruits, \n" +
                "4 but in the seventh year there shall be a Sabbath of solemn rest for the land, a Sabbath to the LORD. \n" +
                "You shall not sow your field or prune your vineyard. \n" +
                "5 You shall not reap what grows of itself in your harvest, or gather the grapes of your undressed vine. \n" +
                "It shall be a year of solemn rest for the land. \n" +
                "6 The Sabbath of the land shall provide food for you, for yourself and for your male and female slaves \n" +
                "and for your hired worker and the sojourner who lives with you, \n" +
                "7 and for your cattle and for the wild animals that are in your land:  all its yield shall be for food.\n";


        String chapterSecondTitle = "The Year of Jubilee";

        String secondContent = "8 “You shall count seven weeks3 of years, seven times seven years, so that the time of the seven weeks of years \n" +
                "shall give you forty-nine years.\n" +
                "9 Then you shall sound the loud trumpet on the tenth day of the seventh month. On the Day of Atonement \n" +
                "you shall sound the trumpet throughout all your land. \n" +
                "10 And you shall consecrate the fiftieth year, and proclaim liberty throughout the land to all its inhabitants. \n" +
                "It shall be a jubilee for you, when each of you shall return to his property and each of you shall return to his clan. \n" +
                "11 That fiftieth year shall be a jubilee for you; in it you shall neither sow nor reap what grows of itself \n" +
                "nor gather the grapes from the undressed vines. \n" +
                "12 For it is a jubilee. It shall be holy to you.  You may eat the produce of the field.4\n" +
                "13 “In this year of jubilee each of you shall return to his property.\n" +
                "14 And if you make a sale to your neighbor or buy from your neighbor, you shall not wrong one another. \n" +
                "15 You shall pay your neighbor according to the number of years after the jubilee, and he shall sell to you \n" +
                "according to the number of years for crops. \n" +
                "16 If the years are many, you shall increase the price, and if the years are few, you shall reduce the price, \n" +
                "for it is the number of the crops that he is selling to you. \n" +
                "17 You shall not wrong one another, but you shall fear your God, for I am the LORD your God.\n" +
                "18 “Therefore you shall do my statutes and keep my rules and perform them, and then you will dwell in the land securely. \n" +
                "19 The land will yield its fruit, and you will eat your fill and dwell in it securely.\n" +
                "20 And if you say, ‘What shall we eat in the seventh year, if we may not sow or gather in our crop?’ \n" +
                "21 I will command my blessing on you in the sixth year, so that it will produce a crop sufficient for three years.\n" +
                "22 When you sow in the eighth year, you will be eating some of the old crop; you shall eat the old until the ninth year, when its crop arrives.\n";


        String chapterThirdTitle = "Redemption of Property";

        String thirdContent = "23 “The land shall not be sold in perpetuity, for the land is mine. For you are strangers and sojourners with me.\n" +
                "24 And in all the country you possess, you shall allow a redemption of the land.\n" +
                "25 “If your brother becomes poor and sells part of his property,  then his nearest redeemer shall come and redeem what his brother has sold.\n" +
                "26 If a man has no one to redeem it and then himself becomes prosperous and finds sufficient means to redeem it, \n" +
                "27 let him calculate the years since he sold it and pay back the balance to the man to whom he sold it, and then return to his property. \n" +
                "28 But if he does not have sufficient means to recover it, then what he sold shall remain in the hand of the buyer until the year of jubilee. \n" +
                "In the jubilee it shall be released, and he shall return to his property.\n" +
                "29 “If a man sells a dwelling house in a walled city, he may redeem it within a year of its sale. \n" +
                "For a full year he shall have the right of redemption. \n" +
                "30 If it is not redeemed within a full year, then the house in the walled city shall belong in perpetuity to the buyer, \n" +
                "throughout his generations; it shall not be released in the jubilee. \n" +
                "31 But the houses of the villages that have no wall around them shall be classified with the fields of the land. \n" +
                "They may be redeemed, and they shall be released in the jubilee. \n" +
                "32 As for the cities of the Levites, the Levites may redeem at any time the houses in the cities they possess. \n" +
                "33 And if one of the Levites exercises his right of redemption, then the house that was sold in a city \n" +
                "they possess shall be released in the jubilee. For the houses in the cities of the Levites are their possession among the people of Israel. \n" +
                "34 But the fields of pastureland belonging to their cities may not be sold, for that is their possession forever.\n";

        String chapterFourthTitle = "Kindness for Poor Brothers";

        String fourthContent = "35 “If your brother becomes poor and cannot maintain himself with you, you shall support him as though \n" +
                "he were a stranger and a sojourner, and he shall live with you. \n" +
                "36 Take no interest from him or profit, but fear your God, that your brother may live beside you. \n" +
                "37 You shall not lend him your money at interest, nor give him your food for profit. \n" +
                "38 I am the LORD your God, who brought you out of the land of Egypt to give you the land of Canaan, and to be your God.\n" +
                "39 “If your brother becomes poor beside you and sells himself to you, you shall not make him serve as a slave: \n" +
                "40 he shall be with you as a hired worker and as a sojourner. He shall serve with you until the year of the jubilee. \n" +
                "41 Then he shall go out from you,  he and his children with him, and go back to his own clan and return to the possession of his fathers. \n" +
                "42 For they are my servants, whom I brought out of the land of Egypt; they shall not be sold as slaves. \n" +
                "43 You shall not rule over him ruthlessly but shall fear your God. \n" +
                "44 As for your male and female slaves whom you may have: \n" +
                "you may buy male and female slaves from among the nations that are around you. \n" +
                "45 You may also buy from among the strangers who sojourn with you and their clans that are with you, who have been born in your land, \n" +
                "and they may be your property.\n" +
                "46 You may bequeath them to your sons after you to inherit as a possession forever. You may make slaves of them, \n" +
                "but over your brothers the people of Israel you shall not rule, one over another ruthlessly.\n";

        String chapterFifthTitle = "Redeeming a Poor Man";

        String fifthContent = "47 “If a stranger or sojourner with you becomes rich, and your brother beside him becomes poor and sells himself \n" +
                "to the stranger or sojourner with you or to a member of the stranger's clan, \n" +
                "48 then after he is sold he may be redeemed. One of his brothers may redeem him, \n" +
                "49 or his uncle or his cousin may redeem him, or a close relative from his clan may redeem him. Or if he grows rich he may redeem himself.\n" +
                "50 He shall calculate with his buyer from the year when he sold himself to him until the year of jubilee, and the price of his sale \n" +
                "shall vary with the number of years. The time he was with his owner shall be prated as the time of a hired worker. \n" +
                "51 If there are still many years left, he shall pay proportionately for his redemption some of his sale price. \n" +
                "52 If there remain but a few years until the year of jubilee, he shall calculate and pay for his redemption in proportion to his years of service.\n" +
                "53 He shall treat him as a worker hired year by year.  He shall not rule ruthlessly over him in your sight.\n" +
                "54 And if he is not redeemed by these means, then he and his children with him shall be released in the year of jubilee.\n" +
                "55 For it is to me that the people of Israel are servants. They are my servants whom I brought out of the land of Egypt: I am the LORD your God.\n";

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblThirdTitle = new Label(chapterThirdTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblFourthTitle = new Label(chapterFourthTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblFifthTitle = new Label(chapterFifthTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);

        txtFourthContent = new Label(fourthContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFourthContent.setWrap(true);

        txtFifthContent = new Label(fifthContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFifthContent.setWrap(true);

        //title of the chapter
        table25.add(lblFirstTitle).pad(10,50,0,0).left();
        table25.row();

        //content of the chapter
        table25.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table25.row();

        //title of the second content
        table25.add(lblSecondTitle).pad(10,50,0,0).left();
        table25.row();

        //content of the second title
        table25.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table25.row();

        //title of the third content
        table25.add(lblThirdTitle).pad(10,50,0,0).left();
        table25.row();

        //content of the third title
        table25.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        //title of the fourth content
        table25.add(lblFourthTitle).pad(10,50,0,0).left();
        table25.row();

        //content of the fourth title
        table25.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        //title of the fifth content
        table25.add(lblFifthTitle).pad(10,50,0,0).left();
        table25.row();

        //content of the fifth title
        table25.add(txtFifthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table25);


    }


    public void chapterTwentySixOFLeviticus() {

        table26 = new Table();
        table26.setWidth(tableBG.getWidth());
        table26.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table26.setFillParent(true);
        table26.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Blessings for Obedience";

        String firstContent = "1 “You shall not make idols for yourselves or erect an image or pillar, \n" +
                "and you shall not set up a figured stone in your land to bow down to it, for I am the LORD your God. \n" +
                "2 You shall keep my Sabbaths and reverence my sanctuary: I am the LORD.\n" +
                "3 “If you walk in my statutes and observe my commandments and do them, \n" +
                "4 then I will give you your rains in their season, and the land shall yield its increase, and the trees of the field shall yield their fruit.\n" +
                "5 Your threshing shall last to the time of the grape harvest, and the grape harvest shall last to the time for sowing. \n" +
                "And you shall eat your bread to the full and dwell in your land securely. \n" +
                "6 I will give peace in the land, and you shall lie down, and none shall make you afraid. \n" +
                "And I will remove harmful beasts from the land, and the sword shall not go through your land.\n" +
                "7 You shall chase your enemies, and they shall fall before you by the sword. \n" +
                "8 Five of you shall chase a hundred, and a hundred of you shall chase ten thousand, and your enemies shall fall before you by the sword. \n" +
                "9 I will turn to you and make you fruitful and multiply you and will confirm my covenant with you. \n" +
                "10 You shall eat old store long kept, and you shall clear out the old to make way for the new. \n" +
                "11 I will make my dwelling1 among you, and my soul shall not abhor you. \n" +
                "12 And I will walk among you and will be your God, and you shall be my people. \n" +
                "13 I am the LORD your God, who brought you out of the land of Egypt, that you should not be their slaves. \n" +
                "And I have broken the bars of your yoke and made you walk erect.\n";


        String chapterSecondTitle = "Punishment for Disobedience";

        String secondContent = "14 “But if you will not listen to me and will not do all these commandments, \n" +
                "15 if you spurn my statutes, and if your soul abhors my rules, so that you will not do all my commandments, but break my covenant, \n" +
                "16 then I will do this to you: I will visit you with panic, with wasting disease and fever that consume the eyes and make the heart ache. \n" +
                "And you shall sow your seed in vain, for your enemies shall eat it.\n" +
                "17 I will set my face against you, and you shall be struck down before your enemies. Those who hate you shall rule over you, \n" +
                "and you shall flee when none pursues you. \n" +
                "18 And if in spite of this you will not listen to me, then I will discipline you again sevenfold for your sins, \n" +
                "19 and I will break the pride of your power, and I will make your heavens like iron and your earth like bronze. \n" +
                "20 And your strength shall be spent in vain, for your land shall not yield its increase, and the trees of the land shall not yield their fruit.\n" +
                "21 “Then if you walk contrary to me and will not listen to me, I will continue striking you, sevenfold for your sins. \n" +
                "22 And I will let loose the wild beasts against you, which shall bereave you of your children and destroy your livestock \n" +
                "and make you few in number, so that your roads shall be deserted.\n" +
                "23 “And if by this discipline you are not turned to me but walk contrary to me, \n" +
                "24 then I also will walk contrary to you, and I myself will strike you sevenfold for your sins. \n" +
                "25 And I will bring a sword upon you, that shall execute vengeance for the covenant. And if you gather within your cities, \n" +
                "I will send pestilence among you, and you shall be delivered into the hand of the enemy. \n" +
                "26 When I break your supply of bread, ten women shall bake your bread in a single oven and shall dole out your bread again by weight, \n" +
                "and you shall eat and not be satisfied.\n" +
                "27 “But if in spite of this you will not listen to me, but walk contrary to me, \n" +
                "28 then I will walk contrary to you in fury, and I myself will discipline you sevenfold for your sins. \n" +
                "29 You shall eat the flesh of your sons, and you shall eat the flesh of your daughters. \n" +
                "30 And I will destroy your high places and cut down your incense altars and cast your dead bodies upon the dead bodies of your idols, \n" +
                "and my soul will abhor you.\n" +
                "31 And I will lay your cities waste and will make your sanctuaries desolate, and I will not smell your pleasing aromas. \n" +
                "32 And I myself will devastate the land, so that your enemies who settle in it shall be appalled at it. \n" +
                "33 And I will scatter you among the nations, and I will unsheathe the sword after you, and your land shall be a desolation, \n" +
                "and your cities shall be a waste.\n" +
                "34 “Then the land shall enjoy3 its Sabbaths as long as it lies desolate, while you are in your enemies' land; then the land shall rest, \n" +
                "and enjoy its Sabbaths. \n" +
                "35 As long as it lies desolate it shall have rest, the rest that it did not have on your Sabbaths when you were dwelling in it.\n" +
                "36 And as for those of you who are left, I will send faintness into their hearts in the lands of their enemies. \n" +
                "The sound of a driven leaf shall put them to flight, and they shall flee as one flees from the sword, and they shall fall when none pursues. \n" +
                "37 They shall stumble over one another, as if to escape a sword, though none pursues. And you shall have no power to stand before your enemies. \n" +
                "38 And you shall perish among the nations, and the land of your enemies shall eat you up. \n" +
                "39 And those of you who are left shall rot away in your enemies' lands because of their iniquity, \n" +
                "and also because of the iniquities of their fathers they shall rot away like them.\n" +
                "40 “But if they confess their iniquity and the iniquity of their fathers in their treachery that they committed against me, \n" +
                "and also in walking contrary to me, \n" +
                "41 so that I walked contrary to them and brought them into the land of their enemies—if then their uncircumcised heart is humbled \n" +
                "and they make amends for their iniquity, \n" +
                "42 then I will remember my covenant with Jacob, and I will remember my covenant with Isaac and my covenant with Abraham, \n" +
                "and I will remember the land. \n" +
                "43 But the land shall be abandoned by them and enjoy its Sabbaths while it lies desolate without them, \n" +
                "and they shall make amends for their iniquity, because they spurned my rules and their soul abhorred my statutes. \n" +
                "44 Yet for all that, when they are in the land of their enemies, I will not spurn them, neither will I abhor them so as to \n" +
                "destroy them utterly and break my covenant with them, for I am the LORD their God. \n" +
                "45 But I will for their sake remember the covenant with their forefathers, whom I brought out of the land of Egypt lin the sight of the nations, \n" +
                "that I might be their God: I am the LORD.”\n" +
                "46 These are the statutes and rules and laws that the LORD made between himself and the people of Israel through Moses non Mount Sinai.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table26.add(lblFirstTitle).pad(10,50,0,0).left();
        table26.row();

        //content of the chapter
        table26.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table26.row();

        //title of the second content
        table26.add(lblSecondTitle).pad(10,50,0,0).left();
        table26.row();

        //content of the second title
        table26.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table26);


    }


    public void chapterTwentySevenOFLeviticus() {

        table27 = new Table();
        table27.setWidth(tableBG.getWidth());
        table27.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table27.setFillParent(true);
        table27.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws About Vows";

        String firstContent = "1 The LORD spoke to Moses, saying, \n" +
                "2 “Speak to the people of Israel and say to them, If anyone makes a special vow to the LORD involving the valuation of persons, \n" +
                "3 then the valuation of a male from twenty years old up to sixty years old shall be fifty shekels of silver, according to the shekel of the sanctuary. \n" +
                "4 If the person is a female, the valuation shall be thirty shekels. \n" +
                "5 If the person is from five years old up to twenty years old, the valuation shall be for a male twenty shekels, and for a female ten shekels.\n" +
                "6 If the person is from a month old up to five years old, the valuation shall be for a male five shekels of silver, \n" +
                "and for a female the valuation shall be three shekels of silver.\n" +
                "7 And if the person is sixty years old or over, then the valuation for a male shall be fifteen shekels, and for a female ten shekels. \n" +
                "8 And if someone is too poor to pay the valuation, then he shall be made to stand before the priest, and the priest shall value him; \n" +
                "the priest shall value him according to what the vower can afford.\n" +
                "9 “If the vow is an animal that may be offered as an offering to the LORD, all of it that he gives to the LORD is holy. \n" +
                "10 He shall not exchange it or make a substitute for it, good for bad, or bad for good; and if he does in fact substitute \n" +
                "one animal for another, then both it and the substitute shall be holy. \n" +
                "11 And if it is any unclean animal that may not be offered as an offering to the LORD, then he shall stand the animal before the priest, \n" +
                "12 and the priest shall value it as either good or bad; as the priest values it, so it shall be. \n" +
                "13 But if he wishes to redeem it, he shall add a fifth to the valuation.\n" +
                "14 “When a man dedicates his house as a holy gift to the LORD, the priest shall value it as either good or bad; as the priest values it, \n" +
                "so it shall stand. \n" +
                "15 And if the donor wishes to redeem his house, he shall add a fifth to the valuation price, and it shall be his.\n" +
                "16 “If a man dedicates to the LORD part of the land that is his possession, then the valuation shall be in proportion to its seed. \n" +
                "A homer of barley seed shall be valued at fifty shekels of silver. \n" +
                "17 If he dedicates his field from the year of jubilee, the valuation shall stand,\n" +
                "18 but if he dedicates his field after the jubilee, then the priest shall calculate the price \n" +
                "according to the years that remain until the year of jubilee, and a deduction shall be made from the valuation. \n" +
                "19 And if he who dedicates the field wishes to redeem it, then he shall add a fifth to its valuation price, and it shall remain his. \n" +
                "20 But if he does not wish to redeem the field, or if he has sold the field to another man, it shall not be redeemed anymore. \n" +
                "21 But the field, when it is released in the jubilee, shall be a holy gift to the LORD, like a field that has been devoted. \n" +
                "The priest shall be in possession of it. \n" +
                "22 If he dedicates to the LORD a field that he has bought, which is not a part of his possession, \n" +
                "23 then the priest shall calculate the amount of the valuation for it up to the year of jubilee, \n" +
                "and the man shall give the valuation on that day as a holy gift to the LORD. \n" +
                "24 In the year of jubilee the field shall return to him from whom it was bought, to whom the land belongs as a possession. \n" +
                "25 Every valuation shall be according to the shekel of the sanctuary: twenty gerahs shall make a shekel.\n" +
                "26 “But a firstborn of animals, which as a firstborn belongs to the LORD, no man may dedicate; whether ox or sheep, it is the LORD's.\n" +
                "27 And if it is an unclean animal, then he shall buy it back at the valuation, and add a fifth to it; or, if it is not redeemed, \n" +
                "it shall be sold at the valuation.\n" +
                "28 “But no devoted thing that a man devotes to the LORD, of anything that he has, whether man or beast, or of his inherited field, \n" +
                "shall be sold or redeemed; every devoted thing is most holy to the LORD.\n" +
                "29 No one devoted, who is to be devoted for destruction5 from mankind, shall be ransomed; he shall surely be put to death.\n" +
                "30 “Every tithe of the land, whether of the seed of the land or of the fruit of the trees, is the LORD's; it is holy to the LORD. \n" +
                "31 If a man wishes to redeem some of his tithe, he shall add a fifth to it. \n" +
                "32 And every tithe of herds and flocks, every tenth animal of all that pass under the herdsman's staff, shall be holy to the LORD. \n" +
                "33 One shall not differentiate between good or bad, neither shall he make a substitute for it; and if he does substitute for it,\n" +
                " then both it and the substitute shall be holy; it shall not be redeemed.”\n" +
                "34 These are the commandments that the LORD commanded Moses for the people of Israel on Mount Sinai.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table27.add(lblFirstTitle).pad(10,50,0,0).left();
        table27.row();

        //content of the chapter
        table27.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table27);


    }


    public void removeAll(){
        table1.remove();
        table2.remove();
        table3.remove();
        table4.remove();
        table5.remove();
        table6.remove();
        table7.remove();
        table8.remove();
        table9.remove();
        table10.remove();
        table11.remove();
        table12.remove();
        table13.remove();
        table14.remove();
        table15.remove();
        table16.remove();
        table17.remove();
        table18.remove();
        table19.remove();
        table20.remove();
        table21.remove();
        table22.remove();
        table23.remove();
        table24.remove();
        table25.remove();
        table26.remove();
        table27.remove();
    }

    public void update() {

        camera.update();
    }

    public void render(SpriteBatch sb) {

        stage.draw();
    }

    public Table getTable27() {
        return table27;
    }

    public Table getTable1() {
        return table1;
    }

    public Table getTable2() {
        return table2;
    }

    public Table getTable3() {
        return table3;
    }

    public Table getTable4() {
        return table4;
    }

    public Table getTable5() {
        return table5;
    }

    public Table getTable6() {
        return table6;
    }

    public Table getTable7() {
        return table7;
    }

    public Table getTable8() {
        return table8;
    }

    public Table getTable9() {
        return table9;
    }

    public Table getTable10() {
        return table10;
    }

    public Table getTable11() {
        return table11;
    }

    public Table getTable12() {
        return table12;
    }

    public Table getTable13() {
        return table13;
    }

    public Table getTable14() {
        return table14;
    }

    public Table getTable15() {
        return table15;
    }

    public Table getTable16() {
        return table16;
    }

    public Table getTable17() {
        return table17;
    }

    public Table getTable18() {
        return table18;
    }

    public Table getTable19() {
        return table19;
    }

    public Table getTable20() {
        return table20;
    }

    public Table getTable21() {
        return table21;
    }

    public Table getTable22() {
        return table22;
    }

    public Table getTable23() {
        return table23;
    }

    public Table getTable24() {
        return table24;
    }

    public Table getTable25() {
        return table25;
    }

    public Table getTable26() {
        return table26;
    }

    public Stage getStage() {
        return stage;
    }

    public OrthographicCamera getCamera() {
        return camera;
    }
}

