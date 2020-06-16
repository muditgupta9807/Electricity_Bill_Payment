package com.example.electricitybillpayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class feedback_page extends AppCompatActivity {

    private Button submit;
    private EditText form;
    private TextView back;
    private TextView info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_page);

        back = (TextView)findViewById(R.id.backfeedback);
        form = (EditText)findViewById(R.id.feedbacktext);
        info = (TextView)findViewById(R.id.infofeedback);
        submit = (Button)findViewById(R.id.submitfeedback);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText("Feedback Submitted Successfully");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(feedback_page.this, Main_Home.class);

                startActivity(intent);

            }
        });
    }
}
