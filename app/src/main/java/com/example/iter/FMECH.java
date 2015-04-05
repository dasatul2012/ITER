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

public class FMECH
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
    private String[] mDialogue = { "Professor Ph.D., IIT Kharagpur ratikantamishra@soauniversity.ac.in", "Professor & Associate Dean Ph.D (Mechanical Vibration), NIIT RourkelaAssociate Professor & HOD M.Tech., BPUT dhirendrathatoi@soauniversity.ac.in", "Professor Ph.D, IIT Kharagpur rajatbhoi@soauniversity.ac.in", "Professor Ph.D., IIT Delhi niranjankavi@soauniversity.ac.in", "Professor Ph.D., Russia olgabylya@soauniversity.ac.in", "Professor Ph.D, IIT Kharagpur ajitkumarmishra@soauniversity.ac.in", "Professor M.Tech., IIT, Kharagpur jayadevbala@soauniversity.ac.in", "Associate Professor M.Tech, Ph.D., IIT Kharagpur hrushikeshsarangi@soauniversity.ac.in", "Associate Professor M.Tech., Ph.D., IIT Guwahati mamatapadhy@soauniversity.ac.in", "Associate Professor M.Tech., Ph.D, BPUT jayantanath@soauniversity.ac.in", "Associate Professor M.Tech., Ph.D, BPUT sarojacharya@soauniversity.ac.in", "Associate Professor Ph.D., NIT Rourkela rabindramahapatra@soauniversity.ac.in", "Associate Professor Ph.D., NIT Rourkela amiyadash@soauniversity.ac.in", "Associate Professor M.Tech., Ph.D., IIT Kharagpur sarojsarangi@soauniversity.ac.in", "Associate Professor B.Tech., MBA sudambasa@soauniversity.ac.in", "Assistant Professor Ph.D sibasankarmohapatra@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT tapaswineedas@soauniversity.ac.in", "Assistant Professor B.Tech., NIT Rourkela manojsarangi@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela bibhutimishra@soauniversity.ac.in", "Assistant Professor Ph.D., Jadavpur Universiy sikatasamantaray@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur bhabanimohanto@soauniversity.ac.in", "Assistant Professor M.Tech., VSSUT Burla sankardas@soauniversity.ac.in", "Assistant Professor M.Tech, IIT Kharagpur sashendra sahoo@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela sasmeetatripathy@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT madhulagnapattnaik@soauniversity.ac.in" };
    private boolean[] mExpanded = new boolean[25];
    private String[] mTitles = { "Prof. Ratikanta Mishra", "Mr. Dhirendranath Thatoi", "Prof. Rajat Kumar Bhoi", "Prof. Niranjan Kavi", "Prof. Olga Ivanovna Bylya", "Dr. Ajit Kumar Mishra", "Prof. Jayadev Bala", "Dr. Hrushikesh Sarangi", "Dr. Mamata Kumari Padhy", "Dr. Jayanta Kumar Nath", "Dr. Saroj Kumar Acharya", "Dr. Rabindra Narayan Mahapatra", "Dr. Amiya Kumar Dash", "Dr. Saroj Kumar Sarangi", "Mr. Sudam Charan Basa", "Dr. Siba Shankar Mohapatra", "Mrs. Tapaswinee Das", "Mr. Manoj Kumar Sarangi", "Mr. Bibhuti Bhusana Mishra", "Dr. Sikata Samantaray", "Mr. Bhabani Sankar Mohanto", "Mr. Sankar Narayan Das", "Mr. Shashendra Kumar Sahoo", "Mrs. Sasmeeta Tripathy" };
    
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
        return new FMECH.SpeechView(FMECH.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FMECH.SpeechView localSpeechView = (FMECH.SpeechView)paramView;
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


