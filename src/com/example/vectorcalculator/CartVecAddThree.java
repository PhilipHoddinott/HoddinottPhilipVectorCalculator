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

public class CartVecAddThree extends ActionBarActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cart_vec_add_three);
		Button drawVector = (Button)findViewById(R.id.btnDrawVector);
		drawVector.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				double x1,x2,x3,y1,y2,y3;
				EditText iX1 = (EditText)findViewById(R.id.inputX1);
				x1= Double.parseDouble(iX1.getText().toString());
				EditText iY1 = (EditText)findViewById(R.id.inputY1);
				y1=Double.parseDouble(iY1.getText().toString());
				EditText iX2 = (EditText)findViewById(R.id.inputX2);
				x2= Double.parseDouble(iX2.getText().toString());
				EditText iY2 = (EditText)findViewById(R.id.inputY2);
				y2=Double.parseDouble(iY2.getText().toString());
				EditText iX3 = (EditText)findViewById(R.id.input1X3);
				x3= Double.parseDouble(iX3.getText().toString());
				EditText iY3 = (EditText)findViewById(R.id.input1Y3);
				y3=Double.parseDouble(iY3.getText().toString());
				
				addVectors.addThreeCart(x1,x2,y1,y2,x3,y3);
				Intent myIntent = new Intent(CartVecAddThree.this, DisplayCartVectorAddtionThree.class);
				CartVecAddThree.this.startActivity(myIntent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cart_vec_add, menu);
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
