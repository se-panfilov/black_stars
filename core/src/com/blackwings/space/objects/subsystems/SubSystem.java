package com.blackwings.space.objects.subsystems;

import com.blackwings.space.objects.subsystems.weapons.SubSystemState;

public interface SubSystem {
    public SubSystemState getState();

    public void setState(SubSystemState state);

    public int getHealth();

    public void setHealth(int health);
}
