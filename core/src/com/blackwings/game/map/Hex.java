package com.blackwings.game.map;


import com.badlogic.gdx.utils.Array;
import com.blackwings.game.map.units.gameengine.GEUnit;

// Hex Flat orientation
//
//     _____
//    a     b
//   /       \
//  c    o    d
//   \       /
//    e_____f
//
public class Hex implements GridItem {
    private Array<GEUnit> coordinates;
    Position position;
    //TODO (S.Panfilov) Radius should not be 0
    private final int RADIUS = 10;//mock

    public Hex(Position position) {
        this.position = position;
        coordinates = makeHex(this.position.getGEUnitX(), this.position.getGEUnitY(), RADIUS);
    }

    public Hex(GEUnit geUnit) {
        this.position = new Position(geUnit);
        coordinates = makeHex(this.position.getGEUnitX(), this.position.getGEUnitY(), RADIUS);
    }

    public Hex(Position position, float hexRadius) {
        this.position = position;
        coordinates = makeHex(this.position.getGEUnitX(), this.position.getGEUnitY(), hexRadius);
    }

    private Array<GEUnit> makeHex(float centerX, float centerY, float radius) {
        //TODO (S.Panfilov) test it
        float ax = centerX - (radius / 2);
        float ay = centerY + radius;
        GEUnit a = new GEUnit(ax, ay);

        float bx = centerX + (radius / 2);
        float by = centerY + radius;
        GEUnit b = new GEUnit(bx, by);

        float cx = centerX - radius;
        float cy = centerY;
        GEUnit c = new GEUnit(cx, cy);

        float dx = centerX + radius;
        float dy = centerY;
        GEUnit d = new GEUnit(dx, dy);

        float ex = centerX - (radius / 2);
        float ey = centerY - radius;
        GEUnit e = new GEUnit(ex, ey);

        float fx = centerX + (radius / 2);
        float fy = centerY - radius;
        GEUnit f = new GEUnit(fx, fy);

        Array<GEUnit> coordinates = new Array<GEUnit>();
        coordinates.add(a);
        coordinates.add(b);
        coordinates.add(c);
        coordinates.add(d);
        coordinates.add(e);
        coordinates.add(f);

        return coordinates;
    }

    @Override
    public Array<GEUnit> getCoordinatesList() {
        return coordinates;
    }

    @Override
    public GEUnit getCenter() {
        return this.position.toGEUnits();
    }
}
