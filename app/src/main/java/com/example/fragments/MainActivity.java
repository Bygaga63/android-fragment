package com.example.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements ButtonFragment.FragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void update(String data) {
        TextFragment fragment = (TextFragment)getSupportFragmentManager().findFragmentById(R.id.text_fragment);
        fragment.setTv(data);
    }
}
