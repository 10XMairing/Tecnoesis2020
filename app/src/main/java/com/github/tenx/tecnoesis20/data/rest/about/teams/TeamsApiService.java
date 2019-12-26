package com.github.tenx.tecnoesis20.data.rest.about.teams;

import com.github.tenx.tecnoesis20.data.models.AboutTeamResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TeamsApiService {
    //       _______________@TODO: PUT REQUIRED FIELD
    //      |
    @GET("here")
    Call<ArrayList<AboutTeamResponse>> getTeams();
}
