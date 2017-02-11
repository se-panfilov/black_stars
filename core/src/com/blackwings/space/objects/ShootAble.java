package com.blackwings.space.objects;

import com.blackwings.ShootParams;
import com.blackwings.Shoot;

public interface ShootAble {

    public void onTakeDamage(Shoot shoot);

    public int countDamage(Shoot shoot);

    public boolean isCanTakeFire(Object target, ShootParams shootParams);

    public boolean isUnderFire(Object target, ShootParams shootParams);


}
