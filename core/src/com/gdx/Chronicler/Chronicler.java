package com.gdx.Chronicler;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
//import com.badlogic.gdx.graphics.Color;

public class Chronicler extends Game {
        // CAMERA
        private OrthographicCamera camera;
        private Viewport viewport;

        // SPRITE BATCH
        SpriteBatch batch;

        // TEXTURES
        Texture img;

        // FONTS
        BitmapFont font;
        
        // SCREENS
        Scene mainScreen;


        @Override
        public void create () {
            // CAMERA
            camera = new OrthographicCamera();
            camera.setToOrtho(true, 1280, 720);
            viewport = new FitViewport(1280, 720, camera);

            // SPRITES
            batch = new SpriteBatch();
            img = new Texture("badlogic.jpg");
            
            //FONTS
            //font = new BitmapFont(Gdx.files.internal(""), Gdx.files.internal(""), false);
            //font.setColor(Color.WHITE);
            
            
            // SCREENS
           mainScreen = new Scene(this);
           this.setScreen(mainScreen);
        }

        @Override
        public void dispose() {
            batch.dispose();
            img.dispose();
            font.dispose();
        }

        @Override
        public void resize(int width, int height) {
            viewport.update(width, height);
            camera.update();
        }

        @Override
        public void render () {
            super.render();
        }

    @Override
    public void pause() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resume() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
