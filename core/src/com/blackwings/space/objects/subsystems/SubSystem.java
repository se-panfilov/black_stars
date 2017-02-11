package com.blackwings.space.objects.subsystems;

public interface SubSystem {
    public SubSystemState getState();

    public void setState(SubSystemState state);

    public int getHealth();

    public void setHealth(int health);
}
