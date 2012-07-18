package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends Activity
{
    public final static String EXTRA_MESSAGE = "com.example.myapp.MESSAGE";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        //testing commit again
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //detect this stuff
        //last trial
    }

    //** Called when the user click the Send button */
    public void sendMessage(View view){
        // TODO: add code to handle stuff
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
