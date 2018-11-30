package com.example.choi.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegistrationModel {
    @SerializedName("response1")
    @Expose
    private String response1;

    public String getResponse() {
        return response1;
    }

    public void setResponse(String response) {
        this.response1 = response1;
    }//this.response1 = response

}

