package com.hporkun.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.number_1);
        num2 = findViewById(R.id.Number_2);
        result  = findViewById(R.id.result_text);

    }

    public void sum(View view){
        if (num1.getText().toString().matches("") || num2.getText().toString().matches("")) {
            result.setText("Lütfen Bir Sayı Giriniz!");

        } else {
            double number_1 = Double.parseDouble(num1.getText().toString());
            double number_2 = Double.parseDouble(num2.getText().toString());
            double res = number_1 + number_2;
            result.setText("Result: "+" "+res);
        }

    }

    public void subs(View view){
        if (num1.getText().toString().matches("") || num2.getText().toString().matches("")) {
            result.setText("Lütfen Bir Sayı Giriniz!");

        } else {
            double number_1 = Double.parseDouble(num1.getText().toString());
            double number_2 = Double.parseDouble(num2.getText().toString());
            double res = number_1 - number_2;
            result.setText("Result: "+" "+res);
        }
    }
    public void multiplication(View view){
        if (num1.getText().toString().matches("") || num2.getText().toString().matches("")) {
            result.setText("Lütfen Bir Sayı Giriniz!");

        } else {
            double number_1 = Double.parseDouble(num1.getText().toString());
            double number_2 = Double.parseDouble(num2.getText().toString());
            double res = number_1 * number_2;
            result.setText("Result: "+" "+res);
        }
    }
    public void division(View view){
        if (num1.getText().toString().matches("") || num2.getText().toString().matches("")) {
            result.setText("Lütfen Bir Sayı Giriniz!");

        } else {
            double number_1 = Double.parseDouble(num1.getText().toString());
            double number_2 = Double.parseDouble(num2.getText().toString());
            double res = number_1 / number_2;
            result.setText("Result: "+" "+res);
        }
    }
}