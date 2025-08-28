package Desafio.NivelDeAcesso.dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    NivelDeAcesso nivelDeAcesso;

    public Usuario(String nome, NivelDeAcesso nivelDeAcesso) {
        this.nome = nome;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    @Override
    public String toString() {
        return "Usuario: " + nome + " | nivelDeAcesso: " + nivelDeAcesso + " - " + nivelDeAcesso.getDescricao();
    }

    public NivelDeAcesso getNivelDeAcesso() {
        return nivelDeAcesso;
    }

}