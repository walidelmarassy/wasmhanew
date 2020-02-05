package com.example.wasmhanew.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

class PreferenceUtils {
    private static final String prefName = "Seek";
    static SharedPreferences preferences;
    static PreferenceUtils preferencesutils;
    static Context context;

    public static void changeLanguage(Activity activity, SharedPreferences preferences, String lang) {
        preferences.edit().putString(Constant.Preferences_LANGUAGE, lang).apply();

    }
    public static PreferenceUtils getInstance(Context context) {
        if (preferences == null) {
            preferencesutils = new PreferenceUtils();
            preferences = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        }
        PreferenceUtils.context = context;
        return preferencesutils;
    }

    public SharedPreferences getPreferences() {
        return preferences;
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public void putBoolean(String key, boolean value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return preferences.getBoolean(key, defaultValue);
    }

    public String getString(String key, String defaultValue) {
        return preferences.getString(key, defaultValue);
    }

}
