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
public class BookOfExodus {

        private Stage stage;
        private OrthographicCamera camera;

        BitmapFont contentFont;
        
        private Label txtFirstContent, txtSecondContent, txtThirdContent, txtFourthContent;
        private Label lblFirstTitle, lblSecondTitle, lblThirdTitle, lblFourthTitle;

        private Texture tableBG;

        private Table table1, table2, table3, table4, table5, table6, table7, table8, table9, table10, table11, table12,
                table13, table14, table15, table16, table17, table18, table19, table20, table21, table22, table23,
                table24, table25, table26, table27, table28, table29, table30, table31, table32, table33, table34,
                table35, table36, table37, table38, table39, table40;


        public BookOfExodus(){ 

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


            chapterOneOFExodus();
            chapterTwoOFExodus();
            chapterThreeOFExodus();
            chapterFourOFExodus();
            chapterFiveOFExodus();
            chapterSixOFExodus();
            chapterSevenOFExodus();
            chapterEightOFExodus();
            chapterNineOFExodus();
            chapterTenOFExodus();
            chapterElevenOFExodus();
            chapterTwelveOFExodus();
            chapterThirteenOFExodus();
            chapterFourteenOFExodus();
            chapterFifteenOFExodus();
            chapterSixteenOFExodus();
            chapterSeventeenOFExodus();
            chapterEighteenOFExodus();
            chapterNineteenOFExodus();
            chapterTwentyOFExodus();
            chapterTwentyOneOFExodus();
            chapterTwentyTwoOFExodus();
            chapterTwentyThreeOFExodus();
            chapterTwentyFourOFExodus();
            chapterTwentyFiveOFExodus();
            chapterTwentySixOFExodus();
            chapterTwentySevenOFExodus();
            chapterTwentyEightOFExodus();
            chapterTwentyNineOFExodus();
            chapterThirtyOFExodus();
            chapterThirtyOneOFExodus();
            chapterThirtyTwoOFExodus();
            chapterThirtyThreeOFExodus();
            chapterThirtyFourOFExodus();
            chapterThirtyFiveOFExodus();
            chapterThirtySixOFExodus();
            chapterThirtySevenOFExodus();
            chapterThirtyEightOFExodus();
            chapterThirtyNineOFExodus();
            chapterFortyOFExodus();

        }


