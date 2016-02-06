package arun.sci_zine;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class test5 extends Activity {
	
	Button submit,clear;
	RadioButton r0,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22,r23,r24,r25,r26,r27,r28,r29;
	RadioGroup rg1,rg2,rg3,rg4,rg5,rg6,rg7,rg8,rg9,rg10;
	TextView txtcorrect;
	int counter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chtest5);
	
		submit=(Button) findViewById(R.id.btnsubmit);
		//clear=(Button) findViewById(R.id.btnclear);
		
		r0=(RadioButton) findViewById(R.id.radio0);
		r1=(RadioButton) findViewById(R.id.radio1);
		r2=(RadioButton) findViewById(R.id.radio2);
		r3=(RadioButton) findViewById(R.id.radio3);
		r4=(RadioButton) findViewById(R.id.radio4);
		r5=(RadioButton) findViewById(R.id.radio5);
		r6=(RadioButton) findViewById(R.id.radio6);
		r7=(RadioButton) findViewById(R.id.radio7);
		r8=(RadioButton) findViewById(R.id.radio8);
		r9=(RadioButton) findViewById(R.id.radio9);
		r10=(RadioButton) findViewById(R.id.radio10);
		r11=(RadioButton) findViewById(R.id.radio11);
		r12=(RadioButton) findViewById(R.id.radio12);
		r13=(RadioButton) findViewById(R.id.radio13);
		r14=(RadioButton) findViewById(R.id.radio14);
		r15=(RadioButton) findViewById(R.id.radio15);
		r16=(RadioButton) findViewById(R.id.radio16);
		r17=(RadioButton) findViewById(R.id.radio17);
		r18=(RadioButton) findViewById(R.id.radio18);
		r19=(RadioButton) findViewById(R.id.radio19);
		r20=(RadioButton) findViewById(R.id.radio20);
		
		rg1=(RadioGroup) findViewById(R.id.radioGroup1);
		rg2=(RadioGroup) findViewById(R.id.radioGroup2);
		rg3=(RadioGroup) findViewById(R.id.radioGroup3);
		rg4=(RadioGroup) findViewById(R.id.radioGroup4);
		rg5=(RadioGroup) findViewById(R.id.radioGroup5);
		rg6=(RadioGroup) findViewById(R.id.radioGroup6);
		rg7=(RadioGroup) findViewById(R.id.radioGroup7);
		rg8=(RadioGroup) findViewById(R.id.radioGroup8);
		rg9=(RadioGroup) findViewById(R.id.radioGroup9);
		rg10=(RadioGroup) findViewById(R.id.radioGroup10);
		
		
		txtcorrect=(TextView) findViewById(R.id.displaycorrect);
		
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int select1=rg1.getCheckedRadioButtonId();
				int select2=rg2.getCheckedRadioButtonId();
				int select3=rg3.getCheckedRadioButtonId();
				int select4=rg4.getCheckedRadioButtonId();
				int select5=rg5.getCheckedRadioButtonId();
				int select6=rg6.getCheckedRadioButtonId();
				int select7=rg7.getCheckedRadioButtonId();
				int select8=rg8.getCheckedRadioButtonId();
				int select9=rg9.getCheckedRadioButtonId();
				int select10=rg10.getCheckedRadioButtonId();
				
				if(select1==R.id.radio0){
					//Toast.makeText(MainActivity.this, "correct answer", Toast.LENGTH_SHORT).show();
					txtcorrect.setText("1.a) ,");
					counter++;
				}else{
					//Toast.makeText(MainActivity.this, "wrong answer", Toast.LENGTH_SHORT).show();
				}
				if(select2==R.id.radio5){
					//Toast.makeText(MainActivity.this, "correct answer", Toast.LENGTH_SHORT).show();
					txtcorrect.append("2.c) ,");counter++;
				}else{
					//Toast.makeText(MainActivity.this, "wrong answer", Toast.LENGTH_SHORT).show();
				}
				
				if(select3==R.id.radio7){
					txtcorrect.append("3.b) ,");counter++;
				}
				
				if(select4==R.id.radio9){
					txtcorrect.append("4.a) ,");counter++;
				}
				
				if(select5==R.id.radio13){
					txtcorrect.append("5.b) ,");counter++;
				}
				
				if(select6==R.id.radio17){
					txtcorrect.append("6.c) ,");counter++;
				}
				
				if(select7==R.id.radio18){
					txtcorrect.append("7.a) ,");counter++;
				}
				
				if(select8==R.id.radio22){
					txtcorrect.append("8.b) ,");counter++;
				}
				
				if(select9==R.id.radio26){
					txtcorrect.append("9.c) ,");counter++;
				}
				
				if(select10==R.id.radio27){
					txtcorrect.append("10.a) ,");counter++;
				}
				
				txtcorrect.append("Correct answers are :"+counter+"\n Other answers are wrong");
			}
		});   
	}

}