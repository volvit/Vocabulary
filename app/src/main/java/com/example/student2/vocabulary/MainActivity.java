package com.example.student2.vocabulary;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences;
        final String SAVED_TEXT = "TEXT";

        void saveData() {
            SharedPreferences SP = getPreferences(Context.MODE_PRIVATE);
            SharedPreferences.Editor ED = SharedPreferences.edit();
            ED.putString(SAVED_TEXT, etText.getText().toString());

            ED.commit();
            Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }



   /* void saveData() {
        SharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SAVED_TEXT, etText.getText().toString());
        editor.commit();
        Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }
    void loadData() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        String savedText = sharedPreferences.getString(SAVED_TEXT, "");
        etText.setText(savedText);
        Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }*/


    }
}
