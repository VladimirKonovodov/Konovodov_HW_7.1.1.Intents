package com.example.konovodov_hw_711intents;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    public static final String MORNING_FIRST = "06:00:00";
    public static final String MORNING_SECOND = "14:00:00";

    public static final String AFTERNOON_FIRST = "14:00:01";
    public static final String AFTERNOON_SECOND = "15:00:00";

    public static final String EVENING_FIRST = "15:00:01";
    public static final String EVENING_SECOND = "05:59:59";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String timeText = TimeUtils.getTime();

                textView.setText(TimeUtils.getDate() + "/" + timeText);

                Intent intent = new Intent(Intent.ACTION_SYNC);
                if ((timeText.compareTo(MORNING_FIRST) > 0) && (timeText.compareTo(MORNING_SECOND) < 0)) {
                    intent.setData(Uri.parse("http://morning"));
                } else {
                    if ((timeText.compareTo(AFTERNOON_FIRST) > 0) && (timeText.compareTo(AFTERNOON_SECOND) < 0)) {
                        intent.setData(Uri.parse("http://afternoon"));
                    } else {
                        intent.setData(Uri.parse("http://evening"));
                    }
                }
                startActivity(intent);

            }
        });
    }


}
