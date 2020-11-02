package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    boolean addition,substraction,multiplication,division,modulo;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;

    Button dot;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button mod;
    Button equal;
    Button ac;
    Button negate;

    EditText editText;

    float mValueOne, mValueTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        one = findViewById(R.id.onebtn);
        two = findViewById(R.id.twobtn);
        three = findViewById(R.id.threebtn);
        four = findViewById(R.id.fourbtn);
        five = findViewById(R.id.fivrbtn);
        six = findViewById(R.id.sixbtn);
        seven = findViewById(R.id.sevenbtn);

        eight = findViewById(R.id.eightbtn);
        nine = findViewById(R.id.ninebtn);

        zero = findViewById(R.id.zerobtn);

        dot = findViewById(R.id.dotbtn);
        add = findViewById(R.id.plusbtn);
        sub = findViewById(R.id.minbtn);
        mul = findViewById(R.id.mulbtn);
        div = findViewById(R.id.divbtn);
        mod = findViewById(R.id.modbtn);
        equal = findViewById(R.id.equalbtn);

        ac = findViewById(R.id.acbtn);
        negate = findViewById(R.id.posnegbtn);






        editText = findViewById(R.id.txt);


        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);

        dot.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        mod.setOnClickListener(this);
        equal.setOnClickListener(this);
        ac.setOnClickListener(this);
        negate.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.onebtn:
            {
                setNUmber("1");
                break;
            }

            case R.id.twobtn:
            {
                setNUmber("2");
                break;
            }

            case R.id.threebtn:
            {
                setNUmber("3");
                break;
            }

            case R.id.fourbtn:
            {
                setNUmber("4");
                break;
            }

            case R.id.fivrbtn:
            {
                setNUmber("5");
                break;
            }

            case R.id.sixbtn:
            {
                setNUmber("6");
                break;
            }
            case R.id.sevenbtn:
            {
                setNUmber("7");
                break;
            }
            case R.id.eightbtn:
            {
                setNUmber("8");
                break;
            }

            case R.id.ninebtn:
            {
                setNUmber("9");
                break;
            }

            case R.id.zerobtn:
            {
                setNUmber("0");
                break;
            }

            case R.id.dotbtn:
            {
                break;
            }

            case R.id.plusbtn:
            {
                if (editText == null) {
                    editText.setText("");
                } else {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    addition = true;
                    editText.setText(null);
                }
                break;
            }

            case R.id.minbtn:
            {

                mValueOne = Float.parseFloat(editText.getText() + "");
                substraction = true;
                editText.setText(null);

                break;
            }

            case R.id.mulbtn:
            {

                mValueOne = Float.parseFloat(editText.getText() + "");
                multiplication = true;
                editText.setText(null);
                break;
            }

            case R.id.divbtn:
            {
                mValueOne = Float.parseFloat(editText.getText() + "");
                division = true;
                editText.setText(null);
                break;
            }

            case R.id.modbtn:
            {
                mValueOne = Float.parseFloat(editText.getText() + "");
                modulo = true;
                editText.setText(null);
                break;
            }

            case R.id.equalbtn:
            {
                displayResult();
                break;
            }
            case R.id.acbtn:
            {
                editText.setText(null);
                break;
            }

            case R.id.posnegbtn:
            {
                break;
            }



        }

    }


    private void setNUmber(String number)
    {
        editText.setText(editText.getText() + number);
    }


    private void displayResult()
    {
        mValueTwo = Float.parseFloat(editText.getText() + "");

        if (addition== true) {
            editText.setText(mValueOne + mValueTwo + "");
            addition = false;
        }

        if (substraction == true) {
           editText.setText(mValueOne - mValueTwo + "");
            substraction = false;
        }

        if (multiplication == true) {
            editText.setText(mValueOne * mValueTwo + "");
            multiplication = false;
        }

        if (division == true) {
            editText.setText(mValueOne / mValueTwo + "");
           division = false;
        }
    }
}