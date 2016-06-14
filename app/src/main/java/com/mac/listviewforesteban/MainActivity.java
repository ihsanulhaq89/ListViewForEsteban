package com.mac.listviewforesteban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String SETTINGS_LIST_OPTION1_TRAILER_DETECTION_ALERT = "Trailer Detection Alert";
    private static final String SETTINGS_LIST_OPTION2_MAINTENANCE_ALERT = "Maintenance Alerts";
    private static final String SETTINGS_LIST_OPTION3_SECURITY_ALERT = "Security Alert";
    private static final String SETTINGS_LIST_OPTION4_TOWHAUL_MODE_REMINDER = "Tow/Haul Mode Reminder";
    private ListView mListView;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.list_id_ta_settings_view);
        List<SettingOptions> options = new ArrayList<>();
        options.add(new SettingOptions(SETTINGS_LIST_OPTION1_TRAILER_DETECTION_ALERT));
        options.add(new SettingOptions(SETTINGS_LIST_OPTION2_MAINTENANCE_ALERT));
        options.add(new SettingOptions(SETTINGS_LIST_OPTION3_SECURITY_ALERT));
        options.add(new SettingSwitchOptions(SETTINGS_LIST_OPTION4_TOWHAUL_MODE_REMINDER, false));
        adapter = new Adapter(this, options);
        mListView.setAdapter(adapter);
    }

}
