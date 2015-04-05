package com.example.iter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;

public class Placement
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903079);
    super.setRequestedOrientation(1);
  }
  
  public void onPopupButtonClick(View paramView)
  {
    PopupMenu localPopupMenu = new PopupMenu(this, paramView);
    localPopupMenu.getMenuInflater().inflate(2131099649, localPopupMenu.getMenu());
    localPopupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener()
    {
      public boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        if (paramAnonymousMenuItem.getItemId() == 2131165211)
        {
          Intent localIntent1 = new Intent(Placement.this, com.example.college.P1.class);
          Placement.this.startActivity(localIntent1);
        }
        for (;;)
        {
          return true;
          if (paramAnonymousMenuItem.getItemId() == 2131165212)
          {
            Intent localIntent2 = new Intent(Placement.this, com.example.college.P2.class);
            Placement.this.startActivity(localIntent2);
          }
        }
      }
    });
    localPopupMenu.show();
  }
}


