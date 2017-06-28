package com.assin.retrofitdemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.assin.retrofitdemo.entity.News;
import com.assin.retrofitdemo.entity.RequestToken;
import com.assin.retrofitdemo.network.RetrofitClient;
import com.assin.retrofitdemo.network.ServiceData;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Button mBtnGetNetwork,mBtnGetNews;
    private TextView mContent,mNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mBtnGetNetwork = (Button) findViewById(R.id.btn_getNetwork);
        mBtnGetNetwork.setOnClickListener(btnGetNetworkListener);
        mBtnGetNews = (Button) findViewById(R.id.btn_getNews);
        mBtnGetNews.setOnClickListener(btnGetNewsListener);
        mContent = (TextView) findViewById(R.id.tv_content);
        mNews = (TextView) findViewById(R.id.tv_news);
    }

    View.OnClickListener btnGetNetworkListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            requestService();
        }
    };

    View.OnClickListener btnGetNewsListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            requestNews();
        }
    };

    private void requestService(){
        HashMap<String,String> params = new HashMap<>();
        params.put("grant_type","password");
        params.put("client_id","3");
        params.put("client_secret","mkiL1w681BDyyTWSiGb1jMKNYKFGI9yUYWNEecxl");
        params.put("username","jfs@1000fun.com");
        params.put("password","jfs@2017");

        // TODO: 2017/6/28 3、使用Retrofit
        RetrofitClient retrofitClient = new RetrofitClient();
        RequestBody requestBody = retrofitClient.createRequestBody(params);
        retrofitClient.api().requestToken(requestBody).enqueue(new Callback<RequestToken>() {
            @Override
            public void onResponse(Call<RequestToken> call, Response<RequestToken> response) {
                RequestToken requestToken = response.body();
                try{
                    String token = requestToken.getToken_type()+" "+requestToken.getAccess_token();
                    mContent.setText(token);
                    saveToken(token);
                }catch (Exception e){
                    Log.e("NullException",e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<RequestToken> call, Throwable t) {

            }
        });
    }

    private void requestNews(){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("type","1");
        hashMap.put("page","1");
        hashMap.put("pageSize","10");

        RetrofitClient retrofitClient = new RetrofitClient();
        RequestBody requestBody = retrofitClient.createRequestBody(hashMap);
        retrofitClient.api().requestNews(getToken(),requestBody).enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                News news = response.body();
                try{
                    List<News.DataBeanX.DataBean> lists = news.getData().getData();
                    String data = lists.get(0).toString();
                    mNews.setText(data);
                }catch (Exception e){
                    Log.e("NullException",e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {

            }
        });
    }

    private boolean saveToken(String token){
        SharedPreferences sharedPreferences = getSharedPreferences("RetrofitDemo",MODE_PRIVATE);
        return sharedPreferences.edit().putString("token",token).commit();
    }

    private String getToken(){
        SharedPreferences sharedPreferences = getSharedPreferences("RetrofitDemo",MODE_PRIVATE);
        return sharedPreferences.getString("token","null");
    }
}
