package com.huang.news;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.LinearLayout;

import com.huang.videoplayer.VideoViewActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

// app
// videoplayer 视频播放
// vitamio
public class MainActivity extends AppCompatActivity {
    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.viewPager)
    ViewPager viewPager;
    @InjectView(R.id.btnNews)
    Button btnNews;
    @InjectView(R.id.buttonBar)
    LinearLayout buttonBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        ButterKnife.inject(this);
    }

    @OnClick(R.id.btnLikes)
    public void Likes() {
        // 进入部分播放Activity
        Intent intent = new Intent(MainActivity.this, PartPlayActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnLocal)
    public void Local() {
        // 开启VideoViewActivity进行视频播放
        VideoViewActivity.open(this, getTestVideo1());
    }

    private String getTestVideo1() {
        return "http://o9ve1mre2.bkt.clouddn.com/raw_%E6%B8%A9%E7%BD%91%E7%94%B7%E5%8D%95%E5%86%B3%E8%B5%9B.mp4";
    }


//    @OnClick({R.id.btnLocal, R.id.btnLikes})
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.btnLocal:
//                VideoViewActivity.open(this, getTestVideo1());
//                break;
//            case R.id.btnLikes:
//                Intent intent = new Intent(this, PartPlayActivity.class);
//                startActivity(intent);
//                break;
//        }
//    }
}
