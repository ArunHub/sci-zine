package arun.sci_zine;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class audio extends ListActivity implements OnItemClickListener {
	
	String items[]={"Ch1-Heredity and Evolution","Ch2-Health and Hygiene","Ch3-My Body","Ch4-Reproduction in Plants","Ch5-Life Processes","Appendix","Glossary","References"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_audio);
		
		ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
		setListAdapter(aa);
		final ListView lv=getListView();
		lv.setOnItemClickListener(this);
	}
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		switch(arg2){
		case 0:
			Intent audio1=new Intent(audio.this, HearCh1.class);
			startActivity(audio1);
			break;
		case 1:
			Intent audio2=new Intent(audio.this, HearCh2.class);
			startActivity(audio2);
			break;
		case 2:
			Intent audio3=new Intent(audio.this, HearCh3.class);
			startActivity(audio3);
			break;
		case 3:
			Intent audio4=new Intent(audio.this, HearCh4.class);
			startActivity(audio4);
			break;
		case 4:
			Intent audio5=new Intent(audio.this, HearCh5.class);
			startActivity(audio5);
			break;
		
		}
	}

}