package com.example.electricitybillpayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_Home extends AppCompatActivity {

    private TextView feedpage;
    private Button payment;
    private TextView meter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__home);

        feedpage = (TextView)findViewById(R.id.feedback);
        payment = (Button)findViewById(R.id.paybill);
        feedpage.setMovementMethod(LinkMovementMethod.getInstance());
        meter = (TextView)findViewById(R.id.metercharges);

        feedpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              Intent intent = new Intent(Main_Home.this, feedback_page.class);
                startActivity(intent);
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main_Home.this, payment_gateway.class);
                startActivity(intent);


            }
        });

        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main_Home.this, meter_charge_page.class);
                startActivity(intent);


            }
        });

    }
}
