package com.ds.example.mypersonalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentTransaction;


public class AboutProject extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_project1);

        Button gomap = (Button)findViewById(R.id.gomap);
        gomap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutProject.this, MapActivity.class);
                startActivity(intent); //activity 이동
            }
        });
    }
}