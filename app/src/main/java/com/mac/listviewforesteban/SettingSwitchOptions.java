package com.mac.listviewforesteban;


public class SettingSwitchOptions extends SettingOptions {
    private boolean isSelected;


    public SettingSwitchOptions(String name, boolean isSelected) {
        super(name);
        this.isSelected = isSelected;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
}

