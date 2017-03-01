package com.kwang.clickmeplz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SimpleButtonActivity extends Activity implements OnClickListener {

	TextView textview;
	Button button;
	boolean clickToggle;
	int clickCount;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_button);
		textview = (TextView) findViewById(R.id.textView1);
		textview.setText("Text Changed");
		button =(Button) findViewById(R.id.button1);
		button.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.simple_button, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
//		if(clickToggle){
//			textview.setText("you have clicked on button");
//		}
//		else
//		{
			Intent intent = new Intent(SimpleButtonActivity.this, ColorsActivity.class);
	        startActivity(intent);
//		}
//		
//		clickToggle = !clickToggle;
//		 clickCount++;
//         
//		 textview.setText("You have clicked "+clickCount+" times");
	}

}
