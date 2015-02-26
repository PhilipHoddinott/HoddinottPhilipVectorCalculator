package com.example.vectorcalculator;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button bCartVecAdd = (Button)findViewById(R.id.btnCartVecAddThree);
		bCartVecAdd.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent myIntent = new Intent(MainActivity.this, CartVecAddThree.class);
				MainActivity.this.startActivity(myIntent);
			}
		});
		Button bCartVecAddt = (Button)findViewById(R.id.btnCartVecAddTwo);
		bCartVecAddt.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent myIntent = new Intent(MainActivity.this, CartVecAddTwo.class);
				MainActivity.this.startActivity(myIntent);
			}
		});
		
		Button bCartScalProduct = (Button)findViewById(R.id.btnCartScalProd);
		bCartScalProduct.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent myIntent = new Intent(MainActivity.this, CartScalProduct.class);
				MainActivity.this.startActivity(myIntent);
			}
		});
		Button bCartVecProduct = (Button)findViewById(R.id.btnCartVecProd);
		bCartVecProduct.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent myIntent = new Intent(MainActivity.this, CartVecProduct.class);
				MainActivity.this.startActivity(myIntent);
			}
		});
		Button bPolVecAdd = (Button)findViewById(R.id.btnPolVectAddThree);
		bPolVecAdd.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent myIntent = new Intent(MainActivity.this, PolVecAddThree.class);
				MainActivity.this.startActivity(myIntent);
			}
		}); 
		Button bPolVecAddt = (Button)findViewById(R.id.btnPolVecAddTwo);
		bPolVecAddt.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent myIntent = new Intent(MainActivity.this, PolVecAddTwo.class);
				MainActivity.this.startActivity(myIntent);
			}
		});
		
		Button bPolScalProduct = (Button)findViewById(R.id.btnPolScalProd);
		bPolScalProduct.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent myIntent = new Intent(MainActivity.this, PolScalProduct.class);
				MainActivity.this.startActivity(myIntent);
			}
		});
		Button bPolVecProduct = (Button)findViewById(R.id.btnPolVecProd);
		bPolVecProduct.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent myIntent = new Intent(MainActivity.this, PolVecProduct.class);
				MainActivity.this.startActivity(myIntent);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
