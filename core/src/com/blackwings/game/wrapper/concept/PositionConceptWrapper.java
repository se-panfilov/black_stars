package com.blackwings.game.wrapper.concept;

import com.blackwings.game.map.Position;
import com.blackwings.game.wrapper.Wrapper;

public class PositionConceptWrapper implements Wrapper {

    private final Position position;

    PositionConceptWrapper(Position position) {
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
