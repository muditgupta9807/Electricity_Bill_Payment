package com.example.electricitybillpayment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter=5;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.username);
        Password=(EditText)findViewById(R.id.password);
        Info=(TextView)findViewById(R.id.tvInfo);
        Login=(Button)findViewById(R.id.btn_login);

        Info.setText("No.of attempts remaining :5");


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validate(Name.getText().toString(), Password.getText().toString());


            }
        });




    }

    private void validate(String userName, String userPassword)
    {
        //if((userName.equals("Admin")) && (userPassword.equals("1234"))){

            Intent intent = new Intent(MainActivity.this, Main_Home.class);

            startActivity(intent);

        //}
        //else
        {
            counter--;

            Info.setText("No. of attempts remaining: " +String.valueOf(counter));

            if(counter==0)
            {
                Login.setEnabled(false);
            }
        }
    }
}
