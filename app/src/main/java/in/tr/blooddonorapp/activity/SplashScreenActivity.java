/*
 * Created by Mohamed Ibrahim N
 * Created on : 26/11/17 4:26 PM
 * File name : SplashScreenActivity.java
 * Last modified by : Mohamed Ibrahim N
 * Last modified on : 18/11/17 2:06 PM
 * Project : BloodDonorApp
 * Organization : Agam
 * Copyright (c) 2017. All rights reserved.
 */

package in.tr.blooddonorapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import in.tr.blooddonorapp.R;


public class SplashScreenActivity extends AppCompatActivity {
    private CountDownTimer splashTimer;
    private AppCompatImageView splashLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        startSplashTimer();
    }

    private void startSplashTimer() {
        splashTimer = new CountDownTimer(2000, 1000) {

            public void onTick(long millisUntilFinished) {
                startLogoAnimation();
            }

            public void onFinish() {
                try {
                    startHomeScreenActivity();
                } catch (Exception ex) {
                    splashTimer.cancel();
                }
            }
        }.start();
    }

    private void startLogoAnimation() {
        Animation zoomIn = AnimationUtils.loadAnimation(this, R.anim.translate);
        zoomIn.reset();
        splashLogo = (AppCompatImageView) findViewById(R.id.splash_logo);
        splashLogo.clearAnimation();
        splashLogo.startAnimation(zoomIn);
    }

    private void startHomeScreenActivity() {
        Intent homeScreenActivity = new Intent(SplashScreenActivity.this, SplashScreenActivity.class);
        startActivity(homeScreenActivity);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        splashTimer.cancel();
        splashTimer.onFinish();
    }
}
