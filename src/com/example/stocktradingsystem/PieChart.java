package com.example.stocktradingsystem;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PieChart extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pie_chart);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pie_chart, menu);
		return true;
	}

}
