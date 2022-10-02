package com.example.androidapp;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	
	private EditText et;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        et = (EditText) findViewById(R.id.editText1);
        SharedPreferences settings = getSharedPreferences("MYPREFS", 0);
        et.setText(settings.getString("tvalue",""));
       
        
        
        
        
        	
        		
        		
        	

		
   
    
}
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	
    	SharedPreferences settings = getSharedPreferences("MYPREFS",0);
    	SharedPreferences.Editor editor = settings.edit();
    	editor.putString("tvalue", et.getText().toString() );
    	editor.commit();
    	
    	super.onStop();
    }
}