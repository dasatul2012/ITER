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

public class FCE
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
    private String[] mDialogue = { "Professor PH.D, IIT,Roorkee joygopaljena@soauniversity.ac.in", "Associate Professor & (HOD) M.E., Ph.D manasdas@soauniversity.ac.in", "Associate Professor Ph.D, IIT Kharagpur kishorpanda@soauniversity.ac.in", "Associate Professor Ph.D, KIIT University akshayasabat@soauniversity.ac.in", "Associate Professor M.E. subratrout@soauniversity.ac.in", "Associate Professor M.E. bidyadharbasa@soauniversity.ac.in", "Assistant Professor M.E., Ph.D, BPUT, Bhubaneswar dillipghose@soauniversity.ac.in", "Assistant Professor M.Tech chittaranajanpanda@soauniversity.ac.in", "Assistant Professor M.E., GITAM University trilochanajena@soauniversity.ac.in", "Assistant Professor M.Tech nibeditapradhan@soauniversity.ac.in", "Assistant Professor M.E. sukantirout@soauniversity.ac.in", "Assistant Professor M.Tech bidulabose@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University swetapadma@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela itishreemishra@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Warrangal swetalinanath@soauniversity.ac.in", "Assistant Professor M.Tech., VSSUT Burla larensatpathy@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela benazeersultana@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University priyadarshidas@soauniversity.ac.in", "Assistant Professor M.Tech., CET sushreeroutray@soauniversity.ac.in", "Assistant Professor M.Tech., IIT Guwahati madhulishapattanaik@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela alokpatel@soauniversity.ac.in", "Assistant Professor Ph.D, University of New Orleans prabhuprasaddas@soauniversity.ac.in", "Professor laxmidharkar@soauniversity.ac.in", "Assistant Professor debashsishkar@soauniversity.ac.in", "Assistant Professor janhabimeher@soauniversity.ac.in", "Assistant Professor Ph.D IIT Bhubaneswar akshayakumarverma@soauniversity.ac.in" };
    private boolean[] mExpanded = new boolean[26];
    private String[] mTitles = { "Prof. Joygopal Jena", "Dr. Manas Ranajan Das", "Dr. Kishore Chandra Panda", "Dr. Akshaya Kumar Sabat", "Mr. Subrat Kumar Rout", "Mr. Bidyadhar Basa", "Dr. Dilip Kumar Ghose", "Mr. Chitaranjan Panda", "Mr. Trilochana Jena", "Mrs. Nebedita Pradhan", "Mrs. Sukani Rout", "Mrs.Bidula Bose", "Mrs. Swetapadma Panda", "Ms. Itishree Mishara", "Ms. Swetalina Nath", "Ms. Laren Satpathy", "Ms. Benazeer Sultana", "Mr. Priyadarshi Das", "Mrs. Sushree Sangita Routray", "Mrs. Madhulisa Pattanaik", "Mr. Alok Patel", "Dr. Prabhu Prasad Das", "Laxmidhar Kar", "Debashish Kar", "Janhabi Meher", "Akshaya Kumar Verma" };
    
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
        return new FCE.SpeechView(FCE.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FCE.SpeechView localSpeechView = (FCE.SpeechView)paramView;
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



