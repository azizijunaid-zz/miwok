package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Junaid on 9/24/2016.
 */

public class NumbersClickListeners implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Open the listt of Numbers", Toast.LENGTH_SHORT).show();
    }
}
