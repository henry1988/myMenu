package com.hmartinez.menu.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by hmartinez on 10/12/15.
 */
public class SubCategory implements Parcelable {

    private String name;

    private String description;

    private String imageUrl;

    private List<Product> products;

    public SubCategory(String name, String description, String imageUrl, List<Product> products) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.products = products;
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

    protected SubCategory(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.imageUrl = in.readString();
        this.products = in.createTypedArrayList(Product.CREATOR);
    }

    public static final Parcelable.Creator<SubCategory> CREATOR = new Parcelable.Creator<SubCategory>() {
        public SubCategory createFromParcel(Parcel source) {
            return new SubCategory(source);
        }

        public SubCategory[] newArray(int size) {
            return new SubCategory[size];
        }
    };
}
