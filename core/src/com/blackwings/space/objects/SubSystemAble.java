package com.blackwings.space.objects;

import com.badlogic.gdx.utils.Array;
import com.blackwings.space.objects.subsystems.SubSystem;
import com.blackwings.space.objects.subsystems.SubSystemsList;

public interface SubSystemAble {
    public SubSystemsList getSubsystemsList();
    public void setSubSystemsList(SubSystemsList subsystems);
    public boolean isSubSystemsCanBeChanged();
}
