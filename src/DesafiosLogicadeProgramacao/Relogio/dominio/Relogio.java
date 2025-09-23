package DesafiosLogicadeProgramacao.Relogio.dominio;

public class Relogio {
    public static int Relogio(int horas, int minutos, int segundos) {
        if (horas <= 0 || horas >= 23) return 0; // horas = 60 * 60 * 1000; //horas * 3.600.000
        if (minutos <= 0 || minutos >= 59) return 0; // minutos = 60 * 1000; // minutos * 60.000
        if (segundos <= 0 || segundos >= 59) return 0; // segundos * 1000; //segundos * 1000

        //Converte para milisegundos
        horas = horas * 60 * 60 * 1000;
        minutos = minutos * 60 * 1000;
        segundos = segundos * 1000;
        return horas + minutos + segundos;
    }
        public static void main (String[]args){
            double totalmilisegundos = Relogio(2, 20, 40);
            System.out.println("Total em milisegundos è: "+totalmilisegundos);
        }
    }
