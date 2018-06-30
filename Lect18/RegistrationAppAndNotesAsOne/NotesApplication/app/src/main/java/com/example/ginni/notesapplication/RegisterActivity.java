package com.example.ginni.notesapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText username,password,cnfpassword;
    Button button;
    String user,pwd,cnfpwd;
    Preferences sharedPreferences;
    DataBase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        cnfpassword = findViewById(R.id.cnfPassword);
        button = findViewById(R.id.button);

        sharedPreferences = new Preferences(getApplicationContext());
        database = new DataBase(getApplicationContext());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = username.getText().toString();
                pwd = password.getText().toString();
                cnfpwd = cnfpassword.getText().toString();
                username.setText("");
                password.setText("");
                cnfpassword.setText("");

                if(user.contentEquals("") || pwd.contentEquals("") || cnfpwd.contentEquals("")) {
                    Toast.makeText(getApplicationContext(),"All Fields Needed", Toast.LENGTH_LONG).show();
                    username.setText("");
                    password.setText("");
                    cnfpassword.setText("");
                } else if(!(pwd.contentEquals(cnfpwd))) {
                    Toast.makeText(getApplicationContext(),"Passwords do not match", Toast.LENGTH_LONG).show();
                    username.setText("");
                    password.setText("");
                    cnfpassword.setText("");
                } else {
                    //sharedPreferences.setCredentials(user,pwd);
                    database.addUser(user,pwd);
                    String successRegisterText = "Successfully Registered. Please Login with your credentials";
                    Toast.makeText(getApplicationContext(),successRegisterText,Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                    startActivity(intent);

                }
            }
        });
    }

}
