package com.example.lulu.databindingdemo;

import android.databinding.DataBindingComponent;

/**
 * Created by lulu on 2016/12/10.
 */

public class MyComponent implements DataBindingComponent {
    private Utils mUtils;
    @Override
    public Utils getUtils() {
        if (mUtils == null) {
            mUtils = new Utils();
        }
        return mUtils;
    }
}
