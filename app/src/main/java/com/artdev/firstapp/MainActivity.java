package com.artdev.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prizeDraw(View view){
        TextView legend = findViewById(R.id.legend);
        int randomNumber = new Random().nextInt(11);
        legend.setText("Número sorteado: " + randomNumber);
    }
}