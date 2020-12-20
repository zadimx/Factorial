package com.example.factorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static String number ="";
    TextView editText;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.numberWrite);
        editText.setOnClickListener(editTextv);
        intent = new Intent(this, WriteFactor.class);
    }

    @Override
    protected void onStop() {
        super.onStop();
        editText.setText("");
        number="";
    }

    View.OnClickListener editTextv = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intent.putExtra("wwww", number);
            startActivity(intent);
        }
    };

    public void number0(View view) {
        if (number.length()<18) {
            number = number + 0;
            editText.setText(number);
        }
    }

    public void number1(View view) {
        if (number.length()<18) {
            number = number + 1;
            editText.setText(number);
        }
    }

    public void number2(View view) {
        if (number.length()<18) {
        number = number + 2;
        editText.setText(number);
        }
    }

    public void number3(View view) {
        if (number.length()<18) {
        number = number + 3;
        editText.setText(number);
        }
    }

    public void number4(View view){
        if (number.length()<18) {
        number=number+4;
        editText.setText(number);
        }
    }

    public void number5(View view){
        if (number.length()<18) {
        number=number+5;
        editText.setText(number);
        }
    }

    public void number6(View view){
        if (number.length()<18) {
        number=number+6;
        editText.setText(number);
        }
    }

    public void number7(View view){
        if (number.length()<18) {
        number=number+7;
        editText.setText(number);
        }
    }

    public void number8(View view){
        if (number.length()<18) {
        number=number+8;
        editText.setText(number);
        }
    }

    public void number9(View view){
        if (number.length()<18) {
        number=number+9;
        editText.setText(number);
        }
    }
}
