package com.example.ginni.notesapplication;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {

    Context context;
    SharedPreferences sharedPreferences;
    private final String username = "Username";
    private final String password = "Password";
    private final String status = "Status";

    Preferences(Context context) {
        this.context = context;
        sharedPreferences = this.context.getSharedPreferences("prefs",this.context.MODE_PRIVATE);
    }

    void setCredentials(String name,String pwd) {
        sharedPreferences.edit().putString(username,name).apply();
        sharedPreferences.edit().putString(password,pwd).apply();
        sharedPreferences.edit().putString(status,"false").apply();
    }

    String getName() {
        return sharedPreferences.getString(username,"");
    }

    String getPassword() {
        return sharedPreferences.getString(password,"");
    }

    boolean checkStatus() {
        return (sharedPreferences.getString(status,"false").contentEquals("true"));
    }

    void changeStatus(boolean currentStatus) {
        if(currentStatus)
            sharedPreferences.edit().putString(status,"true").apply();
        else
            sharedPreferences.edit().putString(status,"false").apply();
    }
}
