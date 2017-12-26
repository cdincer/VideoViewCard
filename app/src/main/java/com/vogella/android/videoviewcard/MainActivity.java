package com.vogella.android.videoviewcard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final VideoView videoView =
                (VideoView) findViewById(R.id.simpleVideoView);
        VideoView video=(VideoView) findViewById(R.id.simpleVideoView);

        video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.fishvideo);


        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });


        MediaPlayer mPlayer = MediaPlayer.create(this,R.raw.timeless);
        mPlayer.start();
        mPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
            @Override
            public void onPrepared(MediaPlayer mp2){

                mp2.setLooping(true);
            }
        });

    }





}
