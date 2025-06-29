package com.android.settings.deviceinfo.aboutphone;

import android.os.Bundle;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class AboutScandiumFragment extends SettingsPreferenceFragment {
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        addPreferencesFromResource(R.xml.scandium_settings_about); 
    }
}