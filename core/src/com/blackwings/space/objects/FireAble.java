package com.blackwings.space.objects;

import com.blackwings.ShootParams;

public interface FireAble {

    public boolean fire(Object target, ShootParams shootParams);

    public boolean canFireAt(TargetAble target);


}
