package com.example.ozlab1pola.activities.shape_editors;

import com.example.ozlab1pola.R;
import com.example.ozlab1pola.button_listeners.calc.AbstractCalcButtonListener;
import com.example.ozlab1pola.button_listeners.calc.TriangleCalcButtonListener;

public class TriangleActivity extends AbstractShapeActivity {
    public final static String TRIANGLE_RESULT = "Area of triangle";

    @Override
    protected int getActivityId() {
        return R.layout.activity_triangle;
    }

    @Override
    protected String getIntentResultKey() {
        return TRIANGLE_RESULT;
    }

    @Override
    protected AbstractCalcButtonListener getCalcButtonListener() {
        return new TriangleCalcButtonListener(this);
    }
}
