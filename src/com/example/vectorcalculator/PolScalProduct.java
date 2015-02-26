package com.example.vectorcalculator;

import miscFiles.addVectors;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PolScalProduct extends ActionBarActivity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pol_scal_product);
		
		Button drawVector = (Button)findViewById(R.id.btnDrawVect);
		drawVector.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				double r1,a1,r2,a2;
				EditText iR1 = (EditText)findViewById(R.id.inputRadius1);
				r1= Double.parseDouble(iR1.getText().toString());
				EditText iA1 = (EditText)findViewById(R.id.inputAngle1);
				a1=Double.parseDouble(iA1.getText().toString());
				EditText iR2 = (EditText)findViewById(R.id.inputRadius2);
				r2= Double.parseDouble(iR2.getText().toString());
				EditText iA2 = (EditText)findViewById(R.id.inputAngle2);
				a2=Double.parseDouble(iA2.getText().toString());
				
				addVectors.polarVectProduct(r1,a1,r2,a2);
				
				Intent myIntent = new Intent(PolScalProduct.this, DispPolScalProd.class);
				PolScalProduct.this.startActivity(myIntent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pol_scal_product, menu);
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
