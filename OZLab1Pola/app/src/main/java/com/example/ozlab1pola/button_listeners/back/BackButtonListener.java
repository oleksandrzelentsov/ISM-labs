package com.example.ozlab1pola.button_listeners.back;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.example.ozlab1pola.button_listeners.AbstractBaseButtonListener;

public class BackButtonListener extends AbstractBaseButtonListener {
    protected String activityResultKey;

    public BackButtonListener(Activity _a, String _activityResultKey) {
        super(_a);
        activityResultKey = _activityResultKey;
    }

    protected void setValue(Intent intent) {
        intent.putExtra(activityResultKey, getValue());
    }

    protected String getValue() {
        return "0.0";
    }

    @Override
    public void onClick(View v) {
        Intent backIntent = new Intent();
        setValue(backIntent);
        activity.setResult(Activity.RESULT_OK, backIntent);
        activity.finish();
    }
}
