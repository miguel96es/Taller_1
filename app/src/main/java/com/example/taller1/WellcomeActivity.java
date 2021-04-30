package com.example.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WellcomeActivity extends AppCompatActivity {

    private TextView bienv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);

        bienv = (TextView)findViewById(R.id.bienv);

        String user = getIntent().getStringExtra("usuario");
        bienv.setText("Bienvenido " + user);
    }
}