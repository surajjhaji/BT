package com.example.login;

import com.example.login.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button b1;
	TextView t1,t2,t3;
	EditText e1,e2,e3;
	
	
			  
			 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b1 = (Button)findViewById(R.id.button1);
        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
       
        
    }
    public void click(View v){
    	if(e1.getText().toString().equals("Suraj") && e2.getText().toString().equals("Suraj")|| (e1.getText().toString().equals("Rahul") && e2.getText().toString().equals("Rahul")) || (e1.getText().toString().equals("Karan") && e2.getText().toString().equals("Karan")) )
    	{
    		Toast.makeText(getBaseContext(),"Login Success",Toast.LENGTH_SHORT).show();	
    		
    		Intent intent=new Intent(".MainActivity1");
    		startActivity(intent);
    	}
    	else{
    		Toast.makeText(getBaseContext(),"Try again",Toast.LENGTH_SHORT).show();
    	}
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
