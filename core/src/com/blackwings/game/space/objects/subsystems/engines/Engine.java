package com.blackwings.game.space.objects.subsystems.engines;

import com.blackwings.game.space.objects.subsystems.SubSystem;

abstract class Engine implements SubSystem {

    abstract public int getBaseThrust();

    abstract void setBaseThrust(int thrust);

    abstract public int getCooldownTime();

    abstract void setCooldownTime(int time);

    abstract public int getPrepareTime();

    abstract void setPrepareTime(int time);

    abstract public int getFuel();

    abstract boolean setFuel(int fuel);

    abstract public int getSize();

//    abstract void setSize(int size);

}
