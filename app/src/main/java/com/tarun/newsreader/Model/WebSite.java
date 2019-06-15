package com.tarun.newsreader.Model;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import io.paperdb.Paper;
import retrofit2.Callback;

public class WebSite {
    private String status;
    private  int totalResults;
    private ArrayList<Articles> articles = new ArrayList<Articles>();

    public WebSite(String status, int totalResults, ArrayList articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public ArrayList<Articles> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Articles> articles) {
        this.articles = articles;
    }
}
