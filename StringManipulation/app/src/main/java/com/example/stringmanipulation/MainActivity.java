package com.example.stringmanipulation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    TextView String1Label, String2Label, charCompare, Display;
    EditText String1Input, String2Input, charCompareInput;
    Button addString, compareString, characterCount, displayOutput;
    String Result, String1, String2, Total, charCount;
    int vowels, userInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set Label Text
        String1Label = (TextView) findViewById(R.id.String1Label);
        String1Label.setText("String 1: ");
        String2Label = (TextView) findViewById(R.id.String2Label);
        String2Label.setText("String 2: ");
        Display = (TextView) findViewById(R.id.Display);

        //Edit Text
        String1Input = (EditText) findViewById(R.id.String1Input);
        String1Input.setText(" ");
        String2Input = (EditText) findViewById(R.id.String2Input);
        String2Input.setText(" ");

        //set String concatenate
        addString = (Button) findViewById(R.id.addString);
        addString.setText("Add Strings");
        addString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String1 = String1Input.getText().toString();
                String2 = String2Input.getText().toString();
                Result = String1+ " " + String2;
            }
        });


        //Set Compare
        compareString = (Button) findViewById(R.id.compareString);
        compareString.setText("Compare Strings");
        compareString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String1 = String1Input.getText().toString();
                String2 = String2Input.getText().toString();
                if (String1.toLowerCase().trim().equals(String2.toLowerCase().trim())){
                    Result = "Strings Match";
                } else {
                    Result = "Strings Do Not Match";
                }
            }
        });


        //Set Character Count
        characterCount = (Button) findViewById(R.id.characterCount);
        characterCount.setText("Character Count");
        characterCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*vowels = 0;
                //userInput = 0;
                String1 = String1Input.getText().toString();
                String2 = String2Input.getText().toString();
                String ab = charCompareInput.getText().toString();
                Total = String1 + String2;
                Total.toLowerCase().trim();

                for(int i=0; i<Total.length(); i++){
                    char current = Total.charAt(i);
                    if(current == 'a' || current == 'e' || current == 'i' ||current == 'o' || current == 'u'){
                        ++vowels;
                    }
                }
                charCount = String.valueOf(vowels);
                Result = charCount;*/
            }
        });


        //Set Display Output
        displayOutput = (Button) findViewById(R.id.displayOutput);
        displayOutput.setText("Display Output");
        displayOutput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText(Result);
            }
        });
    }

}