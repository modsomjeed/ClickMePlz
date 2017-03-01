package com.kwang.clickmeplz;


import java.util.Random;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint("ResourceAsColor")
public class ColorsActivity extends Activity implements OnClickListener{
	private Button button;
	private Button button1;
	private TextView textview;
	LinearLayout background;
	private int mPressCount;
	int clickCount = 0;
	int count = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_colors);
		textview = (TextView) findViewById(R.id.textView1);
		textview.setText("Text Changed");
		button =(Button) findViewById(R.id.button1);
		button1 =(Button) findViewById(R.id.button2);
		button.setOnClickListener(this);
		button1.setOnClickListener(this);
		background = (LinearLayout) findViewById(R.id.layout);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.colors, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
//			switch () {
//			case value:
//				
//				break;
//
//			default:
//				break;
//			}
		  	Random r = new Random();
		  	int color = r.nextInt(Integer.MAX_VALUE);
			background.setBackgroundColor(color);
			textview.setTextColor(color);
		
		
		
	}

}
