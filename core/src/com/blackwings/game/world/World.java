package com.blackwings.game.world;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.blackwings.game.camera.Camera;
import com.blackwings.game.map.Position;
import com.blackwings.game.map.units.engine.EngineUnit;
import com.blackwings.game.space.objects.ships.Ship;

public class World {

    private Texture background;

    private Camera camera;
    //    private OrthographicCamera camera;
//    private OrthographicCamera uiCamera;
    private SpriteBatch batch;
    private Vector2 gravity;
    private WorldObjects worldObjects;
    private com.blackwings.game.state.GamePlayStates gamePlayState;

    private Texture cruiserImg;
    private Animation<TextureRegion> cruiserAnimation;
    //    private Vector2 cruiserPosition;
    private Vector2 cruiserVelocity;
    private float cruiserStateTime = 0;

    private static final float GRAVITY = -20;
    private static final float CRUISER_START_Y = 240;
    private static final float CRUISER_START_X = 50;
    private static final float PLANE_JUMP_IMPULSE = 350;
    private static final float CRUISER_VELOCITY_X = 200;

    public World(WorldObjects worldObjects, Camera camera) {
        gravity = new Vector2();
        this.batch = new SpriteBatch();

        this.camera = camera;
        this.camera.setToOrtho(false, 800, 480);
//        camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        camera.update();

//        uiCamera = new OrthographicCamera();
//        uiCamera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        uiCamera.update();

//        this.cruiserPosition = cruiserPosition;
//        this.cruiserVelocity = cruiserVelocity;
        prepareWorldObjects(worldObjects);
        this.gravity = gravity;
        this.worldObjects = worldObjects;
        this.gamePlayState = com.blackwings.game.state.GamePlayStates.Start;

        background = new Texture("desktop/assets/img/ships/background.png");

        cruiserImg = new Texture("desktop/assets/img/ships/cruiser.png");
        cruiserImg.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

        this.cruiserAnimation = new Animation<TextureRegion>(0.05f, new TextureRegion(cruiserImg));
        this.cruiserAnimation.setPlayMode(Animation.PlayMode.LOOP);
    }

    private void prepareWorldObjects(WorldObjects worldObject) {
        Array<Ship> shipList = worldObject.getShipsList();

        for (Ship ship : shipList) {
            EngineUnit engineUnit = new EngineUnit(CRUISER_START_X, CRUISER_START_Y);
            Position position = new Position(engineUnit);
            //TODO (S.Panfilov) setPosition
//            ship.setPosition(position);
//            ship.setVelocity(cruiserVelocity);
        }
    }

    private void resetWorldObject(Array<Ship> shipList) {
        for (Ship ship : shipList) {
            EngineUnit engineUnit = new EngineUnit(CRUISER_START_X, CRUISER_START_Y);
            Position position = new Position(engineUnit);
            //TODO (S.Panfilov) setPosition
//            ship.setPosition(position);
//            ship.setVelocity(0, 0);
        }
    }


    public void draw() {
        camera.update();
        batch.setProjectionMatrix(camera.getCombined());
        batch.begin();
        batch.draw(background, camera.getX() - background.getWidth() / 2, 0);
//        batch.draw(cruiserAnimation.getKeyFrame(cruiserStateTime), cruiserPosition.x, cruiserPosition.y);
        batch.end();

//        batch.setProjectionMatrix(uiCamera.combined);
        batch.begin();
        batch.end();
    }

    public void reset() {
        resetWorldObject(worldObjects.getShipsList());
//        cruiserPosition.set(CRUISER_START_X, CRUISER_START_Y);
//        cruiserVelocity.set(0, 0);
        gravity.set(0, GRAVITY);
        worldObjects.clear();
        camera.setX(400);
        gamePlayState = com.blackwings.game.state.GamePlayStates.Start;
    }

    public void clear() {
        batch.dispose();
        cruiserImg.dispose();
    }

    public void update() {
        float deltaTime = Gdx.graphics.getDeltaTime();
        cruiserStateTime += deltaTime;

        if (Gdx.input.justTouched()) {
//            cruiserVelocity.set(CRUISER_VELOCITY_X, PLANE_JUMP_IMPULSE);
            if (gamePlayState == com.blackwings.game.state.GamePlayStates.End) {
                this.reset();
            }
        }

//        if (gamePlayState != GamePlayStates.Start) cruiserVelocity.add(gravity);

//        cruiserPosition.mulAdd(cruiserVelocity, deltaTime);
//        camera.setX(cruiserPosition.x + 350);
    }
}
