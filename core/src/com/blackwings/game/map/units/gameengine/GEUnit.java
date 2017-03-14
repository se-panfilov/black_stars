package com.blackwings.game.map.units.gameengine;

import com.blackwings.game.map.units.Unit;

public class GEUnit extends Unit {
    private float x;
    private float y;

    public GEUnit(float x, float y) {
        setX(x);
        setY(y);
    }

    public GEUnit() {
        setX(0);
        setY(0);
    }

}
