package com.example.w6_4;


import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class Fragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2,container,false);
    }
//
//    ImageView iv_roulette;
//    float startDegree = 0f;
//    float endDegree   = 0f;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment2);
//
//        iv_roulette = (ImageView)findViewById(R.id.roulette);
//    }
//
//    public void rotate(View v) {
//        startDegree = endDegree;
//
//        Random rand = new Random();
//        int  degree_rand = rand.nextInt(360);
//        endDegree = startDegree + 360 * 3 + degree_rand;
//
//        ObjectAnimator object = ObjectAnimator.ofFloat(iv_roulette, "rotation", startDegree, endDegree);
//        object.setInterpolator(new AccelerateDecelerateInterpolator());
//        object.setDuration(5000);
//        object.start();
//    }
}
