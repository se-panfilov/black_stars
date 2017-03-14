package com.blackwings.game.map;


import com.badlogic.gdx.utils.Array;

// Hex Flat orientation
//
//     _____
//    a     b
//   /       \
//  c    o    d
//   \       /
//    e_____f
//
public class Hex {
    private Array<Coordinate> coordinates;
    private float centerX;
    private float centerY;
    //TODO (S.Panfilov) Radius should not be 0
    private final int RADIUS = 10;//mock

    public Hex(Position position) {
        centerX = position.getGEUnitX();
        centerY = position.getGEUnitY();
        coordinates = makeHex(centerX, centerY, RADIUS);
    }

    public Hex(Position position, float hexRadius) {
        centerX = position.getGEUnitX();
        centerY = position.getGEUnitY();
        coordinates = makeHex(centerX, centerY, hexRadius);
    }

    private Array<Coordinate> makeHex(float centerX, float centerY, float radius) {
        //TODO (S.Panfilov) test it
        float ax = centerX - (radius / 2);
        float ay = centerY + radius;
        Coordinate a = new Coordinate(ax, ay);

        float bx = centerX + (radius / 2);
        float by = centerY + radius;
        Coordinate b = new Coordinate(bx, by);

        float cx = centerX - radius;
        float cy = centerY;
        Coordinate c = new Coordinate(cx, cy);

        float dx = centerX + radius;
        float dy = centerY;
        Coordinate d = new Coordinate(dx, dy);

        float ex = centerX - (radius / 2);
        float ey = centerY - radius;
        Coordinate e = new Coordinate(ex, ey);

        float fx = centerX + (radius / 2);
        float fy = centerY - radius;
        Coordinate f = new Coordinate(fx, fy);

        Array<Coordinate> coordinates = new Array<Coordinate>();
        coordinates.add(a);
        coordinates.add(b);
        coordinates.add(c);
        coordinates.add(d);
        coordinates.add(e);
        coordinates.add(f);

        return coordinates;
    }

    public Array<Coordinate> getCoordinatesList() {
        return coordinates;
    }

    public Coordinate getCenter() {
        return new Coordinate(centerX, centerY);
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }


}
