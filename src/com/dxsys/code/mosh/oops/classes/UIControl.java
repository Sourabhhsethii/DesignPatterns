package com.dxsys.code.mosh.oops.classes;

public abstract class UIControl{

    /*public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UI Control");
    }*/

    public abstract void render();

    protected boolean isEnabled = true;

    public void enable(){
        isEnabled = true;
    }
    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
