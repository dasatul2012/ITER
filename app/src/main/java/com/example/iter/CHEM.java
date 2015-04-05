package com.example.iter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.iter.FCHEM;

public class CHEM
  extends Activity
{
  public void fce(View paramView)
  {
    startActivity(new Intent(this, FCHEM.class));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903041);
    super.setRequestedOrientation(1);
  }
}


