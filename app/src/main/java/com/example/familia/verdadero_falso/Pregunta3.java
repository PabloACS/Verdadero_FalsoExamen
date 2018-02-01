package com.example.familia.verdadero_falso;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pregunta3 extends AppCompatActivity implements View.OnClickListener{
    Button verdadero, falso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
        verdadero=(Button)findViewById(R.id.button3);
        verdadero.setOnClickListener(this);
        falso=(Button)findViewById(R.id.button2);
        falso.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button3:

                final AlertDialog.Builder myBuild = new AlertDialog.Builder(this);
                myBuild.setMessage("Lo has conseguido");
                myBuild.setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent abrir1 = new Intent(Pregunta3.this, Pregunta4.class);
                        startActivity(abrir1);
                    }
                });
                AlertDialog dialog = myBuild.create();
                dialog.show();

            case R.id.button2:

                final AlertDialog.Builder myBuild2 = new AlertDialog.Builder(this);
                myBuild2.setMessage("Te has equivocado");
                myBuild2.setPositiveButton("Volver a Intentar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog dialog1 = myBuild2.create();
                dialog1.show();
        }


    }


        }

