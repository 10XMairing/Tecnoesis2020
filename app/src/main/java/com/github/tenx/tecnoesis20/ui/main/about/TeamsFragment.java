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
import com.github.tenx.tecnoesis20.data.models.AboutTeamLeader;
import com.github.tenx.tecnoesis20.data.models.AboutTeamMember;
import com.github.tenx.tecnoesis20.data.models.AboutTeamResponse;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TeamsFragment extends Fragment {

    private TeamsViewModel mViewModel;
    private ArrayList<String> mImageUrl = new ArrayList<>();
    private ArrayList<String> mTeamName = new ArrayList<>();
    private ArrayList<ArrayList<AboutTeamLeader>> mTeamLeader = new ArrayList<>();
    private ArrayList<ArrayList<AboutTeamMember>> mTeamMember = new ArrayList<>();
    private ArrayList<ArrayList<String>> mLeaderImageUrl = new ArrayList<>();
    private ArrayList<ArrayList<String>> mLeaderName = new ArrayList<>();
    private ArrayList<ArrayList<String>> mMemberImageUrl = new ArrayList<>();
    private ArrayList<ArrayList<String>> mMemberName = new ArrayList<>();

    @BindView(R.id.frag_teams_rv_teams)
    RecyclerView teamsRecyclerView;

    public static TeamsFragment newInstance() {
        return new TeamsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teams, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TeamsViewModel.class);
        mViewModel.loadTeams();
    }

    @Override
    public void onStart() {
        super.onStart();

        mViewModel.getTeams().observe(this,aboutTeamResponses -> {
            for(AboutTeamResponse res : aboutTeamResponses){
                mImageUrl.add(res.getTeamImage());
                mTeamName.add(res.getTeamName());
                mTeamLeader.add(res.getmTeamLeaders());
                mTeamMember.add(res.getmTeamMembers());
            }
            for(ArrayList<AboutTeamLeader> res : mTeamLeader){
                ArrayList<String> tempImageUrl = new ArrayList<>();
                ArrayList<String> tempName = new ArrayList<>();
                for (AboutTeamLeader res2 : res){
                    tempImageUrl.add(res2.getLeaderImage());
                    tempName.add(res2.getLeaderName());
                }
                mLeaderImageUrl.add(tempImageUrl);
                mLeaderName.add(tempName);
            }
            for(ArrayList<AboutTeamMember> res : mTeamMember){
                ArrayList<String> tempImageUrl = new ArrayList<>();
                ArrayList<String> tempName = new ArrayList<>();
                for (AboutTeamMember res2 : res){
                    tempImageUrl.add(res2.getMemberImage());
                    tempName.add(res2.getMemberName());
                }
                mMemberImageUrl.add(tempImageUrl);
                mMemberName.add(tempName);
            }
            teamsRecyclerView();
        });
    }
    private void teamsRecyclerView(){
        TeamAdapter adapter = new TeamAdapter(getActivity(), mImageUrl, mTeamName, mLeaderImageUrl, mLeaderName, mMemberImageUrl, mMemberName);
        teamsRecyclerView.setAdapter(adapter);
        teamsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
