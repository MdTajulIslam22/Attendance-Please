package com.example.finaltrytodothis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void attendacePage(View view){
        Intent attendancePage = new Intent(MainActivity.this, Attendance.class);
        startActivity(attendancePage);

    }

    public void about(View view){
        Intent DeveloperAbout = new Intent(MainActivity.this, about.class);
        startActivity(DeveloperAbout);

    }
}