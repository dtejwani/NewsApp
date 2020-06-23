package com.example.dhrumilshah.news.utils;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.example.dhrumilshah.news.model.News;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    /**
     * Query URL
     **/
    private String url;

    public NewsLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (url == null) {
            return null;
        }
        return QueryUtils.fetchNewsData(url, getContext());
    }
}
