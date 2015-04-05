package com.example.iter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Student
  extends Activity
{
  String[] listdep = { "TechHack", "Danza", "De Facto", "Camera Club ITER", "ITER Robotics Club", "Jaago", "SAE", "Science Innovators Club", "Srishti", "ToneelStuk", "Virtual Showreel", "ITER Quiz Club", "ITER Space Techno Club", "ITER Music Club", "Consilium", "ASME", "ITER Aero Club", "ASCE", "E-Shadow Electrical Society" };
  ListView lv;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903082);
    super.setRequestedOrientation(1);
    ListView localListView = (ListView)findViewById(2131165191);
    localListView.setAdapter(new ArrayAdapter(this, 17367043, this.listdep));
    localListView.setTextFilterEnabled(true);
  }
}


