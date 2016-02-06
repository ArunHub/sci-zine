package arun.sci_zine;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chapters extends ListActivity implements OnItemClickListener {
	
	String items[]={"Ch1-Heredity and Evolution","Ch2-Health and Hygiene","Ch3-My Body","Ch4-Reproduction in Plants","Ch5-Life Processes","Appendix","Glossary","References"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chapters);
		
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
			Intent heredity=new Intent(Chapters.this, Heredity1.class);
			startActivity(heredity);
			break;
		case 1:
			Intent health=new Intent(Chapters.this, Health2.class);
			startActivity(health);
			break;
		case 2:
			Intent mybody=new Intent(Chapters.this, Mybody3.class);
			startActivity(mybody);
			break;
		case 3:
			Intent reproduce=new Intent(Chapters.this, Reproduction4.class);
			startActivity(reproduce);
			break;
		case 4:
			Intent life=new Intent(Chapters.this, Life5.class);
			startActivity(life);
			break;
		
		}
	}

}
