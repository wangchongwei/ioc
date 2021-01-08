package com.justin.ioc.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.justin.ioc.application.components.DaggerHttpComponent;
import com.justin.ioc.application.modules.HttpModule;
import com.justin.ioc.application.objects.HttpObject;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity==";

    @Inject
    HttpObject httpObject;

    @Inject
    HttpObject httpObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerHttpComponent.builder()
                .httpModule(new HttpModule())
                .build()
                .injectMainActivity(this);


        Log.d(TAG, "httpObject hashcode = " + httpObject.hashCode());
        Log.d(TAG, "httpObject2 hashcode = " + httpObject2.hashCode());

    }
}