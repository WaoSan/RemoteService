package com.wsl.remote;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

public class RemoteService extends Service {

    @Override
    public void onCreate() {

        Log.e("wsl====", "onCreate");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"服务开启",Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    private class MyBinder extends IMyAidlInterface.Stub {
        @Override
        public String getName() throws RemoteException {
            return "I am remote service";
        }
    }
}
