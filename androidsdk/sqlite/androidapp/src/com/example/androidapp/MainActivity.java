package com.example.androidapp;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	
	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //check karo DDMS me data me com.example.androidapp me databases
        //folder me MyDB ke name se database stored hoga
        SQLiteDatabase db = openOrCreateDatabase("MyDB", MODE_PRIVATE,null);
        
        
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        boolean first = settings.getBoolean("first", false);
        //retrieve data from database db.rawquery returns cursor object which we can iterate over
        Cursor c = db.rawQuery("SELECT * FROM MyTable", null);
        c.moveToFirst();//firstname ko select karne ke liay
        Log.d("MIYAOWWN:D",c.getString(c.getColumnIndex("FirstName")));
       
        db.execSQL("CREATE TABLE IF NOT EXISTS MyTable (LastName VARCHAR, FirstName VARCHAR, Age INT(3));");
       db.execSQL("INSERT INTO MyTable VALUES ('Brilliant','Lee',37);");
       db.close();
        
       
        
        
        
        	
        		
        		
        	

		
   
    
}
    
   
}