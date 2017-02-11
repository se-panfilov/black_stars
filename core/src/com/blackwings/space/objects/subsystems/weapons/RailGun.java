package com.blackwings.space.objects.subsystems.weapons;

import com.blackwings.space.objects.TargetAble;
import com.blackwings.space.objects.subsystems.SubSystemState;
import com.blackwings.space.objects.subsystems.weapons.types.Gun;

public class RailGun extends Weapon implements Gun {

    private int RANGE = 100;
    private int MAX_RANGE = 100;
    private TargetAble CURRENT_TARGET;
    private int BASE_DAMAGE = 100;
    private int COOLDOWN = 100;
    private int TARGETING = 100;
    private int system_health = 100;
    private SubSystemState system_state = SubSystemState.READY;

    @Override
    public boolean fireAtTarget(TargetAble targetAble) {
        return false;//TODO (S.Panfilov)
    }

    @Override
    public int getRange() {
        return RANGE;
    }

    @Override
    public void setRange(int range) {
        RANGE = range;
    }

    @Override
    public int getMaxRange() {
        return MAX_RANGE;
    }

    @Override
    public void setMaxRange(int range) {
        MAX_RANGE = range;
    }

    @Override
    public boolean targetAt(TargetAble target) {
        CURRENT_TARGET = target;
        return true;
    }

    @Override
    public TargetAble getCurrentTarget() {
        return CURRENT_TARGET;
    }

    @Override
    public int getBaseDamage() {
        return BASE_DAMAGE;
    }

    @Override
    public void setBaseDamage(int damage) {
        BASE_DAMAGE = damage;
    }

    @Override
    public int getCooldownTime() {
        return COOLDOWN;
    }

    @Override
    public void setCooldownTime(int time) {
        COOLDOWN = time;
    }

    @Override
    public int getTargetingSpeed() {
        return TARGETING;
    }

    @Override
    public void setTargetingSpeed(int time) {
        TARGETING = time;
    }

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
        return system_health;
    }

    @Override
    public void setHealth(int health) {
        system_health = health;
    }

}
