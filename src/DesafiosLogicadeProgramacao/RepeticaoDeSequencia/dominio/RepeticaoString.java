package DesafiosLogicadeProgramacao.RepeticaoDeSequencia.dominio;

public class RepeticaoString {
    public static String repeticao(final int repete, final String string) {
        String s = " ";
        for (int i = 0; i < repete; i++) s += string;
        return s;
    }
    public static void main(String[] args) {
        System.out.println(repeticao(4,"ass"));
    }
}