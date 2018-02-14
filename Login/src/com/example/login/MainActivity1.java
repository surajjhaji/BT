package com.example.login;

import com.example.login.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity1, menu);
		return true;
	}
	 public void onButtonclick(View v)
	    {
	    	EditText e1=(EditText)findViewById(R.id.editText1);
	    	EditText e2=(EditText)findViewById(R.id.editText2);
	        TextView t1=(TextView)findViewById(R.id.editText3);
	        int num1=Integer.parseInt(e1.getText().toString());
	        int num2=Integer.parseInt(e2.getText().toString());
	        int sum=num1+num2;
	        t1.setText(Integer.toString(sum));
	    }

}
