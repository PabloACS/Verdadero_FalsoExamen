package com.example.familia.verdadero_falso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button empezar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        empezar=(Button)findViewById(R.id.button1);
        empezar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button1:
                Intent abrir1 = new Intent(MainActivity.this, Pregunta1.class);
                startActivity(abrir1);
    }
}
}
