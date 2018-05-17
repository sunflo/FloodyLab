package flo.zues.com.floodylab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.List;

/**
 * Created by huangxz on 2018/1/23.
 */

public class CanvasPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    private List<String> titles;

    public void setFragments(List<Fragment> data) {
        this.fragments = data;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public CanvasPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (titles == null || titles.size() < fragments.size()) {
            return "page_" + position;
        }
        return titles.get(position);
    }
}
