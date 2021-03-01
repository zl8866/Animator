package com.bupa.module;

import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bupa.common.KeyboardUtils;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(v ->
                ARouter.getInstance().build("/mylibrary/mainActivity").navigation()
        );
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        KeyboardUtils.unregisterSoftInputChangedListener(this);
    }
}