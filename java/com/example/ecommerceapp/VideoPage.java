package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_page);
        Uri uri = Uri.parse("https://youtu.be/oC-HtQiOKtE");
        VideoView v = (VideoView) findViewById(R.id.videoView);
        v.setVideoURI(uri);
        v.start();
    }
}