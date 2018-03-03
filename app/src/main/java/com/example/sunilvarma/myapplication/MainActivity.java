 package com.example.sunilvarma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView animationView = (LottieAnimationView) findViewById(R.id.animation_view1);

        animationView.setImageAssetsFolder("images");
        animationView.setAnimation("roket(1).json");
        animationView.loop(true);
        animationView.playAnimation();

        LottieAnimationView animationView2 = (LottieAnimationView) findViewById(R.id.animation_view2);

      //  animationView2.setImageAssetsFolder("images");
        animationView2.setAnimation("menuButton1.json");
        animationView2.loop(true);
        animationView2.playAnimation();



    }
}
