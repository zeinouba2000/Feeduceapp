package com.example.zeineb.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        // attender 3 sesondes avant de paaser au main activity

        Thread timer = new Thread(){

            @Override
            public void run() {
                super.run();

                try {
                    sleep(3000);
                    Intent toMainActivity = new Intent(LogoActivity.this, MainActivity.class);
                    startActivity(toMainActivity);
                }catch (Exception ex){

                }
            }


        };
        timer.start();
    }
}
