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

public class FEICE
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
    private String[] mDialogue = { "Professor Ph.D, Utkal University mkmallick@soauniversity.ac.in", "Research Proefessor M.Sc, Ph.D ndkaushika@soauniversity.ac.in", "Associate Professor & HOD Ph.D., SOA University renusharma@soauniversity.ac.in", "Assistant Professor Ph.D., BPUT shaziahasan@soauniversity.ac.in", "Assistant Professor M.Tech sunitabiswal@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela rashmisahoo@soauniversity.ac.in", "Assistant Professor M.Tech byomakeshdash@soauniversity.ac.in", "Assistant Professor M.Tech sangitakar@soauniversity.ac.in", "Assistant Professor M.Tech satishchoudhury@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela bhanjaswain@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur", "Assistant Professor M.Tech., SOA University tanmayparida@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University manoharmishra@soauniversity.ac.in", "Assistant Professor Ph.D., SRM University joymalamoirangthem@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela abhisekparida@soauniversity.ac.in", "Assistant Professor M.Tech subarnipradhan@soauniversity.ac.in", "Assistant Professor M.Tech jasaswinimohanty@soauniversity.ac.in", "Research Associate M.Tech rajeshpatnaik@soauniversity.ac.in", "Assistant Professor M.Tech subarnipradhan@soauniversity.ac.in", "Assistant Professor M.Tech jasaswinimohanty@soauniversity.ac.in", "Research Associate M.Tech rajeshpatnaik@soauniversity.ac.in" };
    private boolean[] mExpanded = new boolean[21];
    private String[] mTitles = { "Prof. M.K Mallick", "Dr. N.D. Kaushika", "Dr. Renu Sharma", "Dr. Shazia Hasan", "Mrs. Sunita S. Biswal", "Mrs. Rashmi Rekha Sahoo", "Mr. Byomakesh Dash", "Mrs. Sangita Rani Kar", "Mr. Satish Choudhury", "Mr. Bhanja Kishore Swain", "Mr. Tara Pasanna Dash", "Mr. Tanmoy Parida", "Mr. Manohar Mishra", "Dr. Joymala Moirangthem", "Mr. Abhisek Parida", "Ms. Subarni Pradhan", "Ms. Jasaswini Mohanty", "Mr. Rajesh Kumar Patnaik", "Ms. Subarni Pradhan", "Ms. Jasaswini Mohanty", "Mr. Rajesh Kumar Patnaik" };
    
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
        return new FEICE.SpeechView(FEICE.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FEICE.SpeechView localSpeechView = (FEICE.SpeechView)paramView;
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



