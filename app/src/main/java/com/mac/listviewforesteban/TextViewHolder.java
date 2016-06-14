package com.mac.listviewforesteban;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TextViewHolder {
    private final TextView name;

    public TextViewHolder(View v ) {
        name = (TextView) v.findViewById(R.id.name);
    }

    public void invalidate(SettingOptions item) {
        name.setText(item.getName());
    }
}
