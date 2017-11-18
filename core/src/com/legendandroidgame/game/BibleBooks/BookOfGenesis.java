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
public class BookOfGenesis {

    private Stage stage;
    private OrthographicCamera camera;

    BitmapFont contentFont; 

    private Label txtFirstContent, txtSecondContent, txtThirdContent;
    private Label lblFirstTitle, lblSecondTitle, lblThirdTitle;

    private Texture tableBG;

    private Table table1, table2, table3, table4, table5, table6, table7, table8, table9, table10, table11, table12,
            table13, table14, table15, table16, table17, table18, table19, table20, table21, table22, table23,
            table24, table25, table26, table27, table28, table29, table30, table31, table32, table33, table34,
            table35, table36, table37, table38, table39, table40, table41, table42, table43, table44, table45,
            table46, table47, table48, table49, table50;

    public BookOfGenesis(){


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


       chapterOneOFGenesis();
       chapterTwoOFGenesis();
       chapterThreeOFGenesis();
       chapterFourOFGenesis();
       chapterFiveOFGenesis();
       chapterSixOFGenesis();
       chapterSevenOFGenesis();
       chapterEightOFGenesis();
       chapterNineOFGenesis();
       chapterTenOFGenesis();
       chapterElevenOFGenesis();
       chapterTwelveOFGenesis();
       chapterThirteenOFGenesis();
       chapterFourteenOFGenesis();
       chapterFifteenOFGenesis();
       chapterSixteenOFGenesis();
       chapterSeventeenOFGenesis();
       chapterEighteenOFGenesis();
       chapterNineteenOFGenesis();
       chapterTwentyOFGenesis();
       chapterTwentyOneOFGenesis();
       chapterTwentyTwoOFGenesis();
       chapterTwentyThreeOFGenesis();
       chapterTwentyFourOFGenesis();
       chapterTwentyFiveOFGenesis();
       chapterTwentySixOFGenesis();
       chapterTwentySevenOFGenesis();
       chapterTwentyEightOFGenesis();
       chapterTwentyNineOFGenesis();
       chapterThirtyOFGenesis();
       chapterThirtyOneOFGenesis();
       chapterThirtyTwoOFGenesis();
       chapterThirtyThreeOFGenesis();
       chapterThirtyFourOFGenesis();
       chapterThirtyFiveOFGenesis();
       chapterThirtySixOFGenesis();
       chapterThirtySevenOFGenesis();
       chapterThirtyEightOFGenesis();
       chapterThirtyNineOFGenesis();
       chapterFortyOFGenesis();
       chapterFortyOneOFGenesis();
       chapterFortyTwoOFGenesis();
       chapterFortyThreeOFGenesis();
       chapterFortyFourOFGenesis();
       chapterFortyFiveOFGenesis();
       chapterFortySixOFGenesis();
       chapterFortySevenOFGenesis();
       chapterFortyEightOFGenesis();
       chapterFortyNineOFGenesis();
       chapterFiftyOFGenesis();

    }



    public void chapterOneOFGenesis() {

        table1 = new Table();
        table1.setWidth(tableBG.getWidth());
        table1.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table1.setFillParent(true);
        table1.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Creation of the World";

        String firstContent = "1 In the beginning, God created the heavens and the earth. \n" +
                "2 The earth was without form and void, and darkness was over the face of the deep. And the Spirit of God was hovering over the face of the waters.\n" +
                "3 And God said, “Let there be light,” and there was light. \n" +
                "4 And God saw that the light was good. And God separated the light from the darkness.\n" +
                "5 God called the light Day, and the darkness he called Night. And there was evening and there was morning, the first day.\n" +
                "6 And God said, “Let there be an expanse in the midst of the waters, and let it separate the waters from the waters.”\n" +
                "7 And God made the expanse and separated the waters that were under the expanse from the waters that were above the expanse. And it was so. \n" +
                "8 And God called the expanse Heaven. And there was evening and there was morning, the second day.\n" +
                "9 And God said, “Let the waters under the heavens be gathered together into one place, and let the dry land appear.” And it was so.\n" +
                "10 God called the dry land Earth, and the waters that were gathered together he called Seas. And God saw that it was good.\n" +
                "11 And God said, “Let the earth sprout vegetation, plants yielding seed, and fruit trees bearing fruit in which is their seed, \n" +
                "each according to its kind, on the earth.” And it was so. \n" +
                "12 The earth brought forth vegetation, plants yielding seed according to their own kinds, and trees bearing fruit in which is their seed, \n" +
                "each according to its kind. And God saw that it was good. \n" +
                "13 And there was evening and there was morning, the third day.\n" +
                "14 And God said, “Let there be lights in the expanse of the heavens to separate the day from the night. And let them be for signs and for seasons, \n" +
                "and for days and years, \n" +
                "15 and let them be lights in the expanse of the heavens to give light upon the earth.” And it was so.\n" +
                "16 And God made the two great lights—the greater light to rule the day and the lesser light to rule the night—and the stars. \n" +
                "17 And God set them in the expanse of the heavens to give light on the earth, \n" +
                "18 to rule over the day and over the night, and to separate the light from the darkness. And God saw that it was good. \n" +
                "19 And there was evening and there was morning, the fourth day.\n" +
                "20 And God said, “Let the waters swarm with swarms of living creatures, and let birds fly above the earth across the expanse of the heavens.”\n" +
                "21 So God created the great sea creatures and every living creature that moves, with which the waters swarm, according to their kinds, \n" +
                "and every winged bird according to its kind. And God saw that it was good.\n" +
                "22 And God blessed them, saying, “Be fruitful and multiply and fill the waters in the seas, and let birds multiply on the earth.” \n" +
                "23 And there was evening and there was morning, the fifth day.\n" +
                "24 And God said, “Let the earth bring forth living creatures according to their kinds—livestock and creeping things and beasts of the earth \n" +
                "according to their kinds.” And it was so. \n" +
                "25 And God made the beasts of the earth according to their kinds and the livestock according to their kinds, and everything that creeps \n" +
                "on the ground according to its kind. And God saw that it was good.\n" +
                "26 Then God said, “Let us make man[h] in our image, after our likeness. And let them have dominion over the fish of the sea and over the birds \n" +
                "of the heavens and over the livestock and over all the earth and over every creeping thing that creeps on the earth.”\n" +
                "27 So God created man in his own image,\n" +
                "    in the image of God he created him;\n" +
                "    male and female he created them.\n" +
                "28 And God blessed them. And God said to them, “Be fruitful and multiply and fill the earth and subdue it, and have dominion over the fish \n" +
                "of the sea and over the birds of the heavens and over every living thing that moves on the earth.” \n" +
                "29 And God said, “Behold, I have given you every plant yielding seed that is on the face of all the earth, and every tree with seed in its fruit. \n" +
                "You shall have them for food.\n" +
                "30 And to every beast of the earth and to every bird of the heavens and to everything that creeps on the earth, \n" +
                "everything that has the breath of life, I have given every green plant for food.” And it was so. \n" +
                "31 And God saw everything that he had made, and behold, it was very good. And there was evening and there was morning, the sixth day.\n";



        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table1.add(lblFirstTitle).pad(90,50,0,0).left();
        table1.row();

        //content of the chapter
        table1.add(txtFirstContent).pad(20,70,0,0).left().width(900);

        stage.addActor(table1);

    }

