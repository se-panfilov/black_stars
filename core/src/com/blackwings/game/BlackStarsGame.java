package com.blackwings.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.utils.Array;
import com.blackwings.game.map.Map;
import com.blackwings.game.space.objects.PositionData;
import com.blackwings.game.space.objects.ships.Cruiser;
import com.blackwings.game.space.objects.ships.Ship;
import com.blackwings.game.space.objects.subsystems.SubSystemsList;
import com.blackwings.game.space.objects.subsystems.engines.ImpulseEngine;
import com.blackwings.game.space.objects.subsystems.weapons.RailGun;

public class BlackStarsGame extends ApplicationAdapter {
    private Array<Ship> shipsList = new Array<Ship>();
    //    private Vector2 cruiserPosition = new Vector2();
//    private Vector2 cruiserVelocity = new Vector2();
    private World world;

    private void prepareGameObjects() {
        String name = "Nameless one";
        SubSystemsList subSystemsList = new SubSystemsList();

        RailGun railGun = new RailGun();
        ImpulseEngine impulseEngine = new ImpulseEngine();

        subSystemsList.add(railGun);
        subSystemsList.add(impulseEngine);

        Cruiser cruiser = new Cruiser(name, subSystemsList);
        PositionData positionData = new PositionData(0, 0, 0, 0);// fake
        cruiser.setPosition(positionData);

        shipsList.add(cruiser);
    }

    @Override
    public void create() {
        prepareGameObjects();

        WorldObjects worldObjects = new WorldObjects(shipsList);
        Context.setWorldObjects(worldObjects);

        //TODO (S.Panfilov) map should be created with some params
        Map map = new Map();
        Context.setMap(map);

        Camera camera = new Camera();
        Context.setCamera(camera);

        world = new World(worldObjects, camera);
        Context.setWorld(world);

        world.reset();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        world.update();
        world.draw();
    }

    @Override
    public void dispose() {
        world.clear();
    }
}
