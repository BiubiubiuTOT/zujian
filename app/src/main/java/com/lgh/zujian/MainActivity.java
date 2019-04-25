package com.lgh.zujian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lgh.baselib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        ServiceFactory.getInstance().getiLoginService().launch(this);
    }

    public void register(View view) {
        ServiceFactory.getInstance().getiRegisterService().launch(this);
    }
}
