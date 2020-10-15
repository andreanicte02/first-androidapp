package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber1;
    EditText editTextNumber2;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;



    Button btn;
    TextView textResult;

    //la primero que pasa cuando se ejecuta o abre una activiad es este metodo es este on create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //indica la actividad que se va mostrar
        setContentView(R.layout.activity_main);

        //enlazar los componentes
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);

        //r es una clase que nunca se debe tocar, aca es donde android guarda en posicioens de memoria las variables
        btn = findViewById(R.id.btn);
        textResult = findViewById(R.id.textViewResultado);

        r1 = findViewById(R.id.radioButton);
        r2 = findViewById(R.id.radioButton2);
        r3 = findViewById(R.id.radioButton3);
        r4 = findViewById(R.id.radioButton4);

    }

    //de esta manera se pude ejecutar gracias a que acepta un parametro view

    public void operar(View v){
        if(r1.isChecked()){
            sumar();
            return;
        }

        if(r2.isChecked()){
            restar();
            return;
        }

        if(r3.isChecked()){
            mult();
            return;
        }

        if(r4.isChecked()){
            div();
            return;
        }
    }

    private void sumar(){

        int numero1 = Integer.parseInt(editTextNumber1.getText().toString());
        int numero2 = Integer.parseInt(editTextNumber2.getText().toString());

        textResult.setText( numero1+numero2 + "");

    }

    private void restar(){

        int numero1 = Integer.parseInt(editTextNumber1.getText().toString());
        int numero2 = Integer.parseInt(editTextNumber2.getText().toString());

        textResult.setText( numero1-numero2 + "");

    }

    private void mult(){

        int numero1 = Integer.parseInt(editTextNumber1.getText().toString());
        int numero2 = Integer.parseInt(editTextNumber2.getText().toString());

        textResult.setText( numero1*numero2 + "");

    }

    private void div(){

        int numero1 = Integer.parseInt(editTextNumber1.getText().toString());
        int numero2 = Integer.parseInt(editTextNumber2.getText().toString());

        textResult.setText( numero1/numero2 + "");

    }



}