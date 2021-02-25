package com.bupa.module;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bupa.common.KeyboardUtils;
import com.bupa.common.SizeUtils;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private View mMFlMSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(v -> Toast.makeText(this, "点击", Toast.LENGTH_LONG).show());
        mMFlMSearch = findViewById(R.id.ll);
        KeyboardUtils.registerSoftInputChangedListener(this, height -> {
            int measuredWidth = SizeUtils.px2dp(height);
            ObjectAnimator.ofFloat(mMFlMSearch, "TranslationY", height>0?-measuredWidth:0).setDuration(300).start();
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        KeyboardUtils.unregisterSoftInputChangedListener(this);
    }
}