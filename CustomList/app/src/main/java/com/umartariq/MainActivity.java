package com.umartariq;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    //extend ListActivity then set the built in ListAdapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setListAdapter(new CustomListAdapter(this,R.layout.custom_list,R.id.countryNameTextView,getResources().getStringArray(R.array.country_data)));

        startActivity(new Intent(MainActivity.this,CustomListActivity.class));
    }
}