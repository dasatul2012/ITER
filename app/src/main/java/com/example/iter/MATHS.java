package com.example.iter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.iter.FMATHS;

public class MATHS
  extends Activity
{
  public void fce(View paramView)
  {
    startActivity(new Intent(this, FMATHS.class));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903072);
    super.setRequestedOrientation(1);
  }
}



