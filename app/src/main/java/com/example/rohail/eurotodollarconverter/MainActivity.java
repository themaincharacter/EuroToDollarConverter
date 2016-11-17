package com.example.rohail.eurotodollarconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConvertClick(View view) {
        EditText valueAsString = (EditText) findViewById(R.id.dollarInput);
        BigDecimal value = new BigDecimal(valueAsString.getText().toString());
        BigDecimal conversion = value.multiply(new BigDecimal(0.93)).setScale(2, BigDecimal.ROUND_HALF_EVEN);
        Toast.makeText(MainActivity.this, conversion.toString(), Toast.LENGTH_SHORT).show();
    }
}
