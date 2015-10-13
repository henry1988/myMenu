package com.hmartinez.menu.ui;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by hmartinez on 10/11/15.
 */
public final class DataBinder {

    private DataBinder() {
        //NO-OP
    }

    @BindingAdapter("image_url")
    public static void setImageUrl(ImageView imageView, String url) {
        if (!TextUtils.isEmpty(url)) {
            Context context = imageView.getContext();
            Picasso.with(context).load(url).into(imageView);
        }
    }
}
