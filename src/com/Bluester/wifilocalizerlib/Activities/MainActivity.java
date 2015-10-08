package com.Bluester.wifilocalizerlib.Activities;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

import com.Bluester.wifilocalizerlib.Activities.*; 

public class MainActivity extends LocateMeActivity {
 
	@Override
	public void onLocationChanged(String location) {
		
		//display location
		Toast t = Toast.makeText(this.getApplicationContext(), "Location: " + location,Toast.LENGTH_SHORT);
		t.setGravity(Gravity.CENTER, 0, 0);
		t.show();	  
		Log.d("LOCATION", "LOCATION: " + location);
		
		//call locate me again
        this.locateMe();
	}
	
	
   @Override
   public void onCreate(Bundle savedInstanceState) {
	   
    	//theme
    	this.setTheme(android.R.style.Theme_Black);        
	   
	    //super
        super.onCreate(savedInstanceState);
        
        // ModelBuildingActivity by button
        
        // WifiLocalizerPrefActivity  by button
        
        // DataCollectionReciever by button
       
        
        //start first locate me
        this.locateMe();														
   }
}
