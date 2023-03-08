package com.example.multimedios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button siguiente;
    Button videos;
    Button audio;
    Button texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        siguiente = (Button)findViewById(R.id.ventana2);

        siguiente.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, Imagenes.class);
                startActivity(i);
            }
        });

        videos = (Button)findViewById(R.id.ventana3);

        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Videos.class);
                startActivity(i);
            }
        });

        texto = (Button)findViewById(R.id.ventana5);

        texto.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, Texto.class);
                startActivity(i);
            }
        });

        audio = (Button)findViewById(R.id.ventana4);

        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Audios.class);
                startActivity(i);
            }
        });
    }
}