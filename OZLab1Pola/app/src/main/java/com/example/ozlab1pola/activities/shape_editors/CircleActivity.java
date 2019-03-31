package com.example.ozlab1pola.activities.shape_editors;

import com.example.ozlab1pola.R;
import com.example.ozlab1pola.button_listeners.calc.AbstractCalcButtonListener;
import com.example.ozlab1pola.button_listeners.calc.CircleCalcButtonListener;

public class CircleActivity extends AbstractShapeActivity {
    public final static String CIRCLE_RESULT = "Area of circle";

    @Override
    protected int getActivityId() {
        return R.layout.activity_circle;
    }

    @Override
    protected String getIntentResultKey() {
        return CIRCLE_RESULT;
    }

    @Override
    protected AbstractCalcButtonListener getCalcButtonListener() {
        return new CircleCalcButtonListener(this);
    }
}
