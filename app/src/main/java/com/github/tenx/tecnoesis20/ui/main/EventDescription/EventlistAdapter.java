package com.github.tenx.tecnoesis20.ui.main.EventDescription;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class EventlistAdapter extends FragmentPagerAdapter
{
    private Context context;
    private ArrayList<Fragment> listFragments;


    public EventlistAdapter(@NonNull FragmentManager fm, int behavior, Context context, ArrayList<Fragment> listFragments) {
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
