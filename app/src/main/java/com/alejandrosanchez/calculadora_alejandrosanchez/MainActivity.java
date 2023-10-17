package com.alejandrosanchez.calculadora_alejandrosanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> calcular = new ArrayList<>();
    private Boolean sumaclick = false;
    private Boolean restaclick = false;
    private Boolean multiplicarclick = false;
    private Calculadora calculadora = new Calculadora();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button numero0 = findViewById(R.id.button0);
        Button numero1 = findViewById(R.id.button1);
        Button numero2 = findViewById(R.id.button2);
        Button numero3 = findViewById(R.id.button3);
        Button numero4 = findViewById(R.id.button4);
        Button numero5 = findViewById(R.id.button5);
        Button numero6 = findViewById(R.id.button6);
        Button numero7 = findViewById(R.id.button7);
        Button numero8 = findViewById(R.id.button8);
        Button numero9 = findViewById(R.id.button9);
        Button suma = findViewById(R.id.buttonSuma);
        Button resta = findViewById(R.id.buttonResta);
        Button multiplicar = findViewById(R.id.buttonMultiplicar);
        Button igual = findViewById(R.id.buttonIgual);
        Button borrar = findViewById(R.id.buttonBorrar);

        TextView pantalla = findViewById(R.id.resultView);

        numero0.setOnClickListener(v -> {
            calcular.add("0");
            pantalla.setText(pantalla.getText() + "0");
        });


        numero1.setOnClickListener(v -> {
            calcular.add("1");
            pantalla.setText(pantalla.getText() + "1");
        });


        numero2.setOnClickListener(v -> {
            calcular.add("2");
            pantalla.setText(pantalla.getText() + "2");
        });


        numero3.setOnClickListener(v -> {
            calcular.add("3");
            pantalla.setText(pantalla.getText() + "3");
        });


        numero4.setOnClickListener(v -> {
            calcular.add("4");
            pantalla.setText(pantalla.getText() + "4");
        });


        numero5.setOnClickListener(v -> {
            calcular.add("5");
            pantalla.setText(pantalla.getText() + "5");
        });


        numero6.setOnClickListener(v -> {
            calcular.add("6");
            pantalla.setText(pantalla.getText() + "6");
        });


        numero7.setOnClickListener(v -> {
            calcular.add("7");
            pantalla.setText(pantalla.getText() + "7");
        });


        numero8.setOnClickListener(v -> {
            calcular.add("8");
            pantalla.setText(pantalla.getText() + "8");
        });


        numero9.setOnClickListener(v -> {
            calcular.add("9");
            pantalla.setText(pantalla.getText() + "9");
        });


        suma.setOnClickListener(v -> {
                calcular.add("+");
                pantalla.setText(pantalla.getText() + "+");

        });

        resta.setOnClickListener(v -> {
                calcular.add("-");
                pantalla.setText(pantalla.getText() + "-");

        });

        multiplicar.setOnClickListener(v -> {
            calcular.add("*");
                pantalla.setText(pantalla.getText() + "*");
        });


        igual.setOnClickListener(v -> {
            calculadora.hacerOperacion(calcular);
            pantalla.setText(calcular.get(0));
        });

        borrar.setOnClickListener(v -> {
            pantalla.setText("");
            calcular.clear();
        });

    }
}