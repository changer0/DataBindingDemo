package com.example.lulu.databindingdemo;

import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by lulu on 2016/12/9.
 */

public class Utils {
    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView imageView, String url) {
        if (TextUtils.isEmpty(url)) {
            //如果网址为空, 默认加载ic_launcher
            imageView.setImageResource(R.mipmap.ic_launcher);
        } else {
            //使用Glide加载图片
            Glide.with(imageView.getContext()).load(url).into(imageView);
        }
    }
}
