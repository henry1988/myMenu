package com.hmartinez.menu.view_model;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hmartinez.menu.R;
import com.hmartinez.menu.model.Category;
import com.hmartinez.menu.model.Product;
import com.hmartinez.menu.ui.activities.ProductsActivity;

import java.util.ArrayList;

/**
 * Created by hmartinez on 10/12/15.
 */
public class CategoryViewModel {

    private final Context context;
    private Category category;

    public CategoryViewModel(Context context, Category category) {
        this.context = context;
        this.category = category;
    }

    public String getName(){
        return category.getName();
    }

    public String getImage(){
        return category.getImageUrl();
    }

    public String getDescription(){
        return category.getDescription();
    }

    public ArrayList<Product> getProducts(){
        return new ArrayList<>(category.getProducts());
    }

    public void onCategoryClicked(View view) {


        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            final Intent intent = ProductsActivity.getStartIntent(context, category);
            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                    activity,
                    new Pair<View, String>(view.findViewById(R.id.product_image),
                            context.getString(R.string.transition_name_category_image))
            );
            ActivityCompat.startActivity(activity, intent, options.toBundle());
        }
    }


}
