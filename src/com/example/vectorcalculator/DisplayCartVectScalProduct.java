package com.example.vectorcalculator;

import miscFiles.addVectors;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.example.vectorcalculator.R;

public class DisplayCartVectScalProduct extends ActionBarActivity {
	public double ns=addVectors.newScalar;
	public double oX1=addVectors.oldX1;
	public double oY1=addVectors.oldY1;
	public double oX2=addVectors.oldX2;
	public double oY2=addVectors.oldY2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_cart_vect_scal_product);
		
		TextView v1 = (TextView)findViewById(R.id.vector1);
		TextView v2 = (TextView)findViewById(R.id.vector2);
		TextView vf = (TextView)findViewById(R.id.labelPolSacProduct);
		v1.setText("x= "+oX1+" y= "+oY1);
		v2.setText("x= "+oX2+" y= "+oY2);
		
		vf.setText("Scalar product= "+ns);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_cart_vect_scal_product, menu);
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
