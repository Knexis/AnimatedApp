package com.example.ewurama_minka.animatedapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import java.io.IOException;

/**
 * Created by Nana Kwame Nyantakyi on 2/16/2016 @8:31 PM.
 * Purpose:
 * Note:
 */
public class BaseActivity extends AppCompatActivity {
    private static MediaPlayer mPlayer;// so that all the classes have access to the same player

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(mPlayer == null) {
            mPlayer = MediaPlayer.create(this, R.raw.startsong);
        }



    }


    public void playThemeSong(){
        mPlayer.stop();
        mPlayer.release();

        mPlayer = MediaPlayer.create(this, R.raw.startsong);
        mPlayer.start();
    }

    public void playInGameSong(){

        mPlayer.stop();
        mPlayer.release();

        mPlayer = MediaPlayer.create(this, R.raw.song1);
        mPlayer.start();
    }



//    public void missingonclick(){
//        findViewById(R.id.food1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
//    }





    @Override
    protected void onPause() {
        super.onPause();
        mPlayer.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPlayer.start();
    }
}//main
