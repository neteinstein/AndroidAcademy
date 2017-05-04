package org.neteinstein.androidacademy.class1.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.neteinstein.androidacademy.R;

public class RelativeLayoutExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class1_activity_relative_layout_example);
        getActionBar().hide();
    }
}
