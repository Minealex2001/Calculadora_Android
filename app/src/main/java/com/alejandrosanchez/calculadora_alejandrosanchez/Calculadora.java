package com.alejandrosanchez.calculadora_alejandrosanchez;

import java.util.ArrayList;

public class Calculadora {

    public ArrayList<String> hacerOperacion(ArrayList<String> operacion){
        int i = 0;
        while (i < operacion.size()) {
            if(operacion.get(i).equals("*")){
               operacion.set(i-1, Integer.toString(Integer.parseInt(operacion.get(i-1)) * Integer.parseInt(operacion.get(i+1))));
               operacion.remove(i);
               operacion.remove(i);
               i--;
            }else if(operacion.get(i).equals("/")){
                if(operacion.get(i+1).equals("0")){
                    operacion.clear();
                    operacion.add("ERROR");
                    return operacion;
                }

                operacion.set(i-1, Integer.toString(Integer.parseInt(operacion.get(i-1)) / Integer.parseInt(operacion.get(i+1))));
                operacion.remove(i);
                operacion.remove(i);
                i--;
            }
            i++;
        }
        i = 0;
        while (i < operacion.size()) {
            if(operacion.get(i).equals("+")){
                operacion.set(i-1, Integer.toString(Integer.parseInt(operacion.get(i-1)) + Integer.parseInt(operacion.get(i+1))));
                operacion.remove(i);
                operacion.remove(i);
                i--;
            }else if(operacion.get(i).equals("-")){
                operacion.set(i-1, Integer.toString(Integer.parseInt(operacion.get(i-1)) - Integer.parseInt(operacion.get(i+1))));
                operacion.remove(i);
                operacion.remove(i);
                i--;
            }
            i++;
        }

        return operacion;
    }

}
