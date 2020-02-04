package com.example.wasmhanew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashlauncher splashlauncher=new splashlauncher();
        splashlauncher.start();
    }
    private class splashlauncher extends Thread{
        @Override
        public void run() {
            try {
                sleep(1000);

            }
            catch (InterruptedException e){
                e.printStackTrace();

            }
            Intent intent=new Intent(SplashActivity.this,MainActivity.class);
            startActivity(intent);
            SplashActivity.this.finish();

        }
    }
}

