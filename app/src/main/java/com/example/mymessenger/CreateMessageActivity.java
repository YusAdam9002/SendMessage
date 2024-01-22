package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {
    Button Sendbutton;
    EditText editMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        Sendbutton = findViewById(R.id.button);
        editMessage = findViewById(R.id.editTextText);
    }
    public void onSendMessage(View view) {
        Intent packageContext;
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        String message = editMessage.getText().toString();
        intent.putExtra("Message", message);
        startActivity(intent);
    }
}
