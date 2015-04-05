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

public class FEIE
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
    private String[] mDialogue = { "Professor & Dean PGPh.D., Optics, IIT Delhigourangabose@soauniversity.ac.in", "ProfessorB.Sc Engg.., M.Tech., IIT Kharagpurrndaschoudhury@soauniversity.ac.in", "Associate Professor & HODPh.D., Jadavpur Universiy, Kolkatagurumishra@soauniversity.ac.in", "Associate ProfessorPh.D, IIT Kharagpursukantsabut@soauniversity.ac.in", "Assistant ProfessorPh.D., NTU, Singapore, PDF, NUS, Singaporesatyanarayanbhuyan@soauniversity.ac.in", "Assistant ProfessorM.Techgourimishra@soauniversity.ac.in", "Assistant ProfessorM.Tech., IIT, Kharagpurkumarbiswal@soauniversity.ac.in", "Assistant ProfessorM.E., VSSUTshubhendusarangi@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitysaumendramohanty@soauniversity.ac.in", "Assistant ProfessorM.Tech., BPUTpriyabratapattanaik@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universityfaridaali@soauniversity.ac.in", "Assistant ProfessorM.Tech., BPUTdurgakar@soauniversity.ac.in", "Assistant ProfessorM.Tech., NIT Warangalmanoranjandas@soauniversity.ac.in", "Assistant ProfessorM.Techmanojnaik@soauniversity.ac.in", "Assistant ProfessorM.Tech., VSSUT Burlasunitasarangi@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitylaxmipriyasamal@soauniversity.ac.in", "Assistant ProfessorM.Tech., BPUTbiswaranjanswain@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universityaryatripathy@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitylimalisahoo@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitysebamaiparija@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitysanjibpradhan@soauniversity.ac.in", "Assistant ProfessorM.Tech., West Bengal Universitysmritigupta@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitysubhaluxmisahoo@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitysatyaprakashdas@soauniversity.ac.in", "Assistant ProfessorM.Tech., Manipal Universityaneeshwunnava@soauniversity.ac.in", "Assistant ProfessorM.Tech., JUETsiddharthsahany@soauniversity.ac.in", "Assistant ProfessorM.Tech, SOA Unviersitypraveennayak@soauniversity.ac.in", "Assistant ProfessorM.Tech, SOA Unviersitydiptipatnaik@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitylaxmipriyasamal@soauniversity.ac.in", "Assistant ProfessorM.Tech., BPUTbiswaranjanswain@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universityaryatripathy@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitylimalisahoo@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitysebamaiparija@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitysanjibpradhan@soauniversity.ac.in", "Assistant ProfessorM.Tech., West Bengal Universitysmritigupta@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitysubhaluxmisahoo@soauniversity.ac.in", "Assistant ProfessorM.Tech., SOA Universitysatyaprakashdas@soauniversity.ac.in", "Assistant ProfessorM.Tech., Manipal Universityaneeshwunnava@soauniversity.ac.in", "Assistant ProfessorM.Tech., JUETsiddharthsahany@soauniversity.ac.in", "Assistant ProfessorM.Tech, SOA Unviersitypraveennayak@soauniversity.ac.in", "Assistant ProfessorM.Tech, SOA Unviersitydiptipatnaik@soauniversity.ac.in" };
    private boolean[] mExpanded = new boolean[41];
    private String[] mTitles = { "Prof. Gouranga Bose", "Prof. R.N. Daschoudhury", "Dr. Guru Prasad Subas Chandra Mishra", "Dr. Sukanta Kumar Sabut", "Dr. Satyanarayan Bhuyan", "Mr. Gouri Shankar Mishra", "Mr. Kumar Biswal", "Mr. Shubendu Kumar Sarangi", "Mr. Saumendra Kumar Mohanty", "Mr. Priyabrata Pattnaik", "Ms. Farida Ashraf Ali", "Mr. Durga Prasanna Kar", "Mr. Manoranjan Das", "Mr. Manoj Kumar Naik", "Mrs. Sunita Sarangi", "Mrs. Laxmipriya Samal", "Mr. Biswaranjan Swain", "Mrs. Arya Tripathy", "Ms. Limali Sahoo", "Ms. Sebamai Parija", "Mr. Sanjib Kumar Pradhan", "Mrs. Smriti Gupta", "Ms. Subhaluxmi Sahoo", "Mr. Satyaprakash Narayan Das", "Mr. Aneesh Wunnava", "Mr. Siddharth Sahany", "Mr. Praveen Priyaranjan Nayak", "Ms. Dipti Patnaik", "Mrs. Laxmipriya Samal", "Mr. Biswaranjan Swain", "Mrs. Arya Tripathy", "Ms. Limali Sahoo", "Ms. Sebamai Parija", "Mr. Sanjib Kumar Pradhan", "Mrs. Smriti Gupta", "Ms. Subhaluxmi Sahoo", "Mr. Satyaprakash Narayan Das", "Mr. Aneesh Wunnava", "Mr. Siddharth Sahany", "Mr. Praveen Priyaranjan Nayak", "Ms. Dipti Patnaik" };
    
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
        return new FEIE.SpeechView(FEIE.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FEIE.SpeechView localSpeechView = (FEIE.SpeechView)paramView;
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



