package com.example.konovodov_hw_711intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MorningActivity extends AppCompatActivity {
    TextView morningTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        morningTime = findViewById(R.id.morningTime);

        morningTime.setText(TimeUtils.getDate() + "/" + TimeUtils.getTime());
        setTitle("MORNING_ACTIVITY");
    }
}
