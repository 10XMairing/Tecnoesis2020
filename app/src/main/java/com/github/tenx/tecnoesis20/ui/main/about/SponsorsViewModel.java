package com.github.tenx.tecnoesis20.ui.main.about;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.github.tenx.tecnoesis20.data.AppDataManager;
import com.github.tenx.tecnoesis20.data.models.AboutSponsorResponse;
import com.github.tenx.tecnoesis20.ui.MyApplication;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class SponsorsViewModel extends AndroidViewModel implements SponsorViewModelHelper {
    private AppDataManager appDataManager;
    private MutableLiveData<ArrayList<AboutSponsorResponse>> sponsorsList;

    public SponsorsViewModel(@NonNull Application application) {
        super(application);
        appDataManager = ((MyApplication) application).getDataManager();

    }

    @Override
    public LiveData<ArrayList<AboutSponsorResponse>> getSponsors() {
        if(sponsorsList == null){
            sponsorsList = new MutableLiveData<>();
        }
        return  sponsorsList;
    }

    @Override
    public void loadSponsors() {
        if(sponsorsList == null){
            sponsorsList = new MutableLiveData<>();
        }
        appDataManager.getSponsors().enqueue(new Callback<ArrayList<AboutSponsorResponse>>() {
            @Override
            public void onResponse(Call<ArrayList<AboutSponsorResponse>> call, Response<ArrayList<AboutSponsorResponse>> response) {
                if(response.code() < 300){
                    sponsorsList.setValue(response.body());
                }else{
                    Timber.e("Response code : %d , Error fetching sponsors" , response.code());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<AboutSponsorResponse>> call, Throwable t) {
                Timber.e("Error fetching sponsors , %s" ,t.getMessage() );
            }
        });

    }
}
