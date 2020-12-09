package com.example.attendence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginstudent extends AppCompatActivity {
     private TextView signup_s;
     private  TextView phn;
     private Button forgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginstudent);

        phn = findViewById(R.id.phnno_log_student);
        signup_s = findViewById(R.id.slogan_name_student);
        forgot = findViewById(R.id.forgot_student);
        signup_s.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginstudent.this , signupstudent.class);
                startActivity(i);
                finish();

            }
        });

        phn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginstudent.this , phn_student.class);
                startActivity(i);
            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(loginstudent.this, forget_teacher.class);
                startActivity(i);
            }
        });
    }
}