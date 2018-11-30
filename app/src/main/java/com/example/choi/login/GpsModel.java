package com.example.choi.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GpsModel {
    @SerializedName("response2")
    @Expose
    private String response2;

    public String getResponse() {
        return response2;
    }

    public void setResponse(String response) {
        this.response2 = response2;
    }
}
