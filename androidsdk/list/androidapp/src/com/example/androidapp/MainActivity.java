package com.example.androidapp;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setListAdapter(new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.countries)));
        
        
        
        
        	
		
    }
}

   