package com.blackwings.game.space.objects;

public interface MoveAble {

    public boolean moveTo(Object position);

    public boolean isCanMove(Object position);

    public boolean isCanMoveTo(Object position);

}
