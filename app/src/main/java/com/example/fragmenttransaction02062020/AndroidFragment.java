package com.example.fragmenttransaction02062020;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.Random;

public class AndroidFragment extends Fragment {


    View v;
    FrameLayout mFrameLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_android, container, false);
        mFrameLayout = v.findViewById(R.id.frameAndroid);
        mFrameLayout.setBackgroundColor(Color.rgb(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255)));
        return v;
    }
}