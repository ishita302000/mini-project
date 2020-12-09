package com.example.attendence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView teacherimage;
    private ImageView studentimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          teacherimage = findViewById(R.id.teacherImage);
          studentimage = findViewById(R.id.childrenImage);
        studentimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , loginstudent.class);
                startActivity(i);
                finish();

            }
        });
        teacherimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this , loginteacher.class);
                startActivity(i);
                finish();
            }
        });
    }
}