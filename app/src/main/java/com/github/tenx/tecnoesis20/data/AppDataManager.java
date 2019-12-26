package com.github.tenx.tecnoesis20.data;

import android.content.Context;

import com.github.tenx.tecnoesis20.data.models.AboutSponsorResponse;
import com.github.tenx.tecnoesis20.data.models.AboutTeamResponse;
import com.github.tenx.tecnoesis20.data.models.EventResponse;
import com.github.tenx.tecnoesis20.data.rest.about.sponsors.AppSponsorHelper;
import com.github.tenx.tecnoesis20.data.rest.about.teams.AppTeamHelper;
import com.github.tenx.tecnoesis20.data.rest.events.AppEventHelper;

import java.util.ArrayList;

import retrofit2.Call;

public class AppDataManager implements  AppDataManagerHelper{

    private Context context;
    private AppEventHelper eventHelper;
    private AppSponsorHelper sponsorHelper;
    private AppTeamHelper teamHelper;

    public AppDataManager(Context context) {
        this.context = context;
        eventHelper = AppEventHelper.getInstance();
        sponsorHelper = AppSponsorHelper.getInstance();
        teamHelper = AppTeamHelper.getInstance();
    }

    @Override
    public Call<ArrayList<EventResponse>> getEvents() {
        return eventHelper.getEvents();
    }

    @Override
    public Call<ArrayList<AboutSponsorResponse>> getSponsors() { return sponsorHelper.getSponsors(); }

    @Override
    public Call<ArrayList<AboutTeamResponse>> getTeams() {
        return teamHelper.getTeams();
    }
}
