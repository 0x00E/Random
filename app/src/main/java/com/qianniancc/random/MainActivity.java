package com.qianniancc.random;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import java.util.*;

public class MainActivity extends Activity 
{
	
	
	private TextView tv=null;
	private Random r=new Random();
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    	tv=findViewById(R.id.mainTextView);
		
	}
	
	public void random(View view){
		tv.setText(String.valueOf(r.nextBoolean()));
		
	
	}
	
	
}
