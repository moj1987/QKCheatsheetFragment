package com.example.qkcheatsheet.common;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.qkcheatsheet.tabs.FoodFragment;
import com.example.qkcheatsheet.tabs.LogoFragment;

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int positon) {
        switch (positon) {
            case 0:
                return new LogoFragment();
            case 1:
                return new FoodFragment();
//            case 2:
//                return new M;
//            case 3:
//                return new LogoFragment();
        }
        return null;
    }
    @Override
    public int getCount(){
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position){
        String title = getItem(position).getClass().getName();
        return title.subSequence(title.lastIndexOf(".")+1, title.length());
    }
}
