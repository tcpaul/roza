package com.example.edu.exigem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        Bundle b = getIntent().getExtras();
        int value = -1; // or other values
        if(b != null)
            value = b.getInt("key");


    }
}
