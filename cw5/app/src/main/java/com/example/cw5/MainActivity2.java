package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView r = findViewById(R.id.textView);
        Bundle b = getIntent().getExtras();
        String s = b.getString("text1");

        r.setText("Welcome " + s);

    }
}