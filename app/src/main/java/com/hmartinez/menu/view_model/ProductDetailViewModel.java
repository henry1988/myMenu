package com.hmartinez.menu.view_model;

import com.hmartinez.menu.model.Product;

/**
 * Created by hmartinez on 10/12/15.
 */
public class ProductDetailViewModel {
    private Product product;
    public ProductDetailViewModel(Product product) {
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
