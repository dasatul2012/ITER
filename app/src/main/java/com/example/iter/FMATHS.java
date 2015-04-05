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

public class FMATHS
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
    private String[] mDialogue = { "ProfessorPh.D., Utkal Universitybishnuacharya@soauniversity.ac.in", "ProfessorPh.D., Utkal Universitymiluacharya@soauniversity.ac.in", "Assistant ProfessorM.Sc., Utkal Universitysanjaybehera@soauniversity.ac.in", "Assistant ProfessorM.Sc. M.Phil, Alagappa Universityamiyabehera@soauniversity.ac.in", "Assistant ProfessorPh.D., Sambalpur Universitychapalabohidar@soauniversity.ac.in", "Assistant ProfessorPh.D., Berhampur Universitysantilatachampati@soauniversity.ac.in", "ProfessorPh.D., Berhampur Universitysunitachand@soauniversity.ac.in", "Associate ProfessorPh.D., Utkal Universitymanjuladas@soauniversity.ac.in", "ProfessorPh.D., Utkal Universitygourangadash@soauniversity.ac.in", "Associate Professor & HODPh.D, IIT Kharagpurjayantadash@soauniversity.ac.in", "Assistant ProfessorM.A, M.Phil, M.Tech, ISI, Kolkataashisdash@soauniversity.ac.in", "Assistant ProfessorM.Sc, M.Phil, Global Open Universitybibhakarkodamasingh@soauniversity.ac.in", "Assistant ProfessorM.Sc, M.Phil, Ph.D (SOAU)satyaranjanmishra@soauniversity.ac.in", "Professorjcmisra@soauniversity.ac.in", "Assistant ProfessorM.Sc., M.Phil,Ravenshaw Universitybananimohanty@soauniversity.ac.in", "Assistant ProfessorM.Sc, M.Phil, Ph.D (SOAU)satyanandamohapatra@soauniversity.ac.in", "Associate ProfessorPh.D, IIT Kharagpurajayamohapatra@soauniversity.ac.in", "Associate ProfessorPh.D., Utkal Universityjyotinayak@soauniversity.ac.in", "Assistant ProfessorM.Sc, M.Phil, Ph.D (SOAU)mitalinayak@soauniversity.ac.in", "Assistant ProfessorM.Sc., Utkal Universitybimaleshnayak@soauniversity.ac.in", "Assistant ProfessorM.Sc,M.Phil, Utkal Universitykanakalataojha@soauniversity.ac.in", "Assistant ProfessorM.Sc, Utkal Universityrashmiranjanota@soauniversity.ac.in", "Associate ProfessorPh.D., Berhampur Universityanitapanda@soauniversity.ac.in", "Sr. LecturerM.Sc, Berhampur Universitygolakpanda@soauniversity.ac.in", "Assistant ProfessorPh.D., Utkal Universitysampadaparida@soauniversity.ac.in", "Assistant ProfessorM.Sc, M.Phil, Utkal Universitynarmadaranarahu@soauniversity.ac.in", "Assistant ProfessorM.Sc, M.Phil, Utkal Universityanuradhasahoo@soauniversity.ac.in", "Assistant ProfessorM.A, M.Phil, M.Techashoksahoo@soauniversity.ac.in", "Assistant ProfessorPh.D., Utkal Universitysachidanandasahoo@soauniversity.ac.in", "Assistant ProfessorM.Sc, M.Phil, Utkal Universityrajkishoresamal@soauniversity.ac.in", "ProfessorPh.D, M.Ed, AIMEC, UKprasannasatpathy@soauniversity.ac.in", "LecturerM.Sc, Sambalpur Universityramasankartripathy@soauniversity.ac.in" };
    private boolean[] mExpanded = new boolean[32];
    private String[] mTitles = { "Prof. Bishnu Prasanna Acharya", "Prof. Milu Acharya", "Mr. Sanjay Kumar Behera", "Mr. Amiya Kumar Behera", "Dr. Chapala Bohidar", "Dr. Santilata Champati", "Prof. Sunita Chand", "Dr. Manjula Das", "Prof. Gouranga Charan Dash", "Dr. Jayanta Kumar Dash", "Mr. Ashis Dash", "Mr. Bibhakar Kodamasingh", "Dr. Satyaranjan Mishra", "Prof. J.C Misra", "Mrs. Banani Mohanty", "Dr. Satyananda Mohapatra", "Dr. Ajaya Kumar Mohapatra", "Dr. Jyoti Ranjan Nayak", "Dr. Mitali Madhusmita Nayak", "Mr. Bimalesh Nayak", "Mrs. Kanakalata Ojha", "Mr. Rashmiranjan Ota", "Dr. Anita Panda", "Mr. Golak Bihari Panda", "Dr. Sampada Kumar Parida", "Mrs. Narmada Ranarahu", "Mrs. Anuradha Sahoo", "Mr. Ashok Kumar Sahoo", "Dr. Sachidananda Sahoo", "Mr. Rajkishore Samal", "Prof. Prasanna Satpathy", "Mr. Ramasankar Tripathy" };
    
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
        return new FMATHS.SpeechView(FMATHS.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FMATHS.SpeechView localSpeechView = (FMATHS.SpeechView)paramView;
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



