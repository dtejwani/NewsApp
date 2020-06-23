package com.example.dhrumilshah.news.model;

import java.util.ArrayList;

public class News {
    private String title;
    private String section;
    private String webPublicationDateAndTime;
    private String webUrl;
    private String thumbnail;
    private ArrayList<String> authors;

    public News(String title, String section, String webPublicationDateAndTime, String webUrl, String thumbnail, ArrayList<String> authors) {
        this.title = title;
        this.section = section;
        this.webPublicationDateAndTime = webPublicationDateAndTime;
        this.webUrl = webUrl;
        this.thumbnail = thumbnail;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public String getWebPublicationDateAndTime() {
        return webPublicationDateAndTime;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }
}
