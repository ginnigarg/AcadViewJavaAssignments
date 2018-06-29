package com.example.ginni.registrationsharedpreference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class login extends AppCompatActivity {

    EditText userEnter,pwdEnter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEnter = (EditText) findViewById(R.id.username);
        pwdEnter = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);

        final SharedPreferences prefs = getSharedPreferences("prefs", Context.MODE_PRIVATE);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user,pwd;
                user = userEnter.getText().toString();
                pwd = pwdEnter.getText().toString();

                //Log.d("User" ,prefs.contains(user));
                Log.i("UserName",prefs.getString(user,""));

                if(prefs.contains(user)) {
                    if(prefs.getString(user,"").contentEquals(pwd)) {
                        Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(login.this,loginSuccess.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), "Login Unsucceesfull", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Login Unsuccessfull", Toast.LENGTH_LONG).show();
                }
                userEnter.setText("");
                pwdEnter.setText("");
            }
        });
    }
}
