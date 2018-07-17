package com.justinemirgreen.visitchattanooga;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new EventsFragment();
        } else if (i == 1) {
            return new FoodFragment();
        } else if (i == 2) {
            return new AttractionsFragment();
        } else {
            return new HistoricalSitesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab_label_events);
        } else if (position == 1) {
            return mContext.getString(R.string.tab_label_food);
        } else if (position == 2) {
            return mContext.getString(R.string.tab_label_attractions);
        } else {
            return mContext.getString(R.string.tab_label_history);
        }
    }
}