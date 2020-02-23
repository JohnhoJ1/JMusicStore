package com.john.jmusicstore.ui.dashboard;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.subash.agriculturestore.R;

public class Gyro extends AppCompatActivity {
    private SensorManager sensorManager;
    private TextView tvGyro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_gyro);
        setTitle("Gyroscope Sensor");
        tvGyro = findViewById(R.id.tvGyro);
        sensorGyro();




    }


}
