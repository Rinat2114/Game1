package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Level_2_4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_2_4);
    }
    private Button button00;
    public void Level_00(View v){
        Intent intent = new Intent(this, Level_2_5.class);
        startActivity(intent);

    }
    private Button button0;
    public void level_0(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }
    private Button button000;
    public void Level_000(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }



}
