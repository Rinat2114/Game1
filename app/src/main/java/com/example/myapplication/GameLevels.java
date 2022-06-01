package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {
    //private Button logo6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);


    }
private Button logo6;
    public void level_1(View v) {
        Intent intent = new Intent(this, Level_1.class);
        startActivity(intent);
    }
    private Button button2;
    public void level_2(View v) {
        Intent intent = new Intent(this, Level_2.class);
        startActivity(intent);
    }
}
