package com.example.ozlab1pola.activities.shape_editors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ozlab1pola.R;
import com.example.ozlab1pola.button_listeners.back.BackAndAddButtonListener;
import com.example.ozlab1pola.button_listeners.back.BackButtonListener;
import com.example.ozlab1pola.button_listeners.calc.AbstractCalcButtonListener;

public abstract class AbstractShapeActivity extends AppCompatActivity {
    protected abstract int getActivityId();
    protected abstract String getIntentResultKey();

    protected abstract AbstractCalcButtonListener getCalcButtonListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityId());

        findViewById(getCalcButtonId()).setOnClickListener(getCalcButtonListener());

        findViewById(getBackAndAddButtonId()).setOnClickListener(
            new BackAndAddButtonListener(this, getIntentResultKey(), getResultTextViewId())
        );

        findViewById(getBackButtonId()).setOnClickListener(new BackButtonListener(this, getIntentResultKey()));
    }

    protected int getResultTextViewId() {
        return R.id.resultTextView;
    }

    protected int getCalcButtonId() {
        return R.id.calcButton;
    }

    protected int getBackAndAddButtonId() {
        return R.id.backAndAddButton;
    }

    protected int getBackButtonId() {
        return R.id.backButton;
    }
}
