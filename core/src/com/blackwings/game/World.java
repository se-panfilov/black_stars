package com.blackwings.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class World {

    private Texture background;

    private OrthographicCamera camera;
    private OrthographicCamera uiCamera;
    private SpriteBatch batch;
    private Vector2 gravity;
    private WorldObjects worldObjects;
    private GamePlayStates gamePlayState;

    private Texture cruiserImg;
    private Animation<TextureRegion> cruiserAnimation;
    private Vector2 cruiserPosition;
    private Vector2 cruiserVelocity;
    private float cruiserStateTime = 0;

    private static final float GRAVITY = -20;
    private static final float CRUISER_START_Y = 240;
    private static final float CRUISER_START_X = 50;
    private static final float PLANE_JUMP_IMPULSE = 350;
    private static final float CRUISER_VELOCITY_X = 200;

    public World(Vector2 cruiserPosition, Vector2 cruiserVelocity, Vector2 gravity, WorldObjects worldObjects) {
        this.batch = new SpriteBatch();

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        uiCamera = new OrthographicCamera();
        uiCamera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        uiCamera.update();

        this.cruiserPosition = cruiserPosition;
        this.cruiserPosition = cruiserPosition;
        this.cruiserVelocity = cruiserVelocity;
        this.gravity = gravity;
        this.worldObjects = worldObjects;
        this.gamePlayState = GamePlayStates.Start;

        background = new Texture("desktop/assets/img/ships/background.png");

        cruiserImg = new Texture("desktop/assets/img/ships/cruiser.png");
        cruiserImg.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

        this.cruiserAnimation = new Animation<TextureRegion>(0.05f, new TextureRegion(cruiserImg));
        this.cruiserAnimation.setPlayMode(Animation.PlayMode.LOOP);
    }

    void draw() {
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

    void reset() {
        cruiserPosition.set(CRUISER_START_X, CRUISER_START_Y);
        cruiserVelocity.set(0, 0);
        gravity.set(0, GRAVITY);
        worldObjects.clear();
        camera.position.x = 400;
        gamePlayState = GamePlayStates.Start;
    }

    void clear() {
        batch.dispose();
        cruiserImg.dispose();
    }

    void update() {
        float deltaTime = Gdx.graphics.getDeltaTime();
        cruiserStateTime += deltaTime;

        if (Gdx.input.justTouched()) {
            cruiserVelocity.set(CRUISER_VELOCITY_X, PLANE_JUMP_IMPULSE);
            if (gamePlayState == GamePlayStates.End) {
                this.reset();
            }
        }

        if (gamePlayState != GamePlayStates.Start) cruiserVelocity.add(gravity);

        cruiserPosition.mulAdd(cruiserVelocity, deltaTime);
        camera.position.x = cruiserPosition.x + 350;
    }
}
