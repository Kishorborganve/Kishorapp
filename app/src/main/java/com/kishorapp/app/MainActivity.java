package com.kishorapp.app;

import android.content.Intent;
import android.os.Bundle;
//import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username;
        username = findViewById(R.id.username);
        TextView password;
        password = findViewById(R.id.password);

        MaterialButton loginbtn;
        loginbtn = findViewById(R.id.loginbtn);


        // username  is kishorAB and pwd is kishorAB

        loginbtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            if (username.getText().toString().equals("kishorAB") && password.getText().toString().equals("kishorAB")) {
                                                //correct
                                                Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                                                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                                MainActivity.this.startActivity(intent);
                                                MainActivity.this.finish();
                                            } else
                                                //incorrect
                                                Toast.makeText(MainActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
                                        }} );
    }}