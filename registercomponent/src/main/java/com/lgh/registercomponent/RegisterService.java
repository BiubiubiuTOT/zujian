package com.lgh.registercomponent;

import android.content.Context;
import android.content.Intent;

import com.lgh.baselib.IRegisterService;

/**
 * Created by Li Guan Hui on 2019/4/25 15:22
 * 难写的代码，肯定很难读。因此，我没有注释留给你。
 */
public class RegisterService implements IRegisterService {
    @Override
    public void launch(Context context) {
        context.startActivity(new Intent(context, RegisterActivity.class));
    }
}
