package com.example.college;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Department
  extends Activity
{
  String[] listdep = { "Humanities and Social Sciences", "Civil Engingeering", "Computer Science and Engineering", "Computer Science and Information Technology", "Electrical Engineering", "Electrical and Electronics Engineering", "Electronics and Communication Engineering", "Electrical Instrumentation and Control Engineering", "Electronics and Instrumentation Engineering", "Mechanical Engineering", "Computer Application", "Physics", "Mathematics", "Chemistry" };
  ListView lv;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903046);
    super.setRequestedOrientation(1);
    final ListView localListView = (ListView)findViewById(2131165191);
    localListView.setAdapter(new ArrayAdapter(this, 17367043, this.listdep));
    localListView.setTextFilterEnabled(true);
    localListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        String str = (String)localListView.getItemAtPosition(paramAnonymousInt);
        if (str.toString() == "Humanities and Social Sciences")
        {
          Intent localIntent1 = new Intent(Department.this, Humanity.class);
          Department.this.startActivity(localIntent1);
        }
        if (str.toString() == "Civil Engingeering")
        {
          Intent localIntent2 = new Intent(Department.this, Civil.class);
          Department.this.startActivity(localIntent2);
        }
        if (str.toString() == "Computer Science and Engineering")
        {
          Intent localIntent3 = new Intent(Department.this, CSE.class);
          Department.this.startActivity(localIntent3);
        }
        if (str.toString() == "Computer Science and Information Technology")
        {
          Intent localIntent4 = new Intent(Department.this, CSIT.class);
          Department.this.startActivity(localIntent4);
        }
        if (str.toString() == "Electrical Engineering")
        {
          Intent localIntent5 = new Intent(Department.this, EE.class);
          Department.this.startActivity(localIntent5);
        }
        if (str.toString() == "Electrical and Electronics Engineering")
        {
          Intent localIntent6 = new Intent(Department.this, EEE.class);
          Department.this.startActivity(localIntent6);
        }
        if (str.toString() == "Electronics and Communication Engineering")
        {
          Intent localIntent7 = new Intent(Department.this, ECE.class);
          Department.this.startActivity(localIntent7);
        }
        if (str.toString() == "Electrical Instrumentation and Control Engineering")
        {
          Intent localIntent8 = new Intent(Department.this, EICE.class);
          Department.this.startActivity(localIntent8);
        }
        if (str.toString() == "Electronics and Instrumentation Engineering")
        {
          Intent localIntent9 = new Intent(Department.this, EIE.class);
          Department.this.startActivity(localIntent9);
        }
        if (str.toString() == "Mechanical Engineering")
        {
          Intent localIntent10 = new Intent(Department.this, Mech.class);
          Department.this.startActivity(localIntent10);
        }
        if (str.toString() == "Computer Application")
        {
          Intent localIntent11 = new Intent(Department.this, CA.class);
          Department.this.startActivity(localIntent11);
        }
        if (str.toString() == "Chemistry")
        {
          Intent localIntent12 = new Intent(Department.this, CHEM.class);
          Department.this.startActivity(localIntent12);
        }
        if (str.toString() == "Mathematics")
        {
          Intent localIntent13 = new Intent(Department.this, Math.class);
          Department.this.startActivity(localIntent13);
        }
        if (str.toString() == "Physics")
        {
          Intent localIntent14 = new Intent(Department.this, PHY.class);
          Department.this.startActivity(localIntent14);
        }
      }
    });
  }
}


