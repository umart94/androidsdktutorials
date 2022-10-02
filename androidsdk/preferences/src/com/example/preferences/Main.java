package com.example.preferences;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        
		//TRY THIS CODE WITHOUT this statement boolean first
		//also experiment with boolean second boolean third and set values to true or false
		
		boolean first = settings.getBoolean("first", false);
        
        
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Main.this,Preferences.class);
				startActivity(intent);
			}
		});
    }
}
