package com.dukelight.applib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dukelight.applib.util.ScreenUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().post(new Runnable() {
            @Override
            public void run() {
                System.out.println(ScreenUtil.getScreenWidth(MainActivity.this));
                System.out.println(ScreenUtil.getScreenHeight(MainActivity.this));
                System.out.println(ScreenUtil.getDpi(MainActivity.this));
                System.out.println(ScreenUtil.getTopStatusHeight(MainActivity.this));
                System.out.println(ScreenUtil.getTitleHeight(MainActivity.this));
                System.out.println(ScreenUtil.getBottomStatusHeight(MainActivity.this));
            }
        });


    }
}
