package com.example.googledev;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//import Linear.LayoutParams;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        TextView myTextview =  new TextView(this);
        myTextview.setWidth(LinearLayout.LayoutParams.MATCH_PARENT);
        myTextview.setHeight(LinearLayout.LayoutParams.WRAP_CONTENT);
        myTextview.setMinLines(3);
        myTextview.setText(R.string.my_story);

        linearLayout.addView(myTextview);
        setContentView(linearLayout);

    }
}