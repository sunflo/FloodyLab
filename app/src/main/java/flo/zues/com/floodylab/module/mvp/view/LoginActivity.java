package flo.zues.com.floodylab.module.mvp.view;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import flo.zues.com.floodylab.R;
import flo.zues.com.floodylab.module.mvp.entity.User;

/**
 * Created by huangxz on 2018/5/14.
 */
public class LoginActivity extends AppCompatActivity implements ILoginView {

    @BindView(R.id.et_userName)
    EditText etUserName;
    @BindView(R.id.et_pwd)
    EditText etPwd;

    private User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

    }

    @Override
    public String getUserName() {
        return etUserName.getEditableText().toString();
    }

    @Override
    public String getPassword() {
        return etPwd.getEditableText().toString();
    }

    @Override
    public void clearUserName() {
        etUserName.setText("");
    }

    @Override
    public void clearPassword() {
        etPwd.setText("");
    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(this, user.getUserName() +
                " login success , to MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFail() {
        Toast.makeText(this,
                "login failed", Toast.LENGTH_SHORT).show();
    }
}
