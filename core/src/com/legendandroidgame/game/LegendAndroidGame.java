package com.legendandroidgame.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.legendandroidgame.game.States.GameStateManager;
import com.legendandroidgame.game.States.SplashScreen;

public class LegendAndroidGame extends ApplicationAdapter {

	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	public static final String TITLE = "LeGEND: Journey to promised Land";
//	public static final float lookX = 956, lookY = 657, lookZ = 899;

	private GameStateManager gsm;
	private static SpriteBatch batch;
	public static Music backgroundMusic;
	public static Music splashSound;
	public static Music storyMusic;
	public static Sound clickSound;
	public static OrthographicCamera gameCam;
	public static Viewport gameView;
	public static Preferences gameData;

//	private static final int popo = Gdx.graphics
//	private static final boolean fu = Gdx.graphics.isFullscreen();

	// variable names, just follow
	public static Music genesisChOne, genesisChTwo, genesisChThree, genesisChFour, genesisChFive, genesisChSix, genesisChSeven,
			genesisChEight, genesisChNine, genesisChTen, genesisChEleven, genesisChTwelve, genesisChThirteen, genesisChFourteen,
			genesisChFifteen, genesisChSixteen, genesisChSeventeen, genesisChEighteen, genesisChNineteen, genesisChTwenty,
			genesisChTwentyOne, genesisChTwentyTwo, genesisChTwentyThree, genesisChTwentyFour, genesisChTwentyFive, genesisChTwentySix,
			genesisChTwentySeven, genesisChTwentyEight, genesisChTwentyNine, genesisChThirty, genesisChThirtyOne, genesisChThirtyTwo,
			genesisChThirtyThree, genesisChThirtyFour, genesisChThirtyFive, genesisChThirtySix, genesisChThirtySeven, genesisChThirtyEight,
			genesisChThirtyNine, genesisChForty, genesisChFortyOne, genesisChFortyTwo, genesisChFortyThree, genesisChFortyFour,
			genesisChFortyFive, genesisChFortySix, genesisChFortySeven, genesisChFortyEight, genesisChFortyNine, genesisChFifty,
			exodusChOne, exodusChTwo, exodusChThree, exodusChFour, exodusChFive, exodusChSix, exodusChSeven,
			exodusChEight, exodusChNine, exodusChTen, exodusChEleven, exodusChTwelve, exodusChThirteen, exodusChFourteen,
			exodusChFifteen, exodusChSixteen, exodusChSeventeen, exodusChEighteen, exodusChNineteen, exodusChTwenty,
			exodusChTwentyOne, exodusChTwentyTwo, exodusChTwentyThree, exodusChTwentyFour, exodusChTwentyFive, exodusChTwentySix,
			exodusChTwentySeven, exodusChTwentyEight, exodusChTwentyNine, exodusChThirty, exodusChThirtyOne, exodusChThirtyTwo,
			exodusChThirtyThree, exodusChThirtyFour, exodusChThirtyFive, exodusChThirtySix, exodusChThirtySeven, exodusChThirtyEight,
			exodusChThirtyNine, exodusChForty, leviticusChOne, leviticusChTwo, leviticusChThree, leviticusChFour, leviticusChFive, leviticusChSix, leviticusChSeven,
			leviticusChEight, leviticusChNine, leviticusChTen, leviticusChEleven, leviticusChTwelve, leviticusChThirteen, leviticusChFourteen,
			leviticusChFifteen, leviticusChSixteen, leviticusChSeventeen, leviticusChEighteen, leviticusChNineteen, leviticusChTwenty,
			leviticusChTwentyOne, leviticusChTwentyTwo, leviticusChTwentyThree, leviticusChTwentyFour, leviticusChTwentyFive, leviticusChTwentySix,
			leviticusChTwentySeven, numbersChOne, numbersChTwo, numbersChThree, numbersChFour, numbersChFive, numbersChSix, numbersChSeven,
			numbersChEight, numbersChNine, numbersChTen, numbersChEleven, numbersChTwelve, numbersChThirteen, numbersChFourteen,
			numbersChFifteen, numbersChSixteen, numbersChSeventeen, numbersChEighteen, numbersChNineteen, numbersChTwenty,
			numbersChTwentyOne, numbersChTwentyTwo, numbersChTwentyThree, numbersChTwentyFour, numbersChTwentyFive, numbersChTwentySix,
			numbersChTwentySeven, numbersChTwentyEight, numbersChTwentyNine, numbersChThirty, numbersChThirtyOne, numbersChThirtyTwo,
			numbersChThirtyThree, numbersChThirtyFour, numbersChThirtyFive, numbersChThirtySix, deuteronomyChOne, deuteronomyChTwo, deuteronomyChThree, deuteronomyChFour,
			deuteronomyChFive, deuteronomyChSix, deuteronomyChSeven, deuteronomyChEight, deuteronomyChNine, deuteronomyChTen, deuteronomyChEleven,
			deuteronomyChTwelve, deuteronomyChThirteen, deuteronomyChFourteen, deuteronomyChFifteen, deuteronomyChSixteen, deuteronomyChSeventeen,
			deuteronomyChEighteen, deuteronomyChNineteen, deuteronomyChTwenty, deuteronomyChTwentyOne, deuteronomyChTwentyTwo, deuteronomyChTwentyThree,
			deuteronomyChTwentyFour, deuteronomyChTwentyFive, deuteronomyChTwentySix, deuteronomyChTwentySeven, deuteronomyChTwentyEight, deuteronomyChTwentyNine,
			deuteronomyChThirty, deuteronomyChThirtyOne, deuteronomyChThirtyTwo, deuteronomyChThirtyThree, deuteronomyChThirtyFour, joshuaChOne, joshuaChTwo,
			joshuaChThree, joshuaChFour, joshuaChFive, joshuaChSix, joshuaChSeven, joshuaChEight, joshuaChNine, joshuaChTen, joshuaChEleven, joshuaChTwelve,
			joshuaChThirteen, joshuaChFourteen, joshuaChFifteen, joshuaChSixteen, joshuaChSeventeen, joshuaChEighteen, joshuaChNineteen, joshuaChTwenty,
			joshuaChTwentyOne, joshuaChTwentyTwo, joshuaChTwentyThree, joshuaChTwentyFour;
	//

