package com.example.ozlab1pola.button_listeners;

import android.app.Activity;
import android.view.View;

public abstract class AbstractBaseButtonListener implements View.OnClickListener {
    protected Activity activity;

    public AbstractBaseButtonListener(Activity _a) {
        activity = _a;
    }
}
