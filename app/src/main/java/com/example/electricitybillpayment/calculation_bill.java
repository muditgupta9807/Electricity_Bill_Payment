package com.example.electricitybillpayment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.electricitybillpayment.R.id.oldread;

public class calculation_bill extends AppCompatActivity {


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_bill);
        Integer fixed=150;
        Double bill=0.0;
        EditText old_reading;
        EditText new_reading;
        final Button update;
        final TextView info;
        Integer units;
        Integer old_readint;
        Integer new_readint;
        bill+=fixed;
        old_reading=findViewById(R.id.oldread);
        new_reading=findViewById(R.id.newread);
        String temp=old_reading.getText().toString();
        old_readint=Integer.parseInt(temp);
        temp=new_reading.getText().toString();
        new_readint=Integer.parseInt(temp);
        units = new_readint-old_readint;
        if(units<=150)
            bill += units*3.50;
        else if(units<=300)
            bill += 150*3.50 + (units-150)*4.00;
        else if(units<=500)
            bill += 150*3.50 + 150*4.00 + (units-300)*5.00;
        else
            bill += 150*3.50 + 150*4 + 200*5 + (units-500)*6;

        update=(Button)findViewById(R.id.update);
        info=(TextView)findViewById(R.id.billinfo);
        final Double finalBill = bill;
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText("Your Outstanding bill is "+ finalBill);

            }
        });


    }
}
