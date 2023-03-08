package com.example.multimedios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Audios extends AppCompatActivity {

    MediaPlayer mp;
    Button sound;
    Button regresar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audios);

        sound = (Button)findViewById(R.id.sound);
        mp = MediaPlayer.create(this, R.raw.dbgt);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        regresar4 = (Button)findViewById(R.id.regresar4);

        regresar4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i = new Intent(Audios.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}