package com.example.a1512r;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;
    String urlBitmap = "http://img.my.csdn.net/uploads/201407/26/1406383265_8550.jpg";
    private ImageLoader instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //得到imageloader实例;
        instance = ImageLoader.getInstance();
        iv = (ImageView) findViewById(R.id.iv);
        //点击图片的时候加载图片
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //框架中已经处理了请求网络
                //底层已经处理了子线程数据和主线程数据的回调;
                instance.displayImage(urlBitmap,iv);
            }
        });





    }
}
