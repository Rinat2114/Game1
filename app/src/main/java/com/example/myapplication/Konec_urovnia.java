package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Konec_urovnia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kones_urovnia);
    }
    private Button button27;
    public void konec_urovnia (View v){
        Intent intent = new Intent(this, GameLevels.class);
        startActivity(intent);
    }
}
