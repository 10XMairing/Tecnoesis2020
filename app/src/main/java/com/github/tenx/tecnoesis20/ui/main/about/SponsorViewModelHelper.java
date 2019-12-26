package com.github.tenx.tecnoesis20.ui.main.about;

import androidx.lifecycle.LiveData;

import com.github.tenx.tecnoesis20.data.models.AboutSponsorResponse;

import java.util.ArrayList;

public interface SponsorViewModelHelper {
    LiveData<ArrayList<AboutSponsorResponse>> getSponsors();

    void loadSponsors();
}
