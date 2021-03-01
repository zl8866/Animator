package com.bupa.mylibrary;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 作者:张磊
 * 日期:2021/2/20 0020
 * 说明:ni shi wo de xiao ping guo
 */
@Route(path = "/mylibrary/mainActivity")
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(v -> ARouter.getInstance().build("/test/main2Activity").navigation());
        KeyboardUtils.fixAndroidBug5497(this);
    }
}