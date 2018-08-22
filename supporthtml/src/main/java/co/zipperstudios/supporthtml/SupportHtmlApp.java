package co.zipperstudios.supporthtml;

import android.app.Application;

public class SupportHtmlApp extends Application {

    private static SupportHtmlApp sInstance;

    public static SupportHtmlApp getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }
}
