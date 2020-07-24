package com.example.googledev;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onCreate Appps");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onStart Appps");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onResume Appps");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onPause Appps");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onStop Appps");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onRestart Appps");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy Finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onDestroy Appps");
    }
}