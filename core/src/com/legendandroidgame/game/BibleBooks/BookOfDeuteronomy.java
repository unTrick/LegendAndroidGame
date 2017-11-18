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
public class BookOfDeuteronomy {
    
    private Stage stage;
    private OrthographicCamera camera;

    BitmapFont titleFont, contentFont;

    Label txtFirstContent, txtSecondContent, txtThirdContent, txtFourthContent, txtFifthContent;
    Label lblFirstTitle, lblSecondTitle, lblThirdTitle, lblFourthTitle, lblFifthTitle;

    private Texture tableBG;

    Table table1, table2, table3, table4, table5, table6, table7, table8, table9, table10, table11, table12,
            table13, table14, table15, table16, table17, table18, table19, table20, table21, table22, table23,
            table24, table25, table26, table27, table28, table29, table30, table31, table32, table33, table34;



    public BookOfDeuteronomy() {

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


        chapterOneOFDeuteronomy();
        chapterTwoOFDeuteronomy();
        chapterThreeOFDeuteronomy();
        chapterFourOFDeuteronomy();
        chapterFiveOFDeuteronomy();
        chapterSixOFDeuteronomy();
        chapterSevenOFDeuteronomy();
        chapterEightOFDeuteronomy();
        chapterNineOFDeuteronomy();
        chapterTenOFDeuteronomy();
        chapterElevenOFDeuteronomy();
        chapterTwelveOFDeuteronomy();
        chapterThirteenOFDeuteronomy();
        chapterFourteenOFDeuteronomy();
        chapterFifteenOFDeuteronomy();
        chapterSixteenOFDeuteronomy();
        chapterSeventeenOFDeuteronomy();
        chapterEighteenOFDeuteronomy();
        chapterNineteenOFDeuteronomy();
        chapterTwentyOFDeuteronomy();
        chapterTwentyOneOFDeuteronomy();
        chapterTwentyTwoOFDeuteronomy();
        chapterTwentyThreeOFDeuteronomy();
        chapterTwentyFourOFDeuteronomy();
        chapterTwentyFiveOFDeuteronomy();
        chapterTwentySixOFDeuteronomy();
        chapterTwentySevenOFDeuteronomy();
        chapterTwentyEightOFDeuteronomy();
        chapterTwentyNineOFDeuteronomy();
        chapterThirtyOFDeuteronomy();
        chapterThirtyOneOFDeuteronomy();
        chapterThirtyTwoOFDeuteronomy();
        chapterThirtyThreeOFDeuteronomy();
        chapterThirtyFourOFDeuteronomy();

    }


