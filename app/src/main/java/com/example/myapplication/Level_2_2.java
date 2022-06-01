package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Level_2_2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_2_2);
    }
    private Button button01;
    public void level_01(View v){
        Intent intent = new Intent(this, Level_2_3.class);
        startActivity(intent);

    }
    private Button button001;
    public void Level_001(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }
    private Button button0001;
    public void Level_0001(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }



}
