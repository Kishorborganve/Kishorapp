package com.kishorapp.app;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

public class CalendarLayout extends AppCompatActivity {
    private static final String TAG = "CalendarLayout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendarlayout);
        CalendarView mCalendarView = findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                String date = i2 + "/" + (i1 + 1) + "/" + i;
                Log.d(TAG, "onSelectedDayChange; dd/mm/yy: " + date);

                Intent intent = new Intent(CalendarLayout.this, MainActivity2.class);
                intent.putExtra("date", date);
                startActivity(intent);
                finish();
            }
        });
    }
}