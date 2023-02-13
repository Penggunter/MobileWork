package com.example.mobilework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Context context = getApplicationContext();
    //int durationTime = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity create";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity start";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity resume";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();

    }

    @Override
    protected void onPause() {
        super.onPause();

        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity pause";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity restart";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity stop";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Context context = getApplicationContext();
        int durationTime = Toast.LENGTH_SHORT;
        CharSequence text = "Activity destroy";

        Toast toast = Toast.makeText(context, text, durationTime);
        toast.show();
    }
    /* Hello world */
    /* Hello world again */
}
