package com.example.alcphase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;

public class Activity3 extends AppCompatActivity {
    private static final String TAG = "Activity3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Log.d(TAG, "onCreate: started.");
        ImageView profile = (ImageView) findViewById(R.id.profile);

        int imageResource = getResources().getIdentifier("@drawable/profile", null, this.getPackageName());
        profile.setImageResource(imageResource);



    }
}
