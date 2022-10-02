package com.umartariq;

import android.app.ListActivity;
import android.os.Bundle;
import androidx.annotation.Nullable;

public class CustomListActivity extends ListActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new CustomListAdapter(getApplicationContext(), R.layout.custom_list, R.id.countryNameTextView,getResources().getStringArray(R.array.countries_textdata)));

    }
}
