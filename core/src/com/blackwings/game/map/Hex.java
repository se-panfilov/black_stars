package com.blackwings.game.map;


import com.badlogic.gdx.utils.Array;
import com.blackwings.game.map.grid.GridItem;
import com.blackwings.game.map.units.engine.EngineUnit;

// Flat Orientation Hex
//
//     _____
//    a     b
//   /       \
//  c    o    d
//   \       /
//    e_____f
//
public class Hex implements GridItem {
    private Array<EngineUnit> coordinates;
    private Position position;

    //TODO (S.Panfilov) Radius should not be 0
    private final int RADIUS = 10;//mock

    public Hex(Position position) {
        this.position = position;
        coordinates = makeHex(this.position.getEngineUnitX(), this.position.getEngineUnitY(), RADIUS);
    }

    public Hex(EngineUnit engineUnit) {
        this.position = new Position(engineUnit);
        coordinates = makeHex(this.position.getEngineUnitX(), this.position.getEngineUnitY(), RADIUS);
    }

    public Hex(Position position, float hexRadius) {
        this.position = position;
        coordinates = makeHex(this.position.getEngineUnitX(), this.position.getEngineUnitY(), hexRadius);
    }

    private Array<EngineUnit> makeHex(float centerX, float centerY, float radius) {
        //TODO (S.Panfilov) test it
        float ax = centerX - (radius / 2);
        float ay = centerY + radius;
        EngineUnit a = new EngineUnit(ax, ay);

        float bx = centerX + (radius / 2);
        float by = centerY + radius;
        EngineUnit b = new EngineUnit(bx, by);

        float cx = centerX - radius;
        float cy = centerY;
        EngineUnit c = new EngineUnit(cx, cy);

        float dx = centerX + radius;
        float dy = centerY;
        EngineUnit d = new EngineUnit(dx, dy);

        float ex = centerX - (radius / 2);
        float ey = centerY - radius;
        EngineUnit e = new EngineUnit(ex, ey);

        float fx = centerX + (radius / 2);
        float fy = centerY - radius;
        EngineUnit f = new EngineUnit(fx, fy);

        Array<EngineUnit> coordinates = new Array<EngineUnit>();
        coordinates.add(a);
        coordinates.add(b);
        coordinates.add(c);
        coordinates.add(d);
        coordinates.add(e);
        coordinates.add(f);

        return coordinates;
    }

    @Override
    public Array<EngineUnit> getCoordinatesList() {
        return coordinates;
    }

    @Override
    public EngineUnit getCenter() {
        return position.toEngineUnits();
    }

    @Override
    public Position getPosition() {
        return position;
    }
}
