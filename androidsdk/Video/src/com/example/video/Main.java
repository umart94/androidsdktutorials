package com.example.video;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        VideoView v = (VideoView) findViewById(R.id.videoView1);
        v.setVideoPath("/sdcard/abcd.mp4");
        v.setMediaController(new MediaController(this));
        v.start();
        v.requestFocus();
    }
}
