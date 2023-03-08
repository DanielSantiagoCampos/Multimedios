package com.example.multimedios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videos extends AppCompatActivity {

    Button regresar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        VideoView video = findViewById(R.id.videocat);

        String videop = "android.resource://"+ getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videop);
        video.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);

        regresar2 = (Button)findViewById(R.id.regresar2);

        regresar2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i = new Intent(Videos.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}