package com.example.timetable;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override //화면 전환 코드
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button semester1page = (Button)findViewById(R.id.semester1page);
        Button semester2page = (Button)findViewById(R.id.semester2page);
        Button notepage = (Button)findViewById(R.id.notepage);
        Button alarmpage = (Button)findViewById(R.id.alarmpage);

        semester1page.setOnClickListener(new View.OnClickListener() {

            public void onClick(View target) {
                Intent intent = new Intent(getApplicationContext(), semester1.class);
                startActivity(intent);

            }
        });
        semester2page.setOnClickListener(new View.OnClickListener() {
            public void onClick(View target) {
                Intent intent = new Intent(getApplicationContext(), semester2.class);
                startActivity(intent);
            }
        });
        notepage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View target) {
                Intent intent = new Intent(getApplicationContext(), note.class);
                startActivity(intent);
            }
        });
        alarmpage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View target) {
                Intent intent = new Intent(getApplicationContext(), alarm.class);
                startActivity(intent);
            }
        });

    }





}
