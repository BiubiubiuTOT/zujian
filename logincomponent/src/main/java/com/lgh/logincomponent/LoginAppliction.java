package com.lgh.logincomponent;

import android.app.Application;

import com.lgh.baselib.IAppcomponent;
import com.lgh.baselib.ServiceFactory;

/**
 * Created by Li Guan Hui on 2019/4/25 15:13
 * 难写的代码，肯定很难读。因此，我没有注释留给你。
 */
public class LoginAppliction extends Application implements IAppcomponent {
    private static Application application;

    public static Application getAppliction() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }

    @Override
    public void init(Application application) {
        this.application = application;
        ServiceFactory.getInstance().setiLoginService(new LoginService());
    }
}
