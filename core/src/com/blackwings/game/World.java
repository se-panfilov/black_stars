package com.blackwings.game;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class World {

    private Texture background;

    void init() {
        background = new Texture("desktop/assets/img/ships/background.png");
    }

    void draw(Camera camera, Camera uiCamera, SpriteBatch batch, Animation<TextureRegion> cruiserAnimation, float cruiserStateTime, Vector2 cruiserPosition) {
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(background, camera.position.x - background.getWidth() / 2, 0);
        batch.draw(cruiserAnimation.getKeyFrame(cruiserStateTime), cruiserPosition.x, cruiserPosition.y);
        batch.end();

        batch.setProjectionMatrix(uiCamera.combined);
        batch.begin();
        batch.end();
    }
}
