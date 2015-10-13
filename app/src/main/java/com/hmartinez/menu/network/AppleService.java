package com.hmartinez.menu.network;

import com.hmartinez.menu.model.AppleResponse;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by hmartinez on 10/11/15.
 */
public interface AppleService {

    @GET("/us/rss/topfreeapplications/limit={limit}/json")
    Call<AppleResponse> topFreeApps(@Path("limit")int limit);
}
