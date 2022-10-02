package com.umartariq;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;

public class CustomListActivity extends ListActivity {

    //https://stackoverflow.com/questions/6788013/android-string-array-with-all-countries-in-different-languages
    // dir /b > filenames. txt
    private Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;

        setListAdapter(new CustomListAdapter(this,R.layout.custom_list,R.id.countryNameTextView,getResources().getStringArray(R.array.country_data)));

    }
}
