package com.example.a503_.nije1004_resourceuse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ResourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);

        final ImageView imageView = (ImageView)findViewById(R.id.imageView);
        // 애니메이션 찾아오기
        final Animation ani01 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.in);

        // 애니메이션에 리스너를 설정
        ani01.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation ani02 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                ani02.setFillAfter(true);
                imageView.startAnimation(ani02);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        imageView.startAnimation(ani01);
    }
}
