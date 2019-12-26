package com.github.tenx.tecnoesis20.data.rest.about.sponsors;

import com.github.tenx.tecnoesis20.data.models.AboutSponsorResponse;

import com.github.tenx.tecnoesis20.modules.RetrofitProvider;

import java.util.ArrayList;

import retrofit2.Call;

public class AppSponsorHelper implements SponsorsApiService {

    private static AppSponsorHelper instance;
    private SponsorsApiService api;

    public AppSponsorHelper() {
        api = RetrofitProvider.getInstance().create(SponsorsApiService.class);
    }

    @Override
    public Call<ArrayList<AboutSponsorResponse>> getSponsors() { return api.getSponsors(); }

    public static AppSponsorHelper getInstance(){
        if(instance == null){
            synchronized (AppSponsorHelper.class){
                if(instance == null){
                    instance = new AppSponsorHelper();
                }
            }
        }
        return instance;
    }

}
