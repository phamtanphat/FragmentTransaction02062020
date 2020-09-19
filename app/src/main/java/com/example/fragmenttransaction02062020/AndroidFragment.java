package com.example.fragmenttransaction02062020;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.Random;

public class AndroidFragment extends Fragment{


    View v;
    FrameLayout mFrameLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_android, container, false);
        mFrameLayout = v.findViewById(R.id.frameAndroid);
        mFrameLayout.setBackgroundColor(Color.rgb(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255)));
//        Bundle bundle = getArguments();
//        String chuoi = bundle.getString("string");
//        Log.d("BBB",chuoi);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((MainActivity)getActivity()).getDataFormActivity(new OnListDataActivity() {
            @Override
            public void receiveValue(String value) {
                Log.d("BBB",value);
            }
        });
    }
}