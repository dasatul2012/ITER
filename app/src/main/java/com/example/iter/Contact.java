package com.example.iter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Contact
  extends Activity
{
  public void form(View paramView)
  {
    startActivity(new Intent(this, com.example.iter.Inquiry.class));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903043);
    super.setRequestedOrientation(1);
    TextView localTextView1 = (TextView)findViewById(2131165187);
    localTextView1.setText(Html.fromHtml("<b>Website: </b><a href=\"http://soauniversity.ac.in/home/iter\">ITER WEBSITE</a> "));
    localTextView1.setMovementMethod(LinkMovementMethod.getInstance());
    TextView localTextView2 = (TextView)findViewById(2131165189);
    localTextView2.setText(Html.fromHtml("<b>Mail us : </b><a href=\"mailto:info@soauniversity.ac.in\">info@soauniversity.ac.in</a>"));
    localTextView2.setMovementMethod(LinkMovementMethod.getInstance());
  }
}


