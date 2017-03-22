package com.blackwings.game.camera;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;

public class Camera {
    private OrthographicCamera camera;
//    private OrthographicCamera uiCamera;

    public Camera() {
        camera = new OrthographicCamera();
        setToOrtho(false, 800, 480);
//        camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        camera.update();

//        uiCamera = new OrthographicCamera();
//        uiCamera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        uiCamera.update();
    }

    public void update() {
        camera.update();
    }

    public Vector3 getPosition() {
        return camera.position;
    }

    public Matrix4 getCombined() {
        return camera.combined;
    }

    public void setToOrtho(boolean yDown, float viewportWidth, float viewportHeight) {
        camera.setToOrtho(yDown, viewportWidth, viewportHeight);
    }

    public float getX() {
        return camera.position.x;
    }

    public float getY() {
        return camera.position.y;
    }

    public void setX(float x) {
        camera.position.x = x;
    }

    public void setY(float y) {
        camera.position.y = y;
    }

}
