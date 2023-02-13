package com.example.mobilework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int durationTime = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();

    }
    /* Hello world */
    /* Hello world again */
}
