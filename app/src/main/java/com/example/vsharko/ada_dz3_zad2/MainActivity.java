package com.example.vsharko.ada_dz3_zad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @BindView(R.id.editText_main_firstNumber) EditText firstNumber_main;
    @BindView(R.id.editText_main_secondNumber) EditText secondNumber_main;
    @BindView(R.id.textViewResult_main)TextView resTextView_main;
    @BindView(R.id.buttonSum_main) Button buttonSum;
    @BindView(R.id.buttonSub_main) Button buttonSub;
    @BindView(R.id.buttonMul_main) Button buttonMul;
    @BindView(R.id.buttonDiv_main) Button buttonDiv;

    @OnClick({R.id.buttonSum_main,R.id.buttonSub_main,R.id.buttonMul_main,R.id.buttonDiv_main})
    public void onClick(View view){

        if(!firstNumber_main.getText().toString().equals("") && !secondNumber_main.getText().toString().equals("")) {

            long firstNumber=Long.parseLong(firstNumber_main.getText().toString());
            long secondNumber=Long.parseLong(secondNumber_main.getText().toString());

            switch (view.getId()) {
                case R.id.buttonSum_main:
                    resTextView_main.setText(String.valueOf(firstNumber+secondNumber));
                    break;
                case R.id.buttonSub_main:
                    resTextView_main.setText(String.valueOf(firstNumber-secondNumber));
                    break;
                case R.id.buttonMul_main:
                    resTextView_main.setText(String.valueOf(firstNumber*secondNumber));
                    break;
                case R.id.buttonDiv_main:
                    resTextView_main.setText(String.valueOf(firstNumber/secondNumber));
                    break;
            }

        }else{

            Toast.makeText(this, getString(R.string.wrongInputToast), Toast.LENGTH_SHORT).show();
        }
    }
}
