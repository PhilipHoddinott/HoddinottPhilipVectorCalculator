package com.example.vectorcalculator;

import miscFiles.addVectors;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayPolarVectorAddtionThree extends ActionBarActivity {
	public double x1=addVectors.newRadius;
	public double y1=addVectors.newAngle;
	public double oX1=addVectors.oldR1;
	public double oY1=addVectors.oldA1;
	public double oX2=addVectors.oldR2;
	public double oY2=addVectors.oldA2;
	public double oX3=addVectors.oldR3;
	public double oY3=addVectors.oldA3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_polar_vector_addtion_three);
		TextView v1 = (TextView)findViewById(R.id.Vect1);
		TextView v2 = (TextView)findViewById(R.id.vect2);
		TextView v3 = (TextView)findViewById(R.id.vect3);
		TextView vf = (TextView)findViewById(R.id.newVectP);
		v1.setText("radius= "+oX1+" angle= "+oY1);
		v2.setText("radius= "+oX2+" angle= "+oY2);
		v3.setText("radius= "+oX3+" angle= "+oY3);
		vf.setText("sum: radius = "+x1+" angle= "+y1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_polar_vector_addtion_three,
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
