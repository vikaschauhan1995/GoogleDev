package com.example.googledev;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity{

    RecyclerView r1;
    String s1[], s2[];
    int imageResourse[] = {
            R.drawable.cat_image,
            R.drawable.cat_image,
            R.drawable.cat_image,
            R.drawable.cat_image,
            R.drawable.cat_image,
            R.drawable.cat_image,
            R.drawable.cat_image,
            R.drawable.cat_image};
    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RecyclerView)findViewById(R.id.myRecycler);

        s1 = getResources().getStringArray(R.array.pet_name);
        s2 = getResources().getStringArray(R.array.disc);

        ad = new MyOwnAdapter(this,s1,s2,imageResourse);

        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}