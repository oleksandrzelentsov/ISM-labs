package com.example.ozlab1pola.button_listeners.calc;

import android.app.Activity;
import android.widget.EditText;

import com.example.ozlab1pola.R;
import com.example.ozlab1pola.shapes.Circle;
import com.example.ozlab1pola.shapes.Shape;

public class CircleCalcButtonListener extends AbstractCalcButtonListener {
    public CircleCalcButtonListener(Activity _activity) {
        super(_activity);
    }

    @Override
    Shape getShape() {
        double r = Double.parseDouble(((EditText) activity.findViewById(R.id.aEditText))
                .getText().toString());

        return new Circle(r);
    }
}
