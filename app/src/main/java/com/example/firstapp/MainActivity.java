package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber1;
    EditText editTextNumber2;
    Spinner spinner;



    Button btn;
    TextView textResult;

    //r es una clase que nunca se debe tocar, aca es donde android guarda en posicioens de memoria las variables
    //la primero que pasa cuando se ejecuta o abre una activiad es este metodo es este on create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //indica la actividad que se va mostrar
        setContentView(R.layout.activity_main);

        //enlazar los componentes
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        spinner = findViewById(R.id.sipnaso);
        btn = findViewById(R.id.btn);

        List<String> opciones = new ArrayList<>();
        opciones.add("suma");
        opciones.add("resta");
        opciones.add("mult");

        //creando un adaptador de string
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,opciones);

        spinner.setAdapter(adapter);

        //otra forma de agregar acciones a los botones
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operar();
            }
        };

        textResult = findViewById(R.id.textViewResultado);


    }

    //de esta manera se pude ejecutar gracias a que acepta un parametro view

    public void operar(){
        String cad ="";
        


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