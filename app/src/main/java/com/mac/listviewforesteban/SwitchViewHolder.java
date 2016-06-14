package com.mac.listviewforesteban;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class SwitchViewHolder extends TextViewHolder implements CompoundButton.OnCheckedChangeListener {

    private final Switch switcher;
    private Adapter adapter;
    private int index;

    public SwitchViewHolder(View v, Adapter adapter) {
        super(v);
        this.adapter = adapter;
        switcher = (Switch) v.findViewById(R.id.switcher);
        switcher.setOnCheckedChangeListener(this);
    }

    public void invalidate(SettingSwitchOptions item, int index) {
        super.invalidate(item);
        this.index = index;
        switcher.setChecked(item.isSelected());
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        ((SettingSwitchOptions) adapter.getItem(index)).setIsSelected(b);
    }
}
