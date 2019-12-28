package com.github.tenx.tecnoesis20.ui.main.about;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.tenx.tecnoesis20.R;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;

public class AboutFragment extends Fragment {

    private AboutViewModel mViewModel;
    private AboutPageAdapter mAboutPageAdapter;


    @BindView(R.id.container)
    ViewPager mViewPager;

    @BindView(R.id.about_tabs)
    TabLayout tabLayout;
    public static AboutFragment newInstance() {
        return new AboutFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        mAboutPageAdapter = new AboutPageAdapter(getActivity().getSupportFragmentManager());

        setupViewPager(mViewPager);
        tabLayout.setupWithViewPager(mViewPager);

        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AboutViewModel.class);
        // TODO: Use the ViewModel
    }

    private void setupViewPager(ViewPager viewPager){
        AboutPageAdapter adapter = new AboutPageAdapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new SponsorsFragment(), "Sponsors");
        adapter.addFragment(new TeamsFragment(), "Teams");
        viewPager.setAdapter(adapter);
    }

}
