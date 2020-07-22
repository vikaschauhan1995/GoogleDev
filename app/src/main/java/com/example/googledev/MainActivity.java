package com.example.googledev;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickToOpenBrowser(View view){
        Uri uri = Uri.parse("http://www.google.com");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
}