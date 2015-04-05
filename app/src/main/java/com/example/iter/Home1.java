package com.example.iter;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Home1 extends Activity{


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home1);
		super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		
	}
			public void gallery(View v){
				// TODO Auto-generated method stub
				Intent in =new Intent(Home1.this,Gallery.class);
				startActivity(in);
				
				//Created by Atul Das  

	}
			public void notice(View v){
				// TODO Auto-generated method stub
				Intent in =new Intent(Home1.this,Notice.class);
				startActivity(in);
				
				//Created by Atul Das  

	}public void faculty(View v){
		// TODO Auto-generated method stub
		Intent in =new Intent(Home1.this,Faculty.class);
		startActivity(in);
		
	

}public void student(View v){
	// TODO Auto-generated method stub
	Intent in =new Intent(Home1.this,Student.class);
	startActivity(in);
	


}public void contact(View v){
	// TODO Auto-generated method stub
	Intent in =new Intent(Home1.this,Contact.class);
	startActivity(in);
	


}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// TODO Auto-generated method stub
	MenuInflater inflator=getMenuInflater();
	inflator.inflate(R.menu.menu, menu);
	return true;
}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
	// TODO Auto-generated method stub
if(item.getItemId()==R.id.menu1){
		Home1.this.finish();
	}
	return super.onOptionsItemSelected(item);
}
}
