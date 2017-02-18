package com.example.student.db021803;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp = getSharedPreferences("MYDATA", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("username", "Bob");
        editor.commit();
    }
}
