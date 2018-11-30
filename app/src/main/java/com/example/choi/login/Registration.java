package com.example.choi.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Registration extends AppCompatActivity implements View.OnClickListener {

    private EditText name, UserName, UserPassword;
    private Button BnRegister;
    private RegistrationApi mRegistrationApi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = (EditText) findViewById(R.id.txt_name);
        UserName = (EditText) findViewById(R.id.txt_user_name);
        UserPassword = (EditText) findViewById(R.id.txt_password);

        BnRegister = (Button) findViewById(R.id.bn_register);

        Retrofit retrofit = new Retrofit.Builder().baseUrl(RegistrationApi.BASE_URL2)
                .addConverterFactory(GsonConverterFactory.create()).build();

        mRegistrationApi = retrofit.create(RegistrationApi.class);

        BnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mRegistrationApi.registration(name.getText().toString(), UserName.getText().toString(),UserPassword.getText().toString())
                .enqueue(new Callback<RegistrationModel>() {
                    @Override
                    public void onResponse(Call<RegistrationModel> call, Response<RegistrationModel> response1) {
                        RegistrationModel result = response1.body();
                        if(result.getResponse().equals("ok")){
                            startActivity(new Intent(Registration.this, Next.class));
                        }else if(result.getResponse()==null){
                            Toast.makeText(Registration.this,"null", Toast.LENGTH_SHORT).show();
                        }
                        else if(result.getResponse().equals("exist")){
                            Toast.makeText(Registration.this,"중복된 계정입니다.", Toast.LENGTH_SHORT).show();

                        }else if(result.getResponse().equals("error")){
                            Toast.makeText(Registration.this,"실패", Toast.LENGTH_SHORT).show();

                        }else{
                            Toast.makeText(Registration.this,"실패", Toast.LENGTH_SHORT).show();

                        }
                    }

                    @Override
                    public void onFailure(Call<RegistrationModel> call, Throwable t) {
                        Toast.makeText(Registration.this,"네트워크 실패", Toast.LENGTH_SHORT).show();

                    }
                });
    }
}
