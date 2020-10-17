package com.example.firstapp.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.firstapp.AboutActivity;
import com.example.firstapp.R;

public class LoginActivity extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.user = findViewById(R.id.editTextUser);
        this.pass = findViewById(R.id.ediTextPass);
        this.button = findViewById(R.id.buttonLogin);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!log(user.getText().toString(), pass.getText().toString())){

                    Toast.makeText(LoginActivity.this, "Credenciales erroneas", Toast.LENGTH_SHORT).show();
                    return;
                }

                showAboutActivity();



            }
        };

        button.setOnClickListener(listener);



    }

    public boolean log(String user, String pass){

        if(user.length()==0 || pass.length() == 0){
            return  false;
        }

        return user.equals("admin") && pass.equals("123");

    }

    private void showAboutActivity(){

        //mostrar una segunda actividad se usan intent
        Intent i = new Intent(this, WelcomeActivity.class);
        //se muestra la segunda actividad
        startActivity(i);

    }

}