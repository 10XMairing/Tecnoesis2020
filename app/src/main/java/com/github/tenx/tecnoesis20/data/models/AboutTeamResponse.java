package com.github.tenx.tecnoesis20.data.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

// @TODO GET CHECKED
public class AboutTeamResponse {

    ArrayList<AboutTeamLeader> mTeamLeaders = new ArrayList<>();
    ArrayList<AboutTeamMember> mTeamMembers = new ArrayList<>();

    @SerializedName("name")
    String teamName;

    @SerializedName("name")
    String teamImage;

    public ArrayList<AboutTeamLeader> getmTeamLeaders() {
        return mTeamLeaders;
    }

    public void setmTeamLeaders(ArrayList<AboutTeamLeader> mTeamLeaders) {
        this.mTeamLeaders = mTeamLeaders;
    }

    public ArrayList<AboutTeamMember> getmTeamMembers() {
        return mTeamMembers;
    }

    public void setmTeamMembers(ArrayList<AboutTeamMember> mTeamMembers) {
        this.mTeamMembers = mTeamMembers;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamImage() {
        return teamImage;
    }

    public void setTeamImage(String teamImage) {
        this.teamImage = teamImage;
    }
}
