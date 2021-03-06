package com.example.vectorcalculator;

import miscFiles.addVectors;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DispPolScalProd extends ActionBarActivity {
	public double x1=addVectors.newScalar;
	public double oX1=addVectors.oldR1;
	public double oY1=addVectors.oldA1;
	public double oX2=addVectors.oldR2;
	public double oY2=addVectors.oldA2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_disp_pol_scal_prod);
		TextView v1 = (TextView)findViewById(R.id.vector1);
		TextView v2 = (TextView)findViewById(R.id.vector2);
		TextView vf = (TextView)findViewById(R.id.labelPolSacProduct);
		v1.setText("radius= "+oX1+" angle= "+oY1);
		v2.setText("radius= "+oX2+" angle= "+oY2);
		vf.setText("Scalar ="+x1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(com.example.vectorcalculator.R.menu.disp_pol_scal_prod, menu);
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
