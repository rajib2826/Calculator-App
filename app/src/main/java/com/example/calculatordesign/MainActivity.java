package com.example.calculatordesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstview, secondview;
    String secondvalue,operator;
    double num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstview = findViewById(R.id.firstTextViewId);
        secondview = findViewById(R.id.secondTextViewId);
    }


    public void clearFunction(View view) {
        firstview.setText("");
        secondview.setText("0");
        num1=0;
        num2=0;
    }


    public void digitFunction(View view) {
        secondvalue = secondview.getText().toString();
        if (view.getId() == R.id.zeroButtonId) {
            if (secondvalue.equals("0")) {
                secondview.setText("0");
            } else
                secondview.setText(secondvalue + "0");
        } else if (view.getId() == R.id.oneButtonId) {
            if (secondvalue.equals("0")) {
                secondview.setText("1");
            } else
                secondview.setText(secondvalue + "1");
        }
        else if (view.getId() == R.id.twoButtonId) {
            if (secondvalue.equals("0")) {
                secondview.setText("2");
            } else
                secondview.setText(secondvalue + "2");
        }
        else if (view.getId() == R.id.threeButtonId) {
            if (secondvalue.equals("0")) {
                secondview.setText("3");
            } else
                secondview.setText(secondvalue + "3");
        } else if (view.getId() == R.id.fourButtonId) {
            if (secondvalue.equals("0")) {
                secondview.setText("4");
            } else
                secondview.setText(secondvalue + "4");
        } else if (view.getId() == R.id.fiveButtonId) {
            if (secondvalue.equals("0")) {
                secondview.setText("5");
            } else
                secondview.setText(secondvalue + "5");
        } else if (view.getId() == R.id.sixButtonId) {
            if (secondvalue.equals("0")) {
                secondview.setText("6");
            } else
                secondview.setText(secondvalue + "6");
        } else if (view.getId() == R.id.sevenButtonId) {
            if (secondvalue.equals("0")) {
                secondview.setText("7");
            } else
                secondview.setText(secondvalue + "7");
        } else if (view.getId() == R.id.eightButtonId) {
            if (secondvalue.equals("0")) {
                secondview.setText("8");
            } else
                secondview.setText(secondvalue + "8");
        } else if (view.getId() == R.id.nineButtonId) {
            if (secondvalue.equals("0")) {
                secondview.setText("9");
            } else
                secondview.setText(secondvalue + "9");
        } else {
            secondview.setText(secondvalue + ".");
        }
    }


    public void logicFunction(View view) {
        secondvalue = secondview.getText().toString();
        num1 = Double.parseDouble(secondvalue);
        if (view.getId() == R.id.addButtonId) {
            operator = "+";
        } else if (view.getId() == R.id.subButtonId) {
            operator = "-";
        } else if (view.getId() == R.id.mulButtonId) {
            operator = "*";
        } else {
            operator = "/";
        }
        firstview.setText(secondvalue+operator);
        secondview.setText("0");
    }



    public void resultButton(View view) {
        num2=Double.parseDouble(secondview.getText().toString());
        if(operator.equals("+")){
            result=num1+num2;
        }
       else if(operator.equals("-")){
            result=num1-num2;
        }
      else if(operator.equals("*")){
            result=num1*num2;
        }
        else{
            result=num1/num2;
        }
        firstview.setText(" "+num1+" "+operator+num2+"=");
        secondview.setText(" "+result);
    }
}