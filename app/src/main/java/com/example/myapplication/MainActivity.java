package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import  android.view.View;
import  android.widget.TextView;
import  java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Click(View view) {
        TextView numero = findViewById(R.id.textView2);
        int aleatorio = new Random().nextInt(10);
        numero.setText("Eis o número: "+ aleatorio);
    }

}