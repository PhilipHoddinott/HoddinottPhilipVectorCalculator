package com.example.vectorcalculator;

import miscFiles.addVectors;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayCartVectorAddtionThree extends ActionBarActivity {
	public double oX1=addVectors.oldX1;
	public double oY1=addVectors.oldY1;
	public double oX2=addVectors.oldX2;
	public double oY2=addVectors.oldY2;
	public double oX3=addVectors.oldX3;
	public double oY3=addVectors.oldY3;
	public double X = addVectors.newX;
	public double Y = addVectors.newY;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_cart_vector_addtion_three);
		
		TextView v1 = (TextView)findViewById(R.id.Vect1);
		TextView v2 = (TextView)findViewById(R.id.vect2);
		TextView v3 = (TextView)findViewById(R.id.vect3);
		TextView vf = (TextView)findViewById(R.id.newVect);
		v1.setText("x= "+oX1+ "y= "+oY1);
		v2.setText("x= "+oX1+ "y= "+oY1);
		v3.setText("x= "+oX1+ "y= "+oY1);
		vf.setText("new vector x= +"+X+" y= "+Y);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_cart_vector_addtion_three,
				menu);
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
