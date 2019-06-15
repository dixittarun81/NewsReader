package com.tarun.newsreader.Interface;

import com.tarun.newsreader.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsService {

    @GET("everything")
    Call<WebSite> getSources();

}
