package com.hmartinez.menu.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hmartinez on 10/11/15.
 */
public class Feed {

    @SerializedName("entry")
    @Expose
    private List<Entry> entries;

    public Feed() {
        this.entries = new ArrayList<>();
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public static Feed parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(response, Feed.class);
    }
}
