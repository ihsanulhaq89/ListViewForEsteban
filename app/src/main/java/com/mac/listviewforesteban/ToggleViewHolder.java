package com.mac.listviewforesteban;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

public class ToggleViewHolder extends TextViewHolder implements CompoundButton.OnCheckedChangeListener {

    private final ToggleButton switcher;

    public ToggleViewHolder(Context context) {
        super(context);
        RelativeLayout.LayoutParams paramsToggle = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        paramsToggle.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);
        paramsToggle.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        switcher = new ToggleButton(context);
        this.getView().addView(switcher, paramsToggle);
        switcher.setOnCheckedChangeListener(this);
    }

    public void invalidate(String item) {
        super.invalidate(item);
        switcher.setChecked(DB.getFromDB());
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        DB.saveToDB(b);
    }
}
