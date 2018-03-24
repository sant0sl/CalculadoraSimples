package com.calculadora.sant0sl.slcalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
    btnponto, btnigual, btnsoma, btnsubtrai, btnmulti, btndiv, btnlimpar;
    EditText txtProcesso, txtConcatenar;
    double num1, num2, resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnponto = (Button)findViewById(R.id.btnponto);
        btnigual = (Button)findViewById(R.id.btnigual);
        btnsoma = (Button)findViewById(R.id.btnsoma);
        btnsubtrai = (Button)findViewById(R.id.btnsubtrai);
        btnmulti = (Button)findViewById(R.id.btnmulti);
        btndiv = (Button)findViewById(R.id.btndiv);
        btnlimpar = (Button)findViewById(R.id.btnlimpar);
        txtProcesso = (EditText)findViewById(R.id.txtProcesso);

        btnponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                txtProcesso.setText(txtConcatenar.getText().toString() + ".");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                txtProcesso.setText(txtConcatenar.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                txtProcesso.setText(txtConcatenar.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                txtProcesso.setText(txtConcatenar.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                txtProcesso.setText(txtConcatenar.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                txtProcesso.setText(txtConcatenar.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                txtProcesso.setText(txtConcatenar.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                txtProcesso.setText(txtConcatenar.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                txtProcesso.setText(txtConcatenar.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                txtProcesso.setText(txtConcatenar.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                txtProcesso.setText(txtConcatenar.getText().toString() + "9");
            }
        });

        btnsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "+";
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                num1 = Double.parseDouble(txtConcatenar.getText().toString());
                txtProcesso.setText("");
            }
        });
        btnsubtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "-";
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                num1 = Double.parseDouble(txtConcatenar.getText().toString());
                txtProcesso.setText("");
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "*";
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                num1 = Double.parseDouble(txtConcatenar.getText().toString());
                txtProcesso.setText("");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "/";
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                num1 = Double.parseDouble(txtConcatenar.getText().toString());
                txtProcesso.setText("");
            }
        });
        btnlimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = 0;
                num2 = 0;
                txtProcesso.setText("");
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtConcatenar = (EditText)findViewById(R.id.txtProcesso);
                num2 = Double.parseDouble(txtConcatenar.getText().toString());
                //Soma
                if(operador.equals("+")){
                    txtProcesso.setText("");
                    resultado = num1 + num2;
                }
                //Subtrai
                if(operador.equals("-")){
                    txtProcesso.setText("");
                    resultado = num1 - num2;
                }
                //Multiplica
                if(operador.equals("*")){
                    txtProcesso.setText("");
                    resultado = num1 * num2;
                }
                //Divide
                if(operador.equals("/")){
                    txtProcesso.setText("");
                    if(num2 != 0){
                        resultado = num1 / num2;
                    }else {
                        txtProcesso.setText("3RR0R");
                    }
                }
                txtProcesso.setText(String.valueOf(resultado));
            }
        });
    }


}
