package com.mac.listviewforesteban;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TextViewHolder {
    private final RelativeLayout view;
    private final TextView desc;

    public TextViewHolder(Context context) {
        int valueInPixels = (int) context.getResources().getDimension(R.dimen.row_height);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, valueInPixels);
        RelativeLayout.LayoutParams paramsName = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        paramsName.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);
        view = new RelativeLayout(context);
        view.setLayoutParams(params);
        desc = new TextView(context);
        view.addView(desc, paramsName);
    }

    public RelativeLayout getView() {
        return view;
    }

    public void invalidate(String item) {
        desc.setText(item);
    }
}
