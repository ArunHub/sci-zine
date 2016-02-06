package arun.sci_zine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Reproduction4 extends Activity implements OnGestureListener, OnClickListener {
	protected GestureDetector gestureScanner;
	protected ViewFlipper vf;
	TextView pageten,pageeleven,pagetwelve;
	Button right,left;

	private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 180;

	@Override
	public void onCreate(Bundle savedInstanceState){

		super.onCreate(savedInstanceState);

		gestureScanner = new GestureDetector(this);
		setContentView(R.layout.reproduce);
		
		right=(Button) findViewById(R.id.rightswipe);
		left=(Button) findViewById(R.id.leftswipe);
		right.setOnClickListener(this);		
		left.setOnClickListener(this);	

        vf = (ViewFlipper) findViewById(R.id.FlipPages4);
        pageten=(TextView) findViewById(R.id.pageten);
        pageeleven=(TextView) findViewById(R.id.pageeleven);
        pagetwelve=(TextView) findViewById(R.id.pagetwelve);
        page10();
        page11();
        page12();
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

               // Toast.makeText(this.getApplicationContext(), "Left", Toast.LENGTH_SHORT).show();

                vf.showPrevious();

            }else if (e1.getX() < e2.getX() && e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {

              //  Toast.makeText(this.getApplicationContext(), "Right", Toast.LENGTH_SHORT).show();

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
	
	private void page10() {
		// TODO Auto-generated method stub
		InputStream is=this.getResources().openRawResource(R.raw.pageten);
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);    // 2nd arg is buffer size
		
		try{
			String test;
			while (true){
				test=br.readLine();
				// readLine() returns null if no more lines in the file
				if(test==null)
					break;
				pageten.append("\n"+""+test);
			}
			isr.close();
			is.close();
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		pageten.append("\n\n                                                                         [1]");

	}
	

	private void page11() {
		// TODO Auto-generated method stub
		InputStream is=this.getResources().openRawResource(R.raw.pageeleven);
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);    // 2nd arg is buffer size
		
		try{
			String test;
			while (true){
				test=br.readLine();
				// readLine() returns null if no more lines in the file
				if(test==null)
					break;
				pageeleven.append("\n"+""+test);
			}
			isr.close();
			is.close();
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		pageeleven.append("\n\n\n\n\n\n\n                                                                         [2]");
	}

	private void page12() {
		// TODO Auto-generated method stub
		InputStream is=this.getResources().openRawResource(R.raw.pagetwelve);
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);    // 2nd arg is buffer size
		
		try{
			String test;
			while (true){
				test=br.readLine();
				// readLine() returns null if no more lines in the file
				if(test==null)
					break;
				pagetwelve.append("\n"+""+test);
			}
			isr.close();
			is.close();
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		pagetwelve.append("\n\n\n                                                                         [3]");
	}
}