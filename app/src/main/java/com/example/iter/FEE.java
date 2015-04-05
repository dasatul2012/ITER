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

public class FEE
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
    private String[] mDialogue = { "Professor Ph.D Kerala University bijanbeharidas@soauniversity.ac.in", "Professor Ph.D smaransanyal@soauniversity.ac.in", "Professor M.Tech., M.S., Lowa State University, USA brajabasisahu@soauniversity.ac.in", "Professor ME, Allahabad University, UP sankarsanrauta@soauniversity.ac.in", "Associate Professor & HOD M.Tech., Ph.D., IIT Kharagpur sanjeebkar@soauniversity.ac.in", "Associate Professor Ph.D krushnamohapatra@soauniversity.ac.in", "Associate Professor M.E., M.Tech. subhendupati@soauniversity.ac.in", "Associate Professor M.E., IISc., Bangalore amarnanda@soauniversity.ac.in", "Associate Professor M.E., B.E.C., Calcutta pradipmohanty@soauniversity.ac.in", "Associate Professor M.Tech., VSSUT Burla manasnayak@soauniversity.ac.in", "Assistant Professor M.E., VSSUT nakulsahu@soauniversity.ac.inAssistant Professor M.Tech., IIT, Kharagpur shantimishra@soauniversity.ac.in", "Assistant Professor binodsahu@soauniversity.ac.in", "Assistant Professor M.Tech., KIIT University tapasmohapatra@soauniversity.ac.in", "Assistant Professor M.Tech., Jadavpur University dipakswain@soauniversity.ac.in", "Assistant Professor M.Tech., IIT Bombay msrivalli@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT ramachandraagrawal@soauniversity.ac.in", "Assistant Professor M.Tech., S.V. University, Tirupati rameshpakki@soauniversity.ac.in", "Assistant Professor M.Tech amiyanaik@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University debiprasannadas@soauniversity.ac.in", "Assistant Professor M.Tech., NIT Rourkela swagatpati@soauniversity.ac.in", "Assistant Professor M.Tech., IIT Roorkee basantapanigrahi@soauniversity.ac.in", "Assistant Professor M.Tech. Jadapur University nimaipatel@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University tarakantajena@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University jyotipadhi@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University narendrajena@soauniversity.ac.in", "Assistant Professor M.Tech., KIIT University narayannahak@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University shubhranshuparida@soauniversity.ac.in", "Assistant Professor M.Tech debashissitikantha@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University manojdebanath@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University smrutipatanaik@soauniversity.ac.in", "Assistant Professor M.Tech., KIIT University benazeerbegum@soauniversity.ac.in", "Lecturer B.Tech., BPUT kumarikasturi@soauniversity.ac.in", "Assistant Professor B.E., M.Tech., SOA University sabitatripathy@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT subhadrasahoo@soauniversity.ac.in", "Assistant Professor M.Tech., SOA University Pravatinayak@soauniversity.ac.in", "Assistant Professor B.E., M.Tech gayatrimohapatra@soauniversity.ac.in", "Assistant Professor M.Tech., BPUT manjitsingh@soauniversity.ac.in", "Assistant Professo M.Tech., VSSUT Burla geetanjalidei@soauniversity.ac.in", "Assistant Professor B.E., M.Tech., IIT BHU debasishmishra@soauniversity.ac.in", "Research Associate M.Tech., VSSUT Burla sankalpabohidar@soauniversity.ac.in", "Professor Ph.D., D.Sc., Utkal University pkdash@soauniversity.ac.in", "Professor multimedia University, Malaysia", "Assistant Professor M.Tech deepakbehera@soauniversity.ac.in", "Research Professor Ph.D, Ingrys, Green Bay, Winsconsin, USA", "Research Associate shubhasmitapati@soauniversity.ac.in" };
    private boolean[] mExpanded = new boolean[56];
    private String[] mTitles = { "Dr. Bijan Behari Das", "Prof. Smaran Kumar Sanayal", "Prof. Sankarsan Rauta", "Dr. Sanjeeb Kumar Kar", "Dr. Krushna Kesaba Mohapatra", "Prof. Subhendu Pati", "Prof. Amar Bijaya Nanda", "Prof. Pradeep Kumar Mohanty", "Prof. Manas Ranjan Nayak", "Mr. Nakul Charan Sahu", "Ms. Shanti Mishra", "Mr. Binod Kumar Sahoo", "Mr. Tapas Kumar Mohapatra", "Mr. Dipak Ranjan Swain", "Mrs. M. Srivali", "Mr. Ramachandra Agrawal", "Mr. Ramesh Pakki", "Mr. Amiya Kumar Naik", "Mr. Debiprasanna Das", "Mr. Swagat Pati", "Mr. Basanta Kumar Panigrahi", "Mr. Nimai Charan Patel", "Mr. Tarakanta Jena", "Mr. Jyoti Ranjan Padhi", "Mr. Narendra Kumar Jena", "Mr. Narayan Nahak", "Mr. Shubhranshu Mohan Parida", "Mr. Debashis Sitikantha", "Mr. Manoj Kumar Debanath", "Ms. Smruti Rekha Patanaik", "Ms. Benazeer Begum", "Ms. Kumari Kasturi", "Ms. Sabita Tripathy", "Ms. Subhadra Sahoo", "Ms. Pravati Nayak", "Ms. Gayatri Mohapatra", "Mr. Manjit Bahadur Singh", "Mrs.Geetanjali Dei", "Mr. Debasish Mishra", "Ms. Sankalpa Bohidar", "Prof. P.K. Dash", "Dr. Naeem Hannoon", "Mr. Deepak Narayan Behera", "Prof. Durga Prasad Kar", "Ms. Shubhasmita Pati" };
    
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
        return new FEE.SpeechView(FEE.this, this.mContext, this.mTitles[paramInt], this.mDialogue[paramInt], this.mExpanded[paramInt]);
      }
      FEE.SpeechView localSpeechView = (FEE.SpeechView)paramView;
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


