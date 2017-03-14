package com.blackwings.game.map;

public class Coordinate {
    private float x;
    private float y;

    public Coordinate(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    void setY(float y) {
        this.y = y;
    }
}
