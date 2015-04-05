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

public class FPHY
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
    private String[] mDialogue = { "Professor & Head Ph.D (Utkal University) purendradash@soauniversity.ac.in", "Professor Ph.D (Edinburg University) ramchoudhary@soauniversity.ac.in", "Professor Ph.D (IOPB), Ph.D(MU-USA) subodhamishra@soauniversity.ac.in", "Associate Professor Ph.D (IIT, Kharagpur) sushantakamilla@soauniversity.ac.in", "Associate Professor Ph.D (IIT, Bombay) jyotirmayeenanda@soauniversity.ac.in", "Associate Professor Ph.D (UGC-DAE CSR, Indore) venkatamedicherla@soauniversity.ac.in", "Assistant Professor Ph.D (Utkal University) jyoshnaranimohapatra@soauniversity.ac.in", "Assistant Professor Ph.D (Sambalpur University) rajanikantaparida@soauniversity.ac.in", "Assistant Professor M.Tech (IT, BHU) pragyanmohanty@soauniversity.ac.in", "Assistant Professor M.Phil (Utkal University) ranjitamahapatra@soauniversity.ac.in", "Assistant Professor M.Phil (Utkal University) kamalmohanta@soauniversity.ac.in", "Assistant Professor M.Phil (Sambalpur University) santoshparida@soauniversity.ac.in", "Assistant Professor Ph.D (Sambalpur University) rabinarayanpanda@soauniversity.ac.in", "Assistant Professor Ph.D (Utkal University) dilipmishra@soauniversity.ac.in", "Assistant Professor Ph.D (SOA University) rajibpadhee@soauniversity.ac.in", "Assistant Professor Ph.D (SOA University) bichitranandaparida@soauniversity.ac.in", "Assistant Professor Ph.D (IOP, Bhubaneswar) shesanshupal@soauniversity.ac.in", "Assistant Professor Ph.D (PRL, Ahmadabad) sudhanwapatra@soauniversity.ac.in", "Senior Lecturer M.Phil (Sambalpur University) nachiketasharma@soauniversity.ac.in", "Junior Research Fellow shaktiacharya@soauniversity.ac.in", "Research Scholar", "Junior Research Fellow chakradharbehera@soauniversity.ac.in", "Research Scholar" };
    private boolean[] mExpanded = new boolean[23];
    private String[] mTitles = { "Prof. Purendra Charan Dash", "Prof. Ram Narayan Prasad Choudhury", "Prof. Subodha Mishra", "Dr. Sushanta Kumar Kamilla", "Dr. (Mrs) Jyotirmayee Nanda", "Dr. Venkata Rama Rao Medicherla", "Dr. (Mrs) Jyoshnarani Mohapatra", "Dr. Rajanikanta Parida", "Mrs. Pragyan Mohanty", "Mrs. Ranjita Mahapatra", "Mr. Kamal Lochan Mohanta", "Mr. Santosh Kumar Parida", "Dr. Rabinarayan Panda", "Dr. Dilip Kumar Mishra", "Dr. Rajib Padhee", "Dr. Bichitrananda Parida", "Dr. Shesanshu Sekhar Pal", "Dr. Sudhanwa Patra", "Mr. Nachiketa Khamari Sharma", "Mr. Shakti Shankar Acharya", "Mrs. Jyotsna Rout", "Mr. Chakradhar Behera", "Mrs. Trupti Acharya" };
    
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
        return new FPHY.SpeechView(FPHY.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FPHY.SpeechView localSpeechView = (FPHY.SpeechView)paramView;
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



