package arun.sci_zine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Heredity1 extends Activity implements OnGestureListener, OnClickListener {

	protected GestureDetector gestureScanner;
	protected ViewFlipper vf;
	TextView pageone,pagetwo,pagethree;
	Button right,left;

	private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 80;

	@Override
	public void onCreate(Bundle savedInstanceState){

		super.onCreate(savedInstanceState);

		gestureScanner = new GestureDetector(this);
		setContentView(R.layout.heredity);
		right=(Button) findViewById(R.id.rightswipe);
		left=(Button) findViewById(R.id.leftswipe);
		right.setOnClickListener(this);		
		left.setOnClickListener(this);		

        vf = (ViewFlipper) findViewById(R.id.FlipPages1);
        pageone=(TextView) findViewById(R.id.pageone);
        pagetwo=(TextView) findViewById(R.id.pagetwo);
        pagethree=(TextView) findViewById(R.id.pagethree);
        page1();
        page2();
        page3();
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0==right){
			vf.showNext();
		}else if(arg0==left){
			vf.showPrevious();
		}
	}

	@Override
	public boolean onTouchEvent(MotionEvent me){

		return gestureScanner.onTouchEvent(me);

	}
	public boolean onDown(MotionEvent e){

		return true;

	}

	public boolean onFling(MotionEvent e1,MotionEvent e2,float velocityX,float velocityY){
		try {

            if(e1.getX() > e2.getX() && Math.abs(e1.getX() - e2.getX()) > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {

                //Toast.makeText(this.getApplicationContext(), "Left", Toast.LENGTH_SHORT).show();

                vf.showPrevious();

            }else if (e1.getX() < e2.getX() && e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {

                //Toast.makeText(this.getApplicationContext(), "Right", Toast.LENGTH_SHORT).show();

                vf.showNext();

            }
        } catch (Exception e) {

            // nothing
        }
        return true;
	}
	public void onLongPress(MotionEvent e){}
	public boolean onScroll(MotionEvent e1,MotionEvent e2,float distanceX,float distanceY){
		return true;
	}
	public void onShowPress(MotionEvent e){}
	public boolean onSingleTapUp(MotionEvent e){ return true;}
	
	private void page1() {
		// TODO Auto-generated method stub
		InputStream is=this.getResources().openRawResource(R.raw.pageone);
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);    // 2nd arg is buffer size
		
		try{
			String test;
			while (true){
				test=br.readLine();
				// readLine() returns null if no more lines in the file
				if(test==null)
					break;
				pageone.append("\n"+""+test);
			}
			isr.close();
			is.close();
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		pageone.append("\n\n\n                                                                         [1]");

	}
	

	private void page2() {
		// TODO Auto-generated method stub
		InputStream is=this.getResources().openRawResource(R.raw.pagetwo);
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);    // 2nd arg is buffer size
		
		try{
			String test;
			while (true){
				test=br.readLine();
				// readLine() returns null if no more lines in the file
				if(test==null)
					break;
				pagetwo.append("\n"+""+test);
			}
			isr.close();
			is.close();
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		pagetwo.append("\n\n\n                                                                         [2]");
	}

	private void page3() {
		// TODO Auto-generated method stub
		InputStream is=this.getResources().openRawResource(R.raw.pagethree);
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);    // 2nd arg is buffer size
		
		try{
			String test;
			while (true){
				test=br.readLine();
				// readLine() returns null if no more lines in the file
				if(test==null)
					break;
				pagethree.append("\n"+""+test);
			}
			isr.close();
			is.close();
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		pagethree.append("\n\n                                                                         [3]");
	}

	
}
