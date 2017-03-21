package com.blackwings.game.map.units.game;

public class GameUnit {
    private float x = 0;
    private float y = 0;

    public GameUnit(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public GameUnit() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
