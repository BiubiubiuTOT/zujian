package com.lgh.logincomponent;

import android.content.Context;
import android.content.Intent;

import com.lgh.baselib.ILoginService;

/**
 * Created by Li Guan Hui on 2019/4/25 14:54
 * 难写的代码，肯定很难读。因此，我没有注释留给你。
 */
public class LoginService implements ILoginService {

    @Override
    public void launch(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }
}
