package com.mac.listviewforesteban;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class Adapter extends ArrayAdapter<String> {

    private final int TEXT_AND_SWITCH = 0;
    private final int TEXT_ONLY = 1;
    private final Context context;

    public Adapter(Context context, int resource) {
        super(context, resource);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextViewHolder holder;
        if (convertView == null) {

            holder = createViewHolderBasedOnPosition(position);
            convertView = holder.getView();
            convertView.setTag(holder);
        }
        holder = (TextViewHolder) convertView.getTag();
        holder.invalidate(getItem(position));
        return convertView;
    }

    private TextViewHolder createViewHolderBasedOnPosition(int position) {

        if (getItemViewType(position) == TEXT_ONLY) {
            return new TextViewHolder(context);
        } else {
            return new ToggleViewHolder(context);
        }
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TEXT_AND_SWITCH;
        }
        return TEXT_ONLY;
    }

}
