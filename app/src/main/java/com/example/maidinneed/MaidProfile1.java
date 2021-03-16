package com.example.maidinneed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MaidProfile1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maid_profile1);
    }

    public void selectmaid1(View view) {
        Intent maid1selected = new Intent(MaidProfile1.this,ThankYou.class);
        startActivity(maid1selected);
    }
}
