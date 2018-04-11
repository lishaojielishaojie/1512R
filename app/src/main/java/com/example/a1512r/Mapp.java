package com.example.a1512r;

import android.app.Application;
import android.content.Context;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by 小石头 on 2018/4/11.
 */

public class Mapp extends Application {

    public void onCreate() {
        super.onCreate();
        //这个叫imageloader配置类,这种创建方式叫链式思想
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this).build();

        //获取imageLoader实例
        ImageLoader instance = ImageLoader.getInstance();
        //初始化imageLoader;
        instance.init(configuration);


    }
}
