package com.example.vectorcalculator;

import miscFiles.addVectors;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TwoVectorAdd extends ActionBarActivity {
	public double x1=addVectors.newX;
	public double y1=addVectors.newY;
	public double oX1=addVectors.oldX1;
	public double oY1=addVectors.oldY1;
	public double oX2=addVectors.oldX2;
	public double oY2=addVectors.oldY2;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two_vector_add);
		TextView v1 = (TextView)findViewById(R.id.vector1);
		TextView v2 = (TextView)findViewById(R.id.vector2);
		TextView vf = (TextView)findViewById(R.id.newVector);
		v1.setText("x= "+oX1+" y= "+oY1);
		v2.setText("x= "+oX2+" y= "+oY2);
		vf.setText("sum: x= "+x1+" Y= "+y1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.two_vector_add, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
