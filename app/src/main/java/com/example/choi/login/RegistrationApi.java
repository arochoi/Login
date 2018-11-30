package com.example.choi.login;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RegistrationApi {

   String BASE_URL2="http://arochoi.dothome.co.kr/";
    @GET("register.php")
    Call<RegistrationModel> registration(@Query("name") String name,@Query("user_name") String user_name, @Query("user_password") String user_password);
}//equipment로 할지 name으로 할지
