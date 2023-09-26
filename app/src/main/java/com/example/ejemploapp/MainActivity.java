package com.example.ejemploapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class    MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnS = findViewById(R.id.BtnSeguir);

        // Configura el OnClickListener para el botón
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para abrir la segunda Activity
                Intent intent = new Intent(MainActivity.this, principal.class);

                // Inicia la segunda Activity
                startActivity(intent);
            }
        });
    }
}





