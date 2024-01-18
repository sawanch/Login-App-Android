package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView email = (TextView) findViewById(R.id.email_id);
        TextView password = (TextView) findViewById(R.id.password_id);

        MaterialButton logn = (MaterialButton) findViewById(R.id.login_id);

        // email- admin@gmail.com and password - admin

        logn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "FAILED LOGIN!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}