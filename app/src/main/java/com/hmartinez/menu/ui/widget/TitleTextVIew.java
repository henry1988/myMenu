package com.hmartinez.menu.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

import com.hmartinez.menu.utils.Typefaces;

/**
 * Created by hmartinez on 10/12/15.
 */
public class TitleTextVIew extends TextView{
    public TitleTextVIew(Context context) {
        super(context);
        initTextView(context);
    }

    public TitleTextVIew(Context context, AttributeSet attrs) {
        super(context, attrs);
        initTextView(context);
    }

    public TitleTextVIew(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initTextView(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TitleTextVIew(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initTextView(context);
    }

    private void initTextView(Context context) {
        if (!isInEditMode()) {
            createFont(context, this);
        }
    }

    private void createFont(Context context, TextView view) {
        Typeface font = Typefaces.get(context, "KaushanScript-Regular");
        view.setTypeface(font);
    }
}
