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

public class PolVecAddThree extends ActionBarActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pol_vec_add_three);
		Button drawVector = (Button)findViewById(R.id.btnDrawVect);
		drawVector.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				double r1,r2,r3,a1,a2,a3;
				EditText iR1 = (EditText)findViewById(R.id.inputRadius1);
				r1= Double.parseDouble(iR1.getText().toString());
				EditText iA1 = (EditText)findViewById(R.id.inputAngle1);
				a1=Double.parseDouble(iA1.getText().toString());
				EditText iR2 = (EditText)findViewById(R.id.inputRadius2);
				r2= Double.parseDouble(iR2.getText().toString());
				EditText iA2 = (EditText)findViewById(R.id.inputAngle2);
				a2=Double.parseDouble(iA2.getText().toString());
				EditText iR3 = (EditText)findViewById(R.id.inputRadius3);
				r3= Double.parseDouble(iR3.getText().toString());
				EditText iA3 = (EditText)findViewById(R.id.inputAngle3);
				a3=Double.parseDouble(iA3.getText().toString());
				addVectors.addThreePolar(r1,a1,r2,a2,r3,a3);
				
				Intent myIntent = new Intent(PolVecAddThree.this, DisplayPolarVectorAddtionThree.class);
				PolVecAddThree.this.startActivity(myIntent);
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pol_vec_add, menu);
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
