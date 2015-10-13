package com.hmartinez.menu.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by hmartinez on 10/12/15.
 */
public class Product implements Parcelable {

    private String name;

    private String description;

    private String imageUrl;

    private String price;

    public Product(String name, String description, String imageUrl, String price) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getPrice() {
        return price;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.imageUrl);
        dest.writeString(this.price);
    }

    protected Product(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.imageUrl = in.readString();
        this.price = in.readString();
    }

    public static final Parcelable.Creator<Product> CREATOR = new Parcelable.Creator<Product>() {
        public Product createFromParcel(Parcel source) {
            return new Product(source);
        }

        public Product[] newArray(int size) {
            return new Product[size];
        }
    };
}
