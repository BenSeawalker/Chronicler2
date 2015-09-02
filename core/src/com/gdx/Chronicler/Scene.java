/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdx.Chronicler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gdx.Chronicler.Bubbles.Bubble;
import java.util.ArrayList;

/**
 *
 * @author gfleischer
 */
public class Scene implements Screen{
    Chronicler chron;
    SpriteBatch batch;
    ArrayList<Bubble> bubbles;
    
    public Scene(Chronicler _chron) {
        chron = _chron;

        batch = new SpriteBatch();
    }
    
    @Override
    public void show() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void render(float delta) {
        // clear the screen...
            Gdx.gl.glClearColor(0, 0, 0, 0);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

            // begin draw event
            batch.begin();
                //batch.draw(img, 0, 0);
            batch.end();
            // end draw event
    }

    @Override
    public void resize(int width, int height) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pause() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void resume() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void hide() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void dispose() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
