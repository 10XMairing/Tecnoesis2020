package com.github.tenx.tecnoesis20.data.rest.about.teams;


import com.github.tenx.tecnoesis20.data.models.AboutTeamResponse;

import com.github.tenx.tecnoesis20.modules.RetrofitProvider;

import java.util.ArrayList;

import retrofit2.Call;

public class AppTeamHelper implements TeamsApiService {
    private static AppTeamHelper instance;
    private TeamsApiService api;

    public AppTeamHelper() {
        api = RetrofitProvider.getInstance().create(TeamsApiService.class);
    }

    @Override
    public Call<ArrayList<AboutTeamResponse>> getTeams() { return api.getTeams(); }

    public static AppTeamHelper getInstance(){
        if(instance == null){
            synchronized (AppTeamHelper.class){
                if(instance == null){
                    instance = new AppTeamHelper();
                }
            }
        }
        return instance;
    }
}
