package com.mac.listviewforesteban;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends BaseAdapter {

    private final int TEXT_AND_SWITCH = 0;
    private final int TEXT_ONLY = 1;
    private final Context context;
    private List<SettingOptions> optionsList = new ArrayList<>();

    public Adapter(Context context, List<SettingOptions> items) {
        this.context = context;
        optionsList = items;
    }

    @Override
    public int getCount() {
        return optionsList.size();
    }

    @Override
    public Object getItem(int i) {
        return optionsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextViewHolder holder;
        if (convertView == null) {
            if (getItemViewType(position) == TEXT_ONLY) {
                LayoutInflater inflater = LayoutInflater.from(context);
                convertView = inflater.inflate(R.layout.row_text_only, parent, false);
                holder = new TextViewHolder(convertView);
            } else {
                LayoutInflater inflater = LayoutInflater.from(context);
                convertView = inflater.inflate(R.layout.row_text_switch, parent, false);
                holder = new SwitchViewHolder(convertView, this);
            }
            convertView.setTag(holder);
        }


        if (getItemViewType(position) == TEXT_ONLY) {
            holder = (TextViewHolder) convertView.getTag();
            holder.invalidate((SettingOptions) getItem(position));
        } else {
            holder = (SwitchViewHolder) convertView.getTag();
            ((SwitchViewHolder) holder).invalidate((SettingSwitchOptions) getItem(position), position);
        }

        return convertView;
    }


    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (getItem(position) instanceof SettingSwitchOptions) {
            return TEXT_AND_SWITCH;
        }
        return TEXT_ONLY;
    }

}
