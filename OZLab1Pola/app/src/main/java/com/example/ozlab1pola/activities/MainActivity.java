package com.example.ozlab1pola.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ozlab1pola.R;
import com.example.ozlab1pola.activities.shape_editors.CircleActivity;
import com.example.ozlab1pola.activities.shape_editors.RectangleActivity;
import com.example.ozlab1pola.activities.shape_editors.TriangleActivity;
import com.example.ozlab1pola.button_listeners.ShapeActivityButtonListener;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    public static final int CODE_TRIANGLE = 10;
    public static final int CODE_RECTANGLE = 11;
    public static final int CODE_CIRCLE = 12;

    protected final static Map<Integer, String> codes_data_keys = new HashMap<Integer, String>(){{
        put(CODE_TRIANGLE, TriangleActivity.TRIANGLE_RESULT);
        put(CODE_RECTANGLE, RectangleActivity.RECTANGLE_RESULT);
        put(CODE_CIRCLE, CircleActivity.CIRCLE_RESULT);
    }};
    private Double area;

    static Double getAreaFromData(Intent data, String key) {
        String str = data.getStringExtra(key);
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        area = 0.0;
        findViewById(R.id.triangleButton).setOnClickListener(
            new ShapeActivityButtonListener(this, TriangleActivity.class, CODE_TRIANGLE)
        );
        findViewById(R.id.rectangleButton).setOnClickListener(
            new ShapeActivityButtonListener(this, RectangleActivity.class, CODE_RECTANGLE)
        );
        findViewById(R.id.circleButton).setOnClickListener(
            new ShapeActivityButtonListener(this, CircleActivity.class, CODE_CIRCLE)
        );
        findViewById(R.id.resetButton).setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clearArea();
                }
            }
        );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null || !codes_data_keys.containsKey(requestCode)) {
            Toast.makeText(this, "unknown", Toast.LENGTH_LONG).show();
            return;
        }

        area += getAreaFromData(data, codes_data_keys.get(requestCode));
        updateArea();
    }

    void updateArea() {
        ((TextView) findViewById(R.id.resultTextView)).setText(Double.toString(area));
    }

    void clearArea() {
        ((TextView) findViewById(R.id.resultTextView)).setText("0.0");
    }
}
