package com.hmartinez.menu.ui.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hmartinez.menu.R;
import com.hmartinez.menu.databinding.CategoryItemBinding;
import com.hmartinez.menu.model.Category;
import com.hmartinez.menu.view_model.CategoryViewModel;

import java.util.List;

/**
 * Adapter for Category Objects
 * Created by hmartinez on 10/11/15.
 */
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private List<Category> categories;

    private Context mContext;



    public CategoryAdapter(Context context, List<Category> categories) {
        this.mContext = context;
        this.categories = categories;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context =  viewGroup.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.category_item, viewGroup, false);
        return new CategoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder viewHolder, int i) {
        Category category = categories.get(i);
        viewHolder.bind(new CategoryViewModel(mContext , category));
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public void setCategories(List<Category> categories){
        this.categories.addAll(categories);
        notifyDataSetChanged();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class CategoryViewHolder extends RecyclerView.ViewHolder {

        private final CategoryItemBinding binding;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }

        public void bind(CategoryViewModel categoryViewModel){
            binding.setViewModel(categoryViewModel);
        }
    }
}
