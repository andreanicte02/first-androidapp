package com.example.firstapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.firstapp.R;

public class WelcomeActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        button = findViewById(R.id.buttonOut);
        textView = findViewById(R.id.textViewWelcome);


        textView.setText(("hola: " + getIntent().getExtras().getString("userName")));

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        };

        button.setOnClickListener(listener);
    }
}