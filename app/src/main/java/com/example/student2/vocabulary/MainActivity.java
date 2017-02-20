package com.example.student2.vocabulary;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences SP = getSharedPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor ED = SharedPreferences.ED();




    }
}
