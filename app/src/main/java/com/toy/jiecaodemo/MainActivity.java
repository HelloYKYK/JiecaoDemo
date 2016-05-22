package com.toy.jiecaodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bumptech.glide.Glide;

import fm.jiecao.jcvideoplayer_lib.JCFullScreenActivity;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerSimple;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JCVideoPlayerStandard jcVideoPlayerStandard = (JCVideoPlayerStandard) findViewById(R.id.jc_standard);
        JCVideoPlayerSimple jcVideoPlayerSimple = (JCVideoPlayerSimple) findViewById(R.id.jc_simple);
        if (jcVideoPlayerStandard!=null) {
            jcVideoPlayerStandard.setUp("http://2449.vod.myqcloud.com/2449_bfbbfa3cea8f11e5aac3db03cda99974.f20.mp4"
                    , "嫂子想我没");
            Glide.with(this)
                    .load("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640")
                    .into(jcVideoPlayerStandard.ivThumb);
        }
        if (jcVideoPlayerSimple!=null) {
            jcVideoPlayerSimple.setUp("http://2449.vod.myqcloud.com/2449_bfbbfa3cea8f11e5aac3db03cda99974.f20.mp4"
                    , "嫂子想我没");
        }

    }

    public void fullScren(View view) {
        JCFullScreenActivity.toActivity(this,
                "http://video.jiecao.fm/5/1/%E8%87%AA%E5%8F%96%E5%85%B6%E8%BE%B1.mp4",
                JCVideoPlayerStandard.class,
                "嫂子别摸我");
    }
}
