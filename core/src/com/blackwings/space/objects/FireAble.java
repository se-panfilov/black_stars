package com.blackwings.space.objects;

public interface FireAble {

    public boolean fire(Object target, ShootParams shootParams);

    public boolean canFireAt(TargetAble target);


}
