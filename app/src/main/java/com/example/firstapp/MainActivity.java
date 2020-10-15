package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber1;
    EditText editTextNumber2;

    Button btn;
    TextView textResult;

    //la primero que pasa cuando se ejecuta o abre una activiad es este metodo es este on create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);

        btn = findViewById(R.id.btn);
        textResult = findViewById(R.id.textViewResultado);
    }

    //de esta manera se pude ejecutar
    public void sumar(View v){

        int numero1 = Integer.parseInt(editTextNumber1.getText().toString());
        int numero2 = Integer.parseInt(editTextNumber2.getText().toString());

        textResult.setText( numero1+numero2 + "");

    }
}