    public void chapterTwoOFGenesis() {
       
        table2 = new Table();
        table2.setWidth(tableBG.getWidth());
        table2.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table2.setFillParent(true);
        table2.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Seventh Day, God Rests";

        String firstContent = "1 Thus the heavens and the earth were finished, and all the host of them. \n" +
                "2 And on the seventh day God finished his work that he had done, and he rested on the seventh day from all his work that he had done.\n" +
                "3 So God blessed the seventh day and made it holy, because on it God rested from all his work that he had done in creation.\n";

        String chapterSecondTitle = "The Creation of Man and Woman";

        String secondContent = "4 These are the generations\n" +
                "of the heavens and the earth when they were created,\n" +
                "in the day that the Lord God made the earth and the heavens.\n" +
                "5 When no bush of the field was yet in the land and no small plant of the field had yet sprung up—for the Lord God had not caused \n" +
                "it to rain on the land, and there was no man to work the ground, \n" +
                "6 and a mist was going up from the land and was watering the whole face of the ground— \n" +
                "7 then the Lord God formed the man of dust from the ground and breathed into his nostrils the breath of life, and the man became a living creature. \n" +
                "8 And the Lord God planted a garden in Eden, in the east, and there he put the man whom he had formed. \n" +
                "9 And out of the ground the Lord God made to spring up every tree that is pleasant to the sight and good for food. \n" +
                "The tree of life was in the midst of the garden, and the tree of the knowledge of good and evil.\n" +
                "10 A river flowed out of Eden to water the garden, and there it divided and became four rivers. \n" +
                "11 The name of the first is the Pishon. It is the one that flowed around the whole land of Havilah, where there is gold.\n" +
                "12 And the gold of that land is good; bdellium and onyx stone are there.\n" +
                "13 The name of the second river is the Gihon. It is the one that flowed around the whole land of Cush. \n" +
                "14 And the name of the third river is the Tigris, which flows east of Assyria. And the fourth river is the Euphrates.\n" +
                "15 The Lord God took the man and put him in the garden of Eden to work it and keep it. \n" +
                "16 And the Lord God commanded the man, saying, “You may surely eat of every tree of the garden, \n" +
                "17 but of the tree of the knowledge of good and evil you shall not eat, for in the day that you eat of it you shall surely die.”\n" +
                "18 Then the Lord God said, “It is not good that the man should be alone; I will make him a helper fit for him.” \n" +
                "19 Now out of the ground the Lord God had formed every beast of the field and every bird of the heavens and brought them to the man \n" +
                "to see what he would call them. And whatever the man called every living creature, that was its name. \n" +
                "20 The man gave names to all livestock and to the birds of the heavens and to every beast of the field. \n" +
                "But for Adam there was not found a helper fit for him. \n" +
                "21 So the Lord God caused a deep sleep to fall upon the man, and while he slept took one of his ribs and closed up its place with flesh.\n" +
                "22 And the rib that the Lord God had taken from the man he made into a woman and brought her to the man. \n" +
                "23 Then the man said,\n" +
                "“This at last is bone of my bones\n" +
                "    and flesh of my flesh;\n" +
                "    she shall be called Woman,\n" +
                "    because she was taken out of Man.”\n" +
                "24 Therefore a man shall leave his father and his mother and hold fast to his wife, and they shall become one flesh. \n" +
                "25 And the man and his wife were both naked and were not ashamed.\n";



        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table2.add(lblFirstTitle).pad(10,50,0,0).left();
        table2.row();

        //content of the chapter
        table2.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table2.row();

        //title of the second content
        table2.add(lblSecondTitle).pad(10,50,0,0).left();
        table2.row();

        //content of the second title
        table2.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table2);

    }

    public void chapterThreeOFGenesis() {

        table3 = new Table();
        table3.setWidth(tableBG.getWidth());
        table3.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table3.setFillParent(true);
        table3.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Fall";

        String firstContent = "1 Now the serpent was more crafty than any other beast of the field that the LORD God had made.\n" +
                "He said to the woman, “Did God actually say, ‘You shall not eat of any tree in the garden’?” \n" +
                "2 And the woman said to the serpent, “We may eat of the fruit of the trees in the garden, \n" +
                "3 but God said, ‘You shall not eat of the fruit of the tree that is in the midst of the garden, neither shall you touch it, lest you die.’” \n" +
                "4 But the serpent said to the woman, “You will not surely die.\n" +
                "5 For God knows that when you eat of it your eyes will be opened, and you will be like God, knowing good and evil.” \n" +
                "6 So when the woman saw that the tree was good for food, and that it was a delight to the eyes, \n" +
                "and that the tree was to be desired to make one wise, she took of its fruit and ate, \n" +
                "and she also gave some to her husband who was with her, and he ate. \n" +
                "7 Then the eyes of both were opened, and they knew that they were naked. And they sewed fig leaves together and made themselves loincloths.\n" +
                "8 And they heard the sound of the LORD God walking in the garden in the cool of the day, \n" +
                "and the man and his wife hid themselves from the presence of the LORD God among the trees of the garden.\n" +
                "9 But the LORD God called to the man and said to him, “Where are you?” \n" +
                "10 And he said, “I heard the sound of you in the garden, and I was afraid, because I was naked, and I hid myself.” \n" +
                "11 He said, “Who told you that you were naked? Have you eaten of the tree of which I commanded you not to eat?” \n" +
                "12 The man said, “The woman whom you gave to be with me, she gave me fruit of the tree, and I ate.” \n" +
                "13 Then the LORD God said to the woman, “What is this that you have done?” The woman said, “The serpent deceived me, and I ate.”\n" +
                "14 The LORD God said to the serpent,\n" +
                "“Because you have done this,\n" +
                "    cursed are you above all livestock\n" +
                "    and above all beasts of the field;\n" +
                "    on your belly you shall go,\n" +
                "    and dust you shall eat\n" +
                "    all the days of your life.\n" +
                "15 I will put enmity between you and the woman,\n" +
                "    and between your offspring and her offspring;\n" +
                "    he shall bruise your head,\n" +
                "    and you shall bruise his heel.”\n" +
                "16 To the woman he said,\n" +
                "   “I will surely multiply your pain in childbearing;\n" +
                "    in pain you shall bring forth children.\n" +
                "Your desire shall be contrary to your husband,\n" +
                "    but he shall rule over you.”\n" +
                "17 And to Adam he said,\n" +
                "   “Because you have listened to the voice of your wife\n" +
                "    and have eaten of the tree\n" +
                "    of which I commanded you,\n" +
                "    ‘You shall not eat of it,’\n" +
                "    cursed is the ground because of you;\n" +
                "    in pain you shall eat of it all the days of your life;\n" +
                "18 thorns and thistles it shall bring forth for you;\n" +
                "    and you shall eat the plants of the field.\n" +
                "19 By the sweat of your face\n" +
                "    you shall eat bread,\n" +
                "    till you return to the ground,\n" +
                "    for out of it you were taken;\n" +
                "    for you are dust,\n" +
                "    and to dust you shall return.”\n" +
                "20 The man called his wife's name Eve, because she was the mother of all living \n" +
                "21 And the LORD God made for Adam and for his wife garments of skins and clothed them.\n" +
                "22 Then the LORD God said, “Behold, the man has become like one of us in knowing good and evil. \n" +
                "Now, lest he reach out his hand and take also of the tree of life and eat, and live forever—” \n" +
                "23 therefore the LORD God sent him out from the garden of Eden to work the ground from which he was taken. \n" +
                "24 He drove out the man, and at the east of the garden of Eden he placed the cherubim and a flaming sword \n" +
                "that turned every way to guard the way to the tree of life.\n";


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

    public void chapterFourOFGenesis() {

        table4 = new Table();
        table4.setWidth(tableBG.getWidth());
        table4.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table4.setFillParent(true);
        table4.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Cain and Abel";

        String firstContent = "1 Now Adam knew Eve his wife, and she conceived and bore Cain, saying, “I have gotten a man with the help of the Lord.” \n" +
                "2 And again, she bore his brother Abel. Now Abel was a keeper of sheep, and Cain a worker of the ground. \n" +
                "3 In the course of time Cain brought to the Lord an offering of the fruit of the ground, \n" +
                "4 and Abel also brought of the firstborn of his flock and of their fat portions. And the Lord had regard for Abel and his offering, \n" +
                "5 but for Cain and his offering he had no regard. So Cain was very angry, and his face fell. \n" +
                "6 The Lord said to Cain, “Why are you angry, and why has your face fallen? \n" +
                "7 If you do well, will you not be accepted? And if you do not do well, sin is crouching at the door. \n" +
                " Its desire is contrary to you, but you must rule over it.”\n" +
                "8 Cain spoke to Abel his brother And when they were in the field, Cain rose up against his brother Abel and killed him. \n" +
                "9 Then the Lord said to Cain, “Where is Abel your brother?” He said, “I do not know; am I my brother's keeper?” \n" +
                "10 And the Lord said, “What have you done? The voice of your brother's blood is crying to me from the ground. \n" +
                "11 And now you are cursed from the ground, which has opened its mouth to receive your brother's blood from your hand. \n" +
                "12 When you work the ground, it shall no longer yield to you its strength. You shall be a fugitive and a wanderer on the earth.” \n" +
                "13 Cain said to the Lord, “My punishment is greater than I can bear. \n" +
                "14 Behold, you have driven me today away from the ground, and from your face I shall be hidden. \n" +
                " I shall be a fugitive and a wanderer on the earth, and whoever finds me will kill me.”\n" +
                "15 Then the Lord said to him, “Not so! If anyone kills Cain, vengeance shall be taken on him sevenfold.” \n" +
                " And the Lord put a mark on Cain, lest any who found him should attack him. \n" +
                "16 Then Cain went away from the presence of the Lord and settled in the land of Nod east of Eden.\n" +
                "17 Cain knew his wife, and she conceived and bore Enoch. When he built a city, \n" +
                " he called the name of the city after the name of his son, Enoch.\n" +
                "18 To Enoch was born Irad, and Irad fathered Mehujael, and Mehujael fathered Methushael, and Methushael fathered Lamech. \n" +
                "19 And Lamech took two wives. The name of the one was Adah, and the name of the other Zillah. \n" +
                "20 Adah bore Jabal; he was the father of those who dwell in tents and have livestock. \n" +
                "21 His brother's name was Jubal; he was the father of all those who play the lyre and pipe. \n" +
                "22 Zillah also bore Tubal-cain; he was the forger of all instruments of bronze and iron. The sister of Tubal-cain was Naamah.\n" +
                "23 Lamech said to his wives:\n" +
                "“Adah and Zillah, hear my voice;\n" +
                "    you wives of Lamech, listen to what I say:\n" +
                "I have killed a man for wounding me,\n" +
                "    a young man for striking me.\n" +
                "24 If Cain's revenge is sevenfold,\n" +
                "    then Lamech's is seventy-sevenfold.”\n" +
                "25 And Adam knew his wife again, and she bore a son and called his name Seth, for she said, \n" +
                " “God has appointed for me another offspring instead of Abel, for Cain killed him.” \n" +
                "26 To Seth also a son was born, and he called his name Enosh. At that time people began to call upon the name of the Lord.\n";


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

    public void chapterFiveOFGenesis() {

        table5 = new Table();
        table5.setWidth(tableBG.getWidth());
        table5.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table5.setFillParent(true);
        table5.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Adam's Descendants to Noah";

        String firstContent = "1 This is the book of the generations of Adam. When God created man, he made him in the likeness of God. \n" +
                "2 Male and female he created them, and he blessed them and named them¬¬ Man when they were created.\n" +
                "3 When Adam had lived 130 years, he fathered a son in his own likeness, after his image, and named him Seth.\n" +
                "4 The days of Adam after he fathered Seth were 800 years; and he had other sons and daughters.\n" +
                "5 Thus all the days that Adam lived were 930 years, and he died.\n" +
                "6 When Seth had lived 105 years, he fathered Enosh. \n" +
                "7 Seth lived after he fathered Enosh 807 years and had other sons and daughters. \n" +
                "8 Thus all the days of Seth were 912 years, and he died.\n" +
                "9 When Enosh had lived 90 years, he fathered Kenan. \n" +
                "10 Enosh lived after he fathered Kenan 815 years and had other sons and daughters. \n" +
                "11 Thus all the days of Enosh were 905 years, and he died.\n" +
                "12 When Kenan had lived 70 years, he fathered Mahalalel. \n" +
                "13 Kenan lived after he fathered Mahalalel 840 years and had other sons and daughters.\n" +
                "14 Thus all the days of Kenan were 910 years, and he died.\n" +
                "15 When Mahalalel had lived 65 years, he fathered Jared. \n" +
                "16 Mahalalel lived after he fathered Jared 830 years and had other sons and daughters. \n" +
                "17 Thus all the days of Mahalalel were 895 years, and he died.\n" +
                "18 When Jared had lived 162 years, he fathered Enoch. \n" +
                "19 Jared lived after he fathered Enoch 800 years and had other sons and daughters.\n" +
                "20 Thus all the days of Jared were 962 years, and he died.\n" +
                "21 When Enoch had lived 65 years, he fathered Methuselah. \n" +
                "22 Enoch walked with God after he fathered Methuselah 300 years and had other sons and daughters. \n" +
                "23 Thus all the days of Enoch were 365 years.\n" +
                "24 Enoch walked with God, and he was not for God took him.\n" +
                "25 When Methuselah had lived 187 years, he fathered Lamech.\n" +
                "26 Methuselah lived after he fathered Lamech 782 years and had other sons and daughters. \n" +
                "27 Thus all the days of Methuselah were 969 years, and he died.\n" +
                "28 When Lamech had lived 182 years, he fathered a son \n" +
                "29 and called his name Noah, saying, “Out of the ground that the Lord has cursed, \n" +
                "this one shall bring us relief from our work and from the painful toil of our hands.” \n" +
                "30 Lamech lived after he fathered Noah 595 years and had other sons and daughters. \n" +
                "31 Thus all the days of Lamech were 777 years, and he died.\n" +
                "32 After Noah was 500 years old, Noah fathered Shem, Ham, and Japheth.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table5.add(lblFirstTitle).pad(10,50,0,0).left();
        table5.row();

        //content of the chapter
        table5.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table5);


    }

    public void chapterSixOFGenesis() {

        table6 = new Table();
        table6.setWidth(tableBG.getWidth());
        table6.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table6.setFillParent(true);
        table6.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Increasing Corruption on Earth";

        String firstContent = "1 When man began to multiply on the face of the land and daughters were born to them, \n" +
                "2 the sons of God saw that the daughters of man were attractive. And they took as their wives any they chose. \n" +
                "3 Then the Lord said, “My Spirit shall not abide in man forever, for he is flesh: his days shall be 120 years.” \n" +
                "4 The Nephilim were on the earth in those days, and also afterward, when the sons of God came in to the daughters of man \n" +
                "and they bore children to them. These were the mighty men who were of old, the men of renown.\n" +
                "5 The Lord saw that the wickedness of man was great in the earth, and that every intention of the thoughts \n" +
                "of his heart was only evil continually. \n" +
                "6 And the Lord regretted that he had made man on the earth, and it grieved him to his heart. \n" +
                "7 So the Lord said, “I will blot out man whom I have created from the face of the land, man and animals \n" +
                "and creeping things and birds of the heavens, for I am sorry that I have made them.” \n" +
                "8 But Noah found favor in the eyes of the Lord.\n";

        String chapterSecondTitle = "Noah and the Flood";

        String secondContent = "9 These are the generations of Noah. Noah was a righteous man, blameless in his generation. Noah walked with God. \n" +
                "10 And Noah had three sons, Shem, Ham, and Japheth.\n" +
                "11 Now the earth was corrupt in God's sight, and the earth was filled with violence. \n" +
                "12 And God saw the earth, and behold, it was corrupt, for all flesh had corrupted their way on the earth. \n" +
                "13 And God said to Noah, “I have determined to make an end of all flesh, for the earth is filled with violence through them. \n" +
                "Behold, I will destroy them with the earth.\n" +
                "14 Make yourself an ark of gopher wood. Make rooms in the ark, and cover it inside and out with pitch. \n" +
                "15 This is how you are to make it: the length of the ark 300 cubits, its breadth 50 cubits, and its height 30 cubits. \n" +
                "16 Make a roof for the ark, and finish it to a cubit above, and set the door of the ark in its side. \n" +
                "Make it with lower, second, and third decks. \n" +
                "17 For behold, I will bring a flood of waters upon the earth to destroy all flesh in which is the breath of life under heaven. \n" +
                "Everything that is on the earth shall die. \n" +
                "18 But I will establish my covenant with you, and you shall come into the ark, you, your sons, your wife, and your sons' wives with you. \n" +
                "19 And of every living thing of all flesh, you shall bring two of every sort into the ark to keep them alive with you. \n" +
                "They shall be male and female. \n" +
                "20 Of the birds according to their kinds, and of the animals according to their kinds, of every creeping thing of the ground, \n" +
                "according to its kind, two of every sort shall come in to you to keep them alive. \n" +
                "21 Also take with you every sort of food that is eaten, and store it up. It shall serve as food for you and for them.” \n" +
                "22 Noah did this; he did all that God commanded him.\n";


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

    public void chapterSevenOFGenesis() {

        table7 = new Table();
        table7.setWidth(tableBG.getWidth());
        table7.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table7.setFillParent(true);
        table7.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 Then the Lord said to Noah, “Go into the ark, you and all your household, \n" +
                "for I have seen that you are righteous before me in this generation. \n" +
                "2 Take with you seven pairs of all clean animals, the male and his mate, and a pair of the animals that are not clean, the male and his mate, \n" +
                "3 and seven pairs of the birds of the heavens also, male and female, to keep their offspring alive on the face of all the earth. \n" +
                "4 For in seven days I will send rain on the earth forty days and forty nights, and every living thing that \n" +
                "I have made I will blot out from the face of the ground.” 5 And Noah did all that the Lord had commanded him.\n" +
                "6 Noah was six hundred years old when the flood of waters came upon the earth. \n" +
                "7 And Noah and his sons and his wife and his sons' wives with him went into the ark to escape the waters of the flood. \n" +
                "8 Of clean animals, and of animals that are not clean, and of birds, and of everything that creeps on the ground,\n" +
                "9 two and two, male and female, went into the ark with Noah, as God had commanded Noah. \n" +
                "10 And after seven days the waters of the flood came upon the earth.\n" +
                "11 In the six hundredth year of Noah's life, in the second month, on the seventeenth day of the month, \n" +
                "on that day all the fountains of the great deep burst forth, and the windows of the heavens were opened. \n" +
                "12 And rain fell upon the earth forty days and forty nights. \n" +
                "13 On the very same day Noah and his sons, Shem and Ham and Japheth, and Noah's wife and the three wives of his sons \n" +
                "with them entered the ark, \n" +
                "14 they and every beast, according to its kind, and all the livestock according to their kinds, \n" +
                "and every creeping thing that creeps on the earth, according to its kind, and every bird, according to its kind, every winged creature.\n" +
                "15 They went into the ark with Noah, two and two of all flesh in which there was the breath of life. \n" +
                "16 And those that entered, male and female of all flesh, went in as God had commanded him. And the Lord shut him in.\n" +
                "17 The flood continued forty days on the earth. The waters increased and bore up the ark, and it rose high above the earth. \n" +
                "18 The waters prevailed and increased greatly on the earth, and the ark floated on the face of the waters. \n" +
                "19 And the waters prevailed so mightily on the earth that all the high mountains under the whole heaven were covered.\n" +
                "20 The waters prevailed above the mountains, covering them fifteen cubits deep. \n" +
                "21 And all flesh died that moved on the earth, birds, livestock, beasts, all swarming creatures that swarm on the earth, and all mankind. \n" +
                "22 Everything on the dry land in whose nostrils was the breath of life died. \n" +
                "23 He blotted out every living thing that was on the face of the ground, man and animals and creeping things and birds of the heavens. \n" +
                "They were blotted out from the earth. Only Noah was left, and those who were with him in the ark. \n" +
                "24 And the waters prevailed on the earth 150 days.\n";


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

    public void chapterEightOFGenesis() {

        table8 = new Table();
        table8.setWidth(tableBG.getWidth());
        table8.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table8.setFillParent(true);
        table8.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Flood Subsides";

        String firstContent = "1 But God remembered Noah and all the beasts and all the livestock that were with him in the ark. \n" +
                "And God made a wind blow over the earth, and the waters subsided. \n" +
                "2 The fountains of the deep and the windows of the heavens were closed, the rain from the heavens was restrained, \n" +
                "3 and the waters receded from the earth continually. At the end of 150 days the waters had abated, \n" +
                "4 and in the seventh month, on the seventeenth day of the month, the ark came to rest on the mountains of Ararat. \n" +
                "5 And the waters continued to abate until the tenth month; in the tenth month, on the first day of the month, \n" +
                "the tops of the mountains were seen.\n" +
                "6 At the end of forty days Noah opened the window of the ark that he had made \n" +
                "7 and sent forth a raven. It went to and fro until the waters were dried up from the earth. \n" +
                "8 Then he sent forth a dove from him, to see if the waters had subsided from the face of the ground. \n" +
                "9 But the dove found no place to set her foot, and she returned to him to the ark, for the waters were still on the face of the whole earth. \n" +
                "So he put out his hand and took her and brought her into the ark with him. \n" +
                "10 He waited another seven days, and again he sent forth the dove out of the ark.\n" +
                "11 And the dove came back to him in the evening, and behold, in her mouth was a freshly plucked olive leaf. \n" +
                "So Noah knew that the waters had subsided from the earth. \n" +
                "12 Then he waited another seven days and sent forth the dove, and she did not return to him anymore.\n" +
                "13  In the six hundred and first year, in the first month, the first day of the month, the waters were dried from off the earth. \n" +
                "And Noah removed the covering of the ark and looked, and behold, the face of the ground was dry. \n" +
                "14 In the second month, on the twenty-seventh day of the month, the earth had dried out. \n" +
                "15 Then God said to Noah, \n" +
                "16 “Go out from the ark, you and your wife, and your sons and your sons' wives with you.\n" +
                "17 Bring out with you every living thing that is with you of all flesh—birds and animals and every creeping thing \n" +
                "that creeps on the earth—that they may swarm on the earth, and be fruitful and multiply on the earth.”\n" +
                "18 So Noah went out, and his sons and his wife and his sons' wives with him. \n" +
                "19 Every beast, every creeping thing, and every bird, everything that moves on the earth, went out by families from the ark.\n";

        String chapterSecondTitle = "God's Covenant with Noah";

        String secondContent = "20 Then Noah built an altar to the Lord and took some of every clean animal and some of every clean bird \n" +
                "and offered burnt offerings on the altar. \n" +
                "21 And when the Lord smelled the pleasing aroma, the Lord said in his heart, “I will never again curse the ground because of man, \n" +
                "for the intention of man's heart is evil from his youth. Neither will I ever again strike down every living creature as I have done.\n" +
                "22 While the earth remains, seedtime and harvest, cold and heat, summer and winter, day and night, shall not cease.”\n";

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table8.add(lblFirstTitle).pad(10,50,0,0).left();
        table8.row();

        //content of the chapter
        table8.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table8.row();

        //title of the second content
        table8.add(lblSecondTitle).pad(10,50,0,0).left();
        table8.row();

        //content of the second title
        table8.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table8);

    }

    public void chapterNineOFGenesis() {

        table9 = new Table();
        table9.setWidth(tableBG.getWidth());
        table9.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table9.setFillParent(true);
        table9.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 And God blessed Noah and his sons and said to them, “Be fruitful and multiply and fill the earth. \n" +
                "2 The fear of you and the dread of you shall be upon every beast of the earth and upon every bird of the heavens, \n" +
                "upon everything that creeps on the ground and all the fish of the sea. Into your hand they are delivered. \n" +
                "3 Every moving thing that lives shall be food for you. And as I gave you the green plants, I give you everything.\n" +
                "4 But you shall not eat flesh with its life, that is, its blood. \n" +
                "5 And for your lifeblood I will require a reckoning: from every beast I will require it and from man. \n" +
                "From his fellow man I will require a reckoning for the life of man.\n" +
                "6 “Whoever sheds the blood of man,\n" +
                "    by man shall his blood be shed,\n" +
                "   for God made man in his own image.\n" +
                "7 And you, be fruitful and multiply, increase greatly on the earth and multiply in it.”\n" +
                "8 Then God said to Noah and to his sons with him, \n" +
                "9 “Behold, I establish my covenant with you and your offspring after you, \n" +
                "10 and with every living creature that is with you, the birds, the livestock, and every beast of the earth with you, \n" +
                "as many as came out of the ark; it is for every beast of the earth. \n" +
                "11 I establish my covenant with you, that never again shall all flesh be cut off by the waters of the flood,\n" +
                " and never again shall there be a flood to destroy the earth.”\n" +
                "12 And God said, “This is the sign of the covenant that I make between me and you and every living creature that is with you, \n" +
                "for all future generations: \n" +
                "13 I have set my bow in the cloud, and it shall be a sign of the covenant between me and the earth. \n" +
                "14 When I bring clouds over the earth and the bow is seen in the clouds, \n" +
                "15 I will remember my covenant that is between me and you and every living creature of all flesh. \n" +
                "And the waters shall never again become a flood to destroy all flesh. \n" +
                "16 When the bow is in the clouds, I will see it and remember the everlasting covenant between God and every living creature of all flesh\n" +
                " that is on the earth.” \n" +
                "17 God said to Noah, “This is the sign of the covenant that I have established between me and all flesh that is on the earth.”\n";

        String chapterSecondTitle = "Noah's Descendants";

        String secondContent = "18 The sons of Noah who went forth from the ark were Shem, Ham, and Japheth. (Ham was the father of Canaan.) \n" +
                "19 These three were the sons of Noah, and from these the people of the whole earth were dispersed.\n" +
                "20 Noah began to be a man of the soil, and he planted a vineyard. \n" +
                "21 He drank of the wine and became drunk and lay uncovered in his tent.\n" +
                "22 And Ham, the father of Canaan, saw the nakedness of his father and told his two brothers outside. \n" +
                "23 Then Shem and Japheth took a garment, laid it on both their shoulders, and walked backward and covered the nakedness of their father.\n" +
                "Their faces were turned backward, and they did not see their father's nakedness. \n" +
                "24 When Noah awoke from his wine and knew what his youngest son had done to him, \n" +
                "25 he said,\n" +
                "“Cursed be Canaan;\n" +
                "    a servant of servants shall he be to his brothers.”\n" +
                "26 He also said,\n" +
                "“Blessed be the Lord, the God of Shem;\n" +
                "    and let Canaan be his servant.\n" +
                "27 May God enlarge Japheth,\n" +
                "    and let him dwell in the tents of Shem,\n" +
                "    and let Canaan be his servant.”\n" +
                "28 After the flood Noah lived 350 years. \n" +
                "29 All the days of Noah were 950 years, and he died.\n";

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table9.add(lblFirstTitle).pad(10,50,0,0).left();
        table9.row();

        //content of the chapter
        table9.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table9.row();

        //title of the second content
        table9.add(lblSecondTitle).pad(10,50,0,0).left();
        table9.row();

        //content of the second title
        table9.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table9);

    }


    public void chapterTenOFGenesis() {

        table10 = new Table();
        table10.setWidth(tableBG.getWidth());
        table10.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table10.setFillParent(true);
        table10.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Nations Descended from Noah";

        String firstContent = "1 These are the generations of the sons of Noah, Shem, Ham, and Japheth. Sons were born to them after the flood.\n" +
                "2 The sons of Japheth: Gomer, Magog, Madai, Javan, Tubal, Meshech, and Tiras. \n" +
                "3 The sons of Gomer: Ashkenaz, Riphath, and Togarmah. \n" +
                "4 The sons of Javan: Elishah, Tarshish, Kittim, and Dodanim. \n" +
                "5 From these the coastland peoples spread in their lands, each with his own language, by their clans, in their nations.\n" +
                "6 The sons of Ham: Cush, Egypt, Put, and Canaan. \n" +
                "7 The sons of Cush: Seba, Havilah, Sabtah, Raamah, and Sabteca. The sons of Raamah: Sheba and Dedan. \n" +
                "8 Cush fathered Nimrod; he was the first on earth to be a mighty man. \n" +
                "9 He was a mighty hunter before the Lord. Therefore it is said, “Like Nimrod a mighty hunter before the Lord.” \n" +
                "10 The beginning of his kingdom was Babel, Erech, Accad, and Calneh, in the land of Shinar. \n" +
                "11 From that land he went into Assyria and built Nineveh, Rehoboth-Ir, Calah, and \n" +
                "12 Resen between Nineveh and Calah; that is the great city. \n" +
                "13 Egypt fathered Ludim, Anamim, Lehabim, Naphtuhim,\n" +
                "14 Pathrusim, Casluhim (from whom the Philistines came), and Caphtorim.\n" +
                "15 Canaan fathered Sidon his firstborn and Heth, \n" +
                "16 and the Jebusites, the Amorites, the Girgashites, \n" +
                "17 the Hivites, the Arkites, the Sinites, \n" +
                "18 the Arvadites, the Zemarites, and the Hamathites. Afterward the clans of the Canaanites dispersed. \n" +
                "19 And the territory of the Canaanites extended from Sidon in the direction of Gerar as far as Gaza, \n" +
                "and in the direction of Sodom, Gomorrah, Admah, and Zeboiim, as far as Lasha. \n" +
                "20 These are the sons of Ham, by their clans, their languages, their lands, and their nations.\n" +
                "21 To Shem also, the father of all the children of Eber, the elder brother of Japheth, children were born. \n" +
                "22 The sons of Shem: Elam, Asshur, Arpachshad, Lud, and Aram. \n" +
                "23 The sons of Aram: Uz, Hul, Gether, and Mash. \n" +
                "24 Arpachshad fathered Shelah; and Shelah fathered Eber. \n" +
                "25 To Eber were born two sons: the name of the one was Peleg, for in his days the earth was divided, and his brother's name was Joktan. \n" +
                "26 Joktan fathered Almodad, Sheleph, Hazarmaveth, Jerah, \n" +
                "27 Hadoram, Uzal, Diklah, \n" +
                "28 Obal, Abimael, Sheba, \n" +
                "29 Ophir, Havilah, and Jobab; all these were the sons of Joktan. \n" +
                "30 The territory in which they lived extended from Mesha in the direction of Sephar to the hill country of the east.\n" +
                "31 These are the sons of Shem, by their clans, their languages, their lands, and their nations.\n" +
                "32 These are the clans of the sons of Noah, according to their genealogies, in their nations, \n" +
                "and from these the nations spread abroad on the earth after the flood.\n";


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


    public void chapterElevenOFGenesis() {

        table11 = new Table();
        table11.setWidth(tableBG.getWidth());
        table11.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table11.setFillParent(true);
        table11.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Tower of Babel";

        String firstContent = "1 Now the whole earth had one language and the same words. \n" +
                "2 And as people migrated from the east, they found a plain in the land of Shinar and settled there. \n" +
                "3 And they said to one another, “Come, let us make bricks, and burn them thoroughly.” \n" +
                "And they had brick for stone, and bitumen for mortar.\n" +
                "4 Then they said, “Come, let us build ourselves a city and a tower with its top in the heavens, \n" +
                "and let us make a name for ourselves, lest we be dispersed over the face of the whole earth.” \n" +
                "5 And the Lord came down to see the city and the tower, which the children of man had built. \n" +
                "6 And the Lord said, “Behold, they are one people, and they have all one language, and this is only the beginning of what they will do. \n" +
                "And nothing that they propose to do will now be impossible for them. \n" +
                "7 Come, let us go down and there confuse their language, so that they may not understand one another's speech.” \n" +
                "8 So the Lord dispersed them from there over the face of all the earth, and they left off building the city. \n" +
                "9 Therefore its name was called Babel, because there the Lord confused the language of all the earth. \n" +
                "And from there the Lord dispersed them over the face of all the earth.\n";

        String chapterSecondTitle = "Shem's Descendants";

        String secondContent = "10 These are the generations of Shem. When Shem was 100 years old, he fathered Arpachshad two years after the flood. \n" +
                "11 And Shem lived after he fathered Arpachshad 500 years and had other sons and daughters.\n" +
                "12 When Arpachshad had lived 35 years, he fathered Shelah. \n" +
                "13 And Arpachshad lived after he fathered Shelah 403 years and had other sons and daughters.\n" +
                "14 When Shelah had lived 30 years, he fathered Eber. \n" +
                "15 And Shelah lived after he fathered Eber 403 years and had other sons and daughters.\n" +
                "16 When Eber had lived 34 years, he fathered Peleg. \n" +
                "17 And Eber lived after he fathered Peleg 430 years and had other sons and daughters.\n" +
                "18 When Peleg had lived 30 years, he fathered Reu. \n" +
                "19 And Peleg lived after he fathered Reu 209 years and had other sons and daughters.\n" +
                "20 When Reu had lived 32 years, he fathered Serug. \n" +
                "21 And Reu lived after he fathered Serug 207 years and had other sons and daughters.\n" +
                "22 When Serug had lived 30 years, he fathered Nahor. \n" +
                "23 And Serug lived after he fathered Nahor 200 years and had other sons and daughters.\n" +
                "24 When Nahor had lived 29 years, he fathered Terah. \n" +
                "25 And Nahor lived after he fathered Terah 119 years and had other sons and daughters.\n" +
                "26 When Terah had lived 70 years, he fathered Abram, Nahor, and Haran.\n";

        String chapterThirdTitle = "Terah's Descendants";

        String thirdContent = "27 Now these are the generations of Terah. Terah fathered Abram, Nahor, and Haran; and Haran fathered Lot. \n" +
                "28 Haran died in the presence of his father Terah in the land of his kindred, in Ur of the Chaldeans. \n" +
                "29 And Abram and Nahor took wives. The name of Abram's wife was Sarai, and the name of Nahor's wife, Milcah,\n" +
                "the daughter of Haran the father of Milcah and Iscah. \n" +
                "30 Now Sarai was barren; she had no child.\n" +
                "31 Terah took Abram his son and Lot the son of Haran, his grandson, and Sarai his daughter-in-law, his son Abram's wife, \n" +
                "and they went forth together from Ur of the Chaldeans to go into the land of Canaan, but when they came to Haran, they settled there. \n" +
                "32 The days of Terah were 205 years, and Terah died in Haran.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblThirdTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);

        //title of the chapter
        table11.add(lblFirstTitle).pad(10,50,0,0).left();
        table11.row();

        //content of the chapter
        table11.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table11.row();

        //title of the second content
        table11.add(lblSecondTitle).pad(10,50,0,0).left();
        table11.row();

        //content of the second title
        table11.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table11.row();

        //title of the third content
        table11.add(lblThirdTitle).pad(10,50,0,0).left();
        table11.row();

        //content of the chapter
        table11.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table11);


    }


    public void chapterTwelveOFGenesis(){

        table12 = new Table();
        table12.setWidth(tableBG.getWidth());
        table12.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table12.setFillParent(true);
        table12.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Call of Abram";


        String firstContent = "1 Now the LORD said to Abram, “Go from your country and your kindred and your father's house to the land that I will show you. \n" +
                "2 And I will make of you a great nation, and I will bless you and make your name great, so that you will be a blessing. \n" +
                "3 I will bless those who bless you, and him who dishonors you I will curse, and pin you all the families of the earth shall be blessed.”\n" +
                "4 So Abram went, as the LORD had told him, and Lot went with him. Abram was seventy-five years old when he departed from Haran. \n" +
                "5 And Abram took Sarai his wife, and Lot his brother's son, and all their possessions that they had gathered,\n" +
                " and the people that they had acquired in Haran, and they set out to go to the land of Canaan. When they came to the land of Canaan, \n" +
                "6 Abram passed through the land to the place at Shechem, to the oak of Moreh. At that time the Canaanites were in the land. \n" +
                "7 Then the LORD appeared to Abram and said, “To your offspring I will give this land.” So he built there an altar to the LORD, \n" +
                "who had appeared to him. \n" +
                "8 From there he moved to the hill country on the east of Bethel and pitched his tent, with Bethel on the west and Ai on the east. \n" +
                "And there he built an altar to the LORD and called upon the name of the LORD. \n" +
                "9 And Abram journeyed on, still going toward the Negeb.\n";

        String chapterSecondTitle = "Abram and Sarai in Egypt";

        String secondContent = "10 Now there was a famine in the land. So Abram went down to Egypt to sojourn there, for the famine was severe in the land. \n" +
                "11 When he was about to enter Egypt, he said to Sarai his wife, “I know that you are a woman beautiful in appearance, \n" +
                "12 and when the Egyptians see you, they will say, ‘This is his wife.’ Then they will kill me, but they will let you live. \n" +
                "13 Say you are my sister, that it may go well with me because of you, and that my life may be spared for your sake.” \n" +
                "14 When Abram entered Egypt, the Egyptians saw that the woman was very beautiful.\n" +
                "15 And when the princes of Pharaoh saw her, they praised her to Pharaoh. And the woman was taken into Pharaoh's house. \n" +
                "16 And for her sake he dealt well with Abram; and he had sheep, oxen, male donkeys, male servants, female servants, female donkeys, and camels.\n" +
                "17 But the LORD afflicted Pharaoh and his house with great plagues because of Sarai, Abram's wife. \n" +
                "18 So Pharaoh called Abram and said, “What is this you have done to me? Why did you not tell me that she was your wife? \n" +
                "19 Why did you say, ‘She is my sister,’ so that I took her for my wife? Now then, here is your wife; take her, and go.” \n" +
                "20 And Pharaoh gave men orders concerning him, and they sent him away with his wife and all that he had.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table12.add(lblFirstTitle).pad(10,50,0,0).left();
        table12.row();

        //content of the chapter
        table12.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table12.row();

        //title of the second content
        table12.add(lblSecondTitle).pad(10,50,0,0).left();
        table12.row();

        //content of the second title
        table12.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table12);

    }


    public void chapterThirteenOFGenesis(){

        table13 = new Table();
        table13.setWidth(tableBG.getWidth());
        table13.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table13.setFillParent(true);
        table13.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Abram and Lot Separate";


        String firstContent = "1 So Abram went up from Egypt, he and his wife and all that he had, and Lot with him, into the Negeb.\n" +
                "2 Now Abram was very rich in livestock, in silver, and in gold. \n" +
                "3 And he journeyed on from the Negeb as far as Bethel to the place where his tent had been at the beginning, between Bethel and Ai, \n" +
                "4 to the place where he had made an altar at the first. And there Abram called upon the name of the LORD. \n" +
                "5 And Lot, who went with Abram, also had flocks and herds and tents, \n" +
                "6 so that the land could not support both of them dwelling together; for their possessions were so great that they could not dwell together, \n" +
                "7 and there was strife between the herdsmen of Abram's livestock and the herdsmen of Lot's livestock. \n" +
                "At that time the Canaanites and the Perizzites were dwelling in the land.\n" +
                "8 Then Abram said to Lot, “Let there be no strife between you and me, and between your herdsmen and my herdsmen, for we are kinsmen. \n" +
                "9 Is not the whole land before you? Separate yourself from me. If you take the left hand, then I will go to the right, \n" +
                "or if you take the right hand, then I will go to the left.” \n" +
                "10 And Lot lifted up his eyes and saw that the Jordan Valley was well watered everywhere like the garden of the LORD, like the land of Egypt, \n" +
                "in the direction of Zoar. (This was before the LORD destroyed Sodom and Gomorrah.) \n" +
                "11 So Lot chose for himself all the Jordan Valley, and Lot journeyed east. Thus they separated from each other. \n" +
                "12 Abram settled in the land of Canaan, while Lot settled among the cities of the valley and moved his tent as far as Sodom. \n" +
                "13 Now the men of Sodom were wicked, great sinners against the LORD.\n" +
                "14 The LORD said to Abram, after Lot had separated from him, “Lift up your eyes and look from the place where you are, \n" +
                "northward and southward and eastward and westward, \n" +
                "15 for all the land that you see I will give to you and to your offspring forever. \n" +
                "16 I will make your offspring as the dust of the earth, so that if one can count the dust of the earth, your offspring also can be counted. \n" +
                "17 Arise, walk through the length and the breadth of the land, for I will give it to you.” \n" +
                "18 So Abram moved his tent and came and settled by the oaks of Mamre, whichuare at Hebron, and there he built an altar to the LORD.\n";
 

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

    public void chapterFourteenOFGenesis(){

        table14 = new Table();
        table14.setWidth(tableBG.getWidth());
        table14.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table14.setFillParent(true);
        table14.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Abram Rescues Lot";

        String firstContent = "1 In the days of Amraphel king of Shinar, Arioch king of Ellasar, Chedorlaomer king of Elam, and Tidal king of Goiim, \n" +
                "2 these kings made war with Bera king of Sodom, Birsha king of Gomorrah, Shinab king of Admah, Shemeber king of Zeboiim, \n" +
                "and the king of Bela (that is, Zoar). \n" +
                "3 And all these joined forces in the Valley of Siddim (that is, the Salt Sea).\n" +
                "4 Twelve years they had served Chedorlaomer, but in the thirteenth year they rebelled. \n" +
                "5 In the fourteenth year Chedorlaomer and the kings who were with him came and defeated the Rephaim in Ashteroth-karnaim, \n" +
                "the Zuzim in Ham, the Emim in Shaveh-kiriathaim, \n" +
                "6 and the Horites in their hill country of Seir as far as El-paran on the border of the wilderness. \n" +
                "7 Then they turned back and came to En-mishpat (that is, Kadesh) and defeated all the country of the Amalekites, \n" +
                "and also the Amorites who were dwelling in Hazazon-tamar.\n" +
                "8 Then the king of Sodom, the king of Gomorrah, the king of Admah, the king of Zeboiim, and the king of Bela (that is, Zoar) went out,\n" +
                " and they joined battle in the Valley of Siddim \n" +
                "9 with Chedorlaomer king of Elam, Tidal king of Goiim, Amraphel king of Shinar, and Arioch king of Ellasar, four kings against five. \n" +
                "10 Now the Valley of Siddim was full of bitumen pits, and as the kings of Sodom and Gomorrah fled, some fell into them, \n" +
                "and the rest fled to the hill country. \n" +
                "11 So the enemy took all the possessions of Sodom and Gomorrah, and all their provisions, and went their way. \n" +
                "12 They also took Lot, the son of Abram's brother, who was dwelling in Sodom, and his possessions, and went their way.\n" +
                "13 Then one who had escaped came and told Abram the Hebrew, who was living by the oaks of Mamre the Amorite, brother of Eshcol and of Aner. \n" +
                "These were allies of Abram. \n" +
                "14 When Abram heard that his kinsman had been taken captive, he led forth his trained men, born in his house, 318 of them, \n" +
                "and went in pursuit as far as qDan. \n" +
                "15 And he divided his forces against them by night, he and his servants, and defeated them and pursued them to Hobah, north of Damascus. \n" +
                "16 Then he brought back all the possessions, and also brought back his kinsman Lot with his possessions, and the women and the people.\n";

        String chapterSecondTitle = "Abram Blessed by Melchizedek";

        String secondContent = "17 After his return from the defeat of Chedorlaomer and the kings who were with him, the king of Sodom went out to meet him \n" +
                "at the Valley of Shaveh (that is, the King's Valley). \n" +
                "18 And Melchizedek king of Salem brought out bread and wine. (He was priest of vGod Most High.) \n" +
                "19 And he blessed him and said,\n" +
                "\t\t“Blessed be Abram by God Most High,\n" +
                "\t\tPossessor of heaven and earth;\n" +
                "\n" +
                "20  and blessed be God Most High,\n" +
                "\t\twho has delivered your enemies into your hand!”\n" +
                "And Abram gave him a tenth of everything. \n" +
                "21 And the king of Sodom said to Abram, “Give me the persons, but take the goods for yourself.”\n" +
                "22 But Abram said to the king of Sodom, “I have lifted my handto theLORD, God Most High, Possessor of heaven and earth, \n" +
                "23 that I would not take a thread or a sandal strap or anything that is yours, lest you should say, ‘I have made Abram rich.’ \n" +
                "24 I will take nothing but what the young men have eaten, and the share of the men who went with me. Let Aner, Eshcol, and Mamre take their share.”\n";

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


    public void chapterFifteenOFGenesis(){

        table15 = new Table();
        table15.setWidth(tableBG.getWidth());
        table15.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table15.setFillParent(true);
        table15.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "God's Covenant with Abram";

        String firstContent = "1 After these things the word of the LORD came to Abram in a vision: \n" +
                "“Fear not, Abram, I am your shield; your reward shall be very great.” \n" +
                "2 But Abram said, “O Lord GOD, what will you give me, for I continue childless, and the heir of my house is Eliezer of Damascus?” \n" +
                "3 And Abram said, “Behold, you have given me no offspring, and a member of my household will be my heir.” \n" +
                "4 And behold, the word of the LORD came to him: “This man shall not be your heir; your very own son shall be your heir.” \n" +
                "5 And he brought him outside and said, “Look toward heaven, angnumber the stars, if you are able to number them.” \n" +
                "Then he said to him, “So shall your offspring be.” \n" +
                "6 And he believed the LORD, and he counted it to him as righteousness.\n" +
                "7 And he said to him, “I am the LORD who brought you out from Ur of the Chaldeans to give you this land to possess.” \n" +
                "8 But he said, “O LordGOD, how am I to know that I shall possess it?” \n" +
                "9 He said to him, “Bring me a heifer three years old, a female goat three years old, a ram three years old, a turtledove, and a young pigeon.” \n" +
                "10 And he brought him all these, cut them in half, and laid each half over against the other. But he did not cut the birds in half. \n" +
                "11 And when birds of prey came down on the carcasses, Abram drove them away.\n" +
                "12 As the sun was going down, a deep sleep fell on Abram. And behold, dreadful and great darkness fell upon him. \n" +
                "13 Then the LORD said to Abram, “Know for certain that your offspring will be sojourners in a land that is not theirs and will be servants there,\n" +
                " and they will be afflicted for four hundred years. \n" +
                "14 But I will bring judgment on the nation that they serve, and afterward they shall come out with great possessions. \n" +
                "15 As for you, you shall go to your fathers in peace; you shall be buried in a good old age. \n" +
                "16 And they shall come back here in the fourth generation, for the iniquity of the Amorites is not yet complete.”\n" +
                "17 When the sun had gone down and it was dark, behold, a smoking fire pot and a flaming torch passed between these pieces. \n" +
                "18 On that day the LORD made a covenant with Abram, saying, “To your offspring I give this land, from  the river of Egypt to the great river, \n" +
                "the river Euphrates, \n" +
                "19 the land of the Kenites, the Kenizzites, the Kadmonites,\n" +
                "20 the Hittites, the Perizzites, the Rephaim, 21 the Amorites, the Canaanites, the Girgashites and the Jebusites.”\n";


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


    public void chapterSixteenOFGenesis(){

        table16 = new Table();
        table16.setWidth(tableBG.getWidth());
        table16.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table16.setFillParent(true);
        table16.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Sarai and Hagar";

        String firstContent = "1 Now Sarai, Abram's wife, had borne him no children. She had a female Egyptian servant whose name was Hagar. \n" +
                "2 And Sarai said to Abram, “Behold now, the LORD has prevented me from bearing children. \n" +
                "Go in to my servant; it may be that I shall obtain children1 by her.” And Abram listened to the voice of Sarai. \n" +
                "3 So, after Abram had lived ten years in the land of Canaan, Sarai, Abram's wife, took Hagar the Egyptian, her servant, \n" +
                "and gave her to Abram her husband as a wife.\n" +
                "4 And he went in to Hagar, and she conceived. And when she saw that she had conceived,  she looked with contempt on her mistress. \n" +
                "5 And Sarai said to Abram, “May the wrong done to me be on you! I gave my servant to your embrace, and when she saw that she had conceived, \n" +
                "she looked on me with contempt. May the LORD judge between you and me!” \n" +
                "6 But Abram said to Sarai, “Behold, your servant is in your power; do to her as you please.” Then Sarai dealt harshly with her, and she fled from her.\n" +
                "7 The angel of the LORD found her by a spring of water in the wilderness, the spring on the way to Shur. \n" +
                "8 And he said, “Hagar, servant of Sarai, where have you come from and where are you going?” She said, “I am fleeing from my mistress Sarai.”\n" +
                "9 The angel of the LORDsaid to her, “Return to your mistress and submit to her.”\n" +
                "10 The angel of the LORD also said to her, “I will surely multiply your offspring so that they cannot be numbered for multitude.” \n" +
                "11 And the angel of the LORDsaid to her,\n" +
                "\t\t“Behold, you are pregnant\n" +
                "\t\tand shall bear a son.\n" +
                "\t\tYou shall call his name Ishmael, \n" +
                "\t\tbecause the LORD has listened to your affliction.\n" +
                "\t12  He shall be a wild donkey of a man,\n" +
                "\t\this hand against everyone\n" +
                "\t\tand everyone's hand against him,\n" +
                "\t\tand he shall dwell jover against all his kinsmen.”\n" +
                "13 So she called the name of the LORD who spoke to her, “You are a God of seeing,”4for she said,  “Truly here I have seen him who looks after me.” \n" +
                "14 Therefore the well was called lBeer-lahai-roi; it lies betweenmKadesh and Bered\n" +
                "15 And Hagar bore Abram a son, and Abram called the name of his son, whom Hagar bore, Ishmael. \n" +
                "16 Abram was eighty-six years old when Hagar bore Ishmael to Abram.\n";


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


    public void chapterSeventeenOFGenesis(){

        table17 = new Table();
        table17.setWidth(tableBG.getWidth());
        table17.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table17.setFillParent(true);
        table17.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Abraham and the Covenant of Circumcision";

        String firstContent = "1 When Abram was ninety-nine years old the LORD appeared to Abram and said to him, “I am God Almighty; walk before me, and be blameless, \n" +
                "2 that I may make my covenant between me and you, and may multiply you greatly.” \n" +
                "3 Then Abram fell on his face. And God said to him,\n" +
                "4 “Behold, my covenant is with you, and you shall be the father of a multitude of nations. \n" +
                "5 No longer shall your name be called Abram, but your name shall be Abraham, for I have made you the father of a multitude of nations. \n" +
                "6 I will make you exceedingly fruitful, and I will make you into nations, and kings shall come from you. \n" +
                "7 And I will establish my covenant between me and you and your offspring after you throughout their generations for an everlasting covenant,  \n" +
                "to be God to you and to your offspring after you. \n" +
                "8 And I will give to you and to your offspring after you the land of your sojournings, all the land of Canaan, for an everlasting possession, \n" +
                "and I will be their God.”\n" +
                "9 And God said to Abraham, “As for you, you shall keep my covenant, you and your offspring after you throughout their generations. \n" +
                "10 This is my covenant, which you shall keep, between me and you and your offspring after you: Every male among you shall be circumcised. \n" +
                "11 You shall be circumcised in the flesh of your foreskins, and it shall be a zsign of the covenant between me and you. \n" +
                "12 He who is eight days old among you shall be circumcised. Every male throughout your generations, whether born in your house or bought with your money \n" +
                "from any foreigner who is not of your offspring, \n" +
                "13 both he who is born in your house and he who is bought with your money, shall surely be circumcised. So shall my covenant be in your flesh \n" +
                "an everlasting covenant. \n" +
                "14 Any uncircumcised male who is not circumcised in the flesh of his foreskin shall be cut off from his people; he has broken my covenant.”\n";

        String chapterSecondTitle = "Isaac's Birth Promised";

        String secondContent = "15 And God said to Abraham, “As for Sarai your wife, you shall not call her name Sarai, but Sarah  shall be her name. \n" +
                "16 I will bless her, and moreover, I will give you a son by her. I will bless her, and she shall become nations; kings of peoples shall come from her.” \n" +
                "17 Then Abraham fell on his face and laughed and said to himself, “Shall a child be born to a man who is a hundred years old? Shall Sarah, \n" +
                "who is ninety years old, bear a child?” \n" +
                "18 And Abraham said to God, “Oh that Ishmael might live before you!” \n" +
                "19 God said, “No, but Sarah your wife shall bear you a son, and you shall call his name Isaac. I will establish my covenant with him \n" +
                "as an everlasting covenant for his offspring after him. \n" +
                "20 As for Ishmael, I have heard you; behold, I have blessed him and will make him fruitful and multiply him greatly. He shall father twelve princes,\n" +
                " and I will make him into a great nation. \n" +
                "21 But I will establish my covenant with Isaac, whom Sarah shall bear to you at this time next year.”\n" +
                "22 When he had finished talking with him, God went up from Abraham. \n" +
                "23 Then Abraham took Ishmael his son and all those born in his house or bought with his money, every male among the men of Abraham's house, \n" +
                "and he circumcised the flesh of their foreskins that very day, as God had said to him. \n" +
                "24 Abraham was ninety-nine years old when he was circumcised in the flesh of his foreskin. \n" +
                "25 And Ishmael his son was thirteen years old when he was circumcised in the flesh of his foreskin. \n" +
                "26 That very day Abraham and his son Ishmael were circumcised. 27 And all the men of his house, those born in the house and those bought with money \n" +
                "from a foreigner, were circumcised with him.\n";


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


    public void chapterEighteenOFGenesis(){

        table18 = new Table();
        table18.setWidth(tableBG.getWidth());
        table18.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table18.setFillParent(true);
        table18.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 And the LORD appeared to him by the oaks of Mamre, as he sat at the door of his tent in the heat of the day. \n" +
                "2 He lifted up his eyes and looked, and behold, three men were standing in front of him When he saw them, he ran from the tent door to meet them \n" +
                "and bowed himself to the earth \n" +
                "3 and said, “O Lord, if I have found favor in your sight, do not pass by your servant. \n" +
                "4 Let a little water be brought, and wash your feet, and rest yourselves under the tree, \n" +
                "5 while I bring a morsel of bread, that you may refresh yourselves, and after that you may pass on—since you have come to your servant.” \n" +
                "So they said, “Do as you have said.” \n" +
                "6 And Abraham went quickly into the tent to Sarah and said, “Quick! Three seahs3 of fine flour! Knead it, and make cakes.”\n" +
                "7 And Abraham ran to the herd and took a calf, tender and good, and gave it to a young man, who prepared it quickly. \n" +
                "8 Then he took curds and milk and the calf that he had prepared, and set it before them. And he stood by them under the tree while they ate.\n" +
                "9 They said to him, “Where is Sarah your wife?” And he said, “She is in the tent.” \n" +
                "10 The LORD said, “I will surely return to you about this time next year, and Sarah your wife shall have a son.” \n" +
                "And Sarah was listening at the tent door behind him. \n" +
                "11 Now Abraham and Sarah were old, advanced in years. The way of women had ceased to be with Sarah.\n" +
                "12 So Sarah laughed to herself, saying, “After I am worn out, and my lord is old, shall I have pleasure?” \n" +
                "13 The LORD said to Abraham, “Why did Sarah laugh and say, ‘Shall I indeed bear a child, now that I am old?’\n" +
                "14 Is anything too hard for the LORD?  At the appointed time I will return to you, about this time next year, and Sarah shall have a son.”\n" +
                "15 But Sarah denied it, saying, “I did not laugh,” for she was afraid. He said, “No, but you did laugh.”\n" +
                "16 Then the men set out from there, and they looked down toward Sodom. And Abraham went with them to set them on their way. \n" +
                "17 The LORD said, “Shall I hide from Abraham what I am about to do, \n" +
                "18 seeing that Abraham shall surely become a great and mighty nation, and all the nations of the earth shall be blessed in him? \n" +
                "19 For I have chosen him, that he may command his children and his household after him to keep the way of the LORD by doing righteousness and justice, \n" +
                "so that the LORD may bring to Abraham what he has promised him.” \n" +
                "20 Then the LORD said, “Because the outcry against Sodom and Gomorrah is great and their sin is very grave, \n" +
                "21 I will go down to see whether they have done altogether7 according to the outcry that has come to me. And if not, I will know.”\n";

        String chapterSecondTitle = "Abraham Intercedes for Sodom";

        String secondContent = "22 So the men turned from there and went toward Sodom, but Abraham jstill stood before the LORD. \n" +
                "23 Then Abraham drew near and said, “Will you indeed sweep away the righteous with the wicked?\n" +
                "24 Suppose there are fifty righteous within the city. Will you then sweep away the place and not spare it for the fifty righteous who are in it?\n" +
                "25 Far be it from you to do such a thing, to put the righteous to death with the wicked,  so that the righteous fare as the wicked! \n" +
                "Far be that from you!  Shall not the Judge of all the earth do what is just?” \n" +
                "26 And the LORD said, “If I find at Sodom fifty righteous in the city, I will spare the whole place for their sake.”\n" +
                "27 Abraham answered and said, “Behold, I have undertaken to speak to the Lord, I who am but dust and ashes. \n" +
                "28 Suppose five of the fifty righteous are lacking. Will you destroy the whole city for lack of five?” And he said, \n" +
                "“I will not destroy it if I find forty-five there.” \n" +
                "29 Again he spoke to him and said, “Suppose forty are found there.” He answered, “For the sake of forty I will not do it.” \n" +
                "30 Then he said, “Oh let not the Lord be angry, and I will speak. Suppose thirty are found there.” He answered, \n" +
                "“I will not do it, if I find thirty there.” \n" +
                "31 He said, “Behold, I have undertaken to speak to the Lord. Suppose twenty are found there.” He answered, “For the sake of twenty I will not destroy it.” \n" +
                "32 Then he said, “Oh let not the Lord be angry, and I will speak again but this once. Suppose ten are found there.” He answered, \n" +
                "“For the sake of ten I will not destroy it.” 33 And the LORD went his way, when he had finished speaking to Abraham, and Abraham returned to his place.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table18.add(lblFirstTitle).pad(10,50,0,0).left();
        table18.row();

        //content of the chapter
        table18.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table18.row();

        //title of the second content
        table18.add(lblSecondTitle).pad(10,50,0,0).left();
        table18.row();

        //content of the second title
        table18.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        
        stage.addActor(table18);

    }


    public void chapterNineteenOFGenesis(){

        table19 = new Table();
        table19.setWidth(tableBG.getWidth());
        table19.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table19.setFillParent(true);
        table19.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "God Rescues Lot";

        String firstContent = "1 The two angels came to Sodom in the evening, and Lot was sitting in the gate of Sodom. When Lot saw them, \n" +
                "he rose to meet them and bowed himself with his face to the earth \n" +
                "2 and said, “My lords, please turn aside to your servant's house and spend the night and wash your feet. Then you may rise up early and go on your way.” \n" +
                "They said, “No; we will spend the night in the town square.” \n" +
                "3 But he pressed them strongly; so they turned aside to him and entered his house. And he made them a feast and baked unleavened bread, and they ate.\n" +
                "4 But before they lay down, the men of the city, the men of Sodom, both young and old, all the people to the last man, surrounded the house. \n" +
                "5 And they called to Lot, “Where are the men who came to you tonight? Bring them out to us, that we may know them.” \n" +
                "6 Lot went out to the men at the entrance, shut the door after him, \n" +
                "7 and said, “I beg you, my brothers, do not act so wickedly. \n" +
                "8 Behold, I have two daughters who have not known any man. Let me bring them out to you, and do to them as you please. Only do nothing to these men, \n" +
                "for they have come under the shelter of my roof.” \n" +
                "9 But they said, “Stand back!” And they said, “This fellow came to sojourn, and he has become the judge! Now we will deal worse with you than with them.” \n" +
                "Then they pressed hard against the man Lot, and drew near to break the door down. \n" +
                "10 But the men reached out their hands and brought Lot into the house with them and shut the door. \n" +
                "11 And they struck with blindness the men who were at the entrance of the house, both small and great, so that they wore themselves out groping for the door.\n" +
                "12 Then the men said to Lot, “Have you anyone else here? Sons-in-law, sons, daughters, or anyone you have in the city, bring them out of the place. \n" +
                "13 For we are about to destroy this place, because the outcry against its people has become great before the LORD, and the LORD has sent us to destroy it.” \n" +
                "14 So Lot went out and said to his sons-in-law, who were to marry his daughters, “Up! Get out of this place, for the LORD is about to destroy the city.” \n" +
                "But he seemed to his sons-in-law to be jesting.\n" +
                "15 As morning dawned, the angels urged Lot, saying, “Up! Take your wife and your two daughters who are here, \n" +
                "lest you be swept away in the punishment of the city.” \n" +
                "16 But he lingered. So the men seized him and his wife and his two daughters by the hand, the LORD being merciful to him, \n" +
                "and they brought him out and set him outside the city. \n" +
                "17 And as they brought them out, one said, “Escape for your life. Do not look back or stop anywhere in the valley. Escape to the hills, \n" +
                "lest you be swept away.” \n" +
                "18 And Lot said to them, “Oh, no, my lords. \n" +
                "19 Behold, your servant has found favor in your sight, and you have shown me great kindness in saving my life. But I cannot escape to the hills, \n" +
                "lest the disaster overtake me and I die. \n" +
                "20 Behold, this city is near enough to flee to, and it is a little one. Let me escape there—is it not a little one?—and my life will be saved!” \n" +
                "21 He said to him, “Behold, I grant you this favor also, that I will not overthrow the city of which you have spoken.\n" +
                "22 Escape there quickly, for I can do nothing till you arrive there.” Therefore the name of the city was called Zoar.\n";

        String chapterSecondTitle = "God Destroys Sodom";

        String secondContent = "23 The sun had risen on the earth when Lot came to Zoar. \n" +
                "24 Then the LORD rained on Sodom and Gomorrah sulfur and fire from theLORD out of heaven. \n" +
                "25 And he overthrew those cities, and all the valley, and all the inhabitants of the cities, and what grew on the ground. \n" +
                "26 But Lot's wife, behind him, looked back, and she became a pillar of salt.\n" +
                "27 And Abraham went early in the morning to the place where he had stood before the LORD. \n" +
                "28 And he looked down toward Sodom and Gomorrah and toward all the land of the valley, and he looked and, behold, \n" +
                "the smoke of the land went up like the smoke of a furnace.\n" +
                "29 So it was that, when God destroyed the cities of the valley, God remembered Abraham and sent Lot out of the midst of the overthrow \n" +
                "when he overthrew the cities in which Lot had lived.\n";

        String chapterThirdTitle = "Lot and His Daughters";

        String thirdContent = "30 Now Lot went up out of Zoar and lived in the hills with his two daughters, for he was afraid to live in Zoar. \n" +
                "So he lived in a cave with his two daughters. \n" +
                "31 And the firstborn said to the younger, “Our father is old, and there is not a man on earth to come in to us after the manner of all the earth. \n" +
                "32 Come, let us make our father drink wine, and we will lie with him, that we may preserve offspring from our father.” \n" +
                "33 So they made their father drink wine that night. And the firstborn went in and lay with her father. He did not know when she lay down or when she arose.\n" +
                "34 The next day, the firstborn said to the younger, “Behold, I lay last night with my father. Let us make him drink wine tonight also. \n" +
                "Then you go in and lie with him, that we may preserve offspring from our father.”\n" +
                "35 So they made their father drink wine that night also. And the younger arose and lay with him, and he did not know when she lay down or when she arose. \n" +
                "36 Thus both the daughters of Lot became pregnant by their father. \n" +
                "37 The firstborn bore a son and called his name Moab. He is the father of the Moabites to this day. \n" +
                "38 The younger also bore a son and called his name Ben-ammi.He is the father of the Ammonites to this day.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblThirdTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

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


    public void chapterTwentyOFGenesis(){

        table20 = new Table();
        table20.setWidth(tableBG.getWidth());
        table20.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table20.setFillParent(true);
        table20.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
        
        String chapterFirstTitle = "Abraham and Abimelech";

        String firstContent = "1 From there Abraham journeyed toward the territory of the Negeb and lived between Kadesh and Shur; and he sojourned in Gerar. \n" +
                "2 And Abraham said of Sarah his wife, “She is my sister.” And Abimelech king of Gerar sent and took Sarah. \n" +
                "3 But God came to Abimelech in a dream by night and said to him, “Behold, you are a dead man because of the woman whom you have taken, \n" +
                "for she is a man's wife.” \n" +
                "4 Now Abimelech had not approached her. So he said, “Lord, will you kill an innocent people? \n" +
                "5 Did he not himself say to me, ‘She is my sister’? And she herself said, ‘He is my brother.’ \n" +
                "In the integrity of my heart and the innocence of my hands I have done this.”\n" +
                "6 Then God said to him in the dream, “Yes, I know that you have done this in the integrity of your heart, and it was I who kept you from sinning against me. \n" +
                "Therefore I did not let you touch her. \n" +
                "7 Now then, return the man's wife, for he is a prophet, so that he will pray for you, and you shall live. But if you do not return her, \n" +
                "know that you shall surely die, you and all who are yours.”\n" +
                "8 So Abimelech rose early in the morning and called all his servants and told them all these things. And the men were very much afraid.\n" +
                "9 Then Abimelech called Abraham and said to him, “What have you done to us? And how have I sinned against you, \n" +
                "that you have brought on me and my kingdom a great sin? You have done to me things that ought not to be done.” \n" +
                "10 And Abimelech said to Abraham, “What did you see, that you did this thing?” \n" +
                "11 Abraham said, “I did it because I thought, ‘‘There is no fear of God at all in this place, and they will kill me because of my wife.’ \n" +
                "12 Besides, she is indeed my sister, the daughter of my father though not the daughter of my mother, and she became my wife. \n" +
                "13 And when God caused me to wander from my father's house, I said to her, ‘This is the kindness you must do me: at every place to which we come,say of me,\n" +
                " “He is my brother.”’”\n" +
                "14 Then Abimelech took sheep and oxen, and male servants and female servants, and gave them to Abraham, and returned Sarah his wife to him. \n" +
                "15 And Abimelech said, “Behold, my land is before you; dwell where it pleases you.” \n" +
                "16 To Sarah he said, “Behold, I have givenyour brother a thousand pieces of silver. It is a sign of your innocence in the eyes of all who are with you,\n" +
                " and before everyone you are vindicated.” \n" +
                "17 Then Abraham prayed to God, and God healed Abimelech, and also healed his wife and female slaves so that they bore children. \n" +
                "18 For the LORD had closed all the wombs of the house of Abimelech because of Sarah, Abraham's wife.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table20.add(lblFirstTitle).pad(10,50,0,0).left();
        table20.row();

        //content of the chapter
        table20.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        
        stage.addActor(table20);

    }

    public void chapterTwentyOneOFGenesis(){

        table21 = new Table();
        table21.setWidth(tableBG.getWidth());
        table21.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table21.setFillParent(true);
        table21.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Birth of Isaac";

        String firstContent = "1 The LORD visited Sarah as he had said, and the LORD did to Sarah las he had promised. \n" +
                "2 And Sarah conceived and bore Abraham a son in his old age at the time of which God had spoken to him. \n" +
                "3 Abraham called the name of his son who was born to him, whom Sarah bore him, Isaac.\n" +
                "4 And Abraham circumcised his son Isaac when he was eight days old, as God had commanded him. \n" +
                "5 Abraham was a hundred years old when his son Isaac was born to him. \n" +
                "6 And Sarah said, “God has made laughter for me; everyone who hears will laugh over me.”\n" +
                "7 And she said, “Who would have said to Abraham that Sarah would nurse children? Yet I have borne him a son in his old age.”\n";

        String chapterSecondTitle = "God Protects Hagar and Ishmael";

        String secondContent = "8 And the child grew and was weaned. And Abraham made a great feast on the day that Isaac was weaned. \n" +
                "9 But Sarah saw the son of Hagar the Egyptian, whom she had borne to Abraham, laughing.\n" +
                "10 So she said to Abraham, “Cast out this slave woman with her son, for the son of this slave woman shall not be heir with my son Isaac.” \n" +
                "11 And the thing was very displeasing to Abraham on account of his son. \n" +
                "12 But God said to Abraham, “Be not displeased because of the boy and because of your slave woman. Whatever Sarah says to you, \n" +
                "do as she tells you, for through Isaac shall your offspring be named. \n" +
                "13 And I will make a nation of the son of the slave woman also, because he is your offspring.”\n" +
                "14 So Abraham rose early in the morning and took bread and a skin of water and gave it to Hagar, putting it on her shoulder, \n" +
                "along with the child, and sent her away. And she departed and wandered in the wilderness of Beersheba.\n" +
                "15 When the water in the skin was gone, she put the child under one of the bushes. \n" +
                "16 Then she went and sat down opposite him a good way off, about the distance of a bowshot, for she said, \n" +
                "“Let me not look on the death of the child.” And as she sat opposite him, she lifted up her voice and wept. \n" +
                "17 And God heard the voice of the boy, and the angel of God called to Hagar from heaven and said to her, \n" +
                "“What troubles you, Hagar? Fear not, for God has heard the voice of the boy where he is.\n" +
                "18 Up! Lift up the boy, and hold him fast with your hand, for I will make him into a great nation.” \n" +
                "19 Then God opened her eyes, and she saw a well of water. And she went and filled the skin with water and gave the boy a drink. \n" +
                "20 And God was with the boy, and he grew up. He lived in the wilderness band became an expert with the bow. \n" +
                "21 He lived in the wilderness of Paran, and his mother took a wife for him from the land of Egypt.\n";

        String chapterThirdTitle = "A Treaty with Abimelech";

        String thirdContent = "22 At that time Abimelech and Phicol the commander of his army said to Abraham, “God is with you in all that you do. \n" +
                "23 Now therefore swear to me here by God that you will not deal falsely with me or with my descendants or with my posterity,\n" +
                " but as I have dealt kindly with you, so you will deal with me and with the land where you have sojourned.” \n" +
                "24 And Abraham said, “I will swear.”\n" +
                "25 When Abraham reproved Abimelech about a well of water that Abimelech's servants had seized, \n" +
                "26 Abimelech said, “I do not know who has done this thing; you did not tell me, and I have not heard of it until today.” \n" +
                "27 So Abraham took sheep and oxen and gave them to Abimelech, and the two men made a covenant. \n" +
                "28 Abraham set seven ewe lambs of the flock apart. \n" +
                "29 And Abimelech said to Abraham, “What is the meaning of these seven ewe lambs that you have set apart?” \n" +
                "30 He said, “These seven ewe lambs you will take from my hand, that this3may be a witness for me that I dug this well.” \n" +
                "31 Therefore that place was called Beersheba,4 because there both of them swore an oath. \n" +
                "32 So they made a covenant at Beersheba. Then Abimelech and Phicol the commander of his army rose up and returned to the land of the Philistines. \n" +
                "33 Abraham planted a tamarisk tree in Beersheba and called there on the name of the LORD, the Everlasting God. \n" +
                "34 And Abraham sojourned many days in the land of the Philistines.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblThirdTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);

        //title of the chapter
        table21.add(lblFirstTitle).pad(10,50,0,0).left();
        table21.row();

        //content of the chapter
        table21.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table21.row();

        //title of the second content
        table21.add(lblSecondTitle).pad(10,50,0,0).left();
        table21.row();

        //content of the second title
        table21.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table21.row();

        //title of the third content
        table21.add(lblThirdTitle).pad(10,50,0,0).left();
        table21.row();

        //content of the third title
        table21.add(txtThirdContent).pad(10,70,0,0).left().width(900);
        
        stage.addActor(table21);

    }


    public void chapterTwentyTwoOFGenesis(){

        table22 = new Table();
        table22.setWidth(tableBG.getWidth());
        table22.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table22.setFillParent(true);
        table22.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Sacrifice of Isaac";

        String firstContent = "1 After these things God tested Abraham and said to him, “Abraham!” And he said, “Here I am.” \n" +
                "2 He said, “Take your son, your only son Isaac, whom you love, and go to the land of Moriah, and offer him there as a burnt offering \n" +
                "on one of the mountains of which I shall tell you.” \n" +
                "3 So Abraham rose early in the morning, saddled his donkey, and took two of his young men with him, and his son Isaac. \n" +
                "And he cut the wood for the burnt offering and arose and went to the place of which God had told him. \n" +
                "4 On the third day Abraham lifted up his eyes and saw the place from afar.\n" +
                "5 Then Abraham said to his young men, “Stay here with the donkey; I and the boy1 will go over there and worship and come again to you.”\n" +
                "6 And Abraham took the wood of the burnt offering and laid it on Isaac his son. And he took in his hand the fire and the knife. \n" +
                "So they went both of them together. \n" +
                "7 And Isaac said to his father Abraham, “My father!” And he said, “Here I am, my son.” He said, “Behold, the fire and the wood,\n" +
                "but where is the lamb for a burnt offering?” \n" +
                "8 Abraham said, “God will provide for himself the lamb for a burnt offering, my son.” So they went both of them together.\n" +
                "9 When they came to the place of which God had told him, Abraham built the altar there and laid the wood in order and bound Isaac \n" +
                "his son and laid him on the altar, on top of the wood. \n" +
                "10 Then Abraham reached out his hand and took the knife to slaughter his son. \n" +
                "11 But the angel of the LORD called to him from heaven and said, “Abraham, Abraham!” And he said, “Here I am.” \n" +
                "12 He said, “Do not lay your hand on the boy or do anything to him, for now I know that you fear God, seeing you have not withheld your son, \n" +
                "your only son, from me.” \n" +
                "13 And Abraham lifted up his eyes and looked, and behold, behind him was a ram, caught in a thicket by his horns. \n" +
                "And Abraham went and took the ram and offered it up as a burnt offering instead of his son. \n" +
                "14 So Abraham called the name of that place, “The LORD will provide”; as it is said to this day, “On the mount of the LORD it shall be provided.”\n" +
                "15 And the angel of the LORD called to Abraham a second time from heaven \n" +
                "16 and said, “By myself I have sworn, declares the LORD, because you have done this and have not withheld your son, your only son, \n" +
                "17 I will surely bless you, and I will surely multiply your offspring as the stars of heaven and as the sand that is on the seashore. \n" +
                "And your offspring shall possess the gate of his enemies, \n" +
                "18 and in your offspring shall all the nations of the earth be blessed, because you have obeyed my voice.” \n" +
                "19 So Abraham returned to his young men, and they arose and went together to Beersheba. And Abraham lived at Beersheba.\n" +
                "20 Now after these things it was told to Abraham, “Behold, Milcah also has borne children to your brother Nahor: \n" +
                "21 Uz his firstborn, Buz his brother, Kemuel the father of Aram, \n" +
                "22 Chesed, Hazo, Pildash, Jidlaph, and Bethuel.” \n" +
                "23 (Bethuel fathered Rebekah.) These eight Milcah bore to Nahor, Abraham's brother. \n" +
                "24 Moreover, his concubine, whose name was Reumah, bore Tebah, Gaham, Tahash, and Maacah.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table22.add(lblFirstTitle).pad(10,50,0,0).left();
        table22.row();

        //content of the chapter
        table22.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        
        stage.addActor(table22);

    }

    public void chapterTwentyThreeOFGenesis(){

        table23 = new Table();
        table23.setWidth(tableBG.getWidth());
        table23.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table23.setFillParent(true);
        table23.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Sarah's Death and Burial";

        String firstContent = "1 Sarah lived 127 years; these were the years of the life of Sarah.\n" +
                "2 And Sarah died at Kiriath-arba (that is,Hebron) in the land of Canaan, and Abraham went in to mourn for Sarah and to weep for her. \n" +
                "3 And Abraham rose up from before his dead and said to the Hittites,\n" +
                "4 “I am a sojourner and foreigner among you; give me property among you for a burying place, that I may bury my dead out of my sight.” \n" +
                "5 The Hittites answered Abraham, \n" +
                "6 “Hear us, my lord; you are a prince of God among us. Bury your dead in the choicest of our tombs. None of us will withhold \n" +
                "from you his tomb to hinder you from burying your dead.” \n" +
                "7 Abraham rose and bowed to the Hittites, the people of the land. \n" +
                "8 And he said to them, “If you are willing that I should bury my dead out of my sight, hear me and entreat for me Ephron the son of Zohar, \n" +
                "9 that he may give me the cave of Machpelah, which he owns; it is at the end of his field. For the full price let him \n" +
                "give it to me in your presence as property for a burying place.”\n" +
                "10 Now Ephron was sitting among the Hittites, and Ephron the Hittite answered Abraham in the hearing of the Hittites, \n" +
                "of all who went in at the gate of his city, \n" +
                "11 “No, my lord, hear me: I give you the field, and I give you the cave that is in it. In the sight of the sons of my people I give it to you.\n" +
                " Bury your dead.” \n" +
                "12 Then Abraham bowed down before the people of the land. \n" +
                "13 And he said to Ephron in the hearing of the people of the land, “But if you will, hear me: I give the price of the field. Accept it from me, \n" +
                "that I may bury my dead there.” \n" +
                "14 Ephron answered Abraham, \n" +
                "15 “My lord, listen to me: a piece of land worth four hundred ishekels3 of silver, what is that between you and me? Bury your dead.” \n" +
                "16 Abraham listened to Ephron, and Abraham weighed out for Ephron the silver that he had named in the hearing of the Hittites, \n" +
                "four hundred shekels of silver, according to the weights current among the merchants.\n" +
                "17 So the field of Ephron in Machpelah, which was to the east of Mamre, the field with the cave that was in it and all the trees \n" +
                "that were in the field, throughout its whole area, was made over \n" +
                "18 to Abraham as a possession in the presence of the Hittites, before all who went in at the gate of his city. \n" +
                "19 After this, Abraham buried Sarah his wife in the cave of the field of Machpelah east of Mamre (that is, Hebron) in the land of Canaan.\n" +
                "20 The field and the cave that is in it lwere made over to Abraham as property for a burying place by the Hittites.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table23.add(lblFirstTitle).pad(10,50,0,0).left();
        table23.row();

        //content of the chapter
        table23.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        
        stage.addActor(table23);

    }


    public void chapterTwentyFourOFGenesis() {

        table24 = new Table();
        table24.setWidth(tableBG.getWidth());
        table24.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table24.setFillParent(true);
        table24.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Isaac and Rebekah";

        String firstContent = "1 Now Abraham was old, well advanced in years. And the LORD had blessed Abraham in all things. \n" +
                "2 And Abraham said to his servant, the oldest of his household, who had charge of all that he had, “Put your hand under my thigh, \n" +
                "3 that I may make you swear by the LORD, the God of heaven and God of the earth, that you will not take a wife for my son \n" +
                "from the daughters of the Canaanites, among whom I dwell, \n" +
                "4 but will go to my country and to my kindred, and take a wife for my son Isaac.”\n" +
                "5 The servant said to him, “Perhaps the woman may not be willing to follow me to this land. Must I then take your son back to the land \n" +
                "from which you came?” \n" +
                "6 Abraham said to him, “See to it that you do not take my son back there. \n" +
                "7 The LORD, the God of heaven, who took me from my father's house and from the land of my kindred, and who spoke to me and swore to me, \n" +
                "‘To your offspring I will give this land,’ the will send his angel before you, and you shall take a wife for my son from there. \n" +
                "8 But if the woman is not willing to follow you, then you will be free from this oath of mine; only you must not take my son back there.” \n" +
                "9 So the servant put his hand under the thigh of Abraham his master and swore to him concerning this matter.\n" +
                "10 Then the servant took ten of his master's camels and departed, taking all sorts of choice gifts from his master; \n" +
                "nd he arose and went to Mesopotamia to the city of Nahor. \n" +
                "11 And he made the camels kneel down outside the city by the well of water at the time of evening, the time when women go out to draw water. \n" +
                "12 And he said, “O LORD, God of my master Abraham, please grant me success today and show steadfast love to my master Abraham. \n" +
                "13 Behold, I am standing by the spring of water, and the daughters of the men of the city are coming out to draw water. \n" +
                "14 Let the young woman to whom I shall say, ‘Please let down your jar that I may drink,’ and who shall say, \n" +
                "‘Drink, and I will water your camels’—let her be the one whom you have appointed for your servant Isaac. By this I shall know that you have shown steadfast love to my master.”\n" +
                "15 Before he had finished speaking, behold, Rebekah, who was born to Bethuel the son of Milcah, the wife of Nahor, Abraham's brother, \n" +
                "came out with her water jar on her shoulder. \n" +
                "16 The young woman was very attractive in appearance, a maiden3 whom no man had known. She went down to the spring and filled her jar and came up. \n" +
                "17 Then the servant ran to meet her and said, “Please give me a little water to drink from your jar.” \n" +
                "18 She said, “Drink, my lord.” And she quickly let down her jar upon her hand and gave him a drink. \n" +
                "19 When she had finished giving him a drink, she said, “I will draw water for your camels also, until they have finished drinking.”\n" +
                "20 So she quickly emptied her jar into the trough and ran again to the well to draw water, and she drew for all his camels. \n" +
                "21 The man gazed at her in silence to learn whether the LORD had prospered his journey or not.\n" +
                "22 When the camels had finished drinking, the man took a gold ring weighing a half shekel,4 and two bracelets for her arms weighing ten gold shekels, \n" +
                "23 and said, “Please tell me whose daughter you are. Is there room in your father's house for us to spend the night?” \n" +
                "24 She said to him, “I am the daughter of Bethuel the son of Milcah, whom she bore to Nahor.”\n" +
                "25 She added, “We have plenty of both straw and fodder, and room to spend the night.” \n" +
                "26 The man bowed his head and worshiped the LORD\n" +
                "27 and said, “Blessed be the LORD, the God of my master Abraham, who has not forsaken his steadfast love and his faithfulness toward my master. \n" +
                "As for me, the LORD has led me in the way to the house of my master's kinsmen.” \n" +
                "28 Then the young woman ran and told her mother's household about these things.\n" +
                "29 Rebekah had a brother whose name was Laban. Laban ran out toward the man, to the spring. \n" +
                "30 As soon as he saw the ring and the bracelets on his sister's arms, and heard the words of Rebekah his sister, \n" +
                "“Thus the man spoke to me,” he went to the man. And behold, he was standing by the camels at the spring. \n" +
                "31 He said, “Come in, O blessed of the LORD. Why do you stand outside? For I have prepared the house and a place for the camels.” \n" +
                "32 So the man came to the house and unharnessed the camels, and gave lstraw and fodder to the camels, \n" +
                "and there was water to wash his feet and the feet of the men who were with him.\n" +
                "33 Then food was set before him to eat. But he said, “I will not eat until I have said what I have to say.” He said, “Speak on.”\n" +
                "34 So he said, “I am Abraham's servant. \n" +
                "35 The LORD has greatly blessed my master, and he has become great. He has given him flocks and herds, silver and gold, \n" +
                "male servants and female servants, camels and donkeys. \n" +
                "36 And Sarah my master's wife bore a son to my master when she was old, and to him he has given all that he has. \n" +
                "37 My master made me swear, saying, ‘You shall not take a wife for my son from the daughters of the Canaanites, in whose land I dwell, \n" +
                "38 but you shall go to my father's house and to my clan and take a wife for my son.’\n" +
                "39 I said to my master, ‘Perhaps the woman will not follow me.’ \n" +
                "40 But he said to me, ‘The LORD, before whom I have walked, will send his angel with you and prosper your way. \n" +
                "You shall take a wife for my son from my clan and from my father's house. \n" +
                "41 Then you will be free from my oath, when you come to my clan. And if they will not give her to you, you will be free from my oath.’\n" +
                "42 “I came today to the spring and said, ‘O LORD, the God of my master Abraham, if now you are prospering the way that I go, \n" +
                "43 behold, I am standing by the spring of water. Let the virgin who comes out to draw water, to whom I shall say, \n" +
                "“Please give me a little water from your jar to drink,” \n" +
                "44 and who will say to me, “Drink, and I will draw for your camels also,” let her be the woman whom the LORD has appointed for my master's son.’\n" +
                "45 “Before I had finished speaking in my heart, behold, Rebekah came out with her water jar on her shoulder, \n" +
                "and she went down to the spring and drew water. I said to her, ‘Please let me drink.’\n" +
                "46 She quickly let down her jar from her shoulder and said, ‘Drink, and I will give your camels drink also.’\n" +
                " So I drank, and she gave the camels drink also.\n" +
                "47 Then I asked her, ‘Whose daughter are you?’ She said, ‘The daughter of Bethuel, Nahor's son, whom Milcah bore to him.’ \n" +
                "So I put the ring on her nose and the bracelets on her arms. \n" +
                "48 Then I bowed my head and worshiped the LORD and blessed the LORD, the God of my master Abraham, who had led me by the right way5 to \n" +
                "take zthe daughter of my master's kinsman for his son.\n" +
                "49 Now then, if you are going to show steadfast love and faithfulness to my master, tell me; and if not, tell me, \n" +
                "that I may turn to the right hand or to the left.”\n" +
                "50 Then Laban and Bethuel answered and said, “The thing has come from the LORD; we cannot speak to you bad or good. \n" +
                "51 Behold, Rebekah is before you; take her and go, and let her be the wife of your master's son, as the LORD has spoken.”\n" +
                "52 When Abraham's servant heard their words, he bowed himself to the earth before the LORD. \n" +
                "53 And the servant brought out jewelry of silver and of gold, and garments, and gave them to Rebekah. He also gave to her brother \n" +
                "and to her mother costly ornaments. \n" +
                "54 And he and the men who were with him ate and drank, and they spent the night there. When they arose in the morning, \n" +
                "he said, “Send me away to my master.” \n" +
                "55 Her brother and her mother said, “Let the young woman remain with us a while, at least ten days; after that she may go.” \n" +
                "56 But he said to them, “Do not delay me, since the LORD has prospered my way. Send me away that I may go to my master.” \n" +
                "57 They said, “Let us call the young woman and ask her.” \n" +
                "58 And they called Rebekah and said to her, “Will you go with this man?” She said, “I will go.” \n" +
                "59 So they sent away Rebekah their sister and her nurse, and Abraham's servant and his men. \n" +
                "60 And they blessed Rebekah and said to her,\n" +
                "\t\t“Our sister, may you become\n" +
                "\t\tthousands of ten thousands,\n" +
                "\t\tand may your offspring possess\n" +
                "\t\tthe gate of those who hate him!”6\n" +
                "61 Then Rebekah and her young women arose and rode on the camels and followed the man. Thus the servant took Rebekah and went his way.\n" +
                "62 Now Isaac had returned from Beer-lahai-roi and was dwelling in the Negeb. \n" +
                "63 And Isaac went out to meditate in the field toward evening. And he lifted up his eyes and saw, and behold, there were camels coming. \n" +
                "64 And Rebekah lifted up her eyes, and when she saw Isaac, she dismounted from the camel \n" +
                "65 and said to the servant, “Who is that man, walking in the field to meet us?” The servant said, “It is my master.” \n" +
                "So she took her veil and covered herself. \n" +
                "66 And the servant told Isaac all the things that he had done. \n" +
                "67 Then Isaac brought her into the tent of Sarah his mother and took Rebekah, and she became his wife, and he loved her. \n" +
                "So Isaac was comforted after his mother's death.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table24.add(lblFirstTitle).pad(10,50,0,0).left();
        table24.row();

        //content of the chapter
        table24.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        
        stage.addActor(table24);


    }

    public void chapterTwentyFiveOFGenesis() {

        table25 = new Table();
        table25.setWidth(tableBG.getWidth());
        table25.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table25.setFillParent(true);
        table25.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
        
        String chapterFirstTitle = "Abraham's Death and His Descendants";

        String firstContent = "1 Abraham took another wife, whose name was Keturah. \n" +
                "2 She bore him Zimran, Jokshan, Medan, Midian, Ishbak, and Shuah.\n" +
                "3 Jokshan fathered Sheba and Dedan. The sons of Dedan were Asshurim, Letushim, and Leummim. \n" +
                "4 The sons of Midian were Ephah, Epher, Hanoch, Abida, and Eldaah. All these were the children of Keturah. \n" +
                "5 Abraham gave all he had to Isaac.\n" +
                "6 But to the sons of his concubines Abraham gave gifts, and while he was still living he sent them away from his son Isaac, \n" +
                "eastward to the east country.\n" +
                "7 These are the days of the years of Abraham's life, 175 years.\n" +
                "8 Abraham breathed his last and died in a good old age, an old man and full of years, and was gathered to his people. \n" +
                "9 Isaac and Ishmael his sons buried him in the cave of Machpelah, in the field of Ephron the son of Zohar the Hittite, east of Mamre, \n" +
                "10 the field that Abraham purchased from the Hittites. There Abraham was buried, with Sarah his wife. \n" +
                "11 After the death of Abraham, God blessed Isaac his son. And Isaac settled at Beer-lahai-roi.\n" +
                "12 These are the generations of Ishmael, Abraham's son, whom Hagar the Egyptian, Sarah's servant, bore to Abraham. \n" +
                "13 These are the names of the sons of Ishmael, named in the order of their birth: Nebaioth, the firstborn of Ishmael; and Kedar, Adbeel, Mibsam,\n" +
                "14 Mishma, Dumah, Massa, \n" +
                "15 Hadad, Tema, Jetur, Naphish, and Kedemah. \n" +
                "16 These are the sons of Ishmael and these are their names, by their villages and by their encampments, twelve princes according to their tribes. \n" +
                "17 (These are the years of the life of Ishmael: 137 years. Hebreathed his last and died, and was gathered to his people.) \n" +
                "18 They settled from Havilah to Shur, which is opposite Egypt in the direction of Assyria. He settled1 over against all his kinsmen.\n" +
                "The Birth of Esau and Jacob\n" +
                "19 These are the generations of Isaac, Abraham's son: Abraham fathered Isaac,\n" +
                "20 and Isaac was forty years old when he took Rebekah, the daughter of Bethuel the Aramean of Paddan-aram,  \n" +
                "the sister of Laban the Aramean, to be his wife. \n" +
                "21 And Isaac prayed to the LORD for his wife, because she was barren. And the LORD granted his prayer, and Rebekah his wife conceived. \n" +
                "22 The children struggled together within her, and she said, “If it is thus, why is this happening to me?” \n" +
                "So she went to inquire of the LORD. \n" +
                "23 And the LORD said to her,\n" +
                "“Two nations are in your womb,\n" +
                "and two peoples from within you shall be divided;\n" +
                "the one shall be stronger than the other,\n" +
                "the older shall serve the younger.”\n" +
                "24 When her days to give birth were completed, behold, there were twins in her womb. \n" +
                "25 The first came out red, all his body like a hairy cloak, so they called his name Esau. \n" +
                "26 Afterward his brother came out with his hand holding Esau's heel, so phis name was called Jacob. \n" +
                "Isaac was sixty years old when she bore them.\n" +
                "\n" +
                "27 When the boys grew up, Esau was a skillful hunter, a man of the field, while Jacob was a quiet man, dwelling in tents. \n" +
                "28 Isaac loved Esau because she ate of his game, but Rebekah loved Jacob.\n";

        String chapterSecondTitle = "Esau Sells His Birthright";

        String secondContent = "29 Once when Jacob was cooking stew, Esau came in from the field, and he was exhausted. \n" +
                "30 And Esau said to Jacob, “Let me eat some of that red stew, for I am exhausted!” (Therefore his name was called Edom.) \n" +
                "31 Jacob said, “Sell me your birthright now.” \n" +
                "32 Esau said, “I am about to die; of what use is a birthright to me?” \n" +
                "33 Jacob said, “Swear to me now.” So he swore to him and sold his birthright to Jacob. \n" +
                "34 Then Jacob gave Esau bread and lentil stew, and he ate and drank and rose and went his way. Thus Esau despised his birthright.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

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
        
        stage.addActor(table25);


    }


    public void chapterTwentySixOFGenesis() {

        table26 = new Table();
        table26.setWidth(tableBG.getWidth());
        table26.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table26.setFillParent(true);
        table26.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "God's Promise to Isaac";

        String firstContent = "1 Now there was a famine in the land, besides the former famine that was in the days of Abraham. \n" +
                "And Isaac went to Gerar to Abimelech king of the Philistines.\n" +
                "2 And the LORD appeared to him and said, “Do not go down to Egypt; dwell in the land of which I shall tell you. \n" +
                "3 Sojourn in this land, and I will be with you and will bless you, for to you and to your offspring I will give all these lands, \n" +
                "and I will establish the oath that I swore to Abraham your father. \n" +
                "4 I will multiply your offspring as the stars of heaven and will give to your offspring all these lands. A\n" +
                "nd in your offspring all the nations of the earth shall be blessed, \n" +
                "5 because Abraham obeyed my voice and kept my charge, my commandments, my statutes, and my laws.”\n";

        String chapterSecondTitle = "Isaac and Abimelech";

        String secondContent = "6 So Isaac settled in Gerar. \n" +
                "7 When the men of the place asked him about his wife, he said, “She is my sister,” for he feared to say, “My wife,” thinking, \n" +
                "“lest the men of the place should kill me because of Rebekah,” because she was attractive in appearance. \n" +
                "8 When he had been there a long time, Abimelech king of the Philistines looked out of a window and saw Isaac laughing with1 Rebekah his wife. \n" +
                "9 So Abimelech called Isaac and said, “Behold, she is your wife. How then could you say, ‘She is my sister’?” \n" +
                "Isaac said to him, “Because I thought, ‘Lest I die because of her.’” \n" +
                "10 Abimelech said, “What is this you have done to us? One of the people might easily have lain with your wife, \n" +
                "and you would have brought guilt upon us.” \n" +
                "11 So Abimelech warned all the people, saying, “Whoever touches this man or his wife shall surely be put to death.”\n" +
                "12 And Isaac sowed in that land and reaped in the same year a hundredfold. The LORD blessed him, \n" +
                "13 and the man became rich, and gained more and more until he became very wealthy. \n" +
                "14 He had possessions of flocks and herds and many servants, so that the Philistines envied him. \n" +
                "15 (Now the Philistines had stopped and filled with earth all the wells that his father's servants had dug in the days of Abraham his father.) \n" +
                "16 And Abimelech said to Isaac, “Go away from us, for you are much mightier than we.”\n" +
                "17 So Isaac departed from there and encamped in the Valley of Gerar and settled there. \n" +
                "18 And Isaac dug again the wells of water that had been dug in the days of Abraham his father, \n" +
                "which the Philistines had stopped after the death of Abraham. And he gave them the names that his father had given them. \n" +
                "19 But when Isaac's servants dug in the valley and found there a well of spring water, \n" +
                "20 the herdsmen of Gerar quarreled with Isaac's herdsmen, saying, “The water is ours.” So he called the name of the well Esek, \n" +
                "because they contended with him.\n" +
                "21 Then they dug another well, and they quarreled over that also, so he called its name Sitnah.\n" +
                "22 And he moved from there and dug another well, and they did not quarrel over it. So he called its name Rehoboth, saying, \n" +
                "“For now the LORD has made room for us, and we shall be fruitful in the land.”\n" +
                "23 From there he went up to Beersheba. \n" +
                "24 And the LORD appeared to him the same night and said, “I am the God of Abraham your father. Fear not, \n" +
                "for I am with you and will bless you and multiply your offspring for my servant Abraham's sake.” \n" +
                "25 So he built an altar there and called upon the name of the LORD and pitched his tent there. And there Isaac's servants dug a well.\n" +
                "26 When Abimelech went to him from Gerar with Ahuzzath his adviser and Phicol the commander of his army, \n" +
                "27 Isaac said to them, “Why have you come to me, seeing that you hate me and thave sent me away from you?” \n" +
                "28 They said, “We see plainly that the LORD has been with you. So we said, let there be a sworn pact between us, between you and us, \n" +
                "and let us make a covenant with you, \n" +
                "29 that you will do us no harm, just as we have not touched you and have done to you nothing but good and have sent you away in peace. \n" +
                "You are now the blessed of theLORD.” \n" +
                "30 So he made them a feast, and they ate and drank. \n" +
                "31 In the morning they rose early and exchanged oaths. And Isaac sent them on their way, and they departed from him in peace. \n" +
                "32 That same day Isaac's servants came and told him about the well that they had dug and said to him, “We have found water.” \n" +
                "33 He called it Shibah; therefore the name of the city is Beersheba to this day.\n" +
                "34 When Esau was forty years old, he took Judith the daughter of Beeri the Hittite to be his wife, and Basemath the daughter of Elon the Hittite, \n" +
                "35 and they made life bitter for Isaac and Rebekah.\n";

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

    public void chapterTwentySevenOFGenesis() {

        table27 = new Table();
        table27.setWidth(tableBG.getWidth());
        table27.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table27.setFillParent(true);
        table27.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Isaac Blesses Jacob";

        String firstContent = "1  When Isaac was old and zhis eyes were dim so that he could not see, he called Esau his older son and said to him, \n" +
                "“My son”; and he answered, “Here I am.” \n" +
                "2 He said, “Behold, I am old; I do not know the day of my death. \n" +
                "3 Now then, take your weapons, your quiver and your bow, and go out to the field and hunt game for me, \n" +
                "4 and prepare for me delicious food, such as I love, and bring it to me so that I may eat, that my soul may bless you before I die.”\n" +
                "5 Now Rebekah was listening when Isaac spoke to his son Esau. So when Esau went to the field to hunt for game and bring it, \n" +
                "6 Rebekah said to her son Jacob, “I heard your father speak to your brother Esau,\n" +
                "7 ‘Bring me game and prepare for me delicious food, that I may eat it and bless you before the LORD before I die.’ \n" +
                "8 Now therefore, my son, obey my voice as I command you. \n" +
                "9 Go to the flock and bring me two good young goats, so that I may prepare from them delicious food for your father, such as he loves. \n" +
                "10 And you shall bring it to your father to eat, so that he may bless you before he dies.” \n" +
                "11 But Jacob said to Rebekah his mother, “Behold, my brother Esau is a hairy man, and I am a smooth man. \n" +
                "12 Perhaps my father will feel me, and I shall seem to be mocking him and bring ga curse upon myself and not a blessing.” \n" +
                "13 His mother said to him, “Let your curse be on me, my son; only obey my voice, and go, bring them to me.”\n" +
                "14 So he went and took them and brought them to his mother, and his mother prepared delicious food, such as his father loved. \n" +
                "15 Then Rebekah took the best garments of Esau her older son, which were with her in the house, and put them on Jacob her younger son. \n" +
                "16 And the skins of the young goats she put on his hands and on the smooth part of his neck. \n" +
                "17 And she put the delicious food and the bread, which she had prepared, into the hand of her son Jacob.\n" +
                "18 So he went in to his father and said, “My father.” And he said, “Here I am. Who are you, my son?” \n" +
                "19 Jacob said to his father, “I am Esau your firstborn. I have done as you told me; now sit up and eat of my game, that your soul may bless me.” \n" +
                "20 But Isaac said to his son, “How is it that you have found it so quickly, my son?” He answered, “Because the LORD your God granted me success.” \n" +
                "21 Then Isaac said to Jacob, “Please come near, that I may feel you, my son, to know whether you are really my son Esau or not.” \n" +
                "22 So Jacob went near to Isaac his father, who felt him and said, “The voice is Jacob's voice, but the hands are the hands of Esau.” \n" +
                "23 And he did not recognize him, because his hands were hairy like his brother Esau's hands. So he blessed him. \n" +
                "24 He said, “Are you really my son Esau?” He answered, “I am.” \n" +
                "25 Then he said, “Bring it near to me, that I may eat of my son's game and bless you.” So he brought it near to him, \n" +
                "and he ate; and he brought him wine, and he drank.\n" +
                "26 Then his father Isaac said to him, “Come near and kiss me, my son.” \n" +
                "27 So he came near and kissed him. And Isaac smelled the smell of his garments land blessed him and said,\n" +
                "\t\t“See, the smell of my son\n" +
                "\t\tis as the smell of a field that the LORD has blessed!\n" +
                "\t\t28  May God give you of the dew of heaven\n" +
                "\t\tand of the fatness of the earth\n" +
                "\t\tand plenty of grain and wine.\n" +
                "\t\t29  Let peoples serve you,\n" +
                "\t\tand nations bow down to you.\n" +
                "\t\tBe lord over your brothers,\n" +
                "\t\tand may your mother's sons bow down to you.\n" +
                "\t\tCursed be everyone who curses you,\n" +
                "\t\tand blessed be everyone who blesses you!”\n" +
                "30 As soon as Isaac had finished blessing Jacob, when Jacob had scarcely gone out from the presence of Isaac his father, \n" +
                "Esau his brother came in from his hunting. \n" +
                "31 He also prepared delicious food and brought it to his father. And he said to his father, “Let my father arise and eat of his son's game, \n" +
                "that you may bless me.”\n" +
                "32 His father Isaac said to him, “Who are you?” He answered, “I am your son, your firstborn, Esau.” \n" +
                "33 Then Isaac trembled very violently and said, “Who was it then that hunted game and brought it to me, and I ate it all before you came, \n" +
                "and I have blessed him? Yes, and he shall be blessed.” \n" +
                "34 As soon as Esau heard the words of his father, the cried out with an exceedingly great and bitter cry and said to his father, \n" +
                "“Bless me, even me also, O my father!” \n" +
                "35 But he said, “Your brother came deceitfully, and he has taken away your blessing.” \n" +
                "36 Esau said, “Is he not rightly named Jacob?1 For he has cheated me these two times. He took away my birthright, and behold, \n" +
                "now he has taken away my blessing.” Then he said, “Have you not reserved a blessing for me?” \n" +
                "37 Isaac answered and said to Esau, “Behold, I have made him lord over you, and all his brothers I have given to him for servants, \n" +
                "and with grain and wine I have sustained him. What then can I do for you, my son?” \n" +
                "38 Esau said to his father, “Have you but one blessing, my father? Bless me, even me also, O my father.” And Esau lifted up his voice and wept.\n" +
                "39 Then Isaac his father answered and said to him:\n" +
                "\t\t“Behold, away from2 the fatness of the earth shall your dwelling be,\n" +
                "\t\tand away from3 the dew of heaven on high.\n" +
                "\t\t40  By your sword you shall live,\n" +
                "\t\tand you shall serve your brother;\n" +
                "\t\tbut when you grow restless\n" +
                "\t\tyou shall break his yoke from your neck.”\n" +
                "41 Now Esau hated Jacob because of the blessing with which his father had blessed him, and Esau said to himself,\n" +
                " “The days of mourning for my father are approaching; then I will kill my brother Jacob.” \n" +
                "42 But the words of Esau her older son were told to Rebekah. So she sent and called Jacob her younger son and said to him, \n" +
                "“Behold, your brother Esau comforts himself about you by planning to kill you.\n" +
                "43 Now therefore, my son, obey my voice. Arise, flee to Laban my brother in Haran 44 and stay with him a while, \n" +
                "until your brother's fury turns away—\n" +
                "45 until your brother's anger turns away from you, and he forgets what you have done to him. Then I will send and bring you from there. \n" +
                "Why should I be bereft of you both in one day?”\n" +
                "46 Then Rebekah said to Isaac, “I loathe my life because of the Hittite women. If Jacob marries one of the Hittite women like these, \n" +
                "one of the women of the land, what good will my life be to me?”\n";


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


    public void chapterTwentyEightOFGenesis() {
        table28 = new Table();
        table28.setWidth(tableBG.getWidth());
        table28.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table28.setFillParent(true);
        table28.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Jacob Sent to Laban";

        String firstContent = "1 Then Isaac called Jacob and blessed him and directed him, “You must not take a wife from the Canaanite women. \n" +
                "2 Arise, go to Paddan-aram to the house of Bethuel your mother's father, \n" +
                "and take as your wife from there one of the daughters of Laban your mother's brother. \n" +
                "3 God Almighty1 bless you and make you fruitful and multiply you, that you may become a company of peoples.\n" +
                "4 May he give the blessing of Abraham to you and to your offspring with you, that you may take possession of the land of your sojournings \n" +
                "that God gave to Abraham!”\n" +
                "5 Thus Isaac sent Jacob away. And he went to Paddan-aram, to Laban, the son of Bethuel the Aramean, the brother of Rebekah, Jacob's and Esau's mother.\n";

        String chapterSecondTitle = "Esau Marries an Ishmaelite";

        String secondContent = "6 Now Esau saw that Isaac had blessed Jacob and sent him away to Paddan-aram to take a wife from there, \n" +
                "and that as he blessed him he directed him, “You must not take a wife from the Canaanite women,”\n" +
                "7 and that Jacob had obeyed his father and his mother and gone to Paddan-aram. \n" +
                "8 So when Esau saw that the Canaanite women did not please Isaac his father,\n" +
                "9 Esau went to Ishmael and took as his wife, besides the wives he had, Mahalath the daughter of Ishmael, Abraham's son, the sister of Nebaioth.\n";

        String chapterThirdTitle = "Jacob's Dream";

        String thirdContent = "10 Jacob left Beersheba and went toward Haran. \n" +
                "11 And he came to a certain place and stayed there that night, because the sun had set. Taking one of the stones of the place, \n" +
                "he put it under his head and lay down in that place to sleep. \n" +
                "12 And he dreamed, and behold, there was a ladder2 set up on the earth, and the top of it reached to heaven. \n" +
                "And behold, the angels of God were ascending and descending on it! \n" +
                "13 And behold, the LORD stood above it3 and said, “I am the LORD, the God of Abraham your father and the God of Isaac. \n" +
                "The land on which you lie I will give to you and to your offspring. \n" +
                "14 Your offspring shall be like the dust of the earth, and you shall spread abroad to the west and to the east and to the north and to the south, \n" +
                "and in you and your offspring shall all the families of the earth be blessed. \n" +
                "15 Behold, I am with you and will keep you wherever you go, and will bring you back to this land. \n" +
                "For I will not leave you until I have done what I have promised you.” \n" +
                "16 Then Jacob awoke from his sleep and said, “Surely the LORD is bin this place, and I did not know it.”\n" +
                "17 And he was afraid and said, “How awesome is this place! This is none other than the house of God, and this is the gate of heaven.”\n" +
                "18 So early in the morning Jacob took the stone that he had put under his head and set it up for a pillar and poured oil on the top of it. \n" +
                "19 He called the name of that place Bethel, but the name of the city was Luz at the first. \n" +
                "20 Then Jacob made a vow, saying, “If God will be with me and will keep me in this way that I go, and will give me bread to eat and clothing to wear, \n" +
                "21 so that I come again to my father's house in peace, then the LORD shall be my God, \n" +
                "22 and this stone, which I have set up for a pillar, shall be God's house. And of all that you give me I will give a full tenth to you.”\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblThirdTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);

        //title of the chapter
        table28.add(lblFirstTitle).pad(10,50,0,0).left();
        table28.row();

        //content of the chapter
        table28.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table28.row();

        //title of the second content
        table28.add(lblSecondTitle).pad(10,50,0,0).left();
        table28.row();

        //content of the second title
        table28.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table28.row();

        //title of the third content
        table28.add(lblThirdTitle).pad(10,50,0,0).left();
        table28.row();

        //content of the third title
        table28.add(txtThirdContent).pad(10,70,0,0).left().width(900);
        
        stage.addActor(table28);


    }


    public void chapterTwentyNineOFGenesis() {

        table29 = new Table();
        table29.setWidth(tableBG.getWidth());
        table29.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table29.setFillParent(true);
        table29.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Jacob Marries Leah and Rachel";

        String firstContent = "1 Then Jacob went on his journey and came to the land of the people of the east. \n" +
                "2 As he looked, he saw a well in the field, and behold, three flocks of sheep lying beside it, for out of that well the flocks were watered. \n" +
                "The stone on the well's mouth was large, \n" +
                "3 and when all the flocks were gathered there, the shepherds would roll the stone from the mouth of the well and water the sheep, \n" +
                "and put the stone back in its place over the mouth of the well.\n" +
                "4 Jacob said to them, “My brothers, where do you come from?” They said, “We are from Haran.” \n" +
                "5 He said to them, “Do you know Laban the son of Nahor?” They said, “We know him.” \n" +
                "6 He said to them, “Is it well with him?” They said, “It is well; and see, Rachel his daughter is coming with the sheep!” \n" +
                "7 He said, “Behold, it is still high day; it is not time for the livestock to be gathered together. Water the sheep and go, pasture them.” \n" +
                "8 But they said, “We cannot until all the flocks are gathered together and the stone is rolled from the mouth of the well; then we water the sheep.”\n" +
                "9 While he was still speaking with them, Rachel came with her father's sheep, for she was a shepherdess. \n" +
                "10 Now as soon as Jacob saw Rachel the daughter of Laban his mother's brother, and the sheep of Laban his mother's brother, \n" +
                "Jacob came near and rolled the stone from the well's mouth and watered the flock of Laban his mother's brother.\n" +
                "11 Then Jacob kissed Rachel and wept aloud. \n" +
                "12 And Jacob told Rachel that he was her father's kinsman, and that he was Rebekah's son, and she ran and told her father.\n" +
                "13 As soon as Laban heard the news about Jacob, his sister's son, he ran to meet him and embraced him \n" +
                "and kissed him and brought him to his house. Jacob told Laban all these things, \n" +
                "14 and Laban said to him, “Surely you are my bone and my flesh!” And he stayed with him a month.\n" +
                "15 Then Laban said to Jacob, “Because you are my kinsman, should you therefore serve me for nothing? Tell me, what shall your wages be?”\n" +
                "16 Now Laban had two daughters. The name of the older was Leah, and the name of the younger was Rachel. \n" +
                "17 Leah's eyes were weak, but Rachel was beautiful in form and appearance. \n" +
                "18 Jacob loved Rachel. And he said, “I will serve you seven years for your younger daughter Rachel.” \n" +
                "19 Laban said, “It is better that I give her to you than that I should give her to any other man; stay with me.” \n" +
                "20 So Jacob served seven years for Rachel, and they seemed to him but a few days because of the love he had for her.\n" +
                "21 Then Jacob said to Laban, “Give me my wife that I may go in to her, for my time is completed.” \n" +
                "22 So Laban gathered together all the people of the place and made a feast. \n" +
                "23 But in the evening he took his daughter Leah and brought her to Jacob, and he went in to her.\n" +
                "24 (Laban gave his female servant Zilpah to his daughter Leah to be her servant.) \n" +
                "25 And in the morning, behold, it was Leah! And Jacob said to Laban, “What is this you have done to me? \n" +
                "Did I not serve with you for Rachel? Why then have you deceived me?” \n" +
                "26 Laban said, “It is not so done in our country, to give the younger before the firstborn.\n" +
                "27 Complete the week of this one, and we will give you the other also in return for serving me another seven years.” \n" +
                "28 Jacob did so, and completed her week. Then Laban gave him his daughter Rachel to be his wife.\n" +
                "29 (Laban gave his female servant Bilhah to his daughter Rachel to be her servant.)\n" +
                "30 So Jacob went in to Rachel also, and he loved Rachel more than Leah, and served Laban for another seven years.\n" +
                "Jacob's Children\n" +
                "31 When the LORD saw that Leah was hated, he opened her womb, but Rachel was barren. \n" +
                "32 And Leah conceived and bore a son, and she called his name Reuben, for she said, “Because the LORD has looked upon my affliction; \n" +
                "for now my husband will love me.” \n" +
                "33 She conceived again and bore a son, and said, “Because the LORD has heard that I am hated, he has given me this son also.” \n" +
                "And she called his name Simeon.\n" +
                "34 Again she conceived and bore a son, and said, “Now this time my husband will be attached to me, because I have borne him three sons.” \n" +
                "Therefore his name was called Levi. \n" +
                "35 And she conceived again and bore a son, and said, “This time I will praise the LORD.” Therefore she called his name Judah. \n" +
                "Then she ceased bearing.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table29.add(lblFirstTitle).pad(10,50,0,0).left();
        table29.row();

        //content of the chapter
        table29.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        
        stage.addActor(table29);


    }


    public void chapterThirtyOFGenesis() {

        table30 = new Table();
        table30.setWidth(tableBG.getWidth());
        table30.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table30.setFillParent(true);
        table30.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 When Rachel saw that she bore Jacob no children, she envied her sister. She said to Jacob, “Give me children, or I shall die!”\n" +
                "2 Jacob's anger was kindled against Rachel, and he said, “Am I in the place of God, who has withheld from you the fruit of the womb?” \n" +
                "3 Then she said, “Here is my servant Bilhah; go in to her, so that she may give birth on my behalf,1 that even I may have children2 through her.”\n" +
                "4 So she gave him her servant Bilhah as a wife, and Jacob went in to her.\n" +
                "5 And Bilhah conceived and bore Jacob a son.\n" +
                "6 Then Rachel said, “God has fudged me, and has also heard my voice and given me a son.” Therefore she called his name Dan.\n" +
                "7 Rachel's servant Bilhah conceived again and bore Jacob a second son. \n" +
                "8 Then Rachel said, “With mighty wrestlings I have wrestled with my sister and have prevailed.” So she called his name Naphtali.\n" +
                "9 When Leah saw that she had ceased bearing children, she took her servant Zilpah and gave her to Jacob as a wife. \n" +
                "10 Then Leah's servant Zilpah bore Jacob a son. \n" +
                "11 And Leah said, “Good fortune has come!” so she called his name Gad.\n" +
                "12 Leah's servant Zilpah bore Jacob a second son. \n" +
                "13 And Leah said, “Happy am I! For women have called me happy.” So she called his name Asher.\n" +
                "14 In the days of wheat harvest Reuben went and found mandrakes in the field and brought them to his mother Leah. \n" +
                "Then Rachel said to Leah, “Please give me some of your son's mandrakes.” \n" +
                "15 But she said to her, “Is it a small matter that you have taken away my husband? Would you take away my son's mandrakes also?” Rachel said, \n" +
                "“Then he may lie with you tonight in exchange for your son's mandrakes.” \n" +
                "16 When Jacob came from the field in the evening, Leah went out to meet him and said, “You must come in to me, for I have hired you with my son's mandrakes.” So he lay with her that night.\n" +
                "17 And God listened to Leah, and she conceived and bore Jacob a fifth son. \n" +
                "18 Leah said, “God has given me my wages because I gave my servant to my husband.” So she called his name Issachar.\n" +
                "19 And Leah conceived again, and she bore Jacob a sixth son. \n" +
                "20 Then Leah said, “God has endowed me with a good endowment; now my husband will honor me, because I have borne him six sons.” \n" +
                "So she called his name lZebulun.9 \n" +
                "21 Afterward she bore a daughter and called her name Dinah.\n" +
                "22 Then God remembered Rachel, and God listened to her and opened her womb.\n" +
                "23 She conceived and bore a son and said, “God has taken away my reproach.” \n" +
                "24 And she called his name Joseph, saying, “May the LORD add to me another son!”\n" +
                "Jacob's Prosperity\n" +
                "25 As soon as Rachel had borne Joseph, Jacob said to Laban, “Send me away, that I may go to my own home and country. \n" +
                "26 Give me my wives and my children for whom I have served you, that I may go, for you know the service that I have given you.” \n" +
                "27 But Laban said to him, “If I have found favor in your sight, I have learned by divination that the LORD has blessed me because of you. \n" +
                "28 Name your wages, and I will give it.” \n" +
                "29 Jacob said to him, “You yourself know how I have served you, and how your livestock has fared with me. 30 For you had little before I came, \n" +
                "and it has increased abundantly, and the LORD has blessed you wherever I turned. But now when shall I provide for my own household also?” \n" +
                "31 He said, “What shall I give you?” Jacob said, “You shall not give me anything. If you will do this for me, \n" +
                "I will again pasture your flock and keep it: \n" +
                "32 let me pass through all your flock today, removing from it every speckled and spotted sheep and every black lamb, \n" +
                "and the spotted and speckled among the goats, and they shall be my wages. \n" +
                "33 So my honesty will answer for me later, when you come to look into my wages with you. Every one that is not speckled and spotted \n" +
                "among the goats and black among the lambs, if found with me, shall be counted stolen.” \n" +
                "34 Laban said, “Good! Let it be as you have said.” \n" +
                "35 But that day Laban removed the male goats that were striped and spotted, and all the female goats that were speckled and spotted, \n" +
                "every one that had white on it, and every lamb that was black, and put them in the charge of his sons. \n" +
                "36 And he set a distance of three days' journey between himself and Jacob, and Jacob pastured the rest of Laban's flock.\n" +
                "37 Then Jacob took fresh sticks of poplar and almond and plane trees, and peeled white streaks in them, exposing the white of the sticks.\n" +
                "38 He set the sticks that he had peeled in front of the flocks in the troughs, that is, the watering places, where the flocks came to drink. \n" +
                "And since they bred when they came to drink, \n" +
                "39 the flocks bred in front of the sticks and so the flocks brought forth striped, speckled, and spotted. \n" +
                "40 And Jacob separated the lambs and set the faces of the flocks toward the striped and all the black in the flock of Laban. \n" +
                "He put his own droves apart and did not put them with Laban's flock. \n" +
                "41 Whenever the stronger of the flock were breeding, Jacob would lay the sticks in the troughs before the eyes of the flock, \n" +
                "that they might breed among the sticks, \n" +
                "42 but for the feebler of the flock he would not lay them there. So the feebler would be Laban's, and the stronger Jacob's. \n" +
                "43 Thus the man increased greatly and had large flocks, female servants and male servants, and camels and donkeys.\n";
 

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table30.add(lblFirstTitle).pad(10,50,0,0).left();
        table30.row();

        //content of the chapter
        table30.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        
        stage.addActor(table30);


    }


    public void chapterThirtyOneOFGenesis() {

        table31 = new Table();
        table31.setWidth(tableBG.getWidth());
        table31.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table31.setFillParent(true);
        table31.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Jacob Flees from Laban";

        String firstContent = "1 Now Jacob heard that the sons of Laban were saying, “Jacob has taken all that was our father's, \n" +
                "and from what was our father's he has gained all this wealth.” \n" +
                "2 And Jacob saw that Laban did not regard him with favor as before. \n" +
                "3 Then the LORD said to Jacob, “Return to the land of your fathers and to your kindred, and I will be with you.”\n" +
                "4 So Jacob sent and called Rachel and Leah into the field where his flock was\n" +
                "5 and said to them, “I see that your father does not regard me with favor as he did before. But the God of my father has been with me.\n" +
                "6 You know that I have served your father with all my strength, \n" +
                "7 yet your father has cheated me and changed my wages ten times. But God did not permit him to harm me. \n" +
                "8 If he said, ‘The spotted shall be your wages,’ then all the flock bore spotted; and if he said, ‘The striped shall be your wages,’ \n" +
                "then all the flock bore striped. \n" +
                "9 Thus God has taken away the livestock of your father and given them to me. \n" +
                "10 In the breeding season of the flock I lifted up my eyes and saw in a dream that the goats that mated with the flock were striped, \n" +
                "spotted, and mottled.\n" +
                "11 Then the angel of God said to me in the dream, ‘Jacob,’ and I said, ‘Here I am!’ \n" +
                "12 And he said, ‘Lift up your eyes and see, all the goats that mate with the flock are striped, spotted, and mottled, \n" +
                "for I have seen all that Laban is doing to you. \n" +
                "13 I am the God of Bethel, where you anointed a pillar and made a vow to me. Now arise, go out from this land and \n" +
                "return to the land of your kindred.’” \n" +
                "14 Then Rachel and Leah answered and said to him, “Is there lany portion or inheritance left to us in our father's house? \n" +
                "15 Are we not regarded by him as foreigners? For he has sold us, and he has indeed devoured our money. \n" +
                "16 All the wealth that God has taken away from our father belongs to us and to our children. Now then, whatever God has said to you, do.”\n" +
                "17 So Jacob arose and set his sons and his wives on camels. \n" +
                "18 He drove away all his livestock, all his property that he had gained, the livestock in his possession that he had acquired in Paddan-aram, \n" +
                "to go to the land of Canaan to his father Isaac. \n" +
                "19 Laban had gone to shear his sheep, and Rachel stole her father's household gods. \n" +
                "20 And Jacob tricked Laban the Aramean, by not telling him that he intended to flee.\n" +
                "21 He fled with all that he had and arose and crossed the Euphrates, and set his face toward the hill country of Gilead.\n" +
                "22 When it was told Laban on the third day that Jacob had fled, \n" +
                "23 he took his kinsmen with him and pursued him for seven days and followed close after him into the hill country of Gilead. \n" +
                "24 But God came to Laban the Aramean in a dream by night and said to him, “Be careful not to say anything to Jacob, either good or bad.”\n" +
                "25 And Laban overtook Jacob. Now Jacob had pitched his tent in the hill country, and Laban with his kinsmen pitched tents in the hill country of Gilead. \n" +
                "26 And Laban said to Jacob, “What have you done, that you have tricked me and driven away my daughters like captives of the sword? \n" +
                "27 Why did you flee secretly and trick me, and did not tell me, so that I might have sent you away with mirth and songs, with tambourine and lyre? \n" +
                "28 And why did you not permit me to kiss my sons and my daughters farewell? Now you have done foolishly. \n" +
                "29 It is in my power to do you harm. But the God of your3 father spoke to me last night, saying, ‘Be careful not to say anything to Jacob, \n" +
                "either good or bad.’ \n" +
                "30 And now you have gone away because you longed greatly for your father's house, but why did you steal my gods?” \n" +
                "31 Jacob answered and said to Laban, “Because I was afraid, for I thought that you would take your daughters from me by force. \n" +
                "32 Anyone with whom you find your gods shall not live. In the presence of our kinsmen point out what I have that is yours, and take it.” \n" +
                "Now Jacob did not know that Rachel had stolen them.\n" +
                "33 So Laban went into Jacob's tent and into Leah's tent and into the tent of the two female servants, but he did not find them. \n" +
                "And he went out of Leah's tent and entered Rachel's. \n" +
                "34 Now Rachel had taken the household gods and put them in the camel's saddle and sat on them. Laban felt all about the tent, but did not find them. \n" +
                "35 And she said to her father, “Let not my lord be angry that I cannot arise before you, for the way of women is upon me.” \n" +
                "So he searched but did not find the household gods.\n" +
                "36 Then Jacob became angry and berated Laban. Jacob said to Laban, “What is my offense? What is my sin, that you have hotly pursued me?\n" +
                "37 For you have felt through all my goods; what have you found of all your household goods? Set it here before my kinsmen and your kinsmen, \n" +
                "that they may decide between us two.\n" +
                "38 These twenty years I have been with you. Your ewes and your female goats have not miscarried, and I have not eaten the rams of your flocks. \n" +
                "39 What was torn by wild beasts I did not bring to you. I bore the loss of it myself. From my hand you required it, \n" +
                "whether stolen by day or stolen by night. \n" +
                "40 There I was: by day the heat consumed me, and the cold by night, and my sleep fled from my eyes. \n" +
                "41 These twenty years I have been in your house. I served you fourteen years for your two daughters, and six years for your flock, \n" +
                "and you have changed my wages ten times.\n" +
                "42 fIf the God of my father, the God of Abraham and the Fear of Isaac, had not been on my side, surely now you would have sent me away empty-handed.\n" +
                " God saw my affliction and the labor of my hands and rebuked you last night.”\n" +
                "43 Then Laban answered and said to Jacob, “The daughters are my daughters, the children are my children, the flocks are my flocks, \n" +
                "and all that you see is mine. But what can I do this day for these my daughters or for their children whom they have borne? \n" +
                "44 Come now, let us make a covenant, you and I. And let it be a witness between you and me.” \n" +
                "45 So Jacob took a stone and set it up as a pillar. \n" +
                "46 And Jacob said to his kinsmen, “Gather stones.” And they took stones and made a heap, and they ate there by the heap. \n" +
                "47 Laban called it Jegar-sahadutha, but Jacob called it Galeed.\n" +
                "48 Laban said, “This heap is a witness between you and me today.” Therefore he named it Galeed,\n" +
                "49 and Mizpah,6 for he said, “The LORD watch between you and me, when we are out of one another's sight. \n" +
                "50 If you oppress my daughters, or if you take wives besides my daughters, although no one is with us, see, God is witness between you and me.”\n" +
                "51 Then Laban said to Jacob, “See this heap and the pillar, which I have set between you and me. \n" +
                "52 This heap is a witness, and the pillar is a witness, that I will not pass over this heap to you, \n" +
                "and you will not pass over this heap and this pillar to me, to do harm. \n" +
                "53 The God of Abraham and the God of Nahor, the God of their father, judge between us.” So Jacob swore by the Fear of his father Isaac, \n" +
                "54 and Jacob offered a sacrifice in the hill country and called his kinsmen to eat bread. They ate bread and spent the night in the hill country.\n" +
                "55 Early in the morning Laban arose and kissed his grandchildren and his daughters and blessed them. Then Laban departed and returned home.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table31.add(lblFirstTitle).pad(10,50,0,0).left();
        table31.row();

        //content of the chapter
        table31.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        
        stage.addActor(table31);


    }


    public void chapterThirtyTwoOFGenesis() {

        table32 = new Table();
        table32.setWidth(tableBG.getWidth());
        table32.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table32.setFillParent(true);
        table32.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Jacob Fears Esau";

        String firstContent = "1 Jacob went on his way, and the angels of God met him. \n" +
                "2 And when Jacob saw them he said, “This is God's camp!” So he called the name of that place Mahanaim.\n" +
                "3 And Jacob sent  messengers before him to Esau his brother in the land of Seir, the country of Edom, \n" +
                "4 instructing them, “Thus you shall say to my lord Esau: Thus says your servant Jacob, ‘I have sojourned with Laban and stayed until now. \n" +
                "5 I have oxen, donkeys, flocks, male servants, and female servants. I have sent to tell my lord, in order that I may find favor in your sight.’”\n" +
                "6 And the messengers returned to Jacob, saying, “We came to your brother Esau, and he is coming to meet you, and there are four hundred men with him.” \n" +
                "7 Then Jacob was greatly afraid and distressed. He divided the people who were with him, and the flocks and herds and camels, into two camps, \n" +
                "8 thinking, “If Esau comes to the one camp and attacks it, then the camp that is left will escape.”\n" +
                "9 And Jacob said, “O God of my father Abraham and God of my father Isaac, O LORD who said to me, \n" +
                "‘Return to your country and to your kindred, that I may do you good,’ \n" +
                "10 I am not worthy of the least of all the deeds of steadfast love and all the faithfulness that you have shown to your servant, \n" +
                "for with only my staff I crossed this Jordan, and now I have become two camps. \n" +
                "11 Please deliver me from the hand of my brother, from the hand of Esau, for cI fear him, that he may come and attack me, the mothers with the children. \n" +
                "12 But you said, ‘I will surely do you good, and make your offspring as the sand of the sea, which cannot be numbered for multitude.’”\n" +
                "13 So he stayed there that night, and from what he had with him he took ea present for his brother Esau, \n" +
                "14 two hundred female goats and twenty male goats, two hundred ewes and twenty rams, \n" +
                "15 thirty milking camels and their calves, forty cows and ten bulls, twenty female donkeys and ten male donkeys. \n" +
                "16 These he handed over to his servants, every drove by itself, and said to his servants, “Pass on ahead of me and put a space between drove and drove.” \n" +
                "17 He instructed the first, “When Esau my brother meets you and asks you, ‘To whom do you belong? Where are you going? And whose are these ahead of you?’ \n" +
                "18 then you shall say, ‘They belong to your servant Jacob. They are a present sent to my lord Esau. And moreover, he is behind us.’” \n" +
                "19 He likewise instructed the second and the third and all who followed the droves, “You shall say the same thing to Esau when you find him, \n" +
                "20 and you shall say, ‘Moreover, your servant Jacob is behind us.’” For he thought, “I may appease him with the present that goes ahead of me, \n" +
                "and afterward I shall see his face. Perhaps he will accept me.”\n" +
                "21 So the present passed on ahead of him, and he himself stayed that night in the camp.\n";

        String chapterSecondTitle = "Jacob Wrestles with God";

        String secondContent = "22 The same night he arose and took his two wives, his two female servants, and his eleven children, and crossed the ford of the Jabbok.\n" +
                "23 He took them and sent them across the stream, and everything else that he had. \n" +
                "24 And Jacob was left alone. And a man wrestled with him until the breaking of the day. \n" +
                "25 When the man saw that he did not prevail against Jacob, he touched his hip socket, and Jacob's hip was put out of joint as he wrestled with him. \n" +
                "26 Then he said, “Let me go, for the day has broken.” But Jacob said, “I will not let you go unless you bless me.” \n" +
                "27 And he said to him, “What is your name?” And he said, “Jacob.”\n" +
                "28 Then he said, “Your name shall no longer be called Jacob, but Israel, for you have striven with God and with men, and have prevailed.”\n" +
                "29 Then Jacob asked him, “Please tell me your name.” But he said, “Why is it that you ask my name?” And there he blessed him. \n" +
                "30 So Jacob called the name of the place Peniel,7 saying, “For I have seen God face to face, and yet my life has been delivered.” \n" +
                "31 The sun rose upon him as he passed Penuel, limping because of his hip. \n" +
                "32 Therefore to this day the people of Israel do not eat the sinew of the thigh that is on the hip socket, \n" +
                "because he touched the socket of Jacob's hip on the sinew of the thigh.\n";

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table32.add(lblFirstTitle).pad(10,50,0,0).left();
        table32.row();

        //content of the chapter
        table32.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table32.row();

        //title of the second content
        table32.add(lblSecondTitle).pad(10,50,0,0).left();
        table32.row();

        //content of the second title
        table32.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        
        stage.addActor(table32);


    }

    public void chapterThirtyThreeOFGenesis() {

        table33 = new Table();
        table33.setWidth(tableBG.getWidth());
        table33.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table33.setFillParent(true);
        table33.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Jacob Meets Esau";

        String firstContent = "1 And Jacob lifted up his eyes and looked, and behold, Esau was coming, and four hundred men with him. \n" +
                "So he divided the children among Leah and Rachel and the two female servants. \n" +
                "2 And he put the servants with their children in front, then Leah with her children, and Rachel and Joseph last of all. \n" +
                "3 He himself went on before them, bowing himself to the ground seven times, until he came near to his brother.\n" +
                "4 But Esau ran to meet him and embraced him rand fell on his neck and kissed him, and they wept.\n" +
                "5 And when Esau lifted up his eyes and saw the women and children, he said, “Who are these with you?” Jacob said, \n" +
                "“The children whom God has graciously given your servant.”\n" +
                "6 Then the servants drew near, they and their children, and bowed down.\n" +
                "7 Leah likewise and her children drew near and bowed down. And last Joseph and Rachel drew near, and they bowed down. \n" +
                "8 Esau said, “What do you mean by tall this company1 that I met?” Jacob answered, “To find favor in the sight of my lord.” \n" +
                "9 But Esau said, “I have enough, my brother; keep what you have for yourself.” \n" +
                "10 Jacob said, “No, please, if I have found favor in your sight, then accept my present from my hand. For I have seen your face, \n" +
                "which is like seeing the face of God, and you have accepted me. \n" +
                "11 Please accept my blessing that is brought to you, because God has dealt graciously with me, and because I have enough.” \n" +
                "Thus he urged him, and he took it.\n" +
                "12 Then Esau said, “Let us journey on our way, and I will go ahead of you.” \n" +
                "13 But Jacob said to him, “My lord knows that the children are frail, and that the nursing flocks and herds are a care to me. \n" +
                "If they are driven hard for one day, all the flocks will die. \n" +
                "14 Let my lord pass on ahead of his servant, and I will lead on slowly, at the pace of the livestock \n" +
                "that are ahead of me and at the pace of the children, until I come to my lord in Seir.”\n" +
                "15 So Esau said, “Let me leave with you some of the people who are with me.” But he said, “What need is there? Let me find favor in the sight of my lord.”\n" +
                "16 So Esau returned that day on his way to Seir. \n" +
                "17 But Jacob journeyed to Succoth, and built himself a house and made booths for his livestock. Therefore the name of the place is called Succoth.\n" +
                "18 And Jacob came safely to the city of Shechem, which is in the land of Canaan, on his way from Paddan-aram, and he camped before the city. \n" +
                "19 And from the sons of Hamor, Shechem's father, he bought for a hundred pieces of money the piece of land on which he had pitched his tent. \n" +
                "20 There he erected an altar and called it El-Elohe-Israel.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table33.add(lblFirstTitle).pad(10,50,0,0).left();
        table33.row();

        //content of the chapter
        table33.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table33);


    }

    public void chapterThirtyFourOFGenesis() {

        table34 = new Table();
        table34.setWidth(tableBG.getWidth());
        table34.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table34.setFillParent(true);
        table34.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Defiling of Dinah";

        String firstContent = "1 Now Dinah the daughter of Leah, whom she had borne to Jacob, went out to see the women of the land. \n" +
                "2 And when Shechem the son of Hamor the Hivite, the prince of the land, saw her, he seized her and lay with her and humiliated her. \n" +
                "3 And his soul was drawn to Dinah the daughter of Jacob. He loved the young woman and spoke tenderly to her. \n" +
                "4 So Shechem spoke to his father Hamor, saying, “Get me this girl for my wife.”\n" +
                "5 Now Jacob heard that he had defiled his daughter Dinah. But his sons were with his livestock in the field, so Jacob held his peace until they came. \n" +
                "6 And Hamor the father of Shechem went out to Jacob to speak with him. \n" +
                "7 The sons of Jacob had come in from the field as soon as they heard of it, and the men were indignant and very angry, \n" +
                "because he had done an outrageous thing in Israel by lying with Jacob's daughter, for such a thing must not be done.\n" +
                "8 But Hamor spoke with them, saying, “The soul of my son Shechem longs for your1 daughter. Please give her to him to be his wife. \n" +
                "9 Make marriages with us. Give your daughters to us, and take our daughters for yourselves. \n" +
                "10 You shall dwell with us, and lthe land shall be open to you. Dwell and trade in it, and get property in it.” \n" +
                "11 Shechem also said to her father and to her brothers, “Let me find favor in your eyes, and whatever you say to me I will give. \n" +
                "12 Ask me for as great a bride-price and gift as you will, and I will give whatever you say to me. Only give me the young woman to be my wife.”\n" +
                "13 The sons of Jacob answered Shechem and his father Hamor deceitfully, because he had defiled their sister Dinah. \n" +
                "14 They said to them, “We cannot do this thing, to give our sister to one who is uncircumcised, for that would be a disgrace to us. \n" +
                "15 Only on this condition will we agree with you—that you will become as we are by every male among you being circumcised. \n" +
                "16 Then we will give our daughters to you, and we will take your daughters to ourselves, and we will dwell with you and become one people. \n" +
                "17 But if you will not listen to us and be circumcised, then we will take our daughter, and we will be gone.”\n" +
                "18 Their words pleased Hamor and Hamor's son Shechem. \n" +
                "19 And the young man did not delay to do the thing, because he delighted in Jacob's daughter. Now he was the most honored of all his father's house. \n" +
                "20 So Hamor and his son Shechem came to the gate of their city and spoke to the men of their city, saying, \n" +
                "21 “These men are at peace with us; let them dwell in the land and trade in it, for behold, the land is large enough for them. \n" +
                "Let us take their daughters as wives, and let us give them our daughters. \n" +
                "22 Only on this condition will the men agree to dwell with us to become one people—when every male among us is circumcised as they are circumcised. \n" +
                "23 Will not their livestock, their property and all their beasts be ours? Only let us agree with them, and they will dwell with us.” \n" +
                "24 And all who went out of the gate of his city listened to Hamor and his son Shechem, and every male was circumcised, \n" +
                "all who went out of the gate of his city.\n" +
                "25 On the third day, when they were sore, two of the sons of Jacob, Simeon and Levi, Dinah's brothers, t\n" +
                "ook their swords and came against the city while it felt secure and killed all the males. \n" +
                "26 They killed Hamor and his son Shechem with the sword and took Dinah out of Shechem's house and went away. \n" +
                "27 The sons of Jacob came upon the slain and plundered the city, because they had defiled their sister.\n" +
                "28 They took their flocks and their herds, their donkeys, and whatever was in the city and in the field. \n" +
                "29 All their wealth, all their little ones and their wives, all that was in the houses, they captured and plundered.\n" +
                "30 Then Jacob said to Simeon and Levi, “You have brought trouble on me by making me stink to the inhabitants of the land, \n" +
                "the Canaanites and the Perizzites. My numbers are few, and if they gather themselves against me and attack me, I shall be destroyed, \n" +
                "both I and my household.” \n" +
                "31 But they said, “Should he treat our sister like a prostitute?”\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table34.add(lblFirstTitle).pad(10,50,0,0).left();
        table34.row();

        //content of the chapter
        table34.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table34);

    }


    public void chapterThirtyFiveOFGenesis() {

        table35 = new Table();
        table35.setWidth(tableBG.getWidth());
        table35.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table35.setFillParent(true);
        table35.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "God Blesses and Renames Jacob";

        String firstContent = "1 God said to Jacob, “Arise, go up to Bethel and dwell there. Make an altar there to the God who appeared to you \n" +
                "when you fled from your brother Esau.” \n" +
                "2 So Jacob said to his household and to all who were with him, “Put away ethe foreign gods that are among you and purify yourselves \n" +
                "and change your garments. \n" +
                "3 Then let us arise and go up to Bethel, so that I may make there an altar to the God gwho answers me in the day of my distress \n" +
                "and has been with me wherever I have gone.”\n" +
                " 4 So they gave to Jacob all the foreign gods that they had, and the rings that were in their ears. Jacob hid them under the terebinth tree \n" +
                "that was near Shechem.\n" +
                "5 And as they journeyed, a terror from God fell upon the cities that were around them, so that they did not pursue the sons of Jacob.\n" +
                "6 And Jacob came to Luz (that is, Bethel), which is in the land of Canaan, he and all the people who were with him, \n" +
                "7 and there he built an altar and called the place El-bethel,1 because there God had revealed himself to him when he fled from his brother. \n" +
                "8 And Deborah, Rebekah's nurse, died, and she was buried under an oak below Bethel. So he called its name Allon-bacuth.\n" +
                "9 God appeared to Jacob again, when he came from Paddan-aram, and blessed him. \n" +
                "10 And God said to him, “Your name is Jacob; no longer shall your name be called Jacob, but Israel shall be your name.” So he called his name Israel. \n" +
                "11 And God said to him, “I am God Almighty: be fruitful and multiply. qA nation and a company of nations shall come from you, \n" +
                "and kings shall come from your own body.5 \n" +
                "12 The land that I gave to Abraham and Isaac I will give to you, and I will give the land to your offspring after you.” \n" +
                "13 Then God went up from him in the place where he had spoken with him. \n" +
                "14 And Jacob set up a pillar in the place where he had spoken with him, a pillar of stone. He poured out a drink offering on it and poured oil on it. \n" +
                "15 So Jacob called the name of the place where God had spoken with him Bethel.\n";

        String chapterSecondTitle = "The Deaths of Rachel and Isaac";

        String secondContent = "16 Then they journeyed from Bethel. When they were still some distance from Ephrath, Rachel went into labor, and she had hard labor.\n" +
                "17 And when her labor was at its hardest, the midwife said to her, “Do not fear, for you have another son.” \n" +
                "18 And as her soul was departing (for she was dying), she called his name Ben-oni; but his father called him Benjamin.\n" +
                "19 So Rachel died, and she was buried on the way to Ephrath (that is, Bethlehem), \n" +
                "20 and Jacob set up a pillar over her tomb. It is the pillar of Rachel's tomb, which is there to this day.\n" +
                "21 Israel journeyed on and pitched his tent beyond the tower of Eder.\n" +
                "22 While Israel lived in that land, Reuben went and lay with Bilhah his father's concubine. And Israel heard of it.\n" +
                "Now the sons of Jacob were twelve. \n" +
                "23 The sons of Leah: Reuben (Jacob's firstborn), Simeon, Levi, Judah, Issachar, and Zebulun. \n" +
                "24 The sons of Rachel: Joseph and Benjamin. \n" +
                "25 The sons of Bilhah, Rachel's servant: Dan and Naphtali. \n" +
                "26 The sons of Zilpah, Leah's servant: Gad and Asher. These were the sons of Jacob who were born to him in Paddan-aram.\n" +
                "27 And Jacob came to his father Isaac at Mamre, or Kiriath-arba (that is, Hebron), where Abraham and Isaac had sojourned. \n" +
                "28 Now the days of Isaac were 180 years. \n" +
                "29 And Isaac breathed his last, and he died and was gathered to his people, old and full of days. And his sons Esau and Jacob buried him.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table35.add(lblFirstTitle).pad(10,50,0,0).left();
        table35.row();

        //content of the chapter
        table35.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table35.row();

        //title of the second content
        table35.add(lblSecondTitle).pad(10,50,0,0).left();
        table35.row();

        //content of the second title
        table35.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table35);

    }


    public void chapterThirtySixOFGenesis() {

        table36 = new Table();
        table36.setWidth(tableBG.getWidth());
        table36.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table36.setFillParent(true);
        table36.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
        
        String chapterFirstTitle = "Esau's Descendants";

        String firstContent = "1 These are the generations of Esau (that is, Edom). \n" +
                "2 Esau took his wives from the Canaanites: Adah the daughter of Elon the Hittite, Oholibamah the daughter of Anah the daughter of Zibeon the Hivite, \n" +
                "3 and Basemath, Ishmael's daughter, the sister of Nebaioth\n" +
                "4 And Adah bore to Esau, Eliphaz; Basemath bore Reuel;\n" +
                "5 and Oholibamah bore Jeush, Jalam, and Korah. These are the sons of Esau who were born to him in the land of Canaan.\n" +
                "6 Then Esau took his wives, his sons, his daughters, and all the members of his household, his livestock, all his beasts, \n" +
                "and all his property that he had acquired in the land of Canaan. He went into a land away from his brother Jacob.\n" +
                "7 For their possessions were too great for them to dwell together. The land of their sojournings could not support them because of their livestock.\n" +
                "8 So Esau settled in the hill country of Seir. (Esau is Edom.)\n" +
                "9 These are the generations of Esau the father of the Edomites in the hill country of Seir. \n" +
                "10 These are the names of Esau's sons: Eliphaz the son of Adah the wife of Esau, Reuel the son of Basemath the wife of Esau. \n" +
                "11 The sons of Eliphaz were Teman, Omar, Zepho, Gatam, and Kenaz. \n" +
                "12 (Timna was a concubine of Eliphaz, Esau's son; she borerAmalek to Eliphaz.) These are the sons of Adah, Esau's wife. \n" +
                "13 These are the sons of Reuel: Nahath, Zerah, Shammah, and Mizzah. These are the sons of Basemath, Esau's wife. \n" +
                "14 These are the sons of sOholibamah the daughter of Anah the daughter of Zibeon, Esau's wife: she bore to Esau Jeush, Jalam, and Korah.\n" +
                "15 These are tthe chiefs of the sons of Esau. uThe sons of Eliphaz the firstborn of Esau: the chiefs Teman, Omar, Zepho, Kenaz, \n" +
                "16 Korah, Gatam, and Amalek; these are the chiefs of Eliphaz in the land of Edom; these are the sons of Adah. \n" +
                "17 These are the sons of vReuel, Esau's son: the chiefs Nahath, Zerah, Shammah, and Mizzah; these are the chiefs of Reuel in the land of Edom;\n" +
                " these are the sons of Basemath, Esau's wife.\n" +
                "18 These are the sons of wOholibamah, Esau's wife: the chiefs Jeush, Jalam, and Korah; these are the chiefs born of Oholibamah the daughter of Anah, \n" +
                "Esau's wife. \n" +
                "19 These are the sons of Esau (xthat is, Edom), and these are their chiefs.\n" +
                "20 yThese are the sons of zSeir the Horite, the inhabitants of the land: Lotan, Shobal, Zibeon, Anah, \n" +
                "21 Dishon, Ezer, and Dishan; these are the chiefs of the Horites, the sons of Seir in the land of Edom. \n" +
                "22 The sons of Lotan were Hori and Hemam; and Lotan's sister was Timna. \n" +
                "23 These are the sons of Shobal: Alvan, Manahath, Ebal, Shepho, and Onam.\n" +
                "24 These are the sons of Zibeon: Aiah and Anah; he is the Anah who found the hot springs in the wilderness, \n" +
                "as he pastured the donkeys of Zibeon his father. \n" +
                "25 These are the children of Anah: Dishon andaOholibamah the daughter of Anah. \n" +
                "26 These are the sons of Dishon: Hemdan, Eshban, Ithran, and Cheran. \n" +
                "27 These are the sons of Ezer: Bilhan, Zaavan, and Akan. \n" +
                "28 These are the sons of Dishan: Uz and Aran.\n" +
                "29 These are the chiefs of the Horites: the bchiefs Lotan, Shobal, Zibeon, Anah, \n" +
                "30 Dishon, Ezer, and Dishan; these are the chiefs of the Horites, chief by chief in the land of Seir.\n" +
                "31 cThese are the kings who reigned in the land of Edom, before any king reigned over the Israelites. \n" +
                "32 Bela the son of Beor reigned in Edom, the name of his city being Dinhabah. \n" +
                "33 Bela died, and Jobab the son of Zerah of Bozrah reigned in his place. \n" +
                "34 Jobab died, and Husham of the land of the Temanites reigned in his place. \n" +
                "35 Husham died, and Hadad the son of Bedad, who defeated Midian in the country of Moab, reigned in his place, the name of his city being Avith. \n" +
                "36 Hadad died, and Samlah of Masrekah reigned in his place. \n" +
                "37 Samlah died, and Shaul ofdRehoboth on the Euphrates2 reigned in his place. \n" +
                "38 Shaul died, and Baal-hanan the son of Achbor reigned in his place. \n" +
                "39 Baal-hanan the son of Achbor died, and Hadar reigned in his place, the name of his city being Pau; his wife's name was Mehetabel, \n" +
                "the daughter of Matred, daughter of Mezahab.\n" +
                "40 These are the names of the chiefs of Esau, according to their clans and their dwelling places, by their names: the chiefs Timna, Alvah, Jetheth, \n" +
                "41 Oholibamah, Elah, ePinon, \n" +
                "42 Kenaz, Teman, Mibzar,\n" +
                "43 Magdiel, and Iram; these are the chiefs of Edom (that is, Esau, the father of fEdom), \n" +
                "according to their dwelling places in the land of their possession.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table36.add(lblFirstTitle).pad(10,50,0,0).left();
        table36.row();

        //content of the chapter
        table36.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table36);


    }

    public void chapterThirtySevenOFGenesis() {

        table37 = new Table();
        table37.setWidth(tableBG.getWidth());
        table37.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table37.setFillParent(true);
        table37.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Joseph's Dreams";

        String firstContent = "1 Jacob lived in the land of his father's sojournings, in the land of Canaan.\n" +
                "2 These are the generations of Jacob.\n" +
                "Joseph, being seventeen years old, was pasturing the flock with his brothers. He was a boy with the sons of Bilhah and Zilpah, \n" +
                "his father's wives. And Joseph brought a bad report of them to their father. \n" +
                "3 Now Israel loved Joseph more than any other of his sons, because he was the son of his old age. And he made him ja robe of many colors.\n" +
                "4 But when his brothers saw that their father loved him more than all his brothers, they hated him and could not speak peacefully to him.\n" +
                "5 Now Joseph had a dream, and when he told it to his brothers they hated him even more. \n" +
                "6 He said to them, “Hear this dream that I have dreamed: \n" +
                "7 Behold, we were binding sheaves in the field, and behold, my sheaf arose and stood upright. And behold, \n" +
                "your sheaves gathered around it and bowed down to my sheaf.”\n" +
                "8 His brothers said to him, “Are you indeed to reign over us? Or are you indeed to rule over us?” \n" +
                "So they hated him even more for his dreams and for his words.\n" +
                "9 Then he dreamed another dream and told it to his brothers and said, “Behold, I have dreamed another dream. Behold, \n" +
                "the sun, the moon, and eleven stars were bowing down to me.” \n" +
                "10 But when he told it to his father and to his brothers, his father rebuked him and said to him, “What is this dream that you have dreamed? \n" +
                "Shall I and your mother and your brothers indeed come to bow ourselves to the ground before you?” \n" +
                "11 And his brothers were jealous of him, but his father kept the saying in mind.\n";

        String chapterSecondTitle = "Joseph Sold by His Brothers";

        String secondContent = "12 Now his brothers went to pasture their father's flock near Shechem. \n" +
                "13 And Israel said to Joseph, “Are not your brothers pasturing the flock at Shechem? Come, I will send you to them.” \n" +
                "And he said to him, “Here I am.” \n" +
                "14 So he said to him, “Go now, see if it is well with your brothers and with the flock, and bring me word.” \n" +
                "So he sent him from the Valley of Hebron, and he came to Shechem. \n" +
                "15 And a man found him wandering in the fields. And the man asked him, “What are you seeking?” \n" +
                "16 “I am seeking my brothers,” he said. “Tell me, please, where they are pasturing the flock.” \n" +
                "17 And the man said, “They have gone away, for I heard them say, ‘Let us go to Dothan.’” So Joseph went after his brothers and \n" +
                "found them at Dothan.\n" +
                "18 They saw him from afar, and before he came near to them they conspired against him to kill him. \n" +
                "19 They said to one another, “Here comes this dreamer. \n" +
                "20 Come now, let us kill him and throw him into one of the pits.2 Then we will say that a fierce animal has devoured him,\n" +
                " and we will see what will become of his dreams.” \n" +
                "21 But when Reuben heard it, he rescued him out of their hands, saying, “Let us not take his life.” \n" +
                "22 And Reuben said to them, “Shed no blood; throw him into this pit here in the wilderness, but do not lay a hand on him”\n" +
                "—that he might rescue him out of their hand to restore him to his father. \n" +
                "23 So when Joseph came to his brothers, they stripped him of his robe, the robe of many colors that he wore. \n" +
                "24 And they took him and threw him into a pit. The pit was empty; there was no water in it.\n" +
                "25 Then they sat down to eat. And looking up they saw a caravan of Ishmaelites coming from Gilead, with their camels bearing gum, balm, \n" +
                "and myrrh, on their way to carry it down to Egypt. \n" +
                "26 Then Judah said to his brothers, “What profit is it cif we kill our brother and conceal his blood? \n" +
                "27 Come, let us sell him to the Ishmaelites, and let not our hand be upon him, for he is our brother, our own flesh.” \n" +
                "And his brothers listened to him. \n" +
                "28 Then Midianite traders passed by. And they drew Joseph up and lifted him out of the pit, and sold him to the Ishmaelites \n" +
                "for twenty shekels of silver. They took Joseph to Egypt.\n" +
                "29 When Reuben returned to the pit and saw that Joseph was not in the pit, he tore his clothes \n" +
                "30 and returned to his brothers and said, “The boy his gone, and I, where shall I go?” \n" +
                "31 Then they took Joseph's robe and slaughtered a goat and dipped the robe in the blood. \n" +
                "32 And they sent the robe of many colors and brought it to their father and said, “This we have found; please identify whether \n" +
                "it is your son's robe or not.” \n" +
                "33 And he identified it and said, “It is my son's robe. A fierce animal has devoured him. Joseph is without doubt torn to pieces.”\n" +
                "34 Then Jacob tore his garments and put sackcloth on his loins and mourned for his son many days. \n" +
                "35 All his sons and all his daughters rose up to comfort him, but he refused to be comforted and said, \n" +
                "“No, I shall go down to Sheol to my son, mourning.” Thus his father wept for him. \n" +
                "36 Meanwhile the Midianites had sold him in Egypt to Potiphar, an officer of Pharaoh, the captain of the guard.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table37.add(lblFirstTitle).pad(10,50,0,0).left();
        table37.row();

        //content of the chapter
        table37.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table37.row();

        //title of the second content
        table37.add(lblSecondTitle).pad(10,50,0,0).left();
        table37.row();

        //content of the second title
        table37.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table37);

    }


    public void chapterThirtyEightOFGenesis() {

        table38 = new Table();
        table38.setWidth(tableBG.getWidth());
        table38.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table38.setFillParent(true);
        table38.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Judah and Tamar";

        String firstContent = "1 It happened at that time that Judah went down from his brothers and turned aside to a certain Adullamite, whose name was Hirah. \n" +
                "2 There Judah saw the daughter of a certain Canaanite whose name was Shua. He took her and went in to her, \n" +
                "3 and she conceived and bore a son, and he called his name Er.\n" +
                "4 She conceived again and bore a son, and she called his name Onan.\n" +
                "5 Yet again she bore a son, and she called his name Shelah. Judah was in Chezib when she bore him.\n" +
                "6 And Judah took a wife for Er his firstborn, and her name was Tamar. \n" +
                "7 But Er, Judah's firstborn, was wicked in the sight of the LORD, and the LORD put him to death.\n" +
                "8 Then Judah said to Onan, “Go in to your brother's wife and perform the duty of a brother-in-law to her, \n" +
                "and raise up offspring for your brother.” \n" +
                "9 But Onan knew that the offspring would not be his. So whenever he went in to his brother's wife he would waste the semen on the ground, \n" +
                "so as not to give offspring to his brother. \n" +
                "10 And what he did was wicked in the sight of the LORD, and he put him to death also. \n" +
                "11 Then Judah said to Tamar his daughter-in-law, “Remain a widow in your father's house, till Shelah my son grows up”\n" +
                "—for he feared that he would die, like his brothers. So Tamar went and remained in her father's house.\n" +
                "12 In the course of time the wife of Judah, Shua's daughter, died. When Judah was comforted, he went up to Timnah to his sheepshearers, \n" +
                "he and his friend Hirah the Adullamite. \n" +
                "13 And when Tamar was told, “Your father-in-law is going up to Timnah to shear his sheep,” \n" +
                "14 she took off her widow's garments and covered herself with a veil, wrapping herself up, and sat at the entrance to Enaim, \n" +
                "which is on the road to Timnah. For she saw that Shelah was grown up, and she had not been given to him in marriage. \n" +
                "15 When Judah saw her, he thought she was a prostitute, for she had covered her face. \n" +
                "16 He turned to her at the roadside and said, “Come, let me come in to you,” for he did not know that she was his daughter-in-law. \n" +
                "She said, “What will you give me, that you may come in to me?” \n" +
                "17 He answered, “I will send you a young goat from the flock.” And she said, “If you give me a pledge, until you send it—” \n" +
                "18 He said, “What pledge shall I give you?” She replied, “Your signet and your cord and your staff that is in your hand.” \n" +
                "So he gave them to her and went in to her, and she conceived by him. \n" +
                "19 Then she arose and went away, and taking off her veil she put on the garments of her widowhood.\n" +
                "20 When Judah sent the young goat by his friend the Adullamite to take back the pledge from the woman's hand, he did not find her. \n" +
                "21 And he asked the men of the place, “Where is the cult prostitute2 who was at Enaim at the roadside?” \n" +
                "And they said, “No cult prostitute has been here.” \n" +
                "22 So he returned to Judah and said, “I have not found her. Also, the men of the place said, ‘No cult prostitute has been here.’”\n" +
                "23 And Judah replied, “Let her keep the things as her own, or we shall be laughed at. \n" +
                "You see, I sent this young goat, and you did not find her.”\n" +
                "24 About three months later Judah was told, “Tamar your daughter-in-law has been immoral.3 Moreover, she is pregnant by immorality.”\n" +
                "4And Judah said, “Bring her out, and let her be burned.” \n" +
                "25 As she was being brought out, she sent word to her father-in-law, “By the man to whom these belong, I am pregnant.” \n" +
                "And she said, “Please identify whose these are, the signet and the cord and the staff.” \n" +
                "26 Then Judah identified them and said, “She is more righteous than I, since I did not give her to my son Shelah.” \n" +
                "And he did not know her again.\n" +
                "27 When the time of her labor came, there were twins in her womb.\n" +
                "28 And when she was in labor, one put out a hand, and the midwife took and tied a scarlet thread on his hand, saying, \n" +
                "“This one came out first.”\n" +
                "29 But as he drew back his hand, behold, his brother came out. And she said, “What a breach you have made for yourself!” \n" +
                "Therefore his name was called kPerez.\n" +
                "30 Afterward his brother came out with the scarlet thread on his hand, and his name was called Zerah.\n";

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table38.add(lblFirstTitle).pad(10,50,0,0).left();
        table38.row();

        //content of the chapter
        table38.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table38);


    }

    public void chapterThirtyNineOFGenesis() {

        table39 = new Table();
        table39.setWidth(tableBG.getWidth());
        table39.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table39.setFillParent(true);
        table39.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Joseph and Potiphar's Wife";

        String firstContent = "1 Now Joseph had been brought down to Egypt, and Potiphar, an officer of Pharaoh, the captain of the guard, \n" +
                "an Egyptian, had bought him from the Ishmaelites who had brought him down there.\n" +
                "2 The LORD was with Joseph, and he became a successful man, and he was in the house of his Egyptian master. \n" +
                "3 His master saw that the LORD was with him and that the LORD caused all that he did to succeed in his hands. \n" +
                "4 So Joseph found favor in his sight and attended him, and he made him overseer of his house rand put him in charge of all that he had. \n" +
                "5 From the time that he made him overseer in his house and over all that he had, the LORD blessed the Egyptian's house for Joseph's sake; \n" +
                "the blessing of the LORD was on all that he had, in house and field. \n" +
                "6 So he left all that he had in Joseph's charge, and because of him he had no concern about anything but the food he ate.\n" +
                "Now Joseph was handsome in form and appearance. \n" +
                "7 And after a time his master's wife cast her eyes on Joseph and said, “Lie with me.”\n" +
                "8 But he refused and said to his master's wife, “Behold, because of me my master has no concern about anything in the house, \n" +
                "and he has put everything that he has in my charge. \n" +
                "9 He is not greater in this house than I am, nor has he kept back anything from me except you, because you are his wife. \n" +
                "How then can I do this great wickedness and sin against God?” \n" +
                "10 And as she spoke to Joseph day after day, he would not listen to her, to lie beside her or to be with her.\n" +
                "11 But one day, when he went into the house to do his work and none of the men of the house was there in the house, \n" +
                "12 she caught him by his garment, saying, “Lie with me.” But he left his garment in her hand and fled and got out of the house. \n" +
                "13 And as soon as she saw that he had left his garment in her hand and had fled out of the house, \n" +
                "14 she called to the men of her household and said to them, “See, he has brought among us a Hebrew to laugh at us. \n" +
                "He came in to me to lie with me, and I cried out with a loud voice. \n" +
                "15 And as soon as he heard that I lifted up my voice and cried out, he left his garment beside me and fled and got out of the house.” \n" +
                "16 Then she laid up his garment by her until his master came home, \n" +
                "17 and she told him the same story, saying, “The Hebrew servant, whom you have brought among us, came in to me to laugh at me.\n" +
                "18 But as soon as I lifted up my voice and cried, he left his garment beside me and fled out of the house.”\n" +
                "19 As soon as his master heard the words that his wife spoke to him, “This is the way your servant treated me,” his anger was kindled. \n" +
                "20 And Joseph's master took him and put him into the prison, the place where the king's prisoners were confined, and he was there in prison.\n" +
                "21 But the LORD was with Joseph and showed him steadfast love band gave him favor in the sight of the keeper of the prison. \n" +
                "22 And the keeper of the prison put Joseph in charge of all the prisoners who were in the prison. Whatever was done there, \n" +
                "he was the one who did it. \n" +
                "23 The keeper of the prison paid no attention to anything that was in Joseph's charge, because the LORD was with him. \n" +
                "And whatever he did, the LORD made it succeed.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table39.add(lblFirstTitle).pad(10,50,0,0).left();
        table39.row();

        //content of the chapter
        table39.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table39);

    }


    public void chapterFortyOFGenesis() {

        table40 = new Table();
        table40.setWidth(tableBG.getWidth());
        table40.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table40.setFillParent(true);
        table40.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Joseph Interprets Two Prisoners' Dreams";

        String firstContent = "1 Sometime after this, the cupbearer of the king of Egypt and his baker committed an offense against their lord the king of Egypt.\n" +
                "2 And Pharaoh was angry with his two officers, the chief cupbearer and the chief baker, \n" +
                "3 and he put them in custody in the house of the captain of the guard, in the prison where Joseph was confined.\n" +
                "4 The captain of the guard appointed Joseph to be with them, and he attended them. They continued for some time in custody.\n" +
                "5 And one night they both dreamed—the cupbearer and the baker of the king of Egypt, who were confined in the prison—each his own dream, a\n" +
                "nd each dream with its own interpretation.\n" +
                "6 When Joseph came to them in the morning, he saw that they were troubled. \n" +
                "7 So he asked Pharaoh's officers who were with him in custody in his master's house, “Why are your faces downcast today?”\n" +
                "8 They said to him, “We have had dreams, and there is no one to interpret them.” And Joseph said to them, “Do not interpretations belong to God? \n" +
                "Please tell them to me.”\n" +
                "9 So the chief cupbearer told his dream to Joseph and said to him, “In my dream there was a vine before me, \n" +
                "10 and on the vine there were three branches. As soon as it budded, its blossoms shot forth, and the clusters ripened into grapes. \n" +
                "11 Pharaoh's cup was in my hand, and I took the grapes and pressed them into Pharaoh's cup and placed the cup in Pharaoh's hand.” \n" +
                "12 Then Joseph said to him, “This is its interpretation: the three branches are three days. \n" +
                "13 In three days Pharaoh will lift up your head and restore you to your office, and you shall place Pharaoh's cup in his hand as formerly, \n" +
                "when you were his cupbearer. \n" +
                "14 Only remember me, when it is well with you, and please do me the kindness to mention me to Pharaoh, and so get me out of this house. \n" +
                "15 For I was indeed stolen out of the land of the Hebrews, and here also I have done nothing that they should put me into the pit.”\n" +
                "16 When the chief baker saw that the interpretation was favorable, he said to Joseph, \n" +
                "“I also had a dream: there were three cake baskets on my head, \n" +
                "17 and in the uppermost basket there were all sorts of baked food for Pharaoh, but the birds were eating it out of the basket on my head.”\n" +
                "18 And Joseph answered and said, “This is its interpretation: the three baskets are three days. \n" +
                "19 In three days Pharaoh will lift up your head—from you!—and hang you on a tree. And the birds will eat the flesh from you.”\n" +
                "20 On the third day, which was Pharaoh's birthday, he made a feast for all his servants and lifted up the head of the chief cupbearer \n" +
                "and the head of the chief baker among his servants. \n" +
                "21 He restored the chief cupbearer to his position, and he placed the cup in Pharaoh's hand.\n" +
                "22 But he hanged the chief baker, as Joseph had interpreted to them.\n" +
                "23 Yet the chief cupbearer did not remember Joseph, but forgot him.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table40.add(lblFirstTitle).pad(10,50,0,0).left();
        table40.row();

        //content of the chapter
        table40.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table40);

    }


    public void chapterFortyOneOFGenesis() {

        table41 = new Table();
        table41.setWidth(tableBG.getWidth());
        table41.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table41.setFillParent(true);
        table41.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Joseph Interprets Pharaoh's Dreams";

        String firstContent = "1  After two whole years, Pharaoh dreamed that he was standing by the Nile, \n" +
                "2 and behold, there came up out of the Nile seven cows, attractive and plump, and they fed in the reed grass. \n" +
                "3 And behold, seven other cows, ugly and thin, came up out of the Nile after them, and stood by the other cows on the bank of the Nile. \n" +
                "4 And the ugly, thin cows ate up the seven attractive, plump cows. And Pharaoh awoke. \n" +
                "5 And he fell asleep and dreamed a second time. And behold, seven ears of grain, plump and good, were growing on one stalk. \n" +
                "6 And behold, after them sprouted seven ears, thin and blighted by the east wind. \n" +
                "7 And the thin ears swallowed up the seven plump, full ears. And Pharaoh awoke, and behold, it was a dream.\n" +
                "8 So in the morning his spirit was troubled, and he sent and called for all the magicians of Egypt and all its wise men. \n" +
                "Pharaoh told them his dreams, but there was none who could interpret them to Pharaoh.\n" +
                "9 Then the chief cupbearer said to Pharaoh, “I remember my offenses today. \n" +
                "10 When Pharaoh was angry with his servants and put me and the chief baker in custody in the house of the captain of the guard, \n" +
                "11 we dreamed on the same night, he and I, each having a dream with its own interpretation. \n" +
                "12 A young Hebrew was there with us, a servant of the captain of the guard. When we told him, he interpreted our dreams to us, \n" +
                "giving an interpretation to each man according to his dream.\n" +
                "13 And as he interpreted to us, so it came about. I was restored to my office, and the baker was hanged.”\n" +
                "14 Then Pharaoh sent and called Joseph, and they quickly brought him gout of the pit. And when he had shaved himself and changed his clothes, \n" +
                "he came in before Pharaoh. \n" +
                "15 And Pharaoh said to Joseph, “I have had a dream, and there is no one who can interpret it. I have heard it said of you \n" +
                "that when you hear a dream you can interpret it.”16 Joseph answered Pharaoh, “It is not in me; God will give Pharaoh a favorable answer.” \n" +
                "17 Then Pharaoh said to Joseph, “Behold, in my dream I was standing on the banks of the Nile. \n" +
                "18 Seven cows, plump and attractive, came up out of the Nile and fed in the reed grass. \n" +
                "19 Seven other cows came up after them, poor and very ugly and thin, such as I had never seen in all the land of Egypt. \n" +
                "20 And the thin, ugly cows ate up the first seven plump cows, 21 but when they had eaten them no one would have known that they had eaten them, \n" +
                "for they were still as ugly as at the beginning. Then I awoke. \n" +
                "22 I also saw in my dream seven ears growing on one stalk, full and good. \n" +
                "23 Seven ears, withered, thin, and blighted by the east wind, sprouted after them, \n" +
                "24 and the thin ears swallowed up the seven good ears. And I told it to the magicians, but there was no one who could explain it to me.”\n" +
                "25 Then Joseph said to Pharaoh, “The dreams of Pharaoh are one; God has revealed to Pharaoh what he is about to do. \n" +
                "26 The seven good cows are seven years, and the seven good ears are seven years; the dreams are one. \n" +
                "27 The seven lean and ugly cows that came up after them are seven years, and the seven empty ears blighted by the east wind \n" +
                "are also seven years of famine. \n" +
                "28 It is as I told Pharaoh; God has shown to Pharaoh what he is about to do. \n" +
                "29 There will come seven years of great plenty throughout all the land of Egypt, \n" +
                "30 but after them there will arise seven years of famine, and all the plenty will be forgotten in the land of Egypt. \n" +
                "The famine will consume the land, \n" +
                "31 and the plenty will be unknown in the land by reason of the famine that will follow, for it will be very severe. \n" +
                "32 And the doubling of Pharaoh's dream means that the thing is fixed by God, and God will shortly bring it about. \n" +
                "33 Now therefore let Pharaoh select a discerning and wise man, and set him over the land of Egypt. \n" +
                "34 Let Pharaoh proceed to appoint overseers over the land and take one-fifth of the produce of the land of Egypt during the seven plentiful years. \n" +
                "35 And let them gather all the food of these good years that are coming and store up grain under the authority of Pharaoh for food in the cities, \n" +
                "and let them keep it.\n" +
                "36 That food shall be a reserve for the land against the seven years of famine that are to occur in the land of Egypt, \n" +
                "so that the land may not perish through the famine.”\n" +
                "Joseph Rises to Power\n" +
                "37 This proposal pleased Pharaoh and all his servants. \n" +
                "38 And Pharaoh said to his servants, “Can we find a man like this, in whom is the Spirit of God?”\n" +
                "39 Then Pharaoh said to Joseph, “Since God has shown you all this, there is none so discerning and wise as you are.\n" +
                "40 You shall be over my house, and all my people shall order themselves as you command.Only as regards the throne will I be greater than you.” \n" +
                "41 And Pharaoh said to Joseph, “See, I have set you over all the land of Egypt.” \n" +
                "42 Then Pharaoh xtook his signet ring from his hand and put it on Joseph's hand, and clothed him in garments of fine linen \n" +
                "and put a gold chain about his neck. \n" +
                "43 And he made him ride in his second chariot. aAnd they called out before him, “Bow the knee!” Thus he set him bover all the land of Egypt.\n" +
                "44 Moreover, Pharaoh said to Joseph, “I am Pharaoh, and cwithout your consent no one shall lift up hand or foot in all the land of Egypt.” \n" +
                "45 And Pharaoh called Joseph's name Zaphenath-paneah. And he gave him in marriage Asenath, the daughter of Potiphera priest of On. \n" +
                "So Joseph went out over the land of Egypt.\n" +
                "46 Joseph was thirty years old when he dentered the service of Pharaoh king of Egypt. And Joseph went out from the presence of Pharaoh \n" +
                "and went through all the land of Egypt. \n" +
                "47 During the seven plentiful years the earth produced abundantly, \n" +
                "48 and he gathered up all the food of these seven years, which occurred in the land of Egypt, and put the food in the cities. \n" +
                "He put in every city the food from the fields around it. \n" +
                "49 And Joseph stored up grain in great abundance, like the sand of the sea, until he ceased to measure it, for it could not be measured.\n" +
                "50 Before the year of famine came, two sons were born to Joseph. Asenath, the daughter of Potiphera priest of On, bore them to him.\n" +
                "51 Joseph called the name of the firstborn Manasseh. “For,” he said, “God has made me forget all my hardship and all my father's house.”\n" +
                "52 The name of the second he called Ephraim, “For God has made me fruitful in the land of my affliction.”\n" +
                "53 The seven years of plenty that occurred in the land of Egypt came to an end, \n" +
                "54 and the seven years of famine began to come, as Joseph had said. There was famine in all lands, but in all the land of Egypt there was bread. \n" +
                "55 When all the land of Egypt was famished, the people cried to Pharaoh for bread. Pharaoh said to all the Egyptians, \n" +
                "“Go to Joseph. What he says to you, do.”\n" +
                "56 So when the famine had spread over all the land, Joseph opened all the storehouses and sold to the Egyptians, \n" +
                "for the famine was severe in the land of Egypt. \n" +
                "57 Moreover, all the earth came to Egypt to Joseph to buy grain, because the famine was severe over all the earth.\n";

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table41.add(lblFirstTitle).pad(10,50,0,0).left();
        table41.row();

        //content of the chapter
        table41.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table41);


    }

    public void chapterFortyTwoOFGenesis() {

        table42 = new Table();
        table42.setWidth(tableBG.getWidth());
        table42.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table42.setFillParent(true);
        table42.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Joseph's Brothers Go to Egypt";

        String firstContent = "1 When Jacob learned that there was grain for sale in Egypt, he said to his sons, “Why do you look at one another?” \n" +
                "2 And he said, “Behold, I have heard that there is grain for sale in Egypt. Go down and buy grain for us there, that we may live and not die.” \n" +
                "3 So ten of Joseph's brothers went down to buy grain in Egypt. \n" +
                "4 But Jacob did not send Benjamin, Joseph's brother, with his brothers, for he feared that harm might happen to him. \n" +
                "5 Thus the sons of Israel came to buy among the others who came, for the famine was in the land of Canaan.\n" +
                "6 Now Joseph was governor over the land. He was the one who sold to all the people of the land. And Joseph's brothers came \n" +
                "and bowed themselves before him with their faces to the ground. \n" +
                "7 Joseph saw his brothers and recognized them, but he treated them like strangers and spoke roughly to them. “Where do you come from?” he said. \n" +
                "They said, “From the land of Canaan, to buy food.” \n" +
                "8 And Joseph recognized his brothers, but they did not recognize him. \n" +
                "9 And Joseph remembered the dreams that he had dreamed of them. tAnd he said to them, “\n" +
                "You are spies; you have come to see the nakedness of the land.” \n" +
                "10 They said to him, “No, my lord, your servants have come to buy food. \n" +
                "11 We are all sons of one man. We are honest men. Your servants have never been spies.”\n" +
                "12 He said to them, “No, it is the nakedness of the land that you have come to see.” \n" +
                "13 And they said, “We, your servants, are twelve brothers, the sons of one man in the land of Canaan, and behold, \n" +
                "the youngest is this day with our father, and one uis no more.” \n" +
                "14 But Joseph said to them, “It is as I said to you. You are spies. \n" +
                "15 By this you shall be tested: by the life of Pharaoh, you shall not go from this place unless your youngest brother comes here. \n" +
                "16 Send one of you, and let him bring your brother, while you remain confined, that your words may be tested, whether there is truth in you. \n" +
                "Or else, by the life of Pharaoh, surely you are spies.” \n" +
                "17 And he put them all together in custody for three days.\n" +
                "18 On the third day Joseph said to them, “Do this and you will live, for I fear God: \n" +
                "19 if you are honest men, let one of your brothers remain confined where you are in custody, \n" +
                "and let the rest go and carry grain for the famine of your households, \n" +
                "20 and bring your youngest brother to me. So your words will be verified, and you shall not die.” And they did so. \n" +
                "21 Then they said to one another, “In truth we are guilty concerning our brother, in that we saw the distress of his soul, \n" +
                "when he begged us and we did not listen. That is why this distress has come upon us.” \n" +
                "22 And Reuben answered them, “Did I not tell you not to sin against the boy? But you did not listen. \n" +
                "So now there comes a reckoning for his blood.” \n" +
                "23 They did not know that Joseph understood them, for there was an interpreter between them. \n" +
                "24 Then he turned away from them and wept. And he returned to them and spoke to them. A\n" +
                "nd he took Simeon from them and bound him before their eyes.\n" +
                "25 And Joseph gave orders to fill their bags with grain, and to replace every man's money in his sack, \n" +
                "and to give them provisions for the journey. This was done for them.\n" +
                "26 Then they loaded their donkeys with their grain and departed.\n" +
                "27 And as one of them opened his sack to give his donkey fodder at the lodging place, he saw his money in the mouth of his sack. \n" +
                "28 He said to his brothers, “My money has been put back; here it is in the mouth of my sack!” At this their hearts failed them, a\n" +
                "nd they turned trembling to one another, saying, “What is this that God has done to us?”\n" +
                "29 When they came to Jacob their father in the land of Canaan, they told him all that had happened to them, saying, \n" +
                "30 “The man, the lord of the land, spoke roughly to us and took us to be spies of the land. \n" +
                "31 But we said to him, ‘We are honest men; we have never been spies. \n" +
                "32 We are twelve brothers, sons of our father. One is no more, and the youngest is this day with our father in the land of Canaan.’ \n" +
                "33 Then the man, the lord of the land, said to us, ‘By this I shall know that you are honest men: leave one of your brothers with me, \n" +
                "and take grain for the famine of your households, and go your way. \n" +
                "34 Bring your youngest brother to me. Then I shall know that you are not spies but honest men, and I will deliver your brother to you, \n" +
                "and you shall trade in the land.’”\n" +
                "35 As they emptied their sacks, behold, every man's bundle of money was in his sack. And when they and their father saw their bundles of money, \n" +
                "they were afraid. \n" +
                "36 And Jacob their father said to them, “You have bereaved me of my children: Joseph is no more, and Simeon is no more, \n" +
                "and now you would take Benjamin. All this has come against me.”\n" +
                "37 Then Reuben said to his father, “Kill my two sons if I do not bring him back to you. Put him in my hands, and I will bring him back to you.”\n" +
                "38 But he said, “My son shall not go down with you, for his brother is dead, and he is the only one left. \n" +
                "If harm should happen to him on the journey that you are to make, you would bring down my gray hairs with sorrow to Sheol.”\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table42.add(lblFirstTitle).pad(10,50,0,0).left();
        table42.row();

        //content of the chapter
        table42.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table42);


    }

    public void chapterFortyThreeOFGenesis() {

        table43 = new Table();
        table43.setWidth(tableBG.getWidth());
        table43.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table43.setFillParent(true);
        table43.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Joseph's Brothers Return to Egypt";

        String firstContent = "1  Now the famine was severe in the land. \n" +
                "2 And when they had eaten the grain that they had brought from Egypt, their father said to them, “Go again, buy us a little food.” \n" +
                "3 But Judah said to him, “The man solemnly warned us, saying, ‘You shall not see my face unless your brother is with you.’ \n" +
                "4 If you will send our brother with us, we will go down and buy you food. \n" +
                "5 But if you will not send him, we will not go down, for the man said to us, ‘You shall not see my face, unless your brother is with you.’” \n" +
                "6 Israel said, “Why did you treat me so badly as to tell the man that you had another brother?” \n" +
                "7 They replied, “The man questioned us carefully about ourselves and our kindred, \n" +
                "saying, ‘Is your father still alive? Do you have another brother?’\n" +
                " What we told him was in answer to these questions. Could we in any way know that he would say, ‘Bring your brother down’?” \n" +
                "8 And Judah said to Israel his father, “Send the boy with me, and we will arise and go, that we may live and not die, \n" +
                "both we and you and also our little ones.\n" +
                " 9 I will be a pledge of his safety. From my hand you shall require him. If I do not bring him back to you and set him before you, \n" +
                "then let me bear the blame forever.\n" +
                "10 If we had not delayed, we would now have returned twice.”\n" +
                "11 Then their father Israel said to them, “If it must be so, then do this: take some of the choice fruits of the land in your bags,\n" +
                " and carry a present down to the man, a little balm and a little honey, gum, myrrh, pistachio nuts, and almonds. \n" +
                "12 Take double the money with you. Carry back with you the money vthat was returned in the mouth of your sacks. Perhaps it was an oversight. \n" +
                "13 Take also your brother, and arise, go again to the man. \n" +
                "14 May God Almighty grant you mercy before the man, and may he send back your other brother and Benjamin. \n" +
                "And as for me, if I am bereaved of my children, I am bereaved.”\n" +
                "15 So the men took this present, and they took double the money with them, and Benjamin. They arose and went down to Egypt and stood before Joseph.\n" +
                "16 When Joseph saw Benjamin with them, he said to the steward of his house, “Bring the men into the house, \n" +
                "and slaughter an animal and make ready, for the men are to dine with me at noon.” \n" +
                "17 The man did as Joseph told him and brought the men to Joseph's house. \n" +
                "18 And the men were afraid because they were brought to Joseph's house, and they said, \n" +
                "“It is because of the money, which was replaced in our sacks the first time, that we are brought in, \n" +
                "so that he may assault us and fall upon us to make us servants and seize our donkeys.” \n" +
                "19 So they went up to the steward of Joseph's house and spoke with him at the door of the house,\n" +
                "20 and said, “Oh, my lord, we came down the first time to buy food. \n" +
                "21 And when we came to the lodging place we opened our sacks, and there was each man's money in the mouth of his sack, our money in full weight. \n" +
                "So we have brought it again with us,\n" +
                "22 and we have brought other money down with us to buy food. We do not know who put our money in our sacks.” \n" +
                "23 He replied, “Peace to you, do not be afraid. Your God and the God of your father has put treasure in your sacks for you. \n" +
                "I received your money.” Then he brought Simeon out to them. \n" +
                "24 And when the man had brought the men into Joseph's house and given them water, and they had washed their feet, \n" +
                "and when he had given their donkeys fodder, \n" +
                "25 they prepared the present for Joseph's coming at noon, for they heard that they should eat bread there.\n" +
                "26 When Joseph came home, they brought into the house to him the present that they had with them and bowed down to him to the ground.\n" +
                "27 And he inquired about their welfare and said, “Is your father well, the old man gof whom you spoke? Is he still alive?” \n" +
                "28 They said, “Your servant our father is well; he is still alive.” And they bowed their heads and prostrated themselves. \n" +
                "29 And he lifted up his eyes and saw his brother Benjamin, his mother's son, and said, “Is this your youngest brother, \n" +
                "of whom you spoke to me? God be gracious to you, my son!”\n" +
                "30 Then Joseph hurried out, for his compassion grew warm for his brother, and he sought a place to weep. And he entered his chamber and wept there. \n" +
                "31 Then he washed his face and came out. And controlling himself he said, “Serve the food.”\n" +
                "32 They served him by himself, and them by themselves, and the Egyptians who ate with him by themselves, \n" +
                "because the Egyptians could not eat with the Hebrews, for that is man abomination to the Egyptians. \n" +
                "33 And they sat before him, the firstborn according to his birthright and the youngest according to his youth. \n" +
                "And the men looked at one another in amazement. \n" +
                "34 Portions were taken to them from Joseph's table, but Benjamin's portion was five times as much as any of theirs.\n" +
                " And they drank and were merry with him.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table43.add(lblFirstTitle).pad(10,50,0,0).left();
        table43.row();

        //content of the chapter
        table43.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table43);


    }

    public void chapterFortyFourOFGenesis() {

        table44 = new Table();
        table44.setWidth(tableBG.getWidth());
        table44.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table44.setFillParent(true);
        table44.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Joseph Tests His Brothers";

        String firstContent = "1\tThen he commanded the steward of his house, “Fill the men's sacks with food, as much as they can carry, \n" +
                "and put each man's money in the mouth of his sack, \n" +
                "2 and put my cup, the silver cup, in the mouth of the sack of the youngest, with his money for the grain.” And he did as Joseph told him.\n" +
                "3 As soon as the morning was light, the men were sent away with their donkeys. \n" +
                "4 They had gone only a short distance from the city. Now Joseph said to his steward, \n" +
                "“Up, follow after the men, and when you overtake them, say to them, ‘Why have you repaid evil for good?1 \n" +
                "5 Is it not from this that my lord drinks, and sby this that he practices divination? You have done evil in doing this.’”\n" +
                "6 When he overtook them, he spoke to them these words. \n" +
                "7 They said to him, “Why does my lord speak such words as these? Far be it from your servants to do such a thing! \n" +
                "8 Behold, the money that we found in the mouths of our sacks we brought back to you from the land of Canaan. \n" +
                "How then could we steal silver or gold from your lord's house?\n" +
                "9 Whichever of your servants is found with it shall die, and we also will be my lord's servants.” \n" +
                "10 He said, “Let it be as you say: he who is found with it shall be my servant, and the rest of you shall be innocent.”\n" +
                "11 Then each man quickly lowered his sack to the ground, and each man opened his sack. \n" +
                "12 And he searched, beginning with the eldest and ending with the youngest. And the cup was found in Benjamin's sack.\n" +
                "13 Then they tore their clothes, and every man loaded his donkey, and they returned to the city.\n" +
                "14 When Judah and his brothers came to Joseph's house, he was still there. They fell before him to the ground. \n" +
                "15 Joseph said to them, “What deed is this that you have done? Do you not know that a man like me can indeed practice divination?” \n" +
                "16 And Judah said, “What shall we say to my lord? What shall we speak? Or how can we clear ourselves? \n" +
                "God has found out the guilt of your servants; behold, we are my lord's servants, both we and he also in whose hand the cup has been found.”\n" +
                "17 But he said, “Far be it from me that I should do so! Only the man in whose hand the cup was found shall be my servant. \n" +
                "But as for you, go up in peace to your father.”\n" +
                "18 Then Judah went up to him and said, “Oh, my lord, please let your servant speak a word in my lord's ears, \n" +
                "and let not your anger burn against your servant, for you are like Pharaoh himself. \n" +
                "19 My lord asked his servants, saying, ‘Have you a father, or a brother?’ \n" +
                "20 And we said to my lord, ‘We have a father, an old man, and a young brother,the child of his old age. His brother is dead, \n" +
                "and he alone is left of his mother's children, and his father loves him.’ \n" +
                "21 Then you said to your servants,  ‘Bring him down to me, that I may set my eyes on him.’ \n" +
                "22 We said to my lord, ‘The boy cannot leave his father, for if he should leave his father, his father would die.’ \n" +
                "23 Then you said to your servants, ‘Unless your youngest brother comes down with you, you shall not see my face again.’\n" +
                "24 “When we went back to your servant my father, we told him the words of my lord. \n" +
                "25 And when jour father said, ‘Go again, buy us a little food,’ \n" +
                "26 we said, ‘We cannot go down. If our youngest brother goes with us, then we will go down. \n" +
                "For we cannot see the man's face unless our youngest brother is with us.’\n" +
                "27 Then your servant my father said to us, ‘You know that my wife bore me ktwo sons. \n" +
                "28 One left me, and I said, “Surely he has been torn to pieces,” and I have never seen him since.\n" +
                "29 If you take this one also from me, and harm happens to him, you will bring down my gray hairs in evil to Sheol.’\n" +
                "30 “Now therefore, as soon as I come to your servant my father, and the boy is not with us, then, as his life is bound up in the boy's life, \n" +
                "31 as soon as he sees that the boy is not with us, he will die, and your servants will bring down the gray hairs of your servant \n" +
                "our father with sorrow to Sheol. \n" +
                "32 For your servant became a pledge of safety for the boy to my father, saying, ‘If I do not bring him back to you, \n" +
                "then I shall bear the blame before my father all my life.’ \n" +
                "33 Now therefore, please let your servant remain instead of the boy as a servant to my lord, and let the boy go back with his brothers.\n" +
                "34 For how can I go back to my father if the boy is not with me? I fear to see the evil that would find my father.”\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table44.add(lblFirstTitle).pad(10,50,0,0).left();
        table44.row();

        //content of the chapter
        table44.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table44);

    }

    public void chapterFortyFiveOFGenesis() {

        table45 = new Table();
        table45.setWidth(tableBG.getWidth());
        table45.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table45.setFillParent(true);
        table45.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Joseph Provides for His Brothers and Family";

        String firstContent = "1 Then Joseph could not control himself before all those who stood by him. He cried, \n" +
                "“Make everyone go out from me.” So no one stayed with him when Joseph made himself known to his brothers.\n" +
                "2 And he wept aloud, so that the Egyptians heard it, and the household of Pharaoh heard it.\n" +
                "3 And Joseph said to his brothers, “I am Joseph! Is my father still alive?” But his brothers could not answer him, \n" +
                "for they were dismayed at his presence.\n" +
                "4 So Joseph said to his brothers, “Come near to me, please.” And they came near. And he said, “I am your brother, Joseph, whom you sold into Egypt. \n" +
                "5 And now do not be distressed or angry with yourselves because you sold me here, for God sent me before you to preserve life.\n" +
                "6 For the famine has been in the land these two years, and there are yet five years in which there will be neither plowing nor harvest. \n" +
                "7 And God sent me before you to preserve for you a remnant on earth, and to keep alive for you many survivors. \n" +
                "8 So it was not you who sent me here, but God. He has made me a father to Pharaoh, and lord of all his house and ruler over all the land of Egypt. \n" +
                "9 Hurry and go up to my father and say to him, ‘Thus says your son Joseph, God has made me lord of all Egypt. Come down to me; do not tarry. \n" +
                "10 You shall dwell in the land of Goshen, and you shall be near me, you and your children and your children's children, and your flocks, your herds,\n" +
                " and all that you have.\n" +
                "11 There I will provide for you, for there are yet five years of famine to come, so that you and your household, \n" +
                "and all that you have, do not come to poverty.’ \n" +
                "12 And now your eyes see, and the eyes of my brother Benjamin see, that it is my mouth that speaks to you. \n" +
                "13 You must tell my father of all my honor in Egypt, and of all that you have seen. Hurry and bring my father down here.” \n" +
                "14 Then he fell upon his brother Benjamin's neck and wept, and Benjamin wept upon his neck. \n" +
                "15 And he kissed all his brothers and wept upon them. After that his brothers talked with him.\n" +
                "16 When the report was heard in Pharaoh's house, “Joseph's brothers have come,” it pleased Pharaoh and his servants. \n" +
                "17 And Pharaoh said to Joseph, “Say to your brothers, ‘Do this: load your beasts and go back to the land of Canaan, \n" +
                "18 and take your father and your households, and come to me, and I will give you the best of the land of Egypt, and you shall eat the fat of the land.’ \n" +
                "19 And you, Joseph, are commanded to say, ‘Do this: take wagons from the land of Egypt for your little ones and for your wives, \n" +
                "and bring your father, and come.\n" +
                "20 Have no concern for1your goods, for the best of all the land of Egypt is yours.’”\n" +
                "21 The sons of Israel did so: and Joseph gave them wagons, according to the command of Pharaoh, and gave them provisions for the journey. \n" +
                "22 To each and all of them he gave ca change of clothes, but to Benjamin he gave three hundred shekels2 of silver and five changes of clothes. \n" +
                "23 To his father he sent as follows: ten donkeys loaded with the good things of Egypt, and ten female donkeys loaded with grain, bread, \n" +
                "and provision for his father on the journey. \n" +
                "24 Then he sent his brothers away, and as they departed, he said to them, “Do not quarrel on the way.”\n" +
                "25 So they went up out of Egypt and came to the land of Canaan to their father Jacob. \n" +
                "26 And they told him, “Joseph is still alive, and he is ruler over all the land of Egypt.” And his heart became numb, for he did not believe them. \n" +
                "27 But when they told him all the words of Joseph, which he had said to them, and when he saw the wagons that Joseph had sent to carry him, \n" +
                "the spirit of their father Jacob revived. \n" +
                "28 And Israel said, “It is enough; Joseph my son is still alive. I will go and see him before I die.”\n";

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table45.add(lblFirstTitle).pad(10,50,0,0).left();
        table45.row();

        //content of the chapter
        table45.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table45);

    }

    public void chapterFortySixOFGenesis() {

        table46 = new Table();
        table46.setWidth(tableBG.getWidth());
        table46.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table46.setFillParent(true);
        table46.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Joseph Brings His Family to Egypt";

        String firstContent = "1 So Israel took his journey with all that he had and came to Beersheba, and offered sacrifices to the God of his father Isaac. \n" +
                "2 And God spoke to Israel in visions of the night and said, “Jacob, Jacob.” And he said, “Here I am.” \n" +
                "3 Then he said, “I am God,  the God of your father. Do not be afraid to go down to Egypt, for there I will make you into a great nation. \n" +
                "4 I myself will go down with you to Egypt, and I will also bring you up again, and Joseph's hand shall close your eyes.”\n" +
                "5 Then Jacob set out from Beersheba. The sons of Israel carried Jacob their father, their little ones, and their wives, \n" +
                "in the wagons that Pharaoh had sent to carry him. \n" +
                "6 They also took their livestock and their goods, which they had gained in the land of Canaan, and came into Egypt, \n" +
                "Jacob and all his offspring with him, \n" +
                "7 his sons, and his sons' sons with him, his daughters, and his sons' daughters. All his offspring he brought with him into Egypt.\n" +
                "8 Now these are the names of the descendants of Israel, who came into Egypt, Jacob and his sons.  Reuben, Jacob's firstborn,\n" +
                "9 and the sons of Reuben: Hanoch, Pallu, Hezron, and Carmi. \n" +
                "10 The sons of Simeon: Jemuel, Jamin, Ohad, Jachin, Zohar, and Shaul, the son of a Canaanite woman. \n" +
                "11 The sons of Levi: Gershon, Kohath, and Merari.\n" +
                "12 The sons of tJudah: Er, Onan, Shelah, Perez, and Zerah (but Er and Onan died in the land of Canaan); \n" +
                "and the sons of Perez were Hezron and Hamul. \n" +
                "13 The sons of Issachar: Tola, Puvah, Yob, and Shimron.\n" +
                "14 The sons of Zebulun: Sered, Elon, and Jahleel. \n" +
                "15 These are the sons of Leah, xwhom she bore to Jacob in Paddan-aram, together with his daughter Dinah; \n" +
                "altogether his sons and his daughters numbered thirty-three.\n" +
                "16 The sons of Gad: Ziphion, Haggi, Shuni, Ezbon, Eri, Arodi, and Areli. \n" +
                "17 The sons of Asher: Imnah, Ishvah, Ishvi, Beriah, with Serah their sister. And the sons of Beriah: Heber and Malchiel. \n" +
                "18 These are the sons of Zilpah,  whom Laban gave to Leah his daughter; and these she bore to Jacob—sixteen persons.\n" +
                "19 The sons of Rachel, Jacob's wife: Joseph and Benjamin. \n" +
                "20 And to Joseph in the land of Egypt were born Manasseh and Ephraim, whom Asenath, the daughter of Potiphera the priest of On, bore to him. \n" +
                "21 Anddthe sons of Benjamin: Bela, Becher, Ashbel, Gera, Naaman, Ehi, Rosh, Muppim, Huppim, and Ard. \n" +
                "22 These are the sons of Rachel, who were born to Jacob—fourteen persons in all.\n" +
                "23 The son of Dan: Hushim. \n" +
                "24 The sons of Naphtali: Jahzeel, Guni, Jezer, and Shillem. \n" +
                "25 These are the sons of Bilhah,  whom Laban gave to Rachel his daughter, and these she bore to Jacob—seven persons in all.\n" +
                "26 All the persons belonging to Jacob who came into Egypt, who were his own descendants, not including Jacob's sons' wives, \n" +
                "were sixty-six persons in all. \n" +
                "27 And the sons of Joseph, who were born to him in Egypt, were two.  All the persons of the house of Jacob who came into Egypt were seventy.\n";

        String chapterSecondTitle = "Jacob and Joseph Reunited";

        String secondContent = "28 He had sent Judah ahead of him to Joseph to show the way before him in Goshen, and they came into the land of Goshen. \n" +
                "29 Then Joseph prepared his chariot and went up to meet Israel his father in Goshen. He presented himself to him and \n" +
                "fell on his neck and wept on his neck a good while. \n" +
                "30 Israel said to Joseph,  “Now let me die, since I have seen your face and know that you are still alive.” \n" +
                "31 Joseph said to his brothers and to his father's household, l“I will go up and tell Pharaoh and will say to him, \n" +
                "‘My brothers and my father's household, who were in the land of Canaan, have come to me. \n" +
                "32 And the men are shepherds, for they have been keepers of livestock, and they have brought their flocks and their \n" +
                "herds and all that they have.’ \n" +
                "33 When Pharaoh calls you and says, ‘What is your occupation?’ \n" +
                "34 you shall say, ‘Your servants have been keepers of livestock from our youth even until now, both we and our fathers,’ \n" +
                "in order that you may dwell in the land of Goshen, for every shepherd is an abomination to the Egyptians.”\n";
 

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table46.add(lblFirstTitle).pad(10,50,0,0).left();
        table46.row();

        //content of the chapter
        table46.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table46.row();

        //title of the second content
        table46.add(lblSecondTitle).pad(10,50,0,0).left();
        table46.row();

        //content of the second title
        table46.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table46);

    }

    public void chapterFortySevenOFGenesis() {

        table47 = new Table();
        table47.setWidth(tableBG.getWidth());
        table47.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table47.setFillParent(true);
        table47.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Jacob's Family Settles in Goshen";

        String firstContent = "1  So Joseph went in and told Pharaoh, “My father and my brothers, with their flocks and herds and all that they possess, \n" +
                "have come from the land of Canaan. They are now in rthe land of Goshen.” \n" +
                "2 And from among his brothers he took five men and presented them to Pharaoh. \n" +
                "3 Pharaoh said to his brothers, “What is your occupation?” And they said to Pharaoh, “Your servants are shepherds, as our fathers were.”\n" +
                "4 They said to Pharaoh, “We have come to sojourn in the land, for there is no pasture for your servants' flocks, \n" +
                "for the famine is severe in the land of Canaan. And now, please let your servants dwell win the land of Goshen.” \n" +
                "5 Then Pharaoh said to Joseph, “Your father and your brothers have come to you. \n" +
                "6 The land of Egypt is before you. Settle your father and your brothers in the best of the land. Let them settle in the land of Goshen, \n" +
                "and if you know any able men among them, put them in charge of my livestock.”\n" +
                "7 Then Joseph brought in Jacob his father and stood him before Pharaoh, and Jacob blessed Pharaoh. \n" +
                "8 And Pharaoh said to Jacob, “How many are the days of the years of your life?”\n" +
                "9 And Jacob said to Pharaoh, “The days of the years of my sojourning are 130 years. Few and evil have been the days of the years of my life, \n" +
                "and they have not attained to the days of the years of the life of my fathers in the days of their sojourning.” \n" +
                "10 And Jacob blessed Pharaoh and went out from the presence of Pharaoh. \n" +
                "11 Then Joseph settled his father and his brothers and gave them a possession in the land of Egypt, in the best of the land, in the land of Rameses, \n" +
                "as Pharaoh had commanded. \n" +
                "12 And Joseph provided his father, his brothers, and all his father's household with food, according to the number of their dependents.\n" +
                "Joseph and the Famine\n" +
                "13 Now there was no food in all the land, for the famine was very severe, so that the land of Egypt and the land of Canaan \n" +
                "languished by reason of the famine. \n" +
                "14 And Joseph gathered up all the money that was found in the land of Egypt and in the land of Canaan, in exchange for the grain that they bought. \n" +
                "And Joseph brought the money into Pharaoh's house. \n" +
                "15 And when the money was all spent in the land of Egypt and in the land of Canaan, all the Egyptians came to Joseph and said, \n" +
                "“Give us food. Why should we die before your eyes? For our money is gone.”\n" +
                "16 And Joseph answered, “Give your livestock, and I will give you food in exchange for your livestock, if your money is gone.”\n" +
                "17 So they brought their livestock to Joseph, and Joseph gave them food in exchange for the horses, the flocks, the herds, and the donkeys.\n" +
                " He supplied them with food in exchange for all their livestock that year. \n" +
                "18 And when that year was ended, they came to him the following year and said to him, \n" +
                "“We will not hide from my lord that our money is all spent. The herds of livestock are my lord's. \n" +
                "There is nothing left in the sight of my lord but our bodies and our land. \n" +
                "19 Why should we die before your eyes, both we and our land? kBuy us and our land for food, and we with our land will be servants to Pharaoh. \n" +
                "And give us seed that we may live and not die, and that the land may not be desolate.”\n" +
                "20 So Joseph bought all the land of Egypt for Pharaoh, for all the Egyptians sold their fields, because the famine was severe on them. \n" +
                "The land became Pharaoh's. \n" +
                "21 As for the people, he made servants of them1from one end of Egypt to the other. \n" +
                "22 Only the land of the priests he did not buy, for the priests had a fixed allowance from Pharaoh and lived on \n" +
                "the allowance that Pharaoh gave them; therefore they did not sell their land.\n" +
                "23 Then Joseph said to the people, “Behold, I have this day bought you and your land for Pharaoh. Now here is seed for you, \n" +
                "and you shall sow the land. \n" +
                "24 And at the harvests you shall give a fifth to Pharaoh, and four fifths shall be your own, as seed for the field \n" +
                "and as food for yourselves and your households, and as food for your little ones.” \n" +
                "25 And they said, “You have saved our lives; may it please my lord, we will be servants to Pharaoh.” \n" +
                "26 So Joseph made it a statute concerning the land of Egypt, and it stands to this day, that Pharaoh should have the fifth; \n" +
                "the land of the priests alone did not become Pharaoh's.\n" +
                "27 Thus Israel settled in the land of Egypt, pin the land of Goshen. And they gained possessions in it, and were fruitful and multiplied greatly. \n" +
                "28 And Jacob lived in the land of Egypt seventeen years. So the days of Jacob, the years of his life, were 147 years.\n" +
                "29 And when the time drew near that Israel must die, he called his son Joseph and said to him, “If now tI have found favor \n" +
                "in your sight, put your hand under my thigh and promise to deal kindly and truly with me. Do not bury me in Egypt, \n" +
                "30 but let me lie with my fathers. Carry me out of Egypt and bury me in their burying place.” He answered, “I will do as you have said.” \n" +
                "31 And he said, “Swear to me”; and he swore to him. Then Israel bowed himself upon the head of his bed.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table47.add(lblFirstTitle).pad(10,50,0,0).left();
        table47.row();

        //content of the chapter
        table47.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table47);

    }

    public void chapterFortyEightOFGenesis() {

        table48 = new Table();
        table48.setWidth(tableBG.getWidth());
        table48.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table48.setFillParent(true);
        table48.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Jacob Blesses Ephraim and Manasseh";

        String firstContent = "1 After this, Joseph was told, “Behold, your father is ill.” So he took with him his two sons, Manasseh and Ephraim. \n" +
                "2 And it was told to Jacob, “Your son Joseph has come to you.” Then Israel summoned his strength and sat up in bed. \n" +
                "3 And Jacob said to Joseph, “God Almighty1 appeared to me at Luz in the land of Canaan and blessed me, \n" +
                "4 and said to me, ‘Behold, I will make you fruitful and multiply you, and I will make of you a company of peoples \n" +
                "and will give this land to your offspring after you for an everlasting possession.’\n" +
                "5 And now your two sons, who were born to you in the land of Egypt before I came to you in Egypt, are mine; Ephraim and Manasseh shall be mine, \n" +
                "as Reuben and Simeon are. \n" +
                "6 And the children that you fathered after them shall be yours. They shall be called by the name of their brothers in their inheritance. \n" +
                "7 As for me, when I came from Paddan, to my sorrow Rachel died in the land of Canaan on the way, when there was \n" +
                "still some distance2 to go to Ephrath, and I buried her there on the way to Ephrath (that is, Bethlehem).”\n" +
                "8 When Israel saw Joseph's sons, he said, “Who are these?” \n" +
                "9 Joseph said to his father, “They are my sons, whom God has given me here.” And he said, “Bring them to me, please, that I may bless them.” \n" +
                "10 Now the eyes of Israel were dim with age, so that he could not see. So Joseph brought them near him, and he kissed them and embraced them. \n" +
                "11 And Israel said to Joseph, “I never expected to see your face; and behold, God has let me see your offspring also.”\n" +
                "12 Then Joseph removed them from his knees, and he bowed himself with his face to the earth. \n" +
                "13 And Joseph took them both, Ephraim in his right hand toward Israel's left hand, and Manasseh in his left hand toward Israel's right hand, \n" +
                "and brought them near him. \n" +
                "14 And Israel stretched out his right hand and laid it on the head of Ephraim, who was the younger, \n" +
                "and his left hand on the head of Manasseh, crossing his hands (for Manasseh was the firstborn). \n" +
                "15 And he blessed Joseph and said,\n" +
                "\t\t“The God before whom my fathers Abraham and Isaac walked,\n" +
                "\t\tthe God who has been my shepherd all my life long to this day,\n" +
                "\t\t16  the angel who has redeemed me from all evil, bless the boys;\n" +
                "\t\tand in them let my name be carried on, and the name of my fathers Abraham and Isaac;\n" +
                "\t\tand let them grow into a multitude in the midst of the earth.”\n" +
                "17 When Joseph saw that his father laid his right hand on the head of Ephraim, it displeased him, \n" +
                "and he took his father's hand to move it from Ephraim's head to Manasseh's head. \n" +
                "18 And Joseph said to his father, “Not this way, my father; since this one is the firstborn, put your right hand on his head.” \n" +
                "19 But his father refused and said, “I know, my son, I know. He also shall become a people, and he also shall be great. Nevertheless, \n" +
                "his younger brother shall be greater than he, and his offspring shall become a multitude of nations.” \n" +
                "20 So he blessed them that day, saying,\n" +
                "\t\t“By you Israel will pronounce blessings, saying,\n" +
                "\t\t‘God make you as Ephraim and as Manasseh.’”\n" +
                "Thus he put Ephraim before Manasseh. \n" +
                "21 Then Israel said to Joseph, “Behold, I am about to die, but God will be with you and will bring you again to the land of your fathers. \n" +
                "22 Moreover, I have given to you rather than to your brothers one mountain slope5 that I took from the hand of the Amorites \n" +
                "with my sword and with my bow.”\n";
    

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table48.add(lblFirstTitle).pad(10,50,0,0).left();
        table48.row();

        //content of the chapter
        table48.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table48);

    }

    public void chapterFortyNineOFGenesis() {

        table49 = new Table();
        table49.setWidth(tableBG.getWidth());
        table49.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table49.setFillParent(true);
        table49.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Jacob Blesses His Sons";

        String firstContent = "1 Then Jacob called his sons and said, “Gather yourselves together, that I may tell you what shall happen to you in days to come.\n" +
                "2  “Assemble and listen, O sons of Jacob,\n" +
                "listen to Israel your father.\n" +
                "3  “Reuben, you are my firstborn,\n" +
                "my might, and the firstfruits of my strength,\n" +
                "preeminent in dignity and preeminent in power.\n" +
                "4  Unstable as water, you shall not have preeminence,\n" +
                "because you went up to your father's bed;\n" +
                "then you defiled it—he went up to my couch!\n" +
                "5  “Simeon and Levi are brothers;\n" +
                "weapons of violence are their swords.\n" +
                "6  Let my soul come not into their council;\n" +
                "O my glory,  be not joined to their company.\n" +
                "For in their anger they killed men,\n" +
                "and in their willfulness they hamstrung oxen.\n" +
                "7  Cursed be their anger, for it is fierce,\n" +
                "and their wrath, for it is cruel!\n" +
                "I will divide them in Jacob\n" +
                "and scatter them in Israel.\n" +
                "8  “Judah,  your brothers shall praise you;\n" +
                "your hand shall be on the neck of your enemies;\n" +
                "your father's sons shall bow down before you.\n" +
                "9  Judah is a lion's cub;\n" +
                "from the prey, my son, you have gone up.\n" +
                "He stooped down; he crouched as a lion\n" +
                "and as a lioness; who dares rouse him?\n" +
                "10  The scepter shall not depart from Judah,\n" +
                "nor the ruler's staff from between his feet,\n" +
                "until tribute comes to him;1\n" +
                "and to him shall be the obedience of the peoples.\n" +
                "11  Binding his foal to the vine\n" +
                "and his donkey's colt to the choice vine,\n" +
                "he has washed his garments in wine\n" +
                "and his vesture in the blood of grapes.\n" +
                "12  His eyes are darker than wine,\n" +
                "and his teeth whiter than milk.\n" +
                "13  “Zebulun shall dwell at the shore of the sea;\n" +
                "he shall become a haven for ships,\n" +
                "and his border shall be at Sidon.\n" +
                "14  “Issachar is a strong donkey,\n" +
                "crouching between the sheepfolds.2\n" +
                "15  He saw that a resting place was good,\n" +
                "and that the land was pleasant,\n" +
                "so he bowed his shoulder to bear,\n" +
                "and became a servant at forced labor.\n" +
                "16  “Dan shall judge his people\n" +
                "as one of the tribes of Israel.\n" +
                "17  Dan shall be a serpent in the way,\n" +
                "a viper by the path,\n" +
                "that bites the horse's heels\n" +
                "so that his rider falls backward.\n" +
                "18  I wait for your salvation, O LORD.\n" +
                "19  “Raiders shall raid Gad, \n" +
                "but he shall raid at their heels.\n" +
                "20  “Asher's food shall be rich,\n" +
                "and he shall yield royal delicacies.\n" +
                "21  “Naphtali is a doe let loose\n" +
                "that bears beautiful fawns.4\n" +
                "22  “Joseph is a fruitful bough,\n" +
                "a fruitful bough by a spring;\n" +
                "his branches run over the wall.5\n" +
                "23  The archers bitterly attacked him,\n" +
                "shot at him, and harassed him severely,\n" +
                "24  yet his bow remained unmoved;\n" +
                "his arms were made agile\n" +
                "by the hands of the Mighty One of Jacob\n" +
                "(from there is the Shepherd,  the Stone of Israel),\n" +
                "25  by the God of your father who will help you,\n" +
                "by the Almighty who will bless you\n" +
                "with blessings of heaven above,\n" +
                "blessings of the deep that crouches beneath,\n" +
                "blessings of the breasts and of the womb.\n" +
                "26  The blessings of your father\n" +
                "are mighty beyond the blessings of my parents,\n" +
                "up to the bounties of the everlasting hills.9\n" +
                "May they be on the head of Joseph,\n" +
                "and on the brow of him who was set apart from his brothers.\n" +
                "27  “Benjamin is a ravenous wolf,\n" +
                "in the morning devouring the prey\n" +
                "and at evening dividing the spoil.”\n" +
                "Jacob's Death and Burial\n" +
                "28 All these are the twelve tribes of Israel. This is what their father said to them as he blessed them, \n" +
                "blessing each with the blessing suitable to him. \n" +
                "29 Then he commanded them and said to them, “I am to be gathered to my people;  \n" +
                "bury me with my fathers in the cave that is in the field of Ephron the Hittite, \n" +
                "30 in the cave that is in the field at Machpelah, to the east of Mamre, in the land of Canaan, \n" +
                " which Abraham bought with the field from Ephron the Hittite to possess as a burying place. \n" +
                "31 There they buried Abraham and Sarah his wife. There they buried Isaac and Rebekah his wife, and there I buried Leah—\n" +
                "32 the field and the cave that is in it were bought from the Hittites.” \n" +
                "33 When Jacob finished commanding his sons, he drew up his feet into the bed and breathed his last and was gathered to his people.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table49.add(lblFirstTitle).pad(10,50,0,0).left();
        table49.row();

        //content of the chapter
        table49.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table49);

    }

    public void chapterFiftyOFGenesis() {

        table50 = new Table();
        table50.setWidth(tableBG.getWidth());
        table50.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table50.setFillParent(true);
        table50.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 Then Joseph fell on his father's face and wept over him and kissed him. \n" +
                "2 And Joseph commanded his servants the physicians to embalm his father. So the physicians embalmed Israel.\n" +
                "3 Forty days were required for it, for that is how many are required for embalming. \n" +
                "And the Egyptians wept for him seventy days.\n" +
                "4 And when the days of weeping for him were past, Joseph spoke to the household of Pharaoh, saying, “If now I have found favor in your eyes, please speak in the ears of Pharaoh, saying, \n" +
                "5 ‘My father made me swear, saying, “I am about to die: in my tomb that I hewed out for myself in the land of Canaan, there shall you bury me.” \n" +
                "Now therefore, let me please go up and bury my father. Then I will return.’” \n" +
                "6 And Pharaoh answered, “Go up, and bury your father, as he made you swear.”\n" +
                "7 So Joseph went up to bury his father. With him went up all the servants of Pharaoh, the elders of his household, and all the elders of the land of Egypt, \n" +
                "8 as well as all the household of Joseph, his brothers, and his father's household. Only their children, their flocks, and their herds were left in the land of Goshen. \n" +
                "9 And there went up with him both chariots and horsemen. It was a very great company. \n" +
                "10 When they came to the threshing floor of Atad, which is beyond the Jordan, they lamented there with a very great and grievous lamentation, \n" +
                "and he made a mourning for his father seven days. \n" +
                "11 When the inhabitants of the land, the Canaanites, saw the mourning on the threshing floor of Atad, they said, \n" +
                "“This is a grievous mourning by the Egyptians.” Therefore the place was named Abel-mizraim; it is beyond the Jordan.\n" +
                "12 Thus his sons did for him as he had commanded them, \n" +
                "13 for his sons carried him to the land of Canaan and buried him in the cave of the field at Machpelah, to the east of Mamre, \n" +
                "which Abraham bought with the field from Ephron the Hittite to possess as a burying place. \n" +
                "14 After he had buried his father, Joseph returned to Egypt with his brothers and all who had gone up with him to bury his father.\n";

        String chapterSecondTitle = "God's Good Purposes";

        String secondContent = "15 When Joseph's brothers saw that their father was dead, they said, “It may be that Joseph will hate us and \n" +
                "pay us back for all the evil that we did to him.” \n" +
                "16 So they sent a message to Joseph, saying, “Your father gave this command before he died: \n" +
                "17 ‘Say to Joseph, “Please forgive the transgression of your brothers and their sin, because they did evil to you.”’ \n" +
                "And now, please forgive the transgression of the servants of the God of your father.” Joseph wept when they spoke to him. \n" +
                "18 His brothers also came and fell down before him and said, “Behold, we are your servants.” \n" +
                "19 But Joseph said to them, “Do not fear, for ham I in the place of God? \n" +
                "20 As for you, you meant evil against me, but God meant it for good, to bring it about that many people should be kept alive, as they are today. \n" +
                "21 So do not fear; I will provide for you and your little ones.” Thus he comforted them and spoke kindly to them.\n";

        String chapterThirdTitle = "The Death of Joseph";

        String thirdContent = "22 So Joseph remained in Egypt, he and his father's house. Joseph lived 110 years. \n" +
                "23 And Joseph saw Ephraim's children of the third generation. The children also of Machir the son of Manasseh were counted as Joseph's own.3 \n" +
                "24 And Joseph said to his brothers, “I am about to die, but God will visit you and bring you up out of this land to the land that \n" +
                "he swore to Abraham, to Isaac, and to Jacob.” \n" +
                "25 Then Joseph made the sons of Israel swear, saying, “God will surely visit you, and you shall carry up my bones from here.” \n" +
                "26 So Joseph died, being 110 years old. They embalmed him, and he was put in a coffin in Egypt.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblThirdTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);


        //title of the chapter
        table50.add(lblFirstTitle).pad(10,50,0,0).left();
        table50.row();

        //content of the chapter
        table50.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table50.row();

        //title of the second content
        table50.add(lblSecondTitle).pad(10,50,0,0).left();
        table50.row();

        //content of the second title
        table50.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table50.row();

        //title of the third content
        table50.add(lblThirdTitle).pad(10,50,0,0).left();
        table50.row();

        //content of the third title
        table50.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table50);

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
       table28.remove();
       table29.remove();
       table30.remove();
       table31.remove();
       table32.remove();
       table33.remove();
       table34.remove();
       table35.remove();
       table36.remove();
       table37.remove();
       table38.remove();
       table39.remove();
       table40.remove();
       table41.remove();
       table42.remove();
       table43.remove();
       table44.remove();
       table45.remove();
       table46.remove();
       table47.remove();
       table48.remove();
       table49.remove();
       table50.remove();
    }

    public void update(){

        camera.update();
    }

    public void render(SpriteBatch sb){

        stage.draw();

    }

    public Table getTable50() {
        return table50;
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

    public Table getTable27() {
        return table27;
    }

    public Table getTable28() {
        return table28;
    }

    public Table getTable29() {
        return table29;
    }

    public Table getTable30() {
        return table30;
    }

    public Table getTable31() {
        return table31;
    }

    public Table getTable32() {
        return table32;
    }

    public Table getTable33() {
        return table33;
    }

    public Table getTable34() {
        return table34;
    }

    public Table getTable35() {
        return table35;
    }

    public Table getTable36() {
        return table36;
    }

    public Table getTable37() {
        return table37;
    }

    public Table getTable38() {
        return table38;
    }

    public Table getTable39() {
        return table39;
    }

    public Table getTable40() {
        return table40;
    }

    public Table getTable41() {
        return table41;
    }

    public Table getTable42() {
        return table42;
    }

    public Table getTable43() {
        return table43;
    }

    public Table getTable44() {
        return table44;
    }

    public Table getTable45() {
        return table45;
    }

    public Table getTable46() {
        return table46;
    }

    public Table getTable47() {
        return table47;
    }

    public Table getTable48() {
        return table48;
    }

    public Table getTable49() {
        return table49;
    }

    public Stage getStage() {
        return stage;
    }

    public OrthographicCamera getCamera() {
        return camera;
    }

}
