package DesafiosCodeWars.BasicMathematicalOperations.dominio;

public class BasicMathematicalOperations {

    public static int operadoresBasicos(String operador, int valor1, int valor2) {
        switch (operador) {
            case "+":
                return valor1 + valor2;
            case "-":
                return valor1 - valor2;
            case "*":
                return valor1 * valor2;
            case "/":
                if (valor2 == 0) throw new IllegalArgumentException("divisão por zero é uma operação indefinida");
                return valor1 / valor2;
        }
        return 0;
    }
}
