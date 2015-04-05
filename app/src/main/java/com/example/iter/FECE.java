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

public class FECE
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
    private String[] mDialogue = { "Professor Ph.D., IIT Kharagpur bksarap@soauniversity.ac.in", "Professor & Dean Research Ph.D., IIT Bombay pknanda@soauniversity.ac.in", "Professor & Associate Dean Ph.D, BPUT nivadas@soauniversity.ac.in", "Associate Professor & HOD M.Tech., NIT Rourkela bibhumohanty@soauniversity.ac.in", "Associate Professor Ph.D, BPUT mihirmohanty@soauniversity.ac.inAssociate Professor M.Tech, Ph.D, IIT Kharagpur benudharsahu@soauniversity.ac.in", "Associate Professor Ph.D, IIEST, Sibpur-West Bengal laxmimishra@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela gyanapatra@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela kunaldas@soauniversity.ac.in", "Assistant Professor M.Tech. UCE Burla badrinarayandsahu@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT meryleenmohapatra@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT madhusmitapanda@soauniversity.ac.in", "Assistant Professor M.Tech., Jadavpur University sikhamishra@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University barsasamantaray@soauniversity.ac.in", "Assistant Professor arabindasahoo@soauniversity.ac.in", "Assistant Professor M.Tech., KIIT University sarmisthasatrusalya@soauniversity.ac.in", "Assistant Professor M.Tech., KIIT University archanasarangi@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University sushantasarangi@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela arunagrawal@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University debashishsamal@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University susmitapanda@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur prabinbera@soauniversity.ac.in", "Assistant Professor M.Tech., KIIT University sidharthadash@soauniversity.ac.in", "Assistant Professor tapasminisahoo@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela suchismitabehera@soauniversity.ac.in" };
    private boolean[] mExpanded = new boolean[25];
    private String[] mTitles = { "Prof. B.K Sarap", "Prof. P.K. Nanda", "Prof. Niva Das", "Mr. Bibhu Prasad Mohanty", "Dr. Mihir Narayan Mohanty", "Dr. Benudhar Sahu", "Dr. Laxmi Prasad Mishra", "Mr. Gyana Ranjan Patra", "Mr. Kunal Kumar Das", "Mr. Badrinarayan Sahu", "Mrs. Meryleen Mohapatra", "Mrs. Madhusmita Panda", "Mrs. Sikha Mishra", "Mrs.Barsa Samantaray", "Mr. Arabinda Sahoo", "Mrs. Sarmistha Satrusalya", "Mrs. Archana Sarangi", "Mr. Sushanta Kumar Sarangi", "Mr. Arun Agarwal", "Mr. Debasish Samal", "Mrs. Susmita Panda", "Mr. Prabin Kumar Bera", "Mr. Sidhartha Dash", "Mrs. Tapasmini Sahoo" };
    
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
        return new FECE.SpeechView(FECE.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FECE.SpeechView localSpeechView = (FECE.SpeechView)paramView;
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



