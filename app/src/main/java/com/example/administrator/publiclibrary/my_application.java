package com.example.administrator.publiclibrary;

/**
 * Created by Administrator on 23/05/2017.
 */
import android.app.Application;

public class my_application extends Application {

    private static my_application mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static synchronized my_application getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}