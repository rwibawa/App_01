package com.navisow.android.app_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.navisow.android.app_01.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Send Button handler
    public void sendMessage(View button) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        // Get editText object
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        // Set the message and instantiate the DisplayMessageActivity
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}