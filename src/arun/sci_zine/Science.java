package arun.sci_zine;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Science extends Activity{

	Button read,audio,search,test;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.science);
		read=(Button) findViewById(R.id.read);
		Typeface font=Typeface.createFromAsset(getAssets(), "fonts/SCHOOL RAINBOW.TTF");
		//((TextView) findViewById(R.id.textView1)).setTypeface(font);
		read.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent third_activity=new Intent(Science.this, Chapters.class);
				startActivity(third_activity);
			}
		});
		audio=(Button) findViewById(R.id.audio);
		Typeface font2=Typeface.createFromAsset(getAssets(), "fonts/MATURASC.TTF");
		//((TextView) findViewById(R.id.textView2)).setTypeface(font2);
		audio.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent fourth_activity=new Intent(Science.this, audio.class);
				startActivity(fourth_activity);
			}
		});
		search=(Button) findViewById(R.id.searchResult);
		final EditText google=(EditText) findViewById(R.id.websearch);
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String takeInput=google.getText().toString();
				Intent intent=new Intent(Intent.ACTION_WEB_SEARCH);
				intent.putExtra(SearchManager.QUERY	,takeInput);
				startActivity(intent);
			}
		});
		
		test=(Button) findViewById(R.id.btntest);
		test.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent t=new Intent(Science.this,Testchap.class);
				startActivity(t);
			}
		});
	}

	
}
