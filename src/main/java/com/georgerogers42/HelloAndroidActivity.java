package com.georgerogers42;

import com.petebevin.markdown.*;
import android.app.Activity;
import android.os.Bundle;
import android.content.*;
import android.webkit.*;


public class HelloAndroidActivity extends Activity {

    private static String TAG = "markpipe";

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
	WebView webview = new WebView(this);
        setContentView(webview);
	Intent intent = getIntent();
	String input = intent.getStringExtra(Intent.EXTRA_TEXT);
	String output = new MarkdownProcessor().markdown(input);
	webview.loadData(output, "text/html", null);
    }

}

