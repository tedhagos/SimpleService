package com.example.ted.simpleservice;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

    Button startButton = (Button) findViewById(R.id.startButton);
    Button stopButton = (Button) findViewById(R.id.stopButton);

    assert startButton != null;
    startButton.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        //Toast.makeText(v.getContext(), "Start Button", Toast.LENGTH_LONG).show();
        startService(new Intent(getBaseContext(), MyService.class));
      }
    });

    assert stopButton != null;
    stopButton.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        Toast.makeText(v.getContext(), "Stop Button", Toast.LENGTH_LONG).show();
      }
    });

  }
}
