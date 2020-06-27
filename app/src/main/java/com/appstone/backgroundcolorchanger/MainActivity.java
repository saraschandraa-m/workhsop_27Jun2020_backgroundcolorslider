package com.appstone.backgroundcolorchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mRoot;
    private SeekBar seekbarRed;
    private SeekBar seekbarGreen;
    private SeekBar seekbarBlue;
    private Button btnReset;

    private int redcolor = 0;
    private int greencolor = 0;
    private int bluecolor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRoot = findViewById(R.id.ll_root);
        seekbarRed = findViewById(R.id.seekbar_red);
        seekbarGreen = findViewById(R.id.seekbar_green);
        seekbarBlue = findViewById(R.id.seekbar_blue);
        btnReset = findViewById(R.id.btn_reset);

        seekbarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                redcolor = (int) Math.round(i * 2.55);
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekbarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                greencolor = (int) Math.round(i*2.55);
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekbarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                bluecolor = (int) Math.round(i*2.55);
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redcolor = 0;
                greencolor = 0;
                bluecolor = 0;
                seekbarRed.setProgress(0);
                seekbarGreen.setProgress(0);
                seekbarBlue.setProgress(0);
                changeBackgroundColor();
            }
        });

        changeBackgroundColor();
    }

    private void changeBackgroundColor(){
        mRoot.setBackgroundColor(Color.argb(255, redcolor, greencolor, bluecolor));
    }
}
