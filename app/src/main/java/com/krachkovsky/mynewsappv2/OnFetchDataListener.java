package com.krachkovsky.mynewsappv2;

import com.krachkovsky.mynewsappv2.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