    public void chapterOneOFDeuteronomy() {

        table1 = new Table();
        table1.setWidth(tableBG.getWidth());
        table1.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table1.setFillParent(true);
        table1.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Command to Leave Horeb";

        String firstContent = "1 These are the words that Moses spoke to all Israel beyond the Jordan \n" +
                "in the wilderness, in the Arabah opposite Suph, between Paran and Tophel, Laban, Hazeroth, and Dizahab. \n" +
                "2 It is eleven days' journey from Horeb by the way of Mount Seir to Kadesh-barnea. \n" +
                "3 In the fortieth year, on the first day of the eleventh month, Moses spoke to the people of Israel \n" +
                "according to all that the LORD had given him in commandment to them, \n" +
                "4 after he had defeated Sihon the king of the Amorites, who lived in Heshbon, \n" +
                "and Og the king of Bashan, who lived in Ashtaroth and in Edrei. \n" +
                "5 Beyond the Jordan, in the land of Moab, Moses undertook to explain this law, saying, \n" +
                "6 “The LORD our God said to us in Horeb, ‘You have stayed long enough at this mountain. \n" +
                "7 Turn and take your journey, and go to the hill country of the Amorites and to all their \n" +
                "neighbors in the Arabah, in the hill country and in the lowland and in the Negeb and by the seacoast, \n" +
                "the land of the Canaanites, and Lebanon, as far as the great river, the river Euphrates. \n" +
                "8 See, I have set the land before you. Go in and take possession of the land that the LORD \n" +
                "swore to your fathers, to Abraham, to Isaac, and to Jacob, to give to them and to their offspring after them.’\n";


        String chapterSecondTitle = "Leaders Appointed";

        String secondContent = "9 “At that time I said to you, ‘I am not able to bear you by myself.\n" +
                "10 The LORD your God has multiplied you, and behold, you are today as numerous as the stars of heaven. \n" +
                "11 May the LORD, the God of your fathers, make you a thousand times as many as you are and bless you, as he has promised you! \n" +
                "12 How can I bear by myself the weight and burden of you and your strife? \n" +
                "13 Choose for your tribes wise, understanding, and experienced men, and I will appoint them as your heads.’\n" +
                "14 And you answered me, ‘The thing that you have spoken is good for us to do.’ \n" +
                "15 So I took the heads of your tribes, wise and experienced men, and set them as heads over you, \n" +
                "ommanders of thousands, commanders of hundreds, commanders of fifties, commanders of tens, and officers, throughout your tribes. \n" +
                "16 And I charged your judges at that time, ‘Hear the cases between your brothers, and judge \n" +
                "ighteously between a man and his brother or the alien who is with him. \n" +
                "17 You shall not be partial in judgment. You shall hear the small and the great alike. \n" +
                "ou shall not be intimidated by anyone, for the judgment is God's. And the case that is too hard for you, you shall bring to me, and I will hear it.’ \n" +
                "18 And I commanded you at that time all the things that you should do.\n";

        String chapterThirdTitle = "Israel's Refusal to Enter the Land";

        String thirdContent = "19 “Then we set out from Horeb and ywent through all that great and terrifying wilderness that you saw,\n" +
                "on the way to the hill country of the Amorites, as the LORD our God commanded us. And we came to Kadesh-barnea. \n" +
                "20 And I said to you,‘You have come to the hill country of the Amorites, which the LORD our God is giving us. \n" +
                "21 See, the LORD your God has set the land before you. Go up, take possession, as the LORD, the God of your fathers,\n" +
                "has told you. Do not fear or be dismayed.’ \n" +
                "22 Then all of you came near me and said, ‘Let us send men before us, that they may explore the land for us \n" +
                "nd bring us word again of the way by which we must go up and the cities into which we shall come.’ \n" +
                "23 The thing seemed good to me, and I took twelve men from you, one man from each tribe.\n" +
                "24 And they turned and went up into the hill country, and came to the Valley of Eshcol and spied it out. \n" +
                "25 And they took in their hands some of the fruit of the land and brought it down to us, and brought us word again and said,\n" +
                "‘It is a good land that the LORD our God is giving us.’\n" +
                "26 “Yet you would not go up, but rebelled against the command of the LORD your God.\n" +
                "27 And you murmured in your tents and said, ‘Because the LORD hated us he has brought us out of the land of Egypt,\n" +
                "to give us into the hand of the Amorites, to destroy us. \n" +
                "28 Where are we going up? Our brothers have made our hearts melt, saying, “The people are greater and taller than we. \n" +
                "he cities are great and fortified up to heaven. And besides, we have seen the sons of the Anakim there.”’\n" +
                "29 Then I said to you, ‘Do not be in dread or afraid of them. \n" +
                "30 The LORD your God who goes before you will himself fight for you, just as he did for you in Egypt before your eyes, \n" +
                "31 and in the wilderness, where you have seen how the LORD your God carried you, as a man carries his son, \n" +
                "ll the way that you went until you came to this place.’ \n" +
                "32 Yet in spite of this word you did not believe the LORD your God, \n" +
                "33 who went before you in the way to seek you out a place to pitch your tents, in fire by night and in the cloud by day,\n" +
                "to show you by what way you should go.\n";


        String chapterFourthTitle = "The Penalty for Israel's Rebellion";

        String fourthContent = "34 “And the LORD heard your words and was angered, and he swore,\n" +
                "35 ‘Not one of these men of this evil generation shall see the good land that I swore to give to your fathers, \n" +
                "36 except Caleb the son of Jephunneh. He shall see it, and to him and to his children I will give the land on which he has trodden,\n" +
                "because he has wholly followed the LORD!’ \n" +
                "37 Even with me the LORD was angry on your account and said, ‘You also shall not go in there. \n" +
                "38 Joshua the son of Nun, who stands before you, he shall enter. Encourage him, for he shall cause Israel to inherit it. \n" +
                "39 And as for your little ones, who you said would become a prey, and your children, who today have no knowledge of good or evil,\n" +
                "they shall go in there. And to them I will give it, and they shall possess it\n" +
                "40 But as for you, turn, and journey into the wilderness in the direction of the Red Sea.’\n" +
                "41 “Then you answered me, ‘We have sinned against the LORD. We ourselves will go up and fight, just as the LORD our God commanded us.’ \n" +
                "nd every one of you fastened on his weapons of war and thought it easy to go up into the hill country. \n" +
                "42 And the LORD said to me, ‘Say to them, Do not go up or fight, for I am not in your midst, lest you be defeated before your enemies.’ \n" +
                "43 So I spoke to you, and you would not listen; but you rebelled against the command of the LORD and presumptuously went up into the hill country. \n" +
                "44 Then the Amorites who lived in that hill country came out against you and chased you as bees do and beat you down in Seir as far as Hormah. \n" +
                "45 And you returned and wept before the LORD, but the LORD did not listen to your voice or give ear to you.\n" +
                "46 So you remained at Kadesh many days, the days that you remained there.\n";


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
        table1.row();

        //title of the third content
        table1.add(lblThirdTitle).pad(10,50,0,0).left();
        table1.row();

        //content of the third title
        table1.add(txtThirdContent).pad(10,70,0,0).left().width(900);
        table1.row();

        //title of the fourth content
        table1.add(lblFourthTitle).pad(10,50,0,0).left();
        table1.row();

        //content of the fourtn title
        table1.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table1);


    }


    public void chapterTwoOFDeuteronomy() {

        table2 = new Table();
        table2.setWidth(tableBG.getWidth());
        table2.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table2.setFillParent(true);
        table2.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Wilderness Years";

        String firstContent = "1 “Then we turned and journeyed into the wilderness in the direction of the Red Sea, as the LORD told me. \n" +
                "And for many days we traveled around Mount Seir.\n" +
                "2 Then the LORD said to me, \n" +
                "3 ‘You have been traveling around this mountain country long enough. Turn northward\n" +
                "4 and command the people, “You are about to pass through the territory of your brothers, the people of Esau,  \n" +
                "who live in Seir; and they will be afraid of you. So be very careful. \n" +
                "5 Do not contend with them, for I will not give you any of their land, \n" +
                "no, not so much as for the sole of the foot to tread on, \n" +
                "because I have given Mount Seir to Esau as a possession. \n" +
                "6 You shall purchase food from them with money, that you may eat, \n" +
                "and you shall also buy water from them with money, that you may drink. \n" +
                "7 For the LORD your God has blessed you in all the work of your hands.  \n" +
                "He knows your going through this great wilderness.  \n" +
                "These forty years the LORD your God has been with you. You have lacked nothing.”’ \n" +
                "8 So we went on, away from our brothers, the people of Esau, who live in Seir, \n" +
                "away from the Arabah road from Elath and Ezion-geber.\n" +
                "“And we turned and went in the direction of the wilderness of Moab.\n" +
                "9 And the LORD said to me, ‘Do not harass Moab or contend with them in battle, \n" +
                "for I will not give you any of their land for a possession, \n" +
                "because I have given Ar to the people of Lot for a possession.’ \n" +
                "10 (The Emim formerly lived there, a people great and many, and tall as the Anakim.\n" +
                "11 Like the Anakim they are also counted as Rephaim, but the Moabites call them Emim. \n" +
                "12 The Horites also lived in Seir formerly, but the people of Esau dispossessed them and destroyed them from before them \n" +
                "and settled in their place, as Israel did to the land of their possession, \n" +
                "which the LORD gave to them.) \n" +
                "13 ‘Now rise up and go overthe brook Zered.’ So we went over the brook Zered. \n" +
                "14 And the time from our leaving Kadesh-barnea until we crossed the brook Zered was thirty-eight years, \n" +
                "until the entire generation,\n" +
                " that is, the men of war, had perished from the camp, as the LORD had sworn to them. \n" +
                "15 For indeed the hand of the LORD was against them, to destroy them from the camp, \n" +
                "until they had perished.\n" +
                "16 “So as soon as all the men of war had perished and were dead from among the people, \n" +
                "17 the LORD said to me, \n" +
                "18 ‘Today you are to cross the border of Moab at Ar. \n" +
                "19 And when you approach the territory of the people of Ammon, do not harass them or contend with them, \n" +
                "for I will not give you any of the land of the people of Ammon as a possession, \n" +
                "because I have given it to the sons of Lot for a possession.’ \n" +
                "20 (It is also counted as a land of Rephaim. Rephaim formerly lived there—but the Ammonites call them Zamzummim—\n" +
                "21 a people great and many, and tall as the Anakim; but the LORD destroyed them before the Ammonites, \n" +
                "and they dispossessed them and settled in their place, \n" +
                "22 as he did for the people of Esau, who live in Seir, when he destroyed the Horites \n" +
                "before them and they dispossessed them and settled in their place even to this day. \n" +
                "23 As for the Avvim, who lived in villages as far as Gaza, the Caphtorim,\n" +
                " who came from Caphtor, destroyed them and settled in their place.) \n" +
                "24 ‘Rise up, set out on your journey and go over the Valley of the Arnon. \n" +
                "Behold, I have given into your hand Sihon the Amorite, \n" +
                "king of Heshbon, and his land. Begin to take possession, and contend with him in battle.\n" +
                "25 This day I will begin to put the dread and fear of you on the peoples who are under the whole heaven, \n" +
                "who shall hear the report of you and shall tremble and be in anguish because of you.’\n";


        String chapterSecondTitle = "The Defeat of King Sihon";

        String secondContent = "26 “So I sent messengers from the wilderness of Kedemoth \n" +
                "to Sihon the king of Heshbon, with words of peace, saying, \n" +
                "27  ‘Let me pass through your land. I will go only by the road; \n" +
                "I will turn aside neither to the right nor to the left. \n" +
                "28 You shall sell me food for money, that I may eat, and give me water for money, \n" +
                "that I may drink. Only let me pass through on foot, \n" +
                "29 as the sons of Esau who live in Seir and the Moabites who live in Ar did for me, \n" +
                "until I go over the Jordan into the land that the LORD our God is giving to us.’ \n" +
                "30 But Sihon the king of Heshbon would not let us pass by him, \n" +
                "for the LORD your God hardened his spirit and made his heart obstinate, that he might give him into your hand, as he is this day. \n" +
                "31 And the LORD said to me, ‘Behold, I have begun to give Sihon and his land over to you.\n" +
                " Begin to take possession, that you may occupy his land.’\n" +
                "32 Then Sihon came out against us, he and all his people, to battle at Jahaz. \n" +
                "33 And the LORD our God gave him over to us, and we defeated him and his sons and all his people. \n" +
                "34 And we captured all his cities at that time and devoted to destruction every city,\n" +
                " men, women, and children. We left no survivors. \n" +
                "35 Only the livestock we took as spoil for ourselves, \n" +
                "with the plunder of the cities that we captured. \n" +
                "36 From Aroer, which is on the edge of the Valley of the Arnon, \n" +
                "and from the city that is in the valley, as far as Gilead, there was not a city too high for us.  The LORD our God gave all into our hands. \n" +
                "37 Only to the land of the sons of Ammon you did not draw near, \n" +
                "that is, to all the banks of the river Jabbok and the cities of the hill country, whatever the LORD our God had forbidden us.\n";

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


    public void chapterThreeOFDeuteronomy() {

        table3 = new Table();
        table3.setWidth(tableBG.getWidth());
        table3.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table3.setFillParent(true);
        table3.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Defeat of King Og";

        String firstContent = "1 “Then we turned and went up the way to Bashan. And Og the king of Bashan came out against us, \n" +
                "   he and all his people, to battle at Edrei. \n" +
                "2 But the LORD said to me, ‘Do not fear him, for I have given him and all his people and his land into your hand. \n" +
                "   And you shall do to him as you did to Sihon the king of the Amorites, who lived at Heshbon.’\n" +
                "3 So the LORD our God gave into our hand Og also, the king of Bashan, and all his people, \n" +
                "   and we struck him down until he had no survivor left.\n" +
                "4 And we took all his cities at that time—there was not a city that we did not take from them—sixty cities, \n" +
                "   the whole region of Argob, the kingdom of Og in Bashan.\n" +
                "5 All these were cities fortified with high walls, gates, and bars, besides very many unwalled villages. \n" +
                "6 And we devoted them to destruction, as we did to Sihon the king of Heshbon, devoting to destruction every city, men, women, and children. \n" +
                "7 But all the livestock and the spoil of the cities we took as our plunder. \n" +
                "8 So we took the land at that time out of the hand of the two kings of the Amorites who were beyond the Jordan, \n" +
                "   from the Valley of the Arnon to Mount Hermon\n" +
                "9 (the Sidonians call Hermon Sirion, while the Amorites call it Senir), \n" +
                "10 all the cities of the tableland and all Gilead and all Bashan, as far as Salecah and Edrei, cities of the kingdom of Og in Bashan.\n" +
                "11 (For only Og the king of Bashan was left of the remnant of the Rephaim. Behold, his bed was a bed of iron. \n" +
                "   Is it not in Rabbah of the Ammonites? Nine cubits was its length, and four cubits its breadth, according to the common cubit.)\n" +
                "12 “When we took possession of this land at that time, I gave to the Reubenites and the Gadites the territory beginning at Aroer, \n" +
                "   which is on the edge of the Valley of the Arnon, and half the hill country of Gilead with its cities. \n" +
                "13 The rest of Gilead, and all Bashan, the kingdom of Og, that is, all the region of Argob, I gave to the half-tribe of Manasseh. \n" +
                "   (All that portion of Bashan is called the land of Rephaim. \n" +
                "14 Jair the Manassite took all the region of Argob, that is, Bashan, as far as the border of zthe Geshurites and the Maacathites, \n" +
                "   and called the villages after his own name, Havvoth-jair, as it is to this day.) \n" +
                "15 To Machir I gave Gilead,\n" +
                "16 and to the Reubenites and the Gadites I gave the territory from Gilead as far as the Valley of the Arnon, \n" +
                "   with the middle of the valley as a border, as far over as the river Jabbok, the border of the Ammonites; \n" +
                "17 the Arabah also, with the Jordan as the border, from Chinnereth as far as the Sea of the Arabah, the Salt Sea, \n" +
                "   under the slopes of Pisgah on the east.\n" +
                "18 “And I commanded you at that time, saying, ‘The LORD your God has given you this land to possess. \n" +
                "   All your men of valor shall cross over armed before your brothers, the people of Israel. \n" +
                "19 Only your wives, your little ones, and your livestock (I know that you have much livestock) \n" +
                "   shall remain in the cities that I have given you,\n" +
                "20 until the LORD gives rest to your brothers, as to you, and they also occupy the land that the LORD your God gives them beyond the Jordan.\n" +
                "    Then each of you may return to his possession which I have given you.’ \n" +
                "21 And I commanded Joshua at that time, ‘Your eyes have seen all that the LORD your God has done to these two kings. \n" +
                "   So will the LORD do to all the kingdoms into which you are crossing. \n" +
                "22 You shall not fear them, for it is the LORD your God who fights for you.’\n";


        String chapterSecondTitle = "Moses Forbidden to Enter the Land";

        String secondContent = "23 “And I pleaded with the LORD at that time, saying, \n" +
                "24 ‘O Lord GOD, you have only begun to show your servant your greatness and your mighty hand. \n" +
                "   For what god is there in heaven or on earth who can do such works and mighty acts as yours? \n" +
                "25 Please let me go over and see the good land beyond the Jordan, that good hill country and Lebanon.’ \n" +
                "26 But the LORD was angry with me because of you and would not listen to me. And the LORD said to me, \n" +
                "   ‘Enough from you; do not speak to me of this matter again.\n" +
                "27 Go up to the top of Pisgah and lift up your eyes westward and northward and southward and eastward, \n" +
                "   and look at it with your eyes, for you shall not go over this Jordan.\n" +
                "28 But charge Joshua, and encourage and strengthen him, for he shall go over at the head of this people, \n" +
                "   and he shall put them in possession of the land that you shall see.’ \n" +
                "29 So we remained in the valley opposite Beth-peor.\n";

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

        //title of the chapter
        table3.add(lblFirstTitle).pad(10,50,0,0).left();
        table3.row();

        //content of the chapter
        table3.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table3.row();

        //title of the second content
        table3.add(lblSecondTitle).pad(10,50,0,0).left();
        table3.row();

        //content of the second title
        table3.add(txtSecondContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table3);


    }

    public void chapterFourOFDeuteronomy() {

        table4 = new Table();
        table4.setWidth(tableBG.getWidth());
        table4.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table4.setFillParent(true);
        table4.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Moses Commands Obedience";

        String firstContent = "1 “And now, O Israel, listen to the statutes and the rules1 that I am teaching you, and do them,  \n" +
                "   that you may live, and go in and take possession of the land that the LORD, the God of your fathers, is giving you. \n" +
                "2 You shall not add to the word that I command you, nor take from it, that you may keep the commandments of the LORD your God that I command you. \n" +
                "3 Your eyes have seen what the LORD did at Baal-peor, for the LORD your God destroyed from among you all the men who followed the Baal of Peor. \n" +
                "4 But you who held fast to the LORD your God are all alive today. \n" +
                "5 See, I have taught you statutes and rules, as the LORD my God commanded me, \n" +
                "   that you should do them in the land that you are entering to take possession of it.\n" +
                "6 Keep them and do them, for that will be your wisdom and your understanding in the sight of the peoples, who, \n" +
                "   when they hear all these statutes, will say, ‘Surely this great nation is a wise and understanding people.’ \n" +
                "7 For what great nation is there that has da god so near to it as the LORD our God is to us, whenever we call upon him? \n" +
                "8 And what great nation is there, that has statutes and rules so righteous as all this law that I set before you today?\n" +
                "9 “Only take care, and keep your soul diligently, lest you forget the things that your eyes have seen, \n" +
                "   and lest they depart from your heart all the days of your life. Make them known to your children and your children's children—\n" +
                "10 how on the day that you stood before the LORDyour God at Horeb, the LORD said to me,  \n" +
                "   ‘Gather the people to me, that I may let them hear my words, so that they may learn to fear me all the days that they live on the earth, \n" +
                "   and that they may teach their children so.’ \n" +
                "11 And you came near and stood at the foot of the mountain, while the mountain burned with fire to the heart of heaven, \n" +
                "   wrapped in darkness, cloud, and gloom. \n" +
                "12 Then the LORD spoke to you out of the midst of the fire. You heard the sound of words,  but saw no form; there was only a voice. \n" +
                "13 And he declared to you his covenant, which he commanded you to perform, that is, the Ten Commandments, \n" +
                "   and he wrote them on two tablets of stone. \n" +
                "14 And the LORD commanded me at that time to teach you statutes and rules, that you might do them in the land that you are going over to possess.\n";


        String chapterSecondTitle = "Idolatry Forbidden";

        String secondContent = "15 “Therefore watch yourselves very carefully. Since you saw no form on the day that the LORD spoke to you \n" +
                "   at Horeb out of the midst of the fire, \n" +
                "16 beware lest you act corruptly by making a carved image for yourselves, in the form of any figure, the likeness of male or female,\n" +
                "17 the likeness of any animal that is on the earth, the likeness of any winged bird that flies in the air, \n" +
                "18 the likeness of anything that creeps on the ground, the likeness of any fish that is in the water under the earth.\n" +
                "19 And beware lest you raise your eyes to heaven, and when you see the sun and the moon and the stars, all the host of heaven, \n" +
                "   you be drawn away and bow down to them and serve them, things that the LORD your God has allotted to all the peoples under the whole heaven. \n" +
                "20 But the LORD has taken you and brought you out of the iron furnace, out of Egypt, to be a people of his own inheritance, \n" +
                "   as you are this day.\n" +
                "21 Furthermore, the LORD was angry with me because of you, and he swore that I should not cross the Jordan, \n" +
                "   and that I should not enter the good land that the LORD your God is giving you for an inheritance. \n" +
                "22 For I must die in this land; I must not go over the Jordan. But you shall go over and take possession of that good land. \n" +
                "23 Take care, lest you forget the covenant of the LORD your God, which he made with you, and make a carved image, \n" +
                "   the form of anything that the LORD your God has forbidden you. \n" +
                "24 For the LORD your God is a consuming fire, a jealous God.\n" +
                "25 “When you father children and children's children, and have grown old in the land, if you act corruptly by making a carved image \n" +
                "   in the form of anything, and by doing what is evil in the sight of the LORD your God, so as to provoke him to anger, \n" +
                "26 I call heaven and earth to witness against you today, that you will soon utterly perish from the land \n" +
                "   that you are going over the Jordan to possess. You will not live long in it, but will be utterly destroyed. \n" +
                "27 And the LORD will scatter you among the peoples, and you will be left few in number among the nations where the LORD will drive you. \n" +
                "28 And there you will serve gods of wood and stone, the work of human hands, that neither see, nor hear, nor eat, nor smell. \n" +
                "29 But from there you will seek the LORD your God and you will find him, if you search after him with all your heart and with all your soul. \n" +
                "30 When you are in tribulation, and all these things come upon you tin the latter days, you will return to the LORD your God and obey his voice. \n" +
                "31 For the LORD your God is a merciful God. He will not leave you or destroy you or forget the covenant with your fathers that he swore to them.\n";


        String chapterThirdTitle = "The LORD Alone Is God";

        String thirdContent = "32 “For ask now of the days that are past, which were before you, since the day that God created man on the earth, \n" +
                "   and ask from one end of heaven to the other, whether such a great thing as this has ever happened or was ever heard of. \n" +
                "33 Did any people ever hear the voice of a god speaking out of the midst of the fire, as you have heard, and still live? \n" +
                "34 Or has any god ever attempted to go and take a nation for himself from the midst of another nation, \n" +
                "   by trials, by signs, by wonders, and by war,  by a mighty hand and ban outstretched arm, and by great deeds of terror,\n" +
                "   all of which the LORD your God did for you in Egypt before your eyes? \n" +
                "35 To you it was shown, that you might know that the LORD is God;  there is no other besides him. \n" +
                "36 Out of heaven he let you hear his voice, that he might discipline you. And on earth he let you see his great fire, \n" +
                "   and you heard his words out of the midst of the fire. \n" +
                "37 And because he loved your fathers and chose their offspring after them3 and brought you out of Egypt with his own presence, by his great power, \n" +
                "38 driving out before you nations greater and mightier than you, to bring you in, to give you their land for an inheritance, as it is this day, \n" +
                "39 know therefore today, and lay it to your heart, that the LORD is God in heaven above and on the earth beneath; there is no other. \n" +
                "40 Therefore you shall keep his statutes and his commandments, which I command you today,  \n" +
                "   that it may go well with you and with your children after you, and that you may prolong your days in the land that the LORD your God \n" +
                "   is giving you for all time.”\n";


        String chapterFourthTitle = "Cities of Refuge";

        String fourthContent = "41 Then Moses set apart three cities in the east beyond the Jordan,\n" +
                "42 that the manslayer might flee there, anyone who kills his neighbor unintentionally, \n" +
                "   without being at enmity with him in time past; he may flee to one of these cities and save his life: \n" +
                "43 Bezer in the wilderness on the tableland for the Reubenites, Ramoth in Gilead for the Gadites, and Golan in Bashan for the Manassites.\n";


        String chapterFifthTitle = "Introduction to the Law";

        String fifthContent = "44 This is the law that Moses set before the people of Israel. \n" +
                "45 These are the testimonies, the statutes, and the rules, which Moses spoke to the people of Israel when they came out of Egypt, \n" +
                "46 beyond the Jordan in the valley opposite Beth-peor, in the land of Sihon the king of the Amorites, who lived at Heshbon, \n" +
                "   whom Moses and the people of Israel defeated when they came out of Egypt. \n" +
                "47 And they took possession of his land and the land of Og, the king of Bashan, the two kings of the Amorites, \n" +
                "   who lived to the east beyond the Jordan;\n" +
                "48 from Aroer, which is on the edge of the Valley of the Arnon, as far as Mount Sirion (that is, Hermon), S\n" +
                "49 together with all the Arabah on the east side of the Jordan as far as the Sea of the Arabah, under the slopes of Pisgah.\n";
 

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
        table4.add(lblFirstTitle).pad(10,50,0,0).left();
        table4.row();

        //content of the chapter
        table4.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table4.row();

        //title of the second content
        table4.add(lblSecondTitle).pad(10,50,0,0).left();
        table4.row();

        //content of the second title
        table4.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table4.row();

        //title of the third content
        table4.add(lblThirdTitle).pad(10,50,0,0).left();
        table4.row();

        //content of the third title
        table4.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        //title of the fourth content
        table4.add(lblFourthTitle).pad(10,50,0,0).left();
        table4.row();

        //content of the fourth title
        table4.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        //title of the fifth content
        table4.add(lblFifthTitle).pad(10,50,0,0).left();
        table4.row();

        //content of the fifth title
        table4.add(txtFifthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table4);

    }


    public void chapterFiveOFDeuteronomy() {

        table5 = new Table();
        table5.setWidth(tableBG.getWidth());
        table5.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table5.setFillParent(true);
        table5.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Ten Commandments";

        String firstContent = "1 And Moses summoned all Israel and said to them, “Hear, O Israel, the statutes and the rules that I speak in your hearing today, \n" +
                "   and you shall learn them and be careful to do them. \n" +
                "2 The LORD our God made a covenant with us in Horeb. \n" +
                "3 Not with our fathers did the LORD make this covenant, but with us, who are all of us here alive today.\n" +
                "4 The LORD spoke with you face to face at the mountain, out of the midst of the fire, \n" +
                "5 while I stood between the LORD and you at that time, to declare to you the word of the LORD. For you were afraid because of the fire, \n" +
                "   and you did not go up into the mountain. He said:\n" +
                "6 “‘I am the LORD your God, who brought you out of the land of Egypt, out of the house of slavery.\n" +
                "7 “‘You shall have no other gods before1 me.\n" +
                "8 “‘You shall not make for yourself a carved image, or any likeness of anything that is in heaven above, or that is on the earth beneath, \n" +
                "   or that is in the water under the earth. \n" +
                "9 You shall not bow down to them or serve them; for I the LORD your God am a jealous God, \n" +
                "   visiting the iniquity of the fathers on the children to the third and fourth generation of those who hate me, \n" +
                "10 but showing steadfast love to thousands of those who love me and keep my commandments.\n" +
                "11 “‘You shall not take the name of the LORD your God in vain, for the LORD will not hold him guiltless who takes his name in vain.\n" +
                "12 “‘Observe the Sabbath day, to keep it holy, as the LORD your God commanded you. \n" +
                "13 Six days you shall labor and do all your work, \n" +
                "14 but the seventh day is a Sabbath to the LORD your God. On it you shall not do any work, \n" +
                "   you or your son or your daughter or your male servant or your female servant, or your ox or your donkey or any of your livestock, \n" +
                "   or the sojourner who is within your gates, that your male servant and your female servant may rest as well as you. \n" +
                "15 You shall remember that you were a slave3 in the land of Egypt, and the LORD your God brought you out from there with a mighty hand \n" +
                "   and an outstretched arm. Therefore the LORD your God commanded you to keep the Sabbath day.\n" +
                "16 “‘Honor your father and your mother, as the LORD your God commanded you, that your days may be long, \n" +
                "   and that it may go well with you in the land that the LORD your God is giving you.\n" +
                "17 “‘You shall not murder. \n" +
                "18 “‘And you shall not commit adultery.\n" +
                "19 “‘And you shall not steal.\n" +
                "20 “‘And you shall not bear false witness against your neighbor.\n" +
                "21 “‘And you shall not covet your neighbor's wife. And you shall not desire your neighbor's house, his field, or his male servant, \n" +
                "   or his female servant, his ox, or his donkey, or anything that is your neighbor's.’\n" +
                "22 “These words the LORD spoke to all your assembly at the mountain out of the midst of the fire, the cloud, and the thick darkness, \n" +
                "   with a loud voice; and he added no more. And he wrote them on two tablets of stone and gave them to me.\n" +
                "23 And as soon as you heard the voice out of the midst of the darkness, while the mountain was burning with fire, you came near to me, \n" +
                "   all the heads of your tribes, and your elders. \n" +
                "24 And you said, ‘Behold, the LORD our God has shown us his glory and greatness, and we have heard his voice out of the midst of the fire. \n" +
                "   This day we have seen God speak with man, and man still live.\n" +
                "25 Now therefore why should we die? For this great fire will consume us. If we hear the voice of the LORD our God any more, we shall die. \n" +
                "26 For who is there of all flesh, that has heard the voice of the living God speaking out of the midst of fire as we have, and has still lived? \n" +
                "27 Go near and hear all that the LORD our God will say, and speak to us all that the LORD our God will speak to you, and we will hear and do it.’\n" +
                "28 “And the LORD heard your words, when you spoke to me. And the LORD said to me, ‘I have heard the words of this people, \n" +
                "   which they have spoken to you. They are right in all that they have spoken. \n" +
                "29 Oh that they had such a heart as this always, to fear me and to keep all my commandments, \n" +
                "   that it might go well with them and with their descendants forever! \n" +
                "30 Go and say to them, “Return to your tents.”\n" +
                "31 But you, stand here by me, and I will tell you the whole commandment and the statutes and the rules that you shall teach them, \n" +
                "   that they may do them in the land that I am giving them to possess.’\n" +
                "32 You shall be careful therefore to do as the LORD your God has commanded you. You shall not turn aside to the right hand or to the left. \n" +
                "33 You shall walk in all the way that the LORD your God has commanded you, that you may live, \n" +
                "   and that it may go well with you, and that you may live long in the land that you shall possess.\n";

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


    public void chapterSixOFDeuteronomy() {

        table6 = new Table();
        table6.setWidth(tableBG.getWidth());
        table6.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table6.setFillParent(true);
        table6.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Greatest Commandment";

        String firstContent = "1 “Now this is the commandment—the statutes and the rules—that the LORD your God commanded me to teach you, \n" +
                "   that you may do them in the land to which you are going over, to possess it, \n" +
                "2 that you may fear the LORD your God, you and your son and your son's son, by keeping all his statutes and his commandments, \n" +
                "   which I command you, all the days of your life, and that your days may be long. \n" +
                "3 Hear therefore, O Israel, and be careful to do them, that it may go well with you, and that you may multiply greatly, \n" +
                "   as the LORD, the God of your fathers, has promised you, in a land flowing with milk and honey.\n" +
                "4 “Hear, O Israel: The LORD our God, the LORD is one. \n" +
                "5 You shall love the LORD your God with all your heart and with all your soul and with all your might. \n" +
                "6 And these words that I command you today shall be on your heart. \n" +
                "7 You shall teach them diligently to your children, and shall talk of them when you sit in your house, \n" +
                "   and when you walk by the way, and when you lie down, and when you rise. \n" +
                "8 You shall bind them as a sign on your hand, and they shall be as frontlets between your eyes.\n" +
                "9 You shall write them on the doorposts of your house and on your gates.\n" +
                "10 “And when the LORD your God brings you into the land that he swore to your fathers, to Abraham, to Isaac, and to Jacob, \n" +
                "   to give you—with great and good cities that you did not build, \n" +
                "11 and houses full of all good things that you did not fill, and cisterns that you did not dig, and vineyards \n" +
                "   and olive trees that you did not plant—and when you eat and are full, \n" +
                "12 then take care lest you forget the LORD, who brought you out of the land of Egypt, out of the house of slavery. \n" +
                "13 It is the LORD your God you shall fear. Him you shall serve and by his name you shall swear. \n" +
                "14 You shall not go after other gods, the gods of the peoples who are around you—\n" +
                "   15 for the LORD your God in your midst is a jealous God—lest the anger of the LORD your God be kindled against you, \n" +
                "   and he destroy you from off the face of the earth.\n" +
                "16 “You shall not put the LORD your God to the test,  as you tested him at Massah. \n" +
                "17 You shall diligently keep the commandments of the LORD your God, and his testimonies and his statutes, which he has commanded you. \n" +
                "18 And you shall do what is right and good in the sight of the LORD, that it may go well with you, \n" +
                "   and that you may go in and take possession of the good land that the LORD swore to give to your fathers \n" +
                "19 by thrusting out all your enemies from before you, as the LORD has promised.\n" +
                "20 “When your son asks you in time to come, ‘What is the meaning of the testimonies and the statutes \n" +
                "   and the rules that the LORD our God has commanded you?’ \n" +
                "21 then you shall say to your son, ‘We were Pharaoh's slaves in Egypt. And the LORD brought us out of Egypt with a mighty hand. \n" +
                "22 And the LORD showed signs and wonders, great and grievous, against Egypt and against Pharaoh and all his household, before our eyes. \n" +
                "23 And he brought us out from there, that he might bring us in and give us the land that he swore to give to our fathers.\n" +
                "24 And the LORD commanded us to do all these statutes, to fear the LORD our God, for our good always, \n" +
                "   that he might preserve us alive, as we are this day. \n" +
                "25 And it will be righteousness for us, if we are careful to do all this commandment before the LORD our God, as he has commanded us.’\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table6.add(lblFirstTitle).pad(10,50,0,0).left();
        table6.row();

        //content of the chapter
        table6.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table6);

    }

    public void chapterSevenOFDeuteronomy() {

        table7 = new Table();
        table7.setWidth(tableBG.getWidth());
        table7.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table7.setFillParent(true);
        table7.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "A Chosen People";

        String firstContent = "1 “When the LORD your God brings you into the land that you are entering to take possession of it, \n" +
                "   and clears away many nations before you, the Hittites, the Girgashites, the Amorites, the Canaanites, \n" +
                "   the Perizzites, the Hivites, and the Jebusites, seven nations more numerous and mightier than you, \n" +
                "2 and when the LORD your God gives them over to you, and you defeat them, then you must devote them to complete destruction. \n" +
                "   You shall make no covenant with them and show no mercy to them. \n" +
                "3 You shall not intermarry with them, giving your daughters to their sons or taking their daughters for your sons, \n" +
                "4 for they would turn away your sons from following me, to serve other gods. Then the anger of the LORD would be kindled against you, \n" +
                "   and he would destroy you quickly. \n" +
                "5 But thus shall you deal with them: you shall break down their altars and dash in pieces their pillars and chop down their Asherim \n" +
                "   and burn their carved images with fire.\n" +
                "6 “For you are a people holy to the LORD your God. The LORD your God has chosen you to be a people for his treasured possession, \n" +
                "   out of all the peoples who are on the face of the earth. \n" +
                "7 It was not because you were more in number than any other people that the LORD set his love on you and chose you, \n" +
                "   for you were the fewest of all peoples, \n" +
                "8 but it is because the LORD loves you and is keeping the oath that he swore to your fathers, \n" +
                "   that the LORD has brought you out with a mighty hand and redeemed you from the house of slavery, from the hand of Pharaoh king of Egypt. \n" +
                "9 Know therefore that the LORD your God is God, the faithful God who keeps covenant and steadfast love with those who love him \n" +
                "   and keep his commandments, to a thousand generations, \n" +
                "10 and repays to their face those who hate him, by destroying them. He will not be slack with one who hates him. \n" +
                "   He will repay him to his face. \n" +
                "11 You shall therefore be careful to do the commandment and the statutes and the rules that I command you today.\n" +
                "12 “And because you listen to these rules and keep and do them, the LORD your God will keep with you the covenant \n" +
                "   and the steadfast love that he swore to your fathers. \n" +
                "13 He will love you, bless you, and multiply you. He will also bless the fruit of your womb and the fruit of your ground, \n" +
                "   your grain and your wine and your oil, the increase of your herds and the young of your flock, \n" +
                "   in the land that he swore to your fathers to give you. \n" +
                "14 You shall be blessed above all peoples.  There shall not be male or female barren among you or among your livestock.\n" +
                "15 And the LORD will take away from you all sickness, and none of the evil diseases of Egypt, which you knew, will he inflict on you, \n" +
                "   but he will lay them on all who hate you. \n" +
                "16 And you shall consume all the peoples that the LORD your God will give over to you. Your eye shall not pity them, \n" +
                "   neither shall you serve their gods, for that would be fa snare to you.\n" +
                "17 “If you say in your heart, ‘These nations are greater than I. How can I dispossess them?’ \n" +
                "18 you shall not be afraid of them but you shall remember what the LORD your God did to Pharaoh and to all Egypt,\n" +
                "19 the great trials that your eyes saw, the signs, the wonders, the mighty hand, and the outstretched arm, \n" +
                "   by which the LORD your God brought you out. So will the LORD your God do to all the peoples of whom you are afraid. \n" +
                "20 Moreover, the LORD your God will send hornets among them, until those who are left and hide themselves from you are destroyed. \n" +
                "21 You shall not be in dread of them, for the LORD your God is in your midst, a great and awesome God. \n" +
                "22 The LORD your God will clear away these nations before you little by little. You may not make an end of them at once, \n" +
                "   lest the wild beasts grow too numerous for you.\n" +
                "23 But the LORD your God will give them over to you and throw them into great confusion, until they are destroyed. \n" +
                "24 And he will give their kings into your hand, and you shall pmake their name perish from under heaven. \n" +
                "   No one shall be able to stand against you until you have destroyed them. \n" +
                "25 The carved images of their gods you shall burn with fire. You shall not covet the silver \n" +
                "   or the gold that is on them or take it for yourselves, \n" +
                "   lest you be ensnared by it, for it is an abomination to the LORD your God. \n" +
                "26 And you shall not bring an abominable thing into your house and become devoted to destruction like it. \n" +
                "   You shall utterly detest and abhor it, for it is devoted to destruction.\n";


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


    public void chapterEightOFDeuteronomy() {

        table8 = new Table();
        table8.setWidth(tableBG.getWidth());
        table8.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table8.setFillParent(true);
        table8.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Remember the LORD Your God";

        String firstContent = "1 “The whole commandment that I command you today you shall be careful to do, that you may live and multiply, \n" +
                "   and go in and possess the land that the LORD swore to give to your fathers. \n" +
                "2 And you shall remember the whole way that the LORD your God has led you these forty years in the wilderness, \n" +
                "   that he might humble you, testing you to know what was in your heart, whether you would keep his commandments or not. \n" +
                "3 And he humbled you and let you hunger and fed you with manna, which you did not know, nor did your fathers know, \n" +
                "   that he might make you know that man does not live by bread alone, but man lives by every word that comes from the mouth of the LORD. \n" +
                "4 Your clothing did not wear out on you and your foot did not swell these forty years. \n" +
                "5 Know then in your heart that, as a man disciplines his son, the LORD your God disciplines you. \n" +
                "6 So you shall keep the commandments of the LORD your God by walking in his ways and by fearing him. \n" +
                "7 For the LORD your God is bringing you into a good land, a land of brooks of water, of fountains and springs, \n" +
                "   flowing out in the valleys and hills, \n" +
                "8 a land of wheat and barley, of vines and fig trees and pomegranates, a land of olive trees and honey, \n" +
                "9 a land in which you will eat bread without scarcity, in which you will lack nothing, a land whose stones are iron, \n" +
                "   and out of whose hills you can dig copper. \n" +
                "10 And you shall eat and be full, and you shall bless the LORD your God for the good land he has given you.\n" +
                "11 “Take care lest you forget the LORD your God by not keeping his commandments and his rules and his statutes, which I command you today, \n" +
                "12 lest, when you have eaten and are full and have built good houses and live in them, \n" +
                "13 and when your herds and flocks multiply and your silver and gold is multiplied and all that you have is multiplied,\n" +
                "14 then your heart be lifted up, and you forget the LORD your God, who brought you out of the land of Egypt, out of the house of slavery, \n" +
                "15 wholed you through the great and terrifying wilderness, with its fiery serpents and scorpions and thirsty ground where there was no water,\n" +
                "    who brought you water out of the flinty rock, \n" +
                "16 who fed you in the wilderness with manna that your fathers did not know, that he might humble you and test you, to do you good in the end. \n" +
                "17 Beware lest you say in your heart, ‘My power and the might of my hand have gotten me this wealth.’ \n" +
                "18 You shall remember the LORD your God, for it is he who gives you power to get wealth, \n" +
                "   that he may confirm his covenant that he swore to your fathers, as it is this day. \n" +
                "19 And if you forget the LORD your God and go after other gods and serve them and worship them, \n" +
                "   I solemnly warn you today that you shall surely perish. \n" +
                "20 Like the nations that the LORD makes to perish before you, so shall you perish, \n" +
                "   because you would not obey the voice of the LORD your God.\n";
  

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


    public void chapterNineOFDeuteronomy() {

        table9 = new Table();
        table9.setWidth(tableBG.getWidth());
        table9.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table9.setFillParent(true);
        table9.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Not Because of Righteousness";

        String firstContent = "1 “Hear, O Israel: you are to cross over the Jordan today, to go in to dispossess nations greater and mightier than you,\n" +
                "    cities great and fortified up to heaven, \n" +
                "2 a people great and tall, the sons of the Anakim, whom you know, and of whom you have heard it said, ‘Who can stand before the sons of Anak?’ \n" +
                "3 Know therefore today that he who goes over before you as a consuming fire is the LORD your God. \n" +
                "   He will destroy them and subdue them before you.  So you shall drive them out and make them perish quickly, as the LORD has promised you.\n" +
                "4 “Do not say in your heart, after the LORD your God has thrust them out before you, \n" +
                "   ‘It is because of my righteousness that the LORD has brought me in to possess this land,’ \n" +
                "   whereas it is because of the wickedness of these nations that the LORD is driving them out before you. \n" +
                "5 Not because of your righteousness or the uprightness of your heart are you going in to possess their land, \n" +
                "   but because of the wickedness of these nations the LORD your God is driving them out from before you, \n" +
                "   and that he may confirm the word that the LORD swore to your fathers, to Abraham, to Isaac, and to Jacob.\n" +
                "6 “Know, therefore, that the LORD your God is not giving you this good land to possess because of your righteousness, \n" +
                "   for you are a stubborn people. \n" +
                "7 Remember and do not forget how you provoked the LORD your God to wrath in the wilderness. \n" +
                "    From the day you came out of the land of Egypt until you came to this place, you have been rebellious against the LORD. \n" +
                "8 Even at Horeb you provoked the LORD to wrath, and the LORD was so angry with you that he was ready to destroy you. \n" +
                "9 When I went up the mountain to receive the tablets of stone, the tablets of the covenant that the LORD made with you, \n" +
                "   I remained on the mountain forty days and forty nights. I neither ate bread nor drank water. \n" +
                "10 And the LORD gave me the two tablets of stone written with the finger of God, and on them were all the words that the LORD had spoken \n" +
                "   with you on the mountain out of the midst of the fire on the day of the assembly. \n" +
                "11 And at the end of forty days and forty nights the LORD gave me the two tablets of stone, the tablets of the covenant. \n" +
                "12 Then the LORD said to me, ‘Arise, go down quickly from here, for your people whom you have brought from Egypt have acted corruptly. \n" +
                "   They have turned aside quickly out of the way that I commanded them; they have made themselves a metal image.’\n";


        String chapterSecondTitle = "The Golden Calf";

        String secondContent = "13 “Furthermore, the LORD said to me, ‘I have seen this people, and behold, it is a stubborn people. \n" +
                "14 Let me alone, that I may destroy them and blot out their name from under heaven. \n" +
                "   And I will make of you a nation mightier and greater than they.’ \n" +
                "15 So I turned and came down from the mountain, and the mountain was burning with fire. \n" +
                "   And the two tablets of the covenant were in my two hands. \n" +
                "16 And I looked, and behold, you had sinned against the LORD your God. You had made yourselves a golden calf. \n" +
                "   You had turned aside quickly from the way that the LORD had commanded you. \n" +
                "17 So I took hold of the two tablets and threw them out of my two hands and broke them before your eyes.\n" +
                "18 Then I lay prostrate before the LORD as before, forty days and forty nights. I neither ate bread nor drank water, \n" +
                "   because of all the sin that you had committed, in doing what was evil in the sight of the LORD to provoke him to anger. \n" +
                "19 For I was afraid of the anger and hot displeasure that the LORD bore against you, so that he was ready to destroy you. \n" +
                "   But the LORD listened to me that time also. \n" +
                "20 And the LORD was so angry with Aaron that he was ready to destroy him. And I prayed for Aaron also at the same time. \n" +
                "21 Then I took the sinful thing, the calf that you had made, and burned it with fire and crushed it, grinding it very small, \n" +
                "   until it was as fine as dust. And I threw the dust of it into the brook that ran down from the mountain.\n" +
                "22 “At Taberah also, and at Massah and at Kibroth-hattaavah you provoked the LORD to wrath. \n" +
                "23 And when the LORD sent you from Kadesh-barnea, saying, ‘Go up and take possession of the land that I have given you,’\n" +
                "    then you rebelled against the commandment of the LORD your God and did not believe him or obey his voice. \n" +
                "24 You have been rebellious against the LORD from the day that I knew you.\n" +
                "25 “So I lay prostrate before the LORD for these forty days and forty nights, because the LORD had said he would destroy you.\n" +
                "26 And I prayed to the LORD, ‘O Lord GOD, do not destroy your people and your heritage, whom you have redeemed through your greatness,\n" +
                "    whom you have brought out of Egypt with a mighty hand. \n" +
                "27 Remember your servants, Abraham, Isaac, and Jacob. Do not regard the stubbornness of this people, or their wickedness or their sin, \n" +
                "28 lest the land from which you brought us say,  “Because the LORD was not able to bring them into the land that he promised them, \n" +
                "   and because he hated them, he has brought them out to put them to death in the wilderness.” \n" +
                "29 For they are your people and your heritage, whom you brought out by your great power and by your outstretched arm.’\n";

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


    public void chapterTenOFDeuteronomy() {

        table10 = new Table();
        table10.setWidth(tableBG.getWidth());
        table10.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table10.setFillParent(true);
        table10.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "New Tablets of Stone";

        String firstContent = "1 “At that time the LORD said to me, ‘Cut for yourself two tablets of stone like the first, \n" +
                "   and come up to me on the mountain and make an ark of wood. \n" +
                "2 And I will write on the tablets the words that were on the first tablets that you broke, and you shall put them in the ark.’ \n" +
                "3 So I made an ark of acacia wood, and cut two tablets of stone like the first, and went up the mountain with the two tablets in my hand.\n" +
                "4 And he wrote on the tablets, in the same writing as before,\n" +
                "    the Ten Commandments that the LORD had spoken to you on the mountain out of the midst of the fire on the day of the assembly. \n" +
                "   And the LORD gave them to me. \n" +
                "5 Then I turned and came down from the mountain and put the tablets in the ark that I had made. \n" +
                "   And there they are, as the LORD commanded me.”\n" +
                "6 (The people of Israel journeyed from Beeroth Bene-jaakan to Moserah.  \n" +
                "   There Aaron died, and there he was buried. And his son Eleazar ministered as priest in his place. \n" +
                "7 From there they journeyed to Gudgodah, and from Gudgodah to Jotbathah, a land with brooks of water. \n" +
                "8 At that time the LORD set apart the tribe of Levi to carry the ark of the covenant of the LORD to stand \n" +
                "   before the LORD to minister to him and to bless in his name, to this day. \n" +
                "   9 Therefore Levi has no portion or inheritance with his brothers. The LORD is his inheritance, as the LORD your God said to him.)\n" +
                "10 “I myself stayed on the mountain, as at the first time, forty days and forty nights, \n" +
                "   and the LORD listened to me that time also. The LORD was unwilling to destroy you. 11 And the LORD said to me, \n" +
                "   ‘Arise, go on your journey at the head of the people, so that they may go in and possess the land, which I swore to their fathers to give them.’\n";


        String chapterSecondTitle = "Circumcise Your Heart";

        String secondContent = "12 “And now, Israel, what does the LORD your God require of you, but to fear the LORD your God, \n" +
                "   to walk in all his ways,  to love him, to serve the LORD your God with all your heart and with all your soul,\n" +
                "13 and to keep the commandments and statutes of the LORD, which I am commanding you today for your good? \n" +
                "14 Behold, to the LORD your God belong heaven and the heaven of heavens, the earth with all that is in it. \n" +
                "15 Yet the LORD set his heart in love on your fathers and chose their offspring after them, you above all peoples, as you are this day.\n" +
                "16 Circumcise therefore the foreskin of your heart, and be no longer stubborn. \n" +
                "17 For the LORD your God is God of gods and Lord of lords, the great, the mighty, and the awesome God, who is not partial and takes no bribe. \n" +
                "18 He executes justice for the fatherless and the widow, and loves the sojourner, giving him food and clothing. \n" +
                "19 Love the sojourner, therefore, for you were sojourners in the land of Egypt.\n" +
                "20 You shall fear the LORD your God. You shall serve him and hold fast to him, and by his name you shall swear. \n" +
                "21 He is your praise. He is your God, who has done for you these great and terrifying things that your eyes have seen. \n" +
                "22 Your fathers went down to Egypt seventy persons, and now the LORD your God has made you as numerous as the stars of heaven.\n";

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


    public void chapterElevenOFDeuteronomy() {

        table11 = new Table();
        table11.setWidth(tableBG.getWidth());
        table11.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table11.setFillParent(true);
        table11.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Love and Serve the LORD";

        String firstContent = "1 “You shall therefore love the LORD your God and keep his charge, his statutes, \n" +
                "   his rules, and his commandments always.\n" +
                "2 And consider today (since I am not speaking to your children who have not known or seen it), \n" +
                "   consider the discipline of the LORD your God, his greatness, his mighty hand and his outstretched arm, \n" +
                "3 his signs and his deeds that he did in Egypt to Pharaoh the king of Egypt and to all his land, \n" +
                "4 and what he did to the army of Egypt, to their horses and to their chariots, \n" +
                "   how he made the water of the Red Sea flow over them as they pursued after you, and how the LORD has destroyed them to this day, \n" +
                "5 and what he did to you in the wilderness, until you came to this place, \n" +
                "6 and what he did to Dathan and Abiram the sons of Eliab, son of Reuben, how the earth opened its mouth and swallowed them up, \n" +
                "   with their households, their tents, and every living thing that followed them, in the midst of all Israel. \n" +
                "7 For your eyes have seen all the great work of the LORD that he did.\n" +
                "8 “You shall therefore keep the whole commandment that I command you today, that you may be strong, \n" +
                "   and go in and take possession of the land that you are going over to possess, \n" +
                "9 and that you may live long in the land that the LORD swore to your fathers to give to them and to their offspring, \n" +
                "   a land flowing with milk and honey. \n" +
                "10 For the land that you are entering to take possession of it is not like the land of Egypt, from which you have come, w\n" +
                "   here you sowed your seed and irrigated it, like a garden of vegetables. \n" +
                "11 But the land that you are going over to possess is a land of hills and valleys, which drinks water by the rain from heaven, \n" +
                "12 a land that the LORD your God cares for. The eyes of the LORD your God are always upon it, f\n" +
                "   rom the beginning of the year to the end of the year.\n" +
                "13 “And if you will indeed obey my commandments that I command you today, to love the LORD your God, \n" +
                "   and to serve him with all your heart and with all your soul, \n" +
                "14 he will give the rain for your land in its season, the early rain and the later rain, \n" +
                "   that you may gather in your grain and your wine and your oil. \n" +
                "15 And he will give grass in your fields for your livestock, and you shall eat and be full. \n" +
                "16 Take care lest your heart be deceived, and you turn aside and serve other gods and worship them; \n" +
                "17 then the anger of the LORD will be kindled against you, and he will shut up the heavens, so that there will be no rain, \n" +
                "   and the land will yield no fruit, and you will perish quickly off the good land that the LORD is giving you.\n" +
                "18 “You shall therefore lay up these words of mine in your heart and in your soul, and you shall bind them as a sign on your hand, \n" +
                "   and they shall be as frontlets between your eyes. \n" +
                "19 You shall teach them to your children, talking of them when you are sitting in your house, and when you are walking by the way, \n" +
                "   and when you lie down, and when you rise.\n" +
                "20 You shall write them on the doorposts of your house and on your gates, \n" +
                "21 that your days and the days of your children may be multiplied in the land that the LORD swore to your fathers to give them, \n" +
                "   as long as the heavens are above the earth. \n" +
                "22 For if you will be careful to do all this commandment that I command you to do, loving the LORD your God, walking in all his ways, \n" +
                "   and holding fast to him, \n" +
                "23 then the LORD will drive out all these nations before you, and you will dispossess nations greater and mightier than you. \n" +
                "24 Every place on which the sole of your foot treads shall be yours. \n" +
                "   Your territory shall be from the wilderness to the Lebanon and from the River, the river Euphrates, to the western sea. \n" +
                "25 No one shall be able to stand against you. The LORD your God will lay the fear of you and the dread of you \n" +
                "   on all the land that you shall tread, as he promised you.\n" +
                "26 “See, I am setting before you today a blessing and a curse: \n" +
                "27 the blessing, if you obey the commandments of the LORD your God, which I command you today, \n" +
                "28 and the curse, if you do not obey the commandments of the LORD your God, but turn aside from the way that I am commanding you today, \n" +
                "   to go after other gods that you have not known. \n" +
                "29 And when the LORD your God brings you into the land that you are entering to take possession of it, \n" +
                "   you shall set the blessing on Mount Gerizim and the curse on Mount Ebal. \n" +
                "30 Are they not beyond the Jordan, west of the road, toward the going down of the sun, \n" +
                "   in the land of the Canaanites who live in the Arabah, opposite Gilgal, beside the oak of Moreh? \n" +
                "31 For you are to cross over the Jordan to go in to take possession of the land that the LORD your God is giving you. \n" +
                "   And when you possess it and live in it, \n" +
                "32 you shall be careful to do all the statutes and the rules that I am setting before you today.\n";
     

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


    public void chapterTwelveOFDeuteronomy() {

        table12 = new Table();
        table12.setWidth(tableBG.getWidth());
        table12.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table12.setFillParent(true);
        table12.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The LORD's Chosen Place of Worship";

        String firstContent = "1 “These are the statutes and rules that you shall be careful to do in the land that the LORD, the God of your fathers, \n" +
                "   has given you to possess, all the days that you live on the earth. \n" +
                "2 You shall surely destroy all the places where the nations whom you shall dispossess served their gods, \n" +
                "   on the high mountains and on the hills and under every green tree. \n" +
                "3 You shall tear down their altars and dash in pieces their pillars and burn their Asherim with fire. \n" +
                "   You shall chop down the carved images of their gods and destroy their name out of that place.\n" +
                "4 You shall not worship the LORD your God in that way. \n" +
                "5 But you shall seek the place that the LORD your God will choose out of all your tribes to put his name and make his habitation there. \n" +
                "   There you shall go,\n" +
                "6 and there you shall bring your burnt offerings and your sacrifices, your tithes and the contribution that you present, your vow offerings, \n" +
                "   your freewill offerings, and the firstborn of your herd and of your flock.\n" +
                "7 And there you shall eat before the LORD your God, and you shall rejoice, you and your households, in all that you undertake, \n" +
                "   in which the LORD your God has blessed you.\n" +
                "8 “You shall not do according to all that we are doing here today, everyone doing whatever is right in his own eyes, \n" +
                "9 for you have not as yet come to the rest and to the inheritance that the LORD your God is giving you. \n" +
                "10 But when you go over the Jordan and live in the land that the LORD your God is giving you to inherit, \n" +
                "   and when he gives you rest from all your enemies around, so that you live in safety, \n" +
                "11 then to the place that the LORD your God will choose, to make his name dwell there, there you shall bring all that I command you: \n" +
                "   your burnt offerings and your sacrifices, your tithes and the contribution that you present, and all your finest vow offerings that you vow to the LORD. \n" +
                "12 And you shall rejoice before the LORD your God, you and your sons and your daughters, your male servants and your female servants,\n" +
                "    and the Levite that is within your towns, since he has no portion or inheritance with you. \n" +
                "13 Take care that you do not offer your burnt offerings at any place that you see, \n" +
                "14 but at the place that the LORD will choose in one of your tribes, there you shall offer your burnt offerings, \n" +
                "   and there you shall do all that I am commanding you.\n" +
                "15 “However, you may slaughter and eat meat within any of your towns, as much as you desire, \n" +
                "   according to the blessing of the LORD your God that he has given you. The unclean and the clean may eat of it, as of the gazelle and as of the deer. \n" +
                "16 Only you shall not eat the blood; you shall pour it out on the earth like water. \n" +
                "17 You may not eat within your towns the tithe of your grain or of your wine or of your oil, or the firstborn of your herd or of your flock, \n" +
                "   or any of your vow offerings that you vow, or your freewill offerings or the contribution that you present, \n" +
                "18 but you shall eat them before the LORD your God in the place that the LORD your God will choose, \n" +
                "   you and your son and your daughter, your male servant and your female servant, and the Levite who is within your towns. And you shall rejoice before the LORD your God in all that you undertake. \n" +
                "19 Take care that you do not neglect the Levite as long as you live in your land.\n" +
                "20 “When the LORD your God enlarges your territory, as he has promised you, and you say,\n" +
                "   ‘I will eat meat,’ because you crave meat, you may eat meat whenever you desire. \n" +
                "21 If the place that the LORD your God will choose to put his name there is too far from you, \n" +
                "   then you may kill any of your herd or your flock, which the LORD has given you, as I have commanded you, and you may eat within your towns whenever you desire. \n" +
                "22 Just as the gazelle or the deer is eaten, so you may eat of it. The unclean and the clean alike may eat of it. \n" +
                "23 Only be sure that you do not eat the blood, for the blood is the life, and you shall not eat the life with the flesh. \n" +
                "24 You shall not eat it; you shall pour it out on the earth like water. \n" +
                "25 You shall not eat it, that all may go well with you and with your children after you, when you do what is right in the sight of the LORD. \n" +
                "26 But the holy things that are due from you, and your vow offerings, you shall take, and you shall go to the place that the LORD will choose, \n" +
                "27 and offer your burnt offerings, the flesh and the blood, on the altar of the LORD your God. \n" +
                "   The blood of your sacrifices shall be poured out on the altar of the LORD your God, but the flesh you may eat.\n" +
                "28 Be careful to obey all these words that I command you, that it may go well with you and with your children after you forever,\n" +
                "    when you do what is good and right in the sight of the LORD your God.\n";


        String chapterSecondTitle = "Warning Against Idolatry";

        String secondContent = "29 “When the LORD your God cuts off before you the nations whom you go in to dispossess, \n" +
                "   and you dispossess them and dwell in their land,\n" +
                "30 take care that you be not ensnared to follow them, after they have been destroyed before you, \n" +
                "   and that you do not inquire about their gods, saying, ‘How did these nations serve their gods?—that I also may do the same.’ \n" +
                "31 You shall not worship the LORD your God in that way, for every abominable thing that the LORD hates they have done for their gods, \n" +
                "   for they even burn their sons and their daughters in the fire to their gods.\n" +
                "32  “Everything that I command you, you shall be careful to do. You shall not add to it or take from it.\n";


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


    public void chapterThirteenOFDeuteronomy() {

        table13 = new Table();
        table13.setWidth(tableBG.getWidth());
        table13.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table13.setFillParent(true);
        table13.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 “If a prophet or a dreamer of dreams arises among you and gives you a sign or a wonder, \n" +
                "2 and the sign or wonder that he tells you comes to pass, and if he says, ‘Let us go after other gods,’ which you have not known, \n" +
                "   ‘and let us serve them,’ \n" +
                "3 you shall not listen to the words of that prophet or that dreamer of dreams. For the LORD your God is testing you, \n" +
                "   to know whether you love the LORD your God with all your heart and with all your soul. \n" +
                "4 You shall walk after the LORD your God and fear him and keep his commandments and obey his voice, and you shall serve him and hold fast to him. \n" +
                "5 But that prophet or that dreamer of dreams shall be put to death, because he has taught rebellion against the LORD your God, \n" +
                "   who brought you out of the land of Egypt and redeemed you out of the house of slavery, \n" +
                "   to make you leave the way in which the LORD your God commanded you to walk. So you shall purge the evil from your midst.\n" +
                "6 “If your brother, the son of your mother, or your son or your daughter or the wife you embrace \n" +
                "   or your friend who is as your own soul entices you \n" +
                "   secretly, saying, ‘Let us go and serve other gods,’ which neither you nor your fathers have known, \n" +
                "7 some of the gods of the peoples who are around you, whether near you or far off from you, from the one end of the earth to the other, \n" +
                "8 you shall not yield to him or listen to him, nor shall your eye pity him, nor shall you spare him, nor shall you conceal him. \n" +
                "9 But you shall kill him. Your hand shall be first against him to put him to death, and afterward the hand of all the people.\n" +
                "10 You shall stone him to death with stones, because he sought to draw you away from the LORD your God,\n" +
                "    who brought you out of the land of Egypt, out of the house of slavery. \n" +
                "11 And all Israel shall hear and fear and never again do any such wickedness as this among you.\n" +
                "12 “If you hear in one of your cities, which the LORD your God is giving you to dwell there, \n" +
                "13 that certain worthless fellows have gone out among you and have drawn away the inhabitants of their city, saying, \n" +
                "   ‘Let us go and serve other gods,’ which you have not known,\n" +
                "14 then you shall inquire and make search and ask diligently. \n" +
                "   And behold, if it be true and certain that such an abomination has been done among you, \n" +
                "15 you shall surely put the inhabitants of that city to the sword, devoting it to destruction, all who are in it and its cattle, \n" +
                "   with the edge of the sword. \n" +
                "16 You shall gather all its spoil into the midst of its open square and burn the city and all its spoil with fire, \n" +
                "   as a whole burnt offering to the LORD your God. It shall be a heap forever. It shall not be built again. \n" +
                "17 None of the devoted things shall stick to your hand,  that the LORD may turn from the fierceness of his anger \n" +
                "   and show you mercy and have compassion on you and multiply you, as he swore to your fathers, \n" +
                "18 if you obey the voice of the LORD your God, keeping all his commandments that I am commanding you today,\n" +
                "    and doing what is right in the sight of the LORD your God.\n";


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

    public void chapterFourteenOFDeuteronomy() {

        table14 = new Table();
        table14.setWidth(tableBG.getWidth());
        table14.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table14.setFillParent(true);
        table14.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Clean and Unclean Food";

        String firstContent = "1 “You are the sons of the LORD your God.  You shall not cut yourselves \n" +
                "   or make any baldness on your foreheads for the dead. \n" +
                "2 For you are a people holy to the LORD your God, and the LORD has chosen you to be a people for his treasured possession, \n" +
                "   out of all the peoples who are on the face of the earth.\n" +
                "3 “You shall not eat any abomination. \n" +
                "4 These are the animals you may eat: the ox, the sheep, the goat, \n" +
                "5 the deer, the gazelle, the roebuck, the wild goat, the ibex, the antelope, and the mountain sheep. \n" +
                "6 Every animal that parts the hoof and has the hoof cloven in two and chews the cud, among the animals, you may eat. \n" +
                "7 Yet of those that chew the cud or have the hoof cloven you shall not eat these: the camel, the hare, and the rock badger, \n" +
                "   because they chew the cud but do not part the hoof, are unclean for you. \n" +
                "8 And the pig, because it parts the hoof but does not chew the cud, is unclean for you. \n" +
                "   Their flesh you shall not eat, and their carcasses you shall not touch.\n" +
                "9 “Of all that are in the waters you may eat these: whatever has fins and scales you may eat. \n" +
                "10 And whatever does not have fins and scales you shall not eat; it is unclean for you.\n" +
                "11 “You may eat all clean birds. \n" +
                "12 But these are the ones that you shall not eat: the eagle, the bearded vulture, the black vulture, \n" +
                "13 the kite, the falcon of any kind; \n" +
                "14 every raven of any kind; \n" +
                "15 the ostrich, the nighthawk, the sea gull, the hawk of any kind; \n" +
                "16 the little owl and the short-eared owl, the barn owl \n" +
                "17 and the tawny owl, the carrion vulture and the cormorant, \n" +
                "18 the stork, the heron of any kind; the hoopoe and the bat. 19 And all winged insects are unclean for you; they shall not be eaten. \n" +
                "20 All clean winged things you may eat.\n" +
                "21 “You shall not eat anything that has died naturally. You may give it to the sojourner who is within your towns, \n" +
                "   that he may eat it, or you may sell it to a foreigner. For you are a people holy to the LORD your God.\n" +
                " “You shall not boil a young goat in its mother's milk.\n";


        String chapterSecondTitle = "Tithes";

        String secondContent = "22 “You shall tithe all the yield of your seed that comes from the field year by year. \n" +
                "23 And before the LORD your God, in the place that he will choose, to make his name dwell there, you shall eat the tithe of your grain, \n" +
                "   of your wine, and of your oil, and the firstborn of your herd and flock, that you may learn to fear the LORD your God always. \n" +
                "24 And if the way is too long for you, so that you are not able to carry the tithe, when the LORD your God blesses you, \n" +
                "   because the place is too far from you, which the LORD your God chooses, to set his name there, \n" +
                "25 then you shall turn it into money and bind up the money in your hand and go to the place that the LORD your God chooses\n" +
                "26 and spend the money for whatever you desire—oxen or sheep or wine or strong drink, whatever your appetite craves. \n" +
                "   And you shall eat there before the LORD your God and rejoice, you and your household. \n" +
                "27 And you shall not neglect the Levite who is within your towns, for he has no portion or inheritance with you.\n" +
                "28 “At the end of every three years you shall bring out all the tithe of your produce in the same year and lay it up within your towns. \n" +
                "29 And the Levite, because he has no portion or inheritance with you, and the sojourner, the fatherless,\n" +
                "   and the widow, who are within your towns, shall come and eat and be filled, \n" +
                "   that the LORD your God may bless you in all the work of your hands that you do.\n";
  

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


    public void chapterFifteenOFDeuteronomy() {

        table15 = new Table();
        table15.setWidth(tableBG.getWidth());
        table15.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table15.setFillParent(true);
        table15.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Sabbatical Year";

        String firstContent = "1 “At the end of every seven years you shall grant a release. \n" +
                "2 And this is the manner of the release: every creditor shall release what he has lent to his neighbor. \n" +
                "   He shall not exact it of his neighbor, his brother, because the LORD's release has been proclaimed. \n" +
                "3 Of a foreigner you may exact it, but whatever of yours is with your brother your hand shall release. \n" +
                "4 But there will be no poor among you; for the LORD will bless you in the land that the LORD your God \n" +
                "   is giving you for an inheritance to possess—\n" +
                "5 if only you will strictly obey the voice of the LORD your God, being careful to do all this commandment that I command you today. \n" +
                "6 For the LORD your God will bless you, as he promised you, and you shall lend to many nations, but you shall not borrow, \n" +
                "   and you shall rule over many nations, but they shall not rule over you.\n" +
                "7 “If among you, one of your brothers should become poor, in any of your towns within your land that the LORD your God is giving you, \n" +
                "   you shall not harden your heart or shut your hand against your poor brother,\n" +
                "8 but you shall open your hand to him and lend him sufficient for his need, whatever it may be. \n" +
                "9 Take care lest there be an unworthy thought in your heart and you say, ‘The seventh year, the year of release is near,’ \n" +
                "   and your eye look grudgingly on your poor brother, and you give him nothing, and he cry to the LORD against you, and you be guilty of sin.\n" +
                "10 You shall give to him freely, and your heart shall not be grudging when you give to him, \n" +
                "   because for this the LORD your God will bless you in all your work and in all that you undertake. \n" +
                "11 For there will never cease to be poor in the land. Therefore I command you, ‘You shall open wide your hand to your brother, \n" +
                "   to the needy and to the poor, in your land.’\n" +
                "12 “If your brother, a Hebrew man or a Hebrew woman, is sold to you, he shall serve you six years, \n" +
                "   and in the seventh year you shall let him go free from you. \n" +
                "13 And when you let him go free from you, you shall not let him go empty-handed. \n" +
                "14 You shall furnish him liberally out of your flock, out of your threshing floor, and out of your winepress.  \n" +
                "   As the LORD your God has blessed you, you shall give to him. \n" +
                "15 You shall remember that you were a slave in the land of Egypt, and the LORD your God redeemed you; therefore I command you this today. \n" +
                "16 But if he says to you, ‘I will not go out from you,’ because he loves you and your household, since he is well-off with you, \n" +
                "17 then you shall take an awl, and put it through his ear into the door, and he shall be your slave forever. And to your female slave\n" +
                "   you shall do the same. \n" +
                "18 It shall not seem hard to you when you let him go free from you, for at half the cost of a hired worker he has served you six years. \n" +
                "   So the LORD your God will bless you in all that you do.\n" +
                "19 “All the firstborn males that are born of your herd and flock you shall dedicate to the LORD your God. \n" +
                "   You shall do no work with the firstborn of your herd, nor shear the firstborn of your flock. \n" +
                "20 You shall eat it, you and your household, before the LORD your God year by year at the place that the LORD will choose. \n" +
                "21 But if it has any blemish, if it is lame or blind or has any serious blemish whatever, you shall not sacrifice it to the LORD your God. \n" +
                "22 You shall eat it within your towns. The unclean and the clean alike may eat it, as though it were a gazelle or a deer. \n" +
                "23 Only you shall not eat its blood; you shall pour it out on the ground like water.\n";
    

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


    public void chapterSixteenOFDeuteronomy() {

        table16 = new Table();
        table16.setWidth(tableBG.getWidth());
        table16.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table16.setFillParent(true);
        table16.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Passover";

        String firstContent = "1 “Observe the month of Abib and keep the Passover to the LORD your God, \n" +
                "   for in the month of Abib the LORD your God brought you out of Egypt by night. \n" +
                "2 And you shall offer the Passover sacrifice to the LORD your God, from the flock or the herd, at the place that the LORD will choose, \n" +
                "   to make his name dwell there. \n" +
                "3 You shall eat no leavened bread with it.  Seven days you shall eat it with unleavened bread, \n" +
                "   the bread of affliction—for you came out of the land of Egypt in haste—that all the days of your life \n" +
                "   you may remember the day when you came out of the land of Egypt. \n" +
                "4 No leaven shall be seen with you in all your territory for seven days,\n" +
                "    nor shall any of the flesh that you sacrifice on the evening of the first day remain all night until morning.\n" +
                "5 You may not offer the Passover sacrifice within any of your towns that the LORD your God is giving you, \n" +
                "6 but at the place that the LORD your God will choose, to make his name dwell in it, there you shall offer the Passover sacrifice,\n" +
                "    in the evening at sunset, at the time you came out of Egypt. \n" +
                "7 And you shall cook it and eat it at the place that the LORD your God will choose. \n" +
                "   And in the morning you shall turn and go to your tents.\n" +
                "8 For six days you shall eat unleavened bread, and on the seventh day there shall be a solemn assembly to the LORD your God. \n" +
                "   You shall do no work on it.\n";


        String chapterSecondTitle = "The Feast of Weeks";

        String secondContent = "9 “You shall count seven weeks. Begin to count the seven weeks from the time the sickle is first put to the standing grain. \n" +
                "10 Then you shall keep the Feast of Weeks to the LORD your God with the tribute of a freewill offering from your hand, \n" +
                "   which you shall give as the LORD your God blesses you. \n" +
                "11 And you shall rejoice before the LORD your God, you and your son and your daughter, your male servant and your female servant, \n" +
                "   the Levite who is within your towns, the sojourner, the fatherless, and the widow who are among you, \n" +
                "   at the place that the LORD your God will choose, to make his name dwell there. \n" +
                "12 You shall remember that you were a slave in Egypt; and you shall be careful to observe these statutes.\n";


        String chapterThirdTitle = "The Feast of Booths";

        String thirdContent = "13 “You shall keep the Feast of Booths seven days, when you have gathered in the produce \n" +
                "   from your threshing floor and your winepress.\n" +
                "14 You shall rejoice in your feast, you and your son and your daughter, your male servant and your female servant, the Levite, \n" +
                "   the sojourner, the fatherless, and the widow who are within your towns. \n" +
                "15 For seven days you shall keep the feast to the LORD your God at the place that the LORD will choose,\n" +
                "    because the LORD your God will bless you in all your produce and in all the work of your hands, so that you will be altogether joyful.\n" +
                "16 “Three times a year all your males shall appear before the LORD your God at the place that he will choose: \n" +
                "   at the Feast of Unleavened Bread, at the Feast of Weeks, and at the Feast of Booths. They shall not appear before the LORD empty-handed. \n" +
                "17 Every man shall give as he is able, according to the blessing of the LORD your God that he has given you.\n" +
                "Justice\n" +
                "18 “You shall appoint judges and officers in all your towns that the LORD your God is giving you, according to your tribes, \n" +
                "   and they shall judge the people with righteous judgment. \n" +
                "19 You shall not pervert justice.  You shall not show partiality, and you shall not accept a bribe, \n" +
                "   for a bribe blinds the eyes of the wise and subverts the cause of the righteous. \n" +
                "20 Justice, and only justice, you shall follow, that you may live and inherit the land that the LORD your God is giving you.\n";


        String chapterFourthTitle = "Forbidden Forms of Worship";

        String fourthContent = "21 “You shall not plant any tree as an Asherah beside the altar of the LORD your God that you shall make. \n" +
                "22 And you shall not set up a pillar, which the LORD your God hates.\n";


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
        table16.add(lblFirstTitle).pad(10,50,0,0).left();
        table16.row();

        //content of the chapter
        table16.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table16.row();

        //title of the second content
        table16.add(lblSecondTitle).pad(10,50,0,0).left();
        table16.row();

        //content of the second title
        table16.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table16.row();

        //title of the third content
        table16.add(lblThirdTitle).pad(10,50,0,0).left();
        table16.row();

        //content of the third title
        table16.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        //title of the fourth content
        table16.add(lblFourthTitle).pad(10,50,0,0).left();
        table16.row();

        //content of the fourtn title
        table16.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table16);

    }


    public void chapterSeventeenOFDeuteronomy() {

        table17 = new Table();
        table17.setWidth(tableBG.getWidth());
        table17.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table17.setFillParent(true);
        table17.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 “You shall not sacrifice to the LORD your God an ox or a sheep in which is a blemish, any defect whatever, \n" +
                "   for that is an abomination to the LORD your God.\n" +
                "2 “If there is found among you, within any of your towns that the LORD your God is giving you, \n" +
                "   a man or woman who does what is evil in the sight of the LORD your God, in transgressing his covenant, \n" +
                "3 and has gone and served other gods and worshiped them, or the sun or the moon or any of the host of heaven, which I have forbidden, \n" +
                "4 and it is told you and you hear of it, then you shall inquire diligently, \n" +
                "   and if it is true and certain that such an abomination has been done in Israel,\n" +
                "5 then you shall bring out to your gates that man or woman who has done this evil thing, \n" +
                "   and you shall stone that man or woman to death with stones. \n" +
                "6 On the evidence of two witnesses or of three witnesses the one who is to die shall be put to death; \n" +
                "   a person shall not be put to death on the evidence of one witness. \n" +
                "7 The hand of the witnesses shall be first against him to put him to death, and afterward the hand of all the people. \n" +
                "   So you shall purge the evil from your midst.\n";


        String chapterSecondTitle = "Legal Decisions by Priests and Judges";

        String secondContent = "8 “If any case arises requiring decision between one kind of homicide and another, \n" +
                "   one kind of legal right and another, or one kind of assault and another, any case within your towns that is too difficult for you, \n" +
                "   then you shall arise and go up to the place that the LORD your God will choose. \n" +
                "9 And you shall come to the Levitical priests and to the judge who is in office in those days, \n" +
                "   and you shall consult them, and they shall declare to you the decision. \n" +
                "10 Then you shall do according to what they declare to you from that place that the LORD will choose. A\n" +
                "   nd you shall be careful to do according to all that they direct you. \n" +
                "11 According to the instructions that they give you, and according to the decision which they pronounce to you, you shall do. \n" +
                "   You shall not turn aside from the verdict that they declare to you, either to the right hand or to the left.\n" +
                "12 The man who acts presumptuously by not obeying the priest who stands to minister there before the LORD your God, \n" +
                "   or the judge, that man shall die. So you shall purge the evil from Israel. \n" +
                "13 And all the people shall hear and fear and not act presumptuously again.\n";


        String chapterThirdTitle = "Laws Concerning Israel's Kings";

        String thirdContent = "14 “When you come to the land that the LORD your God is giving you, and you possess it and dwell in it and then say, ‘\n" +
                "   I will set a king over me, like all the nations that are around me,’ \n" +
                "15 you may indeed set a king over you whom the LORD your God will choose. One from among your brothers you shall set as king over you. \n" +
                "   You may not put a foreigner over you, who is not your brother. \n" +
                "16 Only he must not acquire many horses for himself or cause the people to return to Egypt in order to acquire many horses, \n" +
                "   since the LORD has said to you, ‘You shall never return that way again.’ \n" +
                "17 And he shall not acquire many wives for himself, lest his heart turn away, nor shall he acquire for himself excessive silver and gold.\n" +
                "18 “And when he sits on the throne of his kingdom, he shall write for himself in a book a copy of this law, approved by the Levitical priests.\n" +
                "19 And it shall be with him, and he shall read in it all the days of his life, that he may learn to fear the LORD his God \n" +
                "   by keeping all the words of this law and these statutes, and doing them, \n" +
                "20 that his heart may not be lifted up above his brothers, and that he may not turn aside from the commandment, \n" +
                "   either to the right hand or to the left, so that he may continue long in his kingdom, he and his children, in Israel.\n";
  

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
        table17.row();

        //title of the third content
        table17.add(lblThirdTitle).pad(10,50,0,0).left();
        table17.row();

        //content of the third title
        table17.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table17);


    }


    public void chapterEighteenOFDeuteronomy() {

        table18 = new Table();
        table18.setWidth(tableBG.getWidth());
        table18.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table18.setFillParent(true);
        table18.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Provision for Priests and Levites";

        String firstContent = "1 “The Levitical priests, all the tribe of Levi, shall have no portion or inheritance with Israel. \n" +
                "   They shall eat the LORD's food offerings as their inheritance. \n" +
                "2 They shall have no inheritance among their brothers; the LORD is their inheritance, as he promised them. \n" +
                "3 And this shall be the priests' due from the people, from those offering a sacrifice, whether an ox or a sheep: \n" +
                "   they shall give to the priest the shoulder and the two cheeks and the stomach. \n" +
                "4 The firstfruits of your grain, of your wine and of your oil, and the first fleece of your sheep, you shall give him. \n" +
                "5 For the LORD your God has chosen him out of all your tribes to stand and minister in the name of the LORD, him and his sons for all time.\n" +
                "6 “And if a Levite comes from any of your towns out of all Israel, \n" +
                "   where he lives—and he may come when he desires—to the place that the LORD will choose, \n" +
                "7 and ministers in the name of the LORD his God, like all his fellow Levites who stand to minister there before the LORD,\n" +
                "8 then he may have equal portions to eat, besides what he receives from the sale of his patrimony. \n";


        String chapterSecondTitle = "Abominable Practices";

        String secondContent = "9 “When you come into the land that the LORD your God is giving you, you shall not learn to follow \n" +
                "   the abominable practices of those nations. \n" +
                "10 There shall not be found among you anyone who burns his son or his daughter as an offering, \n" +
                "   anyone who practices divination or tells fortunes or interprets omens, or aa sorcerer \n" +
                "11 or a charmer or a medium or a necromancer or one who inquires of the dead, \n" +
                "12 for whoever does these things is an abomination to the LORD. And because of these abominations the LORD your God is driving them out before you. \n" +
                "13 You shall be blameless before the LORD your God, \n" +
                "14 for these nations, which you are about to dispossess, listen to fortune-tellers and to diviners. \n" +
                "   But as for you, the LORD your God has not allowed you to do this.\n";


        String chapterThirdTitle = "A New Prophet like Moses";

        String thirdContent = "15 “The LORD your God will raise up for you a prophet like me from among you, from your brothers—it is to him you shall listen—\n" +
                "16 just as you desired of the LORD your God at Horeb on the day of the assembly, when you said, \n" +
                "   ‘Let me not hear again the voice of the LORD my God or see this great fire any more, lest I die.’ \n" +
                "17 And the LORD said to me, ‘They are right in what they have spoken. \n" +
                "18 I will raise up for them a prophet like you from among their brothers. And I will put my words in his mouth, and he shall speak to them all that I command him. \n" +
                "19 And whoever will not listen to my words that he shall speak in my name, I myself will require it of him. \n" +
                "20 But the prophet who presumes to speak a word in my name that I have not commanded him to speak, \n" +
                "   or who speaks in the name of other gods, that same prophet shall die.’ \n" +
                "21 And if you say in your heart, ‘How may we know the word that the LORD has not spoken?’—\n" +
                "22 when a prophet speaks in the name of the LORD, if the word does not come to pass or come true, \n" +
                "   that is a word that the LORD has not spoken; the prophet has spoken it presumptuously. You need not be afraid of him.\n";

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
        table18.row();

        //title of the third content
        table18.add(lblThirdTitle).pad(10,50,0,0).left();
        table18.row();

        //content of the third title
        table18.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table18);

    }


    public void chapterNineteenOFDeuteronomy() {

        table19 = new Table();
        table19.setWidth(tableBG.getWidth());
        table19.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table19.setFillParent(true);
        table19.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws Concerning Cities of Refuge";

        String firstContent = "1 “When the LORD your God cuts off the nations whose land the LORD your God is giving you, \n" +
                "   and you dispossess them and dwell in their cities and in their houses, \n" +
                "2 you shall set apart three cities for yourselves in the land that the LORD your God is giving you to possess.\n" +
                "3 You shall measure the distances and divide into three parts the area of the land that the LORD your God gives you as a possession, \n" +
                "   so that any manslayer can flee to them.\n" +
                "4 “This is the provision for the manslayer, who by fleeing there may save his life. \n" +
                "   If anyone kills his neighbor unintentionally without having hated him in the past—\n" +
                "5 as when someone goes into the forest with his neighbor to cut wood, and his hand swings the axe to cut down a tree, \n" +
                "   and the head slips from the handle and strikes his neighbor so that he dies—he may flee to one of these cities and live, \n" +
                "6 lest the avenger of blood in hot anger pursue the manslayer and overtake him, because the way is long, and strike him fatally, \n" +
                "   though the man did not deserve to die, since he had not hated his neighbor in the past.\n" +
                "7 Therefore I command you, You shall set apart three cities. \n" +
                "8 And if the LORD your God enlarges your territory, as he has sworn to your fathers, \n" +
                "   and gives you all the land that he promised to give to your fathers—\n" +
                "9 provided you are careful to keep all this commandment, which I command you today, \n" +
                "   by loving the LORD your God and by walking ever in his ways—then you shall add three other cities to these three, \n" +
                "10 lest innocent blood be shed in your land that the LORD your God is giving you for an inheritance, \n" +
                "   and so the guilt of bloodshed be upon you.\n" +
                "11 “But if anyone hates his neighbor and lies in wait for him and attacks him and strikes him fatally so that he dies, \n" +
                "   and he flees into one of these cities, \n" +
                "12 then the elders of his city shall send and take him from there, and hand him over to the avenger of blood, \n" +
                "   so that he may die.\n" +
                "13 Your eye shall not pity him, but you shall purge the guilt of innocent blood from Israel, \n" +
                "   so that it may be well with you.\n";


        String chapterSecondTitle = "Property Boundaries";

        String secondContent = "14 “You shall not move your neighbor's landmark, which the men of old have set, \n" +
                "   in the inheritance that you will hold in the land that the LORD your God is giving you to possess.";


        String chapterThirdTitle = "Laws Concerning Witnesses";

        String thirdContent = "15 “A single witness shall not suffice against a person for any crime or for any wrong \n" +
                "   in connection with any offense that he has committed. Only on the evidence of two witnesses or of three witnesses shall a charge be established. \n" +
                "16 If a malicious witness arises to accuse a person of wrongdoing, \n" +
                "17 then both parties to the dispute shall appear before the LORD, before the priests and the judges who are in office in those days. \n" +
                "18 The judges shall inquire diligently, and if the witness is a false witness and has accused his brother falsely, \n" +
                "19 then you shall do to him as he had meant to do to his brother. So you shall purge the evil from your midst. \n" +
                "20 And the rest shall hear and fear, and shall never again commit any such evil among you. \n" +
                "21 Your eye shall not pity. It shall be life for life, eye for eye, tooth for tooth, hand for hand, foot for foot.\n";  

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


    public void chapterTwentyOFDeuteronomy() {

        table20 = new Table();
        table20.setWidth(tableBG.getWidth());
        table20.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table20.setFillParent(true);
        table20.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws Concerning Warfare";

        String firstContent = "army larger than your own, you shall not be afraid of them, for the LORD your God is with you,\n" +
                "    who brought you up out of the land of Egypt. \n" +
                "2 And when you draw near to the battle, the priest shall come forward and speak to the people \n" +
                "3 and shall say to them, ‘Hear, O Israel, today you are drawing near for battle against your enemies: \n" +
                "   let not your heart faint. Do not fear or panic or be in dread of them, \n" +
                "4 for the LORD your God is he who goes with you to fight for you against your enemies, to give you the victory.’ \n" +
                "5 Then the officers shall speak to the people, saying, ‘Is there any man who has built a new house and has not dedicated it? \n" +
                "   Let him go back to his house, lest he die in the battle and another man dedicate it. \n" +
                "6 And is there any man who has planted a vineyard and has not enjoyed its fruit? Let him go back to his house, \n" +
                "   lest he die in the battle and another man enjoy its fruit. \n" +
                "7 And is there any man who has betrothed a wife and has not taken her? Let him go back to his house, \n" +
                "   lest he die in the battle and another man take her.’\n" +
                "8 And the officers shall speak further to the people, and say, ‘Is there any man who is fearful and fainthearted?\n" +
                "    Let him go back to his house, lest he make the heart of his fellows melt like his own.’ \n" +
                "9 And when the officers have finished speaking to the people, then commanders shall be appointed at the head of the people.\n" +
                "10 “When you draw near to a city to fight against it, offer terms of peace to it. 11 And if it responds to you peaceably and it opens to you, \n" +
                "   then all the people who are found in it shall do forced labor for you and shall serve you. \n" +
                "12 But if it makes no peace with you, but makes war against you, then you shall besiege it. \n" +
                "13 And when the LORD your God gives it into your hand, you shall put all its males to the sword, \n" +
                "14 but the women and the little ones, the livestock, and everything else in the city, all its spoil, you shall take as plunder for yourselves. \n" +
                "   And you shall enjoy the spoil of your enemies, which the LORD your God has given you.\n" +
                "15 Thus you shall do to all the cities that are very far from you, which are not cities of the nations here. \n" +
                "16 But in the cities of these peoples that the LORD your God is giving you for an inheritance, you shall save alive nothing that breathes, \n" +
                "17 but you shall devote them to complete destruction, the Hittites and the Amorites, the Canaanites and the Perizzites, \n" +
                "   the Hivites and the Jebusites, as the LORD your God has commanded, \n" +
                "18 that they may not teach you to do according to all their abominable practices that they have done for their gods, \n" +
                "   and so you sin against the LORD your God.\n" +
                "19 “When you besiege a city for a long time, making war against it in order to take it, \n" +
                "   you shall not destroy its trees by wielding an axe against them. You may eat from them, but you shall not cut them down. \n" +
                "   Are the trees in the field human, that they should be besieged by you?\n" +
                "20 Only the trees that you know are not trees for food you may destroy and cut down, \n" +
                "   that you may build siegeworks against the city that makes war with you, until it falls.\n";

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


    public void chapterTwentyOneOFDeuteronomy() {

        table21 = new Table();
        table21.setWidth(tableBG.getWidth());
        table21.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table21.setFillParent(true);
        table21.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Atonement for Unsolved Murders";

        String firstContent = "1 “If in the land that the LORD your God is giving you to possess someone is found slain, lying in the open country, \n" +
                "   and it is not known who killed him, \n" +
                "2 then your elders and your judges shall come out, and they shall measure the distance to the surrounding cities. \n" +
                "3 And the elders of the city that is nearest to the slain man shall take a heifer that has never been worked and that has not pulled in a yoke. \n" +
                "4 And the elders of that city shall bring the heifer down to a valley with running water, which is neither plowed nor sown, \n" +
                "   and shall break the heifer's neck there in the valley. \n" +
                "5 Then the priests, the sons of Levi, shall come forward, for the LORD your God has chosen them to minister to him \n" +
                "   and to bless in the name of the LORD, and by their word every dispute and every assault shall be settled. \n" +
                "6 And all the elders of that city nearest to the slain man shall wash their hands over the heifer whose neck was broken in the valley, \n" +
                "7 and they shall testify, ‘Our hands did not shed this blood, nor did our eyes see it shed. \n" +
                "8 Accept atonement, O LORD, for your people Israel, whom you have redeemed, \n" +
                "   and do not set the guilt of innocent blood in the midst of your people Israel, so that their blood guilt be atoned for.’ \n" +
                "9 So you shall purge the guilt of innocent blood from your midst, when you do what is right in the sight of the LORD.\n";


        String chapterSecondTitle = "Marrying Female Captives";

        String secondContent = "10 “When you go out to war against your enemies, and the LORD your God gives them into your hand and you take them captive, \n" +
                "11 and you see among the captives a beautiful woman, and you desire to take her to be your wife, \n" +
                "12 and you bring her home to your house, she shall shave her head and pare her nails. \n" +
                "13 And she shall take off the clothes in which she was captured and shall remain in your house and lament her father and her mother a full month. \n" +
                "   After that you may go in to her and be her husband, and she shall be your wife. \n" +
                "14 But if you no longer delight in her, you shall let her go where she wants. But you shall not sell her for money, \n" +
                "   nor shall you treat her as a slave, since you have humiliated her.\n";


        String chapterThirdTitle = "Inheritance Rights of the Firstborn";

        String thirdContent = "15 “If a man has two wives, the one loved and the other unloved, and both the loved and the unloved have borne him children, \n" +
                "   and if the firstborn son belongs to the unloved, \n" +
                "16 then on the day when he assigns his possessions as an inheritance to his sons, \n" +
                "   he may not treat the son of the loved as the firstborn in preference to the son of the unloved, who is the firstborn, \n" +
                "17 but he shall acknowledge the firstborn, the son of the unloved, by giving him a double portion of all that he has, \n" +
                "   for he is the firstfruits of his strength. The right of the firstborn is his.\n";


        String chapterFourthTitle = "A Rebellious Son";

        String fourthContent = "18 “If a man has a stubborn and rebellious son who will not obey the voice of his father or the voice of his mother, \n" +
                "   and, though they discipline him, will not listen to them, \n" +
                "19 then his father and his mother shall take hold of him and bring him out to the elders of his city at the gate of the place where he lives, \n" +
                "20 and they shall say to the elders of his city, ‘This our son is stubborn and rebellious; he will not obey our voice; \n" +
                "   he is a glutton and a drunkard.’ \n" +
                "21 Then all the men of the city shall stone him to death with stones. So you shall purge the evil from your midst, \n" +
                "   and all Israel shall hear, and fear.\n";


        String chapterFifthTitle = "A Man Hanged on a Tree Is Cursed";

        String fifthContent = "22 “And if a man has committed a crime punishable by death and he is put to death, and you hang him on a tree, \n" +
                "23 his body shall not remain all night on the tree, but you shall bury him the same day, \n" +
                "   for a hanged man is cursed by God. You shall not defile your land that the LORD your God is giving you for an inheritance.\n";
   

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

        //title of the fourth content
        table21.add(lblFourthTitle).pad(10,50,0,0).left();
        table21.row();

        //content of the fourth title
        table21.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        //title of the fifth content
        table21.add(lblFifthTitle).pad(10,50,0,0).left();
        table21.row();

        //content of the fifth title
        table21.add(txtFifthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table21);

    }


    public void chapterTwentyTwoOFDeuteronomy() {

        table22 = new Table();
        table22.setWidth(tableBG.getWidth());
        table22.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table22.setFillParent(true);
        table22.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Various Laws";

        String firstContent = "1 “You shall not see your brother's ox or his sheep going astray and ignore them. \n" +
                "   You shall take them back to your brother.\n" +
                "2 And if he does not live near you and you do not know who he is, you shall bring it home to your house, \n" +
                "   and it shall stay with you until your brother seeks it. Then you shall restore it to him. \n" +
                "3 And you shall do the same with his donkey or with his garment, or with any lost thing of your brother's, \n" +
                "   which he loses and you find; you may not ignore it. \n" +
                "4 You shall not see your brother's donkey or his ox fallen down by the way and ignore them. You shall help him to lift them up again.\n" +
                "5 “A woman shall not wear a man's garment, nor shall a man put on a woman's cloak, \n" +
                "   for whoever does these things is an abomination to the LORD your God.\n" +
                "6 “If you come across a bird's nest in any tree or on the ground, with young ones or eggs and the mother sitting on the young or on the eggs, \n" +
                "   you shall not take the mother with the young. \n" +
                "7 You shall let the mother go, but the young you may take for yourself, that it may go well with you, and that you may live long.\n" +
                "8 “When you build a new house, you shall make a parapet for your roof, that you may not bring the guilt of blood upon your house, \n" +
                "   if anyone should fall from it.\n" +
                "9 “You shall not sow your vineyard with two kinds of seed, lest the whole yield be forfeited, \n" +
                "   the crop that you have sown and the yield of the vineyard. \n" +
                "10 You shall not plow with an ox and a donkey together.\n" +
                "11 You shall not wear cloth of wool and linen mixed together.\n" +
                "12 “You shall make yourself tassels on the four corners of the garment with which you cover yourself.\n";


        String chapterSecondTitle = "Laws Concerning Sexual Immorality";

        String secondContent = "13 “If any man takes a wife and goes in to her and then hates her\n" +
                "14 and accuses her of misconduct and brings a bad name upon her, saying, ‘I took this woman, and when I came near her,\n" +
                "    I did not find in her evidence of virginity,’ \n" +
                "15 then the father of the young woman and her mother shall take and bring out the evidence \n" +
                "   of her virginity to the elders of the city in the gate. \n" +
                "16 And the father of the young woman shall say to the elders, ‘I gave my daughter to this man to marry, and he hates her; \n" +
                "17 and behold, he has accused her of misconduct, saying, “I did not find in your daughter evidence of virginity.” \n" +
                "   And yet this is the evidence of my daughter's virginity.’ And they shall spread the cloak before the elders of the city. \n" +
                "18 Then the elders of that city shall take the man and whip him, \n" +
                "19 and they shall fine him a hundred shekels of silver and give them to the father of the young woman, \n" +
                "   because he has brought a bad name upon a virgin of Israel. And she shall be his wife. He may not divorce her all his days. \n" +
                "20 But if the thing is true, that evidence of virginity was not found in the young woman, \n" +
                "21 then they shall bring out the young woman to the door of her father's house, and the men of her city shall stone her to death with stones, \n" +
                "   because she has done an outrageous thing in Israel by whoring in her father's house. So you shall purge the evil from your midst.\n" +
                "22 “If a man is found lying with the wife of another man, both of them shall die, the man who lay with the woman, and the woman. \n" +
                "   So you shall purge the evil from Israel.\n" +
                "23 “If there is a betrothed virgin, and a man meets her in the city and lies with her, \n" +
                "24 then you shall bring them both out to the gate of that city, and you shall stone them to death with stones, \n" +
                "   the young woman because she did not cry for help though she was in the city, and the man because he violated his neighbor's wife. So you shall purge the evil from your midst.\n" +
                "25 “But if in the open country a man meets a young woman who is betrothed, and the man seizes her and lies with her, \n" +
                "\n" + "then only the man who lay with her shall die. \n" +
                "26 But you shall do nothing to the young woman; she has committed no offense punishable by death. \n" +
                "   For this case is like that of a man attacking and murdering his neighbor,\n" +
                "27 because he met her in the open country, and though the betrothed young woman cried for help there was no one to rescue her.\n" +
                "28 “If a man meets a virgin who is not betrothed, and seizes her and lies with her, and they are found, \n" +
                "29 then the man who lay with her shall give to the father of the young woman fifty shekels of silver, and she shall be his wife,\n" +
                "    because he has violated her. He may not divorce her all his days.\n" +
                "30 “A man shall not take his father's wife, so that he does not uncover his father's nakedness.\n";


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

    public void chapterTwentyThreeOFDeuteronomy() {

        table23 = new Table();
        table23.setWidth(tableBG.getWidth());
        table23.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table23.setFillParent(true);
        table23.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Those Excluded from the Assembly";

        String firstContent = "assembly of the LORD.\n" +
                "2  “No one born of a forbidden union may enter the assembly of the LORD. Even to the tenth generation, \n" +
                "   none of his descendants may enter the assembly of the LORD.\n" +
                "3 “No Ammonite or Moabite may enter the assembly of the LORD. Even to the tenth generation,\n" +
                "    none of them may enter the assembly of the LORD forever, \n" +
                "4 because they did not meet you with bread and with water on the way, when you came out of Egypt, \n" +
                "   and because they hired against you Balaam the son of Beor from Pethor of Mesopotamia, to curse you. \n" +
                "5 But the LORD your God would not listen to Balaam; instead the LORD your God turned the curse into a blessing for you, \n" +
                "   because the LORD your God loved you. \n" +
                "6 You shall not seek their peace or their prosperity all your days forever.\n" +
                "7 “You shall not abhor an Edomite, for he is your brother. You shall not abhor an Egyptian, because you were a sojourner in his land.\n" +
                "8 Children born to them in the third generation may enter the assembly of the LORD.\n";


        String chapterSecondTitle = "Uncleanness in the Camp";

        String secondContent = "9 “When you are encamped against your enemies, then you shall keep yourself from every evil thing.\n" +
                "10 “If any man among you becomes unclean because of a nocturnal emission, then he shall go outside the camp.\n" +
                "    He shall not come inside the camp, \n" +
                "11 but when evening comes, he shall bathe himself in water, and as the sun sets, he may come inside the camp.\n" +
                "12 “You shall have a place outside the camp, and you shall go out to it.\n" +
                "13 And you shall have a trowel with your tools, and when you sit down outside, \n" +
                "   you shall dig a hole with it and turn back and cover up your excrement. \n" +
                "14 Because the LORD your God walks in the midst of your camp, to deliver you and to give up your enemies before you, \n" +
                "   therefore your camp must be holy, so that he may not see anything indecent among you and turn away from you.\n";

        String chapterThirdTitle = "Miscellaneous Laws";

        String thirdContent = "15 “You shall not give up to his master a slave who has escaped from his master to you. \n" +
                "16 He shall dwell with you, in your midst, in the place that he shall choose within one of your towns, wherever it suits him.\n" +
                "    You shall not wrong him.\n" +
                "17 “None of the daughters of Israel shall be a cult prostitute, and none of the sons of Israel shall be a cult prostitute. \n" +
                "18 You shall not bring the fee of a prostitute or the wages of a dog into the house of the LORD your God in payment for any vow, \n" +
                "   for both of these are an abomination to the LORD your God.\n" +
                "19 “You shall not charge interest on loans to your brother, interest on money, interest on food, \n" +
                "   interest on anything that is lent for interest.\n" +
                "20 You may charge a foreigner interest, but you may not charge your brother interest,\n" +
                "    that the LORD your God may bless you in all that you undertake in the land that you are entering to take possession of it.\n" +
                "21 “If you make a vow to the LORD your God, you shall not delay fulfilling it, for the LORD your God will surely require it of you, \n" +
                "   and you will be guilty of sin. \n" +
                "22 But if you refrain from vowing, you will not be guilty of sin. \n" +
                "23 You shall be careful to do what has passed your lips, for you have voluntarily vowed to the LORD your God \n" +
                "   what you have promised with your mouth.\n" +
                "24 “If you go into your neighbor's vineyard, you may eat your fill of grapes, as many as you wish, but you shall not put any in your bag. \n" +
                "25 If you go into your neighbor's standing grain, you may pluck the ears with your hand, \n" +
                "   but you shall not put a sickle to your neighbor's standing grain.\n";


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


    public void chapterTwentyFourOFDeuteronomy() {

        table24 = new Table();
        table24.setWidth(tableBG.getWidth());
        table24.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table24.setFillParent(true);
        table24.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws Concerning Divorce";

        String firstContent = "1 “When a man takes a wife and marries her, if then she finds no favor in his eyes because he has found some indecency in her, \n" +
                "   and he writes her a certificate of divorce and puts it in her hand and sends her out of his house, and she departs out of his house, \n" +
                "2 and if she goes and becomes another man's wife, \n" +
                "3 and the latter man hates her and writes her a certificate of divorce and puts it in her hand and sends her out of his house, \n" +
                "   or if the latter man dies, who took her to be his wife, \n" +
                "4 then her former husband, who sent her away, may not take her again to be his wife, after she has been defiled, \n" +
                "   for that is an abomination before the LORD. And you shall not bring sin upon the land that the LORD your God is giving you for an inheritance.\n";


        String chapterSecondTitle = "Miscellaneous Laws";

        String secondContent = "5 “When a man is newly married, he shall not go out with the army or be liable for any other public duty. \n" +
                "   He shall be free at home one year to be happy with his wife1 whom he has taken.\n" +
                "6 “No one shall take a mill or an upper millstone in pledge, for that would be taking a life in pledge.\n" +
                "7 “If a man is found stealing one of his brothers of the people of Israel, and if he treats him as a slave or sells him, \n" +
                "   then that thief shall die. So you shall purge the evil from your midst.\n" +
                "8 “Take care, in a case of leprous disease, to be very careful to do according to all that the Levitical priests shall direct you. \n" +
                "   As I commanded them, so you shall be careful to do. \n" +
                "9 Remember what the LORD your God did to Miriam on the way as you came out of Egypt.\n" +
                "10 “When you make your neighbor a loan of any sort, you shall not go into his house to collect his pledge. \n" +
                "11 You shall stand outside, and the man to whom you make the loan shall bring the pledge out to you.\n" +
                "12 And if he is a poor man, you shall not sleep in his pledge. \n" +
                "13 You shall restore to him the pledge as the sun sets, that he may sleep in his cloak and bless you. \n" +
                "   And it shall be righteousness for you before the LORD your God.\n" +
                "14 “You shall not oppress a hired worker who is poor and needy, whether he is one of your brothers or one of the sojourners \n" +
                "   who are in your land within your towns. \n" +
                "15 You shall give him his wages on the same day, before the sun sets (for he is poor and counts on it), \n" +
                "   lest he cry against you to the LORD, and you be guilty of sin.\n" +
                "16 “Fathers shall not be put to death because of their children, nor shall children be put to death because of their fathers. \n" +
                "   Each one shall be put to death for his own sin.\n" +
                "17 “You shall not pervert the justice due to the sojourner or to the fatherless, or take a widow's garment in pledge, \n" +
                "18 but you shall remember that you were a slave in Egypt and the LORD your God redeemed you from there; therefore I command you to do this.\n" +
                "19 “When you reap your harvest in your field and forget a sheaf in the field, you shall not go back to get it. \n" +
                "   It shall be for the sojourner, the fatherless, and the widow, that the LORD your God may bless you in all the work of your hands. \n" +
                "20 When you beat your olive trees, you shall not go over them again. It shall be for the sojourner, the fatherless, and the widow. \n" +
                "21 When you gather the grapes of your vineyard, you shall not strip it afterward. \n" +
                "   It shall be for the sojourner, the fatherless, and the widow. \n" +
                "22 You shall remember that you were a slave in the land of Egypt; therefore I command you to do this.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

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

        stage.addActor(table24);

    }


    public void chapterTwentyFiveOFDeuteronomy() {

        table25 = new Table();
        table25.setWidth(tableBG.getWidth());
        table25.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table25.setFillParent(true);
        table25.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 “If there is a dispute between men and they come into court and the judges decide between them,\n" +
                "    acquitting the innocent and condemning the guilty, \n" +
                "2 then if the guilty man deserves to be beaten, the judge shall cause him to lie down \n" +
                "   and be beaten in his presence with a number of stripes in proportion to his offense. \n" +
                "3 Forty stripes may be given him, but not more, lest, if one should go on to beat him with more stripes than these, \n" +
                "   your brother be degraded in your sight.\n" +
                "4 “You shall not muzzle an ox when it is treading out the grain.\n";


        String chapterSecondTitle = "Laws Concerning Levirate Marriage";

        String secondContent = "5 “If brothers dwell together, and one of them dies and has no son, \n" +
                "   the wife of the dead man shall not be married outside the family to a stranger.\n" +
                "    Her husband's brother shall go in to her and take her as his wife and perform the duty of a husband's brother to her. \n" +
                "6 And the first son whom she bears shall succeed to the name of his dead brother, that his name may not be blotted out of Israel. \n" +
                "7 And if the man does not wish to take his brother's wife, then his brother's wife shall go up to the gate to the elders and say, \n" +
                "   ‘My husband's brother refuses to perpetuate his brother's name in Israel; he will not perform the duty of a husband's brother to me.’ \n" +
                "8 Then the elders of his city shall call him and speak to him, and if he persists, saying, ‘I do not wish to take her,’ \n" +
                "9 then his brother's wife shall go up to him in the presence of the elders and pull his sandal off his foot and spit in his face. \n" +
                "   And she shall answer and say, ‘So shall it be done to the man who does not build up his brother's house.’ \n" +
                "10 And the name of his house shall be called in Israel, ‘The house of him who had his sandal pulled off.’\n";


        String chapterThirdTitle = "Miscellaneous Laws";

        String thirdContent = "11 “When men fight with one another and the wife of the one draws near to rescue her husband \n" +
                "   from the hand of him who is beating him and puts out her hand and seizes him by the private parts, \n" +
                "12 then you shall cut off her hand. Your eye shall have no pity.\n" +
                "13 “You shall not have in your bag two kinds of weights, a large and a small. \n" +
                "14 You shall not have in your house two kinds of measures, a large and a small. \n" +
                "15 A full and fair weight you shall have, a full and fair measure you shall have, \n" +
                "   that your days may be long in the land that the LORD your God is giving you. \n" +
                "16 For all who do such things, all who act dishonestly, are an abomination to the LORD your God.\n" +
                "17 “Remember what Amalek did to you on the way as you came out of Egypt, \n" +
                "18 how he attacked you on the way when you were faint and weary, and cut off your tail, \n" +
                "   those who were lagging behind you, and he did not fear God. \n" +
                "19 Therefore when the LORD your God has given you rest from all your enemies around you, \n" +
                "   in the land that the LORD your God is giving you for an inheritance to possess, \n" +
                "   you shall blot out the memory of Amalek from under heaven; you shall not forget.\n";


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

        stage.addActor(table25);

    }


    public void chapterTwentySixOFDeuteronomy() {

        table26 = new Table();
        table26.setWidth(tableBG.getWidth());
        table26.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table26.setFillParent(true);
        table26.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Offerings of Firstfruits and Tithes";

        String firstContent = "1 “When you come into the land that the LORD your God is giving you for an inheritance \n" +
                "   and have taken possession of it and live in it, \n" +
                "2 you shall take some of the first of all the fruit of the ground, which you harvest from your land that the LORD your God is giving you, \n" +
                "   and you shall put it in a basket, and you shall go to the place that the LORD your God will choose, to make his name to dwell there. \n" +
                "3 And you shall go to the priest who is in office at that time and say to him, \n" +
                "   ‘I declare today to the LORD your God that I have come into the land that the LORD swore to our fathers to give us.’ \n" +
                "4 Then the priest shall take the basket from your hand and set it down before the altar of the LORD your God.\n" +
                "5 “And you shall make response before the LORD your God, ‘A wandering Aramean was my father. \n" +
                "   And he went down into Egypt and sojourned there, few in number, and there he became a nation, great, mighty, and populous. \n" +
                "6 And the Egyptians treated us harshly and humiliated us and laid on us hard labor. \n" +
                "7 Then we cried to the LORD, the God of our fathers, and the LORD heard our voice and saw our affliction, our toil, and our oppression. \n" +
                "8 And the LORD brought us out of Egypt with a mighty hand and an outstretched arm, with great deeds of terror, with signs and wonders. \n" +
                "9 And he brought us into this place and gave us this land, fa land flowing with milk and honey. \n" +
                "10 And behold, now I bring the first of the fruit of the ground, which you, OLORD, have given me.’ \n" +
                "   And you shall set it down before the LORD your God and worship before the LORD your God.\n" +
                "11 And you shall rejoice in all the good that the LORD your God has given to you and to your house, you, and the Levite, \n" +
                "   and the sojourner who is among you.\n" +
                "12 “When you have finished paying all the tithe of your produce in the third year, which is the year of tithing, \n" +
                "   giving it to the Levite, the sojourner, the fatherless, and the widow, so that they may eat within your towns and be filled, \n" +
                "13 then you shall say before the LORD your God, ‘I have removed the sacred portion out of my house, and moreover, \n" +
                "   I have given it to the Levite, the sojourner, the fatherless, and the widow, according to all your commandment that you have commanded me. \n" +
                "   I have not transgressed any of your commandments, nor have I forgotten them. \n" +
                "14 I have not eaten of the tithe while I was mourning, or removed any of it while I was unclean, \n" +
                "   or offered any of it to the dead. I have obeyed the voice of the LORD my God. I have done according to all that you have commanded me. \n" +
                "15 Look down from your holy habitation, from heaven, and bless your people Israel and the ground that you have given us, \n" +
                "   as you swore to our fathers, a land flowing with milk and honey.’\n" +
                "16 “This day the LORD your God commands you to do these statutes and rules. \n" +
                "   You shall therefore be careful to do them with all your heart and with all your soul. \n" +
                "17 You have declared today that the LORD is your God, and that you will walk in his ways, \n" +
                "   and keep his statutes and his commandments and his rules, and will obey his voice. \n" +
                "18 And the LORD has declared today that you are a people for his treasured possession, \n" +
                "   as he has promised you, and that you are to keep all his commandments,\n" +
                "19 and that he will set you in praise and in fame and in honor high above all nations that he has made, \n" +
                "   and that you shall be a people holy to the LORD your God, as he promised.”\n";


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


    public void chapterTwentySevenOFDeuteronomy() {

        table27 = new Table();
        table27.setWidth(tableBG.getWidth());
        table27.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table27.setFillParent(true);
        table27.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Altar on Mount Ebal";

        String firstContent = "1 Now Moses and the elders of Israel commanded the people, saying,\n" +
                "    “Keep the whole commandment that I command you today. \n" +
                "2 And on the day you cross over the Jordan to the land that the LORD your God is giving you, \n" +
                "   you shall set up large stones and plaster them with plaster. \n" +
                "3 And you shall write on them all the words of this law, when you cross over to enter the land that the LORD your God is giving you, \n" +
                "   a land flowing with milk and honey, as the LORD, the God of your fathers, has promised you. \n" +
                "4 And when you have crossed over the Jordan, you shall set up these stones, concerning which I command you today, on Mount Ebal, \n" +
                "   and you shall plaster them with plaster.\n" +
                "5 And there you shall build an altar to the LORD your God, an altar of stones. You shall wield no iron tool on them; \n" +
                "6 you shall build an altar to the LORD your God of uncut stones. And you shall offer burnt offerings on it to the LORD your God, \n" +
                "7 and you shall sacrifice peace offerings and shall eat there, and you shall rejoice before the LORD your God. \n" +
                "8 And you shall write on the stones all the words of this law very plainly.”\n";


        String chapterSecondTitle = "Curses from Mount Ebal";

        String secondContent = "9 Then Moses and the Levitical priests said to all Israel, “Keep silence and hear, O Israel: \n" +
                "   this day you have become the people of the LORD your God. \n" +
                "10 You shall therefore obey the voice of the LORD your God, keeping his commandments and his statutes, which I command you today.”\n" +
                "11 That day Moses charged the people, saying, \n" +
                "12 “When you have crossed over the Jordan, these shall stand on Mount Gerizim to bless the people: \n" +
                "   Simeon, Levi, Judah, Issachar, Joseph, and Benjamin.\n" +
                "13 And these shall stand on Mount Ebal for the curse: Reuben, Gad, Asher, Zebulun, Dan, and Naphtali. \n" +
                "14 And the Levites shall declare to all the men of Israel in a loud voice:\n" +
                "15 “‘Cursed be the man who makes a carved or cast metal image, an abomination to the LORD, \n" +
                "   a thing made by the hands of a craftsman, and sets it up in secret.’ And all the people shall answer and say, ‘Amen.’\n" +
                "16 “‘Cursed be anyone who dishonors his father or his mother.’ And all the people shall say, ‘Amen.’\n" +
                "17 “‘Cursed be anyone who moves his neighbor's landmark.’ And all the people shall say, ‘Amen.’\n" +
                "18 “‘Cursed be anyone who misleads a blind man on the road.’ And all the people shall say, ‘Amen.’\n" +
                "19 “‘Cursed be anyone who perverts the justice due to the sojourner, the fatherless, and the widow.’ \n" +
                "   And all the people shall say, ‘Amen.’\n" +
                "20 “‘Cursed be anyone who lies with his father's wife, because he has uncovered his father's nakedness.’ \n" +
                "   And all the people shall say, ‘Amen.’\n" +
                "21 “‘Cursed be anyone who lies with any kind of animal.’ And all the people shall say, ‘Amen.’\n" +
                "22 “‘Cursed be anyone who lies with his sister, whether the daughter of his father or the daughter of his mother.’ \n" +
                "   And all the people shall say, ‘Amen.’\n" +
                "23 “‘Cursed be anyone who lies with his mother-in-law.’ And all the people shall say, ‘Amen.’\n" +
                "24 “‘Cursed be anyone who strikes down his neighbor in secret.’ And all the people shall say, ‘Amen.’\n" +
                "25 “‘Cursed be anyone who takes a bribe to shed innocent blood.’ And all the people shall say, ‘Amen.’\n" +
                "26 “‘Cursed be anyone who does not confirm the words of this law by doing them.’ And all the people shall say, ‘Amen.’\n"; 

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

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

        stage.addActor(table27);


    }

    public void chapterTwentyEightOFDeuteronomy() {

        table28 = new Table();
        table28.setWidth(tableBG.getWidth());
        table28.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table28.setFillParent(true);
        table28.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Blessings for Obedience";

        String firstContent = "1 “And if you faithfully obey the voice of the LORD your God, \n" +
                "   being careful to do all his commandments that I command you today, \n" +
                "   the LORD your God will set you high above all the nations of the earth. \n" +
                "2 And all these blessings shall come upon you and overtake you, if you obey the voice of the LORD your God. \n" +
                "3 Blessed shall you be in the city, and blessed shall you be in the field. \n" +
                "4 Blessed shall be the fruit of your womb and the fruit of your ground and the fruit of your cattle, \n" +
                "   the increase of your herds and the young of your flock. \n" +
                "5 Blessed shall be your basket and your kneading bowl. \n" +
                "6 Blessed shall you be when you come in, and blessed shall you be when you go out.\n" +
                "7 “The LORD will cause your enemies who rise against you to be defeated before you. \n" +
                "   They shall come out against you one way and flee before you seven ways. \n" +
                "8 The LORD will command the blessing on you in your barns and zin all that you undertake.  \n" +
                "   And he will bless you in the land that the LORD your God is giving you. \n" +
                "9 The LORD will establish you as a people holy to himself, as he has sworn to you, if you keep the commandments of the LORD your God \n" +
                "   and walk in his ways. \n" +
                "10 And all the peoples of the earth shall see that you are called by the name of the LORD, and they shall be afraid of you. \n" +
                "11 And the LORD will make you abound in prosperity, \n" +
                "   in the fruit of your womb and in the fruit of your livestock and in the fruit of your ground, \n" +
                "   within the land that the LORD swore to your fathers to give you. \n" +
                "12 The LORD will open to you his good treasury, the heavens, to give the rain to your land \n" +
                "   in its season and to bless all the work of your hands. \n" +
                "   And you shall lend to many nations, but you shall not borrow. \n" +
                "13 And the LORD will make you the head and not the tail, and you shall only go up and not down, \n" +
                "   if you obey the commandments of the LORD your God, which I command you today, being careful to do them, \n" +
                "14 and if you do not turn aside from any of the words that I command you today, to the right hand or to the left, \n" +
                "   to go after other gods to serve them.\n";


        String chapterSecondTitle = "Curses for Disobedience";

        String secondContent = "15 “But if you will not obey the voice of the LORD your God or be careful to do all his commandments \n" +
                "   and his statutes that I command you today, then all these curses shall come upon you and overtake you.\n" +
                "16 Cursed shall you be in the city, and cursed shall you be in the field.17 Cursed shall be your basket and your kneading bowl. \n" +
                "18 Cursed shall be the fruit of your womb and the fruit of your ground, the increase of your herds and the young of your flock. \n" +
                "19 Cursed shall you be when you come in, and cursed shall you be when you go out.\n" +
                "20 “The LORD will send on you curses, confusion, and frustration in all that you undertake to do, \n" +
                "   until you are destroyed and perish quickly on account of the evil of your deeds, because you have forsaken me.\n" +
                "21 The LORD will make the pestilence stick to you until he has consumed you off the land that you are entering to take possession of it. \n" +
                "22 The LORD will strike you with wasting disease and with fever, inflammation and fiery heat, \n" +
                "   and with drought and with blight and with mildew. They shall pursue you until you perish. \n" +
                "23 And the heavens over your head shall be bronze, and the earth under you shall be iron. \n" +
                "24 The LORD will make the rain of your land powder. From heaven dust shall come down on you until you are destroyed.\n" +
                "25  “The LORD will cause you to be defeated before your enemies. You shall go out one way against them \n" +
                "   and flee seven ways before them. And you shall be a horror to all the kingdoms of the earth. \n" +
                "26 And your dead body shall be food for all birds of the air and for the beasts of the earth, \n" +
                "   and there shall be no one to frighten them away. \n" +
                "27 The LORD will strike you with the boils of Egypt, and with tumors and scabs and itch, of which you cannot be healed. \n" +
                "28 The LORD will strike you with madness and blindness and confusion of mind, \n" +
                "29 and you shall grope at noonday, as the blind grope in darkness, and you shall not prosper in your ways.\n" +
                "   2 And you shall be only oppressed and robbed continually, and there shall be no one to help you. \n" +
                "30 You shall betroth a wife, but another man shall ravish her. You shall build a house, but you shall not dwell in it. \n" +
                "   You shall plant a vineyard, but you shall not enjoy its fruit.\n" +
                "31 Your ox shall be slaughtered before your eyes, but you shall not eat any of it. Your donkey shall be seized before your face, \n" +
                "   but shall not be restored to you. Your sheep shall be given to your enemies, but there shall be no one to help you. \n" +
                "32 Your sons and your daughters shall be given to another people, while your eyes look on and fail with longing for them all day long, \n" +
                "   but you shall be helpless. \n" +
                "33 A nation that you have not known shall eat up the fruit of your ground and of all your labors, \n" +
                "   and you shall be only oppressed and crushed continually, \n" +
                "34 so that you are driven mad by the sights that your eyes see.\n" +
                "35 The LORD will strike you on the knees and on the legs with grievous boils of which you cannot be healed, \n" +
                "   from the sole of your foot to the crown of your head.\n" +
                "36 “The LORD will bring you and your king whom you set over you to a nation that neither you nor your fathers have known. \n" +
                "   And there you shall serve other gods of wood and stone. \n" +
                "37 And you shall become a horror, a proverb, and a byword among all the peoples where the LORDwill lead you away. \n" +
                "38 You shall carry much seed into the field and shall gather in little, for the locust shall consume it. \n" +
                "39 You shall plant vineyards and dress them, but you shall neither drink of the wine nor gather the grapes, for the worm shall eat them. \n" +
                "40 You shall have olive trees throughout all your territory, but you shall not anoint yourself with the oil, for your olives shall drop off. \n" +
                "41 You shall father sons and daughters, but they shall not be yours, for they shall go into captivity.\n" +
                "42 The cricket shall possess all your trees and the fruit of your ground.\n" +
                "43 The sojourner who is among you shall rise higher and higher above you, and you shall come down lower and lower. \n" +
                "44 He shall lend to you, and you shall not lend to him.  He shall be the head, and you shall be the tail.\n" +
                "45 “All these curses shall come upon you and pursue you and overtake you till you are destroyed, \n" +
                "   because you did not obey the voice of the LORD your God, to keep his commandments and his statutes that he commanded you. \n" +
                "46 They shall be a sign and a wonder against you and your offspring forever. \n" +
                "47 Because you did not serve the LORD your God with joyfulness and gladness of heart, because of the abundance of all things, \n" +
                "48 therefore you shall serve your enemies whom the LORD will send against you, in hunger and thirst, in nakedness, \n" +
                "   and lacking everything. And he will put a yoke of iron on your neck until he has destroyed you. \n" +
                "49 The LORD will bring a nation against you from far away, from the end of the earth, swooping down like the eagle,\n" +
                "    a nation whose language you do not understand, \n" +
                "50 a hard-faced nation who shall not respect the old or show mercy to the young. \n" +
                "51 It shall eat the offspring of your cattle and the fruit of your ground, until you are destroyed; it also shall not leave you grain, \n" +
                "   wine, or oil, the increase of your herds or the young of your flock, until they have caused you to perish.\n" +
                "52 “They shall besiege you in all your towns, until your high and fortified walls, in which you trusted, come down throughout all your land.\n" +
                "    And they shall besiege you in all your towns throughout all your land, which the LORD your God has given you. \n" +
                "53 And you shall eat the fruit of your womb, the flesh of your sons and daughters, whom the LORD your God has given you, \n" +
                "   in the siege and in the distress with which your enemies shall distress you. \n" +
                "54 The man who is the most tender and refined among you will begrudge food to his brother, to the wife he embraces, \n" +
                "   and to the last of the children whom he has left, 55 so that he will not give to any of them \n" +
                "   any of the flesh of his children whom he is eating, because he has nothing else left, \n" +
                "   in the siege and in the distress with which your enemy shall distress you in all your towns.\n" +
                "56 The most tender and refined woman among you, who would not venture to set the sole of her foot on the ground \n" +
                "   because she is so delicate and tender, will begrudge to the husband she embraces,5 to her son and to her daughter, \n" +
                "57 her afterbirth that comes out from between her feet and her children whom she bears, because lacking everything \n" +
                "   she will eat them secretly, in the siege and in the distress with which your enemy shall distress you in your towns.\n" +
                "58 “If you are not careful to do all the words of this law that are written in this book, that you may fear this glorious and awesome name,\n" +
                "    the LORD your God, \n" +
                "59 then the LORD will bring on you and your offspring extraordinary afflictions, afflictions severe and lasting, \n" +
                "   and sicknesses grievous and lasting. \n" +
                "60 And he will bring upon you again all the diseases of Egypt, of which you were afraid, and they shall cling to you. \n" +
                "61 Every sickness also and every affliction that is not recorded in the book of this law, the LORD will bring upon you, \n" +
                "   until you are destroyed.\n" +
                "62 Whereas you were as numerous as the stars of heaven, you shall be left few in number, \n" +
                "   because you did not obey the voice of the LORD your God. \n" +
                "63 And as the LORD took delight in doing you good and multiplying you, so the LORD will take delight \n" +
                "   in bringing ruin upon you and destroying you. And you shall be plucked off the land that you are entering to take possession of it.\n" +
                "64 “And the LORD will scatter you among all peoples, from one end of the earth to the other, \n" +
                "   and there you shall serve other gods of wood and stone, which neither you nor your fathers have known. \n" +
                "65 And among these nations you shall find no respite, and there shall be no resting place for the sole of your foot,\n" +
                "    but the LORD will give you there a trembling heart and failing eyes and a languishing soul. \n" +
                "66 Your life shall hang in doubt before you. Night and day you shall be in dread and have no assurance of your life. \n" +
                "67 In the morning you shall say, ‘If only it were evening!’ and at evening you shall say, ‘If only it were morning!’ \n" +
                "   because of the dread that your heart shall feel, and the sights that your eyes shall see. \n" +
                "68 And the LORD will bring you back in ships to Egypt, a journey that I promised that you should never make again; \n" +
                "   and there you shall offer yourselves for sale to your enemies as male and female slaves, but there will be no buyer.”\n";

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

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

        stage.addActor(table28);

    }


    public void chapterTwentyNineOFDeuteronomy() {

        table29 = new Table();
        table29.setWidth(tableBG.getWidth());
        table29.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table29.setFillParent(true);
        table29.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Covenant Renewed in Moab";

        String firstContent = "1 These are the words of the covenant that the LORD commanded Moses to make with the people of Israel in the land of Moab, \n" +
                "   besides the covenant that he had made with them at Horeb.\n" +
                "2 And Moses summoned all Israel and said to them: “You have seen all that the LORD did before your eyes in the land of Egypt, \n" +
                "   to Pharaoh and to all his servants and to all his land, \n" +
                "3 the great trials that your eyes saw, the signs, and those great wonders. \n" +
                "4 But to this day the LORD has not given you a heart to understand or eyes to see or ears to hear. \n" +
                "5 I have led you forty years in the wilderness. Your clothes have not worn out on you, and your sandals have not worn off your feet.\n" +
                "6 You have not eaten bread, and you have not drunk wine or strong drink, that you may know that I am the LORD your God. \n" +
                "7 And when you came to this place, Sihon the king of Heshbon and Og the king of Bashan came out against us to battle, but we defeated them. \n" +
                "8 We took their land and gave it for an inheritance to the Reubenites, the Gadites, and the half-tribe of the Manassites. \n" +
                "9 Therefore keep the words of this covenant and do them, that you may prosper in all that you do.\n" +
                "10 “You are standing today, all of you, before the LORD your God: the heads of your tribes, your elders, and your officers, all the men of Israel, \n" +
                "11 your little ones, your wives, and the sojourner who is in your camp, from the one who chops your wood to the one who draws your water, \n" +
                "12 so that you may enter into the sworn covenant of the LORD your God, which the LORD your God is making with you today, \n" +
                "13 that he may establish you today as his people, and that he may be your God, as he promised you, and as he swore to your fathers,\n" +
                "    to Abraham, to Isaac, and to Jacob. \n" +
                "14 It is not with you alone that I am making this sworn covenant, \n" +
                "15 but with whoever is standing here with us today before the LORD our God, and with whoever is not here with us today.\n" +
                "16 “You know how we lived in the land of Egypt, and how we came through the midst of the nations through which you passed. \n" +
                "17 And you have seen their detestable things, their idols of wood and stone, of silver and gold, which were among them. \n" +
                "18 Beware lest there be among you a man or woman or clan or tribe whose heart is turning away today \n" +
                "   from the LORD our God to go and serve the gods of those nations. Beware lest there be among you a root bearing poisonous and bitter fruit, \n" +
                "19 one who, when he hears the words of this sworn covenant, blesses himself in his heart, saying, \n" +
                "   ‘I shall be safe, though I walk in the stubbornness of my heart.’ This will lead to the sweeping away of moist and dry alike.\n" +
                "20 The LORD will not be willing to forgive him, but rather the anger of the LORD and his jealousy will smoke against that man, \n" +
                "   and the curses written in this book will settle upon him, and the LORD will blot out his name from under heaven. \n" +
                "21 And the LORD will single him out from all the tribes of Israel for calamity, \n" +
                "   in accordance with all the curses of the covenant written in this Book of the Law. \n" +
                "22 And the next generation, your children who rise up after you, and the foreigner who comes from a far land, will say, \n" +
                "   when they see the afflictions of that land and the sicknesses with which the LORD has made it sick—\n" +
                "23 the whole land burned out with brimstone and salt, nothing sown and nothing growing, where no plant can sprout,  \n" +
                "   an overthrow like that of Sodom and Gomorrah,  Admah, and Zeboiim, which the LORD overthrew in his anger and wrath—\n" +
                "24 all the nations will say, ‘Why has the LORD done thus to this land? What caused the heat of this great anger?’ \n" +
                "25 Then people will say, ‘It is because they abandoned the covenant of the LORD, the God of their fathers, \n" +
                "   which he made with them when he brought them out of the land of Egypt, \n" +
                "26 and went and served other gods and worshiped them, gods whom they had not known and whom he had not allotted to them. \n" +
                "27 Therefore the anger of the LORD was kindled against this land, bringing upon it all the curses written in this book, \n" +
                "28 and the LORD uprooted them from their land in anger and fury and great wrath, and cast them into another land, as they are this day.’\n" +
                "29 “The secret things belong to the LORD our God, but the things that are revealed belong to us and to our children forever, \n" +
                "   that we may do all the words of this law.\n";

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

    public void chapterThirtyOFDeuteronomy() {

        table30 = new Table();
        table30.setWidth(tableBG.getWidth());
        table30.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table30.setFillParent(true);
        table30.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Repentance and Forgiveness";

        String firstContent = "1 “And when all these things come upon you, the blessing and the curse, which I have set before you, \n" +
                "   and you call them to mind among all the nations where the LORD your God has driven you,\n" +
                "2 and return to the LORD your God, you and your children, and obey his voice in all that I command you today,\n" +
                "   with all your heart and with all your soul, 3 then the LORD your God will restore your fortunes and have mercy on you, \n" +
                "   and he will gather you again from all the peoples where the LORD your God has scattered you. \n" +
                "4 If your outcasts are in the uttermost parts of heaven, from there the LORD your God will gather you, and from there he will take you. \n" +
                "5 And the LORD your God will bring you into the land that your fathers possessed, that you may possess it. \n" +
                "   And he will make you more prosperous and numerous than your fathers. \n" +
                "6 And the LORD your God will circumcise your heart and the heart of your offspring, \n" +
                "   so that you will love the LORD your God with all your heart and with all your soul, that you may live. \n" +
                "7 And the LORD your God will put all these curses on your foes and enemies who persecuted you. \n" +
                "8 And you shall again obey the voice of the LORD and keep all his commandments that I command you today. \n" +
                "9 The LORD your God will make you abundantly prosperous in all the work of your hand, \n" +
                "   in the fruit of your womb and in the fruit of your cattle and in the fruit of your ground. \n" +
                "   For the LORD will again take delight in prospering you, as he took delight in your fathers,\n" +
                "10 when you obey the voice of the LORD your God, to keep his commandments and his statutes that are written in this Book of the Law, \n" +
                "   when you turn to the LORD your God with all your heart and with all your soul.\n";


        String chapterSecondTitle = "The Choice of Life and Death";

        String secondContent = "11 “For this commandment that I command you today tis not too hard for you, neither is it far off. \n" +
                "12 It is not in heaven, that you should say, ‘Who will ascend to heaven for us and bring it to us, that we may hear it and do it?’ \n" +
                "13 Neither is it beyond the sea, that you should say, ‘Who will go over the sea for us and bring it to us, that we may hear it and do it?’ \n" +
                "14 But the word is very near you. It is in your mouth and in your heart, so that you can do it.\n" +
                "15 “See, I have set before you today life and good, death and evil.\n" +
                "16 If you obey the commandments of the LORD your God that I command you today, by loving the LORD your God, by walking in his ways, \n" +
                "   and by keeping his commandments and his statutes and his rules, then you shall live and multiply, \n" +
                "   and the LORD your God will bless you in the land that you are entering to take possession of it. \n" +
                "17 But if your heart turns away, and you will not hear, but are drawn away to worship other gods and serve them, \n" +
                "18 I declare to you today, that you shall surely perish. \n" +
                "   You shall not live long in the land that you are going over the Jordan to enter and possess. \n" +
                "19 I call heaven and earth to witness against you today, that I have set before you life and death, blessing and curse. \n" +
                "   Therefore choose life, that you and your offspring may live, \n" +
                "20 loving the LORD your God, obeying his voice and holding fast to him, for he is your life and length of days, \n" +
                "   that you may dwell in the land that the LORD swore to your fathers, to Abraham, to Isaac, and to Jacob, to give them.”\n";

        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

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

        stage.addActor(table30);

    }


    public void chapterThirtyOneOFDeuteronomy() {

        table31 = new Table();
        table31.setWidth(tableBG.getWidth());
        table31.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table31.setFillParent(true);
        table31.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Joshua to Succeed Moses";

        String firstContent = "1 So Moses continued to speak these words to all Israel. \n" +
                "2 And he said to them, “I am 120 years old today. I am no longer able to go out and come in. \n" +
                "   The LORD has said to me, ‘You shall not go over this Jordan.’ \n" +
                "3 The LORD your God himself will go over before you. He will destroy these nations before you, \n" +
                "   so that you shall dispossess them, and Joshua will go over at your head, as the LORD has spoken. \n" +
                "4 And the LORD will do to them as he did to Sihon and Og, the kings of the Amorites, and to their land, when he destroyed them. \n" +
                "5 And the LORD will give them over to you, and you shall do to them according to the whole commandment that I have commanded you. \n" +
                "6 Be strong and courageous. Do not fear or be in dread of them, for it is the LORD your God who goes with you. \n" +
                "   He will not leave you or forsake you.”\n" +
                "7 Then Moses summoned Joshua and said to him in the sight of all Israel, “Be strong and courageous, \n" +
                "   for you shall go with this people into the land that the LORD has sworn to their fathers to give them, \n" +
                "   and you shall put them in possession of it. \n" +
                "8 It is the LORD who goes before you. He will be with you; he will not leave you or forsake you. Do not fear or be dismayed.”\n    ";


        String chapterSecondTitle = "The Reading of the Law";

        String secondContent = "9 Then Moses wrote this law and gave it to the priests, the sons of Levi, \n" +
                "   who carried the ark of the covenant of the LORD, and to all the elders of Israel. \n" +
                "10 And Moses commanded them, “At the end of every seven years, at the set time in the year of release, at the Feast of Booths,\n" +
                "11 when all Israel comes to appear before the LORD your God at the place that he will choose, \n" +
                "   you shall read this law before all Israel in their hearing. \n" +
                "12 Assemble the people, men, women, and little ones, and the sojourner within your towns, that they may hear \n" +
                "   and learn to fear the LORD your God, and be careful to do all the words of this law, \n" +
                "13 and that their children, who have not known it, may hear and learn to fear the LORD your God, \n" +
                "   as long as you live in the land that you are going over the Jordan to possess.”\n";


        String chapterThirdTitle = "Joshua Commissioned to Lead Israel";

        String thirdContent = "14 And the LORD said to Moses, “Behold, the days approach when you must die. Call Joshua \n" +
                "   and present yourselves in the tent of meeting, that I may commission him.”\n" +
                "    And Moses and Joshua went and presented themselves in the tent of meeting. \n" +
                "15 And the LORD appeared in the tent in a pillar of cloud. And the pillar of cloud stood over the entrance of the tent.\n" +
                "16 And the LORD said to Moses, “Behold, you are about to lie down with your fathers. \n" +
                "   Then this people will rise and whore after the foreign gods among them in the land that they are entering, \n" +
                "   and they will forsake me and break my covenant that I have made with them.\n" +
                "17 Then my anger will be kindled against them in that day, and I will forsake them and hide my face from them, \n" +
                "   and they will be devoured. And many evils and troubles will come upon them, so that they will say in that day, \n" +
                "   ‘Have not these evils come upon us because our God is not among us?’ \n" +
                "18 And I will surely hide my face in that day because of all the evil that they have done, because they have turned to other gods.\n" +
                "19 “Now therefore write this song and teach it to the people of Israel. Put it in their mouths, \n" +
                "   that this song may be a witness for me against the people of Israel. \n" +
                "20 For when I have brought them into the land flowing with milk and honey, which I swore to give to their fathers, \n" +
                "   and they have eaten and are full and grown fat, they will turn to other gods and serve them, and despise me and break my covenant.\n" +
                "21 And when many evils and troubles have come upon them, this song shall confront them as ta witness \n" +
                "   (for it will live unforgotten in the mouths of their offspring). For I know what they are inclined to do even today,\n" +
                "    before I have brought them into the land that I swore to give.” \n" +
                "22 So Moses wrote this song the same day and taught it to the people of Israel.\n" +
                "23 And the LORD commissioned Joshua the son of Nun and said, “Be strong and courageous, \n" +
                "   for you shall bring the people of Israel into the land that I swore to give them. I will be with you.”\n" +
                "24 When Moses had finished writing the words of this law in a book to the very end, \n" +
                "25 Moses commanded the Levites who carried the ark of the covenant of the LORD, \n" +
                "26 “Take this Book of the Law and put it by the side of the ark of the covenant of the LORD your God, \n" +
                "   that it may be there for a witness against you. \n" +
                "27 For I know how rebellious and stubborn you are. Behold, even today while I am yet alive with you, \n" +
                "   you have been rebellious against the LORD. How much more after my death! \n" +
                "28 Assemble to me all the elders of your tribes and your officers, that I may speak these words in their ears \n" +
                "   and call heaven and earth to witness against them. \n" +
                "29 For I know that after my death you will surely act corruptly and turn aside from the way that I have commanded you. \n" +
                "   And in the days to come evil will befall you, because you will do what is evil in the sight of the LORD, \n" +
                "   provoking him to anger through the work of your hands.”\n";


        String chapterFourthTitle = "The Song of Moses";

        String fourthContent = "30 Then Moses spoke the words of this song until they were finished, in the ears of all the assembly of Israel:";

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
        table31.add(lblFirstTitle).pad(10,50,0,0).left();
        table31.row();

        //content of the chapter
        table31.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table31.row();

        //title of the second content
        table31.add(lblSecondTitle).pad(10,50,0,0).left();
        table31.row();

        //content of the second title
        table31.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table31.row();

        //title of the third content
        table31.add(lblThirdTitle).pad(10,50,0,0).left();
        table31.row();

        //content of the third title
        table31.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        //title of the fourth content
        table31.add(lblFourthTitle).pad(10,50,0,0).left();
        table31.row();

        //content of the fourtn title
        table31.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table31);

    }


    public void chapterThirtyTwoOFDeuteronomy() {

        table32 = new Table();
        table32.setWidth(tableBG.getWidth());
        table32.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table32.setFillParent(true);
        table32.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = " ";

        String firstContent = "1 “Give ear, O heavens, and I will speak,\n" +
                "and let the earth hear the words of my mouth.\n" +
                "2  May my teaching drop as the rain,\n" +
                "my speech distill as the dew,\n" +
                "like gentle rain upon the tender grass,\n" +
                "and like showers upon the herb.\n" +
                "3  For I will proclaim the name of the LORD;\n" +
                "ascribe greatness to our God!\n" +
                "4 “The Rock, his work is perfect,\n" +
                "for all his ways are justice.\n" +
                "A God of faithfulness and without iniquity,\n" +
                "just and upright is he.\n" +
                "5 They have dealt corruptly with him;\n" +
                "they are no longer his children because they are blemished;\n" +
                "they are a crooked and twisted generation.\n" +
                "6  Do you thus repay the LORD,\n" +
                "you foolish and senseless people?\n" +
                "Is not he your father, who created you,\n" +
                "who made you and established you?\n" +
                "7  Remember the days of old;\n" +
                "consider the years of many generations;\n" +
                "ask your father, and he will show you,\n" +
                "your elders, and they will tell you.\n" +
                "8 When the Most High gave to the nations their inheritance,\n" +
                "when he divided mankind,\n" +
                "he fixed the borders of the peoples\n" +
                "according to the number of the sons of God. \n" +
                "9  But the LORD's portion is his people,\n" +
                "Jacob his allotted heritage.\n" +
                "10 “He found him in a desert land,\n" +
                "and in the howling waste of the wilderness;\n" +
                "he encircled him, he cared for him,\n" +
                "he kept him as the apple of his eye.\n" +
                "11  Like an eagle that stirs up its nest,\n" +
                "that flutters over its young,\n" +
                "spreading out its wings, catching them,\n" +
                "bearing them on its pinions,\n" +
                "12  the LORD alone guided him,\n" +
                "no foreign god was with him.\n" +
                "13  He made him ride on the high places of the land,\n" +
                "and he ate the produce of the field,\n" +
                "and he suckled him with honey out of the rock,\n" +
                "and oil out of the flinty rock.\n" +
                "14  Curds from the herd, and milk from the flock,\n" +
                "with fat of lambs,\n" +
                "rams of Bashan and goats,\n" +
                "with the very finest of the wheat—\n" +
                "and you drank foaming wine made from the blood of the grape.\n" +
                "15 “But Jeshurun grew fat, and kicked;\n" +
                "you grew fat, stout, and sleek;\n" +
                "then he forsook God who made him\n" +
                "and scoffed at the Rock of his salvation.\n" +
                "16 They stirred him to jealousy with strange gods;\n" +
                "with abominations they provoked him to anger.\n" +
                "17 They sacrificed to demons that were no gods,\n" +
                "to gods they had never known,\n" +
                "to new gods that had come recently,\n" +
                "whom your fathers had never dreaded.\n" +
                "18 You were unmindful of the Rock that bore5 you,\n" +
                "and you forgot the God who gave you birth.\n" +
                "19 “The LORD saw it and spurned them,\n" +
                "because of the provocation of his sons and his daughters.\n" +
                "20  And he said,  ‘I will hide my face from them;\n" +
                "I will see what their end will be,\n" +
                "for they are a perverse generation,\n" +
                "children in whom is no faithfulness.\n" +
                "21 They have made me jealous with what is no god;\n" +
                "they have provoked me to anger with their idols.\n" +
                "So I will make them jealous with those who are no people;\n" +
                "I will provoke them to anger with a foolish nation.\n" +
                "22 For a fire is kindled by my anger,\n" +
                "and it burns to the depths of Sheol,\n" +
                "devours the earth and its increase,\n" +
                "and sets on fire the foundations of the mountains.\n" +
                "23 “‘And I will heap disasters upon them;\n" +
                "I will spend my arrows on them;\n" +
                "24 they shall be wasted with hunger,\n" +
                "and devoured by plague\n" +
                "and poisonous pestilence;\n" +
                "I will send the teeth of beasts against them,\n" +
                "with the venom of things that crawl in the dust.\n" +
                "25 Outdoors the sword shall bereave,\n" +
                "and indoors terror,\n" +
                "for young man and woman alike,\n" +
                "the nursing child with the man of gray hairs.\n" +
                "26 I would have said, “I will cut them to pieces;\n" +
                "I will wipe them from human memory,”\n" +
                "27 had I not feared provocation by the enemy,\n" +
                "lest their adversaries should misunderstand,\n" +
                "lest they should say, “Our hand is triumphant,\n" +
                "it was not the LORD who did all this.”’\n" +
                "28 “For they are a nation void of counsel,\n" +
                "and there is no understanding in them.\n" +
                "29 If they were wise, they would understand this;\n" +
                "they would discern their latter end!\n" +
                "30 How could one have chased a thousand,\n" +
                "and two have put ten thousand to flight,\n" +
                "unless their Rock had sold them,\n" +
                "and the LORD had given them up?\n" +
                "31 For their rock is not as our Rock;\n" +
                "our enemies are by themselves.\n" +
                "32 For their vine comes from the vine of Sodom\n" +
                "and from the fields of Gomorrah;\n" +
                "their grapes are grapes of poison;\n" +
                "their clusters are bitter;\n" +
                "33 their wine is the poison of serpents\n" +
                "and the cruel venom of asps.\n" +
                "34 “‘Is not this laid up in store with me,\n" +
                "sealed up in my treasuries?\n" +
                "35 Vengeance is mine, and recompense, \n" +
                "for the time when their foot shall slip;\n" +
                "for the day of their calamity is at hand,\n" +
                "and their doom comes swiftly.’\n" +
                "36 For the LORD will vindicate his people\n" +
                "and have compassion on his servants,\n" +
                "when he sees that their power is gone\n" +
                "and there is none remaining,  bond or free.\n" +
                "37 Then he will say, ‘Where are their gods,\n" +
                "the rock in which they took refuge,\n" +
                "38 who ate the fat of their sacrifices\n" +
                "and drank the wine of their drink offering?\n" +
                "Let them rise up and help you;\n" +
                "let them be your protection!\n" +
                "39 “‘See now that I, even I, am he,\n" +
                "and there is no god beside me;\n" +
                "I kill and I make alive;\n" +
                "I wound and I heal;\n" +
                "and there is none that can deliver out of my hand.\n" +
                "40  For I lift up my hand to heaven\n" +
                "and swear, As I live forever,\n" +
                "41 if I sharpen my flashing sword\n" +
                "and my hand takes hold on judgment,\n" +
                "I will take vengeance on my adversaries\n" +
                "and will repay those who hate me.\n" +
                "42 I will make my arrows drunk with blood,\n" +
                "and my sword shall devour flesh—\n" +
                "with the blood of the slain and the captives,\n" +
                "from the long-haired heads of the enemy.’\n" +
                "43 “Rejoice with him, O heavens; \n" +
                "bow down to him, all gods, \n" +
                "for he avenges the blood of his children\n" +
                "and takes vengeance on his adversaries.\n" +
                "He repays those who hate him\n" +
                "and cleanses his people's land.” \n" +
                "44 Moses came and recited all the words of this song in the hearing of the people, he and Joshua the son of Nun. \n" +
                "45 And when Moses had finished speaking all these words to all Israel, \n" +
                "46 he said to them, “Take to heart all the words by which I am warning you today, \n" +
                "   that you may command them to your children, that they may be careful to do all the words of this law. \n" +
                "47 For it is no empty word for you, but your very life, and by this word \n" +
                "   you shall live long in the land that you are going over the Jordan to possess.”\n";


        String chapterSecondTitle = "Moses' Death Foretold";

        String secondContent = "48 That very day the LORD spoke to Moses, \n" +
                "49 “Go up this mountain of the Abarim, Mount Nebo, which is in the land of Moab, opposite Jericho, \n" +
                "   and view the land of Canaan, which I am giving to the people of Israel for a possession. \n" +
                "50 And die on the mountain which you go up, and be gathered to your people, as Aaron your brother died in Mount Hor \n" +
                "   and was gathered to his people, \n" +
                "51 because you broke faith with me in the midst of the people of Israel at the waters of Meribah-kadesh, \n" +
                "   in the wilderness of Zin, and because you did not treat me as holy in the midst of the people of Israel. \n" +
                "52 For you shall see the land before you, but you shall not go there, into the land that I am giving to the people of Israel.”\n";

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


    public void chapterThirtyThreeOFDeuteronomy() {

        table33 = new Table();
        table33.setWidth(tableBG.getWidth());
        table33.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table33.setFillParent(true);
        table33.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Moses' Final Blessing on Israel";

        String firstContent = "1 This is the blessing with which Moses the man of God blessed the people of Israel before his death. \n" +
                "2 He said, “The LORD came from Sinai and dawned from Seir upon us; he shone forth from Mount Paran; \n" +
                "   he came from the ten thousands of holy ones, with flaming fire2 at his right hand.\n" +
                "3 Yes, he loved his people, all his holy ones were in his hand; so they followed5 in your steps, \n" +
                "   receiving direction from you,\n" +
                "4 when Moses commanded us a law, as a possession for the assembly of Jacob.\n" +
                "5 Thus the LORD became king in Jeshurun, when the heads of the people were gathered, all the tribes of Israel together.\n" +
                "6 “Let Reuben live, and not die, but let his men be few.”\n" +
                "7 And this he said of Judah:\n" +
                "“Hear, O LORD, the voice of Judah,\n" +
                "and bring him in to his people.\n" +
                "With your hands contend7 for him,\n" +
                "and be a help against his adversaries.”\n" +
                "8 And of Levi he said,\n" +
                "“Give to Levi your Thummim,\n" +
                "and your Urim to your godly one,\n" +
                "whom you tested at Massah,\n" +
                "with whom you quarreled at the waters of Meribah;\n" +
                "9 who said of his father and mother,\n" +
                "‘I regard them not’;\n" +
                "he disowned his brothers\n" +
                "and ignored his children.\n" +
                "For they observed your word\n" +
                "and kept your covenant.\n" +
                "10  They shall teach Jacob your rules\n" +
                "and Israel your law;\n" +
                "they shall put incense before you\n" +
                "and whole burnt offerings on your altar.\n" +
                "11  Bless, O LORD, his substance,\n" +
                "and accept the work of his hands;\n" +
                "crush the loins of his adversaries,\n" +
                "of those who hate him, that they rise not again.”\n" +
                "12 Of Benjamin he said,\n" +
                "“The beloved of the LORD dwells in safety.\n" +
                "The High God surrounds him all day long,\n" +
                "and dwells between his shoulders.”\n" +
                "13 And of Joseph he said,\n" +
                " “Blessed by the LORD be his land,\n" +
                "with the choicest gifts of heaven above, \n" +
                "and of the deep that crouches beneath,\n" +
                "14 with the choicest fruits of the sun\n" +
                "and the rich yield of the months,\n" +
                "15 with the finest produce of the ancient mountains\n" +
                "and the abundance of the everlasting hills,\n" +
                "16 with the best gifts of the earth and wits fullness\n" +
                "and the favor of him who dwells in the bush.\n" +
                "May these rest on the head of Joseph,\n" +
                "on the pate of him who is prince among his brothers.\n" +
                "17 A firstborn bull—he has majesty,\n" +
                "and his horns are the horns of a wild ox;\n" +
                "with them he shall gore the peoples,\n" +
                "all of them, to the ends of the earth;\n" +
                "they are the ten thousands of Ephraim,\n" +
                "and they are the thousands of Manasseh.”\n" +
                "18 And of Zebulun he said,\n" +
                " “Rejoice, Zebulun, in your going out,\n" +
                "and Issachar, in your tents.\n" +
                "19 They shall call peoples to their mountain;\n" +
                "there they offer right sacrifices;\n" +
                "for they draw from the abundance of the seas\n" +
                "and the hidden treasures of the sand.”\n" +
                "20 And of Gad he said,\n" +
                "“Blessed be he who enlarges Gad!\n" +
                "Gad crouches like a lion;\n" +
                "he tears off arm and scalp.\n" +
                "21 He chose the best of the land for himself,\n" +
                "for there a commander's portion was reserved;\n" +
                "and he came with the heads of the people,\n" +
                "with Israel he executed the justice of the LORD,\n" +
                "and his judgments for Israel.”\n" +
                "22 And of Dan he said,\n" +
                " “Dan is a lion's cub\n" +
                "that leaps from Bashan.”\n" +
                "23 And of Naphtali he said,\n" +
                "“O Naphtali, sated with favor,\n" +
                "and full of the blessing of the LORD,\n" +
                "possess the lake and the south.”\n" +
                "24 And of Asher he said,\n" +
                "“Most blessed of sons be Asher;\n" +
                "let him be the favorite of his brothers,\n" +
                "and let him dip his foot in oil.\n" +
                "25  Your bars shall be iron and bronze,\n" +
                "and as your days, so shall your strength be.\n" +
                "26 “There is none like God, O Jeshurun,\n" +
                "who rides through the heavens to your help,\n" +
                "through the skies in his majesty.\n" +
                "27  The eternal God is your dwelling place, \n" +
                "and underneath are the everlasting arms.\n" +
                "And he thrust out the enemy before you\n" +
                "and said, ‘Destroy.’\n" +
                "28 So Israel lived in safety,\n" +
                "Jacob lived alone, \n" +
                "in a land of grain and wine,\n" +
                "whose heavens drop down dew.\n" +
                "29  Happy are you, O Israel!  Who is like you,\n" +
                "a people saved by the LORD,\n" +
                "the shield of your help,\n" +
                "and the sword of your triumph!\n" +
                "Your enemies shall come fawning to you,\n" +
                "and you shall tread upon their backs.”\n";

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

    public void chapterThirtyFourOFDeuteronomy() {

        table34 = new Table();
        table34.setWidth(tableBG.getWidth());
        table34.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table34.setFillParent(true);
        table34.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Death of Moses";

        String firstContent = "1 Then Moses went up from the plains of Moab to Mount Nebo, to the top of Pisgah, which is opposite Jericho. \n" +
                "   And the LORD showed him all the land, Gilead as far as Dan, \n" +
                "2 all Naphtali, the land of Ephraim and Manasseh, all the land of Judah as far as the western sea,\n" +
                "3 the Negeb, and the Plain, that is, the Valley of Jericho the city of palm trees, as far as Zoar. \n" +
                "4 And the LORD said to him, “This is the land of which I swore to Abraham, to Isaac, and to Jacob, ‘I will give it to your offspring.’  \n" +
                "   I have let you see it with your eyes, but you shall not go over there.” \n" +
                "5 So Moses the servant of the LORD died there in the land of Moab, according to the word of the LORD, \n" +
                "6 and he buried him in the valley in the land of Moab opposite Beth-peor; but no one knows the place of his burial to this day. \n" +
                "7 Moses was 120 years old when he died. His eye was undimmed, and his vigor unabated. \n" +
                "8 And the people of Israel wept for Moses in the plains of Moab thirty days. \n" +
                "   Then the days of weeping and mourning for Moses were ended.\n" +
                "9 And Joshua the son of Nun was full of the spirit of wisdom, for Moses had laid his hands on him. \n" +
                "   So the people of Israel obeyed him and did as the LORD had commanded Moses. \n" +
                "10 And there has not arisen a prophet since in Israel like Moses, whom the LORD knew face to face, \n" +
                "11 none like him for all the signs and the wonders that the LORD sent him to do in the land of Egypt, to Pharaoh \n" +
                "   and to all his servants and to all his land, \n" +
                "12 and for all the mighty power and all the great deeds of terror that Moses did in the sight of all Israel.\n";

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
    }

    public void update() {

        camera.update();
    }

    public void render(SpriteBatch sb) {

        stage.draw();
    }

    public Table getTable34() {
        return table34;
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

    public Stage getStage() {
        return stage;
    }

    public void dispose(){
        contentFont.dispose();
        stage.dispose();
    }

    public OrthographicCamera getCamera() {
        return camera;
    }
}