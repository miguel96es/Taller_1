package com.example.taller1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usuario1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario1 = (EditText)findViewById(R.id.usuario1);
    }

    //metodo boton registrate
    public void Registrate (View view){
        Intent registrate = new Intent(this, RegisterActivity.class);
        startActivity(registrate);
    }

    //metodo boton Iniciar sesion
    public void Wellcome (View view){
        Intent wellcome = new Intent(this, WellcomeActivity.class);
        wellcome.putExtra("usuario",usuario1.getText().toString());
        startActivity(wellcome);
    }
}