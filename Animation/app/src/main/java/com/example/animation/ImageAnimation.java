package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_animation);

    }

    public void Animation(View view) {

        ImageView imageView = findViewById(R.id.imageView);

//        imageView.animate().alpha(0).setDuration(2000);

//        imageView.animate().translationYBy(-250).setDuration(2000);

//        imageView.animate().rotation(180);

        imageView.animate().scaleX(0.5f).scaleY(0.5f).rotation(720).setDuration(3000).translationYBy(-300);
    }
}