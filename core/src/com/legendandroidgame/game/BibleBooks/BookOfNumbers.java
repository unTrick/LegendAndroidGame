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
public class BookOfNumbers {
    
    private Stage stage;
    private OrthographicCamera camera;

    BitmapFont contentFont;

    private Label txtFirstContent, txtSecondContent, txtThirdContent, txtFourthContent, txtFifthContent;
    private Label lblFirstTitle, lblSecondTitle, lblThirdTitle, lblFourthTitle, lblFifthTitle;

    private Texture tableBG;

    private Table table1, table2, table3, table4, table5, table6, table7, table8, table9, table10, table11, table12,
            table13, table14, table15, table16, table17, table18, table19, table20, table21, table22, table23,
            table24, table25, table26, table27, table28, table29, table30, table31, table32, table33, table34,
            table35, table36;



    public BookOfNumbers() {

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


        chapterOneOFNumbers();
        chapterTwoOFNumbers();
        chapterThreeOFNumbers();
        chapterFourOFNumbers();
        chapterFiveOFNumbers();
        chapterSixOFNumbers();
        chapterSevenOFNumbers();
        chapterEightOFNumbers();
        chapterNineOFNumbers();
        chapterTenOFNumbers();
        chapterElevenOFNumbers();
        chapterTwelveOFNumbers();
        chapterThirteenOFNumbers();
        chapterFourteenOFNumbers();
        chapterFifteenOFNumbers();
        chapterSixteenOFNumbers();
        chapterSeventeenOFNumbers();
        chapterEighteenOFNumbers();
        chapterNineteenOFNumbers();
        chapterTwentyOFNumbers();
        chapterTwentyOneOFNumbers();
        chapterTwentyTwoOFNumbers();
        chapterTwentyThreeOFNumbers();
        chapterTwentyFourOFNumbers();
        chapterTwentyFiveOFNumbers();
        chapterTwentySixOFNumbers();
        chapterTwentySevenOFNumbers();
        chapterTwentyEightOFNumbers();
        chapterTwentyNineOFNumbers();
        chapterThirtyOFNumbers();
        chapterThirtyOneOFNumbers();
        chapterThirtyTwoOFNumbers();
        chapterThirtyThreeOFNumbers();
        chapterThirtyFourOFNumbers();
        chapterThirtyFiveOFNumbers();
        chapterThirtySixOFNumbers();


    }


