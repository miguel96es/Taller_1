package com.example.taller1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ValidationActivity extends AppCompatActivity {

    private TextView ce1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);

        ce1 = (TextView)findViewById(R.id.ce1);

        String correaco2 = getIntent().getStringExtra("correaco");
        ce1.setText("Se te ha enviado un correo de validación a " + correaco2);

    }

    //metodo boton login
    public void Login (View view){
        Intent login = new Intent(this, MainActivity.class);
        startActivity(login);
    }
}