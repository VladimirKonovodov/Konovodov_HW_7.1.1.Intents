package com.example.konovodov_hw_711intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class EveningActivity extends AppCompatActivity {
    TextView eveningTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);
        eveningTime = findViewById(R.id.eveningTime);

        eveningTime.setText(TimeUtils.getDate() + "/" + TimeUtils.getTime());
        setTitle("EVENING_ACTIVITY");
    }
}
