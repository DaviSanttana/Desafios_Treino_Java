package Desafio.TabelaFutebol.dominio;

public class Times {


    public static class Tabela{
        private String nomeTime;
        private int vitorias;
        private int derrotas;
        private int empates;

        public Tabela (String nomeTime, int vitorias, int derrotas, int empates) {
            this.nomeTime= nomeTime;
            this.vitorias= vitorias;
            this.derrotas= derrotas;
            this.empates= empates;
        }

        public int getPontos() {
            return (vitorias * 3) + empates;
        }
        @Override
        public String toString() {
            return nomeTime + " - " + getPontos() + " pontos";
        }
    }
}