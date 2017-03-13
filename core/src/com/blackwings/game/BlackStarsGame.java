package com.blackwings.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.blackwings.space.objects.PositionData;
import com.blackwings.space.objects.ships.Cruiser;
import com.blackwings.space.objects.ships.Ship;
import com.blackwings.space.objects.subsystems.SubSystemsList;
import com.blackwings.space.objects.subsystems.engines.ImpulseEngine;
import com.blackwings.space.objects.subsystems.weapons.RailGun;

public class BlackStarsGame extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture cruiserImg;
    private OrthographicCamera camera;
    private OrthographicCamera uiCamera;
    private Array<Ship> shipsList = new Array<Ship>();
    private Animation<TextureRegion> cruiserAnimation;
    private float cruiserStateTime = 0;
    private Vector2 cruiserPosition = new Vector2();
    private Vector2 cruiserVelocity = new Vector2();

    private static final float PLANE_JUMP_IMPULSE = 350;
    private static final float CRUISER_VELOCITY_X = 200;
    private static final float CRUISER_START_Y = 240;
    private static final float CRUISER_START_X = 50;
    private static final float GRAVITY = -20;

    private GamePlayStates gamePlayStates;
    private Vector2 gravity = new Vector2();

    private void prepareGameState() {
        gamePlayStates = GamePlayStates.Start;
    }

    private void prepareGameEngine() {
        batch = new SpriteBatch();

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        uiCamera = new OrthographicCamera();
        uiCamera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        uiCamera.update();

//        background = new Texture("desktop/assets/img/ships/background.png");
    }

    private void prepareGameObjects() {
        String name = "Nameless one";
        PositionData positionData = new PositionData(0, 0, 0, 0);// fake
        SubSystemsList subSystemsList = new SubSystemsList();

        RailGun railGun = new RailGun();
        ImpulseEngine impulseEngine = new ImpulseEngine();

        subSystemsList.add(railGun);
        subSystemsList.add(impulseEngine);

        Cruiser cruiser = new Cruiser(name, positionData, subSystemsList);
        shipsList.add(cruiser);
    }

    @Override
    public void create() {
        prepareGameState();
        prepareGameEngine();
        prepareGameObjects();

        cruiserImg = new Texture("desktop/assets/img/ships/cruiser.png");
        cruiserImg.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        cruiserAnimation = new Animation<TextureRegion>(0.05f, new TextureRegion(cruiserImg));
        cruiserAnimation.setPlayMode(Animation.PlayMode.LOOP);

        resetWorld();
    }

    private void resetWorld() {
        cruiserPosition.set(CRUISER_START_X, CRUISER_START_Y);
        cruiserVelocity.set(0, 0);
        gravity.set(0, GRAVITY);
        shipsList.clear();
        camera.position.x = 400;
        gamePlayStates = GamePlayStates.Start;
    }

    private void updateWorld() {
        float deltaTime = Gdx.graphics.getDeltaTime();
        cruiserStateTime += deltaTime;

        if (Gdx.input.justTouched()) {
            cruiserVelocity.set(CRUISER_VELOCITY_X, PLANE_JUMP_IMPULSE);
            if (gamePlayStates == GamePlayStates.End) {
                resetWorld();
            }
        }

        if (gamePlayStates != GamePlayStates.Start) cruiserVelocity.add(gravity);

        cruiserPosition.mulAdd(cruiserVelocity, deltaTime);
        camera.position.x = cruiserPosition.x + 350;
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        updateWorld();
        World world = new World();
        world.init();
        world.draw(camera, uiCamera, batch, cruiserAnimation, cruiserStateTime, cruiserPosition);
    }

    @Override
    public void dispose() {
        batch.dispose();
        cruiserImg.dispose();
    }
}
