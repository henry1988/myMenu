package com.hmartinez.menu.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

import java.util.Hashtable;

/**
 * Created by hmartinez on 10/12/15.
 */
public class Typefaces {
    private static final Hashtable<String, Typeface> cache = new Hashtable<String, Typeface>();

    public static Typeface get(Context c, String name) {
        synchronized (cache) {
            if (!cache.containsKey(name)) {
                Typeface t = Typeface.createFromAsset(
                        c.getAssets(),
                        String.format("fonts/%s.otf", name)
                );
                cache.put(name, t);
            }
            return cache.get(name);
        }
    }




}
