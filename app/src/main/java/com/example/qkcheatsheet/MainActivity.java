package com.example.qkcheatsheet;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.qkcheatsheet.common.CategoryAdapter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new CategoryAdapter(getSupportFragmentManager()));

        TabLayout tablayout = findViewById(R.id.tab_layout);
        tablayout.setupWithViewPager(viewPager);

    }

}
