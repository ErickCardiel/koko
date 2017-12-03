package com.example.erickcairdiel.koko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class perfilConductor extends AppCompatActivity {

    Usuario usuario;
    TextView nombre,correo,edad,marca,modelo,anio;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_conductor);

        usuario = (Usuario)getApplication();

        nombre = findViewById(R.id.cNombre);
        nombre.setText(usuario.nombre);

        correo = findViewById(R.id.cCorreo);
        nombre.setText(usuario.correo);

        edad = findViewById(R.id.cEdad);
        edad.setText(String.valueOf(usuario.edad));

        marca = findViewById(R.id.cMarca);
        marca.setText(usuario.conductor.automovil.marca);

        modelo = findViewById(R.id.cModelo);
        modelo.setText(usuario.conductor.automovil.modelo);

        anio = findViewById(R.id.cAnio);
        anio.setText(String.valueOf(usuario.conductor.automovil.anio));
    }
}