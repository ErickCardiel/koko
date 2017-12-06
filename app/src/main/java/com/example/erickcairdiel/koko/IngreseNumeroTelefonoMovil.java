package com.example.erickcairdiel.koko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IngreseNumeroTelefonoMovil extends AppCompatActivity
{
    Usuario usuario;
    EditText editText;
    Button continuar;
   //EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        usuario = (Usuario)getApplication();
        setContentView(R.layout.activity_ingrese_numero_telefono_movil);

        editText = (EditText)findViewById(R.id.INumero);
        continuar = findViewById(R.id.btn_continuar);
        continuar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(editText.getText()!=null)
                {
                    usuario.telefono = editText.getText().toString();
                    Intent continuar = new Intent(IngreseNumeroTelefonoMovil.this, CodigoDeVerificacion.class);
                    startActivity(continuar);
                }
            }
        });

/*
        editText2 = (EditText)findViewById(R.id.INumero);
        continuar = findViewById(R.id.btn_continuar);
        continuar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(TextUtils.isEmpty(editText2.getText())==false&&(((editText2.getText().toString())==usuario.telefono)))
                {
                    usuario.telefono = editText2.getText().toString();
                    Intent continuar = new Intent(IngreseNumeroTelefonoMovil.this, contrasena.class);
                    startActivity(continuar);
                }
            }
        });
        */

    }
}
