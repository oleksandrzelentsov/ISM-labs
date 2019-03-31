package com.example.ozlab1pola.activities.shape_editors;

import com.example.ozlab1pola.R;
import com.example.ozlab1pola.button_listeners.calc.AbstractCalcButtonListener;
import com.example.ozlab1pola.button_listeners.calc.RectangleCalcButtonListener;

public class RectangleActivity extends AbstractShapeActivity {
    public final static String RECTANGLE_RESULT = "Area of rectangle";

    @Override
    protected int getActivityId() {
        return R.layout.activity_rectangle;
    }

    @Override
    protected String getIntentResultKey() {
        return RECTANGLE_RESULT;
    }

    @Override
    protected AbstractCalcButtonListener getCalcButtonListener() {
        return new RectangleCalcButtonListener(this);
    }
}
