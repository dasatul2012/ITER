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

public class FCSE
  extends ListActivity
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
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
    private String[] mDialogue = { "Associate Dean & Assoc. Professor M.Tech., Ph.D, SOA University alokjagadev@soauniversity.ac.in", "Associate Dean & Professor M.Tech., Ph.D, Jadavpur University srikantapatnaik@soauniversity.ac.in", "Associate Professor & HOD M.S., Ph.D, SOA University binodpattanayak@soauniversity.ac.in", "Associate Professor  M.Tech, Ph.D., SOA University debahutimishra@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT saradapati@soauniversity.ac.in", "Assistant Professor MCA, M.Tech., IIT Bombay chinmayaswain@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT", "Assistant Professor M.Tech., SOA University laxmishreepanigrahi@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University rajashreedash@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur swadhinbarisal@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur sanjayjena@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT trilokpandey@soauniversity.ac.i", "Assistant Professor M.Tech., SOA University manoranjanparhi@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur santoshbehera@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur rashmiranjanmahakud@soauniversity.ac.in", "Assistant Professor M.Tech., Utkal University rashmitaroutray@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Kharagpur satyadas@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University bandanamahapatra@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT sashikalamishra@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT sandeepsatapathy@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University sasmitarout@soauniversity.ac.in", "Assistant Professor B.E., M.Tech., SOA University binitakumari@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University gayatrinayak@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University nibeditajagadev@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University subratnayak@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT prabhatsahu@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT minakhirout@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University shrutimishra@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University bishnupriyapanda@soauniversity.ac.in", "Assistant Professor M.E., Utkal University bhupendragupta@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela srikantasahoo@soauniversity.ac.in", "Assistant Professor B.Tech., MS(Cont.), IISc, Bangalore sabujjena@soauniversity.ac.in", "Assistant Professor M.Tech., Utkal University rashmirekhasahoo@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University mitrabindakhuntia@soauniversity.ac.in", "Assistant Professor M.E., Utkal University siprasahoo@soauniversity.ac.in", "Assistant Professor M.Tech., University of Hydeabad kulamalakumar@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Bhubaneswar ambikamishra@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University swagatikadevi@soauniversity.ac.in", "Assistant Professor M.Tech., Bharat University, Chennai madhurirao@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University saloneemishra@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT samukamohanty@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT shrabaneeswagatika@soauniversity.ac.in", "Assistant Professor M.Tech alakanandatripathy@soauniversity.ac.in", "Assistant Professor M.Tech., KIIT University niranjanpanda@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT smitarath@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University barnalisahu@soauniversity.ac.in", "Assistant Professor M.Tech., IIT, Bhubaneswar biswaranjansenapati@soauniversity.ac.in", "Assistant Professor M.Tech., Ph.D mitrabindaray@soauniversity.ac.in", "Teaching Associate B.Tech" };
    private boolean[] mExpanded = new boolean[49];
    private String[] mTitles = { "Dr. Alok Kumar Jagadev", "Prof. Srikanta Patnaik", "Dr. Binod Kumar Pattanayak", "Dr. Debahuti Mishra", "Mr. Sarada Prasanna Pati", "Mr. Chinmaya Kumar Swain", "Mr. Pandaba Padhan", "Mrs. Laxmishree Panigrahi", "Mrs. Rajashree Dash", "Mr. Swadhin Kumar Barisal", "Mr. Sanjay Kumar Jena", "Mr. Trilok Nath Pandey", "Mr.Manoranjan Parhi", "Mr. Santosh Kumar Behera", "Mr. Rashmiranjan Mahakud", "Mrs. Rashmita Routray", "Mr. Satya Ranjan Das", "Mrs. Bandana Mahapatra", "Mrs. Sashikala Mishra", "Mr. Sandeep Kumar Satapathy", "Mrs. Sasmita Rout", "Mrs. Binita Kumari", "Mrs. Gayatri Nayak", "Mrs. Nibedita Jagadev", "Mr. Subrat Kumar Nayak", "Mr. Prabhat Kumar Sahu", "Mrs. Minakhi Rout", "Mrs. Shruti Mishra", "Mrs. Bishnupriya Panda", "Mr. Bhupendra Kumar Gupta", "Mr. Srikanta Kumar Sahoo", "Mr. Sabuj Kumar Jena", "Ms. Rashmirekha Sahoo", "Mrs. Mitrabinda Khuntia", "Ms. Sipra Sahoo", "Mr. Kulamala Vinod Kumar", "Mr. Ambika Prasad Mishra", "Ms. Swagatika Devi", "Ms. Madhuri Rao", "Ms. Salonee Mishra", "Ms. Samuka Mohanty", "Ms. Shrabanee Swagatika", "Mrs.Alakananda Tripathy", "Mr. Niranjan Panda", "Mrs. Smita Rath", "Mrs. Barnali Sahu", "Mr. Biswaranjan Senapati", "Dr. Mitrabinda Ray", "Ms. Arjita Mishra" };
    
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
        return new FCSE.SpeechView(FCSE.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FCSE.SpeechView localSpeechView = (FCSE.SpeechView)paramView;
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



