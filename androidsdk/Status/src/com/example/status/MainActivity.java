package com.example.status;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Toast toast = Toast.makeText(MainActivity.this, "This is some toast", 5000);
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.show();
			}
		});
        /*Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
				@SuppressWarnings("deprecation")
				Notification notify = new Notification(android.R.drawable.stat_notify_more,
						"This is important",System.currentTimeMillis());
			Context context = MainActivity.this;
			CharSequence title = "You Have Been Notified";
			CharSequence details = "Continue with what you were doing";
			Intent intent = new Intent(context, MainActivity.class);
			PendingIntent pending = PendingIntent.getActivity(context,0,intent,0);
			notify.setLatestEventInfo(context, title, details, pending);
			notify.sound = Uri.parse("android.resource://com.example.status/" + R.raw.beep);
			
			nm.notify(0, notify);
			
			
			
			
			}
		});*/
    }
}
