package com.example.progress;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        	final ProgressDialog pd = new ProgressDialog(this);
        	pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        	pd.setMessage("Just Wait..");
        	//ongoing .. not any detailed percentage feedback counter
        	pd.setIndeterminate(false);
        	pd.setCancelable(true);
        	
        	
        	Button b = (Button) findViewById(R.id.button1);
        	b.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				pd.show();	
				pd.setProgress(50);
				}
			});
        
    }
}
