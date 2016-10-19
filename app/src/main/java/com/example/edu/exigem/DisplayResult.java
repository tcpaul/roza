package com.example.edu.exigem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisplayResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);





    }

    public void testing(){

        View a = findViewById(R.id.imageView);
        a.setVisibility(View.GONE);
        View b = findViewById(R.id.imageButton2);
        b.setVisibility(View.VISIBLE);
    }
}
