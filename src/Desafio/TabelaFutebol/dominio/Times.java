package Desafio.TabelaFutebol.dominio;

public class Times {

    static class Tabela {
        private String nomeTimes;
        private int vitoriasTime;
        private int derrotasTime;
        private int empatesTime;

        public Tabela(String nomeTimes, int vitoriasTime, int derrotasTime, int empatesTime) {
            this.nomeTimes = nomeTimes;
            this.vitoriasTime = vitoriasTime;
            this.derrotasTime = derrotasTime;
            this.empatesTime = empatesTime;
        }

        public int getPontos() {
            return (vitoriasTime * 3) + empatesTime;
        }

        @Override
        public String toString() {
            return nomeTimes + " - " + getPontos() + " pontos";
        }
    }
}