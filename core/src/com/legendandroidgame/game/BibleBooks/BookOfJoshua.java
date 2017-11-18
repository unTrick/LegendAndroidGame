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

public class BookOfJoshua {

		private Stage stage;
        private OrthographicCamera camera;

        BitmapFont contentFont;

        private Label txtFirstContent, txtSecondContent, txtThirdContent, txtFourthContent, txtFifthContent, txtSixthContent, txtSeventhContent;
        private Label lblFirstTitle, lblSecondTitle, lblThirdTitle, lblFourthTitle, lblFifthTitle, lblSixthTitle, lblSeventhTitle;

        private Texture tableBG;

        private Table table1, table2, table3, table4, table5, table6, table7, table8, table9, table10, table11, table12,
                table13, table14, table15, table16, table17, table18, table19, table20, table21, table22, table23,
                table24;

        public BookOfJoshua(){

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

            chapterOneOFJoshua();
            chapterTwoOFJoshua();
            chapterThreeOFJoshua();
            chapterFourOFJoshua();
            chapterFiveOFJoshua();
            chapterSixOFJoshua();
            chapterSevenOFJoshua();
            chapterEightOFJoshua();
            chapterNineOFJoshua();
            chapterTenOFJoshua();
            chapterElevenOFJoshua();
            chapterTwelveOFJoshua();
            chapterThirteenOFJoshua();
            chapterFourteenOFJoshua();
            chapterFifteenOFJoshua();
            chapterSixteenOFJoshua();
            chapterSeventeenOFJoshua();
            chapterEighteenOFJoshua();
            chapterNineteenOFJoshua();
            chapterTwentyOFJoshua();
            chapterTwentyOneOFJoshua();
            chapterTwentyTwoOFJoshua();
            chapterTwentyThreeOFJoshua();
            chapterTwentyFourOFJoshua();
            
        }


