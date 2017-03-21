package com.blackwings.game.wrapper.game;

import com.blackwings.game.map.Position;
import com.blackwings.game.wrapper.Wrapper;

public class PositionGameWrapper implements Wrapper {

    private final Position position;

    PositionGameWrapper(Position position) {
        this.position = position;
    }

    public void getCoordinates() {
        position.getGameUnits();
    }

    public void getX() {
        position.getGameUnitX();
    }

    public void getY() {
        position.getGameUnitY();
    }

    @Override
    public Position getOriginal() {
        return position;
    }
}
