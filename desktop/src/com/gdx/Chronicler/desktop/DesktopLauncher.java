package com.gdx.Chronicler.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gdx.Chronicler.Chronicler;

public class DesktopLauncher {
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main (String[] arg) {
            LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

            config.title = "Chronicler";
            config.width = 1280;
            config.height = 720;

            new LwjglApplication(new Chronicler(), config);
    }
}
