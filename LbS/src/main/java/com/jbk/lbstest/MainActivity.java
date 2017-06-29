package com.jbk.lbstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;

/**
 * 1.显示经纬度
 */
public class MainActivity extends AppCompatActivity {


    private TextView positionText;
    private LocationClient mLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerLocationListener();
        initViews();
        checkMustPermission();
    }

    private void registerLocationListener() {
        mLocationClient = new LocationClient(getApplicationContext());
        mLocationClient.registerLocationListener(new MyLocationListener());
    }

    private void initViews() {
        positionText = (TextView) findViewById(R.id.position_text_view);
    }

    private void checkMustPermission() {

    }


    private class MyLocationListener implements BDLocationListener {
        @Override
        public void onReceiveLocation(BDLocation bdLocation) {

        }

        @Override
        public void onConnectHotSpotMessage(String s, int i) {

        }
    }
}
