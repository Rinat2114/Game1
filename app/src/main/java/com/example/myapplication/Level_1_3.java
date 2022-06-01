package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Level_1_3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_1_3);
    }
    private Button button11;
    public void level_1_3(View v){
        Intent intent = new Intent(Level_1_3.this, Level_1_4.class);
        startActivity(intent);

    }
    private Button button12;
    public void Level_14(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }
    private Button button13;
    public void Level_15(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }



}
