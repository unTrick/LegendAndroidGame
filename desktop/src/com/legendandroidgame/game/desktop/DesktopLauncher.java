package com.legendandroidgame.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.legendandroidgame.game.LegendAndroidGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();


		config.height = LegendAndroidGame.HEIGHT;
		config.width = LegendAndroidGame.WIDTH;
		config.title = LegendAndroidGame.TITLE;
//
//		config.height = 480;
//		config.width = 800;
        config.fullscreen = false;
        config.useGL30 = false;
        config.resizable = false;
        config.foregroundFPS = 500;
        config.vSyncEnabled = false;
        config.backgroundFPS = 500;

		new LwjglApplication(new LegendAndroidGame(), config);
	}
}
