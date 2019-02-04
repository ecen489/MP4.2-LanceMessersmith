package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    // Constructor set up
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7,   // reference for buttons
            button_8, button_9, button_add, button_subtract, button_division, button_multiply,
            button_10, button_clear, button_equal;

    EditText cal_editText; // reference for editTexxt

    float number_one, number_two;  // two number values to be multiplied

    boolean addition, subtraction, multiplication, divison;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = (Button) findViewById(R.id.button_0);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
        button_10 = (Button) findViewById(R.id.button_10);
        button_add = (Button) findViewById(R.id.button_add);
        button_subtract = (Button) findViewById(R.id.button_subtract);
        button_division = (Button) findViewById(R.id.button_division);
        button_multiply = (Button) findViewById(R.id.button_multiply);
        button_clear = (Button) findViewById(R.id.button_clear);
        button_equal = (Button) findViewById(R.id.button_equal);
        cal_editText = (EditText) findViewById(R.id.cal_editText);

        button_0.setOnClickListener(new View.OnClickListener() {  // if button_0 is pressed EditText will display b/c of onclicklistener
            @Override
            public void onClick(View v) {
                cal_editText.setText(cal_editText.getText() + "0");
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_editText.setText(cal_editText.getText() + "1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_editText.setText(cal_editText.getText() + "2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_editText.setText(cal_editText.getText() + "3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_editText.setText(cal_editText.getText() + "4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_editText.setText(cal_editText.getText() + "5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_editText.setText(cal_editText.getText() + "6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_editText.setText(cal_editText.getText() + "7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_editText.setText(cal_editText.getText() + "8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_editText.setText(cal_editText.getText() + "9");
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {  // addition button is pressed
            @Override
            public void onClick(View v) {

                if (cal_editText == null) {
                    cal_editText.setText("");
                } else {
                    number_one = Float.parseFloat(cal_editText.getText() + ""); // get first number
                    addition = true;           // set value to true saying add button is clicked when user presses  = button
                    cal_editText.setText(null);
                }
            }
        });

        button_subtract.setOnClickListener(new View.OnClickListener() {  // subtraction button is pressed
            @Override
            public void onClick(View v) {
                number_one = Float.parseFloat((cal_editText.getText() + "")); // get first number
                subtraction = true;
                cal_editText.setText(null);
            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener() {  // multiplication button is pressed
            @Override
            public void onClick(View v) {
                number_one = Float.parseFloat((cal_editText.getText() + "")); // get first number
                multiplication = true;
                cal_editText.setText(null);
            }
        });

        button_division.setOnClickListener(new View.OnClickListener() {  // division button is pressed
            @Override
            public void onClick(View v) {
                number_one = Float.parseFloat((cal_editText.getText() + "")); // get first number
                divison = true;
                cal_editText.setText(null);
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_two = Float.parseFloat(cal_editText.getText() + ""); // get second number

                if (addition == true) {
                    cal_editText.setText(number_one + number_two + "");  // if true then do this
                    addition = false;      // set to false after so it can be used again
                }

                if (subtraction == true) {
                    cal_editText.setText(number_one - number_two + "");
                    subtraction = false;
                }

                if (multiplication == true) {
                    cal_editText.setText(number_one * number_two + "");
                    multiplication = false;
                }

                if (divison == true) {
                    cal_editText.setText(number_one / number_two + "");
                    divison = false;
                }
            }
        });

        button_clear.setOnClickListener(new View.OnClickListener() { // clears what's present on cal screen
            @Override
            public void onClick(View v) {
                cal_editText.setText("");
            }
        });

        button_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_editText.setText(cal_editText.getText() + ".");
            }
        });
    }


}
