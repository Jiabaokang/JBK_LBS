package com.jbk.lbstest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sunny on 2017/7/1.
 */

public class BaseActivity extends AppCompatActivity {

    /**
     * 处理权限请求，需要统一封装
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


}
