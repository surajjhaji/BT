package com.example.spinnerbar;

import java.util.ArrayList;

import com.example.spinnerbar.R.array;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
	String[] fruits={"[select fruits..]","Apple","Grapes","Mango","Watermelon","Melon","Banana" };
	String[] fruits2={"A1","A2","A3"};
	String[] fruits3={"B1","B2","B3"};
	String[] fruits4={"None"};	
	   
	
	
	Spinner s,s2;
	ArrayAdapter ad,ad2,ad3,ad4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		s=(Spinner)findViewById(R.id.spinner1);
		ad=new ArrayAdapter(this, android.R.layout.select_dialog_item,fruits);
		s.setAdapter(ad);
		
		
		
		s2=(Spinner)findViewById(R.id.spinner2);
		ad3=new ArrayAdapter(this, android.R.layout.select_dialog_item,fruits3);
		s2.setAdapter(ad3);
		
		ad4=new ArrayAdapter(this, android.R.layout.select_dialog_item,fruits4);
		s2.setAdapter(ad4);
		
		if(s.equals("fruits")||fruits.equals("Mango"))
		{
			s2=(Spinner)findViewById(R.id.spinner2);
			ad2=new ArrayAdapter(this, android.R.layout.select_dialog_item,fruits2);
			s2.setAdapter(ad2);
		}else
		{
			s2.equals(ad4);
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
