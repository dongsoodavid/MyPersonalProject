package com.ds.example.mypersonalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3 ;
    private Button gomap ;
    private Button btn_1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button)findViewById(R.id.btn_1) ;
        btn2 = (Button)findViewById(R.id.btn_2) ;
        btn3 = (Button)findViewById(R.id.btn_3) ;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction() ;
                Fragment1 fragment1 = new Fragment1() ;
                transaction.replace(R.id.frame, fragment1) ;
                transaction.commit();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction() ;
                Fragment2 fragment2 = new Fragment2() ;
                transaction.replace(R.id.frame, fragment2) ;
                transaction.commit();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction() ;
                Fragment3 fragment3 = new Fragment3() ;
                transaction.replace(R.id.frame, fragment3) ;
                transaction.commit();

            }
        });


//        gomap = findViewById(R.id.gomap) ;
//        gomap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, MapActivity.class) ;
//                startActivity(intent) ; //activity 이동
//            }
//        });


    }
}

