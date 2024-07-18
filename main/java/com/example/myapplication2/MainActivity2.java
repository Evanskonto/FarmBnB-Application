package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClick2(View view) {
        openMainActivity3();
    }
    public void openMainActivity3() {
        Intent intent1 = new Intent(this, MainActivity3.class);
        startActivity(intent1);
    }
    public void onClick3(View view){
        Intent intent2 = new Intent(this,MainActivity4.class);
                startActivity(intent2);
                openMainActivity4();
    }

    private void openMainActivity4() {
    }

    public void onClick4(View view){
        Intent intent3 = new Intent(this,MainActivity5.class);
        startActivity(intent3);
        openMainActivity5();
    }

    private void openMainActivity5() {
    }
}