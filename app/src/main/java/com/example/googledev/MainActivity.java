package com.example.googledev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is a comment
    }
    public void showToast(View view){
        String msg = "Hello Toast!";
        int duration = 2000;
        @SuppressLint("WrongConstant") Toast toast = Toast.makeText(this, msg, duration);
        toast.show();
    }
}