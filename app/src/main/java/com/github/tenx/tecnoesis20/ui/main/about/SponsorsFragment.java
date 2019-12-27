package com.github.tenx.tecnoesis20.ui.main.about;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.tenx.tecnoesis20.R;
import com.github.tenx.tecnoesis20.data.models.AboutSponsorResponse;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SponsorsFragment extends Fragment {

    private SponsorsViewModel mViewModel;
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mSponsorName = new ArrayList<>();
    private ArrayList<String> mWebsiteUrl = new ArrayList<>();
    private ArrayList<String> mFacebookUrl = new ArrayList<>();

    @BindView(R.id.frag_sponsors_rv_sponsors)
    RecyclerView sponsorsRecyclerView;

    public static SponsorsFragment newInstance() {
        return new SponsorsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sponsors, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SponsorsViewModel.class);
        mViewModel.loadSponsors();
    }

    @Override
    public void onStart() {
        super.onStart();

        mViewModel.getSponsors().observe(this,aboutSponsorsResponse ->{
            for(AboutSponsorResponse res : aboutSponsorsResponse){
                mSponsorName.add(res.getSponsorName());
                mImageUrls.add(res.getImageUrl());
                mWebsiteUrl.add(res.getWebsiteUrl());
                mFacebookUrl.add(res.getFacebookUrl());
            }
            sponsorsRecyclerView();
        });
    }
    private void sponsorsRecyclerView(){
        SponsorAdapter adapter = new SponsorAdapter(getActivity(),mImageUrls,mSponsorName,mWebsiteUrl,mFacebookUrl);
        sponsorsRecyclerView.setAdapter(adapter);
        sponsorsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
