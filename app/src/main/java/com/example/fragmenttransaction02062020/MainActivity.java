package com.example.fragmenttransaction02062020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager mFragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager = getSupportFragmentManager();
    }

    public void addAndroid(View view) {
        AndroidFragment androidFragment = new AndroidFragment();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.liearlayoutContainer,androidFragment,"fragmentAndroid");
        fragmentTransaction.addToBackStack("FragmentAndroidStack");
        fragmentTransaction.commit();
    }

    public void addIos(View view) {
        IosFragment iosFragment = new IosFragment();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.liearlayoutContainer,iosFragment,"fragmentIos");
        fragmentTransaction.addToBackStack("FragmentIosStack");
        fragmentTransaction.commit();
    }

    public void replaceAndroid(View view) {
        AndroidFragment androidFragment = new AndroidFragment();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.liearlayoutContainer,androidFragment);
        fragmentTransaction.commitNow();
    }

    public void replaceIos(View view) {
        IosFragment iosFragment = new IosFragment();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.liearlayoutContainer,iosFragment);
        fragmentTransaction.commitNow();
    }

    public void removeAndroid(View view) {
        AndroidFragment androidFragment = (AndroidFragment) mFragmentManager.findFragmentByTag("fragmentAndroid");
        if (androidFragment != null){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.remove(androidFragment);
            fragmentTransaction.commit();
        }
    }

    public void removeIos(View view) {
        IosFragment iosFragment = (IosFragment) mFragmentManager.findFragmentByTag("fragmentIos");
        if (iosFragment != null){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.remove(iosFragment);
            fragmentTransaction.commit();
        }
    }

    public void popbackstack(View view) {
        mFragmentManager.popBackStack(1 , FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    public void detach(View view) {
        AndroidFragment androidFragment = (AndroidFragment) mFragmentManager.findFragmentByTag("fragmentAndroid");
        if (androidFragment != null){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.detach(androidFragment);
            fragmentTransaction.commit();
        }
    }

    public void attach(View view) {
        AndroidFragment androidFragment = (AndroidFragment) mFragmentManager.findFragmentByTag("fragmentAndroid");
        if (androidFragment != null){
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.attach(androidFragment);
            fragmentTransaction.commit();
        }
    }
}