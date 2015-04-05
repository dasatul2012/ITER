package com.example.iter;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Inquiry
  extends Activity
{
  public void form(View paramView)
  {
    EditText localEditText1 = (EditText)findViewById(2131165202);
    EditText localEditText2 = (EditText)findViewById(2131165204);
    EditText localEditText3 = (EditText)findViewById(2131165205);
    EditText localEditText4 = (EditText)findViewById(2131165206);
    String str1 = localEditText1.getText().toString();
    String str2 = localEditText2.getText().toString();
    String str3 = localEditText3.getText().toString();
    String str4 = localEditText4.getText().toString();
    int i;
    int j;
    label110:
    int m;
    label128:
    int i1;
    if (str1.length() != 0)
    {
      i = 1;
      if (str2.length() == 0) {
        break label251;
      }
      j = 1;
      int k = j & i;
      if (str3.length() == 0) {
        break label257;
      }
      m = 1;
      int n = k & m;
      if (str4.length() == 0) {
        break label263;
      }
      i1 = 1;
      label146:
      if ((i1 & n) == 0) {
        break label269;
      }
      SQLiteDatabase localSQLiteDatabase = openOrCreateDatabase("Inquery", 0, null);
      localSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS contacts(ID integer primary key autoincrement,Name VARCHAR(30),Email VARCHAR(30),Phone VARCHAR(30),Inquery VARCHAR(40));");
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("Name", str1);
      localContentValues.put("Email", str2);
      localContentValues.put("Phone", str3);
      localContentValues.put("Inquery", str4);
      localSQLiteDatabase.insert("contacts", null, localContentValues);
      Toast.makeText(getApplicationContext(), "Your Query has been submitted", 1).show();
      finish();
    }

    {
      return;
      i = 0;
      break;
      j = 0;
      break label110;
      m = 0;
      break label128;
      i1 = 0;
      break label146;
      int i2;
      int i3;
      int i5;
      int i6;
      if (str1.length() == 0)
      {
        i2 = 1;
        if (str2.length() != 0) {
          break label355;
        }
        i3 = 1;
        int i4 = i3 & i2;
        if (str3.length() != 0) {
          break label361;
        }
        i5 = 1;
        i6 = i4 & i5;
        if (str4.length() != 0) {
          break label367;
        }
      }
       (int i7 = 1;; i7 = 0)
      {
        if ((i7 & i6) == 0) {
          break label373;
        }
        Toast.makeText(getApplicationContext(), "Fill in the details..", 1).show();
        return;
        i2 = 0;
        break;
        i3 = 0;
        break label291;
        i5 = 0;
        break label309;
      }
      if (str1.length() == 0)
      {
        Toast.makeText(getApplicationContext(), "Enter your name..", 1).show();
        return;
      }
      if (str2.length() == 0)
      {
        Toast.makeText(getApplicationContext(), "Enter your email..", 1).show();
        return;
      }
      if (str3.length() == 0)
      {
        Toast.makeText(getApplicationContext(), "Enter your phone number..", 1).show();
        return;
      }
    } while (str4.length() != 0);
    label257:
    label263:
    label269:
    label291:
    label309:
    label355:
    label361:
    label367:
    label373:
    Toast.makeText(getApplicationContext(), "Enter your query..", 1).show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903071);
    super.setRequestedOrientation(1);
  }
}



/* Location:           H:\Reverse Engineering Apk\Source Code Apk\dex2jar-0.0.9.15\classes_dex2jar.jar

 * Qualified Name:     com.example.college.Inquery

 * JD-Core Version:    0.7.0.1

 */