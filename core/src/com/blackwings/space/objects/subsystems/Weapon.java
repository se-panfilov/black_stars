package com.blackwings.space.objects.subsystems;

import com.blackwings.space.objects.SpaceObj;
import com.blackwings.space.objects.TargetAble;

public interface Weapon {

    public boolean targetAt(SpaceObj target, SubSystem subSystem);

    public boolean fireAtTarget(Object weapon, TargetAble targetAble);


}
