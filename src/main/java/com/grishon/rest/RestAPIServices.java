package com.grishon.rest;

import com.grishon.Model.UserList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class RestAPIServices {
    public interface RestApiService {

        @GET("/search/users")
        Call<UserList> getUserList(@Query("q") String filter);

    }
}
