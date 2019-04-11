package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int size=15;
    public void BMI(View v){
        EditText ed1;
        ed1 =findViewById(R.id.ed1);
        EditText edtall;
        EditText edweight;
        edtall =findViewById(R.id.ed2);
        edweight=findViewById(R.id.ed3);
        float tall=Float.parseFloat(edtall.getText().toString());
        float weight=Float.parseFloat(edweight.getText().toString());
        float bmi=weight/(tall*tall/10000);
        String bmi2=String.valueOf(bmi);
        TextView a;
        a=findViewById(R.id.tv);
        a.setTextSize(size);
        a.setText(ed1.getText().toString()+"Hello"+"\n"+"your BMI is"+bmi2);



    }
}
