package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton logn;

    public static final String EXTRA_EMAIL = "com.example.mylogin.EXTRA_EMAIL";
    public static final String EXTRA_PASSWORD = "com.example.mylogin.EXTRA_PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView email = (TextView) findViewById(R.id.email_id);
        TextView password = (TextView) findViewById(R.id.password_id);

         logn = (MaterialButton) findViewById(R.id.login_id);

        // email- admin and password - password

        logn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("admin") && password.getText().toString().equals("password")) {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    openActivityHome();
                } else {
                    Toast.makeText(MainActivity.this, "FAILED LOGIN!!!", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    public void openActivityHome(){

        EditText editText1 = (EditText) findViewById(R.id.email_id);

        String email = editText1.getText().toString();


        EditText editText2 = (EditText) findViewById(R.id.password_id);

        String password = editText2.getText().toString();


        Intent intent = new Intent(this, Home.class);

        intent.putExtra(EXTRA_EMAIL,email);
        intent.putExtra(EXTRA_PASSWORD,password);

        startActivity(intent);

    }
}