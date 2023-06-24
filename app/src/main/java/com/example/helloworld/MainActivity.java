package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String msg = "Android : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg,"This is onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg,"This is onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg,"This is onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg,"This is onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg,"This is onDestroy");
    }

    public void startService(View view){
        startService(new Intent(getBaseContext(), MyService.class));
    }

    public void stopService(View view){
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}