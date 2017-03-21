package com.blackwings.game.map.units.engine;

import com.blackwings.game.map.units.Unit;

public class EngineUnit extends Unit {
    private float x;
    private float y;

    public EngineUnit(float x, float y) {
        setX(x);
        setY(y);
    }

    public EngineUnit() {
        setX(0);
        setY(0);
    }

}
