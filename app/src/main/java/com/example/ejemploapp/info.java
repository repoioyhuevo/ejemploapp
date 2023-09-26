package com.example.ejemploapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Button btnN = findViewById(R.id.btnpublicar);

        // Configura el OnClickListener para el botón
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la segunda Activity
                Intent intent = new Intent(info.this, principal.class);

                // Inicia la segunda Activity
                startActivity(intent);
            }
        });
        Button btnV = findViewById(R.id.btnVolver);

        // Configura el OnClickListener para el botón
        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la segunda Activity
                Intent intent = new Intent(info.this, principal.class);

                // Inicia la segunda Activity
                startActivity(intent);
            }
        });
    }
}