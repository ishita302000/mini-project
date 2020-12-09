package com.example.attendence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class loginteacher extends AppCompatActivity {

    private TextView sigup_t;
    private TextView phn;
    private TextView forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginteacher);

        sigup_t = findViewById(R.id.slogan_name_teacher);
        phn= findViewById(R.id.phnno_log_tea);
        forgot = findViewById(R.id.forgot_teacher);
        sigup_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(loginteacher.this , signupteacher.class);
                startActivity(i);

            }
        });

        phn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginteacher.this , phn_teacher.class);
                startActivity(i);
            }
        });
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginteacher.this , forget_teacher.class);
                startActivity(i);

            }
        });
    }
}