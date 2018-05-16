package com.arena.prince.societies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class societies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_societies);
    }

    public void onclick1(View view) {
        Intent i = new Intent(this,technical_societies.class);
        startActivity(i);
    }

    public void onclick2(View view) {
        Intent j = new Intent(this,non_technical_societies.class);
        startActivity(j);
    }
}
