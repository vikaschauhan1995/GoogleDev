package com.example.googledev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle b1 = getIntent().getExtras();
        String s1 = b1.getString("key1");
        tv1 = (TextView) findViewById(R.id.result);

        tv1.setText(s1);
    }
}