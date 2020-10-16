package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        button = findViewById(R.id.buttonBackGoMain);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //terminar una activity
                finish();
            }
        };

        button.setOnClickListener(listener);
    }
}