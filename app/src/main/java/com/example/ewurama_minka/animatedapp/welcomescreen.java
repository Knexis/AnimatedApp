package com.example.ewurama_minka.animatedapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;

import java.io.IOException;

public class welcomescreen extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

    }


    @Override
    protected void onResume() {
        super.onResume();

        playThemeSong();

    }

    public void soundandgame(View view) {


//        nicholas.setText("Nicholas (Clicked!) ");

        startActivity(new Intent(welcomescreen.this, MainGameClass.class));

    }
}
