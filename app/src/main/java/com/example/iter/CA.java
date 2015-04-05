package com.example.iter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CA
  extends Activity
{
  public void fce(View paramView)
  {
    startActivity(new Intent(this, com.example.iter.FCA.class));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    super.setRequestedOrientation(1);
  }
}



