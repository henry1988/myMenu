package com.hmartinez.menu.ui.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hmartinez.menu.R;
import com.hmartinez.menu.databinding.ProductItemBinding;
import com.hmartinez.menu.model.Product;
import com.hmartinez.menu.ui.fragments.ProductListFragment;
import com.hmartinez.menu.view_model.ProductViewModel;

import java.util.List;

/**
 * Adapter for Category Objects
 * Created by hmartinez on 10/11/15.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private List<Product> products;

    private ProductListFragment.OnItemSelectedListener itemSelectedListener;



    public ProductAdapter(ProductListFragment.OnItemSelectedListener listener, List<Product> products) {
        this.itemSelectedListener = listener;
        this.products = products;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context =  viewGroup.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.product_item, viewGroup, false);
        return new ProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder viewHolder, int i) {
        Product product = products.get(i);
        viewHolder.bind(new ProductViewModel(product, itemSelectedListener));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public void setProducts(List<Product> products){
        this.products.addAll(products);
        notifyDataSetChanged();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        private final ProductItemBinding binding;

        public ProductViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }

        public void bind(ProductViewModel viewModel){
            binding.setViewModel(viewModel);
        }
    }
}
