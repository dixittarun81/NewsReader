package com.tarun.newsreader.Common;

import com.tarun.newsreader.Interface.NewsService;
import com.tarun.newsreader.Interface.RetrofitClient;

public class Common {

    public static final String BASE_URL = "https://newsapi.org/v2/";

    public static final String API_KEY = "3f07fd89f63142a9b2ce07b26e6a2f97";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

}
