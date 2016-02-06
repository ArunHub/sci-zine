package arun.sci_zine;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Testchap extends ListActivity implements OnItemClickListener {
	
	String items[]={"Ch1-Heredity and Evolution","Ch2-Health and Hygiene","Ch3-My Body","Ch4-Reproduction in Plants","Ch5-Life Processes","Appendix","Glossary","References"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		
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
			Intent t1=new Intent(Testchap.this, test1.class);
			startActivity(t1);
			break;
		case 1:
			Intent t2=new Intent(Testchap.this, test2.class);
			startActivity(t2);
			break;
		case 2:
			Intent t3=new Intent(Testchap.this, test3.class);
			startActivity(t3);
			break;
		case 3:
			Intent t4=new Intent(Testchap.this, test4.class);
			startActivity(t4);
			break;
		case 4:
			Intent t5=new Intent(Testchap.this, test5.class);
			startActivity(t5);
			break;
		
		}
	}

}