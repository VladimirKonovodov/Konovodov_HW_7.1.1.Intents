package com.example.konovodov_hw_711intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;



public class AfternoonActivity extends AppCompatActivity {
    TextView afternoonTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);
        afternoonTime = findViewById(R.id.afternoonTime);

        afternoonTime.setText(TimeUtils.getDate() + "/" + TimeUtils.getTime());

        setTitle("AFTERNOON_ACTIVITY");

    }
}
