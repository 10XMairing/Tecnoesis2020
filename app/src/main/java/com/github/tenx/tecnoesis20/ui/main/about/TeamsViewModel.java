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

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class TeamsViewModel extends AndroidViewModel implements TeamsViewModelHelper {
    private AppDataManager appDataManager;
    private MutableLiveData<ArrayList<AboutTeamResponse>> teamsList;

    public TeamsViewModel(@NonNull Application application) {
        super(application);
        appDataManager = ((MyApplication) application).getDataManager();
    }

    @Override
    public LiveData<ArrayList<AboutTeamResponse>> getTeams() {
        if(teamsList == null){
            teamsList = new MutableLiveData<>();
        }
        return  teamsList;
    }

    @Override
    public void loadTeams() {
        if(teamsList == null){
            teamsList = new MutableLiveData<>();
        }
        appDataManager.getTeams().enqueue(new Callback<ArrayList<AboutTeamResponse>>() {
            @Override
            public void onResponse(Call<ArrayList<AboutTeamResponse>> call, Response<ArrayList<AboutTeamResponse>> response) {
                if(response.code() < 300){
                    teamsList.setValue(response.body());
                }else{
                    Timber.e("Response code : %d , Error fetching teams" , response.code());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<AboutTeamResponse>> call, Throwable t) {
                Timber.e("Error fetching teams , %s" ,t.getMessage() );
            }
        });
    }
}
