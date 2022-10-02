package com.example.androidapp;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        setListAdapter(new MyAdapter(this,
        		android.R.layout.simple_list_item_1,R.id.textView1,getResources().getStringArray(R.array.countries)));
        
       
        		
    }
private class MyAdapter extends ArrayAdapter<String> {

	public MyAdapter(Context context, int resource, int textViewResourceId,
			String[] strings) {
		super(context, resource, textViewResourceId, strings);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View row = inflater.inflate(R.layout.list_item,parent,false);
		String[] items = getResources().getStringArray(R.array.countries);
		
		ImageView iv = (ImageView)row.findViewById(R.id.imageView1);
		TextView tv = (TextView) row.findViewById(R.id.textView1);
		
		tv.setText(items[position]);
		
		if(items[position].equals("US")){
			iv.setImageResource(R.drawable.usa);
		}
		else if(items[position].equals("Brazil")){
			iv.setImageResource(R.drawable.brazil);
		}
		else if(items[position].equals("Russia")){
			iv.setImageResource(R.drawable.russia);
		}
		
		return row;
	}
		
		
		
		
		
		
	}




}


		