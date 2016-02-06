package arun.sci_zine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HearCh3 extends Activity implements OnInitListener {
	/** Called when the activity is first created. */

	private TextToSpeech tts;
	private Button btnSpeak;
	private TextView txtText;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hearch3);
		tts = new TextToSpeech(this, this);
		btnSpeak = (Button) findViewById(R.id.btnSpeak);
		txtText = (TextView) findViewById(R.id.textView1);
		
		btnSpeak.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				speakOut();
				speakOut1();
				//speakOut2();
			}

		});
	}

	@Override
	public void onDestroy() {
		// Don't forget to shutdown!
		if (tts != null) {
			tts.stop();
			tts.shutdown();
		}
		super.onDestroy();
	}

	public void onInit(int status) {
		// TODO Auto-generated method stub

		if (status == TextToSpeech.SUCCESS) {

			int result = tts.setLanguage(Locale.US);
			
			if (result == TextToSpeech.LANG_MISSING_DATA
					|| result == TextToSpeech.LANG_NOT_SUPPORTED) {
				Toast.makeText(this, "Language not supported", Toast.LENGTH_LONG).show();
				Log.e("TTS", "Language is not supported");
			} else {
				btnSpeak.setEnabled(true);

			}

		} else {
			Log.e("TTS", "Initilization Failed");
		}

	}

	private void speakOut() {
		
		InputStream is=this.getResources().openRawResource(R.raw.pageseven);
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr,4096);    // 2nd arg is buffer size
		
		try{
			String test;
				while (true){
					test=br.readLine();
					// readLine() returns null if no more lines in the file
	
			//String text = txtText.getText().toString();
						if (test.length()!=0) {
						tts.speak(test, TextToSpeech.QUEUE_ADD, null);
						}
	
			}
		}catch(IOException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
			
	
	}
	
private void speakOut1() {
		
		InputStream is=this.getResources().openRawResource(R.raw.pageeight);
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr,4096);    // 2nd arg is buffer size
		
		try{
			String test;
				while (true){
					test=br.readLine();
					// readLine() returns null if no more lines in the file
	
			//String text = txtText.getText().toString();
						if (test.length()!=0) {
						tts.speak(test, TextToSpeech.QUEUE_ADD, null);
						}
	
			}
		}catch(IOException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
			
	
	}
/*private void speakOut2() {
	
	InputStream is=this.getResources().openRawResource(R.raw.pagenine);
	InputStreamReader isr=new InputStreamReader(is);
	BufferedReader br=new BufferedReader(isr,4096);    // 2nd arg is buffer size
	
	try{
		String test;
			while (true){
				test=br.readLine();
				// readLine() returns null if no more lines in the file

		//String text = txtText.getText().toString();
					if (test.length()!=0) {
					tts.speak(test, TextToSpeech.QUEUE_ADD, null);
					}

		}
	}catch(IOException e){
		e.printStackTrace();
	}catch(NullPointerException e){
		e.printStackTrace();
	}
		

}*/
}