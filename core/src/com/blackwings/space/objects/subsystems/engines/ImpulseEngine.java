package com.blackwings.space.objects.subsystems.engines;

import com.blackwings.space.objects.subsystems.SubSystemState;
import com.blackwings.space.objects.subsystems.engines.types.MainEngine;

public class ImpulseEngine extends Engine implements MainEngine {

    final private int ENGINE_SIZE = EngineSizes.getHugeSize();
    final private int MAX_FUEL = 100;
    final private int MAX_HEALTH = 100;
    final private int MIN_HEALTH = 0;
    final private int MAX_THRUST = 100;
    final private int MIN_THRUST = 0;
    private int fuel = 0;
    private int prepareTime = 100;
    private int cooldownTime = 100;
    private int health = 100;
    private int thrust = 100;
    private SubSystemState system_state = SubSystemState.READY;

    @Override
    public SubSystemState getState() {
        return system_state;
    }

    @Override
    public void setState(SubSystemState state) {
        system_state = state;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        if (health >= MIN_HEALTH && health <= MAX_HEALTH) this.health = health;
        //TODO (S.Panfilov) throw error
    }

    @Override
    public int getBaseThrust() {
        return thrust;
    }

    @Override
    void setBaseThrust(int thrust) {
        if (health >= MIN_THRUST && health <= MAX_THRUST) this.thrust = thrust;
        //TODO (S.Panfilov) throw error
    }

    @Override
    public int getCooldownTime() {
        return cooldownTime;
    }

    @Override
    void setCooldownTime(int time) {
        cooldownTime = time;
    }

    @Override
    public int getPrepareTime() {
        return prepareTime;
    }

    @Override
    void setPrepareTime(int time) {
        prepareTime = time;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    boolean setFuel(int fuel) {
        if (fuel <= MAX_FUEL) {
            this.fuel = fuel;
            return true;
        }
        //throw //TODO (S.Panfilov)throe error
        return false;
    }

    @Override
    public int getSize() {
        return ENGINE_SIZE;
    }

}
