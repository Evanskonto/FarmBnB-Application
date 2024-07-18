package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void onClick6(View view) {
        openMainActivity6();
    }

    public void openMainActivity6() {
        Intent intent1 = new Intent(this, MainActivity6.class);
        startActivity(intent1);
    }
}