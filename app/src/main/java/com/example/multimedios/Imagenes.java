package com.example.multimedios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Imagenes extends AppCompatActivity {

    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenes);

        ImageView imageView = findViewById(R.id.pika);

        final boolean[] invisible = {true};

        Button ver = findViewById(R.id.mostrar);
        ver.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(invisible[0]){
                    imageView.setVisibility(View.INVISIBLE);
                    invisible[0] = false;
                }else{
                    imageView.setVisibility(View.VISIBLE);
                    invisible[0] = true;
                }
            }
        });

        regresar = (Button)findViewById(R.id.regresar);

        regresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i = new Intent(Imagenes.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}