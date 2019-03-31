package com.example.ozlab1pola.button_listeners.back;

import android.app.Activity;
import android.widget.TextView;

import com.example.ozlab1pola.button_listeners.back.BackButtonListener;

public class BackAndAddButtonListener extends BackButtonListener {
    protected int resultViewId;

    public BackAndAddButtonListener(Activity _a, String _activityResultKey, int _resultViewId) {
        super(_a, _activityResultKey);
        resultViewId = _resultViewId;
    }

    @Override
    protected String getValue() {
        return ((TextView) activity.findViewById(resultViewId))
                .getText().toString();
    }
}
