package com.hmartinez.menu.model;

/**
 * Created by hmartinez on 10/8/15.
 */

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entry {

    @SerializedName("im:name")
    @Expose
    private EntryAttribute imName;
    @SerializedName("im:image")
    @Expose
    private List<EntryAttribute> imImage = new ArrayList<EntryAttribute>();
    @SerializedName("summary")
    @Expose
    private EntryAttribute summary;
    @SerializedName("im:price")
    @Expose
    private EntryAttribute imPrice;
    @SerializedName("im:contentType")
    @Expose
    private EntryAttribute imContentType;
    @SerializedName("rights")
    @Expose
    private EntryAttribute rights;
    @SerializedName("title")
    @Expose
    private EntryAttribute title;
    @SerializedName("link")
    @Expose
    private EntryAttribute link;
    @SerializedName("id")
    @Expose
    private EntryAttribute id;
    @SerializedName("im:artist")
    @Expose
    private EntryAttribute imArtist;
    @SerializedName("category")
    @Expose
    private EntryAttribute category;
    @SerializedName("im:releaseDate")
    @Expose
    private EntryAttribute imReleaseDate;

    public EntryAttribute getImName() {
        return imName;
    }

    public void setImName(EntryAttribute imName) {
        this.imName = imName;
    }

    public List<EntryAttribute> getImImage() {
        return imImage;
    }

    public void setImImage(List<EntryAttribute> imImage) {
        this.imImage = imImage;
    }

    public EntryAttribute getSummary() {
        return summary;
    }

    public void setSummary(EntryAttribute summary) {
        this.summary = summary;
    }

    public EntryAttribute getImPrice() {
        return imPrice;
    }

    public void setImPrice(EntryAttribute imPrice) {
        this.imPrice = imPrice;
    }

    public EntryAttribute getImContentType() {
        return imContentType;
    }

    public void setImContentType(EntryAttribute imContentType) {
        this.imContentType = imContentType;
    }

    public EntryAttribute getRights() {
        return rights;
    }

    public void setRights(EntryAttribute rights) {
        this.rights = rights;
    }

    public EntryAttribute getTitle() {
        return title;
    }

    public void setTitle(EntryAttribute title) {
        this.title = title;
    }

    public EntryAttribute getLink() {
        return link;
    }

    public void setLink(EntryAttribute link) {
        this.link = link;
    }

    public EntryAttribute getId() {
        return id;
    }

    public void setId(EntryAttribute id) {
        this.id = id;
    }

    public EntryAttribute getImArtist() {
        return imArtist;
    }

    public void setImArtist(EntryAttribute imArtist) {
        this.imArtist = imArtist;
    }

    public EntryAttribute getCategory() {
        return category;
    }

    public void setCategory(EntryAttribute category) {
        this.category = category;
    }

    public EntryAttribute getImReleaseDate() {
        return imReleaseDate;
    }

    public void setImReleaseDate(EntryAttribute imReleaseDate) {
        this.imReleaseDate = imReleaseDate;
    }
}

