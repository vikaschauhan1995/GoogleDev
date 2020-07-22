package com.example.googledev;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.net.URI;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickToOpenBrowser(View view){
        Uri uri = Uri.parse("tel:8005551234");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
    // Intent.ACTION_VIEW is for all type
    // Intent.ACTION_DIAL is specifically for Dial app
//    it is all upon URI
//    http: for browser apps
//    tel: for telephone apps
//    geo: for map apps
}