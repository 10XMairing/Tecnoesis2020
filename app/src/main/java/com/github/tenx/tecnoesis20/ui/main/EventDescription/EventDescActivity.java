package com.github.tenx.tecnoesis20.ui.main.EventDescription;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.github.tenx.tecnoesis20.Config;
import com.github.tenx.tecnoesis20.R;
import com.github.tenx.tecnoesis20.Utils;
import com.github.tenx.tecnoesis20.data.models.ModuleBody;
import com.github.tenx.tecnoesis20.ui.module.ModuleAdapter;
import com.github.tenx.tecnoesis20.ui.module.modulefrag.ModuleFragment;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;

public class EventDescActivity  extends AppCompatActivity {


    public static String PAGE_INDEX_KEY = "index";
    @BindView(R.id.vp_events_fragment_pager)
    ViewPager vpModulesFragmentPager;
    @BindView(R.id.dots_indicator)
    SpringDotsIndicator dotsIndicator;

    private EventlistAdapter eventlistAdapter;
    private ArrayList<Fragment> listFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        ButterKnife.bind(this);


        initFragmentPager(this);

    }

    private void initFragmentPager(Context context) {
//        demo fragments

        List<ModuleBody> modules = Utils.getModules();
        listFragments = new ArrayList<>();
        for (int i = 0; i < modules.size(); i++) {
            EventDescFragment frag = new EventDescFragment();
            Bundle data = new Bundle();
            data.putInt(PAGE_INDEX_KEY, i);
            frag.setArguments(data);
            listFragments.add(frag);
        }
        eventlistAdapter = new EventlistAdapter(getSupportFragmentManager(),FragmentPagerAdapter.POSITION_NONE, context, listFragments);
        vpModulesFragmentPager.setAdapter(eventlistAdapter);
        dotsIndicator.setViewPager(vpModulesFragmentPager);


        try {
            Intent data = getIntent();
            int pos = data.getIntExtra(Config.INITIAL_PAGE, 0);
            vpModulesFragmentPager.setCurrentItem(pos);
        } catch (NullPointerException e) {
            Timber.d("No initial page was passed to intent");
        }

    }
}
