package com.bupa.module.Test;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bupa.module.R;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = "/module/main2Activity")
public class Main2Activity extends AppCompatActivity {

    private View mMFlMSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2main);
        findViewById(R.id.btn).setOnClickListener(v -> Toast.makeText(this, "点击", Toast.LENGTH_LONG).show());
        mMFlMSearch = findViewById(R.id.ll);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}