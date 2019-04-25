package com.lgh.zujian;

import android.app.Application;

import com.lgh.baselib.IAppcomponent;

/**
 * Created by Li Guan Hui on 2019/4/25 15:06
 * 难写的代码，肯定很难读。因此，我没有注释留给你。
 */
public class MainApplication extends Application implements IAppcomponent {
    private static MainApplication application;

    private static MainApplication getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }

    @Override
    public void init(Application application) {
        //将主app的上下文传到login及register中
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object obj = clazz.newInstance();
                if (obj instanceof IAppcomponent) {
                    ((IAppcomponent) obj).init(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
