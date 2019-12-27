package com.github.tenx.tecnoesis20.ui.main.about;

import androidx.lifecycle.LiveData;

import com.github.tenx.tecnoesis20.data.models.AboutSponsorResponse;
import com.github.tenx.tecnoesis20.data.models.AboutTeamResponse;

import java.util.ArrayList;

public interface TeamsViewModelHelper {
    LiveData<ArrayList<AboutTeamResponse>> getTeams();

    void loadTeams();
}
