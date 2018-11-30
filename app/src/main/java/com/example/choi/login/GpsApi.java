package com.example.choi.login;


import java.sql.Date;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GpsApi {
    String BASE_URL3="http://arochoi.dothome.co.kr/";
    @GET("gps.php")
    Call<GpsModel> Gps(@Query("longitude") double longitude, @Query("latitude") double latitude, @Query("currentTime") Date currentTime, @Query("reportMemo") String reportMemo);
}
