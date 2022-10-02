package com.umartariq;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.browser.customtabs.CustomTabsIntent;


//Android App Runs On Linux - and Uses Dalvik Virtual Machine
//Integrated Browser Based On WebKit Engine
//OpenGL ES

//Android app runs in its own sandbox and Linux process
//Applications consist of Components , Manifest File , And Resources



/************************************** ANDROID COMPONENTS******************************************/
/*

-------------ACTIVITIES----------------------------
Activity is a single screen
//when a new activity starts , the older is pushed onto the back stack.

----------SERVICES---------------------------------
//Android Services perform long running operations in the background
//Does not contain a user interface
//useful for things like network operations , playing music, etc.
//AN ANDROID SERVICE RUNS INDEPENDENTLY OF THE COMPONENT THAT CREATED IT
//if you close an android activity, the service will still be running
//services can be bound to by other application components

---------------CONTENT PROVIDERS--------------------
used To store and retrieve data and make it accessible to all applications
are the only way to share data across applications
exposes a public URI that uniquely identifies as its data set
Data is exposed as a simple table on a database model
providers in android are : e.g. contacts , media etc.


---------------BROADCAST RECEIVERS --------------------------
A component that responds to system-wide broadcast announcements
Examples include when the screen turns off , the battery is low etc.
Broadcast receivers contain no USER INTERFACE
they can create status bar notifications to alert the user


-------------ANDROID MANIFEST FILE ------------------
AndroidManifest.xml
purpose is to give android system information about your application
describes components, and lists the permissions required to run your application

before you install an app.. the user needs to allow permissions to the app to run it
declares mintargets and maxtargets for android sdks to be used in app.

Android also has the mergedManifest : https://developer.android.com/studio/build/manifest-merge#top_of_page
Your APK file can contain just one AndroidManifest.xml file, but your Android Studio project may contain several—provided by the main source set, build variants, and imported libraries. So when building your app, the Gradle build merges all manifest files into a single manifest file that's packaged into your APK.

The manifest merger tool combines all XML elements from each file by following some merge heuristics and by obeying merge preferences that you have defined with special XML attributes.
 */











//entire lifetime -- happens between the first call to onCreate(Bundle) through to a single final call to onDestroy()
//visible lifetime -- happens between a call to onStart() until a corresponding call to onStop().
//foreground lifetime -- happens between a call to onResume() until a corresponding call to onPause()



public class MainActivity extends AppCompatActivity {



    public TextView textCurrentCycle;
    private WebView mWebview;
    private LinearLayout parentLayout;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        onCreate(Bundle) is where you initialize your activity.
         Most importantly, here you will usually call setContentView(int) with a layout resource defining your UI,
         and using findViewById(int) to retrieve the widgets in that UI that you need to interact with programmatically.
         */

        /*
        Called when the activity is first created.
        This is where you should do all of your normal static set up: create views, bind data to lists, etc.
        This method also provides you with a Bundle containing the activity's previously frozen state, if there was one.
Always followed by onStart().
         */

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//sets the XML file as current activity UI


        //DO NOT UNCOMMENT THIS IF YOU WANT ACTIONBAR TO WORK
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getActionBar().setDisplayHomeAsUpEnabled(true);


        //change background color programmatically
        parentLayout = findViewById(R.id.parentLayout);
        parentLayout.setBackgroundColor(Color.BLACK);
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_YES);


        //to view webcontent inside an android app
        //1. we can design progressive web apps
        //2. we can view html inside webview
        //3. we can send intent to android default browser
        //4. we can use chrome custom tabs

        textCurrentCycle = (TextView) findViewById(R.id.currentCycle);

        WebView myWebView = (WebView) findViewById(R.id.activity1Webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new MyWebViewClient());
        // myWebView.addJavascriptInterface(new WebAppInterface(this),"Android");
        // myWebView.getWebViewClient().shouldOverrideUrlLoading(myWebView,"https://www.checkmarx.com");
        //call requires api 26, current is 19 And Deprecated in API 24
        //solutions is to implement both overridden methods


        //THIS WORKS !! -- duplicating here
        //myWebView.getWebViewClient().shouldOverrideUrlLoading(myWebView,"https://www.checkmarx.com");

        Button chromecustomtabBtn = (Button) findViewById(R.id.chromeCustomTabBtn);
        chromecustomtabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://transitional-magazi.000webhostapp.com/";
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.launchUrl(v.getContext(), Uri.parse(url));
            }
        });

        //EXPLICIT INTENT
        final EditText extratextview = (EditText) findViewById(R.id.extraTextView);
        Button goToSecondActivityBtn = (Button) findViewById(R.id.btngoToSecondActivity);
        goToSecondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MainActivity.this tells us that MainActivity is requesting that second activity be called.. who is calling
                startActivity(new Intent(MainActivity.this,SecondActivity.class));

                //Explicit intent
                // Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                //intent.putExtra("theTextSent",extratextview.getText().toString());
                //startActivity(intent);
            }
        });

        TextView mainTv = (TextView) findViewById(R.id.text1);
        ConnectivityManager conman = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        boolean wifi = conman.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnectedOrConnecting();
        if(wifi){
            myWebView.getWebViewClient().shouldOverrideUrlLoading(myWebView,"https://www.checkmarx.com");
        } else {
            //myWebView.getWebViewClient().
            String summary = "<html><body>Your Wifi is Off, Enable Wifi to load the website</body></html>";
            myWebView.loadData(summary, "text/html; charset=utf-8", "utf-8");
        }






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