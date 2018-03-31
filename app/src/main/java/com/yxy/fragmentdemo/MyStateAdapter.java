package com.yxy.fragmentdemo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by 1 on 2018/3/31.
 */

public class MyStateAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;
    public MyStateAdapter(FragmentManager fm, List<Fragment> fragmentList){
        super(fm);
        this.fragmentList = fragmentList;
    }
    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
       return fragmentList.size();
    }
}
