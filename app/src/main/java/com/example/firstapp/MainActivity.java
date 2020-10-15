package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    TextView textResult;
    ListView listView;

    //r es una clase que nunca se debe tocar, aca es donde android guarda en posicioens de memoria las variables
    //la primero que pasa cuando se ejecuta o abre una activiad es este metodo es este on create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //indica la actividad que se va mostrar
        setContentView(R.layout.activity_main);

        //enlazar los componentes
        textResult = findViewById(R.id.textResult);
        listView = findViewById(R.id.listView);


        List<String> opciones = new ArrayList<>();
        opciones.add("id1");
        opciones.add("id2");
        opciones.add("id2");
        opciones.add("id3");
        opciones.add("id4");
        opciones.add("id5");
        opciones.add("id6");
        opciones.add("id7");
        opciones.add("id8");

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,opciones);

        listView.setAdapter(adapter);

        //on click de un item en un listview
        AdapterView.OnItemClickListener itemClikc = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textResult.setText(opciones.get(position) + "hola");
            }
        };

        listView.setOnItemClickListener(itemClikc);





    }




}