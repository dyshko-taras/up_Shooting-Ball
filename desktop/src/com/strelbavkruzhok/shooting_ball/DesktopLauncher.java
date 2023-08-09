package com.strelbavkruzhok.shooting_ball;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.strelbavkruzhok.shooting_ball.Main;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("Shooting Ball");
		config.setWindowedMode(360,800);
		config.useVsync(true);
		new Lwjgl3Application(new Main(), config);
	}
}
