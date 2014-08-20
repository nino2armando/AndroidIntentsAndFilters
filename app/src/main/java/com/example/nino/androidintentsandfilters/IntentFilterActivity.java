package com.example.nino.androidintentsandfilters;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by nino on 19/08/14.
 */
public class IntentFilterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentfilter);

        // First intent to use ACTION_VIEW action with correct data
        Button startBrowserViewAction = (Button) findViewById(R.id.button_startBrowser_IntentFilter_ViewAction);
        startBrowserViewAction.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.ca"));
                startActivity(intent);
            }
        });

        // Second intent to use LAUNCH action with correct data
        final Button startBrowserLaunchAction = (Button) findViewById(R.id.button_startBrowser_IntentFilter_LaunchAction);
        startBrowserLaunchAction.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.nino.LAUNCH", Uri.parse("http://www.google.ca"));
                startActivity(intent);
            }
        });

        // Third intent to use LAUNCH action with incorrect data
        Button throwException = (Button) findViewById(R.id.button_startBrowser_IntentFilter_Exception);
        throwException.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.nino.LAUNCH", Uri.parse("https://www.google.ca"));
                startActivity(intent);
            }
        });

    }
}
