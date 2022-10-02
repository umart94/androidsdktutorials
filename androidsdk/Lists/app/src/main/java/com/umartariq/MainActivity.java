package com.umartariq;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MainActivity extends ListActivity {

    Context mContext;

    //extend ListActivity then set the built in ListAdapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.country_data)));
*/

        setListAdapter(new CustomListAdapter(this,R.layout.custom_list,R.id.countryNameTextView,getResources().getStringArray(R.array.country_data)));



       /* ListView listView = getListView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                startActivity(new Intent(MainActivity.this,CustomListActivity.class));
            }
        });

*/

    }




}