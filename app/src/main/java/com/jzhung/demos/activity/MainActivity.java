package com.jzhung.demos.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.jzhung.demos.R;
import com.jzhung.demos.http.VolleyActivity;


public class MainActivity extends ActionBarActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btn1OnClick(View view){
        Intent intent = new Intent(MainActivity.this, VolleyActivity.class);
        startActivity(intent);
    }

}
