package com.example.listimageview;

import java.util.zip.Inflater;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
ListView l1;
ArrayAdapter ad;
String cart[]={"Index1","Index2","Index3","Index4"};
int [] img={R.drawable.index1,R.drawable.index2,R.drawable.index3,R.drawable.index4};
ImageView i1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		l1=(ListView)findViewById(R.id.listView1);
		ad=new ArrayAdapter(getBaseContext(), R.layout.image_item,R.id.textView1,cart);
		l1.setAdapter(ad);
		CustomAdapter cad=new CustomAdapter();
		l1.setAdapter(cad);
	}
	
class CustomAdapter extends BaseAdapter
{

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return img.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		arg1=getLayoutInflater().inflate(R.layout.image_item,null);
		
		i1=(ImageView)arg1.findViewById(R.id.imageView1);
		TextView t1=(TextView)arg1.findViewById(R.id.textView1);
		i1.setImageResource(img[arg0]);
		t1.setText(cart[arg0]);
		return arg1;
	}
	
	}
}
