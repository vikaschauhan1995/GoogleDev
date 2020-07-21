package com.example.googledev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        //this is a comment
        LinearLayout linearL = new LinearLayout(this);
        linearL.setOrientation(LinearLayout.VERTICAL);

        TextView myText = new TextView(this);
        myText.setText("Display this text!");

        linearL.addView(myText);
        setContentView(linearL);
    }
}