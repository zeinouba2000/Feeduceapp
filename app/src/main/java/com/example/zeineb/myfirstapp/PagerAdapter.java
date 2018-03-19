package com.example.zeineb.myfirstapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Zeineb on 3/9/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;


    public PagerAdapter(FragmentManager fm, int fragmentnb) {
        super(fm);
        this.mNumOfTabs=fragmentnb;
    }

    @Override
    public Fragment getItem(int position) {

        switch(position)
        {
            case 0  :
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1 :
                SearchFragment searchFragment = new SearchFragment();
                return searchFragment;
            case 2 :
                AddpostFragment addpostFragment = new AddpostFragment();
                return addpostFragment;
            case 3 :
                NotificationFragment notificationFragment = new NotificationFragment();
                return notificationFragment;
            case 4 :
                ProfilFragment profilFragment = new ProfilFragment();
                return profilFragment;
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
