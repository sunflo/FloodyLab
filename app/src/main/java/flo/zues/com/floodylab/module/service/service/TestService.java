package flo.zues.com.floodylab.module.service.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by huangxz on 2018/5/15.
 */
public class TestService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d("flo", "bind Service");
        return new MyBinder();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d("flo", "unbind Service");
        return true;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("flo", "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onRebind(Intent intent) {
        Log.d("flo", "onRebind");
        super.onRebind(intent);
    }

    public class MyBinder extends Binder {
        public TestService getService() {
            return TestService.this;
        }
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("flo", "onDestory");
    }


}
