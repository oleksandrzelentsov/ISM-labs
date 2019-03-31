package com.example.ozlab1pola.button_listeners.calc;

import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ozlab1pola.R;
import com.example.ozlab1pola.shapes.Rectangle;
import com.example.ozlab1pola.shapes.Shape;
import com.example.ozlab1pola.shapes.Triangle;

public class RectangleCalcButtonListener extends AbstractCalcButtonListener {
    public RectangleCalcButtonListener(Activity _activity) {
        super(_activity);
    }

    @Override
    Shape getShape() {
        double a = Double.parseDouble(((EditText) activity.findViewById(R.id.aEditText))
                .getText().toString());
        double b = Double.parseDouble(((EditText) activity.findViewById(R.id.bEditText))
                .getText().toString());

        return new Rectangle(a, b);
    }
}
