package com.ds.example.mypersonalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class AboutProject extends AppCompatActivity {

    Toolbar mytoolbar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_project1);

        //툴바
        mytoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mytoolbar) ;
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_category_24dp); //왼쪽	버튼 아이콘


        Button gomap = (Button)findViewById(R.id.gomap);
        gomap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutProject.this, MapActivity.class);
                startActivity(intent); //activity 이동
            }
        });

        Button subject = (Button)findViewById(R.id.subject);
        subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutProject.this, AboutProject2.class);
                startActivity(intent); //activity 이동
            }
        });

    }

    //툴바	메뉴	불러오기
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //툴바	왼쪽	버튼 활성화
        return true; }
    //툴바
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
        Intent intent = new Intent(getApplicationContext(),
                AboutProject.class);
        startActivity(intent);
        break;
        case R.id.toolbar_search:
        Toast.makeText(this, "search",Toast.LENGTH_SHORT).show();
        break;
        case R.id.toolbar_user:
        Toast.makeText(this, "user",Toast.LENGTH_SHORT).show();
        break;
        }
        return true;
    }

}