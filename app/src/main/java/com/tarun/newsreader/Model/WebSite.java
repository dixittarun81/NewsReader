package com.tarun.newsreader.Model;

import java.util.ArrayList;
import java.util.List;

public class WebSite {
    private String status;
    private  String totalResults;
    private ArrayList<String> articles;

    public WebSite(String status, String totalResults, ArrayList<String> articles) {
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

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<String> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<String> articles) {
        this.articles = articles;
    }
}
