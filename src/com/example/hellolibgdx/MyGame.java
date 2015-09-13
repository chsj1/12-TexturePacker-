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
	TextureAtlas atlas;//���ڴ������ͼ��ص��߼�
	TextureRegion region1;
	TextureRegion region2;
	
	TextureAtlas atlas1;
	TextureRegion bgRegion;//����ͼƬ
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		/**
		 * TextureAtlas(FileHandle packFile)
		 * packFile: ��Ӧ��atlas�ļ�����Ŀ�е�·��
		 */
		atlas = new TextureAtlas(Gdx.files.internal("data/testpac.atlas"));
//		atlas = new TextureAtlas(Gdx.files.internal("data/hi.atlas"));
		region1 = atlas.findRegion("test01");//����Сͼ������,�ҵ���Ӧ��ͼƬ��Ϣ..
//		region2 = atlas.findRegion("test2");
		
		atlas1 = new TextureAtlas(Gdx.files.internal("data/loading.atlas"));
		bgRegion = atlas1.findRegion("bg");
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
		Gdx.gl.glClearColor(1, 1, 1, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// ����
		batch.begin();
		batch.draw(bgRegion, 0, 0, 480, 800);
		batch.draw(region1, 50, 150);
//		batch.draw(region2, 0, 0);
		batch.end();
	}
	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
	}
	@Override
	public void resume() {
	}
}
