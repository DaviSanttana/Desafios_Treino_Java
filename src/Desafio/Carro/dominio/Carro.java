package Desafio.Carro.dominio;

public class Carro {
    private String modelo;
    private Motorista motorista;

    public Carro(String modelo,Motorista motorista) {
        this.modelo = modelo;
        this.motorista = motorista;
    }

    public  void dirigir(){
        System.out.println(motorista.getNome()+" esta dirigindo "+modelo);
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotoristas(Motorista motoristas) {
        this.motorista = motoristas;
    }
}
