package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Respond to button press
    public void buttonPress(View view){
      EditText textField = findViewById(R.id.editText);
      String text = textField.getText().toString();
      TextView label = findViewById(R.id.label);
      label.setText(text);
    }

}
