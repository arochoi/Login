package com.example.choi.login;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Next extends AppCompatActivity {

  
    }

    //mll = new MyLocationListener();

      /*
        mSMS = (Button) findViewById(R.id.BnSMS);//위치 알리기 버튼=>SMS 전송됨
        mCall = (Button) findViewById(R.id.BnCall);
        mReportTxt = (EditText) findViewById(R.id.report_txt); // 입력 내용이 DB로 전송됨

        myAddress = (TextView) findViewById(R.id.address_txt);
*/
      /*  Retrofit retrofit = new Retrofit.Builder().baseUrl(GpsApi.BASE_URL3)
                .addConverterFactory(GsonConverterFactory.create()).build();

        mGpsApi = retrofit.create(GpsApi.class);

        mReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //text 내용이 초기화됨, 블루투스 on 설정, 녹음 on 설정
                //위치, 신고 내용

                //Longitude = location.getLongitude();//경도
                //Latitude = location.getLatitude();//위도
                Time = currentTime.getTime(); //시간

                mGpsApi.Gps(Longitude, Latitude, currentTime, mReportTxt.getText().toString())
                        .enqueue(new Callback<GpsModel>() {

                            @Override
                            public void onResponse(Call<GpsModel> call, Response<GpsModel> response2) {
                                GpsModel result = response2.body();
                                if (result.getResponse().equals("ok")) {
                                    Toast.makeText(Next.this, "위치를 드론캅에게 전달하였습니다.", Toast.LENGTH_LONG).show();

                                    //맵 띄우기?

                                } else if (result.getResponse() == null) {
                                    Toast.makeText(Next.this, "실패", Toast.LENGTH_SHORT).show();
                                }
                            }

                            @Override
                            public void onFailure(Call<GpsModel> call, Throwable t) {
                                Toast.makeText(Next.this, "네트워크 실패", Toast.LENGTH_SHORT).show();

                            }
                        });

            }
        });
        mSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //다른 사람에게 위치가 전송됨
            }
        });

        mCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //112로 전화 통화됨
            }
        });*/

