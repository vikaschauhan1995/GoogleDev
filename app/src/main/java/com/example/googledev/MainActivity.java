package com.example.googledev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is a comment
        Button button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String msg = "Hello Toast!";
                final int duration = 2000;
                @SuppressLint("WrongConstant") Toast toast = Toast.makeText(getApplicationContext(), msg, duration);
                toast.show();
            }
        });
    }
}