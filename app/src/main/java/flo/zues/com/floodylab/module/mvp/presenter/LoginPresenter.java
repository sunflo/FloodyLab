package flo.zues.com.floodylab.module.mvp.presenter;

import flo.zues.com.floodylab.module.mvp.view.ILoginView;

/**
 * Created by huangxz on 2018/5/14.
 */
public class LoginPresenter {
    ILoginView mLoginView;

    public LoginPresenter(ILoginView p) {
        this.mLoginView = p;
    }
    public void login(){
    }
}
