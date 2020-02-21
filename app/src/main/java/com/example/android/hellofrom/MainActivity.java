package com.example.android.hellofrom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //grab the button by its id, set an onclick listener on it. When it is called, we do action specified in onclick method
        findViewById(R.id.textButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimary));


            }
        });
        findViewById(R.id.backgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.orange));


            }
        });
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //grab the text the user inputted
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Fawziyah");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                    //put the text into our text view once the 'change text' button is clicked

                }
            }
        });
        //user should be able to set everything back to default
        //switch background
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //reset the text color back to black
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));
                //reset background color
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                //reset text to hello from fawziyah
                ((TextView) findViewById(R.id.textView)).setText("Hello From Fawziyah");

            }
        });


    }
}
