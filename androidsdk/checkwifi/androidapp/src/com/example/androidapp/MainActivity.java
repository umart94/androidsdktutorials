package com.example.androidapp;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        	
  ConnectivityManager conman = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    TextView tv = (TextView) findViewById(R.id.textView1);
    boolean wifi = conman.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnectedOrConnecting();
    if(wifi){
    	tv.setText("This wifi is on");
    	
    }
    else {
    	tv.setText("The wifi is off");
    }
    }

}
   