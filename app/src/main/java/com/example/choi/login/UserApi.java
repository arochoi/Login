package com.example.choi.login;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface UserApi {

    String BASE_URL="http://arochoi.dothome.co.kr/";
    @GET("login.php")
    Call<ResultModel> login(@Query("user_name") String user_name, @Query("user_password") String user_password);


//@Query("name") String Name,
}
