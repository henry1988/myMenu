package com.hmartinez.menu.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Category Model Class
 * Created by hmartinez on 10/12/15.
 */
public class Category implements Parcelable {


    private String name;

    private String description;

    private String imageUrl;

    private List<Product> products;

    public Category(String name, String description, String imageUrl) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.products = new ArrayList<>();
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


    public List<Product> getProducts() {
        return products;
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
        dest.writeTypedList(products);
    }

    protected Category(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.imageUrl = in.readString();
        this.products = in.createTypedArrayList(Product.CREATOR);
    }

    public static final Parcelable.Creator<Category> CREATOR = new Parcelable.Creator<Category>() {
        public Category createFromParcel(Parcel source) {
            return new Category(source);
        }

        public Category[] newArray(int size) {
            return new Category[size];
        }
    };

    public void addProduct(List<Product> products) {
        this.products.addAll(products);
    }
}