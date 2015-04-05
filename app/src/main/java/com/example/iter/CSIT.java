package com.example.iter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CSIT
  extends Activity
{
  public void fce(View paramView)
  {
    startActivity(new Intent(this, com.example.iter.FCSIT.class));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903045);
    super.setRequestedOrientation(1);
  }
}



