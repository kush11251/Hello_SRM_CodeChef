package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView regTextView;
    Boolean currentValue = false;

    public void change(View view){
        if (currentValue == false) {
            currentValue = true;
            Log.i("Info :", "Button Pressed");

            regTextView.setText("RA1911031010112");

            Toast.makeText(this,"Refressing...",Toast.LENGTH_SHORT).show();
        }
        else{
            currentValue = false;
            Log.i("Info :", "Button Pressed Again");
            regTextView.setText("Hello");

            Toast.makeText(this,"Refressing...",Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        regTextView = findViewById(R.id.regTextView);
    }
}