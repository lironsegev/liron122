package com.example.lironsegev.liron122;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb1;
    Switch sw1;
    LinearLayout liron;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1= (ToggleButton)findViewById(R.id.tb1);
        sw1= (Switch) findViewById(R.id.sw1);
        liron= (LinearLayout) findViewById(R.id.liron);
    }

    public void onSwitch(View view) {
        if(sw1.isChecked())
            liron.setBackgroundColor(Color.GREEN);
        else
            liron.setBackgroundColor(Color.YELLOW);
    }

    public void onToggle(View view) {
        if(tb1.isChecked())
            liron.setBackgroundColor(Color.BLUE);
        else
            liron.setBackgroundColor(Color.RED);

    }

}
