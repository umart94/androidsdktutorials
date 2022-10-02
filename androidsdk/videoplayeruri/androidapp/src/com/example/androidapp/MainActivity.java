package com.example.androidapp;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.VideoView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final VideoView b = (VideoView) findViewById(R.id.videoView1);
        //b.setVideoPath("/sdcard/the.mp4");
        Uri uri = Uri.parse(Environment.getExternalStorageDirectory().getPath()+ "/the.mp4");
        //b.setVideoPath(Environment.getExternalStorageDirectory().getPath()+"/the.mp4");
        b.setVideoURI(uri);
       // b.setMediaController(new MediaController(this));
       // b.requestFocus();
        b.start();
        
        
        	
        		
        		
        	

		
   
    
}
}