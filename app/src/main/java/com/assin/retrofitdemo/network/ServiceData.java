package com.assin.retrofitdemo.network;

import com.assin.retrofitdemo.entity.News;
import com.assin.retrofitdemo.entity.RequestToken;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;


/**
 * Created by Assassin on 2017/6/28.
 */
// TODO: 2017/6/28 2、声明接口
public interface ServiceData {

    @POST("oauth/token")
    Call<RequestToken> requestToken(@Body RequestBody requestBody);


    @POST("api/enterprise/scenic/news/index")
    Call<News> requestNews(@Header("Authorization") String authorization, @Body RequestBody requestBody);
}
