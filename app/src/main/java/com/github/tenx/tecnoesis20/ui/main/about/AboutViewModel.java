package com.github.tenx.tecnoesis20.ui.main.about;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.github.tenx.tecnoesis20.data.AppDataManager;
import com.github.tenx.tecnoesis20.data.models.AboutSponsorResponse;
import com.github.tenx.tecnoesis20.data.models.AboutTeamResponse;
import com.github.tenx.tecnoesis20.ui.MyApplication;

import java.util.ArrayList;

public class AboutViewModel extends AndroidViewModel implements AboutViewModelHelper {

    private AppDataManager appDataManager;
    private MutableLiveData<ArrayList<AboutSponsorResponse>> sponsorsList;
    private MutableLiveData<ArrayList<AboutTeamResponse>> teamsList;

    public AboutViewModel(@NonNull Application application) {
        super(application);
//        appDataManager = ((MyApplication) application).getDataManager();
    }

//    @Override
//    public LiveData<ArrayList<AboutSponsorResponse>> getSponsors() {
//        if(sponsorsList == null){
//            sponsorsList = new MutableLiveData<>();
//        }
//        return  sponsorsList;
//    }
//
//    @Override
//    public LiveData<ArrayList<AboutTeamResponse>> getTeams() {
//        if(teamsList == null){
//            teamsList = new MutableLiveData<>();
//        }
//        return  teamsList;
//    }
//
//    @Override
//    public void loadSponsors() {
//        if(sponsorsList == null){
//            sponsorsList = new MutableLiveData<>();
//        }
//    }
//
//    @Override
//    public void loadTeams() {
//
//    }
}
