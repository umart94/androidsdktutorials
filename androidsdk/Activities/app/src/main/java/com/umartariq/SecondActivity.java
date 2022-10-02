package com.umartariq;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

public class SecondActivity extends AppCompatActivity {





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button chromecustomtabBtn2 = (Button) findViewById(R.id.chromeCustomTabBtn2);
        chromecustomtabBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/";
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.launchUrl(v.getContext(), Uri.parse(url));
            }
        });

        Button goToThirdActivity = (Button) findViewById(R.id.btngoToThirdActivity);
        goToThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
            }
        });

        //Explicit intent , extra text returned from first activity
        //TextView textviewinsecondactivity = (TextView) findViewById(R.id.secondactivityurrentCycle);
        //textviewinsecondactivity.setText(getIntent().getExtras().getString("theTextSent"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // R.menu.mymenu is a reference to an xml file named mymenu.xml which should be inside your res/menu directory.
        // If you don't have res/menu, just create a directory named "menu" inside res
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_bluetoothon){

        }

        if(id == R.id.action_bluetoothoff){

        }

        if(id == R.id.action_wifion){

        }

        if(id == R.id.action_wifioff){

        }


        return super.onOptionsItemSelected(item);
    }






}
