package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Level_1_4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_1_4);
    }
    private Button button14;
    public void level_1_4(View v){
        Intent intent = new Intent(this, Level_1_5.class);
        startActivity(intent);

    }
    private Button button15;
    public void Level_23(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }
    private Button button16;
    public void Level_21(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }



}
