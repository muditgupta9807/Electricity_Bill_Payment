package com.example.electricitybillpayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class payment_gateway extends AppCompatActivity {

    //private TextView back = (TextView)findViewById(R.id.backpayment);
    //private Button submit = (Button)findViewById(R.id.makepayment);
    //private TextView info = (TextView)findViewById(R.id.infopayment);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_gateway);

        /*submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });*/

        /*back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(payment_gateway.this, Main_Home.class);
                startActivity(intent);
            }
        });*/


    }
}
