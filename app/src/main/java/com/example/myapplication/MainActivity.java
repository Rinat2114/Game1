package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 private Button logo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

        public void startNewActivity(View v){
        Intent intent = new Intent(this, GameLevels.class);
        startActivity(intent);
        }
    //int button7 = 1;
   // int button6 = 0;
    //int button5 = 0;

    }
