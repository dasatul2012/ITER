package com.example.iter;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Notice
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903075);
    WebView localWebView = (WebView)findViewById(2131165207);
    localWebView.getSettings().setJavaScriptEnabled(true);
    localWebView.loadUrl("http://soauniversity.ac.in/home/iter/news");
  }
}



