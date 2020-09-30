package com.example.android.dota2info;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Time Travling Gamer on 25/09/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HeroesFragment();
        } else {
            return new ItemsFragment();
        }
    }

    @Override
    public int getCount()   {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position)  {
        if (position == 0) {
            return "Heroes";
        } else {
            return "Items";
        }
    }
}
