package com.example.choi.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultModel {
    @SerializedName("response")
    @Expose
    private String response;
    @SerializedName("name")
    @Expose
    private String name;

    public String getResult() {
        return response;
    }

    public void setResult(String response) {
        this.response = response;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}







  //  @SerializedName("result")
   // @Expose
   // private String result;

    //public String getResult(){
     //   return result;
   // }

    //public void setResult(String result){
     //   this.result = result;
    //}
//}
