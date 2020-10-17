package com.example.firstapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.firstapp.R;

public class WelcomeActivity extends AppCompatActivity {

    Button button;
    Button buttonGoWebA;
    TextView textView;
    EditText editTextViewPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        button = findViewById(R.id.buttonOut);
        buttonGoWebA = findViewById(R.id.buttonFindWebPage);
        textView = findViewById(R.id.textViewWelcome);
        editTextViewPage = findViewById(R.id.editTextPageWeb);


        textView.setText(("hola: " + getIntent().getExtras().getString("userName")));
        loadLastPage();


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        };


        View.OnClickListener listerGoWeb = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                savePage();
                showActivityWeb();


            }
        };

        buttonGoWebA.setOnClickListener(listerGoWeb);
        button.setOnClickListener(listener);
    }

    void showActivityWeb(){

        Intent i = new Intent(this,WebActivity.class);
        String direc = editTextViewPage.getText().toString();
        i.putExtra("webName",("https://"+direc));
        startActivity(i);

    }

    //usando shared preferencias para guarddar datos
    //context.MODE_PRIVATE es que solo esta app peude acceder a ese fichero
    void savePage(){

        SharedPreferences preferences = getSharedPreferences("datos",
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("lastPage",("https://"+editTextViewPage.getText().toString()));
        editor.commit();


    }

    void loadLastPage(){
        SharedPreferences preferences = getSharedPreferences("datos",
                Context.MODE_PRIVATE);
        editTextViewPage.setText(preferences.getString("lastPage",""));
    }


}