package com.example.apprenti.wikimonsterlegends;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.ProgressBar;

public class SplashScreen extends Activity {

    private int progressStatus = 0;
    private ProgressBar progressBar;
    private Handler handler = new Handler();
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = findViewById(R.id.Bar1);

        new Thread(new Runnable() {
            public void run() {
                while (progressStatus < 100) {
                    progressStatus += 6.75;

                    handler.post(new Runnable() {
                        public void run() {
                            progressBar.setProgress(progressStatus);
                        }
                    });

                    try {

                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =  new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }

}