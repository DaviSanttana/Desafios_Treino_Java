package DesafiosLogicadeProgramacao.Tabuada;

public class Tabuada {
    public static void main(String[] args) {
        for (int num1 = 1; num1 <= 9; num1++) {
    System.out.println("\nTabuada do "+num1);
            for (int num2 = 1; num2 <=10 ; num2++) {
                System.out.println( num1+" x "+num2+" = "+num1*num2 );
            }
        }
    }
}
