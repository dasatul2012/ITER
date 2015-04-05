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

public class FHUMANITY
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
    private String[] mDialogue = { "Professor Ph.D, Sambalpur University bhabanibaral@soauniversity.ac.in", "Assistant Professor M.A, MBA, Ph.D, Utkal University subhasmitabiswal@soauniversity.ac.in", "Lecturer M-PMIR swagatikachoudhury@soauniversity.ac.in", "Assistant Professor & HOD kabitadas@soauniversity.ac.in", "Assistant Professor madhusmitadash@soauniversity.ac.in", "Faculty Associate M.Phil sasmitadash@soauniversity.ac.in", "Assistant Professor mousumidash@soauniversity.ac.in", "Assistant Professor PGDJ, MJMC, Ph.D, IIT Kharagpur ashishdwivedy@soauniversity.ac.in", "Senior Lecturer M.A., M.Phil rabindrakar@soauniversity.ac.in", "Senior Lecturer M.A., Ph.D Utkal University janmejaykhuntia@soauniversity.ac.in", "Assistant Professor M.A, M.Phil, Utkal University subismitalenka@soauniversity.ac.in", "Lecturer M.A, M.Phil monalisamishra@soauniversity.ac.in", "Assistant Professor M.A, Ph.D, Ranchi University saileshmishra@soauniversity.ac.in", "Assistant Professor prachishreemishra@soauniversity.ac.in", "Professor M.A, PGDTE (EFLU) ashokmohanty@soauniversity.ac.in", "Assistant Professor malavikamohapatra@soauniversity.ac.in", "Professor ajitkmukherjee@soauniversity.ac.in", "Assistant Professor baburamnayak@soauniversity.ac.in", "Lecturer Ma, MBA, BPUT shibanipattanayak@soauniversity.ac.in", "Lecturer MBA shrabanteesar@soauniversity.ac.in", "Assistant Professor minaketansarangi@soauniversity.ac.in", "Assistant Professor M.A., Ph.D Utkal University swayamsatpathy@soauniversity.ac.in", "Assistant Professor M.A, M.Phil, Ph.D, M.S. University sthitaprajna@soauniversity.ac.in" };
    private boolean[] mExpanded = new boolean[23];
    private String[] mTitles = { "Prof. Bhabani Sankar Barala", "Dr. Subhasmita Biswal", "Ms. Swagatika Choudhury", "Mrs. Kabita Das", "Mrs. Madhusmita Dash", "Mrs. Sasmita Dash", "Mrs. Mousumi Dash", "Dr. Ashish Kumar Dwivedy", "Mr. Rabindra Kumar Kar", "Dr. Janmejay Khuntia", "Mrs. Subismita Lenka", "Mrs. Monalisa Mishra", "Dr. Shailesh Mishra", "Ms. Prachisri Mishra", "Prof. Ashok Kumar Mohanty", "Ms. Malavika Mohapatra", "Prof. Ajit Mukherjee", "Mr. Baburam Nayak", "Mrs. Shibani Pattanayak", "Mrs. Shrabantee Sar", "Mr. Minaketan Sarangi", "Dr. Swayamprabha Satpathy", "Dr. Sthitaprajna" };
    
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
        return new FHUMANITY.SpeechView(FHUMANITY.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FHUMANITY.SpeechView localSpeechView = (FHUMANITY.SpeechView)paramView;
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


