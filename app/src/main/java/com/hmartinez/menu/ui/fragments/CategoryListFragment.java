package com.hmartinez.menu.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hmartinez.menu.R;
import com.hmartinez.menu.model.Category;
import com.hmartinez.menu.ui.adapters.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Category List Fragment
 * Created by hmartinez on 10/12/15.
 */
public class CategoryListFragment extends Fragment{

    public static final String CATEGORIES = "categories";
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private CategoryAdapter mAdapter;
    private List<Category> categories = new ArrayList<>();

    public static CategoryListFragment newInstance(ArrayList<Category> categories){
        CategoryListFragment fragment = new CategoryListFragment();
        Bundle args = new Bundle();
        args.putParcelableArrayList(CATEGORIES, categories);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Bundle arguments = getArguments();
        if (arguments != null){
            categories = arguments.getParcelableArrayList(CATEGORIES);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View viewRoot = inflater.inflate(R.layout.fragment_list, container, false);
        mRecyclerView = (RecyclerView) viewRoot.findViewById(R.id.category_list);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter =  new CategoryAdapter(getContext(), categories);
        mRecyclerView.setAdapter(mAdapter);
        return viewRoot;

    }
}
