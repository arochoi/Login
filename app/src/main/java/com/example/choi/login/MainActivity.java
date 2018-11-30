package com.example.choi.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.util.Config.LOGD;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
  //  private EditText mNameView;
    private UserApi mUserApi;
    private View mProgressView;
    private View mLoginFormView;
    private TextView RegText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set up the login form.
        mEmailView = (AutoCompleteTextView) findViewById(R.id.user_name);
    //    mNameView = (EditText) findViewById(R.id.name);
        mPasswordView = (EditText) findViewById(R.id.user_password);

        Button mEmailSignInButton = (Button) findViewById(R.id.email_sign_in_button);

        RegText = (TextView) findViewById(R.id.register_txt);
        RegText.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Registration.class));//회원가입 페이지 전환
            }
        });
        mLoginFormView = findViewById(R.id.login_form);
        mProgressView = findViewById(R.id.login_progress);

        Retrofit retrofit = new Retrofit.Builder().baseUrl(UserApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

        mUserApi = retrofit.create(UserApi.class);

        mEmailSignInButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        //mNameView.getText().toString()
        mUserApi.login(mEmailView.getText().toString(), mPasswordView.getText().toString())
                .enqueue(new Callback<ResultModel>() {
                    @Override
                    public void onResponse(Call<ResultModel> call, Response<ResultModel> response) {
                        ResultModel result = response.body();
                       // Toast.makeText(MainActivity.this,result.getResult(), Toast.LENGTH_SHORT).show();

                        //if(result.getResult()==null){
                          //  Toast.makeText(MainActivity.this,"null", Toast.LENGTH_SHORT).show();
                        //}
                       if(result.getResult().equals("ok")){
                           startActivity(new Intent(MainActivity.this, Next.class));
                        }else{
                          Toast.makeText(MainActivity.this,"없는 계정입니다.", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResultModel> call, Throwable t) {

                        Toast.makeText(MainActivity.this,t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

}