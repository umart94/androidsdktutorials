package com.example.locandmaps;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

public class MainActivity extends Activity {
	private GoogleMap googleMap;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	try {
		initializemap();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	}
	private void initializemap(){
		if(googleMap == null){
			googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
			
			
			if(googleMap == null){
				Toast.makeText(getApplicationContext(),"Sorry unable to create maps",Toast.LENGTH_SHORT).show();
				
			}
		}
	}

protected void onResume(){
	super.onResume();
	initializemap();
}

}


