package DesafiosLogicadeProgramacao.DocumentacaoEscolar;

public class DocumentacaoEscolar {
    public static int PaginasBranco(int colegas, int paginas) {
        if (colegas < 0 || paginas < 0) {
            return 0;
        } else if (colegas > 0) {
            return colegas * paginas;
        }return  0 ;

    }

    public static void main(String[] args) {
        int paginas1 = PaginasBranco(3,4);
        System.out.println(paginas1);
    }
}