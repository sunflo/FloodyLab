package flo.zues.com.floodylab.module.service.view;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import flo.zues.com.floodylab.R;
import flo.zues.com.floodylab.module.service.service.TestService;

/**
 * Created by huangxz on 2018/5/15.
 */
public class ServiceTestActivity extends AppCompatActivity implements View.OnClickListener {
    ServiceConnection sc = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            TestService.MyBinder binder = (TestService.MyBinder) service;

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_start, R.id.btn_bind})
    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i = new Intent(ServiceTestActivity.this, TestService.class);
        switch (id) {
            case R.id.btn_start:

                startService(i);

                break;
            case R.id.btn_bind:


                bindService(i, sc, BIND_AUTO_CREATE);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        unbindService(sc);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Log.d("flo","onSaveInstanceState");
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d("flo","onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }
}
