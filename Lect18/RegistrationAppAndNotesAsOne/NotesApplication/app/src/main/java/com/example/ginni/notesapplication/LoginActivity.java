package com.example.ginni.notesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button signin,signup;
    EditText username,pwd;
    String name,password;
    DataBase database;
    Preferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        signin = findViewById(R.id.signin);
        signup = findViewById(R.id.signup);
        username = findViewById(R.id.username);
        pwd = findViewById(R.id.password);

        database = new DataBase(getApplicationContext());
        sharedPreferences = new Preferences(getApplicationContext());

        if(sharedPreferences.checkStatus()) {
            Intent intent = new Intent(LoginActivity.this,NotesActivity.class);
            startActivity(intent);
        }

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = username.getText().toString();
                password = pwd.getText().toString();
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = username.getText().toString();
                password = pwd.getText().toString();

                if(database.checkUser(name)) {
                    if(sharedPreferences.getPassword().contentEquals(password)) {
                        sharedPreferences.changeStatus(true);
                        Intent intent = new Intent(LoginActivity.this,NotesActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        username.setText("");
                        pwd.setText("");
                        Toast.makeText(getApplicationContext(),"Incorrect Passowrd",Toast.LENGTH_LONG).show();
                    }
                } else {
                    String notUserString = "You have yet not registered. Register Now";
                    Toast.makeText(getApplicationContext(),notUserString,Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                    startActivity(intent);
                }
            }
        });



    }
}