    public void chapterOneOFJoshua() {

    	table1 = new Table();
        table1.setWidth(tableBG.getWidth());
        table1.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table1.setFillParent(true);
        table1.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "God Commissions Joshua";

    	String firstContent = "1 After the death of Moses the servant of the LORD, the LORD said to Joshua the son of Nun, Moses' assistant, \n" +
			"2 “Moses my servant is dead. Now therefore arise, go over this Jordan, you and all this people, into the land that I am giving to them, \n" +
			"to the people of Israel. \n" +
 			"3 Every place that the sole of your foot will tread upon I have given to you, just as I promised to Moses. \n" +
 			"4 From the wilderness and this Lebanon as far as the great river, the river Euphrates, all the land of the Hittites to the Great Sea toward \n" +
 			"the going down of the sun shall be your territory. \n" +
			"5 No man shall be able to stand before you all the days of your life. Just as I was with Moses, so I will be with you. \n" +
			"I will not leave you or forsake you. \n" +
			"6 Be strong and courageous, for you shall cause this people to inherit the land that I swore to their fathers to give them.\n" +
			"7 Only be strong and very courageous, being careful to do according to all the law that Moses my servant commanded you. \n" +
			"Do not turn from it to the right hand or to the left, that you may have good success wherever you go. \n" +
			"8 This Book of the Law shall not depart from your mouth, but you shall meditate on it day and night, \n" +
			"so that you may be careful to do according to all that is written in it. For then you will make your way prosperous, \n" +
			"and then you will have good success. \n" +
			"9 Have I not commanded you? Be strong and courageous. Do not be frightened, and do not be dismayed, \n" +
			"for the LORD your God is with you wherever you go.”\n";

    	String chapterSecondTitle = "Joshua Assumes Command";

    	String secondContent = "10 And Joshua commanded the officers of the people, \n" + 
			"11 “Pass through the midst of the camp and command the people, ‘Prepare your provisions, for within three days you are to pass over this Jordan \n" +
			"to go in to take possession of the land that the LORD your God is giving you to possess.’” \n" +
			"12 And to the Reubenites, the Gadites, and the half-tribe of Manasseh Joshua said, \n" +
			"13 “Remember the word that Moses the servant of the LORD commanded you, saying, ‘The LORD your God is providing you a place of rest \n" +
			"and will give you this land.’ \n" +
			"14 Your wives, your little ones, and your livestock shall remain in the land that Moses gave you beyond the Jordan, but all the men of valor \n" +
			"among you shall pass over armed before your brothers and shall help them, \n" +
			"15 until the LORD gives rest to your brothers as he has to you, and they also take possession of the land that the LORD your God is giving them. \n" +
			"Then you shall return to the land of your possession and shall possess it, the land that Moses the servant of the LORD gave you beyond the Jordan \n" +
			"toward the sunrise.” \n" +
			"16 And they answered Joshua, “All that you have commanded us we will do, and wherever you send us we will go. \n" +
			"17 Just as we obeyed Moses in all things, so we will obey you. Only may the LORD your God be with you, as he was with Moses! \n" +
			"18 Whoever rebels against your commandment and disobeys your words, whatever you command him, shall be put to death. Only be strong and courageous. \n ";

    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the first content
        table1.add(lblFirstTitle).pad(10,50,0,0).left();
        table1.row();

        //content of the first title
        table1.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table1.row();

        //title of the second content
        table1.add(lblSecondTitle).pad(10,50,0,0).left();
        table1.row();

        //content of the second title
        table1.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table1);

    }


    public void chapterTwoOFJoshua() {

    	table2 = new Table();
        table2.setWidth(tableBG.getWidth());
        table2.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table2.setFillParent(true);
        table2.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "Rahab Hides the Spies";

    	String firstContent = "1 And Joshua the son of Nun sent two men secretly from Shittim as spies, saying, “Go, view the land, especially Jericho.” \n" +
    			"And they went and came into the house of a prostitute whose name was Rahab and lodged there. \n" +
				"2 And it was told to the king of Jericho, “Behold, men of Israel have come here tonight to search out the land.” \n" +
				"3 Then the king of Jericho sent to Rahab, saying, “Bring out the men who have come to you, who entered your house, for they have come to search \n" +
				"out all the land.” \n" +
				"4 But the woman had taken the two men and hidden them. And she said, “True, the men came to me, but I did not know where they were from. \n" +
				"5 And when the gate was about to be closed at dark, the men went out. I do not know where the men went. Pursue them quickly,\n" + 
				"for you will overtake them.” \n" +
				"6 But she had brought them up to the roof and hid them with the stalks of flax that she had laid in order on the roof.\n" +
				"7 So the men pursued after them on the way to the Jordan as far as the fords. And the gate was shut as soon as the pursuers had gone out.\n" +
				"8 Before the men lay down, she came up to them on the roof \n" +
				"9 and said to the men, “I know that the LORD has given you the land, and that the fear of you has fallen upon us, and that all the inhabitants \n" +
				"of the land melt away before you. \n" +
				"10 For we have heard how the LORD dried up the water of the Red Sea before you when you came out of Egypt, and what you did to the two kings of the Amorites \n" +
				"who were beyond the Jordan, to Sihon and Og, whom you devoted to destruction.\n" +
				"11 And as soon as we heard it, our hearts melted, and there was no spirit left in any man because of you, for the LORD your God, \n" +
				"he is God in the heavens above and on the earth beneath. \n" +
				"12 Now then, please swear to me by the LORD that, as I have dealt kindly with you, you also will deal kindly with my father's house, \n" +
				"and give me a sure sign \n" +
				"13 that you will save alive my father and mother, my brothers and sisters, and all who belong to them, and deliver our lives from death.” \n" +
				"14 And the men said to her, “Our life for yours even to death! If you do not tell this business of ours, then when the LORD gives us the land we will deal \n" +
				"kindly and faithfully with you.”\n" +
				"15 Then she let them down by a rope through the window, for her house was built into the city wall, so that she lived in the wall. \n" +
				"16 And she said to them, “Go into the hills, or the pursuers will encounter you, and hide there three days until the pursuers have returned. \n" +
				"Then afterward you may go your way.” \n" +
				"17 The men said to her, “We will be guiltless with respect to this oath of yours that you have made us swear. \n" +
				"18 Behold, when we come into the land, you shall tie this scarlet cord in the window through which you let us down, and you shall gather into your house \n" +
				"your father and mother, your brothers, and all your father's household.\n" +
				"19 Then if anyone goes out of the doors of your house into the street, his blood shall be on his own head, and we shall be guiltless. \n" +
				"But if a hand is laid on anyone who is with you in the house, his blood shall be on our head. \n" +
				"20 But if you tell this business of ours, then we shall be guiltless with respect to your oath that you have made us swear.” \n" +
				"21 And she said, “According to your words, so be it.” Then she sent them away, and they departed. And she tied the scarlet cord in the window.\n" +
				"22 They departed and went into the hills and remained there three days until the pursuers returned, and the pursuers searched all along the way \n" +
				"and found nothing. \n" +
				"23 Then the two men returned. They came down from the hills and passed over and came to Joshua the son of Nun, and they told him all that had happened to them. \n" +
				"24 And they said to Joshua, “Truly the LORD has given all the land into our hands. And also, all the inhabitants of the land melt away because of us.”\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the first content
        table2.add(lblFirstTitle).pad(10,50,0,0).left();
        table2.row();

        //content of the first title
        table2.add(txtFirstContent).pad(10,70,0,0).left().width(900);

    }


    public void chapterThreeOFJoshua() {

    	table3 = new Table();
        table3.setWidth(tableBG.getWidth());
        table3.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table3.setFillParent(true);
        table3.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "Israel Crosses the Jordan";

    	String firstContent = "1 Then Joshua rose early in the morning and they set out from Shittim. And they came to the Jordan, \n" +
    		"he and all the people of Israel, and lodged there before they passed over. \n" +
			"2 At the end of three days the officers went through the camp \n" +
			"3 and commanded the people, “As soon as you see the ark of the covenant of the LORD your God being carried by the Levitical priests, \n" +
			"then you shall set out from your place and follow it.\n" +
			"4 Yet there shall be a distance between you and it, about 2,000 cubits in length. Do not come near it, \n" +
			"in order that you may know the way you shall go, for you have not passed this way before.” \n" +
			"5 Then Joshua said to the people, “Consecrate yourselves, for tomorrow the LORD will do wonders among you.” \n" +
			"6 And Joshua said to the priests, “Take up the ark of the covenant and pass on before the people.” \n" +
			"So they took up the ark of the covenant and went before the people.\n" +
			"7 The LORD said to Joshua, “Today I will begin to exalt you in the sight of all Israel, that they may know that, as I was with Moses, \n" +
			"so I will be with you. \n" +
			"8 And as for you, command the priests who bear the ark of the covenant, ‘When you come to the brink of the waters of the Jordan, \n" +
			"you shall stand still in the Jordan.’” \n" +
			"9 And Joshua said to the people of Israel, “Come here and listen to the words of the LORD your God.” \n" +
			"10 And Joshua said, “Here is how you shall know that the living God is among you and that he will without fail drive out from before you \n" +
			"the Canaanites, the Hittites, the Hivites, the Perizzites, the Girgashites, the Amorites, and the Jebusites. \n" +
			"11 Behold, the ark of the covenant of the Lord of all the earth is passing over before you into the Jordan. \n" +
			"12 Now therefore take twelve men from the tribes of Israel, from each tribe a man. \n" +
			"13 And when the soles of the feet of the priests bearing the ark of the LORD, the Lord of all the earth, \n" +
			"shall rest in the waters of the Jordan, the waters of the Jordan shall be cut off from flowing, and the waters coming down from above shall stand in one heap.”\n" +
			"14 So when the people set out from their tents to pass over the Jordan with the priests bearing the ark of the covenant before the people, \n" +
			"15 and as soon as those bearing the ark had come as far as the Jordan, and the feet of the priests bearing the ark were dipped in the brink of the water \n" +
			"(now the Jordan overflows all its banks throughout the time of harvest),\n" +
			"16 the waters coming down from above stood and rose up in a heap very far away, at Adam, the city that is beside Zarethan, \n" +
			"and those flowing down toward the Sea of the Arabah, the Salt Sea, were completely cut off. And the people passed over opposite Jericho. \n" +
			"17 Now the priests bearing the ark of the covenant of the LORD stood firmly on dry ground in the midst of the Jordan, \n" +
			"and all Israel was passing over on dry ground until all the nation finished passing over the Jordan. \n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
   
    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the first content
        table3.add(lblFirstTitle).pad(10,50,0,0).left();
        table3.row();

        //content of the first title
        table3.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table3);

    }

     public void chapterFourOFJoshua() {

    	table4 = new Table();
        table4.setWidth(tableBG.getWidth());
        table4.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table4.setFillParent(true);
        table4.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "Twelve Memorial Stones from the Jordan";

    	String firstContent = "1 When all the nation had finished passing over the Jordan, the LORD said to Joshua, \n" +
			"2 “Take twelve men from the people, from each tribe a man, \n" +
			"3 and command them, saying, ‘Take twelve stones from here out of the midst of the Jordan, from the very place where the priests' feet \n" +
			"stood firmly, and bring them over with you and lay them down in the place where you lodge tonight.’” \n" +
			"4 Then Joshua called the twelve men from the people of Israel, whom he had appointed, a man from each tribe. \n" +
			"5 And Joshua said to them, “Pass on before the ark of the LORD your God into the midst of the Jordan, \n" +
			"and take up each of you a stone upon his shoulder, according to the number of the tribes of the people of Israel, \n" +
			"6 that this may be a sign among you. When your children ask in time to come, ‘What do those stones mean to you?’ \n" +
			"7 then you shall tell them that the waters of the Jordan were cut off before the ark of the covenant of the LORD. \n" +
			"When it passed over the Jordan, the waters of the Jordan were cut off. So these stones shall be to the people of Israel a memorial forever.”\n" +
			"8 And the people of Israel did just as Joshua commanded and took up twelve stones out of the midst of the Jordan, \n" +
			"according to the number of the tribes of the people of Israel, just as the LORD told Joshua. And they carried them over with them to the place \n" +
			"where they lodged and laid them down[a] there. \n" +
			"9 And Joshua set up twelve stones in the midst of the Jordan, in the place where the feet of the priests bearing the ark of the covenant \n" +
			"had stood; and they are there to this day. \n" +
			"10 For the priests bearing the ark stood in the midst of the Jordan until everything was finished that the LORD commanded Joshua \n" +
			"to tell the people, according to all that Moses had commanded Joshua.";

    	String chapterSecondTitle = "The people passed over in haste.";

    	String secondContent = "11 And when all the people had finished passing over, the ark of the LORD and the priests passed over before the people. \n"+
			"12 The sons of Reuben and the sons of Gad and the half-tribe of Manasseh passed over armed before the people of Israel, as Moses had told them. \n"+
			"13 About 40,000 ready for war passed over before the LORD for battle, to the plains of Jericho. \n"+
			"14 On that day the LORD exalted Joshua in the sight of all Israel, and they stood in awe of him just as they had stood in awe of Moses, \n" +
			"all the days of his life.\n"+
			"15 And the LORD said to Joshua, \n"+
			"16 “Command the priests bearing the ark of the testimony to come up out of the Jordan.” \n"+
			"17 So Joshua commanded the priests, “Come up out of the Jordan.” \n"+
			"18 And when the priests bearing the ark of the covenant of the LORD came up from the midst of the Jordan, and the soles of the priests' feet \n" +
			"were lifted up on dry ground, the waters of the Jordan returned to their place and overflowed all its banks, as before.\n"+
			"19 The people came up out of the Jordan on the tenth day of the first month, and they encamped at Gilgal on the east border of Jericho.\n"+
			"20 And those twelve stones, which they took out of the Jordan, Joshua set up at Gilgal. \n"+
			"21 And he said to the people of Israel, “When your children ask their fathers in times to come, ‘What do these stones mean?’ \n"+
			"22 then you shall let your children know, ‘Israel passed over this Jordan on dry ground.’ \n"+
			"23 For the LORD your God dried up the waters of the Jordan for you until you passed over, as the LORD your God did to the Red Sea, \n" +
			"which he dried up for us until we passed over, \n"+
			"24 so that all the peoples of the earth may know that the hand of the LORD is mighty, that you may fear the LORD your God forever.”\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the first content
        table4.add(lblFirstTitle).pad(10,50,0,0).left();
        table4.row();

        //content of the first title
        table4.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table4.row();

        //title of the second content
        table4.add(lblSecondTitle).pad(10,50,0,0).left();
        table4.row();

        //content of the second title
        table4.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table4);

    }

    public void chapterFiveOFJoshua() {

    	table5 = new Table();
        table5.setWidth(tableBG.getWidth());
        table5.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table5.setFillParent(true);
        table5.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The New Generation Circumcised";

    	String firstContent = "1 As soon as all the kings of the Amorites who were beyond the Jordan to the west, and all the kings of the Canaanites \n" +
    		"who were by the sea, heard that the LORD had dried up the waters of the Jordan for the people of Israel until they had crossed over, \n" +
    		"their hearts melted and there was no longer any spirit in them because of the people of Israel.\n" +
			"2 At that time the LORD said to Joshua, “Make flint knives and circumcise the sons of Israel a second time.” \n" +
			"3 So Joshua made flint knives and circumcised the sons of Israel at Gibeath-haaraloth.\n" +
			"4 And this is the reason why Joshua circumcised them: all the males of the people who came out of Egypt, all the men of war,\n" +
			" had died in the wilderness on the way after they had come out of Egypt.\n" +
			"5 Though all the people who came out had been circumcised, yet all the people who were born on the way in the wilderness \n" +
			"after they had come out of Egypt had not been circumcised. \n" +
			"6 For the people of Israel walked forty years in the wilderness, until all the nation, the men of war who came out of Egypt, perished, \n" +
			"because they did not obey the voice of the LORD; the LORD swore to them that he would not let them see the land that the LORD had sworn to their fathers to give to us, a land flowing with milk and honey. \n" +
			"7 So it was their children, whom he raised up in their place, that Joshua circumcised. For they were uncircumcised, because they had not been\n" +
			" circumcised on the way.\n" +
			"8 When the circumcising of the whole nation was finished, they remained in their places in the camp until they were healed. \n" +
			"9 And the LORD said to Joshua, “Today I have rolled away the reproach of Egypt from you.” \n" +
			"And so the name of that place is called Gilgal to this day. ";

    	String chapterSecondTitle = "First Passover in Canaan";

    	String secondContent = "10 While the people of Israel were encamped at Gilgal, they kept the Passover on the fourteenth day of the month \n" +
    		"in the evening on the plains of Jericho. \n" +
			"11 And the day after the Passover, on that very day, they ate of the produce of the land, unleavened cakes and parched grain. \n" +
			"12 And the manna ceased the day after they ate of the produce of the land. And there was no longer manna for the people of Israel, \n" +
			"but they ate of the fruit of the land of Canaan that year. ";

    	String chapterThirdTitle = "The Commander of the LORD's Army";

    	String thirdContent = "13 When Joshua was by Jericho, he lifted up his eyes and looked, and behold, a man was standing before him with his drawn sword \n" +
    		"in his hand. And Joshua went to him and said to him, “Are you for us, or for our adversaries?” \n" +
			"14 And he said, “No; but I am the commander of the army of the LORD. Now I have come.” And Joshua fell on his face to the earth and worshiped \n" +
			"and said to him, “What does my lord say to his servant?” \n" +
			"15 And the commander of the LORD's army said to Joshua, “Take off your sandals from your feet, for the place where you are standing is holy.”\n" +
			" And Joshua did so.";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	lblThirdTitle = new Label(chapterThirdTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);

        //title of the first content
        table5.add(lblFirstTitle).pad(10,50,0,0).left();
        table5.row();

        //content of the first title
        table5.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table5.row();

        //title of the second content
        table5.add(lblSecondTitle).pad(10,50,0,0).left();
        table5.row();

        //content of the second title
        table5.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table5.row();

        
        table5.add(lblThirdTitle).pad(10,50,0,0).left();
        table5.row();
  
        table5.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table5);

    }


    public void chapterSixOFJoshua() {

    	table6 = new Table();
        table6.setWidth(tableBG.getWidth());
        table6.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table6.setFillParent(true);
        table6.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The Fall of Jericho";

    	String firstContent = "1 Now Jericho was shut up inside and outside because of the people of Israel. None went out, and none came in. \n" +
               "2 And the LORD said to Joshua, “See, I have given Jericho into your hand, with its king and mighty men of valor. \n" +
               "3 You shall march around the city, all the men of war going around the city once. Thus shall you do for six days. \n" +
               "4 Seven priests shall bear seven trumpets of rams' horns before the ark. On the seventh day you shall march around the city seven times, \n" +
                "and the priests shall blow the trumpets. \n" +
               "5 And when they make a long blast with the ram's horn, when you hear the sound of the trumpet, \n" +
                "then all the people shall shout with a great shout, and the wall of the city will fall down flat,[a] and the people shall go up, \n" +
                "everyone straight before him.” \n" +
               "6 So Joshua the son of Nun called the priests and said to them, “Take up the ark of the covenant and \n" +
                "let seven priests bear seven trumpets of rams' horns before the ark of the LORD.” \n" +
               "7 And he said to the people, “Go forward. March around the city and let the armed men pass on before the ark of the LORD.”\n" +
               "8 And just as Joshua had commanded the people, the seven priests bearing the seven trumpets of rams' horns before the LORD went forward, \n" +
                "blowing the trumpets, with the ark of the covenant of the LORD following them.\n" + 
               "9 The armed men were walking before the priests who were blowing the trumpets, and the rear guard was walking after the ark, \n" +
                "while the trumpets blew continually. \n" +
               "10 But Joshua commanded the people, “You shall not shout or make your voice heard, neither shall any word go out of your mouth, \n" +
                "until the day I tell you to shout. Then you shall shout.” \n" +
               "11 So he caused the ark of the LORD to circle the city, going about it once. And they came into the camp and spent the night in the camp.\n" +
               "12 Then Joshua rose early in the morning, and the priests took up the ark of the LORD. \n" +
               "13 And the seven priests bearing the seven trumpets of rams' horns before the ark of the LORD walked on, \n" +
                "and they blew the trumpets continually. And the armed men were walking before them, a\n" +
                "nd the rear guard was walking after the ark of the LORD, while the trumpets blew continually.\n" + 
               "14 And the second day they marched around the city once, and returned into the camp. So they did for six days.\n" +
               "15 On the seventh day they rose early, at the dawn of day, and marched around the city in the same manner seven times. \n" +
                "It was only on that day that they marched around the city seven times. \n" +
               "16 And at the seventh time, when the priests had blown the trumpets, Joshua said to the people,\n" +
                "“Shout, for the LORD has given you the city. \n" +
               "17 And the city and all that is within it shall be devoted to the LORD for destruction. \n" +
               "Only Rahab the prostitute and all who are with her in her house shall live, because she hid the messengers whom we sent. \n" +
               "18 But you, keep yourselves from the things devoted to destruction, lest when you have devoted them you take any of the devoted things a\n" +
               "nd make the camp of Israel a thing for destruction and bring trouble upon it.\n" + 
               "19 But all silver and gold, and every vessel of bronze and iron, are holy to the LORD; they shall go into the treasury of the LORD.”\n" + 
               "20 So the people shouted, and the trumpets were blown. As soon as the people heard the sound of the trumpet, the people shouted \n" +
                "a great shout, and the wall fell down flat, so that the people went up into the city, every man straight before him,\n" +
                " and they captured the city. \n" +
               "21 Then they devoted all in the city to destruction, both men and women, young and old, oxen, sheep, and donkeys, \n" +
                "with the edge of the sword.\n" +
               "22 But to the two men who had spied out the land, Joshua said, “Go into the prostitute's house and bring out from there the woman \n" +
                "and all who belong to her, as you swore to her.” \n" +
               "23 So the young men who had been spies went in and brought out Rahab and her father and mother and brothers and all who belonged to her.\n" + 
                "And they brought all her relatives and put them outside the camp of Israel. \n" +
               "24 And they burned the city with fire, and everything in it. Only the silver and gold, and the vessels of bronze and of iron, \n" +
                "they put into the treasury of the house of the LORD. \n" +
               "25 But Rahab the prostitute and her father's household and all who belonged to her, Joshua saved alive.\n" +
                " And she has lived in Israel to this day, because she hid the messengers whom Joshua sent to spy out Jericho.\n" +
               "26 Joshua laid an oath on them at that time, saying, “Cursed before the LORD be the man who rises up and rebuilds this city, Jericho.\n" +
               "“At the cost of his firstborn shall he\n" +
                   "lay its foundation,\n" +
               "and at the cost of his youngest son\n" +
                   "shall he set up its gates.”\n" +
               "27 So the LORD was with Joshua, and his fame was in all the land.\n";

    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
  
    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the first content
        table6.add(lblFirstTitle).pad(10,50,0,0).left();
        table6.row();

        //content of the first title
        table6.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table6);
      

    }

    public void chapterSevenOFJoshua() {

    	table7 = new Table();
        table7.setWidth(tableBG.getWidth());
        table7.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table7.setFillParent(true);
        table7.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "Israel Defeated at Ai";

    	String firstContent = "1 But the people of Israel broke faith in regard to the devoted things, for Achan the son of Carmi, son of Zabdi, \n" +
            "son of Zerah, of the tribe of Judah, took some of the devoted things. And the anger of the LORD burned against the people of Israel.\n" +
            "2 Joshua sent men from Jericho to Ai, which is near Beth-aven, east of Bethel, and said to them, “Go up and spy out the land.”\n" +
            " And the men went up and spied out Ai. \n" +
            "3 And they returned to Joshua and said to him, “Do not have all the people go up, but let about two or three thousand men go up and attack Ai. \n" +
            "Do not make the whole people toil up there, for they are few.” \n" +
            "4 So about three thousand men went up there from the people. And they fled before the men of Ai, \n" +
            "5 and the men of Ai killed about thirty-six of their men and chased them before the gate as far as Shebarim and struck them at the descent.\n" +
            "And the hearts of the people melted and became as water.\n" +
            "6 Then Joshua tore his clothes and fell to the earth on his face before the ark of the LORD until the evening, he and the elders of Israel. \n" +
            "And they put dust on their heads. \n" +
            "7 And Joshua said, “Alas, O Lord GOD, why have you brought this people over the Jordan at all, to give us into the hands of the Amorites, \n" +
            "to destroy us? Would that we had been content to dwell beyond the Jordan! \n" +
            "8 O Lord, what can I say, when Israel has turned their backs before their enemies! \n" +
            "9 For the Canaanites and all the inhabitants of the land will hear of it and will surround us and cut off our name from the earth. \n" +
            "And what will you do for your great name?” \n";

    	String chapterSecondTitle = "The Sin of Achan";

    	String secondContent = "10 The LORD said to Joshua, “Get up! Why have you fallen on your face?\n" +
            "11 Israel has sinned; they have transgressed my covenant that I commanded them; they have taken some of the devoted things; \n" +
            "they have stolen and lied and put them among their own belongings.\n" +
            "12 Therefore the people of Israel cannot stand before their enemies. They turn their backs before their enemies, \n" +
            "because they have become devoted for destruction. I will be with you no more, unless you destroy the devoted things from among you. \n" +
            "13 Get up! Consecrate the people and say, ‘Consecrate yourselves for tomorrow; for thus says the LORD, God of Israel, \n" +
            "“There are devoted things in your midst, O Israel. You cannot stand before your enemies until you take away the devoted things from among you.”\n" + 
            "14 In the morning therefore you shall be brought near by your tribes. And the tribe that the LORD takes by lot shall come near by clans. \n" +
            "And the clan that the LORD takes shall come near by households. And the household that the LORD takes shall come near man by man. \n" +
            "15 And he who is taken with the devoted things shall be burned with fire, he and all that he has, \n" +
            "because he has transgressed the covenant of the LORD, and because he has done an outrageous thing in Israel.’”\n" +
            "16 So Joshua rose early in the morning and brought Israel near tribe by tribe, and the tribe of Judah was taken. \n" +
            "17 And he brought near the clans of Judah, and the clan of the Zerahites was taken. And he brought near the clan of the Zerahites man by man, \n" +
            "and Zabdi was taken. \n" +
            "18 And he brought near his household man by man, and Achan the son of Carmi, son of Zabdi, son of Zerah, of the tribe of Judah, was taken. \n" +
            "19 Then Joshua said to Achan, “My son, give glory to the LORD God of Israel and give praise to him. And tell me now what you have done; \n" +
            "do not hide it from me.” \n" +
            "20 And Achan answered Joshua, “Truly I have sinned against the LORD God of Israel, and this is what I did: \n" +
            "21 when I saw among the spoil a beautiful cloak from Shinar, and 200 shekels of silver, and a bar of gold weighing 50 shekels,\n" +
            "then I coveted them and took them. And see, they are hidden in the earth inside my tent, with the silver underneath.”\n" +
            "22 So Joshua sent messengers, and they ran to the tent; and behold, it was hidden in his tent with the silver underneath. \n" +
            "23 And they took them out of the tent and brought them to Joshua and to all the people of Israel. And they laid them down before the LORD. \n" +
            "24 And Joshua and all Israel with him took Achan the son of Zerah, and the silver and the cloak and the bar of gold, and his sons and daughters \n" +
            "and his oxen and donkeys and sheep and his tent and all that he had. And they brought them up to the Valley of Achor. \n" +
            "25 And Joshua said, “Why did you bring trouble on us? The LORD brings trouble on you today.” And all Israel stoned him with stones. \n" +
            "They burned them with fire and stoned them with stones. \n" +
            "26 And they raised over him a great heap of stones that remains to this day. Then the LORD turned from his burning anger. \n" +
            "Therefore, to this day the name of that place is called the Valley of Achor.\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the first content
        table7.add(lblFirstTitle).pad(10,50,0,0).left();
        table7.row();

        //content of the first title
        table7.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table7.row();

        //title of the second content
        table7.add(lblSecondTitle).pad(10,50,0,0).left();
        table7.row();

        //content of the second title
        table7.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table7);

    }


    public void chapterEightOFJoshua() {

    	table8 = new Table();
        table8.setWidth(tableBG.getWidth());
        table8.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table8.setFillParent(true);
        table8.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The Fall of Ai";

    	String firstContent = "1 And the LORD said to Joshua, “Do not fear and do not be dismayed. Take all the fighting men with you, and arise, \n" +
            "go up to Ai. See, I have given into your hand the king of Ai, and his people, his city, and his land.\n" +
            "2 And you shall do to Ai and its king as you did to Jericho and its king. Only its spoil and its livestock you shall take as plunder \n" +
            "for yourselves. Lay an ambush against the city, behind it.”\n" +
            "3 So Joshua and all the fighting men arose to go up to Ai. And Joshua chose 30,000 mighty men of valor and sent them out by night. \n" +
            "4 And he commanded them, “Behold, you shall lie in ambush against the city, behind it. Do not go very far from the city,\n" +
            " but all of you remain ready.\n" +
            "5 And I and all the people who are with me will approach the city. And when they come out against us just as before, \n" +
            "we shall flee before them.\n" +
            "6 And they will come out after us, until we have drawn them away from the city. For they will say, ‘They are fleeing from us, \n" +
            "just as before.’ So we will flee before them. \n" +
            "7 Then you shall rise up from the ambush and seize the city, for the LORD your God will give it into your hand. \n" +
            "8 And as soon as you have taken the city, you shall set the city on fire. You shall do according to the word of the LORD. \n" +
            "See, I have commanded you.” \n" +
            "9 So Joshua sent them out. And they went to the place of ambush and lay between Bethel and Ai, to the west of Ai, \n" +
            "but Joshua spent that night among the people.\n" +
            "10 Joshua arose early in the morning and mustered the people and went up, he and the elders of Israel, before the people to Ai. \n" +
            "11 And all the fighting men who were with him went up and drew near before the city and encamped on the north side of Ai, \n" +
            "with a ravine between them and Ai. \n" +
            "12 He took about 5,000 men and set them in ambush between Bethel and Ai, to the west of the city. \n" +
            "13 So they stationed the forces, the main encampment that was north of the city and its rear guard west of the city. \n" +
            "But Joshua spent that night in the valley. \n" +
            "14 And as soon as the king of Ai saw this, he and all his people, the men of the city, hurried and went out early to the appointed place\n" +
            "toward the Arabah to meet Israel in battle. But he did not know that there was an ambush against him behind the city. \n" +
            "15 And Joshua and all Israel pretended to be beaten before them and fled in the direction of the wilderness. \n" +
            "16 So all the people who were in the city were called together to pursue them, and as they pursued Joshua they were drawn away from the city. \n" +
            "17 Not a man was left in Ai or Bethel who did not go out after Israel. They left the city open and pursued Israel.\n" +
            "18 Then the LORD said to Joshua, “Stretch out the javelin that is in your hand toward Ai, for I will give it into your hand.” \n" +
            "And Joshua stretched out the javelin that was in his hand toward the city.\n" + 
            "19 And the men in the ambush rose quickly out of their place, and as soon as he had stretched out his hand, \n" +
            "they ran and entered the city and captured it. And they hurried to set the city on fire. \n" +
            "20 So when the men of Ai looked back, behold, the smoke of the city went up to heaven, and they had no power to flee this way or that, \n" +
            "for the people who fled to the wilderness turned back against the pursuers.\n" + 
            "21 And when Joshua and all Israel saw that the ambush had captured the city, and that the smoke of the city went up, \n" +
            "then they turned back and struck down the men of Ai. \n" +
            "22 And the others came out from the city against them, so they were in the midst of Israel, some on this side, and some on that side.\n" +
            "And Israel struck them down, until there was left none that survived or escaped.\n" +
            "23 But the king of Ai they took alive, and brought him near to Joshua.\n" +
            "24 When Israel had finished killing all the inhabitants of Ai in the open wilderness where they pursued them, \n" +
            "and all of them to the very last had fallen by the edge of the sword, all Israel returned to Ai and struck it down with the edge of the sword.\n" + 
            "25 And all who fell that day, both men and women, were 12,000, all the people of Ai. \n" +
            "26 But Joshua did not draw back his hand with which he stretched out the javelin until he had devoted all the inhabitants of Ai to destruction. \n" +
            "27 Only the livestock and the spoil of that city Israel took as their plunder, according to the word of the LORD that he commanded Joshua.\n" + 
            "28 So Joshua burned Ai and made it forever a heap of ruins, as it is to this day. \n" +
            "29 And he hanged the king of Ai on a tree until evening. And at sunset Joshua commanded, and they took his body down from the tree \n" +
            "and threw it at the entrance of the gate of the city and raised over it a great heap of stones, which stands there to this day. \n";

    	String chapterSecondTitle = "Joshua Renews the Covenant";

    	String secondContent = "30 At that time Joshua built an altar to the LORD, the God of Israel, on Mount Ebal, \n" +
            "31 just as Moses the servant of the LORD had commanded the people of Israel, as it is written in the Book of the Law of Moses,\n" +
            "“an altar of uncut stones, upon which no man has wielded an iron tool.” And they offered on it burnt offerings to the LORD and sacrificed peace offerings. \n" +
            "32 And there, in the presence of the people of Israel, he wrote on the stones a copy of the law of Moses, which he had written. \n" +
            "33 And all Israel, sojourner as well as native born, with their elders and officers and their judges, \n" +
            "stood on opposite sides of the ark before the Levitical priests who carried the ark of the covenant of the LORD, \n" +
            "half of them in front of Mount Gerizim and half of them in front of Mount Ebal, just as Moses the servant of the LORD had commanded at the first, to bless the people of Israel.\n" + 
            "34 And afterward he read all the words of the law, the blessing and the curse, according to all that is written in the Book of the Law. \n" +
            "35 There was not a word of all that Moses commanded that Joshua did not read before all the assembly of Israel,\n" +
            "and the women, and the little ones, and the sojourners who lived among them.";

    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the first content
        table8.add(lblFirstTitle).pad(10,50,0,0).left();
        table8.row();

        //content of the first title
        table8.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table8.row();

        //title of the second content
        table8.add(lblSecondTitle).pad(10,50,0,0).left();
        table8.row();

        //content of the second title
        table8.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table8);

    }

    public void chapterNineOFJoshua() {

    	table9 = new Table();
        table9.setWidth(tableBG.getWidth());
        table9.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table9.setFillParent(true);
        table9.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The Gibeonite Deception";

    	String firstContent = "1 As soon as all the kings who were beyond the Jordan in the hill country and in the lowland all along the coast of the Great Sea \n" +
            "toward Lebanon, the Hittites, the Amorites, the Canaanites, the Perizzites, the Hivites, and the Jebusites, heard of this, \n" +
            "2 they gathered together as one to fight against Joshua and Israel.\n" +
            "3 But when the inhabitants of Gibeon heard what Joshua had done to Jericho and to Ai, \n" +
            "4 they on their part acted with cunning and went and made ready provisions and took worn-out sacks for their donkeys, and wineskins, \n" +
            "worn-out and torn and mended, \n" +
            "5 with worn-out, patched sandals on their feet, and worn-out clothes. And all their provisions were dry and crumbly. \n" +
            "6 And they went to Joshua in the camp at Gilgal and said to him and to the men of Israel, “We have come from a distant country, \n" +
            "so now make a covenant with us.” \n" +
            "7 But the men of Israel said to the Hivites, “Perhaps you live among us; then how can we make a covenant with you?” \n" +
            "8 They said to Joshua, “We are your servants.” And Joshua said to them, “Who are you? And where do you come from?”\n" +
            "9 They said to him, “From a very distant country your servants have come, because of the name of the LORD your God.\n" +
            "For we have heard a report of him, and all that he did in Egypt, \n" +
            "10 and all that he did to the two kings of the Amorites who were beyond the Jordan, to Sihon the king of Heshbon, and to Og king of Bashan, \n" +
            "who lived in Ashtaroth. \n" +
            "11 So our elders and all the inhabitants of our country said to us, ‘Take provisions in your hand for the journey and go to meet them \n" +
            "and say to them, “We are your servants. Come now, make a covenant with us.”’\n" +
            "12 Here is our bread. It was still warm when we took it from our houses as our food for the journey on the day we set out to come to you, \n" +
            "but now, behold, it is dry and crumbly. \n" +
            "13 These wineskins were new when we filled them, and behold, they have burst. And these garments and sandals of ours are worn out from the very long journey.” \n" +
            "14 So the men took some of their provisions, but did not ask counsel from the LORD.\n" +
            "15 And Joshua made peace with them and made a covenant with them, to let them live, and the leaders of the congregation swore to them.\n" +
            "16 At the end of three days after they had made a covenant with them, they heard that they were their neighbors and that they lived among them. \n" +
            "17 And the people of Israel set out and reached their cities on the third day. Now their cities were Gibeon, Chephirah, Beeroth, \n" +
            "and Kiriath-jearim. \n" +
            "18 But the people of Israel did not attack them, because the leaders of the congregation had sworn to them by the LORD, the God of Israel. \n" +
            "Then all the congregation murmured against the leaders. \n" +
            "19 But all the leaders said to all the congregation, “We have sworn to them by the LORD, the God of Israel, and now we may not touch them.\n" +
            "20 This we will do to them: let them live, lest wrath be upon us, because of the oath that we swore to them.” \n" +
            "21 And the leaders said to them, “Let them live.” So they became cutters of wood and drawers of water for all the congregation, \n" +
            "just as the leaders had said of them.\n" +
            "22 Joshua summoned them, and he said to them, “Why did you deceive us, saying, ‘We are very far from you,’ when you dwell among us? \n" +
            "23 Now therefore you are cursed, and some of you shall never be anything but servants, cutters of wood and drawers of water for the house of my God.” \n" +
            "24 They answered Joshua, “Because it was told to your servants for a certainty that the LORD your God had commanded his servant Moses \n" +
            "to give you all the land and to destroy all the inhabitants of the land from before you—so we feared greatly for our lives because of you and did this thing. \n" +
            "25 And now, behold, we are in your hand. Whatever seems good and right in your sight to do to us, do it.” \n" +
            "26 So he did this to them and delivered them out of the hand of the people of Israel, and they did not kill them. \n" +
            "27 But Joshua made them that day cutters of wood and drawers of water for the congregation and for the altar of the LORD, to this day, \n" +
            "in the place that he should choose.";

    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
 
    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the first content
        table9.add(lblFirstTitle).pad(10,50,0,0).left();
        table9.row();

        //content of the first title
        table9.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table9);

    }

    public void chapterTenOFJoshua() {

    	table10 = new Table();
        table10.setWidth(tableBG.getWidth());
        table10.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table10.setFillParent(true);
        table10.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The Sun Stands Still";

    	String firstContent = "1 As soon as Adoni-zedek, king of Jerusalem, heard how Joshua had captured Ai and had devoted it to destruction, \n" +
            "doing to Ai and its king as he had done to Jericho and its king, and how the inhabitants of Gibeon had made peace with Israel and were among them, \n" +
            "2 he feared greatly, because Gibeon was a great city, like one of the royal cities, and because it was greater than Ai, \n" +
            "and all its men were warriors. \n" +
            "3 So Adoni-zedek king of Jerusalem sent to Hoham king of Hebron, to Piram king of Jarmuth, to Japhia king of Lachish, \n" +
            "and to Debir king of Eglon, saying, \n" +
            "4 “Come up to me and help me, and let us strike Gibeon. For it has made peace with Joshua and with the people of Israel.” \n" +
            "5 Then the five kings of the Amorites, the king of Jerusalem, the king of Hebron, the king of Jarmuth, the king of Lachish, \n" +
            "and the king of Eglon, gathered their forces and went up with all their armies and encamped against Gibeon and made war against it.\n" +
            "6 And the men of Gibeon sent to Joshua at the camp in Gilgal, saying, “Do not relax your hand from your servants. \n" +
            "Come up to us quickly and save us and help us, for all the kings of the Amorites who dwell in the hill country are gathered against us.” \n" +
            "7 So Joshua went up from Gilgal, he and all the people of war with him, and all the mighty men of valor.\n" +
            "8 And the LORD said to Joshua, “Do not fear them, for I have given them into your hands. Not a man of them shall stand before you.” \n" +
            "9 So Joshua came upon them suddenly, having marched up all night from Gilgal.\n" +
            "10 And the LORD threw them into a panic before Israel, who struck them with a great blow at Gibeon \n" +
            "and chased them by the way of the ascent of Beth-horon and struck them as far as Azekah and Makkedah.\n" +
            "11 And as they fled before Israel, while they were going down the ascent of Beth-horon, the LORD threw down large stones from heaven \n" +
            "on them as far as Azekah, and they died. There were more who died because of the hailstones than the sons of Israel killed with the sword.\n" +
            "12 At that time Joshua spoke to the LORD in the day when the LORD gave the Amorites over to the sons of Israel, \n" +
            "and he said in the sight of Israel,\n" +
            "“Sun, stand still at Gibeon,\n" +
                "and moon, in the Valley of Aijalon.”\n" +
            "13 And the sun stood still, and the moon stopped,\n" +
                "until the nation took vengeance on their enemies.\n" +
            "Is this not written in the Book of Jashar? The sun stopped in the midst of heaven and did not hurry to set for about a whole day. \n" +
            "14 There has been no day like it before or since, when the LORD heeded the voice of a man, for the LORD fought for Israel.\n" +
            "15 So Joshua returned, and all Israel with him, to the camp at Gilgal.\n";

    	String chapterSecondTitle = "Five Amorite Kings Executed";

    	String secondContent = "16 These five kings fled and hid themselves in the cave at Makkedah.\n" +
            "17 And it was told to Joshua, “The five kings have been found, hidden in the cave at Makkedah.” \n" +
            "18 And Joshua said, “Roll large stones against the mouth of the cave and set men by it to guard them, \n" +
            "19 but do not stay there yourselves. Pursue your enemies; attack their rear guard. Do not let them enter their cities, \n" +
            "for the LORD your God has given them into your hand.” \n" +
            "20 When Joshua and the sons of Israel had finished striking them with a great blow until they were wiped out, \n" +
            "and when the remnant that remained of them had entered into the fortified cities,\n" +
            "21 then all the people returned safe to Joshua in the camp at Makkedah. Not a man moved his tongue against any of the people of Israel.\n" +
            "22 Then Joshua said, “Open the mouth of the cave and bring those five kings out to me from the cave.”\n" +
            "23 And they did so, and brought those five kings out to him from the cave, the king of Jerusalem, the king of Hebron, the king of Jarmuth, \n" +
            "the king of Lachish, and the king of Eglon.\n" +
            "24 And when they brought those kings out to Joshua, Joshua summoned all the men of Israel and said to the chiefs of the men of war \n" +
            "who had gone with him, “Come near; put your feet on the necks of these kings.” Then they came near and put their feet on their necks. \n" +
            "25 And Joshua said to them, “Do not be afraid or dismayed; be strong and courageous. \n" +
            "For thus the LORD will do to all your enemies against whom you fight.”\n" +
            "26 And afterward Joshua struck them and put them to death, and he hanged them on five trees. And they hung on the trees until evening.\n" +
            "27 But at the time of the going down of the sun, Joshua commanded, and they took them down from the trees and threw them into the cave \n" +
            "where they had hidden themselves, and they set large stones against the mouth of the cave, which remain to this very day.\n" +
            "28 As for Makkedah, Joshua captured it on that day and struck it, and its king, with the edge of the sword. \n" +
            "He devoted to destruction every person in it; he left none remaining. And he did to the king of Makkedah just as he had done to the king of Jericho.\n ";

    	String chapterThirdTitle = "Conquest of Southern Canaan";

    	String thirdContent = "29 Then Joshua and all Israel with him passed on from Makkedah to Libnah and fought against Libnah. \n" +
            "30 And the LORD gave it also and its king into the hand of Israel. And he struck it with the edge of the sword, and every person in it; \n" +
            "he left none remaining in it. And he did to its king as he had done to the king of Jericho.\n" +
            "31 Then Joshua and all Israel with him passed on from Libnah to Lachish and laid siege to it and fought against it. \n" +
            "32 And the LORD gave Lachish into the hand of Israel, and he captured it on the second day and struck it with the edge of the sword, \n" +
            "and every person in it, as he had done to Libnah.\n" +
            "33 Then Horam king of Gezer came up to help Lachish. And Joshua struck him and his people, until he left none remaining.\n" +
            "34 Then Joshua and all Israel with him passed on from Lachish to Eglon. And they laid siege to it and fought against it. \n" +
            "35 And they captured it on that day, and struck it with the edge of the sword. And he devoted every person in it to destruction that day, \n" +
            "as he had done to Lachish.\n" +
            "36 Then Joshua and all Israel with him went up from Eglon to Hebron. And they fought against it \n" +
            "37 and captured it and struck it with the edge of the sword, and its king and its towns, and every person in it. \n" +
            "He left none remaining, as he had done to Eglon, and devoted it to destruction and every person in it.\n" +
            "38 Then Joshua and all Israel with him turned back to Debir and fought against it \n" +
            "39 and he captured it with its king and all its towns. And they struck them with the edge of the sword and devoted to destruction \n" +
            "every person in it; he left none remaining. Just as he had done to Hebron and to Libnah and its king, so he did to Debir and to its king.\n" +
            "40 So Joshua struck the whole land, the hill country and the Negeb and the lowland and the slopes, and all their kings. \n" +
            "He left none remaining, but devoted to destruction all that breathed, just as the LORD God of Israel commanded. \n" +
            "41 And Joshua struck them from Kadesh-barnea as far as Gaza, and all the country of Goshen, as far as Gibeon. \n" +
            "42 And Joshua captured all these kings and their land at one time, because the LORD God of Israel fought for Israel. \n" +
            "43 Then Joshua returned, and all Israel with him, to the camp at Gilgal. ";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	lblThirdTitle = new Label(chapterThirdTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);

        //title of the first content
        table10.add(lblFirstTitle).pad(10,50,0,0).left();
        table10.row();

        //content of the first title
        table10.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table10.row();

        //title of the second content
        table10.add(lblSecondTitle).pad(10,50,0,0).left();
        table10.row();

        //content of the second title
        table10.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table10.row();

         //title of the third content
        table10.add(lblThirdTitle).pad(10,50,0,0).left();
        table10.row();

        //content of the third title
        table10.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table10);

    }

    public void chapterElevenOFJoshua() {

    	table11 = new Table();
        table11.setWidth(tableBG.getWidth());
        table11.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table11.setFillParent(true);
        table11.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "Conquests in Northern Canaan";

    	String firstContent = "1 When Jabin, king of Hazor, heard of this, he sent to Jobab king of Madon, and to the king of Shimron, \n" +
            "and to the king of Achshaph, \n" +
            "2 and to the kings who were in the northern hill country, and in the Arabah south of Chinneroth, and in the lowland, \n" +
            " and in Naphoth-dor on the west, \n" +
            "3 to the Canaanites in the east and the west, the Amorites, the Hittites, the Perizzites, and the Jebusites in the hill country, \n" +
            " and the Hivites under Hermon in the land of Mizpah. \n" +
            "4 And they came out with all their troops, a great horde, in number like the sand that is on the seashore, with very many horses and chariots. \n" +
            "5 And all these kings joined their forces and came and encamped together at the waters of Merom to fight against Israel.\n" +
            "6 And the LORD said to Joshua, “Do not be afraid of them, for tomorrow at this time I will give over all of them, slain, to Israel. \n" +
            " You shall hamstring their horses and burn their chariots with fire.” \n" +
            "7 So Joshua and all his warriors came suddenly against them by the waters of Merom and fell upon them. \n" +
            "8 And the LORD gave them into the hand of Israel, who struck them and chased them as far as Great Sidon and Misrephoth-maim, \n" +
            " and eastward as far as the Valley of Mizpeh. And they struck them until he left none remaining. \n" +
            "9 And Joshua did to them just as the LORD said to him: he hamstrung their horses and burned their chariots with fire.\n" +
            "10 And Joshua turned back at that time and captured Hazor and struck its king with the sword, \n" +
            " for Hazor formerly was the head of all those kingdoms. \n" +
            "11 And they struck with the sword all who were in it, devoting them to destruction; there was none left that breathed. \n" +
            " And he burned Hazor with fire. \n" +
            "12 And all the cities of those kings, and all their kings, Joshua captured, and struck them with the edge of the sword, \n" +
            " devoting them to destruction, just as Moses the servant of the LORD had commanded. \n" +
            "13 But none of the cities that stood on mounds did Israel burn, except Hazor alone; that Joshua burned. \n" +
            "14 And all the spoil of these cities and the livestock, the people of Israel took for their plunder.\n" +
            "  But every person they struck with the edge of the sword until they had destroyed them, and they did not leave any who breathed. \n" +
            "15 Just as the LORD had commanded Moses his servant, so Moses commanded Joshua, and so Joshua did.\n" +
            "  He left nothing undone of all that the LORD had commanded Moses.\n" +
            "16 So Joshua took all that land, the hill country and all the Negeb and all the land of Goshen and the lowland and the Arabah \n" +
            " and the hill country of Israel and its lowland \n" +
            "17 from Mount Halak, which rises toward Seir, as far as Baal-gad in the Valley of Lebanon below Mount Hermon. \n" +
            " And he captured all their kings and struck them and put them to death.\n" +
            "18 Joshua made war a long time with all those kings. \n" +
            "19 There was not a city that made peace with the people of Israel except the Hivites, the inhabitants of Gibeon. They took them all in battle.\n" + 
            "20 For it was the LORD's doing to harden their hearts that they should come against Israel in battle, \n" +
            " in order that they should be devoted to destruction and should receive no mercy but be destroyed, just as the LORD commanded Moses.\n" +
            "21 And Joshua came at that time and cut off the Anakim from the hill country, from Hebron, from Debir, from Anab, a\n" +
            " nd from all the hill country of Judah, and from all the hill country of Israel. Joshua devoted them to destruction with their cities.\n" + 
            "22 There was none of the Anakim left in the land of the people of Israel. Only in Gaza, in Gath, and in Ashdod did some remain. \n" +
            "23 So Joshua took the whole land, according to all that the LORD had spoken to Moses. And Joshua gave it for an inheritance to Israel \n" +
            " according to their tribal allotments. And the land had rest from war.\n";

    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
   	
    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);
 
        //title of the first content
        table11.add(lblFirstTitle).pad(10,50,0,0).left();
        table11.row();

        //content of the first title
        table11.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table11);
  

    }


    public void chapterTwelveOFJoshua() {

    	table12 = new Table();
        table12.setWidth(tableBG.getWidth());
        table12.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table12.setFillParent(true);
        table12.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "Kings Defeated by Moses";

    	String firstContent = "1 Now these are the kings of the land whom the people of Israel defeated and took possession of their land beyond the Jordan \n" +
            "toward the sunrise, from the Valley of the Arnon to Mount Hermon, with all the Arabah eastward: \n" +
            "2 Sihon king of the Amorites who lived at Heshbon and ruled from Aroer, which is on the edge of the Valley of the Arnon, \n" +
            "and from the middle of the valley as far as the river Jabbok, the boundary of the Ammonites, that is, half of Gilead, \n" +
            "3 and the Arabah to the Sea of Chinneroth eastward, and in the direction of Beth-jeshimoth, to the Sea of the Arabah, the Salt Sea, \n" +
            "southward to the foot of the slopes of Pisgah; \n" +
            "4 and Og king of Bashan, one of the remnant of the Rephaim, who lived at Ashtaroth and at Edrei \n" +
            "5 and ruled over Mount Hermon and Salecah and all Bashan to the boundary of the Geshurites and the Maacathites, \n" +
            "and over half of Gilead to the boundary of Sihon king of Heshbon. \n" +
            "6 Moses, the servant of the LORD, and the people of Israel defeated them. And Moses the servant of the LORD gave their land \n" +
            "for a possession to the Reubenites and the Gadites and the half-tribe of Manasseh.\n";

    	String chapterSecondTitle = "Kings Defeated by Joshua";

    	String secondContent = "7 And these are the kings of the land whom Joshua and the people of Israel defeated on the west side of the Jordan, \n" +
            "from Baal-gad in the Valley of Lebanon to Mount Halak, that rises toward Seir \n" +
            "(and Joshua gave their land to the tribes of Israel as a possession according to their allotments, \n" +
            "8 in the hill country, in the lowland, in the Arabah, in the slopes, in the wilderness, and in the Negeb, the land of the Hittites, \n" +
            "the Amorites, the Canaanites, the Perizzites, the Hivites, and the Jebusites):\n" +
            "9 the king of Jericho, one; the king of Ai, which is beside Bethel, one;\n" +
            "10 the king of Jerusalem, one; the king of Hebron, one; \n" +
            "11 the king of Jarmuth, one; the king of Lachish, one; \n" +
            "12 the king of Eglon, one; the king of Gezer, one; \n" +
            "13 the king of Debir, one; the king of Geder, one;\n" +
            "14 the king of Hormah, one; the king of Arad, one; \n" +
            "15 the king of Libnah, one; the king of Adullam, one; \n" +
            "16 the king of Makkedah, one; the king of Bethel, one; \n" +
            "17 the king of Tappuah, one; the king of Hepher, one; \n" +
            "18 the king of Aphek, one; the king of Lasharon, one; \n" +
            "19 the king of Madon, one; the king of Hazor, one;\n" + 
            "20 the king of Shimron-meron, one; the king of Achshaph, one; \n" +
            "21 the king of Taanach, one; the king of Megiddo, one;\n" +
            "22 the king of Kedesh, one; the king of Jokneam in Carmel, one; \n" +
            "23 the king of Dor in Naphath-dor, one; the king of Goiim in Galilee,one;\n" +
            "24 the king of Tirzah, one: in all, thirty-one kings.\n";

    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the first content
        table12.add(lblFirstTitle).pad(10,50,0,0).left();
        table12.row();

        //content of the first title
        table12.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table12.row();

        //title of the second content
        table12.add(lblSecondTitle).pad(10,50,0,0).left();
        table12.row();

        //content of the second title
        table12.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table12);

    }

    public void chapterThirteenOFJoshua() {

    	table13 = new Table();
        table13.setWidth(tableBG.getWidth());
        table13.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table13.setFillParent(true);
        table13.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "Land Still to Be Conquered";

    	String firstContent = "1 Now Joshua was old and advanced in years, and the LORD said to him, “You are old and advanced in years, \n" +
            "and there remains yet very much land to possess. \n" +
            "2 This is the land that yet remains: all the regions of the Philistines, and all those of the Geshurites \n" +
            "3 (from the Shihor, which is east of Egypt, northward to the boundary of Ekron, it is counted as Canaanite; \n" +
            "there are five rulers of the Philistines, those of Gaza, Ashdod, Ashkelon, Gath, and Ekron), and those of the Avvim, \n" +
            "4 in the south, all the land of the Canaanites, and Mearah that belongs to the Sidonians, to Aphek, to the boundary of the Amorites, \n" +
            "5 and the land of the Gebalites, and all Lebanon, toward the sunrise, from Baal-gad below Mount Hermon to Lebo-hamath, \n" +
            "6 all the inhabitants of the hill country from Lebanon to Misrephoth-maim, even all the Sidonians. \n" +
            " myself will drive them out from before the people of Israel. Only allot the land to Israel for an inheritance, as I have commanded you. \n" +
            "7 Now therefore divide this land for an inheritance to the nine tribes and half the tribe of Manasseh.\n";

    	String chapterSecondTitle = "The Inheritance East of the Jordan";

    	String secondContent = "8 With the other half of the tribe of Manasseh the Reubenites and the Gadites received their inheritance, \n" +
            "which Moses gave them, beyond the Jordan eastward, as Moses the servant of the LORD gave them: \n" +
            "9 from Aroer, which is on the edge of the Valley of the Arnon, and the city that is in the middle of the valley, \n" +
            "and all the tableland of Medeba as far as Dibon; \n" +
            "10 and all the cities of Sihon king of the Amorites, who reigned in Heshbon, as far as the boundary of the Ammonites; \n" +
            "11 and Gilead, and the region of the Geshurites and Maacathites, and all Mount Hermon, and all Bashan to Salecah; \n" +
            "12 all the kingdom of Og in Bashan, who reigned in Ashtaroth and in Edrei (he alone was left of the remnant of the Rephaim); \n" +
            "these Moses had struck and driven out. \n" +
            "13 Yet the people of Israel did not drive out the Geshurites or the Maacathites, but Geshur and Maacath dwell in the midst of Israel to this day.\n" +
            "14 To the tribe of Levi alone Moses gave no inheritance. The offerings by fire to the LORD God of Israel are their inheritance, as he said to him. \n" +
            "15 And Moses gave an inheritance to the tribe of the people of Reuben according to their clans. \n" +
            "16 So their territory was from Aroer, which is on the edge of the Valley of the Arnon, and the city that is in the middle of the valley,\n" +
            " and all the tableland by Medeba; \n" +
            "17 with Heshbon, and all its cities that are in the tableland; Dibon, and Bamoth-baal, and Beth-baal-meon, \n" +
            "18 and Jahaz, and Kedemoth, and Mephaath, \n" +
            "19 and Kiriathaim, and Sibmah, and Zereth-shahar on the hill of the valley, \n" +
            "20 and Beth-peor, and the slopes of Pisgah, and Beth-jeshimoth, \n" +
            "21 that is, all the cities of the tableland, and all the kingdom of Sihon king of the Amorites, who reigned in Heshbon, \n" +
            "whom Moses defeated with the leaders of Midian, Evi and Rekem and Zur and Hur and Reba, the princes of Sihon, who lived in the land. \n" +
            "22 Balaam also, the son of Beor, the one who practiced divination, was killed with the sword by the people of Israel among the rest of their \n" +
            "slain. \n" +
            "23 And the border of the people of Reuben was the Jordan as a boundary. This was the inheritance of the people of Reuben, \n" +
            "according to their clans with their cities and villages.\n" +
            "24 Moses gave an inheritance also to the tribe of Gad, to the people of Gad, according to their clans.\n" + 
            "25 Their territory was Jazer, and all the cities of Gilead, and half the land of the Ammonites, to Aroer, which is east of Rabbah, \n" +
            "26 and from Heshbon to Ramath-mizpeh and Betonim, and from Mahanaim to the territory of Debir, \n" +
            "27 and in the valley Beth-haram, Beth-nimrah, Succoth, and Zaphon, the rest of the kingdom of Sihon king of Heshbon,\n" +
            " having the Jordan as a boundary, to the lower end of the Sea of Chinnereth, eastward beyond the Jordan. \n" +
            "28 This is the inheritance of the people of Gad according to their clans, with their cities and villages.\n" +
            "29 And Moses gave an inheritance to the half-tribe of Manasseh. It was allotted to the half-tribe of the people of Manasseh \n" +
            "according to their clans. \n" +
            "30 Their region extended from Mahanaim, through all Bashan, the whole kingdom of Og king of Bashan, and all the towns of Jair, \n" +
            "which are in Bashan, sixty cities, \n" +
            "31 and half Gilead, and Ashtaroth, and Edrei, the cities of the kingdom of Og in Bashan. \n" +
            "These were allotted to the people of Machir the son of Manasseh for the half of the people of Machir according to their clans.\n" +
            "32 These are the inheritances that Moses distributed in the plains of Moab, beyond the Jordan east of Jericho. \n" +
            "33 But to the tribe of Levi Moses gave no inheritance; the LORD God of Israel is their inheritance, just as he said to them.\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the first content
        table13.add(lblFirstTitle).pad(10,50,0,0).left();
        table13.row();

        //content of the first title
        table13.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table13.row();

        //title of the second content
        table13.add(lblSecondTitle).pad(10,50,0,0).left();
        table13.row();

        //content of the second title
        table13.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table13);

    }

    public void chapterFourteenOFJoshua() {

    	table14 = new Table();
        table14.setWidth(tableBG.getWidth());
        table14.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table14.setFillParent(true);
        table14.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The Inheritance West of the Jordan";

    	String firstContent = "1 These are the inheritances that the people of Israel received in the land of Canaan, which Eleazar the priest \n" +
            "and Joshua the son of Nun and the heads of the fathers' houses of the tribes of the people of Israel gave them to inherit. \n" +
            "2 Their inheritance was by lot, just as the LORD had commanded by the hand of Moses for the nine and one-half tribes. \n" +
            "3 For Moses had given an inheritance to the two and one-half tribes beyond the Jordan, but to the Levites he gave no inheritance among them. \n" +
            "4 For the people of Joseph were two tribes, Manasseh and Ephraim. And no portion was given to the Levites in the land, \n" +
            "but only cities to dwell in, with their pasturelands for their livestock and their substance.\n" +
            "5 The people of Israel did as the LORD commanded Moses; they allotted the land.\n";

    	String chapterSecondTitle = "Caleb's Request and Inheritance";

    	String secondContent = "6 Then the people of Judah came to Joshua at Gilgal. And Caleb the son of Jephunneh the Kenizzite said to him, \n" +
            "“You know what the LORD said to Moses the man of God in Kadesh-barnea concerning you and me. \n" +
            "7 I was forty years old when Moses the servant of the LORD sent me from Kadesh-barnea to spy out the land,\n" +
            " and I brought him word again as it was in my heart. \n" +
            "8 But my brothers who went up with me made the heart of the people melt; yet I wholly followed the LORD my God. \n" +
            "9 And Moses swore on that day, saying, ‘Surely the land on which your foot has trodden shall be an inheritance for you and your children \n" +
            "forever, because you have wholly followed the LORD my God.’ \n" +
            "10 And now, behold, the LORD has kept me alive, just as he said, these forty-five years since the time that the LORD spoke this word to Moses,\n" +
            " while Israel walked in the wilderness. And now, behold, I am this day eighty-five years old. \n" +
            "11 I am still as strong today as I was in the day that Moses sent me; my strength now is as my strength was then, \n" +
            "for war and for going and coming. \n" +
            "12 So now give me this hill country of which the LORD spoke on that day, for you heard on that day how the Anakim were there, \n" +
            "with great fortified cities. It may be that the LORD will be with me, and I shall drive them out just as the LORD said.”\n" +
            "13 Then Joshua blessed him, and he gave Hebron to Caleb the son of Jephunneh for an inheritance. \n" +
            "14 Therefore Hebron became the inheritance of Caleb the son of Jephunneh the Kenizzite to this day, because he wholly followed the LORD,\n" +
            " the God of Israel. \n" +
            "15 Now the name of Hebron formerly was Kiriath-arba.(Arba was the greatest man among the Anakim.) And the land had rest from war.\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the first content
        table14.add(lblFirstTitle).pad(10,50,0,0).left();
        table14.row();

        //content of the first title
        table14.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table14.row();

        //title of the second content
        table14.add(lblSecondTitle).pad(10,50,0,0).left();
        table14.row();

        //content of the second title
        table14.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table14);

    }

    public void chapterFifteenOFJoshua() {

    	table15 = new Table();
        table15.setWidth(tableBG.getWidth());
        table15.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table15.setFillParent(true);
        table15.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The Allotment for Judah";

    	String firstContent = "1 The allotment for the tribe of the people of Judah according to their clans reached southward to the boundary of Edom, \n" +
            "to the wilderness of Zin at the farthest south. \n" +
            "2 And their south boundary ran from the end of the Salt Sea, from the bay that faces southward. \n" +
            "3 It goes out southward of the ascent of Akrabbim, passes along to Zin, and goes up south of Kadesh-barnea, along by Hezron, up to Addar, \n" +
            "turns about to Karka,\n" +
            "4 passes along to Azmon, goes out by the Brook of Egypt, and comes to its end at the sea. This shall be your south boundary. \n" +
            "5 And the east boundary is the Salt Sea, to the mouth of the Jordan. And the boundary on the north side runs from the bay of the sea \n" +
            "at the mouth of the Jordan. \n" +
            "6 And the boundary goes up to Beth-hoglah and passes along north of Beth-arabah. And the boundary goes up to the stone of Bohan \n" +
            "the son of Reuben. \n" +
            "7 And the boundary goes up to Debir from the Valley of Achor, and so northward, turning toward Gilgal, \n" +
            "which is opposite the ascent of Adummim, which is on the south side of the valley. And the boundary passes along to the waters of En-shemesh and ends at En-rogel. \n" +
            "8 Then the boundary goes up by the Valley of the Son of Hinnom at the southern shoulder of the Jebusite (that is, Jerusalem).\n" +
            " And the boundary goes up to the top of the mountain that lies over against the Valley of Hinnom, on the west, at the northern end of the Valley of Rephaim. \n" +
            "9 Then the boundary extends from the top of the mountain to the spring of the waters of Nephtoah, and from there to the cities of Mount Ephron. \n" +
            "Then the boundary bends around to Baalah (that is, Kiriath-jearim). \n" +
            "10 And the boundary circles west of Baalah to Mount Seir, passes along to the northern shoulder of Mount Jearim (that is, Chesalon),\n" +
            " and goes down to Beth-shemesh and passes along by Timnah. \n" +
            "11 The boundary goes out to the shoulder of the hill north of Ekron, then the boundary bends around to Shikkeron and passes along to Mount Baalah \n" +
            "and goes out to Jabneel. Then the boundary comes to an end at the sea.\n" +
            "12 And the west boundary was the Great Sea with its coastline. This is the boundary around the people of Judah according to their clans.\n" +
            "13 According to the commandment of the LORD to Joshua, he gave to Caleb the son of Jephunneh a portion among the people of Judah, Kiriath-arba,\n" +
            " that is, Hebron (Arba was the father of Anak). \n" +
            "14 And Caleb drove out from there the three sons of Anak, Sheshai and Ahiman and Talmai, the descendants of Anak. \n" +
            "15 And he went up from there against the inhabitants of Debir. Now the name of Debir formerly was Kiriath-sepher. \n" +
            "16 And Caleb said, “Whoever strikes Kiriath-sepher and captures it, to him will I give Achsah my daughter as wife.” \n" +
            "17 And Othniel the son of Kenaz, the brother of Caleb, captured it. And he gave him Achsah his daughter as wife.\n" + 
            "18 When she came to him, she urged him to ask her father for a field. And she got off her donkey, and Caleb said to her, “What do you want?”\n" + 
            "19 She said to him, “Give me a blessing. Since you have given me the land of the Negeb, give me also springs of water.” \n" +
            "And he gave her the upper springs and the lower springs.\n" +
            "20 This is the inheritance of the tribe of the people of Judah according to their clans. \n" +
            "21 The cities belonging to the tribe of the people of Judah in the extreme south, toward the boundary of Edom, were Kabzeel, Eder, Jagur, \n" +
            "22 Kinah, Dimonah, Adadah, \n" +
            "23 Kedesh, Hazor, Ithnan, \n" +
            "24 Ziph, Telem, Bealoth, \n" +
            "25 Hazor-hadattah, Kerioth-hezron (that is, Hazor),\n" +
            "26 Amam, Shema, Moladah, \n" +
            "27 Hazar-gaddah, Heshmon, Beth-pelet,\n" +
            "28 Hazar-shual, Beersheba, Biziothiah, \n" +
            "29 Baalah, Iim, Ezem, \n" +
            "30 Eltolad, Chesil, Hormah, \n" +
            "31 Ziklag, Madmannah, Sansannah, \n" +
            "32 Lebaoth, Shilhim, Ain, and Rimmon: in all, twenty-nine cities with their villages.\n" +
            "33 And in the lowland, Eshtaol, Zorah, Ashnah, \n" +
            "34 Zanoah, En-gannim, Tappuah, Enam,\n" +
            "35 Jarmuth, Adullam, Socoh, Azekah, \n" +
            "36 Shaaraim, Adithaim, Gederah, Gederothaim: fourteen cities with their villages.\n" +
            "37 Zenan, Hadashah, Migdal-gad, \n" +
            "38 Dilean, Mizpeh, Joktheel, \n" +
            "39 Lachish, Bozkath, Eglon, \n" +
            "40 Cabbon, Lahmam, Chitlish, \n" +
            "41 Gederoth, Beth-dagon, Naamah, and Makkedah: sixteen cities with their villages.\n" +
            "42 Libnah, Ether, Ashan, \n" +
            "43 Iphtah, Ashnah, Nezib, \n" +
            "44 Keilah, Achzib, and Mareshah: nine cities with their villages.\n" +
            "45 Ekron, with its towns and its villages; \n" +
            "46 from Ekron to the sea, all that were by the side of Ashdod, with their villages.\n" +
            "47 Ashdod, its towns and its villages; Gaza, its towns and its villages; to the Brook of Egypt, and the Great Sea with its coastline.\n" +
            "48 And in the hill country, Shamir, Jattir, Socoh, \n" +
            "49 Dannah, Kiriath-sannah (that is, Debir), \n" +
            "50 Anab, Eshtemoh, Anim, \n" +
            "51 Goshen, Holon, and Giloh: eleven cities with their villages.\n" +
            "52 Arab, Dumah, Eshan, \n" +
            "53 Janim, Beth-tappuah, Aphekah, \n" +
            "54 Humtah, Kiriath-arba (that is, Hebron), and Zior: nine cities with their villages.\n" +
            "55 Maon, Carmel, Ziph, Juttah, \n" +
            "56 Jezreel, Jokdeam, Zanoah, \n" +
            "57 Kain, Gibeah, and Timnah: ten cities with their villages.\n" +
            "58 Halhul, Beth-zur, Gedor,\n" +
            "59 Maarath, Beth-anoth, and Eltekon: six cities with their villages.\n" +
            "60 Kiriath-baal (that is, Kiriath-jearim), and Rabbah: two cities with their villages.\n" +
            "61 In the wilderness, Beth-arabah, Middin, Secacah, \n" +
            "62 Nibshan, the City of Salt, and Engedi: six cities with their villages.\n" +
            "63 But the Jebusites, the inhabitants of Jerusalem, the people of Judah could not drive out, so the Jebusites dwell with the people of Judah \n" +
            "at Jerusalem to this day.\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the first content
        table15.add(lblFirstTitle).pad(10,50,0,0).left();
        table15.row();

        //content of the first title
        table15.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table15);

    }

    public void chapterSixteenOFJoshua() {

    	table16 = new Table();
        table16.setWidth(tableBG.getWidth());
        table16.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table16.setFillParent(true);
        table16.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The Allotment for Ephraim and Manasseh";

    	String firstContent = "1 The allotment of the people of Joseph went from the Jordan by Jericho, east of the waters of Jericho, into the wilderness, \n" +
            "going up from Jericho into the hill country to Bethel.\n" +
            "2 Then going from Bethel to Luz, it passes along to Ataroth, the territory of the Archites. \n" +
            "3 Then it goes down westward to the territory of the Japhletites, as far as the territory of Lower Beth-horon, then to Gezer, \n" +
            "and it ends at the sea.\n" +
            "4 The people of Joseph, Manasseh and Ephraim, received their inheritance.\n" +
            "5 The territory of the people of Ephraim by their clans was as follows: the boundary of their inheritance on the east was Ataroth-addar \n" +
            "as far as Upper Beth-horon, \n" +
            "6 and the boundary goes from there to the sea. On the north is Michmethath. Then on the east the boundary turns around toward Taanath-shiloh \n" +
            "and passes along beyond it on the east to Janoah,\n" +
            "7 then it goes down from Janoah to Ataroth and to Naarah, and touches Jericho, ending at the Jordan. \n" +
            "8 From Tappuah the boundary goes westward to the brook Kanah and ends at the sea. Such is the inheritance of the tribe of the people of Ephraim \n" +
            "by their clans,\n" +
            "9 together with the towns that were set apart for the people of Ephraim within the inheritance of the Manassites, \n" +
            "all those towns with their villages. \n" +
            "10 However, they did not drive out the Canaanites who lived in Gezer, so the Canaanites have lived in the midst of Ephraim to this day \n" +
            "but have been made to do forced labor.\n";

    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the first content
        table16.add(lblFirstTitle).pad(10,50,0,0).left();
        table16.row();

        //content of the first title
        table16.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table16);
 

    }

    public void chapterSeventeenOFJoshua() {

    	table17 = new Table();
        table17.setWidth(tableBG.getWidth());
        table17.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table17.setFillParent(true);
        table17.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = " ";

    	String firstContent = "1 Then allotment was made to the people of Manasseh, for he was the firstborn of Joseph. To Machir the firstborn of Manasseh,\n" +
            "the father of Gilead, were allotted Gilead and Bashan, because he was a man of war.\n" +
            "2 And allotments were made to the rest of the people of Manasseh by their clans, Abiezer, Helek, Asriel, Shechem, Hepher, and Shemida. \n" +
            "These were the male descendants of Manasseh the son of Joseph, by their clans.\n" +
            "3 Now Zelophehad the son of Hepher, son of Gilead, son of Machir, son of Manasseh, had no sons, but only daughters, \n" +
            "and these are the names of his daughters: Mahlah, Noah, Hoglah, Milcah, and Tirzah. \n" +
            "4 They approached Eleazar the priest and Joshua the son of Nun and the leaders and said,\n" +
            " “The LORD commanded Moses to give us an inheritance along with our brothers.” So according to the mouth of the LORD he gave them an inheritance \n" +
            "among the brothers of their father. \n" +
            "5 Thus there fell to Manasseh ten portions, besides the land of Gilead and Bashan, which is on the other side of the Jordan, \n" +
            "6 because the daughters of Manasseh received an inheritance along with his sons. The land of Gilead was allotted to the rest of the people of Manasseh.\n" +
            "7 The territory of Manasseh reached from Asher to Michmethath, which is east of Shechem. Then the boundary goes along southward \n" +
            "to the inhabitants of En-tappuah. \n" +
            "8 The land of Tappuah belonged to Manasseh, but the town of Tappuah on the boundary of Manasseh belonged to the people of Ephraim.\n" +
            "9 Then the boundary went down to the brook Kanah. These cities, to the south of the brook, among the cities of Manasseh, belong to Ephraim.\n" +
            " Then the boundary of Manasseh goes on the north side of the brook and ends at the sea, \n" +
            "10 the land to the south being Ephraim's and that to the north being Manasseh's, with the sea forming its boundary.\n" +
            " On the north Asher is reached, and on the east Issachar.\n" +
            "11 Also in Issachar and in Asher Manasseh had Beth-shean and its villages, and Ibleam and its villages, \n" +
            "and the inhabitants of Dor and its villages, and the inhabitants of En-dor and its villages, and the inhabitants of Taanach and its villages, \n" +
            "and the inhabitants of Megiddo and its villages; the third is Naphath. \n" +
            "12 Yet the people of Manasseh could not take possession of those cities, but the Canaanites persisted in dwelling in that land. \n" +
            "13 Now when the people of Israel grew strong, they put the Canaanites to forced labor, but did not utterly drive them out.\n" +
            "14 Then the people of Joseph spoke to Joshua, saying, “Why have you given me but one lot and one portion as an inheritance,\n" +
            " although I am a numerous people, since all along the LORD has blessed me?” \n" +
            "15 And Joshua said to them, “If you are a numerous people, go up by yourselves to the forest,\n" +
            " and there clear ground for yourselves in the land of the Perizzites and the Rephaim, since the hill country of Ephraim is too narrow for you.” \n" +
            "16 The people of Joseph said, “The hill country is not enough for us. Yet all the Canaanites who dwell in the plain have chariots of iron, \n" +
            "both those in Beth-shean and its villages and those in the Valley of Jezreel.” \n" +
            "17 Then Joshua said to the house of Joseph, to Ephraim and Manasseh, “You are a numerous people and have great power.\n" +
            " You shall not have one allotment only, \n" +
            "18 but the hill country shall be yours, for though it is a forest, you shall clear it and possess it to its farthest borders. \n" +
            "For you shall drive out the Canaanites, though they have chariots of iron, and though they are strong.”\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the first content
        table17.add(lblFirstTitle).pad(10,50,0,0).left();
        table17.row();

        //content of the first title
        table17.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table17);

    }

    public void chapterEighteenOFJoshua() {

    	table18 = new Table();
        table18.setWidth(tableBG.getWidth());
        table18.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table18.setFillParent(true);
        table18.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "Allotment of the Remaining Land";

    	String firstContent = "1 Then the whole congregation of the people of Israel assembled at Shiloh and set up the tent of meeting there. \n" +
            "The land lay subdued before them.\n" +
            "2 There remained among the people of Israel seven tribes whose inheritance had not yet been apportioned. \n" +
            "3 So Joshua said to the people of Israel, “How long will you put off going in to take possession of the land, which the LORD, \n" +
            "the God of your fathers, has given you? \n" +
            "4 Provide three men from each tribe, and I will send them out that they may set out and go up and down the land. \n" +
            "They shall write a description of it with a view to their inheritances, and then come to me. \n" +
            "5 They shall divide it into seven portions. Judah shall continue in his territory on the south, and the house of Joseph shall continue \n" +
            "in their territory on the north. \n" +
            "6 And you shall describe the land in seven divisions and bring the description here to me. And I will cast lots for you here before the LORD our God. \n" +
            "7 The Levites have no portion among you, for the priesthood of the LORD is their heritage. And Gad and Reuben and half the tribe of Manasseh\n" +
            " have received their inheritance beyond the Jordan eastward, which Moses the servant of the LORD gave them.”\n" +
            "8 So the men arose and went, and Joshua charged those who went to write the description of the land, saying, \n" +
            "“Go up and down in the land and write a description and return to me. And I will cast lots for you here before the LORD in Shiloh.” \n" +
            "9 So the men went and passed up and down in the land and wrote in a book a description of it by towns in seven divisions.\n" +
            "Then they came to Joshua to the camp at Shiloh, \n" +
            "10 and Joshua cast lots for them in Shiloh before the LORD. And there Joshua apportioned the land to the people of Israel, to each his portion.\n";

    	String chapterSecondTitle = "The Inheritance for Benjamin";

    	String secondContent = "11 The lot of the tribe of the people of Benjamin according to its clans came up, and the territory allotted to it fell\n" +
            "between the people of Judah and the people of Joseph. \n" +
            "12 On the north side their boundary began at the Jordan. Then the boundary goes up to the shoulder north of Jericho, \n" +
            "then up through the hill country westward, and it ends at the wilderness of Beth-aven. \n" +
            "13 From there the boundary passes along southward in the direction of Luz, to the shoulder of Luz (that is, Bethel), \n" +
            "then the boundary goes down to Ataroth-addar, on the mountain that lies south of Lower Beth-horon. \n" +
            "14 Then the boundary goes in another direction, turning on the western side southward from the mountain that lies to the south, \n" +
            "opposite Beth-horon, and it ends at Kiriath-baal (that is, Kiriath-jearim), a city belonging to the people of Judah. This forms the western side.\n" + 
            "15 And the southern side begins at the outskirts of Kiriath-jearim. And the boundary goes from there to Ephron, \n" +
            "to the spring of the waters of Nephtoah. \n" +
            "16 Then the boundary goes down to the border of the mountain that overlooks the Valley of the Son of Hinnom, \n" +
            "which is at the north end of the Valley of Rephaim. And it then goes down the Valley of Hinnom, south of the shoulder of the Jebusites, and downward to En-rogel. \n" +
            "17 Then it bends in a northerly direction going on to En-shemesh, and from there goes to Geliloth, which is opposite the ascent of Adummim. \n" +
            "Then it goes down to the stone of Bohan the son of Reuben, \n" +
            "18 and passing on to the north of the shoulder of Beth-arabah it goes down to the Arabah. \n" +
            "19 Then the boundary passes on to the north of the shoulder of Beth-hoglah. And the boundary ends at the northern bay of the Salt Sea, \n" +
            "at the south end of the Jordan: this is the southern border. \n" +
            "20 The Jordan forms its boundary on the eastern side. This is the inheritance of the people of Benjamin, according to their clans,\n" +
            " boundary by boundary all around.\n" +
            "21 Now the cities of the tribe of the people of Benjamin according to their clans were Jericho, Beth-hoglah, Emek-keziz, \n" +
            "22 Beth-arabah, Zemaraim, Bethel, \n" +
            "23 Avvim, Parah, Ophrah, \n" +
            "24 Chephar-ammoni, Ophni, Geba—twelve cities with their villages: \n" +
            "25 Gibeon, Ramah, Beeroth, \n" +
            "26 Mizpeh, Chephirah, Mozah, \n" +
            "27 Rekem, Irpeel, Taralah, \n" +
            "28 Zela, Haeleph, Jebu (that is, Jerusalem), Gibeah and Kiriath-jearim—fourteen cities with their villages. \n" +
            "This is the inheritance of the people of Benjamin according to its clans.\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the first content
        table18.add(lblFirstTitle).pad(10,50,0,0).left();
        table18.row();

        //content of the first title
        table18.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table18.row();

        //title of the second content
        table18.add(lblSecondTitle).pad(10,50,0,0).left();
        table18.row();

        //content of the second title
        table18.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table18);

    }


    public void chapterNineteenOFJoshua() {

    	table19 = new Table();
        table19.setWidth(tableBG.getWidth());
        table19.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table19.setFillParent(true);
        table19.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The Inheritance for Simeon";

    	String firstContent = "1 The second lot came out for Simeon, for the tribe of the people of Simeon, according to their clans, \n" +
            "and their inheritance was in the midst of the inheritance of the people of Judah. \n" +
            "2 And they had for their inheritance Beersheba, Sheba, Moladah, \n" +
            "3 Hazar-shual, Balah, Ezem,\n" +
            "4 Eltolad, Bethul, Hormah, \n" +
            "5 Ziklag, Beth-marcaboth, Hazar-susah,\n" +
            "6 Beth-lebaoth, and Sharuhen—thirteen cities with their villages; \n" +
            "7 Ain, Rimmon, Ether, and Ashan—four cities with their villages, \n" +
            "8 together with all the villages around these cities as far as Baalath-beer, Ramah of the Negeb. \n" +
            "This was the inheritance of the tribe of the people of Simeon according to their clans. \n" +
            "9 The inheritance of the people of Simeon formed part of the territory of the people of Judah.\n" +
            " Because the portion of the people of Judah was too large for them, the people of Simeon obtained an inheritance in the midst of their inheritance.\n";

    	String chapterSecondTitle = "The Inheritance for Zebulun";

    	String secondContent = "10 The third lot came up for the people of Zebulun, according to their clans. And the territory of their inheritance \n" +
            "reached as far as Sarid.\n" +
            "11 Then their boundary goes up westward and on to Mareal and touches Dabbesheth, then the brook that is east of Jokneam. \n" +
            "12 From Sarid it goes in the other direction eastward toward the sunrise to the boundary of Chisloth-tabor. From there it goes to Daberath, \n" +
            "then up to Japhia.\n" +
            "13 From there it passes along on the east toward the sunrise to Gath-hepher, to Eth-kazin, and going on to Rimmon it bends toward Neah,\n" +
            "14 then on the north the boundary turns about to Hannathon, and it ends at the Valley of Iphtahel; \n" +
            "15 and Kattath, Nahalal, Shimron, Idalah, and Bethlehem—twelve cities with their villages. \n" +
            "16 This is the inheritance of the people of Zebulun, according to their clans—these cities with their villages.\n";

    	String chapterThirdTitle = "The Inheritance for Issachar";

    	String thirdContent = "17 The fourth lot came out for Issachar, for the people of Issachar, according to their clans. \n" +
            "18 Their territory included Jezreel, Chesulloth, Shunem, \n" +
            "19 Hapharaim, Shion, Anaharath, \n" +
            "20 Rabbith, Kishion, Ebez,\n" +
            "21 Remeth, En-gannim, En-haddah, Beth-pazzez. \n" +
            "22 The boundary also touches Tabor, Shahazumah, and Beth-shemesh, and its boundary ends at the Jordan—sixteen cities with their villages. \n" +
            "23 This is the inheritance of the tribe of the people of Issachar, according to their clans—the cities with their villages.\n";

    	String chapterFourthTitle = "The Inheritance for Asher";

    	String fourthContent = "24 The fifth lot came out for the tribe of the people of Asher according to their clans. \n" +
            "25 Their territory included Helkath, Hali, Beten, Achshaph,\n" +
            "26 Allammelech, Amad, and Mishal. On the west it touches Carmel and Shihor-libnath,\n" +
            "27 then it turns eastward, it goes to Beth-dagon, and touches Zebulun and the Valley of Iphtahel northward to Beth-emek and Neiel. \n" +
            "Then it continues in the north to Cabul, \n" +
            "28 Ebron, Rehob, Hammon, Kanah, as far as Sidon the Great. \n" +
            "29 Then the boundary turns to Ramah, reaching to the fortified city of Tyre. Then the boundary turns to Hosah, and it ends at the sea; Mahalab, Achzib, \n" +
            "30 Ummah, Aphek and Rehob—twenty-two cities with their villages. \n" +
            "31 This is the inheritance of the tribe of the people of Asher according to their clans—these cities with their villages.\n";

    	String chapterFifthTitle = "The Inheritance for Naphtali";

    	String fifthContent = "32 The sixth lot came out for the people of Naphtali, for the people of Naphtali, according to their clans. \n" +
            "33 And their boundary ran from Heleph, from the oak in Zaanannim, and Adami-nekeb, and Jabneel, as far as Lakkum, and it ended at the Jordan. \n" +
            "34 Then the boundary turns westward to Aznoth-tabor and goes from there to Hukkok, touching Zebulun at the south and Asher on the west \n" +
            "and Judah on the east at the Jordan. \n" +
            "35 The fortified cities are Ziddim, Zer, Hammath, Rakkath, Chinnereth, \n" +
            "36 Adamah, Ramah, Hazor, \n" +
            "37 Kedesh, Edrei, En-hazor,\n" +
            "38 Yiron, Migdal-el, Horem, Beth-anath, and Beth-shemesh—nineteen cities with their villages. \n" +
            "39 This is the inheritance of the tribe of the people of Naphtali according to their clans—the cities with their villages.\n";

    	String chapterSixthTitle = "The Inheritance for Dan";

    	String sixthContent = "40 The seventh lot came out for the tribe of the people of Dan, according to their clans. \n" +
            "41 And the territory of its inheritance included Zorah, Eshtaol, Ir-shemesh, \n" +
            "42 Shaalabbin, Aijalon, Ithlah, \n" +
            "43 Elon, Timnah, Ekron, \n" +
            "44 Eltekeh, Gibbethon, Baalath,\n" + 
            "45 Jehud, Bene-berak, Gath-rimmon, \n" +
            "46 and Me-jarkon and Rakkon with the territory over against Joppa. \n" +
            "47 When the territory of the people of Dan was lost to them, the people of Dan went up and fought against Leshem, \n" +
            "and after capturing it and striking it with the sword they took possession of it and settled in it, calling Leshem, Dan, \n" +
            "after the name of Dan their ancestor. \n" +
            "48 This is the inheritance of the tribe of the people of Dan, according to their clans—these cities with their villages.\n";


    	String chapterSeventhTitle = "The Inheritance for Joshua";

    	String seventhContent = "49 When they had finished distributing the several territories of the land as inheritances, \n" +
            "the people of Israel gave an inheritance among them to Joshua the son of Nun. \n" +
            "50 By command of the LORD they gave him the city that he asked, Timnath-serah in the hill country of Ephraim. \n" +
            "And he rebuilt the city and settled in it.\n" +
            "51 These are the inheritances that Eleazar the priest and Joshua the son of Nun and the heads of the fathers' \n" +
            "houses of the tribes of the people of Israel distributed by lot at Shiloh before the LORD, at the entrance of the tent of meeting. \n" +
            "So they finished dividing the land.\n";



    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	lblThirdTitle = new Label(chapterThirdTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	lblFourthTitle = new Label(chapterFourthTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	lblFifthTitle = new Label(chapterFifthTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	lblSixthTitle = new Label(chapterSixthTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	lblSeventhTitle = new Label(chapterSeventhTitle, new Label.LabelStyle(contentFont, Color.WHITE));

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

        //title of the first content
        table19.add(lblFirstTitle).pad(10,50,0,0).left();
        table19.row();

        //content of the first title
        table19.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table19.row();

        //title of the second content
        table19.add(lblSecondTitle).pad(10,50,0,0).left();
        table19.row();

        //content of the second title
        table19.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table19.row();

        table19.add(lblThirdTitle).pad(10,50,0,0).left();
        table19.row();

        table19.add(txtThirdContent).pad(10,70,0,0).left().width(900);
        table19.row();

        table19.add(lblFourthTitle).pad(10,50,0,0).left();
        table19.row();

        table19.add(txtFourthContent).pad(10,70,0,0).left().width(900);
        table19.row();

        table19.add(lblFifthTitle).pad(10,50,0,0).left();
        table19.row();

        table19.add(txtFifthContent).pad(10,70,0,0).left().width(900);
        table19.row();

        table19.add(lblSixthTitle).pad(10,50,0,0).left();
        table19.row();

        table19.add(txtSixthContent).pad(10,70,0,0).left().width(900);
        table19.row();

        table19.add(lblSeventhTitle).pad(10,50,0,0).left();
        table19.row();

        table19.add(txtSeventhContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table19);

    }

    public void chapterTwentyOFJoshua() {

    	table20 = new Table();
        table20.setWidth(tableBG.getWidth());
        table20.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table20.setFillParent(true);
        table20.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The Cities of Refuge";

    	String firstContent = "1 Then the LORD said to Joshua, \n" +
            "2 “Say to the people of Israel, ‘Appoint the cities of refuge, of which I spoke to you through Moses, \n" +
            "3 that the manslayer who strikes any person without intent or unknowingly may flee there. They shall be for you a refuge from the avenger of blood.\n" + 
            "4 He shall flee to one of these cities and shall stand at the entrance of the gate of the city and explain his case to the elders of that city. \n" +
            "Then they shall take him into the city and give him a place, and he shall remain with them.\n" +
            "5 And if the avenger of blood pursues him, they shall not give up the manslayer into his hand, because he struck his neighbor unknowingly, \n" +
            "and did not hate him in the past. \n" +
            "6 And he shall remain in that city until he has stood before the congregation for judgment, until the death of him who is high priest at the time. \n" +
            "Then the manslayer may return to his own town and his own home, to the town from which he fled.’”\n" +
            "7 So they set apart Kedesh in Galilee in the hill country of Naphtali, and Shechem in the hill country of Ephraim, and Kiriath-arba (that is, Hebron) \n" +
            "in the hill country of Judah. \n" +
            "8 And beyond the Jordan east of Jericho, they appointed Bezer in the wilderness on the tableland, from the tribe of Reuben, and Ramoth in Gilead,\n" +
            " from the tribe of Gad, and Golan in Bashan, from the tribe of Manasseh. \n" +
            "9 These were the cities designated for all the people of Israel and for the stranger sojourning among them, \n" +
            "that anyone who killed a person without intent could flee there, so that he might not die by the hand of the avenger of blood, \n" +
            "till he stood before the congregation.\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);
      
        //title of the first content
        table20.add(lblFirstTitle).pad(10,50,0,0).left();
        table20.row();

        //content of the first title
        table20.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table20);
       
    }

    public void chapterTwentyOneOFJoshua() {

    	table21 = new Table();
        table21.setWidth(tableBG.getWidth());
        table21.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table21.setFillParent(true);
        table21.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "Cities and Pasturelands Allotted to Levi";

    	String firstContent = "1 Then the heads of the fathers' houses of the Levites came to Eleazar the priest and to Joshua the son of Nun \n" +
            "and to the heads of the fathers' houses of the tribes of the people of Israel. \n" +
            "2 And they said to them at Shiloh in the land of Canaan, “The LORD commanded through Moses that we be given cities to dwell in, \n" +
            "along with their pasturelands for our livestock.”\n" +
            "3 So by command of the LORD the people of Israel gave to the Levites the following cities and pasturelands out of their inheritance.\n" +
            "4 The lot came out for the clans of the Kohathites. So those Levites who were descendants of Aaron the priest received by lot from the tribes \n" +
            "of Judah, Simeon, and Benjamin, thirteen cities.\n" +
            "5 And the rest of the Kohathites received by lot from the clans of the tribe of Ephraim, from the tribe of Dan and the half-tribe of Manasseh, ten cities.\n" +
            "6 The Gershonites received by lot from the clans of the tribe of Issachar, from the tribe of Asher, from the tribe of Naphtali, \n" +
            "and from the half-tribe of Manasseh in Bashan, thirteen cities.\n" +
            "7 The Merarites according to their clans received from the tribe of Reuben, the tribe of Gad, and the tribe of Zebulun, twelve cities.\n" +
            "8 These cities and their pasturelands the people of Israel gave by lot to the Levites, as the LORD had commanded through Moses.\n" +
            "9 Out of the tribe of the people of Judah and the tribe of the people of Simeon they gave the following cities mentioned by name, \n" +
            "10 which went to the descendants of Aaron, one of the clans of the Kohathites who belonged to the people of Levi; \n" +
            "since the lot fell to them first. \n" +
            "11 They gave them Kiriath-arba (Arba being the father of Anak), that is Hebron, in the hill country of Judah, \n" +
            "along with the pasturelands around it. \n" +
            "12 But the fields of the city and its villages had been given to Caleb the son of Jephunneh as his possession.\n" +
            "13 And to the descendants of Aaron the priest they gave Hebron, the city of refuge for the manslayer, with its pasturelands, \n" +
            "Libnah with its pasturelands, \n" +
            "14 Jattir with its pasturelands, Eshtemoa with its pasturelands, \n" +
            "15 Holon with its pasturelands, Debir with its pasturelands,\n" +
            "16 Ain with its pasturelands, Juttah with its pasturelands, Beth-shemesh with its pasturelands—nine cities out of these two tribes; \n" +
            "17 then out of the tribe of Benjamin, Gibeon with its pasturelands, Geba with its pasturelands, \n" +
            "18 Anathoth with its pasturelands, and Almon with its pasturelands—four cities. \n" +
            "19 The cities of the descendants of Aaron, the priests, were in all thirteen cities with their pasturelands.\n" +
            "20 As to the rest of the Kohathites belonging to the Kohathite clans of the Levites, the cities allotted to them were out of the tribe of Ephraim.\n" + 
            "21 To them were given Shechem, the city of refuge for the manslayer, with its pasturelands in the hill country of Ephraim, \n" +
            "Gezer with its pasturelands,\n" +
            "22 Kibzaim with its pasturelands, Beth-horon with its pasturelands—four cities; \n" +
            "23 and out of the tribe of Dan, Elteke with its pasturelands, Gibbethon with its pasturelands, \n" +
            "24 Aijalon with its pasturelands, Gath-rimmon with its pasturelands—four cities; \n" +
            "25 and out of the half-tribe of Manasseh, Taanach with its pasturelands, and Gath-rimmon with its pasturelands—two cities.\n" + 
            "26 The cities of the clans of the rest of the Kohathites were ten in all with their pasturelands.\n" +
            "27 And to the Gershonites, one of the clans of the Levites, were given out of the half-tribe of Manasseh, Golan in Bashan with its pasturelands, \n" +
            "the city of refuge for the manslayer, and Beeshterah with its pasturelands—two cities; \n" +
            "28 and out of the tribe of Issachar, Kishion with its pasturelands, Daberath with its pasturelands, \n" +
            "29 Jarmuth with its pasturelands, En-gannim with its pasturelands—four cities; \n" +
            "30 and out of the tribe of Asher, Mishal with its pasturelands, Abdon with its pasturelands, \n" +
            "31 Helkath with its pasturelands, and Rehob with its pasturelands—four cities; \n" +
            "32 and out of the tribe of Naphtali, Kedesh in Galilee with its pasturelands, the city of refuge for the manslayer, \n" +
            "Hammoth-dor with its pasturelands, and Kartan with its pasturelands—three cities. \n" +
            "33 The cities of the several clans of the Gershonites were in all thirteen cities with their pasturelands.\n" +
            "34 And to the rest of the Levites, the Merarite clans, were given out of the tribe of Zebulun, Jokneam with its pasturelands, \n" +
            "Kartah with its pasturelands, \n" +
            "35 Dimnah with its pasturelands, Nahalal with its pasturelands—four cities; \n" +
            "36 and out of the tribe of Reuben, Bezer with its pasturelands, Jahaz with its pasturelands, \n" +
            "37 Kedemoth with its pasturelands, and Mephaath with its pasturelands—four cities; \n" +
            "38 and out of the tribe of Gad, Ramoth in Gilead with its pasturelands, the city of refuge for the manslayer, Mahanaim with its pasturelands, \n" +
            "39 Heshbon with its pasturelands, Jazer with its pasturelands—four cities in all. \n" +
            "40 As for the cities of the several Merarite clans, that is, the remainder of the clans of the Levites, \n" +
            "those allotted to them were in all twelve cities.\n" +
            "41 The cities of the Levites in the midst of the possession of the people of Israel were in all forty-eight cities with their pasturelands. \n" +
            "42 These cities each had its pasturelands around it. So it was with all these cities.\n" +
            "43 Thus the LORD gave to Israel all the land that he swore to give to their fathers. And they took possession of it, and they settled there. \n" +
            "44 And the LORD gave them rest on every side just as he had sworn to their fathers. Not one of all their enemies had withstood them, \n" +
            "for the LORD had given all their enemies into their hands. \n" +
            "45 Not one word of all the good promises that the LORD had made to the house of Israel had failed; all came to pass.\n";

    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the first content
        table21.add(lblFirstTitle).pad(10,50,0,0).left();
        table21.row();

        //content of the first title
        table21.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table21);
     
    }


    public void chapterTwentyTwoOFJoshua() {

    	table22 = new Table();
        table22.setWidth(tableBG.getWidth());
        table22.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table22.setFillParent(true);
        table22.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The Eastern Tribes Return Home";

    	String firstContent = "1 At that time Joshua summoned the Reubenites and the Gadites and the half-tribe of Manasseh, \n" +
            "2 and said to them, “You have kept all that Moses the servant of the LORD commanded you and have obeyed my voice in all that I have commanded you. \n" +
            "3 You have not forsaken your brothers these many days, down to this day, but have been careful to keep the charge of the LORD your God. \n" +
            "4 And now the LORD your God has given rest to your brothers, as he promised them. Therefore turn and go to your tents in the land where \n" +
            "your possession lies, which Moses the servant of the LORD gave you on the other side of the Jordan. \n" +
            "5 Only be very careful to observe the commandment and the law that Moses the servant of the LORD commanded you, to love the LORD your God, \n" +
            "and to walk in all his ways and to keep his commandments and to cling to him and to serve him with all your heart and with all your soul.” \n" +
            "6 So Joshua blessed them and sent them away, and they went to their tents.\n" +
            "7 Now to the one half of the tribe of Manasseh Moses had given a possession in Bashan, but to the other half Joshua had given a possession \n" +
            "beside their brothers in the land west of the Jordan. And when Joshua sent them away to their homes and blessed them, \n" +
            "8 he said to them, “Go back to your tents with much wealth and with very much livestock, with silver, gold, bronze, and iron, \n" +
            "and with much clothing. Divide the spoil of your enemies with your brothers.” \n" +
            "9 So the people of Reuben and the people of Gad and the half-tribe of Manasseh returned home, parting from the people of Israel at Shiloh, \n" +
            "which is in the land of Canaan, to go to the land of Gilead, their own land of which they had possessed themselves by command of the LORD through Moses.\n";

    	String chapterSecondTitle = "The Eastern Tribes' Altar of Witness";

    	String secondContent = "10 And when they came to the region of the Jordan that is in the land of Canaan, the people of Reuben and the people of Gad \n" +
            "and the half-tribe of Manasseh built there an altar by the Jordan, an altar of imposing size.\n" +
            "11 And the people of Israel heard it said, “Behold, the people of Reuben and the people of Gad and the half-tribe of Manasseh have built the altar at\n" +
            " the frontier of the land of Canaan, in the region about the Jordan, on the side that belongs to the people of Israel.” \n" +
            "12 And when the people of Israel heard of it, the whole assembly of the people of Israel gathered at Shiloh to make war against them.\n" +
            "13 Then the people of Israel sent to the people of Reuben and the people of Gad and the half-tribe of Manasseh, in the land of Gilead, \n" +
            "Phinehas the son of Eleazar the priest, \n" +
            "14 and with him ten chiefs, one from each of the tribal families of Israel, every one of them the head of a family among the clans of Israel. \n" +
            "15 And they came to the people of Reuben, the people of Gad, and the half-tribe of Manasseh, in the land of Gilead, and they said to them, \n" +
            "16 “Thus says the whole congregation of the LORD, ‘What is this breach of faith that you have committed against the God of Israel \n" +
            "in turning away this day from following the LORD by building yourselves an altar this day in rebellion against the LORD? \n" +
            "17 Have we not had enough of the sin at Peor from which even yet we have not cleansed ourselves, and for which there came a plague \n" +
            "upon the congregation of the LORD,\n" + 
            "18 that you too must turn away this day from following the LORD? And if you too rebel against the LORD today then tomorrow he will be angry \n" +
            "with the whole congregation of Israel. \n" +
            "19 But now, if the land of your possession is unclean, pass over into the LORD's land where the LORD's tabernacle stands, \n" +
            "and take for yourselves a possession among us. Only do not rebel against the LORD or make us as rebels by building for yourselves an altar \n" +
            "other than the altar of the LORD our God. \n" +
            "20 Did not Achan the son of Zerah break faith in the matter of the devoted things, and wrath fell upon all the congregation of Israel? \n" +
            "And he did not perish alone for his iniquity.’”\n" +
            "21 Then the people of Reuben, the people of Gad, and the half-tribe of Manasseh said in answer to the heads of the families of Israel,\n" +
            "22 “The Mighty One, God, the LORD! The Mighty One, God, the LORD! He knows; and let Israel itself know! If it was in rebellion or \n" +
            "in breach of faith against the LORD, do not spare us today \n" +
            "23 for building an altar to turn away from following the LORD. Or if we did so to offer burnt offerings or grain offerings or peace offerings on it, \n" +
            "may the LORD himself take vengeance. \n" +
            "24 No, but we did it from fear that in time to come your children might say to our children, ‘What have you to do with the LORD, the God of Israel? \n" +
            "25 For the LORD has made the Jordan a boundary between us and you, you people of Reuben and people of Gad. You have no portion in the LORD.’ \n" +
            "So your children might make our children cease to worship the LORD. \n" +
            "26 Therefore we said, ‘Let us now build an altar, not for burnt offering, nor for sacrifice, \n" +
            "27 but to be a witness between us and you, and between our generations after us, that we do perform the service of the LORD in his presence \n" +
            "with our burnt offerings and sacrifices and peace offerings, so your children will not say to our children in time to come, “You have no portion in the LORD.”’ \n" +
            "28 And we thought, ‘If this should be said to us or to our descendants in time to come, we should say, “Behold, the copy of the altar of the LORD, \n" +
            "which our fathers made, not for burnt offerings, nor for sacrifice, but to be a witness between us and you.”’ \n" +
            "29 Far be it from us that we should rebel against the LORD and turn away this day from following the LORD by building an altar for burnt offering, \n" +
            "grain offering, or sacrifice, other than the altar of the LORD our God that stands before his tabernacle!”\n" +
            "30 When Phinehas the priest and the chiefs of the congregation, the heads of the families of Israel who were with him, \n" +
            "heard the words that the people of Reuben and the people of Gad and the people of Manasseh spoke, it was good in their eyes. \n" +
            "31 And Phinehas the son of Eleazar the priest said to the people of Reuben and the people of Gad and the people of Manasseh, \n" +
            "“Today we know that the LORD is in our midst, because you have not committed this breach of faith against the LORD. Now you have delivered the people of Israel \n" +
            "from the hand of the LORD.”\n" +
            "32 Then Phinehas the son of Eleazar the priest, and the chiefs, returned from the people of Reuben and the people of Gad in the land of Gilead \n" +
            "to the land of Canaan, to the people of Israel, and brought back word to them. \n" +
            "33 And the report was good in the eyes of the people of Israel. And the people of Israel blessed God and spoke no more of making war against them \n" +
            "to destroy the land where the people of Reuben and the people of Gad were settled. \n" +
            "34 The people of Reuben and the people of Gad called the altar Witness, “For,” they said, “it is a witness between us that the LORD is God.”\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the first content
        table22.add(lblFirstTitle).pad(10,50,0,0).left();
        table22.row();

        //content of the first title
        table22.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table22.row();

        //title of the second content
        table22.add(lblSecondTitle).pad(10,50,0,0).left();
        table22.row();

        //content of the second title
        table22.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table22);

    }


    public void chapterTwentyThreeOFJoshua() {

    	table23 = new Table();
        table23.setWidth(tableBG.getWidth());
        table23.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table23.setFillParent(true);
        table23.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "Joshua's Charge to Israel's Leaders";

    	String firstContent = "1 A long time afterward, when the LORD had given rest to Israel from all their surrounding enemies, \n" +
            "and Joshua was old and well advanced in years, \n" +
            "2 Joshua summoned all Israel, its elders and heads, its judges and officers, and said to them, “I am now old and well advanced in years.\n" +
            "3 And you have seen all that the LORD your God has done to all these nations for your sake, for it is the LORD your God who has fought for you. \n" +
            "4 Behold, I have allotted to you as an inheritance for your tribes those nations that remain, along with all the nations that I have already cut off, \n" +
            "from the Jordan to the Great Sea in the west. \n" +
            "5 The LORD your God will push them back before you and drive them out of your sight. And you shall possess their land,\n" +
            "just as the LORD your God promised you.\n" + 
            "6 Therefore, be very strong to keep and to do all that is written in the Book of the Law of Moses, \n" +
            "turning aside from it neither to the right hand nor to the left, \n" +
            "7 that you may not mix with these nations remaining among you or make mention of the names of their gods or swear by them or serve them \n" +
            "or bow down to them, \n" +
            "8 but you shall cling to the LORD your God just as you have done to this day. \n" +
            "9 For the LORD has driven out before you great and strong nations. And as for you, no man has been able to stand before you to this day. \n" +
            "10 One man of you puts to flight a thousand, since it is the LORD your God who fights for you, just as he promised you. \n" +
            "11 Be very careful, therefore, to love the LORD your God. \n" +
            "12 For if you turn back and cling to the remnant of these nations remaining among you and make marriages with them, \n" +
            "so that you associate with them and they with you, \n" +
            "13 know for certain that the LORD your God will no longer drive out these nations before you, but they shall be a snare and a trap for you, \n" +
            "a whip on your sides and thorns in your eyes, until you perish from off this good ground that the LORD your God has given you.\n" +
            "14 “And now I am about to go the way of all the earth, and you know in your hearts and souls, all of you, \n" +
            "that not one word has failed of all the good things that the LORD your God promised concerning you. All have come to pass for you; \n" +
            "not one of them has failed. \n" +
            "15 But just as all the good things that the LORD your God promised concerning you have been fulfilled for you, \n" +
            "so the LORD will bring upon you all the evil things, until he has destroyed you from off this good land that the LORD your God has given you, \n" +
            "16 if you transgress the covenant of the LORD your God, which he commanded you, and go and serve other gods and bow down to them. \n" +
            "Then the anger of the LORD will be kindled against you, and you shall perish quickly from off the good land that he has given to you.”\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));  

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);    

        //title of the first content
        table23.add(lblFirstTitle).pad(10,50,0,0).left();
        table23.row();

        //content of the first title
        table23.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table23);  

    }


    public void chapterTwentyFourOFJoshua() {

    	table24 = new Table();
        table24.setWidth(tableBG.getWidth());
        table24.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table24.setFillParent(true);
        table24.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

    	String chapterFirstTitle = "The Covenant Renewal at Shechem";

    	String firstContent = "1 Joshua gathered all the tribes of Israel to Shechem and summoned the elders, the heads, the judges, \n" +
            "and the officers of Israel. And they presented themselves before God. \n" +
            "2 And Joshua said to all the people, “Thus says the LORD, the God of Israel, ‘Long ago, your fathers lived beyond the Euphrates, \n" +
            "Terah, the father of Abraham and of Nahor; and they served other gods. \n" +
            "3 Then I took your father Abraham from beyond the River and led him through all the land of Canaan, and made his offspring many. \n" +
            "I gave him Isaac. \n" +
            "4 And to Isaac I gave Jacob and Esau. And I gave Esau the hill country of Seir to possess, but Jacob and his children went down to Egypt. \n" +
            "5 And I sent Moses and Aaron, and I plagued Egypt with what I did in the midst of it, and afterward I brought you out.\n" +
            "6 “‘Then I brought your fathers out of Egypt, and you came to the sea. And the Egyptians pursued your fathers with chariots and horsemen \n" +
            "to the Red Sea. \n" +
            "7 And when they cried to the LORD, he put darkness between you and the Egyptians and made the sea come upon them and cover them; \n" +
            "and your eyes saw what I did in Egypt. And you lived in the wilderness a long time. \n" +
            "8 Then I brought you to the land of the Amorites, who lived on the other side of the Jordan. They fought with you, \n" +
            "and I gave them into your hand, and you took possession of their land, and I destroyed them before you. \n" +
            "9 Then Balak the son of Zippor, king of Moab, arose and fought against Israel. And he sent and invited Balaam the son of Beor to curse you, \n" +
            "10 but I would not listen to Balaam. Indeed, he blessed you. So I delivered you out of his hand. \n" +
            "11 And you went over the Jordan and came to Jericho, and the leaders of Jericho fought against you, and also the Amorites, the Perizzites,\n" +
            " the Canaanites, the Hittites, the Girgashites, the Hivites, and the Jebusites. And I gave them into your hand. \n" +
            "12 And I sent the hornet before you, which drove them out before you, the two kings of the Amorites; it was not by your sword or by your bow. \n" +
            "13 I gave you a land on which you had not labored and cities that you had not built, and you dwell in them. You eat the fruit of vineyards \n" +
            "and olive orchards that you did not plant.’\n";

    	String chapterSecondTitle = "Choose Whom You Will Serve";

    	String secondContent = "14 “Now therefore  Put away the gods that your fathers served beyond the River and in Egypt, and serve the LORD.\n" + 
            "15 And if it is evil in your eyes to serve the LORD, choose this day whom you will serve, whether the gods your fathers served in the region \n" +
            "beyond the River, or the gods of the Amorites in whose land you dwell. But as for me and my house, we will serve the LORD.”\n" +
            "16 Then the people answered, “Far be it from us that we should forsake the LORD to serve other gods, \n" +
            "17 for it is the LORD our God who brought us and our fathers up from the land of Egypt, out of the house of slavery, \n" +
            "and who did those great signs in our sight and preserved us in all the way that we went, and among all the peoples through whom we passed.\n" + 
            "18 And the LORD drove out before us all the peoples, the Amorites who lived in the land. Therefore we also will serve the LORD, \n" +
            "for he is our God.”\n" +
            "19 But Joshua said to the people, “You are not able to serve the LORD, for he is a holy God. He is a jealous God; \n" +
            "he will not forgive your transgressions or your sins. \n" +
            "20 If you forsake the LORD and serve foreign gods, then he will turn and do you harm and consume you, after having done you good.” \n" +
            "21 And the people said to Joshua, “No, but we will serve the LORD.” \n" +
            "22 Then Joshua said to the people, “You are witnesses against yourselves that you have chosen the LORD, to serve him.” \n" +
            "And they said, “We are witnesses.” \n" +
            "23 He said, “Then put away the foreign gods that are among you, and incline your heart to the LORD, the God of Israel.” \n" +
            "24 And the people said to Joshua, “The LORD our God we will serve, and his voice we will obey.” \n" +
            "25 So Joshua made a covenant with the people that day, and put in place statutes and rules for them at Shechem. \n" +
            "26 And Joshua wrote these words in the Book of the Law of God. And he took a large stone and set it up there under the terebinth \n" +
            "that was by the sanctuary of the LORD. \n" +
            "27 And Joshua said to all the people, “Behold, this stone shall be a witness against us, for it has heard all the words of the LORD \n" +
            "that he spoke to us. Therefore it shall be a witness against you, lest you deal falsely with your God.” \n" +
            "28 So Joshua sent the people away, every man to his inheritance.\n";

    	String chapterThirdTitle = "Joshua's Death and Burial";

    	String thirdContent = "29 After these things Joshua the son of Nun, the servant of the LORD, died, being 110 years old. \n" +
            "30 And they buried him in his own inheritance at Timnath-serah, which is in the hill country of Ephraim, north of the mountain of Gaash.\n" +
            "31 Israel served the LORD all the days of Joshua, and all the days of the elders who outlived Joshua and had known all the work that the LORD did for Israel.\n" +
            "32 As for the bones of Joseph, which the people of Israel brought up from Egypt, they buried them at Shechem, in the piece of land that Jacob \n" +
            "bought from the sons of Hamor the father of Shechem for a hundred pieces of money. It became an inheritance of the descendants of Joseph.\n" +
            "33 And Eleazar the son of Aaron died, and they buried him at Gibeah, the town of Phinehas his son, which had been given him in the hill country of Ephraim.\n";


    	lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));
    	
    	lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	lblThirdTitle = new Label(chapterThirdTitle, new Label.LabelStyle(contentFont, Color.WHITE));

    	txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        txtThirdContent = new Label(thirdContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtThirdContent.setWrap(true);

        //title of the first content
        table24.add(lblFirstTitle).pad(10,50,0,0).left();
        table24.row();

        //content of the first title
        table24.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table24.row();

        //title of the second content
        table24.add(lblSecondTitle).pad(10,50,0,0).left();
        table24.row();

        //content of the second title
        table24.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table24);

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
    }

    public void update() {

        camera.update();
    }

    public void render(SpriteBatch sb) {

        stage.draw();
    }

    public Table getTable24() {
        return table24;
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

    public Stage getStage() {
        return stage;
    }

    public OrthographicCamera getCamera() {
        return camera;
    }


}