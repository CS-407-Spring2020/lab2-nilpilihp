package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    // create an instance of the TextView we created earlier in actvity_main2.xml.
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        // “getStringExtra()” method to get the string from previous activity
        String str = intent.getStringExtra("message");
        // setText() method to set the text for the TextView
        textView2.setText("Hello " + str);
    }
}
