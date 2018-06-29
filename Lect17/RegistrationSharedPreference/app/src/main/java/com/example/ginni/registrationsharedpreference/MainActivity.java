package com.example.ginni.registrationsharedpreference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password,cnfpassword;
    Button button;
    String user,pwd,cnfpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        cnfpassword = (EditText) findViewById(R.id.cnfPassword);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = username.getText().toString();
                pwd = password.getText().toString();
                cnfpwd = cnfpassword.getText().toString();
                username.setText("");
                password.setText("");
                cnfpassword.setText("");

                SharedPreferences sharedPreferences = MainActivity.this.getSharedPreferences("prefs", Context.MODE_PRIVATE);

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
                    sharedPreferences.edit().putString(user,pwd).commit();
                    Intent intent = new Intent(MainActivity.this,login.class);
                    startActivity(intent);
                }
            }
        });
    }
}
