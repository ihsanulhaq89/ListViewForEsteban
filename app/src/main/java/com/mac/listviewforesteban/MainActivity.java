package com.mac.listviewforesteban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private static final String SETTINGS_LIST_OPTION1_TRAILER_DETECTION_ALERT = "Trailer Detection Alert";
    private static final String SETTINGS_LIST_OPTION2_MAINTENANCE_ALERT = "Maintenance Alerts";
    private static final String SETTINGS_LIST_OPTION3_SECURITY_ALERT = "Security Alert";
    private static final String SETTINGS_LIST_OPTION4_TOWHAUL_MODE_REMINDER = "Tow/Haul Mode Reminder";
    private ListView mListView;
    private Adapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.list_id_ta_settings_view);
        adapter  = new Adapter(this, 0);
        adapter.add(SETTINGS_LIST_OPTION1_TRAILER_DETECTION_ALERT);
        adapter.add(SETTINGS_LIST_OPTION2_MAINTENANCE_ALERT);
        adapter.add(SETTINGS_LIST_OPTION3_SECURITY_ALERT);
        adapter.add(SETTINGS_LIST_OPTION4_TOWHAUL_MODE_REMINDER);
        mListView.setAdapter(adapter);
    }

}
