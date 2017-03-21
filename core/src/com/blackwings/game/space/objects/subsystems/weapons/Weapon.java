package com.blackwings.game.space.objects.subsystems.weapons;

import com.blackwings.game.space.objects.TargetAble;
import com.blackwings.game.space.objects.subsystems.SubSystem;

abstract class Weapon implements SubSystem {
    abstract public boolean fireAtTarget(TargetAble targetAble);

    abstract public int getRange();

    abstract void setRange(int range);

    abstract public int getMaxRange();

    abstract void setMaxRange(int range);

//    abstract public boolean isCanTarget(TargetAble target);

    abstract public boolean targetAt(TargetAble target);

    abstract public TargetAble getCurrentTarget();

    abstract public int getBaseDamage();

    abstract void setBaseDamage(int damage);

    abstract public int getCooldownTime();

    abstract void setCooldownTime(int time);

    abstract public int getTargetingSpeed();

    abstract void setTargetingSpeed(int time);
}
