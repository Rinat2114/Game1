package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Level_1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_1);
    }
    private Button button7;
    public void level_1_2(View v){
        Intent intent = new Intent(this, Level_1_2.class);
        startActivity(intent);

    }
    private Button button6;
    public void Level_1(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }
    private Button button5;
    public void Level_11(View v){

        Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();

    }

}
