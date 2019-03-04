package com.example.tcalender;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CalendarView;

/**
 * Created by tamojit on 24/02/2019.
 */

public class CalenderActivity extends AppCompatActivity {

    private static final String TAG = "CalendarActivity";
    private CalendarView mCalendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender_layout);
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView CalendarView, int dayOfMonth, int month, int year) {
                String date = dayOfMonth + "/" + month + "/" + year;
                Log.d(TAG, "onSelectedDayChange: dd/mm/yyyy:" + date);
                Intent intent = new Intent(CalenderActivity.this, MainActivity.class);
                intent.putExtra("date", date);
                startActivity(intent);

            }
        });
    }
}