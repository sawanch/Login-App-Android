package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();

        String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);

        String password = intent.getStringExtra(MainActivity.EXTRA_PASSWORD);

        TextView textView1 = (TextView) findViewById(R.id.textView1);

        TextView textView2 =(TextView)  findViewById(R.id.textView2);

        textView1.setText(email);

        textView2.setText(password);


    }
}