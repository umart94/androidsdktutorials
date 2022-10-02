package com.example.sqlite;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    SQLiteDatabase db = openOrCreateDatabase("MyDB", MODE_PRIVATE, null);
    //db.execSQL("CREATE TABLE IF NOT EXISTS MyTable (LastName VARCHAR, FirstName VARCHAR, Age INT(3));");
   // db.execSQL("INSERT INTO MyTable VALUES ('Tariq','Umar',20);");
        Cursor c = db.rawQuery("SELECT * FROM MyTable",null);
        c.moveToFirst();
        Log.d("LEE",c.getString(c.getColumnIndex("FirstName")));
    db.close();
    
    
    }
}
