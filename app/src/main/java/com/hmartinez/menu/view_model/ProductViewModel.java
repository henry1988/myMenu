package com.hmartinez.menu.view_model;

import android.content.Context;
import android.view.View;

import com.hmartinez.menu.model.Product;
import com.hmartinez.menu.ui.activities.ProductsActivity;

import java.util.ArrayList;

/**
 * Created by hmartinez on 10/12/15.
 */
public class ProductViewModel {
    private Context context;
    private Product product;
    public ProductViewModel(Context context, Product product) {
        this.context = context;
        this.product = product;
    }

    public String getName(){
        return product.getName();
    }

    public String getImage(){
        return product.getImageUrl();
    }

    public String getDescription(){
        return product.getDescription();
    }

}
