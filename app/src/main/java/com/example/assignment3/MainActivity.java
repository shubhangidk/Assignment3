package com.example.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText num1,num2,num3;
TextView resulttxtview;
Button avg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.no1);
        num2=findViewById(R.id.no2);
        num3=findViewById(R.id.no3);

        resulttxtview = findViewById(R.id.textviewresult);

        avg= findViewById(R.id.resultbutton);

        avg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number2=Integer.parseInt(String.valueOf(num2.getText()));
                int number1=Integer.parseInt(String.valueOf(num1.getText()));
                int number3=Integer.parseInt(String.valueOf(num3.getText()));
                int average=((number1+number2+number3)/3);
                Toast.makeText(MainActivity.this, "Average is: " +average, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
