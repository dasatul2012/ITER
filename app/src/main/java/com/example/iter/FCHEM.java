package com.example.iter;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;

public class FCHEM
  extends ListActivity
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    super.setRequestedOrientation(1);
    setListAdapter(new SpeechListAdapter(this));
  }
  
  protected void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    ((SpeechListAdapter)getListAdapter()).toggle(paramInt);
  }
  
  private class SpeechListAdapter
    extends BaseAdapter
  {
    private Context mContext;
    private String[] mDialogue = { "Professor & Associate Dean Ph.D., Utkal University miradas@soauniversity.ac.in", "Professor Emeritus undash@soauniversity.ac.in", "Professor kulamaniparida@soauniversity.ac.in", "Professor & Additional Dean Ph.D., Utkal University rajhota@soauniversity.ac.in", "Professor & HOD Ph.D., Utkal University sujatamishra@soauniversity.ac.in", "Associate Professor Ph.D., Utkal University rashmiacharya@soauniversity.ac.in", "Associate Professor Ph.D, Utkal University niharbaladevi@soauniversity.ac.in", "Assistant Professor Ph.D, Calcutta University malabikatalukdar@soauniversity.ac.in", "Assistant Professor Ph.D, IISc, Bangalore himanshumohapatra@soauniversity.ac.in", "Assistant Professor Ph.D., Utkal University snehamishra@soauniversity.ac.in", "Assistant Professor Ph.D., KIIT University sureshdash@soauniversity.ac.in", "Assistant Professor Ph.D., Ravenshaw University pgrachary@soauniversity.ac.in", "Assistant Professor Ph.D, Sambalpur University abantipradhan@soauniversity.ac.in", "Assistant Professor Ph.D., IIT Guwahati adityadash@soauniversity.ac.in", "Assistant Professor Ph.D, University of PISA, Italy sanghamitrapradhan@soauniversity.ac.in", "Assistant Professor Ph.D, IIT Guwahati nareshsahoo@soauniversity.ac.in", "Assistant Professor Ph.D., Utkal University dharitrirath@soauniversity.ac.in", "Assistant Professor Ph.D., (NIU, USA) baradadash@soauniversity.ac.in", "Assistant Professor ", "Assistant Professor M.Sc., M.Phil., Utkal University sanjibitadas@soauniversity.ac.in", "Assistant Professor M.Tech, MS, USA sujitdehury@soauniversity.ac.in", "Sr. Lecturer M.Sc., PGDCAQM, NIT Rourkela binitananda@soauniversity.ac.in", "Lecturer M.Sc., M.Phil, M.Ed., Ravenshaw University sulochanasingh@soauniversity.ac.in", "Professor Ph.D, Post. Doc, IIT Kharagpur nimainayak@soauniversity.ac.in", "Research Assistant M.Sc. nanditapanda@soauniversity.ac.in" };
    private boolean[] mExpanded = new boolean[25];
    private String[] mTitles = { "Prof. Mira Das", "Prof. U.N. Das", "Prof. K.M. Parida", "Prof. Raj Kumar Hota", "Prof. Sujata Mishra", "Dr. Rashmi Acharya", "Dr. Niharbala Devi", "Dr. Malabika Talukdar", "Dr. Himanshu Mohapatra", "Dr. Sneha Prabha Mishra", "Dr. Suresh Kumar Dash", "Dr. P.G.R. Achary", "Dr. Abanti Pradhan", "Dr. Aditya Kishore Dash", "Dr. Sanghamitra Pradhan", "Dr. Naresh Kumar Sahoo", "Dr. Dharitri Rath", "Dr. Barada Prasanna Dash", "Dr. Raghabendra Samantaray", "Mrs. Sanjibita Das", "Mr. Sujit Kumar Dehury", "Mrs. Binita Nanda", "Ms. Sulochana Singh", "Prof. Nimai Charan Nayak", "Mrs. Nandita Panda" };
    
    public SpeechListAdapter(Context paramContext)
    {
      this.mContext = paramContext;
    }
    
    public int getCount()
    {
      return this.mTitles.length;
    }
    
    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        return new FCHEM.SpeechView(FCHEM.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FCHEM.SpeechView localSpeechView = (FCHEM.SpeechView)paramView;
      localSpeechView.setTitle(this.mTitles[paramInt]);
      localSpeechView.setDialogue(this.mDialogue[paramInt]);
      localSpeechView.setExpanded(this.mExpanded[paramInt]);
      return localSpeechView;
    }
    
    public void toggle(int paramInt)
    {
      boolean[] arrayOfBoolean = this.mExpanded;
      if (this.mExpanded[paramInt] != 0) {}
      for (int i = 0;; i = 1)
      {
        arrayOfBoolean[paramInt] = i;
        notifyDataSetChanged();
        return;
      }
    }
  }
  
  private class SpeechView
    extends LinearLayout
  {
    private TextView mDialogue;
    private TextView mTitle;
    
    public SpeechView(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
    {
      super();
      setOrientation(1);
      this.mTitle = new TextView(paramContext);
      this.mTitle.setText(paramString1);
      this.mTitle.setTextSize(20.0F);
      addView(this.mTitle, new LinearLayout.LayoutParams(-1, -2));
      this.mDialogue = new TextView(paramContext);
      this.mDialogue.setText(paramString2);
      this.mDialogue.setTextSize(20.0F);
      addView(this.mDialogue, new LinearLayout.LayoutParams(-1, -2));
      TextView localTextView = this.mDialogue;
      if (paramBoolean) {}
      for (int i = 0;; i = 8)
      {
        localTextView.setVisibility(i);
        return;
      }
    }
    
    public void setDialogue(String paramString)
    {
      this.mDialogue.setText(paramString);
    }
    
    public void setExpanded(boolean paramBoolean)
    {
      TextView localTextView = this.mDialogue;
      if (paramBoolean) {}
      for (int i = 0;; i = 8)
      {
        localTextView.setVisibility(i);
        return;
      }
    }
    
    public void setTitle(String paramString)
    {
      this.mTitle.setText(paramString);
    }
  }
}



