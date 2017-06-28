package com.assin.retrofitdemo.network;

import com.google.gson.Gson;

import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Assassin on 2017/6/28.
 */

public class RetrofitClient {

    private Retrofit retrofit;

    public RetrofitClient() {
        // TODO: 2017/6/28 1、创建Retrofit的对象
         retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(RequestAddress.baseUrl)
                .build();
    }

    /**
     *  创建请求体 要求是json字符串请求
     * @param hashMap 请求参数
     * @return RequestBody
     */
    public RequestBody createRequestBody(HashMap<String,String> hashMap){
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        String jsonStr = new Gson().toJson(hashMap);
        return RequestBody.create(JSON,jsonStr);
    }

    /**
     *  创建接口对象
     * @return ServiceData
     */
    public ServiceData api(){
        return retrofit.create(ServiceData.class);
    }
}
