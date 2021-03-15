package com.example.maidinneed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BookAService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_aservice);

    }

    public void servicebooknextbtn(View view) {

        Intent bookservice = new Intent(BookAService.this,DateAndTime.class);
        startActivity(bookservice);
    }
}
