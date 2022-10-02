package com.umartariq;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ThirdActivity extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button goToSecondActivity = (Button) findViewById(R.id.btngoToSecondFromThirdActivity);
        goToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdActivity.this,SecondActivity.class));
            }
        });

        //IMPLICIT INTENT
        //this will crash for the first time because there is no intent at the start of this activity for getIntent()
        //we click share button in gallery and then it opens the image inside our app
        //so we need to handle this
        ImageView iv = (ImageView) findViewById(R.id.activity3Imageview);
        //iv.setImageURI((Uri) getIntent().getExtras().get(Intent.EXTRA_STREAM));

        iv.setImageResource(R.drawable.baseline_bluetooth_audio_black_18);
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
