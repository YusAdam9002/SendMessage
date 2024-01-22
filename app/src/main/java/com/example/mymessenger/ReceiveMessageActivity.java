package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    TextView viewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        viewMessage = findViewById(R.id.textView);
        viewMessage.setText(getIntent().getStringExtra("Message"));

    }
}