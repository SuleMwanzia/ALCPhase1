package com.example.alcphase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button_1);
        btn2= (Button) findViewById(R.id.button_2);

        //set listener button_1
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AUTO GENERATED METHOD
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });

        //set listener button_2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //auto generated method
                Intent i = new Intent(MainActivity.this,Activity3.class);
                startActivity(i);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
}
