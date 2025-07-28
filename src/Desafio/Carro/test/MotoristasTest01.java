package Desafio.Carro.test;

import Desafio.Carro.dominio.Carro;
import Desafio.Carro.dominio.Motorista;

public class MotoristasTest01 {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Davi");
        Carro carro1 =  new Carro("Lamborghini",motorista1);

        carro1.dirigir();

        System.out.println("Nome do mototrista: " + motorista1.getNome());
        System.out.println("Nome do carro: " + carro1.getModelo());
    }
}
