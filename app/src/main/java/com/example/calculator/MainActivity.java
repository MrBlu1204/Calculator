package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonAdd,buttonSub,buttonMul,buttonDiv,buttonDec,buttonClear,buttonEqual;
    EditText editText;
    TextView textView;
    float mValue1,mValue2;
    String inp="";
    float result;
    boolean Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=(Button) findViewById(R.id.button0);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        buttonAdd=(Button) findViewById(R.id.buttonAdd);
        buttonSub=(Button) findViewById(R.id.buttonSub);
        buttonMul=(Button) findViewById(R.id.buttonMul);
        buttonDiv=(Button) findViewById(R.id.buttonDiv);
        buttonClear=(Button) findViewById(R.id.buttonClear);
        buttonDec=(Button) findViewById(R.id.buttonDec);
        buttonEqual=(Button) findViewById(R.id.buttonEqual);
        editText=(EditText) findViewById(R.id.editText);
        textView=(TextView) findViewById(R.id.textView);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
                inp= inp+"1";
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
                inp= inp+"2";
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
                inp= inp+"3";
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
                inp= inp+"4";
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
                inp= inp+"5";
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
                inp= inp+"6";
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
                inp= inp+"7";
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
                inp= inp+"8";
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
                inp= inp+"9";
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
                inp= inp+"0";
            }
        });

        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
                inp= inp+".";
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add=true;
                mValue1=Float.parseFloat( editText.getText()+"");
                    editText.setText(editText.getText() + "+");
                    inp="";
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub=true;
                mValue1=Float.parseFloat( editText.getText()+"");
                editText.setText(editText.getText() + "-");
                inp="";
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mul=true;
                mValue1=Float.parseFloat( editText.getText()+"");
                editText.setText(editText.getText() + "x");
                inp="";
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Div=true;
                mValue1=Float.parseFloat( editText.getText()+"");
                editText.setText(editText.getText() + "/");
                inp="";
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue2=Float.parseFloat(inp);
                if (Add == true) {
                    textView.setText(mValue1 + mValue2 + "");
                    Add = false;
                }

                if (Sub == true) {
                    textView.setText(mValue1 - mValue2 + "");
                    Sub = false;
                }

                if (Mul == true) {
                   textView.setText(mValue1 * mValue2 + "");
                    Mul = false;
                }

                if (Div == true) {
                    textView.setText(mValue1 / mValue2 + "");
                    Div = false;
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                textView.setText("");
                inp="";
            }
        });


    }
}
