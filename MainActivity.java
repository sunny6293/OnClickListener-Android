package com.example.user.myapp;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TXT;
    String a="";
    int b=0;
    Boolean xy=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b= (Button) findViewById(R.id.button);
        Button b2= (Button) findViewById(R.id.button2);
        Button b3= (Button) findViewById(R.id.button3);
        Button b4= (Button) findViewById(R.id.button4);
        Button b5= (Button) findViewById(R.id.button5);
        Button b6= (Button) findViewById(R.id.button6);
        Button b7= (Button) findViewById(R.id.button7);
        Button b8= (Button) findViewById(R.id.button8);
        Button b9= (Button) findViewById(R.id.button9);
        Button b0= (Button) findViewById(R.id.button0);
        Button b10= (Button) findViewById(R.id.button10);
        Button b11= (Button) findViewById(R.id.button11);
        Button b12= (Button) findViewById(R.id.button12);

        b.setOnClickListener(A);
        b2.setOnClickListener(A);
        b3.setOnClickListener(A);
        b4.setOnClickListener(A);
        b5.setOnClickListener(A);
        b6.setOnClickListener(A);
        b7.setOnClickListener(A);
        b8.setOnClickListener(A);
        b9.setOnClickListener(A);
        b0.setOnClickListener(A);
        b10.setOnClickListener(A);
        b11.setOnClickListener(A);
        b12.setOnClickListener(A);
    }

    View.OnClickListener A=new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.button) {
                a = a + 1;
            } else if(v.getId() == R.id.button2) {
                a = a + 2;
            } else if(v.getId() == R.id.button3) {
                a = a + 3;
            } else if(v.getId() == R.id.button4) {
                a = a + 4;
            } else if(v.getId() == R.id.button5) {
                a = a + 5;
            } else if(v.getId() == R.id.button6) {
                a = a + 6;
            } else if(v.getId() == R.id.button7) {
                a = a + 7;
            } else if(v.getId() == R.id.button8) {
                a = a + 8;
            } else if(v.getId() == R.id.button9) {
                a = a + 9;
            } else if(v.getId() == R.id.button10) { //-
                a = a + "-";
            } else if(v.getId() == R.id.button11) { //+
                a = a + "+";
            } else if(v.getId() == R.id.button0) { //+
                a = a + "0";
            } else {
                a = "";
            }

            txt();
        }
    };
    public void txt(){
        TXT= (TextView) findViewById(R.id.TV);
        TXT.setText(String.valueOf(a));
    }
}
