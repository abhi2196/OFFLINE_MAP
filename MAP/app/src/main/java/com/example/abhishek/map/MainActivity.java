package com.example.abhishek.map;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        MapView mapView = new MapView(this, 256); //constructor
        mapView.setClickable(true);
        mapView.setBuiltInZoomControls(true);
        //setContentView(mapView); //displaying the MapView
        mapView.getController().setZoom(15); //set initial zoom-level, depends on your need
        mapView.getController().setCenter(new GeoPoint(12.96, 77.58));
        mapView.setUseDataConnection(false); //keeps the mapView from loading online tiles using network connection.
        TextView myTextView = new TextView(this);
        myTextView.setTextAppearance(this, android.R.style.TextAppearance_Large_Inverse);
        myTextView.setText("Banglore, India");
        myTextView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        //Button myUselessButton = new Button(this);
        //myUselessButton.setText("Click");
        final RelativeLayout relativeLayout = new RelativeLayout(this);
        final RelativeLayout.LayoutParams mapViewLayoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.FILL_PARENT,RelativeLayout.LayoutParams.FILL_PARENT);
        final RelativeLayout.LayoutParams textViewLayoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.FILL_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        final RelativeLayout.LayoutParams buttonLayoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.FILL_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        relativeLayout.addView(mapView, mapViewLayoutParams);
        relativeLayout.addView(myTextView, textViewLayoutParams);
        //relativeLayout.addView(myUselessButton,buttonLayoutParams);
        setContentView(relativeLayout);
    }

}
