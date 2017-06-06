package com.xushuai.xutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.btn_click1)
    private Button btn_click1;

    @ViewInject(R.id.tv)
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        x.view().inject(this);

    }

    @Event({R.id.btn_click1, R.id.btn_click2, R.id.btn_click3})
    private void initData(View view) {
        switch (view.getId()) {
            case R.id.btn_click1:
                tv.setText("点击了一次");
                break;
            case R.id.btn_click2:
                tv.setText("点击了两次");
                break;
            case R.id.btn_click3:
                tv.setText("点击了三次");
                break;
        }
    }
}