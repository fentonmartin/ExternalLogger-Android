package guy4444.externallogger;

import android.app.Application;

import guy4444.extrnalloggerlibrary.MyLoggerDB;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MyLoggerDB.initHelper(this);
    }
}
