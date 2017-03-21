package com.blackwings.game.space.objects;

public interface SubSystemAble {
    public com.blackwings.game.space.objects.subsystems.SubSystemsList getSubsystemsList();

    public void setSubSystemsList(com.blackwings.game.space.objects.subsystems.SubSystemsList subsystems);

    public boolean isSubSystemsCanBeChanged();
}
