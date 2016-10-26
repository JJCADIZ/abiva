package com.example.jjcadiz.appbiva;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.paolorotolo.appintro.ISlideBackgroundColorHolder;


public class First_Fragment extends Fragment {

@Override
public View onCreateView(LayoutInflater inflater,
        ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.splash_1, container, false);
        }



        }