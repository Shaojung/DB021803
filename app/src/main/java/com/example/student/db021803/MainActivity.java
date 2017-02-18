package com.example.student.db021803;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void clickSave(View v)
    {
        SharedPreferences sp = getSharedPreferences("MYDATA", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        ed = (EditText) findViewById(R.id.editText);
        String s = ed.getText().toString();
        editor.putString("username", s);
        editor.commit();
    }

    public void clickLoad(View v)
    {
        SharedPreferences sp = getSharedPreferences("MYDATA", MODE_PRIVATE);
        String u = sp.getString("username", "UserName");
        tv = (TextView) findViewById(R.id.textView2);
        tv.setText(u);
    }
}
