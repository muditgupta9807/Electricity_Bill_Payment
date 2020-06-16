package com.example.electricitybillpayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class meter_charge_page extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter_charge_page);
        Button update =(Button) findViewById(R.id.gotoreading);
        update.setMovementMethod(LinkMovementMethod.getInstance());

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(meter_charge_page.this, calculation_bill.class);
                startActivity(intent);
            }
        });
    }


}
