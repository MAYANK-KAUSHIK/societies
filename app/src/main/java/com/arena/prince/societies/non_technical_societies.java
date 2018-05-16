package com.arena.prince.societies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class non_technical_societies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_technical_societies);
    }
    public void onclick3(View view) {

    }

    public void onclick4(View view) {
        Intent ik = new Intent(this,csi.class);
        startActivity(ik);
    }


}
