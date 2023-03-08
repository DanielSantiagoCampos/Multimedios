package com.example.multimedios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Texto extends AppCompatActivity {

    Button regresar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto);

        regresar3 = (Button)findViewById(R.id.regresar3);

        regresar3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i = new Intent(Texto.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}