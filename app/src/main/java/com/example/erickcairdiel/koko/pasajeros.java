package com.example.erickcairdiel.koko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pasajeros extends AppCompatActivity {

    Button P1;
    Button P2;
    Button P3;
    Button P4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasajeros);

        P1 = findViewById(R.id.btn_pasajero1);
        P1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent P1 = new Intent(pasajeros.this,perfilEstudiante.class);
                startActivity(P1);

            }
        });

        P2 = findViewById(R.id.btn_pasajero2);
        P2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent P2 = new Intent(pasajeros.this,perfilEstudiante.class);
                startActivity(P2);

            }
        });

        P3 = findViewById(R.id.btn_pasajero3);
        P3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent P3 = new Intent(pasajeros.this,perfilEstudiante.class);
                startActivity(P3);

            }
        });

        P4 = findViewById(R.id.btn_pasajero4);
        P4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent P4 = new Intent(pasajeros.this,perfilEstudiante.class);
                startActivity(P4);

            }
        });
    }
}
