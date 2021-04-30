package com.example.taller1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = (EditText) findViewById(R.id.email);

    }

    //metodo boton login
    public void Login (View view){
        Intent login = new Intent(this, MainActivity.class);
        startActivity(login);
    }

    //metodo boton validar
    public void Validar (View view){
        Intent validar = new Intent(this, ValidationActivity.class);
        validar.putExtra("correaco",email.getText().toString());
        startActivity(validar);
    }
}