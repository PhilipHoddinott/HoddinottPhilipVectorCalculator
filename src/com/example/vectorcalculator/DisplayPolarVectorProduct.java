package com.example.vectorcalculator;

import miscFiles.addVectors;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayPolarVectorProduct extends ActionBarActivity {

	public double oR1=addVectors.oldR1;
	public double oA1=addVectors.oldA1;
	public double oR2=addVectors.oldR2;
	public double oA2=addVectors.oldA2;
	public double ns=addVectors.newCross;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_polar_vector_product);
		TextView v1 = (TextView)findViewById(R.id.vector1);
		TextView v2 = (TextView)findViewById(R.id.vector2);
		TextView vf = (TextView)findViewById(R.id.labelVecProduct);
		v1.setText("radius= "+oR1+" angle= "+oA1);
		v2.setText("radius= "+oR2+" angle= "+oA2);
		vf.setText("Cross product= "+ns);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_polar_vector_product, menu);
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
