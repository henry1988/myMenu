package com.hmartinez.menu.ui.fragments;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hmartinez.menu.R;
import com.hmartinez.menu.databinding.FragmentProductsListBinding;
import com.hmartinez.menu.model.Category;
import com.hmartinez.menu.model.Product;
import com.hmartinez.menu.ui.adapters.ProductAdapter;

/**
 * Category List Fragment
 * Created by hmartinez on 10/12/15.
 */
public class ProductListFragment extends Fragment {

    public static final String CATEGORY = "category";
    private Category category;
    private OnItemSelectedListener listener;

    public static ProductListFragment newInstance(Category category){
        ProductListFragment fragment = new ProductListFragment();
        Bundle args = new Bundle();
        args.putParcelable(CATEGORY, category);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Bundle arguments = getArguments();
        if (arguments != null){
            category = arguments.getParcelable(CATEGORY);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        FragmentProductsListBinding binding =  DataBindingUtil.inflate(inflater, R.layout.fragment_products_list, container, false);

        binding.setCategory(category);
        binding.categoryList.setHasFixedSize(true);

        binding.categoryList.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        binding.categoryList.setAdapter(new ProductAdapter(listener, category.getProducts()));
        return binding.getRoot();

    }

    public interface OnItemSelectedListener {
        public void onProductItemSelected(Product product);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnItemSelectedListener) {
            listener = (OnItemSelectedListener) context;
        } else {
            throw new ClassCastException(context.toString()
                    + " must implemenet MyListFragment.OnItemSelectedListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public void updateDetail(Product product) {
        // interface defintion
        listener.onProductItemSelected(product);
    }
}
