package com.example.iter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Home
  extends Activity
{
  public void bntc(View paramView)
  {
    startActivity(new Intent(this, com.example.iter.Notice.class));
  }
  
  public void cnc(View paramView)
  {
    startActivity(new Intent(this, Contact.class));
  }
  
  public void deprt(View paramView)
  {
    startActivity(new Intent(this, com.example.iter.Department.class));
  }
  
  public void fclty(View paramView)
  {
    startActivity(new Intent(this, Facilities.class));
  }
  
  public void gllry(View paramView)
  {
    startActivity(new Intent(this, Gallery.class));
  }
  
  public void nwsevn(View paramView)
  {
    startActivity(new Intent(this, com.example.iter.NewsndEvent.class));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903069);
    super.setRequestedOrientation(1);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131099648, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131165209) {
      System.exit(0);
    }
    for (;;)
    {
      return super.onOptionsItemSelected(paramMenuItem);
      if (paramMenuItem.getItemId() == 2131165210) {
        startActivity(new Intent(this, Inquery.class));
      }
    }
  }
  
  public void plc(View paramView)
  {
    startActivity(new Intent(this, Placement.class));
  }
  
  public void soa(View paramView)
  {
    startActivity(new Intent(this, SOA.class));
  }
  
  public void std(View paramView)
  {
    startActivity(new Intent(this, Student.class));
  }
}



/* Location:           H:\Reverse Engineering Apk\Source Code Apk\dex2jar-0.0.9.15\classes_dex2jar.jar

 * Qualified Name:     com.example.college.Home

 * JD-Core Version:    0.7.0.1

 */