    public void chapterOneOFExodus() {

        table1 = new Table();
        table1.setWidth(tableBG.getWidth());
        table1.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table1.setFillParent(true);
        table1.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Israel Increases Greatly in Egypt";

        String firstContent = "1 These are the names of the sons of Israel who came to Egypt with Jacob, each with his household: \n" +
                "2 Reuben, Simeon, Levi, and Judah,\n" +
                "3 Issachar, Zebulun, and Benjamin, \n" +
                "4 Dan and Naphtali, Gad and Asher.\n" +
                "5 All the descendants of Jacob were seventy persons; Joseph was already in Egypt. \n" +
                "6 Then Joseph died, and all his brothers and all that generation. \n" +
                "7 But the people of Israel were fruitful and increased greatly; they multiplied and grew exceedingly strong, \n" +
                "so that the land was filled with them.\n";

        String chapterSecondTitle = "Pharaoh Oppresses Israel";

        String secondContent = "8 Now there arose a new king over Egypt, who did not know Joseph.\n" +
                "9 And he said to his people, “Behold, the people of Israel are too many and too mighty for us. \n" +
                "10 Come, let us deal shrewdly with them, lest they multiply, and, if war breaks out, they join our enemies \n" +
                "and fight against us and escape from the land.” \n" +
                "11 Therefore they set taskmasters over them to afflict them with heavy burdens. They built for Pharaoh store cities, Pithom and Raamses. \n" +
                "12 But the more they were oppressed, the more they multiplied and the more they spread abroad. \n" +
                "And the Egyptians were in dread of the people of Israel. \n" +
                "13 So they ruthlessly made the people of Israel work as slaves \n" +
                "14 and made their lives bitter with hard service, in mortar and brick, and in all kinds of work in the field. \n" +
                "In all their work they ruthlessly made them work as slaves.\n" +
                "15 Then the king of Egypt said to the Hebrew midwives, one of whom was named Shiphrah and the other Puah, \n" +
                "16 “When you serve as midwife to the Hebrew women and see them on the birthstool, if it is a son, you shall kill him, \n" +
                "but if it is a daughter, she shall live.” \n" +
                "17 But the midwives feared God and did not do as the king of Egypt commanded them, but let the male children live. \n" +
                "18 So the king of Egypt called the midwives and said to them, “Why have you done this, and let the male children live?” \n" +
                "19 The midwives said to Pharaoh, “Because the Hebrew women are not like the Egyptian women, \n" +
                "for they are vigorous and give birth before the midwife comes to them.” \n" +
                "20 So God dealt well with the midwives. And the people multiplied and grew very strong. \n" +
                "21 And because the midwives feared God, he gave them families. \n" +
                "22 Then Pharaoh commanded all his people, “Every son that is born to the Hebrews1 you shall cast into the Nile, \n" +
                "but you shall let every daughter live.”\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table1.add(lblFirstTitle).pad(10,50,0,0).left();
        table1.row();

        //content of the chapter
        table1.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table1.row();

        //title of the second content
        table1.add(lblSecondTitle).pad(10,50,0,0).left();
        table1.row();

        //content of the second title
        table1.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table1);

    }


    public void chapterTwoOFExodus() {

        table2 = new Table();
        table2.setWidth(tableBG.getWidth());
        table2.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table2.setFillParent(true);
        table2.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
   
        String chapterFirstTitle = "The Birth of Moses";

        String firstContent = "1 Now a man from the house of Levi went and took as his wife a Levite woman. \n" +
                "2 The woman conceived and bore a son, and when she saw that he was a fine child, she hid him three months. \n" +
                "3 When she could hide him no longer, she took for him a basket made of bulrushes1and daubed it with bitumen and pitch. \n" +
                "She put the child in it and placed it among the reeds by the river bank. \n" +
                "4 And his sister stood at a distance to know what would be done to him. \n" +
                "5 Now the daughter of Pharaoh came down to bathe at the river, while her young women walked beside the river. \n" +
                "She saw the basket among the reeds and sent her servant woman, and she took it.\n" +
                "6 When she opened it, she saw the child, and behold, the baby was crying. She took pity on him and said, “This is one of the Hebrews' children.” \n" +
                "7 Then his sister said to Pharaoh's daughter, “Shall I go and call you a nurse from the Hebrew women to nurse the child for you?” \n" +
                "8 And Pharaoh's daughter said to her, “Go.” So the girl went and called the child's mother. \n" +
                "9 And Pharaoh's daughter said to her, “Take this child away and nurse him for me, and I will give you your wages.” \n" +
                "So the woman took the child and nursed him. \n" +
                "10 When the child grew older, she brought him to Pharaoh's daughter, and he became her son. She named him Moses, \n" +
                "“Because,” she said, “I drew him out of the water.”\n";

        String chapterSecondTitle = "Moses Flees to Midian";

        String secondContent = "11 One day, when Moses had grown up, he went out to his people and looked on their burdens, \n" +
                "and he saw an Egyptian beating a Hebrew, one of his people.\n" +
                "12 He looked this way and that, and seeing no one, he struck down the Egyptian and hid him in the sand. \n" +
                "13 When he went out the next day, behold, two Hebrews were struggling together. And he said to the man in the wrong, \n" +
                "“Why do you strike your companion?” \n" +
                "14 He answered, “Who made you a prince and a judge over us? Do you mean to kill me as you killed the Egyptian?” \n" +
                "Then Moses was afraid, and thought, “Surely the thing is known.” \n" +
                "15 When Pharaoh heard of it, he sought to kill Moses. But Moses fled from Pharaoh and stayed in the land of Midian. \n" +
                "And he sat down by a well.\n" +
                "16 Now the priest of Midian had seven daughters, and hthey came and drew water and filled the troughs to water their father's flock. \n" +
                "17 The shepherds came and drove them away, but Moses stood up and saved them, and watered their flock. \n" +
                "18 When they came home to their father Reuel, he said, “How is it that you have come home so soon today?”\n" +
                "19 They said, “An Egyptian delivered us out of the hand of the shepherds and even drew water for us and watered the flock.”\n" +
                "20 He said to his daughters, “Then where is he? Why have you left the man? Call him, that he may eat bread.” \n" +
                "21 And Moses was content to dwell with the man, and he gave Moses his daughter Zipporah. \n" +
                "22 She gave birth to a son, and he called his name Gershom, for he said, “I have been ansojourner4 in a foreign land.”\n" +
                "God Hears Israel's Groaning\n" +
                "23 During those many days the king of Egypt died, and the people of Israel groaned because of their slavery and cried out for help. \n" +
                "Their cry for rescue from slavery came up to God. \n" +
                "24 And God heard their groaning, and God remembered his covenant with tAbraham, with Isaac, and with Jacob. \n" +
                "25 God saw the people of Israel—and God knew.\n";


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


    public void chapterThreeOFExodus() {

        table3 = new Table();
        table3.setWidth(tableBG.getWidth());
        table3.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table3.setFillParent(true);
        table3.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Burning Bush";

        String firstContent = "1 Now Moses was keeping the flock of his father-in-law, Jethro, the priest of Midian, \n" +
                "and he led his flock to the west side of the wilderness and came to Horeb, the mountain of God. \n" +
                "2 And the angel of the LORD appeared to him in a flame of fire out of the midst of a bush. \n" +
                "He looked, and behold, the bush was burning, yet it was not consumed.\n" +
                "3 And Moses said, “I will turn aside to see this great sight, why the bush is not burned.” \n" +
                "4 When the LORD saw that he turned aside to see, God called to him out of the bush, “Moses, Moses!” And he said, “Here I am.” \n" +
                "5 Then he said, “Do not come near; take your sandals off your feet, for the place on which you are standing is holy ground.” \n" +
                "6 And he said, “I am the God of your father, the God of Abraham, the God of Isaac, and the God of Jacob.” And Moses hid his face, \n" +
                "for he was afraid to look at God.\n" +
                "7 Then the LORD said, “I have surely seen the affliction of my people who are in Egypt and have heard their cry because of their taskmasters. \n" +
                "I know their sufferings, \n" +
                "8 and I have come down to deliver them out of the hand of the Egyptians and to bring them up out of that land to a good and broad land,\n" +
                " a land flowing with milk and honey, to the place of the Canaanites, the Hittites, the Amorites, the Perizzites, the Hivites, and the Jebusites. \n" +
                "9 And now, behold, the cry of the people of Israel has come to me, and I have also seen the oppression with which the Egyptians oppress them. \n" +
                "10 Come, I will send you to Pharaoh that you may bring my people, the children of Israel, out of Egypt.” \n" +
                "11 But Moses said to God, “Who am I that I should go to Pharaoh and bring the children of Israel out of Egypt?” \n" +
                "12 He said, “But I will be with you, and this shall be the sign for you, that I have sent you: when you have brought the people out of Egypt,\n" +
                " you shall serve God on this mountain.”\n" +
                "13 Then Moses said to God, “If I come to the people of Israel and say to them, ‘The God of your fathers has sent me to you,’ \n" +
                "and they ask me, ‘What is his name?’ what shall I say to them?” \n" +
                "14 God said to Moses, “I AM WHO I AM.”1 And he said, “Say this to the people of Israel: ‘I AM has sent me to you.’” \n" +
                "15 God also said to Moses, “Say this to the people of Israel: ‘The LORD, the God of your fathers, the God of Abraham, \n" +
                "the God of Isaac, and the God of Jacob, has sent me to you.’ This is my name forever, and thus I am to be remembered throughout all generations. \n" +
                "16 Go and gather the elders of Israel together and say to them, ‘The LORD, the God of your fathers, the God of Abraham, \n" +
                "of Isaac, and of Jacob, has appeared to me, saying, v“I have observed you and what has been done to you in Egypt, \n" +
                "17 and I promise that I will bring you up out of the affliction of Egypt to the land of the Canaanites, the Hittites, \n" +
                "the Amorites, the Perizzites, the Hivites, and the Jebusites, a land flowing with milk and honey.”’ \n" +
                "18 And they will listen to your voice, and you and the elders of Israel shall go to the king of Egypt and say to him, \n" +
                "‘The LORD, the God of the Hebrews, has met with us; and now, please let us go a three days' journey into the wilderness, that we may sacrifice to the LORD our God.’ \n" +
                "19 But I know that the king of Egypt will not let you go unless compelled by a mighty hand.\n" +
                "20 So I will stretch out my hand and strike Egypt with all the wonders that I will do in it; after that he will let you go. \n" +
                "21 And I will give this people favor in the sight of the Egyptians; and when you go, you shall not go empty,\n" +
                "22 but each woman shall ask of her neighbor, and any woman who lives in her house, for silver and gold jewelry, and for clothing. \n" +
                "You shall put them on your sons and on your daughters. So you shall plunder the Egyptians.”\n";


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

    public void chapterFourOFExodus() {

        table4 = new Table();
        table4.setWidth(tableBG.getWidth());
        table4.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table4.setFillParent(true);
        table4.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
       
        String chapterFirstTitle = "Moses Given Powerful Signs";

        String firstContent = "1 Then Moses answered, “But behold, they will not believe me or listen to my voice, for they will say, \n" +
                "‘The LORD did not appear to you.’” \n" +
                "2 The LORD said to him, “What is that in your hand?” He said, “A staff.” \n" +
                "3 And he said, “Throw it on the ground.” So he threw it on the ground, and it became a serpent, and Moses ran from it. \n" +
                "4 But the LORD said to Moses, “Put out your hand and catch it by the tail”—so he put out his hand and caught it, \n" +
                "and it became a staff in his hand—\n" +
                "5 “that they may believe that the LORD, the God of their fathers, the God of Abraham, the God of Isaac, and the God of Jacob, has appeared to you.”\n" +
                "6 Again, the LORD said to him, “Put your hand inside your cloak.”And he put his hand inside his cloak, and when he took it out, behold, \n" +
                "his hand was leprous like snow. \n" +
                "7 Then God said, “Put your hand back inside your cloak.” So he put his hand back inside his cloak, and when he took it out, behold, \n" +
                "it was restored like the rest of his flesh. \n" +
                "8 “If they will not believe you,” God said, “or listen to the first sign, they may believe the latter sign. \n" +
                "9 If they will not believe even these two signs or listen to your voice, you shall take some water from the Nile and pour it on the dry ground, \n" +
                "and the water that you shall take from the Nile will become blood on the dry ground.”\n" +
                "10 But Moses said to the LORD, “Oh, my Lord, I am not eloquent, either in the past or since you have spoken to your servant, \n" +
                "but I am slow of speech and of tongue.”\n" +
                " 11 Then the LORD said to him, “Who has made man's mouth? Who makes him mute, or deaf, or seeing, or blind? Is it not I, the LORD? \n" +
                "12 Now therefore go, and I will be with your mouth and teach you what you shall speak.” \n" +
                "13 But he said, “Oh, my Lord, please send someone else.” \n" +
                "14 Then the anger of the LORD was kindled against Moses and he said, “Is there not Aaron, your brother, the Levite? \n" +
                "I know that he can speak well. Behold, he is coming out to meet you, and when he sees you, he will be glad in his heart. \n" +
                "15 You shall speak to him and put the words in his mouth, and I will be with your mouth and with his mouth and will teach you both what to do.\n" +
                "16 He shall speak for you to the people, and he shall be your mouth, and you shall be as God to him. \n" +
                "17 And take in your hand this staff, with which you shall do the signs.”\n" +
                "Moses Returns to Egypt\n" +
                "18 Moses went back to Jethro his father-in-law and said to him, “Please let me go back to my brothers in Egypt to see \n" +
                "whether they are still alive.” And Jethro said to Moses, “Go in peace.” \n" +
                "19 And the LORD said to Moses in Midian, “Go back to Egypt, for all the men who were seeking your life are dead.” \n" +
                "20 So Moses took his wife and his sons and had them ride on a donkey, and went back to the land of Egypt. \n" +
                "And Moses took the staff of God in his hand.\n" +
                "21 And the LORD said to Moses, “When you go back to Egypt, see that you do before Pharaoh all the miracles that I have put in your power. \n" +
                "But I will harden his heart, so that he will not let the people go. \n" +
                "22 Then you shall say to Pharaoh, ‘Thus says the LORD, Israel is my firstborn son, \n" +
                "23 and I say to you, “Let my son go that he may serve me.” If you refuse to let him go, behold, I will kill your firstborn son.’”\n" +
                "24 At a lodging place on the way the LORD met him and sought to put him to death. \n" +
                "25 Then Zipporah took a flint and cut off her son's foreskin and touched Moses'3 feet with it and said, \n" +
                "“Surely you are a bridegroom of blood to me!” \n" +
                "26 So he let him alone. It was then that she said, “A bridegroom of blood,” because of the circumcision.\n" +
                "27 The LORD said to Aaron, “Go into the wilderness jto meet Moses.” So he went and met him at the mountain of God and kissed him. \n" +
                "28 And Moses told Aaron all the words of the LORD with which he had sent him to speak, and all the signs that he had commanded him to do. \n" +
                "29 Then Moses and Aaron went and gathered together all the elders of the people of Israel. \n" +
                "30 Aaron spoke all the words that the LORD had spoken to Moses and did the signs in the sight of the people. \n" +
                "31 And the people believed; and when they heard that the LORD had visited the people of Israel and that he had seen their affliction, \n" +
                "they bowed their heads and worshiped.\n";

      

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

    public void chapterFiveOFExodus() {

        table5 = new Table();
        table5.setWidth(tableBG.getWidth());
        table5.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table5.setFillParent(true);
        table5.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

       
        String chapterFirstTitle = "Making Bricks Without Straw";

        String firstContent = "1 Afterward Moses and Aaron went and said to Pharaoh, “Thus says the LORD, the God of Israel, \n" +
                "‘Let my people go, that they may hold ta feast to me in the wilderness.’” \n" +
                "2 But Pharaoh said, “Who is the LORD, that I should obey his voice and let Israel go? \n" +
                "I do not know the LORD, and moreover, I will not let Israel go.” \n" +
                "3 Then they said, “The God of the Hebrews has met with us. Please let us go a three days' journey into the wilderness \n" +
                "that we may sacrifice to the LORD our God, lest he fall upon us with pestilence or with the sword.” \n" +
                "4 But the king of Egypt said to them, “Moses and Aaron, why do you take the people away from their work? Get back to your burdens.” \n" +
                "5 And Pharaoh said, “Behold, the people of the land are now many,1 and you make them rest from their burdens!”\n" +
                "6 The same day Pharaoh commanded the taskmasters of the people and their foremen, \n" +
                "7 “You shall no longer give the people straw to make bricks, as in the past; let them go and gather straw for themselves. \n" +
                "8 But the number of bricks that they made in the past you shall impose on them, you shall by no means reduce it, for they are idle. \n" +
                "Therefore they cry, ‘Let us go and offer sacrifice to our God.’ \n" +
                "9 Let heavier work be laid on the men that they may labor at it and pay no regard to lying words.”\n" +
                "10 So the taskmasters and the foremen of the people went out and said to the people, “Thus says Pharaoh, ‘I will not give you straw. \n" +
                "11 Go and get your straw yourselves wherever you can find it, but your work will not be reduced in the least.’” \n" +
                "12 So the people were scattered throughout all the land of Egypt to gather stubble for straw. \n" +
                "13 The taskmasters were urgent, saying, “Complete your work, your daily task each day, as when there was straw.” \n" +
                "14 And the foremen of the people of Israel, whom Pharaoh's taskmasters had set over them, were beaten and were asked, \n" +
                "“Why have you not done all your task of making bricks today and yesterday, as in the past?”\n" +
                "15 Then the foremen of the people of Israel came and cried to Pharaoh, “Why do you treat your servants like this? \n" +
                "16 No straw is given to your servants, yet they say to us, ‘Make bricks!’ And behold, your servants are beaten; \n" +
                "but the fault is in your own people.” \n" +
                "17 But he said, “You are idle, you are idle; that is why you say, ‘Let us go and sacrifice to the LORD.’ \n" +
                "18 Go now and work. No straw will be given you, but you must still deliver the same number of bricks.” \n" +
                "19 The foremen of the people of Israel saw that they were in trouble when they said, “You shall by no means reduce your number of bricks, \n" +
                "your daily task each day.” \n" +
                "20 They met Moses and Aaron, who were waiting for them, as they came out from Pharaoh; \n" +
                "21 and they said to them, “The LORD look on you and judge, because you have made us stink in the sight of Pharaoh and his servants, \n" +
                "and have put a sword in their hand to kill us.”\n" +
                "22 Then Moses turned to the LORD and said, “O Lord, why have you done evil to this people? Why did you ever send me? \n" +
                "23 For since I came to Pharaoh to speak in your name, he has done evil to this people, and you have not delivered your people at all.”\n";

      

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


    public void chapterSixOFExodus() {

        table6 = new Table();
        table6.setWidth(tableBG.getWidth());
        table6.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table6.setFillParent(true);
        table6.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    
        String chapterFirstTitle = "God Promises Deliverance";

        String firstContent = "1 But the LORD said to Moses, “Now you shall see what I will do to Pharaoh; for with a strong hand he will send them out, \n" +
                "and with a strong hand he will drive them out of his land.”\n" +
                "2 God spoke to Moses and said to him, “I am the LORD. \n" +
                "3 I appeared to Abraham, to Isaac, and to Jacob, as God Almighty,1 but by my name the LORD I did not make myself known to them. \n" +
                "4 I also established my covenant with them to give them the land of Canaan, the land in which they lived as sojourners. \n" +
                "5 Moreover, I have heard the groaning of the people of Israel whom the Egyptians hold as slaves, and I have remembered my covenant. \n" +
                "6 Say therefore to the people of Israel, ‘I am the LORD, and I will bring you out from under the burdens of the Egyptians, \n" +
                "and I will deliver you from slavery to them, and oI will redeem you with an outstretched arm and with great acts of judgment.\n" +
                "7 I will take you to be my people, and I will be your God, and you shall know that mI am the LORD your God, \n" +
                "who has brought you out from under the burdens of the Egyptians. \n" +
                "8 I will bring you into the land that I swore to give to Abraham, to Isaac, and to Jacob. I will give it to you for a possession. I am the LORD.’”\n" +
                " 9 Moses spoke thus to the people of Israel, but they did not listen to Moses, because of their broken spirit and harsh slavery.\n" +
                "10 So the LORD said to Moses, \n" +
                "11 “Go in, tell Pharaoh king of Egypt to let the people of Israel go out of his land.” \n" +
                "12 But Moses said to the LORD, “Behold, the people of Israel have not listened to me. How then shall Pharaoh listen to me, \n" +
                "for I am of uncircumcised lips?” \n" +
                "13 But the LORD spoke to Moses and Aaron and gave them a charge about the people of Israel and about Pharaoh king of Egypt: \n" +
                "to bring the people of Israel out of the land of Egypt.\n";

        String chapterSecondTitle = "The Genealogy of Moses and Aaron";

        String secondContent = "14 These are the heads of their fathers' houses: the sons of Reuben, the firstborn of Israel: Hanoch, Pallu, Hezron, and Carmi; \n" +
                "these are the clans of Reuben. \n" +
                "15 The sons of Simeon: Jemuel, Jamin, Ohad, Jachin, Zohar, and Shaul, the son of a Canaanite woman; these are the clans of Simeon. \n" +
                "16 These are the names of the sons of Levi according to their generations: Gershon, Kohath, and Merari, the years of the life of Levi being 137 years. \n" +
                "17 The sons of Gershon: Libni and Shimei, by their clans. \n" +
                "18 The sons of Kohath: Amram, Izhar, Hebron, and Uzziel, the years of the life of Kohath being 133 years. \n" +
                "19 Thasons of Merari: Mahli and Mushi. These are the clans of the Levites according to their generations. \n" +
                "20 Amram took as his wife Jochebed his father's sister, and she bore him Aaron and Moses, the years of the life of Amram being 137 years. \n" +
                "21 The sons of Izhar: Korah, Nepheg, and Zichri. \n" +
                "22 The sons of Uzziel: Mishael, Elzaphan, and Sithri. \n" +
                "23 Aaron took as his wife Elisheba, the daughter of Amminadab and the sister of Nahshon, and she bore him Nadab, Abihu, Eleazar, and Ithamar. \n" +
                "24 The sons of Korah: Assir, Elkanah, and Abiasaph; these are the clans of the Korahites. \n" +
                "25 Eleazar, Aaron's son, took as his wife one of the daughters of Putiel, and she bore him Phinehas. These are the heads of the fathers'\n" +
                " houses of the Levites by their clans.\n" +
                "26 These are the Aaron and Moses to whom the LORD said: “Bring out the people of Israel from the land of Egypt by their hosts.” \n" +
                "27 It was they who spoke to Pharaoh king of Egypt about bringing out the people of Israel from Egypt, this Moses and this Aaron.\n" +
                "28 On the day when the LORD spoke to Moses in the land of Egypt,\n" +
                "29 the LORD said to Moses, “I am the LORD; tell Pharaoh king of Egypt all that I say to you.” \n" +
                "30 But Moses said to the LORD, “Behold, I am of uncircumcised lips. How will Pharaoh listen to me?”\n";

      
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

    public void chapterSevenOFExodus() {

        table7 = new Table();
        table7.setWidth(tableBG.getWidth());
        table7.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table7.setFillParent(true);
        table7.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));


        String chapterFirstTitle = "Moses and Aaron Before Pharaoh";

        String firstContent = "1 And the LORD said to Moses, “See, I have made you like God to Pharaoh, and your brother Aaron shall be your prophet. \n" +
                "2 You shall speak all that I command you, and your brother Aaron shall tell Pharaoh to let the people of Israel go out of his land. \n" +
                "3 But I will harden Pharaoh's heart, and though I multiply my signs and wonders in the land of Egypt, \n" +
                "4 Pharaoh will not listen to you. Then I will lay my hand on Egypt and bring my hosts, my people the children of Israel, \n" +
                "out of the land of Egypt by great acts of judgment. \n" +
                "5 The Egyptians shall know that I am the LORD, when I stretch out my hand against Egypt and bring out the people of Israel from among them.” \n" +
                "6 Moses and Aaron did so; they did just as the LORD commanded them. \n" +
                "7 Now Moses was eighty years old, and Aaron eighty-three years old, when they spoke to Pharaoh.\n" +
                "8 Then the LORD said to Moses and Aaron, \n" +
                "9 “When Pharaoh says to you, ‘Prove yourselves by working a miracle,’ then you shall say to Aaron, \n" +
                "‘Take your staff and cast it down before Pharaoh, that it may become a serpent.’” \n" +
                "10 So Moses and Aaron went to Pharaoh and did just as the LORD commanded. Aaron cast down his staff before Pharaoh and his servants, \n" +
                "and it became a serpent. \n" +
                "11 Then Pharaoh summoned the wise men and the sorcerers, and they, the wmagicians of Egypt, also did the same by their secret arts. \n" +
                "12 For each man cast down his staff, and they became serpents. But Aaron's staff swallowed up their staffs. \n" +
                "13 Still Pharaoh's heart was hardened, and he would not listen to them, ras the LORD had said.\n" +
                "The First Plague: Water Turned to Blood\n" +
                "14 Then the LORD said to Moses, “Pharaoh's heart is hardened; he refuses to let the people go. \n" +
                "15 Go to Pharaoh in the morning, as he is going out to the water. Stand on the bank of the Nile to meet him, \n" +
                "and take in your hand the staff that turned into a serpent. \n" +
                "16 And you shall say to him, ‘The LORD, the God of the Hebrews, sent me to you, saying, “Let my people go, \n" +
                "that they may serve me in the wilderness.” But so far, you have not obeyed. \n" +
                "17 Thus says the LORD, “By this you shall know that I am the LORD: behold, with the staff that is in my hand \n" +
                "I will strike the water that is in the Nile, and it shall turn into blood. \n" +
                "18 The fish in the Nile shall die, and the Nile will stink, and the Egyptians will grow weary of drinking water from the Nile.”’” \n" +
                "19 And the LORD said to Moses, “Say to Aaron, ‘Take your staff and stretch out your hand over the waters of Egypt, \n" +
                "over their rivers, their canals, and their ponds, and all their pools of water, so that they may become blood, \n" +
                "and there shall be blood throughout all the land of Egypt, even in vessels of wood and in vessels of stone.’”\n" +
                "20 Moses and Aaron did as the LORD commanded. In the sight of Pharaoh and in the sight of his servants he lifted up the staff \n" +
                "and struck the water in the Nile, and all the water in the Nile turned into blood.\n" +
                "21 And the fish in the Nile died, and the Nile stank, so that the Egyptians could not drink water from the Nile. \n" +
                "There was blood throughout all the land of Egypt. \n" +
                "22 But the magicians of Egypt did the same by their secret arts. So Pharaoh's heart remained hardened, and \n" +
                "he would not listen to them, as the LORD had said. \n" +
                "23 Pharaoh turned and went into his house, and he did not take even this to heart. \n" +
                "24 And all the Egyptians dug along the Nile for water to drink, for they could not drink the water of the Nile.\n" +
                "25 Seven full days passed after the LORD had struck the Nile.\n";


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


    public void chapterEightOFExodus() {

        table8 = new Table();
        table8.setWidth(tableBG.getWidth());
        table8.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table8.setFillParent(true);
        table8.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));     

        String chapterFirstTitle = "The Second Plague: Frogs";

        String firstContent = "1 Then the LORD said to Moses, “Go in to Pharaoh and say to him, ‘Thus says the LORD, \n" +
                "“Let my people go, that they may serve me.\n" +
                "2 But if you refuse to let them go, behold, I will plague all your country with frogs. \n" +
                "3 The Nile shall swarm with frogs that shall come up into your house and into your bedroom and on your bed \n" +
                "and into the houses of your servants and your people, and into your ovens and your kneading bowls. \n" +
                "4 The frogs shall come up on you and on your people and on all your servants.”’”\n" +
                " 5 3 And the LORD said to Moses, “Say to Aaron, ‘Stretch out your hand with your staff over the rivers, over the canals and over the pools, \n" +
                "and make frogs come up on the land of Egypt!’” \n" +
                "6 So Aaron stretched out his hand over the waters of Egypt, and the frogs came up and covered the land of Egypt. \n" +
                "7 But tthe magicians did the same by their secret arts and made frogs come up on the land of Egypt.\n" +
                "8 Then Pharaoh called Moses and Aaron and said, “Plead with the LORD to take away the frogs from me and from my people, \n" +
                "and I will let the people go to sacrifice to the LORD.” \n" +
                "9 Moses said to Pharaoh, “Be pleased to command me when I am to plead for you and for your servants and for your people, \n" +
                "that the frogs be cut off from you and your houses and be left only in the Nile.” \n" +
                "10 And he said, “Tomorrow.” Moses said, “Be it as you say, so that you may know that there is no one like the LORD our God. \n" +
                "11 The frogs shall go away from you and your houses and your servants and your people. They shall be left only in the Nile.”\n" +
                "12 So Moses and Aaron went out from Pharaoh, and Moses cried to the LORD about the frogs, as he had agreed with Pharaoh.4 \n" +
                "13 And the LORD did according to the word of Moses. The frogs died out in the houses, the courtyards, and the fields. \n" +
                "14 And they gathered them together in heaps, and the land stank. 15 But when Pharaoh saw that there was a respite, \n" +
                "he hardened his heart and would not listen to them, as the LORD had said.\n";

        String chapterSecondTitle = "The Third Plague: Gnats";

        String secondContent = "16 Then the LORD said to Moses, “Say to Aaron, ‘Stretch out your staff and strike the dust of the earth, \n" +
                "so that it may become gnats in all the land of Egypt.’” \n" +
                "17 And they did so. Aaron stretched out his hand with his staff and struck the dust of the earth, and there were gnats on man and beast. \n" +
                "All the dust of the earth became gnats in all the land of Egypt. \n" +
                "18 The magicians tried by their secret arts to produce gnats, but they could not. So there were gnats on man and beast. \n" +
                "19 Then the magicians said to Pharaoh, “This is the finger of God.” But Pharaoh's heart was hardened, and he would not listen to them, \n" +
                "as the LORD had said.\n";

        String chapterThirdTitle = "The Fourth Plague: Flies";

        String thirdContent = "20 Then the LORD said to Moses, “Rise up early in the morning and present yourself to Pharaoh, as he goes out to the water, \n" +
                "and say to him, ‘Thus says the LORD, “Let my people go, that they may serve me. \n" +
                "21 Or else, if you will not let my people go, behold, I will send swarms of flies on you and your servants and your people, and into your houses. \n" +
                "And the houses of the Egyptians shall be filled with swarms of flies, and also the ground on which they stand. \n" +
                "22 But on that day I will set apart the land of Goshen, where my people dwell, so that no swarms of flies shall be there, t\n" +
                "hat you may know that I am the LORD in the midst of the earth.5 \n" +
                "23 Thus I will put a division6 between my people and your people. Tomorrow this sign shall happen.”’” \n" +
                "24 And the LORD did so. There came great swarms of flies into the house of Pharaoh and into his servants' houses. \n" +
                "Throughout all the land of Egypt the land was ruined by the swarms of flies.\n" +
                "25 Then Pharaoh called Moses and Aaron and said, “Go, sacrifice to your God within the land.” \n" +
                "26 But Moses said, “It would not be right to do so, for the offerings we shall sacrifice to the LORD our God are an abomination to the Egyptians. \n" +
                "If we sacrifice offerings abominable to the Egyptians before their eyes, will they not stone us? \n" +
                "27 We must go three days' journey into the wilderness and sacrifice to the LORD our God las he tells us.” \n" +
                "28 So Pharaoh said, “I will let you go to sacrifice to the LORD your God in the wilderness; only you must not go very far away. Plead for me.” \n" +
                "29 Then Moses said, “Behold, I am going out from you and I will plead with the LORD that the swarms of flies may depart from Pharaoh, \n" +
                "from his servants, and from his people, tomorrow. Only let not Pharaoh cheat again by not letting the people go to sacrifice to the LORD.” \n" +
                "30 So Moses went out from Pharaoh and prayed to the LORD. \n" +
                "31 And the LORD did as Moses asked, and removed the swarms of flies from Pharaoh, from his servants, and from his people; not one remained. \n" +
                "32 But Pharaoh hardened his heart this time also, and did not let the people go.\n";

 
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
        table8.row();

        //title of the third content
        table8.add(lblThirdTitle).pad(10,50,0,0).left();
        table8.row();

        //content of the third title
        table8.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table8);


    }


    public void chapterNineOFExodus() {

        table9 = new Table();
        table9.setWidth(tableBG.getWidth());
        table9.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table9.setFillParent(true);
        table9.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));


        String chapterFirstTitle = "The Fifth Plague: Egyptian Livestock Die";

        String firstContent = "1 Then the LORD said to Moses, “Go in to Pharaoh and say to him, ‘Thus says qthe LORD, the God of the Hebrews, \n" +
                "“Let my people go, that they may serve me. \n" +
                "2 For if you refuse to let them go and still hold them, \n" +
                "3 behold, the hand of the LORD will fall with a very severe plague upon your livestock that are in the field, the horses, \n" +
                "the donkeys, the camels, the herds, and the flocks. \n" +
                "4 But the LORD will make a distinction between the livestock of Israel and the livestock of Egypt, \n" +
                "so that nothing of all that belongs to the people of Israel shall die.”’”\n" +
                "5 And the LORD set a time, saying, “Tomorrow the LORD will do this thing in the land.” \n" +
                "6 And the next day the LORD did this thing. All the livestock of the Egyptians died, but not one of the livestock of the people of Israel died.\n" +
                "7 And Pharaoh sent, and behold, not one of the livestock of Israel was dead. But the heart of Pharaoh was hardened, and he did not let the people go.\n";

        String chapterSecondTitle = "The Sixth Plague: Boils";

        String secondContent = "8 And the LORD said to Moses and Aaron, “Take handfuls of soot from the kiln, and let Moses throw them in the air \n" +
                "in the sight of Pharaoh. \n" +
                "9 It shall become fine dust over all the land of Egypt, and become boils breaking out in sores on man and beast throughout all the land of Egypt.” \n" +
                "10 So they took soot from the kiln and stood before Pharaoh. And Moses threw it in the air, and it became boils \n" +
                "breaking out in sores on man and beast. \n" +
                "11 And the magicians could not stand before Moses because of the boils, for the boils came upon the magicians and upon all the Egyptians. \n" +
                "12 But the LORD hardened the heart of Pharaoh, and he did not listen to them, as the LORD had spoken to Moses.\n";

        String chapterThirdTitle = "The Seventh Plague: Hail";

        String thirdContent = "13 Then the LORD said to Moses, “Rise up early in the morning and present yourself before Pharaoh \n" +
                "and say to him, ‘Thus says the LORD, the God of the Hebrews, “Let my people go, that they may serve me.\n" +
                "14 For this time I will send all my plagues on you yourself,1 and on your servants and your people, so that you may know \n" +
                "that there is none like me in all the earth. \n" +
                "15 For by now I could have put out my hand and struck you and your people with pestilence, and you would have been cut off from the earth. \n" +
                "16 But for this purpose I have raised you up, to show you my power, so cthat my name may be proclaimed in all the earth. \n" +
                "17 You are still exalting yourself against my people and will not let them go. \n" +
                "18 Behold, about this time tomorrow I will cause very heavy hail to fall, such as never has been in Egypt from the day it was founded until now. \n" +
                "19 Now therefore send, get your livestock and all that you have in the field into safe shelter, for every man \n" +
                "and beast that is in the field and is not brought home will die when the hail falls on them.”’”\n" +
                "20 Then whoever feared the word of the LORD among the servants of Pharaoh hurried his slaves and his livestock into the houses, \n" +
                "21 but whoever did not pay attention to the word of the LORD left his slaves and his livestock in the field.\n" +
                "22 Then the LORD said to Moses, “Stretch out your hand toward heaven, so that there may be hail in all the land of Egypt, \n" +
                "on man and beast and every plant of the field, in the land of Egypt.” \n" +
                "23 Then Moses stretched out his staff toward heaven, and the GLORD sent thunder and hail, and fire ran down to the earth. \n" +
                "And the LORD rained hail upon the land of Egypt.\n" +
                "24 There was hail and fire flashing continually in the midst of the hail, very heavy hail, \n" +
                "such as had never been in all the land of Egypt since it became a nation. \n" +
                "25 The hail struck down everything that was in the field in all the land of Egypt, both man and beast. \n" +
                "And the hail struck down every plant of the field and broke every tree of the field.\n" +
                "26 Only in the land of Goshen, where the people of Israel were, was there no hail.\n" +
                "27 Then Pharaoh sent and called Moses and Aaron and said to them, “This time jI have sinned; the LORD is in the right, \n" +
                "and I and my people are in the wrong. \n" +
                "28 Plead with the LORD, for there has been enough of God's thunder and hail. I will let you go, and you shall stay no longer.”\n" +
                "29 Moses said to him, “As soon as I have gone out of the city, I will stretch out my hands to the LORD. The thunder will cease, \n" +
                "and there will be no more hail, so that you may know that the earth is the LORD's.\n" +
                "30 But as for you and your servants, I know that you do not yet fear the LORD God.” \n" +
                "31 (The flax and the barley were struck down, for the barley was in the ear and the flax was in bud. \n" +
                "32 But the wheat and the emmer2were not struck down, for they are late in coming up.) \n" +
                "33 So Moses went out of the city from Pharaoh and stretched out his hands to the LORD, and the thunder and the hail ceased, \n" +
                "and the rain no longer poured upon the earth. \n" +
                "34 But when Pharaoh saw that the rain and the hail and the thunder had ceased, he sinned yet again and hardened his heart, he and his servants. \n" +
                "35 So the heart of Pharaoh was hardened, and he did not let the people of Israel go, just as the LORD had spoken through Moses.\n";


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
        table9.row();

        //title of the third content
        table9.add(lblThirdTitle).pad(10,50,0,0).left();
        table9.row();

        //content of the third title
        table9.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table9);


    }

    public void chapterTenOFExodus() {

        table10 = new Table();
        table10.setWidth(tableBG.getWidth());
        table10.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table10.setFillParent(true);
        table10.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Eighth Plague: Locusts";

        String firstContent = "1 Then the LORD said to Moses, “Go in to Pharaoh, for I have hardened his heart and the heart of his servants, \n" +
                "that I may show these signs of mine among them, \n" +
                "2 and that you may tell in the hearing of your son and of your grandson how I have dealt harshly with the Egyptians and what signs \n" +
                "I have done among them, that you may know that I am the LORD.”\n" +
                "3 So Moses and Aaron went in to Pharaoh and said to him, “Thus says the LORD, the God of the Hebrews, \n" +
                "‘How long will you refuse to humble yourself before me? Let my people go, that they may serve me.\n" +
                "4 For if you refuse to let my people go, behold, tomorrow I will bring\n" +
                "locusts into your country,\n" +
                "5 and they shall cover the face of the land, so that no one can see the land. And they shall eat what is left to you after the hail, \n" +
                "and they shall eat every tree of yours that grows in the field,\n" +
                "6 and they shall fill your houses and the houses of all your servants and of all the Egyptians, \n" +
                "as neither your fathers nor your grandfathers have seen, from the day they came on earth to this day.’” Then he turned and went out from Pharaoh.\n" +
                "7 Then Pharaoh's servants said to him, “How long shall this man be a snare to us? Let the men go, that they may serve the LORD their God. \n" +
                "Do you not yet understand that Egypt is ruined?” \n" +
                "8 So Moses and Aaron were brought back to Pharaoh. And he said to them, “Go, serve the LORD your God. But which ones are to go?” \n" +
                "9 Moses said, “We will go with our young and our old. We will go with our sons and daughters and with our flocks and herds, \n" +
                "for we must hold a feast to the LORD.” \n" +
                "10 But he said to them, “The LORD be with you, if ever I let you and your little ones go! Look, you have some evil purpose in mind.\n" +
                "11 No! Go, the men among you, and serve the LORD, for that is what you are asking.” And they were driven out from Pharaoh's presence.\n" +
                "12 Then the LORD said to Moses, “Stretch out your hand over the land of Egypt for the locusts, so that they may come upon the land of Egypt \n" +
                "and eat every plant in the land, all that the hail has left.” \n" +
                "13 So Moses stretched out his staff over the land of Egypt, and the LORD brought an east wind upon the land all that day and all that night. \n" +
                "When it was morning, the east wind had brought the locusts. \n" +
                "14 The locusts came up over all the land of Egypt and settled on the whole country of Egypt, such a dense swarm of locusts as had never been before, \n" +
                "nor ever will be again. \n" +
                "15 They covered the face of the whole land, so that the land was darkened, and they ate all the plants in the land \n" +
                "and all the fruit of the trees that the hail had left. Not a green thing remained, neither tree nor plant of the field, \n" +
                "through all the land of Egypt. \n" +
                "16 Then Pharaoh hastily called Moses and Aaron and said, “I have sinned against the LORD your God, and against you. \n" +
                "17 Now therefore, forgive my sin, please, only this once, and plead with the LORD your God only to remove this death from me.” \n" +
                "18 So he went out from Pharaoh and pleaded with the LORD. \n" +
                "19 And the LORD turned the wind into a very strong west wind, which lifted the locusts and drove them into the Red Sea. \n" +
                "Not a single locust was left in all the country of Egypt. \n" +
                "20 But the LORD hardened Pharaoh's heart, and he did not let the people of Israel go.\n";

        String chapterSecondTitle = "The Ninth Plague: Darkness";

        String secondContent = "21 Then the LORD said to Moses, “Stretch out your hand toward heaven, that there may be darkness over the land of Egypt, \n" +
                "a darkness to be felt.” \n" +
                "22 So Moses stretched out his hand toward heaven, and there was pitch darkness in all the land of Egypt three days. \n" +
                "23 They did not see one another, nor did anyone rise from his place for three days, but all the people of Israel had light where they lived. \n" +
                "24 Then Pharaoh called Moses and said, “Go, serve the LORD; your little ones also may go with you; only let your flocks and your herds remain behind.” \n" +
                "25 But Moses said, “You must also let us have sacrifices and burnt offerings, that we may sacrifice to the LORD our God. \n" +
                "26 Our livestock also must go with us; not a hoof shall be left behind, for we must take of them to serve the LORD our God, \n" +
                "and we do not know with what we must serve the LORD until we arrive there.” \n" +
                "27 But the LORD hardened Pharaoh's heart, and he would not let them go. \n" +
                "28 Then Pharaoh said to him, “Get away from me; take care never to see my face again, for on the day you see my face you shall die.” \n" +
                "29 Moses said, “As you say! I will not see your face again.”\n";  

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);
        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table10.add(lblFirstTitle).pad(10,50,0,0).left();
        table10.row();

        //content of the chapter
        table10.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table10.row();

        //title of the second content
        table10.add(lblSecondTitle).pad(10,50,0,0).left();
        table10.row();

        //content of the second title
        table10.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table10);


    }


    public void chapterElevenOFExodus() {

        table11 = new Table();
        table11.setWidth(tableBG.getWidth());
        table11.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table11.setFillParent(true);
        table11.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "A Final Plague Threatened";

        String firstContent = "1 The LORD said to Moses, “Yet one plague more I will bring upon Pharaoh and upon Egypt. \n" +
                "Afterward he will let you go from here. When he lets you go, he will drive you away completely. \n" +
                "2 Speak now in the hearing of the people, that they ask, every man of his neighbor and every woman of her neighbor, for silver and gold jewelry.” \n" +
                "3 And the LORD gave the people favor in the sight of the Egyptians. Moreover, the man Moses was very great in the land of Egypt, \n" +
                "in the sight of Pharaoh's servants and in the sight of the people.\n" +
                "4 So Moses said, “Thus says the LORD: ‘About midnight I will go out in the midst of Egypt, \n" +
                "5 and every firstborn in the land of Egypt shall die, from the firstborn of Pharaoh who sits on his throne, \n" +
                "even to the firstborn of the slave girl who is behind the handmill, and all the firstborn of the cattle.\n" +
                "6 There shall be a great cry throughout all the land of Egypt, such as there has never been, nor ever will be again. \n" +
                "7 But not a dog shall growl against any of the people of Israel, either man or beast, that you may know that the LORD makes a \n" +
                "distinction between Egypt and Israel.’ \n" +
                "8 And ball these your servants shall come down to me and bow down to me, saying, ‘Get out, you and all the people who follow you.’ \n" +
                "And after that I will go out.” And he went out from Pharaoh in hot anger.\n" +
                "9 Then the LORD said to Moses, “Pharaoh will not listen to you, that my wonders may be multiplied in the land of Egypt.”\n" +
                "10 Moses and Aaron did all these wonders before Pharaoh, and the LORD hardened Pharaoh's heart, \n" +
                "and he did not let the people of Israel go out of his land.\n";
      

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

    public void chapterTwelveOFExodus() {

        table12 = new Table();
        table12.setWidth(tableBG.getWidth());
        table12.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table12.setFillParent(true);
        table12.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Passover";

        String firstContent = "1 The Lord said to Moses and Aaron in the land of Egypt,\n" +
                "2 “This month shall be for you the beginning of months. It shall be the first month of the year for you. \n" +
                "3 Tell all the congregation of Israel that on the tenth day of this month every man shall take a lamb according to their fathers' houses, \n" +
                "a lamb for a household. \n" +
                "4 And if the household is too small for a lamb, then he and his nearest neighbor shall take according to the number of persons; \n" +
                "according to what each can eat you shall make your count for the lamb.\n" +
                "5 Your lamb shall be without blemish, a male a year old. You may take it from the sheep or from the goats, \n" +
                "6 and you shall keep it until the fourteenth day of this month, when the whole assembly of the congregation of Israel \n" +
                "shall kill their lambs at twilight.\n" +
                "7 “Then they shall take some of the blood and put it on the two doorposts and the lintel of the houses in which they eat it. \n" +
                "8 They shall eat the flesh that night, roasted on the fire; with unleavened bread and bitter herbs they shall eat it. \n" +
                "9 Do not eat any of it raw or boiled in water, but roasted, its head with its legs and its inner parts. \n" +
                "10 And you shall let none of it remain until the morning; anything that remains until the morning you shall burn.\n" +
                "11 In this manner you shall eat it: with your belt fastened, your sandals on your feet, and your staff in your hand. \n" +
                "And you shall eat it in haste. It is the Lord's Passover. \n" +
                "12 For I will pass through the land of Egypt that night, and I will strike all the firstborn in the land of Egypt, \n" +
                "both man and beast; and on all the gods of Egypt I will execute judgments: I am the Lord. \n" +
                "13 The blood shall be a sign for you, on the houses where you are. And when I see the blood, I will pass over you, \n" +
                "and no plague will befall you to destroy you, when I strike the land of Egypt.\n" +
                "14 “This day shall be for you a memorial day, and you shall keep it as a feast to the Lord; throughout your generations, \n" +
                "as a statute forever, you shall keep it as a feast. \n" +
                "15 Seven days you shall eat unleavened bread. On the first day you shall remove leaven out of your houses, \n" +
                "for if anyone eats what is leavened, from the first day until the seventh day, that person shall be cut off from Israel. \n" +
                "16 On the first day you shall hold a holy assembly, and on the seventh day a holy assembly. No work shall be done on those days. \n" +
                "But what everyone needs to eat, that alone may be prepared by you. \n" +
                "17 And you shall observe the Feast of Unleavened Bread, for on this very day I brought your hosts out of the land of Egypt. \n" +
                "Therefore you shall observe this day, throughout your generations, as a statute forever. \n" +
                "18 In the first month, from the fourteenth day of the month at evening, you shall eat unleavened bread \n" +
                "until the twenty-first day of the month at evening. 19 For seven days no leaven is to be found in your houses. \n" +
                "If anyone eats what is leavened, that person will be cut off from the congregation of Israel, whether he is a sojourner or a native of the land. \n" +
                "20 You shall eat nothing leavened; in all your dwelling places you shall eat unleavened bread.”\n" +
                "21 Then Moses called all the elders of Israel and said to them, “Go and select lambs for yourselves according to your clans, \n" +
                "and kill the Passover lamb. \n" +
                "22 Take a bunch of hyssop and dip it in the blood that is in the basin, and touch the lintel and the two doorposts with the blood \n" +
                "that is in the basin. None of you shall go out of the door of his house until the morning. \n" +
                "23 For the Lord will pass through to strike the Egyptians, and when he sees the blood on the lintel and on the two doorposts, \n" +
                "the Lord will pass over the door and will not allow the destroyer to enter your houses to strike you.\n" +
                "24 You shall observe this rite as a statute for you and for your sons forever. \n" +
                "25 And when you come to the land that the Lord will give you, as he has promised, you shall keep this service.\n" +
                "26 And when your children say to you, ‘What do you mean by this service?’ \n" +
                "27 you shall say, ‘It is the sacrifice of the Lord's Passover, for he passed over the houses of the people of Israel in Egypt, \n" +
                "when he struck the Egyptians but spared our houses.’” And the people bowed their heads and worshiped.\n" +
                "28 Then the people of Israel went and did so; as the Lord had commanded Moses and Aaron, so they did.\n";

        String chapterSecondTitle = "The Tenth Plague: Death of the Firstborn";

        String secondContent = "29 At midnight the Lord struck down all the firstborn in the land of Egypt, from the firstborn of Pharaoh \n" +
                "who sat on his throne to the firstborn of the captive who was in the dungeon, and all the firstborn of the livestock. \n" +
                "30 And Pharaoh rose up in the night, he and all his servants and all the Egyptians. And there was a great cry in Egypt, \n" +
                "for there was not a house where someone was not dead. \n" +
                "31 Then he summoned Moses and Aaron by night and said, “Up, go out from among my people, both you and the people of Israel; \n" +
                "and go, serve the Lord, as you have said.\n" +
                "32 Take your flocks and your herds, as you have said, and be gone, and bless me also!”\n";


        String chapterThirdTitle = "The Exodus";

        String thirdContent = "33 The Egyptians were urgent with the people to send them out of the land in haste. For they said, “We shall all be dead.” \n" +
                "34 So the people took their dough before it was leavened, their kneading bowls being bound up in their cloaks on their shoulders. \n" +
                "35 The people of Israel had also done as Moses told them, for they had asked the Egyptians for silver and gold jewelry and for clothing. \n" +
                "36 And the Lord had given the people favor in the sight of the Egyptians, so that they let them have what they asked. \n" +
                "Thus they plundered the Egyptians.\n" +
                "37 And the people of Israel journeyed from Rameses to Succoth, about six hundred thousand men on foot, besides women and children. \n" +
                "38 A mixed multitude also went up with them, and very much livestock, both flocks and herds. \n" +
                "39 And they baked unleavened cakes of the dough that they had brought out of Egypt, for it was not leavened, \n" +
                "because they were thrust out of Egypt and could not wait, nor had they prepared any provisions for themselves.\n" +
                "40 The time that the people of Israel lived in Egypt was 430 years. \n" +
                "41 At the end of 430 years, on that very day, all the hosts of the Lord went out from the land of Egypt. \n" +
                "42 It was a night of watching by the Lord, to bring them out of the land of Egypt; so this same night is a night of watching kept to the Lord \n" +
                "by all the people of Israel throughout their generations.\n";

        String chapterFourthTitle = "Institution of the Passover";

        String fourthContent = "43 And the Lord said to Moses and Aaron, “This is the statute of the Passover: no foreigner shall eat of it, \n" +
                "44 but every slave that is bought for money may eat of it after you have circumcised him. \n" +
                "45 No foreigner or hired worker may eat of it. \n" +
                "46 It shall be eaten in one house; you shall not take any of the flesh outside the house, and you shall not break any of its bones. \n" +
                "47 All the congregation of Israel shall keep it. \n" +
                "48 If a stranger shall sojourn with you and would keep the Passover to the Lord, let all his males be circumcised. \n" +
                "Then he may come near and keep it; he shall be as a native of the land. But no uncircumcised person shall eat of it.\n" +
                "49 There shall be one law for the native and for the stranger who sojourns among you.”\n" +
                "50 All the people of Israel did just as the Lord commanded Moses and Aaron. \n" +
                "51 And on that very day the Lord brought the people of Israel out of the land of Egypt by their hosts.\n";


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

        //title of the chapter
        table12.add(lblFirstTitle).pad(10,50,0,0).left();
        table12.row();

        //content of the chapter
        table12.add(txtFirstContent).pad(10,70,0,0).left();
        table12.row();

        //title of the second content
        table12.add(lblSecondTitle).pad(10,50,0,0).left();
        table12.row();

        //content of the second title
        table12.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table12.row();

        //title of the third content
        table12.add(lblThirdTitle).pad(10,50,0,0).left();
        table12.row();

        //content of the third title
        table12.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table12);


    }


    public void chapterThirteenOFExodus() {

        table13 = new Table();
        table13.setWidth(tableBG.getWidth());
        table13.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table13.setFillParent(true);
        table13.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Consecration of the Firstborn";

        String firstContent = "1 The Lord said to Moses, \n" +
                "2 “Consecrate to me all the firstborn. Whatever is the first to open the womb among the people of Israel, both of man and of beast, is mine.”\n";


        String chapterSecondTitle = "The Feast of Unleavened Bread";

        String secondContent = "3 Then Moses said to the people, “Remember this day in which you came out from Egypt, out of the house of slavery, \n" +
                "for by a strong hand the Lord brought you out from this place. No leavened bread shall be eaten.\n" +
                "4 Today, in the month of Abib, you are going out. \n" +
                "5 And when the Lord brings you into the land of the Canaanites, the Hittites, the Amorites, the Hivites, \n" +
                "and the Jebusites, which he swore to your fathers to give you, a land flowing with milk and honey, you shall keep this service in this month. \n" +
                "6 Seven days you shall eat unleavened bread, and on the seventh day there shall be a feast to the Lord. \n" +
                "7 Unleavened bread shall be eaten for seven days; no leavened bread shall be seen with you, \n" +
                "and no leaven shall be seen with you in all your territory. \n" +
                "8 You shall tell your son on that day, ‘It is because of what the Lord did for me when I came out of Egypt.’ \n" +
                "9 And it shall be to you as a sign on your hand and as a memorial between your eyes, that the law of the Lord may be in your mouth. \n" +
                "For with a strong hand the Lord has brought you out of Egypt.\n" +
                "10 You shall therefore keep this statute at its appointed time from year to year.\n" +
                "11 “When the Lord brings you into the land of the Canaanites, as he swore to you and your fathers, and shall give it to you, \n" +
                "12 you shall set apart to the Lord all that first opens the womb. All the firstborn of your animals that are males shall be the Lord's. \n" +
                "13 Every firstborn of a donkey you shall redeem with a lamb, or if you will not redeem it you shall break its neck. \n" +
                "Every firstborn of man among your sons you shall redeem. \n" +
                "14 And when in time to come your son asks you, ‘What does this mean?’ you shall say to him, \n" +
                "‘By a strong hand the Lord brought us out of Egypt, from the house of slavery. \n" +
                "15 For when Pharaoh stubbornly refused to let us go, the Lord killed all the firstborn in the land of Egypt, \n" +
                "both the firstborn of man and the firstborn of animals. Therefore I sacrifice to the Lord all the males that first open the womb, \n" +
                "but all the firstborn of my sons I redeem.’ \n" +
                "16 It shall be as a mark on your hand or frontlets between your eyes, for by a strong hand the Lord brought us out of Egypt.”\n";

        String chapterThirdTitle = "Pillars of Cloud and Fire";

        String thirdContent = "17 When Pharaoh let the people go, God did not lead them by way of the land of the Philistines, \n" +
                "although that was near. For God said, “Lest the people change their minds when they see war and return to Egypt.”\n" +
                "18 But God led the people around by the way of the wilderness toward the Red Sea. And the people of Israel went up out of the land of Egypt \n" +
                "equipped for battle. \n" +
                "19 Moses took the bones of Joseph with him, for Joseph had made the sons of Israel solemnly swear, saying, “God will surely visit you,\n" +
                " and you shall carry up my bones with you from here.”\n" +
                "20 And they moved on from Succoth and encamped at Etham, on the edge of the wilderness. \n" +
                "21 And the Lord went before them by day in a pillar of cloud to lead them along the way, and by night in a pillar of fire to give them light,\n" +
                " that they might travel by day and by night. \n" +
                "22 The pillar of cloud by day and the pillar of fire by night did not depart from before the people.\n";

  
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
        table13.add(lblFirstTitle).pad(10,50,0,0).left();
        table13.row();

        //content of the chapter
        table13.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table13.row();

        //title of the second content
        table13.add(lblSecondTitle).pad(10,50,0,0).left();
        table13.row();

        //content of the second title
        table13.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table13.row();

        //title of the third content
        table13.add(lblThirdTitle).pad(10,50,0,0).left();
        table13.row();

        //content of the third title
        table13.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table13);


    }


    public void chapterFourteenOFExodus() {

        table14 = new Table();
        table14.setWidth(tableBG.getWidth());
        table14.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table14.setFillParent(true);
        table14.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Crossing the Red Sea";

        String firstContent = "1  Then the Lord said to Moses,\n" +
                "2 “Tell the people of Israel to turn back and encamp in front of Pi-hahiroth, between Migdol and the sea, in front of Baal-zephon; \n" +
                "you shall encamp facing it, by the sea. \n" +
                "3 For Pharaoh will say of the people of Israel, ‘They are wandering in the land; the wilderness has shut them in.’\n" +
                "4 And I will harden Pharaoh's heart, and he will pursue them, and I will get glory over Pharaoh and all his host, \n" +
                "and the Egyptians shall know that I am the Lord.” And they did so.\n" +
                "5 When the king of Egypt was told that the people had fled, the mind of Pharaoh and his servants was changed toward the people, and they said, \n" +
                "“What is this we have done, that we have let Israel go from serving us?”\n" +
                "6 So he made ready his chariot and took his army with him, \n" +
                "7 and took six hundred chosen chariots and all the other chariots of Egypt with officers over all of them. \n" +
                "8 And the Lord hardened the heart of Pharaoh king of Egypt, and he pursued the people of Israel while the people of Israel were going out defiantly.\n" +
                "9 The Egyptians pursued them, all Pharaoh's horses and chariots and his horsemen and his army, and overtook them encamped at the sea, \n" +
                "by Pi-hahiroth, in front of Baal-zephon.\n" +
                "10 When Pharaoh drew near, the people of Israel lifted up their eyes, and behold, the Egyptians were marching after them, and they feared greatly. \n" +
                "And the people of Israel cried out to the Lord. \n" +
                "11 They said to Moses, “Is it because there are no graves in Egypt that you have taken us away to die in the wilderness? \n" +
                "What have you done to us in bringing us out of Egypt? \n" +
                "12 Is not this what we said to you in Egypt: ‘Leave us alone that we may serve the Egyptians’? For it would have been better \n" +
                "for us to serve the Egyptians than to die in the wilderness.” \n" +
                "13 And Moses said to the people, “Fear not, stand firm, and see the salvation of the Lord, which he will work for you today. \n" +
                "For the Egyptians whom you see today, you shall never see again. \n" +
                "14 The Lord will fight for you, and you have only to be silent.”\n" +
                "15 The Lord said to Moses, “Why do you cry to me? Tell the people of Israel to go forward.\n" +
                "16 Lift up your staff, and stretch out your hand over the sea and divide it, that the people of Israel may go through the sea on dry ground. \n" +
                "17 And I will harden the hearts of the Egyptians so that they shall go in after them, and I will get glory over Pharaoh and all his host, \n" +
                "his chariots, and his horsemen. \n" +
                "18 And the Egyptians shall know that I am the Lord, when I have gotten glory over Pharaoh, his chariots, and his horsemen.”\n" +
                "19 Then the angel of God who was going before the host of Israel moved and went behind them, and the pillar of cloud \n" +
                "moved from before them and stood behind them, \n" +
                "20 coming between the host of Egypt and the host of Israel. And there was the cloud and the darkness. And it lit up the night\n" +
                " without one coming near the other all night.\n" +
                "21 Then Moses stretched out his hand over the sea, and the Lord drove the sea back by a strong east wind all night and made the sea dry land, \n" +
                "and the waters were divided. \n" +
                "22 And the people of Israel went into the midst of the sea on dry ground, the waters being a wall to them on their right hand and on their left. \n" +
                "23 The Egyptians pursued and went in after them into the midst of the sea, all Pharaoh's horses, his chariots, and his horsemen. \n" +
                "24 And in the morning watch the Lord in the pillar of fire and of cloud looked down on the Egyptian forces and threw the Egyptian \n" +
                "forces into a panic,\n" +
                "25 clogging their chariot wheels so that they drove heavily. And the Egyptians said, “Let us flee from before Israel, \n" +
                "for the Lord fights for them against the Egyptians.”\n" +
                "26 Then the Lord said to Moses, “Stretch out your hand over the sea, that the water may come back upon the Egyptians, \n" +
                "upon their chariots, and upon their horsemen.” \n" +
                "27 So Moses stretched out his hand over the sea, and the sea returned to its normal course when the morning appeared. \n" +
                "And as the Egyptians fled into it, the Lord threw the Egyptians into the midst of the sea. \n" +
                "28 The waters returned and covered the chariots and the horsemen; of all the host of Pharaoh that had followed them into the sea, \n" +
                "not one of them remained. \n" +
                "29 But the people of Israel walked on dry ground through the sea, the waters being a wall to them on their right hand and on their left.\n" +
                "30 Thus the Lord saved Israel that day from the hand of the Egyptians, and Israel saw the Egyptians dead on the seashore. \n" +
                "31 Israel saw the great power that the Lord used against the Egyptians, so the people feared the Lord, \n" +
                "and they believed in the Lord and in his servant Moses.\n";
 

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table14.add(lblFirstTitle).pad(10,50,0,0).left();
        table14.row();

        //content of the chapter
        table14.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table14);

    }


    public void chapterFifteenOFExodus() {

        table15 = new Table();
        table15.setWidth(tableBG.getWidth());
        table15.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table15.setFillParent(true);
        table15.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Song of Moses";

        String firstContent = "1 Then Moses and the people of Israel sang this song to the Lord, saying,\n" +
                "“I will sing to the Lord, for he has triumphed gloriously;\n" +
                "    the horse and his rider he has thrown into the sea.\n" +
                "2 The Lord is my strength and my song,\n" +
                "    and he has become my salvation;\n" +
                "this is my God, and I will praise him,\n" +
                "    my father's God, and I will exalt him.\n" +
                "3 The Lord is a man of war;\n" +
                "    the Lord is his name.\n" +
                "4 “Pharaoh's chariots and his host he cast into the sea,\n" +
                "    and his chosen officers were sunk in the Red Sea.\n" +
                "5 The floods covered them;\n" +
                "    they went down into the depths like a stone.\n" +
                "6 Your right hand, O Lord, glorious in power,\n" +
                "    your right hand, O Lord, shatters the enemy.\n" +
                "7 In the greatness of your majesty you overthrow your adversaries;\n" +
                "    you send out your fury; it consumes them like stubble.\n" +
                "8 At the blast of your nostrils the waters piled up;\n" +
                "    the floods stood up in a heap;\n" +
                "    the deeps congealed in the heart of the sea.\n" +
                "9 The enemy said, ‘I will pursue, I will overtake,\n" +
                "    I will divide the spoil, my desire shall have its fill of them.\n" +
                "    I will draw my sword; my hand shall destroy them.’\n" +
                "10 You blew with your wind; the sea covered them;\n" +
                "    they sank like lead in the mighty waters.\n" +
                "11 “Who is like you, O Lord, among the gods?\n" +
                "    Who is like you, majestic in holiness,\n" +
                "    awesome in glorious deeds, doing wonders?\n" +
                "12 You stretched out your right hand;\n" +
                "    the earth swallowed them.\n" +
                "13 “You have led in your steadfast love the people whom you have redeemed;\n" +
                "    you have guided them by your strength to your holy abode.\n" +
                "14 The peoples have heard; they tremble;\n" +
                "    pangs have seized the inhabitants of Philistia.\n" +
                "15 Now are the chiefs of Edom dismayed;\n" +
                "    trembling seizes the leaders of Moab;\n" +
                "    all the inhabitants of Canaan have melted away.\n" +
                "16 Terror and dread fall upon them;\n" +
                "    because of the greatness of your arm, they are still as a stone,\n" +
                "till your people, O Lord, pass by,\n" +
                "    till the people pass by whom you have purchased.\n" +
                "17 You will bring them in and plant them on your own mountain,\n" +
                "    the place, O Lord, which you have made for your abode,\n" +
                "    the sanctuary, O Lord, which your hands have established.\n" +
                "18 The Lord will reign forever and ever.”\n" +
                "19 For when the horses of Pharaoh with his chariots and his horsemen went into the sea, \n" +
                "the Lord brought back the waters of the sea upon them, but the people of Israel walked on dry ground in the midst of the sea. \n" +
                "20 Then Miriam the prophetess, the sister of Aaron, took a tambourine in her hand, \n" +
                "and all the women went out after her with tambourines and dancing. \n" +
                "21 And Miriam sang to them:\n" +
                "\t“Sing to the Lord, for he has triumphed gloriously;\n" +
                "\tthe horse and his rider he has thrown into the sea.”\n";


        String chapterSecondTitle = "Bitter Water Made Sweet";

        String secondContent = "22 Then Moses made Israel set out from the Red Sea, and they went into the wilderness of Shur. \n" +
                "They went three days in the wilderness and found no water. \n" +
                "23 When they came to Marah, they could not drink the water of Marah because it was bitter; therefore it was named Marah.\n" +
                "24 And the people grumbled against Moses, saying, “What shall we drink?”\n" +
                "25 And he cried to the Lord, and the Lord showed him a log, and he threw it into the water, and the water became sweet.\n" +
                "There the Lord made for them a statute and a rule, and there he tested them,\n" +
                "26 saying, “If you will diligently listen to the voice of the Lord your God, and do that which is right in his eyes, \n" +
                "and give ear to his commandments and keep all his statutes, I will put none of the diseases on you that I put on the Egyptians, \n" +
                "for I am the Lord, your healer.”\n" +
                "27 Then they came to Elim, where there were twelve springs of water and seventy palm trees, and they encamped there by the water.\n";
       

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);
        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table15.add(lblFirstTitle).pad(10,50,0,0).left();
        table15.row();

        //content of the chapter
        table15.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table15.row();

        //title of the second content
        table15.add(lblSecondTitle).pad(10,50,0,0).left();
        table15.row();

        //content of the second title
        table15.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table15);

    }


    public void chapterSixteenOFExodus() {

        table16 = new Table();
        table16.setWidth(tableBG.getWidth());
        table16.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table16.setFillParent(true);
        table16.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Bread from Heaven";

        String firstContent = "1 They set out from Elim, and all the congregation of the people of Israel came to the wilderness of Sin, \n" +
                "which is between Elim and Sinai, on the fifteenth day of the second month after they had departed from the land of Egypt.\n" +
                "2 And the whole congregation of the people of Israel grumbled against Moses and Aaron in the wilderness,\n" +
                "3 and the people of Israel said to them, “Would that we had died by the hand of the Lord in the land of Egypt, \n" +
                "when we sat by the meat pots and ate bread to the full, for you have brought us out into this wilderness to kill this whole assembly with hunger.”\n" +
                "4 Then the Lord said to Moses, “Behold, I am about to rain bread from heaven for you, and the people shall go out and \n" +
                "gather a day's portion every day, that I may test them, whether they will walk in my law or not. \n" +
                "5 On the sixth day, when they prepare what they bring in, it will be twice as much as they gather daily.” \n" +
                "6 So Moses and Aaron said to all the people of Israel, “At evening you shall know that it was the Lord who brought you out of the land of Egypt,\n" +
                "7 and in the morning you shall see the glory of the Lord, because he has heard your grumbling against the Lord. \n" +
                "For what are we, that you grumble against us?” \n" +
                "8 And Moses said, “When the Lord gives you in the evening meat to eat and in the morning bread to the full, \n" +
                "because the Lord has heard your grumbling that you grumble against him—what are we? Your grumbling is not against us but against the Lord.”\n" +
                "9 Then Moses said to Aaron, “Say to the whole congregation of the people of Israel, ‘Come near before the Lord, \n" +
                "for he has heard your grumbling.’” \n" +
                "10 And as soon as Aaron spoke to the whole congregation of the people of Israel, they looked toward the wilderness, \n" +
                "and behold, the glory of the Lord appeared in the cloud. \n" +
                "11 And the Lord said to Moses,\n" +
                "12 “I have heard the grumbling of the people of Israel. Say to them, ‘At twilight you shall eat meat, \n" +
                "and in the morning you shall be filled with bread. Then you shall know that I am the Lord your God.’”\n" +
                "13 In the evening quail came up and covered the camp, and in the morning dew lay around the camp. \n" +
                "14 And when the dew had gone up, there was on the face of the wilderness a fine, flake-like thing, fine as frost on the ground. \n" +
                "15 When the people of Israel saw it, they said to one another, “What is it?” For they did not know what it was. And Moses said to them, \n" +
                "“It is the bread that the Lord has given you to eat. \n" +
                "16 This is what the Lord has commanded: ‘Gather of it, each one of you, as much as he can eat. You shall each take an omer, \n" +
                "according to the number of the persons that each of you has in his tent.’” \n" +
                "17 And the people of Israel did so. They gathered, some more, some less. \n" +
                "18 But when they measured it with an omer, whoever gathered much had nothing left over, and whoever gathered little had no lack. \n" +
                "Each of them gathered as much as he could eat. \n" +
                "19 And Moses said to them, “Let no one leave any of it over till the morning.” \n" +
                "20 But they did not listen to Moses. Some left part of it till the morning, and it bred worms and stank. And Moses was angry with them. \n" +
                "21 Morning by morning they gathered it, each as much as he could eat; but when the sun grew hot, it melted.\n" +
                "22 On the sixth day they gathered twice as much bread, two omers each. And when all the leaders of the congregation came and told Moses, \n" +
                "23 he said to them, “This is what the Lord has commanded: ‘Tomorrow is a day of solemn rest, a holy Sabbath to the Lord; \n" +
                "bake what you will bake and boil what you will boil, and all that is left over lay aside to be kept till the morning.’” \n" +
                "24 So they laid it aside till the morning, as Moses commanded them, and it did not stink, and there were no worms in it.\n" +
                "25 Moses said, “Eat it today, for today is a Sabbath to the Lord; today you will not find it in the field. \n" +
                "26 Six days you shall gather it, but on the seventh day, which is a Sabbath, there will be none.”\n" +
                "27 On the seventh day some of the people went out to gather, but they found none. \n" +
                "28 And the Lord said to Moses, “How long will you refuse to keep my commandments and my laws? \n" +
                "29 See! The Lord has given you the Sabbath; therefore on the sixth day he gives you bread for two days. \n" +
                "Remain each of you in his place; let no one go out of his place on the seventh day.” \n" +
                "30 So the people rested on the seventh day.\n" +
                "31 Now the house of Israel called its name manna. It was like coriander seed, white, and the taste of it was like wafers made with honey.\n" +
                "32 Moses said, “This is what the Lord has commanded: ‘Let an omer of it be kept throughout your generations, \n" +
                "so that they may see the bread with which I fed you in the wilderness, when I brought you out of the land of Egypt.’” \n" +
                "33 And Moses said to Aaron, “Take a jar, and put an omer of manna in it, and place it before the Lord to be kept throughout your generations.” \n" +
                "34 As the Lord commanded Moses, so Aaron placed it before the testimony to be kept. \n" +
                "35 The people of Israel ate the manna forty years, till they came to a habitable land. \n" +
                "They ate the manna till they came to the border of the land of Canaan.\n" +
                "36 (An omer is the tenth part of an ephah.)\n";


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


    public void chapterSeventeenOFExodus() {

        table17 = new Table();
        table17.setWidth(tableBG.getWidth());
        table17.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table17.setFillParent(true);
        table17.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Water from the Rock";

        String firstContent = "1 All the congregation of the people of Israel moved on from the wilderness of Sin by stages, \n" +
                "according to the commandment of the Lord, and camped at Rephidim, but there was no water for the people to drink.\n" +
                "2 Therefore the people quarreled with Moses and said, “Give us water to drink.” And Moses said to them, \n" +
                "“Why do you quarrel with me? Why do you test the Lord?” \n" +
                "3 But the people thirsted there for water, and the people grumbled against Moses and said, “Why did you bring us up out of Egypt, \n" +
                "to kill us and our children and our livestock with thirst?” \n" +
                "4 So Moses cried to the Lord, “What shall I do with this people? They are almost ready to stone me.” \n" +
                "5 And the Lord said to Moses, “Pass on before the people, taking with you some of the elders of Israel, \n" +
                "and take in your hand the staff with which you struck the Nile, and go. \n" +
                "6 Behold, I will stand before you there on the rock at Horeb, and you shall strike the rock, and water shall come out of it, a\n" +
                "nd the people will drink.” And Moses did so, in the sight of the elders of Israel. \n" +
                "7 And he called the name of the place Massah and Meribah, because of the quarreling of the people of Israel, \n" +
                "and because they tested the Lord by saying, “Is the Lord among us or not?”\n";


        String chapterSecondTitle = "Israel Defeats Amalek";

        String secondContent = "8 Then Amalek came and fought with Israel at Rephidim. \n" +
                "9 So Moses said to Joshua, “Choose for us men, and go out and fight with Amalek. \n" +
                "Tomorrow I will stand on the top of the hill with the staff of God in my hand.” \n" +
                "10 So Joshua did as Moses told him, and fought with Amalek, while Moses, Aaron, and Hur went up to the top of the hill. \n" +
                "11 Whenever Moses held up his hand, Israel prevailed, and whenever he lowered his hand, Amalek prevailed. \n" +
                "12 But Moses' hands grew weary, so they took a stone and put it under him, and he sat on it, while Aaron and Hur held up his hands, \n" +
                "one on one side, and the other on the other side. So his hands were steady until the going down of the sun. \n" +
                "13 And Joshua overwhelmed Amalek and his people with the sword.\n" +
                "14 Then the Lord said to Moses, “Write this as a memorial in a book and recite it in the ears of Joshua, \n" +
                "that I will utterly blot out the memory of Amalek from under heaven.” \n" +
                "15 And Moses built an altar and called the name of it, The Lord Is My Banner, \n" +
                "16 saying, “A hand upon the throne of the Lord! The Lord will have war with Amalek from generation to generation.”\n";


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


    public void chapterEighteenOFExodus() {

        table18 = new Table();
        table18.setWidth(tableBG.getWidth());
        table18.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table18.setFillParent(true);
        table18.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Jethro's Advice";

        String firstContent = "1 Jethro, the priest of Midian, Moses' father-in-law, heard of all that God had done for Moses and for Israel his people, \n" +
                "how the Lord had brought Israel out of Egypt. \n" +
                "2 Now Jethro, Moses' father-in-law, had taken Zipporah, Moses' wife, after he had sent her home, \n" +
                "3 along with her two sons. The name of the one was Gershom (for he said, “I have been a sojourner in a foreign land”),\n" +
                "4 and the name of the other, Eliezer (for he said, “The God of my father was my help, and delivered me from the sword of Pharaoh”). \n" +
                "5 Jethro, Moses' father-in-law, came with his sons and his wife to Moses in the wilderness where he was encamped at the mountain of God.\n" +
                "6 And when he sent word to Moses, “I,[ your father-in-law Jethro, am coming to you with your wife and her two sons with her,” \n" +
                "7 Moses went out to meet his father-in-law and bowed down and kissed him. And they asked each other of their welfare and went into the tent. \n" +
                "8 Then Moses told his father-in-law all that the Lord had done to Pharaoh and to the Egyptians for Israel's sake, all the hardship that had come upon them in the way, and how the Lord had delivered them.\n" +
                "9 And Jethro rejoiced for all the good that the Lord had done to Israel, in that he had delivered them out of the hand of the Egyptians.\n" +
                "10 Jethro said, “Blessed be the Lord, who has delivered you out of the hand of the Egyptians and out of the hand of Pharaoh \n" +
                "and has delivered the people from under the hand of the Egyptians. \n" +
                "11 Now I know that the Lord is greater than all gods, because in this affair they dealt arrogantly with the people.” \n" +
                "12 And Jethro, Moses' father-in-law, brought a burnt offering and sacrifices to God; and Aaron came with all the elders of Israel \n" +
                "to eat bread with Moses' father-in-law before God.\n" +
                "13 The next day Moses sat to judge the people, and the people stood around Moses from morning till evening. \n" +
                "14 When Moses' father-in-law saw all that he was doing for the people, he said, “What is this that you are doing for the people? Why do you sit alone, and all the people stand around you from morning till evening?” \n" +
                "15 And Moses said to his father-in-law, “Because the people come to me to inquire of God; \n" +
                "16 when they have a dispute, they come to me and I decide between one person and another, and I make them know the statutes of God and his laws.”\n" +
                "17 Moses' father-in-law said to him, “What you are doing is not good.\n" +
                "18 You and the people with you will certainly wear yourselves out, for the thing is too heavy for you. You are not able to do it alone. \n" +
                "19 Now obey my voice; I will give you advice, and God be with you! You shall represent the people before God and bring their cases to God,\n" +
                "20 and you shall warn them about the statutes and the laws, and make them know the way in which they must walk and what they must do. \n" +
                "21 Moreover, look for able men from all the people, men who fear God, who are trustworthy and hate a bribe, and place such men \n" +
                "over the people as chiefs of thousands, of hundreds, of fifties, and of tens. \n" +
                "22 And let them judge the people at all times. Every great matter they shall bring to you, but any small matter they shall decide themselves. \n" +
                "So it will be easier for you, and they will bear the burden with you.\n" +
                "23 If you do this, God will direct you, you will be able to endure, and all this people also will go to their place in peace.”\n" +
                "24 So Moses listened to the voice of his father-in-law and did all that he had said. \n" +
                "25 Moses chose able men out of all Israel and made them heads over the people, chiefs of thousands, of hundreds, of fifties, and of tens.\n" +
                "26 And they judged the people at all times. Any hard case they brought to Moses, but any small matter they decided themselves. \n" +
                "27 Then Moses let his father-in-law depart, and he went away to his own country.\n";


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


    public void chapterNineteenOFExodus() {

        table19 = new Table();
        table19.setWidth(tableBG.getWidth());
        table19.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table19.setFillParent(true);
        table19.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Israel at Mount Sinai";

        String firstContent = "1 On the third new moon after the people of Israel had gone out of the land of Egypt, \n" +
                "on that day they came into the wilderness of Sinai. \n" +
                "2 They set out from Rephidim and came into the wilderness of Sinai, and they encamped in the wilderness. \n" +
                "There Israel encamped before the mountain,\n" +
                "3 while Moses went up to God. The Lord called to him out of the mountain, saying, “Thus you shall say to the house of Jacob, \n" +
                "and tell the people of Israel: \n" +
                "4 ‘You yourselves have seen what I did to the Egyptians, and how I bore you on eagles' wings and brought you to myself. \n" +
                "5 Now therefore, if you will indeed obey my voice and keep my covenant, you shall be my treasured possession among all peoples, \n" +
                "for all the earth is mine; \n" +
                "6 and you shall be to me a kingdom of priests and a holy nation.’ These are the words that you shall speak to the people of Israel.”\n" +
                "7 So Moses came and called the elders of the people and set before them all these words that the Lord had commanded him. \n" +
                "8 All the people answered together and said, “All that the Lord has spoken we will do.” And Moses reported the words of the people to the Lord. \n" +
                "9 And the Lord said to Moses, “Behold, I am coming to you in a thick cloud, that the people may hear when I speak with you, \n" +
                "and may also believe you forever.”\n" +
                "When Moses told the words of the people to the Lord, \n" +
                "10 the Lord said to Moses, “Go to the people and consecrate them today and tomorrow, and let them wash their garments \n" +
                "11 and be ready for the third day. For on the third day the Lord will come down on Mount Sinai in the sight of all the people. \n" +
                "12 And you shall set limits for the people all around, saying, ‘Take care not to go up into the mountain or touch the edge of it. \n" +
                "Whoever touches the mountain shall be put to death. \n" +
                "13 No hand shall touch him, but he shall be stoned or shot; whether beast or man, he shall not live.’ When the trumpet sounds a long blast, \n" +
                "they shall come up to the mountain.” \n" +
                "14 So Moses went down from the mountain to the people and consecrated the people; and they washed their garments.\n" +
                "15 And he said to the people, “Be ready for the third day; do not go near a woman.”\n" +
                "16 On the morning of the third day there were thunders and lightnings and a thick cloud on the mountain and a very loud trumpet blast, \n" +
                "so that all the people in the camp trembled. \n" +
                "17 Then Moses brought the people out of the camp to meet God, and they took their stand at the foot of the mountain. \n" +
                "18 Now Mount Sinai was wrapped in smoke because the Lord had descended on it in fire. The smoke of it went up like the smoke of a kiln, \n" +
                "and the whole mountain trembled greatly. \n" +
                "19 And as the sound of the trumpet grew louder and louder, Moses spoke, and God answered him in thunder. \n" +
                "20 The Lord came down on Mount Sinai, to the top of the mountain. And the Lord called Moses to the top of the mountain, and Moses went up.\n" +
                "21 And the Lord said to Moses, “Go down and warn the people, lest they break through to the Lord to look and many of them perish. \n" +
                "22 Also let the priests who come near to the Lord consecrate themselves, lest the Lord break out against them.” \n" +
                "23 And Moses said to the Lord, “The people cannot come up to Mount Sinai, for you yourself warned us, saying, \n" +
                "‘Set limits around the mountain and consecrate it.’” \n" +
                "24 And the Lord said to him, “Go down, and come up bringing Aaron with you. But do not let the priests \n" +
                "and the people break through to come up to the Lord, lest he break out against them.” \n" +
                "25 So Moses went down to the people and told them.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table19.add(lblFirstTitle).pad(10,50,0,0).left();
        table19.row();

        //content of the chapter
        table19.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table19);

    }


    public void chapterTwentyOFExodus() {

        table20 = new Table();
        table20.setWidth(tableBG.getWidth());
        table20.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table20.setFillParent(true);
        table20.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
    
        String chapterFirstTitle = "The Ten Commandments";

        String firstContent = "1 And God spoke all these words, saying,\n" +
                "2 “I am the Lord your God, who brought you out of the land of Egypt, out of the house of slavery.\n" +
                "3 “You shall have no other gods before me.\n" +
                "4 “You shall not make for yourself a carved image, or any likeness of anything that is in heaven above, or that is in the earth beneath, \n" +
                "'or that is in the water under the earth. \n" +
                "5 You shall not bow down to them or serve them, for I the Lord your God am a jealous God, visiting the iniquity of the fathers on the children to the third and the fourth generation of those who hate me, \n" +
                "6 but showing steadfast love to thousands of those who love me and keep my commandments.\n" +
                "7 “You shall not take the name of the Lord your God in vain, for the Lord will not hold him guiltless who takes his name in vain.\n" +
                "8 “Remember the Sabbath day, to keep it holy. \n" +
                "9 Six days you shall labor, and do all your work, \n" +
                "10 but the seventh day is a Sabbath to the Lord your God. On it you shall not do any work, you, or your son, or your daughter, \n" +
                "'your male servant, or your female servant, or your livestock, or the sojourner who is within your gates. \n" +
                "11 For in six days the Lord made heaven and earth, the sea, and all that is in them, and rested on the seventh day. \n" +
                "'Therefore the Lord blessed the Sabbath day and made it holy.\n" +
                "12 “Honor your father and your mother, that your days may be long in the land that the Lord your God is giving you.\n" +
                "13 “You shall not murder.\n" +
                "14 “You shall not commit adultery.\n" +
                "15 “You shall not steal.\n" +
                "16 “You shall not bear false witness against your neighbor.\n" +
                "17 “You shall not covet your neighbor's house; you shall not covet your neighbor's wife, or his male servant, or his female servant, or his ox, \n" +
                "'or his donkey, or anything that is your neighbor's.”\n" +
                "18 Now when all the people saw the thunder and the flashes of lightning and the sound of the trumpet and the mountain smoking, \n" +
                "the people were afraid and trembled, and they stood far off \n" +
                "19 and said to Moses, “You speak to us, and we will listen; but do not let God speak to us, lest we die.” \n" +
                "20 Moses said to the people, “Do not fear, for God has come to test you, that the fear of him may be before you, that you may not sin.”\n" +
                "'21 The people stood far off, while Moses drew near to the thick darkness where God was.\n";


        String chapterSecondTitle = "Laws About Altars";

        String secondContent = "22 And the Lord said to Moses, “Thus you shall say to the people of Israel: \n" +
                "'You have seen for yourselves that I have talked with you from heaven. \n" +
                "23 You shall not make gods of silver to be with me, nor shall you make for yourselves gods of gold. \n" +
                "24 An altar of earth you shall make for me and sacrifice on it your burnt offerings and your peace offerings, your sheep and your oxen. \n" +
                "'In every place where I cause my name to be remembered I will come to you and bless you. \n" +
                "25 If you make me an altar of stone, you shall not build it of hewn stones, for if you wield your tool on it you profane it. \n" +
                "26 And you shall not go up by steps to my altar, that your nakedness be not exposed on it.’\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

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

        stage.addActor(table20);

    }

    public void chapterTwentyOneOFExodus() {

        table21 = new Table();
        table21.setWidth(tableBG.getWidth());
        table21.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table21.setFillParent(true);
        table21.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws About Slaves";

        String firstContent = "1 “Now these are the rules that you shall set before them. \n" +
                "2 When you buy a Hebrew slave, he shall serve six years, and in the seventh he shall go out free, for nothing. \n" +
                "3 If he comes in single, he shall go out single; if he comes in married, then his wife shall go out with him. \n" +
                "4 If his master gives him a wife and she bears him sons or daughters, the wife and her children shall be her master's, \n" +
                "and he shall go out alone.\n" +
                "5 But if the slave plainly says, ‘I love my master, my wife, and my children; I will not go out free,’ \n" +
                "6 then his master shall bring him to God, and he shall bring him to the door or the doorpost. \n" +
                "And his master shall bore his ear through with an awl, and he shall be his slave forever.\n" +
                "7 “When a man sells his daughter as a slave, she shall not go out as the male slaves do. \n" +
                "8 If she does not please her master, who has designated her for himself, then he shall let her be redeemed. \n" +
                "He shall have no right to sell her to a foreign people, since he has broken faith with her.\n" +
                "9 If he designates her for his son, he shall deal with her as with a daughter. \n" +
                "10 If he takes another wife to himself, he shall not diminish her food, her clothing, or her marital rights. \n" +
                "11 And if he does not do these three things for her, she shall go out for nothing, without payment of money.\n" +
                "12 “Whoever strikes a man so that he dies shall be put to death. \n" +
                "13 But if he did not lie in wait for him, but God let him fall into his hand, then I will appoint for you a place to which he may flee. \n" +
                "14 But if a man willfully attacks another to kill him by cunning, you shall take him from my altar, that he may die.\n" +
                "15 “Whoever strikes his father or his mother shall be put to death.\n" +
                "16 “Whoever steals a man and sells him, and anyone found in possession of him, shall be put to death.\n" +
                "17 “Whoever curses his father or his mother shall be put to death.\n" +
                "18 “When men quarrel and one strikes the other with a stone or with his fist and the man does not die but takes to his bed, \n" +
                "19 then if the man rises again and walks outdoors with his staff, he who struck him shall be clear; \n" +
                "only he shall pay for the loss of his time, and shall have him thoroughly healed.\n" +
                "20 “When a man strikes his slave, male or female, with a rod and the slave dies under his hand, he shall be avenged.\n" +
                "21 But if the slave survives a day or two, he is not to be avenged, for the slave is his money.\n" +
                "22 “When men strive together and hit a pregnant woman, so that her children come out, but there is no harm, \n" +
                "the one who hit her shall surely be fined, as the woman's husband shall impose on him, and he shall pay as the judges determine. \n" +
                "23 But if there is harm, then you shall pay life for life, \n" +
                "24 eye for eye, tooth for tooth, hand for hand, foot for foot,\n" +
                "25 burn for burn, wound for wound, stripe for stripe.\n" +
                "26 “When a man strikes the eye of his slave, male or female, and destroys it, he shall let the slave go free because of his eye. \n" +
                "27 If he knocks out the tooth of his slave, male or female, he shall let the slave go free because of his tooth.\n" +
                "28 “When an ox gores a man or a woman to death, the ox shall be stoned, and its flesh shall not be eaten, \n" +
                "but the owner of the ox shall not be liable. \n" +
                "29 But if the ox has been accustomed to gore in the past, and its owner has been warned but has not kept it in, \n" +
                "and it kills a man or a woman, the ox shall be stoned, and its owner also shall be put to death.\n" +
                "30 If a ransom is imposed on him, then he shall give for the redemption of his life whatever is imposed on him. \n" +
                "31 If it gores a man's son or daughter, he shall be dealt with according to this same rule. \n" +
                "32 If the ox gores a slave, male or female, the owner shall give to their master thirty shekels of silver, and the ox shall be stoned.\n";


        String chapterSecondTitle = "Laws About Restitution";

        String secondContent = "33 “When a man opens a pit, or when a man digs a pit and does not cover it, and an ox or a donkey falls into it, \n" +
                "34 the owner of the pit shall make restoration. He shall give money to its owner, and the dead beast shall be his.\n" +
                "35 “When one man's ox butts another's, so that it dies, then they shall sell the live ox and share its price, \n" +
                "and the dead beast also they shall share. \n" +
                "36 Or if it is known that the ox has been accustomed to gore in the past, and its owner has not kept it in, \n" +
                "he shall repay ox for ox, and the dead beast shall be his.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

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

        stage.addActor(table21);

    }


    public void chapterTwentyTwoOFExodus() {

        table22 = new Table();
        table22.setWidth(tableBG.getWidth());
        table22.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table22.setFillParent(true);
        table22.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 “If a man steals an ox or a sheep, and kills it or sells it, he shall repay five oxen for an ox, and four sheep for a sheep. \n" +
                "2 If a thief is found breaking in and is struck so that he dies, there shall be no bloodguilt for him, \n" +
                "3 but if the sun has risen on him, there shall be bloodguilt for him. He shall surely pay. If he has nothing, then he shall be sold for his theft. \n" +
                "4 If the stolen beast is found alive in his possession, whether it is an ox or a donkey or a sheep, he shall pay double.\n" +
                "5 “If a man causes a field or vineyard to be grazed over, or lets his beast loose and it feeds in another man's field, \n" +
                "he shall make restitution from the best in his own field and in his own vineyard.\n" +
                "6 “If fire breaks out and catches in thorns so that the stacked grain or the standing grain or the field is consumed, \n" +
                "he who started the fire shall make full restitution.\n" +
                "7 “If a man gives to his neighbor money or goods to keep safe, and it is stolen from the man's house, then, \n" +
                "if the thief is found, he shall pay double. \n" +
                "8 If the thief is not found, the owner of the house shall come near to God to show whether or \n" +
                "not he has put his hand to his neighbor's property.\n" +
                "9 For every breach of trust, whether it is for an ox, for a donkey, for a sheep, for a cloak, or for any kind of lost thing, \n" +
                "of which one says, ‘This is it,’ the case of both parties shall come before God. The one whom God condemns shall pay double to his neighbor.\n" +
                "10 “If a man gives to his neighbor a donkey or an ox or a sheep or any beast to keep safe, and it dies or is injured or is driven away, \n" +
                "without anyone seeing it, \n" +
                "11 an oath by the Lord shall be between them both to see whether or not he has put his hand to his neighbor's property. \n" +
                "The owner shall accept the oath, and he shall not make restitution. \n" +
                "12 But if it is stolen from him, he shall make restitution to its owner. \n" +
                "13 If it is torn by beasts, let him bring it as evidence. He shall not make restitution for what has been torn.\n" +
                "14 “If a man borrows anything of his neighbor, and it is injured or dies, the owner not being with it, he shall make full restitution. \n" +
                "15 If the owner was with it, he shall not make restitution; if it was hired, it came for its hiring fee.\n";


        String chapterSecondTitle = "Laws About Social Justice";

        String secondContent = "16 “If a man seduces a virgin who is not betrothed and lies with her, he shall give the bride-price for her and make her his wife. \n" +
                "17 If her father utterly refuses to give her to him, he shall pay money equal to the bride-price for virgins.\n" +
                "18 “You shall not permit a sorceress to live.\n" +
                "19 “Whoever lies with an animal shall be put to death.\n" +
                "20 “Whoever sacrifices to any god, other than the Lord alone, shall be devoted to destruction.\n" +
                "21 “You shall not wrong a sojourner or oppress him, for you were sojourners in the land of Egypt. \n" +
                "22 You shall not mistreat any widow or fatherless child. \n" +
                "23 If you do mistreat them, and they cry out to me, I will surely hear their cry, \n" +
                "24 and my wrath will burn, and I will kill you with the sword, and your wives shall become widows and your children fatherless.\n" +
                "25 “If you lend money to any of my people with you who is poor, you shall not be like a moneylender to him, \n" +
                "and you shall not exact interest from him. \n" +
                "26 If ever you take your neighbor's cloak in pledge, you shall return it to him before the sun goes down, \n" +
                "27 for that is his only covering, and it is his cloak for his body; in what else shall he sleep? And if he cries to me, \n" +
                "I will hear, for I am compassionate.\n" +
                "28 “You shall not revile God, nor curse a ruler of your people.\n" +
                "29 “You shall not delay to offer from the fullness of your harvest and from the outflow of your presses. \n" +
                "The firstborn of your sons you shall give to me. \n" +
                "30 You shall do the same with your oxen and with your sheep: seven days it shall be with its mother; on the eighth day you shall give it to me.\n" +
                "31 “You shall be consecrated to me. Therefore you shall not eat any flesh that is torn by beasts in the field; you shall throw it to the dogs.\n";


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


    public void chapterTwentyThreeOFExodus() {

        table23 = new Table();
        table23.setWidth(tableBG.getWidth());
        table23.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table23.setFillParent(true);
        table23.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 “You shall not spread a false report. You shall not join hands with a wicked man to be a malicious witness. \n" +
                "2 You shall not fall in with the many to do evil, nor shall you bear witness in a lawsuit, siding with the many, so as to pervert justice, \n" +
                "3 nor shall you be partial to a poor man in his lawsuit.\n" +
                "4 “If you meet your enemy's ox or his donkey going astray, you shall bring it back to him.\n" +
                " 5 If you see the donkey of one who hates you lying down under its burden, you shall refrain from leaving him with it; \n" +
                "you shall rescue it with him.\n" +
                "6 “You shall not pervert the justice due to your poor in his lawsuit. \n" +
                "7 Keep far from a false charge, and do not kill the innocent and righteous, for I will not acquit the wicked. \n" +
                "8 And you shall take no bribe, for a bribe blinds the clear-sighted and subverts the cause of those who are in the right.\n" +
                "9 “You shall not oppress a sojourner. You know the heart of a sojourner, for you were sojourners in the land of Egypt.\n";


        String chapterSecondTitle = "Laws About the Sabbath and Festivals";

        String secondContent = "10 “For six years you shall sow your land and gather in its yield, \n" +
                "11 but the seventh year you shall let it rest and lie fallow, that the poor of your people may eat; \n" +
                "and what they leave the beasts of the field may eat. You shall do likewise with your vineyard, and with your olive orchard.\n" +
                "12 “Six days you shall do your work, but on the seventh day you shall rest; that your ox and your donkey may have rest, \n" +
                "and the son of your servant woman, and the alien, may be refreshed.\n" +
                "13 “Pay attention to all that I have said to you, and make no mention of the names of other gods, nor let it be heard on your lips.\n" +
                "14 “Three times in the year you shall keep a feast to me. \n" +
                "15 You shall keep the Feast of Unleavened Bread. As I commanded you, you shall eat unleavened bread for seven days \n" +
                "at the appointed time in the month of Abib, for in it you came out of Egypt. None shall appear before me empty-handed.\n" +
                "16 You shall keep the Feast of Harvest, of the firstfruits of your labor, of what you sow in the field. \n" +
                "You shall keep the Feast of Ingathering at the end of the year, when you gather in from the field the fruit of your labor. \n" +
                "17 Three times in the year shall all your males appear before the Lord God.\n" +
                "18 “You shall not offer the blood of my sacrifice with anything leavened, or let the fat of my feast remain until the morning.\n" +
                "19 “The best of the firstfruits of your ground you shall bring into the house of the Lord your God.\n" +
                "“You shall not boil a young goat in its mother's milk.\n";


        String chapterThirdTitle = "Conquest of Canaan Promised";

        String thirdContent = "20 “Behold, I send an angel before you to guard you on the way and to bring you to the place that I have prepared. \n" +
                "21 Pay careful attention to him and obey his voice; do not rebel against him, for he will not pardon your transgression, for my name is in him.\n" +
                "22 “But if you carefully obey his voice and do all that I say, then I will be an enemy to your enemies and an adversary to your adversaries.\n" +
                "23 “When my angel goes before you and brings you to the Amorites and the Hittites and the Perizzites and the Canaanites, \n" +
                "the Hivites and the Jebusites, and I blot them out, \n" +
                "24 you shall not bow down to their gods nor serve them, nor do as they do, but you shall utterly overthrow them and break their pillars in pieces. \n" +
                "25 You shall serve the Lord your God, and he will bless your bread and your water, and I will take sickness away from among you. \n" +
                "26 None shall miscarry or be barren in your land; I will fulfill the number of your days. \n" +
                "27 I will send my terror before you and will throw into confusion all the people against whom you shall come, \n" +
                "and I will make all your enemies turn their backs to you.\n" +
                "28 And I will send hornets before you, which shall drive out the Hivites, the Canaanites, and the Hittites from before you.\n" +
                "29 I will not drive them out from before you in one year, lest the land become desolate and the wild beasts multiply against you. \n" +
                "30 Little by little I will drive them out from before you, until you have increased and possess the land.\n" +
                "31 And I will set your border from the Red Sea to the Sea of the Philistines, and from the wilderness to the Euphrates,\n" +
                " for I will give the inhabitants of the land into your hand, and you shall drive them out before you. \n" +
                "32 You shall make no covenant with them and their gods. 33 They shall not dwell in your land, lest they make you sin against me; \n" +
                "for if you serve their gods, it will surely be a snare to you.”\n";


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

        stage.addActor(table23);


    }


    public void chapterTwentyFourOFExodus() {

        table24 = new Table();
        table24.setWidth(tableBG.getWidth());
        table24.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table24.setFillParent(true);
        table24.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));


        String chapterFirstTitle = "The Covenant Confirmed";

        String firstContent = "1 Then he said to Moses, “Come up to the Lord, you and Aaron, Nadab, and Abihu, and seventy of the elders of Israel, \n" +
                "and worship from afar. \n" +
                "2 Moses alone shall come near to the Lord, but the others shall not come near, and the people shall not come up with him.”\n" +
                "3 Moses came and told the people all the words of the Lord and all the rules. And all the people answered with one voice and said, \n" +
                "“All the words that the Lord has spoken we will do.” \n" +
                "4 And Moses wrote down all the words of the Lord. He rose early in the morning and built an altar at the foot of the mountain, \n" +
                "and twelve pillars, according to the twelve tribes of Israel. \n" +
                "5 And he sent young men of the people of Israel, who offered burnt offerings and sacrificed peace offerings of oxen to the Lord. \n" +
                "6 And Moses took half of the blood and put it in basins, and half of the blood he threw against the altar. \n" +
                "7 Then he took the Book of the Covenant and read it in the hearing of the people. And they said, \n" +
                "“All that the Lord has spoken we will do, and we will be obedient.” \n" +
                "8 And Moses took the blood and threw it on the people and said, “Behold the blood of the covenant \n" +
                "that the Lord has made with you in accordance with all these words.”\n" +
                "9 Then Moses and Aaron, Nadab, and Abihu, and seventy of the elders of Israel went up, \n" +
                "10 and they saw the God of Israel. There was under his feet as it were a pavement of sapphire stone, like the very heaven for clearness. \n" +
                "11 And he did not lay his hand on the chief men of the people of Israel; they beheld God, and ate and drank.\n" +
                "12 The Lord said to Moses, “Come up to me on the mountain and wait there, that I may give you the tablets of stone, \n" +
                "with the law and the commandment, which I have written for their instruction.” \n" +
                "13 So Moses rose with his assistant Joshua, and Moses went up into the mountain of God. \n" +
                "14 And he said to the elders, “Wait here for us until we return to you. And behold, Aaron and Hur are with you. \n" +
                "Whoever has a dispute, let him go to them.”\n" +
                "15 Then Moses went up on the mountain, and the cloud covered the mountain. \n" +
                "16 The glory of the Lord dwelt on Mount Sinai, and the cloud covered it six \n" +
                "17 Now the appearance of the glory of the Lord was like a devouring fire on the top of the mountain in the sight of the people of Israel. \n" +
                "18 Moses entered the cloud and went up on the mountain. And Moses was on the mountain forty days and forty nights.\n";


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

    public void chapterTwentyFiveOFExodus() {

        table25 = new Table();
        table25.setWidth(tableBG.getWidth());
        table25.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table25.setFillParent(true);
        table25.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Contributions for the Sanctuary";

        String firstContent = "1 The Lord said to Moses, \n" +
                "2 “Speak to the people of Israel, that they take for me a contribution. From every man whose heart moves him you \n" +
                "shall receive the contribution for me. \n" +
                "3 And this is the contribution that you shall receive from them: gold, silver, and bronze, \n" +
                "4 blue and purple and scarlet yarns and fine twined linen, goats' hair, \n" +
                "5 tanned rams' skins, goatskins, acacia wood, \n" +
                "6 oil for the lamps, spices for the anointing oil and for the fragrant incense, \n" +
                "7 onyx stones, and stones for setting, for the ephod and for the breastpiece. \n" +
                "8 And let them make me a sanctuary, that I may dwell in their midst. \n" +
                "9 Exactly as I show you concerning the pattern of the tabernacle, and of all its furniture, so you shall make it.\n";


        String chapterSecondTitle = "The Ark of the Covenant";

        String secondContent = "10 “They shall make an ark of acacia wood. Two cubits and a half shall be its length, \n" +
                "a cubit and a half its breadth, and a cubit and a half its height. \n" +
                "11 You shall overlay it with pure gold, inside and outside shall you overlay it, and you shall make on it a molding of gold around it. \n" +
                "12 You shall cast four rings of gold for it and put them on its four feet, two rings on the one side of it, and two rings on the other side of it. \n" +
                "13 You shall make poles of acacia wood and overlay them with gold. \n" +
                "14 And you shall put the poles into the rings on the sides of the ark to carry the ark by them. \n" +
                "15 The poles shall remain in the rings of the ark; they shall not be taken from it. \n" +
                "16 And you shall put into the ark the testimony that I shall give you.\n" +
                "17 “You shall make a mercy seat of pure gold. Two cubits and a half shall be its length, and a cubit and a half its breadth. \n" +
                "18 And you shall make two cherubim of gold; of hammered work shall you make them, on the two ends of the mercy seat. \n" +
                "19 Make one cherub on the one end, and one cherub on the other end. Of one piece with the mercy seat \n" +
                "shall you make the cherubim on its two ends. \n" +
                "20 The cherubim shall spread out their wings above, overshadowing the mercy seat with their wings, their faces one to another; \n" +
                "toward the mercy seat shall the faces of the cherubim be. \n" +
                "21 And you shall put the mercy seat on the top of the ark, and in the ark you shall put the testimony that I shall give you. \n" +
                "22 There I will meet with you, and from above the mercy seat, from between the two cherubim that are on the ark of the testimony, \n" +
                "I will speak with you about all that I will give you in commandment for the people of Israel.\n";

        String chapterThirdTitle = "The Table for Bread";

        String thirdContent = "23 “You shall make a table of acacia wood. Two cubits shall be its length, a cubit its breadth, and a cubit and a half its height. \n" +
                "24 You shall overlay it with pure gold and make a molding of gold around it. \n" +
                "25 And you shall make a rim around it a handbreadth wide, and a molding of gold around the rim. \n" +
                "26 And you shall make for it four rings of gold, and fasten the rings to the four corners at its four legs. \n" +
                "27 Close to the frame the rings shall lie, as holders for the poles to carry the table. \n" +
                "28 You shall make the poles of acacia wood, and overlay them with gold, and the table shall be carried with these. \n" +
                "29 And you shall make its plates and dishes for incense, and its flagons and bowls with which to pour drink offerings; \n" +
                "you shall make them of pure gold. \n" +
                "30 And you shall set the bread of the Presence on the table before me regularly.\n";

        String chapterFourthTitle = "The Golden Lampstand";

        String fourthContent = "31 “You shall make a lampstand of pure gold. The lampstand shall be made of hammered work: its base, \n" +
                "its stem, its cups, its calyxes, and its flowers shall be of one piece with it. \n" +
                "32 And there shall be six branches going out of its sides, three branches of the lampstand out of one side of it \n" +
                "and three branches of the lampstand out of the other side of it;\n" +
                "33 three cups made like almond blossoms, each with calyx and flower, on one branch, and three cups made like almond blossoms,\n" +
                " each with calyx and flower, on the other branch—so for the six branches going out of the lampstand. \n" +
                "34 And on the lampstand itself there shall be four cups made like almond blossoms, with their calyxes and flowers, \n" +
                "35 and a calyx of one piece with it under each pair of the six branches going out from the lampstand. \n" +
                "36 Their calyxes and their branches shall be of one piece with it, the whole of it a single piece of hammered work of pure gold. \n" +
                "37 You shall make seven lamps for it. And the lamps shall be set up so as to give light on the space in front of it. \n" +
                "38 Its tongs and their trays shall be of pure gold. \n" +
                "39 It shall be made, with all these utensils, out of a talent of pure gold. \n" +
                "40 And see that you make them after the pattern for them, which is being shown you on the mountain.\n";
 

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

        //content of the fourtn title
        table25.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table25);

    }

    public void chapterTwentySixOFExodus() {

        table26 = new Table();
        table26.setWidth(tableBG.getWidth());
        table26.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table26.setFillParent(true);
        table26.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
 
        String chapterFirstTitle = "The Tabernacle";

        String firstContent = "1 “Moreover, you shall make the tabernacle with ten curtains of fine twined linen and blue and purple and scarlet yarns; \n" +
                "you shall make them with cherubim skillfully worked into them. \n" +
                "2 The length of each curtain shall be twenty-eight cubits, and the breadth of each curtain four cubits; all the curtains shall be the same size. \n" +
                "3 Five curtains shall be coupled to one another, and the other five curtains shall be coupled to one another. \n" +
                "4 And you shall make loops of blue on the edge of the outermost curtain in the first set. \n" +
                "Likewise you shall make loops on the edge of the outermost curtain in the second set. \n" +
                "5 Fifty loops you shall make on the one curtain, and fifty loops you shall make on the edge of the curtain that \n" +
                "is in the second set; the loops shall be opposite one another. \n" +
                "6 And you shall make fifty clasps of gold, and couple the curtains one to the other with the clasps, so that the tabernacle may be a single whole.\n" +
                "7 “You shall also make curtains of goats' hair for a tent over the tabernacle; eleven curtains shall you make. \n" +
                "8 The length of each curtain shall be thirty cubits, and the breadth of each curtain four cubits. The eleven curtains shall be the same size. \n" +
                "9 You shall couple five curtains by themselves, and six curtains by themselves, and the sixth curtain \n" +
                "you shall double over at the front of the tent. \n" +
                "10 You shall make fifty loops on the edge of the curtain that is outermost in one set, and fifty loops on the edge \n" +
                "of the curtain that is outermost in the second set.\n" +
                "11 “You shall make fifty clasps of bronze, and put the clasps into the loops, and couple the tent together that it may be a single whole. \n" +
                "12 And the part that remains of the curtains of the tent, the half curtain that remains, shall hang over the back of the tabernacle. \n" +
                "13 And the extra that remains in the length of the curtains, the cubit on the one side, and the cubit on the other side, \n" +
                "shall hang over the sides of the tabernacle, on this side and that side, to cover it.\n" +
                "14 And you shall make for the tent a covering of tanned rams' skins and a covering of goatskins on top.\n" +
                "15 “You shall make upright frames for the tabernacle of acacia wood.\n" +
                "16 Ten cubits shall be the length of a frame, and a cubit and a half the breadth of each frame.\n" +
                "17 There shall be two tenons in each frame, for fitting together. So shall you do for all the frames of the tabernacle.\n" +
                "18 You shall make the frames for the tabernacle: twenty frames for the south side; \n" +
                "19 and forty bases of silver you shall make under the twenty frames, two bases under one frame for its two tenons, \n" +
                "and two bases under the next frame for its two tenons; \n" +
                "20 and for the second side of the tabernacle, on the north side twenty frames, \n" +
                "21 and their forty bases of silver, two bases under one frame, and two bases under the next frame.\n" +
                "22 And for the rear of the tabernacle westward you shall make six frames. \n" +
                "23 And you shall make two frames for corners of the tabernacle in the rear; \n" +
                "24 they shall be separate beneath, but joined at the top, at the first ring. Thus shall it be with both of them; they shall form the two corners.\n" +
                "25 And there shall be eight frames, with their bases of silver, sixteen bases; two bases under one frame, and two bases under another frame.\n" +
                "26 “You shall make bars of acacia wood, five for the frames of the one side of the tabernacle,\n" +
                "27 and five bars for the frames of the other side of the tabernacle, and five bars for the frames of the side of the tabernacle at the rear westward. \n" +
                "28 The middle bar, halfway up the frames, shall run from end to end.\n" +
                "29 You shall overlay the frames with gold and shall make their rings of gold for holders for the bars, and you shall overlay the bars with gold. \n" +
                "30 Then you shall erect the tabernacle according to the plan for it that you were shown on the mountain.\n" +
                "31 “And you shall make a veil of blue and purple and scarlet yarns and fine twined linen. It shall be made with cherubim skillfully worked into it.\n" +
                "32 And you shall hang it on four pillars of acacia overlaid with gold, with hooks of gold, on four bases of silver. \n" +
                "33 And you shall hang the veil from the clasps, and bring the ark of the testimony in there within the veil. \n" +
                "And the veil shall separate for you the Holy Place from the Most Holy.\n" +
                "34 You shall put the mercy seat on the ark of the testimony in the Most Holy Place. \n" +
                "35 And you shall set the table outside the veil, and the lampstand on the south side of the tabernacle opposite the table, \n" +
                "and you shall put the table on the north side.\n" +
                "36 “You shall make a screen for the entrance of the tent, of blue and purple and scarlet yarns and fine twined linen, \n" +
                "embroidered with needlework. \n" +
                "37 And you shall make for the screen five pillars of acacia, and overlay them with gold. Their hooks shall be of gold, \n" +
                "and you shall cast five bases of bronze for them.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table26.add(lblFirstTitle).pad(10,50,0,0).left();
        table26.row();

        //content of the chapter
        table26.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table26);


    }

    public void chapterTwentySevenOFExodus() {

        table27 = new Table();
        table27.setWidth(tableBG.getWidth());
        table27.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table27.setFillParent(true);
        table27.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Bronze Altar";

        String firstContent = "1 “You shall make the altar of acacia wood, five cubits long and five cubits broad. The altar shall be square, \n" +
                "and its height shall be three cubits. \n" +
                "2 And you shall make horns for it on its four corners; its horns shall be of one piece with it, and you shall overlay it with bronze. \n" +
                "3 You shall make pots for it to receive its ashes, and shovels and basins and forks and fire pans. You shall make all its utensils of bronze. \n" +
                "4 You shall also make for it a grating, a network of bronze, and on the net you shall make four bronze rings at its four corners. \n" +
                "5 And you shall set it under the ledge of the altar so that the net extends halfway down the altar.\n" +
                "6 And you shall make poles for the altar, poles of acacia wood, and overlay them with bronze.\n" +
                "7 And the poles shall be put through the rings, so that the poles are on the two sides of the altar when it is carried.\n" +
                "8 You shall make it hollow, with boards. As it has been shown you on the mountain, so shall it be made.\n";


        String chapterSecondTitle = "The Court of the Tabernacle";

        String secondContent = "9 “You shall make the court of the tabernacle. On the south side the court shall have hangings of fine \n" +
                "twined linen a hundred cubits long for one side. \n" +
                "10 Its twenty pillars and their twenty bases shall be of bronze, but the hooks of the pillars and their fillets shall be of silver. \n" +
                "11 And likewise for its length on the north side there shall be hangings a hundred cubits long, its pillars twenty and their bases twenty, \n" +
                "of bronze, but the hooks of the pillars and their fillets shall be of silver. \n" +
                "12 And for the breadth of the court on the west side there shall be hangings for fifty cubits, with ten pillars and ten bases. \n" +
                "13 The breadth of the court on the front to the east shall be fifty cubits. \n" +
                "14 The hangings for the one side of the gate shall be fifteen cubits, with their three pillars and three bases.\n" +
                "15 On the other side the hangings shall be fifteen cubits, with their three pillars and three bases. \n" +
                "16 For the gate of the court there shall be a screen twenty cubits long, of blue and purple and scarlet yarns and fine twined linen, \n" +
                "embroidered with needlework. It shall have four pillars and with them four bases. \n" +
                "17 All the pillars around the court shall be filleted with silver. Their hooks shall be of silver, and their bases of bronze.\n" +
                "18 The length of the court shall be a hundred cubits, the breadth fifty, and the height five cubits, \n" +
                "with hangings of fine twined linen and bases of bronze. \n" +
                "19 All the utensils of the tabernacle for every use, and all its pegs and all the pegs of the court, shall be of bronze.\n";

        String chapterThirdTitle = "Oil for the Lamp";

        String thirdContent = "20 “You shall command the people of Israel that they bring to you pure beaten olive oil for the light, \n" +
                "that a lamp may regularly be set up to burn. \n" +
                "21 In the tent of meeting, outside the veil that is before the testimony, Aaron and his sons shall tend it from evening to morning \n" +
                "before the Lord. It shall be a statute forever to be observed throughout their generations by the people of Israel.\n";


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
        table27.add(lblFirstTitle).pad(10,50,0,0).left();
        table27.row();

        //content of the chapter
        table27.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table27.row();

        //title of the second content
        table27.add(lblSecondTitle).pad(10,50,0,0).left();
        table27.row();

        //content of the second title
        table27.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table27.row();

        //title of the third content
        table27.add(lblThirdTitle).pad(10,50,0,0).left();
        table27.row();

        //content of the third title
        table27.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table27);

    }


    public void chapterTwentyEightOFExodus() {

        table28 = new Table();
        table28.setWidth(tableBG.getWidth());
        table28.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table28.setFillParent(true);
        table28.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Priests' Garments";

        String firstContent = "1 “Then bring near to you Aaron your brother, and his sons with him, from among the people of Israel, \n" +
                "to serve me as priests—Aaron and Aaron's sons, Nadab and Abihu, Eleazar and Ithamar. \n" +
                "2 And you shall make holy garments for Aaron your brother, for glory and for beauty.\n" +
                "3 You shall speak to all the skillful, whom I have filled with a spirit of skill, that they make Aaron's garments \n" +
                "to consecrate him for my priesthood. \n" +
                "4 These are the garments that they shall make: a breastpiece, an ephod, a robe, a coat of checker work, a turban, and a sash. \n" +
                "They shall make holy garments for Aaron your brother and his sons to serve me as priests. \n" +
                "5 They shall receive gold, blue and purple and scarlet yarns, and fine twined linen.\n" +
                "6 “And they shall make the ephod of gold, of blue and purple and scarlet yarns, and of fine twined linen, skillfully worked. \n" +
                "7 It shall have two shoulder pieces attached to its two edges, so that it may be joined together. \n" +
                "8 And the skillfully woven band on it shall be made like it and be of one piece with it, of gold, blue and purple and scarlet yarns, \n" +
                "and fine twined linen. \n" +
                "9 You shall take two onyx stones, and engrave on them the names of the sons of Israel, \n" +
                "10 six of their names on the one stone, and the names of the remaining six on the other stone, in the order of their birth. \n" +
                "11 As a jeweler engraves signets, so shall you engrave the two stones with the names of the sons of Israel. \n" +
                "You shall enclose them in settings of gold filigree. \n" +
                "12 And you shall set the two stones on the shoulder pieces of the ephod, as stones of remembrance for the sons of Israel. \n" +
                "And Aaron shall bear their names before the Lord on his two shoulders for remembrance. \n" +
                "13 You shall make settings of gold filigree,\n" +
                "14 and two chains of pure gold, twisted like cords; and you shall attach the corded chains to the settings.\n" +
                "15 “You shall make a breastpiece of judgment, in skilled work. In the style of the ephod you shall make it—of gold, \n" +
                "blue and purple and scarlet yarns, and fine twined linen shall you make it. \n" +
                "16 It shall be square and doubled, a span its length and a span its breadth. \n" +
                "17 You shall set in it four rows of stones. A row of sardius, topaz, and carbuncle shall be the first row; \n" +
                "18 and the second row an emerald, a sapphire, and a diamond; \n" +
                "19 and the third row a jacinth, an agate, and an amethyst; \n" +
                "20 and the fourth row a beryl, an onyx, and a jasper. They shall be set in gold filigree. \n" +
                "21 There shall be twelve stones with their names according to the names of the sons of Israel. They shall be like signets, \n" +
                "each engraved with its name, for the twelve tribes. \n" +
                "22 You shall make for the breastpiece twisted chains like cords, of pure gold. \n" +
                "23 And you shall make for the breastpiece two rings of gold, and put the two rings on the two edges of the breastpiece. \n" +
                "24 And you shall put the two cords of gold in the two rings at the edges of the breastpiece. \n" +
                "25 The two ends of the two cords you shall attach to the two settings of filigree, and so attach it in front to the shoulder pieces of the ephod. \n" +
                "26 You shall make two rings of gold, and put them at the two ends of the breastpiece, on its inside edge next to the ephod. \n" +
                "27 And you shall make two rings of gold, and attach them in front to the lower part of the two shoulder pieces of the ephod, \n" +
                "at its seam above the skillfully woven band of the ephod. \n" +
                "28 And they shall bind the breastpiece by its rings to the rings of the ephod with a lace of blue, \n" +
                "so that it may lie on the skillfully woven band of the ephod, so that the breastpiece shall not come loose from the ephod. \n" +
                "29 So Aaron shall bear the names of the sons of Israel in the breastpiece of judgment on his heart, when he goes into the Holy Place, \n" +
                "to bring them to regular remembrance before the Lord. \n" +
                "30 And in the breastpiece of judgment you shall put the Urim and the Thummim, and they shall be on Aaron's heart, when he goes in before the Lord. \n" +
                "Thus Aaron shall bear the judgment of the people of Israel on his heart before the Lord regularly.\n" +
                "31 “You shall make the robe of the ephod all of blue. \n" +
                "32 It shall have an opening for the head in the middle of it, with a woven binding around the opening, like the opening in a garment, \n" +
                "so that it may not tear.\n" +
                "33 On its hem you shall make pomegranates of blue and purple and scarlet yarns, around its hem, with bells of gold between them, \n" +
                "34 a golden bell and a pomegranate, a golden bell and a pomegranate, around the hem of the robe. \n" +
                "35 And it shall be on Aaron when he ministers, and its sound shall be heard when he goes into the Holy Place before the Lord, \n" +
                "and when he comes out, so that he does not die.\n" +
                "36 “You shall make a plate of pure gold and engrave on it, like the engraving of a signet, ‘Holy to the Lord.’ \n" +
                "37 And you shall fasten it on the turban by a cord of blue. It shall be on the front of the turban. \n" +
                "38 It shall be on Aaron's forehead, and Aaron shall bear any guilt from the holy things that the people of Israel consecrate as their holy gifts. \n" +
                "It shall regularly be on his forehead, that they may be accepted before the Lord.\n" +
                "39 “You shall weave the coat in checker work of fine linen, and you shall make a turban of fine linen, \n" +
                "and you shall make a sash embroidered with needlework.\n" +
                "40 “For Aaron's sons you shall make coats and sashes and caps. You shall make them for glory and beauty. \n" +
                "41 And you shall put them on Aaron your brother, and on his sons with him, and shall anoint them and ordain them and consecrate them, \n" +
                "that they may serve me as priests. \n" +
                "42 You shall make for them linen undergarments to cover their naked flesh. They shall reach from the hips to the thighs; \n" +
                "43 and they shall be on Aaron and on his sons when they go into the tent of meeting or when they come near the altar to minister in the Holy Place, \n" +
                "lest they bear guilt and die. This shall be a statute forever for him and for his offspring after him.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);
        //title of the chapter
        table28.add(lblFirstTitle).pad(10,50,0,0).left();
        table28.row();

        //content of the chapter
        table28.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table28);

    }


    public void chapterTwentyNineOFExodus() {

        table29 = new Table();
        table29.setWidth(tableBG.getWidth());
        table29.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table29.setFillParent(true);
        table29.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Consecration of the Priests";

        String firstContent = "1 “Now this is what you shall do to them to consecrate them, that they may serve me as priests. \n" +
                "Take one bull of the herd and two rams without blemish, \n" +
                "2 and unleavened bread, unleavened cakes mixed with oil, and unleavened wafers smeared with oil. You shall make them of fine wheat flour. \n" +
                "3 You shall put them in one basket and bring them in the basket, and bring the bull and the two rams.\n" +
                "4 You shall bring Aaron and his sons to the entrance of the tent of meeting and wash them with water. \n" +
                "5 Then you shall take the garments, and put on Aaron the coat and the robe of the ephod, and the ephod, and the breastpiece, \n" +
                "and gird him with the skillfully woven band of the ephod.\n" +
                "6 And you shall set the turban on his head and put the holy crown on the turban. \n" +
                "7 You shall take the anointing oil and pour it on his head and anoint him. \n" +
                "8 Then you shall bring his sons and put coats on them, \n" +
                "9 and you shall gird Aaron and his sons with sashes and bind caps on them. And the priesthood shall be theirs by a statute forever. \n" +
                "Thus you shall ordain Aaron and his sons.\n" +
                "10 “Then you shall bring the bull before the tent of meeting. Aaron and his sons shall lay their hands on the head of the bull. \n" +
                "11 Then you shall kill the bull before the Lord at the entrance of the tent of meeting,\n" +
                "12 and shall take part of the blood of the bull and put it on the horns of the altar with your finger, \n" +
                "and the rest of the blood you shall pour out at the base of the altar. \n" +
                "13 And you shall take all the fat that covers the entrails, and the long lobe of the liver, \n" +
                "and the two kidneys with the fat that is on them, and burn them on the altar. \n" +
                "14 But the flesh of the bull and its skin and its dung you shall burn with fire outside the camp; it is a sin offering.\n" +
                "15 “Then you shall take one of the rams, and Aaron and his sons shall lay their hands on the head of the ram, \n" +
                "16 and you shall kill the ram and shall take its blood and throw it against the sides of the altar. \n" +
                "17 Then you shall cut the ram into pieces, and wash its entrails and its legs, and put them with its pieces and its head, \n" +
                "18 and burn the whole ram on the altar. It is a burnt offering to the Lord. It is a pleasing aroma, a food offering to the Lord.\n" +
                "19 “You shall take the other ram, and Aaron and his sons shall lay their hands on the head of the ram, \n" +
                "20 and you shall kill the ram and take part of its blood and put it on the tip of the right ear of Aaron \n" +
                "and on the tips of the right ears of his sons, and on the thumbs of their right hands and on the great toes of their right feet, \n" +
                "and throw the rest of the blood against the sides of the altar. \n" +
                "21 Then you shall take part of the blood that is on the altar, and of the anointing oil, and sprinkle it on Aaron and his garments, \n" +
                "and on his sons and his sons' garments with him. He and his garments shall be holy, and his sons and his sons' garments with him.\n" +
                "22 “You shall also take the fat from the ram and the fat tail and the fat that covers the entrails, and the long lobe of the liver \n" +
                "and the two kidneys with the fat that is on them, and the right thigh (for it is a ram of ordination), \n" +
                "23 and one loaf of bread and one cake of bread made with oil, and one wafer out of the basket of unleavened bread that is before the Lord. \n" +
                "24 You shall put all these on the palms of Aaron and on the palms of his sons, and wave them for a wave offering before the Lord.\n" +
                "25 Then you shall take them from their hands and burn them on the altar on top of the burnt offering, as a pleasing aroma before the Lord. \n" +
                "It is a food offering to the Lord.\n" +
                "26 “You shall take the breast of the ram of Aaron's ordination and wave it for a wave offering before the Lord, and it shall be your portion. \n" +
                "27 And you shall consecrate the breast of the wave offering that is waved and the thigh of the priests' \n" +
                "portion that is contributed from the ram of ordination, from what was Aaron's and his sons'. \n" +
                "28 It shall be for Aaron and his sons as a perpetual due from the people of Israel, for it is a contribution. \n" +
                "It shall be a contribution from the people of Israel from their peace offerings, their contribution to the Lord.\n" +
                "29 “The holy garments of Aaron shall be for his sons after him; they shall be anointed in them and ordained in them. \n" +
                "30 The son who succeeds him as priest, who comes into the tent of meeting to minister in the Holy Place, shall wear them seven days.\n" +
                "31 “You shall take the ram of ordination and boil its flesh in a holy place.\n" +
                "32 And Aaron and his sons shall eat the flesh of the ram and the bread that is in the basket in the entrance of the tent of meeting. \n" +
                "33 They shall eat those things with which atonement was made at their ordination and consecration, but an outsider shall not eat of them, \n" +
                "because they are holy. \n" +
                "34 And if any of the flesh for the ordination or of the bread remain until the morning, then you shall burn the remainder with fire.\n" +
                " It shall not be eaten, because it is holy.\n" +
                "35 “Thus you shall do to Aaron and to his sons, according to all that I have commanded you. Through seven days shall you ordain them, \n" +
                "36 and every day you shall offer a bull as a sin offering for atonement. Also you shall purify the altar, when you make atonement for it, \n" +
                "and shall anoint it to consecrate it. \n" +
                "37 Seven days you shall make atonement for the altar and consecrate it, and the altar shall be most holy. \n" +
                "Whatever touches the altar shall become holy.\n" +
                "38 “Now this is what you shall offer on the altar: two lambs a year old day by day regularly. \n" +
                "39 One lamb you shall offer in the morning, and the other lamb you shall offer at twilight. \n" +
                "40 And with the first lamb a tenth measure of fine flour mingled with a fourth of a hin of beaten oil, \n" +
                "and a fourth of a hin of wine for a drink offering. \n" +
                "41 The other lamb you shall offer at twilight, and shall offer with it a grain offering and its drink offering, \n" +
                "as in the morning, for a pleasing aroma, a food offering to the Lord. \n" +
                "42 It shall be a regular burnt offering throughout your generations at the entrance of the tent of meeting before the Lord, \n" +
                "where I will meet with you, to speak to you there. \n" +
                "43 There I will meet with the people of Israel, and it shall be sanctified by my glory.\n" +
                "44 I will consecrate the tent of meeting and the altar. Aaron also and his sons I will consecrate to serve me as priests. \n" +
                "45 I will dwell among the people of Israel and will be their God. \n" +
                "46 And they shall know that I am the Lord their God, who brought them out of the land of Egypt that I might dwell among them. \n" +
                "I am the Lord their God.\n";


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


    public void chapterThirtyOFExodus() {

        table30 = new Table();
        table30.setWidth(tableBG.getWidth());
        table30.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table30.setFillParent(true);
        table30.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Altar of Incense";

        String firstContent = "1 “You shall make an altar on which to burn incense; you shall make it of acacia wood.\n" +
                "2 A cubit shall be its length, and a cubit its breadth. It shall be square, and two cubits shall be its height. \n" +
                "Its horns shall be of one piece with it. \n" +
                "3 You shall overlay it with pure gold, its top and around its sides and its horns. And you shall make a molding of gold around it.\n" +
                "4 And you shall make two golden rings for it. Under its molding on two opposite sides of it you shall make them, a\n" +
                "nd they shall be holders for poles with which to carry it.\n" +
                "5 You shall make the poles of acacia wood and overlay them with gold.\n" +
                "6 And you shall put it in front of the veil that is above the ark of the testimony, in front of the mercy seat that is above the testimony, \n" +
                "where I will meet with you. \n" +
                "7 And Aaron shall burn fragrant incense on it. Every morning when he dresses the lamps he shall burn it, \n" +
                "8 and when Aaron sets up the lamps at twilight, he shall burn it, a regular incense offering before the Lord throughout your generations. \n" +
                "9 You shall not offer unauthorized incense on it, or a burnt offering, or a grain offering, and you shall not pour a drink offering on it.\n" +
                "10 Aaron shall make atonement on its horns once a year. With the blood of the sin offering of atonement \n" +
                "he shall make atonement for it once in the year throughout your generations. It is most holy to the Lord.”\n";


        String chapterSecondTitle = "The Census Tax";

        String secondContent = "11 The Lord said to Moses, \n" +
                "12 “When you take the census of the people of Israel, then each shall give a ransom for his life to the Lord when you number them, \n" +
                "that there be no plague among them when you number them.\n" +
                "13 Each one who is numbered in the census shall give this: half a sheke according to the shekel of the sanctuary \n" +
                "(the shekel is twenty gerahs),half a shekel as an offering to the Lord. \n" +
                "14 Everyone who is numbered in the census, from twenty years old and upward, shall give the Lord's offering. \n" +
                "15 The rich shall not give more, and the poor shall not give less, than the half shekel, \n" +
                "when you give the Lord's offering to make atonement for your lives. \n" +
                "16 You shall take the atonement money from the people of Israel and shall give it for the service of the tent of meeting, \n" +
                "that it may bring the people of Israel to remembrance before the Lord, so as to make atonement for your lives.”\n";

        String chapterThirdTitle = "The Bronze Basin";

        String thirdContent = "17 The Lord said to Moses, \n" +
                "18 “You shall also make a basin of bronze, with its stand of bronze, for washing. You shall put it between the tent of meeting and the altar, \n" +
                "and you shall put water in it, \n" +
                "19 with which Aaron and his sons shall wash their hands and their feet. \n" +
                "20 When they go into the tent of meeting, or when they come near the altar to minister, to burn a food offering to the Lord, \n" +
                "they shall wash with water, so that they may not die. \n" +
                "21 They shall wash their hands and their feet, so that they may not die. It shall be a statute forever to them, \n" +
                "even to him and to his offspring throughout their generations.”\n";


        String chapterFourthTitle = "The Anointing Oil and Incense";

        String fourthContent = "22 The Lord said to Moses, \n" +
                "23 “Take the finest spices: of liquid myrrh 500 shekels, and of sweet-smelling cinnamon half as much, that is, 250, and 250 of aromatic cane, \n" +
                "24 and 500 of cassia, according to the shekel of the sanctuary, and a hin of olive oil. \n" +
                "25 And you shall make of these a sacred anointing oil blended as by the perfumer; it shall be a holy anointing oil. \n" +
                "26 With it you shall anoint the tent of meeting and the ark of the testimony, \n" +
                "27 and the table and all its utensils, and the lampstand and its utensils, and the altar of incense, \n" +
                "28 and the altar of burnt offering with all its utensils and the basin and its stand.\n" +
                "29 You shall consecrate them, that they may be most holy. Whatever touches them will become holy. \n" +
                "30 You shall anoint Aaron and his sons, and consecrate them, that they may serve me as priests. \n" +
                "31 And you shall say to the people of Israel, ‘This shall be my holy anointing oil throughout your generations. \n" +
                "32 It shall not be poured on the body of an ordinary person, and you shall make no other like it in composition. \n" +
                "It is holy, and it shall be holy to you. \n" +
                "33 Whoever compounds any like it or whoever puts any of it on an outsider shall be cut off from his people.’”\n" +
                "34 The Lord said to Moses, “Take sweet spices, stacte, and onycha, and galbanum, sweet spices with pure frankincense \n" +
                "(of each shall there be an equal part), \n" +
                "35 and make an incense blended as by the perfumer, seasoned with salt, pure and holy. \n" +
                "36 You shall beat some of it very small, and put part of it before the testimony in the tent of meeting where I shall meet with you. \n" +
                "It shall be most holy for you. \n" +
                "37 And the incense that you shall make according to its composition, you shall not make for yourselves. It shall be for you holy to the Lord. \n" +
                "38 Whoever makes any like it to use as perfume shall be cut off from his people.”\n";


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
        table30.add(lblFirstTitle).pad(10,50,0,0).left();
        table30.row();

        //content of the chapter
        table30.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table30.row();

        //title of the second content
        table30.add(lblSecondTitle).pad(10,50,0,0).left();
        table30.row();

        //content of the second title
        table30.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table30.row();

        //title of the third content
        table30.add(lblThirdTitle).pad(10,50,0,0).left();
        table30.row();

        //content of the third title
        table30.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        //title of the fourth content
        table30.add(lblFourthTitle).pad(10,50,0,0).left();
        table30.row();

        //content of the fourtn title
        table30.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table30);

    }


    public void chapterThirtyOneOFExodus() {

        table31 = new Table();
        table31.setWidth(tableBG.getWidth());
        table31.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table31.setFillParent(true);
        table31.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Oholiab and Bezalel";

        String firstContent = "1 The Lord said to Moses, \n" +
                "2 “See, I have called by name Bezalel the son of Uri, son of Hur, of the tribe of Judah,\n" +
                "3 and I have filled him with the Spirit of God, with ability and intelligence, with knowledge and all craftsmanship,\n" +
                "4 to devise artistic designs, to work in gold, silver, and bronze, \n" +
                "5 in cutting stones for setting, and in carving wood, to work in every craft. \n" +
                "6 And behold, I have appointed with him Oholiab, the son of Ahisamach, of the tribe of Dan. And I have given to all able men ability, \n" +
                "that they may make all that I have commanded you: \n" +
                "7 the tent of meeting, and the ark of the testimony, and the mercy seat that is on it, and all the furnishings of the tent, \n" +
                "8 the table and its utensils, and the pure lampstand with all its utensils, and the altar of incense, \n" +
                "9 and the altar of burnt offering with all its utensils, and the basin and its stand,\n" +
                "10 and the finely worked garments,the holy garments for Aaron the priest and the garments of his sons, for their service as priests, \n" +
                "11 and the anointing oil and the fragrant incense for the Holy Place. According to all that I have commanded you, they shall do.”\n";


        String chapterSecondTitle = "The Sabbath";

        String secondContent = "12 And the Lord said to Moses, \n" +
                "13 “You are to speak to the people of Israel and say, ‘Above all you shall keep my Sabbaths, for this is a sign between me \n" +
                "and you throughout your generations, that you may know that I, the Lord, sanctify you. \n" +
                "14 You shall keep the Sabbath, because it is holy for you. Everyone who profanes it shall be put to death. \n" +
                "Whoever does any work on it, that soul shall be cut off from among his people.\n" +
                "15 Six days shall work be done, but the seventh day is a Sabbath of solemn rest, holy to the Lord. Whoever \n" +
                "does any work on the Sabbath day shall be put to death. \n" +
                "16 Therefore the people of Israel shall keep the Sabbath, observing the Sabbath throughout their generations, as a covenant forever. \n" +
                "17 It is a sign forever between me and the people of Israel that in six days the Lord made heaven and earth, \n" +
                "and on the seventh day he rested and was refreshed.’”\n" +
                "18 And he gave to Moses, when he had finished speaking with him on Mount Sinai, the two tablets of the testimony, \n" +
                "tablets of stone, written with the finger of God.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table31.add(lblFirstTitle).pad(10,50,0,0).left();
        table31.row();

        //content of the chapter
        table31.add(txtFirstContent).pad(10,70,0,0).left();
        table31.row();

        //title of the second content
        table31.add(lblSecondTitle).pad(10,50,0,0).left();
        table31.row();

        //content of the second title
        table31.add(txtSecondContent).pad(10,70,0,0).left();

        stage.addActor(table31);

    }


    public void chapterThirtyTwoOFExodus() {

        table32 = new Table();
        table32.setWidth(tableBG.getWidth());
        table32.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table32.setFillParent(true);
        table32.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Golden Calf";

        String firstContent = "1 When the people saw that Moses delayed to come down from the mountain, the people gathered themselves \n" +
                "together to Aaron and said to him, “Up, make us gods who shall go before us. As for this Moses, the man who brought us up out of the land of Egypt, we do not know what has become of him.” \n" +
                "2 So Aaron said to them, “Take off the rings of gold that are in the ears of your wives, your sons, and your daughters, and bring them to me.” \n" +
                "3 So all the people took off the rings of gold that were in their ears and brought them to Aaron. \n" +
                "4 And he received the gold from their hand and fashioned it with a graving tool and made a golden calf. And they said, \n" +
                "“These are your gods, O Israel, who brought you up out of the land of Egypt!” \n" +
                "5 When Aaron saw this, he built an altar before it. And Aaron made a proclamation and said, “Tomorrow shall be a feast to the Lord.” \n" +
                "6 And they rose up early the next day and offered burnt offerings and brought peace offerings. \n" +
                "And the people sat down to eat and drink and rose up to play.\n" +
                "7 And the Lord said to Moses, “Go down, for your people, whom you brought up out of the land of Egypt, have corrupted themselves. \n" +
                "8 They have turned aside quickly out of the way that I commanded them. They have made for themselves a golden calf and have worshiped it \n" +
                "and sacrificed to it and said, ‘These are your gods, O Israel, who brought you up out of the land of Egypt!’” \n" +
                "9 And the Lord said to Moses, “I have seen this people, and behold, it is a stiff-necked people. \n" +
                "10 Now therefore let me alone, that my wrath may burn hot against them and I may consume them, in order that I may make a great nation of you.”\n" +
                "11 But Moses implored the Lord his God and said, “O Lord, why does your wrath burn hot against your people, \n" +
                "whom you have brought out of the land of Egypt with great power and with a mighty hand? \n" +
                "12 Why should the Egyptians say, ‘With evil intent did he bring them out, to kill them in the mountains \n" +
                "and to consume them from the face of the earth’? Turn from your burning anger and relent from this disaster against your people. \n" +
                "13 Remember Abraham, Isaac, and Israel, your servants, to whom you swore by your own self, and said to them, \n" +
                "‘I will multiply your offspring as the stars of heaven, and all this land that I have promised I will give to your offspring, \n" +
                "and they shall inherit it forever.’” \n" +
                "14 And the Lord relented from the disaster that he had spoken of bringing on his people.\n" +
                "15 Then Moses turned and went down from the mountain with the two tablets of the testimony in his hand, tablets that were written on both sides; \n" +
                "on the front and on the back they were written. \n" +
                "16 The tablets were the work of God, and the writing was the writing of God, engraved on the tablets. \n" +
                "17 When Joshua heard the noise of the people as they shouted, he said to Moses, “There is a noise of war in the camp.”\n" +
                "18 But he said, “It is not the sound of shouting for victory, or the sound of the cry of defeat, but the sound of singing that I hear.” \n" +
                "19 And as soon as he came near the camp and saw the calf and the dancing, Moses' anger burned hot, and he threw the tablets out of his hands \n" +
                "and broke them at the foot of the mountain. \n" +
                "20 He took the calf that they had made and burned it with fire and ground it to powder and scattered it on the water and made the people of Israel \n" +
                "drink it.\n" +
                "21 And Moses said to Aaron, “What did this people do to you that you have brought such a great sin upon them?” \n" +
                "22 And Aaron said, “Let not the anger of my lord burn hot. You know the people, that they are set on evil. \n" +
                "23 For they said to me, ‘Make us gods who shall go before us. As for this Moses, the man who brought us up out of the land of Egypt, \n" +
                "we do not know what has become of him.’ \n" +
                "24 So I said to them, ‘Let any who have gold take it off.’ So they gave it to me, and I threw it into the fire, and out came this calf.”\n" +
                "25 And when Moses saw that the people had broken loose (for Aaron had let them break loose, to the derision of their enemies), \n" +
                "26 then Moses stood in the gate of the camp and said, “Who is on the Lord's side? Come to me.” And all the sons of Levi gathered around him. \n" +
                "27 And he said to them, “Thus says the Lord God of Israel, ‘Put your sword on your side each of you, and go to and fro \n" +
                "from gate to gate throughout the camp, and each of you kill his brother and his companion and his neighbor.’” \n" +
                "28 And the sons of Levi did according to the word of Moses. And that day about three thousand men of the people fell. \n" +
                "29 And Moses said, “Today you have been ordained for the service of the Lord, each one at the cost of his son and of his brother, \n" +
                "so that he might bestow a blessing upon you this day.”\n" +
                "30 The next day Moses said to the people, “You have sinned a great sin. And now I will go up to the Lord;\n" +
                " perhaps I can make atonement for your sin.” \n" +
                "31 So Moses returned to the Lord and said, “Alas, this people has sinned a great sin. They have made for themselves gods of gold.\n" +
                "32 But now, if you will forgive their sin—but if not, please blot me out of your book that you have written.” \n" +
                "33 But the Lord said to Moses, “Whoever has sinned against me, I will blot out of my book. \n" +
                "34 But now go, lead the people to the place about which I have spoken to you; behold, my angel shall go before you.\n" +
                " Nevertheless, in the day when I visit, I will visit their sin upon them.”\n" +
                "35 Then the Lord sent a plague on the people, because they made the calf, the one that Aaron made.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table32.add(lblFirstTitle).pad(10,50,0,0).left();
        table32.row();

        //content of the chapter
        table32.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table32);

    }


    public void chapterThirtyThreeOFExodus() {

        table33 = new Table();
        table33.setWidth(tableBG.getWidth());
        table33.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table33.setFillParent(true);
        table33.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Command to Leave Sinai";

        String firstContent = "1 The Lord said to Moses, “Depart; go up from here, you and the people whom you have brought up out of the land of Egypt, \n" +
                "to the land of which I swore to Abraham, Isaac, and Jacob, saying, ‘To your offspring I will give it.’ \n" +
                "2 I will send an angel before you, and I will drive out the Canaanites, the Amorites, the Hittites, the Perizzites, the Hivites, and the Jebusites. \n" +
                "3 Go up to a land flowing with milk and honey; but I will not go up among you, lest I consume you on the way, for you are a stiff-necked people.”\n" +
                "4 When the people heard this disastrous word, they mourned, and no one put on his ornaments. \n" +
                "5 For the Lord had said to Moses, “Say to the people of Israel, ‘You are a stiff-necked people; \n" +
                "if for a single moment I should go up among you, I would consume you. So now take off your ornaments, that I may know what to do with you.’” \n" +
                "6 Therefore the people of Israel stripped themselves of their ornaments, from Mount Horeb onward.\n";


        String chapterSecondTitle = "The Tent of Meeting";

        String secondContent = "7 Now Moses used to take the tent and pitch it outside the camp, far off from the camp, \n" +
                "and he called it the tent of meeting. And everyone who sought the Lord would go out to the tent of meeting, which was outside the camp. \n" +
                "8 Whenever Moses went out to the tent, all the people would rise up, and each would stand at his tent door, \n" +
                "and watch Moses until he had gone into the tent.\n" +
                "9 When Moses entered the tent, the pillar of cloud would descend and stand at the entrance of the tent, \n" +
                "and the Lord would speak with Moses. \n" +
                "10 And when all the people saw the pillar of cloud standing at the entrance of the tent, all the people would rise up and worship, \n" +
                "each at his tent door. \n" +
                "11 Thus the Lord used to speak to Moses face to face, as a man speaks to his friend. When Moses turned again into the camp, \n" +
                "his assistant Joshua the son of Nun, a young man, would not depart from the tent.\n";

        String chapterThirdTitle = "Moses' Intercession";

        String thirdContent = "12 Moses said to the Lord, “See, you say to me, ‘Bring up this people,’ but you have not let me know whom you will send with me. \n" +
                "Yet you have said, ‘I know you by name, and you have also found favor in my sight.’ \n" +
                "13 Now therefore, if I have found favor in your sight, please show me now your ways, that I may know you in order to find favor in your sight. \n" +
                "Consider too that this nation is your people.” \n" +
                "14 And he said, “My presence will go with you, and I will give you rest.” \n" +
                "15 And he said to him, “If your presence will not go with me, do not bring us up from here.\n" +
                "16 For how shall it be known that I have found favor in your sight, I and your people? Is it not in your going with us, \n" +
                "so that we are distinct, I and your people, from every other people on the face of the earth?”\n" +
                "17 And the Lord said to Moses, “This very thing that you have spoken I will do, for you have found favor in my sight, \n" +
                "and I know you by name.”\n" +
                "18 Moses said, “Please show me your glory.” \n" +
                "19 And he said, “I will make all my goodness pass before you and will proclaim before you my name ‘The Lord.’ \n" +
                "And I will be gracious to whom I will be gracious, and will show mercy on whom I will show mercy. \n" +
                "20 But,” he said, “you cannot see my face, for man shall not see me and live.” \n" +
                "21 And the Lord said, “Behold, there is a place by me where you shall stand on the rock, \n" +
                "22 and while my glory passes by I will put you in a cleft of the rock, and I will cover you with my hand until I have passed by.\n" +
                "23 Then I will take away my hand, and you shall see my back, but my face shall not be seen.”\n";


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
        table33.add(lblFirstTitle).pad(10,50,0,0).left();
        table33.row();

        //content of the chapter
        table33.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table33.row();

        //title of the second content
        table33.add(lblSecondTitle).pad(10,50,0,0).left();
        table33.row();

        //content of the second title
        table33.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table33.row();

        //title of the third content
        table33.add(lblThirdTitle).pad(10,50,0,0).left();
        table33.row();

        //content of the third title
        table33.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table33);


    }


    public void chapterThirtyFourOFExodus() {

        table34 = new Table();
        table34.setWidth(tableBG.getWidth());
        table34.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table34.setFillParent(true);
        table34.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Moses Makes New Tablets";

        String firstContent = "1 The Lord said to Moses, “Cut for yourself two tablets of stone like the first, \n" +
                "and I will write on the tablets the words that were on the first tablets, which you broke. \n" +
                "2 Be ready by the morning, and come up in the morning to Mount Sinai, and present yourself there to me on the top of the mountain.\n" +
                "3 No one shall come up with you, and let no one be seen throughout all the mountain. Let no flocks or herds graze opposite that mountain.”\n" +
                "4 So Moses cut two tablets of stone like the first. And he rose early in the morning and went up on Mount Sinai, as the Lord had commanded him, \n" +
                "and took in his hand two tablets of stone. \n" +
                "5 The Lord descended in the cloud and stood with him there, and proclaimed the name of the Lord. \n" +
                "6 The Lord passed before him and proclaimed, “The Lord, the Lord, a God merciful and gracious, slow to anger, a\n" +
                "nd abounding in steadfast love and faithfulness, \n" +
                "7 keeping steadfast love for thousands, forgiving iniquity and transgression and sin, but who will by no means \n" +
                "clear the guilty, visiting the iniquity of the fathers on the children and the children's children, to the third and the fourth generation.” \n" +
                "8 And Moses quickly bowed his head toward the earth and worshiped. \n" +
                "9 And he said, “If now I have found favor in your sight, O Lord, please let the Lord go in the midst of us, \n" +
                "for it is a stiff-necked people, and pardon our iniquity and our sin, and take us for your inheritance.”\n";


        String chapterSecondTitle = "The Covenant Renewed";

        String secondContent = "10 And he said, “Behold, I am making a covenant. Before all your people I will do marvels, \n" +
                "such as have not been created in all the earth or in any nation. And all the people among whom you are shall see the work of the Lord, \n" +
                "for it is an awesome thing that I will do with you.\n" +
                "11 “Observe what I command you this day. Behold, I will drive out before you the Amorites, \n" +
                "the Canaanites, the Hittites, the Perizzites, the Hivites, and the Jebusites. \n" +
                "12 Take care, lest you make a covenant with the inhabitants of the land to which you go, lest it become a snare in your midst. \n" +
                "13 You shall tear down their altars and break their pillars and cut down their Asherim \n" +
                "14 (for you shall worship no other god, for the Lord, whose name is Jealous, is a jealous God), \n" +
                "15 lest you make a covenant with the inhabitants of the land, and when they whore after their gods and \n" +
                "sacrifice to their gods and you are invited, you eat of his sacrifice, \n" +
                "16 and you take of their daughters for your sons, and their daughters whore after their gods and make your sons whore after their gods.\n" +
                "17 “You shall not make for yourself any gods of cast metal.\n" +
                "18 “You shall keep the Feast of Unleavened Bread. Seven days you shall eat unleavened bread, as I commanded you, \n" +
                "at the time appointed in the month Abib, for in the month Abib you came out from Egypt. \n" +
                "19 All that open the womb are mine, all your male livestock, the firstborn of cow and sheep. \n" +
                "20 The firstborn of a donkey you shall redeem with a lamb, or if you will not redeem it you shall break its neck. \n" +
                "All the firstborn of your sons you shall redeem. And none shall appear before me empty-handed.\n" +
                "21 “Six days you shall work, but on the seventh day you shall rest. In plowing time and in harvest you shall rest.\n" +
                "22 You shall observe the Feast of Weeks, the firstfruits of wheat harvest, and the Feast of Ingathering at the year's end. \n" +
                "23 Three times in the year shall all your males appear before the Lord God, the God of Israel. \n" +
                "24 For I will cast out nations before you and enlarge your borders; no one shall covet your land, \n" +
                "when you go up to appear before the Lord your God three times in the year.\n" +
                "25 “You shall not offer the blood of my sacrifice with anything leavened, or let the sacrifice of the Feast of the Passover remain until the morning.\n" +
                "26 The best of the firstfruits of your ground you shall bring to the house of the Lord your God. \n" +
                "You shall not boil a young goat in its mother's milk.”\n" +
                "27 And the Lord said to Moses, “Write these words, for in accordance with these words I have made a covenant with you and with Israel.”\n" +
                "28 So he was there with the Lord forty days and forty nights. He neither ate bread nor drank water. \n" +
                "And he wrote on the tablets the words of the covenant, the Ten Commandments.\n";


        String chapterThirdTitle = "The Shining Face of Moses";

        String thirdContent = "29 When Moses came down from Mount Sinai, with the two tablets of the testimony in his hand as he came down from the mountain, Moses did not know that the skin of his face shone because he had been talking with God. \n" +
                "30 Aaron and all the people of Israel saw Moses, and behold, the skin of his face shone, and they were afraid to come near him. \n" +
                "31 But Moses called to them, and Aaron and all the leaders of the congregation returned to him, and Moses talked with them. \n" +
                "32 Afterward all the people of Israel came near, and he commanded them all that the Lord had spoken with him in Mount Sinai. \n" +
                "33 And when Moses had finished speaking with them, he put a veil over his face.\n" +
                "34 Whenever Moses went in before the Lord to speak with him, he would remove the veil, until he came out. And when he came out and told the people of Israel what he was commanded, \n" +
                "35 the people of Israel would see the face of Moses, that the skin of Moses' face was shining. And Moses would put the veil over his face again, until he went in to speak with him.\n";


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
        table34.add(lblFirstTitle).pad(10,50,0,0).left();
        table34.row();

        //content of the chapter
        table34.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table34.row();

        //title of the second content
        table34.add(lblSecondTitle).pad(10,50,0,0).left();
        table34.row();

        //content of the second title
        table34.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table34.row();

        //title of the third content
        table34.add(lblThirdTitle).pad(10,50,0,0).left();
        table34.row();

        //content of the third title
        table34.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table34);


    }


    public void chapterThirtyFiveOFExodus() {

        table35 = new Table();
        table35.setWidth(tableBG.getWidth());
        table35.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table35.setFillParent(true);
        table35.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Sabbath Regulations";

        String firstContent = "1 Moses assembled all the congregation of the people of Israel and said to them, \n" +
                "“These are the things that the Lord has commanded you to do.\n" +
                "2 Six days work shall be done, but on the seventh day you shall have a Sabbath of solemn rest, holy to the Lord. \n" +
                "Whoever does any work on it shall be put to death. \n" +
                "3 You shall kindle no fire in all your dwelling places on the Sabbath day.”\n";


        String chapterSecondTitle = "Contributions for the Tabernacle";

        String secondContent = "4 Moses said to all the congregation of the people of Israel, “This is the thing that the Lord has commanded. \n" +
                "5 Take from among you a contribution to the Lord. Whoever is of a generous heart, \n" +
                "let him bring the Lord's contribution: gold, silver, and bronze; \n" +
                "6 blue and purple and scarlet yarns and fine twined linen; goats' hair, \n" +
                "7 tanned rams' skins, and goatskins; acacia wood, \n" +
                "8 oil for the light, spices for the anointing oil and for the fragrant incense, \n" +
                "9 and onyx stones and stones for setting, for the ephod and for the breastpiece.\n" +
                "10 “Let every skillful craftsman among you come and make all that the Lord has commanded: \n" +
                "11 the tabernacle, its tent and its covering, its hooks and its frames, its bars, its pillars, and its bases; \n" +
                "12 the ark with its poles, the mercy seat, and the veil of the screen; \n" +
                "13 the table with its poles and all its utensils, and the bread of the Presence; \n" +
                "14 the lampstand also for the light, with its utensils and its lamps, and the oil for the light; \n" +
                "15 and the altar of incense, with its poles, and the anointing oil and the fragrant incense, \n" +
                "and the screen for the door, at the door of the tabernacle; \n" +
                "16 the altar of burnt offering, with its grating of bronze, its poles, and all its utensils, the basin and its stand; \n" +
                "17 the hangings of the court, its pillars and its bases, and the screen for the gate of the court; \n" +
                "18 the pegs of the tabernacle and the pegs of the court, and their cords; \n" +
                "19 the finely worked garments for ministering in the Holy Place, the holy garments for Aaron the priest, \n" +
                "and the garments of his sons, for their service as priests.”\n" +
                "20 Then all the congregation of the people of Israel departed from the presence of Moses. \n" +
                "21 And they came, everyone whose heart stirred him, and everyone whose spirit moved him, \n" +
                "and brought the Lord's contribution to be used for the tent of meeting, and for all its service, and for the holy garments. \n" +
                "22 So they came, both men and women. All who were of a willing heart brought brooches and earrings and signet rings and armlets, \n" +
                "all sorts of gold objects, every man dedicating an offering of gold to the Lord. \n" +
                "23 And every one who possessed blue or purple or scarlet yarns or fine linen or goats' hair or tanned rams' skins or goatskins brought them. \n" +
                "24 Everyone who could make a contribution of silver or bronze brought it as the Lord's contribution. \n" +
                "And every one who possessed acacia wood of any use in the work brought it. \n" +
                "25 And every skillful woman spun with her hands, and they all brought what they had spun in blue and purple and scarlet yarns and fine twined linen.\n" +
                "26 All the women whose hearts stirred them to use their skill spun the goats' hair. \n" +
                "27 And the leaders brought onyx stones and stones to be set, for the ephod and for the breastpiece, \n" +
                "28 and spices and oil for the light, and for the anointing oil, and for the fragrant incense. \n" +
                "29 All the men and women, the people of Israel, whose heart moved them to bring anything for the work \n" +
                "that the Lord had commanded by Moses to be done brought it as a freewill offering to the Lord.\n";

        String chapterThirdTitle = "Construction of the Tabernacle";

        String thirdContent = "30 Then Moses said to the people of Israel, “See, the Lord has called by name Bezalel the son of Uri, \n" +
                "son of Hur, of the tribe of Judah; \n" +
                "31 and he has filled him with the Spirit of God, with skill, with intelligence, with knowledge, and with all craftsmanship, \n" +
                "32 to devise artistic designs, to work in gold and silver and bronze, \n" +
                "33 in cutting stones for setting, and in carving wood, for work in every skilled craft. \n" +
                "34 And he has inspired him to teach, both him and Oholiab the son of Ahisamach of the tribe of Dan.\n" +
                "35 He has filled them with skill to do every sort of work done by an engraver or by a designer or by an embroiderer \n" +
                "in blue and purple and scarlet yarns and fine twined linen, or by a weaver—by any sort of workman or skilled designer.\n";


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
        table35.row();

        //title of the third content
        table35.add(lblThirdTitle).pad(10,50,0,0).left();
        table35.row();

        //content of the third title
        table35.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table35);

    }


    public void chapterThirtySixOFExodus() {

        table36 = new Table();
        table36.setWidth(tableBG.getWidth());
        table36.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table36.setFillParent(true);
        table36.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 “Bezalel and Oholiab and every craftsman in whom the Lord has put skill and intelligence \n" +
                "to know how to do any work in the construction of the sanctuary shall work in accordance with all that the Lord has commanded.”\n" +
                "2 And Moses called Bezalel and Oholiab and every craftsman in whose mind the Lord had put skill, \n" +
                "everyone whose heart stirred him up to come to do the work. \n" +
                "3 And they received from Moses all the contribution that the people of Israel had brought for doing the work on the sanctuary. \n" +
                "They still kept bringing him freewill offerings every morning,\n" +
                "4 so that all the craftsmen who were doing every sort of task on the sanctuary came, each from the task that he was doing, \n" +
                "5 and said to Moses, “The people bring much more than enough for doing the work that the Lord has commanded us to do.” \n" +
                "6 So Moses gave command, and word was proclaimed throughout the camp, “Let no man or woman do anything more for the contribution for the sanctuary.” \n" +
                "So the people were restrained from bringing, \n" +
                "7 for the material they had was sufficient to do all the work, and more.\n" +
                "8 And all the craftsmen among the workmen made the tabernacle with ten curtains. \n" +
                "They were made of fine twined linen and blue and purple and scarlet yarns, with cherubim skillfully worked. \n" +
                "9 The length of each curtain was twenty-eight cubits, and the breadth of each curtain four cubits. \n" +
                "All the curtains were the same size.\n" +
                "10 He coupled five curtains to one another, and the other five curtains he coupled to one another. \n" +
                "11 He made loops of blue on the edge of the outermost curtain of the first set. \n" +
                "Likewise he made them on the edge of the outermost curtain of the second set. \n" +
                "12 He made fifty loops on the one curtain, and he made fifty loops on the edge of the curtain that was in the second set. \n" +
                "The loops were opposite one another. \n" +
                "13 And he made fifty clasps of gold, and coupled the curtains one to the other with clasps. So the tabernacle was a single whole.\n" +
                "14 He also made curtains of goats' hair for a tent over the tabernacle. He made eleven curtains. \n" +
                "15 The length of each curtain was thirty cubits, and the breadth of each curtain four cubits. \n" +
                "The eleven curtains were the same size. \n" +
                "16 He coupled five curtains by themselves, and six curtains by themselves. \n" +
                "17 And he made fifty loops on the edge of the outermost curtain of the one set, and fifty loops on the edge of the other connecting curtain. \n" +
                "18 And he made fifty clasps of bronze to couple the tent together that it might be a single whole. \n" +
                "19 And he made for the tent a covering of tanned rams' skins and goatskins.\n" +
                "20 Then he made the upright frames for the tabernacle of acacia wood.\n" +
                "21 Ten cubits was the length of a frame, and a cubit and a half the breadth of each frame. \n" +
                "22 Each frame had two tenons for fitting together. He did this for all the frames of the tabernacle. \n" +
                "23 The frames for the tabernacle he made thus: twenty frames for the south side. \n" +
                "24 And he made forty bases of silver under the twenty frames, two bases under one frame for its two tenons, \n" +
                "and two bases under the next frame for its two tenons.\n" +
                "25 For the second side of the tabernacle, on the north side, he made twenty frames \n" +
                "26 and their forty bases of silver, two bases under one frame and two bases under the next frame. \n" +
                "27 For the rear of the tabernacle westward he made six frames. \n" +
                "28 He made two frames for corners of the tabernacle in the rear. \n" +
                "29 And they were separate beneath but joined at the top, at the first ring. He made two of them this way for the two corners. \n" +
                "30 There were eight frames with their bases of silver: sixteen bases, under every frame two bases.\n" +
                "31 He made bars of acacia wood, five for the frames of the one side of the tabernacle, \n" +
                "32 and five bars for the frames of the other side of the tabernacle, and five bars for the frames of the tabernacle at the rear westward. \n" +
                "33 And he made the middle bar to run from end to end halfway up the frames. \n" +
                "34 And he overlaid the frames with gold, and made their rings of gold for holders for the bars, and overlaid the bars with gold.\n" +
                "35 He made the veil of blue and purple and scarlet yarns and fine twined linen; with cherubim skillfully worked into it he made it.\n" +
                "36 And for it he made four pillars of acacia and overlaid them with gold. Their hooks were of gold, and he cast for them four bases of silver. \n" +
                "37 He also made a screen for the entrance of the tent, of blue and purple and scarlet yarns and fine twined linen, embroidered with needlework, \n" +
                "38 and its five pillars with their hooks. He overlaid their capitals, and their fillets were of gold, but their five bases were of bronze.\n";
    

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


    public void chapterThirtySevenOFExodus() {

        table37 = new Table();
        table37.setWidth(tableBG.getWidth());
        table37.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table37.setFillParent(true);
        table37.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Making the Ark";

        String firstContent = "1 Bezalel made the ark of acacia wood. Two cubits and a half was its length, a cubit and a half its breadth, \n" +
                "and a cubit and a half its height.\n" +
                "2 And he overlaid it with pure gold inside and outside, and made a molding of gold around it. \n" +
                "3 And he cast for it four rings of gold for its four feet, two rings on its one side and two rings on its other side. \n" +
                "4 And he made poles of acacia wood and overlaid them with gold \n" +
                "5 and put the poles into the rings on the sides of the ark to carry the ark.\n" +
                "6 And he made a mercy seat of pure gold. Two cubits and a half was its length, and a cubit and a half its breadth. \n" +
                "7 And he made two cherubim of gold. He made them of hammered work on the two ends of the mercy seat,\n" +
                "8 one cherub on the one end, and one cherub on the other end. Of one piece with the mercy seat he made the cherubim on its two ends. \n" +
                "9 The cherubim spread out their wings above, overshadowing the mercy seat with their wings, with their faces one to another; \n" +
                "toward the mercy seat were the faces of the cherubim.\n";


        String chapterSecondTitle = "Making the Table";

        String secondContent = "10 He also made the table of acacia wood. Two cubits was its length, a cubit its breadth, and a cubit and a half its height. \n" +
                "11 And he overlaid it with pure gold, and made a molding of gold around it. \n" +
                "12 And he made a rim around it a handbreadth wide, and made a molding of gold around the rim. \n" +
                "13 He cast for it four rings of gold and fastened the rings to the four corners at its four legs. \n" +
                "14 Close to the frame were the rings, as holders for the poles to carry the table. \n" +
                "15 He made the poles of acacia wood to carry the table, and overlaid them with gold. \n" +
                "16 And he made the vessels of pure gold that were to be on the table, its plates and dishes for incense, \n" +
                "and its bowls and flagons with which to pour drink offerings.\n";

        String chapterThirdTitle = "Making the Lampstand";

        String thirdContent = "17 He also made the lampstand of pure gold. He made the lampstand of hammered work. \n" +
                "Its base, its stem, its cups, its calyxes, and its flowers were of one piece with it. \n" +
                "18 And there were six branches going out of its sides, three branches of the lampstand out of one side of it \n" +
                "and three branches of the lampstand out of the other side of it; \n" +
                "19 three cups made like almond blossoms, each with calyx and flower, on one branch, and three cups made like almond blossoms, \n" +
                "each with calyx and flower, on the other branch—so for the six branches going out of the lampstand.\n" +
                "20 And on the lampstand itself were four cups made like almond blossoms, with their calyxes and flowers, \n" +
                "21 and a calyx of one piece with it under each pair of the six branches going out of it. 22 Their calyxes \n" +
                "and their branches were of one piece with it. The whole of it was a single piece of hammered work of pure gold. \n" +
                "23 And he made its seven lamps and its tongs and its trays of pure gold. \n" +
                "24 He made it and all its utensils out of a talent of pure gold.\n";


        String chapterFourthTitle = "Making the Altar of Incense";

        String fourthContent = "25 He made the altar of incense of acacia wood. Its length was a cubit, and its breadth was a cubit. \n" +
                "It was square, and two cubits was its height. Its horns were of one piece with it. \n" +
                "26 He overlaid it with pure gold, its top and around its sides and its horns. And he made a molding of gold around it, \n" +
                "27 and made two rings of gold on it under its molding, on two opposite sides of it, as holders for the poles with which to carry it. \n" +
                "28 And he made the poles of acacia wood and overlaid them with gold.\n" +
                "29 He made the holy anointing oil also, and the pure fragrant incense, blended as by the perfumer.\n";


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
        table37.row();

        //title of the third content
        table37.add(lblThirdTitle).pad(10,50,0,0).left();
        table37.row();

        //content of the third title
        table37.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        //title of the fourth content
        table37.add(lblFourthTitle).pad(10,50,0,0).left();
        table37.row();

        //content of the fourtn title
        table37.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table37);


    }

    public void chapterThirtyEightOFExodus() {

        table38 = new Table();
        table38.setWidth(tableBG.getWidth());
        table38.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table38.setFillParent(true);
        table38.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Making the Altar of Burnt Offering";

        String firstContent = "1 He made the altar of burnt offering of acacia wood. Five cubits[a] was its length, and five cubits its breadth. \n" +
                "It was square, and three cubits was its height. \n" +
                "2 He made horns for it on its four corners. Its horns were of one piece with it, and he overlaid it with bronze. \n" +
                "3 And he made all the utensils of the altar, the pots, the shovels, the basins, the forks, and the fire pans. \n" +
                "He made all its utensils of bronze. \n" +
                "4 And he made for the altar a grating, a network of bronze, under its ledge, extending halfway down.\n" +
                "5 He cast four rings on the four corners of the bronze grating as holders for the poles. \n" +
                "6 He made the poles of acacia wood and overlaid them with bronze. \n" +
                "7 And he put the poles through the rings on the sides of the altar to carry it with them. He made it hollow, with boards.\n";


        String chapterSecondTitle = "Making the Bronze Basin";

        String secondContent = "8 He made the basin of bronze and its stand of bronze, from the mirrors of the ministering women\n" +
                " who ministered in the entrance of the tent of meeting.";

        String chapterThirdTitle = "Making the Court";

        String thirdContent = "9 And he made the court. For the south side the hangings of the court were of fine twined linen, a hundred cubits; \n" +
                "10 their twenty pillars and their twenty bases were of bronze, but the hooks of the pillars and their fillets were of silver. \n" +
                "11 And for the north side there were hangings of a hundred cubits; their twenty pillars and their twenty bases were of bronze, \n" +
                "but the hooks of the pillars and their fillets were of silver. \n" +
                "12 And for the west side were hangings of fifty cubits, their ten pillars, \n" +
                "and their ten bases; the hooks of the pillars and their fillets were of silver. \n" +
                "13 And for the front to the east, fifty cubits. \n" +
                "14 The hangings for one side of the gate were fifteen cubits, with their three pillars and three bases. \n" +
                "15 And so for the other side. On both sides of the gate of the court were hangings of fifteen cubits,\n" +
                " with their three pillars and their three bases.\n" +
                "16 All the hangings around the court were of fine twined linen.\n" +
                "17 And the bases for the pillars were of bronze, but the hooks of the pillars and their fillets were of silver. \n" +
                "The overlaying of their capitals was also of silver, and all the pillars of the court were filleted with silver. \n" +
                "18 And the screen for the gate of the court was embroidered with needlework in blue and purple and scarlet yarns and fine twined linen.\n" +
                " It was twenty cubits long and five cubits high in its breadth, corresponding to the hangings of the court.\n" +
                "19 And their pillars were four in number. Their four bases were of bronze, their hooks of silver,\n" +
                " and the overlaying of their capitals and their fillets of silver.\n" +
                "20 And all the pegs for the tabernacle and for the court all around were of bronze.\n";

        String chapterFourthTitle = "Materials for the Tabernacle";

        String fourthContent = "21 These are the records of the tabernacle, the tabernacle of the testimony, \n" +
                "as they were recorded at the commandment of Moses, the responsibility of the Levites under the direction of Ithamar the son of Aaron the priest. \n" +
                "22 Bezalel the son of Uri, son of Hur, of the tribe of Judah, made all that the Lord commanded Moses; \n" +
                "23 and with him was Oholiab the son of Ahisamach, of the tribe of Dan, an engraver and designer \n" +
                "and embroiderer in blue and purple and scarlet yarns and fine twined linen.\n" +
                "24 All the gold that was used for the work, in all the construction of the sanctuary, the gold from the offering, \n" +
                "was twenty-nine talents and 730 shekels, by the shekel of the sanctuary. \n" +
                "25 The silver from those of the congregation who were recorded was a hundred talents and 1,775 shekels, by the shekel of the sanctuary: \n" +
                "26 a beka a head (that is, half a shekel, by the shekel of the sanctuary), for everyone who was listed in the records, \n" +
                "from twenty years old and upward, for 603,550 men. \n" +
                "27 The hundred talents of silver were for casting the bases of the sanctuary and the bases of the veil; \n" +
                "a hundred bases for the hundred talents, a talent a base. \n" +
                "28 And of the 1,775 shekels he made hooks for the pillars and overlaid their capitals and made fillets for them. \n" +
                "29 The bronze that was offered was seventy talents and 2,400 shekels; \n" +
                "30 with it he made the bases for the entrance of the tent of meeting, the bronze altar and the bronze grating for it \n" +
                "and all the utensils of the altar, \n" +
                "31 the bases around the court, and the bases of the gate of the court, all the pegs of the tabernacle, and all the pegs around the court.\n";


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
        table38.add(lblFirstTitle).pad(10,50,0,0).left();
        table38.row();

        //content of the chapter
        table38.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table38.row();

        //title of the second content
        table38.add(lblSecondTitle).pad(10,50,0,0).left();
        table38.row();

        //content of the second title
        table38.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table38.row();

        //title of the third content
        table38.add(lblThirdTitle).pad(10,50,0,0).left();
        table38.row();

        //content of the third title
        table38.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        //title of the fourth content
        table38.add(lblFourthTitle).pad(10,50,0,0).left();
        table38.row();

        //content of the fourtn title
        table38.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table38);

    }

    public void chapterThirtyNineOFExodus() {

        table39 = new Table();
        table39.setWidth(tableBG.getWidth());
        table39.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table39.setFillParent(true);
        table39.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Making the Priestly Garments";

        String firstContent = "1 From the blue and purple and scarlet yarns they made finely woven garments, \n" +
                "for ministering in the Holy Place. They made the holy garments for Aaron, as the Lord had commanded Moses.\n" +
                "2 He made the ephod of gold, blue and purple and scarlet yarns, and fine twined linen. \n" +
                "3 And they hammered out gold leaf, and he cut it into threads to work into the blue and purple and the scarlet yarns, \n" +
                "and into the fine twined linen, in skilled design. \n" +
                "4 They made for the ephod attaching shoulder pieces, joined to it at its two edges. \n" +
                "5 And the skillfully woven band on it was of one piece with it and made like it, of gold, blue and purple and scarlet yarns, \n" +
                "and fine twined linen, as the Lord had commanded Moses.\n" +
                "6 They made the onyx stones, enclosed in settings of gold filigree, and engraved like the engravings of a signet, \n" +
                "according to the names of the sons of Israel. \n" +
                "7 And he set them on the shoulder pieces of the ephod to be stones of remembrance for the sons of Israel, as the Lord had commanded Moses.\n" +
                "8 He made the breastpiece, in skilled work, in the style of the ephod, of gold, blue and purple and scarlet yarns, and fine twined linen. \n" +
                "9 It was square. They made the breastpiece doubled, a span its length and a span its breadth when doubled. \n" +
                "10 And they set in it four rows of stones. A row of sardius, topaz, and carbuncle was the first row; \n" +
                "11 and the second row, an emerald, a sapphire, and a diamond; \n" +
                "12 and the third row, a jacinth, an agate, and an amethyst; \n" +
                "13 and the fourth row, a beryl, an onyx, and a jasper. They were enclosed in settings of gold filigree. \n" +
                "14 There were twelve stones with their names according to the names of the sons of Israel. They were like signets, \n" +
                "each engraved with its name, for the twelve tribes.\n" +
                "15 And they made on the breastpiece twisted chains like cords, of pure gold. \n" +
                "16 And they made two settings of gold filigree and two gold rings, and put the two rings on the two edges of the breastpiece. \n" +
                "17 And they put the two cords of gold in the two rings at the edges of the breastpiece. \n" +
                "18 They attached the two ends of the two cords to the two settings of filigree. \n" +
                "Thus they attached it in front to the shoulder pieces of the ephod. \n" +
                "19 Then they made two rings of gold, and put them at the two ends of the breastpiece, on its inside edge next to the ephod. \n" +
                "20 And they made two rings of gold, and attached them in front to the lower part of the two shoulder pieces of the ephod, \n" +
                "at its seam above the skillfully woven band of the ephod. \n" +
                "21 And they bound the breastpiece by its rings to the rings of the ephod with a lace of blue, so that it should lie \n" +
                "on the skillfully woven band of the ephod, and that the breastpiece should not come loose from the ephod, as the Lord had commanded Moses.\n" +
                "22 He also made the robe of the ephod woven all of blue, \n" +
                "23 and the opening of the robe in it was like the opening in a garment, with a binding around the opening, so that it might not tear. \n" +
                "24 On the hem of the robe they made pomegranates of blue and purple and scarlet yarns and fine twined linen. \n" +
                "25 They also made bells of pure gold, and put the bells between the pomegranates all around the hem of the robe, between the pomegranates— \n" +
                "26 a bell and a pomegranate, a bell and a pomegranate around the hem of the robe for ministering, as the Lord had commanded Moses.\n" +
                "27 They also made the coats, woven of fine linen, for Aaron and his sons,\n" +
                "28 and the turban of fine linen, and the caps of fine linen, and the linen undergarments of fine twined linen, \n" +
                "29 and the sash of fine twined linen and of blue and purple and scarlet yarns, embroidered with needlework, as the Lord had commanded Moses.\n" +
                "30 They made the plate of the holy crown of pure gold, and wrote on it an inscription, like the engraving of a signet, “Holy to the Lord.” \n" +
                "31 And they tied to it a cord of blue to fasten it on the turban above, as the Lord had commanded Moses.\n" +
                "32 Thus all the work of the tabernacle of the tent of meeting was finished, and the people of Israel \n" +
                "did according to all that the Lord had commanded Moses; so they did. \n" +
                "33 Then they brought the tabernacle to Moses, the tent and all its utensils, its hooks, its frames, its bars, its pillars, and its bases; \n" +
                "34 the covering of tanned rams' skins and goatskins, and the veil of the screen; \n" +
                "35 the ark of the testimony with its poles and the mercy seat; \n" +
                "36 the table with all its utensils, and the bread of the Presence; \n" +
                "37 the lampstand of pure gold and its lamps with the lamps set and all its utensils, and the oil for the light; \n" +
                "38 the golden altar, the anointing oil and the fragrant incense, and the screen for the entrance of the tent; \n" +
                "39 the bronze altar, and its grating of bronze, its poles, and all its utensils; the basin and its stand; \n" +
                "40 the hangings of the court, its pillars, and its bases, and the screen for the gate of the court, its cords, \n" +
                "and its pegs; and all the utensils for the service of the tabernacle, for the tent of meeting; \n" +
                "41 the finely worked garments for ministering in the Holy Place, the holy garments for Aaron the priest, \n" +
                "and the garments of his sons for their service as priests. \n" +
                "42 According to all that the Lord had commanded Moses, so the people of Israel had done all the work. \n" +
                "43 And Moses saw all the work, and behold, they had done it; as the Lord had commanded, so had they done it. Then Moses blessed them.\n";
    

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


    public void chapterFortyOFExodus() {

        table40 = new Table();
        table40.setWidth(tableBG.getWidth());
        table40.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table40.setFillParent(true);
        table40.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Tabernacle Erected";

        String firstContent = "1 The Lord spoke to Moses, saying, \n" +
                "2 “On the first day of the first month you shall erect the tabernacle of the tent of meeting. \n" +
                "3 And you shall put in it the ark of the testimony, and you shall screen the ark with the veil. \n" +
                "4 And you shall bring in the table and arrange it, and you shall bring in the lampstand and set up its lamps. \n" +
                "5 And you shall put the golden altar for incense before the ark of the testimony, and set up the screen for the door of the tabernacle. \n" +
                "6 You shall set the altar of burnt offering before the door of the tabernacle of the tent of meeting, \n" +
                "7 and place the basin between the tent of meeting and the altar, and put water in it.\n" +
                "8 And you shall set up the court all around, and hang up the screen for the gate of the court.\n" +
                "9 “Then you shall take the anointing oil and anoint the tabernacle and all that is in it, and consecrate it and all its furniture, \n" +
                "so that it may become holy. \n" +
                "10 You shall also anoint the altar of burnt offering and all its utensils, and consecrate the altar, so that the altar may become most holy. \n" +
                "11 You shall also anoint the basin and its stand, and consecrate it.\n" +
                "12 Then you shall bring Aaron and his sons to the entrance of the tent of meeting and shall wash them with water \n" +
                "13 and put on Aaron the holy garments. And you shall anoint him and consecrate him, that he may serve me as priest. \n" +
                "14 You shall bring his sons also and put coats on them, \n" +
                "15 and anoint them, as you anointed their father, that they may serve me as priests. \n" +
                "And their anointing shall admit them to a perpetual priesthood throughout their generations.”\n" +
                "16 This Moses did; according to all that the Lord commanded him, so he did. \n" +
                "17 In the first month in the second year, on the first day of the month, the tabernacle was erected. \n" +
                "18 Moses erected the tabernacle. He laid its bases, and set up its frames, and put in its poles, and raised up its pillars. \n" +
                "19 And he spread the tent over the tabernacle and put the covering of the tent over it, as the Lord had commanded Moses. \n" +
                "20 He took the testimony and put it into the ark, and put the poles on the ark and set the mercy seat above on the ark. \n" +
                "21 And he brought the ark into the tabernacle and set up the veil of the screen, and screened the ark of the testimony, \n" +
                "as the Lord had commanded Moses. \n" +
                "22 He put the table in the tent of meeting, on the north side of the tabernacle, outside the veil,\n" +
                "23 and arranged the bread on it before the Lord, as the Lord had commanded Moses. \n" +
                "24 He put the lampstand in the tent of meeting, opposite the table on the south side of the tabernacle, \n" +
                "25 and set up the lamps before the Lord, as the Lord had commanded Moses. \n" +
                "26 He put the golden altar in the tent of meeting before the veil,\n" +
                "27 and burned fragrant incense on it, as the Lord had commanded Moses. \n" +
                "28 He put in place the screen for the door of the tabernacle. \n" +
                "29 And he set the altar of burnt offering at the entrance of the tabernacle of the tent of meeting, \n" +
                "and offered on it the burnt offering and the grain offering, as the Lord had commanded Moses. \n" +
                "30 He set the basin between the tent of meeting and the altar, and put water in it for washing, \n" +
                "31 with which Moses and Aaron and his sons washed their hands and their feet. \n" +
                "32 When they went into the tent of meeting, and when they approached the altar, they washed, as the Lord commanded Moses. \n" +
                "33 And he erected the court around the tabernacle and the altar, and set up the screen of the gate of the court. So Moses finished the work.\n";


        String chapterSecondTitle = "The Glory of the Lord";

        String secondContent = "34 Then the cloud covered the tent of meeting, and the glory of the Lord filled the tabernacle. \n" +
                "35 And Moses was not able to enter the tent of meeting because the cloud settled on it, and the glory of the Lord filled the tabernacle. \n" +
                "36 Throughout all their journeys, whenever the cloud was taken up from over the tabernacle, the people of Israel would set out.\n" +
                "37 But if the cloud was not taken up, then they did not set out till the day that it was taken up. \n" +
                "38 For the cloud of the Lord was on the tabernacle by day, and fire was in it by night, in the sight of all the house of Israel \n" +
                "throughout all their journeys.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);
        
        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table40.add(lblFirstTitle).pad(10,50,0,0).left();
        table40.row();

        //content of the chapter
        table40.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table40.row();

        //title of the second content
        table40.add(lblSecondTitle).pad(10,50,0,0).left();
        table40.row();

        //content of the second title
        table40.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table40);

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
    }

    public void update(){

        camera.update();
    }

    public void render(SpriteBatch sb){

        stage.draw();
    }

    public Table getTable40() {
        return table40;
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

    public Stage getStage() {
        return stage;
    }

    public OrthographicCamera getCamera() {
        return camera;
    }
}
