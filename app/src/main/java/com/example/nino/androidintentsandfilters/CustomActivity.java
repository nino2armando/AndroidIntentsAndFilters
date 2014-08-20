package com.example.nino.androidintentsandfilters;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by nino on 19/08/14.
 */
public class CustomActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        TextView label = (TextView) findViewById(R.id.textView_showData);
        Uri url = getIntent().getData();
        label.setText(url.toString());
    }
}
