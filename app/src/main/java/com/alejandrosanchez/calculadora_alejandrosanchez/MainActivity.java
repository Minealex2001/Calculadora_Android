package com.alejandrosanchez.calculadora_alejandrosanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Integer> variable1 = new ArrayList<Integer>();
    private ArrayList<Integer> variable2 = new ArrayList<Integer>();
    private int resultado = 0;
    private Boolean sumaclick = false;
    private Boolean restaclick = false;
    private Button numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero0, suma, resta, igual, borrar;
    private TextView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero0 = findViewById(R.id.button0);
        numero1 = findViewById(R.id.button1);
        numero2 = findViewById(R.id.button2);
        numero3 = findViewById(R.id.button3);
        numero4 = findViewById(R.id.button4);
        numero5 = findViewById(R.id.button5);
        numero6 = findViewById(R.id.button6);
        numero7 = findViewById(R.id.button7);
        numero8 = findViewById(R.id.button8);
        numero9 = findViewById(R.id.button9);
        suma = findViewById(R.id.buttonmas);
        igual = findViewById(R.id.buttonresultado);
        borrar = findViewById(R.id.buttonborrar);

        pantalla = findViewById(R.id.textView);

        numero0.setOnClickListener(v -> {
            if (sumaclick || restaclick) {
                variable1.add(0);
            } else {
                variable2.add(0);
            }
            pantalla.setText(pantalla.getText() + "0");
        });


        numero1.setOnClickListener(v -> {
            if (!sumaclick || !restaclick) {
                variable1.add(1);
            } else {
                variable2.add(1);
            }
            pantalla.setText(pantalla.getText() + "1");
        });


        numero2.setOnClickListener(v -> {
            if (!sumaclick || !restaclick) {
                variable1.add(2);
            } else {
                variable2.add(2);
            }
            pantalla.setText(pantalla.getText() + "2");
        });


        numero3.setOnClickListener(v -> {
            if (!sumaclick || !restaclick) {
                variable1.add(3);
            } else {
                variable2.add(3);
            }
            pantalla.setText(pantalla.getText() + "3");
        });


        numero4.setOnClickListener(v -> {
            if (!sumaclick || !restaclick) {
                variable1.add(4);
            } else {
                variable2.add(4);
            }
            pantalla.setText(pantalla.getText() + "4");
        });


        numero5.setOnClickListener(v -> {
            if (!sumaclick || !restaclick) {
                variable1.add(5);
            } else {
                variable2.add(5);
            }
            pantalla.setText(pantalla.getText() + "5");
        });


        numero6.setOnClickListener(v -> {
            if (!sumaclick || !restaclick) {
                variable1.add(6);
            } else {
                variable2.add(6);
            }
            pantalla.setText(pantalla.getText() + "6");
        });


        numero7.setOnClickListener(v -> {
            if (!sumaclick || !restaclick) {
                variable1.add(7);
            } else {
                variable2.add(7);
            }
            pantalla.setText(pantalla.getText() + "7");
        });


        numero8.setOnClickListener(v -> {
            if (!sumaclick || !restaclick) {
                variable1.add(8);
            } else {
                variable2.add(8);
            }
            pantalla.setText(pantalla.getText() + "8");
        });


        numero9.setOnClickListener(v -> {
            if (!sumaclick || !restaclick) {
                variable1.add(9);
            } else {
                variable2.add(9);
            }
            pantalla.setText(pantalla.getText() + "9");
        });


        suma.setOnClickListener(v -> {
            sumaclick = true;
            pantalla.setText(pantalla.getText() + "+");
        });


        igual.setOnClickListener(v -> {
            if (sumaclick) {
                //resultado = variable1 + variable2;
                if (resultado != 0) {
                    // variable1 = resultado;
                }
                pantalla.setText(pantalla.getText() + "=" + resultado);
                sumaclick = false;
            } else if (restaclick) {
                // resultado = variable1 - variable2;
                if (resultado != 0) {
                    //  variable1 = resultado;
                }
                pantalla.setText(pantalla.getText() + "=" + resultado);
                restaclick = false;
            }
        });

        borrar.setOnClickListener(v -> {
            pantalla.setText("");
            variable1.clear();
            variable2.clear();
            resultado = 0;
        });

    }
}