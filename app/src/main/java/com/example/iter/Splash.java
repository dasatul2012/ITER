package com.example.iter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash
  extends Activity
{
  private static int SPLASH_TIME_OUT = 3000;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903081);
    super.setRequestedOrientation(1);
    new Handler().postDelayed(new Runnable()
    {
      public void run()
      {
        Intent localIntent = new Intent(Splash.this, Home.class);
        Splash.this.startActivity(localIntent);
        Splash.this.finish();
      }
    }, SPLASH_TIME_OUT);
  }
}


