package DesafiosLogicadeProgramacao.MaiorNdoArray;

import org.w3c.dom.css.Counter;

public class ArrayMaior {
    public static void main(String[] args) {
        int[] numeros = new int[]{321, 344, 546, 6567, 6767, 889, 9890, 89};
        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println(maior);
    }
}
