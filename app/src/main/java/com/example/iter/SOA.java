package com.example.iter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SOA
  extends Activity
{
  private void goToUrl(String paramString)
  {
    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
  }
  
  public void fce(View paramView)
  {
    goToUrl("http://soauniversity.ac.in/home/soa");
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903080);
    super.setRequestedOrientation(1);
  }
}


