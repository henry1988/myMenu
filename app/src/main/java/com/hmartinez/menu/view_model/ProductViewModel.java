package com.hmartinez.menu.view_model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;

import com.hmartinez.menu.R;
import com.hmartinez.menu.model.Product;
import com.hmartinez.menu.ui.activities.ProductsActivity;
import com.hmartinez.menu.ui.fragments.ProductListFragment;

import java.util.ArrayList;

/**
 * Created by hmartinez on 10/12/15.
 */
public class ProductViewModel {
    private ProductListFragment.OnItemSelectedListener listener;
    private Product product;
    public ProductViewModel(Product product, ProductListFragment.OnItemSelectedListener listener) {
        this.product = product;
        this.listener = listener;
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

    public void onProductClicked(View view){

        listener.onProductItemSelected(product);
    }

}
