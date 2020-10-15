package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber1;
    EditText editTextNumber2;
    CheckBox r1;
    CheckBox r2;
    CheckBox r3;




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

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);


    }

    //de esta manera se pude ejecutar gracias a que acepta un parametro view

    public void operar(View v){
        String cad ="";
        if(r1.isChecked()){
            cad+=sumar();

        }

        if(r2.isChecked()){
            cad+=restar();

        }

        if(r3.isChecked()){
            cad+=mult();

        }
        textResult.setText(cad);


    }

    private String sumar(){

        int numero1 = Integer.parseInt(editTextNumber1.getText().toString());
        int numero2 = Integer.parseInt(editTextNumber2.getText().toString());

        return numero1+numero2 + "\n";

    }

    private String restar(){

        int numero1 = Integer.parseInt(editTextNumber1.getText().toString());
        int numero2 = Integer.parseInt(editTextNumber2.getText().toString());

        return numero1-numero2 + "\n";

    }

    private String mult(){

        int numero1 = Integer.parseInt(editTextNumber1.getText().toString());
        int numero2 = Integer.parseInt(editTextNumber2.getText().toString());

        return numero1*numero2 + "\n";

    }

    private void div(){

        int numero1 = Integer.parseInt(editTextNumber1.getText().toString());
        int numero2 = Integer.parseInt(editTextNumber2.getText().toString());

        textResult.setText( numero1/numero2 + "");

    }



}