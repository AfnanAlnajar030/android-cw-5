package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 =  findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        final EditText text = findViewById(R.id.editTextTextPersonName);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent g = new Intent(MainActivity.this, MainActivity2.class);
                g.putExtra("text1", text.getText().toString());
                startActivity(g);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent h = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(h);

            }
        });

    }
}