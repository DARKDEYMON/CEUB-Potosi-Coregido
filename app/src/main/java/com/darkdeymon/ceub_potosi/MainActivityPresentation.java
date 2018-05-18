package com.darkdeymon.ceub_potosi;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.darkdeymon.ceub_potosi.R;
import pl.droidsonroids.gif.GifImageView;

public class MainActivityPresentation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_presentation);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        GifImageView i = (GifImageView)findViewById(R.id.saltar);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("click","ya");
                finish();
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },5000);
    }
}
