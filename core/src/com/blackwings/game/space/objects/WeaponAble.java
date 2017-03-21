package com.blackwings.game.space.objects;

import com.badlogic.gdx.utils.Array;
import com.blackwings.game.space.objects.subsystems.SubSystem;

public interface WeaponAble {
    public Array<SubSystem> getWeaponsList();

    public boolean setWeaponsList(Array<SubSystem> weapons);
}
