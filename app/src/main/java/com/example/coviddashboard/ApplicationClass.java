package com.example.coviddashboard;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass extends Application {

    public static final String APPLICATION_ID = "2001EE25-28D3-7F3B-FF36-4DFACF69F500";
    public static final String API_KEY = "FC639AE4-27B9-4A9A-8FF1-F99E9833F2B7";
    public static final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),
                APPLICATION_ID,
                API_KEY);

    }

}
