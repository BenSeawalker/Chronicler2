package com.gdx.Chronicler;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.utils.viewport.Viewport;
//import com.badlogic.gdx.graphics.Color;

public class Chronicler extends ApplicationAdapter {
	private OrthographicCamera camera;
        private Viewport viewport;
        SpriteBatch batch;
        
	Texture img;
        BitmapFont font;
	
        
	@Override
	public void create () {
 
            
            batch = new SpriteBatch();
            img = new Texture("badlogic.jpg");
            
            //font = new BitmapFont(Gdx.files.internal(""), Gdx.files.internal(""), false);
            //font.setColor(Color.WHITE);
            
	}

        @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
        //font.dispose();
    }
    
    @Override
    public void resize(int width, int height) {
    }
    
    @Override
    public void render () {
            // clear the screen...
            Gdx.gl.glClearColor(1, 0, 0, 1);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

            //Gdx.app.log(null, MD5Checksum.Get("badlogic.jpg"));
            //Gdx.app.debug(null, );

            // begin draw event
            batch.begin();
                batch.draw(img, 0, 0);
            batch.end();
            // end draw event
	}
}
