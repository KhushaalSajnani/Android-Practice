package com.example.kcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etFirstvalue, etSecondvalue,tvans;
    //TextView tvans;
    Button plus,minus,multiply,divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstvalue=findViewById(R.id.etFirstValue);
        etSecondvalue=findViewById(R.id.etSecondValue);
        tvans=findViewById(R.id.nAns);
        plus=findViewById(R.id.btAdd);
        minus=findViewById(R.id.btSubtract);
        multiply=findViewById(R.id.btMultiply);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int fv,sv,ans;
                fv=Integer.parseInt(etFirstvalue.getText().toString());
                sv=Integer.parseInt(etSecondvalue.getText().toString());
                ans=fv+sv;
                tvans.setText(ans+" is the result ");

            }
        });
        minus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int fv,sv,ans;
                fv=Integer.parseInt(etFirstvalue.getText().toString());
                sv=Integer.parseInt(etSecondvalue.getText().toString());
                ans=fv-sv;
                tvans.setText(ans +" is the result ");

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int fv,sv,ans;
                fv=Integer.parseInt(etFirstvalue.getText().toString());
                sv=Integer.parseInt(etSecondvalue.getText().toString());
                ans=fv*sv;
                tvans.setText(ans+" is the result") ;

            }
        });

//        divide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                int fv,sv,ans;
//                fv=Integer.parseInt(etFirstvalue.getText().toString());
//                sv=Integer.parseInt(etSecondvalue.getText().toString());
//                ans=fv/sv;
//                tvans.setText(ans+" is the result ");
//
//            }
//        });


        }
}
