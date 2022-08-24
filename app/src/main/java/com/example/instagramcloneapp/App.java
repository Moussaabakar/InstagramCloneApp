package com.example.instagramcloneapp;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("af8ZFSN5Eibk0b0jNHVaiAQWb9GlXqKOijzcqxDY")
                // if defined
                .clientKey("lUTlrOtUfz886SIsNb3mkABYzHgjg3KxnF7A1Ktn")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