    public void chapterOneOFNumbers() {

        table1 = new Table();
        table1.setWidth(tableBG.getWidth());
        table1.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table1.setFillParent(true);
        table1.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "A Census of Israel's Warriors";

        String firstContent = "1 The LORD spoke to Moses in the wilderness of Sinai, in the tent of meeting, on the first day of the second month, \n" +
                "in the second year after they had come out of the land of Egypt, saying, \n" +
                "2 “Take a census of all the congregation of the people of Israel, by clans, by fathers' houses, according to the number of names, \n" +
                "every male, head by head. \n" +
                "3 From twenty years old and upward, all in Israel who are able to go to war, you and Aaron shall list them, company by company.\n" +
                "4 And there shall be with you a man from each tribe, each man being the head of the house of his fathers. \n" +
                "5 And these are the names of the men who shall assist you. From Reuben, Elizur the son of Shedeur; \n" +
                "6 from Simeon, Shelumiel the son of Zurishaddai; \n" +
                "7 from Judah, Nahshon the son of Amminadab;\n" +
                "8 from Issachar, Nethanel the son of Zuar; \n" +
                "9 from Zebulun, Eliab the son of Helon; \n" +
                "10 from the sons of Joseph, from Ephraim, Elishama the son of Ammihud, and from Manasseh, Gamaliel the son of Pedahzur;\n" +
                "11 from Benjamin, Abidan the son of Gideoni; \n" +
                "12 from Dan, Ahiezer the son of Ammishaddai; \n" +
                "13 from Asher, Pagiel the son of Ochran; \n" +
                "14 from Gad, Eliasaph the son of Deuel; \n" +
                "15 from Naphtali, Ahira the son of Enan.” \n" +
                "16 These were the ones chosen from the congregation, the chiefs of their ancestral tribes, and the heads of the clans of Israel.\n" +
                "17 Moses and Aaron took these men who had been named, \n" +
                "18 and on the first day of the second month, they assembled the whole congregation together, who registered themselves by clans, \n" +
                "by fathers' houses, according to the number of names from twenty years old and upward, head by head, \n" +
                "19 as the LORD commanded Moses. So he listed them in the wilderness of Sinai.\n" +
                "20 The people of Reuben, Israel's firstborn, their generations, by their clans, by their fathers' houses, \n" +
                "   according to the number of names, \n" +
                "head by head, every male from twenty years old and upward, all who were able to go to war: \n" +
                "21 those listed of the tribe of Reuben were 46,500.\n" +
                "22 Of the people of Simeon, their generations, by their clans, by their fathers' houses, those of them who were listed, \n" +
                "according to the number of names, head by head, every male from twenty years old and upward, all who were able to go to war: \n" +
                "23 those listed of the tribe of Simeon were 59,300.\n" +
                "24 Of the people of Gad, their generations, by their clans, by their fathers' houses, according to the number of the names, \n" +
                "from twenty years old and upward, all who were able to go to war: \n" +
                "25 those listed of the tribe of Gad were 45,650.\n" +
                "26 Of the people of Judah, their generations, by their clans, by their fathers' houses, according to the number of names, \n" +
                "from twenty years old and upward, every man able to go to war: \n" +
                "27 those listed of the tribe of Judah were 74,600.\n" +
                "28 Of the people of Issachar, their generations, by their clans, by their fathers' houses, according to the number of names, \n" +
                "from twenty years old and upward, every man able to go to war: \n" +
                "29 those listed of the tribe of Issachar were 54,400.\n" +
                "30 Of the people of Zebulun, their generations, by their clans, by their fathers' houses, according to the number of names, \n" +
                "from twenty years old and upward, every man able to go to war: \n" +
                "31 those listed of the tribe of Zebulun were b57,400.\n" +
                "32 Of the people of Joseph, namely, of the people of Ephraim, their generations, by their clans, by their fathers' houses, \n" +
                "according to the number of names, from twenty years old and upward, every man able to go to war: \n" +
                "33 those listed of the tribe of Ephraim were 40,500.\n" +
                "34 Of the people of Manasseh, their generations, by their clans, by their fathers' houses, according to the number of names, \n" +
                "from twenty years old and upward, every man able to go to war: \n" +
                "35 those listed of the tribe of Manasseh were 32,200.\n" +
                "36 Of the people of Benjamin, their generations, by their clans, by their fathers' houses, according to the number of names, \n" +
                "from twenty years old and upward, every man able to go to war: \n" +
                "37 those listed of the tribe of Benjamin were 35,400.\n" +
                "38 Of the people of Dan, their generations, by their clans, by their fathers' houses, according to the number of names, \n" +
                "from twenty years old and upward, every man able to go to war: \n" +
                "39 those listed of the tribe of Dan were 62,700.\n" +
                "40 Of the people of Asher, their generations, by their clans, by their fathers' houses, according to the number of names, \n" +
                "from twenty years old and upward, every man able to go to war: \n" +
                "41 those listed of the tribe of Asher were 41,500.\n" +
                "42 Of the people of Naphtali, their generations, by their clans, by their fathers' houses, according to the number of names, \n" +
                "from twenty years old and upward, every man able to go to war: \n" +
                "43 those listed of the tribe of Naphtali were 53,400.\n" +
                "44 These are those who were listed, whom Moses and Aaron listed with the help of the chiefs of Israel, twelve men, \n" +
                "each representing his fathers' house. \n" +
                "45 So all those listed of the people of Israel, by their fathers' houses, from twenty years old and upward, \n" +
                "   every man able to go to war in Israel—\n" +
                "46 all those listed were 603,550.\n";


        String chapterSecondTitle = "Levites Exempted";

        String secondContent = "47 But the Levites were not listed along with them by their ancestral tribe. \n" +
                "48 For the LORD spoke to Moses, saying, \n" +
                "49 “Only the tribe of Levi you shall not list, and you shall not take a census of them among the people of Israel. \n" +
                "50 But appoint the Levites over the tabernacle of the testimony, and over all its furnishings, and over all that belongs to it. \n" +
                "They are to carry the tabernacle and all its furnishings, and they shall take care of it and shall camp around the tabernacle.\n" +
                "51 When the tabernacle is to set out, the Levites shall take it down, and when the tabernacle is to be pitched, \n" +
                "   the Levites shall set it up. \n" +
                "And if any outsider comes near, he shall be put to death. \n" +
                "52 The people of Israel shall pitch their tents by their companies, each man in his own camp and each man by his own standard. \n" +
                "53 But the Levites shall camp around the tabernacle of the testimony, so that there may be no wrath \n" +
                "   on the congregation of the people of Israel. \n" +
                "And the Levites shall keep guard over the tabernacle of the testimony.” \n" +
                "54 Thus did the people of Israel; they did according to all that the LORD commanded Moses.\n";


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


    public void chapterTwoOFNumbers() {

        table2 = new Table();
        table2.setWidth(tableBG.getWidth());
        table2.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table2.setFillParent(true);
        table2.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Arrangement of the Camp";

        String firstContent = "1 The LORD spoke to Moses and Aaron, saying, \n" +
                "2 “The people of Israel shall camp each by his own standard, with the banners of their fathers' houses. \n" +
                "   They shall camp facing the tent of meeting on every side.\n" +
                "3 Those to camp on the east side toward the sunrise shall be of the standard of the camp of Judah by their companies, \n" +
                "   the chief of the people of Judah being Nahshon the son of Amminadab, \n" +
                "4 his company as listed being 74,600. \n" +
                "5 Those to camp next to him shall be the tribe of Issachar, the chief of the people of Issachar being Nethanel the son of Zuar,\n" +
                "6 his company as listed being 54,400.\n" +
                "7 Then the tribe of Zebulun, the chief of the people of Zebulun being Eliab the son of Helon,\n" +
                "8 his company as listed being 57,400.\n" +
                "9 All those listed of the camp of Judah, by their companies, were 186,400. They shall set out first on the march.\n" +
                "10 “On the south side shall be the standard of the camp of Reuben by their companies, \n" +
                "   the chief of the people of Reuben being Elizur the son of Shedeur,\n" +
                "11 his company as listed being 46,500. \n" +
                "12 And those to camp next to him shall be the tribe of Simeon, the chief of the people of Simeon being Shelumiel the son of Zurishaddai, \n" +
                "13 his company as listed being 59,300. \n" +
                "14 Then the tribe of Gad, the chief of the people of Gad being Eliasaph the son of Reuel, \n" +
                "15 his company as listed being 45,650.\n" +
                "16 All those listed of the camp of Reuben, by their companies, were 151,450. They shall set out second.\n" +
                "17 “Then the tent of meeting shall set out, with the camp of the Levites in the midst of the camps; \n" +
                "   as they camp, so shall they set out, each in position, standard by standard.\n" +
                "18 “On the west side shall be the standard of the camp of Ephraim by their companies, \n" +
                "   the chief of the people of Ephraim being Elishama the son of Ammihud, \n" +
                "19 his company as listed being 40,500. \n" +
                "20 And next to him shall be the tribe of Manasseh, the chief of the people of Manasseh being Gamaliel the son of Pedahzur, \n" +
                "21 his company as listed being 32,200.\n" +
                "22 Then the tribe of Benjamin, the chief of the people of Benjamin being Abidan the son of Gideoni, \n" +
                "23 his company as listed being 35,400. \n" +
                "24 All those listed of the camp of Ephraim, by their companies, were 108,100. They shall set out third on the march.\n" +
                "25 “On the north side shall be the standard of the camp of Dan by their companies, \n" +
                "   the chief of the people of Dan being Ahiezer the son of Ammishaddai, \n" +
                "26 his company as listed being 62,700. \n" +
                "27 And those to camp next to him shall be the tribe of Asher, the chief of the people of Asher being Pagiel the son of Ochran, \n" +
                "28 his company as listed being 41,500. \n" +
                "29 Then the tribe of Naphtali, the chief of the people of Naphtali being Ahira the son of Enan, \n" +
                "30 his company as listed being 53,400. \n" +
                "31 All those listed of the camp of Dan were 157,600. They shall set out last, standard by standard.”\n" +
                "32 These are the people of Israel as listed by their fathers' houses. All those listed in the camps by their companies were 603,550. \n" +
                "33 But the Levites were not listed among the people of Israel, as the LORD commanded Moses.\n" +
                "34 Thus did the people of Israel. According to all that the LORD commanded Moses, so they camped by their standards, and so they set out, \n" +
                "   each one in his clan, according to his fathers' house.\n";


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

    public void chapterThreeOFNumbers() {

        table3 = new Table();
        table3.setWidth(tableBG.getWidth());
        table3.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table3.setFillParent(true);
        table3.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Sons of Aaron";

        String firstContent = "1 These are the generations of Aaron and Moses at the time when the LORD spoke with Moses on Mount Sinai. \n" +
                "2 These are the names of the sons of Aaron: Nadab the firstborn, and Abihu, Eleazar, and Ithamar. \n" +
                "3 These are the names of the sons of Aaron, the anointed priests, whom he ordained to serve as priests. \n" +
                "4 But Nadab and Abihu died before the LORD when they offered unauthorized fire before theLORD in the wilderness of Sinai, \n" +
                "   and they had no children. So Eleazar and Ithamar served as priests in the lifetime of Aaron their father.\n";


        String chapterSecondTitle = "Duties of the Levites";

        String secondContent = "5 And the LORD spoke to Moses, saying, \n" +
                "6 “Bring the tribe of Levi near, and set them before Aaron the priest, that they may minister to him. \n" +
                "7 They shall keep guard over him and over the whole congregation before the tent of meeting, as they minister at the tabernacle. \n" +
                "8 They shall guard all the furnishings of the tent of meeting, and keep guard over the people of Israel as they minister at the tabernacle. \n" +
                "9 And you shall give the Levites to Aaron and his sons; they are wholly given to him from among the people of Israel. \n" +
                "10 And you shall appoint Aaron and his sons, and they shall guard their priesthood. But if any outsider comes near, \n" +
                "   he shall be put to death.”\n" +
                "11 And the LORD spoke to Moses, saying, \n" +
                "12 “Behold, I have taken the Levites from among the people of Israel instead of every firstborn who opens the womb among the people of Israel. \n" +
                "   The Levites shall be mine,\n" +
                "13 for all the firstborn are mine.  On the day that I struck down all the firstborn in the land of Egypt, \n" +
                "   I consecrated for my own all the firstborn in Israel, both of man and of beast. They shall be mine: I am the LORD.”\n" +
                "14 And the LORD spoke to Moses in the wilderness of Sinai, saying,\n" +
                "15 “List the sons of Levi, by fathers' houses and by clans; every male from a month old and upward you shall list.” \n" +
                "16 So Moses listed them according to the word of the LORD, as he was commanded. \n" +
                "17 And these were the sons of Levi by their names: Gershon and Kohath and Merari.\n" +
                "18 And these are the names of the sons of Gershon by their clans: Libni and Shimei. \n" +
                "19 And the sons of Kohath by their clans: Amram, Izhar, Hebron, and Uzziel. \n" +
                "20 And the sons of Merari by their clans: Mahli and Mushi. These are the clans of the Levites, by their fathers' houses.\n" +
                "21 To Gershon belonged the clan of the Libnites and the clan of the Shimeites; these were the clans of the Gershonites. \n" +
                "22 Their listing according to the number of all the males from a month old and upward was 7,500. \n" +
                "23 The clans of the Gershonites were to camp behind the tabernacle on the west,\n" +
                "24 with Eliasaph, the son of Lael as chief of the fathers' house of the Gershonites. \n" +
                "25 And the guard duty of the sons of Gershon in the tent of meeting involved the tabernacle, the tent with its covering, \n" +
                "   the screen for the entrance of the tent of meeting, \n" +
                "26 the hangings of the court, the screen for the door of the court that is around the tabernacle and the altar, \n" +
                "   and its cords—all the service connected with these.\n" +
                "27 To Kohath belonged the clan of the Amramites and the clan of the Izharites and the clan of the Hebronites \n" +
                "   and the clan of the Uzzielites; \n" +
                "   these are the clans of the Kohathites.\n" +
                "28 According to the number of all the males, from a month old and upward, there were 8,600, keeping guard over the sanctuary.\n" +
                "29 The clans of the sons of Kohath were to camp on the south side of the tabernacle, \n" +
                "30 with Elizaphan the son of Uzziel as chief of the fathers' house of the clans of the Kohathites. \n" +
                "31 And their guard duty involved gthe ark, the table, ithe lampstand, jthe altars, \n" +
                "   the vessels of the sanctuary with which the priests minister, \n" +
                "   andkthe screen; all the service connected with these. \n" +
                "32 And Eleazar the son of Aaron the priest was to be chief over the chiefs of the Levites, \n" +
                "   and to have oversight of those who kept guard over the sanctuary.\n" +
                "33 To Merari belonged the clan of the Mahlites and the clan of the Mushites: these are the clans of Merari. \n" +
                "34 Their listing according to the number of all the males from a month old and upward was 6,200. \n" +
                "35 And the chief of the fathers' house of the clans of Merari was Zuriel the son of Abihail. \n" +
                "   They were to camp on the north side of the tabernacle. \n" +
                "36 And the appointed guard duty of the sons of Merari involved the frames of the tabernacle, the bars, the pillars, the bases, \n" +
                "   and all their accessories; all the service connected with these; \n" +
                "37 also the pillars around the court, with their bases and pegs and cords.\n" +
                "38 Those who were to camp before the tabernacle on the east, before the tent of meeting toward the sunrise, \n" +
                "   were Moses and Aaron and his sons, guarding the sanctuary itself, to protect the people of Israel. \n" +
                "   And any outsider who came near was to be put to death. \n" +
                "39 All those listed among the Levites, whom Moses and Aaron listed at the commandment of the LORD, by clans, \n" +
                "   all the males from a month old and upward, were 22,000.\n";

        String chapterThirdTitle = "Redemption of the Firstborn";

        String thirdContent = "40 And the LORD said to Moses, “List all the firstborn males of the people of Israel, from a month old and upward, \n" +
                "   taking the number of their names. \n" +
                "41 And you shall take the Levites for me—I am the LORD—instead of all the firstborn among the people of Israel, \n" +
                "   and the cattle of the Levites instead of all the firstborn among the cattle of the people of Israel.” \n" +
                "42 So Moses listed all the firstborn among the people of Israel, as the LORD commanded him. \n" +
                "43 And all the firstborn males, according to the number of names, from a month old and upward as listed were 22,273.\n" +
                "44 And the LORD spoke to Moses, saying, \n" +
                "45 “Take the Levites instead of all the firstborn among the people of Israel, and the cattle of the Levites instead of their cattle. \n" +
                "   The Levites shall be mine: I am the LORD.\n" +
                "46 And as the redemption price for the 273 of the firstborn of the people of Israel, over and above the number of the male Levites, \n" +
                "47 you shall take five shekels3 per head; you shall take them according to the shekel of the sanctuary (the shekel of twenty gerahs), \n" +
                "48 and give the money to Aaron and his sons as the redemption price for those who are over.” \n" +
                "49 So Moses took the redemption money from those who were over and above those redeemed by the Levites. \n" +
                "50 From the firstborn of the people of Israel he took the money, 1,365 shekels, by the shekel of the sanctuary. \n" +
                "51 And Moses gave the redemption money to Aaron and his sons, according to the word of the LORD, as the LORD commanded Moses.\n";


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
        table3.row();

        //title of the third content
        table3.add(lblThirdTitle).pad(10,50,0,0).left();
        table3.row();

        //content of the third title
        table3.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table3);

    }


    public void chapterFourOFNumbers() {

        table4 = new Table();
        table4.setWidth(tableBG.getWidth());
        table4.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table4.setFillParent(true);
        table4.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Duties of the Kohathites, Gershonites, and Merarites";

        String firstContent = "1 The LORD spoke to Moses and Aaron, saying, \n" +
                "2 “Take a census of the sons of Kohath from among the sons of Levi, by their clans and their fathers' houses,\n" +
                "3 from thirty years old up to fifty years old, all who can come on duty, to do the work in the tent of meeting. \n" +
                "4 This is the service of the sons of Kohath in the tent of meeting: the most holy things.\n" +
                "5 When the camp is to set out, Aaron and his sons shall go in and take down the veil of the screen \n" +
                "   and cover the ark of the testimony with it.\n" +
                "6 Then they shall put on it a covering of goatskin and spread on top of that a cloth all of blue, and shall put in its poles. \n" +
                "7 And over the table of the bread of the Presence they shall spread a cloth of blue and put on it the plates, the dishes for incense, \n" +
                "   the bowls, and the flagons for the drink offering; the regular showbread also shall be on it.\n" +
                "8 Then they shall spread over them a cloth of scarlet and cover the same with a covering of goatskin, and shall put in its poles. \n" +
                "9 And they shall take a cloth of blue and cover the lampstand for the light, with its lamps, its tongs, its trays, \n" +
                "   and all the vessels for oil with which it is supplied.\n" +
                "10 And they shall put it with all its utensils in a covering of goatskin and put it on the carrying frame. \n" +
                "11 And over the golden altar they shall spread a cloth of blue and cover it with a covering of goatskin, and shall put in its poles. \n" +
                "12 And they shall take all the vessels of the service that are used in the sanctuary and put them in a cloth of blue \n" +
                "   and cover them with a covering of goatskin and put them on the carrying frame. \n" +
                "13 And they shall take away the ashes from the altar and spread a purple cloth over it.\n" +
                "14 And they shall put on it all the utensils of the altar, which are used for the service there, the fire pans, the forks, the shovels, \n" +
                "   and the basins, all the utensils of the altar; and they shall spread on it a covering of goatskin, and shall put in its poles. \n" +
                "15 And when Aaron and his sons have finished covering the sanctuary and all the furnishings of the sanctuary, as the camp sets out, \n" +
                "   after that the sons of Kohath shall come to carry these, but they must not touch the holy things, lest they die.\n" +
                "    These are the things of the tent of meeting that the sons of Kohath are to carry.\n" +
                "16 “And Eleazar the son of Aaron the priest shall have charge of the oil for the light, the fragrant incense, the regular grain offering, \n" +
                "   and the anointing oil, with the oversight of the whole tabernacle and all that is in it, of the sanctuary and its vessels.”\n" +
                "17 The LORD spoke to Moses and Aaron, saying, \n" +
                "18 “Let not the tribe of the clans of the Kohathites be destroyed from among the Levites,\n" +
                "19 but deal thus with them, that they may live and not die when they come near to the most holy things: \n" +
                "   Aaron and his sons shall go in and appoint them each to his task and to his burden, \n" +
                "20 but they shall not go in to look on the holy things even for a moment, lest they die.”\n" +
                "21 The LORD spoke to Moses, saying, \n" +
                "22 “Take a census of the sons of Gershon also, by their fathers' houses and by their clans. \n" +
                "23 From thirty years old up to fifty years old, you shall list them, all who can come to do duty, to do service in the tent of meeting. \n" +
                "24 This is the service of the clans of the Gershonites, in serving and bearing burdens:\n" +
                "25 they shall carry the curtains of the tabernacle and the tent of meeting with its covering and the covering of goatskin that is on top of it \n" +
                "   and the screen for the entrance of the tent of meeting \n" +
                "26 and the hangings of the court and the screen for the entrance of the gate of the court that is around the tabernacle and the altar, \n" +
                "   and their cords and all the equipment for their service. And they shall do all that needs to be done with regard to them.\n" +
                "27 All the service of the sons of the Gershonites shall be at the command of Aaron and his sons, \n" +
                "   in all that they are to carry and in all that they have to do. And you shall assign to their charge all that they are to carry.\n" +
                "28 This is the service of the clans of the sons of the Gershonites in the tent of meeting, \n" +
                "   and their guard duty is to be under the direction of Ithamar the son of Aaron the priest.\n" +
                "29 “As for the sons of Merari, you shall list them by their clans and their fathers' houses. \n" +
                "30 From thirty years old up to fifty years old, you shall list them, everyone who can come on duty, \n" +
                "   to do the service of the tent of meeting.\n" +
                "31 And this is what they are charged to carry, as the whole of their service in the tent of meeting: \n" +
                "   the frames of the tabernacle, with its bars,\n" +
                "    pillars, and bases, \n" +
                "32 and the pillars around the court with their bases, pegs, and cords, with all their equipment and all their accessories. \n" +
                "   And you shall list by name the objects that they are required to carry. \n" +
                "33 This is the service of the clans of the sons of Merari, the whole of their service in the tent of meeting, \n" +
                "   under the direction of Ithamar the son of Aaron the priest.”\n" +
                "34 And Moses and Aaron and the chiefs of the congregation listed the sons of the Kohathites, by their clans and their fathers' houses, \n" +
                "35 from thirty years old up to fifty years old, everyone who could come on duty, for service in the tent of meeting; \n" +
                "36 and those listed by clans were 2,750.\n" +
                "37 This was the list of the clans of the Kohathites, all who served in the tent of meeting, whom Moses and \n" +
                "   Aaron listed according to the commandment of the LORD by Moses.\n" +
                "38 Those listed of the sons of Gershon, by their clans and their fathers' houses, \n" +
                "39 from thirty years old up to fifty years old, everyone who could come on duty for service in the tent of meeting—\n" +
                "40 those listed by their clans and their fathers' houses were 2,630. \n" +
                "41 This was the list of the clans of the sons of Gershon, all who served in the tent of meeting, whom Moses and \n" +
                "   Aaron listed according to the commandment of the LORD.\n" +
                "42 Those listed of the clans of the sons of Merari, by their clans and their fathers' houses, \n" +
                "43 from thirty years old up to fifty years old, everyone who could come on duty, for service in the tent of meeting—\n" +
                "44 those listed by clans were 3,200. \n" +
                "45 This was the list of the clans of the sons of Merari, whom Moses and Aaron listed according to the commandment of the LORD by Moses.\n" +
                "46 All those who were listed of the Levites, whom Moses and Aaron and the chiefs of Israel listed, by their clans and their fathers' houses,\n" +
                "47 from thirty years old up to fifty years old, everyone who could come to do the service of ministry \n" +
                "   and the service of bearing burdens in the tent of meeting, \n" +
                "48 those listed were 8,580. \n" +
                "49 According to the commandment of the LORD through Moses they were listed, each one with his task of serving or carrying. \n" +
                "   Thus they were listed by him, as the LORD commanded Moses.\n";


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


    public void chapterFiveOFNumbers() {

        table5 = new Table();
        table5.setWidth(tableBG.getWidth());
        table5.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table5.setFillParent(true);
        table5.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Unclean People";

        String firstContent = "1 The LORD spoke to Moses, saying, \n" +
                "2 “Command the people of Israel that they put out of the camp everyone who is leprous or has a discharge \n" +
                "   and everyone who is unclean through contact with the dead.\n" +
                "3 You shall put out both male and female, putting them outside the camp, that they may not defile their camp, in the midst of which I dwell.”\n" +
                "4 And the people of Israel did so, and put them outside the camp; as the LORD said to Moses, so the people of Israel did.\n";


        String chapterSecondTitle = "Confession and Restitution";

        String secondContent = "5 And the LORD spoke to Moses, saying, \n" +
                "6 “Speak to the people of Israel, When a man or woman commits any of the sins that people commit by breaking faith with the LORD, \n" +
                "   and that person realizes his guilt, \n" +
                "7 he shall confess his sin that he has committed. And he shall make full restitution for his wrong, \n" +
                "   adding a fifth to it and giving it to him to whom he did the wrong. \n" +
                "8 But if the man has no next of kin to whom restitution may be made for the wrong, the restitution \n" +
                "   for wrong shall go to the LORD for the priest, \n" +
                "   in addition to the ram of atonement with which atonement is made for him. \n" +
                "9 And every contribution, all the holy donations of the people of Israel, which they bring to the priest, shall be his. \n" +
                "10 Each one shall keep his holy donations: whatever anyone gives to the priest shall be his.”\n";


        String chapterThirdTitle = "A Test for Adultery";

        String thirdContent = "11 And the LORD spoke to Moses, saying, \n" +
                "12 “Speak to the people of Israel, if any man's wife goes astray and breaks faith with him, \n" +
                "13 if a man lies with her sexually, and it is hidden from the eyes of her husband, and she is undetected though she has defiled herself, \n" +
                "   and there is no witness against her, since she was not taken in the act, \n" +
                "14 and if the spirit of jealousy comes over him and he is jealous of his wife who has defiled herself, \n" +
                "   or if the spirit of jealousy comes over him and he is jealous of his wife, though she has not defiled herself, \n" +
                "15 then the man shall bring his wife to the priest and bring the offering required of her, a tenth of an ephah of barley flour. \n" +
                "   He shall pour no oil on it and put no frankincense on it, for it is a grain offering of jealousy, \n" +
                "   a grain offering of remembrance, bringing iniquity to remembrance.\n" +
                "16 “And the priest shall bring her near and set her before the LORD.\n" +
                "17 And the priest shall take holy water in an earthenware vessel and take some of the dust that is on the floor of the tabernacle \n" +
                "   and put it into the water. \n" +
                "18 And the priest shall set the woman before the LORD and unbind the hair of the woman's head \n" +
                "   and place in her hands the grain offering of remembrance,\n" +
                "    which is the grain offering of jealousy. And in his hand the priest shall have the water of bitterness that brings the curse. \n" +
                "19 Then the priest shall make her take an oath, saying, ‘If no man has lain with you, \n" +
                "   and if you have not turned aside to uncleanness while you were under your husband's authority, \n" +
                "   be free from this water of bitterness that brings the curse. \n" +
                "20 But if you have gone astray, though you are under your husband's authority, and if you have defiled yourself, \n" +
                "   and some man other than your husband has lain with you, \n" +
                "21 then’ (let the priest make the woman take the oath of the curse, and say to the woman) \n" +
                "   ‘the LORD make you a curse and an oath among your people, when the LORD makes your thigh fall away and your body swell. \n" +
                "22 May this water that brings the curse pass into your bowels and make your womb swell and your thigh fall away.’ \n" +
                "   And the woman shall say, ‘Amen, Amen.’\n" +
                "23 “Then the priest shall write these curses in a book and wash them off into the water of bitterness. \n" +
                "24 And he shall make the woman drink the water of bitterness that brings the curse, \n" +
                "   and the water that brings the curse shall enter into her \n" +
                "   and cause bitter pain. \n" +
                "25 And the priest shall take the grain offering of jealousy out of the woman's hand and shall wave the grain offering before the LORD \n" +
                "   and bring it to the altar.\n" +
                "26 And the priest shall take a handful of the grain offering, as its memorial portion, and burn it on the altar, \n" +
                "   and afterward shall make the woman drink the water. \n" +
                "27 And when he has made her drink the water, then, if she has defiled herself and has broken faith with her husband, \n" +
                "   the water that brings the curse shall enter into her and cause bitter pain, and her womb shall swell, and her thigh shall fall away, \n" +
                "   and the woman shall become a curse among her people. \n" +
                "28 But if the woman has not defiled herself and is clean, then she shall be free and shall conceive children.\n" +
                "29 “This is the law in cases of jealousy, when a wife, though under her husband's authority, goes astray and defiles herself, \n" +
                "30 or when the spirit of jealousy comes over a man and he is jealous of his wife. \n" +
                "   Then he shall set the woman before the LORD, and the priest shall carry out for her all this law. \n" +
                "31 The man shall be free from iniquity, but the woman shall bear her iniquity.”\n";


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
        table5.row();

        //title of the third content
        table5.add(lblThirdTitle).pad(10,50,0,0).left();
        table5.row();

        //content of the third title
        table5.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table5);


    }


    public void chapterSixOFNumbers() {

        table6 = new Table();
        table6.setWidth(tableBG.getWidth());
        table6.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table6.setFillParent(true);
        table6.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Nazirite Vow";

        String firstContent = "1 And the LORD spoke to Moses, saying, \n" +
                "2 “Speak to the people of Israel and say to them, When either a man or a woman makes a special vow, the vow of a Nazirite, \n" +
                "   to separate himself to the LORD,\n" +
                "3 he shall separate himself from wine and strong drink. He shall drink no vinegar made from wine or strong drink \n" +
                "   and shall not drink any juice of grapes or eat grapes, fresh or dried. \n" +
                "4 All the days of his separation he shall eat nothing that is produced by the grapevine, not even the seeds or the skins.\n" +
                "5 “All the days of his vow of separation, no razor shall touch his head. Until the time is completed \n" +
                "   for which he separates himself to the LORD, he shall be holy. He shall let the locks of hair of his head grow long.\n" +
                "6 “All the days that he separates himself to the LORD he shall not go near a dead body. \n" +
                "7 Not even for his father or for his mother, for brother or sister, if they die, shall he make himself unclean, \n" +
                "   because his separation to God is on his head.\n" +
                "8 All the days of his separation he is holy to the LORD.\n" +
                "9 “And if any man dies very suddenly beside him and he defiles his consecrated head, \n" +
                "   then he shall shave his head on the day of his cleansing; \n" +
                "   on the seventh day he shall shave it. \n" +
                "10 On the eighth day he shall bring two turtledoves or two pigeons to the priest to the entrance of the tent of meeting, \n" +
                "11 and the priest shall offer one for a sin offering and the other for a burnt offering, and make atonement for him, \n" +
                "   because he sinned by reason of the dead body. And he shall consecrate his head that same day \n" +
                "12 and separate himself to the LORD for the days of his separation and bring a male lamb a year old for a guilt offering. \n" +
                "   But the previous period shall be void, because his separation was defiled.\n" +
                "13 “And this is the law for the Nazirite, when the time of his separation has been completed: \n" +
                "   he shall be brought to the entrance of the tent of meeting, \n" +
                "14 and he shall bring his gift to the LORD, one male lamb a year old without blemish for a burnt offering, \n" +
                "   and one ewe lamb a year old without blemish as a sin offering, and one ram without blemish as a peace offering, \n" +
                "15 and a basket of unleavened bread, loaves of fine flour mixed with oil, and unleavened wafers smeared with oil, \n" +
                "   and their grain offering and their drink offerings. \n" +
                "16 And the priest shall bring them before the LORD and offer his sin offering and his burnt offering, \n" +
                "17 and he shall offer the ram as a sacrifice of peace offering to the LORD, with the basket of unleavened bread. \n" +
                "   The priest shall offer also its grain offering and its drink offering.\n" +
                "18 And the Nazirite shall shave his consecrated head at the entrance of the tent of meeting \n" +
                "   and shall take the hair from his consecrated head \n" +
                "   and put it on the fire that is under the sacrifice of the peace offering. \n" +
                "19 And the priest shall take the shoulder of the ram, when it is boiled, \n" +
                "   and one unleavened loaf out of the basket and one unleavened wafer, \n" +
                "   and shall put them on the hands of the Nazirite, after he has shaved the hair of his consecration,\n" +
                "20 and the priest shall wave them for a wave offering before the LORD. They are a holy portion for the priest, \n" +
                "   together with the breast that is waved and the thigh that is contributed. And after that the Nazirite may drink wine.\n" +
                "21 “This is the law of the Nazirite. But if he vows an offering to the LORD above his Nazirite vow, as he can afford, \n" +
                "   in exact accordance with the vow that he takes, then he shall do in addition to the law of the Nazirite.”\n";


        String chapterSecondTitle = "Aaron's Blessing";

        String secondContent = "22 The LORD spoke to Moses, saying, \n" +
                "23 “Speak to Aaron and his sons, saying, Thus you shall bless the people of Israel: you shall say to them,\n" +
                "24 The LORD bless you and keep you;\n" +
                "25 the LORD make his face to shine upon you and be gracious to you;\n" +
                "26 the LORD lift up his countenance upon you and give you peace.\n" +
                "27 “So shall they put my name upon the people of Israel, and I will bless them.”\n";


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


    public void chapterSevenOFNumbers() {

        table7 = new Table();
        table7.setWidth(tableBG.getWidth());
        table7.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table7.setFillParent(true);
        table7.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Offerings at the Tabernacle's Consecration";

        String firstContent = "1 On the day when Moses had finished setting up the tabernacle and had anointed \n" +
                "   and consecrated it with all its furnishings and had anointed and consecrated the altar with all its utensils,\n" +
                "2 the chiefs of Israel, heads of their fathers' houses, who were the chiefs of the tribes, who were over those who were listed, approached \n" +
                "3 and brought their offerings before the LORD, six wagons and twelve oxen, a wagon for every two of the chiefs, and for each one an ox. \n" +
                "   They brought them before the tabernacle.\n" +
                "4 Then the LORD said to Moses,\n" +
                "5 “Accept these from them, that they may be used in the service of the tent of meeting, and give them to the Levites, \n" +
                "   to each man according to his service.” \n" +
                "6 So Moses took the wagons and the oxen and gave them to the Levites. \n" +
                "7 Two wagons and four oxen he gave to the sons of Gershon, according to their service. \n" +
                "8 And four wagons and eight oxen he gave to the sons of Merari, according to their service, \n" +
                "   under the direction of Ithamar the son of Aaron the priest. \n" +
                "9 But to the sons of Kohath he gave none, because they were charged with the service of the holy things \n" +
                "   that had to be carried on the shoulder. \n" +
                "10 And the chiefs offered offerings for the dedication of the altar on the day it was anointed; \n" +
                "   and the chiefs offered their offering before the altar. \n" +
                "11 And the LORD said to Moses, “They shall offer their offerings, one chief each day, for the dedication of the altar.”\n" +
                "12 He who offered his offering the first day was Nahshon the son of Amminadab, of the tribe of Judah. \n" +
                "13 And his offering was one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, both of them full of fine flour mixed with oil for a grain offering; \n" +
                "14 one golden dish of 10 shekels, full of incense; \n" +
                "15 one bull from the herd, one ram, one male lamb a year old, for a burnt offering; \n" +
                "16 one male goat for a sin offering; \n" +
                "17 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. \n" +
                "   This was the offering of Nahshon the son of Amminadab.\n" +
                "18 On the second day Nethanel the son of Zuar, the chief of Issachar, made an offering. \n" +
                "19 He offered for his offering one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, both of them full of fine flour mixed with oil for a grain offering;\n" +
                "20 one golden dish of 10 shekels, full of incense; \n" +
                "21 one bull from the herd, one ram, one male lamb a year old, for a burnt offering;\n" +
                "22 one male goat for a sin offering; \n" +
                "23 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. \n" +
                "   This was the offering of Nethanel the son of Zuar.\n" +
                "24 On the third day Eliab the son of Helon, the chief of the people of Zebulun:\n" +
                "25 his offering was one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, both of them full of fine flour mixed with oil for a grain offering; \n" +
                "26 one golden dish of 10 shekels, full of incense; \n" +
                "27 one bull from the herd, one ram, one male lamb a year old, for a burnt offering; \n" +
                "28 one male goat for a sin offering; \n" +
                "29 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. T\n" +
                "   his was the offering of Eliab the son of Helon.\n" +
                "30 On the fourth day Elizur the son of Shedeur, the chief of the people of Reuben: \n" +
                "31 his offering was one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, both of them full of fine flour mixed with oil for a grain offering; \n" +
                "32 one golden dish of 10 shekels, full of incense; \n" +
                "33 one bull from the herd, one ram, one male lamb a year old, for a burnt offering; \n" +
                "34 one male goat for a sin offering; \n" +
                "35 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. \n" +
                "   This was the offering of Elizur the son of Shedeur.\n" +
                "36 On the fifth day Shelumiel the son of Zurishaddai, the chief of the people of Simeon: \n" +
                "37 his offering was one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, \n" +
                "   both of them full of fine flour mixed with oil for a grain offering; \n" +
                "38 one golden dish of 10 shekels, full of incense; \n" +
                "39 one bull from the herd, one ram, one male lamb a year old, for a burnt offering; \n" +
                "40 one male goat for a sin offering; \n" +
                "41 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. \n" +
                "   This was the offering of Shelumiel the son of Zurishaddai.\n" +
                "42 On the sixth day Eliasaph the son of Deuel, the chief of the people of Gad: \n" +
                "43 his offering was one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, \n" +
                "   both of them full of fine flour mixed with oil for a grain offering; \n" +
                "44 one golden dish of 10 shekels, full of incense;\n" +
                "45 one bull from the herd, one ram, one male lamb a year old, for a burnt offering; \n" +
                "46 one male goat for a sin offering; \n" +
                "47 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. \n" +
                "   This was the offering of Eliasaph the son of Deuel.\n" +
                "48 On the seventh day Elishama the son of Ammihud, the chief of the people of Ephraim: \n" +
                "49 his offering was one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, both of them full of fine flour mixed with oil for a grain offering; \n" +
                "50 one golden dish of 10 shekels, full of incense; \n" +
                "51 one bull from the herd, one ram, one male lamb a year old, for a burnt offering;\n" +
                "52 one male goat for a sin offering; \n" +
                "53 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. \n" +
                "   This was the offering of Elishama the son of Ammihud.\n" +
                "54 On the eighth day Gamaliel the son of Pedahzur, the chief of the people of Manasseh: \n" +
                "55 his offering was one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, \n" +
                "   both of them full of fine flour mixed with oil for a grain offering; \n" +
                "56 one golden dish of 10 shekels, full of incense; \n" +
                "57 one bull from the herd, one ram, one male lamb a year old, for a burnt offering; \n" +
                "58 one male goat for a sin offering;\n" +
                "59 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. \n" +
                "   This was the offering of Gamaliel the son of Pedahzur.\n" +
                "60 On the ninth day Abidan the son of Gideoni, the chief of the people of Benjamin: \n" +
                "61 his offering was one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, both of them full of fine flour mixed with oil for a grain offering;\n" +
                "62 one golden dish of 10 shekels, full of incense; \n" +
                "63 one bull from the herd, one ram, one male lamb a year old, for a burnt offering; \n" +
                "64 one male goat for a sin offering; \n" +
                "65 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. \n" +
                "   This was the offering of Abidan the son of Gideoni.\n" +
                "66 On the tenth day Ahiezer the son of Ammishaddai, the chief of the people of Dan: \n" +
                "67 his offering was one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, both of them full of fine flour mixed with oil for a grain offering; \n" +
                "68 one golden dish of 10 shekels, full of incense; \n" +
                "69 one bull from the herd, one ram, one male lamb a year old, for a burnt offering; \n" +
                "70 one male goat for a sin offering; \n" +
                "71 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. \n" +
                "   This was the offering of Ahiezer the son of Ammishaddai.\n" +
                "72 On the eleventh day Pagiel the son of Ochran, the chief of the people of Asher: \n" +
                "73 his offering was one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, \n" +
                "   both of them full of fine flour mixed with oil for a grain offering; \n" +
                "74 one golden dish of 10 shekels, full of incense; \n" +
                "75 one bull from the herd, one ram, one male lamb a year old, for a burnt offering; \n" +
                "76 one male goat for a sin offering; \n" +
                "77 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. \n" +
                "   This was the offering of Pagiel the son of Ochran.\n" +
                "78 On the twelfth day Ahira the son of Enan, the chief of the people of Naphtali: \n" +
                "79 his offering was one silver plate whose weight was 130 shekels, one silver basin of 70 shekels, \n" +
                "   according to the shekel of the sanctuary, \n" +
                "   both of them full of fine flour mixed with oil for a grain offering; \n" +
                "80 one golden dish of 10 shekels, full of incense;\n" +
                "81 one bull from the herd, one ram, one male lamb a year old, for a burnt offering; \n" +
                "82 one male goat for a sin offering;\n" +
                "83 and for the sacrifice of peace offerings, two oxen, five rams, five male goats, and five male lambs a year old. \n" +
                "   This was the offering of Ahira the son of Enan.\n" +
                "84 This was the dedication offering for the altar on the day when it was anointed, from the chiefs of Israel: twelve silver plates, \n" +
                "   twelve silver basins, twelve golden dishes, \n" +
                "85 each silver plate weighing 130 shekels and each basin 70, all the silver of the vessels 2,400 shekels \n" +
                "   according to the shekel of the sanctuary, \n" +
                "86 the twelve golden dishes, full of incense, weighing 10 shekels apiece according to the shekel of the sanctuary, \n" +
                "   all the gold of the dishes being 120 shekels; \n" +
                "87 all the cattle for the burnt offering twelve bulls, twelve rams, twelve male lambs a year old, with their grain offering; \n" +
                "   and twelve male goats for a sin offering;\n" +
                "88 and all the cattle for the sacrifice of peace offerings twenty-four bulls, the rams sixty, the male goats sixty, \n" +
                "   the male lambs a year old sixty. This was the dedication offering for the altar after it was anointed.\n" +
                "89 And when Moses went into the tent of meeting to speak with the LORD, he heard the voice speaking to him from above the mercy seat \n" +
                "   that was on the ark of the testimony, from between the two cherubim; and it spoke to him.\n";


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


    public void chapterEightOFNumbers() {

        table8 = new Table();
        table8.setWidth(tableBG.getWidth());
        table8.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table8.setFillParent(true);
        table8.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Seven Lamps";

        String firstContent = "1 Now the LORD spoke to Moses, saying, \n" +
                "2 “Speak to Aaron and say to him, When you set up the lamps, the seven lamps shall give light in front of the lampstand.”\n" +
                "3 And Aaron did so: he set up its lamps in front of the lampstand, as the LORD commanded Moses. \n" +
                "4 And this was the workmanship of the lampstand, hammered work of gold. From its base to its flowers,\n" +
                "    it was hammered work; according to the pattern that the LORD had shown Moses, so he made the lampstand.\n";


        String chapterSecondTitle = "Cleansing of the Levites";

        String secondContent = "5 And the LORD spoke to Moses, saying, \n" +
                "6 “Take the Levites from among the people of Israel and cleanse them. \n" +
                "7 Thus you shall do to them to cleanse them: sprinkle the water of purification upon them, \n" +
                "   and let them go with a razor over all their body, and wash their clothes and cleanse themselves.\n" +
                "8 Then let them take a bull from the herd and its grain offering of fine flour mixed with oil, \n" +
                "   and you shall take another bull from the herd for a sin offering.\n" +
                "9 And you shall bring the Levites before the tent of meeting and assemble the whole congregation of the people of Israel. \n" +
                "10 When you bring the Levites before the LORD, the people of Israel shall lay their hands on the Levites, \n" +
                "11 and Aaron shall offer the Levites before the LORD as a wave offering from the people of Israel,\n" +
                "    that they may do the service of the LORD. \n" +
                "12 Then the Levites shall lay their hands on the heads of the bulls, \n" +
                "   and you shall offer the one for a sin offering and the other for a burnt offering to the LORD to make atonement for the Levites. \n" +
                "13 And you shall set the Levites before Aaron and his sons, and shall offer them as a wave offering to the LORD.\n" +
                "14 “Thus you shall separate the Levites from among the people of Israel, and tthe Levites shall be mine. \n" +
                "15 And after that the Levites shall go in to serve at the tent of meeting,\n" +
                "    when you have cleansed them and offered them as a wave offering. \n" +
                "16 For they are wholly given to me from among the people of Israel. Instead of all who open the womb, \n" +
                "   the firstborn of all the people of Israel, I have taken them for myself. \n" +
                "17 For all the firstborn among the people of Israel are mine, both of man and of beast. \n" +
                "   On the day that I struck down all the firstborn in the land of Egypt I consecrated them for myself, \n" +
                "18 and I have taken the Levites instead of all the firstborn among the people of Israel. \n" +
                "19 And I have given the Levites as a gift to Aaron and his sons from among the people of Israel, \n" +
                "   to do the service for the people of Israel at the tent of meeting and to make atonement for the people of Israel, \n" +
                "   that there may be no plague among the people of Israel when the people of Israel come near the sanctuary.”\n" +
                "20 Thus did Moses and Aaron and all the congregation of the people of Israel to the Levites. \n" +
                "   According to all that the LORD commanded Moses concerning the Levites, the people of Israel did to them. \n" +
                "21 And the Levites purified themselves from sin and washed their clothes, and Aaron offered them as a wave offering before the LORD, \n" +
                "   and Aaron made atonement for them to cleanse them. \n" +
                "22 And after that the Levites went in to do their service in the tent of meeting before Aaron and his sons; \n" +
                "   as the LORD had commanded Moses concerning the Levites, so they did to them.\n";

        String chapterThirdTitle = "Retirement of the Levites";

        String thirdContent = "23 And the LORD spoke to Moses, saying, \n" +
                "24 “This applies to the Levites: from twenty-five years old and upward they shall come to do duty in the service of the tent of meeting. \n" +
                "25 And from the age of fifty years they shall withdraw from the duty of the service and serve no more.\n" +
                "26 They minister to their brothers in the tent of meeting by keeping guard, but they shall do no service. \n" +
                "   Thus shall you do to the Levites in assigning their duties.”\n";

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


    public void chapterNineOFNumbers() {

        table9 = new Table();
        table9.setWidth(tableBG.getWidth());
        table9.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table9.setFillParent(true);
        table9.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Passover Celebrated";

        String firstContent = "1 And the LORD spoke to Moses in the wilderness of Sinai, in the first month of the second year \n" +
                "   after they had come out of the land of Egypt, saying, \n" +
                "2 “Let the people of Israel keep the Passover at its appointed time. \n" +
                "3 On the fourteenth day of this month, at twilight, you shall keep it at its appointed time; \n" +
                "   according to all its statutes and all its rules you shall keep it.”\n" +
                "4 So Moses told the people of Israel that they should keep the Passover. \n" +
                "5 And they kept the Passover in the first month, on the fourteenth day of the month, at twilight, \n" +
                "   in the wilderness of Sinai; according to all that the LORD commanded Moses, so the people of Israel did. \n" +
                "6 And there were certain men who were unclean through touching a dead body, so that they could not keep the Passover on that day, \n" +
                "   and they came before Moses and Aaron on that day. \n" +
                "7 And those men said to him, “We are unclean through touching a dead body. \n" +
                "   Why are we kept from bringing the LORD's offering at its appointed time among the people of Israel?”\n" +
                "8 And Moses said to them, “Wait, that I may hear what the LORD will command concerning you.”\n" +
                "9 The LORD spoke to Moses, saying, \n" +
                "10 “Speak to the people of Israel, saying, if any one of you or of your descendants is unclean through touching a dead body, \n" +
                "   or is on a long journey, he shall still keep the Passover to the LORD. \n" +
                "11 In the second month on the fourteenth day at twilight they shall keep it. \n" +
                "   They shall eat it with unleavened bread and bitter herbs. \n" +
                "12 They shall leave none of it until the morning, nor break any of its bones; \n" +
                "   according to all the statute for the Passover they shall keep it. \n" +
                "13 But if anyone who is clean and is not on a journey fails to keep the Passover, \n" +
                "   that person shall be cut off from his people because he did not bring the LORD's offering at its appointed time; \n" +
                "   that man shall bear his sin. \n" +
                "14 And if a stranger sojourns among you and would keep the Passover to the LORD, \n" +
                "   according to the statute of the Passover and according to its rule, so shall he do. \n" +
                "   You shall have one statute, both for the sojourner and for the native.”\n";


        String chapterSecondTitle = "The Cloud Covering the Tabernacle";

        String secondContent = "15 On the day that the tabernacle was set up, the cloud covered the tabernacle, the tent of the testimony. \n" +
                "   And sat evening it was over the tabernacle like the appearance of fire until morning. \n" +
                "16 So it was always: the cloud covered it by day1 and the appearance of fire by night. \n" +
                "17 And whenever the cloud lifted from over the tent, after that the people of Israel set out, and in the place where the cloud settled down, \n" +
                "   there the people of Israel camped. \n" +
                "18 At the command of the LORD the people of Israel set out, and at the command of the LORD they camped.  \n" +
                "   As long as the cloud rested over the tabernacle, they remained in camp. \n" +
                "19 Even when the cloud continued over the tabernacle many days, the people of Israel kept the charge of the LORD and did not set out. \n" +
                "20 Sometimes the cloud was a few days over the tabernacle, and according to the command of the LORD they remained in camp; \n" +
                "   then according to the command of the LORD they set out. \n" +
                "21 And sometimes the cloud remained from evening until morning. And when the cloud lifted in the morning, \n" +
                "   they set out, or if it continued for a day and a night, when the cloud lifted they set out. \n" +
                "22 Whether it was two days, or a month, or a longer time that the cloud continued over the tabernacle abiding there, \n" +
                "   the people of Israel remained in camp and did not set out, but when it lifted they set out. \n" +
                "23 At the command of the LORD they camped, and at the command of the LORD they set out.  \n" +
                "   They kept the charge of the LORD, at the command of the LORD by Moses.\n";
        

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


    public void chapterTenOFNumbers() {

        table10 = new Table();
        table10.setWidth(tableBG.getWidth());
        table10.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table10.setFillParent(true);
        table10.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Silver Trumpets";

        String firstContent = "1 The LORD spoke to Moses, saying, \n" +
                "2 “Make two silver trumpets. Of hammered work you shall make them, \n" +
                "   and you shall use them for summoning the congregation and for breaking camp. \n" +
                "3 And when both are blown, all the congregation shall gather themselves to you at the entrance of the tent of meeting. \n" +
                "4 But if they blow only one, then the chiefs, the heads of the tribes of Israel, shall gather themselves to you.\n" +
                "5 When you blow an alarm, the camps that are on the east side shall set out. \n" +
                "6 And when you blow an alarm the second time, the camps that are on the south side shall set out. \n" +
                "   An alarm is to be blown whenever they are to set out. \n" +
                "7 But when the assembly is to be gathered together, you shall blow a long blast, but you shall not sound an alarm. \n" +
                "8 And the sons of Aaron, the priests, shall blow the trumpets. \n" +
                "   The trumpets shall be to you for a perpetual statute throughout your generations. \n" +
                "9 And when you go to war in your land against the adversary who oppresses you, \n" +
                "   then you shall sound an alarm with the trumpets, that you may be remembered before the LORD your God, \n" +
                "   and you shall be saved from your enemies. \n" +
                "10 On the day of your gladness also, and at your appointed feasts and at the beginnings of your months, \n" +
                "   you shall blow the trumpets over your burnt offerings and over the sacrifices of your peace offerings. \n" +
                "   They shall be a reminder of you before your God: I am the LORD your God.”\n";


        String chapterSecondTitle = "Israel Leaves Sinai";

        String secondContent = "11 In the second year, in the second month, on the twentieth day of the month, \n" +
                "   the cloud lifted from over the tabernacle of the testimony,\n" +
                "12 and the people of Israel set out by stages from the wilderness of Sinai. And the cloud settled down in the wilderness of Paran. \n" +
                "13 They set out for the first time at the command of the LORD by Moses. \n" +
                "14 The standard of the camp of the people of Judah set out first by their companies, \n" +
                "   and over their company was Nahshon the son of Amminadab. \n" +
                "15 And over the company of the tribe of the people of Issachar was Nethanel the son of Zuar.\n" +
                "16 And over the company of the tribe of the people of Zebulun was Eliab the son of Helon.\n" +
                "17 And when the tabernacle was taken down, the sons of Gershon and the sons of Merari,  who carried the tabernacle, set out. \n" +
                "18 And the standard of the camp of Reuben set out by their companies, and over their company was Elizur the son of Shedeur.\n" +
                "19 And over the company of the tribe of the people of Simeon was Shelumiel the son of Zurishaddai.\n" +
                "20 And over the company of the tribe of the people of Gad was Eliasaph the son of Deuel.\n" +
                "21 Then the Kohathites set out, carrying the holy things, and the tabernacle was set up before their arrival. \n" +
                "22 And the standard of the camp of the people of Ephraim set out by their companies, \n" +
                "   and over their company was Elishama the son of Ammihud. \n" +
                "23 And over the company of the tribe of the people of Manasseh was Gamaliel the son of Pedahzur. \n" +
                "24 And over the company of the tribe of the people of Benjamin was Abidan the son of Gideoni.\n" +
                "25 Then the standard of the camp of the people of Dan, acting as the rear guard of all the camps, set out by their companies, \n" +
                "   and over their company was Ahiezer the son of Ammishaddai. \n" +
                "26 And over the company of the tribe of the people of Asher was Pagiel the son of Ochran. \n" +
                "27 And over the company of the tribe of the people of Naphtali was Ahira the son of Enan. \n" +
                "28 This was the order of march of the people of Israel by their companies, when they set out.\n" +
                "29 And Moses said to Hobab the son of Reuel the Midianite, Moses' father-in-law, \n" +
                "   “We are setting out for the place of which the LORD said, \n" +
                "   ‘I will give it to you.’ Come with us, and we will do good to you, for the LORD has promised good to Israel.” \n" +
                "30 But he said to him, “I will not go. I will depart to my own land and to my kindred.” \n" +
                "31 And he said, “Please do not leave us, for you know where we should camp in the wilderness, and you will serve as eyes for us.\n" +
                "32 And if you do go with us, whatever good the LORD will do to us, the same will we do to you.”\n" +
                "33 So they set out from the mount of the LORD three days' journey.\n" +
                "    And the ark of the covenant of the LORD went before them three days' journey, \n" +
                "   to seek out a resting place for them. \n" +
                "34 And the cloud of the LORD was over them by day, whenever they set out from the camp.\n" +
                "35 And whenever the ark set out, Moses said, “Arise, O LORD, and let your enemies be scattered, \n" +
                "   and let those who hate you flee before you.”\n" +
                "36 And when it rested, he said, “Return, O LORD, to the ten thousand thousands of Israel.”\n";


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


    public void chapterElevenOFNumbers() {

        table11 = new Table();
        table11.setWidth(tableBG.getWidth());
        table11.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table11.setFillParent(true);
        table11.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
        
        String chapterFirstTitle = "The People Complain";

        String firstContent = "1 And the people complained in the hearing of the LORD about their misfortunes, \n" +
                "   and when the LORD heard it, his anger was kindled, and the fire of the LORD burned among them and consumed some outlying parts of the camp.\n" +
                " 2 Then the people cried out to Moses, and Moses prayed to the LORD, and the fire died down. \n" +
                "3 So the name of that place was called Taberah, because the fire of the LORD burned among them.\n" +
                "4 Now the rabble that was among them had a strong craving. And the people of Israel also wept again and said, “Oh that we had meat to eat! \n" +
                "5 We remember the fish we ate in Egypt that cost nothing, the cucumbers, the melons, the leeks, the onions, and the garlic. \n" +
                "6 But now our strength is dried up, and there is nothing at all but this manna to look at.”\n" +
                "7 Now the manna was like coriander seed, and its appearance like that of bdellium.\n" +
                "8 The people went about and gathered it and ground it in handmills or beat it in mortars and boiled it in pots and made cakes of it. \n" +
                "   And the taste of it was like the taste of cakes baked with oil.\n" +
                "9 When the dew fell upon the camp in the night, the manna fell with it.\n" +
                "10 Moses heard the people weeping throughout their clans, everyone at the door of his tent. And the anger of the LORD blazed hotly, \n" +
                "   and Moses was displeased. \n" +
                "11 Moses said to the LORD, “Why have you dealt ill with your servant? And why have I not found favor in your sight, \n" +
                "   that you lay the burden of all this people on me? \n" +
                "12 Did I conceive all this people? Did I give them birth, that you should say to me, ‘Carry them in your bosom, \n" +
                "   as a nurse carries a nursing child,’ to the land that you swore to give their fathers? \n" +
                "13 Where am I to get meat to give to all this people? For they weep before me and say, ‘Give us meat, that we may eat.’ \n" +
                "14 I am not able to carry all this people alone; the burden is too heavy for me. \n" +
                "15 If you will treat me like this, kill me at once, if I find favor in your sight, that I may not see my wretchedness.”\n";


        String chapterSecondTitle = "Elders Appointed to Aid Moses";

        String secondContent = "16 Then the LORD said to Moses, “Gather for me seventy men of the elders of Israel, \n" +
                "   whom you know to be the elders of the people and officers over them, and bring them to the tent of meeting, \n" +
                "   and let them take their stand there with you. \n" +
                "17 And I will come down and talk with you there. And I will take some of the Spirit that is on you and put it on them, \n" +
                "   and they shall bear the burden of the people with you, so that you may not bear it yourself alone. \n" +
                "18 And say to the people, ‘Consecrate yourselves for tomorrow, and you shall eat meat, for you have wept in the hearing of the LORD, \n" +
                "   saying, “Who will give us meat to eat? For it was better for us in Egypt.” Therefore the LORD will give you meat, and you shall eat. \n" +
                "19 You shall not eat just one day, or two days, or five days, or ten days, or twenty days, \n" +
                "20 but a whole month, until it comes out at your nostrils and becomes loathsome to you, \n" +
                "   because you have rejected the LORD who is among you and have wept before him, saying, “Why did we come out of Egypt?”’” \n" +
                "21 But Moses said, “The people among whom I am number six hundred thousand on foot, and you have said, \n" +
                "   ‘I will give them meat that they may eat a whole month!’\n" +
                "22 Shall flocks and herds be slaughtered for them, and be enough for them? Or shall all the fish of the sea be gathered together for them, \n" +
                "   and be enough for them?” \n" +
                "23 And the LORD said to Moses, “Is the LORD's hand shortened? Now you shall see whether my word will come true for you or not.”\n" +
                "24 So Moses went out and told the people the words of the LORD. And he gathered seventy men of the elders of the people \n" +
                "   and placed them around the tent. \n" +
                "25 Then the LORD came down in the cloud and spoke to him, and took some of the Spirit that was on him and put it on the seventy elders. \n" +
                "   And as soon as the Spirit rested on them, they prophesied. But they did not continue doing it.\n" +
                "26 Now two men remained in the camp, one named Eldad, and the other named Medad, and the Spirit rested on them. \n" +
                "   They were among those registered, but they had not gone out to the tent, and so they prophesied in the camp. \n" +
                "27 And a young man ran and told Moses, “Eldad and Medad are prophesying in the camp.” \n" +
                "28 And Joshua the son of Nun, the assistant of Moses from his youth, said, “My lord Moses,  stop them.” \n" +
                "29 But Moses said to him, “Are you jealous for my sake?  Would that all the LORD's people were prophets, \n" +
                "   that the LORD would put his Spirit on them!” \n" +
                "30 And Moses and the elders of Israel returned to the camp.\n";

        String chapterThirdTitle = "Quail and a Plague";

        String thirdContent = "31 Then a wind from the LORD sprang up, and it brought quail from the sea and let them fall beside the camp, \n" +
                "   about a day's journey on this side and a day's journey on the other side, around the camp, and about two cubits above the ground. \n" +
                "32 And the people rose all that day and all night and all the next day, and gathered the quail. \n" +
                "   Those who gathered least gathered ten homers. \n" +
                "   And they spread them out for themselves all around the camp. \n" +
                "33 While the meat was yet between their teeth, before it was consumed, the anger of the LORD was kindled against the people, \n" +
                "   and the LORD struck down the people with a very great plague.\n" +
                "34 Therefore the name of that place was called Kibroth-hattaavah, because there they buried the people who had the craving. \n" +
                "35 From Kibroth-hattaavah the people journeyed to Hazeroth, and they remained at Hazeroth.\n";


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

        //content of the third title
        table11.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table11);


    }


    public void chapterTwelveOFNumbers() {

        table12 = new Table();
        table12.setWidth(tableBG.getWidth());
        table12.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table12.setFillParent(true);
        table12.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Miriam and Aaron Oppose Moses";

        String firstContent = "1 Miriam and Aaron spoke against Moses because of the Cushite woman whom he had married, for he had married a Cushite woman. \n" +
                "2 And they said, “Has the LORD indeed spoken only through Moses?  Has he not spoken through us also?” And the LORD heard it.\n" +
                "3 Now the man Moses was very meek, more than all people who were on the face of the earth.\n" +
                "4 And suddenly the LORD said to Moses and to Aaron and Miriam, “Come out, you three, to the tent of meeting.” \n" +
                "   And the three of them came out. \n" +
                "5 And the LORD came down in a pillar of cloud and stood at the entrance of the tent and called Aaron and Miriam, \n" +
                "   and they both came forward. \n" +
                "6 And he said, “Hear my words: If there is a prophet among you, I the LORD make myself known to him in a vision; \n" +
                "   I speak with him in a dream. \n" +
                "7 Not so with my servant Moses. He is faithful in all my house. \n" +
                "8 With him I speak mouth to mouth, clearly, and not in riddles, and he beholds the form of the LORD. \n" +
                "   Why then were you not afraid to speak against my servant Moses?” \n" +
                "9 And the anger of the LORD was kindled against them, and he departed.\n" +
                "10 When the cloud removed from over the tent, behold, Miriam was leprous, like snow. \n" +
                "   And Aaron turned toward Miriam, and behold, she was leprous. \n" +
                "11 And Aaron said to Moses, “Oh, my lord, do not punish us because we have done foolishly and have sinned. \n" +
                "12 Let her not be as one dead, whose flesh is half eaten away when he comes out of his mother's womb.” \n" +
                "13 And Moses cried to the LORD, “O God, please heal her—please.” \n" +
                "14 But the LORD said to Moses, “If her father had but spit in her face, should she not be shamed seven days? \n" +
                "   Let her be shut outside the camp seven days, and after that she may be brought in again.” \n" +
                "15 So Miriam was shut outside the camp seven days, and the people did not set out on the march till Miriam was brought in again.\n" +
                "16 After that the people set out from Hazeroth, and camped in the wilderness of Paran.\n";


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

    public void chapterThirteenOFNumbers() {

        table13 = new Table();
        table13.setWidth(tableBG.getWidth());
        table13.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table13.setFillParent(true);
        table13.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Spies Sent into Canaan";

        String firstContent = "The LORD spoke to Moses, saying, \n" +
                "2 “Send men to spy out the land of Canaan, which I am giving to the people of Israel. \n" +
                "   From each tribe of their fathers you shall send a man, everyone a chief among them.” \n" +
                "3 So Moses sent them from the wilderness of Paran, according to the command of the LORD, \n" +
                "   all of them men who were heads of the people of Israel. \n" +
                "4 And these were their names: From the tribe of Reuben, Shammua the son of Zaccur; \n" +
                "5 from the tribe of Simeon, Shaphat the son of Hori; \n" +
                "6 from the tribe of Judah, Caleb the son of Jephunneh; \n" +
                "7 from the tribe of Issachar, Igal the son of Joseph; \n" +
                "8 from the tribe of Ephraim, Hoshea the son of Nun; \n" +
                "9 from the tribe of Benjamin, Palti the son of Raphu; \n" +
                "10 from the tribe of Zebulun, Gaddiel the son of Sodi; \n" +
                "11 from the tribe of Joseph (that is, from the tribe of Manasseh), Gaddi the son of Susi; \n" +
                "12 from the tribe of Dan, Ammiel the son of Gemalli; \n" +
                "13 from the tribe of Asher, Sethur the son of Michael;\n" +
                "14 from the tribe of Naphtali, Nahbi the son of Vophsi; \n" +
                "15 from the tribe of Gad, Geuel the son of Machi. \n" +
                "16 These were the names of the men whom Moses sent to spy out the land. And Moses called Hoshea the son of Nun Joshua.\n" +
                "17 Moses sent them to spy out the land of Canaan and said to them, “Go up into the Negeb and go up into the hill country, \n" +
                "18 and see what the land is, and whether the people who dwell in it are strong or weak, whether they are few or many, \n" +
                "19 and whether the land that they dwell in is good or bad, and whether the cities that they dwell in are camps or strongholds, \n" +
                "20 and whether the land is rich or poor, and whether there are trees in it or not. Be of good courage \n" +
                "   and bring some of the fruit of the land.” Now the time was the season of the first ripe grapes.\n" +
                "21 So they went up and spied out the land from the wilderness of Zin to Rehob, near Lebo-hamath.\n" +
                "22 They went up into the Negeb and came to Hebron.  Ahiman, Sheshai, and Talmai, the descendants of Anak, were there. \n" +
                "   (Hebron was built seven years before Zoan in Egypt.) \n" +
                "23 And they came to the Valley of Eshcol and cut down from there a branch with a single cluster of grapes, \n" +
                "   and they carried it on a pole between two of them; they also brought some pomegranates and figs. \n" +
                "24 That place was called the Valley of Eshcol, because of the cluster that the people of Israel cut down from there.\n";


        String chapterSecondTitle = "Report of the Spies";

        String secondContent = "25 At the end of forty days they returned from spying out the land.26 And they came to Moses and Aaron \n" +
                "   and to all the congregation of the people of Israel in the wilderness of Paran, at Kadesh. \n" +
                "   They brought back word to them and to all the congregation, and showed them the fruit of the land. \n" +
                "27 And they told him, “We came to the land to which you sent us. It flows with milk and honey,  and this is its fruit.\n" +
                "28 However, the people who dwell in the land are strong, and the cities are fortified and very large. \n" +
                "   And besides, we saw the descendants of Anak there. \n" +
                "29 The Amalekites dwell in the land of the Negeb. The Hittites, the Jebusites, and the Amorites dwell in the hill country.  \n" +
                "   And the Canaanites dwell by the sea, and along the Jordan.”\n" +
                "30 But Caleb quieted the people before Moses and said, “Let us go up at once and occupy it, for we are well able to overcome it.” \n" +
                "31 Then the men who had gone up with him said, “We are not able to go up against the people, for they are stronger than we are.” \n" +
                "32 So they brought to the people of Israel a bad report of the land that they had spied out, saying, \n" +
                "   “The land, through which we have gone to spy it out, is a land that devours its inhabitants, \n" +
                "   and all the people that we saw in it are of great height. \n" +
                "33 And there we saw the Nephilim (the sons of Anak, who come from the Nephilim), and we seemed to ourselves like grasshoppers,\n" +
                "    and so we seemed to them.”\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

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

        stage.addActor(table13);

    }


    public void chapterFourteenOFNumbers() {

        table14 = new Table();
        table14.setWidth(tableBG.getWidth());
        table14.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table14.setFillParent(true);
        table14.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The People Rebel";

        String firstContent = "1Then all the congregation raised a loud cry, and the people wept that night. \n" +
                "2 And all the people of Israel grumbled against Moses and Aaron. The whole congregation said to them, \n" +
                "   “Would that we had died in the land of Egypt! Or would that we had died in this wilderness!\n" +
                "3 Why is the LORD bringing us into this land, to fall by the sword? Our wives and our little ones will become a prey. \n" +
                "   Would it not be better for us to go back to Egypt?” \n" +
                "4 And they said to one another, “Let us choose a leader and go back to Egypt.”\n" +
                "5 Then Moses and Aaron fell on their faces before all the assembly of the congregation of the people of Israel. \n" +
                "6 And Joshua the son of Nun and Caleb the son of Jephunneh, who were among those who had spied out the land, tore their clothes \n" +
                "7 and said to all the congregation of the people of Israel, “The land, which we passed through to spy it out, is an exceedingly good land. \n" +
                "8 If the LORD delights in us, he will bring us into this land and give it to us, a land that flows with milk and honey. \n" +
                "9 Only do not rebel against the LORD. And do not fear the people of the land, for they are bread for us. \n" +
                "   Their protection is removed from them, and the LORD is with us; do not fear them.” \n" +
                "10 Then all the congregation said to stone them with stones. But the glory of the LORD appeared \n" +
                "   at the tent of meeting to all the people of Israel.\n" +
                "11 And the LORD said to Moses, “How long will this people despise me? And how long will they not believe in me, \n" +
                "   in spite of all the signs that I have done among them? \n" +
                "12 I will strike them with the pestilence and disinherit them, and I will make of you a nation greater and mightier than they.”\n";


        String chapterSecondTitle = "Moses Intercedes for the People";

        String secondContent = "13 But Moses said to the LORD, “Then the Egyptians will hear of it, \n" +
                "   for you brought up this people in your might from among them, \n" +
                "14 and they will tell the inhabitants of this land. They have heard that you, O LORD, are in the midst of this people. \n" +
                "   For you, O LORD, are seen face to face, and your cloud stands over them and you go before them,\n" +
                "    in a pillar of cloud by day and in a pillar of fire by night. \n" +
                "15 Now if you kill this people as one man, then the nations who have heard your fame will say, \n" +
                "16 ‘It is because the LORD was not able to bring this people into the land that he swore to give to them \n" +
                "   that he has killed them in the wilderness.’ \n" +
                "17 And now, please let the power of the Lord be great as you have promised, saying, \n" +
                "18 ‘The LORD is slow to anger and abounding in steadfast love, forgiving iniquity and transgression, \n" +
                "   but he will by no means clear the guilty, visiting the iniquity of the fathers on the children, to the third and the fourth generation.’ \n" +
                "19 Please pardon the iniquity of this people, according to the greatness of your steadfast love, just as you have forgiven this people, \n" +
                "   from Egypt until now.”\n";


        String chapterThirdTitle = "God Promises Judgment";

        String thirdContent = "20 Then the LORD said, “I have pardoned, according to your word.\n" +
                "21 But truly, as I live, and as all the earth shall be filled with the glory of the LORD, \n" +
                "22 none of the men who have seen my glory and my signs that I did in Egypt and in the wilderness, \n" +
                "   and yet have put me to the test these ten times and have not obeyed my voice, \n" +
                "23 shall see the land that I swore to give to their fathers. And none of those who despised me shall see it. \n" +
                "24 But my servant Caleb, because he has a different spirit and has followed me fully, I will bring into the land into which he went,\n" +
                "    and his descendants shall possess it. \n" +
                "25 Now, since the Amalekites and the Canaanites dwell in the valleys, \n" +
                "   turn tomorrow and set out for the wilderness by the way to the Red Sea.”\n" +
                "26 And the LORD spoke to Moses and to Aaron, saying, \n" +
                "27 “How long shall this wicked congregation grumble against me? I have heard the grumblings of the people of Israel, \n" +
                "   which they grumble against me.\n" +
                "28 Say to them, ‘As I live, declares the LORD, what you have said in my hearing I will do to you: \n" +
                "29 your dead bodies shall fall in this wilderness, and of all your number, listed in the census from twenty years old and upward, \n" +
                "   who have grumbled against me, \n" +
                "30 not one shall come into the land where I swore that I would make you dwell, except Caleb the son of Jephunneh and Joshua the son of Nun. \n" +
                "31 But your little ones, who you said would become a prey, I will bring in, and they shall know the land that you have rejected. \n" +
                "32 But as for you, your dead bodies shall fall in this wilderness. \n" +
                "33 And your children shall be shepherds in the wilderness forty years and shall suffer for your faithlessness, \n" +
                "   until the last of your dead bodies lies in the wilderness.\n" +
                "34 According to the number of the days in which you spied out the land, forty days, a year for each day, \n" +
                "   you shall bear your iniquity forty years, and you shall know my displeasure.’ \n" +
                "35 I, the LORD, have spoken. Surely this will I do to all this wicked congregation who are gathered together against me: \n" +
                "   in this wilderness they shall come to a full end, and there they shall die.”\n" +
                "36 And the men whom Moses sent to spy out the land, who returned and made all the congregation grumble against him \n" +
                "   by bringing up a bad report about the land—\n" +
                "37 the men who brought up a bad report of the land—died by plague before the LORD. \n" +
                "38 Of those men who went to spy out the land, only Joshua the son of Nun and Caleb the son of Jephunneh remained alive.\n";


        String chapterFourthTitle = "Israel Defeated in Battle";

        String fourthContent = "39 When Moses told these words to all the people of Israel, the people mourned greatly. \n" +
                "40 And they rose early in the morning and went up to the heights of the hill country, saying, “Here we are.\n" +
                "    We will go up to the place that the LORD has promised, for we have sinned.” \n" +
                "41 But Moses said, “Why now are you transgressing the command of the LORD, when that will not succeed? \n" +
                "42 Do not go up, for the LORD is not among you, lest you be struck down before your enemies. \n" +
                "43 For there the Amalekites and the Canaanites are facing you, and you shall fall by the sword. \n" +
                "   Because you have turned back from following the LORD, theLORD will not be with you.” \n" +
                "44 But they presumed to go up to the heights of the hill country, although neither the ark of the covenant of the LORD nor Moses \n" +
                "   departed out of the camp. \n" +
                "45 Then the Amalekites and the Canaanites who lived in that hill country came down and defeated them and pursued them, even to Hormah.\n";


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
        table14.row();

        //title of the third content
        table14.add(lblThirdTitle).pad(10,50,0,0).left();
        table14.row();

        //content of the third title
        table14.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        //title of the fourth content
        table14.add(lblFourthTitle).pad(10,50,0,0).left();
        table14.row();

        //content of the fourtn title
        table14.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table14);

    }


    public void chapterFifteenOFNumbers() {

        table15 = new Table();
        table15.setWidth(tableBG.getWidth());
        table15.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table15.setFillParent(true);
        table15.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws About Sacrifices";

        String firstContent = "1 The LORD spoke to Moses, saying, \n" +
                "2 “Speak to the people of Israel and say to them, When you come into the land you are to inhabit, which I am giving you,\n" +
                "3 and you offer to the LORD from the herd or from the flock a food offering or a burnt offering or a sacrifice, \n" +
                "   to fulfill a vow or as a freewill offering or at your appointed feasts, to make a pleasing aroma to the LORD, \n" +
                "4 then he who brings his offering shall offer to the LORD a grain offering of a tenth of an ephah of fine flour, \n" +
                "   mixed with a quarter of a hin of oil;  and you shall offer with the burnt offering, or for the sacrifice, \n" +
                "   a quarter of a hin of wine for the drink offering for each lamb. \n" +
                "6 Or for a ram, you shall offer for a grain offering two tenths of an ephah of fine flour mixed with a third of a hin of oil. \n" +
                "7 And for the drink offering you shall offer a third of a hin of wine, a pleasing aroma to the LORD. \n" +
                "8 And when you offer a bull as a burnt offering or sacrifice, to fulfill a vow or for peace offerings to the LORD,\n" +
                "9 then one shall offer iwith the bull a grain offering of three tenths of an ephah of fine flour, mixed with half a hin of oil. \n" +
                "10 And you shall offer for the drink offering half a hin of wine, as a food offering, a pleasing aroma to the LORD.\n" +
                "11 “Thus it shall be done for each bull or ram, or for each lamb or young goat. \n" +
                "12 As many as you offer, so shall you do with each one, as many as there are. \n" +
                "13 Every native Israelite shall do these things in this way, in offering a food offering, with a pleasing aroma to the LORD.\n" +
                "14 And if a stranger is sojourning with you, or anyone is living permanently among you, and he wishes to offer a food offering, \n" +
                "   with a pleasing aroma to the LORD, he shall do as you do. \n" +
                "15 For the assembly, there shall be one statute for you and for the stranger who sojourns with you, \n" +
                "   a statute forever throughout your generations. You and the sojourner shall be alike before the LORD. \n" +
                "16 One law and one rule shall be for you and for the stranger who sojourns with you.”\n" +
                "17 The LORD spoke to Moses, saying,\n" +
                "18 “Speak to the people of Israel and say to them, When you come into the land to which I bring you\n" +
                "19 and when you eat of the bread of the land, you shall present a contribution to the LORD. \n" +
                "20 Of the first of your dough you shall present a loaf as a contribution; \n" +
                "   like a ocontribution from the threshing floor, so shall you present it. \n" +
                "21 Some of the first of your dough you shall give to the LORD as a contribution throughout your generations.\n";


        String chapterSecondTitle = "Laws About Unintentional Sins";

        String secondContent = "22  “But if you sin unintentionally, and do not observe all these commandments that the LORD has spoken to Moses, \n" +
                "23 all that the LORD has commanded you by Moses, from the day that the LORD gave commandment, and onward throughout your generations, \n" +
                "24 then if it was done unintentionally without the knowledge of the congregation, all the congregation shall offer \n" +
                "   one bull from the herd for a burnt offering, a pleasing aroma to the LORD,  with its grain offering and its drink offering, \n" +
                "   according to the rule, and one male goat for a sin offering. \n" +
                "25 And the priest shall make atonement for all the congregation of the people of Israel, and they shall be forgiven, \n" +
                "   because it was a mistake, and they have brought their offering, a food offering to the LORD, \n" +
                "   and their sin offering before the LORD for their mistake. \n" +
                "26 And all the congregation of the people of Israel shall be forgiven, and the stranger who sojourns among them, \n" +
                "   because the whole population was involved in the mistake.\n" +
                "27 “If one person sins unintentionally, he shall offer a female goat a year old for a sin offering. \n" +
                "28 And the priest shall make atonement before the LORD for the person who makes a mistake, when he sins unintentionally, \n" +
                "   to make atonement for him, and he shall be forgiven.\n" +
                "29 You shall have one law for him who does anything unintentionally, for him who is native among the people of Israel \n" +
                "   and for the stranger who sojourns among them. \n" +
                "30 But the person who does anything with a high hand, whether he is native or a sojourner, reviles the LORD,\n" +
                "    and that person shall be cut off from among his people. \n" +
                "31 Because he has despised the word of the LORD and has broken his commandment, that person shall be utterly cut off;\n" +
                "    his iniquity shall be on him.”\n";

        String chapterThirdTitle = "A Sabbathbreaker Executed";

        String thirdContent = "32 While the people of Israel were in the wilderness, they found a man gathering sticks on the Sabbath day. \n" +
                "33 And those who found him gathering sticks brought him to Moses and Aaron and to all the congregation. \n" +
                "34 They put him in custody, because it had not been made clear what should be done to him. \n" +
                "35 And the LORD said to Moses, “The man shall be put to death; all the congregation shall stone him with stones outside the camp.” \n" +
                "36 And all the congregation brought him outside the camp and stoned him to death with stones, as the LORD commanded Moses.\n";

        String chapterFourthTitle = "Tassels on Garments";

        String fourthContent = "37 The LORD said to Moses, \n" +
                "38 “Speak to the people of Israel, and tell them to make tassels on the corners of their garments throughout their generations, \n" +
                "   and to put a cord of blue on the tassel of each corner.\n" +
                "39 And it shall be a tassel for you to look at and remember all the commandments of the LORD, to do them, \n" +
                "   not to follow after your own heart and your own eyes, which you are inclined to whore after. \n" +
                "40 So you shall remember and do all my commandments, and be holy to your God. \n" +
                "41 I am the LORD your God, who brought you out of the land of Egypt to be your God: I am the LORD your God.”\n";


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
        table15.row();

        //title of the third content
        table15.add(lblThirdTitle).pad(10,50,0,0).left();
        table15.row();

        //content of the third title
        table15.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        //title of the fourth content
        table15.add(lblFourthTitle).pad(10,50,0,0).left();
        table15.row();

        //content of the fourtn title
        table15.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table15);

    }

    public void chapterSixteenOFNumbers() {

        table16 = new Table();
        table16.setWidth(tableBG.getWidth());
        table16.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table16.setFillParent(true);
        table16.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Korah's Rebellion";

        String firstContent = "1 Now Korah the son of Izhar, son of Kohath, son of Levi, and Dathan and Abiram the sons of Eliab, \n" +
                "   and on the son of Peleth, sons of Reuben, took men. \n" +
                "2 And they rose up before Moses, with a number of the people of Israel, 250 chiefs of the congregation, \n" +
                "   chosen from the assembly, well-known men. \n" +
                "3 They assembled themselves together against Moses and against Aaron and said to them, \n" +
                "   “You have gone too far! For all in the congregation are holy, every one of them, and the LORD is among them. \n" +
                "   Why then do you exalt yourselves above the assembly of the LORD?” \n" +
                "4 When Moses heard it, he fell on his face,\n" +
                "5 and he said to Korah and all his company, “In the morning the LORD will show who is his, and who is holy, \n" +
                "   and will bring him near to him. \n" +
                "   The one whom he chooses he will bring near to him. \n" +
                "6 Do this: take censers, Korah and all his company; \n" +
                "7 put fire in them and put incense on them before the LORD tomorrow, and the man whom the LORD chooses shall be the holy one. \n" +
                "   You have gone too far, sons of Levi!”\n" +
                "8 And Moses said to Korah, “Hear now, you sons of Levi: \n" +
                "9 is it too small a thing for you that the God of Israel has separated you from the congregation of Israel, to bring you near to himself, \n" +
                "   to do service in the tabernacle of the LORD and to stand before the congregation to minister to them, \n" +
                "10 and that he has brought you near him, and all your brothers the sons of Levi with you? And would you seek the priesthood also?\n" +
                "11 Therefore it is against the LORD that you and all your company have gathered together. What is Aaron that you grumble against him?”\n" +
                "12 And Moses sent to call Dathan and Abiram the sons of Eliab, and they said, “We will not come up. \n" +
                "13 Is it a small thing that you have brought us up out of a land flowing with milk and honey, to kill us in the wilderness, \n" +
                "   that you must also make yourself a prince over us?\n" +
                "14 Moreover, you have not brought us into a land flowing with milk and honey, nor given us inheritance of fields and vineyards. \n" +
                "   Will you put out the eyes of these men? We will not come up.” \n" +
                "15 And Moses was very angry and said to the LORD, “Do not respect their offering. I have not taken one donkey from them, \n" +
                "   and I have not harmed one of them.”\n" +
                "16 And Moses said to Korah, “Be present, you and all your company, before the LORD, you and they, and Aaron, tomorrow.\n" +
                "17 And let every one of you take his censer and put incense on it, and every one of you bring before the LORD his censer, 250 censers;\n" +
                "    you also, and Aaron, each his censer.” \n" +
                "18 So every man took his censer and put fire in them and laid incense on them and stood at the entrance \n" +
                "   of the tent of meeting with Moses and Aaron.\n" +
                "19 Then Korah assembled all the congregation against them at the entrance of the tent of meeting. \n" +
                "   And the glory of the LORD appeared to all the congregation.\n" +
                "20 And the LORD spoke to Moses and to Aaron, saying, \n" +
                "21 “Separate yourselves from among this congregation, that I may consume them in a moment.” \n" +
                "22 And they fell on their faces and said, “O God, the God of the spirits of all flesh, shall one man sin, \n" +
                "   and will you be angry with all the congregation?” \n" +
                "23 And the LORD spoke to Moses, saying, \n" +
                "24 “Say to the congregation, Get away from the dwelling of Korah, Dathan, and Abiram.”\n" +
                "25 Then Moses rose and went to Dathan and Abiram, and the elders of Israel followed him. \n" +
                "26 And he spoke to the congregation, saying, “Depart, please, from the tents of these wicked men, and touch nothing of theirs, \n" +
                "   lest you be swept away with all their sins.” \n" +
                "27 So they got away from the dwelling of Korah, Dathan, and Abiram. And Dathan and Abiram came out and stood at the door of their tents, \n" +
                "   together with their wives, their sons, and their little ones. \n" +
                "28 And Moses said, “Hereby you shall know that the LORD has sent me to do all these works, and that it has not been of my own accord. \n" +
                "29 If these men die as all men die, or if they are visited by the fate of all mankind, then the LORD has not sent me. \n" +
                "30 But if the LORD creates something new, and the ground opens its mouth and swallows them up with all that belongs to them, \n" +
                "   and they go down alive into Sheol, then you shall know that these men have despised the LORD.”\n" +
                "31 And as soon as he had finished speaking all these words, the ground under them split apart. \n" +
                "32 And the earth opened its mouth and swallowed them up, with their households and all the people \n" +
                "   who belonged to Korah and all their goods. \n" +
                "33 So they and all that belonged to them went down alive into Sheol, and the earth closed over them, \n" +
                "   and they perished from the midst of the assembly. \n" +
                "34 And all Israel who were around them fled at their cry, for they said, “Lest the earth swallow us up!” \n" +
                "35 And fire came out from the LORD and consumed the 250 men offering the incense.\n" +
                "36 Then the LORD spoke to Moses, saying, \n" +
                "37 “Tell Eleazar the son of Aaron the priest to take up the censers out of the blaze. \n" +
                "   Then scatter the fire far and wide, for they have become holy. \n" +
                "38 As for the censers of these men who have sinned at the cost of their lives, \n" +
                "   let them be made into hammered plates as a covering for the altar, for they offered them before the LORD, and they became holy. \n" +
                "   Thus they shall be a sign to the people of Israel.” \n" +
                "39 So Eleazar the priest took the bronze censers, which those who were burned had offered, \n" +
                "   and they were hammered out as a covering for the altar, \n" +
                "40 to be a reminder to the people of Israel, so that no outsider, who is not of the descendants of Aaron, \n" +
                "   should draw near to burn incense before the LORD, lest he become like Korah and his company—as the LORD said to him through Moses.\n" +
                "41 But on the next day all the congregation of the people of Israel grumbled against Moses and against Aaron, saying, \n" +
                "   “You have killed the people of the LORD.” \n" +
                "42 And when the congregation had assembled against Moses and against Aaron, they turned toward the tent of meeting.\n" +
                "    And behold, the cloud covered it, and the glory of the LORD appeared. \n" +
                "43 And Moses and Aaron came to the front of the tent of meeting, \n" +
                "44 and the LORD spoke to Moses, saying, \n" +
                "45 “Get away from the midst of this congregation, that I may consume them in a moment.” And they fell on their faces. \n" +
                "46 And Moses said to Aaron, “Take your censer, and put fire on it from off the altar and lay incense on it and carry it quickly \n" +
                "   to the congregation and make atonement for them, for wrath has gone out from the LORD; the plague has begun.” \n" +
                "47 So Aaron took it as Moses said and ran into the midst of the assembly. And behold, the plague had already begun among the people. \n" +
                "   And he put on the incense and made atonement for the people. \n" +
                "48 And he stood between the dead and the living, and the plague was stopped. \n" +
                "49 Now those who died in the plague were 14,700, besides those who died in the affair of Korah. \n" +
                "50 And Aaron returned to Moses at the entrance of the tent of meeting, when the plague was stopped.\n";
 

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


    public void chapterSeventeenOFNumbers() {

        table17 = new Table();
        table17.setWidth(tableBG.getWidth());
        table17.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table17.setFillParent(true);
        table17.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Aaron's Staff Buds";

        String firstContent = "1 The LORD spoke to Moses, saying, \n" +
                "2 “Speak to the people of Israel, and get from them staffs, one for each fathers' house, \n" +
                "   from all their chiefs according to their fathers' houses, twelve staffs. Write each man's name on his staff, \n" +
                "3 and write Aaron's name on the staff of Levi. For there shall be one staff for the head of each fathers' house. \n" +
                "4 Then you shall deposit them in the tent of meeting before the testimony, where I meet with you. \n" +
                "5 And the staff of the man whom I choose shall sprout. Thus I will make to cease from me the grumblings of the people of Israel, \n" +
                "   which they grumble against you.” \n" +
                "6 Moses spoke to the people of Israel. And all their chiefs gave him staffs, one for each chief, \n" +
                "   according to their fathers' houses, twelve staffs. And the staff of Aaron was among their staffs. \n" +
                "7 And Moses deposited the staffs before the LORD in the tent of the testimony.\n" +
                "8 On the next day Moses went into the tent of the testimony, and behold, the staff of Aaron for the house of Levi\n" +
                "    had sprouted and put forth buds and produced blossoms, and it bore ripe almonds. \n" +
                "9 Then Moses brought out all the staffs from before the LORD to all the people of Israel. And they looked, and each man took his staff. \n" +
                "10 And the LORD said to Moses, “Put back the staff of Aaron before the testimony, to be kept as a sign for the rebels, \n" +
                "   that you may make an end of their grumblings against me, lest they die.” \n" +
                "11 Thus did Moses; as the LORD commanded him, so he did.\n" +
                "12 And the people of Israel said to Moses, “Behold, we perish, we are undone, we are all undone. \n" +
                "13 Everyone who comes near, who comes near to the tabernacle of the LORD, shall die. Are we all to perish?”\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        //title of the chapter
        table17.add(lblFirstTitle).pad(10,50,0,0).left();
        table17.row();

        //content of the chapter
        table17.add(txtFirstContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table17);

    }


    public void chapterEighteenOFNumbers() {

        table18 = new Table();
        table18.setWidth(tableBG.getWidth());
        table18.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table18.setFillParent(true);
        table18.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Duties of Priests and Levites";

        String firstContent = "1 So the LORD said to Aaron, “You and your sons and your father's house with you shall bear iniquity c\n" +
                "   onnected with the sanctuary, and you and your sons with you shall bear iniquity connected with your priesthood. \n" +
                "2 And with you bring your brothers also, the tribe of Levi, the tribe of your father, that they may join you \n" +
                "   and minister to you while you and your sons with you are before the tent of the testimony. \n" +
                "3 They shall keep guard over you and over the whole tent, but shall not come near to the vessels of the sanctuary \n" +
                "   or to the altar lest they, and you, die. \n" +
                "4 They shall join you and keep guard over the tent of meeting for all the service of the tent, and no outsider shall come near you. \n" +
                "5 And you shall keep guard over the sanctuary and over the altar, that there may never again be wrath on the people of Israel. \n" +
                "6 And behold, I have taken your brothers the Levites from among the people of Israel. They are a gift to you, given to the LORD,\n" +
                "    to do the service of the tent of meeting. \n" +
                "7 And you and your sons with you shall guard your priesthood for all that concerns the altar and that is within the veil;\n" +
                "    and you shall serve. I give your priesthood as a gift, and any outsider who comes near shall be put to death.”\n" +
                "8 Then the LORD spoke to Aaron, “Behold, I have given you charge of the contributions made to me, \n" +
                "   all the consecrated things of the people of Israel. I have given them to you as a portion and to your sons as a perpetual due. \n" +
                "9 This shall be yours of the most holy things, reserved from the fire: every offering of theirs,\n" +
                "    every grain offering of theirs and every sin offering of theirs and every guilt offering of theirs, which they render to me, \n" +
                "   shall be most holy to you and to your sons. \n" +
                "10 In a most holy place shall you eat it. Every male may eat it; it is holy to you.\n" +
                "11 This also is yours: the contribution of their gift, all the wave offerings of the people of Israel. \n" +
                "   I have given them to you, and to your sons and daughters with you, as a perpetual due. Everyone who is clean in your house may eat it. \n" +
                "12 All the best of the oil and all the best of the wine and of the grain, the first fruits of what they give to the LORD, I give to you. \n" +
                "13 The first ripe fruits of all that is in their land, which they bring to the LORD, shall be yours. \n" +
                "   Everyone who is clean in your house may eat it. \n" +
                "14 Every devoted thing in Israel shall be yours. \n" +
                "15 Everything that opens the womb of all flesh, whether man or beast, which they offer to the LORD, shall be yours. \n" +
                "   Nevertheless, the firstborn of man you shall redeem, and the firstborn of unclean animals you shall redeem. \n" +
                "16 And their redemption price (at a month old you shall redeem them) you shall fix at five shekels in silver, \n" +
                "   according to the shekel of the sanctuary, which is twenty gerahs.\n" +
                "17 But the firstborn of a cow, or the firstborn of a sheep, or the firstborn of a goat, you shall not redeem; \n" +
                "   they are holy. You shall sprinkle their blood on the altar and shall burn their fat as a food offering, with a pleasing aroma to the LORD. \n" +
                "18 But their flesh shall be yours, as the breast that is waved and as the right thigh are yours. \n" +
                "19 All the holy contributions that the people of Israel present to the LORD I give to you, and to your sons and daughters with you, \n" +
                "   as a perpetual due. It is a covenant of salt forever before the LORD for you and for your offspring with you.” \n" +
                "20 And the LORD said to Aaron, “You shall have no inheritance in their land, neither shall you have any portion among them.  \n" +
                "   I am your portion and your inheritance among the people of Israel.\n" +
                "21 “To the Levites I have given every tithe in Israel for an inheritance, in return for their service that they do, \n" +
                "   their service in the tent of meeting, \n" +
                "22 so that the people of Israel do not come near the tent of meeting, lest they bear sin and die. \n" +
                "23 But the Levites shall do the service of the tent of meeting, and they shall bear their iniquity. \n" +
                "   It shall be a perpetual statute throughout your generations, and among the people of Israel they shall have no inheritance. \n" +
                "24 For the tithe of the people of Israel, which they present as a contribution to the LORD, \n" +
                "   I have given to the Levites for an inheritance. \n" +
                "   Therefore I have said of them that they shall have no inheritance among the people of Israel.”\n" +
                "25 And the LORD spoke to Moses, saying, \n" +
                "26 “Moreover, you shall speak and say to the Levites, ‘When you take from the people of Israel the tithe that \n" +
                "   I have given you from them for your inheritance, then you shall present a contribution from it to the LORD,  a tithe of the tithe.\n" +
                "27 And your contribution shall be counted to you as though it were the grain of the threshing floor, and as the fullness of the winepress. \n" +
                "28 So you shall also present a contribution to the LORD from all your tithes, which you receive from the people of Israel. \n" +
                "   And from it you shall give the LORD's contribution to Aaron the priest. \n" +
                "29 Out of all the gifts to you, you shall present every contribution due to the LORD; from each its best part is to be dedicated.’ \n" +
                "30 Therefore you shall say to them, ‘When you have offered from it the best of it, then the rest shall be counted to the Levites as\n" +
                "    produce of the threshing floor, and as produce of the winepress. \n" +
                "31 And you may eat it in any place, you and your households, for it is your reward in return for your service in the tent of meeting.\n" +
                "32 And you shall bear no sin by reason of it, when you have contributed the best of it. \n" +
                "   But you shall not profane the holy things of the people of Israel, lest you die.’”\n";


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


    public void chapterNineteenOFNumbers() {

        table19 = new Table();
        table19.setWidth(tableBG.getWidth());
        table19.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table19.setFillParent(true);
        table19.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Laws for Purification";

        String firstContent = "1 Now the LORD spoke to Moses and to Aaron, saying, \n" +
                "2 “This is the statute of the law that the LORD has commanded: Tell the people of Israel to bring you a red heifer without defect, \n" +
                "   in which there is no blemish, and on which a yoke has never come. \n" +
                "3 And you shall give it to Eleazar the priest, and it shall be taken outside the camp and slaughtered before him. \n" +
                "4 And Eleazar the priest shall take some of its blood with his finger, \n" +
                "   and sprinkle some of its blood toward the front of the tent of meeting seven times. \n" +
                "5 And the heifer shall be burned in his sight. Its skin, its flesh, and its blood, with its dung, shall be burned.\n" +
                "6 And the priest shall take cedarwood and hyssop and scarlet yarn, and throw them into the fire burning the heifer. \n" +
                "7 Then the priest shall wash his clothes and bathe his body in water, and afterward he may come into the camp. \n" +
                "   But the priest shall be unclean until evening. \n" +
                "8 The one who burns the heifer shall wash his clothes in water and bathe his body in water and shall be unclean until evening. \n" +
                "9 And a man who is clean shall gather up the ashes of the heifer and deposit them outside the camp in a clean place. \n" +
                "   And they shall be kept for the water for impurity for the congregation of the people of Israel; it is a sin offering. \n" +
                "10 And the one who gathers the ashes of the heifer shall wash his clothes and be unclean until evening. \n" +
                "   And this shall be a perpetual statute for the people of Israel, and for the stranger who sojourns among them.\n" +
                "11 “Whoever touches the dead body of any person shall be unclean seven days. \n" +
                "12 He shall cleanse himself with the water on the third day and on the seventh day, and so be clean. \n" +
                "   But if he does not cleanse himself on the third day and on the seventh day, he will not become clean. \n" +
                "13 Whoever touches a dead person, the body of anyone who has died, and does not cleanse himself, \n" +
                "    defiles the tabernacle of the LORD, and that person shall be cut off from Israel; \n" +
                "   because the water for impurity was not thrown on him, he shall be unclean. His uncleanness is still on him.\n" +
                "14 “This is the law when someone dies in a tent: everyone who comes into the tent and everyone who is in the tent shall be unclean seven days.\n" +
                "15 And every open vessel that has no cover fastened on it is unclean.\n" +
                "16 Whoever in the open field touches someone who was killed with a sword or who died naturally, or touches a human bone or a grave, \n" +
                "   shall be unclean seven days. \n" +
                "17 For the unclean they shall take some ashes of the burnt sin offering, and fresh1 water shall be added in a vessel.\n" +
                "18 Then a clean person shall take hyssop and dip it in the water and sprinkle it on the tent and on all the furnishings \n" +
                "   and on the persons who were there and on whoever touched the bone, or the slain or the dead or the grave. \n" +
                "19 And the clean person shall sprinkle it on the unclean on the third day and on the seventh day. \n" +
                "   Thus on the seventh day he shall cleanse him, and he shall wash his clothes and bathe himself in water, and at evening he shall be clean.\n" +
                "20 “If the man who is unclean does not cleanse himself, that person shall be cut off from the midst of the assembly, \n" +
                "   since he has defiled the sanctuary of the LORD. Because the water for impurity has not been thrown on him, he is unclean. \n" +
                "21 And it shall be a statute forever for them. The one who sprinkles the water for impurity shall wash his clothes, \n" +
                "   and the one who touches the water for impurity shall be unclean until evening. \n" +
                "22 And whatever the unclean person touches shall be unclean, and anyone who touches it shall be unclean until evening.”\n";


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


    public void chapterTwentyOFNumbers() {

        table20 = new Table();
        table20.setWidth(tableBG.getWidth());
        table20.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table20.setFillParent(true);
        table20.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Death of Miriam";

        String firstContent = "1 And the people of Israel, the whole congregation, came into the wilderness of Zin in the first month, \n" +
                "   and the people stayed in Kadesh. And Miriam died there and was buried there.";


        String chapterSecondTitle = "The Waters of Meribah";

        String secondContent = "2 Now there was no water for the congregation. And they assembled themselves together against Moses and against Aaron. \n" +
                "3 And the people quarreled with Moses and said, “Would that we had perished when our brothers perished before the LORD! \n" +
                "4 Why have you brought the assembly of the LORD into this wilderness, that we should die here, both we and our cattle? \n" +
                "5 And why have you made us come up out of Egypt to bring us to this evil place? It is no place for grain or figs or vines or pomegranates,\n" +
                "    and there is no water to drink.” \n" +
                "6 Then Moses and Aaron went from the presence of the assembly to the entrance of the tent of meeting and fell on their faces. \n" +
                "   And the glory of the LORD appeared to them, \n" +
                "7 and the LORD spoke to Moses, saying, \n" +
                "8 “Take the staff, and assemble the congregation, you and Aaron your brother, and tell the rock before their eyes to yield its water. \n" +
                "   So you shall bring water out of the rock for them and give drink to the congregation and their cattle.” \n" +
                "9 And Moses took the staff from before the LORD, as he commanded him.\n";

        String chapterThirdTitle = "Moses Strikes the Rock";

        String thirdContent = "10 Then Moses and Aaron gathered the assembly together before the rock, and he said to them, \n" +
                "   “Hear now, you rebels: shall we bring water for you out of this rock?” \n" +
                "11 And Moses lifted up his hand and struck the rock with his staff twice, and water came out abundantly, and the congregation drank, \n" +
                "   and their livestock. \n" +
                "12 And the LORD said to Moses and Aaron, “Because you did not believe in me, to uphold me as holy in the eyes of the people of Israel,\n" +
                "    therefore you shall not bring this assembly into the land that I have given them.” \n" +
                "13 These are the waters of Meribah, where the people of Israel quarreled with the LORD, and through them he showed himself holy.\n";


        String chapterFourthTitle = "Edom Refuses Passage";

        String fourthContent = "14 Moses sent messengers from Kadesh to the king of Edom: “Thus says your brother Israel: \n" +
                "   You know all the hardship that we have met:\n" +
                "15 how our fathers went down to Egypt, and we lived in Egypt a long time. And the Egyptians dealt harshly with us and our fathers. \n" +
                "16 And when we cried to the LORD, he heard our voice and sent an angel and brought us out of Egypt. And here we are in Kadesh, \n" +
                "   a city on the edge of your territory. \n" +
                "17 Please let us pass through your land. We will not pass through field or vineyard, or drink water from a well. \n" +
                "   We will go along the King's Highway. We will not turn aside to the right hand or to the left until we have passed through your territory.” \n" +
                "18 But Edom said to him, “You shall not pass through, lest I come out with the sword against you.” \n" +
                "19 And the people of Israel said to him, “We will go up by the highway, and if we drink of your water, I and my livestock, \n" +
                "   then I will pay for it. Let me only pass through on foot, nothing more.” \n" +
                "20 But he said, “You shall not pass through.” And Edom came out against them with a large army and with a strong force. \n" +
                "21 Thus Edom refused to give Israel passage through his territory, so Israel turned away from him.\n";


        String chapterFifthTitle = "The Death of Aaron";

        String fifthContent = "22 And they journeyed from Kadesh, and the people of Israel, the whole congregation, came to Mount Hor. \n" +
                "23 And the LORD said to Moses and Aaron at Mount Hor, on the border of the land of Edom,\n" +
                "24 “Let Aaron be gathered to his people, for he shall not enter the land that I have given to the people of Israel, \n" +
                "   because you rebelled against my command at the waters of Meribah. \n" +
                "25 Take Aaron and Eleazar his son and bring them up to Mount Hor. \n" +
                "26 And strip Aaron of his garments and put them on Eleazar his son. And Aaron shall be gathered to his people and shall die there.” \n" +
                "27 Moses did as the LORD commanded. And they went up Mount Hor in the sight of all the congregation.\n" +
                "28 And Moses stripped Aaron of his garments and put them on Eleazar his son. And Aaron died there on the top of the mountain. \n" +
                "   Then Moses and Eleazar came down from the mountain. \n" +
                "29 And when all the congregation saw that Aaron had perished,  all the house of Israel wept for Aaron thirty days.\n";


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

        //title of the fourth content
        table20.add(lblFourthTitle).pad(10,50,0,0).left();
        table20.row();

        //content of the fourth title
        table20.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        //title of the fifth content
        table20.add(lblFifthTitle).pad(10,50,0,0).left();
        table20.row();

        //content of the fifth title
        table20.add(txtFifthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table20);


    }


    public void chapterTwentyOneOFNumbers() {

        table21 = new Table();
        table21.setWidth(tableBG.getWidth());
        table21.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table21.setFillParent(true);
        table21.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Arad Destroyed";

        String firstContent = "1 When the Canaanite, the king of Arad, who lived in the Negeb, heard that Israel was coming by the way of Atharim, \n" +
                "   he fought against Israel, and took some of them captive. \n" +
                "2 And Israel vowed a vow to the LORD and said, “If you will indeed give this people into my hand, \n" +
                "   then I will devote their cities to destruction.” \n" +
                "3 And the LORD heeded the voice of Israel and gave over the Canaanites, and they devoted them and their cities to destruction. \n" +
                "   So the name of the place was called Hormah. \n";


        String chapterSecondTitle = "The Bronze Serpent";

        String secondContent = "4 From Mount Hor they set out by the way to the Red Sea, to go around the land of Edom. \n" +
                "   And the people became impatient on the way.\n" +
                "5 And the people spoke against God and against Moses, “Why have you brought us up out of Egypt to die in the wilderness? \n" +
                "   For there is no food and no water, and we loathe this worthless food.”\n" +
                "6 Then the LORD sent fiery serpents among the people, and they bit the people, so that many people of Israel died. \n" +
                "7 And the people came to Moses and said, “We have sinned, for we have spoken against the LORD and against you. Pray to the LORD, \n" +
                "   that he take away the serpents from us.” So Moses prayed for the people. \n" +
                "8 And the LORD said to Moses, “Make a fiery serpent and set it on a pole, and everyone who is bitten, when he sees it, shall live.” \n" +
                "9 So Moses made a bronze serpent and set it on a pole. And if a serpent bit anyone, he would look at the bronze serpent and live.\n";


        String chapterThirdTitle = "The Song of the Well";

        String thirdContent = "10 And the people of Israel set out and camped in Oboth. \n" +
                "11 And they set out from Oboth and camped at Iye-abarim, in the wilderness that is opposite Moab, toward the sunrise. \n" +
                "12 From there they set out and camped in the Valley of Zered. \n" +
                "13 From there they set out and camped on the other side of the Arnon, \n" +
                "   which is in the wilderness that extends from the border of the Amorites, for the Arnon is the border of Moab, between Moab and the Amorites. \n" +
                "14 Therefore it is said in the Book of the Wars of the LORD,“Waheb in Suphah, and the valleys of the Arnon,\n" +
                "15  and the slope of the valleys that extends to the seat of Ar, and leans to the border of Moab.”\n" +
                "16 And from there they continued to Beer; that is the well of which the LORD said to Moses, “Gather the people together, \n" +
                "   so that I may give them water.” \n" +
                "17 Then Israel sang this song:\n" +
                "\t\t“Spring up, O well!—Sing to it!—\n" +
                "\t\t18  the well that the princes made,\n" +
                "\t\tthat the nobles of the people dug,\n" +
                "\t\twith the scepter and with their staffs.”\n" +
                "And from the wilderness they went on to Mattanah,\n" +
                "19 and from Mattanah to Nahaliel, and from Nahaliel to Bamoth, \n" +
                "20 and from Bamoth to the valley lying in the region of Moab by the top of Pisgahrthat looks down on the desert. \n";


        String chapterFourthTitle = "King Sihon Defeated";

        String fourthContent = "21 Then Israel sent messengers to Sihon king of the Amorites, saying, \n" +
                "22 “Let me pass through your land. We will not turn aside into field or vineyard. We will not drink the water of a well. \n" +
                "   We will go by the King's Highway until we have passed through your territory.” \n" +
                "23 But Sihon would not allow Israel to pass through his territory. He gathered all his people together \n" +
                "   and went out against Israel to the wilderness and came to Jahaz and fought against Israel. \n" +
                "24 And Israel defeated him with the edge of the sword and took possession of his land from the Arnon to the Jabbok, \n" +
                "   as far as to the Ammonites, for the border of the Ammonites was strong. \n" +
                "25 And Israel took all these cities, and Israel settled in all the cities of the Amorites, in Heshbon, and in all its villages. \n" +
                "26 For Heshbon was the city of Sihon the king of the Amorites, \n" +
                "   who had fought against the former king of Moab and taken all his land out of his hand, as far as the Arnon. \n" +
                "27 Therefore the ballad singers say,\n" +
                "\t\t“Come to Heshbon, let it be built;\n" +
                "\t\tlet the city of Sihon be established.\n" +
                "\t\t28 For fire came out from Heshbon,\n" +
                "\t\tflame from the city of Sihon.\n" +
                "\t\tIt devoured Ar of Moab,\n" +
                "\t\tand swallowed the heights of the Arnon.\n" +
                "\t\t29 Woe to you, O Moab!\n" +
                "\t\tYou are undone, O people of Chemosh!\n" +
                "\t\tHe has made his sons fugitives,\n" +
                "\t\tand his daughters captives,\n" +
                "\t\tto an Amorite king, Sihon.\n" +
                "\t\t30 So we overthrew them;\n" +
                "\t\tHeshbon, as far as Dibon, perished;\n" +
                "\t\tand we laid waste as far as Nophah;\n" +
                "\t\tfire spread as far as Medeba.” \n";

        String chapterFifthTitle = "King Og Defeated";

        String fifthContent = "31 Thus Israel lived in the land of the Amorites. \n" +
                "32 And Moses sent to spy out Jazer, and they captured its villages and dispossessed the Amorites who were there. \n" +
                "33 Then they turned and went up by the way to Bashan. And Og the king of Bashan came out against them, \n" +
                "   he and all his people, to battle at Edrei.\n" +
                "34 But the LORD said to Moses, “Do not fear him, for I have given him into your hand, and all his people, and his land. \n" +
                "   And you shall do to him as you did to Sihon king of the Amorites, who lived at Heshbon.” \n" +
                "35 So they defeated him and his sons and all his people, until he had no survivor left. And they possessed his land.\n";
 

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


    public void chapterTwentyTwoOFNumbers() {

        table22 = new Table();
        table22.setWidth(tableBG.getWidth());
        table22.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table22.setFillParent(true);
        table22.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Balak Summons Balaam";

        String firstContent = "1 Then the people of Israel set out and camped in the plains of Moab beyond the Jordan at Jericho. \n" +
                "2 And Balak the son of Zippor saw all that Israel had done to the Amorites. \n" +
                "3 And Moab was in great dread of the people, because they were many. Moab was overcome with fear of the people of Israel. \n" +
                "4 And Moab said to the elders of Midian, “This horde will now lick up all that is around us, as the ox licks up the grass of the field.”\n" +
                "    So Balak the son of Zippor, who was king of Moab at that time, \n" +
                "5 sent messengers to Balaam the son of Beor at Pethor, which is near the River in the land of the people of Amaw, \n" +
                "   to call him, saying, “Behold, a people has come out of Egypt. They cover the face of the earth, and they are dwelling opposite me. \n" +
                "6 Come now, curse this people for me, since they are too mighty for me. \n" +
                "   Perhaps I shall be able to defeat them and drive them from the land, for I know that he whom you bless is blessed, \n" +
                "   and he whom you curse is cursed.”\n" +
                "7 So the elders of Moab and the elders of Midian departed with the fees for divination in their hand. \n" +
                "   And they came to Balaam and gave him Balak's message. \n" +
                "8 And he said to them, “Lodge here tonight, and I will bring back word to you, as the LORD speaks to me.”\n" +
                "    So the princes of Moab stayed with Balaam. \n" +
                "9 And God came to Balaam and said, “Who are these men with you?”\n" +
                "10 And Balaam said to God, “Balak the son of Zippor, king of Moab, has sent to me, saying, \n" +
                "   11 ‘Behold, a people has come out of Egypt, and it covers the face of the earth. Now come, curse them for me. \n" +
                "   Perhaps I shall be able to fight against them and drive them out.’” \n" +
                "12 God said to Balaam, “You shall not go with them. You shall not curse the people, for they are blessed.” \n" +
                "13 So Balaam rose in the morning and said to the princes of Balak, “Go to your own land, \n" +
                "   for the LORD has refused to let me go with you.” \n" +
                "14 So the princes of Moab rose and went to Balak and said, “Balaam refuses to come with us.”\n" +
                "15 Once again Balak sent princes, more in number and more honorable than these. \n" +
                "16 And they came to Balaam and said to him, “Thus says Balak the son of Zippor: ‘Let nothing hinder you from coming to me, \n" +
                "17 for I will surely do you great honor, and whatever you say to me I will do. tCome, curse this people for me.’” \n" +
                "18 But Balaam answered and said to the servants of Balak, “Though Balak were to give me his house full of silver and gold, \n" +
                "   I could not go beyond the command of the LORD my God to do less or more. \n" +
                "19 So you, too, please stay here tonight, that I may know what more the LORD will say to me.”\n" +
                "20 And God came to Balaam at night and said to him, “If the men have come to call you, rise, go with them; but only do what I tell you.” \n" +
                "21 So Balaam rose in the morning and saddled his donkey and went with the princes of Moab.\n";


        String chapterSecondTitle = "Balaam's Donkey and the Angel";

        String secondContent = "22 But God's anger was kindled because he went, and the angel of the LORD took his stand in the way as his adversary. \n" +
                "   Now he was riding on the donkey, and his two servants were with him. \n" +
                "23 And the donkey saw the angel of the LORD standing in the road, with a drawn sword in his hand. \n" +
                "   And the donkey turned aside out of the road and went into the field. And Balaam struck the donkey, to turn her into the road. \n" +
                "24 Then the angel of the LORD stood in a narrow path between the vineyards, with a wall on either side. \n" +
                "25 And when the donkey saw the angel of the LORD, she pushed against the wall and pressed Balaam's foot against the wall. \n" +
                "   So he struck her again. \n" +
                "26 Then the angel of the LORD went ahead and stood in a narrow place, where there was no way to turn either to the right or to the left. \n" +
                "27 When the donkey saw the angel of the LORD, she lay down under Balaam. And Balaam's anger was kindled, \n" +
                "   and he struck the donkey with his staff. \n" +
                "28 Then the LORD opened the mouth of the donkey, and she said to Balaam, “What have I done to you, \n" +
                "   that you have struck me these three times?” \n" +
                "29 And Balaam said to the donkey, “Because you have made a fool of me. I wish I had a sword in my hand, \n" +
                "   for then I would kill you.” \n" +
                "30 And the donkey said to Balaam, “Am I not your donkey, on which you have ridden all your life long to this day? \n" +
                "   Is it my habit to treat you this way?” And he said, “No.”\n" +
                "31 Then the LORD opened the eyes of Balaam, and he saw the angel of the LORD standing in the way, with his drawn sword in his hand. \n" +
                "   And he bowed down and fell on his face. \n" +
                "32 And the angel of the LORD said to him, “Why have you struck your donkey these three times? Behold, \n" +
                "   I have come out to oppose you because your way is perverse before me.\n" +
                "33 The donkey saw me and turned aside before me these three times. If she had not turned aside from me, surely just now \n" +
                "   I would have killed you and let her live.” \n" +
                "34 Then Balaam said to the angel of the LORD, “I have sinned, for I did not know that you stood in the road against me. \n" +
                "   Now therefore, if it is evil in your sight, I will turn back.” \n" +
                "35 And the angel of the LORD said to Balaam, “Go with the men, but speak only the word that I tell you.” \n" +
                "   So Balaam went on with the princes of Balak.\n" +
                "36 When Balak heard that Balaam had come, he went out to meet him at the city of Moab, on the border formed by the Arnon, \n" +
                "   at the extremity of the border. \n" +
                "37 And Balak said to Balaam, “Did I not send to you to call you? Why did you not come to me? Am I not able to honor you?”\n" +
                "38 Balaam said to Balak, “Behold, I have come to you! Have I now any power of my own to speak anything? \n" +
                "   The word that God puts in my mouth, that must I speak.” \n" +
                "39 Then Balaam went with Balak, and they came to Kiriath-huzoth. \n" +
                "40 And Balak sacrificed oxen and sheep, and sent for Balaam and for the princes who were with him.\n" +
                "41 And in the morning Balak took Balaam and brought him up to Bamoth-baal, and from there he saw a fraction of the people.\n";


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


    public void chapterTwentyThreeOFNumbers() {

        table23 = new Table();
        table23.setWidth(tableBG.getWidth());
        table23.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table23.setFillParent(true);
        table23.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Balaam's First Oracle";

        String firstContent = "1 And Balaam said to Balak, “Build for me here seven altars, and prepare for me here seven bulls and seven rams.” \n" +
                "2 Balak did as Balaam had said. And Balak and Balaam offered on each altar a bull and a ram. \n" +
                "3 And Balaam said to Balak, “Stand beside your burnt offering, and I will go. \n" +
                "   Perhaps the LORD will come to meet me, and whatever he shows me I will tell you.” And he went to a bare height,\n" +
                "4 and God met Balaam. And Balaam said to him, “I have arranged the seven altars and I have offered on each altar a bull and a ram.” \n" +
                "5 And theLORD put a word in Balaam's mouth and said, “Return to Balak, and thus you shall speak.” \n" +
                "6 And he returned to him, and behold, he and all the princes of Moab were standing beside his burnt offering. \n" +
                "7 And Balaam took up his discourse and said,\n" +
                "“From Aram Balak has brought me, the king of Moab from the eastern mountains: \n" +
                "   ‘Come, curse Jacob for me, and come, denounce Israel!’\n" +
                "8 How can I curse whom God has not cursed?\n" +
                "How can I denounce whom the LORD has not denounced?\n" +
                "9 For from the top of the crags I see him, from the hills I behold him; behold, a people dwelling alone, \n" +
                "   and not counting itself among the nations!\n" +
                "10 Who can count the dust of Jacob or number the fourth part of Israel?\n" +
                "Let me die the death of the upright, and let my end be like his!”\n" +
                "11 And Balak said to Balaam, “What have you done to me? I took you to curse my enemies, and behold, you have done nothing but bless them.” \n" +
                "12 And he answered and said, “Must I not take care to speak what the LORD puts in my mouth?”\n";


        String chapterSecondTitle = "Balaam's Second Oracle";

        String secondContent = "13 And Balak said to him, “Please come with me to another place, from which you may see them. \n" +
                "   You shall see only a fraction of them and shall not see them all. Then curse them for me from there.” \n" +
                "14 And he took him to the field of Zophim, to the top of Pisgah, and built seven altars and offered a bull and a ram on each altar. \n" +
                "15 Balaam said to Balak, “Stand here beside your burnt offering, while I meet the LORD over there.” \n" +
                "16 And the LORD met Balaam and put a word in his mouth and said, “Return to Balak, and thus shall you speak.” \n" +
                "17 And he came to him, and behold, he was standing beside his burnt offering, and the princes of Moab with him. \n" +
                "   And Balak said to him, “What has the LORD spoken?” \n" +
                "18 And Balaam took up his discourse and said, “Rise, Balak, and hear; give ear to me, O son of Zippor:\n" +
                "19 God is not man, that he should lie,\n" +
                "or a son of man, that he should change his mind.\n" +
                "Has he said, and will he not do it?\n" +
                "Or has he spoken, and will he not fulfill it?\n" +
                "20 Behold, I received a command to bless:\n" +
                "he has blessed, and I cannot revoke it.\n" +
                "21 He has not beheld misfortune in Jacob,\n" +
                "nor has he seen trouble in Israel.\n" +
                "The LORD their God is with them,\n" +
                "and the shout of a king is among them.\n" +
                "22 God brings them out of Egypt\n" +
                "and is for them like the horns of the wild ox.\n" +
                "23 For there is no enchantment against Jacob,\n" +
                "no divination against Israel;\n" +
                "now it shall be said of Jacob and Israel,\n" +
                " ‘What has God wrought!’\n" +
                "24  Behold, a people! As a lioness it rises up\n" +
                "and as a lion it lifts itself;\n" +
                "it does not lie down until it has devoured the prey\n" +
                "and drunk the blood of the slain.”\n" +
                "25 And Balak said to Balaam, “Do not curse them at all, and do not bless them at all.” \n" +
                "26 But Balaam answered Balak, “Did I not tell you, ‘All that the LORD says, that I must do’?” \n" +
                "27 And Balak said to Balaam, “Come now, I will take you to another place. \n" +
                "   Perhaps it will please God that you may curse them for me from there.” \n" +
                "28 So Balak took Balaam to the top of Peor, which overlooks the desert. \n" +
                "29 And Balaam said to Balak, “Build for me here seven altars and prepare for me here seven bulls and seven rams.” \n" +
                "30 And Balak did as Balaam had said, and offered a bull and a ram on each altar.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

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

        stage.addActor(table23);


    }


    public void chapterTwentyFourOFNumbers() {

        table24 = new Table();
        table24.setWidth(tableBG.getWidth());
        table24.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table24.setFillParent(true);
        table24.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Balaam's Third Oracle";

        String firstContent = "1 When Balaam saw that it pleased the LORD to bless Israel, he did not go, as at other times, \n" +
                "   to look for omens, but set his face toward the wilderness. \n" +
                "2 And Balaam lifted up his eyes and saw Israel camping tribe by tribe. And the Spirit of God came upon him, \n" +
                "3 and he took up his discourse and said,\n" +
                "“The oracle of Balaam the son of Beor, the oracle of the man whose eye is opened, \n" +
                "4 the oracle of him who hears the words of God,\n" +
                "who sees the vision of the Almighty,\n" +
                "falling down with his eyes uncovered:\n" +
                "5 How lovely are your tents, O Jacob,\n" +
                "your encampments, O Israel!\n" +
                "6 Like palm groves2 that stretch afar,\n" +
                "like gardens beside a river,\n" +
                "like aloes that the LORD has planted,\n" +
                "like cedar trees beside the waters.\n" +
                "7  Water shall flow from his buckets,\n" +
                "and his seed shall be in many waters;\n" +
                "his king shall be higher than Agag,\n" +
                "and his kingdom shall be exalted.\n" +
                "8  God brings him out of Egypt\n" +
                "and is for him like the horns of the wild ox;\n" +
                "he shall eat up the nations, his adversaries,\n" +
                "and shall break their bones in pieces\n" +
                "and pierce them through with his arrows.\n" +
                "9  He crouched, he lay down like a lion\n" +
                "and like a lioness; who will rouse him up?\n" +
                "Blessed are those who bless you,\n" +
                "and cursed are those who curse you.”\n" +
                "10 And Balak's anger was kindled against Balaam, and he struck his hands together. And Balak said to Balaam, \n" +
                "   “I called you to curse my enemies, and behold, you have blessed them these three times.\n" +
                "11 Therefore now flee to your own place. I said, ‘I will certainly honor you,’ but the LORD has held you back from honor.” \n" +
                "12 And Balaam said to Balak, “Did I not tell your messengers whom you sent to me,\n" +
                "13  ‘If Balak should give me his house full of silver and gold, I would not be able to go beyond the word of the LORD, \n" +
                "   to do either good or bad of my own will. What the LORD speaks, that will I speak’? \n" +
                "14 And now, behold, I am going to my people. Come, I will let you know what this people will do to your people in the latter days.”\n" +
                "Balaam's Final Oracle\n" +
                "15 And he took up his discourse and said, “The oracle of Balaam the son of Beor, the oracle of the man whose eye is opened,\n" +
                "16 the oracle of him who hears the words of God, and knows the knowledge of the Most High, who sees the vision of the Almighty, \n" +
                "   falling down with his eyes uncovered:\n" +
                "17 I see him, but not now; I behold him, but not near: a star shall come out of Jacob, and a scepter shall rise out of Israel; \n" +
                "   it shall crush the forehead of Moab and break dow all the sons of Sheth.\n" +
                "18 Edom shall be dispossessed; Seir also, his enemies, shall be dispossessed. Is doing valiantly.\n" +
                "19  And one from Jacob shall exercise dominion band destroy the survivors of cities!”\n" +
                "20 Then he looked on Amalek and took up his discourse and said, “Amalek was the first among the nations, but its end is utter destruction.”\n" +
                "21 And he looked on the Kenite, and took up his discourse and said, “Enduring is your dwelling place, and your nest is set in the rock. \n" +
                "22 Nevertheless, Kain shall be burned when Asshur takes you away captive.”\n" +
                "23 And he took up his discourse and said, “Alas, who shall live when God does this?\n" +
                "24 But ships shall come from Kittim and shall afflict Asshur and Eber; and he too shall come to utter destruction.”\n" +
                "25 Then Balaam rose and went back to his place. And Balak also went his way.\n";


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


    public void chapterTwentyFiveOFNumbers() {

        table25 = new Table();
        table25.setWidth(tableBG.getWidth());
        table25.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table25.setFillParent(true);
        table25.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Baal Worship at Peor";

        String firstContent = "1 While Israel lived in Shittim, the people began to whore with the daughters of Moab. \n" +
                "2 These invited the people to the sacrifices of their gods, and the people ate and bowed down to their gods. \n" +
                "3 So Israel yoked himself to Baal of Peor. And the anger of the LORD was kindled against Israel. \n" +
                "4 And the LORD said to Moses, “Take all the chiefs of the people and hang them in the sun before the LORD, \n" +
                "   that the fierce anger of the LORD may turn away from Israel.” \n" +
                "5 And Moses said to the judges of Israel, “Each of you kill those of his men who have yoked themselves to Baal of Peor.”\n" +
                "6 And behold, one of the people of Israel came and brought a Midianite woman to his family, \n" +
                "   in the sight of Moses and in the sight of the whole congregation of the people of Israel, \n" +
                "   while they were weeping in the entrance of the tent of meeting. \n" +
                "7 When Phinehas the son of Eleazar, son of Aaron the priest, saw it, he rose and left the congregation and took a spear in his hand \n" +
                "8 and went after the man of Israel into the chamber and pierced both of them, the man of Israel and the woman through her belly. \n" +
                "   Thus the plague on the people of Israel was stopped. \n" +
                "9 Nevertheless,  those who died by the plague were twenty-four thousand.\n";


        String chapterSecondTitle = "The Zeal of Phinehas";

        String secondContent = "10 And the LORD said to Moses, \n" +
                "11 “Phinehas the son of Eleazar, son of Aaron the priest, has turned back my wrath from the people of Israel, \n" +
                "   in that he was jealous with my jealousy among them, so that I did not consume the people of Israel in my jealousy. \n" +
                "12 Therefore say, ‘Behold, I give to him my covenant of peace, \n" +
                "13 and it shall be to him and to his descendants after him the covenant of a perpetual priesthood, \n" +
                "   because he was jealous for his God and made atonement for the people of Israel.’”\n" +
                "14 The name of the slain man of Israel, who was killed with the Midianite woman, was Zimri the son of Salu, \n" +
                "   chief of a father's house belonging to the Simeonites. \n" +
                "15 And the name of the Midianite woman who was killed was Cozbi the daughter of Zur, who was the tribal head of a father's house in Midian.\n" +
                "16 And the LORD spoke to Moses, saying,\n" +
                "17 “Harass the Midianites and strike them down, \n" +
                "18 for they have harassed you with their wiles, with which they beguiled you in the matter of Peor, and in the matter of Cozbi, \n" +
                "   the daughter of the chief of Midian, their sister, who was killed on the day of the plague on account of Peor.”\n";


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

    public void chapterTwentySixOFNumbers() {

        table26 = new Table();
        table26.setWidth(tableBG.getWidth());
        table26.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table26.setFillParent(true);
        table26.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Census of the New Generation";

        String firstContent = "1 After the plague, the LORD said to Moses and to Eleazar the son of Aaron, the priest, \n" +
                "2 “Take a census of all the congregation of the people of Israel, from twenty years old and upward, by their fathers' houses, \n" +
                "   all in Israel who are able to go to war.” \n" +
                "3 And Moses and Eleazar the priest spoke with them in the plains of Moab by the Jordan at Jericho, saying, \n" +
                "4 “Take a census of the people, from twenty years old and upward,” as the LORD commanded Moses. \n" +
                "   The people of Israel who came out of the land of Egypt were:\n" +
                "5 Reuben, the firstborn of Israel; the sons of Reuben: of Hanoch, the clan of the Hanochites; of Pallu, the clan of the Palluites;\n" +
                "6 of Hezron, the clan of the Hezronites; of Carmi, the clan of the Carmites. \n" +
                "7 These are the clans of the Reubenites, and those listed were 43,730. \n" +
                "8 And the sons of Pallu: Eliab. \n" +
                "9 The sons of Eliab: Nemuel, Dathan, and Abiram. These are the Dathan and Abiram,  chosen from the congregation, \n" +
                "   who contended against Moses and Aaron in the company of Korah, when they contended against the LORD \n" +
                "10 and the earth opened its mouth and swallowed them up together with Korah, when that company died, when the fire devoured 250 men, \n" +
                "   and they became a warning. \n" +
                "11 But the sons of Korah did not die.\n" +
                "12 The sons of Simeon according to their clans: of Nemuel, the clan of the Nemuelites; of Jamin, the clan of the Jaminites; of Jachin, \n" +
                "   the clan of the Jachinites; \n" +
                "13 of Zerah, the clan of the Zerahites; of Shaul, the clan of the Shaulites. \n" +
                "14 These are the clans of the Simeonites, 22,200.\n" +
                "15 The sons of Gad according to their clans: of Zephon, the clan of the Zephonites; of Haggi, the clan of the Haggites; of Shuni,\n" +
                "    the clan of the Shunites; \n" +
                "16 of Ozni, the clan of the Oznites; of Eri, the clan of the Erites; \n" +
                "17 of Arod, the clan of the Arodites; of Areli, the clan of the Arelites. \n" +
                "18 These are the clans of the sons of Gad as they were listed, 40,500.\n" +
                "19 The sons of Judah were Er and Onan; and Er and Onan died in the land of Canaan. \n" +
                "20 And the sons of Judah according to their clans were: of Shelah, the clan of the Shelanites; of Perez, \n" +
                "   the clan of the Perezites; of Zerah, the clan of the Zerahites. \n" +
                "21 And the sons of Perez were: of Hezron, the clan of the Hezronites; of Hamul, the clan of the Hamulites. \n" +
                "22 These are the clans of Judah as they were listed, 76,500.\n" +
                "23 The sons of Issachar according to their clans: of Tola, the clan of the Tolaites; of Puvah, the clan of the Punites; \n" +
                "24 of Jashub, the clan of the Jashubites; of Shimron, the clan of the Shimronites.\n" +
                "25 These are the clans of Issachar as they were listed, 64,300.\n" +
                "26 The sons of rZebulun, according to their clans: of Sered, the clan of the Seredites; of Elon, \n" +
                "   the clan of the Elonites; of Jahleel, the clan of the Jahleelites.\n" +
                "27 These are the clans of the Zebulunites as they were listed, 60,500.\n" +
                "28 The sons of Joseph according to their clans: Manasseh and Ephraim. \n" +
                "29 The sons of Manasseh: of Machir, the clan of the Machirites; and Machir was the father of Gilead; of Gilead, \n" +
                "   the clan of the Gileadites. \n" +
                "30 These are the sons of Gilead: of Iezer, the clan of the Iezerites; of Helek, the clan of the Helekites; \n" +
                "31 and of Asriel, the clan of the Asrielites; and of Shechem, the clan of the Shechemites; \n" +
                "32 and of Shemida, the clan of the Shemidaites; and of Hepher, the clan of the Hepherites. \n" +
                "33 Now Zelophehad the son of Hepher had no sons, but daughters. And the names of the daughters of Zelophehad were Mahlah, \n" +
                "   Noah, Hoglah, Milcah, and Tirzah.\n" +
                "34 These are the clans of Manasseh, and those listed were 52,700.\n" +
                "35 These are the sons of Ephraim according to their clans: of Shuthelah, the clan of the Shuthelahites; \n" +
                "   of Becher, the clan of the Becherites; of Tahan, the clan of the Tahanites. \n" +
                "36 And these are the sons of Shuthelah: of Eran, the clan of the Eranites. \n" +
                "37 These are the clans of the sons of Ephraim as they were listed, 32,500. These are the sons of Joseph according to their clans.\n" +
                "38 The sons of Benjamin according to their clans: of Bela, the clan of the Belaites; of Ashbel, the clan of the Ashbelites; \n" +
                "   of Ahiram, the clan of the Ahiramites;\n" +
                "39 of Shephupham, the clan of the Shuphamites; of Hupham, the clan of the Huphamites. \n" +
                "40 And the sons of Bela were Ard and Naaman: of Ard, the clan of the Ardites; of Naaman, the clan of the Naamites.\n" +
                "41 These are the sons of Benjamin according to their clans, and those listed were 45,600.\n" +
                "42 These are the sons of Dan according to their clans: of Shuham, the clan of the Shuhamites. \n" +
                "   These are the clans of Dan according to their clans. \n" +
                "43 All the clans of the Shuhamites, as they were listed, were 64,400.\n" +
                "44 The sons of Asher according to their clans: of Imnah, the clan of the Imnites; of Ishvi, the clan of the Ishvites; of Beriah, \n" +
                "   the clan of the Beriites.\n" +
                "45 Of the sons of Beriah: of Heber, the clan of the Heberites; of Malchiel, the clan of the Malchielites. \n" +
                "46 And the name of the daughter of Asher was Serah.\n" +
                "47 These are the clans of the sons of Asher as they were listed, 53,400.\n" +
                "48 The sons of Naphtali according to their clans: of Jahzeel, the clan of the Jahzeelites; of Guni, \n" +
                "   the clan of the Gunites; 49 of Jezer, \n" +
                "   the clan of the Jezerites; of Shillem, the clan of the Shillemites. 50 These are the clans of Naphtali according to their clans, \n" +
                "   and those listed were 45,400.\n" +
                "51 This was the list of the people of Israel, 601,730.\n" +
                "52 The LORD spoke to Moses, saying, \n" +
                "53 “Among these the land shall be divided for inheritance according to the number of names. \n" +
                "54 To a large tribe you shall give a large inheritance, and to a small tribe you shall give a small inheritance; \n" +
                "   every tribe shall be given its inheritance in proportion to its list. 55 But the land shall be divided by lot.\n" +
                "    According to the names of the tribes of their fathers they shall inherit. \n" +
                "56 Their inheritance shall be divided according to lot between the larger and the smaller.”\n" +
                "57 This was the list of the Levites according to their clans: of Gershon, the clan of the Gershonites; of Kohath, the clan of the Kohathites; \n" +
                "   of Merari, the clan of the Merarites. \n" +
                "58 These are the clans of Levi: the clan of the Libnites, the clan of the Hebronites, the clan of the Mahlites, \n" +
                "   the clan of the Mushites, the clan of the Korahites. And Kohath was the father of Amram. \n" +
                "59 The name of Amram's wife was Jochebed the daughter of Levi, who was born to Levi in Egypt. \n" +
                "   And she bore to Amram Aaron and Moses and Miriam their sister. \n" +
                "60 And to Aaron were born Nadab, Abihu, Eleazar, and Ithamar. \n" +
                "61 But Nadab and Abihu died when they offered unauthorized fire before the LORD.\n" +
                "62 And those listed were 23,000, every male from a month old and upward. For they were not listed among the people of Israel, \n" +
                "   because there was no inheritance given to them among the people of Israel.\n" +
                "63 These were those listed by Moses and Eleazar the priest, who listed the people of Israel in the plains of Moab by the Jordan at Jericho.\n" +
                "64 But among these there was not one of those listed by Moses and Aaron the priest, \n" +
                "   who had listed the people of Israel in the wilderness of Sinai. \n" +
                "65 For the LORD had said of them, “They shall die in the wilderness.” Not one of them was left, \n" +
                "   except Caleb the son of Jephunneh and Joshua the son of Nun.\n";


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

    public void chapterTwentySevenOFNumbers() {

        table27 = new Table();
        table27.setWidth(tableBG.getWidth());
        table27.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table27.setFillParent(true);
        table27.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "The Daughters of Zelophehad";

        String firstContent = "1 Then drew near the daughters of Zelophehad the son of Hepher, son of Gilead, son of Machir, son of Manasseh, \n" +
                " from the clans of Manasseh the son of Joseph. The names of his daughters were: Mahlah, Noah, Hoglah, Milcah, and Tirzah. \n" +
                "2 And they stood before Moses and before Eleazar the priest and before the chiefs and all the congregation, \n" +
                " at the entrance of the tent of meeting, saying, \n" +
                "3 “Our father died in the wilderness. He was not among the company of those who gathered themselves together \n" +
                "   against the LORD in the company of Korah,\n" +
                "  but died for his own sin. And he had no sons. \n" +
                "4 Why should the name of our father be taken away from his clan because he had no son? Give to us a possession among our father's brothers.”\n" +
                "5 Moses brought their case before the LORD. \n" +
                "6 And the LORD said to Moses, \n" +
                "7 “The daughters of Zelophehad are right. You shall give them possession of an inheritance among their father's brothers \n" +
                " and transfer the inheritance of their father to them. \n" +
                "8 And you shall speak to the people of Israel, saying, ‘If a man dies and has no son, then you shall transfer his inheritance to his daughter. \n" +
                "9 And if he has no daughter, then you shall give his inheritance to his brothers. \n" +
                "10 And if he has no brothers, then you shall give his inheritance to his father's brothers.\n" +
                "11 And if his father has no brothers, then you shall give his inheritance to the nearest kinsman of his clan, and he shall possess it. \n" +
                " And it shall be for the people of Israel a statute and rule, as the LORD commanded Moses.’”\n";


        String chapterSecondTitle = "Joshua to Succeed Moses";

        String secondContent = "12 The LORD said to Moses, “Go up into this mountain of Abarim and see the land that I have given to the people of Israel. \n" +
                "13 When you have seen it, you also shall be gathered to your people, as your brother Aaron was, \n" +
                "14 because you rebelled against my word in the wilderness of Zin when the congregation quarreled, \n" +
                " failing to uphold me as holy at the waters before their eyes.” (These are the waters of Meribah of Kadesh in the wilderness of Zin.) \n" +
                "15 Moses spoke to the LORD, saying,\n" +
                "16 “Let the LORD, the God of the spirits of all flesh, appoint a man over the congregation \n" +
                "17 who shall go out before them and come in before them, who shall lead them out and bring them in, \n" +
                " that the congregation of the LORD may not be as sheep that have no shepherd.” \n" +
                "18 So theLORD said to Moses, “Take Joshua the son of Nun, a man in whom is the Spirit, and lay your hand on him. \n" +
                "19 Make him stand before Eleazar the priest and all the congregation, and you shall commission him in their sight. \n" +
                "20 You shall invest him with some of your authority, that all the congregation of the people of Israel may obey. \n" +
                "21 And he shall stand before Eleazar the priest, who shall inquire for him by the judgment of the Urim before the LORD. \n" +
                " At his word they shall go out, and at his word they shall come in, both he and all the people of Israel with him, the whole congregation.” \n" +
                "22 And Moses did as the LORD commanded him. He took Joshua and made him stand before Eleazar the priest and the whole congregation, \n" +
                "23 and he laid his hands on him and commissioned him as the LORD directed through Moses.\n";
 

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

    public void chapterTwentyEightOFNumbers() {

        table28 = new Table();
        table28.setWidth(tableBG.getWidth());
        table28.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table28.setFillParent(true);
        table28.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Daily Offerings";

        String firstContent = "1 The LORD spoke to Moses, saying, \n" +
                "2 “Command the people of Israel and say to them, ‘My offering, my food for my food offerings, my pleasing aroma, \n" +
                "   you shall be careful to offer to me at its appointed time.’ \n" +
                "3 And you shall say to them, This is the food offering that you shall offer to the LORD: two male lambs a year old without blemish, \n" +
                "   day by day, as a regular offering. \n" +
                "4 The one lamb you shall offer in the morning, and the other lamb you shall offer at twilight; \n" +
                "5 also a tenth of an ephah of fine flour for a grain offering, mixed with a quarter of a hin of beaten oil. \n" +
                "6 It is a regular burnt offering, which was ordained at Mount Sinai for a pleasing aroma, a food offering to theLORD. \n" +
                "7 Its drink offering shall be a quarter of a hin for each lamb. In the Holy Place you shall pour out a drink offering of strong drink to theLORD. \n" +
                "8 The other lamb you shall offer at twilight. Like the grain offering of the morning, and like its drink offering, \n" +
                "   you shall offer it as a food offering, with a pleasing aroma to the LORD.\n";


        String chapterSecondTitle = "Sabbath Offerings";

        String secondContent = "9 “On the Sabbath day, two male lambs a year old without blemish, and two tenths of an ephah of fine flour \n" +
                "   for a grain offering, mixed with oil, and its drink offering: \n" +
                "10 this is the burnt offering of every Sabbath, besides the regular burnt offering and its drink offering.\n";

        String chapterThirdTitle = "Monthly Offerings";

        String thirdContent = "11 “At the beginnings of your months, you shall offer a burnt offering to the LORD: two bulls from the herd, \n" +
                "   one ram, seven male lambs a year old without blemish;\n" +
                "12 also three tenths of an ephah of fine flour for a grain offering, mixed with oil, for each bull, \n" +
                "   and two tenths of fine flour for a grain offering, mixed with oil, for the one ram;\n" +
                "13 and a tenth of fine flour mixed with oil as a grain offering for every lamb; for a burnt offering with a pleasing aroma, \n" +
                "   a food offering to theLORD. \n" +
                "14 Their drink offerings shall be half a hin of wine for a bull, a third of a hin for a ram, and a quarter of a hin for a lamb. \n" +
                "   This is the burnt offering of each month throughout the months of the year.\n" +
                "15 Also one male goat for a sin offering to the LORD; it shall be offered besides the regular burnt offering and its drink offering.\n";


        String chapterFourthTitle = "Passover Offerings";

        String fourthContent = "16 “On the fourteenth day of the first month is the LORD's Passover,\n" +
                "17 and on the fifteenth day of this month is a feast. Seven days shall unleavened bread be eaten. \n" +
                "18 On the first day there shall be a holy convocation. You shall not do any ordinary work, 19 but offer a food offering, \n" +
                "   a burnt offering to the LORD: two bulls from the herd, one ram, and seven male lambs a year old; see that they are without blemish;\n" +
                "20 also their grain offering of fine flour mixed with oil; three tenths of an ephah shall you offer for a bull, and two tenths for a ram; \n" +
                "21 a tenth shall you offer for each of the seven lambs; \n" +
                "22 also one male goat for a sin offering, to make atonement for you.\n" +
                "23 You shall offer these besides the burnt offering of the morning, which is for a regular burnt offering. \n" +
                "24 In the same way you shall offer daily, for seven days, the food of a food offering, with a pleasing aroma to the LORD.\n" +
                "    It shall be offered besides the regular burnt offering and its drink offering. \n" +
                "25 And on the seventh day you shall have a holy convocation. You shall not do any ordinary work.\n";


        String chapterFifthTitle = "Offerings for the Feast of Weeks";

        String fifthContent = "26 “On the day of the firstfruits, when you offer a grain offering of new grain to the LORD at your Feast of Weeks, \n" +
                "   you shall have a holy convocation. You shall not do any ordinary work, \n" +
                "27 but offer a burnt offering, with a pleasing aroma to the LORD: two bulls from the herd, one ram, seven male lambs a year old; \n" +
                "28 also their grain offering of fine flour mixed with oil, three tenths of an ephah for each bull, two tenths for one ram, \n" +
                "29 a tenth for each of the seven lambs; \n" +
                "30 with one male goat, to make atonement for you. \n" +
                "31 Besides the regular burnt offering and its grain offering, you shall offer them and their drink offering. See that they are without blemish.\n";


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

        //title of the fourth content
        table28.add(lblFourthTitle).pad(10,50,0,0).left();
        table28.row();

        //content of the fourth title
        table28.add(txtFourthContent).pad(10,70,0,0).left().width(900);

        //title of the fifth content
        table28.add(lblFifthTitle).pad(10,50,0,0).left();
        table28.row();

        //content of the fifth title
        table28.add(txtFifthContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table28);


    }

    public void chapterTwentyNineOFNumbers() {

        table29 = new Table();
        table29.setWidth(tableBG.getWidth());
        table29.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table29.setFillParent(true);
        table29.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Offerings for the Feast of Trumpets";

        String firstContent = "1 “On the first day of the seventh month you shall have a holy convocation. You shall not do any ordinary work. \n" +
                "   It is a day for you to blow the trumpets, \n" +
                "2 and you shall offer a burnt offering, for a pleasing aroma to the LORD: one bull from the herd, one ram, \n" +
                "   seven male lambs a year old without blemish; \n" +
                "3 also their grain offering of fine flour mixed with oil, three tenths of an ephah for the bull, two tenths for the ram, \n" +
                "4 and one tenth for each of the seven lambs; \n" +
                "5 with one male goat for a sin offering, to make atonement for you; \n" +
                "6 besides the burnt offering of the new moon, and its grain offering, and the regular burnt offering and its grain offering, \n" +
                "   and their drink offering, according to the rule for them, for a pleasing aroma, a food offering to the LORD.\n";


        String chapterSecondTitle = "Offerings for the Day of Atonement";

        String secondContent = "7 “On the tenth day of this seventh month you shall have a holy convocation and afflict yourselves. You shall do no work, \n" +
                "8 but you shall offer a burnt offering to the LORD, a pleasing aroma: one bull from the herd, one ram, seven male lambs a year old: \n" +
                "   see that they are without blemish. \n" +
                "9 And their grain offering shall be of fine flour mixed with oil, three tenths of an ephah for the bull, two tenths for the one ram, \n" +
                "10 a tenth for each of the seven lambs: \n" +
                "11 also one male goat for a sin offering, besides the sin offering of atonement, and the regular burnt offering and its grain offering, \n" +
                "   and their drink offerings.\n";


        String chapterThirdTitle = "Offerings for the Feast of Booths";

        String thirdContent = "12 “On the fifteenth day of the seventh month you shall have a holy convocation. You shall not do any ordinary work, \n" +
                "   and you shall keep a feast to the LORD seven days. \n" +
                "13 And you shall offer a burnt offering, a food offering, with a pleasing aroma to the LORD, thirteen bulls from the herd, two rams, \n" +
                "   fourteen male lambs a year old; they shall be without blemish; \n" +
                "14 and their grain offering of fine flour mixed with oil, three tenths of an ephah for each of the thirteen bulls, \n" +
                "   two tenths for each of the two rams, \n" +
                "15 and a tenth for each of the fourteen lambs; \n" +
                "16 also one male goat for a sin offering, besides the regular burnt offering, its grain offering and its drink offering.\n" +
                "17 “On the second day twelve bulls from the herd, two rams, fourteen male lambs a year old without blemish, \n" +
                "18 with the grain offering and the drink offerings for the bulls, for the rams, and for the lambs, in the prescribed quantities; \n" +
                "19 also one male goat for a sin offering, besides the regular burnt offering and its grain offering, and their drink offerings.\n" +
                "20 “On the third day eleven bulls, two rams, fourteen male lambs a year old without blemish, 21 with the grain offering \n" +
                "   and the drink offerings for the bulls, for the rams, and for the lambs, in the prescribed quantities; \n" +
                "22 also one male goat for a sin offering, besides the regular burnt offering and its grain offering and its drink offering.\n" +
                "23 “On the fourth day ten bulls, two rams, fourteen male lambs a year old without blemish, \n" +
                "24 with the grain offering and the drink offerings for the bulls, for the rams, and for the lambs, in the prescribed quantities; \n" +
                "25 also one male goat for a sin offering, besides the regular burnt offering, its grain offering and its drink offering.\n" +
                "26 “On the fifth day nine bulls, two rams, fourteen male lambs a year old without blemish, \n" +
                "27 with the grain offering and the drink offerings for the bulls, for the rams, and for the lambs, in the prescribed quantities; \n" +
                "28 also one male goat for a sin offering; besides the regular burnt offering and its grain offering and its drink offering.\n" +
                "29 “On the sixth day eight bulls, two rams, fourteen male lambs a year old without blemish, \n" +
                "30 with the grain offering and the drink offerings for the bulls, for the rams, and for the lambs, in the prescribed quantities; \n" +
                "31 also one male goat for a sin offering; besides the regular burnt offering, its grain offering, and its drink offerings.\n" +
                "32 “On the seventh day seven bulls, two rams, fourteen male lambs a year old without blemish, \n" +
                "33 with the grain offering and the drink offerings for the bulls, for the rams, and for the lambs, in the prescribed quantities; \n" +
                "34 also one male goat for a sin offering; besides the regular burnt offering, its grain offering, and its drink offering.\n" +
                "35 “On the eighth day you shall have a solemn assembly. You shall not do any ordinary work, \n" +
                "36 but you shall offer a burnt offering, a food offering, with a pleasing aroma to the LORD: one bull, one ram,\n" +
                "    seven male lambs a year old without blemish, \n" +
                "37 and the grain offering and the drink offerings for the bull, for the ram, and for the lambs, in the prescribed quantities; \n" +
                "38 also one male goat for a sin offering; besides the regular burnt offering and its grain offering and its drink offering.\n" +
                "39 “These you shall offer to the LORD at your appointed feasts, in addition to your vow offerings and your freewill offerings, \n" +
                "   for your burnt offerings, and for your grain offerings, and for your drink offerings, and for your peace offerings.”\n" +
                "40 So Moses told the people of Israel everything just as the LORD had commanded Moses.\n";

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
        table29.add(lblFirstTitle).pad(10,50,0,0).left();
        table29.row();

        //content of the chapter
        table29.add(txtFirstContent).pad(10,70,0,0).left().width(900);
        table29.row();

        //title of the second content
        table29.add(lblSecondTitle).pad(10,50,0,0).left();
        table29.row();

        //content of the second title
        table29.add(txtSecondContent).pad(10,70,0,0).left().width(900);
        table29.row();

        //title of the third content
        table29.add(lblThirdTitle).pad(10,50,0,0).left();
        table29.row();

        //content of the third title
        table29.add(txtThirdContent).pad(10,70,0,0).left().width(900);

        stage.addActor(table29);


    }


    public void chapterThirtyOFNumbers() {

        table30 = new Table();
        table30.setWidth(tableBG.getWidth());
        table30.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table30.setFillParent(true);
        table30.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Men and Vows";

        String firstContent = "1 Moses spoke to the heads of the tribes of the people of Israel, saying, “This is what the LORD has commanded. \n" +
                "2 If a man vows a vow to the LORD, or swears an oath to bind himself by a pledge, he shall not break his word. \n" +
                "   He shall do according to all that proceeds out of his mouth.\n";


        String chapterSecondTitle = "Women and Vows";

        String secondContent = "3 “If a woman vows a vow to the LORD and binds herself by a pledge, while within her father's house in her youth, \n" +
                "4 and her father hears of her vow and of her pledge by which she has bound herself and says nothing to her, \n" +
                "   then all her vows shall stand, and every pledge by which she has bound herself shall stand. \n" +
                "5 But if her father opposes her on the day that he hears of it, no vow of hers, no pledge by which she has bound herself shall stand. \n" +
                "   And the LORD will forgive her, because her father opposed her.\n" +
                "6 “If she marries a husband, while under her vows or any thoughtless utterance of her lips by which she has bound herself, \n" +
                "7 and her husband hears of it and says nothing to her on the day that he hears, then her vows shall stand, \n" +
                "   and her pledges by which she has bound herself shall stand. \n" +
                "8 But if, on the day that her husband comes to hear of it, he opposes her, then he makes void her vow that was on her, \n" +
                "   and the thoughtless utterance of her lips by which she bound herself. And theLORD will forgive her. \n" +
                "9 (But any vow of a widow or of a divorced woman, anything by which she has bound herself, shall stand against her.)\n" +
                "10 And if she vowed in her husband's house or bound herself by a pledge with an oath, \n" +
                "11 and her husband heard of it and said nothing to her and did not oppose her, then all her vows shall stand, \n" +
                "   and every pledge by which she bound herself shall stand. \n" +
                "12 But if her husband makes them null and void on the day that he hears them, \n" +
                "   then whatever proceeds out of her lips concerning her vows or concerning her pledge of herself shall not stand. \n" +
                "   Her husband has made them void, and the LORD will forgive her. \n" +
                "13 Any vow and any binding oath to afflict herself, her husband may establish, or her husband may make void. \n" +
                "14 But if her husband says nothing to her from day to day, then he establishes all her vows or all her pledges that are upon her.\n" +
                "    He has established them, because he said nothing to her on the day that he heard of them. \n" +
                "15 But if he makes them null and void after he has heard of them, then he shall bear her iniquity.”\n" +
                "16 These are the statutes that the LORD commanded Moses about a man and his wife and about a father and his daughter \n" +
                "   while she is in her youth within her father's house.\n";


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


    public void chapterThirtyOneOFNumbers() {

        table31 = new Table();
        table31.setWidth(tableBG.getWidth());
        table31.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table31.setFillParent(true);
        table31.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));
 
        String chapterFirstTitle = "Vengeance on Midian";

        String firstContent = "1 The LORD spoke to Moses, saying, \n" +
                "2 “Avenge the people of Israel on the Midianites. Afterward you shall be gathered to your people.” \n" +
                "3 So Moses spoke to the people, saying, “Arm men from among you for the war, \n" +
                "   that they may go against Midian to execute theLORD's vengeance on Midian. \n" +
                "4 You shall send a thousand from each of the tribes of Israel to the war.” \n" +
                "5 So there were provided, out of the thousands of Israel, a thousand from each tribe, twelve thousand armed for war. \n" +
                "6 And Moses sent them to the war, a thousand from each tribe, together with Phinehas the son of Eleazar the priest, \n" +
                "   with the vessels of the sanctuary and the trumpets for the alarm in his hand.\n" +
                "7 They warred against Midian, as the LORD commanded Moses, and killed every male. \n" +
                "8 They killed the kings of Midian with the rest of their slain, Evi, Rekem, Zur, Hur, and Reba, the five kings of Midian. \n" +
                "   And they also killed Balaam the son of Beor with the sword. \n" +
                "9 And the people of Israel took captive the women of Midian and their little ones, and they took as plunder all their cattle, \n" +
                "   their flocks, and all their goods.\n" +
                "10 All their cities in the places where they lived, and all their encampments, they burned with fire, \n" +
                "11 and took all the spoil and all the plunder, both of man and of beast. \n" +
                "12 Then they brought the captives and the plunder and the spoil to Moses, and to Eleazar the priest, \n" +
                "   and to the congregation of the people of Israel, at the camp on the plains of Moab by the Jordan at Jericho.\n" +
                "13 Moses and Eleazar the priest and all the chiefs of the congregation went to meet them outside the camp. \n" +
                "14 And Moses was angry with the officers of the army, the commanders of thousands and the commanders of hundreds, \n" +
                "   who had come from service in the war. \n" +
                "15 Moses said to them, “Have you let all the women live? \n" +
                "16 Behold, these,  on Balaam's advice, caused the people of Israel to act treacherously against the LORDin the incident of Peor, \n" +
                "   and so the plague came among the congregation of the LORD. \n" +
                "17 Now therefore, kill every male among the little ones, and kill every woman who has known man by lying with him.\n" +
                "18 But all the young girls who have not known man by lying with him keep alive for yourselves. \n" +
                "19 Encamp outside the camp seven days. Whoever of you has killed any person and whoever has touched any slain, \n" +
                "   purify yourselves and your captives on the third day and on the seventh day. \n" +
                "20 You shall purify every garment, every article of skin, all work of goats' hair, and every article of wood.”\n" +
                "21 Then Eleazar the priest said to the men in the army who had gone to battle: \n" +
                "   “This is the statute of the law that the LORD has commanded Moses: \n" +
                "22 only the gold, the silver, the bronze, the iron, the tin, and the lead, \n" +
                "23 everything that can stand the fire, you shall pass through the fire, and it shall be clean. Nevertheless, \n" +
                "   it shall also be purified with the water for impurity. And whatever cannot stand the fire, you shall pass through the water. \n" +
                "24 You must wash your clothes on the seventh day, and you shall be clean. And afterward you may come into the camp.”\n" +
                "25 The LORD said to Moses, \n" +
                "26 “Take the count of the plunder that was taken, both of man and of beast, \n" +
                "   you and Eleazar the priest and the heads of the fathers' houses of the congregation, \n" +
                "27 and divide the plunder into two parts between the warriors who went out to battle and all the congregation. \n" +
                "28 And levy for the LORD a tribute from the men of war who went out to battle, one out of five hundred, \n" +
                "   of the people and of the oxen and of the donkeys and of the flocks. \n" +
                "29 Take it from their half and give it to Eleazar the priest as a contribution to the LORD.\n" +
                "30 And from the people of Israel's half you shall take one drawn out of every fifty, of the people, of the oxen, \n" +
                "   of the donkeys, and of the flocks, of all the cattle, and give them to the Levites who keep guard over the tabernacle of the LORD.” \n" +
                "31 And Moses and Eleazar the priest did as theLORD commanded Moses.\n" +
                "32 Now the plunder remaining of the spoil that the army took was 675,000 sheep, \n" +
                "33 72,000 cattle, \n" +
                "34 61,000 donkeys, \n" +
                "35 and 32,000 persons in all, women who had not known man by lying with him.\n" +
                "36 And the half, the portion of those who had gone out in the army, numbered 337,500 sheep, \n" +
                "37 and the LORD's tribute of sheep was 675.\n" +
                "38 The cattle were 36,000, of which the LORD's tribute was 72.\n" +
                "39 The donkeys were 30,500, of which the LORD's tribute was 61. \n" +
                "40 The persons were 16,000, of which the LORD's tribute was 32 persons. \n" +
                "41 And Moses gave the tribute, which was the contribution for the LORD, to Eleazar the priest, as the LORD commanded Moses.\n" +
                "42 From the people of Israel's half, which Moses separated from that of the men who had served in the army—\n" +
                "43 now the congregation's half was 337,500 sheep, \n" +
                "44 36,000 cattle, \n" +
                "45 and 30,500 donkeys, \n" +
                "46 and 16,000 persons—\n" +
                "47 from the people of Israel's half Moses took one of every 50, both of persons and of beasts, \n" +
                "   and gave them to the Levites who kept guard over the tabernacle of the LORD, as the LORD commanded Moses.\n" +
                "48 Then the officers who were over the thousands of the army, the commanders of thousands \n" +
                "   and the commanders of hundreds, came near to Moses \n" +
                "49 and said to Moses, “Your servants have counted the men of war who are under our command, \n" +
                "   and there is not a man missing from us. \n" +
                "50 And we have brought the LORD's offering, what each man found, articles of gold, armlets and bracelets, \n" +
                "   signet rings, earrings, and beads, to make atonement for ourselves before the LORD.” \n" +
                "51 And Moses and Eleazar the priest received from them the gold, all crafted articles.\n" +
                "52 And all the gold of the contribution that they presented to the LORD, from the commanders of thousands\n" +
                "    and the commanders of hundreds, was 16,750 shekels. \n" +
                "53 (The men in the army had each taken plunder for himself.) \n" +
                "54 And Moses and Eleazar the priest received the gold from the commanders of thousands and of hundreds, \n" +
                "   and brought it into the tent of meeting, as a memorial for the people of Israel before the LORD.\n";

        
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


    public void chapterThirtyTwoOFNumbers() {

        table32 = new Table();
        table32.setWidth(tableBG.getWidth());
        table32.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table32.setFillParent(true);
        table32.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Reuben and Gad Settle in Gilead";

        String firstContent = "1 Now the people of Reuben and the people of Gad had a very great number of livestock. \n" +
                "   And they saw the land of Jazer and the land of Gilead, and behold, the place was a place for livestock. \n" +
                "2 So the people of Gad and the people of Reuben came and said to Moses and to Eleazar the priest and to the chiefs of the congregation, \n" +
                "3 “Ataroth, Dibon, Jazer, Nimrah, Heshbon, Elealeh, Sebam, Nebo, and Beon,\n" +
                "4 the land that the LORD struck down before the congregation of Israel, is a land for livestock, and your servants have livestock.” \n" +
                "5 And they said, “If we have found favor in your sight, let this land be given to your servants for a possession. \n" +
                "   Do not take us across the Jordan.”\n" +
                "6 But Moses said to the people of Gad and to the people of Reuben, “Shall your brothers go to the war while you sit here? \n" +
                "7 Why will you discourage the heart of the people of Israel from going over into the land that the LORD has given them? \n" +
                "8 Your fathers did this, when I sent them from Kadesh-barnea to see the land. \n" +
                "9 For when they went up to the Valley of Eshcol and saw the land, \n" +
                "   they discouraged the heart of the people of Israel from going into the land that the LORD had given them.\n" +
                "10 And the LORD's anger was kindled on that day, and he swore, saying,\n" +
                "11 ‘Surely none of the men who came up out of Egypt, from twenty years old and upward, \n" +
                "   shall see the land that I swore to give to Abraham, to Isaac, and to Jacob, because they have not wholly followed me, \n" +
                "12 none except Caleb the son of Jephunneh the Kenizzite and Joshua the son of Nun, \n" +
                "   for they have wholly followed the LORD.’\n" +
                "13 And the LORD's anger was kindled against Israel, and he made them wander in the wilderness forty years, \n" +
                "   until all the generation that had done evil in the sight of the LORD was gone. \n" +
                "14 And behold, you have risen in your fathers' place, a brood of sinful men, \n" +
                "   to increase still more the fierce anger of the LORD against Israel! \n" +
                "15 For if you turn away from following him, he will again abandon them in the wilderness, and you will destroy all this people.”\n" +
                "16 Then they came near to him and said, “We will build sheepfolds here for our livestock, and cities for our little ones, \n" +
                "17 but we will take up arms, ready to go before the people of Israel, until we have brought them to their place. \n" +
                "   And our little ones shall live in the fortified cities because of the inhabitants of the land. \n" +
                "18 We will not return to our homes until each of the people of Israel has gained his inheritance.\n" +
                "19 For we will not inherit with them on the other side of the Jordan and beyond, \n" +
                "   because our inheritance has come to us on this side of the Jordan to the east.” \n" +
                "20 So Moses said to them, “If you will do this, if you will take up arms to go before the LORD for the war, \n" +
                "21 and every armed man of you will pass over the Jordan before the LORD, until he has driven out his enemies from before him \n" +
                "22 and the land is subdued before the LORD; then after that you shall return and be free of obligation to the LORD and to Israel, \n" +
                "   and this land shall be your possession before the LORD. \n" +
                "23 But if you will not do so, behold, you have sinned against the LORD, and be sure your sin will find you out.\n" +
                "24 Build cities for your little ones and folds for your sheep, and do what you have promised.” \n" +
                "25 And the people of Gad and the people of Reuben said to Moses, “Your servants will do as my lord commands. \n" +
                "26 Our little ones, our wives, our livestock, and all our cattle shall remain there in the cities of Gilead, \n" +
                "27 but your servants will pass over, every man who is armed for war, before the LORD to battle, as my lord orders.”\n" +
                "28 So Moses gave command concerning them to Eleazar the priest and to Joshua the son of Nun \n" +
                "   and to the heads of the fathers' houses of the tribes of the people of Israel. \n" +
                "29 And Moses said to them, “If the people of Gad and the people of Reuben, every man who is armed to battle before the LORD, \n" +
                "   will pass with you over the Jordan and the land shall be subdued before you, then you shall give them the land of Gilead for a possession. \n" +
                "30 However, if they will not pass over with you armed, they shall have possessions among you in the land of Canaan.” \n" +
                "31 And the people of Gad and the people of Reuben answered, “What the LORD has said to your servants, we will do. \n" +
                "32 We will pass over armed before the LORD into the land of Canaan, \n" +
                "   and the possession of our inheritance shall remain with us beyond the Jordan.”\n" +
                "33 And Moses gave to them, to the people of Gad and to the people of Reuben and to the half-tribe of Manasseh the son of Joseph,\n" +
                "    the kingdom of Sihon king of the Amorites and the kingdom of Og king of Bashan, \n" +
                "   the land and its cities with their territories, the cities of the land throughout the country. \n" +
                "34 And the people of Gad built Dibon, Ataroth, Aroer, \n" +
                "35 Atroth-shophan, Jazer, Jogbehah, \n" +
                "36 Beth-nimrah and Beth-haran, fortified cities, and folds for sheep. \n" +
                "37 And the people of Reuben built Heshbon, Elealeh, Kiriathaim, \n" +
                "38 Nebo, and Baal-meon (their names were changed), and Sibmah. And they gave other names to the cities that they built. \n" +
                "39 And the sons of Machir the son of Manasseh went to Gilead and captured it, and dispossessed the Amorites who were in it. \n" +
                "40 And Moses gave Gilead to Machir the son of Manasseh, and he settled in it. \n" +
                "41 And Jair the son of Manasseh went and captured their villages, and called them Havvoth-jair. \n" +
                "42 And Nobah went and captured Kenath and its villages, and called it Nobah, after his own name.\n";


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


    public void chapterThirtyThreeOFNumbers() {

        table33 = new Table();
        table33.setWidth(tableBG.getWidth());
        table33.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table33.setFillParent(true);
        table33.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Recounting Israel's Journey";

        String firstContent = "1 These are the stages of the people of Israel, when they went out of the land of Egypt \n" +
                "   by their companies under the leadership of Moses and Aaron. \n" +
                "2 Moses wrote down their starting places, stage by stage, by command of the LORD, \n" +
                "   and these are their stages according to their starting places. \n" +
                "3 They set out from Rameses in the first month, on the fifteenth day of the first month. On the day after the Passover, \n" +
                "   the people of Israel went out triumphantly in the sight of all the Egyptians,\n" +
                "4 while the Egyptians were burying all their firstborn, whom the LORD had struck down among them. \n" +
                "   On their gods also the LORD executed judgments.\n" +
                "5 So the people of Israel set out from Rameses and camped at Succoth. \n" +
                "6 And they set out from Succoth and camped at Etham, which is on the edge of the wilderness. \n" +
                "7 And they set out from Etham and turned back to Pi-hahiroth, which is east of Baal-zephon, and they camped before Migdol. \n" +
                "8 And they set out from before Hahiroth and passed through the midst of the sea into the wilderness, \n" +
                "   and they went a three days' journey in the wilderness of Etham and camped at Marah.\n" +
                "9 And they set out from Marah and came to Elim; at Elim there were twelve springs of water and seventy palm trees, and they camped there.\n" +
                "10 And they set out from Elim and camped by the Red Sea. \n" +
                "11 And they set out from the Red Sea and camped in the wilderness of Sin. \n" +
                "12 And they set out from the wilderness of Sin and camped at Dophkah. \n" +
                "13 And they set out from Dophkah and camped at Alush. \n" +
                "14 And they set out from Alush and camped at Rephidim, where there was no water for the people to drink. \n" +
                "15 And they set out from Rephidim and camped in the wilderness of Sinai. \n" +
                "16 And they set out from the wilderness of Sinai and camped at Kibroth-hattaavah. \n" +
                "17 And they set out from Kibroth-hattaavah and camped at Hazeroth. \n" +
                "18 And they set out from Hazeroth and camped at Rithmah. \n" +
                "19 And they set out from Rithmah and camped at Rimmon-perez. \n" +
                "20 And they set out from Rimmon-perez and camped at Libnah. \n" +
                "21 And they set out from Libnah and camped at Rissah. \n" +
                "22 And they set out from Rissah and camped at Kehelathah. \n" +
                "23 And they set out from Kehelathah and camped at Mount Shepher. \n" +
                "24 And they set out from Mount Shepher and camped at Haradah. \n" +
                "25 And they set out from Haradah and camped at Makheloth. \n" +
                "26 And they set out from Makheloth and camped at Tahath. \n" +
                "27 And they set out from Tahath and camped at Terah. \n" +
                "28 And they set out from Terah and camped at Mithkah. \n" +
                "29 And they set out from Mithkah and camped at Hashmonah. \n" +
                "30 And they set out from Hashmonah and camped at Moseroth. \n" +
                "31 And they set out from Moseroth and camped at Bene-jaakan. \n" +
                "32 And they set out from Bene-jaakan and camped at Hor-haggidgad. \n" +
                "33 And they set out from Hor-haggidgad and camped at Jotbathah.\n" +
                "34 And they set out from Jotbathah and camped at Abronah. \n" +
                "35 And they set out from Abronah and camped at Ezion-geber. \n" +
                "36 And they set out from Ezion-geber and camped in the wilderness of Zin (that is, Kadesh). \n" +
                "37 And they set out from Kadesh and camped at Mount Hor, on the edge of the land of Edom.\n" +
                "38 And Aaron the priest went up Mount Hor at the command of theLORD and died there, \n" +
                "   in the fortieth year after the people of Israel had come out of the land of Egypt, on the first day of the fifth month. \n" +
                "39 And Aaron was 123 years old when he died on Mount Hor.\n" +
                "40 And the Canaanite, the king of Arad, who lived in the Negeb in the land of Canaan, heard of the coming of the people of Israel.\n" +
                "41 And they set out from Mount Hor and camped at Zalmonah.\n" +
                "42 And they set out from Zalmonah and camped at Punon. \n" +
                "43 And they set out from Punon and camped at Oboth. \n" +
                "44 And they set out from Oboth and camped at Iye-abarim, in the territory of Moab. \n" +
                "45 And they set out from Iyim and camped at Dibon-gad.\n" +
                "46 And they set out from Dibon-gad and camped at Almon-diblathaim. \n" +
                "47 And they set out from Almon-diblathaim and camped in the mountains of Abarim, before Nebo. \n" +
                "48 And they set out from the mountains of Abarim and camped in the plains of Moab by the Jordan at Jericho; \n" +
                "49 they camped by the Jordan from Beth-jeshimoth as far as Abel-shittim in the plains of Moab.\n";


        String chapterSecondTitle = "Drive Out the Inhabitants";

        String secondContent = "50 And the LORD spoke to Moses in the plains of Moab by the Jordan at Jericho, saying, \n" +
                "51 “Speak to the people of Israel and say to them, When you pass over the Jordan into the land of Canaan, \n" +
                "52 then you shall drive out all the inhabitants of the land from before you and destroy all their figured stones \n" +
                "   and destroy all their metal images and demolish all their high places. \n" +
                "53 And you shall take possession of the land and settle in it, for I have given the land to you to possess it.\n" +
                "54 You shall inherit the land by lot according to your clans. To a large tribe you shall give a large inheritance, \n" +
                "   and to a small tribe you shall give a small inheritance. Wherever the lot falls for anyone that shall be his. \n" +
                "   According to the tribes of your fathers you shall inherit. \n" +
                "55 But if you do not drive out the inhabitants of the land from before you, \n" +
                "   then those of them whom you let remain shall be as barbs in your eyes and thorns in your sides, \n" +
                "   and they shall trouble you in the land where you dwell.\n" +
                "56 And I will do to you as I thought to do to them.”\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

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

        stage.addActor(table33);


    }

    public void chapterThirtyFourOFNumbers() {

        table34 = new Table();
        table34.setWidth(tableBG.getWidth());
        table34.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table34.setFillParent(true);
        table34.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Boundaries of the Land";

        String firstContent = "1 The LORD spoke to Moses, saying, \n" +
                "2 “Command the people of Israel, and say to them, When you enter the land of Canaan \n" +
                "   (this is the land that shall fall to you for an inheritance, the land of Canaan as defined by its borders), \n" +
                "3 your south side shall be from the wilderness of Zin alongside Edom, \n" +
                "   and your southern border shall run from the end of the Salt Sea on the east. \n" +
                "4 And your border shall turn south of the ascent of Akrabbim, and cross to Zin, and its limit shall be south of Kadesh-barnea. \n" +
                "   Then it shall go on to Hazar-addar, and pass along to Azmon. \n" +
                "5 And the border shall turn from Azmon to the Brook of Egypt, and its limit shall be at the sea.\n" +
                "6 “For the western border, you shall have the Great Sea and its coast. This shall be your western border.\n" +
                "7 “This shall be your northern border: from the Great Sea you shall draw a line to Mount Hor. \n" +
                "8 From Mount Hor you shall draw a line to Lebo-hamath, and the limit of the border shall be at Zedad. \n" +
                "9 Then the border shall extend to Ziphron, and its limit shall be at Hazar-enan. This shall be your northern border.\n" +
                "10 “You shall draw a line for your eastern border from Hazar-enan to Shepham. \n" +
                "11 And the border shall go down from Shepham to Riblah on the east side of Ain.\n" +
                "    And the border shall go down and reach to the shoulder of the Sea of Chinnereth on the east. \n" +
                "12 And the border shall go down to the Jordan, and its limit shall be at the Salt Sea. \n" +
                "   This shall be your land as defined by its borders all around.”\n" +
                "13 Moses commanded the people of Israel, saying, “This is the land that you shall inherit by lot, \n" +
                "   which the LORD has commanded to give to the nine tribes and to the half-tribe. \n" +
                "14 For the tribe of the people of Reuben by fathers' houses and the tribe of the people of Gad \n" +
                "   by their fathers' houses have received their inheritance, and also the half-tribe of Manasseh. \n" +
                "15 The two tribes and the half-tribe have received their inheritance beyond the Jordan east of Jericho, toward the sunrise.”\n";


        String chapterSecondTitle = "List of Tribal Chiefs";

        String secondContent = "16 The LORD spoke to Moses, saying, \n" +
                "17 “These are the names of the men who shall divide the land to you for inheritance: Eleazar the priest and Joshua the son of Nun. \n" +
                "18 You shall take one chief from every tribe to divide the land for inheritance. \n" +
                "19 These are the names of the men: Of the tribe of Judah, Caleb the son of Jephunneh. \n" +
                "20 Of the tribe of the people of Simeon, Shemuel the son of Ammihud. \n" +
                "21 Of the tribe of Benjamin, Elidad the son of Chislon. \n" +
                "22 Of the tribe of the people of Dan a chief, Bukki the son of Jogli. \n" +
                "23 Of the people of Joseph: of the tribe of the people of Manasseh a chief, Hanniel the son of Ephod. \n" +
                "24 And of the tribe of the people of Ephraim a chief, Kemuel the son of Shiphtan. \n" +
                "25 Of the tribe of the people of Zebulun a chief, Elizaphan the son of Parnach.\n" +
                "26 Of the tribe of the people of Issachar a chief, Paltiel the son of Azzan.\n" +
                "27 And of the tribe of the people of Asher a chief, Ahihud the son of Shelomi. \n" +
                "28 Of the tribe of the people of Naphtali a chief, Pedahel the son of Ammihud.” \n" +
                "29 These are the men whom the LORD commanded to divide the inheritance for the people of Israel in the land of Canaan.\n";


        lblFirstTitle = new Label(chapterFirstTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        lblSecondTitle = new Label(chapterSecondTitle, new Label.LabelStyle(contentFont, Color.WHITE));

        txtFirstContent = new Label(firstContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtFirstContent.setWrap(true);

        txtSecondContent = new Label(secondContent, new Label.LabelStyle(contentFont, Color.WHITE));
        txtSecondContent.setWrap(true);

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

        stage.addActor(table34);

    }


    public void chapterThirtyFiveOFNumbers() {

        table35 = new Table();
        table35.setWidth(tableBG.getWidth());
        table35.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table35.setFillParent(true);
        table35.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Cities for the Levites";

        String firstContent = "1 The LORD spoke to Moses in the plains of Moab by the Jordan at Jericho, saying,\n" +
                "2 “Command the people of Israel to give to the Levites some of the inheritance of their possession as cities for them to dwell in. \n" +
                "   And you shall give to the Levites pasturelands around the cities. \n" +
                "3 The cities shall be theirs to dwell in, and their pasturelands shall be for their cattle and for their livestock and for all their beasts. \n" +
                "4 The pasturelands of the cities, which you shall give to the Levites, shall reach from the wall of the city outward a thousand cubits all around. \n" +
                "5 And you shall measure, outside the city, on the east side two thousand cubits, and on the south side two thousand cubits, \n" +
                "   and on the west side two thousand cubits, and on the north side two thousand cubits, the city being in the middle. \n" +
                "   This shall belong to them as pastureland for their cities.\n" +
                "6 “The cities that you give to the Levites shall be the six cities of refuge, where you shall permit the manslayer to flee, \n" +
                "   and in addition to them you shall give forty-two cities. \n" +
                "7 All the cities that you give to the Levites shall be forty-eight, with their pasturelands. \n" +
                "8 And as for the cities that you shall give from the possession of the people of Israel, from the larger tribes you shall take many, \n" +
                "   and from the smaller tribes you shall take few; each, in proportion to the inheritance that it inherits, \n" +
                "   shall give of its cities to the Levites.”\n";


        String chapterSecondTitle = "Cities of Refuge";

        String secondContent = "9 And the LORD spoke to Moses, saying,\n" +
                "10 “Speak to the people of Israel and say to them, When you cross the Jordan into the land of Canaan, \n" +
                "11 then you shall select cities to be cities of refuge for you, that the manslayer who kills any person without intent may flee there. \n" +
                "12 The cities shall be for you a refuge from the avenger that the manslayer may not die until he stands before the congregation for judgment. \n" +
                "13 And the cities that you give shall be your six cities of refuge.\n" +
                "14 You shall give three cities beyond the Jordan, and three cities in the land of Canaan, to be cities of refuge. \n" +
                "15 These six cities shall be for refuge for the people of Israel, and for the stranger and for the sojourner among them, \n" +
                "   that anyone who kills any person without intent may flee there.\n" +
                "16  “But if he struck him down with an iron object, so that he died, he is a murderer. The murderer shall be put to death. \n" +
                "17 And if he struck him down with a stone tool that could cause death, and he died, he is a murderer. The murderer shall be put to death. \n" +
                "18 Or if he struck him down with a wooden tool that could cause death, and he died, he is a murderer. The murderer shall be put to death. \n" +
                "19 The avenger of blood shall himself put the murderer to death; when he meets him, he shall put him to death. \n" +
                "20 And if he pushed him out of hatred or hurled something at him, lying in wait, so that he died, \n" +
                "21 or in enmity struck him down with his hand, so that he died, then he who struck the blow shall be put to death. \n" +
                "   He is a murderer. The avenger of blood shall put the murderer to death when he meets him.\n" +
                "22 “But if he pushed him suddenly without enmity, or hurled anything on him without lying in wait \n" +
                "23 or used a stone that could cause death, and without seeing him dropped it on him, so that he died, \n" +
                "   though he was not his enemy and did not seek his harm, \n" +
                "24 then the congregation shall judge between the manslayer and the avenger of blood, in accordance with these rules. \n" +
                "25 And the congregation shall rescue the manslayer from the hand of the avenger of blood, \n" +
                "   and the congregation shall restore him to his city of refuge to which he had fled, and he shall live in it \n" +
                "   until the death of the high priest who was anointed with the holy oil. \n" +
                "26 But if the manslayer shall at any time go beyond the boundaries of his city of refuge to which he fled, \n" +
                "27 and the avenger of blood finds him outside the boundaries of his city of refuge, and the avenger of blood kills the manslayer, \n" +
                "   he shall not be guilty of blood. \n" +
                "28 For he must remain in his city of refuge until the death of the high priest, \n" +
                "   but after the death of the high priest the manslayer may return to the land of his possession. \n" +
                "29 And these things shall be for a statute and rule for you throughout your generations in all your dwelling places.\n" +
                "30 “If anyone kills a person, the murderer shall be put to death on the evidence of witnesses. \n" +
                "   But no person shall be put to death on the testimony of one witness. 31 Moreover, you shall accept no ransom for the life of a murderer, \n" +
                "   who is guilty of death, but he shall be put to death. \n" +
                "32 And you shall accept no ransom for him who has fled to his city of refuge that he may return to dwell in the land \n" +
                "   before the death of the high priest. \n" +
                "33 You shall not pollute the land in which you live, for blood pollutes the land, \n" +
                "   and no atonement can be made for the land for the blood that is shed in it, except by the blood of the one who shed it.\n" +
                "34 You shall not defile the land in which you live, in the midst of which I dwell,  \n" +
                "   for I the LORD dwell in the midst of the people of Israel.”\n";


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


    public void chapterThirtySixOFNumbers() {

        table36 = new Table();
        table36.setWidth(tableBG.getWidth());
        table36.top().left().padTop(Gdx.graphics.getHeight() / 8).padLeft(Gdx.graphics.getWidth() / 8);
        table36.setFillParent(true);
        table36.setBackground(new TextureRegionDrawable(new TextureRegion(tableBG)));

        String chapterFirstTitle = "Marriage of Female Heirs";

        String firstContent = "1 The heads of the fathers' houses of the clan of the people of Gilead the son of Machir, son of Manasseh, \n" +
                "   from the clans of the people of Joseph, came near and spoke before Moses and before the chiefs, \n" +
                "   the heads of the fathers' houses of the people of Israel.\n" +
                "2 They said, “The LORD commanded my lord to give the land for inheritance by lot to the people of Israel, \n" +
                "   and my lord was commanded by the LORD to give the inheritance of Zelophehad our brother to his daughters.\n" +
                "3 But if they are married to any of the sons of the other tribes of the people of Israel, \n" +
                "   then their inheritance will be taken from the inheritance of our fathers and added to the inheritance \n" +
                "   of the tribe into which they marry. So it will be taken away from the lot of our inheritance. \n" +
                "4 And when the jubilee of the people of Israel comes, then their inheritance will be added to the inheritance \n" +
                "   of the tribe into which they marry, \n" +
                "   and their inheritance will be taken from the inheritance of the tribe of our fathers.”\n" +
                "5 And Moses commanded the people of Israel according to the word of the LORD, saying, “The tribe of the people of Joseph is right. \n" +
                "6 This is what the LORD commands concerning the daughters of Zelophehad: ‘Let them marry whom they think best, \n" +
                "   only they shall marry within the clan of the tribe of their father. \n" +
                "7 The inheritance of the people of Israel shall not be transferred from one tribe to another, \n" +
                "   for every one of the people of Israel shall hold on to the inheritance of the tribe of his fathers. \n" +
                "8 And every daughter who possesses an inheritance in any tribe of the people of Israel shall be wife \n" +
                "    to one of the clan of the tribe of her father,\n" +
                "    so that every one of the people of Israel may possess the inheritance of his fathers. \n" +
                "9 So no inheritance shall be transferred from one tribe to another, \n" +
                "   for each of the tribes of the people of Israel shall hold on to its own inheritance.’”\n" +
                "10 The daughters of Zelophehad did as the LORD commanded Moses,\n" +
                "11 for Mahlah, Tirzah, Hoglah, Milcah, and Noah, the daughters of Zelophehad, were married to sons of their father's brothers. \n" +
                "12 They were married into the clans of the people of Manasseh the son of Joseph, \n" +
                "   and their inheritance remained in the tribe of their father's clan.\n" +
                "13 These are the commandments and the rules that the LORD commanded through Moses to the people of Israel \n" +
                "   in the plains of Moab by the Jordan at Jericho.\n";


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
    }

    public void update(){

        camera.update();
    }

    public void render(SpriteBatch sb){

        stage.draw();
    }

    public Table getTable36() {
        return table36;
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

    public Stage getStage() {
        return stage;
    }

    public OrthographicCamera getCamera() {
        return camera;
    }
}



