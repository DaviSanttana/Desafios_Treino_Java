package Desafio.NivelDeAcesso.test;

import Desafio.NivelDeAcesso.dominio.NivelDeAcesso;
import Desafio.NivelDeAcesso.dominio.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuariosTest01 {

    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Davi", NivelDeAcesso.ADMIN));
        usuarios.add(new Usuario("Caique", NivelDeAcesso.USUARIO));
        usuarios.add(new Usuario("Fernanda", NivelDeAcesso.MODERADOR));
        usuarios.add(new Usuario("Gustavo", NivelDeAcesso.VISITANTE));

        int qtdAdmin = 0;
        int qtdModerador = 0;
        int qtdUsaurio = 0;
        int qtdVisitante = 0;

        System.out.println("\n -- Todos os Usuarios --");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
        System.out.println("\n -- Somente ADMIN --");
        for (Usuario u : usuarios) {
            if (u.getNivelDeAcesso() == NivelDeAcesso.ADMIN) {
                System.out.println(u);
            }
        }
        System.out.println("\n-- Contador de Ususarios --");
        for (Usuario u : usuarios) {
            switch (u.getNivelDeAcesso()) {
                case ADMIN -> qtdAdmin++;
                case MODERADOR -> qtdModerador++;
                case USUARIO -> qtdUsaurio++;
                case VISITANTE -> qtdVisitante++;
            }
        }
        System.out.println("ADMIN: " + qtdAdmin);
        System.out.println("MODERADOR: " + qtdModerador);
        System.out.println("USUARIO: " + qtdUsaurio);
        System.out.println("VISITANTE: " + qtdVisitante);
    }
}
