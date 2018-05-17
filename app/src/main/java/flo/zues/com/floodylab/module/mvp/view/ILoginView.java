package flo.zues.com.floodylab.module.mvp.view;

/**
 * Created by huangxz on 2018/5/14.
 */
public interface ILoginView {
    String getUserName();
    String getPassword();
    void clearUserName();
    void clearPassword();
    void onLoginSuccess();
    void onLoginFail();

    int u = 123;
}
