package com.example.googledev;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity{
    ToggleButton toggleButton;
    CheckBox ch1, ch2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        ch1 = (CheckBox) findViewById(R.id.checkBox2);
        ch2 = (CheckBox) findViewById(R.id.checkBox3);

        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "You Checked English", Toast.LENGTH_LONG).show();
            }
        });
        ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "You Checked Hindi", Toast.LENGTH_LONG).show();
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toggleButton.isChecked()){
                    Toast.makeText(MainActivity.this, "You turned ON the Button", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "You turned OFF the Button", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void openAlert(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setTitle("Exit");
        myAlert.setMessage("Are you sure!");
        myAlert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        myAlert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        //set cancelable false will not to close the dialogue box wheneven the user clicks outside of the dialoguebox
        myAlert.setCancelable(false);

        myAlert.show();
    }

    public void openProgress(View view){
        ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("Downloading");
        pd.setTitle("Please wait...");
//        pd.setMessage(ProgressDialog.STYLE_SPINNER);
//        pd.setMessage(ProgressDialog.STYLE_HORIZONTAL);
        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        pd.show();
    }
}