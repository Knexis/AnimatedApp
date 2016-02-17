package com.example.ewurama_minka.animatedapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;


public class MainGameClass extends BaseActivity {


    ImageView food1;
    ImageView food2;
    ImageView food3;
    ImageView food4;


    ArrayList<ImageView> playFood = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //mplay();
        setContentView(R.layout.appbackgroung);

        playFood.add((ImageView) findViewById(R.id.food1));
        playFood.add((ImageView) findViewById(R.id.food2));
        playFood.add((ImageView) findViewById(R.id.food3));
        playFood.add((ImageView) findViewById(R.id.food4));



        findViewById(R.id.food1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

        startTimer();


    }//bundle





    @Override
    protected void onResume() {
        super.onResume();
        playInGameSong();
    }

    private void startTimer() {
        new CountDownTimer(60000, 5000) {
            public void onTick(long millisUntilFinished) {
                //mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
                pullRandomFoods();
            }
            public void onFinish() {
                //mTextField.setText("done!");
                startActivity(new Intent(MainGameClass.this, weldone.class));
            }
        }.start();
//        end game after timer hits 60seconds
//        startActivity(new Intent(MainGameClass.this, weldone.class));

    }



    public void clickfoodmissing() {
        ArrayList<Integer> newFoods = BossuFoodBusket.hitusWiththeFood();
        for (int i = 0; i < playFood.size(); i++) {
            playFood.get(i).setImageResource(newFoods.get(i));
        }
        Animation missing = AnimationUtils.loadAnimation(this, R.anim.foodmissing);
        playFood.get(0).startAnimation(missing);
        playFood.get(1).startAnimation(missing);
        playFood.get(2).startAnimation(missing);
        playFood.get(3).startAnimation(missing);
    }


    public void pullRandomFoods() {
        ArrayList<Integer> newFoods = BossuFoodBusket.hitusWiththeFood();
        for (int i = 0; i < playFood.size(); i++) {
            playFood.get(i).setImageResource(newFoods.get(i));
        }
        Animation sunRise = AnimationUtils.loadAnimation(this, R.anim.fooddropping);
        playFood.get(0).startAnimation(sunRise);
        playFood.get(1).startAnimation(sunRise);
        playFood.get(2).startAnimation(sunRise);
        playFood.get(3).startAnimation(sunRise);


    }









//    public boolean onTouchEvent(MotionEvent event) {
//        if (event.getAction() == MotionEvent.ACTION_UP) {
//            startTimer();
//            //on every touch start the timer event
//        }
//        return true;
//
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_animated, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
