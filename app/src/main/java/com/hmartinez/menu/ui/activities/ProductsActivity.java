package com.hmartinez.menu.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hmartinez.menu.R;
import com.hmartinez.menu.model.Category;
import com.hmartinez.menu.model.Product;
import com.hmartinez.menu.ui.fragments.ProductListFragment;

import java.util.ArrayList;

/**
 * Products Activity
 * Created by hmartinez on 10/12/15.
 */
public class ProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        if (findViewById(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {
                return;
            }

            Bundle extras = getIntent().getExtras();
            if (extras != null) {
            // Create an instance of ExampleFragment
            ProductListFragment mainFragment = new ProductListFragment();
            mainFragment.setArguments(extras);

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, mainFragment).commit();

            }
        }
    }

    public static Intent getStartIntent(Context context, Category category) {
        Intent intent = new Intent(context, ProductsActivity.class);

        intent.putExtra(ProductListFragment.CATEGORY, category);
        return intent;
    }
}
