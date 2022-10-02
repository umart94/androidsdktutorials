package com.example.androidapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        	ImageView iv = (ImageView) findViewById(R.id.imageView1);
        	iv.setImageURI((Uri) getIntent().getExtras().get(Intent.EXTRA_STREAM));
        	
  
    
    }

}
   