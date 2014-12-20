package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {

	
	SpriteBatch batch;
	
	TextureAtlas atlas;//用于处理跟合图相关的逻辑
	
	TextureRegion region1;
	TextureRegion region2;
	
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		
		/**
		 * TextureAtlas(FileHandle packFile)
		 * packFile: 相应的atlas文件在项目中的路径
		 */
		atlas = new TextureAtlas(Gdx.files.internal("data/hi.atlas"));
		
		
		region1 = atlas.findRegion("test");//传如小兔的名字,找到相应的图片信息..
		region2 = atlas.findRegion("test2");
		
	}

	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}
	
	
	
	
	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);// 设置背景为白色
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// 清屏
		
		
		batch.begin();
		
//		batch.draw(region1, 0, 0);
		batch.draw(region2, 0, 0);
		
		batch.end();
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
