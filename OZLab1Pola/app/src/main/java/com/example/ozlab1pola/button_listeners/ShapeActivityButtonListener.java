package com.example.ozlab1pola.button_listeners;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.example.ozlab1pola.button_listeners.AbstractBaseButtonListener;

public class ShapeActivityButtonListener extends AbstractBaseButtonListener {
    protected final Class nextActivity;
    protected final int code;

    public ShapeActivityButtonListener(Activity _a, Class _nextActivity, int _code) {
        super(_a);
        nextActivity = _nextActivity;
        code = _code;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(activity, nextActivity);
        activity.startActivityForResult(intent, code);
    }
}
