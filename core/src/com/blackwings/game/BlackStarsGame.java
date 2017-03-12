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
    private Texture background;

    private static final float PLANE_JUMP_IMPULSE = 350;
    private static final float CRUISER_VELOCITY_X = 200;
    private static final float CRUISER_START_Y = 240;
    private static final float CRUISER_START_X = 50;
    private static final float GRAVITY = -20;
    private GameState gameState;
    Vector2 gravity = new Vector2();

    private static enum GameState {
        Start, Run, End
    }

    private void prepareGameState() {
        gameState = GameState.Start;
    }

    private void prepareGameEngine() {
        batch = new SpriteBatch();

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        uiCamera = new OrthographicCamera();
        uiCamera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        uiCamera.update();

        background = new Texture("desktop/assets/img/ships/background.png");
    }

    private void prepareGameObjects() {
        //Ship creation
        String name = "Nameless one";
        PositionData positionData = new PositionData(0, 0, 0, 0);// fake
        SubSystemsList subSystemsList = new SubSystemsList();

        RailGun railGun = new RailGun();
        ImpulseEngine impulseEngine = new ImpulseEngine();

        subSystemsList.add(railGun);
        subSystemsList.add(impulseEngine);

        Cruiser cruiser = new Cruiser(name, positionData, subSystemsList);
        shipsList.add(cruiser);
        //TODO (S.Panfilov) curWorkPoint
        //End Ship creation
    }

    @Override
    public void create() {
        prepareGameEngine();
        prepareGameObjects();

        cruiserImg = new Texture("desktop/assets/img/ships/cruiser.png");
//        cruiserImg.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        cruiserAnimation = new Animation<TextureRegion>(0.05f, new TextureRegion(cruiserImg));
        cruiserAnimation.setPlayMode(Animation.PlayMode.LOOP);

        resetWorld();
    }

    private void resetWorld() {
//        score = 0;
//        groundOffsetX = 0;
        cruiserPosition.set(CRUISER_START_X, CRUISER_START_Y);
        cruiserVelocity.set(0, 0);
        gravity.set(0, GRAVITY);
        shipsList.clear();
        camera.position.x = 400;
        gameState = GameState.Start;
//
//        rocks.clear();
//        for(int i = 0; i < 5; i++) {
//            boolean isDown = MathUtils.randomBoolean();
//            rocks.add(new Rock(700 + i * 200, isDown?480-rock.getRegionHeight(): 0, isDown? rockDown: rock));
//        }
    }

    private void updateWorld() {
        float deltaTime = Gdx.graphics.getDeltaTime();
        cruiserStateTime += deltaTime;

        if (Gdx.input.justTouched()) {
//            if(gameState == GameState.Start) {
//                gameState = GameState.Run;
//            }
//            if(gameState == GameState.Running) {
            cruiserVelocity.set(CRUISER_VELOCITY_X, PLANE_JUMP_IMPULSE);
//            }
            if (gameState == GameState.End) {
                resetWorld();
            }
        }

        if (gameState != GameState.Start) cruiserVelocity.add(gravity);

        cruiserPosition.mulAdd(cruiserVelocity, deltaTime);

        camera.position.x = cruiserPosition.x + 350;
//        if (camera.position.x - groundOffsetX > ground.getRegionWidth() + 400) {
//            groundOffsetX += ground.getRegionWidth();
//        }

        //TODO (S.Panfilov) wtf?
//        rect1.set(cruiserPosition.x + 20, cruiserPosition.y, plane.getKeyFrames()[0].getRegionWidth() - 20, plane.getKeyFrames()[0].getRegionHeight());

//        for (Rock r : rocks) {
//            if (camera.position.x - r.position.x > 400 + r.image.getRegionWidth()) {
//                boolean isDown = MathUtils.randomBoolean();
//                r.position.x += 5 * 200;
//                r.position.y = isDown ? 480 - rock.getRegionHeight() : 0;
//                r.image = isDown ? rockDown : rock;
//                r.counted = false;
//            }
//            rect2.set(r.position.x + (r.image.getRegionWidth() - 30) / 2 + 20, r.position.y, 20, r.image.getRegionHeight() - 10);
//            if (rect1.overlaps(rect2)) {
//                if (gameState != GameState.GameOver) explode.play();
//                gameState = GameState.GameOver;
//                cruiserVelocity.x = 0;
//            }
//            if (r.position.x < cruiserPosition.x && !r.counted) {
//                score++;
//                r.counted = true;
//            }
//        }

//        if (cruiserPosition.y < ground.getRegionHeight() - 20 ||
//                cruiserPosition.y + plane.getKeyFrames()[0].getRegionHeight() > 480 - ground.getRegionHeight() + 20) {
//            if (gameState != GameState.GameOver) explode.play();
//            gameState = GameState.GameOver;
//            cruiserVelocity.x = 0;
//        }
    }

    private void drawWorld() {
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(background, camera.position.x - background.getWidth() / 2, 0);

//        for(Ship ship: shipsList) {
//            batch.draw(ship.image, ship.position.x, ship.position.y);
//        }

        batch.draw(cruiserAnimation.getKeyFrame(cruiserStateTime), cruiserPosition.x, cruiserPosition.y);
        batch.end();

        batch.setProjectionMatrix(uiCamera.combined);
        batch.begin();
//        if (gameState == GameState.Start) {
//            batch.draw(ready, Gdx.graphics.getWidth() / 2 - ready.getRegionWidth() / 2, Gdx.graphics.getHeight() / 2 - ready.getRegionHeight() / 2);
//        }
        batch.end();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        batch.begin();
//        batch.draw(cruiserImg, 0, 0);
//        batch.end();

        updateWorld();
        drawWorld();
    }

    @Override
    public void dispose() {
        batch.dispose();
        cruiserImg.dispose();
    }
}
