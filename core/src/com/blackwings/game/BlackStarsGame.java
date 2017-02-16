package com.blackwings.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.blackwings.space.objects.PositionData;
import com.blackwings.space.objects.ships.Cruiser;
import com.blackwings.space.objects.ships.Ship;
import com.blackwings.space.objects.subsystems.SubSystemsList;
import com.blackwings.space.objects.subsystems.engines.ImpulseEngine;
import com.blackwings.space.objects.subsystems.weapons.RailGun;

public class BlackStarsGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");

        //Ship creation
        String name = "Nameless one";
        PositionData positionData = new PositionData(0, 0, 0, 0);// fake
        SubSystemsList subSystemsList = new SubSystemsList();

        RailGun railGun = new RailGun();
        ImpulseEngine impulseEngine = new ImpulseEngine();

        subSystemsList.add(railGun);
        subSystemsList.add(impulseEngine);

        Ship cruiser = new Cruiser(name, positionData, subSystemsList);
        //TODO (S.Panfilov) curWorkPoint
        //End Ship creation
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
