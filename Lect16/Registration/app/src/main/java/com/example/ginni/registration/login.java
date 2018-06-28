package com.example.ginni.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class login extends AppCompatActivity {

    EditText userEnter,pwdEnter;
    Button button;
    static HashMap<String,String> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEnter = (EditText) findViewById(R.id.username);
        pwdEnter = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);

        Intent prevIntent = getIntent();
        String username = prevIntent.getStringExtra("username");
        String password = prevIntent.getStringExtra("password");

        map.put(username,password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user,pwd;
                user = userEnter.getText().toString();
                pwd = pwdEnter.getText().toString();


                if(map.containsKey(user)) {
                    if(map.get(user).contentEquals(pwd)) {
                        Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(getApplicationContext(), "Login Unsucceesfull", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Login Unsucceesfull", Toast.LENGTH_LONG).show();
                }
                userEnter.setText("");
                pwdEnter.setText("");

            }
        });

    }
}
