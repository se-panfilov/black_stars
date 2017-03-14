package com.blackwings.game.map.units.ingame;

public class InGameUnit {
    private float x = 0;
    private float y = 0;

    public InGameUnit(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public InGameUnit() {
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
