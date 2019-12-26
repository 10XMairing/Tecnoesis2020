package com.github.tenx.tecnoesis20.ui.module;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class ModuleAdapter extends FragmentPagerAdapter {

    private Context context;
    private ArrayList<Fragment> listFragments;


    public ModuleAdapter(@NonNull FragmentManager fm, int behavior, Context context, ArrayList<Fragment> listFragments) {
        super(fm, behavior);
        this.context = context;
        this.listFragments = listFragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listFragments.get(position);
    }

    @Override
    public int getCount() {
        return listFragments.size();
    }
}
