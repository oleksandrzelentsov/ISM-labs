package com.example.ozlab1pola.button_listeners.calc;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ozlab1pola.R;
import com.example.ozlab1pola.button_listeners.AbstractBaseButtonListener;
import com.example.ozlab1pola.shapes.Shape;

public abstract class AbstractCalcButtonListener extends AbstractBaseButtonListener {
    abstract Shape getShape();

    AbstractCalcButtonListener(Activity _a) {
        super(_a);
    }

    @Override
    public void onClick(View v) {
        Shape shape = null;
        try {
            shape = getShape();
        } catch (NumberFormatException e) {
            Toast.makeText(activity, activity.getText(R.string.error01), Toast.LENGTH_LONG).show();
        }
        if (shape != null) {
            getResultTextView().setText(
                    Double.toString(shape.area())
            );
        }
    }

    TextView getResultTextView() {
        return ((TextView) activity.findViewById(R.id.resultTextView));
    }
}