	@Override
	public void create () {

		Gdx.input.setCatchBackKey(true);

		batch = new SpriteBatch();

		gameData = Gdx.app.getPreferences("LegendAndroidGame_Data");
		splashSound = Gdx.audio.newMusic(Gdx.files.internal("sounds/splash screen.MP3"));
		splashSound.setLooping(true);
		splashSound.setVolume(1f);

		backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("sounds/Background playback.MP3"));
		backgroundMusic.setLooping(true);
		backgroundMusic.setVolume(0.5f);

		clickSound = Gdx.audio.newSound(Gdx.files.internal("sounds/button-16.mp3"));

		storyMusic = Gdx.audio.newMusic(Gdx.files.internal("sounds/Intro to Genesis.MP3"));
		storyMusic.setLooping(true);
		storyMusic.setVolume(0.5f);

		musicList();

		gameCam = new OrthographicCamera( Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		gameCam.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		gameView = new FitViewport( Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), gameCam);

		gameData.putString("isPaused", "false");
		gameData.flush();

		gsm = new GameStateManager();
		gsm.push(new SplashScreen(gsm));
	}

	private void musicList(){
		genesisChOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___01_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___02_Genesis_____ENGESVO2DA.mp3"));
		genesisChThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___03_Genesis_____ENGESVO2DA.mp3"));
		genesisChFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___04_Genesis_____ENGESVO2DA.mp3"));
		genesisChFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___05_Genesis_____ENGESVO2DA.mp3"));
		genesisChSix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___06_Genesis_____ENGESVO2DA.mp3"));
		genesisChSeven= Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___07_Genesis_____ENGESVO2DA.mp3"));
		genesisChEight = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___08_Genesis_____ENGESVO2DA.mp3"));
		genesisChNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___09_Genesis_____ENGESVO2DA.mp3"));
		genesisChTen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___10_Genesis_____ENGESVO2DA.mp3"));
		genesisChEleven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___11_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwelve = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___12_Genesis_____ENGESVO2DA.mp3"));
		genesisChThirteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___13_Genesis_____ENGESVO2DA.mp3"));
		genesisChFourteen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___14_Genesis_____ENGESVO2DA.mp3"));
		genesisChFifteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___15_Genesis_____ENGESVO2DA.mp3"));
		genesisChSixteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___16_Genesis_____ENGESVO2DA.mp3"));
		genesisChSeventeen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___17_Genesis_____ENGESVO2DA.mp3"));
		genesisChEighteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___18_Genesis_____ENGESVO2DA.mp3"));
		genesisChNineteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___19_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwenty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___20_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwentyOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___21_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwentyTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___22_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwentyThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___23_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwentyFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___24_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwentyFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___25_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwentySix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___26_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwentySeven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___27_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwentyEight = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___28_Genesis_____ENGESVO2DA.mp3"));
		genesisChTwentyNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___29_Genesis_____ENGESVO2DA.mp3"));
		genesisChThirty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___30_Genesis_____ENGESVO2DA.mp3"));
		genesisChThirtyOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___31_Genesis_____ENGESVO2DA.mp3"));
		genesisChThirtyTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___32_Genesis_____ENGESVO2DA.mp3"));
		genesisChThirtyThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___33_Genesis_____ENGESVO2DA.mp3"));
		genesisChThirtyFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___34_Genesis_____ENGESVO2DA.mp3"));
		genesisChThirtyFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___35_Genesis_____ENGESVO2DA.mp3"));
		genesisChThirtySix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___36_Genesis_____ENGESVO2DA.mp3"));
		genesisChThirtySeven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___37_Genesis_____ENGESVO2DA.mp3"));
		genesisChThirtyEight= Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___38_Genesis_____ENGESVO2DA.mp3"));
		genesisChThirtyNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___39_Genesis_____ENGESVO2DA.mp3"));
		genesisChForty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___40_Genesis_____ENGESVO2DA.mp3"));
		genesisChFortyOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___41_Genesis_____ENGESVO2DA.mp3"));
		genesisChFortyTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___42_Genesis_____ENGESVO2DA.mp3"));
		genesisChFortyThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___43_Genesis_____ENGESVO2DA.mp3"));
		genesisChFortyFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___44_Genesis_____ENGESVO2DA.mp3"));
		genesisChFortyFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___45_Genesis_____ENGESVO2DA.mp3"));
		genesisChFortySix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___46_Genesis_____ENGESVO2DA.mp3"));
		genesisChFortySeven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___47_Genesis_____ENGESVO2DA.mp3"));
		genesisChFortyEight = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___48_Genesis_____ENGESVO2DA.mp3"));
		genesisChFortyNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___49_Genesis_____ENGESVO2DA.mp3"));
		genesisChFifty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A01___50_Genesis_____ENGESVO2DA.mp3"));


		exodusChOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___01_Exodus______ENGESVO2DA.mp3"));
		exodusChTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___02_Exodus______ENGESVO2DA.mp3"));
		exodusChThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___03_Exodus______ENGESVO2DA.mp3"));
		exodusChFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___04_Exodus______ENGESVO2DA.mp3"));
		exodusChFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___05_Exodus______ENGESVO2DA.mp3"));
		exodusChSix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___06_Exodus______ENGESVO2DA.mp3"));
		exodusChSeven= Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___07_Exodus______ENGESVO2DA.mp3"));
		exodusChEight = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___08_Exodus______ENGESVO2DA.mp3"));
		exodusChNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___09_Exodus______ENGESVO2DA.mp3"));
		exodusChTen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___10_Exodus______ENGESVO2DA.mp3"));
		exodusChEleven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___11_Exodus______ENGESVO2DA.mp3"));
		exodusChTwelve = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___12_Exodus______ENGESVO2DA.mp3"));
		exodusChThirteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___13_Exodus______ENGESVO2DA.mp3"));
		exodusChFourteen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___14_Exodus______ENGESVO2DA.mp3"));
		exodusChFifteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___15_Exodus______ENGESVO2DA.mp3"));
		exodusChSixteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___16_Exodus______ENGESVO2DA.mp3"));
		exodusChSeventeen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___17_Exodus______ENGESVO2DA.mp3"));
		exodusChEighteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___18_Exodus______ENGESVO2DA.mp3"));
		exodusChNineteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___19_Exodus______ENGESVO2DA.mp3"));
		exodusChTwenty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___20_Exodus______ENGESVO2DA.mp3"));
		exodusChTwentyOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___21_Exodus______ENGESVO2DA.mp3"));
		exodusChTwentyTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___22_Exodus______ENGESVO2DA.mp3"));
		exodusChTwentyThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___23_Exodus______ENGESVO2DA.mp3"));
		exodusChTwentyFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___24_Exodus______ENGESVO2DA.mp3"));
		exodusChTwentyFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___25_Exodus______ENGESVO2DA.mp3"));
		exodusChTwentySix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___26_Exodus______ENGESVO2DA.mp3"));
		exodusChTwentySeven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___27_Exodus______ENGESVO2DA.mp3"));
		exodusChTwentyEight = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___28_Exodus______ENGESVO2DA.mp3"));
		exodusChTwentyNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___29_Exodus______ENGESVO2DA.mp3"));
		exodusChThirty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___30_Exodus______ENGESVO2DA.mp3"));
		exodusChThirtyOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___31_Exodus______ENGESVO2DA.mp3"));
		exodusChThirtyTwo= Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___32_Exodus______ENGESVO2DA.mp3"));
		exodusChThirtyThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___33_Exodus______ENGESVO2DA.mp3"));
		exodusChThirtyFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___34_Exodus______ENGESVO2DA.mp3"));
		exodusChThirtyFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___35_Exodus______ENGESVO2DA.mp3"));
		exodusChThirtySix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___36_Exodus______ENGESVO2DA.mp3"));
		exodusChThirtySeven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___37_Exodus______ENGESVO2DA.mp3"));
		exodusChThirtyEight= Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___38_Exodus______ENGESVO2DA.mp3"));
		exodusChThirtyNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___39_Exodus______ENGESVO2DA.mp3"));
		exodusChForty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A02___40_Exodus______ENGESVO2DA.mp3"));


		leviticusChOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___01_Leviticus___ENGESVO2DA.mp3"));
		leviticusChTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___02_Leviticus___ENGESVO2DA.mp3"));
		leviticusChThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___03_Leviticus___ENGESVO2DA.mp3"));
		leviticusChFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___04_Leviticus___ENGESVO2DA.mp3"));
		leviticusChFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___05_Leviticus___ENGESVO2DA.mp3"));
		leviticusChSix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___06_Leviticus___ENGESVO2DA.mp3"));
		leviticusChSeven= Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___07_Leviticus___ENGESVO2DA.mp3"));
		leviticusChEight = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___08_Leviticus___ENGESVO2DA.mp3"));
		leviticusChNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___09_Leviticus___ENGESVO2DA.mp3"));
		leviticusChTen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___10_Leviticus___ENGESVO2DA.mp3"));
		leviticusChEleven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___11_Leviticus___ENGESVO2DA.mp3"));
		leviticusChTwelve = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___12_Leviticus___ENGESVO2DA.mp3"));
		leviticusChThirteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___13_Leviticus___ENGESVO2DA.mp3"));
		leviticusChFourteen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___14_Leviticus___ENGESVO2DA.mp3"));
		leviticusChFifteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___15_Leviticus___ENGESVO2DA.mp3"));
		leviticusChSixteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___16_Leviticus___ENGESVO2DA.mp3"));
		leviticusChSeventeen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___17_Leviticus___ENGESVO2DA.mp3"));
		leviticusChEighteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___18_Leviticus___ENGESVO2DA.mp3"));
		leviticusChNineteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___19_Leviticus___ENGESVO2DA.mp3"));
		leviticusChTwenty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___20_Leviticus___ENGESVO2DA.mp3"));
		leviticusChTwentyOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___21_Leviticus___ENGESVO2DA.mp3"));
		leviticusChTwentyTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___22_Leviticus___ENGESVO2DA.mp3"));
		leviticusChTwentyThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___23_Leviticus___ENGESVO2DA.mp3"));
		leviticusChTwentyFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___24_Leviticus___ENGESVO2DA.mp3"));
		leviticusChTwentyFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___25_Leviticus___ENGESVO2DA.mp3"));
		leviticusChTwentySix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___26_Leviticus___ENGESVO2DA.mp3"));
		leviticusChTwentySeven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A03___27_Leviticus___ENGESVO2DA.mp3"));


		numbersChOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___01_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___02_Numbers_____ENGESVO2DA.mp3"));
		numbersChThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___03_Numbers_____ENGESVO2DA.mp3"));
		numbersChFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___04_Numbers_____ENGESVO2DA.mp3"));
		numbersChFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___05_Numbers_____ENGESVO2DA.mp3"));
		numbersChSix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___06_Numbers_____ENGESVO2DA.mp3"));
		numbersChSeven= Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___07_Numbers_____ENGESVO2DA.mp3"));
		numbersChEight = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___08_Numbers_____ENGESVO2DA.mp3"));
		numbersChNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___09_Numbers_____ENGESVO2DA.mp3"));
		numbersChTen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___10_Numbers_____ENGESVO2DA.mp3"));
		numbersChEleven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___11_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwelve = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___12_Numbers_____ENGESVO2DA.mp3"));
		numbersChThirteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___13_Numbers_____ENGESVO2DA.mp3"));
		numbersChFourteen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___14_Numbers_____ENGESVO2DA.mp3"));
		numbersChFifteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___15_Numbers_____ENGESVO2DA.mp3"));
		numbersChSixteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___16_Numbers_____ENGESVO2DA.mp3"));
		numbersChSeventeen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___17_Numbers_____ENGESVO2DA.mp3"));
		numbersChEighteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___18_Numbers_____ENGESVO2DA.mp3"));
		numbersChNineteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___19_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwenty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___20_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwentyOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___21_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwentyTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___22_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwentyThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___23_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwentyFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___24_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwentyFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___25_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwentySix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___26_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwentySeven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___27_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwentyEight = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___28_Numbers_____ENGESVO2DA.mp3"));
		numbersChTwentyNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___29_Numbers_____ENGESVO2DA.mp3"));
		numbersChThirty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___30_Numbers_____ENGESVO2DA.mp3"));
		numbersChThirtyOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___31_Numbers_____ENGESVO2DA.mp3"));
		numbersChThirtyTwo= Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___32_Numbers_____ENGESVO2DA.mp3"));
		numbersChThirtyThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___33_Numbers_____ENGESVO2DA.mp3"));
		numbersChThirtyFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___34_Numbers_____ENGESVO2DA.mp3"));
		numbersChThirtyFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___35_Numbers_____ENGESVO2DA.mp3"));
		numbersChThirtySix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A04___36_Numbers_____ENGESVO2DA.mp3"));


		deuteronomyChOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___01_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___02_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___03_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___04_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___05_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChSix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___06_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChSeven= Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___07_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChEight = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___08_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___09_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___10_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChEleven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___11_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwelve = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___12_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChThirteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___13_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChFourteen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___14_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChFifteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___15_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChSixteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___16_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChSeventeen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___17_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChEighteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___18_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChNineteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___19_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwenty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___20_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwentyOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___21_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwentyTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___22_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwentyThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___23_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwentyFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___24_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwentyFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___25_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwentySix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___26_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwentySeven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___27_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwentyEight = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___28_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChTwentyNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___29_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChThirty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___30_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChThirtyOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___31_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChThirtyTwo= Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___32_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChThirtyThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___33_Deuteronomy_ENGESVO2DA.mp3"));
		deuteronomyChThirtyFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A05___34_Deuteronomy_ENGESVO2DA.mp3"));


		joshuaChOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___01_Joshua______ENGESVO2DA.mp3"));
		joshuaChTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___02_Joshua______ENGESVO2DA.mp3"));
		joshuaChThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___03_Joshua______ENGESVO2DA.mp3"));
		joshuaChFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___04_Joshua______ENGESVO2DA.mp3"));
		joshuaChFive = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___05_Joshua______ENGESVO2DA.mp3"));
		joshuaChSix = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___06_Joshua______ENGESVO2DA.mp3"));
		joshuaChSeven= Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___07_Joshua______ENGESVO2DA.mp3"));
		joshuaChEight = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___08_Joshua______ENGESVO2DA.mp3"));
		joshuaChNine = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___09_Joshua______ENGESVO2DA.mp3"));
		joshuaChTen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___10_Joshua______ENGESVO2DA.mp3"));
		joshuaChEleven = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___11_Joshua______ENGESVO2DA.mp3"));
		joshuaChTwelve = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___12_Joshua______ENGESVO2DA.mp3"));
		joshuaChThirteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___13_Joshua______ENGESVO2DA.mp3"));
		joshuaChFourteen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___14_Joshua______ENGESVO2DA.mp3"));
		joshuaChFifteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___15_Joshua______ENGESVO2DA.mp3"));
		joshuaChSixteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___16_Joshua______ENGESVO2DA.mp3"));
		joshuaChSeventeen= Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___17_Joshua______ENGESVO2DA.mp3"));
		joshuaChEighteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___18_Joshua______ENGESVO2DA.mp3"));
		joshuaChNineteen = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___19_Joshua______ENGESVO2DA.mp3"));
		joshuaChTwenty = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___20_Joshua______ENGESVO2DA.mp3"));
		joshuaChTwentyOne = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___21_Joshua______ENGESVO2DA.mp3"));
		joshuaChTwentyTwo = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___22_Joshua______ENGESVO2DA.mp3"));
		joshuaChTwentyThree = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___23_Joshua______ENGESVO2DA.mp3"));
		joshuaChTwentyFour = Gdx.audio.newMusic(Gdx.files.internal("sounds/A06___24_Joshua______ENGESVO2DA.mp3"));

		genesisChOne.setVolume(0.5f);
		genesisChTwo.setVolume(0.5f);
		genesisChThree.setVolume(0.5f);
		genesisChFour.setVolume(0.5f);
		genesisChFive.setVolume(0.5f);
		genesisChSix.setVolume(0.5f);
		genesisChSeven.setVolume(0.5f);
		genesisChEight.setVolume(0.5f);
		genesisChNine.setVolume(0.5f);
		genesisChTen.setVolume(0.5f);
		genesisChEleven.setVolume(0.5f);
		genesisChTwelve.setVolume(0.5f);
		genesisChThirteen.setVolume(0.5f);
		genesisChFourteen.setVolume(0.5f);
		genesisChFifteen.setVolume(0.5f);
		genesisChSixteen.setVolume(0.5f);
		genesisChSeventeen.setVolume(0.5f);
		genesisChEighteen.setVolume(0.5f);
		genesisChNineteen.setVolume(0.5f);
		genesisChTwenty.setVolume(0.5f);
		genesisChTwentyOne .setVolume(0.5f);
		genesisChTwentyTwo.setVolume(0.5f);
		genesisChTwentyThree.setVolume(0.5f);
		genesisChTwentyFour.setVolume(0.5f);
		genesisChTwentyFive.setVolume(0.5f);
		genesisChTwentySix.setVolume(0.5f);
		genesisChTwentySeven.setVolume(0.5f);
		genesisChTwentyEight.setVolume(0.5f);
		genesisChTwentyNine.setVolume(0.5f);
		genesisChThirty.setVolume(0.5f);
		genesisChThirtyOne.setVolume(0.5f);
		genesisChThirtyTwo.setVolume(0.5f);
		genesisChThirtyThree.setVolume(0.5f);
		genesisChThirtyFour.setVolume(0.5f);
		genesisChThirtyFive.setVolume(0.5f);
		genesisChThirtySix.setVolume(0.5f);
		genesisChThirtySeven.setVolume(0.5f);
		genesisChThirtyEight.setVolume(0.5f);
		genesisChThirtyNine.setVolume(0.5f);
		genesisChForty.setVolume(0.5f);
		genesisChFortyOne.setVolume(0.5f);
		genesisChFortyTwo.setVolume(0.5f);
		genesisChFortyThree.setVolume(0.5f);
		genesisChFortyFour.setVolume(0.5f);
		genesisChFortyFive.setVolume(0.5f);
		genesisChFortySix.setVolume(0.5f);
		genesisChFortySeven.setVolume(0.5f);
		genesisChFortyEight.setVolume(0.5f);
		genesisChFortyNine.setVolume(0.5f);
		genesisChFifty.setVolume(0.5f);


		exodusChOne.setVolume(0.5f);
		exodusChTwo.setVolume(0.5f);
		exodusChThree.setVolume(0.5f);
		exodusChFour.setVolume(0.5f);
		exodusChFive.setVolume(0.5f);
		exodusChSix.setVolume(0.5f);
		exodusChSeven.setVolume(0.5f);
		exodusChEight.setVolume(0.5f);
		exodusChNine.setVolume(0.5f);
		exodusChTen.setVolume(0.5f);
		exodusChEleven.setVolume(0.5f);
		exodusChTwelve.setVolume(0.5f);
		exodusChThirteen.setVolume(0.5f);
		exodusChFourteen.setVolume(0.5f);
		exodusChFifteen.setVolume(0.5f);
		exodusChSixteen.setVolume(0.5f);
		exodusChSeventeen.setVolume(0.5f);
		exodusChEighteen.setVolume(0.5f);
		exodusChNineteen.setVolume(0.5f);
		exodusChTwenty.setVolume(0.5f);
		exodusChTwentyOne .setVolume(0.5f);
		exodusChTwentyTwo.setVolume(0.5f);
		exodusChTwentyThree.setVolume(0.5f);
		exodusChTwentyFour.setVolume(0.5f);
		exodusChTwentyFive.setVolume(0.5f);
		exodusChTwentySix.setVolume(0.5f);
		exodusChTwentySeven.setVolume(0.5f);
		exodusChTwentyEight.setVolume(0.5f);
		exodusChTwentyNine.setVolume(0.5f);
		exodusChThirty.setVolume(0.5f);
		exodusChThirtyOne.setVolume(0.5f);
		exodusChThirtyTwo.setVolume(0.5f);
		exodusChThirtyThree.setVolume(0.5f);
		exodusChThirtyFour.setVolume(0.5f);
		exodusChThirtyFive.setVolume(0.5f);
		exodusChThirtySix.setVolume(0.5f);
		exodusChThirtySeven.setVolume(0.5f);
		exodusChThirtyEight.setVolume(0.5f);
		exodusChThirtyNine.setVolume(0.5f);
		exodusChForty.setVolume(0.5f);


		leviticusChOne.setVolume(0.5f);
		leviticusChTwo.setVolume(0.5f);
		leviticusChThree.setVolume(0.5f);
		leviticusChFour.setVolume(0.5f);
		leviticusChFive.setVolume(0.5f);
		leviticusChSix.setVolume(0.5f);
		leviticusChSeven.setVolume(0.5f);
		leviticusChEight.setVolume(0.5f);
		leviticusChNine.setVolume(0.5f);
		leviticusChTen.setVolume(0.5f);
		leviticusChEleven.setVolume(0.5f);
		leviticusChTwelve.setVolume(0.5f);
		leviticusChThirteen.setVolume(0.5f);
		leviticusChFourteen.setVolume(0.5f);
		leviticusChFifteen.setVolume(0.5f);
		leviticusChSixteen.setVolume(0.5f);
		leviticusChSeventeen.setVolume(0.5f);
		leviticusChEighteen.setVolume(0.5f);
		leviticusChNineteen.setVolume(0.5f);
		leviticusChTwenty.setVolume(0.5f);
		leviticusChTwentyOne .setVolume(0.5f);
		leviticusChTwentyTwo.setVolume(0.5f);
		leviticusChTwentyThree.setVolume(0.5f);
		leviticusChTwentyFour.setVolume(0.5f);
		leviticusChTwentyFive.setVolume(0.5f);
		leviticusChTwentySix.setVolume(0.5f);
		leviticusChTwentySeven.setVolume(0.5f);


		numbersChOne.setVolume(0.5f);
		numbersChTwo.setVolume(0.5f);
		numbersChThree.setVolume(0.5f);
		numbersChFour.setVolume(0.5f);
		numbersChFive.setVolume(0.5f);
		numbersChSix.setVolume(0.5f);
		numbersChSeven.setVolume(0.5f);
		numbersChEight.setVolume(0.5f);
		numbersChNine.setVolume(0.5f);
		numbersChTen.setVolume(0.5f);
		numbersChEleven.setVolume(0.5f);
		numbersChTwelve.setVolume(0.5f);
		numbersChThirteen.setVolume(0.5f);
		numbersChFourteen.setVolume(0.5f);
		numbersChFifteen.setVolume(0.5f);
		numbersChSixteen.setVolume(0.5f);
		numbersChSeventeen.setVolume(0.5f);
		numbersChEighteen.setVolume(0.5f);
		numbersChNineteen.setVolume(0.5f);
		numbersChTwenty.setVolume(0.5f);
		numbersChTwentyOne .setVolume(0.5f);
		numbersChTwentyTwo.setVolume(0.5f);
		numbersChTwentyThree.setVolume(0.5f);
		numbersChTwentyFour.setVolume(0.5f);
		numbersChTwentyFive.setVolume(0.5f);
		numbersChTwentySix.setVolume(0.5f);
		numbersChTwentySeven.setVolume(0.5f);
		numbersChTwentyEight.setVolume(0.5f);
		numbersChTwentyNine.setVolume(0.5f);
		numbersChThirty.setVolume(0.5f);
		numbersChThirtyOne.setVolume(0.5f);
		numbersChThirtyTwo.setVolume(0.5f);
		numbersChThirtyThree.setVolume(0.5f);
		numbersChThirtyFour.setVolume(0.5f);
		numbersChThirtyFive.setVolume(0.5f);
		numbersChThirtySix.setVolume(0.5f);


		deuteronomyChOne.setVolume(0.5f);
		deuteronomyChTwo.setVolume(0.5f);
		deuteronomyChThree.setVolume(0.5f);
		deuteronomyChFour.setVolume(0.5f);
		deuteronomyChFive.setVolume(0.5f);
		deuteronomyChSix.setVolume(0.5f);
		deuteronomyChSeven.setVolume(0.5f);
		deuteronomyChEight.setVolume(0.5f);
		deuteronomyChNine.setVolume(0.5f);
		deuteronomyChTen.setVolume(0.5f);
		deuteronomyChEleven.setVolume(0.5f);
		deuteronomyChTwelve.setVolume(0.5f);
		deuteronomyChThirteen.setVolume(0.5f);
		deuteronomyChFourteen.setVolume(0.5f);
		deuteronomyChFifteen.setVolume(0.5f);
		deuteronomyChSixteen.setVolume(0.5f);
		deuteronomyChSeventeen.setVolume(0.5f);
		deuteronomyChEighteen.setVolume(0.5f);
		deuteronomyChNineteen.setVolume(0.5f);
		deuteronomyChTwenty.setVolume(0.5f);
		deuteronomyChTwentyOne .setVolume(0.5f);
		deuteronomyChTwentyTwo.setVolume(0.5f);
		deuteronomyChTwentyThree.setVolume(0.5f);
		deuteronomyChTwentyFour.setVolume(0.5f);
		deuteronomyChTwentyFive.setVolume(0.5f);
		deuteronomyChTwentySix.setVolume(0.5f);
		deuteronomyChTwentySeven.setVolume(0.5f);
		deuteronomyChTwentyEight.setVolume(0.5f);
		deuteronomyChTwentyNine.setVolume(0.5f);
		deuteronomyChThirty.setVolume(0.5f);
		deuteronomyChThirtyOne.setVolume(0.5f);
		deuteronomyChThirtyTwo.setVolume(0.5f);
		deuteronomyChThirtyThree.setVolume(0.5f);
		deuteronomyChThirtyFour.setVolume(0.5f);


		joshuaChOne.setVolume(0.5f);
		joshuaChTwo.setVolume(0.5f);
		joshuaChThree.setVolume(0.5f);
		joshuaChFour.setVolume(0.5f);
		joshuaChFive.setVolume(0.5f);
		joshuaChSix.setVolume(0.5f);
		joshuaChSeven.setVolume(0.5f);
		joshuaChEight.setVolume(0.5f);
		joshuaChNine.setVolume(0.5f);
		joshuaChTen.setVolume(0.5f);
		joshuaChEleven.setVolume(0.5f);
		joshuaChTwelve.setVolume(0.5f);
		joshuaChThirteen.setVolume(0.5f);
		joshuaChFourteen.setVolume(0.5f);
		joshuaChFifteen.setVolume(0.5f);
		joshuaChSixteen.setVolume(0.5f);
		joshuaChSeventeen.setVolume(0.5f);
		joshuaChEighteen.setVolume(0.5f);
		joshuaChNineteen.setVolume(0.5f);
		joshuaChTwenty.setVolume(0.5f);
		joshuaChTwentyOne .setVolume(0.5f);
		joshuaChTwentyTwo.setVolume(0.5f);
		joshuaChTwentyThree.setVolume(0.5f);
		joshuaChTwentyFour.setVolume(0.5f);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
		Gdx.graphics.setVSync(false);
	}

}
