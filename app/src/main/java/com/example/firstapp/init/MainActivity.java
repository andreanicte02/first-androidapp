package com.example.firstapp.init;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstapp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    TextView textResult;
    ListView listView;
    Button buttonAbout;

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
        buttonAbout = findViewById(R.id.buttonShowAbout);


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
                
                Toast.makeText(MainActivity.this, opciones.get(position), Toast.LENGTH_SHORT).show();
            }
        };

        View.OnClickListener buttonAboutListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAboutActivity();
            }
        };

        buttonAbout.setOnClickListener(buttonAboutListener);
        listView.setOnItemClickListener(itemClikc);



    }

    private void showAboutActivity(){

        //mostrar una segunda actividad se usan intent
        Intent i = new Intent(this, AboutActivity.class);
        //se muestra la segunda actividad
        startActivity(i);

    }




}