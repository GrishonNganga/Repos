package com.grishon.rest;

import com.grishon.Model.UserList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class APIBuilder {


    private Retrofit retrofit;

    public APIBuilder() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Config.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public RestAPIServices.RestApiService getService() {
        return retrofit.create(RestAPIServices.RestApiService.class);
    }
}
