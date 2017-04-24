package com.test.jmpugh22.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    public String memory = "";
    public String memory2 = "";
    public boolean pickedFunction = false;
    public boolean pickedMultiply = false;
    public boolean pickedDivide = false;
    public boolean pickedAdd = false;
    public boolean pickedSubtract = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressedSeven(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "7";
        result.setText(memory);
    }

    public void pressedEight(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "8";
        result.setText(memory);
    }

    public void pressedNine(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "9";
        result.setText(memory);
    }

    public void pressedMultiply(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory2 = memory;
        memory = "";

        pickedFunction = true;
        pickedMultiply = true;

        pickedDivide = false;
        pickedAdd = false;
        pickedSubtract = false;

        result.setText(memory);
    }

    public void pressedFour(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "4";
        result.setText(memory);
    }

    public void pressedFive(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "5";
        result.setText(memory);
    }

    public void pressedSix(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "6";
        result.setText(memory);
    }

    public void pressedSubtract(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory2 = memory;
        memory = "";

        pickedFunction = true;
        pickedSubtract = true;

        pickedDivide = false;
        pickedAdd = false;
        pickedMultiply = false;

        result.setText(memory);
    }

    public void pressedOne(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "1";
        result.setText(memory);
    }

    public void pressedTwo(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "2";
        result.setText(memory);
    }

    public void pressedThree(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "3";
        result.setText(memory);
    }

    public void pressedAddition(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory2 = memory;
        memory = "";

        pickedFunction = true;
        pickedAdd = true;

        pickedDivide = false;
        pickedMultiply = false;
        pickedSubtract = false;

        result.setText(memory);
    }

    public void pressedEquals(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        double finalMemory = 0;
        double finalMemory2 = 0;

        if(memory2 != "" && memory != ""){
            finalMemory = Double.parseDouble(memory);
            finalMemory2 =  Double.parseDouble(memory2);
            String finalStuff;
            if(pickedAdd == true){
                double answer = finalMemory + finalMemory2;
                finalStuff = String.valueOf(answer);
            }
            else if(pickedMultiply == true){
                double answer = finalMemory * finalMemory2;
                finalStuff = String.valueOf(answer);
            }
            else if(pickedDivide == true){
                double answer = finalMemory / finalMemory2;
                finalStuff = String.valueOf(answer);
            }
            else if(pickedSubtract == true){
                double answer = finalMemory - finalMemory2;
                finalStuff = String.valueOf(answer);

            }
            else{
                finalStuff = memory;
            }
            memory = finalStuff;

            result.setText(memory);
        }
        else if(memory != "" && memory2 == ""){
            result.setText(memory);
        }
        else{
            result.setText("0");
        }


    }

    public void pressedDecimal(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += ".";
        result.setText(memory);
    }

    public void pressedZero(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "0";
        result.setText(memory);
    }

    public void pressedReset(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory = "";
        memory2 = "";
        pickedFunction = false;
        pickedAdd = false;

        pickedDivide = false;
        pickedMultiply = false;
        pickedSubtract = false;
        result.setText(memory);



    }

    public void pressedSwitchSign(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        if(!memory.equals("")) {
            double switched = Double.parseDouble(memory);
            switched *= -1;
            memory = String.valueOf(switched);
        }
        result.setText(memory);
    }

    public void pressedPercent(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        if(!memory.equals("")){
            double percentage = Double.parseDouble(memory);
            percentage = percentage / 100;
            memory = String.valueOf(percentage);
            result.setText(memory);
        }else{
            result.setText(memory);
        }

    }

    public void pressedDivide(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory2 = memory;
        memory = "";

        pickedFunction = true;
        pickedDivide = true;

        pickedMultiply = false;
        pickedAdd = false;
        pickedSubtract = false;

        result.setText(memory);
    }
}
