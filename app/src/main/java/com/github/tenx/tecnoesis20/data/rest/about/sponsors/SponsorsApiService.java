package com.github.tenx.tecnoesis20.data.rest.about.sponsors;

import com.github.tenx.tecnoesis20.data.models.AboutSponsorResponse;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SponsorsApiService {
    //       _______________@TODO: PUT REQUIRED FIELD
    //      |
    @GET("here")
    Call<ArrayList<AboutSponsorResponse>> getSponsors();
}
