package com.wsl.local;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity====";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        intent.setAction("com.wsl.remote.RemoteService");
        intent.setPackage("com.wsl.remote");
        startService(intent);
//        boolean b = bindService(intent, new ServiceConnection() {
//            @Override
//            public void onServiceConnected(ComponentName name, IBinder service) {
//                IMyAidlInterface iMyAidlInterface = IMyAidlInterface.Stub.asInterface(service);
//                try {
//                    String name1 = iMyAidlInterface.getName();
//                    System.out.println("wsl=====" + name1);
//                } catch (RemoteException e) {
//                    e.printStackTrace();
//                }
//                Log.i(TAG, "绑定成功");
//            }
//
//            @Override
//            public void onServiceDisconnected(ComponentName name) {
//                Log.i(TAG, "绑定失败");
//            }
//        }, Context.BIND_AUTO_CREATE);
//        Log.i(TAG, "b==" + b);
    }
}
