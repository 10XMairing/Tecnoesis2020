package com.github.tenx.tecnoesis20.data.models;

import com.google.gson.annotations.SerializedName;

// @TODO GET CHECKED
public class AboutSponsorResponse {

    @SerializedName("name")
    String sponsorName;

    @SerializedName("image")
    String imageUrl;

    @SerializedName("website")
    String websiteUrl;

    @SerializedName("facebook")
    String facebookUrl;

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }
}
