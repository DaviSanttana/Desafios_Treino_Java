package DesafiosCodeWars.BasicMathematicalOperations.test;

import DesafiosCodeWars.BasicMathematicalOperations.dominio.BasicMathematicalOperations;

public class BasicMathematicalOperationsTest01 {
    public static void main(String[] args) {
        int calaculo1 = BasicMathematicalOperations.operadoresBasicos("+",20,90);
        int calaculo2 = BasicMathematicalOperations.operadoresBasicos("-",20,900);
        int calaculo3 = BasicMathematicalOperations.operadoresBasicos("*",20,9);
        int calaculo4 = BasicMathematicalOperations.operadoresBasicos("/",20,10);

        System.out.println(calaculo1);
        System.out.println(calaculo2);
        System.out.println(calaculo3);
        System.out.println(calaculo4);
    }
}
