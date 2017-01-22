package com.delaroystudios.materialsteppers;

import android.content.DialogInterface;

import java.util.ArrayList;
import java.util.List;

import ivb.com.materialstepper.progressMobileStepper;
import com.delaroystudios.materialsteppers.fragments.FormFragment;
import com.delaroystudios.materialsteppers.fragments.Instruction;
import com.delaroystudios.materialsteppers.fragments.TextFragment;

;

public class MainActivity extends progressMobileStepper {

   List<Class> stepperFragmentList = new ArrayList<>();


    @Override
    public List<Class> init() {
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(FormFragment.class);
        stepperFragmentList.add(Instruction.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(FormFragment.class);
        stepperFragmentList.add(Instruction.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(FormFragment.class);
        stepperFragmentList.add(Instruction.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(FormFragment.class);
        stepperFragmentList.add(Instruction.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(FormFragment.class);
        stepperFragmentList.add(Instruction.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(FormFragment.class);
        stepperFragmentList.add(Instruction.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(TextFragment.class);
        stepperFragmentList.add(FormFragment.class);
        stepperFragmentList.add(Instruction.class);
        stepperFragmentList.add(TextFragment.class);

        return stepperFragmentList;
    }


    @Override
    public void onStepperCompleted() {
        showCompletedDialog();
    }

    protected void showCompletedDialog(){
        android.support.v7.app.AlertDialog.Builder alertDialogBuilder = new android.support.v7.app.AlertDialog.Builder(
                MainActivity.this);

        // set title
        alertDialogBuilder.setTitle("Hooray");
        alertDialogBuilder
                .setMessage("We've completed the stepper")
                .setCancelable(true)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {

                    }
                });

        // create alert dialog
        android.support.v7.app.AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();

    }
}
