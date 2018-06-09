package com.example.neeraj.basic_cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1,b2,b3,b4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        t1=findViewById(R.id.tv1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1=Float.parseFloat(et1.getText().toString());
                float n2=Float.parseFloat(et2.getText().toString());
                float sum=n1+n2;
                t1.setText("");
                t1.setText(String.format("%.2f",sum));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1=Float.parseFloat(et1.getText().toString());
                float n2=Float.parseFloat(et2.getText().toString());
                float diff=n1-n2;
                t1.setText("");
                t1.setText(String.format("%.2f",diff));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1=Float.parseFloat(et1.getText().toString());
                float n2=Float.parseFloat(et2.getText().toString());
                float mul=n1*n2;
                t1.setText("");
                t1.setText(String.format("%.2f",mul));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1=Float.parseFloat(et1.getText().toString());
                float n2=Float.parseFloat(et2.getText().toString());
                float div=n1/n2;
                t1.setText("");
                t1.setText(String.format("%.2f",div));
            }
        });
    }
}
