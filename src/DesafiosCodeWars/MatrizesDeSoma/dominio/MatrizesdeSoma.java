package DesafiosCodeWars.MatrizesDeSoma.dominio;
public class MatrizesdeSoma {

    public static double sum(double[] numeros) {
        double result = 0;
        for (double valores : numeros) {
            result += valores;
        }
        return result;
    }

    public static void main(String[] args) {
        double[] arr= {2,3,4,5,6,7};
        double total = sum(arr);
        System.out.println(total);
    }
}

