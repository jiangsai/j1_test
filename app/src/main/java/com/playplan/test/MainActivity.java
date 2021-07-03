package com.playplan.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.playplan.testlib.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test.getLog();
    }
}