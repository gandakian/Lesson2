package com.almightyamir.assignment2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String test = "Hello World";

        Float desiredSp = 30.0f;
        float density  = getResources().getDisplayMetrics().density;

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.TOP);

        TextView textV1 = new TextView(this);
        textV1.setText(R.string.title_string);
        textV1.setGravity(Gravity.CENTER);
        textV1.setTextSize(20);
        textV1.setTextColor(Color.BLUE);
        textV1.setTextSize(TypedValue.COMPLEX_UNIT_SP, desiredSp / density);
        layout.addView(textV1);

        TextView textV2 = new TextView(this);
        textV2.setText(R.string.body_string);
        textV2.setTextSize(20);
        textV2.setTextColor(Color.CYAN);
        textV2.setTextSize(TypedValue.COMPLEX_UNIT_SP, desiredSp / density);
        layout.addView(textV2);

        TextView textV3 = new TextView(this);
        textV3.setText(R.string.footer_string);
        textV3.setTextSize(20);
        textV3.setTextColor(Color.RED);
        textV3.setTextSize(TypedValue.COMPLEX_UNIT_SP, desiredSp / density);
        layout.addView(textV3);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100,25);
        layout.setLayoutParams(layoutParams);

        setContentView(layout);
    }
}
