package com.example.aleksi.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.HelloWorld();
        text = (TextView) findViewById(R.id.textView);

    }


    public void HelloWorld (View v)
    {
        System.out.println("Hello World!");
        text.setText("Hello World!");
    }
}
