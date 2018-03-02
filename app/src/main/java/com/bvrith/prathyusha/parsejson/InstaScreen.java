package com.bvrith.prathyusha.parsejson;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class InstaScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta_screen);

        TextView tv = findViewById(R.id.tv);

        Bundle i = getIntent().getExtras();
        String x = i.getString("x");

        tv.setText(x,TextView.BufferType.EDITABLE);
    }
}
