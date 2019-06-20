package com.ds.example.mypersonalproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

import net.daum.mf.map.api.MapView;

public class MapActivity extends Activity {

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_map);
        MapView mapview = new MapView(this) ;
        ViewGroup mapViewContainer = findViewById(R.id.map_view) ;
        mapViewContainer.addView(mapview) ;
    }
    }