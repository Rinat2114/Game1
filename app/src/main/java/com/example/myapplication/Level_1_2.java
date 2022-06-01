package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level_1_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_1_2);
    }

    private Button button9;
    public void level_13(View v){
        Intent intent = new Intent(this, Level_1_3.class);
        startActivity(intent);

    }
    private Button button8;
    public void Level_12(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }
    private Button button10;
    public void Level_1_3(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }



}

