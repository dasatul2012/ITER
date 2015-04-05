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

public class FEEE
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
    private String[] mDialogue = { "Professor & HOD Ph.D., BPUT Rourkela pravatrout@soauniversity.ac.in", "Associate Professor M.Tech., Ph.D., BPUT Rourkela ranjanmallick@soauniversity.ac.in", "Assistant Professor Ph.D., BPUT, Rourkela milanbiswal@soauniversity.ac.in", "Assistant Professor M.Tech., Ph.D niranjannayak@soauniversity.ac.in", "Assistant Professor M.Tech., Ph.D sangramroutray@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur sujitdash@soauniversity.ac.in", "Assistant Professor M.Tech., IIT Roorkee alokpani@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University anujananda@soauniversity.ac.in", "Assistant Professor M.Tech., BEC, West Bengal akshayapatra@soauniversity.ac.in", "Assistant Professor M.Tech., IIT Roorkee alokmishra@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT, Rourkela lalitsatapathy@soauniversity.ac.in", "Assistant Professor M.E., Jadavpur University satyabhamadash@soauniversity.ac.in", "Assistant Professor M.Tech., SRM University mrutyunjayasahani@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela debadattagadanayak@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University susantarout@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University jyotiranjanpanda@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur subratdash@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur anjansahoo@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur amareshgantayet@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University subhashreechoudhury@soauniversity.ac.in", "Research Associate M.Tech., SRM University snehamoydhar@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University manishajena@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur rajibnanda@soauniversity.ac.in" };
    private boolean[] mExpanded = new boolean[23];
    private String[] mTitles = { "Prof. (Dr.) Pravat Kumar Rout", "Dr. Ranjan Kumar Mallick", "Dr. Milan Biswal", "Mr. Niranjan Nayak", "Mr.Sangram Keshari Routray", "Mr. Sujit Kumar Dash", "Mr. Alok Kumar Pani", "Mrs. Anuja Nanda", "Mr. Akshaya Kumar Patra", "Mr. Alok Kumar Mishra", "Mr. Lalit Mohan Satapathy", "Mrs. Satyabhama Dash", "Mr. Mrutyunjaya Sahani", "Mr. Debadatta Amaresh Gadanayak", "Mr. Susanta Kumar Rout", "Mr. Jyotiranjan Panda", "Mr. Subrat Kumar Dash", "Mr. Anjan Kumar Sahoo", "Mr. Amaresh Gantayet", "Mrs. Subhashreer Choudhury", "Mr. Snehamoy Dhar", "Ms. Manisha Jena", "Mr. Rajib Kumar Nanda" };
    
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
        return new FEEE.SpeechView(FEEE.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FEEE.SpeechView localSpeechView = (FEEE.SpeechView)paramView;
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



