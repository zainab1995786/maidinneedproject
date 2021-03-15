package com.example.maidinneed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DateAndTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and_time);

    }

    public void next(View view) {
        Intent thankyou = new Intent(DateAndTime.this,ThankYou.class);
        startActivity(thankyou);
    }
}
