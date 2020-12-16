package com.mohit.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDel, btnClr, btnPi, btnAdd, btnSub, btnMul, btnDiv, btnPercent, btnDot, btnEqual;
    private EditText etInsert;
    private TextView et1, et2;
    private int opCode;
    private float f1_val, f2_val, ans;
    ComputeResult objResult = new ComputeResult();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.zeroNo);
        btn1 = (Button) findViewById(R.id.oneNo);
        btn2 = (Button) findViewById(R.id.twoNo);
        btn3 = (Button) findViewById(R.id.threeNo);
        btn4 = (Button) findViewById(R.id.fourNo);
        btn5 = (Button) findViewById(R.id.fiveNo);
        btn6 = (Button) findViewById(R.id.sixNo);
        btn7 = (Button) findViewById(R.id.sevenNo);
        btn8 = (Button) findViewById(R.id.eightNo);
        btn9 = (Button) findViewById(R.id.nineNo);
        btnAdd = (Button) findViewById(R.id.addSym);
        btnSub = (Button) findViewById(R.id.minusSym);
        btnMul = (Button) findViewById(R.id.multiplySym);
        btnDiv = (Button) findViewById(R.id.divideSym);
        btnPercent = (Button) findViewById(R.id.percentSym);
        btnDot = (Button) findViewById(R.id.decimalSym);
        btnDel = (Button) findViewById(R.id.delSym);
        btnClr = (Button) findViewById(R.id.clrSym);
        btnPi = (Button) findViewById(R.id.piSym);
        btnEqual = (Button) findViewById(R.id.equalSym);

        et1 = (TextView) findViewById(R.id.et_1);
        et2 = (TextView) findViewById(R.id.et_2);
        etInsert = (EditText) findViewById(R.id.et_insertNo);

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(null);
                et2.setText(null);
                etInsert.setText(null);
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etInsert.getText().toString().length() > 0) {
                    String val = etInsert.getText().toString();
                    StringBuilder stringBuilder = new StringBuilder(val);
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    etInsert.setText(stringBuilder);
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInsert.setText(etInsert.getText().toString() + btn0.getText().toString());
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInsert.setText(etInsert.getText().toString() + btn1.getText().toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInsert.setText(etInsert.getText().toString() + btn2.getText().toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInsert.setText(etInsert.getText().toString() + btn3.getText().toString());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInsert.setText(etInsert.getText().toString() + btn4.getText().toString());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInsert.setText(etInsert.getText().toString() + btn5.getText().toString());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInsert.setText(etInsert.getText().toString() + btn6.getText().toString());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInsert.setText(etInsert.getText().toString() + btn7.getText().toString());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInsert.setText(etInsert.getText().toString() + btn8.getText().toString());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInsert.setText(etInsert.getText().toString() + btn9.getText().toString());
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInsert.setText(etInsert.getText().toString() + btnDot.getText().toString());
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opCode = 1;
                try {
                    f1_val = Float.parseFloat(etInsert.getText().toString());
                    et1.setText(etInsert.getText().toString());
                    etInsert.setText(null);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Values Required!", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opCode = 2;
                try {
                    f1_val = Float.parseFloat(etInsert.getText().toString());
                    et1.setText(etInsert.getText().toString());
                    etInsert.setText(null);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Values Required!", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opCode = 3;
                try {
                    f1_val = Float.parseFloat(etInsert.getText().toString());
                    et1.setText(etInsert.getText().toString());
                    etInsert.setText(null);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Values Required!", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opCode = 4;
                try {

                    f1_val = Float.parseFloat(etInsert.getText().toString());
                    et1.setText(etInsert.getText().toString());
                    etInsert.setText(null);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Values Required!", Toast.LENGTH_LONG).show();
                }
            }

        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opCode = 5;
                try{
                f1_val = Float.parseFloat(etInsert.getText().toString());
                et1.setText(etInsert.getText().toString());
                etInsert.setText(null);}
                catch (NumberFormatException e)
                {
                    Toast.makeText(MainActivity.this,"Values Required!",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opCode = 6;
                try{
                f1_val = Float.parseFloat(etInsert.getText().toString());
                et1.setText(etInsert.getText().toString());
                etInsert.setText(null);}
                catch (NumberFormatException e)
                {
                    Toast.makeText(MainActivity.this,"Values Required!",Toast.LENGTH_LONG).show();
                }

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (opCode != 6) {
                    f2_val = Float.parseFloat(etInsert.getText().toString());
                    et2.setText(etInsert.getText().toString());
                } else {
                    f2_val = 1;
                }
                etInsert.setText(null);
                ans = objResult.compute(f1_val, f2_val, opCode);
                etInsert.setText(Float.toString(ans));
            }
        });


    }
}


