package com.example.autocomplete;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
	AutoCompleteTextView a;
	String[] fruits=
		{"Apple","Grapes","Mango","Watermelon","Melon","Banana"
	    };
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		a=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
		ArrayAdapter b=new ArrayAdapter(this, android.R.layout.select_dialog_item,fruits);
		a.setThreshold(1);
		a.setAdapter(b);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
