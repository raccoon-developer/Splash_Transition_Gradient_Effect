package com.baniya.emco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
private ImageView screw1,screw2;
    private View splash_image;
    private TextView text_splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        screw1=(ImageView) findViewById(R.id.four_screw);
        screw2=(ImageView) findViewById(R.id.single_screw);
        text_splash=(TextView) findViewById(R.id.text1);
        //splash_image=(View) findViewById(R.id.splash_img);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytrans);
        //splash_image.startAnimation(myanim);
        screw1.startAnimation(
                AnimationUtils.loadAnimation(this, R.anim.rotate_anim) );
        //screw1.startAnimation(myanim);
        screw2.startAnimation(
                AnimationUtils.loadAnimation(this, R.anim.rotate_anim) );
        text_splash.startAnimation(myanim);
    }
}
