package com.hmartinez.menu.ui.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hmartinez.menu.R;
import com.hmartinez.menu.databinding.ProductDetailBinding;
import com.hmartinez.menu.model.Product;
import com.hmartinez.menu.view_model.ProductDetailViewModel;

/**
 * Product Detail Fragment
 * Created by hmartinez on 10/13/15.
 */
public class ProductDetailFragment extends Fragment {

    public static final String PRODUCT = "product";
    private Product product;
    private ProductDetailBinding binding;

    public static ProductDetailFragment newInstance(Product product){
        ProductDetailFragment fragment = new ProductDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable(PRODUCT, product);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Bundle arguments = getArguments();
        if (arguments != null){
            product = arguments.getParcelable(PRODUCT);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.product_detail, container, false);
        binding.setViewModel(new ProductDetailViewModel(product));
        return binding.getRoot();

    }

    public void updateContent(Product product) {
        binding.setViewModel(new ProductDetailViewModel(product));
    }
}
