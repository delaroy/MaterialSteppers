package com.delaroystudios.materialsteppers.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ivb.com.materialstepper.stepperFragment;
import com.delaroystudios.materialsteppers.R;


public class Instruction extends stepperFragment {
    @Override
    public boolean onNextButtonHandler() {
        return true;
    }
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(
                R.layout.instruction, container, false);
    }


}
